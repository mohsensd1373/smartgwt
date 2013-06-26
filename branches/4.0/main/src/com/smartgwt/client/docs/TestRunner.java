
package com.smartgwt.client.docs;

/**
 * <h3>TestRunner</h3>
 * The Smart GWT TestRunner is a system for running a suite of Selenium tests on a periodic
 *  basis, comparing the results to previous results, and generating email alerts reporting on
 *  new test failures or fixes to tests that were previously failing.
 *  <P>
 *  TestRunner is a key piece of implementing the <i>Continuous Integration</i> methodology,
 *  whereby continuous testing is applied so that regressions are caught immediately.  This
 *  allows a product or application to be kept continuously at a very high level of quality,
 *  allowing for more frequent and predictable releases.
 *  <P>
 *  <h3>Database Setup</h3>
 *  <P>
 *  Each time TestRunner executes it by default stores results to a SQL database via two 
 *  SQLDataSources:
 *  <ul>
 *  <li><b>batchRun.ds.xml</b>: stores global information about the run as a whole: an ID for
 *     the run, when it started and ended, and optional data to be used in emails generated by
 *     the system.
 *  <li><b>testResult.ds.xml</b>: stores the result of each individual test, including when it
 *     started and ended, and information about errors that occurred, if any
 *  </ul>
 *  These DataSources are present in the 
 *  
 *  <code>selenium/</code>
 *  directory of your SDK.  If you choose to move them elsewhere, simply update the DataSources
 *  location (configured by <code>project.datasources</code> in server.properties).
 *  <P>
 *  These DataSources behave just like other SQLDataSources: 
 *  <ul>
 *  <li> they are compatible with all the database types that Smart GWT supports
 *  <li> they will use the default database configured for your project, or you can set
 * {@link com.smartgwt.client.docs.serverds.DataSource#dbName dbName} in the .ds.xml file to use a
 * second database instead
 *  <li> you can setup the database connection and generate SQL tables using the
 *       {@link com.smartgwt.client.docs.AdminConsole}
 *  <li> you can build your own UI for viewing test results, by loading the
 *       <code>batchRun</code> and <code>testResult</code> DataSources like any other
 *       SQLDataSource and binding components such as ListGrids to them.
 *  <li> if you deploy an application that includes these DataSources, third-party tools can
 *       access these DataSources via the RESTHandler servlet
 *  </ul>
 *  <P>
 *  If needed, the IDs of these DataSources can be configured via the server.properties settings
 *  <code>autotest.batchRunDS</code> and <code>autotest.testResultDS</code>.
 *  <P>
 *  Note: If you use the default server.properties shipped with the SDK, TestRunner and the 
 *  SDK web server will share a common SQL database, so that the web server and TestRunner
 *  cannot both run at once.  This means that you must point TestRunner at the web server of
 *  a separate SDK installation - on a separate matchine or in a separate filesystem location.
 *  <P>
 *  <h3>Adding Test Files</H3>
 *  <P>
 *  TestRunner currently supports tests written in Selenese, Selenium's HTML-based format for
 *  recording automated tests.  The Selenium IDE can be used to record tests and save them in
 *  Selenese format.  For more background on the Selenium IDE, Smart GWT's extensions, and
 *  the use of WebDriver / Selenium 2, see the 
 *  {@link com.smartgwt.client.docs.AutomatedTesting Automated Testing Overview}.
 *  <P>
 *  Test files should be saved with the extension .rctest.html.  They should all appear under
 *  a common root directory (called <code>testRoot</code>), but any level of nesting is allowed,
 *  and any other files that appear under <code>testRoot</code> will be ignored; only
 *  .rctest.html files will be processed.
 *  <P>
 *  The <code>testRoot</code> directory is passed to TestRunner when you execute it.  In the
 *  database and in emails, test are identified by their directory path relative to
 *  <code>testRoot</code>.
 *  <P>
 *  Adding a test to the test suite is as simple as placing the .rctest.html file somewhere under
 *  the <code>testRoot</code> directory; on the next TestRunner execution, TestRunner will
 *  notice the new test and start reporting results for it (including reporting it as a failure
 *  if it fails in its very first run).
 *  <P>
 *  The included test result viewing application (see below) also provides an interface to
 *  upload tests if you prefer not to allow direct filesystem access to the machine where
 *  TestRunner executes.
 *  <P>
 *  <h3>Running Test Runner</h3>
 *  <P>
 *  TestRunner is an ordinary Java class - com.isomorphic.autotest.TestRunner - and can be run
 *  from the command line in the usual fashion, or run programmatically from within a Java
 *  application using the wrapper class com.isomorphic.autotest.TestRunnerDriver.  We also
 *  provide convenience scripts to run the TestRunner Java class in the SDK root directory.
 *  <P>
 *  Minimally, TestRunner needs to know the base directory of a set of test files.  All files
 *  saved anywhere under this base directory which end in the extension .rctest.html will be
 *  assumed to be Selenese test files and executed.
 *  <P>
 *  As is standard for Selenese test files, the first command in the file is typically an "open"
 *  command with the URL of the application which should be opened in a browser so that
 *  subsequent commands can be run.  
 *  <P>
 *  The assumption is that the application that will be tested is already deployed by the time
 *  TestRunner is run; how to automate building and deployment of applications is outside of the
 *  scope of this document, however, the recommendation is that a Revision-Control System (such
 *  as SVN, git or CVS) is used, and that every time a developer "checks in" or "commits"
 *  changes, the application being tested is built and deployed to a test server, then TestRunner
 *  is run.  Continuous Build Servers (such as Hudson, Bamboo or CruiseControl) may help
 *  automate the step of building from source control and deploying to a test server, then such
 *  a Build Server can typically be configured to trigger TestRunner.
 *  <P>
 *  TestRunner requires several resources to be in expected default locations from the current
 *  directory unless you provide overrides via the command line or server.properties.  Some of
 *  the required resources are:
 *  <ul>
 *     <li> the batch report email template, by default at mailTemplats/batchReport.template
 *     <li> the selenium test template, user extensions, and batchRun/testResult dataSource
 *          XML files, by default in tools/selenium
 *     <li> the dataSource XML schema files, by default in isomorphic/system/schema
 *  </ul>
 *  <P>
 *  <h4>Command-line Examples</h4>
 *  <P>
 *  The following command-line would run TestRunner, execute all tests under the default
 *  testRoot directory "tests", and commit the results:
 *  <pre>
 *  java com.isomorphic.autotest.TestRunner</pre>
 *  This assumes your classpath environment has been set to include the isomorphic SDK JARs;
 *  you may invoke the convenience script test_runner.sh/.bat/.command in the SDK root directory
 *  to run the TestRunner Java class without having to set the classpath.
 *  <P>
 *  The following command-line would execute TestRunner as above, but run all tests under the
 *  directory "foo/bar" relative to the current directory, and email a report of the results:
 *  <pre>
 *  java com.isomorphic.autotest.TestRunner -tr foo/bar -e user@company.com</pre>
 * 
 *  To do the same, but only run a particular test, you can use the files option (-f):
 *  <pre>
 * java com.isomorphic.autotest.TestRunner -tr foo/bar -c -f test1.rctest.html -e
 * user@company.com</pre>
 *  Note that when a file is specified, the default is not to commit the results unless
 *  requested via the commit option (-c).
 *  <P>
 *  <h4>Java API</h4>
 *  <P>
 *  The following Java code would do the same as the last command-line example:
 *  <pre>
 *      TestRunnerDriver driver = new TestRunnerDriver();
 *      driver.setTestRoot("foo/bar");
 *      driver.setBatchCommit(true);
 *      driver.setFiles(new String[] { "test1.rctest.html" });
 *      driver.setAlertEmail("user@company.com");
 *      driver.run();
 *  </pre>
 *  <P>
 *  <h4>TestRunner Configuration</h4>
 *  <P>
 *  TestRunner supports several more command-line options, or equivalent settings that can be
 *  applied via Java.  The following table summarizes the command-line options, equivalent Java
 *  Setter in the DriverConfiguration interface, and it's behavior (including default behavior).
 *  <P>
 *  <table border="1">
 *   <thead>
 *     <tr><th>Command-line Option</th><th>Java Setter</th>
 *     <th>server.properties Name</th><th>Behavior</th></tr>
 *   <thead>
 *   <tbody>
 *      <tr><td>-tr &lt;path&gt;</td><td>setTestRoot</td><td>autotest.testRoot</td>
 *      <td>Sets the testRoot directory relative to the current directory. By default, its
 *      value is <b>tests</b>, and all Selenium scripts under the testRoot will be executed
 *      by TestRunner.</td><tr>
 *      <tr><td>-sr &lt;path&gt;</td><td>setServerFileRoot</td><td>N/A</td>
 *      <td>Sets the serverFileRoot directory. Default is <b>/</b>. Selenium scripts executing
 *      open() commands on the httpTarget server will by use this default path.</td></tr>
 *      <tr><td>-f &lt;files&gt;</td><td>setFiles</td><td>N/A</td><td>Specifies a file or list
 *      of files to run. This option can restrict which Selenium scripts under testRoot get run.
 *      Relative paths from the testRoot or bare filenames may be provided. When present,
 *      this option also disables the default behavior of committing test results.</tr>
 *      <tr><td>-br &lt;branch&gt;</td><td>setBranch</td><td>autotest.branch</td>
 *      <td>Specifies a branch for the batch, used in the batch run record and email
 *      notification.  Default is <b>MAIN</b>.Test result comparison occurs per branch.</tr>
 *      <tr><td>-ht &lt;host/IP&gt;</td><td>setHttpTarget</td><td>N/A</td>
 *      <td>Sets the target web server Selenium should use to run the tests.
 *      Default is <b>localhost</b></td></tr>
 *      <tr><td>-hp &lt;port&gt;</td><td>setHttpPort</td><td>N/A</td>
 *      <td>Sets the web server port Selenium should use to run the tests.
 *      Default is <b>8080</b></td></tr>
 *      <tr><td>-t &lt;timestamp&gt;</td><td>setTimestamp</td><td>N/A</td>
 *      <td>Forces comparison of the batch results to be against the batch run with a
 *      timestamp closest to that provided, rather than the most recent batch run.  Format
 *      is "2012-12-31 23:59:59" in the local time zone.</td></tr>
 *      <tr><td>-c/-nc</td><td>setBatchCommit</td><td>N/A</td>
 *      <td>This pair of argumentless options allows you to force the batch results to 
 *      be committed (-c) or not committed (-nc).  This is useful to override the default
 *      of committing (or of not committing if the -f option has been passed).
 *      <tr><td>-b &lt;browser&gt;</td><td>setBrowser</td><td>N/A</td>
 *      <td>Specifies the browser string passed to Selenium. Default is <b>*firefox</b>
 *      See {@link com.smartgwt.client.docs.UsingSelenium}</td></tr>
 *      <tr><td>-lg &lt;message&gt;</td><td>setBatchLog</td><td>N/A</td><td>Provides a
 *      log message to include in the record for this batch run. (No Default)</td></tr>
 *      <tr><td>-lp</td><td>N/A</td><td>N/A</td>
 *      <td>Informs TestRunner that a message or file has been piped to STDIN as the
 *      batch log message.</td></tr>
 *      <tr><td>-un &lt;userName&gt;</td><td>setUserName</td><td>autotest.userName</td>
 *      <td>Specifies a user name for the batch run record. (No Default)</td></tr>
 *      <tr><td>-h</td><td>N/A</td><td>N/A</td><td>Lists available command-line options.</td></tr>
 *   </tbody>
 *  </table>
 *  <P>
 *  <h3>Email Notifications</h3>
 *  <P>
 *  At completion of the batch of tests, TestRunner can automatically send out an email
 *  notification summarizing the results of the test run, including error messages for 
 *  any newly failing tests.  A velocity template file is used to control its format; see 
 *  {@link com.smartgwt.client.docs.VelocitySupport Velocity Support}. 
 *  The following velocity variables are available:
 *  <P>
 *  <ul>
 *      <li><b>$firstBatchFound</b>. Whether baseline batch was found with which to compare</li>
 *      <li><b>$fixed</b>. A list of the test results for tests fixed in this batch run</li>
 *      <li><b>$regression</b>. A list of the test results for tests broken in this batch run</li>
 *      <li><b>$totalTestFiles</b>. The total number of tests run in this batch run</li>
 *      <li><b>$passedTestFiles</b>. The number of tests that passed  in this batch run</li>
 *      <li><b>$batchStartTime</b>. Timestamp associated with start of this batch run</li>
 *      <li><b>$batchLog</b>. Log message, if any was provided for this batch run</li>
 *  </ul>
 *  A sample/default template is provided as the file <b>mailTemplates/batchReport.template</b>.
 *  <P>
 *  The following options govern the Email Notifications:
 *  <table border="1">
 *   <thead>
 *     <tr><th>Command-line Option</th><th>Java Setter</th>
 *     <th>server.properties Name</th><th>Behavior</th></tr>
 *   <thead>
 *   <tbody>
 *      <tr><td>-e &lt;recipient&gt;</td><td>setAlertEmail</td><td>autotest.alertEmail</td>
 *      <td>Sets the recipient email address for batch report email.  If the "repeat email"
 *      recipient address has also been set via -re, this address will only be sent "alert
 *      email" reports where fixes or regressions are present.  Otherwise, it will receive all
 *      batch report email.  (No Default)</td></tr>
 *      <tr><td>-re &lt;recipient&gt;</td><td>setRepeatEmail</td><td>autotest.repeatEmail</td>
 *      <td>Sets the recipient email address for batch report email.  If the "alert email"
 *      recipient address has also been set via -e, this address will only be sent "repeat
 *      email" reports where no fixes or regressions are present.  Otherwise, it will receive
 *      all batch report email.  (No Default)</td></tr>
 *      <tr><td>-cc &lt;recipient&gt;</td><td>setCcEmail</td><td>autotest.ccEmail</td>
 *      <td>Sets the recipient email address for batch report email.  This recipient will
 *      always be cc'd a copy of the batch report email, regardless of whether fixes or
 *      regressions are present. (No Default)</td></tr>
 *      <tr><td>-m &lt;mailHost&gt;</td><td>setMailHost</td><td>autotest.mailHost</td>
 *      <td>Specifies what mail host to use to send mail.  If not provided, your mail
 *      software will decide what host to use.</td></tr>
 *      <tr><td>-ne</td><td>setNoEmail</td><td>N/A</td><td>Disables sending any email for
 *      the batch run. If recipient email addresses have not been set through the
 *      command line, Java setters, or server.properties, it's not needed.  However, it
 *      may be useful in suppressing email in cases where they have been set.</td></tr>
 *      <tr><td>-mt &lt;file&gt;</td><td>setMailTemplate</td><td>autotest.mailTemplate</td>
 *      <td>Specifies what velocity template file to use when generating the batch report
 *      email for this batch run. Default is <b>mailTemplates/batchReport.template</b></td></tr>
 *   </tbody>
 *  </table>
 *  <P>
 *  Note: If you choose not to have any email sent upon completion of a batch run, and decide
 *  not to commit the results to the DataSources, the results of each batch run can still be
 *  determined by examing the Java console log, which captures the output of each RC test script.
 *  <P>
 *  <h3>Result Viewer</h3>
 *  <P>
 *  TestRunner comes with a very very simple application for interactively viewing and searching
 *  test results, implemented in &#83;martClient technology.  This application is meant as a
 *  starting point for building your own application for interactive viewing of test results, if
 *  you prefer to go beyond email notifications.
 *  <P>
 * The source code for this application is just a single testResultViewer.jsp file in the
 * "selenium"
 *  directory in the SDK; copy it anywhere under <code>webroot</code> in a project that includes
 *  the Smart GWT Server and it will function.
 *  <P>
 *  The result viewing application also includes the ability to upload new test files to
 *  <code>testRoot</code> as an alternative to providing testers with direct access to the
 *  filesystem for the machine where TestRunner executes.
 *  <P>
 *  <h3>Getting Started FAQ</h3>
 *  <P>
 *  
 *  
 *  Q: When I run TestRunner, I want to target the SGWT showcase, but TestRunner fails due to 
 *  HSQLDB reporting a locked database.<BR>
 *  A: By default, TestRunner uses the HSQLDB associated with the SGWT showcase when run from
 *  the SGWT ZIP root directory.  Therefore, if samples/showcase/war has been deployed to a 
 *  webserver, you must stop it before running TestRunner.  One simple alternative is to deploy
 *  the file showcase.war from the SGWT ZIP root, which has a separate copy of the HSQLDB.  You
 *  may also simply install another copy of the SGWT ZIP in a different location on the same 
 *  machine, or point TestRunner at a different machine using the -ht command-line option.
 *  
 *  <P>
 *  Q: When I run TestRunner, TestRunner fails reporting that DataSource BatchRun or TestResult
 *  cannot be found.<BR>
 *  A: These DataSources must be imported into the default HSQLDB before TestRunner can be used.
 *  
 *  
 *  Use the "import" option of showcase/tools/adminConsole.jsp under the deployed SGWT showcase
 *  
 *  to select and import the BatchRun and TestResult DataSources prior to running TestRunner.
 */
public interface TestRunner {
}

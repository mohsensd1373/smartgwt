/*
 * Smart GWT (GWT for SmartClient)
 * Copyright 2008 and beyond, Isomorphic Software, Inc.
 *
 * Smart GWT is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.  Smart GWT is also
 * available under typical commercial license terms - see
 * http://smartclient.com/license
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */
/* sgwtgen */
 
package com.smartgwt.client.widgets;


import com.smartgwt.client.event.*;
import com.smartgwt.client.core.*;
import com.smartgwt.client.types.*;
import com.smartgwt.client.data.*;
import com.smartgwt.client.data.events.*;
import com.smartgwt.client.rpc.*;
import com.smartgwt.client.callbacks.*;
import com.smartgwt.client.tools.*;
import com.smartgwt.client.bean.*;
import com.smartgwt.client.widgets.*;
import com.smartgwt.client.widgets.events.*;
import com.smartgwt.client.widgets.form.*;
import com.smartgwt.client.widgets.form.validator.*;
import com.smartgwt.client.widgets.form.fields.*;
import com.smartgwt.client.widgets.tile.*;
import com.smartgwt.client.widgets.tile.events.*;
import com.smartgwt.client.widgets.grid.*;
import com.smartgwt.client.widgets.grid.events.*;
import com.smartgwt.client.widgets.chart.*;
import com.smartgwt.client.widgets.layout.*;
import com.smartgwt.client.widgets.layout.events.*;
import com.smartgwt.client.widgets.menu.*;
import com.smartgwt.client.widgets.rte.*;
import com.smartgwt.client.widgets.rte.events.*;
import com.smartgwt.client.widgets.tab.*;
import com.smartgwt.client.widgets.toolbar.*;
import com.smartgwt.client.widgets.tree.*;
import com.smartgwt.client.widgets.tree.events.*;
import com.smartgwt.client.widgets.viewer.*;
import com.smartgwt.client.widgets.calendar.*;
import com.smartgwt.client.widgets.calendar.events.*;
import com.smartgwt.client.widgets.cube.*;
import com.smartgwt.client.widgets.drawing.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;
import com.smartgwt.client.util.*;
import com.smartgwt.client.util.workflow.*;
import com.google.gwt.event.shared.*;
import com.google.gwt.event.shared.HasHandlers;
import com.smartgwt.logicalstructure.core.*;
import com.smartgwt.logicalstructure.widgets.*;
import com.smartgwt.logicalstructure.widgets.drawing.*;
import com.smartgwt.logicalstructure.widgets.plugins.*;
import com.smartgwt.logicalstructure.widgets.form.*;
import com.smartgwt.logicalstructure.widgets.tile.*;
import com.smartgwt.logicalstructure.widgets.grid.*;
import com.smartgwt.logicalstructure.widgets.chart.*;
import com.smartgwt.logicalstructure.widgets.layout.*;
import com.smartgwt.logicalstructure.widgets.menu.*;
import com.smartgwt.logicalstructure.widgets.rte.*;
import com.smartgwt.logicalstructure.widgets.tab.*;
import com.smartgwt.logicalstructure.widgets.tableview.*;
import com.smartgwt.logicalstructure.widgets.toolbar.*;
import com.smartgwt.logicalstructure.widgets.tree.*;
import com.smartgwt.logicalstructure.widgets.viewer.*;
import com.smartgwt.logicalstructure.widgets.calendar.*;
import com.smartgwt.logicalstructure.widgets.cube.*;
import com.smartgwt.logicalstructure.widgets.tools.*;

/**
 * Use the HTMLFlow component to display HTML content that should expand to its natural size without scrolling.   <p> HTML
 * content can be loaded and reloaded from a URL via the property <code>contentsURL</code>.  This method of loading is for
 * simple HTML content only; Smart GWT components should be loaded via the {@link com.smartgwt.client.widgets.ViewLoader}
 * class. <P> NOTE: Since the size of an HTMLFlow component is determined by its HTML contents, this component will draw at
 * varying sizes if given content of varying size.  When using HTMLFlow components within a Layout, consider what will
 * happen if the HTMLFlow renders at various sizes.  An HTMLFlow which can expand should be placed in a container where
 * other components can render smaller, where the container is allowed to scroll, or where there is padding to expand into.
 */
@BeanFactory.FrameworkClass
@BeanFactory.ScClassName("HTMLFlow")
public class HTMLFlow extends Canvas implements com.smartgwt.client.widgets.events.HasContentLoadedHandlers {

    public static HTMLFlow getOrCreateRef(JavaScriptObject jsObj) {
        if (jsObj == null) return null;
        final BaseWidget refInstance = BaseWidget.getRef(jsObj);
        if (refInstance == null) {
            return new HTMLFlow(jsObj);
        } else {
            assert refInstance instanceof HTMLFlow;
            return (HTMLFlow)refInstance;
        }
    }


    /**
     * Changes the defaults for Canvas AutoChildren named <code>autoChildName</code>.
     *
     * @param autoChildName name of an AutoChild to customize the defaults for.
     * @param defaults Canvas defaults to apply. These defaults override any existing properties
     * without destroying or wiping out non-overridden properties.
     * @see com.smartgwt.client.docs.AutoChildUsage
     */
    public static native void changeAutoChildDefaults(String autoChildName, Canvas defaults) /*-{
        $wnd.isc.HTMLFlow.changeDefaults(autoChildName + "Defaults", defaults.@com.smartgwt.client.widgets.Canvas::getConfig()());
    }-*/;

    /**
     * Changes the defaults for FormItem AutoChildren named <code>autoChildName</code>.
     *
     * @param autoChildName name of an AutoChild to customize the defaults for.
     * @param defaults FormItem defaults to apply. These defaults override any existing properties
     * without destroying or wiping out non-overridden properties.
     * @see com.smartgwt.client.docs.AutoChildUsage
     */
    public static native void changeAutoChildDefaults(String autoChildName, FormItem defaults) /*-{
        $wnd.isc.HTMLFlow.changeDefaults(autoChildName + "Defaults", defaults.@com.smartgwt.client.widgets.form.fields.FormItem::getJsObj()());
    }-*/;

    public HTMLFlow(){
        scClassName = "HTMLFlow";
    }

    public HTMLFlow(JavaScriptObject jsObj){
        scClassName = "HTMLFlow";
        setJavaScriptObject(jsObj);
    }


    public HTMLFlow(String contents) {
        setContents(contents);
                scClassName = "HTMLFlow";
    }

    protected native JavaScriptObject create()/*-{
        var config = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
        var scClassName = this.@com.smartgwt.client.widgets.BaseWidget::scClassName;
        var widget = $wnd.isc[scClassName].create(config);
        if ($wnd.isc.keepGlobals) this.@com.smartgwt.client.widgets.BaseWidget::internalSetID(Lcom/google/gwt/core/client/JavaScriptObject;)(widget);
        this.@com.smartgwt.client.widgets.BaseWidget::doInit()();
        return widget;
    }-*/;

    // ********************* Properties / Attributes ***********************

    /**
     * By default an HTMLFlow will explicitly prevent browser caching. <P> Set to true to allow browser caching <b>if the
     * browser would normally do so</b>, in other words, if the HTTP headers returned with the response indicate that the
     * response can be cached.
     *
     * @param allowCaching  Default value is false
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setAllowCaching(Boolean allowCaching)  throws IllegalStateException {
        setAttribute("allowCaching", allowCaching, false);
    }

    /**
     * By default an HTMLFlow will explicitly prevent browser caching. <P> Set to true to allow browser caching <b>if the
     * browser would normally do so</b>, in other words, if the HTTP headers returned with the response indicate that the
     * response can be cached.
     *
     * @return Boolean
     */
    public Boolean getAllowCaching()  {
        return getAttributeAsBoolean("allowCaching");
    }
    

    /**
     * If true, Smart GWT components created while executing the loaded HTML are captured for rendering inside the HTMLFlow.
     * <P> Only applies when contentsType is <b>not</b> "page".
     *
     * @param captureSCComponents  Default value is true
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setCaptureSCComponents(Boolean captureSCComponents)  throws IllegalStateException {
        setAttribute("captureSCComponents", captureSCComponents, false);
    }

    /**
     * If true, Smart GWT components created while executing the loaded HTML are captured for rendering inside the HTMLFlow.
     * <P> Only applies when contentsType is <b>not</b> "page".
     *
     * @return Boolean
     */
    public Boolean getCaptureSCComponents()  {
        return getAttributeAsBoolean("captureSCComponents");
    }
    

    /**
     * The contents of a canvas or label widget. Any HTML string is acceptable.
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Changes the contents of a widget to newContents, an HTML string.
     *
     * @param contents an HTML string to be set as the contents of this widget See {@link com.smartgwt.client.docs.HTMLString HTMLString} . Default value is "&nbsp;"
     * @see com.smartgwt.client.widgets.HTMLFlow#setDynamicContents
     */
    public void setContents(String contents) {
        setAttribute("contents", contents, true);
    }

    /**
     * The contents of a canvas or label widget. Any HTML string is acceptable.
     *
     * @return  See {@link com.smartgwt.client.docs.HTMLString HTMLString} 
     * @see com.smartgwt.client.widgets.HTMLFlow#getDynamicContents
     */
    public String getContents()  {
        return getAttributeAsString("contents");
    }
    

    /**
     * The default setting of <code>null</code> or 'fragment' indicates that HTML loaded from {@link
     * com.smartgwt.client.widgets.HTMLFlow#getContentsURL contentsURL} is assumed to be an HTML fragment rather than a
     * complete page.  Set to "page" to load HTML as a standalone page, via an IFRAME.   <P> <code>contentsType:"page"</code>
     * should only be used for controlled HTML content, and only when such content cannot be delivered as an HTML fragment
     * instead (the default).  To dynamically load Smart GWT components, use {@link com.smartgwt.client.widgets.ViewLoader},
     * <b>never</b> this mechanism (click {@link com.smartgwt.client.docs.NoFrames here} for why). <P> Loading HTML content as
     * a fragment is less resource intensive and avoids visual artifacts such as translucent media becoming opaque or
     * disappearing when placed over an IFRAME.   <P> Loading third-party, uncontrolled content could lead to the surrounding
     * page disappearing if a user clicks on an HTML link with <code>target=_top</code>. <P> With
     * <code>contentsType:"page"</code>, {@link com.smartgwt.client.widgets.HTMLFlow#getLoadingMessage loadingMessage} is not
     * supported, and only "GET" is supported for {@link com.smartgwt.client.widgets.HTMLFlow#getHttpMethod httpMethod}. <P>
     * Note that a native bug has been observed in Internet Explorer version 10 whereby if an HTMLFlow with
     * <code>contentsType</code> set to <code>"page"</code> loads a page containing an HTML <code>&lt;frameset&gt;</code>, when
     * the HTMLFlow is {@link com.smartgwt.client.widgets.Canvas#hide hidden}, it can interfere with the rendering of other
     * elements on the page. Setting {@link com.smartgwt.client.widgets.Canvas#getShrinkElementOnHide shrinkElementOnHide} to
     * <code>true</code> will work around this behavior.
     *
     * @param contentsType  Default value is null
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setContentsType(ContentsType contentsType)  throws IllegalStateException {
        setAttribute("contentsType", contentsType == null ? null : contentsType.getValue(), false);
    }

    /**
     * The default setting of <code>null</code> or 'fragment' indicates that HTML loaded from {@link
     * com.smartgwt.client.widgets.HTMLFlow#getContentsURL contentsURL} is assumed to be an HTML fragment rather than a
     * complete page.  Set to "page" to load HTML as a standalone page, via an IFRAME.   <P> <code>contentsType:"page"</code>
     * should only be used for controlled HTML content, and only when such content cannot be delivered as an HTML fragment
     * instead (the default).  To dynamically load Smart GWT components, use {@link com.smartgwt.client.widgets.ViewLoader},
     * <b>never</b> this mechanism (click {@link com.smartgwt.client.docs.NoFrames here} for why). <P> Loading HTML content as
     * a fragment is less resource intensive and avoids visual artifacts such as translucent media becoming opaque or
     * disappearing when placed over an IFRAME.   <P> Loading third-party, uncontrolled content could lead to the surrounding
     * page disappearing if a user clicks on an HTML link with <code>target=_top</code>. <P> With
     * <code>contentsType:"page"</code>, {@link com.smartgwt.client.widgets.HTMLFlow#getLoadingMessage loadingMessage} is not
     * supported, and only "GET" is supported for {@link com.smartgwt.client.widgets.HTMLFlow#getHttpMethod httpMethod}. <P>
     * Note that a native bug has been observed in Internet Explorer version 10 whereby if an HTMLFlow with
     * <code>contentsType</code> set to <code>"page"</code> loads a page containing an HTML <code>&lt;frameset&gt;</code>, when
     * the HTMLFlow is {@link com.smartgwt.client.widgets.Canvas#hide hidden}, it can interfere with the rendering of other
     * elements on the page. Setting {@link com.smartgwt.client.widgets.Canvas#getShrinkElementOnHide shrinkElementOnHide} to
     * <code>true</code> will work around this behavior.
     *
     * @return ContentsType
     */
    public ContentsType getContentsType()  {
        return EnumUtil.getEnum(ContentsType.values(), getAttribute("contentsType"));
    }
    

    /**
     * URL to load content from. <P> If specified, this component will load HTML content from the specified URL when it is
     * first drawn. <p> This feature relies on the XMLHttpRequest object which can be disabled by end-users in some supported
     * browsers.  See {@link com.smartgwt.client.docs.PlatformDependencies} for more information.
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Change the URL this component loads content from.  Triggers a fetch for content from the new URL. <p> Can also be called with no arguments to reload content from the existing {@link com.smartgwt.client.widgets.HTMLFlow#getContentsURL contentsURL}. <P> This feature relies on the XMLHttpRequest object which can be disabled by end-users in some supported browsers.  See {@link com.smartgwt.client.docs.PlatformDependencies} for more information.
     *
     * @param contentsURL URL to retrieve contents from. Default value is null
     */
    public void setContentsURL(String contentsURL) {
        setAttribute("contentsURL", contentsURL, true);
    }

    /**
     * URL to load content from. <P> If specified, this component will load HTML content from the specified URL when it is
     * first drawn. <p> This feature relies on the XMLHttpRequest object which can be disabled by end-users in some supported
     * browsers.  See {@link com.smartgwt.client.docs.PlatformDependencies} for more information.
     *
     * @return String
     */
    public String getContentsURL()  {
        return getAttributeAsString("contentsURL");
    }
    

    /**
     * Parameters to be sent to the contentsURL when fetching content.
     *
     * @param contentsURLParams  Default value is null
     */
    public void setContentsURLParams(Map contentsURLParams) {
        setAttribute("contentsURLParams", contentsURLParams, true);
    }
    

    /**
     * Dynamic contents allows the contents string to be treated as a simple, but powerful
     *  template.  When this attribute is set to true, expressions of the form \${arbitrary JS
     *  here} are replaced by the result of the evaluation of the JS code inside the curly
     *  brackets.  This evaluation happens at draw time.  If you want to trigger a re-evaluation
     *  of the expressions in the contents string you can call markForRedraw() on the canvas.
     *  <p>
     *  You can use this feature to build some simple custom components. For example, let's say
     *  you want to show the value of a Slider in a Canvas somewhere on the screen.  You can do
     *  this by observing the valueChanged() method on the slider and calling setContents() on
     *  your canvas with the new string or you can set the contents of the canvas to something
     *  like:
     *  <p><code>
     *  "The slider value is \${sliderInstance.getValue()}."
     *  </code><p>
     *  Next you set dynamicContents: true on the canvas, observe valueChanged() on the slider
     *  and call canvas.markForRedraw() in that observation.  This approach is cleaner than
     *  setContents() when the Canvas is aggregating several values or dynamic expressions.
     *  Like so:
     *  <p>
     *  <pre>
     *  Slider.create({
     *      ID: "mySlider"
     *  });
     * 
     *  Canvas.create({
     *      ID: "myCanvas",
     *      dynamicContents: true,
     *      contents: "The slider value is \${mySlider.getValue()}."
     *  });
     * 
     *  myCanvas.observe(mySlider, "valueChanged",
     *                   "observer.markForRedraw()");
     *  </pre>
     *  You can embed an arbitrary number of dynamic expressions in the contents string.  The
     *  search and replace is optimized for speed.
     *  <p>
     *  If an error occurs during the evaluation of one of the expressions, a warning is logged
     *  to the ISC Developer Console and the error string is embedded in place of the expected
     *  value in the Canvas.
     *  <p>
     *  The value of a function is its return value.  The value of any variable is the same as
     *  that returned by its toString() representation.
     *  <p>
     *  Inside the evaluation contentext, <code>this</code> points to the canvas instance that
     *  has the dynamicContents string as its contents - in other words the canvas instance on
     *  which the template is declared.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param dynamicContents  Default value is false
     * @see com.smartgwt.client.widgets.HTMLFlow#setContents
     * @see com.smartgwt.client.widgets.Canvas#setDynamicContentsVars
     * 
     */
    public void setDynamicContents(Boolean dynamicContents) {
        setAttribute("dynamicContents", dynamicContents, true);
    }

    /**
     * Dynamic contents allows the contents string to be treated as a simple, but powerful
     *  template.  When this attribute is set to true, expressions of the form \${arbitrary JS
     *  here} are replaced by the result of the evaluation of the JS code inside the curly
     *  brackets.  This evaluation happens at draw time.  If you want to trigger a re-evaluation
     *  of the expressions in the contents string you can call markForRedraw() on the canvas.
     *  <p>
     *  You can use this feature to build some simple custom components. For example, let's say
     *  you want to show the value of a Slider in a Canvas somewhere on the screen.  You can do
     *  this by observing the valueChanged() method on the slider and calling setContents() on
     *  your canvas with the new string or you can set the contents of the canvas to something
     *  like:
     *  <p><code>
     *  "The slider value is \${sliderInstance.getValue()}."
     *  </code><p>
     *  Next you set dynamicContents: true on the canvas, observe valueChanged() on the slider
     *  and call canvas.markForRedraw() in that observation.  This approach is cleaner than
     *  setContents() when the Canvas is aggregating several values or dynamic expressions.
     *  Like so:
     *  <p>
     *  <pre>
     *  Slider.create({
     *      ID: "mySlider"
     *  });
     * 
     *  Canvas.create({
     *      ID: "myCanvas",
     *      dynamicContents: true,
     *      contents: "The slider value is \${mySlider.getValue()}."
     *  });
     * 
     *  myCanvas.observe(mySlider, "valueChanged",
     *                   "observer.markForRedraw()");
     *  </pre>
     *  You can embed an arbitrary number of dynamic expressions in the contents string.  The
     *  search and replace is optimized for speed.
     *  <p>
     *  If an error occurs during the evaluation of one of the expressions, a warning is logged
     *  to the ISC Developer Console and the error string is embedded in place of the expected
     *  value in the Canvas.
     *  <p>
     *  The value of a function is its return value.  The value of any variable is the same as
     *  that returned by its toString() representation.
     *  <p>
     *  Inside the evaluation contentext, <code>this</code> points to the canvas instance that
     *  has the dynamicContents string as its contents - in other words the canvas instance on
     *  which the template is declared.
     *
     * @return Boolean
     * @see com.smartgwt.client.widgets.HTMLFlow#getContents
     * @see com.smartgwt.client.widgets.Canvas#getDynamicContentsVars
     * 
     */
    public Boolean getDynamicContents()  {
        return getAttributeAsBoolean("dynamicContents");
    }
    

    /**
     * If <code>evalScriptBlocks</code> is true, HTMLFlow will pre-process the loaded HTML in order to mimic how the HTML would
     * execute if it were loaded as an independent page or loaded via an IFRAME.   <P> This feature is intended to assist with
     * migrating existing applications to Smart GWT. <P> <code>evalScriptBlocks</code> is enabled by default when loading
     * remote content (via {@link com.smartgwt.client.widgets.HTMLFlow#getContentsURL contentsURL}) and disabled by default for
     * content supplied via {@link com.smartgwt.client.widgets.HTMLFlow#setContents HTMLFlow.setContents}. <P> Note that, if
     * evalScriptBlocks is false, &lt;SCRIPT&gt; blocks will still be detected and disabled to avoid the inconsistent results
     * across different browsers. <P> Only applies when contentsType is <b>not</b> "page".
     *
     * @param evalScriptBlocks  Default value is null
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setEvalScriptBlocks(Boolean evalScriptBlocks)  throws IllegalStateException {
        setAttribute("evalScriptBlocks", evalScriptBlocks, false);
    }

    /**
     * If <code>evalScriptBlocks</code> is true, HTMLFlow will pre-process the loaded HTML in order to mimic how the HTML would
     * execute if it were loaded as an independent page or loaded via an IFRAME.   <P> This feature is intended to assist with
     * migrating existing applications to Smart GWT. <P> <code>evalScriptBlocks</code> is enabled by default when loading
     * remote content (via {@link com.smartgwt.client.widgets.HTMLFlow#getContentsURL contentsURL}) and disabled by default for
     * content supplied via {@link com.smartgwt.client.widgets.HTMLFlow#setContents HTMLFlow.setContents}. <P> Note that, if
     * evalScriptBlocks is false, &lt;SCRIPT&gt; blocks will still be detected and disabled to avoid the inconsistent results
     * across different browsers. <P> Only applies when contentsType is <b>not</b> "page".
     *
     * @return Boolean
     */
    public Boolean getEvalScriptBlocks()  {
        return getAttributeAsBoolean("evalScriptBlocks");
    }
    

    /**
     * Selects the HTTP method that will be used when fetching content.  Valid values are "POST" and "GET".
     *
     * @param httpMethod  Default value is "GET"
     */
    public void setHttpMethod(SendMethod httpMethod) {
        setAttribute("httpMethod", httpMethod == null ? null : httpMethod.getValue(), true);
    }

    /**
     * Selects the HTTP method that will be used when fetching content.  Valid values are "POST" and "GET".
     *
     * @return SendMethod
     */
    public SendMethod getHttpMethod()  {
        return EnumUtil.getEnum(SendMethod.values(), getAttribute("httpMethod"));
    }
    

    /**
     * HTML to show while content is being fetched, active only if the <code>contentsURL</code> property has been set. Use
     * <code>"\${loadingImage}"</code> to include {@link com.smartgwt.client.widgets.Canvas#loadingImageSrc a loading image}.
     * <P> The loading message will show both during the initial load of content, and during reload if the contents are
     * reloaded or the contentsURL changed.  For a first-time only loading message, initialize the <code>contents</code>
     * property instead.<br> Note: the <code>loadingMessage</code> is never displayed when loading complete web pages  rather
     * than HTML fragments (see {@link com.smartgwt.client.widgets.HTMLFlow#getContentsType contentsType}).
     *
     * @param loadingMessage  Default value is "&amp;nbsp;\${loadingImage}"
     */
    public void setLoadingMessage(String loadingMessage) {
        setAttribute("loadingMessage", loadingMessage, true);
    }

    /**
     * HTML to show while content is being fetched, active only if the <code>contentsURL</code> property has been set. Use
     * <code>"\${loadingImage}"</code> to include {@link com.smartgwt.client.widgets.Canvas#loadingImageSrc a loading image}.
     * <P> The loading message will show both during the initial load of content, and during reload if the contents are
     * reloaded or the contentsURL changed.  For a first-time only loading message, initialize the <code>contents</code>
     * property instead.<br> Note: the <code>loadingMessage</code> is never displayed when loading complete web pages  rather
     * than HTML fragments (see {@link com.smartgwt.client.widgets.HTMLFlow#getContentsType contentsType}).
     *
     * @return String
     */
    public String getLoadingMessage()  {
        return getAttributeAsString("loadingMessage");
    }
    

    // ********************* Methods ***********************
    /**
     * Add a contentLoaded handler.
     * <p>
     * StringMethod fired when content is completely loaded in this htmlFlow. Has no default  implementation. May be observed
     * or overridden as a notification type method to fire custom logic when loading completes. <P> Notes: <ul><li>A call to
     * {@link com.smartgwt.client.widgets.Canvas#setContents this.setContents()}   will cause this notification to be fired
     * when  the contents have been set. If {@link com.smartgwt.client.widgets.HTMLFlow#getEvalScriptBlocks evalScriptBlocks}
     * is true, and the HTML passed  into <code>setContents()</code> contains any <code>&lt;script src=... &gt;</code>  tags,
     * this callback will be fired asynchronously once the scripts have been loaded  from the server and executed, as well as
     * having the widget content updated</li> <li>When using {@link com.smartgwt.client.widgets.HTMLFlow#getContentsURL
     * contentsURL}, this does not apply to htmlFlows with  {@link com.smartgwt.client.widgets.HTMLFlow#getContentsType
     * contentsType} set to <code>"page"</code></li></ul>
     *
     * @param handler the contentLoaded handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addContentLoadedHandler(com.smartgwt.client.widgets.events.ContentLoadedHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.events.ContentLoadedEvent.getType()) == 0) setupContentLoadedEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.events.ContentLoadedEvent.getType());
    }

    private native void setupContentLoadedEvent() /*-{
        var obj = null;
        var selfJ = this;
        var contentLoaded = $entry(function(){
            var param = {};

                var event = @com.smartgwt.client.widgets.events.ContentLoadedEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
            });
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({contentLoaded:  contentLoaded              });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.contentLoaded =  contentLoaded             ;
        }
   }-*/;
	/**
     * Returns true if this htmlFlow is currently loading content from the server.<br> Note: Does not apply to htmlFlows with
     * {@link com.smartgwt.client.widgets.HTMLFlow#getContentsType contentsType} set to  <code>"page"</code>
     *
     * @return whether content is currently being loaded
     * @see com.smartgwt.client.widgets.events.ContentLoadedEvent
     */
    public native Boolean loadingContent() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.loadingContent();
        if(ret == null) return null;
        return @com.smartgwt.client.util.JSOHelper::toBoolean(Z)(ret);
    }-*/;


	/**
     * Override to modify the loaded HTML before it is rendered.
     * @param html the html as loaded from the server return (HTML) html to be rendered
     */
    public native void transformHTML(String html) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.transformHTML(html);
    }-*/;



    // ********************* Static Methods ***********************

    /** 
     * Class level method to set the default properties of this class.  If set, then all
     * existing and subsequently created instances of this class will automatically have
     * default properties corresponding to
     * the properties set on the SmartGWT class instance passed to this function before its
     * underlying SmartClient JS object was created.
     * This is a powerful feature that eliminates the need for users to create a separate
     * hierarchy of subclasses that only alter the default properties of this class. Can also
     * be used for skinning / styling purposes.  <P> <b>Note:</b> This method is intended for
     * setting default attributes only and will affect all instances of the underlying class
     * (including those automatically generated in JavaScript).  This method should not be used
     * to apply standard EventHandlers or override methods for a class - use a custom subclass
     * instead.  Calling this method after instances have been created can result in undefined
     * behavior, since it bypasses any setters and a class instance may have already examined 
     * a particular property and not be expecting any changes through this route.
     *
     * @param hTMLFlowProperties properties that should be used as new defaults when instances of this class are created
     */
    public static native void setDefaultProperties(HTMLFlow hTMLFlowProperties) /*-{
    	var properties = $wnd.isc.addProperties({},hTMLFlowProperties.@com.smartgwt.client.widgets.BaseWidget::getConfig()());
        @com.smartgwt.client.util.JSOHelper::cleanProperties(Lcom/google/gwt/core/client/JavaScriptObject;Z)(properties,false);
        $wnd.isc.HTMLFlow.addProperties(properties);
    }-*/;

    // ***********************************************************

    public LogicalStructureObject setLogicalStructure(HTMLFlowLogicalStructure s) {
        super.setLogicalStructure(s);
        try {
            s.allowCaching = getAttributeAsString("allowCaching");
        } catch (Throwable t) {
            s.logicalStructureErrors += "HTMLFlow.allowCaching:" + t.getMessage() + "\n";
        }
        try {
            s.captureSCComponents = getAttributeAsString("captureSCComponents");
        } catch (Throwable t) {
            s.logicalStructureErrors += "HTMLFlow.captureSCComponents:" + t.getMessage() + "\n";
        }
        try {
            s.contents = getAttributeAsString("contents");
        } catch (Throwable t) {
            s.logicalStructureErrors += "HTMLFlow.contents:" + t.getMessage() + "\n";
        }
        try {
            s.contentsType = getAttributeAsString("contentsType");
        } catch (Throwable t) {
            s.logicalStructureErrors += "HTMLFlow.contentsType:" + t.getMessage() + "\n";
        }
        try {
            s.contentsURL = getAttributeAsString("contentsURL");
        } catch (Throwable t) {
            s.logicalStructureErrors += "HTMLFlow.contentsURL:" + t.getMessage() + "\n";
        }
        try {
            s.dynamicContents = getAttributeAsString("dynamicContents");
        } catch (Throwable t) {
            s.logicalStructureErrors += "HTMLFlow.dynamicContents:" + t.getMessage() + "\n";
        }
        try {
            s.evalScriptBlocks = getAttributeAsString("evalScriptBlocks");
        } catch (Throwable t) {
            s.logicalStructureErrors += "HTMLFlow.evalScriptBlocks:" + t.getMessage() + "\n";
        }
        try {
            s.httpMethod = getAttributeAsString("httpMethod");
        } catch (Throwable t) {
            s.logicalStructureErrors += "HTMLFlow.httpMethod:" + t.getMessage() + "\n";
        }
        try {
            s.loadingMessage = getAttributeAsString("loadingMessage");
        } catch (Throwable t) {
            s.logicalStructureErrors += "HTMLFlow.loadingMessage:" + t.getMessage() + "\n";
        }
        return s;
    }

    public LogicalStructureObject getLogicalStructure() {
        HTMLFlowLogicalStructure s = new HTMLFlowLogicalStructure();
        setLogicalStructure(s);
        return s;
    }
}


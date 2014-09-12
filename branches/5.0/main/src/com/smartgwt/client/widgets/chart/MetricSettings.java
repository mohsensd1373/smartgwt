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
 
package com.smartgwt.client.widgets.chart;


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

/**
 * Defines a set of properties that are applicable to {@link
 * com.smartgwt.client.widgets.chart.FacetChart#getExtraAxisMetrics additional value axes} of a {@link
 * com.smartgwt.client.widgets.chart.FacetChart}. <p> These properties behave identically to the same-named properties of
 * FacetChart.  Two exceptions are the properties {@link
 * com.smartgwt.client.widgets.chart.MetricSettings#getGradationLineProperties gradationLineProperties} and {@link
 * com.smartgwt.client.widgets.chart.MetricSettings#getGradationZeroLineProperties gradationZeroLineProperties} because
 * they are used to draw tick marks along an extra value axis instead of lines through the chart rectangle.  Also the
 * default behavior of the {@link com.smartgwt.client.widgets.chart.MetricSettings#getDataColors dataColors} property is
 * different, in that the default is to use unused colors from, and in the order of, the  {@link
 * com.smartgwt.client.widgets.chart.FacetChart#getDataColors main data colors array}. <p> The extra value axes that are
 * not positioned directly adjacent to the {@link com.smartgwt.client.widgets.chart.FacetChart#getShowChartRect chart
 * rect.} of the FacetChart may additionally have an axis line to connect the gradation tick marks.  Whether to draw this
 * line is controlled by the {@link com.smartgwt.client.widgets.chart.MetricSettings#getShowAxisLine showAxisLine}
 * property, and the properties of the line are specified using {@link
 * com.smartgwt.client.widgets.chart.MetricSettings#getAxisLineProperties axisLineProperties}.  The default is to draw the
 * axis lines whenever the chart rect. is drawn and to draw the line using the same properties as the lines of the chart
 * rect. (for example, lineColor and lineWidth). <p> The extra value axis charts may be  {@link
 * com.smartgwt.client.widgets.chart.MetricSettings#getMultiFacet single- or multi-facet} charts.  If the underlying {@link
 * com.smartgwt.client.widgets.chart.FacetChart#getData data} is multi-facet then the extra value axes may use the facet
 * whose values are labelled on the data axis or the facet used to create the legend (the first and second facets,
 * respectively).  Both types of charts vary the first facet to get a data series to plot.  Multi-facet charts also vary
 * the second facet, but single-facet charts keep the second facet fixed at a constant {@link
 * com.smartgwt.client.widgets.cube.FacetValue}. <p> The exact facet value to use for the second facet is specified using
 * the {@link com.smartgwt.client.widgets.chart.MetricSettings#getFixedFacetValue fixedFacetValue} property.
 */
@BeanFactory.FrameworkClass
public class MetricSettings extends DataClass {

    public static MetricSettings getOrCreateRef(JavaScriptObject jsObj) {
        if(jsObj == null) return null;
        return new MetricSettings(jsObj);
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
        $wnd.isc.MetricSettings.changeDefaults(autoChildName + "Defaults", defaults.@com.smartgwt.client.widgets.Canvas::getConfig()());
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
        $wnd.isc.MetricSettings.changeDefaults(autoChildName + "Defaults", defaults.@com.smartgwt.client.widgets.form.fields.FormItem::getJsObj()());
    }-*/;

    public MetricSettings(){
        
    }

    public MetricSettings(JavaScriptObject jsObj){
        
        setJavaScriptObject(jsObj);
    }


    // ********************* Properties / Attributes ***********************

    /**
     * Properties for the axis line drawn if this extra value axis is not positioned directly adjacent to the chart rect.  The
     * default is to match the {@link com.smartgwt.client.widgets.drawing.DrawItem#getLineCap lineCap}, {@link
     * com.smartgwt.client.widgets.drawing.DrawItem#getLineColor lineColor}, {@link
     * com.smartgwt.client.widgets.drawing.DrawItem#getLineOpacity lineOpacity}, {@link
     * com.smartgwt.client.widgets.drawing.DrawItem#getLinePattern linePattern}, and {@link
     * com.smartgwt.client.widgets.drawing.DrawItem#getLineWidth lineWidth} of the FacetChart's {@link
     * com.smartgwt.client.widgets.chart.FacetChart#getChartRectProperties chart rect.} for each axis line.
     *
     * @param axisLineProperties  Default value is null
     */
    public void setAxisLineProperties(DrawLine axisLineProperties) {
        JavaScriptObject config = axisLineProperties == null ? null : axisLineProperties.getConfig();
        setAttribute("axisLineProperties", JSOHelper.cleanProperties(config, true));
    }

    /**
     * Properties for the axis line drawn if this extra value axis is not positioned directly adjacent to the chart rect.  The
     * default is to match the {@link com.smartgwt.client.widgets.drawing.DrawItem#getLineCap lineCap}, {@link
     * com.smartgwt.client.widgets.drawing.DrawItem#getLineColor lineColor}, {@link
     * com.smartgwt.client.widgets.drawing.DrawItem#getLineOpacity lineOpacity}, {@link
     * com.smartgwt.client.widgets.drawing.DrawItem#getLinePattern linePattern}, and {@link
     * com.smartgwt.client.widgets.drawing.DrawItem#getLineWidth lineWidth} of the FacetChart's {@link
     * com.smartgwt.client.widgets.chart.FacetChart#getChartRectProperties chart rect.} for each axis line.
     *
     * @return DrawLine
     */
    public DrawLine getAxisLineProperties()  {
        return DrawLine.getOrCreateRef(getAttributeAsJavaScriptObject("axisLineProperties"));
    }
    

    /**
     * Same as {@link com.smartgwt.client.widgets.chart.FacetChart#getAxisStartValue axisStartValue} but affects only one
     * metric.
     *
     * @param axisStartValue  Default value is null
     */
    public void setAxisStartValue(Double axisStartValue) {
        setAttribute("axisStartValue", axisStartValue);
    }

    /**
     * Same as {@link com.smartgwt.client.widgets.chart.FacetChart#getAxisStartValue axisStartValue} but affects only one
     * metric.
     *
     * @return Double
     */
    public Double getAxisStartValue()  {
        return getAttributeAsDouble("axisStartValue");
    }
    

    /**
     * See {@link com.smartgwt.client.types.ChartType} for a list of known types - Column, Bar, Line, Pie, Doughnut, Area, and
     * Radar charts are supported.
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Method to change the current {@link com.smartgwt.client.types.ChartType chartType}. Will redraw the chart if drawn.  Will use default settings for the new chart type for {@link com.smartgwt.client.widgets.chart.MetricSettings#getStacked stacked} and {@link com.smartgwt.client.widgets.chart.MetricSettings#getFilled filled} if those values are null. <p> Note that for {@link com.smartgwt.client.widgets.chart.FacetChart#getExtraAxisMetrics multi-axis} charts this method changes the <code>chartType</code> for the main value axis only.
     *
     * @param chartType new chart type. Default value is null
     */
    public void setChartType(ChartType chartType) {
        setAttribute("chartType", chartType == null ? null : chartType.getValue());
    }

    /**
     * See {@link com.smartgwt.client.types.ChartType} for a list of known types - Column, Bar, Line, Pie, Doughnut, Area, and
     * Radar charts are supported.
     *
     * @return ChartType
     */
    public ChartType getChartType()  {
        return EnumUtil.getEnum(ChartType.values(), getAttribute("chartType"));
    }
    

    /**
     * An array of colors to use for a series of visual elements representing data (eg columns, bars, pie slices), any of which
     * may be adjacent to any other. <P> Colors must be in the format of a leading hash (#) plus 6 hexadecimal digits, for
     * example,  "#FFFFFF" is white, "#FF0000" is pure red.
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Setter for {@link com.smartgwt.client.widgets.chart.MetricSettings#getDataColors dataColors}.
     *
     * @param dataColors New set of data colors See {@link com.smartgwt.client.docs.CSSColor CSSColor} . Default value is see below
     */
    public void setDataColors(String... dataColors) {
        setAttribute("dataColors", dataColors);
    }

    /**
     * An array of colors to use for a series of visual elements representing data (eg columns, bars, pie slices), any of which
     * may be adjacent to any other. <P> Colors must be in the format of a leading hash (#) plus 6 hexadecimal digits, for
     * example,  "#FFFFFF" is white, "#FF0000" is pure red.
     *
     * @return  See {@link com.smartgwt.client.docs.CSSColor CSSColor} 
     */
    public String[] getDataColors()  {
        return com.smartgwt.client.util.ConvertTo.arrayOfString(getAttributeAsJavaScriptObject("dataColors"));
    }
    
    

    /**
     * Properties for lines that show data (as opposed to gradations or borders around the data area).
     *
     * @param dataLineProperties  Default value is null
     */
    public void setDataLineProperties(DrawLine dataLineProperties) {
        JavaScriptObject config = dataLineProperties == null ? null : dataLineProperties.getConfig();
        setAttribute("dataLineProperties", JSOHelper.cleanProperties(config, true));
    }

    /**
     * Properties for lines that show data (as opposed to gradations or borders around the data area).
     *
     * @return DrawLine
     */
    public DrawLine getDataLineProperties()  {
        return DrawLine.getOrCreateRef(getAttributeAsJavaScriptObject("dataLineProperties"));
    }
    

    /**
     * Properties for lines that outline a data shape (in filled charts such as area or radar charts).
     *
     * @param dataOutlineProperties  Default value is null
     */
    public void setDataOutlineProperties(DrawItem dataOutlineProperties) {
        JavaScriptObject config = dataOutlineProperties == null ? null : dataOutlineProperties.getConfig();
        setAttribute("dataOutlineProperties", JSOHelper.cleanProperties(config, true));
    }

    /**
     * Properties for lines that outline a data shape (in filled charts such as area or radar charts).
     *
     * @return DrawItem
     */
    public DrawItem getDataOutlineProperties()  {
        return DrawItem.getOrCreateRef(getAttributeAsJavaScriptObject("dataOutlineProperties"));
    }
    

    /**
     * Common properties to apply for all data points (see {@link
     * com.smartgwt.client.widgets.chart.MetricSettings#getShowDataPoints showDataPoints}).
     *
     * @param dataPointProperties  Default value is null
     */
    public void setDataPointProperties(DrawItem dataPointProperties) {
        JavaScriptObject config = dataPointProperties == null ? null : dataPointProperties.getConfig();
        setAttribute("dataPointProperties", JSOHelper.cleanProperties(config, true));
    }

    /**
     * Common properties to apply for all data points (see {@link
     * com.smartgwt.client.widgets.chart.MetricSettings#getShowDataPoints showDataPoints}).
     *
     * @return DrawItem
     */
    public DrawItem getDataPointProperties()  {
        return DrawItem.getOrCreateRef(getAttributeAsJavaScriptObject("dataPointProperties"));
    }
    

    /**
     * Size in pixels for data points drawn for line, area, radar and other chart types.
     *
     * @param dataPointSize  Default value is 6
     */
    public void setDataPointSize(int dataPointSize) {
        setAttribute("dataPointSize", dataPointSize);
    }

    /**
     * Size in pixels for data points drawn for line, area, radar and other chart types.
     *
     * @return int
     */
    public int getDataPointSize()  {
        return getAttributeAsInt("dataPointSize");
    }
    

    /**
     * Properties for data shapes (filled areas in area or radar charts).
     *
     * @param dataShapeProperties  Default value is null
     */
    public void setDataShapeProperties(DrawPath dataShapeProperties) {
        JavaScriptObject config = dataShapeProperties == null ? null : dataShapeProperties.getConfig();
        setAttribute("dataShapeProperties", JSOHelper.cleanProperties(config, true));
    }

    /**
     * Properties for data shapes (filled areas in area or radar charts).
     *
     * @return DrawPath
     */
    public DrawPath getDataShapeProperties()  {
        return DrawPath.getOrCreateRef(getAttributeAsJavaScriptObject("dataShapeProperties"));
    }
    

    /**
     * The {@link com.smartgwt.client.widgets.chart.FacetChart#getDecimalPrecision decimalPrecision} used to render the numeric
     * labels of this metric axis.
     *
     * @param decimalPrecision  Default value is 2
     */
    public void setDecimalPrecision(int decimalPrecision) {
        setAttribute("decimalPrecision", decimalPrecision);
    }

    /**
     * The {@link com.smartgwt.client.widgets.chart.FacetChart#getDecimalPrecision decimalPrecision} used to render the numeric
     * labels of this metric axis.
     *
     * @return int
     */
    public int getDecimalPrecision()  {
        return getAttributeAsInt("decimalPrecision");
    }
    

    /**
     * Whether shapes are filled, for example, whether a multi-series line chart appears as a stack of filled regions as
     * opposed to just multiple lines. <P> If unset, fills will be automatically used when there are multiple facets and
     * stacking is active (so Line and Radar charts will show stacked regions).   <P> You can explicitly set filled:false to
     * create multi-facet Line or Radar charts where translucent regions overlap, or filled:true to fill in a single-facet Line
     * or Radar chart.
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Method to change {@link com.smartgwt.client.widgets.chart.MetricSettings#getFilled filled}. Use null to apply a default value for the current {@link com.smartgwt.client.types.ChartType chartType}.
     *
     * @param filled new value. Default value is null
     */
    public void setFilled(Boolean filled) {
        setAttribute("filled", filled);
    }

    /**
     * Whether shapes are filled, for example, whether a multi-series line chart appears as a stack of filled regions as
     * opposed to just multiple lines. <P> If unset, fills will be automatically used when there are multiple facets and
     * stacking is active (so Line and Radar charts will show stacked regions).   <P> You can explicitly set filled:false to
     * create multi-facet Line or Radar charts where translucent regions overlap, or filled:true to fill in a single-facet Line
     * or Radar chart.
     *
     * @return Boolean
     */
    public Boolean getFilled()  {
        return getAttributeAsBoolean("filled", true);
    }
    

    /**
     * For a {@link com.smartgwt.client.widgets.chart.MetricSettings#getMultiFacet single-facet} chart of an extra value axis,
     * this property provides a constant facet value for the second facet.  By varying the value of the other facet in
     * multi-facet data, the chart obtains the series of values to plot.  The default facet value is the first facet value of
     * the second facet.
     *
     * @param fixedFacetValue  Default value is null
     */
    public void setFixedFacetValue(String fixedFacetValue) {
        setAttribute("fixedFacetValue", fixedFacetValue);
    }

    /**
     * For a {@link com.smartgwt.client.widgets.chart.MetricSettings#getMultiFacet single-facet} chart of an extra value axis,
     * this property provides a constant facet value for the second facet.  By varying the value of the other facet in
     * multi-facet data, the chart obtains the series of values to plot.  The default facet value is the first facet value of
     * the second facet.
     *
     * @return String
     */
    public String getFixedFacetValue()  {
        return getAttributeAsString("fixedFacetValue");
    }

    /**
     * For a {@link com.smartgwt.client.widgets.chart.MetricSettings#getMultiFacet single-facet} chart of an extra value axis,
     * this property provides a constant facet value for the second facet.  By varying the value of the other facet in
     * multi-facet data, the chart obtains the series of values to plot.  The default facet value is the first facet value of
     * the second facet.
     *
     * @param fixedFacetValue  Default value is null
     */
    public void setFixedFacetValue(Integer fixedFacetValue) {
        setAttribute("fixedFacetValue", fixedFacetValue);
    }
    

    /**
     * Properties for gradation labels
     *
     * @param gradationLabelProperties  Default value is null
     */
    public void setGradationLabelProperties(DrawLabel gradationLabelProperties) {
        JavaScriptObject config = gradationLabelProperties == null ? null : gradationLabelProperties.getConfig();
        setAttribute("gradationLabelProperties", JSOHelper.cleanProperties(config, true));
    }

    /**
     * Properties for gradation labels
     *
     * @return DrawLabel
     */
    public DrawLabel getGradationLabelProperties()  {
        return DrawLabel.getOrCreateRef(getAttributeAsJavaScriptObject("gradationLabelProperties"));
    }
    

    /**
     * Properties for gradation lines
     *
     * @param gradationLineProperties  Default value is null
     */
    public void setGradationLineProperties(DrawLine gradationLineProperties) {
        JavaScriptObject config = gradationLineProperties == null ? null : gradationLineProperties.getConfig();
        setAttribute("gradationLineProperties", JSOHelper.cleanProperties(config, true));
    }

    /**
     * Properties for gradation lines
     *
     * @return DrawLine
     */
    public DrawLine getGradationLineProperties()  {
        return DrawLine.getOrCreateRef(getAttributeAsJavaScriptObject("gradationLineProperties"));
    }
    

    /**
     * Properties for the gradation line drawn for zero (slightly thicker by default).
     *
     * @param gradationZeroLineProperties  Default value is null
     */
    public void setGradationZeroLineProperties(DrawLine gradationZeroLineProperties) {
        JavaScriptObject config = gradationZeroLineProperties == null ? null : gradationZeroLineProperties.getConfig();
        setAttribute("gradationZeroLineProperties", JSOHelper.cleanProperties(config, true));
    }

    /**
     * Properties for the gradation line drawn for zero (slightly thicker by default).
     *
     * @return DrawLine
     */
    public DrawLine getGradationZeroLineProperties()  {
        return DrawLine.getOrCreateRef(getAttributeAsJavaScriptObject("gradationZeroLineProperties"));
    }
    

    /**
     * For {@link com.smartgwt.client.widgets.chart.MetricSettings#getMultiFacet single-facet} charts embedded in a multi-facet
     * main chart, the <code>legendLabel</code> defines the text of the legend label for this chart. The default text is the
     * {@link com.smartgwt.client.widgets.cube.FacetValue#getTitle title} of the metric facet value of this value axis
     * concatenated with the {@link com.smartgwt.client.widgets.cube.FacetValue#getTitle title} of the {@link
     * com.smartgwt.client.widgets.chart.MetricSettings#getFixedFacetValue fixed facet value} in parentheses.  Set the
     * <code>legendLabel</code> to provide custom text for the legend label.
     *
     * @param legendLabel  Default value is null
     */
    public void setLegendLabel(String legendLabel) {
        setAttribute("legendLabel", legendLabel);
    }

    /**
     * For {@link com.smartgwt.client.widgets.chart.MetricSettings#getMultiFacet single-facet} charts embedded in a multi-facet
     * main chart, the <code>legendLabel</code> defines the text of the legend label for this chart. The default text is the
     * {@link com.smartgwt.client.widgets.cube.FacetValue#getTitle title} of the metric facet value of this value axis
     * concatenated with the {@link com.smartgwt.client.widgets.cube.FacetValue#getTitle title} of the {@link
     * com.smartgwt.client.widgets.chart.MetricSettings#getFixedFacetValue fixed facet value} in parentheses.  Set the
     * <code>legendLabel</code> to provide custom text for the legend label.
     *
     * @return String
     */
    public String getLegendLabel()  {
        return getAttributeAsString("legendLabel");
    }
    

    /**
     * When {@link com.smartgwt.client.widgets.chart.MetricSettings#getUseLogGradations useLogGradations}, base value for
     * logarithmic gradation lines.  Gradation lines will be shown at every power of this value plus intervening values
     * specified by {@link com.smartgwt.client.widgets.chart.MetricSettings#getLogGradations logGradations}.
     *
     * @param logBase  Default value is 10
     */
    public void setLogBase(int logBase) {
        setAttribute("logBase", logBase);
    }

    /**
     * When {@link com.smartgwt.client.widgets.chart.MetricSettings#getUseLogGradations useLogGradations}, base value for
     * logarithmic gradation lines.  Gradation lines will be shown at every power of this value plus intervening values
     * specified by {@link com.smartgwt.client.widgets.chart.MetricSettings#getLogGradations logGradations}.
     *
     * @return int
     */
    public int getLogBase()  {
        return getAttributeAsInt("logBase");
    }
    

    /**
     * When {@link com.smartgwt.client.widgets.chart.MetricSettings#getUseLogGradations useLogGradations} is set, gradation
     * lines to show in between powers,
     * expressed as a series of integer or float values between 1 and {@link
     * com.smartgwt.client.widgets.chart.MetricSettings#getLogBase logBase}.
     *  <P>
     *  Some common possibilities (for base 10):
     *  <pre>
     *     [ 1 ] // show only orders of magnitude (0.1, 1, 10, 100, etc)
     *     [ 1, 5 ] // show only orders of magnitude plus halfway mark
     *     [ 1, 2, 4, 8 ] // show powers of 2 between orders
     *     [ 1, 2.5, 5, 7.5 ] // show quarters
     *  </pre>
     *  Or base 2:
     *  <pre>
     *     [ 1 ]
     *     [ 1, 1.5 ]
     *  </pre>
     *
     * @param logGradations  Default value is [ 1,2,4,6,8 ]
     */
    public void setLogGradations(float... logGradations) {
        setAttribute("logGradations", logGradations);
    }

    /**
     * When {@link com.smartgwt.client.widgets.chart.MetricSettings#getUseLogGradations useLogGradations} is set, gradation
     * lines to show in between powers,
     * expressed as a series of integer or float values between 1 and {@link
     * com.smartgwt.client.widgets.chart.MetricSettings#getLogBase logBase}.
     *  <P>
     *  Some common possibilities (for base 10):
     *  <pre>
     *     [ 1 ] // show only orders of magnitude (0.1, 1, 10, 100, etc)
     *     [ 1, 5 ] // show only orders of magnitude plus halfway mark
     *     [ 1, 2, 4, 8 ] // show powers of 2 between orders
     *     [ 1, 2.5, 5, 7.5 ] // show quarters
     *  </pre>
     *  Or base 2:
     *  <pre>
     *     [ 1 ]
     *     [ 1, 1.5 ]
     *  </pre>
     *
     * @return float...
     */
    public float[] getLogGradations()  {
        return com.smartgwt.client.util.ConvertTo.arrayOffloat(getAttributeAsJavaScriptObject("logGradations"));
    }
    

    /**
     * Whether to use logarithmic scaling for values. <P> Logarithmic scale charts show an equivalent percentage increase as
     * equivalent distance on the chart.  That is, 10 and 100 are the same distance apart as 100 and 1000 (each being a 10
     * times or 1000% increase).
     *
     * @param logScale  Default value is false
     */
    public void setLogScale(Boolean logScale) {
        setAttribute("logScale", logScale);
    }

    /**
     * Whether to use logarithmic scaling for values. <P> Logarithmic scale charts show an equivalent percentage increase as
     * equivalent distance on the chart.  That is, 10 and 100 are the same distance apart as 100 and 1000 (each being a 10
     * times or 1000% increase).
     *
     * @return Boolean
     */
    public Boolean getLogScale()  {
        Boolean result = getAttributeAsBoolean("logScale", true);
        return result == null ? false : result;
    }
    

    /**
     * When this property is set to the metric of another MetricSettings object, the extra value axis and chart corresponding
     * to these settings will use the same scale for the gradations as the extra value axis and chart of the other
     * MetricSettings object.  The value of <code>matchGradations</code> can only be one of the metrics of the metric facet
     * whose values will be displayed by the chart.
     *
     * @param matchGradations  Default value is null
     * @see com.smartgwt.client.widgets.chart.FacetChart#setExtraAxisMetrics
     */
    public void setMatchGradations(String matchGradations) {
        setAttribute("matchGradations", matchGradations);
    }

    /**
     * When this property is set to the metric of another MetricSettings object, the extra value axis and chart corresponding
     * to these settings will use the same scale for the gradations as the extra value axis and chart of the other
     * MetricSettings object.  The value of <code>matchGradations</code> can only be one of the metrics of the metric facet
     * whose values will be displayed by the chart.
     *
     * @return String
     * @see com.smartgwt.client.widgets.chart.FacetChart#getExtraAxisMetrics
     */
    public String getMatchGradations()  {
        return getAttributeAsString("matchGradations");
    }
    

    /**
     * Same as {@link com.smartgwt.client.widgets.chart.FacetChart#getMinDataSpreadPercent minDataSpreadPercent} but affects
     * only one metric.  Default of null means that the chart-wide setting <code>facetChart.minDataSpreadPercent</code> will be
     * used.
     *
     * @param minDataSpreadPercent  Default value is null
     */
    public void setMinDataSpreadPercent(Integer minDataSpreadPercent) {
        setAttribute("minDataSpreadPercent", minDataSpreadPercent);
    }

    /**
     * Same as {@link com.smartgwt.client.widgets.chart.FacetChart#getMinDataSpreadPercent minDataSpreadPercent} but affects
     * only one metric.  Default of null means that the chart-wide setting <code>facetChart.minDataSpreadPercent</code> will be
     * used.
     *
     * @return Integer
     */
    public Integer getMinDataSpreadPercent()  {
        return getAttributeAsInt("minDataSpreadPercent");
    }
    

    /**
     * Whether this extra value axis plots values while varying the facet values of just the first facet (single-facet) or both
     * first and second facets (multi-facet).
     *
     * @param multiFacet  Default value is true
     */
    public void setMultiFacet(Boolean multiFacet) {
        setAttribute("multiFacet", multiFacet);
    }

    /**
     * Whether this extra value axis plots values while varying the facet values of just the first facet (single-facet) or both
     * first and second facets (multi-facet).
     *
     * @return Boolean
     */
    public Boolean getMultiFacet()  {
        Boolean result = getAttributeAsBoolean("multiFacet", true);
        return result == null ? true : result;
    }
    

    /**
     * For multi-facet charts, render data values as a proportion of the sum of all data values that have the same label. <p>
     * Gradation labels will be switched to show percentage instead of absolute values. <p> This setting is valid only for
     * Column, Bar, Area and Radar chart types and only in {@link com.smartgwt.client.widgets.chart.MetricSettings#getStacked
     * stacked} mode.  Stacked columns will be as tall as the chart rect and stacked bars will be as wide as the chart rect. 
     * Area and Radar charts will be completely filled except for facet values where all values are 0.
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Setter for {@link com.smartgwt.client.widgets.chart.MetricSettings#getProportional proportional}.
     *
     * @param proportional Whether the chart should now use proportional mode.. Default value is null
     * @see <a href="http://www.smartclient.com/smartgwtee/showcase/#multiSeriesChart" target="examples">Multi-Series Chart Example</a>
     */
    public void setProportional(Boolean proportional) {
        setAttribute("proportional", proportional);
    }

    /**
     * For multi-facet charts, render data values as a proportion of the sum of all data values that have the same label. <p>
     * Gradation labels will be switched to show percentage instead of absolute values. <p> This setting is valid only for
     * Column, Bar, Area and Radar chart types and only in {@link com.smartgwt.client.widgets.chart.MetricSettings#getStacked
     * stacked} mode.  Stacked columns will be as tall as the chart rect and stacked bars will be as wide as the chart rect. 
     * Area and Radar charts will be completely filled except for facet values where all values are 0.
     *
     * @return Boolean
     * @see <a href="http://www.smartclient.com/smartgwtee/showcase/#multiSeriesChart" target="examples">Multi-Series Chart Example</a>
     */
    public Boolean getProportional()  {
        return getAttributeAsBoolean("proportional", true);
    }
    

    /**
     * Default title for the value axis label when the chart is in {@link
     * com.smartgwt.client.widgets.chart.MetricSettings#getProportional proportional rendering mode}.  This title will be used
     * unless the {@link com.smartgwt.client.widgets.chart.FacetChart#getLegendFacet legend facet} defines a {@link
     * com.smartgwt.client.widgets.cube.Facet#getProportionalTitle proportionalTitle}.
     *
     * @param proportionalAxisLabel  Default value is "Percent"
     */
    public void setProportionalAxisLabel(String proportionalAxisLabel) {
        setAttribute("proportionalAxisLabel", proportionalAxisLabel);
    }

    /**
     * Default title for the value axis label when the chart is in {@link
     * com.smartgwt.client.widgets.chart.MetricSettings#getProportional proportional rendering mode}.  This title will be used
     * unless the {@link com.smartgwt.client.widgets.chart.FacetChart#getLegendFacet legend facet} defines a {@link
     * com.smartgwt.client.widgets.cube.Facet#getProportionalTitle proportionalTitle}.
     *
     * @return String
     */
    public String getProportionalAxisLabel()  {
        return getAttributeAsString("proportionalAxisLabel");
    }
    

    /**
     * Properties for shadows.
     *
     * @param shadowProperties  Default value is null
     */
    public void setShadowProperties(DrawOval shadowProperties) {
        JavaScriptObject config = shadowProperties == null ? null : shadowProperties.getConfig();
        setAttribute("shadowProperties", JSOHelper.cleanProperties(config, true));
    }

    /**
     * Properties for shadows.
     *
     * @return DrawOval
     */
    public DrawOval getShadowProperties()  {
        return DrawOval.getOrCreateRef(getAttributeAsJavaScriptObject("shadowProperties"));
    }
    

    /**
     * Whether to show the extra value axis.
     *
     * @param showAxis  Default value is null
     */
    public void setShowAxis(Boolean showAxis) {
        setAttribute("showAxis", showAxis);
    }

    /**
     * Whether to show the extra value axis.
     *
     * @return Boolean
     */
    public Boolean getShowAxis()  {
        return getAttributeAsBoolean("showAxis", true);
    }
    

    /**
     * Whether to show an axis line for this extra value axis if it is not placed directly adjacent to the chart rect.  The
     * default setting is the value of the {@link com.smartgwt.client.widgets.chart.FacetChart#getShowChartRect showChartRect}
     * property of the FacetChart.
     *
     * @param showAxisLine  Default value is null
     */
    public void setShowAxisLine(Boolean showAxisLine) {
        setAttribute("showAxisLine", showAxisLine);
    }

    /**
     * Whether to show an axis line for this extra value axis if it is not placed directly adjacent to the chart rect.  The
     * default setting is the value of the {@link com.smartgwt.client.widgets.chart.FacetChart#getShowChartRect showChartRect}
     * property of the FacetChart.
     *
     * @return Boolean
     */
    public Boolean getShowAxisLine()  {
        return getAttributeAsBoolean("showAxisLine", true);
    }
    

    /**
     * For Line, Area, Radar, Scatter or Bubble charts, whether to show data points for each individual data value. <P> If
     * shown, the {@link com.smartgwt.client.widgets.chart.MetricSettings#pointClick MetricSettings.pointClick} and {@link
     * com.smartgwt.client.widgets.chart.MetricSettings#getPointHoverHTML MetricSettings.getPointHoverHTML} APIs can be used to
     * create interactivity.
     *
     * @param showDataPoints  Default value is false
     */
    public void setShowDataPoints(Boolean showDataPoints) {
        setAttribute("showDataPoints", showDataPoints);
    }

    /**
     * For Line, Area, Radar, Scatter or Bubble charts, whether to show data points for each individual data value. <P> If
     * shown, the {@link com.smartgwt.client.widgets.chart.MetricSettings#pointClick MetricSettings.pointClick} and {@link
     * com.smartgwt.client.widgets.chart.MetricSettings#getPointHoverHTML MetricSettings.getPointHoverHTML} APIs can be used to
     * create interactivity.
     *
     * @return Boolean
     */
    public Boolean getShowDataPoints()  {
        Boolean result = getAttributeAsBoolean("showDataPoints", true);
        return result == null ? false : result;
    }
    

    /**
     * Should data values be shown as text labels near the shape representing the value, for example, above columns of a column
     * chart, or adjacent to points in a line chart? <p> If set to false, then data values will not be shown. <p> If set to
     * true, data values will be shown unless the data density is high enough that labels will potentially overlap, in which
     * case, data values will not be shown and {@link com.smartgwt.client.widgets.chart.MetricSettings#getShowValueOnHover
     * showValueOnHover} will be enabled instead.
     *
     * @param showDataValues  Default value is null
     */
    public void setShowDataValues(Boolean showDataValues) {
        setAttribute("showDataValues", showDataValues);
    }

    /**
     * Should data values be shown as text labels near the shape representing the value, for example, above columns of a column
     * chart, or adjacent to points in a line chart? <p> If set to false, then data values will not be shown. <p> If set to
     * true, data values will be shown unless the data density is high enough that labels will potentially overlap, in which
     * case, data values will not be shown and {@link com.smartgwt.client.widgets.chart.MetricSettings#getShowValueOnHover
     * showValueOnHover} will be enabled instead.
     *
     * @return Boolean
     */
    public Boolean getShowDataValues()  {
        return getAttributeAsBoolean("showDataValues", true);
    }
    

    /**
     * Whether to automatically show shadows for various charts.
     *
     * @param showShadows  Default value is true
     */
    public void setShowShadows(Boolean showShadows) {
        setAttribute("showShadows", showShadows);
    }

    /**
     * Whether to automatically show shadows for various charts.
     *
     * @return Boolean
     */
    public Boolean getShowShadows()  {
        Boolean result = getAttributeAsBoolean("showShadows", true);
        return result == null ? true : result;
    }
    

    /**
     * Whether to show the {@link com.smartgwt.client.widgets.chart.MetricSettings#getValueTitle valueTitle} (or, in the case
     * of {@link com.smartgwt.client.widgets.chart.MetricSettings#getProportional proportional rendering mode}, {@link
     * com.smartgwt.client.widgets.chart.MetricSettings#getProportionalAxisLabel proportionalAxisLabel}) as a label on this
     * extra value axis.
     *
     * @param showValueAxisLabel  Default value is null
     */
    public void setShowValueAxisLabel(Boolean showValueAxisLabel) {
        setAttribute("showValueAxisLabel", showValueAxisLabel);
    }

    /**
     * Whether to show the {@link com.smartgwt.client.widgets.chart.MetricSettings#getValueTitle valueTitle} (or, in the case
     * of {@link com.smartgwt.client.widgets.chart.MetricSettings#getProportional proportional rendering mode}, {@link
     * com.smartgwt.client.widgets.chart.MetricSettings#getProportionalAxisLabel proportionalAxisLabel}) as a label on this
     * extra value axis.
     *
     * @return Boolean
     */
    public Boolean getShowValueAxisLabel()  {
        return getAttributeAsBoolean("showValueAxisLabel", true);
    }
    

    /**
     * Shows the value of the nearest data value in a floating label whenever the mouse moves within the main chart area.  The
     * visual element representing the data value will also be emphasized by brightening or highlighting it (appearance differs
     * by chart type). <p> Calculates nearest value based on {@link
     * com.smartgwt.client.widgets.chart.FacetChart#getNearestDrawnValue FacetChart.getNearestDrawnValue}. <p> The data value
     * will be formatted using {@link com.smartgwt.client.widgets.chart.FacetChart#formatDataValue FacetChart.formatDataValue}.
     * The label's appearance is controlled by {@link com.smartgwt.client.widgets.chart.FacetChart#getHoverLabelProperties
     * hoverLabelProperties}.
     *
     * @param showValueOnHover  Default value is null
     */
    public void setShowValueOnHover(Boolean showValueOnHover) {
        setAttribute("showValueOnHover", showValueOnHover);
    }

    /**
     * Shows the value of the nearest data value in a floating label whenever the mouse moves within the main chart area.  The
     * visual element representing the data value will also be emphasized by brightening or highlighting it (appearance differs
     * by chart type). <p> Calculates nearest value based on {@link
     * com.smartgwt.client.widgets.chart.FacetChart#getNearestDrawnValue FacetChart.getNearestDrawnValue}. <p> The data value
     * will be formatted using {@link com.smartgwt.client.widgets.chart.FacetChart#formatDataValue FacetChart.formatDataValue}.
     * The label's appearance is controlled by {@link com.smartgwt.client.widgets.chart.FacetChart#getHoverLabelProperties
     * hoverLabelProperties}.
     *
     * @return Boolean
     */
    public Boolean getShowValueOnHover()  {
        return getAttributeAsBoolean("showValueOnHover", true);
    }
    

    /**
     * If the {@link com.smartgwt.client.types.ChartType} is "Column" then the metric settings may include a setting for {@link
     * com.smartgwt.client.widgets.chart.FacetChart#getStacked stacked}. <p>
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Method to change {@link com.smartgwt.client.widgets.chart.MetricSettings#getStacked stacked}. Use null to apply a default value for the current {@link com.smartgwt.client.types.ChartType chartType}.
     *
     * @param stacked new value. Default value is null
     */
    public void setStacked(Boolean stacked) {
        setAttribute("stacked", stacked);
    }

    /**
     * If the {@link com.smartgwt.client.types.ChartType} is "Column" then the metric settings may include a setting for {@link
     * com.smartgwt.client.widgets.chart.FacetChart#getStacked stacked}. <p>
     *
     * @return Boolean
     */
    public Boolean getStacked()  {
        return getAttributeAsBoolean("stacked", true);
    }
    

    /**
     * Whether to use classic logarithmic gradations, where each order of magnitude is shown as a gradation as well as a few
     * intervening lines.   Gradations also begin and end on an order of magnitude.  For example, 1,2,4,6,8,10,20,40,60,80,100.
     * <P> Default gradations can be overridden via {@link com.smartgwt.client.widgets.chart.MetricSettings#getLogBase logBase}
     * and {@link com.smartgwt.client.widgets.chart.MetricSettings#getLogGradations logGradations}.
     *
     * @param useLogGradations  Default value is false
     */
    public void setUseLogGradations(Boolean useLogGradations) {
        setAttribute("useLogGradations", useLogGradations);
    }

    /**
     * Whether to use classic logarithmic gradations, where each order of magnitude is shown as a gradation as well as a few
     * intervening lines.   Gradations also begin and end on an order of magnitude.  For example, 1,2,4,6,8,10,20,40,60,80,100.
     * <P> Default gradations can be overridden via {@link com.smartgwt.client.widgets.chart.MetricSettings#getLogBase logBase}
     * and {@link com.smartgwt.client.widgets.chart.MetricSettings#getLogGradations logGradations}.
     *
     * @return Boolean
     */
    public Boolean getUseLogGradations()  {
        Boolean result = getAttributeAsBoolean("useLogGradations", true);
        return result == null ? false : result;
    }
    

    /**
     * Properties for labels of value axis.
     *
     * @param valueAxisLabelProperties  Default value is null
     */
    public void setValueAxisLabelProperties(DrawLabel valueAxisLabelProperties) {
        JavaScriptObject config = valueAxisLabelProperties == null ? null : valueAxisLabelProperties.getConfig();
        setAttribute("valueAxisLabelProperties", JSOHelper.cleanProperties(config, true));
    }

    /**
     * Properties for labels of value axis.
     *
     * @return DrawLabel
     */
    public DrawLabel getValueAxisLabelProperties()  {
        return DrawLabel.getOrCreateRef(getAttributeAsJavaScriptObject("valueAxisLabelProperties"));
    }
    

    /**
     * Properties for a "value line" - a line shows where a particular discrete value is placed, eg, vertical lines connecting
     * points of a line chart to the X axis, or radial lines in a Radar chart.
     *
     * @param valueLineProperties  Default value is null
     */
    public void setValueLineProperties(DrawLine valueLineProperties) {
        JavaScriptObject config = valueLineProperties == null ? null : valueLineProperties.getConfig();
        setAttribute("valueLineProperties", JSOHelper.cleanProperties(config, true));
    }

    /**
     * Properties for a "value line" - a line shows where a particular discrete value is placed, eg, vertical lines connecting
     * points of a line chart to the X axis, or radial lines in a Radar chart.
     *
     * @return DrawLine
     */
    public DrawLine getValueLineProperties()  {
        return DrawLine.getOrCreateRef(getAttributeAsJavaScriptObject("valueLineProperties"));
    }
    

    /**
     * A label for the data values, such as "Sales in Thousands", typically used as the label for the value axis.
     *
     * @param valueTitle  Default value is null
     */
    public void setValueTitle(String valueTitle) {
        setAttribute("valueTitle", valueTitle);
    }

    /**
     * A label for the data values, such as "Sales in Thousands", typically used as the label for the value axis.
     *
     * @return String
     */
    public String getValueTitle()  {
        return getAttributeAsString("valueTitle");
    }
    

    // ********************* Methods ***********************


	/**
     * Get a color from the {@link com.smartgwt.client.widgets.chart.MetricSettings#getDataColors dataColors} Array <P>
     * Override to provide a dynamic color generation scheme.
     * @param index index of the visual element to be colored
     *
     * @return 
     */
    public native String getDataColor(int index) /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        var ret = self.getDataColor(index);
        return ret;
    }-*/;


	/**
     * Return an array of the gradation values used in the current chart.  Pass these values to {@link
     * com.smartgwt.client.widgets.chart.MetricSettings#getXCoord MetricSettings.getXCoord} / {@link
     * com.smartgwt.client.widgets.chart.MetricSettings#getYCoord MetricSettings.getYCoord} (depending on the orientation of
     * the chart) to discover the coordinates where gradations are drawn. <P> This is only allowed to be called when {@link
     * com.smartgwt.client.widgets.chart.FacetChart#addChartDrawnHandler FacetChart.chartDrawn} fires.
     *
     * @return an array of gradation values used in the current chart.
     */
    public native float[] getGradations() /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        var ret = self.getGradations();
        if(ret == null) return null;
        return @com.smartgwt.client.util.ConvertTo::arrayOffloat(Lcom/google/gwt/core/client/JavaScriptObject;)(ret);
    }-*/;



	/**
     * Returns the X coordination where the passed data value would be drawn.   For example, this would be the X coordinate
     * where a bar would end in a bar chart. <P> This is only allowed to be called when {@link
     * com.smartgwt.client.widgets.chart.FacetChart#addChartDrawnHandler FacetChart.chartDrawn} fires. <P> If the {@link
     * com.smartgwt.client.types.ChartType} is "Bar", "Bubble", or "Scatter" then <code>value</code> argument should be a
     * number.  For other rectangular charts, this method expects a {@link com.smartgwt.client.widgets.cube.FacetValueMap} that
     * uniquely identifies the data cell whose x-axis coordinate to retrieve.
     * @param value the value to be drawn.
     *
     * @return the X coordinate where the passed data value would be drawn.
     * @deprecated  {@link com.smartgwt.client.docs.GwtFloatVsDouble GwtFloatVsDouble}
     */
    public native float getXCoord(float value) /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        var ret = self.getXCoord(value);
        return ret;
    }-*/;

	/**
     * Returns the X coordination where the passed data value would be drawn.   For example, this would be the X coordinate
     * where a bar would end in a bar chart. <P> This is only allowed to be called when {@link
     * com.smartgwt.client.widgets.chart.FacetChart#addChartDrawnHandler FacetChart.chartDrawn} fires. <P> If the {@link
     * com.smartgwt.client.types.ChartType} is "Bar", "Bubble", or "Scatter" then <code>value</code> argument should be a
     * number.  For other rectangular charts, this method expects a {@link com.smartgwt.client.widgets.cube.FacetValueMap} that
     * uniquely identifies the data cell whose x-axis coordinate to retrieve.
     * @param value the value to be drawn.
     *
     * @return the X coordinate where the passed data value would be drawn.
     */
    public native double getXCoordAsDouble(double value) /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        var ret = self.getXCoord(value);
        return ret;
    }-*/;




	/**
     * Returns the Y coordination where the passed data value would be drawn.   For example, this would be the Y coordinate
     * that a line would pass through on a line chart, or the top of a column on a column chart. <P> This is only allowed to be
     * called when {@link com.smartgwt.client.widgets.chart.FacetChart#addChartDrawnHandler FacetChart.chartDrawn} fires. <P>
     * If the {@link com.smartgwt.client.types.ChartType} is "Area", "Bubble", "Column", "Line", or "Scatter" then the
     * <code>value</code> argument should be a number.  For "Bar" charts this method expects a {@link
     * com.smartgwt.client.widgets.cube.FacetValueMap} that uniquely identifies the data cell whose y-axis coordinate to
     * retrieve.
     * @param value the value to be drawn.
     *
     * @return the Y coordinate where the passed data value would be drawn.
     * @deprecated  {@link com.smartgwt.client.docs.GwtFloatVsDouble GwtFloatVsDouble}
     */
    public native float getYCoord(float value) /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        var ret = self.getYCoord(value);
        return ret;
    }-*/;

	/**
     * Returns the Y coordination where the passed data value would be drawn.   For example, this would be the Y coordinate
     * that a line would pass through on a line chart, or the top of a column on a column chart. <P> This is only allowed to be
     * called when {@link com.smartgwt.client.widgets.chart.FacetChart#addChartDrawnHandler FacetChart.chartDrawn} fires. <P>
     * If the {@link com.smartgwt.client.types.ChartType} is "Area", "Bubble", "Column", "Line", or "Scatter" then the
     * <code>value</code> argument should be a number.  For "Bar" charts this method expects a {@link
     * com.smartgwt.client.widgets.cube.FacetValueMap} that uniquely identifies the data cell whose y-axis coordinate to
     * retrieve.
     * @param value the value to be drawn.
     *
     * @return the Y coordinate where the passed data value would be drawn.
     */
    public native double getYCoordAsDouble(double value) /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        var ret = self.getYCoord(value);
        return ret;
    }-*/;



    // ********************* Static Methods ***********************

    // ***********************************************************



    /**
     * Display custom HTML when {@link com.smartgwt.client.widgets.chart.MetricSettings#getShowDataPoints showDataPoints} is true and the mouse hovers
     * over a point.
     * @param hoverCustomizer
     */
    public native void setPointHoverCustomizer(ChartPointHoverCustomizer hoverCustomizer) /*-{
        var self = this.@com.smartgwt.client.core.JsObject::getJsObj()();
        self.getPointHoverHTML = $debox($entry(function (value, record) {
            var recordJ = @com.smartgwt.client.data.Record::getOrCreateRef(Lcom/google/gwt/core/client/JavaScriptObject;)(record),
                valueJ = @java.lang.Float::new(Ljava/lang/String;)("" + value);
            return hoverCustomizer.@com.smartgwt.client.widgets.chart.ChartPointHoverCustomizer::hoverHTML(Ljava/lang/Float;Lcom/smartgwt/client/data/Record;)(valueJ, recordJ);
        }));
    }-*/;

    /**
     * Apply a handler to fire when {@link com.smartgwt.client.widgets.chart.MetricSettings#getShowDataPoints showDataPoints} is true,
     * and the user clicks on a point.
     * @param handler
     */
    public native void setPointClickHandler(ChartPointClickHandler handler) /*-{
        var self = this.@com.smartgwt.client.core.JsObject::getJsObj()();
        self.pointClick = $debox($entry(function (value, record) {
            var recordJ = @com.smartgwt.client.data.Record::getOrCreateRef(Lcom/google/gwt/core/client/JavaScriptObject;)(record),
                valueJ = @java.lang.Float::new(Ljava/lang/String;)("" + value),
                eventJ = @com.smartgwt.client.widgets.chart.ChartPointClickEvent::new(Ljava/lang/Float;Lcom/smartgwt/client/data/Record;)(valueJ, recordJ);
            handler.@com.smartgwt.client.widgets.chart.ChartPointClickHandler::onPointClick(Lcom/smartgwt/client/widgets/chart/ChartPointClickEvent;)(eventJ);
        }));
    }-*/;

    /**
     * Formatter to apply to values displayed in the gradation labels.
     * @param formatter Formatter to apply to values displayed in the gradation labels
     */
    public native void setAxisValueFormatter(ValueFormatter formatter) /*-{
        var self = this.@com.smartgwt.client.core.JsObject::getJsObj()();
        self.formatAxisValue = $debox($entry(function (value) {
            var valueJ = $wnd.SmartGWT.convertToJavaType(value);
            return formatter.@com.smartgwt.client.widgets.chart.ValueFormatter::format(Ljava/lang/Object;)(valueJ);
        }));
    }-*/;

    /**
     * Formatter to apply to values displayed in the hover labels and other value labels
     * @param formatter Formatter to apply to values displayed in the hover labels and other value labels
     */
    public native void setDataValueFormatter(ValueFormatter formatter) /*-{
        var self = this.@com.smartgwt.client.core.JsObject::getJsObj()();
        self.formatDataValue = $debox($entry(function (value) {
            var valueJ = $wnd.SmartGWT.convertToJavaType(value);
            return formatter.@com.smartgwt.client.widgets.chart.ValueFormatter::format(Ljava/lang/Object;)(valueJ);
        }));
    }-*/;

}



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
 
package com.smartgwt.client.widgets.drawing;


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
 * A DrawPane is a container for drawing bitmap and vector graphics using browser's built-in freeform drawing capabilities.
 * These include the HTML5 <code>&lt;canvas&gt;</code> tag and <code>SVG (Scalable Vector Graphics)</code> where available,
 * and the <code>VML (Vector Markup Language)</code> for legacy browsers (Internet Explorer 8 and earlier). <p> To draw in
 * a <code>DrawPane</code> you create {@link com.smartgwt.client.widgets.drawing.DrawLine}s, {@link
 * com.smartgwt.client.widgets.drawing.DrawOval}s, {@link com.smartgwt.client.widgets.drawing.DrawPath}s and other {@link
 * com.smartgwt.client.widgets.drawing.DrawItem}-based components, and place them in the <code>DrawPane</code> via {@link
 * com.smartgwt.client.widgets.drawing.DrawPane#getDrawItems drawItems} or add them incrementally via {@link
 * com.smartgwt.client.widgets.drawing.DrawPane#addDrawItem DrawPane.addDrawItem}. <p> <code>DrawItems</code> support a
 * variety of common features, such as  {@link com.smartgwt.client.widgets.drawing.Gradient gradient fills}, {@link
 * com.smartgwt.client.widgets.drawing.DrawItem#getStartArrow arrowheads}, events such as {@link
 * com.smartgwt.client.widgets.drawing.DrawItem#addClickHandler click()} and built-in {@link
 * com.smartgwt.client.widgets.drawing.DrawItem#getKnobs control knobs} for end user resizing and manipulation of shapes.
 * <p> Common shapes such as {@link com.smartgwt.client.widgets.drawing.DrawRect rectangles}, {@link
 * com.smartgwt.client.widgets.drawing.DrawOval ovals} and {@link com.smartgwt.client.widgets.drawing.DrawTriangle
 * triangles} have dedicated DrawItem subclasses.  For other shapes, consider: <ul> <li> {@link
 * com.smartgwt.client.widgets.drawing.DrawPath} - a multi-segment line with straight segments, defined by a series      of
 * {@link com.smartgwt.client.widgets.drawing.DrawPath#getPoints points} <li> {@link
 * com.smartgwt.client.widgets.drawing.DrawPolygon} - a closed shape with straight sides, defined by a series of     
 * {@link com.smartgwt.client.widgets.drawing.DrawPolygon#getPoints points} <li> {@link
 * com.smartgwt.client.widgets.drawing.DrawShape} - a multi-segment line or closed shape whose sides can be defined by a   
 * series of commands, including curved arcs </ul> <p><b>NOTE:</b>To use the Drawing subsystem, include the Drawing module
 * in your application by including <code>&lt;inherits name="com.smartgwt.Drawing"/&gt;</code> in your GWT module XML.</p>
 * <h3>Note on Coordinate Systems</h3> There are three different coordinate systems involved when a DrawItem is drawn onto
 * a DrawPane: <ul> <li>The "local coordinate system" for a DrawItem refers to the Cartesian coordinate system     in which
 * dimensional and positional values are interpreted.  For example, when a     {@link
 * com.smartgwt.client.widgets.drawing.DrawRect} is configured with left:20, top:30, width:200, and height:100, the    
 * DrawRect represents a rectangle from (20, 30) to (220, 130) in its local coordinate     system.     <p>     There is a
 * local coordinate system for each DrawItem.</li> <li>The "drawing coordinate system" refers to the Cartesian coordinate
 * system shared by     all DrawItems after their local transforms, such as {@link
 * com.smartgwt.client.widgets.drawing.DrawItem#getScale scale} or     {@link
 * com.smartgwt.client.widgets.drawing.DrawItem#getRotation rotation}, have been applied.     <p>     For DrawItems with no
 * local transforms, the drawing coordinate system is identical to     the local coordinate system.</li> <li>The "global
 * coordinate system" refers to the drawing coordinate system with global     DrawPane transforms {@link
 * com.smartgwt.client.widgets.drawing.DrawPane#getTranslate translate}, {@link
 * com.smartgwt.client.widgets.drawing.DrawPane#getZoomLevel zoomLevel} and     {@link
 * com.smartgwt.client.widgets.drawing.DrawPane#getRotation rotation} applied.     <p>     With the default global
 * transforms, the global coordinate system is identical to the     drawing coordinate system.</li> </ul> <p> The view port
 * of the DrawPane is the rectangle in the global coordinate system from (0, 0) that is as wide as the DrawPane's {@link
 * com.smartgwt.client.widgets.Canvas#getInnerContentWidth inner content width} and as high as the DrawPane's {@link
 * com.smartgwt.client.widgets.Canvas#getInnerContentHeight inner content height}. <p> One other coordinate system in use
 * by a DrawPane when {@link com.smartgwt.client.widgets.drawing.DrawPane#getCanDragScroll drag-scrolling} is enabled is
 * the "viewbox coordinate system". The viewbox coordinate system is the drawing coordinate system with the {@link
 * com.smartgwt.client.widgets.drawing.DrawPane#getTranslate translate} and {@link
 * com.smartgwt.client.widgets.drawing.DrawPane#getZoomLevel zoomLevel} transforms applied.
 */
@BeanFactory.FrameworkClass
@BeanFactory.ScClassName("DrawPane")
public class DrawPane extends Canvas {

    public static DrawPane getOrCreateRef(JavaScriptObject jsObj) {
        if (jsObj == null) return null;
        final BaseWidget refInstance = BaseWidget.getRef(jsObj);
        if (refInstance == null) {
            return new DrawPane(jsObj);
        } else {
            assert refInstance instanceof DrawPane;
            return (DrawPane)refInstance;
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
        $wnd.isc.DrawPane.changeDefaults(autoChildName + "Defaults", defaults.@com.smartgwt.client.widgets.Canvas::getConfig()());
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
        $wnd.isc.DrawPane.changeDefaults(autoChildName + "Defaults", defaults.@com.smartgwt.client.widgets.form.fields.FormItem::getJsObj()());
    }-*/;

    public DrawPane(){
        scClassName = "DrawPane";
    }

    public DrawPane(JavaScriptObject jsObj){
        scClassName = "DrawPane";
        setJavaScriptObject(jsObj);
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
     * Can the user drag-scroll the DrawPane?
     *
     * @param canDragScroll  Default value is false
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.widgets.drawing.DrawPane#setDrawingWidth
     * @see com.smartgwt.client.widgets.drawing.DrawPane#setDrawingHeight
     * 
     */
    public void setCanDragScroll(boolean canDragScroll)  throws IllegalStateException {
        setAttribute("canDragScroll", canDragScroll, false);
    }

    /**
     * Can the user drag-scroll the DrawPane?
     *
     * @return boolean
     * @see com.smartgwt.client.widgets.drawing.DrawPane#getDrawingWidth
     * @see com.smartgwt.client.widgets.drawing.DrawPane#getDrawingHeight
     * 
     */
    public boolean getCanDragScroll()  {
        Boolean result = getAttributeAsBoolean("canDragScroll");
        return result == null ? false : result;
    }
    

    /**
     * When {@link com.smartgwt.client.widgets.drawing.DrawPane#getCanDragScroll canDragScroll} is enabled, this is the height
     * of the area in viewbox coordinates that can be accessed through drag-scrolling.
     *
     * @param drawingHeight  Default value is 1000
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * 
     */
    public void setDrawingHeight(int drawingHeight)  throws IllegalStateException {
        setAttribute("drawingHeight", drawingHeight, false);
    }

    /**
     * When {@link com.smartgwt.client.widgets.drawing.DrawPane#getCanDragScroll canDragScroll} is enabled, this is the height
     * of the area in viewbox coordinates that can be accessed through drag-scrolling.
     *
     * @return int
     * 
     */
    public int getDrawingHeight()  {
        return getAttributeAsInt("drawingHeight");
    }
    

    /**
     * When {@link com.smartgwt.client.widgets.drawing.DrawPane#getCanDragScroll canDragScroll} is enabled, this is the width
     * of the area in viewbox coordinates that can be accessed through drag-scrolling.
     *
     * @param drawingWidth  Default value is 1000
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * 
     */
    public void setDrawingWidth(int drawingWidth)  throws IllegalStateException {
        setAttribute("drawingWidth", drawingWidth, false);
    }

    /**
     * When {@link com.smartgwt.client.widgets.drawing.DrawPane#getCanDragScroll canDragScroll} is enabled, this is the width
     * of the area in viewbox coordinates that can be accessed through drag-scrolling.
     *
     * @return int
     * 
     */
    public int getDrawingWidth()  {
        return getAttributeAsInt("drawingWidth");
    }
    

    /**
     * Array of DrawItems to initially display in this DrawPane.
     *
     * @param drawItems  Default value is null
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setDrawItems(DrawItem... drawItems)  throws IllegalStateException {
        setAttribute("drawItems", drawItems, false);
    }

    /**
     * Array of DrawItems to initially display in this DrawPane.
     *
     * @return DrawItem...
     */
    public DrawItem[] getDrawItems()  {
        return com.smartgwt.client.util.ConvertTo.arrayOfDrawItem(getAttributeAsJavaScriptObject("drawItems"));
    }
    

    /**
     * Default class used to construct {@link com.smartgwt.client.tools.EditProxy} for this component when editMode is enabled.
     *
     * @param editProxyConstructor  See {@link com.smartgwt.client.docs.SCClassName SCClassName} . Default value is "DrawPaneEditProxy"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setEditProxyConstructor(String editProxyConstructor)  throws IllegalStateException {
        setAttribute("editProxyConstructor", editProxyConstructor, false);
    }

    /**
     * Default class used to construct {@link com.smartgwt.client.tools.EditProxy} for this component when editMode is enabled.
     *
     * @return  See {@link com.smartgwt.client.docs.SCClassName SCClassName} 
     */
    public String getEditProxyConstructor()  {
        return getAttributeAsString("editProxyConstructor");
    }
    

    /**
     * Array of gradients that can be referenced by DrawItems placed on this DrawPane. Each gradient must have an ID assigned
     * to be used for reference.
     *
     * @param gradients  Default value is null
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setGradients(Gradient... gradients)  throws IllegalStateException {
        setAttribute("gradients", gradients, false);
    }

    /**
     * Array of gradients that can be referenced by DrawItems placed on this DrawPane. Each gradient must have an ID assigned
     * to be used for reference.
     *
     * @return Gradient...
     */
    public Gradient[] getGradients()  {
        return com.smartgwt.client.util.ConvertTo.arrayOfGradient(getAttributeAsJavaScriptObject("gradients"));
    }
    

    /**
     * Rotation in degrees for the <code>DrawPane</code> as a whole about the center of the <code>DrawPane</code>. The positive
     * direction corresponds to clockwise rotation (for example, 45 is rotation clockwise by 45 degrees and -10 is rotation
     * counterclockwise by 10 degrees).
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Sets the {@link com.smartgwt.client.widgets.drawing.DrawPane#getRotation rotation} of the <code>DrawPane</code>.
     *
     * @param rotation the new rotation in degrees. The positive direction corresponds to clockwise rotation.. Default value is 0
     * @deprecated  {@link com.smartgwt.client.docs.GwtFloatVsDouble GwtFloatVsDouble}
     */
    public void setRotation(float rotation) {
        setAttribute("rotation", rotation, true);
    }

    /**
     * Rotation in degrees for the <code>DrawPane</code> as a whole about the center of the <code>DrawPane</code>. The positive
     * direction corresponds to clockwise rotation (for example, 45 is rotation clockwise by 45 degrees and -10 is rotation
     * counterclockwise by 10 degrees).
     *
     * @return float
     * @deprecated  {@link com.smartgwt.client.docs.GwtFloatVsDouble GwtFloatVsDouble}
     */
    public float getRotation()  {
        return getAttributeAsFloat("rotation");
    }

    /**
     * Rotation in degrees for the <code>DrawPane</code> as a whole about the center of the <code>DrawPane</code>. The positive
     * direction corresponds to clockwise rotation (for example, 45 is rotation clockwise by 45 degrees and -10 is rotation
     * counterclockwise by 10 degrees).
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Sets the {@link com.smartgwt.client.widgets.drawing.DrawPane#getRotation rotation} of the <code>DrawPane</code>.
     *
     * @param rotation the new rotation in degrees. The positive direction corresponds to clockwise rotation.. Default value is 0
     */
    public void setRotation(double rotation) {
        setAttribute("rotation", rotation, true);
    }

    /**
     * Rotation in degrees for the <code>DrawPane</code> as a whole about the center of the <code>DrawPane</code>. The positive
     * direction corresponds to clockwise rotation (for example, 45 is rotation clockwise by 45 degrees and -10 is rotation
     * counterclockwise by 10 degrees).
     *
     * @return double
     */
    public double getRotationAsDouble()  {
        return getAttributeAsDouble("rotation");
    }
    

    /**
     * Global translation. This array has two numbers. The first number is the X translation amount in pixels and the second
     * number is the Y translation amount in pixels.
     *
     * @param translate  Default value is null
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setTranslate(int[] translate)  throws IllegalStateException {
        setAttribute("translate", translate, false);
    }

    /**
     * Global translation. This array has two numbers. The first number is the X translation amount in pixels and the second
     * number is the Y translation amount in pixels.
     *
     * @return int[]
     */
    public int[] getTranslate()  {
        return com.smartgwt.client.util.ConvertTo.arrayOfint(getAttributeAsJavaScriptObject("translate"));
    }
    

    /**
     * Zoom for the <code>DrawPane</code> as a whole, where 1 is normal size.
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Sets the zoom on this <code>DrawPane</code> to the specified magnification, maintaining the current viewport position.
     *
     * @param zoomLevel Desired zoom level as a float where <code>1.0</code> is equivalent to 100% magnification. Must be greater than 0.. Default value is 1
     * @deprecated  {@link com.smartgwt.client.docs.GwtFloatVsDouble GwtFloatVsDouble}
     */
    public void setZoomLevel(float zoomLevel) {
        setAttribute("zoomLevel", zoomLevel, true);
    }

    /**
     * Zoom for the <code>DrawPane</code> as a whole, where 1 is normal size.
     *
     * @return float
     * @deprecated  {@link com.smartgwt.client.docs.GwtFloatVsDouble GwtFloatVsDouble}
     */
    public float getZoomLevel()  {
        return getAttributeAsFloat("zoomLevel");
    }

    /**
     * Zoom for the <code>DrawPane</code> as a whole, where 1 is normal size.
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Sets the zoom on this <code>DrawPane</code> to the specified magnification, maintaining the current viewport position.
     *
     * @param zoomLevel Desired zoom level as a float where <code>1.0</code> is equivalent to 100% magnification. Must be greater than 0.. Default value is 1
     */
    public void setZoomLevel(double zoomLevel) {
        setAttribute("zoomLevel", zoomLevel, true);
    }

    /**
     * Zoom for the <code>DrawPane</code> as a whole, where 1 is normal size.
     *
     * @return double
     */
    public double getZoomLevelAsDouble()  {
        return getAttributeAsDouble("zoomLevel");
    }
    

    // ********************* Methods ***********************


	/**
     * Add a drawItem to this drawPane (if necessary removing it from any other drawPanes)
     * @param item drawItem to add
     * @param autoDraw If explicitly set to false, and this drawPane is drawn, don't draw   the newly added item
     */
    public native void addDrawItem(DrawItem item, boolean autoDraw) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.addDrawItem(item.@com.smartgwt.client.core.BaseClass::getOrCreateJsObj()(), autoDraw == null ? false : autoDraw);
    }-*/;




	/**
     * Add a new gradient to the drawPane shared gradient list ({@link
     * com.smartgwt.client.widgets.drawing.DrawPane#getGradients gradients}). If the gradient does not have an ID a new one
     * will be assigned.
     * @param gradient gradient to add
     *
     * @return the ID of the gradient (either provided or auto-assigned)
     */
    public native String addGradient(Gradient gradient) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.addGradient(gradient.@com.smartgwt.client.core.DataClass::getJsObj()());
        return ret;
    }-*/;




	/**
     * Creates a linear gradient which can be used by any DrawItem of this DrawPane. Any DrawItem's {@link
     * com.smartgwt.client.widgets.drawing.DrawItem#getFillGradient fillGradient} can reference the gradient by the given ID.
     * @param id the ID of the linear gradient
     * @param linearGradient the linear gradient
     *
     * @return id
     * @deprecated in favor of {@link com.smartgwt.client.widgets.drawing.DrawPane#addGradient DrawPane.addGradient}
     */
    public native String createLinearGradient(String id, LinearGradient linearGradient) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.createLinearGradient(id, linearGradient.@com.smartgwt.client.core.DataClass::getJsObj()());
        return ret;
    }-*/;




	/**
     * Creates a radial gradient which can be used by any DrawItem of this DrawPane. Any DrawItem's {@link
     * com.smartgwt.client.widgets.drawing.DrawItem#getFillGradient fillGradient} can reference the gradient by the given ID.
     * @param id the ID of the radial gradient
     * @param radialGradient the radial gradient
     *
     * @return id
     * @deprecated in favor of {@link com.smartgwt.client.widgets.drawing.DrawPane#addGradient DrawPane.addGradient}
     */
    public native String createRadialGradient(String id, RadialGradient radialGradient) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.createRadialGradient(id, radialGradient.@com.smartgwt.client.core.DataClass::getJsObj()());
        return ret;
    }-*/;




	/**
     * Creates a simple linear gradient which can be used by any DrawItem of this DrawPane. Any DrawItem's {@link
     * com.smartgwt.client.widgets.drawing.DrawItem#getFillGradient fillGradient} can reference the gradient by the given ID.
     * @param id the ID of the simple linear gradient
     * @param simple the simple linear gradient
     *
     * @return id
     * @deprecated in favor of {@link com.smartgwt.client.widgets.drawing.DrawPane#addGradient DrawPane.addGradient}
     */
    public native String createSimpleGradient(String id, SimpleGradient simple) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.createSimpleGradient(id, simple.@com.smartgwt.client.core.DataClass::getJsObj()());
        return ret;
    }-*/;


	/**
     * Permanently {@link com.smartgwt.client.widgets.drawing.DrawItem#destroy destroy} all DrawItems currently associated with
     * this DrawPane, leaving the DrawPane itself intact
     */
    public native void destroyItems() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.destroyItems();
    }-*/;

	/**
     * Call {@link com.smartgwt.client.widgets.drawing.DrawItem#erase DrawItem.erase} on all DrawItems currently associated
     * with the DrawPane.   <P> The DrawItems will continue to exist, and you can call draw() on them to make them appear
     * again, or {@link com.smartgwt.client.widgets.drawing.DrawItem#destroy destroy} to get rid of them permanetly.  Use
     * {@link com.smartgwt.client.widgets.drawing.DrawPane#destroyItems DrawPane.destroyItems} to permanently get rid of all
     * DrawItems.
     */
    public native void erase() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.erase();
    }-*/;

	/**
     * Get a "data:" URL encoding the current contents of the DrawPane as a PNG file. <p> The returned "data:" URLs can be used
     * anywhere a URL to an image is valid, for example, {@link com.smartgwt.client.widgets.Img#getSrc src}. <p> This method
     * will directly return the data URL on modern browsers when using &lt;canvas&gt;-style rendering (the default). <p> On
     * legacy browers (any version of IE in "quirks" mode, all versions of IE prior to 9.0), data URL generation requires a
     * server trip and requires the Smart GWT Server to be installed with the same set of {@link
     * com.smartgwt.client.docs.JavaModuleDependencies required .jars} as are required for PDF export of charts in legacy IE. 
     * The method will return null and a callback must be passed, which fires when the data URL has been retrieved from the
     * server. <p> If the callback is passed but no server trip is required, the callback is fired immediately. <p> For
     * obtaining PNG or other image data for use in server-side processing (such as attaching to automated emails or saving to
     * a database), see also the server-side APIs in com.isomorphic.contentexport.ImageExport.
     *
     * @return the data URL (on modern browsers)
     * @see <a href="http://www.smartclient.com/smartgwtee/showcase/#chart_image_export" target="examples">Chart Image Export Example</a>
     */
    public native String getDataURL() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.getDataURL();
        return ret;
    }-*/;

	/**
     * Get a "data:" URL encoding the current contents of the DrawPane as a PNG file. <p> The returned "data:" URLs can be used
     * anywhere a URL to an image is valid, for example, {@link com.smartgwt.client.widgets.Img#getSrc src}. <p> This method
     * will directly return the data URL on modern browsers when using &lt;canvas&gt;-style rendering (the default). <p> On
     * legacy browers (any version of IE in "quirks" mode, all versions of IE prior to 9.0), data URL generation requires a
     * server trip and requires the Smart GWT Server to be installed with the same set of {@link
     * com.smartgwt.client.docs.JavaModuleDependencies required .jars} as are required for PDF export of charts in legacy IE. 
     * The method will return null and a callback must be passed, which fires when the data URL has been retrieved from the
     * server. <p> If the callback is passed but no server trip is required, the callback is fired immediately. <p> For
     * obtaining PNG or other image data for use in server-side processing (such as attaching to automated emails or saving to
     * a database), see also the server-side APIs in com.isomorphic.contentexport.ImageExport.
     * @param callback callback to fire when data url is available
     *
     * @return the data URL (on modern browsers)
     * @see <a href="http://www.smartclient.com/smartgwtee/showcase/#chart_image_export" target="examples">Chart Image Export Example</a>
     */
    public native String getDataURL(DataURLCallback callback) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.getDataURL(
			$entry( function(dataURL) { 
				if(callback!=null) callback.@com.smartgwt.client.widgets.drawing.DataURLCallback::execute(Ljava/lang/String;)(
					dataURL
				);
			}));
        return ret;
    }-*/;
	


	/**
     * Returns gradient for gradientID.
     * @param gradientID ID of gradient to retrieve
     *
     * @return the gradient or null if not found
     */
    public native Gradient getGradient(String gradientID) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.getGradient(gradientID);
        if(ret == null) return null;
        return @com.smartgwt.client.widgets.drawing.Gradient::getOrCreateRef(Lcom/google/gwt/core/client/JavaScriptObject;)(ret);
    }-*/;


	/**
     * Converts this DrawPane to the source of an <code>&lt;svg&gt;</code> element equivalent to the current drawing. <p> In
     * Pro edition and above, the returned string can be used with {@link com.smartgwt.client.rpc.RPCManager#exportImage
     * RPCManager.exportImage} to download an image, or with server-side APIs in com.isomorphic.contentexport.ImageExport to
     * obtain various kinds of images for further server-side processing.
     *
     * @return the source of an <code>&lt;svg&gt;</code> element.
     * @see <a href="http://www.smartclient.com/smartgwtee/showcase/#chart_image_export" target="examples">Chart Image Export Example</a>
     */
    public native String getSvgString() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.getSvgString();
        return ret;
    }-*/;



	/**
     * Removes gradient for gradientID.
     * @param gradientID ID of gradient to remove
     */
    public native void removeGradient(String gradientID) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.removeGradient(gradientID);
    }-*/;




	/**
     * Synonym of {@link com.smartgwt.client.widgets.drawing.DrawPane#setRotation DrawPane.setRotation}.
     * @param degrees the new rotation in degrees. The positive direction corresponds to clockwise rotation.
     */
    public native void rotate(double degrees) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.rotate(degrees);
    }-*/;




	/**
     * Synonym of {@link com.smartgwt.client.widgets.drawing.DrawPane#setZoomLevel DrawPane.setZoomLevel}.
     * @param zoomLevel Desired zoom level as a float where <code>1.0</code> is equivalent to 100% magnification. Must be greater than 0.
     * @deprecated  {@link com.smartgwt.client.docs.GwtFloatVsDouble GwtFloatVsDouble}
     */
    public native void zoom(float zoomLevel) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.zoom(zoomLevel);
    }-*/;

	/**
     * Synonym of {@link com.smartgwt.client.widgets.drawing.DrawPane#setZoomLevel DrawPane.setZoomLevel}.
     * @param zoomLevel Desired zoom level as a float where <code>1.0</code> is equivalent to 100% magnification. Must be greater than 0.
     */
    public native void zoom(double zoomLevel) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.zoom(zoomLevel);
    }-*/;



    // ********************* Static Methods ***********************


	/**
     * Computes a cubic Be&#769;zier curve polynomial: <code> B(t) = (1 - t)<sup>3</sup>P<sub>1</sub> + 3(1 -
     * t)<sup>2</sup>tCP<sub>1</sub> + 3(1 - t)t<sup>2</sup>CP<sub>2</sub> + t<sup>3</sup>P<sub>2</sub> </code>
     * @param p1 starting point coordinate
     * @param cp1 first control point coordinate
     * @param cp2 second control point coordinate
     * @param p2 end point coordinate
     * @param t the value of the parameter of the curve, between 0 and 1
     *
     * @return the value of the polynomial <code>B(t)</code> at <code>t</code>
     */
    public static native double bezier(double p1, double cp1, double cp2, double p2, double t) /*-{
        var ret = $wnd.isc.DrawPane.bezier(p1, cp1, cp2, p2, t);
        return ret;
    }-*/;




	/**
     * Computes the minimum and maximum value of the cubic Be&#769;zier curve polynomial defined in {@link
     * com.smartgwt.client.widgets.drawing.DrawPane#bezier DrawPane.bezier}, for <code>0 &le; t &le; 1</code>.
     * @param p1 starting point coordinate
     * @param cp1 first control point coordinate
     * @param cp2 second control point coordinate
     * @param p2 end point coordinate
     *
     * @return the minimum and maximum value of the cubic Be&#769;zier curve polynomial
     */
    public static native double[] bezierExtrema(double p1, double cp1, double cp2, double p2) /*-{
        var ret = $wnd.isc.DrawPane.bezierExtrema(p1, cp1, cp2, p2);
        if(ret == null) return null;
        return @com.smartgwt.client.util.ConvertTo::arrayOfdouble(Lcom/google/gwt/core/client/JavaScriptObject;)(ret);
    }-*/;




	/**
     * Calculate the bounding box of the cubic Be&#769;zier curve with endpoints <code>p1</code> and <code>p2</code> and
     * control points <code>cp1</code> and <code>cp2</code>.
     * @param p1 start point of the curve
     * @param cp1 first cubic Be&#769;zier control point
     * @param cp2 second cubic Be&#769;zier control point
     * @param p2 end point of the curve
     *
     * @return the x1, y1, x2, y2 coordinates.  The point <code>(x1, y1)</code> is the top-left point of the bounding box and the point
     * <code>(x2, y2)</code> is the bottom-right point of the bounding box.
     */
    public static native double[] getBezierBoundingBox(Point p1, Point cp1, Point cp2, Point p2) /*-{
        var ret = $wnd.isc.DrawPane.getBezierBoundingBox(p1.@com.smartgwt.client.core.DataClass::getJsObj()(), cp1.@com.smartgwt.client.core.DataClass::getJsObj()(), cp2.@com.smartgwt.client.core.DataClass::getJsObj()(), p2.@com.smartgwt.client.core.DataClass::getJsObj()());
        if(ret == null) return null;
        return @com.smartgwt.client.util.ConvertTo::arrayOfdouble(Lcom/google/gwt/core/client/JavaScriptObject;)(ret);
    }-*/;




	/**
     * Computes an array of Points for a polygon that has an equal distance from its center to any of its vertices and that
     * fits in the given width and height.
     * @param width width of target space
     * @param height height of target space
     * @param xc center point x
     * @param yc center point y
     * @param angles the complete list of angles (in radians) with respect to the center point at which the polygon must have vertices
     *
     * @return list of the vertices of the polygon
     */
    public static native Point[] getPolygonPoints(int width, int height, int xc, int yc, double[] angles) /*-{
        var ret = $wnd.isc.DrawPane.getPolygonPoints(width, height, xc, yc, @com.smartgwt.client.util.JSOHelper::convertToJavaScriptArray([D)(angles));
        if(ret == null) return null;
        return @com.smartgwt.client.util.ConvertTo::arrayOfPoint(Lcom/google/gwt/core/client/JavaScriptObject;)(ret);
    }-*/;




	/**
     * Calls {@link com.smartgwt.client.widgets.drawing.DrawPane#getPolygonPoints DrawPane.getPolygonPoints} with angles spread
     * evenly over the full 360 degrees.
     * @param n the number of vertices the polygon
     * @param width width of target space
     * @param height height of target space
     * @param xc center point x
     * @param yc center point y
     * @param startAngle the angle (in radians) with respect to the center point of the first vertex of the polygon
     *
     * @return list of the vertices of the regular polygon
     */
    public static native Point[] getRegularPolygonPoints(int n, int width, int height, int xc, int yc, double startAngle) /*-{
        var ret = $wnd.isc.DrawPane.getRegularPolygonPoints(n, width, height, xc, yc, startAngle);
        if(ret == null) return null;
        return @com.smartgwt.client.util.ConvertTo::arrayOfPoint(Lcom/google/gwt/core/client/JavaScriptObject;)(ret);
    }-*/;




	/**
     * Computes the top-, left-, bottom-, and right-most coordinates in a list of points, then translates and scales all points
     * to fit the entire shape into the given width and height.
     * @param width width of target space
     * @param height height of target space
     * @param xc center point x
     * @param yc center point y
     * @param points list of points to scale and translate
     */
    public static native void scaleAndCenter(int width, int height, int xc, int yc, Point... points) /*-{
        $wnd.isc.DrawPane.scaleAndCenter(width, height, xc, yc, @com.smartgwt.client.util.JSOHelper::convertToJavaScriptArray([Ljava/lang/Object;)(points));
    }-*/;




	/**
     * Computes the top-, left-, bottom-, and right-most coordinates containing the Be&#769;zier curve defined by
     * <code>startPoint</code>, <code>controlPoint1</code>, <code>controlPoint2</code>, and <code>endPoint</code>, then
     * translates and scales these four points to fit the entire curve into the given width and height.
     * @param width width of target space
     * @param height height of target space
     * @param xc center point x
     * @param yc center point y
     * @param startPoint start point of the curve
     * @param endPoint end point of the curve
     * @param controlPoint1 first cubic Be&#769;zier control point
     * @param controlPoint2 second cubic Be&#769;zier control point
     */
    public static native void scaleAndCenterBezier(int width, int height, int xc, int yc, Point startPoint, Point endPoint, Point controlPoint1, Point controlPoint2) /*-{
        $wnd.isc.DrawPane.scaleAndCenterBezier(width, height, xc, yc, startPoint.@com.smartgwt.client.core.DataClass::getJsObj()(), endPoint.@com.smartgwt.client.core.DataClass::getJsObj()(), controlPoint1.@com.smartgwt.client.core.DataClass::getJsObj()(), controlPoint2.@com.smartgwt.client.core.DataClass::getJsObj()());
    }-*/;



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
     * @param drawPaneProperties properties that should be used as new defaults when instances of this class are created
     */
    public static native void setDefaultProperties(DrawPane drawPaneProperties) /*-{
    	var properties = $wnd.isc.addProperties({},drawPaneProperties.@com.smartgwt.client.widgets.BaseWidget::getConfig()());
        @com.smartgwt.client.util.JSOHelper::cleanProperties(Lcom/google/gwt/core/client/JavaScriptObject;Z)(properties,false);
        $wnd.isc.DrawPane.addProperties(properties);
    }-*/;

    // ***********************************************************



    /**
     * Retrieves printable HTML for this component and all printable subcomponents.
     * <p>
     * By default any Canvas with children will simply collect the printable HTML of its
     * children by calling getPrintHTML() on each child that is considered
     * {@link com.smartgwt.client.widgets.Canvas#getShouldPrint printable}.
     * <p>
     * If overriding this method for a custom component, you should <b>either</b> return a String of
     * printable HTML string directly <b>or</b> return null, and fire the callback (if provided).
     * <p>
     * To return an empty print representation, return an empty string ("") rather than null.
     * <p>
     * The <code>printProperties</code> argument, if passed, must be passed to any subcomponents on
     * which <code>getPrintHTML()</code> is called.
     * <p>
     * <b>Notes on printing</b>
     * <p>
     * To print a <code>DrawPane</code> for export on IE8 and earlier, it is 
     * {@link com.smartgwt.client.util.PrintProperties} with {@link com.smartgwt.client.util.PrintProperties#getPrintForExport
     * printForExport}:true:
     * <pre>
     * final PrintProperties pp = new PrintProperties();
     * pp.setPrintForExport(true);
     * final String exportHTML = drawPane.getPrintHTML(pp, null);
     * </pre>
     * <p>
     * <b>Note: this is an override point.</b>
     * @param printProperties properties to configure printing behavior - may be null.
     * @param callback optional callback to fire. Generated HTML should be passed to the
     * {@link com.smartgwt.client.util.PrintHTMLCallback#setHTML(String)} method of the callback.
     * @see com.smartgwt.client.docs.Printing Printing overview and related methods
     */
    public String getPrintHTML(PrintProperties printProperties, PrintHTMLCallback callback) {
        return super.getPrintHTML(printProperties, callback);
    }

    private static boolean instanceofDrawItem(Object obj) {
        return (obj instanceof DrawItem);
    }

    static native <T extends DrawItem> T createDrawItem(String smartClientClassName, JavaScriptObject javaScriptObject) /*-{
        var drawItem = @com.smartgwt.client.util.ObjectFactory::createBaseClass(Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;Z)(smartClientClassName, javaScriptObject, false);
        if (@com.smartgwt.client.widgets.drawing.DrawPane::instanceofDrawItem(Ljava/lang/Object;)(drawItem)) {
            return drawItem;
        } else {
            return null;
        }
    }-*/;

    public LogicalStructureObject setLogicalStructure(DrawPaneLogicalStructure s) {
        super.setLogicalStructure(s);
        try {
            s.canDragScroll = getAttributeAsString("canDragScroll");
        } catch (Throwable t) {
            s.logicalStructureErrors += "DrawPane.canDragScroll:" + t.getMessage() + "\n";
        }
        try {
            s.drawingHeight = getAttributeAsString("drawingHeight");
        } catch (Throwable t) {
            s.logicalStructureErrors += "DrawPane.drawingHeight:" + t.getMessage() + "\n";
        }
        try {
            s.drawingWidth = getAttributeAsString("drawingWidth");
        } catch (Throwable t) {
            s.logicalStructureErrors += "DrawPane.drawingWidth:" + t.getMessage() + "\n";
        }
        try {
            s.drawItems = getDrawItems();
        } catch (Throwable t) {
            s.logicalStructureErrors += "DrawPane.drawItemsArray:" + t.getMessage() + "\n";
        }
        try {
            s.editProxyConstructor = getAttributeAsString("editProxyConstructor");
        } catch (Throwable t) {
            s.logicalStructureErrors += "DrawPane.editProxyConstructor:" + t.getMessage() + "\n";
        }
        try {
            s.gradients = getGradients();
        } catch (Throwable t) {
            s.logicalStructureErrors += "DrawPane.gradientsArray:" + t.getMessage() + "\n";
        }
        try {
            s.translate = getAttributeAsStringArray("translate");
        } catch (Throwable t) {
            s.logicalStructureErrors += "DrawPane.translateArray:" + t.getMessage() + "\n";
        }
        return s;
    }

    public LogicalStructureObject getLogicalStructure() {
        DrawPaneLogicalStructure s = new DrawPaneLogicalStructure();
        setLogicalStructure(s);
        return s;
    }
}


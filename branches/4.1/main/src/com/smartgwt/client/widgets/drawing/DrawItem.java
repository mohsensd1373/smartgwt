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

/**
 * Base class for graphical elements drawn in a DrawPane.  All properties and methods documented here are available on all
 * DrawItems unless otherwise specified.   <P> Note that DrawItems as such should never be created, only concrete
 * subclasses such as {@link com.smartgwt.client.widgets.drawing.DrawGroup} and {@link
 * com.smartgwt.client.widgets.drawing.DrawLine}. <P> See {@link com.smartgwt.client.widgets.drawing.DrawPane} for the
 * different approaches to create DrawItems.
 */
@BeanFactory.FrameworkClass
@BeanFactory.ScClassName("DrawItem")
public class DrawItem extends BaseClass implements com.smartgwt.client.widgets.drawing.events.HasClickHandlers, com.smartgwt.client.widgets.drawing.events.HasMouseDownHandlers, com.smartgwt.client.widgets.drawing.events.HasMouseMoveHandlers, com.smartgwt.client.widgets.drawing.events.HasMouseOutHandlers, com.smartgwt.client.widgets.drawing.events.HasMouseOverHandlers, com.smartgwt.client.widgets.drawing.events.HasMouseUpHandlers, com.smartgwt.client.widgets.drawing.events.HasMovedHandlers, com.smartgwt.client.widgets.drawing.events.HasDragMoveHandlers, com.smartgwt.client.widgets.drawing.events.HasDragResizeMoveHandlers, com.smartgwt.client.widgets.drawing.events.HasDragStartHandlers, com.smartgwt.client.widgets.drawing.events.HasDragStopHandlers, com.smartgwt.client.widgets.drawing.events.HasResizedHandlers, com.smartgwt.client.widgets.drawing.events.HasShowContextMenuHandlers {

    public static DrawItem getOrCreateRef(JavaScriptObject jsObj) {
        if(jsObj == null) return null;
        BaseClass obj = BaseClass.getRef(jsObj);
        if(obj != null) {
            return (DrawItem) obj;
        } else {
            return new DrawItem(jsObj);
        }
    }


    public DrawItem(){
        scClassName = "DrawItem";
    }

    public DrawItem(JavaScriptObject jsObj){
        scClassName = "DrawItem";
        setJavaScriptObject(jsObj);
    }

    public native JavaScriptObject create()/*-{
        var config = this.@com.smartgwt.client.core.BaseClass::getConfig()();
        var scClassName = this.@com.smartgwt.client.core.BaseClass::scClassName;
        return $wnd.isc[scClassName].create(config);
    }-*/;

    // ********************* Properties / Attributes ***********************

    /**
     * Is this DrawItem draggable? If true, then the DrawItem can be drag-repositioned by the user.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param canDrag  Default value is false
     */
    public void setCanDrag(Boolean canDrag) {
        setAttribute("canDrag", canDrag, true);
    }

    /**
     * Is this DrawItem draggable? If true, then the DrawItem can be drag-repositioned by the user.
     *
     * @return Boolean
     */
    public Boolean getCanDrag()  {
        return getAttributeAsBoolean("canDrag");
    }

    /**
     * Will this DrawItem fire hover events when the user hovers over it?
     *
     * @param canHover  Default value is null
     * @see com.smartgwt.client.widgets.drawing.DrawItem#setShowHover
     */
    public void setCanHover(Boolean canHover) {
        setAttribute("canHover", canHover, true);
    }

    /**
     * Will this DrawItem fire hover events when the user hovers over it?
     *
     * @return Boolean
     * @see com.smartgwt.client.widgets.drawing.DrawItem#getShowHover
     */
    public Boolean getCanHover()  {
        return getAttributeAsBoolean("canHover");
    }

    /**
     * Context menu to show for this object, an instance of the Menu widget. <P> Note: if {@link
     * com.smartgwt.client.widgets.Canvas#destroy Canvas.destroy} is called on a canvas, any specified context menu is not
     * automatically destroyed as well. This is in contrast to {@link com.smartgwt.client.widgets.menu.MenuButton}s which
     * automatically destroy their specified {@link com.smartgwt.client.widgets.menu.MenuButton#getMenu menu} by default. The
     * behavior is intentional as context menus are commonly reused across components.
     *
     * @param contextMenu  Default value is null
     * @see com.smartgwt.client.widgets.events.ShowContextMenuEvent
     * @see com.smartgwt.client.docs.Cues Cues overview and related methods
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#basics_interaction_contextmenu" target="examples">Context menus Example</a>
     */
    public void setContextMenu(Menu contextMenu) {
        setAttribute("contextMenu", contextMenu == null ? null : contextMenu.getOrCreateJsObj(), true);
    }

    /**
     * Context menu to show for this object, an instance of the Menu widget. <P> Note: if {@link
     * com.smartgwt.client.widgets.Canvas#destroy Canvas.destroy} is called on a canvas, any specified context menu is not
     * automatically destroyed as well. This is in contrast to {@link com.smartgwt.client.widgets.menu.MenuButton}s which
     * automatically destroy their specified {@link com.smartgwt.client.widgets.menu.MenuButton#getMenu menu} by default. The
     * behavior is intentional as context menus are commonly reused across components.
     *
     * @return Menu
     * @see com.smartgwt.client.widgets.events.ShowContextMenuEvent
     * @see com.smartgwt.client.docs.Cues Cues overview and related methods
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#basics_interaction_contextmenu" target="examples">Context menus Example</a>
     */
    public Menu getContextMenu()  {
        return (Menu)Menu.getByJSObject(getAttributeAsJavaScriptObject("contextMenu"));
    }

    /**
     * If set, specifies the cursor to display when the mouse pointer is over this DrawItem.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param cursor  Default value is null
     */
    public void setCursor(Cursor cursor) {
        setAttribute("cursor", cursor == null ? null : cursor.getValue(), true);
    }

    /**
     * If set, specifies the cursor to display when the mouse pointer is over this DrawItem.
     *
     * @return Cursor
     */
    public Cursor getCursor()  {
        return EnumUtil.getEnum(Cursor.values(), getAttribute("cursor"));
    }

    /**
     * Flag indicating a drawItem has been destroyed, similar to {@link com.smartgwt.client.widgets.Canvas#getDestroyed
     * destroyed}.
     * <p>
     * <b>Note :</b> This method should be called only after the underlying component has been created.
     *
     * @return Boolean
     * @throws IllegalStateException if the underlying component has not yet been created.
     */
    public Boolean getDestroyed() throws IllegalStateException {
        errorIfNotCreated("destroyed");
        return getAttributeAsBoolean("destroyed");
    }

    /**
     * Flag indicating a drawItem is mid-destruction, similar to {@link com.smartgwt.client.widgets.Canvas#getDestroying
     * destroying}.
     * <p>
     * <b>Note :</b> This method should be called only after the underlying component has been created.
     *
     * @return Boolean
     * @throws IllegalStateException if the underlying component has not yet been created.
     */
    public Boolean getDestroying() throws IllegalStateException {
        errorIfNotCreated("destroying");
        return getAttributeAsBoolean("destroying");
    }

    /**
     * Number of pixels the cursor needs to move before the EventHandler starts a drag operation.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param dragStartDistance  Default value is 5
     * @see com.smartgwt.client.docs.Dragdrop Dragdrop overview and related methods
     */
    public void setDragStartDistance(int dragStartDistance) {
        setAttribute("dragStartDistance", dragStartDistance, true);
    }

    /**
     * Number of pixels the cursor needs to move before the EventHandler starts a drag operation.
     *
     * @return int
     * @see com.smartgwt.client.docs.Dragdrop Dragdrop overview and related methods
     */
    public int getDragStartDistance()  {
        return getAttributeAsInt("dragStartDistance");
    }

    /**
     * {@link com.smartgwt.client.widgets.drawing.DrawGroup} this drawItem is a member of.
     *
     * @param drawGroup  Default value is null
     * @throws IllegalStateException this property cannot be changed after the underlying component has been created
     */
    public void setDrawGroup(DrawGroup drawGroup)  throws IllegalStateException {
        setAttribute("drawGroup", drawGroup == null ? null : drawGroup.getOrCreateJsObj(), false);
    }

    /**
     * {@link com.smartgwt.client.widgets.drawing.DrawGroup} this drawItem is a member of.
     *
     * @return DrawGroup
     */
    public DrawGroup getDrawGroup()  {
        return DrawGroup.getOrCreateRef(getAttributeAsJavaScriptObject("drawGroup"));
    }

    /**
     * {@link com.smartgwt.client.widgets.drawing.DrawPane} this drawItem should draw in. <P> If this item has a {@link
     * com.smartgwt.client.widgets.drawing.DrawGroup}, the drawGroup's drawPane is automatically used.
     *
     * @param drawPane  Default value is null
     * @throws IllegalStateException this property cannot be changed after the underlying component has been created
     */
    public void setDrawPane(DrawPane drawPane)  throws IllegalStateException {
        setAttribute("drawPane", drawPane == null ? null : drawPane.getOrCreateJsObj(), false);
    }

    /**
     * {@link com.smartgwt.client.widgets.drawing.DrawPane} this drawItem should draw in. <P> If this item has a {@link
     * com.smartgwt.client.widgets.drawing.DrawGroup}, the drawGroup's drawPane is automatically used.
     *
     * @return DrawPane
     */
    public DrawPane getDrawPane()  {
        return (DrawPane)DrawPane.getByJSObject(getAttributeAsJavaScriptObject("drawPane"));
    }

    /**
     * Style of arrowhead to draw at the end of the line or path.
     *
     * <p>If this method is called after the component has been drawn/initialized:
     * Set the arrowhead at the end of this path. <p> <b>NOTE:</b> Not all DrawItem classes support arrowheads. You can use {@link com.smartgwt.client.widgets.drawing.DrawItem#supportsEndArrow DrawItem.supportsEndArrow} to dynamically check whether a DrawItem instance supports this method.
     *
     * @param endArrow style of arrow to use. Default value is null
     */
    public void setEndArrow(ArrowStyle endArrow) {
        setAttribute("endArrow", endArrow == null ? null : endArrow.getValue(), true);
    }

    /**
     * Style of arrowhead to draw at the end of the line or path.
     *
     * @return ArrowStyle
     */
    public ArrowStyle getEndArrow()  {
        return EnumUtil.getEnum(ArrowStyle.values(), getAttribute("endArrow"));
    }

    /**
     * Fill color to use for shapes.  The default of 'null' is transparent.
     *
     * <p>If this method is called after the component has been drawn/initialized:
     * Update fillColor for this drawItem.
     *
     * @param fillColor new fillColor to use.  Pass null for transparent. See {@link com.smartgwt.client.docs.CSSColor CSSColor} . Default value is null
     */
    public void setFillColor(String fillColor) {
        setAttribute("fillColor", fillColor, true);
    }

    /**
     * Fill color to use for shapes.  The default of 'null' is transparent.
     *
     * @return  See {@link com.smartgwt.client.docs.CSSColor CSSColor} 
     */
    public String getFillColor()  {
        return getAttributeAsString("fillColor");
    }

    /**
     * Fill gradient to use for shapes.  If a string it uses the gradient identifier parameter provided in  {@link
     * com.smartgwt.client.widgets.drawing.DrawPane#addGradient DrawPane.addGradient}. Otherwise it expects one of {@link
     * com.smartgwt.client.widgets.drawing.SimpleGradient SimpleGradient}, {@link
     * com.smartgwt.client.widgets.drawing.LinearGradient LinearGradient} or {@link
     * com.smartgwt.client.widgets.drawing.RadialGradient RadialGradient}.
     *
     * <p>If this method is called after the component has been drawn/initialized:
     * Update fillGradient for this drawItem.
     *
     * @param fillGradient new gradient to use.  Pass null for transparent.. Default value is null
     * @see com.smartgwt.client.widgets.drawing.Gradient
     */
    public void setFillGradient(Gradient fillGradient) {
        setAttribute("fillGradient", fillGradient.getJsObj(), true);
    }

    /**
     * Fill gradient to use for shapes.  If a string it uses the gradient identifier parameter provided in  {@link
     * com.smartgwt.client.widgets.drawing.DrawPane#addGradient DrawPane.addGradient}. Otherwise it expects one of {@link
     * com.smartgwt.client.widgets.drawing.SimpleGradient SimpleGradient}, {@link
     * com.smartgwt.client.widgets.drawing.LinearGradient LinearGradient} or {@link
     * com.smartgwt.client.widgets.drawing.RadialGradient RadialGradient}.
     *
     * @return Gradient
     * @see com.smartgwt.client.widgets.drawing.Gradient
     */
    public Gradient getFillGradient()  {
        return new Gradient(getAttributeAsJavaScriptObject("fillGradient"));
    }

    /**
     * Fill gradient to use for shapes.  If a string it uses the gradient identifier parameter provided in  {@link
     * com.smartgwt.client.widgets.drawing.DrawPane#addGradient DrawPane.addGradient}. Otherwise it expects one of {@link
     * com.smartgwt.client.widgets.drawing.SimpleGradient SimpleGradient}, {@link
     * com.smartgwt.client.widgets.drawing.LinearGradient LinearGradient} or {@link
     * com.smartgwt.client.widgets.drawing.RadialGradient RadialGradient}.
     *
     * <p>If this method is called after the component has been drawn/initialized:
     * Update fillGradient for this drawItem.
     *
     * @param fillGradient new gradient to use.  Pass null for transparent.. Default value is null
     * @see com.smartgwt.client.widgets.drawing.Gradient
     */
    public void setFillGradient(String fillGradient) {
        setAttribute("fillGradient", fillGradient, true);
    }

    /**
     * Fill gradient to use for shapes.  If a string it uses the gradient identifier parameter provided in  {@link
     * com.smartgwt.client.widgets.drawing.DrawPane#addGradient DrawPane.addGradient}. Otherwise it expects one of {@link
     * com.smartgwt.client.widgets.drawing.SimpleGradient SimpleGradient}, {@link
     * com.smartgwt.client.widgets.drawing.LinearGradient LinearGradient} or {@link
     * com.smartgwt.client.widgets.drawing.RadialGradient RadialGradient}.
     *
     * @return String
     * @see com.smartgwt.client.widgets.drawing.Gradient
     */
    public String getFillGradientAsString()  {
        return getAttributeAsString("fillGradient");
    }

    /**
     * Opacity of the fillColor, as a number between 0 (transparent) and 1 (opaque).
     *
     * <p>If this method is called after the component has been drawn/initialized:
     * Update fillOpacity for this drawItem.
     *
     * @param fillOpacity new opacity, as a number between 0 (transparent) and 1 (opaque).. Default value is 1.0
     */
    public void setFillOpacity(float fillOpacity) {
        setAttribute("fillOpacity", fillOpacity, true);
    }

    /**
     * Opacity of the fillColor, as a number between 0 (transparent) and 1 (opaque).
     *
     * @return float
     */
    public float getFillOpacity()  {
        return getAttributeAsFloat("fillOpacity");
    }

    /**
     * Constrains drag-resizing and drag-repositioning of this draw item to either the current visible area of the {@link
     * com.smartgwt.client.widgets.drawing.DrawPane draw pane} or an arbitrary bounding box (if set to an array of the form
     * <code>[left, top, left + width, top + height]</code>).  When using a bounding box-type argument the left/top values can
     * be negative, or the width/height values can be greater than the dimensions of the viewable area, to allow positioning or
     * resizing the draw item beyond the confines of the draw pane. <P> Note:  keepInParentRect affects only user drag
     * interactions, not programmatic moves or resizes.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param keepInParentRect  Default value is null
     */
    public void setKeepInParentRect(Boolean keepInParentRect) {
        setAttribute("keepInParentRect", keepInParentRect, true);
    }

    /**
     * Constrains drag-resizing and drag-repositioning of this draw item to either the current visible area of the {@link
     * com.smartgwt.client.widgets.drawing.DrawPane draw pane} or an arbitrary bounding box (if set to an array of the form
     * <code>[left, top, left + width, top + height]</code>).  When using a bounding box-type argument the left/top values can
     * be negative, or the width/height values can be greater than the dimensions of the viewable area, to allow positioning or
     * resizing the draw item beyond the confines of the draw pane. <P> Note:  keepInParentRect affects only user drag
     * interactions, not programmatic moves or resizes.
     *
     * @return Boolean
     */
    public Boolean getKeepInParentRect()  {
        return getAttributeAsBoolean("keepInParentRect");
    }

    /**
     * Constrains drag-resizing and drag-repositioning of this draw item to either the current visible area of the {@link
     * com.smartgwt.client.widgets.drawing.DrawPane draw pane} or an arbitrary bounding box (if set to an array of the form
     * <code>[left, top, left + width, top + height]</code>).  When using a bounding box-type argument the left/top values can
     * be negative, or the width/height values can be greater than the dimensions of the viewable area, to allow positioning or
     * resizing the draw item beyond the confines of the draw pane. <P> Note:  keepInParentRect affects only user drag
     * interactions, not programmatic moves or resizes.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param keepInParentRect  Default value is null
     */
    public void setKeepInParentRect(float... keepInParentRect) {
        setAttribute("keepInParentRect", keepInParentRect, true);
    }

    /**
     * Array of control knobs to display for this item. Each {@link com.smartgwt.client.types.KnobType} specified in this will
     * turn on UI element(s) allowing the user to manipulate this drawItem.  To update the set of knobs at runtime use {@link
     * com.smartgwt.client.widgets.drawing.DrawItem#showKnobs DrawItem.showKnobs} and {@link
     * com.smartgwt.client.widgets.drawing.DrawItem#hideKnobs DrawItem.hideKnobs}. <p> <b>NOTE:</b> Unless otherwise
     * documented, DrawItem types only support  {@link com.smartgwt.client.types.KnobType#RESIZE} and {@link
     * com.smartgwt.client.types.KnobType#MOVE} knobs.
     *
     * @param knobs  Default value is null
     * @throws IllegalStateException this property cannot be changed after the underlying component has been created
     * 
     */
    public void setKnobs(KnobType... knobs)  throws IllegalStateException {
        setAttribute("knobs", knobs, false);
    }

    /**
     * Array of control knobs to display for this item. Each {@link com.smartgwt.client.types.KnobType} specified in this will
     * turn on UI element(s) allowing the user to manipulate this drawItem.  To update the set of knobs at runtime use {@link
     * com.smartgwt.client.widgets.drawing.DrawItem#showKnobs DrawItem.showKnobs} and {@link
     * com.smartgwt.client.widgets.drawing.DrawItem#hideKnobs DrawItem.hideKnobs}. <p> <b>NOTE:</b> Unless otherwise
     * documented, DrawItem types only support  {@link com.smartgwt.client.types.KnobType#RESIZE} and {@link
     * com.smartgwt.client.types.KnobType#MOVE} knobs.
     *
     * @return KnobType...
     * 
     */
    public KnobType[] getKnobs()  {
        final String[] strings = getAttributeAsStringArray("knobs");
        return EnumUtil.getEnums(KnobType.values(), strings, strings == null ? null : new KnobType[strings.length]);
    }

    /**
     * Style of drawing the endpoints of a line. <P> Note that for dashed and dotted lines, the lineCap style affects each dash
     * or dot.
     *
     * <p>If this method is called after the component has been drawn/initialized:
     * Update lineCap for this drawItem.
     *
     * @param lineCap new lineCap to use. Default value is "round"
     */
    public void setLineCap(LineCap lineCap) {
        setAttribute("lineCap", lineCap == null ? null : lineCap.getValue(), true);
    }

    /**
     * Style of drawing the endpoints of a line. <P> Note that for dashed and dotted lines, the lineCap style affects each dash
     * or dot.
     *
     * @return LineCap
     */
    public LineCap getLineCap()  {
        return EnumUtil.getEnum(LineCap.values(), getAttribute("lineCap"));
    }

    /**
     * Line color
     *
     * <p>If this method is called after the component has been drawn/initialized:
     * Update lineColor for this drawItem.
     *
     * @param lineColor new line color.  Pass null for transparent. See {@link com.smartgwt.client.docs.CSSColor CSSColor} . Default value is "#808080"
     */
    public void setLineColor(String lineColor) {
        setAttribute("lineColor", lineColor, true);
    }

    /**
     * Line color
     *
     * @return  See {@link com.smartgwt.client.docs.CSSColor CSSColor} 
     */
    public String getLineColor()  {
        return getAttributeAsString("lineColor");
    }

    /**
     * Opacity for lines, as a number between 0 (transparent) and 1 (opaque).
     *
     * <p>If this method is called after the component has been drawn/initialized:
     * Update lineOpacity for this drawItem.
     *
     * @param lineOpacity new opacity, as a number between 0 (transparent) and 1 (opaque).. Default value is 1.0
     */
    public void setLineOpacity(float lineOpacity) {
        setAttribute("lineOpacity", lineOpacity, true);
    }

    /**
     * Opacity for lines, as a number between 0 (transparent) and 1 (opaque).
     *
     * @return float
     */
    public float getLineOpacity()  {
        return getAttributeAsFloat("lineOpacity");
    }

    /**
     * Pattern for lines, eg "solid" or "dash"
     *
     * <p>If this method is called after the component has been drawn/initialized:
     * Update linePattern for this drawItem.
     *
     * @param linePattern new linePattern to use. Default value is "solid"
     */
    public void setLinePattern(LinePattern linePattern) {
        setAttribute("linePattern", linePattern == null ? null : linePattern.getValue(), true);
    }

    /**
     * Pattern for lines, eg "solid" or "dash"
     *
     * @return LinePattern
     */
    public LinePattern getLinePattern()  {
        return EnumUtil.getEnum(LinePattern.values(), getAttribute("linePattern"));
    }

    /**
     * Pixel width for lines.
     *
     * <p>If this method is called after the component has been drawn/initialized:
     * Update lineWidth for this drawItem.
     *
     * @param lineWidth new pixel lineWidth. Default value is 3
     */
    public void setLineWidth(int lineWidth) {
        setAttribute("lineWidth", lineWidth, true);
    }

    /**
     * Pixel width for lines.
     *
     * @return int
     */
    public int getLineWidth()  {
        return getAttributeAsInt("lineWidth");
    }

    /**
     * If this item is showing a <code>"move"</code> {@link com.smartgwt.client.widgets.drawing.DrawItem#getKnobs control
     * knob}, this attribute allows you to specify an offset in pixels from the {@link
     * com.smartgwt.client.widgets.drawing.DrawItem#getMoveKnobPoint moveKnobPoint} for the move knob. Offset should be
     * specified as a 2-element array of [left offset, top offset].
     *
     * <p>If this method is called after the component has been drawn/initialized:
     * Setter for {@link com.smartgwt.client.widgets.drawing.DrawItem#getMoveKnobOffset moveKnobOffset}.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param moveKnobOffset the new move knob offset. This is a 2-element array of [left offset, top offset]. If null, then  <code>new int[] {0,
     * 0}</code> is assumed.. Default value is [0,0]
     * @see com.smartgwt.client.widgets.drawing.DrawItem#setMoveKnobPoint
     */
    public void setMoveKnobOffset(int[] moveKnobOffset) {
        setAttribute("moveKnobOffset", moveKnobOffset, true);
    }

    /**
     * If this item is showing a <code>"move"</code> {@link com.smartgwt.client.widgets.drawing.DrawItem#getKnobs control
     * knob}, this attribute allows you to specify an offset in pixels from the {@link
     * com.smartgwt.client.widgets.drawing.DrawItem#getMoveKnobPoint moveKnobPoint} for the move knob. Offset should be
     * specified as a 2-element array of [left offset, top offset].
     *
     * @return int[]
     * @see com.smartgwt.client.widgets.drawing.DrawItem#getMoveKnobPoint
     */
    public int[] getMoveKnobOffset()  {
        return com.smartgwt.client.util.ConvertTo.arrayOfint(getAttributeAsJavaScriptObject("moveKnobOffset"));
    }

    /**
     * If this item is showing a  {@link com.smartgwt.client.types.KnobType#MOVE} {@link
     * com.smartgwt.client.widgets.drawing.DrawItem#getKnobs control knob}, this attribute specifies where the knob should
     * appear with respect to the draw item.
     *
     * @param moveKnobPoint  Default value is "TL"
     * @throws IllegalStateException this property cannot be changed after the underlying component has been created
     * @see com.smartgwt.client.widgets.drawing.DrawItem#setMoveKnobOffset
     */
    public void setMoveKnobPoint(MoveKnobPoint moveKnobPoint)  throws IllegalStateException {
        setAttribute("moveKnobPoint", moveKnobPoint == null ? null : moveKnobPoint.getValue(), false);
    }

    /**
     * If this item is showing a  {@link com.smartgwt.client.types.KnobType#MOVE} {@link
     * com.smartgwt.client.widgets.drawing.DrawItem#getKnobs control knob}, this attribute specifies where the knob should
     * appear with respect to the draw item.
     *
     * @return MoveKnobPoint
     * @see com.smartgwt.client.widgets.drawing.DrawItem#getMoveKnobOffset
     */
    public MoveKnobPoint getMoveKnobPoint()  {
        return EnumUtil.getEnum(MoveKnobPoint.values(), getAttribute("moveKnobPoint"));
    }

    /**
     * Default {@link com.smartgwt.client.widgets.drawing.DrawItem#getHoverHTML hover HTML} that is displayed in the global
     * hover canvas if the user hovers over this DrawItem and {@link com.smartgwt.client.widgets.drawing.DrawItem#getShowHover
     * showHover} is true.
     *
     * @param prompt  See {@link com.smartgwt.client.docs.HTMLString HTMLString} . Default value is null
     */
    public void setPrompt(String prompt) {
        setAttribute("prompt", prompt, true);
    }

    /**
     * Default {@link com.smartgwt.client.widgets.drawing.DrawItem#getHoverHTML hover HTML} that is displayed in the global
     * hover canvas if the user hovers over this DrawItem and {@link com.smartgwt.client.widgets.drawing.DrawItem#getShowHover
     * showHover} is true.
     *
     * @return  See {@link com.smartgwt.client.docs.HTMLString HTMLString} 
     */
    public String getPrompt()  {
        return getAttributeAsString("prompt");
    }

    /**
     * If this item is showing  {@link com.smartgwt.client.types.KnobType#RESIZE} {@link
     * com.smartgwt.client.widgets.drawing.DrawItem#getKnobs control knobs}, this attribute specifies the points with respect
     * to the draw item where resize knobs should appear.
     *
     * @param resizeKnobPoints  Default value is ["TL","TR","BL","BR"]
     * @throws IllegalStateException this property cannot be changed after the underlying component has been created
     */
    public void setResizeKnobPoints(ResizeKnobPoint... resizeKnobPoints)  throws IllegalStateException {
        setAttribute("resizeKnobPoints", resizeKnobPoints, false);
    }

    /**
     * If this item is showing  {@link com.smartgwt.client.types.KnobType#RESIZE} {@link
     * com.smartgwt.client.widgets.drawing.DrawItem#getKnobs control knobs}, this attribute specifies the points with respect
     * to the draw item where resize knobs should appear.
     *
     * @return ResizeKnobPoint...
     */
    public ResizeKnobPoint[] getResizeKnobPoints()  {
        final String[] strings = getAttributeAsStringArray("resizeKnobPoints");
        return EnumUtil.getEnums(ResizeKnobPoint.values(), strings, strings == null ? null : new ResizeKnobPoint[strings.length]);
    }

    /**
     * Rotation in degrees about the center of the {@link com.smartgwt.client.widgets.drawing.DrawItem#getBoundingBox bounding
     * box}. The positive direction is clockwise.
     *
     * @param rotation  Default value is 0.0
     * @throws IllegalStateException this property cannot be changed after the underlying component has been created
     * @deprecated  {@link com.smartgwt.client.docs.GwtFloatVsDouble GwtFloatVsDouble}
     */
    public void setRotation(float rotation)  throws IllegalStateException {
        setAttribute("rotation", rotation, false);
    }

    /**
     * Rotation in degrees about the center of the {@link com.smartgwt.client.widgets.drawing.DrawItem#getBoundingBox bounding
     * box}. The positive direction is clockwise.
     *
     * @return float
     * @deprecated  {@link com.smartgwt.client.docs.GwtFloatVsDouble GwtFloatVsDouble}
     */
    public float getRotation()  {
        return getAttributeAsFloat("rotation");
    }

    /**
     * Rotation in degrees about the center of the {@link com.smartgwt.client.widgets.drawing.DrawItem#getBoundingBox bounding
     * box}. The positive direction is clockwise.
     *
     * @param rotation  Default value is 0.0
     * @throws IllegalStateException this property cannot be changed after the underlying component has been created
     */
    public void setRotation(double rotation)  throws IllegalStateException {
        setAttribute("rotation", rotation, false);
    }

    /**
     * Rotation in degrees about the center of the {@link com.smartgwt.client.widgets.drawing.DrawItem#getBoundingBox bounding
     * box}. The positive direction is clockwise.
     *
     * @return double
     */
    public double getRotationAsDouble()  {
        return getAttributeAsDouble("rotation");
    }

    /**
     * Array holds 2 values representing scaling along x and y dimensions.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param scale  Default value is null
     * @throws IllegalStateException this property cannot be changed after the underlying component has been created
     */
    public void setScale(int[] scale)  throws IllegalStateException {
        setAttribute("scale", scale, false);
    }

    /**
     * Array holds 2 values representing scaling along x and y dimensions.
     *
     * @return int[]
     */
    public int[] getScale()  {
        return com.smartgwt.client.util.ConvertTo.arrayOfint(getAttributeAsJavaScriptObject("scale"));
    }

    /**
     * Shadow used for all DrawItem subtypes.
     *
     * <p>If this method is called after the component has been drawn/initialized:
     * Update shadow for this drawItem.
     *
     * @param shadow new shadow. Default value is null
     */
    public void setShadow(Shadow shadow) {
        setAttribute("shadow", shadow.getJsObj(), true);
    }

    /**
     * Shadow used for all DrawItem subtypes.
     *
     * @return Shadow
     */
    public Shadow getShadow()  {
        return new Shadow(getAttributeAsJavaScriptObject("shadow"));
    }

    /**
     * If {@link com.smartgwt.client.widgets.drawing.DrawItem#getCanHover canHover} is true, should we show the global hover
     * canvas by default when the user hovers over this DrawItem?
     *
     * @param showHover  Default value is true
     * @see com.smartgwt.client.widgets.drawing.DrawItem#getHoverHTML
     */
    public void setShowHover(boolean showHover) {
        setAttribute("showHover", showHover, true);
    }

    /**
     * If {@link com.smartgwt.client.widgets.drawing.DrawItem#getCanHover canHover} is true, should we show the global hover
     * canvas by default when the user hovers over this DrawItem?
     *
     * @return boolean
     * @see com.smartgwt.client.widgets.drawing.DrawItem#getHoverHTML
     */
    public boolean getShowHover()  {
        return getAttributeAsBoolean("showHover");
    }

    /**
     * Style of arrowhead to draw at the beginning of the line or path.
     *
     * <p>If this method is called after the component has been drawn/initialized:
     * Set the arrowhead at the beginning of this path. <p> <b>NOTE:</b> Not all DrawItem classes support arrowheads. You can use {@link com.smartgwt.client.widgets.drawing.DrawItem#supportsStartArrow DrawItem.supportsStartArrow} to dynamically check whether a DrawItem instance supports this method.
     *
     * @param startArrow style of arrow to use. Default value is null
     */
    public void setStartArrow(ArrowStyle startArrow) {
        setAttribute("startArrow", startArrow == null ? null : startArrow.getValue(), true);
    }

    /**
     * Style of arrowhead to draw at the beginning of the line or path.
     *
     * @return ArrowStyle
     */
    public ArrowStyle getStartArrow()  {
        return EnumUtil.getEnum(ArrowStyle.values(), getAttribute("startArrow"));
    }

    // ********************* Methods ***********************
    /**
     * Add a click handler.
     * <p>
     * Notification fired when the user clicks on this DrawItem. <p> Note that if this item is part of a {@link
     * com.smartgwt.client.widgets.drawing.DrawGroup}, then the group's {@link
     * com.smartgwt.client.widgets.drawing.DrawGroup#getUseGroupRect useGroupRect} setting affects whether this item receives
     * the notification. If useGroupRect is true, then this item will <em>not</em> receive the notification. Otherwise, the
     * item receives the notification and notification bubbles up to the group.
     *
     * @param handler the click handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addClickHandler(com.smartgwt.client.widgets.drawing.events.ClickHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.drawing.events.ClickEvent.getType()) == 0) setupClickEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.drawing.events.ClickEvent.getType());
    }

    private native void setupClickEvent() /*-{
        var obj = null;
        var selfJ = this;
        var click = $debox($entry(function(param){
                var event = @com.smartgwt.client.widgets.drawing.events.ClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.core.BaseClass::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                var ret = event.@com.smartgwt.client.event.Cancellable::isCancelled()();
                return !ret;
            }));
        if(this.@com.smartgwt.client.core.BaseClass::isCreated()()) {
            obj = this.@com.smartgwt.client.core.BaseClass::getJsObj()();
            obj.addProperties({click: 
                function () {
                    var param = {};
                    return click(param) == true;
                }
             });
        } else {
            obj = this.@com.smartgwt.client.core.BaseClass::getConfig()();
            obj.click = 
                function () {
                    var param = {};
                    return click(param) == true;
                }
            ;
        }
   }-*/;

	/**
     * If {@link com.smartgwt.client.widgets.drawing.DrawItem#getCanDrag canDrag} is true and the {@link
     * com.smartgwt.client.widgets.drawing.DrawItem#getKnobs control knobs} include "resize" knobs, then this notification
     * method will be fired when the user drag-resizes the draw item.
     * @param position provides which knob of the {@link com.smartgwt.client.widgets.drawing.DrawItem#getResizeKnobPoints resizeKnobPoints} was
     * dragged
     * @param x new x-coordinate of the knob
     * @param y new y-coordinate of the knob
     * @param dX horizontal distance moved
     * @param dY vertical distance moved
     */
    public native void dragResizeMove(String position, Integer x, Integer y, Integer dX, Integer dY) /*-{
        var self = this.@com.smartgwt.client.core.BaseClass::getOrCreateJsObj()();
        self.dragResizeMove(position, x == null ? null : x.@java.lang.Integer::intValue()(), y == null ? null : y.@java.lang.Integer::intValue()(), dX == null ? null : dX.@java.lang.Integer::intValue()(), dY == null ? null : dY.@java.lang.Integer::intValue()());
    }-*/;

	/**
     * Draw this item into its current {@link com.smartgwt.client.widgets.drawing.DrawPane}.
     */
    public native void draw() /*-{
        var self = this.@com.smartgwt.client.core.BaseClass::getOrCreateJsObj()();
        self.draw();
    }-*/;

	/**
     * Erase this drawItem's visual representation and remove it from its DrawGroup (if any) and DrawPane. <P> To re-draw the
     * item within the DrawPane, call {@link com.smartgwt.client.widgets.drawing.DrawItem#draw DrawItem.draw} again, or use
     * {@link com.smartgwt.client.widgets.drawing.DrawPane#addDrawItem DrawPane.addDrawItem} to move to another DrawGroup.
     */
    public native void erase() /*-{
        var self = this.@com.smartgwt.client.core.BaseClass::getOrCreateJsObj()();
        self.erase();
    }-*/;

	/**
     * If {@link com.smartgwt.client.widgets.drawing.DrawItem#getShowHover showHover} is true, when the user holds the mouse
     * over this DrawItem for long enough to trigger a hover event, a hover canvas is shown by default. This method returns the
     * contents of that hover canvas. Default implementation returns {@link
     * com.smartgwt.client.widgets.drawing.DrawItem#getPrompt prompt} - override for custom hover HTML. Note that returning
     * <code>null</code> or an empty string will suppress the hover canvas altogether.
     *
     * @return the HTML to show in the hover
     */
    public native String getHoverHTML() /*-{
        var self = this.@com.smartgwt.client.core.BaseClass::getOrCreateJsObj()();
        var ret = self.getHoverHTML();
        return ret;
    }-*/;

	/**
     * Returns the page-relative left coordinate of the widget on the page, in pixels.
     *
     * @return global left coordinate
     * @see com.smartgwt.client.docs.Positioning Positioning overview and related methods
     */
    public native int getPageLeft() /*-{
        var self = this.@com.smartgwt.client.core.BaseClass::getOrCreateJsObj()();
        var ret = self.getPageLeft();
        return ret;
    }-*/;

	/**
     * Returns the page-relative top coordinate of the widget on the page, in pixels
     *
     * @return GLOBAL top coordinate
     * @see com.smartgwt.client.docs.Positioning Positioning overview and related methods
     */
    public native int getPageTop() /*-{
        var self = this.@com.smartgwt.client.core.BaseClass::getOrCreateJsObj()();
        var ret = self.getPageTop();
        return ret;
    }-*/;

	/**
     * Generates a string containing the SVG source of this DrawItem. <p><b>NOTE:</b> The generated SVG source assumes that the
     * default namespace is <code>http://www.w3.org/2000/svg</code> and that namespace prefix <code>xlink</code> refers to
     * namespace name <code>http://www.w3.org/1999/xlink</code>.
     */
    public native void getSvgString() /*-{
        var self = this.@com.smartgwt.client.core.BaseClass::getOrCreateJsObj()();
        self.getSvgString();
    }-*/;

	/**
     * Hide this drawItem.
     */
    public native void hide() /*-{
        var self = this.@com.smartgwt.client.core.BaseClass::getOrCreateJsObj()();
        self.hide();
    }-*/;


	/**
     * Hides a set of control knobs for this drawItem. Updates {@link com.smartgwt.client.widgets.drawing.DrawItem#getKnobs
     * knobs} to remove the specified knobType, and clears any drawn knobs for this knobType.
     * @param knobType knobs to hide
     */
    public native void hideKnobs(KnobType knobType) /*-{
        var self = this.@com.smartgwt.client.core.BaseClass::getOrCreateJsObj()();
        self.hideKnobs(knobType.@com.smartgwt.client.types.KnobType::getValue()());
    }-*/;

	/**
     * Hides a set of control knobs for this drawItem. Updates {@link com.smartgwt.client.widgets.drawing.DrawItem#getKnobs
     * knobs} to remove the specified knobType, and clears any drawn knobs for this knobType.
     * @param knobType knobs to hide
     */
    public native void hideKnobs(KnobType... knobType) /*-{
        var self = this.@com.smartgwt.client.core.BaseClass::getOrCreateJsObj()();
        self.hideKnobs(@com.smartgwt.client.util.JSOHelper::convertToJavaScriptArray([Ljava/lang/Object;)(knobType));
    }-*/;

	/**
     * If {@link com.smartgwt.client.widgets.drawing.DrawItem#getCanHover canHover} is true for this DrawItem, the hover()
     * string method will be fired when the user hovers over this DrawItem. If this method returns false, it will suppress the
     * default behavior of showing a hover canvas if {@link com.smartgwt.client.widgets.drawing.DrawItem#getShowHover
     * showHover} is true.
     *
     * @return false to cancel the hover event.
     */
    public native boolean hover() /*-{
        var self = this.@com.smartgwt.client.core.BaseClass::getOrCreateJsObj()();
        var ret = self.hover();
        return ret;
    }-*/;


	/**
     * Returns true if the given point in the global coordinate system, when converted to coordinates in the drawing coordinate
     * system, is within the {@link com.smartgwt.client.widgets.drawing.DrawItem#getBoundingBox bounding box} of this
     * DrawItem's shape. <p> This method can be used to quickly check whether the given point is definitely <em>not</em> within
     * the DrawItem shape. To check whether the point is within the DrawItem shape, use the slower but exact {@link
     * com.smartgwt.client.widgets.drawing.DrawItem#isPointInPath DrawItem.isPointInPath} method.
     * @param x X coordinate of the point in the global coordinate system.
     * @param y Y coordinate of the point in the global coordinate system.
     *
     * @return 
     */
    public native boolean isInBounds(int x, int y) /*-{
        var self = this.@com.smartgwt.client.core.BaseClass::getOrCreateJsObj()();
        var ret = self.isInBounds(x, y);
        return ret;
    }-*/;


	/**
     * Returns true if the given point in the drawing coordinate system is within this DrawItem's shape, taking into account
     * local transforms.
     * @param x X coordinate of the test point.
     * @param y Y coordinate of the test point.
     *
     * @return 
     */
    public native boolean isPointInPath(int x, int y) /*-{
        var self = this.@com.smartgwt.client.core.BaseClass::getOrCreateJsObj()();
        var ret = self.isPointInPath(x, y);
        return ret;
    }-*/;

    /**
     * Add a mouseDown handler.
     * <p>
     * Notification fired when the user presses the left mouse button on this DrawItem. <p> Note that if this item is part of a
     * {@link com.smartgwt.client.widgets.drawing.DrawGroup}, then the group's {@link
     * com.smartgwt.client.widgets.drawing.DrawGroup#getUseGroupRect useGroupRect} setting affects whether this item receives
     * the notification. If useGroupRect is true, then this item will <em>not</em> receive the notification. Otherwise, the
     * item receives the notification and notification bubbles up to the group.
     *
     * @param handler the mouseDown handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addMouseDownHandler(com.smartgwt.client.widgets.drawing.events.MouseDownHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.drawing.events.MouseDownEvent.getType()) == 0) setupMouseDownEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.drawing.events.MouseDownEvent.getType());
    }

    private native void setupMouseDownEvent() /*-{
        var obj = null;
        var selfJ = this;
        var mouseDown = $debox($entry(function(param){
                var event = @com.smartgwt.client.widgets.drawing.events.MouseDownEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.core.BaseClass::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                var ret = event.@com.smartgwt.client.event.Cancellable::isCancelled()();
                return !ret;
            }));
        if(this.@com.smartgwt.client.core.BaseClass::isCreated()()) {
            obj = this.@com.smartgwt.client.core.BaseClass::getJsObj()();
            obj.addProperties({mouseDown: 
                function () {
                    var param = {};
                    return mouseDown(param) == true;
                }
             });
        } else {
            obj = this.@com.smartgwt.client.core.BaseClass::getConfig()();
            obj.mouseDown = 
                function () {
                    var param = {};
                    return mouseDown(param) == true;
                }
            ;
        }
   }-*/;
    /**
     * Add a mouseMove handler.
     * <p>
     * Notification fired when the user moves the mouse over this DrawItem. <p> Note that if this item is part of a {@link
     * com.smartgwt.client.widgets.drawing.DrawGroup}, then the group's {@link
     * com.smartgwt.client.widgets.drawing.DrawGroup#getUseGroupRect useGroupRect} setting affects whether this item receives
     * the notification. If useGroupRect is true, then this item will <em>not</em> receive the notification. Otherwise, the
     * item receives the notification and notification bubbles up to the group.
     *
     * @param handler the mouseMove handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addMouseMoveHandler(com.smartgwt.client.widgets.drawing.events.MouseMoveHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.drawing.events.MouseMoveEvent.getType()) == 0) setupMouseMoveEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.drawing.events.MouseMoveEvent.getType());
    }

    private native void setupMouseMoveEvent() /*-{
        var obj = null;
        var selfJ = this;
        var mouseMove = $debox($entry(function(param){
                var event = @com.smartgwt.client.widgets.drawing.events.MouseMoveEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.core.BaseClass::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                var ret = event.@com.smartgwt.client.event.Cancellable::isCancelled()();
                return !ret;
            }));
        if(this.@com.smartgwt.client.core.BaseClass::isCreated()()) {
            obj = this.@com.smartgwt.client.core.BaseClass::getJsObj()();
            obj.addProperties({mouseMove: 
                function () {
                    var param = {};
                    return mouseMove(param) == true;
                }
             });
        } else {
            obj = this.@com.smartgwt.client.core.BaseClass::getConfig()();
            obj.mouseMove = 
                function () {
                    var param = {};
                    return mouseMove(param) == true;
                }
            ;
        }
   }-*/;
    /**
     * Add a mouseOut handler.
     * <p>
     * Notification fired when the mouse leaves this DrawItem. <p> Note that if this item is part of a {@link
     * com.smartgwt.client.widgets.drawing.DrawGroup}, then the group's {@link
     * com.smartgwt.client.widgets.drawing.DrawGroup#getUseGroupRect useGroupRect} setting affects whether this item receives
     * the notification. If useGroupRect is true, then this item will <em>not</em> receive the notification. Otherwise, the
     * item receives the notification and notification bubbles up to the group.
     *
     * @param handler the mouseOut handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addMouseOutHandler(com.smartgwt.client.widgets.drawing.events.MouseOutHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.drawing.events.MouseOutEvent.getType()) == 0) setupMouseOutEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.drawing.events.MouseOutEvent.getType());
    }

    private native void setupMouseOutEvent() /*-{
        var obj = null;
        var selfJ = this;
        var mouseOut = $debox($entry(function(param){
                var event = @com.smartgwt.client.widgets.drawing.events.MouseOutEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.core.BaseClass::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                var ret = event.@com.smartgwt.client.event.Cancellable::isCancelled()();
                return !ret;
            }));
        if(this.@com.smartgwt.client.core.BaseClass::isCreated()()) {
            obj = this.@com.smartgwt.client.core.BaseClass::getJsObj()();
            obj.addProperties({mouseOut: 
                function () {
                    var param = {};
                    return mouseOut(param) == true;
                }
             });
        } else {
            obj = this.@com.smartgwt.client.core.BaseClass::getConfig()();
            obj.mouseOut = 
                function () {
                    var param = {};
                    return mouseOut(param) == true;
                }
            ;
        }
   }-*/;
    /**
     * Add a mouseOver handler.
     * <p>
     * Notification fired when the mouse enters this DrawItem. <p> Note that if this item is part of a {@link
     * com.smartgwt.client.widgets.drawing.DrawGroup}, then the group's {@link
     * com.smartgwt.client.widgets.drawing.DrawGroup#getUseGroupRect useGroupRect} setting affects whether this item receives
     * the notification. If useGroupRect is true, then this item will <em>not</em> receive the notification. Otherwise, the
     * item receives the notification and notification bubbles up to the group.
     *
     * @param handler the mouseOver handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addMouseOverHandler(com.smartgwt.client.widgets.drawing.events.MouseOverHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.drawing.events.MouseOverEvent.getType()) == 0) setupMouseOverEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.drawing.events.MouseOverEvent.getType());
    }

    private native void setupMouseOverEvent() /*-{
        var obj = null;
        var selfJ = this;
        var mouseOver = $debox($entry(function(param){
                var event = @com.smartgwt.client.widgets.drawing.events.MouseOverEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.core.BaseClass::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                var ret = event.@com.smartgwt.client.event.Cancellable::isCancelled()();
                return !ret;
            }));
        if(this.@com.smartgwt.client.core.BaseClass::isCreated()()) {
            obj = this.@com.smartgwt.client.core.BaseClass::getJsObj()();
            obj.addProperties({mouseOver: 
                function () {
                    var param = {};
                    return mouseOver(param) == true;
                }
             });
        } else {
            obj = this.@com.smartgwt.client.core.BaseClass::getConfig()();
            obj.mouseOver = 
                function () {
                    var param = {};
                    return mouseOver(param) == true;
                }
            ;
        }
   }-*/;
    /**
     * Add a mouseUp handler.
     * <p>
     * Notification fired when the user releases the left mouse button on this DrawItem. <p> Note that if this item is part of
     * a {@link com.smartgwt.client.widgets.drawing.DrawGroup}, then the group's {@link
     * com.smartgwt.client.widgets.drawing.DrawGroup#getUseGroupRect useGroupRect} setting affects whether this item receives
     * the notification. If useGroupRect is true, then this item will <em>not</em> receive the notification. Otherwise, the
     * item receives the notification and notification bubbles up to the group.
     *
     * @param handler the mouseUp handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addMouseUpHandler(com.smartgwt.client.widgets.drawing.events.MouseUpHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.drawing.events.MouseUpEvent.getType()) == 0) setupMouseUpEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.drawing.events.MouseUpEvent.getType());
    }

    private native void setupMouseUpEvent() /*-{
        var obj = null;
        var selfJ = this;
        var mouseUp = $debox($entry(function(param){
                var event = @com.smartgwt.client.widgets.drawing.events.MouseUpEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.core.BaseClass::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                var ret = event.@com.smartgwt.client.event.Cancellable::isCancelled()();
                return !ret;
            }));
        if(this.@com.smartgwt.client.core.BaseClass::isCreated()()) {
            obj = this.@com.smartgwt.client.core.BaseClass::getJsObj()();
            obj.addProperties({mouseUp: 
                function () {
                    var param = {};
                    return mouseUp(param) == true;
                }
             });
        } else {
            obj = this.@com.smartgwt.client.core.BaseClass::getConfig()();
            obj.mouseUp = 
                function () {
                    var param = {};
                    return mouseUp(param) == true;
                }
            ;
        }
   }-*/;

	/**
     * Move the shape by the specified deltas for the left and top coordinate.
     * @param dX change to left coordinate in pixels
     * @param dY change to top coordinate in pixels
     */
    public native void moveBy(int dX, int dY) /*-{
        var self = this.@com.smartgwt.client.core.BaseClass::getOrCreateJsObj()();
        self.moveBy(dX, dY);
    }-*/;

    /**
     * Add a moved handler.
     * <p>
     * Notification method fired when this component is explicitly moved. Note that a component's position on the screen may
     * also be changed due to an ancestor being moved. The {@link com.smartgwt.client.widgets.Canvas#addParentMovedHandler
     * parentMoved()} method provides a notification entry point to catch that case as well.
     *
     * @param handler the moved handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addMovedHandler(com.smartgwt.client.widgets.drawing.events.MovedHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.drawing.events.MovedEvent.getType()) == 0) setupMovedEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.drawing.events.MovedEvent.getType());
    }

    private native void setupMovedEvent() /*-{
        var obj = null;
        var selfJ = this;
        var moved = $entry(function(){
            var param = {"deltaX" : arguments[0], "deltaY" : arguments[1]};
                var event = @com.smartgwt.client.widgets.drawing.events.MovedEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.core.BaseClass::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
            });
        if(this.@com.smartgwt.client.core.BaseClass::isCreated()()) {
            obj = this.@com.smartgwt.client.core.BaseClass::getJsObj()();
            obj.addProperties({moved:  moved              });
        } else {
            obj = this.@com.smartgwt.client.core.BaseClass::getConfig()();
            obj.moved =  moved             ;
        }
   }-*/;
    /**
     * Add a dragMove handler.
     * <p>
     * If {@link com.smartgwt.client.widgets.drawing.DrawItem#getCanDrag canDrag} is true, this notification method will be
     * fired when the user drags the draw item.
     *
     * @param handler the dragMove handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addDragMoveHandler(com.smartgwt.client.widgets.drawing.events.DragMoveHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.drawing.events.DragMove.getType()) == 0) setupDragMoveEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.drawing.events.DragMove.getType());
    }

    private native void setupDragMoveEvent() /*-{
        var obj = null;
        var selfJ = this;
        var onDragMove = $debox($entry(function(param){
                var event = @com.smartgwt.client.widgets.drawing.events.DragMove::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.core.BaseClass::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                var ret = event.@com.smartgwt.client.event.Cancellable::isCancelled()();
                return !ret;
            }));
        if(this.@com.smartgwt.client.core.BaseClass::isCreated()()) {
            obj = this.@com.smartgwt.client.core.BaseClass::getJsObj()();
            obj.addProperties({onDragMove: 
                function () {
                    var param = {"x" : arguments[0], "y" : arguments[1]};
                    return onDragMove(param) == true;
                }
             });
        } else {
            obj = this.@com.smartgwt.client.core.BaseClass::getConfig()();
            obj.onDragMove = 
                function () {
                    var param = {"x" : arguments[0], "y" : arguments[1]};
                    return onDragMove(param) == true;
                }
            ;
        }
   }-*/;
    /**
     * Add a dragResizeMove handler.
     * <p>
     * If {@link com.smartgwt.client.widgets.drawing.DrawItem#getCanDrag canDrag} is true and the {@link
     * com.smartgwt.client.widgets.drawing.DrawItem#getKnobs control knobs} include "resize" knobs, then this notification
     * method will be fired when the user drags the resize knobs of the draw item.
     *
     * @param handler the dragResizeMove handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addDragResizeMoveHandler(com.smartgwt.client.widgets.drawing.events.DragResizeMoveHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.drawing.events.DragResizeMoveEvent.getType()) == 0) setupDragResizeMoveEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.drawing.events.DragResizeMoveEvent.getType());
    }

    private native void setupDragResizeMoveEvent() /*-{
        var obj = null;
        var selfJ = this;
        var onDragResizeMove = $debox($entry(function(param){
                var event = @com.smartgwt.client.widgets.drawing.events.DragResizeMoveEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.core.BaseClass::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                var ret = event.@com.smartgwt.client.event.Cancellable::isCancelled()();
                return !ret;
            }));
        if(this.@com.smartgwt.client.core.BaseClass::isCreated()()) {
            obj = this.@com.smartgwt.client.core.BaseClass::getJsObj()();
            obj.addProperties({onDragResizeMove: 
                function () {
                    var param = {"newX" : arguments[0], "newY" : arguments[1], "newWidth" : arguments[2], "newHeight" : arguments[3]};
                    return onDragResizeMove(param) == true;
                }
             });
        } else {
            obj = this.@com.smartgwt.client.core.BaseClass::getConfig()();
            obj.onDragResizeMove = 
                function () {
                    var param = {"newX" : arguments[0], "newY" : arguments[1], "newWidth" : arguments[2], "newHeight" : arguments[3]};
                    return onDragResizeMove(param) == true;
                }
            ;
        }
   }-*/;
    /**
     * Add a dragStart handler.
     * <p>
     * If {@link com.smartgwt.client.widgets.drawing.DrawItem#getCanDrag canDrag} is true, this notification method will be
     * fired when the user starts to drag the draw item.
     *
     * @param handler the dragStart handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addDragStartHandler(com.smartgwt.client.widgets.drawing.events.DragStartHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.drawing.events.DragStart.getType()) == 0) setupDragStartEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.drawing.events.DragStart.getType());
    }

    private native void setupDragStartEvent() /*-{
        var obj = null;
        var selfJ = this;
        var onDragStart = $debox($entry(function(param){
                var event = @com.smartgwt.client.widgets.drawing.events.DragStart::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.core.BaseClass::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                var ret = event.@com.smartgwt.client.event.Cancellable::isCancelled()();
                return !ret;
            }));
        if(this.@com.smartgwt.client.core.BaseClass::isCreated()()) {
            obj = this.@com.smartgwt.client.core.BaseClass::getJsObj()();
            obj.addProperties({onDragStart: 
                function () {
                    var param = {"x" : arguments[0], "y" : arguments[1]};
                    return onDragStart(param) == true;
                }
             });
        } else {
            obj = this.@com.smartgwt.client.core.BaseClass::getConfig()();
            obj.onDragStart = 
                function () {
                    var param = {"x" : arguments[0], "y" : arguments[1]};
                    return onDragStart(param) == true;
                }
            ;
        }
   }-*/;
    /**
     * Add a dragStop handler.
     * <p>
     * If {@link com.smartgwt.client.widgets.drawing.DrawItem#getCanDrag canDrag} is true, this notification method will be
     * fired when the user completes a drag on the draw item.
     *
     * @param handler the dragStop handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addDragStopHandler(com.smartgwt.client.widgets.drawing.events.DragStopHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.drawing.events.DragStop.getType()) == 0) setupDragStopEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.drawing.events.DragStop.getType());
    }

    private native void setupDragStopEvent() /*-{
        var obj = null;
        var selfJ = this;
        var onDragStop = $entry(function(){
            var param = {"x" : arguments[0], "y" : arguments[1]};
                var event = @com.smartgwt.client.widgets.drawing.events.DragStop::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.core.BaseClass::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
            });
        if(this.@com.smartgwt.client.core.BaseClass::isCreated()()) {
            obj = this.@com.smartgwt.client.core.BaseClass::getJsObj()();
            obj.addProperties({onDragStop:  onDragStop              });
        } else {
            obj = this.@com.smartgwt.client.core.BaseClass::getConfig()();
            obj.onDragStop =  onDragStop             ;
        }
   }-*/;

	/**
     * Resize the shape by the specified deltas for the left and top coordinate.
     * @param dX change to left coordinate in pixels
     * @param dY change to top coordinate in pixels
     */
    public native void resizeBy(int dX, int dY) /*-{
        var self = this.@com.smartgwt.client.core.BaseClass::getOrCreateJsObj()();
        self.resizeBy(dX, dY);
    }-*/;

    /**
     * Add a resized handler.
     * <p>
     * Observable method called whenever a DrawItem changes size.
     *
     * @param handler the resized handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addResizedHandler(com.smartgwt.client.widgets.drawing.events.ResizedHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.drawing.events.ResizedEvent.getType()) == 0) setupResizedEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.drawing.events.ResizedEvent.getType());
    }

    private native void setupResizedEvent() /*-{
        var obj = null;
        var selfJ = this;
        var resized = $entry(function(){
            var param = {};
                var event = @com.smartgwt.client.widgets.drawing.events.ResizedEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.core.BaseClass::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
            });
        if(this.@com.smartgwt.client.core.BaseClass::isCreated()()) {
            obj = this.@com.smartgwt.client.core.BaseClass::getJsObj()();
            obj.addProperties({resized:  resized              });
        } else {
            obj = this.@com.smartgwt.client.core.BaseClass::getConfig()();
            obj.resized =  resized             ;
        }
   }-*/;

	/**
     * Resize to the specified size
     * @param width new width
     * @param height new height
     */
    public native void resizeTo(int width, int height) /*-{
        var self = this.@com.smartgwt.client.core.BaseClass::getOrCreateJsObj()();
        self.resizeTo(width, height);
    }-*/;


	/**
     * Rotate the shape by the relative rotation in degrees
     * @param degrees number of degrees to rotate from current orientation.
     */
    public native void rotateBy(double degrees) /*-{
        var self = this.@com.smartgwt.client.core.BaseClass::getOrCreateJsObj()();
        self.rotateBy(degrees);
    }-*/;


	/**
     * Rotate the shape by the absolute rotation in degrees
     * @param degrees number of degrees to rotate
     */
    public native void rotateTo(double degrees) /*-{
        var self = this.@com.smartgwt.client.core.BaseClass::getOrCreateJsObj()();
        self.rotateTo(degrees);
    }-*/;



	/**
     * Scale the shape by the x, y multipliers
     * @param x scale in the x direction
     * @param y scale in the y direction
     */
    public native void scaleBy(double x, double y) /*-{
        var self = this.@com.smartgwt.client.core.BaseClass::getOrCreateJsObj()();
        self.scaleBy(x, y);
    }-*/;



	/**
     * Scale the shape by the x, y multipliers
     * @param x scale in the x direction
     * @param y scale in the y direction
     */
    public native void scaleTo(double x, double y) /*-{
        var self = this.@com.smartgwt.client.core.BaseClass::getOrCreateJsObj()();
        self.scaleTo(x, y);
    }-*/;

	/**
     * Make this drawItem visible.
     */
    public native void show() /*-{
        var self = this.@com.smartgwt.client.core.BaseClass::getOrCreateJsObj()();
        self.show();
    }-*/;

    /**
     * Add a showContextMenu handler.
     * <p>
     * Executed when the right mouse button is clicked.  The default implementation of this method auto-creates a {@link
     * com.smartgwt.client.widgets.menu.Menu} from the {@link com.smartgwt.client.widgets.Canvas#getContextMenu contextMenu}
     * property on this component and then calls {@link com.smartgwt.client.widgets.menu.Menu#showContextMenu
     * Menu.showContextMenu} on it to show it. <p> If you want to show a standard context menu, you can simply define your Menu
     * and set it as the contextMenu property on your component - you do not need to override this method. <p> If you want to
     * do some other processing before showing a menu or do something else entirely, then you should override this method. 
     * Note that the return value from this method controls whether or not the native browser context menu is shown.
     *
     * @param handler the showContextMenu handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addShowContextMenuHandler(com.smartgwt.client.widgets.drawing.events.ShowContextMenuHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.drawing.events.ShowContextMenuEvent.getType()) == 0) setupShowContextMenuEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.drawing.events.ShowContextMenuEvent.getType());
    }

    private native void setupShowContextMenuEvent() /*-{
        var obj = null;
        var selfJ = this;
        var showContextMenu = $debox($entry(function(param){
                var event = @com.smartgwt.client.widgets.drawing.events.ShowContextMenuEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.core.BaseClass::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                var ret = event.@com.smartgwt.client.event.Cancellable::isCancelled()();
                return !ret;
            }));
        if(this.@com.smartgwt.client.core.BaseClass::isCreated()()) {
            obj = this.@com.smartgwt.client.core.BaseClass::getJsObj()();
            obj.addProperties({showContextMenu: 
                function () {
                    var param = {};
                    return showContextMenu(param) == true;
                }
             });
        } else {
            obj = this.@com.smartgwt.client.core.BaseClass::getConfig()();
            obj.showContextMenu = 
                function () {
                    var param = {};
                    return showContextMenu(param) == true;
                }
            ;
        }
   }-*/;

	/**
     * Shows a set of control knobs for this drawItem. Updates {@link com.smartgwt.client.widgets.drawing.DrawItem#getKnobs
     * knobs} to include the specified knobType, and if necessary draws out the appropriate control knobs.
     * @param knobType knobs to show
     */
    public native void showKnobs(KnobType knobType) /*-{
        var self = this.@com.smartgwt.client.core.BaseClass::getOrCreateJsObj()();
        self.showKnobs(knobType.@com.smartgwt.client.types.KnobType::getValue()());
    }-*/;

	/**
     * Shows a set of control knobs for this drawItem. Updates {@link com.smartgwt.client.widgets.drawing.DrawItem#getKnobs
     * knobs} to include the specified knobType, and if necessary draws out the appropriate control knobs.
     * @param knobType knobs to show
     */
    public native void showKnobs(KnobType... knobType) /*-{
        var self = this.@com.smartgwt.client.core.BaseClass::getOrCreateJsObj()();
        self.showKnobs(@com.smartgwt.client.util.JSOHelper::convertToJavaScriptArray([Ljava/lang/Object;)(knobType));
    }-*/;

	/**
     * Does this DrawItem  support {@link com.smartgwt.client.widgets.drawing.DrawItem#setEndArrow DrawItem.setEndArrow}? For
     * example, this is false for {@link com.smartgwt.client.widgets.drawing.DrawRect} and {@link
     * com.smartgwt.client.widgets.drawing.DrawOval}, and true for {@link com.smartgwt.client.widgets.drawing.DrawLine}.
     *
     * @return whether setEndArrow() is supported by this DrawItem.
     */
    public native boolean supportsEndArrow() /*-{
        var self = this.@com.smartgwt.client.core.BaseClass::getOrCreateJsObj()();
        var ret = self.supportsEndArrow();
        return ret;
    }-*/;

	/**
     * Does this DrawItem  support {@link com.smartgwt.client.widgets.drawing.DrawItem#setStartArrow DrawItem.setStartArrow}?
     * For example, this is false for {@link com.smartgwt.client.widgets.drawing.DrawRect} and {@link
     * com.smartgwt.client.widgets.drawing.DrawOval}, and true for {@link com.smartgwt.client.widgets.drawing.DrawLine}.
     *
     * @return whether setStartArrow() is supported by this DrawItem.
     */
    public native boolean supportsStartArrow() /*-{
        var self = this.@com.smartgwt.client.core.BaseClass::getOrCreateJsObj()();
        var ret = self.supportsStartArrow();
        return ret;
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
     * @param drawItemProperties properties that should be used as new defaults when instances of this class are created
     */
    public static native void setDefaultProperties(DrawItem drawItemProperties) /*-{
    	var properties = $wnd.isc.addProperties({},drawItemProperties.@com.smartgwt.client.core.BaseClass::getConfig()());
        @com.smartgwt.client.util.JSOHelper::cleanProperties(Lcom/google/gwt/core/client/JavaScriptObject;Z)(properties,false);
        $wnd.isc.DrawItem.addProperties(properties);
    }-*/;

    // ***********************************************************



    public static DrawItem getRef(JavaScriptObject jsObj) {

        if (jsObj == null) {
            return null;
        } else {
            Object ref = JSOHelper.getAttributeAsObject((JavaScriptObject) jsObj, SC.REF);
            if (ref != null && !(ref instanceof DrawItem)) {
                return null;
            } else {
                return (DrawItem) ref;
            }
        }
    }

    /**
     * Computes the angle in degrees from the positive X axis to the difference vector <nobr><b>v</b><sub>2</sub> -
     * <b>v</b><sub>1</sub></nobr> between the two given vectors.
     * @param px1 X coordinate of <b>v</b><sub>1</sub>
     * @param py1 Y coordinate of <b>v</b><sub>1</sub>
     * @param px2 X coordinate of <b>v</b><sub>2</sub>
     * @param py2 Y coordinate of <b>v</b><sub>2</sub>
     *
     * @return the angle in degrees, in the range [0, 360).
     * @deprecated {@link com.smartgwt.client.docs.GwtFloatVsDouble GwtFloatVsDouble}
     */
    public static native float computeAngle(double px1, double py1, double px2, double py2) /*-{
        var ret = $wnd.isc.DrawItem.computeAngle(px1, py1, px2, py2);
        return ret;
    }-*/;

    /**
     * Computes the angle in degrees from the positive X axis to the difference vector <nobr><b>v</b><sub>2</sub> -
     * <b>v</b><sub>1</sub></nobr> between the two given vectors.
     * @param px1 X coordinate of <b>v</b><sub>1</sub>
     * @param py1 Y coordinate of <b>v</b><sub>1</sub>
     * @param px2 X coordinate of <b>v</b><sub>2</sub>
     * @param py2 Y coordinate of <b>v</b><sub>2</sub>
     *
     * @return the angle in degrees, in the range [0, 360).
     */
    public static native double computeAngleAsDouble(double px1, double py1, double px2, double py2) /*-{
        var ret = $wnd.isc.DrawItem.computeAngle(px1, py1, px2, py2);
        return ret;
    }-*/;

    /**
     * Returns the startPoint endPoint
     *
     * @return x1, y1, x2, y2 coordinates
     */
    public native Double[] getBoundingBoxAsDouble() /*-{
        var self = this.@com.smartgwt.client.core.BaseClass::getOrCreateJsObj()();
        var selection = self.getBoundingBox();
        return selection == null || selection === undefined ? null : @com.smartgwt.client.util.JSOHelper::convertToJavaDoubleArray(Lcom/google/gwt/core/client/JavaScriptObject;)(selection);
    }-*/;
    
    /**
     * Returns the startPoint endPoint
     *
     * @return x1, y1, x2, y2 coordinates
     */
    public native int[] getBoundingBox() /*-{
        var self = this.@com.smartgwt.client.core.BaseClass::getOrCreateJsObj()();
        var selection = self.getBoundingBox();
        return selection == null || selection === undefined ? null : @com.smartgwt.client.util.JSOHelper::convertToJavaIntArray(Lcom/google/gwt/core/client/JavaScriptObject;)(selection);
    }-*/;

    protected native int[] getAttributeAsIntArray(String property)/*-{
        var ret;
        if(this.@com.smartgwt.client.core.BaseClass::isCreated()()) {
            var widget = this.@com.smartgwt.client.core.BaseClass::getJsObj()();
            ret = widget.getProperty(property);
        } else {
            var config = this.@com.smartgwt.client.core.BaseClass::config;
            if(config[property] != undefined) {
                ret = config[property];
            } else {
               var scClassName = this.@com.smartgwt.client.core.BaseClass::scClassName;
               ret = $wnd.isc[scClassName].getInstanceProperty(property);
            }
        }
        return ret === undefined ? null : @com.smartgwt.client.util.JSOHelper::convertToJavaIntArray(Lcom/google/gwt/core/client/JavaScriptObject;)(ret);
    }-*/;

    protected void setAttribute(String attribute, Float[] value, boolean allowPostCreate) {
        if (!isCreated()) {
            JSOHelper.setAttribute(config, attribute, value);
        } else if (allowPostCreate) {
            setProperty(attribute, JSOHelper.convertToJavaScriptArray(value));
        } else {
            error(attribute, value.toString(), allowPostCreate);
        }
    }

    protected void setAttribute(String attribute, float[] value, boolean allowPostCreate) {
        if (!isCreated()) {
            JSOHelper.setAttribute(config, attribute, value);
        } else if (allowPostCreate) {
            setProperty(attribute, JSOHelper.convertToJavaScriptArray(value));
        } else {
            error(attribute, value.toString(), allowPostCreate);
        }
    }


}



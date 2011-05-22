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
 
package com.smartgwt.client.widgets.layout;



import com.smartgwt.client.event.*;
import com.smartgwt.client.core.*;
import com.smartgwt.client.types.*;
import com.smartgwt.client.data.*;
import com.smartgwt.client.data.events.*;
import com.smartgwt.client.rpc.*;
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
import com.smartgwt.client.widgets.tab.*;
import com.smartgwt.client.widgets.toolbar.*;
import com.smartgwt.client.widgets.tree.*;
import com.smartgwt.client.widgets.tree.events.*;
import com.smartgwt.client.widgets.viewer.*;
import com.smartgwt.client.widgets.calendar.*;
import com.smartgwt.client.widgets.calendar.events.*;
import com.smartgwt.client.widgets.cube.*;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;
import com.smartgwt.client.util.*;
import com.google.gwt.event.shared.*;
import com.google.gwt.event.shared.HasHandlers;

/**
 * A PortalLayout is a special subclass of Layout designed to display {@link com.smartgwt.client.widgets.layout.Portlet}
 * windows. A PortalLayout displays Portlets in columns and supports drag-drop interaction for moving  Portlets around
 * within the PortalLayout. Portlets may be drag-reordered within columns, dragged into other columns, or dragged next to
 * other Portlets to sit next to them horizontally within a column.
 */
public class PortalLayout extends Layout {

    public static PortalLayout getOrCreateRef(JavaScriptObject jsObj) {
        if(jsObj == null) return null;
        BaseWidget obj = BaseWidget.getRef(jsObj);
        if(obj != null) {
            return (PortalLayout) obj;
        } else {
            return new PortalLayout(jsObj);
        }
    }

    public PortalLayout(){
        scClassName = "PortalLayout";
    }

    public PortalLayout(JavaScriptObject jsObj){
        super(jsObj);
    }

    public PortalLayout(int numColumns) {
        setNumColumns(numColumns);
        scClassName = "PortalLayout";
    }

    protected native JavaScriptObject create()/*-{
        var config = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
        var scClassName = this.@com.smartgwt.client.widgets.BaseWidget::scClassName;
        var widget = $wnd.isc[scClassName].create(config);
        this.@com.smartgwt.client.widgets.BaseWidget::doInit()();
        return widget;
    }-*/;
    // ********************* Properties / Attributes ***********************

    /**
     * Are columns in this portalLayout drag-resizeable?
     * Set whether columns in this portalLayout are drag-resizable, and update any drawn columns to reflect this.
     *
     * @param canResizeColumns Whether columns are drag-resizable. Default value is false
     */
    public void setCanResizeColumns(Boolean canResizeColumns) {
        setAttribute("canResizeColumns", canResizeColumns, true);
    }

    /**
     * Are columns in this portalLayout drag-resizeable?
     *
     *
     * @return Boolean
     */
    public Boolean getCanResizeColumns()  {
        return getAttributeAsBoolean("canResizeColumns");
    }

    /**
     * Should vertical drag-resize of portlets within columns be allowed?
     * Set whether vertical drag-resize of portlets within columns is allowed, and update any drawn columns to reflect this.
     *
     * @param canResizeRows Whether drag-resize of portlets within columns is allowed. Default value is false
     */
    public void setCanResizeRows(Boolean canResizeRows) {
        setAttribute("canResizeRows", canResizeRows, true);
    }

    /**
     * Should vertical drag-resize of portlets within columns be allowed?
     *
     *
     * @return Boolean
     */
    public Boolean getCanResizeRows()  {
        return getAttributeAsBoolean("canResizeRows");
    }

    /**
     * Border to show around columns in this PortalLayout
     * Sets the columnBorder for to the specified value and updates any drawn columns to reflect this.
     *
     * @param columnBorder New border to show around columns. Default value is "1px solid gray"
     */
    public void setColumnBorder(String columnBorder) {
        setAttribute("columnBorder", columnBorder, true);
    }

    /**
     * Border to show around columns in this PortalLayout
     *
     *
     * @return String
     */
    public String getColumnBorder()  {
        return getAttributeAsString("columnBorder");
    }

    /**
     * Initial number of columns to show in this PortalLayout. Note that after initialization columns should be added / removed
     * via {@link com.smartgwt.client.widgets.layout.PortalLayout#addColumn PortalLayout.addColumn} and {@link
     * com.smartgwt.client.widgets.layout.PortalLayout#removeColumn PortalLayout.removeColumn}.
     *
     * @param numColumns numColumns Default value is 2
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setNumColumns(int numColumns)  throws IllegalStateException {
        setAttribute("numColumns", numColumns, false);
    }

    /**
     * Initial number of columns to show in this PortalLayout. Note that after initialization columns should be added / removed
     * via {@link com.smartgwt.client.widgets.layout.PortalLayout#addColumn PortalLayout.addColumn} and {@link
     * com.smartgwt.client.widgets.layout.PortalLayout#removeColumn PortalLayout.removeColumn}.
     *
     *
     * @return Returns the current number of columns displayed in this PortalLayout.
     */
    public int getNumColumns()  {
        return getAttributeAsInt("numColumns");
    }

    /**
     * Should a menu be shown within each column with options to add / remove columns?
     *
     * @param showColumnMenus showColumnMenus Default value is true
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setShowColumnMenus(Boolean showColumnMenus)  throws IllegalStateException {
        setAttribute("showColumnMenus", showColumnMenus, false);
    }

    /**
     * Should a menu be shown within each column with options to add / remove columns?
     *
     *
     * @return Boolean
     */
    public Boolean getShowColumnMenus()  {
        return getAttributeAsBoolean("showColumnMenus");
    }

    // ********************* Methods ***********************
            
    /**
     * Adds a new portal column to this layout at the specified position
     * @param index target position for the new column
     */
    public native void addColumn(int index) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.addColumn(index);
    }-*/;
            
    /**
     * Adds a {@link com.smartgwt.client.widgets.layout.Portlet} instance to this portalLayout in the specified position.
     * @param portlet Portlet to add to this layout.
     */
    public native void addPortlet(Portlet portlet) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.addPortlet(portlet.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()());
    }-*/;

    /**
     * Adds a {@link com.smartgwt.client.widgets.layout.Portlet} instance to this portalLayout in the specified position.
     * @param portlet Portlet to add to this layout.
     * @param colNum Column in which the Portlet should be added. If unspecified,  defaults to zero.
     * @param rowNum Position within the column for the Portlet
     */
    public native void addPortlet(Portlet portlet, int colNum, int rowNum) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.addPortlet(portlet.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()(), colNum, rowNum);
    }-*/;
            
    /**
     * This method is called when the user drops components into the rows or columns of this PortalLayout. <P> Overriding this
     * method allows you to modify drop behaviour when creating or reordering portlets via drag & drop. You can return the
     * dragTarget for the standard behavior,  or null to cancel the drop. <P> Otherwise, return the component you want to be
     * dropped (as for {@link com.smartgwt.client.widgets.layout.Layout#getDropComponent Layout.getDropComponent}).
     * @param dragTarget drag target
     * @param colNum indicates which column the portlet is being dropped on.
     * @param rowNum indicates the row number being dropped on.
     *
     * @return drop-component or custom Portlet to embed in the portalLayout. Returning  null will cancel the drop.
     */
    public native Canvas getDropPortlet(Canvas dragTarget, int colNum, int rowNum) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.getDropPortlet(dragTarget.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()(), colNum, rowNum);
        if(ret == null || ret === undefined) return null;
        var retVal = @com.smartgwt.client.widgets.BaseWidget::getRef(Lcom/google/gwt/core/client/JavaScriptObject;)(ret);
        if(retVal == null) {
            retVal = @com.smartgwt.client.widgets.Canvas::new(Lcom/google/gwt/core/client/JavaScriptObject;)(ret);
        }
        return retVal;
    }-*/;

    /**
     * This method is called when the user drops components into the rows or columns of this PortalLayout. <P> Overriding this
     * method allows you to modify drop behaviour when creating or reordering portlets via drag & drop. You can return the
     * dragTarget for the standard behavior,  or null to cancel the drop. <P> Otherwise, return the component you want to be
     * dropped (as for {@link com.smartgwt.client.widgets.layout.Layout#getDropComponent Layout.getDropComponent}).
     * @param dragTarget drag target
     * @param colNum indicates which column the portlet is being dropped on.
     * @param rowNum indicates the row number being dropped on.
     * @param dropPosition Drop position within an existing row. If the dropPosition   is null, then that means that a new row will be created.
     *
     * @return drop-component or custom Portlet to embed in the portalLayout. Returning  null will cancel the drop.
     */
    public native Canvas getDropPortlet(Canvas dragTarget, int colNum, int rowNum, int dropPosition) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.getDropPortlet(dragTarget.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()(), colNum, rowNum, dropPosition);
        if(ret == null || ret === undefined) return null;
        var retVal = @com.smartgwt.client.widgets.BaseWidget::getRef(Lcom/google/gwt/core/client/JavaScriptObject;)(ret);
        if(retVal == null) {
            retVal = @com.smartgwt.client.widgets.Canvas::new(Lcom/google/gwt/core/client/JavaScriptObject;)(ret);
        }
        return retVal;
    }-*/;
            
    /**
     * Removes the specified column from this layout. All portlets displayed within this column will be destroyed when the
     * column is removed.
     * @param index column number to remove
     */
    public native void removeColumn(int index) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.removeColumn(index);
    }-*/;
            
    /**
     * Removes a {@link com.smartgwt.client.widgets.layout.Portlet} which is currently rendered in this PortalLayout. Portlet
     * will not be destroyed by default - if this is desired the calling code should do this explicitly.
     * @param portlet portlet to remove
     */
    public native void removePortlet(Portlet portlet) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.removePortlet(portlet.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()());
    }-*/;

    // ********************* Static Methods ***********************
    /**
     * Class level method to set the default properties of this class. If set, then all subsequent instances of this
     * class will automatically have the default properties that were set when this method was called. This is a powerful
     * feature that eliminates the need for users to create a separate hierarchy of subclasses that only alter the default
     * properties of this class. Can also be used for skinning / styling purposes.
     * <P>
     * <b>Note:</b> This method is intended for setting default attributes only and will effect all instances of the
     * underlying class (including those automatically generated in JavaScript). 
     * This method should not be used to apply standard EventHandlers or override methods for
     * a class - use a custom subclass instead.
     *
     * @param portalLayoutProperties properties that should be used as new defaults when instances of this class are created
     */
    public static native void setDefaultProperties(PortalLayout portalLayoutProperties) /*-{
    	var properties = $wnd.isc.addProperties({},portalLayoutProperties.@com.smartgwt.client.widgets.BaseWidget::getConfig()());
    	delete properties.ID;
        $wnd.isc.PortalLayout.addProperties(properties);
    }-*/;
        
    // ***********************************************************        



    public void onInit () {
        super.onInit();
        onInit_PortalLayout();
    }
    
    protected native void onInit_PortalLayout () /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        
        self.__getDropPortlet = self.getDropPortlet;
        self.getDropPortlet = $entry(function(dragTarget, rowNum, colNum, dropPosition) {
            var jObj = this.__ref;
            
            if (jObj == null) return this.__getDropPortlet(dragTarget, rowNum,colNum,dropPosition);
            
            var dragTargetJ = @com.smartgwt.client.widgets.Canvas::getOrCreateRef(Lcom/google/gwt/core/client/JavaScriptObject;)(dragTarget);
            var rowNumJ = @java.lang.Integer::new(I)(rowNum);
            var colNumJ = @java.lang.Integer::new(I)(colNum);
            var dropPositionJ = dropPosition == null ? null : @java.lang.Integer::new(I)(dropPosition);
            var jPortlet = jObj.@com.smartgwt.client.widgets.layout.PortalLayout::getDropPortlet(Lcom/smartgwt/client/widgets/Canvas;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)(dragTargetJ,rowNumJ,colNumJ,dropPositionJ);
            return jPortlet.@com.smartgwt.client.widgets.Canvas::getOrCreateJsObj()();

        });
        
    }-*/;
    
    /**
     * This method is called when the user drops components into the rows or columns of this PortalLayout. <P> Overriding this
     * method allows you to modify drop behaviour when creating or reordering portlets via drag & drop. You can return the
     * dragTarget for the standard behavior,  or null to cancel the drop. <P> Otherwise, return the component you want to be
     * dropped (as for {@link com.smartgwt.client.widgets.layout.Layout#getDropComponent Layout.getDropComponent}).
     * <P>
     * <b>Note: this is an override point.</b>
     * 
     * @param dragTarget the component being dragged
     * @param colNum indicates which column the portlet is being dropped on.
     * @param rowNum indicates the row number being dropped on.
     * @param dropPosition Drop position within an existing row. If the dropPosition   is null, then that means that a new row will be created.
     *
     * @return drop-component or custom Portlet to embed in the portalLayout. Returning  null will cancel the drop.
     */
    public native Canvas getDropPortlet(Canvas dragTarget, Integer colNum, Integer rowNum, Integer dropPosition) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var dragTargetJS = dragTarget.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        
        var ret = self.__getDropPortlet(dragTargetJS, colNum, rowNum, dropPosition);
        if(ret == null || ret === undefined) return null;
        var retVal = @com.smartgwt.client.widgets.BaseWidget::getRef(Lcom/google/gwt/core/client/JavaScriptObject;)(ret);
        if(retVal == null) {
            retVal = @com.smartgwt.client.widgets.Canvas::new(Lcom/google/gwt/core/client/JavaScriptObject;)(ret);
        }
        return retVal;
    }-*/;



}




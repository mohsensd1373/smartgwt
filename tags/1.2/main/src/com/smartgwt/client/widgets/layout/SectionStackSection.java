/*
 * SmartGWT (GWT for SmartClient)
 * Copyright 2008 and beyond, Isomorphic Software, Inc.
 *
 * SmartGWT is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.  SmartGWT is also
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
import com.smartgwt.client.widgets.layout.*;
import com.smartgwt.client.widgets.menu.*;
import com.smartgwt.client.widgets.tab.*;
import com.smartgwt.client.widgets.toolbar.*;
import com.smartgwt.client.widgets.tree.*;
import com.smartgwt.client.widgets.tree.events.*;
import com.smartgwt.client.widgets.viewer.*;
import com.smartgwt.client.widgets.calendar.*;
import com.smartgwt.client.widgets.calendar.events.*;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;
import com.smartgwt.client.util.JSOHelper;
import com.smartgwt.client.util.EnumUtil;
import com.google.gwt.event.shared.*;
import com.google.gwt.event.shared.HasHandlers;

/**
 * Section descriptor used by a SectionStack to describe a section of items which are shown or hidden together, and their
 * associated header.
 */
public class SectionStackSection extends RefDataClass {

    public static SectionStackSection getOrCreateRef(JavaScriptObject jsObj) {
        if(jsObj == null) return null;
        RefDataClass obj = RefDataClass.getRef(jsObj);
        if(obj != null) {
            obj.setJsObj(jsObj);
            return (SectionStackSection) obj;
        } else {
            return new SectionStackSection(jsObj);
        }
    }

    public SectionStackSection(){
        
    }

    public SectionStackSection(JavaScriptObject jsObj){
        super(jsObj);
    }

    public SectionStackSection(String title) {
        setTitle(title);
        
    }

    // ********************* Properties / Attributes ***********************

    /**
     * Optional ID for the section.  This can be used later in calls to {@link com.smartgwt.client.widgets.layout.SectionStack}
     * APIs such as {@link com.smartgwt.client.widgets.layout.SectionStack#expandSection} and {@link
     * com.smartgwt.client.widgets.layout.SectionStack#collapseSection}.
     *
     * @param ID ID Default value is null
     */
    public void setID(String ID) {
        setAttribute("ID", ID);
    }

    /**
     * Optional ID for the section.  This can be used later in calls to {@link com.smartgwt.client.widgets.layout.SectionStack}
     * APIs such as {@link com.smartgwt.client.widgets.layout.SectionStack#expandSection} and {@link
     * com.smartgwt.client.widgets.layout.SectionStack#collapseSection}.
     *
     *
     * @return String
     */
    public String getID()  {
        return getAttributeAsString("ID");
    }

    /**
     * Title to show for the section
     *
     * @param title title Default value is null
     */
    public void setTitle(String title) {
        setAttribute("title", title);
    }

    /**
     * Title to show for the section
     *
     *
     * @return String
     */
    public String getTitle()  {
        return getAttributeAsString("title");
    }

    /**
     * If true, a header will be shown for this section.  If false, no header will be shown.
     *
     * @param showHeader showHeader Default value is true
     */
    public void setShowHeader(Boolean showHeader) {
        setAttribute("showHeader", showHeader);
    }

    /**
     * If set to false, then the items in this section will not be resized by sectionHeader repositioning.  You may also set
     * this flag directly on any of the items in any section to cause that item to not be resizeable.
     *
     * @param resizeable resizeable Default value is null
     */
    public void setResizeable(Boolean resizeable) {
        setAttribute("resizeable", resizeable);
    }

    /**
     * Sections default to the collapsed state unless {@link
     * com.smartgwt.client.widgets.layout.SectionStackSection#getShowHeader showHeader} is set to <code>false</code> in which
     * case they default to the expanded state.  This attribute allows you to explicitly control the expand/collapse state of
     * the section by overriding the above default behavior.
     *
     * @param expanded expanded Default value is false
     */
    public void setExpanded(Boolean expanded) {
        setAttribute("expanded", expanded);
    }

    /**
     * Sections default to the visible state.  This attribute allows you to explicitly control the visible/hidden state of the
     * section by overriding the above default behavior.
     *
     * @param hidden hidden Default value is false
     */
    public void setHidden(Boolean hidden) {
        setAttribute("hidden", hidden);
    }

    /**
     * This attribute controls whether or not the expand/collapse UI control is shown on the header of this section.  Any
     * section can still be expanded/collapsed programmatically, regardless of this setting.
     *
     * @param canCollapse canCollapse Default value is true
     */
    public void setCanCollapse(Boolean canCollapse) {
        setAttribute("canCollapse", canCollapse);
    }

    // ********************* Methods ***********************

    // ********************* Static Methods ***********************




    /**
     * List of Canvases that constitute the section. These Canvases will be shown and hidden together.
     *
     * @param items list of Canvases that constitute the section
     */
    public void setItems(Canvas... items) {
        for (Canvas item : items) {
            addItem(item);
        }
    }

    /**
     * Return the items in this SectionStackSection
     *
     * @return the items in this SectionStackSection
     */
    public native Canvas[] getItems() /*-{
		var jsObj = this.@com.smartgwt.client.core.DataClass::getJsObj()();

        if(!jsObj.items) {
            jsObj.items = @com.smartgwt.client.util.JSOHelper::createJavaScriptArray()();
        }
        return @com.smartgwt.client.widgets.Canvas::convertToCanvasArray(Lcom/google/gwt/core/client/JavaScriptObject;)(jsObj.items);
    }-*/;

    public void addItem(Canvas item) {
        addItemJS(item.getOrCreateJsObj());
    }

    private native void addItemJS(JavaScriptObject componentJS) /*-{
		var jsObj = this.@com.smartgwt.client.core.DataClass::getJsObj()();

        if(!jsObj.items) {
            jsObj.items = @com.smartgwt.client.util.JSOHelper::createJavaScriptArray()();
        }
        jsObj.items.push(componentJS);
    }-*/;

    public void setControls(Canvas... controls) {
        setAttribute("controls", controls);
    }

}



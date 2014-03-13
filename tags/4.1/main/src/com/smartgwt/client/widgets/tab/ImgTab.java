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
 
package com.smartgwt.client.widgets.tab;


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
 * Specialized StretchImgButton used by TabSet/TabBar for tabs
 */
@BeanFactory.FrameworkClass
@BeanFactory.ScClassName("ImgTab")
public class ImgTab extends StretchImgButton {

    public static ImgTab getOrCreateRef(JavaScriptObject jsObj) {
        if (jsObj == null) return null;
        final BaseWidget refInstance = BaseWidget.getRef(jsObj);
        if (refInstance == null) {
            return new ImgTab(jsObj);
        } else {
            assert refInstance instanceof ImgTab;
            return (ImgTab)refInstance;
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
        $wnd.isc.ImgTab.changeDefaults(autoChildName + "Defaults", defaults.@com.smartgwt.client.widgets.Canvas::getConfig()());
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
        $wnd.isc.ImgTab.changeDefaults(autoChildName + "Defaults", defaults.@com.smartgwt.client.widgets.form.fields.FormItem::getJsObj()());
    }-*/;

    public ImgTab(){
        scClassName = "ImgTab";
    }

    public ImgTab(JavaScriptObject jsObj){
        scClassName = "ImgTab";
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
     * Alignment of title text
     *
     * @param align  Default value is Canvas.CENTER
     * @see com.smartgwt.client.docs.Positioning Positioning overview and related methods
     */
    public void setAlign(Alignment align) {
        setAttribute("align", align == null ? null : align.getValue(), true);
    }

    /**
     * Alignment of title text
     *
     * @return Alignment
     * @see com.smartgwt.client.docs.Positioning Positioning overview and related methods
     */
    public Alignment getAlign()  {
        return EnumUtil.getEnum(Alignment.values(), getAttribute("align"));
    }

    /**
     * 
     *
     * @param baseStyle  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} . Default value is "tab"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setBaseStyle(String baseStyle)  throws IllegalStateException {
        setAttribute("baseStyle", baseStyle, false);
    }

    /**
     * 
     *
     * @return  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} 
     */
    public String getBaseStyle()  {
        return getAttributeAsString("baseStyle");
    }

    /**
     * How big are the end pieces by default
     *
     * @param capSize  Default value is 2
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setCapSize(int capSize) {
        setAttribute("capSize", capSize, true);
    }

    /**
     * How big are the end pieces by default
     *
     * @return int
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public int getCapSize()  {
        return getAttributeAsInt("capSize");
    }

    /**
     * Base path for images shown within this ImgTab's label. This will be used for icons (such as the close icon) by default.
     *
     * @param labelSkinImgDir  Default value is "images/"
     */
    public void setLabelSkinImgDir(String labelSkinImgDir) {
        setAttribute("labelSkinImgDir", labelSkinImgDir, true);
    }

    /**
     * Base path for images shown within this ImgTab's label. This will be used for icons (such as the close icon) by default.
     *
     * @return String
     */
    public String getLabelSkinImgDir()  {
        return getAttributeAsString("labelSkinImgDir");
    }

    /**
     * Should we visibly change state when the tab receives keyboard focus?
     *
     * @param showFocused  Default value is true
     */
    public void setShowFocused(Boolean showFocused) {
        setAttribute("showFocused", showFocused, true);
    }

    /**
     * Should we visibly change state when the tab receives keyboard focus?
     *
     * @return Boolean
     */
    public Boolean getShowFocused()  {
        return getAttributeAsBoolean("showFocused");
    }

    /**
     * Should we visibly change state when the mouse goes over this tab
     *
     * @param showRollOver  Default value is false
     */
    public void setShowRollOver(Boolean showRollOver) {
        setAttribute("showRollOver", showRollOver, true);
    }

    /**
     * Should we visibly change state when the mouse goes over this tab
     *
     * @return Boolean
     */
    public Boolean getShowRollOver()  {
        return getAttributeAsBoolean("showRollOver");
    }

    /**
     * Base path for the images.   <B>Note</B> that when used within a TabSet, the {@link
     * com.smartgwt.client.widgets.tab.TabSet#getTabBarPosition tabBarPosition} is appended as an additional path segment,
     * yielding "images/Tab/top/" et al.
     *
     * @param skinImgDir  Default value is "images/Tab/"
     */
    public void setSkinImgDir(String skinImgDir) {
        setAttribute("skinImgDir", skinImgDir, true);
    }

    /**
     * Base path for the images.   <B>Note</B> that when used within a TabSet, the {@link
     * com.smartgwt.client.widgets.tab.TabSet#getTabBarPosition tabBarPosition} is appended as an additional path segment,
     * yielding "images/Tab/top/" et al.
     *
     * @return String
     */
    public String getSkinImgDir()  {
        return getAttributeAsString("skinImgDir");
    }

    /**
     * Base URL for tab images
     *
     * @param src  Default value is "tab.gif"
     */
    public void setSrc(String src) {
        setAttribute("src", src, true);
    }

    /**
     * Base URL for tab images
     *
     * @return String
     */
    public String getSrc()  {
        return getAttributeAsString("src");
    }

    /**
     * Like {@link com.smartgwt.client.widgets.StretchImgButton#getTitleStyle titleStyle}, can set to provide a separate style
     * for the title text. <P> If set and the ImgTab is {@link com.smartgwt.client.widgets.StretchImgButton#getVertical
     * vertical}, a "v" will be automatically prepended to the style name (hence "tabTitle" -> "vtabTitle").
     *
     * @param titleStyle  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} . Default value is null
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setTitleStyle(String titleStyle)  throws IllegalStateException {
        setAttribute("titleStyle", titleStyle, false);
    }

    /**
     * Like {@link com.smartgwt.client.widgets.StretchImgButton#getTitleStyle titleStyle}, can set to provide a separate style
     * for the title text. <P> If set and the ImgTab is {@link com.smartgwt.client.widgets.StretchImgButton#getVertical
     * vertical}, a "v" will be automatically prepended to the style name (hence "tabTitle" -> "vtabTitle").
     *
     * @return  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} 
     */
    public String getTitleStyle()  {
        return getAttributeAsString("titleStyle");
    }

    // ********************* Methods ***********************

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
     * @param imgTabProperties properties that should be used as new defaults when instances of this class are created
     */
    public static native void setDefaultProperties(ImgTab imgTabProperties) /*-{
    	var properties = $wnd.isc.addProperties({},imgTabProperties.@com.smartgwt.client.widgets.BaseWidget::getConfig()());
        @com.smartgwt.client.util.JSOHelper::cleanProperties(Lcom/google/gwt/core/client/JavaScriptObject;Z)(properties,false);
        $wnd.isc.ImgTab.addProperties(properties);
    }-*/;

    // ***********************************************************

    public LogicalStructureObject setLogicalStructure(ImgTabLogicalStructure s) {
        super.setLogicalStructure(s);
        try {
            s.align = getAttributeAsString("align");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ImgTab.align:" + t.getMessage() + "\n";
        }
        try {
            s.baseStyle = getAttributeAsString("baseStyle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ImgTab.baseStyle:" + t.getMessage() + "\n";
        }
        try {
            s.capSize = getAttributeAsString("capSize");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ImgTab.capSize:" + t.getMessage() + "\n";
        }
        try {
            s.labelSkinImgDir = getAttributeAsString("labelSkinImgDir");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ImgTab.labelSkinImgDir:" + t.getMessage() + "\n";
        }
        try {
            s.showFocused = getAttributeAsString("showFocused");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ImgTab.showFocused:" + t.getMessage() + "\n";
        }
        try {
            s.showRollOver = getAttributeAsString("showRollOver");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ImgTab.showRollOver:" + t.getMessage() + "\n";
        }
        try {
            s.skinImgDir = getAttributeAsString("skinImgDir");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ImgTab.skinImgDir:" + t.getMessage() + "\n";
        }
        try {
            s.src = getAttributeAsString("src");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ImgTab.src:" + t.getMessage() + "\n";
        }
        try {
            s.titleStyle = getAttributeAsString("titleStyle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ImgTab.titleStyle:" + t.getMessage() + "\n";
        }
        return s;
    }

    public LogicalStructureObject getLogicalStructure() {
        ImgTabLogicalStructure s = new ImgTabLogicalStructure();
        setLogicalStructure(s);
        return s;
    }
}


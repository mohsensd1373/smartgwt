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
 
package com.smartgwt.client.widgets.form;


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
 * The ColorPicker widget allows the user to select a color from anywhere in the  color spectrum. It also supports
 * selecting the alpha (opacity) value of the  color.  The picker supports a simple mode - which allows for one-click
 * selection from a standard palette of colors - and a complex mode which allow the user to define any conceivable color.
 * It is possible for the user to switch from simple mode to complex by interacting with the widget.  In general, the
 * widget provides very similar functionality to the color picker dialogs found in graphics packages and other desktop
 * software.
 */
@BeanFactory.FrameworkClass
@BeanFactory.ScClassName("ColorPicker")
public class ColorPicker extends Window implements com.smartgwt.client.widgets.form.events.HasColorSelectedHandlers {

    public static ColorPicker getOrCreateRef(JavaScriptObject jsObj) {
        if (jsObj == null) return null;
        final BaseWidget refInstance = BaseWidget.getRef(jsObj);
        if (refInstance == null) {
            return new ColorPicker(jsObj);
        } else {
            assert refInstance instanceof ColorPicker;
            return (ColorPicker)refInstance;
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
        $wnd.isc.ColorPicker.changeDefaults(autoChildName + "Defaults", defaults.@com.smartgwt.client.widgets.Canvas::getConfig()());
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
        $wnd.isc.ColorPicker.changeDefaults(autoChildName + "Defaults", defaults.@com.smartgwt.client.widgets.form.fields.FormItem::getJsObj()());
    }-*/;

    public ColorPicker(){
        scClassName = "ColorPicker";
    }

    public ColorPicker(JavaScriptObject jsObj){
        scClassName = "ColorPicker";
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
     * Should the "complex" mode be allowed for this ColorPicker? If false, no "More" button is shown on the simple picker
     *
     * @param allowComplexMode  Default value is true
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setAllowComplexMode(Boolean allowComplexMode)  throws IllegalStateException {
        setAttribute("allowComplexMode", allowComplexMode, false);
    }

    /**
     * Should the "complex" mode be allowed for this ColorPicker? If false, no "More" button is shown on the simple picker
     *
     * @return Boolean
     */
    public Boolean getAllowComplexMode()  {
        return getAttributeAsBoolean("allowComplexMode");
    }
    

    /**
     * If {@link com.smartgwt.client.widgets.form.ColorPicker#getAutoPosition autoPosition} is false, this property controls
     * whether to automatically center the colorPicker every time it is reshown with the show() method.
     *
     * @param autoCenterOnShow  Default value is true
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.widgets.form.ColorPicker#setAutoPosition
     */
    public void setAutoCenterOnShow(Boolean autoCenterOnShow)  throws IllegalStateException {
        setAttribute("autoCenterOnShow", autoCenterOnShow, false);
    }

    /**
     * If {@link com.smartgwt.client.widgets.form.ColorPicker#getAutoPosition autoPosition} is false, this property controls
     * whether to automatically center the colorPicker every time it is reshown with the show() method.
     *
     * @return Boolean
     * @see com.smartgwt.client.widgets.form.ColorPicker#getAutoPosition
     */
    public Boolean getAutoCenterOnShow()  {
        return getAttributeAsBoolean("autoCenterOnShow");
    }
    

    /**
     * If true, causes the ColorPicker to appear near where the mouse was last clicked. If false, the ColorPicker is centered
     * on first show; depending on the value of  {@link com.smartgwt.client.widgets.form.ColorPicker#getAutoCenterOnShow
     * autoCenterOnShow}, it either reappears wherever it was last shown after hide/show(),  or centered regardless of where it
     * was last shown.
     *
     * @param autoPosition  Default value is true
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.widgets.form.ColorPicker#setAutoCenterOnShow
     */
    public void setAutoPosition(Boolean autoPosition)  throws IllegalStateException {
        setAttribute("autoPosition", autoPosition, false);
    }

    /**
     * If true, causes the ColorPicker to appear near where the mouse was last clicked. If false, the ColorPicker is centered
     * on first show; depending on the value of  {@link com.smartgwt.client.widgets.form.ColorPicker#getAutoCenterOnShow
     * autoCenterOnShow}, it either reappears wherever it was last shown after hide/show(),  or centered regardless of where it
     * was last shown.
     *
     * @return Boolean
     * @see com.smartgwt.client.widgets.form.ColorPicker#getAutoCenterOnShow
     */
    public Boolean getAutoPosition()  {
        return getAttributeAsBoolean("autoPosition");
    }
    

    /**
     * The label shown above the basic color blocks.
     *
     * @param basicColorLabel  See {@link com.smartgwt.client.docs.HTMLString HTMLString} . Default value is "Basic Colors:"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setBasicColorLabel(String basicColorLabel)  throws IllegalStateException {
        setAttribute("basicColorLabel", basicColorLabel, false);
    }

    /**
     * The label shown above the basic color blocks.
     *
     * @return  See {@link com.smartgwt.client.docs.HTMLString HTMLString} 
     */
    public String getBasicColorLabel()  {
        return getAttributeAsString("basicColorLabel");
    }
    

    /**
     * The text to show when the mouse hovers over the 'Blue' field in the complex chooser.
     *
     * @param blueFieldPrompt  See {@link com.smartgwt.client.docs.HTMLString HTMLString} . Default value is "The Blue component of the selected color"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setBlueFieldPrompt(String blueFieldPrompt)  throws IllegalStateException {
        setAttribute("blueFieldPrompt", blueFieldPrompt, false);
    }

    /**
     * The text to show when the mouse hovers over the 'Blue' field in the complex chooser.
     *
     * @return  See {@link com.smartgwt.client.docs.HTMLString HTMLString} 
     */
    public String getBlueFieldPrompt()  {
        return getAttributeAsString("blueFieldPrompt");
    }
    

    /**
     * The title for the 'Blue' field in the complex chooser.
     *
     * @param blueFieldTitle  See {@link com.smartgwt.client.docs.HTMLString HTMLString} . Default value is "Blue"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setBlueFieldTitle(String blueFieldTitle)  throws IllegalStateException {
        setAttribute("blueFieldTitle", blueFieldTitle, false);
    }

    /**
     * The title for the 'Blue' field in the complex chooser.
     *
     * @return  See {@link com.smartgwt.client.docs.HTMLString HTMLString} 
     */
    public String getBlueFieldTitle()  {
        return getAttributeAsString("blueFieldTitle");
    }
    

    /**
     * Cancel button for the ColorPicker
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return IButton
     * @throws IllegalStateException if this widget has not yet been rendered.
     */
    public IButton getCancelButton() throws IllegalStateException {
        errorIfNotCreated("cancelButton");
        return (IButton)IButton.getByJSObject(getAttributeAsJavaScriptObject("cancelButton"));
    }
    
    

    /**
     * The title for the 'Cancel' button.
     *
     * @param cancelButtonTitle  See {@link com.smartgwt.client.docs.HTMLString HTMLString} . Default value is "Cancel"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setCancelButtonTitle(String cancelButtonTitle)  throws IllegalStateException {
        setAttribute("cancelButtonTitle", cancelButtonTitle, false);
    }

    /**
     * The title for the 'Cancel' button.
     *
     * @return  See {@link com.smartgwt.client.docs.HTMLString HTMLString} 
     */
    public String getCancelButtonTitle()  {
        return getAttributeAsString("cancelButtonTitle");
    }
    
    

    /**
     * Base CSS style applied to the basic color boxes
     *
     * @param colorButtonBaseStyle  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} . Default value is "ColorChooserCell"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setColorButtonBaseStyle(String colorButtonBaseStyle)  throws IllegalStateException {
        setAttribute("colorButtonBaseStyle", colorButtonBaseStyle, false);
    }

    /**
     * Base CSS style applied to the basic color boxes
     *
     * @return  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} 
     */
    public String getColorButtonBaseStyle()  {
        return getAttributeAsString("colorButtonBaseStyle");
    }
    

    /**
     * Width and height of the basic color boxes (they are always square, and they are all the same size).
     *
     * @param colorButtonSize  Default value is 20
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setColorButtonSize(int colorButtonSize)  throws IllegalStateException {
        setAttribute("colorButtonSize", colorButtonSize, false);
    }

    /**
     * Width and height of the basic color boxes (they are always square, and they are all the same size).
     *
     * @return int
     */
    public int getColorButtonSize()  {
        return getAttributeAsInt("colorButtonSize");
    }
    

    /**
     * The location of the crosshair image file
     *
     * @param crosshairImageURL  See {@link com.smartgwt.client.docs.SCImgURL SCImgURL} . Default value is "[SKIN]ColorPicker/crosshair.png"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setCrosshairImageURL(String crosshairImageURL)  throws IllegalStateException {
        setAttribute("crosshairImageURL", crosshairImageURL, false);
    }

    /**
     * The location of the crosshair image file
     *
     * @return  See {@link com.smartgwt.client.docs.SCImgURL SCImgURL} 
     */
    public String getCrosshairImageURL()  {
        return getAttributeAsString("crosshairImageURL");
    }
    

    /**
     * The default color. This is the color that is selected when the picker first loads
     *
     * @param defaultColor  Default value is #808080
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setDefaultColor(String defaultColor)  throws IllegalStateException {
        setAttribute("defaultColor", defaultColor, false);
    }

    /**
     * The default color. This is the color that is selected when the picker first loads
     *
     * @return String
     */
    public String getDefaultColor()  {
        return getAttributeAsString("defaultColor");
    }
    

    /**
     * The initial opacity value for the component, as a percentage value between 0 and 100
     *
     * @param defaultOpacity  Default value is 100
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setDefaultOpacity(int defaultOpacity)  throws IllegalStateException {
        setAttribute("defaultOpacity", defaultOpacity, false);
    }

    /**
     * The initial opacity value for the component, as a percentage value between 0 and 100
     *
     * @return int
     */
    public int getDefaultOpacity()  {
        return getAttributeAsInt("defaultOpacity");
    }
    

    /**
     * The <code>ColorPicker</code> can operate in either a "simple" mode (where it displays just the 40 basic colors and
     * allows the user to click one), or a "complex" mode (where the user can specify a color from anywhere in the spectrum,
     * with an optional alpha element). The <code>defaultPickMode</code> attribute specifies which of these two modes is in
     * force when the picker first loads.
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Changes the pick mode of this <code>ColorPicker</code> to <code>pickMode</code>. <p> Note: It is not allowed to set the pick mode to  {@link com.smartgwt.client.types.ColorPickerMode#COMPLEX} if {@link com.smartgwt.client.widgets.form.ColorPicker#getAllowComplexMode allowComplexMode} is <code>false</code>.
     *
     * @param defaultPickMode the new pick mode.. Default value is "simple"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.widgets.form.ColorPicker#setAllowComplexMode
     */
    public void setDefaultPickMode(ColorPickerMode defaultPickMode)  throws IllegalStateException {
        setAttribute("defaultPickMode", defaultPickMode == null ? null : defaultPickMode.getValue(), false);
    }

    /**
     * The <code>ColorPicker</code> can operate in either a "simple" mode (where it displays just the 40 basic colors and
     * allows the user to click one), or a "complex" mode (where the user can specify a color from anywhere in the spectrum,
     * with an optional alpha element). The <code>defaultPickMode</code> attribute specifies which of these two modes is in
     * force when the picker first loads.
     *
     * @return ColorPickerMode
     * @see com.smartgwt.client.widgets.form.ColorPicker#getAllowComplexMode
     */
    public ColorPickerMode getDefaultPickMode()  {
        return EnumUtil.getEnum(ColorPickerMode.values(), getAttribute("defaultPickMode"));
    }
    

    /**
     * The text to show when the mouse hovers over the 'Green' field in the complex chooser.
     *
     * @param greenFieldPrompt  See {@link com.smartgwt.client.docs.HTMLString HTMLString} . Default value is "The Green component of the selected color"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setGreenFieldPrompt(String greenFieldPrompt)  throws IllegalStateException {
        setAttribute("greenFieldPrompt", greenFieldPrompt, false);
    }

    /**
     * The text to show when the mouse hovers over the 'Green' field in the complex chooser.
     *
     * @return  See {@link com.smartgwt.client.docs.HTMLString HTMLString} 
     */
    public String getGreenFieldPrompt()  {
        return getAttributeAsString("greenFieldPrompt");
    }
    

    /**
     * The title for the 'Green' field in the complex chooser.
     *
     * @param greenFieldTitle  See {@link com.smartgwt.client.docs.HTMLString HTMLString} . Default value is "Green"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setGreenFieldTitle(String greenFieldTitle)  throws IllegalStateException {
        setAttribute("greenFieldTitle", greenFieldTitle, false);
    }

    /**
     * The title for the 'Green' field in the complex chooser.
     *
     * @return  See {@link com.smartgwt.client.docs.HTMLString HTMLString} 
     */
    public String getGreenFieldTitle()  {
        return getAttributeAsString("greenFieldTitle");
    }
    

    /**
     * The text to show when the mouse hovers over the 'HTML' field in the complex chooser.
     *
     * @param htmlFieldPrompt  See {@link com.smartgwt.client.docs.HTMLString HTMLString} . Default value is "The selected color&#39;s HTML coding"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setHtmlFieldPrompt(String htmlFieldPrompt)  throws IllegalStateException {
        setAttribute("htmlFieldPrompt", htmlFieldPrompt, false);
    }

    /**
     * The text to show when the mouse hovers over the 'HTML' field in the complex chooser.
     *
     * @return  See {@link com.smartgwt.client.docs.HTMLString HTMLString} 
     */
    public String getHtmlFieldPrompt()  {
        return getAttributeAsString("htmlFieldPrompt");
    }
    

    /**
     * The title for the 'HTML' field in the complex chooser.
     *
     * @param htmlFieldTitle  See {@link com.smartgwt.client.docs.HTMLString HTMLString} . Default value is "HTML"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setHtmlFieldTitle(String htmlFieldTitle)  throws IllegalStateException {
        setAttribute("htmlFieldTitle", htmlFieldTitle, false);
    }

    /**
     * The title for the 'HTML' field in the complex chooser.
     *
     * @return  See {@link com.smartgwt.client.docs.HTMLString HTMLString} 
     */
    public String getHtmlFieldTitle()  {
        return getAttributeAsString("htmlFieldTitle");
    }
    

    /**
     * The text to show when the mouse hovers over the 'Hue' field in the complex chooser.
     *
     * @param hueFieldPrompt  See {@link com.smartgwt.client.docs.HTMLString HTMLString} . Default value is "The Hue (base tone) of the selected color"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setHueFieldPrompt(String hueFieldPrompt)  throws IllegalStateException {
        setAttribute("hueFieldPrompt", hueFieldPrompt, false);
    }

    /**
     * The text to show when the mouse hovers over the 'Hue' field in the complex chooser.
     *
     * @return  See {@link com.smartgwt.client.docs.HTMLString HTMLString} 
     */
    public String getHueFieldPrompt()  {
        return getAttributeAsString("hueFieldPrompt");
    }
    

    /**
     * The title for the 'Hue' field in the complex chooser.
     *
     * @param hueFieldTitle  See {@link com.smartgwt.client.docs.HTMLString HTMLString} . Default value is "Hue"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setHueFieldTitle(String hueFieldTitle)  throws IllegalStateException {
        setAttribute("hueFieldTitle", hueFieldTitle, false);
    }

    /**
     * The title for the 'Hue' field in the complex chooser.
     *
     * @return  See {@link com.smartgwt.client.docs.HTMLString HTMLString} 
     */
    public String getHueFieldTitle()  {
        return getAttributeAsString("hueFieldTitle");
    }
    

    /**
     * The title for the button that switches to a less complex view.
     *
     * @param lessButtonTitle  See {@link com.smartgwt.client.docs.HTMLString HTMLString} . Default value is "<< Less"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setLessButtonTitle(String lessButtonTitle)  throws IllegalStateException {
        setAttribute("lessButtonTitle", lessButtonTitle, false);
    }

    /**
     * The title for the button that switches to a less complex view.
     *
     * @return  See {@link com.smartgwt.client.docs.HTMLString HTMLString} 
     */
    public String getLessButtonTitle()  {
        return getAttributeAsString("lessButtonTitle");
    }
    

    /**
     * The text to show when the mouse hovers over the 'Luminosity' field in the complex chooser.
     *
     * @param lumFieldPrompt  See {@link com.smartgwt.client.docs.HTMLString HTMLString} . Default value is "The Luminosity (brightness) of the selected color"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setLumFieldPrompt(String lumFieldPrompt)  throws IllegalStateException {
        setAttribute("lumFieldPrompt", lumFieldPrompt, false);
    }

    /**
     * The text to show when the mouse hovers over the 'Luminosity' field in the complex chooser.
     *
     * @return  See {@link com.smartgwt.client.docs.HTMLString HTMLString} 
     */
    public String getLumFieldPrompt()  {
        return getAttributeAsString("lumFieldPrompt");
    }
    

    /**
     * The title for the 'Luminosity' field in the complex chooser.
     *
     * @param lumFieldTitle  See {@link com.smartgwt.client.docs.HTMLString HTMLString} . Default value is "Luminosity"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setLumFieldTitle(String lumFieldTitle)  throws IllegalStateException {
        setAttribute("lumFieldTitle", lumFieldTitle, false);
    }

    /**
     * The title for the 'Luminosity' field in the complex chooser.
     *
     * @return  See {@link com.smartgwt.client.docs.HTMLString HTMLString} 
     */
    public String getLumFieldTitle()  {
        return getAttributeAsString("lumFieldTitle");
    }
    

    /**
     * Width of the Luminosity bar
     *
     * @param lumWidth  Default value is 15
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setLumWidth(int lumWidth)  throws IllegalStateException {
        setAttribute("lumWidth", lumWidth, false);
    }

    /**
     * Width of the Luminosity bar
     *
     * @return int
     */
    public int getLumWidth()  {
        return getAttributeAsInt("lumWidth");
    }
    

    /**
     * "More"/"Less" button for the ColorPicker
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return IButton
     * @throws IllegalStateException if this widget has not yet been rendered.
     */
    public IButton getModeToggleButton() throws IllegalStateException {
        errorIfNotCreated("modeToggleButton");
        return (IButton)IButton.getByJSObject(getAttributeAsJavaScriptObject("modeToggleButton"));
    }
    
    

    /**
     * The title for the button that switches to a more complex view.
     *
     * @param moreButtonTitle  See {@link com.smartgwt.client.docs.HTMLString HTMLString} . Default value is "More >>"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setMoreButtonTitle(String moreButtonTitle)  throws IllegalStateException {
        setAttribute("moreButtonTitle", moreButtonTitle, false);
    }

    /**
     * The title for the button that switches to a more complex view.
     *
     * @return  See {@link com.smartgwt.client.docs.HTMLString HTMLString} 
     */
    public String getMoreButtonTitle()  {
        return getAttributeAsString("moreButtonTitle");
    }
    

    /**
     * "OK" button for the ColorPicker
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return IButton
     * @throws IllegalStateException if this widget has not yet been rendered.
     */
    public IButton getOkButton() throws IllegalStateException {
        errorIfNotCreated("okButton");
        return (IButton)IButton.getByJSObject(getAttributeAsJavaScriptObject("okButton"));
    }
    
    

    /**
     * The title for the 'OK' button.
     *
     * @param okButtonTitle  See {@link com.smartgwt.client.docs.HTMLString HTMLString} . Default value is "OK"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setOkButtonTitle(String okButtonTitle)  throws IllegalStateException {
        setAttribute("okButtonTitle", okButtonTitle, false);
    }

    /**
     * The title for the 'OK' button.
     *
     * @return  See {@link com.smartgwt.client.docs.HTMLString HTMLString} 
     */
    public String getOkButtonTitle()  {
        return getAttributeAsString("okButtonTitle");
    }
    

    /**
     * The label shown next to the opacity slider. Ignored if  {@link
     * com.smartgwt.client.widgets.form.ColorPicker#getSupportsTransparency supportsTransparency} is false.
     *
     * @param opacitySliderLabel  See {@link com.smartgwt.client.docs.HTMLString HTMLString} . Default value is "Opacity"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setOpacitySliderLabel(String opacitySliderLabel)  throws IllegalStateException {
        setAttribute("opacitySliderLabel", opacitySliderLabel, false);
    }

    /**
     * The label shown next to the opacity slider. Ignored if  {@link
     * com.smartgwt.client.widgets.form.ColorPicker#getSupportsTransparency supportsTransparency} is false.
     *
     * @return  See {@link com.smartgwt.client.docs.HTMLString HTMLString} 
     */
    public String getOpacitySliderLabel()  {
        return getAttributeAsString("opacitySliderLabel");
    }
    

    /**
     * The text to show underneath the selected color box, so that it can  be seen through semi-transparent colors. If you do
     * not want such text, set  this value to blank. This value is irrelevant if  {@link
     * com.smartgwt.client.widgets.form.ColorPicker#getSupportsTransparency supportsTransparency} is false.
     *
     * @param opacityText  See {@link com.smartgwt.client.docs.HTMLString HTMLString} . Default value is "Lorem ipsum dolor sit amet, consectetuer adipiscing elit."
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setOpacityText(String opacityText)  throws IllegalStateException {
        setAttribute("opacityText", opacityText, false);
    }

    /**
     * The text to show underneath the selected color box, so that it can  be seen through semi-transparent colors. If you do
     * not want such text, set  this value to blank. This value is irrelevant if  {@link
     * com.smartgwt.client.widgets.form.ColorPicker#getSupportsTransparency supportsTransparency} is false.
     *
     * @return  See {@link com.smartgwt.client.docs.HTMLString HTMLString} 
     */
    public String getOpacityText()  {
        return getAttributeAsString("opacityText");
    }
    

    /**
     * The text to show when the mouse hovers over the 'Red' field in the complex chooser.
     *
     * @param redFieldPrompt  See {@link com.smartgwt.client.docs.HTMLString HTMLString} . Default value is "The Red component of the selected color"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setRedFieldPrompt(String redFieldPrompt)  throws IllegalStateException {
        setAttribute("redFieldPrompt", redFieldPrompt, false);
    }

    /**
     * The text to show when the mouse hovers over the 'Red' field in the complex chooser.
     *
     * @return  See {@link com.smartgwt.client.docs.HTMLString HTMLString} 
     */
    public String getRedFieldPrompt()  {
        return getAttributeAsString("redFieldPrompt");
    }
    

    /**
     * The title for the 'Red' field in the complex chooser.
     *
     * @param redFieldTitle  See {@link com.smartgwt.client.docs.HTMLString HTMLString} . Default value is "Red"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setRedFieldTitle(String redFieldTitle)  throws IllegalStateException {
        setAttribute("redFieldTitle", redFieldTitle, false);
    }

    /**
     * The title for the 'Red' field in the complex chooser.
     *
     * @return  See {@link com.smartgwt.client.docs.HTMLString HTMLString} 
     */
    public String getRedFieldTitle()  {
        return getAttributeAsString("redFieldTitle");
    }
    

    /**
     * The text to show when the mouse hovers over the 'Saturation' field in the complex chooser.
     *
     * @param satFieldPrompt  See {@link com.smartgwt.client.docs.HTMLString HTMLString} . Default value is "The Saturation (color purity) of the selected color"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setSatFieldPrompt(String satFieldPrompt)  throws IllegalStateException {
        setAttribute("satFieldPrompt", satFieldPrompt, false);
    }

    /**
     * The text to show when the mouse hovers over the 'Saturation' field in the complex chooser.
     *
     * @return  See {@link com.smartgwt.client.docs.HTMLString HTMLString} 
     */
    public String getSatFieldPrompt()  {
        return getAttributeAsString("satFieldPrompt");
    }
    

    /**
     * The title for the 'Sat' field in the complex chooser.
     *
     * @param satFieldTitle  See {@link com.smartgwt.client.docs.HTMLString HTMLString} . Default value is "Sat"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setSatFieldTitle(String satFieldTitle)  throws IllegalStateException {
        setAttribute("satFieldTitle", satFieldTitle, false);
    }

    /**
     * The title for the 'Sat' field in the complex chooser.
     *
     * @return  See {@link com.smartgwt.client.docs.HTMLString HTMLString} 
     */
    public String getSatFieldTitle()  {
        return getAttributeAsString("satFieldTitle");
    }
    

    /**
     * The label shown next to the selected color box.
     *
     * @param selectedColorLabel  See {@link com.smartgwt.client.docs.HTMLString HTMLString} . Default value is "Selected Color"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setSelectedColorLabel(String selectedColorLabel)  throws IllegalStateException {
        setAttribute("selectedColorLabel", selectedColorLabel, false);
    }

    /**
     * The label shown next to the selected color box.
     *
     * @return  See {@link com.smartgwt.client.docs.HTMLString HTMLString} 
     */
    public String getSelectedColorLabel()  {
        return getAttributeAsString("selectedColorLabel");
    }
    

    /**
     * Determines whether to show the opacity slider. This allows the user to select colors with an alpha element (ie,
     * semi-transparent colors). If this attribute is set to false, no opacity slider is shown, and all colors are completely
     * opaque.
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Set the {@link com.smartgwt.client.widgets.form.ColorPicker#getSupportsTransparency supportsTransparency} flag.
     *
     * @param supportsTransparency Set to true to enable transparency/opacity. Default value is true
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setSupportsTransparency(Boolean supportsTransparency)  throws IllegalStateException {
        setAttribute("supportsTransparency", supportsTransparency, false);
    }

    /**
     * Determines whether to show the opacity slider. This allows the user to select colors with an alpha element (ie,
     * semi-transparent colors). If this attribute is set to false, no opacity slider is shown, and all colors are completely
     * opaque.
     *
     * @return Boolean
     */
    public Boolean getSupportsTransparency()  {
        return getAttributeAsBoolean("supportsTransparency");
    }
    

    /**
     * Displayed height of the color swatch image. The default height is approximately that used by the Windows&#174; XP color
     * picking window
     *
     * @param swatchHeight  Default value is 170
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setSwatchHeight(int swatchHeight)  throws IllegalStateException {
        setAttribute("swatchHeight", swatchHeight, false);
    }

    /**
     * Displayed height of the color swatch image. The default height is approximately that used by the Windows&#174; XP color
     * picking window
     *
     * @return int
     */
    public int getSwatchHeight()  {
        return getAttributeAsInt("swatchHeight");
    }
    

    /**
     * The location of the color swatch image file
     *
     * @param swatchImageURL  See {@link com.smartgwt.client.docs.SCImgURL SCImgURL} . Default value is "[SKIN]ColorPicker/spectrum.png"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setSwatchImageURL(String swatchImageURL)  throws IllegalStateException {
        setAttribute("swatchImageURL", swatchImageURL, false);
    }

    /**
     * The location of the color swatch image file
     *
     * @return  See {@link com.smartgwt.client.docs.SCImgURL SCImgURL} 
     */
    public String getSwatchImageURL()  {
        return getAttributeAsString("swatchImageURL");
    }
    

    /**
     * Displayed width of the color swatch image. The default width is approximately that used by the Windows&#174; XP color
     * picking window
     *
     * @param swatchWidth  Default value is 170
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setSwatchWidth(int swatchWidth)  throws IllegalStateException {
        setAttribute("swatchWidth", swatchWidth, false);
    }

    /**
     * Displayed width of the color swatch image. The default width is approximately that used by the Windows&#174; XP color
     * picking window
     *
     * @return int
     */
    public int getSwatchWidth()  {
        return getAttributeAsInt("swatchWidth");
    }
    

    // ********************* Methods ***********************
	/**
     * Override this method to be kept informed when the ColorPicker changes in real-time  (for example, if you need to update
     * your own GUI accordingly). Then use the  getXxxx() methods (for example, {@link
     * com.smartgwt.client.widgets.form.ColorPicker#getBlue getBlue()} or  {@link
     * com.smartgwt.client.widgets.form.ColorPicker#getLuminosity getLuminosity()})to obtain current state as required.
     * @see com.smartgwt.client.widgets.form.events.ColorSelectedEvent
     */
    public native void colorChanged() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.colorChanged();
    }-*/;

    /**
     * Add a colorSelected handler.
     * <p>
     * Override this method to be notified when the user selects a color either by clicking a basic color box in simple mode,
     * or by clicking  the OK button in complex mode. It is not intended that client code  call this method.
     *
     * @param handler the colorSelected handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addColorSelectedHandler(com.smartgwt.client.widgets.form.events.ColorSelectedHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.form.events.ColorSelectedEvent.getType()) == 0) setupColorSelectedEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.form.events.ColorSelectedEvent.getType());
    }

    private native void setupColorSelectedEvent() /*-{
        var obj = null;
        var selfJ = this;
        var colorSelected = $entry(function(){
            var param = {"color" : arguments[0], "opacity" : arguments[1]};

                var event = @com.smartgwt.client.widgets.form.events.ColorSelectedEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
            });
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({colorSelected:  colorSelected              });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.colorSelected =  colorSelected             ;
        }
   }-*/;
	/**
     * Returns the Blue element of the currently-selected color, as an integer from 0-255
     *
     * @return blue color component
     * @see com.smartgwt.client.widgets.form.ColorPicker#setBlue
     */
    public native int getBlue() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.getBlue();
        return ret;
    }-*/;

	/**
     * Returns the Green element of the currently-selected color, as an integer from 0-255
     *
     * @return green color component
     * @see com.smartgwt.client.widgets.form.ColorPicker#setGreen
     */
    public native int getGreen() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.getGreen();
        return ret;
    }-*/;

	/**
     * Returns the currently-selected color, in HTML color representation form, as a string. HTML color representation is a
     * hash sign, followed by the red, green and blue elements of the color in 2-digit hex form - for example "#F17F1D"
     *
     * @return HTML color value
     * @see com.smartgwt.client.widgets.form.ColorPicker#setHtmlColor
     */
    public native String getHtmlColor() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.getHtmlColor();
        return ret;
    }-*/;

	/**
     * Returns the Hue of the currently-selected color, as an integer from 0-239
     *
     * @return hue value
     * @see com.smartgwt.client.widgets.form.ColorPicker#setHue
     */
    public native int getHue() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.getHue();
        return ret;
    }-*/;

	/**
     * Returns the Luminosity (brightness) of the currently-selected color, as an  integer from 0-240
     *
     * @return luminosity value
     * @see com.smartgwt.client.widgets.form.ColorPicker#setLuminosity
     */
    public native int getLuminosity() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.getLuminosity();
        return ret;
    }-*/;

	/**
     * Returns the Red element of the currently-selected color, as an integer from 0-255
     *
     * @return red color component
     * @see com.smartgwt.client.widgets.form.ColorPicker#setRed
     */
    public native int getRed() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.getRed();
        return ret;
    }-*/;

	/**
     * Returns the Saturation of the currently-selected color, as an integer from 0-240
     *
     * @return saturation value
     * @see com.smartgwt.client.widgets.form.ColorPicker#setSaturation
     */
    public native int getSaturation() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.getSaturation();
        return ret;
    }-*/;


	/**
     * Sets the Blue element of the selected color
     * @param newValue An integer between 0 and 255
     * @see com.smartgwt.client.widgets.form.ColorPicker#getBlue
     */
    public native void setBlue(int newValue) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.setBlue(newValue);
    }-*/;



	/**
     * Changes the pick mode of this <code>ColorPicker</code> to <code>pickMode</code>. <p> Note: It is not allowed to set the
     * pick mode to  {@link com.smartgwt.client.types.ColorPickerMode#COMPLEX} if {@link
     * com.smartgwt.client.widgets.form.ColorPicker#getAllowComplexMode allowComplexMode} is <code>false</code>.
     * @param pickMode the new pick mode.
     */
    public native void setCurrentPickMode(ColorPickerMode pickMode) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.setCurrentPickMode(pickMode.@com.smartgwt.client.types.ColorPickerMode::getValue()());
    }-*/;



	/**
     * Sets the Green element of the selected color
     * @param newValue An integer between 0 and 255
     * @see com.smartgwt.client.widgets.form.ColorPicker#getGreen
     */
    public native void setGreen(int newValue) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.setGreen(newValue);
    }-*/;



	/**
     * Changes the selected color to the one represented by the supplied HTML color  string. Note that ths method only accepts
     * the parameter if it represents a  valid color (otherwise it is simply ignored).
     * @param newValue A string in HTML color representation format (#RRGGBB)
     * @see com.smartgwt.client.widgets.form.ColorPicker#getHtmlColor
     */
    public native void setHtmlColor(String newValue) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.setHtmlColor(newValue);
    }-*/;



	/**
     * Sets the Hue of the selected color
     * @param newValue An integer between 0 and 239
     * @see com.smartgwt.client.widgets.form.ColorPicker#getHue
     */
    public native void setHue(int newValue) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.setHue(newValue);
    }-*/;



	/**
     * Sets the Luminosity (brightness) of the selected color
     * @param newValue An integer between 0 and 240
     * @see com.smartgwt.client.widgets.form.ColorPicker#getLuminosity
     */
    public native void setLuminosity(int newValue) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.setLuminosity(newValue);
    }-*/;



	/**
     * Sets the Opacity of the selected color. Ignored if opacity is switched off.
     * @param newValue An integer between 0 and 100
     * @see com.smartgwt.client.widgets.form.ColorPicker#getOpacity
     */
    public native void setOpacity(int newValue) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.setOpacity(newValue);
    }-*/;



	/**
     * Sets the Red element of the selected color
     * @param newValue An integer between 0 and 255
     * @see com.smartgwt.client.widgets.form.ColorPicker#getRed
     */
    public native void setRed(int newValue) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.setRed(newValue);
    }-*/;



	/**
     * Sets the Saturation of the selected color
     * @param newValue An integer between 0 and 240
     * @see com.smartgwt.client.widgets.form.ColorPicker#getSaturation
     */
    public native void setSaturation(int newValue) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.setSaturation(newValue);
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
     * @param colorPickerProperties properties that should be used as new defaults when instances of this class are created
     */
    public static native void setDefaultProperties(ColorPicker colorPickerProperties) /*-{
    	var properties = $wnd.isc.addProperties({},colorPickerProperties.@com.smartgwt.client.widgets.BaseWidget::getConfig()());
        @com.smartgwt.client.util.JSOHelper::cleanProperties(Lcom/google/gwt/core/client/JavaScriptObject;Z)(properties,false);
        $wnd.isc.ColorPicker.addProperties(properties);
    }-*/;

    // ***********************************************************

    public LogicalStructureObject setLogicalStructure(ColorPickerLogicalStructure s) {
        super.setLogicalStructure(s);
        try {
            s.allowComplexMode = getAttributeAsString("allowComplexMode");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ColorPicker.allowComplexMode:" + t.getMessage() + "\n";
        }
        try {
            s.autoCenterOnShow = getAttributeAsString("autoCenterOnShow");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ColorPicker.autoCenterOnShow:" + t.getMessage() + "\n";
        }
        try {
            s.autoPosition = getAttributeAsString("autoPosition");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ColorPicker.autoPosition:" + t.getMessage() + "\n";
        }
        try {
            s.basicColorLabel = getAttributeAsString("basicColorLabel");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ColorPicker.basicColorLabel:" + t.getMessage() + "\n";
        }
        try {
            s.blueFieldPrompt = getAttributeAsString("blueFieldPrompt");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ColorPicker.blueFieldPrompt:" + t.getMessage() + "\n";
        }
        try {
            s.blueFieldTitle = getAttributeAsString("blueFieldTitle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ColorPicker.blueFieldTitle:" + t.getMessage() + "\n";
        }
        try {
            s.cancelButtonTitle = getAttributeAsString("cancelButtonTitle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ColorPicker.cancelButtonTitle:" + t.getMessage() + "\n";
        }
        try {
            s.colorButtonBaseStyle = getAttributeAsString("colorButtonBaseStyle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ColorPicker.colorButtonBaseStyle:" + t.getMessage() + "\n";
        }
        try {
            s.colorButtonSize = getAttributeAsString("colorButtonSize");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ColorPicker.colorButtonSize:" + t.getMessage() + "\n";
        }
        try {
            s.crosshairImageURL = getAttributeAsString("crosshairImageURL");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ColorPicker.crosshairImageURL:" + t.getMessage() + "\n";
        }
        try {
            s.defaultColor = getAttributeAsString("defaultColor");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ColorPicker.defaultColor:" + t.getMessage() + "\n";
        }
        try {
            s.defaultOpacity = getAttributeAsString("defaultOpacity");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ColorPicker.defaultOpacity:" + t.getMessage() + "\n";
        }
        try {
            s.defaultPickMode = getAttributeAsString("defaultPickMode");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ColorPicker.defaultPickMode:" + t.getMessage() + "\n";
        }
        try {
            s.greenFieldPrompt = getAttributeAsString("greenFieldPrompt");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ColorPicker.greenFieldPrompt:" + t.getMessage() + "\n";
        }
        try {
            s.greenFieldTitle = getAttributeAsString("greenFieldTitle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ColorPicker.greenFieldTitle:" + t.getMessage() + "\n";
        }
        try {
            s.htmlFieldPrompt = getAttributeAsString("htmlFieldPrompt");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ColorPicker.htmlFieldPrompt:" + t.getMessage() + "\n";
        }
        try {
            s.htmlFieldTitle = getAttributeAsString("htmlFieldTitle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ColorPicker.htmlFieldTitle:" + t.getMessage() + "\n";
        }
        try {
            s.hueFieldPrompt = getAttributeAsString("hueFieldPrompt");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ColorPicker.hueFieldPrompt:" + t.getMessage() + "\n";
        }
        try {
            s.hueFieldTitle = getAttributeAsString("hueFieldTitle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ColorPicker.hueFieldTitle:" + t.getMessage() + "\n";
        }
        try {
            s.lessButtonTitle = getAttributeAsString("lessButtonTitle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ColorPicker.lessButtonTitle:" + t.getMessage() + "\n";
        }
        try {
            s.lumFieldPrompt = getAttributeAsString("lumFieldPrompt");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ColorPicker.lumFieldPrompt:" + t.getMessage() + "\n";
        }
        try {
            s.lumFieldTitle = getAttributeAsString("lumFieldTitle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ColorPicker.lumFieldTitle:" + t.getMessage() + "\n";
        }
        try {
            s.lumWidth = getAttributeAsString("lumWidth");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ColorPicker.lumWidth:" + t.getMessage() + "\n";
        }
        try {
            s.moreButtonTitle = getAttributeAsString("moreButtonTitle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ColorPicker.moreButtonTitle:" + t.getMessage() + "\n";
        }
        try {
            s.okButtonTitle = getAttributeAsString("okButtonTitle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ColorPicker.okButtonTitle:" + t.getMessage() + "\n";
        }
        try {
            s.opacitySliderLabel = getAttributeAsString("opacitySliderLabel");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ColorPicker.opacitySliderLabel:" + t.getMessage() + "\n";
        }
        try {
            s.opacityText = getAttributeAsString("opacityText");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ColorPicker.opacityText:" + t.getMessage() + "\n";
        }
        try {
            s.redFieldPrompt = getAttributeAsString("redFieldPrompt");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ColorPicker.redFieldPrompt:" + t.getMessage() + "\n";
        }
        try {
            s.redFieldTitle = getAttributeAsString("redFieldTitle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ColorPicker.redFieldTitle:" + t.getMessage() + "\n";
        }
        try {
            s.satFieldPrompt = getAttributeAsString("satFieldPrompt");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ColorPicker.satFieldPrompt:" + t.getMessage() + "\n";
        }
        try {
            s.satFieldTitle = getAttributeAsString("satFieldTitle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ColorPicker.satFieldTitle:" + t.getMessage() + "\n";
        }
        try {
            s.selectedColorLabel = getAttributeAsString("selectedColorLabel");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ColorPicker.selectedColorLabel:" + t.getMessage() + "\n";
        }
        try {
            s.supportsTransparency = getAttributeAsString("supportsTransparency");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ColorPicker.supportsTransparency:" + t.getMessage() + "\n";
        }
        try {
            s.swatchHeight = getAttributeAsString("swatchHeight");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ColorPicker.swatchHeight:" + t.getMessage() + "\n";
        }
        try {
            s.swatchImageURL = getAttributeAsString("swatchImageURL");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ColorPicker.swatchImageURL:" + t.getMessage() + "\n";
        }
        try {
            s.swatchWidth = getAttributeAsString("swatchWidth");
        } catch (Throwable t) {
            s.logicalStructureErrors += "ColorPicker.swatchWidth:" + t.getMessage() + "\n";
        }
        return s;
    }

    public LogicalStructureObject getLogicalStructure() {
        ColorPickerLogicalStructure s = new ColorPickerLogicalStructure();
        setLogicalStructure(s);
        return s;
    }
}


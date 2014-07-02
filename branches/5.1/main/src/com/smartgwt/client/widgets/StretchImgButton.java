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
 * A StretchImg that behaves like a button, going through up/down/over state transitions in response to user events. 
 * Supports an optional title, and will auto-size to accommodate the title text if <code>overflow</code> is set to
 * "visible". <P> Examples of use include fancy buttons, poplist headers, and tabs.
 */
@BeanFactory.FrameworkClass
@BeanFactory.ScClassName("StretchImgButton")
public class StretchImgButton extends StretchImg implements com.smartgwt.client.widgets.events.HasIconClickHandlers, com.smartgwt.client.widgets.events.HasTitleHoverHandlers {

    public static StretchImgButton getOrCreateRef(JavaScriptObject jsObj) {
        if (jsObj == null) return null;
        final BaseWidget refInstance = BaseWidget.getRef(jsObj);
        if (refInstance == null) {
            return new StretchImgButton(jsObj);
        } else {
            assert refInstance instanceof StretchImgButton;
            return (StretchImgButton)refInstance;
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
        $wnd.isc.StretchImgButton.changeDefaults(autoChildName + "Defaults", defaults.@com.smartgwt.client.widgets.Canvas::getConfig()());
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
        $wnd.isc.StretchImgButton.changeDefaults(autoChildName + "Defaults", defaults.@com.smartgwt.client.widgets.form.fields.FormItem::getJsObj()());
    }-*/;

    public StretchImgButton(){
        scClassName = "StretchImgButton";
    }

    public StretchImgButton(JavaScriptObject jsObj){
        scClassName = "StretchImgButton";
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
     * Behavior on state changes -- BUTTON, RADIO or CHECKBOX
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Update the 'actionType' for this canvas (radio / checkbox / button) If the canvas is currently selected, and the passed in actionType is 'button' this method will deselect the canvas.
     *
     * @param actionType  Default value is "button"
     * @see com.smartgwt.client.docs.State State overview and related methods
     */
    public void setActionType(SelectionType actionType) {
        setAttribute("actionType", actionType == null ? null : actionType.getValue(), true);
    }

    /**
     * Behavior on state changes -- BUTTON, RADIO or CHECKBOX
     *
     * @return Return the 'actionType' for this canvas (radio / checkbox / button)
     * @see com.smartgwt.client.docs.State State overview and related methods
     */
    public SelectionType getActionType()  {
        return EnumUtil.getEnum(SelectionType.values(), getAttribute("actionType"));
    }
    

    /**
     * Horizontal alignment of this component's title.
     *
     * @param align  Default value is Canvas.CENTER
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setAlign(Alignment align) {
        setAttribute("align", align == null ? null : align.getValue(), true);
    }

    /**
     * Horizontal alignment of this component's title.
     *
     * @return Alignment
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public Alignment getAlign()  {
        return EnumUtil.getEnum(Alignment.values(), getAttribute("align"));
    }
    

    /**
     * If true, ignore the specified size of this widget and always size just large enough to accommodate the title.  If
     * <code>setWidth()</code> is explicitly called on an autoFit:true button, autoFit will be reset to <code>false</code>. <P>
     * Note that for StretchImgButton instances, autoFit will occur horizontally only, as  unpredictable vertical sizing is
     * likely to distort the media. If you do want vertical  auto-fit, this can be achieved by simply setting a small height,
     * and having  overflow:"visible"
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Setter method for the {@link com.smartgwt.client.widgets.StatefulCanvas#getAutoFit autoFit} property. Pass in true or false to turn autoFit on or off. When autoFit is set to <code>false</code>, canvas will be resized to it's previously specified size.
     *
     * @param autoFit New autoFit setting.. Default value is null
     * @see com.smartgwt.client.docs.Sizing Sizing overview and related methods
     */
    public void setAutoFit(Boolean autoFit) {
        setAttribute("autoFit", autoFit, true);
    }

    /**
     * If true, ignore the specified size of this widget and always size just large enough to accommodate the title.  If
     * <code>setWidth()</code> is explicitly called on an autoFit:true button, autoFit will be reset to <code>false</code>. <P>
     * Note that for StretchImgButton instances, autoFit will occur horizontally only, as  unpredictable vertical sizing is
     * likely to distort the media. If you do want vertical  auto-fit, this can be achieved by simply setting a small height,
     * and having  overflow:"visible"
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.Sizing Sizing overview and related methods
     */
    public Boolean getAutoFit()  {
        return getAttributeAsBoolean("autoFit");
    }
    

    /**
     * Base CSS style className applied to the component.  <P> As the component changes {@link
     * com.smartgwt.client.widgets.StatefulCanvas#getState state} and/or is selected,  suffixes will be added to the base
     * style. In some cases more than one suffix will  be appended to reflect a combined state ("Selected" + "Disabled", for
     * example). <P> See {@link com.smartgwt.client.widgets.StatefulCanvas#getStateSuffix StatefulCanvas.getStateSuffix} for a
     * description of the default set of suffixes which may be applied to the baseStyle
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Sets the base CSS style.  As the component changes state and/or is selected, suffixes will be added to the base style.
     *
     * @param baseStyle new base style See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} . Default value is "stretchImgButton"
     */
    public void setBaseStyle(String baseStyle) {
        setAttribute("baseStyle", baseStyle, true);
    }

    /**
     * Base CSS style className applied to the component.  <P> As the component changes {@link
     * com.smartgwt.client.widgets.StatefulCanvas#getState state} and/or is selected,  suffixes will be added to the base
     * style. In some cases more than one suffix will  be appended to reflect a combined state ("Selected" + "Disabled", for
     * example). <P> See {@link com.smartgwt.client.widgets.StatefulCanvas#getStateSuffix StatefulCanvas.getStateSuffix} for a
     * description of the default set of suffixes which may be applied to the baseStyle
     *
     * @return  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} 
     */
    public String getBaseStyle()  {
        return getAttributeAsString("baseStyle");
    }
    

    /**
     * How big are the end pieces by default
     *
     * @param capSize  Default value is 12
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
     * If set to true, if the {@link com.smartgwt.client.widgets.StatefulCanvas#getTitle title} of this button contains the
     * specified {@link com.smartgwt.client.widgets.Canvas#getAccessKey accessKey}, when the title is displayed to the user it
     * will be modified to include HTML to underline the accessKey.<br> Note that this property may cause titles that include
     * HTML (rather than simple strings) to be inappropriately modified, so should be disabled if your title string includes
     * HTML characters.
     *
     * @param hiliteAccessKey  Default value is true
     */
    public void setHiliteAccessKey(Boolean hiliteAccessKey) {
        setAttribute("hiliteAccessKey", hiliteAccessKey, true);
    }

    /**
     * If set to true, if the {@link com.smartgwt.client.widgets.StatefulCanvas#getTitle title} of this button contains the
     * specified {@link com.smartgwt.client.widgets.Canvas#getAccessKey accessKey}, when the title is displayed to the user it
     * will be modified to include HTML to underline the accessKey.<br> Note that this property may cause titles that include
     * HTML (rather than simple strings) to be inappropriately modified, so should be disabled if your title string includes
     * HTML characters.
     *
     * @return Boolean
     */
    public Boolean getHiliteAccessKey()  {
        return getAttributeAsBoolean("hiliteAccessKey");
    }
    

    /**
     * Optional icon to be shown with the button title text.   <P> Specify as the partial URL to an image, relative to the
     * imgDir of this component.
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Change the icon being shown next to the title text.
     *
     * @param icon URL of new icon See {@link com.smartgwt.client.docs.SCImgURL SCImgURL} . Default value is null
     * @see com.smartgwt.client.docs.ButtonIcon ButtonIcon overview and related methods
     */
    public void setIcon(String icon) {
        setAttribute("icon", icon, true);
    }

    /**
     * Optional icon to be shown with the button title text.   <P> Specify as the partial URL to an image, relative to the
     * imgDir of this component.
     *
     * @return  See {@link com.smartgwt.client.docs.SCImgURL SCImgURL} 
     * @see com.smartgwt.client.docs.ButtonIcon ButtonIcon overview and related methods
     */
    public String getIcon()  {
        return getAttributeAsString("icon");
    }
    

    /**
     * If this button is showing an icon should it be right or left aligned?
     *
     * @param iconAlign  Default value is null
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.docs.ButtonIcon ButtonIcon overview and related methods
     */
    public void setIconAlign(String iconAlign)  throws IllegalStateException {
        setAttribute("iconAlign", iconAlign, false);
    }

    /**
     * If this button is showing an icon should it be right or left aligned?
     *
     * @return String
     * @see com.smartgwt.client.docs.ButtonIcon ButtonIcon overview and related methods
     */
    public String getIconAlign()  {
        return getAttributeAsString("iconAlign");
    }
    

    /**
     * Height in pixels of the icon image. <P> If unset, defaults to {@link
     * com.smartgwt.client.widgets.StatefulCanvas#getIconSize iconSize}.
     *
     * @param iconHeight  Default value is null
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.docs.ButtonIcon ButtonIcon overview and related methods
     */
    public void setIconHeight(Integer iconHeight)  throws IllegalStateException {
        setAttribute("iconHeight", iconHeight, false);
    }

    /**
     * Height in pixels of the icon image. <P> If unset, defaults to {@link
     * com.smartgwt.client.widgets.StatefulCanvas#getIconSize iconSize}.
     *
     * @return Integer
     * @see com.smartgwt.client.docs.ButtonIcon ButtonIcon overview and related methods
     */
    public Integer getIconHeight()  {
        return getAttributeAsInt("iconHeight");
    }
    

    /**
     * If this button is showing an icon should it appear to the left or right of the title? valid options are
     * <code>"left"</code> and <code>"right"</code>.
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Changes the orientation of the icon relative to the text of the button.
     *
     * @param iconOrientation The new orientation of the icon relative to the text of the button.. Default value is "left"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.docs.ButtonIcon ButtonIcon overview and related methods
     */
    public void setIconOrientation(String iconOrientation)  throws IllegalStateException {
        setAttribute("iconOrientation", iconOrientation, false);
    }

    /**
     * If this button is showing an icon should it appear to the left or right of the title? valid options are
     * <code>"left"</code> and <code>"right"</code>.
     *
     * @return String
     * @see com.smartgwt.client.docs.ButtonIcon ButtonIcon overview and related methods
     */
    public String getIconOrientation()  {
        return getAttributeAsString("iconOrientation");
    }
    

    /**
     * Size in pixels of the icon image. <P> The {@link com.smartgwt.client.widgets.StatefulCanvas#getIconWidth iconWidth} and
     * {@link com.smartgwt.client.widgets.StatefulCanvas#getIconHeight iconHeight} properties can be used to configure width
     * and height separately. <P> Note: When configuring the properties of a <code>StatefulCanvas</code> (or derivative) {@link
     * com.smartgwt.client.types.AutoChild AutoChild}, it is best to set the <code>iconWidth</code> and <code>iconHeight</code>
     * to the same value rather than setting an <code>iconSize</code>. This is because certain skins or customizations thereto
     * might set the <code>iconWidth</code> and <code>iconHeight</code>, making the customization of the AutoChild's
     * <code>iconSize</code> ineffective.
     *
     * @param iconSize  Default value is 16
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.docs.ButtonIcon ButtonIcon overview and related methods
     */
    public void setIconSize(int iconSize)  throws IllegalStateException {
        setAttribute("iconSize", iconSize, false);
    }

    /**
     * Size in pixels of the icon image. <P> The {@link com.smartgwt.client.widgets.StatefulCanvas#getIconWidth iconWidth} and
     * {@link com.smartgwt.client.widgets.StatefulCanvas#getIconHeight iconHeight} properties can be used to configure width
     * and height separately. <P> Note: When configuring the properties of a <code>StatefulCanvas</code> (or derivative) {@link
     * com.smartgwt.client.types.AutoChild AutoChild}, it is best to set the <code>iconWidth</code> and <code>iconHeight</code>
     * to the same value rather than setting an <code>iconSize</code>. This is because certain skins or customizations thereto
     * might set the <code>iconWidth</code> and <code>iconHeight</code>, making the customization of the AutoChild's
     * <code>iconSize</code> ineffective.
     *
     * @return int
     * @see com.smartgwt.client.docs.ButtonIcon ButtonIcon overview and related methods
     */
    public int getIconSize()  {
        return getAttributeAsInt("iconSize");
    }
    

    /**
     * Pixels between icon and title text.
     *
     * @param iconSpacing  Default value is 6
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.docs.ButtonIcon ButtonIcon overview and related methods
     */
    public void setIconSpacing(int iconSpacing)  throws IllegalStateException {
        setAttribute("iconSpacing", iconSpacing, false);
    }

    /**
     * Pixels between icon and title text.
     *
     * @return int
     * @see com.smartgwt.client.docs.ButtonIcon ButtonIcon overview and related methods
     */
    public int getIconSpacing()  {
        return getAttributeAsInt("iconSpacing");
    }
    

    /**
     * Width in pixels of the icon image. <P> If unset, defaults to {@link
     * com.smartgwt.client.widgets.StatefulCanvas#getIconSize iconSize}.
     *
     * @param iconWidth  Default value is null
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.docs.ButtonIcon ButtonIcon overview and related methods
     */
    public void setIconWidth(Integer iconWidth)  throws IllegalStateException {
        setAttribute("iconWidth", iconWidth, false);
    }

    /**
     * Width in pixels of the icon image. <P> If unset, defaults to {@link
     * com.smartgwt.client.widgets.StatefulCanvas#getIconSize iconSize}.
     *
     * @return Integer
     * @see com.smartgwt.client.docs.ButtonIcon ButtonIcon overview and related methods
     */
    public Integer getIconWidth()  {
        return getAttributeAsInt("iconWidth");
    }
    

    /**
     * The padding for a StretchImgButton's label is determined as follows. <P> If <code>labelHPad</code> is set it will
     * specify the horizontal padding applied to the label. Similarly if <code>labelVPad</code> is set it will specify the
     * vertical padding for the label, regardless of the button's {@link
     * com.smartgwt.client.widgets.StretchImgButton#getVertical vertical} setting. <P> Otherwise <code>labelLengthPad</code>
     * can be set to specify the label padding along the length axis (ie: horizontal padding if {@link
     * com.smartgwt.client.widgets.StretchImgButton#getVertical vertical} is false, otherwise vertical padding), and 
     * <code>labelBreadthPad</code> can be set to specify the label padding along the other axis. <P> Otherwise the padding on
     * the length axis will match the {@link com.smartgwt.client.widgets.StretchImgButton#getCapSize capSize} and will be set
     * to zero on the breadth axis. <P> So by default the label will be sized to match the center image of the
     * StretchImgButton, but these settings allow the label to partially or wholly overlap the caps.
     *
     * @param labelBreadthPad  Default value is null
     */
    public void setLabelBreadthPad(Integer labelBreadthPad) {
        setAttribute("labelBreadthPad", labelBreadthPad, true);
    }

    /**
     * The padding for a StretchImgButton's label is determined as follows. <P> If <code>labelHPad</code> is set it will
     * specify the horizontal padding applied to the label. Similarly if <code>labelVPad</code> is set it will specify the
     * vertical padding for the label, regardless of the button's {@link
     * com.smartgwt.client.widgets.StretchImgButton#getVertical vertical} setting. <P> Otherwise <code>labelLengthPad</code>
     * can be set to specify the label padding along the length axis (ie: horizontal padding if {@link
     * com.smartgwt.client.widgets.StretchImgButton#getVertical vertical} is false, otherwise vertical padding), and 
     * <code>labelBreadthPad</code> can be set to specify the label padding along the other axis. <P> Otherwise the padding on
     * the length axis will match the {@link com.smartgwt.client.widgets.StretchImgButton#getCapSize capSize} and will be set
     * to zero on the breadth axis. <P> So by default the label will be sized to match the center image of the
     * StretchImgButton, but these settings allow the label to partially or wholly overlap the caps.
     *
     * @return Integer
     */
    public Integer getLabelBreadthPad()  {
        return getAttributeAsInt("labelBreadthPad");
    }
    

    /**
     * The padding for a StretchImgButton's label is determined as follows. <P> If <code>labelHPad</code> is set it will
     * specify the horizontal padding applied to the label. Similarly if <code>labelVPad</code> is set it will specify the
     * vertical padding for the label, regardless of the button's {@link
     * com.smartgwt.client.widgets.StretchImgButton#getVertical vertical} setting. <P> Otherwise <code>labelLengthPad</code>
     * can be set to specify the label padding along the length axis (ie: horizontal padding if {@link
     * com.smartgwt.client.widgets.StretchImgButton#getVertical vertical} is false, otherwise vertical padding), and 
     * <code>labelBreadthPad</code> can be set to specify the label padding along the other axis. <P> Otherwise the padding on
     * the length axis will match the {@link com.smartgwt.client.widgets.StretchImgButton#getCapSize capSize} and will be set
     * to zero on the breadth axis. <P> So by default the label will be sized to match the center image of the
     * StretchImgButton, but these settings allow the label to partially or wholly overlap the caps.
     *
     * @param labelHPad  Default value is null
     */
    public void setLabelHPad(Integer labelHPad) {
        setAttribute("labelHPad", labelHPad, true);
    }

    /**
     * The padding for a StretchImgButton's label is determined as follows. <P> If <code>labelHPad</code> is set it will
     * specify the horizontal padding applied to the label. Similarly if <code>labelVPad</code> is set it will specify the
     * vertical padding for the label, regardless of the button's {@link
     * com.smartgwt.client.widgets.StretchImgButton#getVertical vertical} setting. <P> Otherwise <code>labelLengthPad</code>
     * can be set to specify the label padding along the length axis (ie: horizontal padding if {@link
     * com.smartgwt.client.widgets.StretchImgButton#getVertical vertical} is false, otherwise vertical padding), and 
     * <code>labelBreadthPad</code> can be set to specify the label padding along the other axis. <P> Otherwise the padding on
     * the length axis will match the {@link com.smartgwt.client.widgets.StretchImgButton#getCapSize capSize} and will be set
     * to zero on the breadth axis. <P> So by default the label will be sized to match the center image of the
     * StretchImgButton, but these settings allow the label to partially or wholly overlap the caps.
     *
     * @return Integer
     */
    public Integer getLabelHPad()  {
        return getAttributeAsInt("labelHPad");
    }
    

    /**
     * The padding for a StretchImgButton's label is determined as follows. <P> If <code>labelHPad</code> is set it will
     * specify the horizontal padding applied to the label. Similarly if <code>labelVPad</code> is set it will specify the
     * vertical padding for the label, regardless of the button's {@link
     * com.smartgwt.client.widgets.StretchImgButton#getVertical vertical} setting. <P> Otherwise <code>labelLengthPad</code>
     * can be set to specify the label padding along the length axis (ie: horizontal padding if {@link
     * com.smartgwt.client.widgets.StretchImgButton#getVertical vertical} is false, otherwise vertical padding), and 
     * <code>labelBreadthPad</code> can be set to specify the label padding along the other axis. <P> Otherwise the padding on
     * the length axis will match the {@link com.smartgwt.client.widgets.StretchImgButton#getCapSize capSize} and will be set
     * to zero on the breadth axis. <P> So by default the label will be sized to match the center image of the
     * StretchImgButton, but these settings allow the label to partially or wholly overlap the caps.
     *
     * @param labelLengthPad  Default value is null
     */
    public void setLabelLengthPad(Integer labelLengthPad) {
        setAttribute("labelLengthPad", labelLengthPad, true);
    }

    /**
     * The padding for a StretchImgButton's label is determined as follows. <P> If <code>labelHPad</code> is set it will
     * specify the horizontal padding applied to the label. Similarly if <code>labelVPad</code> is set it will specify the
     * vertical padding for the label, regardless of the button's {@link
     * com.smartgwt.client.widgets.StretchImgButton#getVertical vertical} setting. <P> Otherwise <code>labelLengthPad</code>
     * can be set to specify the label padding along the length axis (ie: horizontal padding if {@link
     * com.smartgwt.client.widgets.StretchImgButton#getVertical vertical} is false, otherwise vertical padding), and 
     * <code>labelBreadthPad</code> can be set to specify the label padding along the other axis. <P> Otherwise the padding on
     * the length axis will match the {@link com.smartgwt.client.widgets.StretchImgButton#getCapSize capSize} and will be set
     * to zero on the breadth axis. <P> So by default the label will be sized to match the center image of the
     * StretchImgButton, but these settings allow the label to partially or wholly overlap the caps.
     *
     * @return Integer
     */
    public Integer getLabelLengthPad()  {
        return getAttributeAsInt("labelLengthPad");
    }
    

    /**
     * Specifies a skinImgDir to apply to the label containing the title of this  StretchImgButton. May be null in which case
     * <code>this.skinImgDir</code> will be applied to the label as well. <P> Note that icons displayed in the title may make
     * use of the skin img dir set here
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * setter for {@link com.smartgwt.client.widgets.StretchImgButton#getLabelSkinImgDir labelSkinImgDir}.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param labelSkinImgDir new skin img dir to apply to the label holding title text for   this widget.. Default value is null
     */
    public void setLabelSkinImgDir(String labelSkinImgDir) {
        setAttribute("labelSkinImgDir", labelSkinImgDir, true);
    }

    /**
     * Specifies a skinImgDir to apply to the label containing the title of this  StretchImgButton. May be null in which case
     * <code>this.skinImgDir</code> will be applied to the label as well. <P> Note that icons displayed in the title may make
     * use of the skin img dir set here
     *
     * @return String
     */
    public String getLabelSkinImgDir()  {
        return getAttributeAsString("labelSkinImgDir");
    }
    

    /**
     * The padding for a StretchImgButton's label is determined as follows. <P> If <code>labelHPad</code> is set it will
     * specify the horizontal padding applied to the label. Similarly if <code>labelVPad</code> is set it will specify the
     * vertical padding for the label, regardless of the button's {@link
     * com.smartgwt.client.widgets.StretchImgButton#getVertical vertical} setting. <P> Otherwise <code>labelLengthPad</code>
     * can be set to specify the label padding along the length axis (ie: horizontal padding if {@link
     * com.smartgwt.client.widgets.StretchImgButton#getVertical vertical} is false, otherwise vertical padding), and 
     * <code>labelBreadthPad</code> can be set to specify the label padding along the other axis. <P> Otherwise the padding on
     * the length axis will match the {@link com.smartgwt.client.widgets.StretchImgButton#getCapSize capSize} and will be set
     * to zero on the breadth axis. <P> So by default the label will be sized to match the center image of the
     * StretchImgButton, but these settings allow the label to partially or wholly overlap the caps.
     *
     * @param labelVPad  Default value is null
     */
    public void setLabelVPad(Integer labelVPad) {
        setAttribute("labelVPad", labelVPad, true);
    }

    /**
     * The padding for a StretchImgButton's label is determined as follows. <P> If <code>labelHPad</code> is set it will
     * specify the horizontal padding applied to the label. Similarly if <code>labelVPad</code> is set it will specify the
     * vertical padding for the label, regardless of the button's {@link
     * com.smartgwt.client.widgets.StretchImgButton#getVertical vertical} setting. <P> Otherwise <code>labelLengthPad</code>
     * can be set to specify the label padding along the length axis (ie: horizontal padding if {@link
     * com.smartgwt.client.widgets.StretchImgButton#getVertical vertical} is false, otherwise vertical padding), and 
     * <code>labelBreadthPad</code> can be set to specify the label padding along the other axis. <P> Otherwise the padding on
     * the length axis will match the {@link com.smartgwt.client.widgets.StretchImgButton#getCapSize capSize} and will be set
     * to zero on the breadth axis. <P> So by default the label will be sized to match the center image of the
     * StretchImgButton, but these settings allow the label to partially or wholly overlap the caps.
     *
     * @return Integer
     */
    public Integer getLabelVPad()  {
        return getAttributeAsInt("labelVPad");
    }
    

    /**
     * String identifier for this canvas's mutually exclusive selection group.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param radioGroup  Default value is null
     * @see com.smartgwt.client.docs.State State overview and related methods
     */
    public void setRadioGroup(String radioGroup) {
        setAttribute("radioGroup", radioGroup, true);
    }

    /**
     * String identifier for this canvas's mutually exclusive selection group.
     *
     * @return String
     * @see com.smartgwt.client.docs.State State overview and related methods
     */
    public String getRadioGroup()  {
        return getAttributeAsString("radioGroup");
    }
    

    /**
     * Whether this component is selected.  For some components, selection affects appearance.
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Select this object.
     *
     * @param selected  Default value is false
     * @see com.smartgwt.client.docs.State State overview and related methods
     */
    public void setSelected(Boolean selected) {
        setAttribute("selected", selected, true);
    }

    /**
     * Whether this component is selected.  For some components, selection affects appearance.
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.State State overview and related methods
     */
    public Boolean getSelected()  {
        return getAttributeAsBoolean("selected");
    }
    

    /**
     * If true and the title is clipped, then a hover containing the full title of this button is enabled.
     *
     * @param showClippedTitleOnHover  Default value is false
     */
    public void setShowClippedTitleOnHover(Boolean showClippedTitleOnHover) {
        setAttribute("showClippedTitleOnHover", showClippedTitleOnHover, true);
    }

    /**
     * If true and the title is clipped, then a hover containing the full title of this button is enabled.
     *
     * @return Boolean
     */
    public Boolean getShowClippedTitleOnHover()  {
        return getAttributeAsBoolean("showClippedTitleOnHover");
    }
    

    /**
     * Should we visibly change state when disabled?
     *
     * @param showDisabled  Default value is true
     * @see com.smartgwt.client.docs.State State overview and related methods
     */
    public void setShowDisabled(Boolean showDisabled) {
        setAttribute("showDisabled", showDisabled, true);
    }

    /**
     * Should we visibly change state when disabled?
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.State State overview and related methods
     */
    public Boolean getShowDisabled()  {
        return getAttributeAsBoolean("showDisabled");
    }
    

    /**
     * If using an icon for this button, whether to switch the icon image if the button becomes disabled.
     *
     * @param showDisabledIcon  Default value is true
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.docs.ButtonIcon ButtonIcon overview and related methods
     */
    public void setShowDisabledIcon(Boolean showDisabledIcon)  throws IllegalStateException {
        setAttribute("showDisabledIcon", showDisabledIcon, false);
    }

    /**
     * If using an icon for this button, whether to switch the icon image if the button becomes disabled.
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.ButtonIcon ButtonIcon overview and related methods
     */
    public Boolean getShowDisabledIcon()  {
        return getAttributeAsBoolean("showDisabledIcon");
    }
    

    /**
     * Should we visibly change state when the mouse goes down in this object?
     *
     * @param showDown  Default value is false
     * @see com.smartgwt.client.docs.State State overview and related methods
     */
    public void setShowDown(Boolean showDown) {
        setAttribute("showDown", showDown, true);
    }

    /**
     * Should we visibly change state when the mouse goes down in this object?
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.State State overview and related methods
     */
    public Boolean getShowDown()  {
        return getAttributeAsBoolean("showDown");
    }
    

    /**
     * If using an icon for this button, whether to switch the icon image when the mouse goes down on the button.
     *
     * @param showDownIcon  Default value is false
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.docs.ButtonIcon ButtonIcon overview and related methods
     */
    public void setShowDownIcon(Boolean showDownIcon)  throws IllegalStateException {
        setAttribute("showDownIcon", showDownIcon, false);
    }

    /**
     * If using an icon for this button, whether to switch the icon image when the mouse goes down on the button.
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.ButtonIcon ButtonIcon overview and related methods
     */
    public Boolean getShowDownIcon()  {
        return getAttributeAsBoolean("showDownIcon");
    }
    
    

    /**
     * Should we visibly change state when the canvas receives focus?  If {@link
     * com.smartgwt.client.widgets.StatefulCanvas#getShowFocusedAsOver showFocusedAsOver} is <code>true</code>, the
     * <b><code>"over"</code></b> will be used to indicate focus. Otherwise a separate <b><code>"focused"</code></b> state will
     * be used.
     *
     * @param showFocused  Default value is false
     * @see com.smartgwt.client.docs.State State overview and related methods
     */
    public void setShowFocused(Boolean showFocused) {
        setAttribute("showFocused", showFocused, true);
    }

    /**
     * Should we visibly change state when the canvas receives focus?  If {@link
     * com.smartgwt.client.widgets.StatefulCanvas#getShowFocusedAsOver showFocusedAsOver} is <code>true</code>, the
     * <b><code>"over"</code></b> will be used to indicate focus. Otherwise a separate <b><code>"focused"</code></b> state will
     * be used.
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.State State overview and related methods
     */
    public Boolean getShowFocused()  {
        return getAttributeAsBoolean("showFocused");
    }
    

    /**
     * If using an icon for this button, whether to switch the icon image when the button receives focus. <P> If {@link
     * com.smartgwt.client.widgets.StatefulCanvas#getShowFocusedAsOver showFocusedAsOver} is true, the <code>"Over"</code> icon
     * will be displayed when the canvas has focus, otherwise a separate <code>"Focused"</code> icon will be displayed
     *
     * @param showFocusedIcon  Default value is false
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.docs.ButtonIcon ButtonIcon overview and related methods
     */
    public void setShowFocusedIcon(Boolean showFocusedIcon)  throws IllegalStateException {
        setAttribute("showFocusedIcon", showFocusedIcon, false);
    }

    /**
     * If using an icon for this button, whether to switch the icon image when the button receives focus. <P> If {@link
     * com.smartgwt.client.widgets.StatefulCanvas#getShowFocusedAsOver showFocusedAsOver} is true, the <code>"Over"</code> icon
     * will be displayed when the canvas has focus, otherwise a separate <code>"Focused"</code> icon will be displayed
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.ButtonIcon ButtonIcon overview and related methods
     */
    public Boolean getShowFocusedIcon()  {
        return getAttributeAsBoolean("showFocusedIcon");
    }
    

    /**
     * Should we visibly change state when the mouse goes over this object?
     *
     * @param showRollOver  Default value is false
     * @see com.smartgwt.client.docs.State State overview and related methods
     */
    public void setShowRollOver(Boolean showRollOver) {
        setAttribute("showRollOver", showRollOver, true);
    }

    /**
     * Should we visibly change state when the mouse goes over this object?
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.State State overview and related methods
     */
    public Boolean getShowRollOver()  {
        return getAttributeAsBoolean("showRollOver");
    }
    

    /**
     * If using an icon for this button, whether to switch the icon image on mouse rollover.
     *
     * @param showRollOverIcon  Default value is false
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.docs.ButtonIcon ButtonIcon overview and related methods
     */
    public void setShowRollOverIcon(Boolean showRollOverIcon)  throws IllegalStateException {
        setAttribute("showRollOverIcon", showRollOverIcon, false);
    }

    /**
     * If using an icon for this button, whether to switch the icon image on mouse rollover.
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.ButtonIcon ButtonIcon overview and related methods
     */
    public Boolean getShowRollOverIcon()  {
        return getAttributeAsBoolean("showRollOverIcon");
    }
    

    /**
     * If using an icon for this button, whether to switch the icon image when the button becomes selected.
     *
     * @param showSelectedIcon  Default value is false
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.docs.ButtonIcon ButtonIcon overview and related methods
     */
    public void setShowSelectedIcon(Boolean showSelectedIcon)  throws IllegalStateException {
        setAttribute("showSelectedIcon", showSelectedIcon, false);
    }

    /**
     * If using an icon for this button, whether to switch the icon image when the button becomes selected.
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.ButtonIcon ButtonIcon overview and related methods
     */
    public Boolean getShowSelectedIcon()  {
        return getAttributeAsBoolean("showSelectedIcon");
    }
    

    /**
     * Determines whether any specified {@link com.smartgwt.client.widgets.StatefulCanvas#getTitle title} will be  displayed
     * for this component.<br> Applies to Image-based components only, where the title will be rendered out in a label floating
     * over the component
     *
     * @param showTitle  Default value is true
     */
    public void setShowTitle(Boolean showTitle) {
        setAttribute("showTitle", showTitle, true);
    }

    /**
     * Determines whether any specified {@link com.smartgwt.client.widgets.StatefulCanvas#getTitle title} will be  displayed
     * for this component.<br> Applies to Image-based components only, where the title will be rendered out in a label floating
     * over the component
     *
     * @return Boolean
     */
    public Boolean getShowTitle()  {
        return getAttributeAsBoolean("showTitle");
    }
    

    /**
     * Base URL for the image.  By default, StretchImgButtons consist of three image parts: A start image (displayed at the top
     * or left), a scalable central image and an end image displayed at the bottom or right. <P> The images displayed in the
     * stretchImgButton are derived from this property in the  following way: <P> <ul> <li> When the button is in its standard
     * state the suffixes "_start", "_end" and       "_stretch" are applied to the src (before the file extension), so by
     * default       the images displayed will be "button_start.gif" (sized to be       <code>this.capSize</code> by the
     * specified width of the stretchImgButton),       "button_stretch.gif" (stretched to the necessary width) and
     * "button_end.gif"       (sized the same as the start image). <li> As the button's state changes, the images will have
     * suffixes appended <b>before</b>      the "_start" / "_end" / "_stretch" to represent the button state.      See {@link
     * com.smartgwt.client.widgets.Img#getSrc src} for an overview of how states are combined into a compound      URL. </ul>
     * For example the center piece of a selected stretchImgButton with the mouse hovering over it might have the URL:
     * <code>"button_Selected_Down_stretch.gif"</code>. <P> Media should be present for each possible state of the _start, _end
     * and _stretch images.
     *
     * @param src  See {@link com.smartgwt.client.docs.SCImgURL SCImgURL} . Default value is "button.gif"
     */
    public void setSrc(String src) {
        setAttribute("src", src, true);
    }

    /**
     * Base URL for the image.  By default, StretchImgButtons consist of three image parts: A start image (displayed at the top
     * or left), a scalable central image and an end image displayed at the bottom or right. <P> The images displayed in the
     * stretchImgButton are derived from this property in the  following way: <P> <ul> <li> When the button is in its standard
     * state the suffixes "_start", "_end" and       "_stretch" are applied to the src (before the file extension), so by
     * default       the images displayed will be "button_start.gif" (sized to be       <code>this.capSize</code> by the
     * specified width of the stretchImgButton),       "button_stretch.gif" (stretched to the necessary width) and
     * "button_end.gif"       (sized the same as the start image). <li> As the button's state changes, the images will have
     * suffixes appended <b>before</b>      the "_start" / "_end" / "_stretch" to represent the button state.      See {@link
     * com.smartgwt.client.widgets.Img#getSrc src} for an overview of how states are combined into a compound      URL. </ul>
     * For example the center piece of a selected stretchImgButton with the mouse hovering over it might have the URL:
     * <code>"button_Selected_Down_stretch.gif"</code>. <P> Media should be present for each possible state of the _start, _end
     * and _stretch images.
     *
     * @return  See {@link com.smartgwt.client.docs.SCImgURL SCImgURL} 
     */
    public String getSrc()  {
        return getAttributeAsString("src");
    }
    

    /**
     * Current "state" of this widget. The state setting is automatically updated as the  user interacts with the component
     * (see {@link com.smartgwt.client.widgets.StatefulCanvas#getShowRollOver showRollOver},  {@link
     * com.smartgwt.client.widgets.StatefulCanvas#getShowDown showDown}, {@link
     * com.smartgwt.client.widgets.StatefulCanvas#getShowDisabled showDisabled}). <P> StatefulCanvases will have a different
     * appearance based on their current state.  By default this is handled by changing the css className applied to the
     * StatefulCanvas - see {@link com.smartgwt.client.widgets.StatefulCanvas#getBaseStyle baseStyle} and  {@link
     * com.smartgwt.client.widgets.StatefulCanvas#getStateSuffix StatefulCanvas.getStateSuffix} for a description of how this
     * is done. <P> For {@link com.smartgwt.client.widgets.Img} or {@link com.smartgwt.client.widgets.StretchImg} based
     * subclasses of StatefulCanvas, the  appearance may also be updated by changing the src of the rendered image. See {@link
     * com.smartgwt.client.widgets.Img#getSrc src} and {@link com.smartgwt.client.widgets.StretchImgButton#getSrc src} for a
     * description of how the URL  is modified to reflect the state of the widget in this case.
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Sets the {@link com.smartgwt.client.widgets.StatefulCanvas#getState state} of this object, changing its appearance. Note: <code>newState</code> cannot be  {@link com.smartgwt.client.types.State#STATE_DISABLED} if {@link com.smartgwt.client.widgets.StatefulCanvas#getShowDisabled this.showDisabled} is <code>false</code>.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param state the new state.. Default value is ""
     * @see com.smartgwt.client.types.State
     * @see com.smartgwt.client.docs.State State overview and related methods
     */
    public void setState(State state) {
        setAttribute("state", state == null ? null : state.getValue(), true);
    }

    /**
     * Current "state" of this widget. The state setting is automatically updated as the  user interacts with the component
     * (see {@link com.smartgwt.client.widgets.StatefulCanvas#getShowRollOver showRollOver},  {@link
     * com.smartgwt.client.widgets.StatefulCanvas#getShowDown showDown}, {@link
     * com.smartgwt.client.widgets.StatefulCanvas#getShowDisabled showDisabled}). <P> StatefulCanvases will have a different
     * appearance based on their current state.  By default this is handled by changing the css className applied to the
     * StatefulCanvas - see {@link com.smartgwt.client.widgets.StatefulCanvas#getBaseStyle baseStyle} and  {@link
     * com.smartgwt.client.widgets.StatefulCanvas#getStateSuffix StatefulCanvas.getStateSuffix} for a description of how this
     * is done. <P> For {@link com.smartgwt.client.widgets.Img} or {@link com.smartgwt.client.widgets.StretchImg} based
     * subclasses of StatefulCanvas, the  appearance may also be updated by changing the src of the rendered image. See {@link
     * com.smartgwt.client.widgets.Img#getSrc src} and {@link com.smartgwt.client.widgets.StretchImgButton#getSrc src} for a
     * description of how the URL  is modified to reflect the state of the widget in this case.
     *
     * @return Return the state of this StatefulCanvas
     * @see com.smartgwt.client.types.State
     * @see com.smartgwt.client.docs.State State overview and related methods
     */
    public State getState()  {
        return EnumUtil.getEnum(State.values(), getAttribute("state"));
    }
    

    /**
     * The title HTML to display in this button.
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Setter for the {@link com.smartgwt.client.widgets.StatefulCanvas#getTitle title}.
     *
     * @param title the new title HTML. See {@link com.smartgwt.client.docs.HTMLString HTMLString} . Default value is null
     * @see com.smartgwt.client.docs.Basics Basics overview and related methods
     */
    public void setTitle(String title) {
        setAttribute("title", title, true);
    }

    /**
     * The title HTML to display in this button.
     *
     * @return Return the title - HTML drawn inside the component. <p> Default is to simply return this.title. See {@link com.smartgwt.client.docs.HTMLString HTMLString} 
     * @see com.smartgwt.client.docs.Basics Basics overview and related methods
     */
    public String getTitle()  {
        return getAttributeAsString("title");
    }
    

    /**
     * CSS style applied to the title text only.  Defaults to {@link com.smartgwt.client.widgets.StretchImgButton#getBaseStyle
     * baseStyle} when unset. <P> With a separate <code>titleStyle</code> and {@link
     * com.smartgwt.client.widgets.StretchImgButton#getBaseStyle baseStyle} set, you can provide a backgroundColor via
     * <code>baseStyle</code> that will allow translucent .png media to be "tinted" by the underlying background color, so that
     * a single set of media can provide range of color options.  In this usage, the <code>titleStyle</code> should generally
     * not specify a background color as this would block out the media that appears behind the title.
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Sets the {@link com.smartgwt.client.widgets.StretchImgButton#getTitleStyle titleStyle}, which is applied to the title text.
     *
     * @param titleStyle new title style See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} . Default value is null
     */
    public void setTitleStyle(String titleStyle) {
        setAttribute("titleStyle", titleStyle, true);
    }

    /**
     * CSS style applied to the title text only.  Defaults to {@link com.smartgwt.client.widgets.StretchImgButton#getBaseStyle
     * baseStyle} when unset. <P> With a separate <code>titleStyle</code> and {@link
     * com.smartgwt.client.widgets.StretchImgButton#getBaseStyle baseStyle} set, you can provide a backgroundColor via
     * <code>baseStyle</code> that will allow translucent .png media to be "tinted" by the underlying background color, so that
     * a single set of media can provide range of color options.  In this usage, the <code>titleStyle</code> should generally
     * not specify a background color as this would block out the media that appears behind the title.
     *
     * @return  See {@link com.smartgwt.client.docs.CSSStyleName CSSStyleName} 
     */
    public String getTitleStyle()  {
        return getAttributeAsString("titleStyle");
    }
    

    /**
     * Vertical alignment of this component's title.
     *
     * @param valign  Default value is Canvas.CENTER
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setValign(VerticalAlignment valign) {
        setAttribute("valign", valign == null ? null : valign.getValue(), true);
    }

    /**
     * Vertical alignment of this component's title.
     *
     * @return VerticalAlignment
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public VerticalAlignment getValign()  {
        return EnumUtil.getEnum(VerticalAlignment.values(), getAttribute("valign"));
    }
    

    /**
     * Default is a horizontal button.  Vertical StretchImgButtons are allowed, but title text, if any, will not be
     * automatically rotated.
     *
     * @param vertical  Default value is false
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setVertical(Boolean vertical) {
        setAttribute("vertical", vertical, true);
    }

    /**
     * Default is a horizontal button.  Vertical StretchImgButtons are allowed, but title text, if any, will not be
     * automatically rotated.
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public Boolean getVertical()  {
        return getAttributeAsBoolean("vertical");
    }
    

    /**
     * Should the title for this button wrap? If unset, default behavior is to allow wrapping if this.vertical is true,
     * otherwise disallow wrapping
     *
     * @param wrap  Default value is null
     */
    public void setWrap(Boolean wrap) {
        setAttribute("wrap", wrap, true);
    }

    /**
     * Should the title for this button wrap? If unset, default behavior is to allow wrapping if this.vertical is true,
     * otherwise disallow wrapping
     *
     * @return Boolean
     */
    public Boolean getWrap()  {
        return getAttributeAsBoolean("wrap");
    }
    

    // ********************* Methods ***********************
	/**
     * This property contains the default 'action' for the Button to fire when activated.
     */
    public native void action() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.action();
    }-*/;


	/**
     * Add this widget to the specified mutually exclusive selection group with the ID passed in. Selecting this widget will
     * then deselect any other StatefulCanvases with the same radioGroup ID. StatefulCanvases can belong to only one
     * radioGroup, so this method will remove from  any other radiogroup of which this button is already a member.
     * @param groupID - ID of the radiogroup to which this widget should be added
     * @see com.smartgwt.client.docs.State State overview and related methods
     */
    public native void addToRadioGroup(String groupID) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.addToRadioGroup(groupID);
    }-*/;


	/**
     * Select this object.
     * @see com.smartgwt.client.docs.State State overview and related methods
     */
    public native void deselect() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.deselect();
    }-*/;

    /**
     * Add a iconClick handler.
     * <p>
     * If this button is showing an {@link com.smartgwt.client.widgets.StretchImgButton#getIcon icon}, a separate click handler
     * for the icon may be defined as <code>this.iconClick</code>. Returning false will suppress the standard button click
     * handling code.
     *
     * @param handler the iconClick handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addIconClickHandler(com.smartgwt.client.widgets.events.IconClickHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.events.IconClickEvent.getType()) == 0) setupIconClickEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.events.IconClickEvent.getType());
    }

    private native void setupIconClickEvent() /*-{
        var obj = null;
        var selfJ = this;
        var iconClick = $debox($entry(function(param){
                var event = @com.smartgwt.client.widgets.events.IconClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                var ret = event.@com.smartgwt.client.event.Cancellable::isCancelled()();
                return !ret;
            }));
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({iconClick: 
                function () {
                    var param = {};
                    return iconClick(param) == true;
                }
             });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.iconClick = 
                function () {
                    var param = {};
                    return iconClick(param) == true;
                }
            ;
        }
   }-*/;
	/**
     * Find out if this object is selected
     *
     * @return 
     * @see com.smartgwt.client.docs.State State overview and related methods
     */
    public native Boolean isSelected() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.isSelected();
        if(ret == null) return null;
        return @com.smartgwt.client.util.JSOHelper::toBoolean(Z)(ret);
    }-*/;

	/**
     * Remove this widget from the specified mutually exclusive selection group with the ID passed in. No-op's if this widget
     * is not a member of the groupID passed in. If no groupID is passed in, defaults to removing from whatever radioGroup this
     * widget is a member of.
     * @see com.smartgwt.client.docs.State State overview and related methods
     */
    public native void removeFromRadioGroup() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.removeFromRadioGroup();
    }-*/;

	/**
     * Remove this widget from the specified mutually exclusive selection group with the ID passed in. No-op's if this widget
     * is not a member of the groupID passed in. If no groupID is passed in, defaults to removing from whatever radioGroup this
     * widget is a member of.
     * @param groupID - optional radio group ID (to ensure the widget is removed                                        from the appropriate
     * group.
     * @see com.smartgwt.client.docs.State State overview and related methods
     */
    public native void removeFromRadioGroup(String groupID) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.removeFromRadioGroup(groupID);
    }-*/;
	
	/**
     * Select this object.
     * @see com.smartgwt.client.docs.State State overview and related methods
     */
    public native void select() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.select();
    }-*/;

	/**
     * Is the title of this button clipped?
     *
     * @return whether the title is clipped.
     */
    public native boolean titleClipped() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.titleClipped();
        return ret;
    }-*/;

    /**
     * Add a titleHover handler.
     * <p>
     * Optional stringMethod to fire when the user hovers over this button and the title is clipped. If {@link
     * com.smartgwt.client.widgets.StretchImgButton#getShowClippedTitleOnHover showClippedTitleOnHover} is true, the default
     * behavior is to show a hover canvas containing the HTML returned by {@link
     * com.smartgwt.client.widgets.StretchImgButton#titleHoverHTML StretchImgButton.titleHoverHTML}. Call {@link
     * com.smartgwt.client.widgets.events.TitleHoverEvent#cancel()} from within {@link
     * com.smartgwt.client.widgets.events.TitleHoverHandler#onTitleHover} to suppress this default behavior.
     *
     * @param handler the titleHover handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addTitleHoverHandler(com.smartgwt.client.widgets.events.TitleHoverHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.events.TitleHoverEvent.getType()) == 0) setupTitleHoverEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.events.TitleHoverEvent.getType());
    }

    private native void setupTitleHoverEvent() /*-{
        var obj = null;
        var selfJ = this;
        var titleHover = $debox($entry(function(param){
                var event = @com.smartgwt.client.widgets.events.TitleHoverEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                var ret = event.@com.smartgwt.client.event.Cancellable::isCancelled()();
                return !ret;
            }));
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({titleHover: 
                function () {
                    var param = {};
                    return titleHover(param) == true;
                }
             });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.titleHover = 
                function () {
                    var param = {};
                    return titleHover(param) == true;
                }
            ;
        }
   }-*/;

	/**
     * Returns the HTML that is displayed by the default {@link
     * com.smartgwt.client.widgets.StretchImgButton#addTitleHoverHandler titleHover} handler. Return null or an empty string to
     * cancel the hover. <p>Use <code>setTitleHoverFormatter()</code> to provide a custom implementation.
     * @param defaultHTML the HTML that would have been displayed by default. See {@link com.smartgwt.client.docs.HTMLString HTMLString}
     *
     * @return HTML to be displayed in the hover. If null or an empty string, then the hover is canceled.
     */
    public native String titleHoverHTML(String defaultHTML) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.titleHoverHTML(defaultHTML);
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
     * @param stretchImgButtonProperties properties that should be used as new defaults when instances of this class are created
     */
    public static native void setDefaultProperties(StretchImgButton stretchImgButtonProperties) /*-{
    	var properties = $wnd.isc.addProperties({},stretchImgButtonProperties.@com.smartgwt.client.widgets.BaseWidget::getConfig()());
        @com.smartgwt.client.util.JSOHelper::cleanProperties(Lcom/google/gwt/core/client/JavaScriptObject;Z)(properties,false);
        $wnd.isc.StretchImgButton.addProperties(properties);
    }-*/;

    // ***********************************************************



    /**
     * Provide a custom implementation of {@link #titleHoverHTML(java.lang.String)}.
     */
    public native void setTitleHoverFormatter(TitleHoverFormatter formatter) /*-{
        var self;
        if (this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            self = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
        } else {
            self = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
        }

        var newTitleHoverHTMLFun;
        if (formatter == null) {
            newTitleHoverHTMLFun = $wnd.isc[this.@com.smartgwt.client.widgets.BaseWidget::scClassName].getInstanceProperty("titleHoverHTML");
        } else {
            newTitleHoverHTMLFun = $entry(function (defaultHTML) {
                return formatter.@com.smartgwt.client.widgets.TitleHoverFormatter::getHoverHTML(Ljava/lang/String;)(defaultHTML);
            });
        }
        self.titleHoverHTML = newTitleHoverHTMLFun;
    }-*/;

    public LogicalStructureObject setLogicalStructure(StretchImgButtonLogicalStructure s) {
        super.setLogicalStructure(s);
        try {
            s.actionType = getAttributeAsString("actionType");
        } catch (Throwable t) {
            s.logicalStructureErrors += "StretchImgButton.actionType:" + t.getMessage() + "\n";
        }
        try {
            s.align = getAttributeAsString("align");
        } catch (Throwable t) {
            s.logicalStructureErrors += "StretchImgButton.align:" + t.getMessage() + "\n";
        }
        try {
            s.autoFit = getAttributeAsString("autoFit");
        } catch (Throwable t) {
            s.logicalStructureErrors += "StretchImgButton.autoFit:" + t.getMessage() + "\n";
        }
        try {
            s.baseStyle = getAttributeAsString("baseStyle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "StretchImgButton.baseStyle:" + t.getMessage() + "\n";
        }
        try {
            s.capSize = getAttributeAsString("capSize");
        } catch (Throwable t) {
            s.logicalStructureErrors += "StretchImgButton.capSize:" + t.getMessage() + "\n";
        }
        try {
            s.hiliteAccessKey = getAttributeAsString("hiliteAccessKey");
        } catch (Throwable t) {
            s.logicalStructureErrors += "StretchImgButton.hiliteAccessKey:" + t.getMessage() + "\n";
        }
        try {
            s.icon = getAttributeAsString("icon");
        } catch (Throwable t) {
            s.logicalStructureErrors += "StretchImgButton.icon:" + t.getMessage() + "\n";
        }
        try {
            s.iconAlign = getAttributeAsString("iconAlign");
        } catch (Throwable t) {
            s.logicalStructureErrors += "StretchImgButton.iconAlign:" + t.getMessage() + "\n";
        }
        try {
            s.iconHeight = getAttributeAsString("iconHeight");
        } catch (Throwable t) {
            s.logicalStructureErrors += "StretchImgButton.iconHeight:" + t.getMessage() + "\n";
        }
        try {
            s.iconOrientation = getAttributeAsString("iconOrientation");
        } catch (Throwable t) {
            s.logicalStructureErrors += "StretchImgButton.iconOrientation:" + t.getMessage() + "\n";
        }
        try {
            s.iconSize = getAttributeAsString("iconSize");
        } catch (Throwable t) {
            s.logicalStructureErrors += "StretchImgButton.iconSize:" + t.getMessage() + "\n";
        }
        try {
            s.iconSpacing = getAttributeAsString("iconSpacing");
        } catch (Throwable t) {
            s.logicalStructureErrors += "StretchImgButton.iconSpacing:" + t.getMessage() + "\n";
        }
        try {
            s.iconWidth = getAttributeAsString("iconWidth");
        } catch (Throwable t) {
            s.logicalStructureErrors += "StretchImgButton.iconWidth:" + t.getMessage() + "\n";
        }
        try {
            s.labelBreadthPad = getAttributeAsString("labelBreadthPad");
        } catch (Throwable t) {
            s.logicalStructureErrors += "StretchImgButton.labelBreadthPad:" + t.getMessage() + "\n";
        }
        try {
            s.labelHPad = getAttributeAsString("labelHPad");
        } catch (Throwable t) {
            s.logicalStructureErrors += "StretchImgButton.labelHPad:" + t.getMessage() + "\n";
        }
        try {
            s.labelLengthPad = getAttributeAsString("labelLengthPad");
        } catch (Throwable t) {
            s.logicalStructureErrors += "StretchImgButton.labelLengthPad:" + t.getMessage() + "\n";
        }
        try {
            s.labelSkinImgDir = getAttributeAsString("labelSkinImgDir");
        } catch (Throwable t) {
            s.logicalStructureErrors += "StretchImgButton.labelSkinImgDir:" + t.getMessage() + "\n";
        }
        try {
            s.labelVPad = getAttributeAsString("labelVPad");
        } catch (Throwable t) {
            s.logicalStructureErrors += "StretchImgButton.labelVPad:" + t.getMessage() + "\n";
        }
        try {
            s.radioGroup = getAttributeAsString("radioGroup");
        } catch (Throwable t) {
            s.logicalStructureErrors += "StretchImgButton.radioGroup:" + t.getMessage() + "\n";
        }
        try {
            s.selected = getAttributeAsString("selected");
        } catch (Throwable t) {
            s.logicalStructureErrors += "StretchImgButton.selected:" + t.getMessage() + "\n";
        }
        try {
            s.showClippedTitleOnHover = getAttributeAsString("showClippedTitleOnHover");
        } catch (Throwable t) {
            s.logicalStructureErrors += "StretchImgButton.showClippedTitleOnHover:" + t.getMessage() + "\n";
        }
        try {
            s.showDisabled = getAttributeAsString("showDisabled");
        } catch (Throwable t) {
            s.logicalStructureErrors += "StretchImgButton.showDisabled:" + t.getMessage() + "\n";
        }
        try {
            s.showDisabledIcon = getAttributeAsString("showDisabledIcon");
        } catch (Throwable t) {
            s.logicalStructureErrors += "StretchImgButton.showDisabledIcon:" + t.getMessage() + "\n";
        }
        try {
            s.showDown = getAttributeAsString("showDown");
        } catch (Throwable t) {
            s.logicalStructureErrors += "StretchImgButton.showDown:" + t.getMessage() + "\n";
        }
        try {
            s.showDownIcon = getAttributeAsString("showDownIcon");
        } catch (Throwable t) {
            s.logicalStructureErrors += "StretchImgButton.showDownIcon:" + t.getMessage() + "\n";
        }
        try {
            s.showFocused = getAttributeAsString("showFocused");
        } catch (Throwable t) {
            s.logicalStructureErrors += "StretchImgButton.showFocused:" + t.getMessage() + "\n";
        }
        try {
            s.showFocusedIcon = getAttributeAsString("showFocusedIcon");
        } catch (Throwable t) {
            s.logicalStructureErrors += "StretchImgButton.showFocusedIcon:" + t.getMessage() + "\n";
        }
        try {
            s.showRollOver = getAttributeAsString("showRollOver");
        } catch (Throwable t) {
            s.logicalStructureErrors += "StretchImgButton.showRollOver:" + t.getMessage() + "\n";
        }
        try {
            s.showRollOverIcon = getAttributeAsString("showRollOverIcon");
        } catch (Throwable t) {
            s.logicalStructureErrors += "StretchImgButton.showRollOverIcon:" + t.getMessage() + "\n";
        }
        try {
            s.showSelectedIcon = getAttributeAsString("showSelectedIcon");
        } catch (Throwable t) {
            s.logicalStructureErrors += "StretchImgButton.showSelectedIcon:" + t.getMessage() + "\n";
        }
        try {
            s.showTitle = getAttributeAsString("showTitle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "StretchImgButton.showTitle:" + t.getMessage() + "\n";
        }
        try {
            s.src = getAttributeAsString("src");
        } catch (Throwable t) {
            s.logicalStructureErrors += "StretchImgButton.src:" + t.getMessage() + "\n";
        }
        try {
            s.state = getAttributeAsString("state");
        } catch (Throwable t) {
            s.logicalStructureErrors += "StretchImgButton.state:" + t.getMessage() + "\n";
        }
        try {
            s.title = getAttributeAsString("title");
        } catch (Throwable t) {
            s.logicalStructureErrors += "StretchImgButton.title:" + t.getMessage() + "\n";
        }
        try {
            s.titleStyle = getAttributeAsString("titleStyle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "StretchImgButton.titleStyle:" + t.getMessage() + "\n";
        }
        try {
            s.valign = getAttributeAsString("valign");
        } catch (Throwable t) {
            s.logicalStructureErrors += "StretchImgButton.valign:" + t.getMessage() + "\n";
        }
        try {
            s.vertical = getAttributeAsString("vertical");
        } catch (Throwable t) {
            s.logicalStructureErrors += "StretchImgButton.vertical:" + t.getMessage() + "\n";
        }
        try {
            s.wrap = getAttributeAsString("wrap");
        } catch (Throwable t) {
            s.logicalStructureErrors += "StretchImgButton.wrap:" + t.getMessage() + "\n";
        }
        return s;
    }

    public LogicalStructureObject getLogicalStructure() {
        StretchImgButtonLogicalStructure s = new StretchImgButtonLogicalStructure();
        setLogicalStructure(s);
        return s;
    }
}


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

/**
 * Tabs are specified as objects, not class instances.  For example, when
 *  developing in JavaScript, a typical initialization block for a TabSet would look like
 *  this:
 *  <pre>
 *  TabSet.create({
 *      tabs: [
 *          {title: "tab1", pane: "pane1"},
 *          {title: "tab2"}
 *      ]
 *  });
 *  </pre>
 *  And in XML:
 *  <pre>
 *  &lt;TabSet&gt;
 *     &lt;tabs&gt;
 *         &lt;Tab title="tab1" pane="pane1"/&gt;
 *         &lt;Tab title="tab2"/&gt;
 *     &lt;/tabs&gt;
 *  &lt;/TabSet&gt;
 *  </pre>
 */
@BeanFactory.FrameworkClass
public class Tab extends RefDataClass implements com.smartgwt.client.widgets.tab.events.HasTabDeselectedHandlers, com.smartgwt.client.widgets.tab.events.HasTabSelectedHandlers {

    public static Tab getOrCreateRef(JavaScriptObject jsObj) {

        if(jsObj == null) return null;

        RefDataClass obj = RefDataClass.getRef(jsObj);


        if(obj != null) {
            obj.setJsObj(jsObj);
            return (Tab) obj;
        } else {
            return new Tab(jsObj);
        }
    }


    public Tab(){
        internalSetID(SC.generateID(getClass().getName()), true, true);
    }

    public Tab(JavaScriptObject jsObj){
        
        setJavaScriptObject(jsObj);
    }


    public Tab(String title) {
        setTitle(title);
                internalSetID(SC.generateID(getClass().getName()), true, true);
    }


    public Tab(String title, String icon) {
        setTitle(title);
		setIcon(icon);
                internalSetID(SC.generateID(getClass().getName()), true, true);
    }


    // ********************* Properties / Attributes ***********************

    /**
     * Determines whether this tab should show a close icon allowing the user to dismiss the tab by clicking on the close icon
     * directly. The URL for the close icon's image will be derived from  {@link
     * com.smartgwt.client.widgets.tab.TabSet#getCloseTabIcon closeTabIcon} by default, but may be overridden by explicitly
     * specifying {@link com.smartgwt.client.widgets.tab.Tab#getCloseIcon closeIcon}. <p> If unset or null, this property is
     * derived from {@link com.smartgwt.client.widgets.tab.TabSet#getCanCloseTabs canCloseTabs}. <p> Note that setting
     * <code>canClose</code> means that {@link com.smartgwt.client.widgets.tab.Tab#getIcon icon} cannot be used, because it's
     * used for the {@link com.smartgwt.client.widgets.tab.Tab#getCloseIcon closeIcon} - see {@link
     * com.smartgwt.client.widgets.tab.TabSet#getCanCloseTabs canCloseTabs} for a workaround. <p> After the TabSet has been
     * created, you can change a tab's canClose property by calling {@link
     * com.smartgwt.client.widgets.tab.TabSet#setCanCloseTab TabSet.setCanCloseTab}.
     *
     * @param canClose  Default value is null
     * @see com.smartgwt.client.widgets.tab.TabSet#closeClick
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#layout_tabs_closeable" target="examples">Closeable Tabs Example</a>
     */
    public void setCanClose(Boolean canClose) {
        setAttribute("canClose", canClose);
    }

    /**
     * Determines whether this tab should show a close icon allowing the user to dismiss the tab by clicking on the close icon
     * directly. The URL for the close icon's image will be derived from  {@link
     * com.smartgwt.client.widgets.tab.TabSet#getCloseTabIcon closeTabIcon} by default, but may be overridden by explicitly
     * specifying {@link com.smartgwt.client.widgets.tab.Tab#getCloseIcon closeIcon}. <p> If unset or null, this property is
     * derived from {@link com.smartgwt.client.widgets.tab.TabSet#getCanCloseTabs canCloseTabs}. <p> Note that setting
     * <code>canClose</code> means that {@link com.smartgwt.client.widgets.tab.Tab#getIcon icon} cannot be used, because it's
     * used for the {@link com.smartgwt.client.widgets.tab.Tab#getCloseIcon closeIcon} - see {@link
     * com.smartgwt.client.widgets.tab.TabSet#getCanCloseTabs canCloseTabs} for a workaround. <p> After the TabSet has been
     * created, you can change a tab's canClose property by calling {@link
     * com.smartgwt.client.widgets.tab.TabSet#setCanCloseTab TabSet.setCanCloseTab}.
     *
     * @return Boolean
     * @see com.smartgwt.client.widgets.tab.TabSet#closeClick
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#layout_tabs_closeable" target="examples">Closeable Tabs Example</a>
     */
    public Boolean getCanClose()  {
        return getAttributeAsBoolean("canClose", true);
    }
    

    /**
     * If specified, overrides the {@link com.smartgwt.client.widgets.tab.TabSet#getCanEditTabTitles canEditTabTitles} setting,
     * for this one tab only. <p> Note that the TabSet's {@link com.smartgwt.client.widgets.tab.TabSet#getTitleEditEvent
     * titleEditEvent} must be set to a supported {@link com.smartgwt.client.types.TabTitleEditEvent} in order for users to be
     * able to edit this tab's title.
     *
     * @param canEditTitle  Default value is null
     * @see com.smartgwt.client.widgets.tab.TabSet#setCanEditTabTitles
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#layout_tabs_title_editable" target="examples">User-Editable Titles Example</a>
     */
    public void setCanEditTitle(Boolean canEditTitle) {
        setAttribute("canEditTitle", canEditTitle);
    }

    /**
     * If specified, overrides the {@link com.smartgwt.client.widgets.tab.TabSet#getCanEditTabTitles canEditTabTitles} setting,
     * for this one tab only. <p> Note that the TabSet's {@link com.smartgwt.client.widgets.tab.TabSet#getTitleEditEvent
     * titleEditEvent} must be set to a supported {@link com.smartgwt.client.types.TabTitleEditEvent} in order for users to be
     * able to edit this tab's title.
     *
     * @return Boolean
     * @see com.smartgwt.client.widgets.tab.TabSet#getCanEditTabTitles
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#layout_tabs_title_editable" target="examples">User-Editable Titles Example</a>
     */
    public Boolean getCanEditTitle()  {
        return getAttributeAsBoolean("canEditTitle", true);
    }
    

    /**
     * If {@link com.smartgwt.client.widgets.tab.TabSet#getCanReorderTabs canReorderTabs} is set to <code>true</code>, setting
     * <code>canReorder</code> explicitly to <code>false</code> for some tab will disallow drag-reordering of this tab. Has no
     * effect if <code>canReorderTabs</code> is not true at the tabSet level. <P> Note that this setting also disallows a
     * reorder of another tab into the slot before or following this tab. This means for tabs located at the beginning or end
     * of the  tab-bar, users cannot changing the index of the tab by dropping another before or after it. However if you have
     * a <i><code>canReorder:false</code></i> tab which is not at the beginning or end of the tab bar, users can drag reorder
     * other tabs around it which may ultimately change its position.
     *
     * @param canReorder  Default value is null
     * @see com.smartgwt.client.widgets.tab.TabSet#setCanReorderTabs
     */
    public void setCanReorder(Boolean canReorder) {
        setAttribute("canReorder", canReorder);
    }

    /**
     * If {@link com.smartgwt.client.widgets.tab.TabSet#getCanReorderTabs canReorderTabs} is set to <code>true</code>, setting
     * <code>canReorder</code> explicitly to <code>false</code> for some tab will disallow drag-reordering of this tab. Has no
     * effect if <code>canReorderTabs</code> is not true at the tabSet level. <P> Note that this setting also disallows a
     * reorder of another tab into the slot before or following this tab. This means for tabs located at the beginning or end
     * of the  tab-bar, users cannot changing the index of the tab by dropping another before or after it. However if you have
     * a <i><code>canReorder:false</code></i> tab which is not at the beginning or end of the tab bar, users can drag reorder
     * other tabs around it which may ultimately change its position.
     *
     * @return Boolean
     * @see com.smartgwt.client.widgets.tab.TabSet#getCanReorderTabs
     */
    public Boolean getCanReorder()  {
        return getAttributeAsBoolean("canReorder", true);
    }
    

    /**
     * Custom src for the close icon for this tab to display if it is closeable. See {@link
     * com.smartgwt.client.widgets.tab.Tab#getCanClose canClose} and {@link
     * com.smartgwt.client.widgets.tab.TabSet#getCanCloseTabs canCloseTabs}.
     *
     * @param closeIcon  See {@link com.smartgwt.client.docs.SCImgURL SCImgURL} . Default value is null
     */
    public void setCloseIcon(String closeIcon) {
        setAttribute("closeIcon", closeIcon);
    }

    /**
     * Custom src for the close icon for this tab to display if it is closeable. See {@link
     * com.smartgwt.client.widgets.tab.Tab#getCanClose canClose} and {@link
     * com.smartgwt.client.widgets.tab.TabSet#getCanCloseTabs canCloseTabs}.
     *
     * @return  See {@link com.smartgwt.client.docs.SCImgURL SCImgURL} 
     */
    public String getCloseIcon()  {
        return getAttributeAsString("closeIcon");
    }
    

    /**
     * Size of the {@link com.smartgwt.client.widgets.tab.Tab#getCloseIcon closeIcon} for this tab. If unspecified the icon
     * will be sized according to {@link com.smartgwt.client.widgets.tab.TabSet#getCloseTabIconSize closeTabIconSize}
     *
     * @param closeIconSize  Default value is null
     */
    public void setCloseIconSize(Integer closeIconSize) {
        setAttribute("closeIconSize", closeIconSize);
    }

    /**
     * Size of the {@link com.smartgwt.client.widgets.tab.Tab#getCloseIcon closeIcon} for this tab. If unspecified the icon
     * will be sized according to {@link com.smartgwt.client.widgets.tab.TabSet#getCloseTabIconSize closeTabIconSize}
     *
     * @return Integer
     */
    public Integer getCloseIconSize()  {
        return getAttributeAsInt("closeIconSize");
    }
    
    
    

    /**
     * If {@link com.smartgwt.client.widgets.tab.Tab#getIcon icon} is specified, this property may be used to specify a size
     * for the icon
     *
     * @param iconHeight  Default value is null
     */
    public void setIconHeight(Integer iconHeight) {
        setAttribute("iconHeight", iconHeight);
    }

    /**
     * If {@link com.smartgwt.client.widgets.tab.Tab#getIcon icon} is specified, this property may be used to specify a size
     * for the icon
     *
     * @return Integer
     */
    public Integer getIconHeight()  {
        return getAttributeAsInt("iconHeight");
    }
    

    /**
     * If {@link com.smartgwt.client.widgets.tab.Tab#getIcon icon} is specified, this property may be used to specify a size
     * for the icon. Per side sizing may be specified instead via {@link com.smartgwt.client.widgets.tab.Tab#getIconWidth
     * iconWidth} and {@link com.smartgwt.client.widgets.tab.Tab#getIconHeight iconHeight}.
     *
     * @param iconSize  Default value is 16
     */
    public void setIconSize(Integer iconSize) {
        setAttribute("iconSize", iconSize);
    }

    /**
     * If {@link com.smartgwt.client.widgets.tab.Tab#getIcon icon} is specified, this property may be used to specify a size
     * for the icon. Per side sizing may be specified instead via {@link com.smartgwt.client.widgets.tab.Tab#getIconWidth
     * iconWidth} and {@link com.smartgwt.client.widgets.tab.Tab#getIconHeight iconHeight}.
     *
     * @return Integer
     */
    public Integer getIconSize()  {
        return getAttributeAsInt("iconSize");
    }
    

    /**
     * If {@link com.smartgwt.client.widgets.tab.Tab#getIcon icon} is specified, this property may be used to specify a size
     * for the icon
     *
     * @param iconWidth  Default value is null
     */
    public void setIconWidth(Integer iconWidth) {
        setAttribute("iconWidth", iconWidth);
    }

    /**
     * If {@link com.smartgwt.client.widgets.tab.Tab#getIcon icon} is specified, this property may be used to specify a size
     * for the icon
     *
     * @return Integer
     */
    public Integer getIconWidth()  {
        return getAttributeAsInt("iconWidth");
    }
    
    

    /**
     * Optional name for the tab, which can later be used to reference the tab. APIs requiring a reference to a tab will accept
     * the tab's name [including  {@link com.smartgwt.client.widgets.tab.TabSet#selectTab TabSet.selectTab}, {@link
     * com.smartgwt.client.widgets.tab.TabSet#updateTab TabSet.updateTab}, {@link
     * com.smartgwt.client.widgets.tab.TabSet#removeTab TabSet.removeTab}].<br> This name will also be passed to the {@link
     * com.smartgwt.client.widgets.tab.TabSet#addTabSelectedHandler TabSet.tabSelected} and {@link
     * com.smartgwt.client.widgets.tab.TabSet#addTabDeselectedHandler TabSet.tabDeselected} handler functions, if specified.
     * <p> This identifier is requred to be locally unique to the TabSet and cannot be used to get a global reference to the
     * Tab.  If you want a global reference, set {@link com.smartgwt.client.widgets.tab.Tab#getID ID} instead.
     *
     * @param name  Default value is null
     */
    public void setName(String name) {
        setAttribute("name", name);
    }

    /**
     * Optional name for the tab, which can later be used to reference the tab. APIs requiring a reference to a tab will accept
     * the tab's name [including  {@link com.smartgwt.client.widgets.tab.TabSet#selectTab TabSet.selectTab}, {@link
     * com.smartgwt.client.widgets.tab.TabSet#updateTab TabSet.updateTab}, {@link
     * com.smartgwt.client.widgets.tab.TabSet#removeTab TabSet.removeTab}].<br> This name will also be passed to the {@link
     * com.smartgwt.client.widgets.tab.TabSet#addTabSelectedHandler TabSet.tabSelected} and {@link
     * com.smartgwt.client.widgets.tab.TabSet#addTabDeselectedHandler TabSet.tabDeselected} handler functions, if specified.
     * <p> This identifier is requred to be locally unique to the TabSet and cannot be used to get a global reference to the
     * Tab.  If you want a global reference, set {@link com.smartgwt.client.widgets.tab.Tab#getID ID} instead.
     *
     * @return String
     */
    public String getName()  {
        return getAttributeAsString("name");
    }
    
    

    /**
     * Space to leave around the pane within this Tab. If specified, this property takes precedence over {@link
     * com.smartgwt.client.widgets.tab.TabSet#getPaneMargin paneMargin}
     *
     * @param paneMargin  Default value is null
     */
    public void setPaneMargin(Integer paneMargin) {
        setAttribute("paneMargin", paneMargin);
    }

    /**
     * Space to leave around the pane within this Tab. If specified, this property takes precedence over {@link
     * com.smartgwt.client.widgets.tab.TabSet#getPaneMargin paneMargin}
     *
     * @return Integer
     */
    public Integer getPaneMargin()  {
        return getAttributeAsInt("paneMargin");
    }
    

    /**
     * If {@link com.smartgwt.client.widgets.tab.TabSet#getShowTabPicker showTabPicker} is true for this TabSet, if set this
     * property will determine the title of the picker menu item for this tab. If unset, {@link
     * com.smartgwt.client.widgets.tab.Tab#getTitle title} will be used instead
     *
     * @param pickerTitle  See {@link com.smartgwt.client.docs.HTMLString HTMLString} . Default value is null
     * @see com.smartgwt.client.widgets.tab.TabSet#setShowTabPicker
     * @see com.smartgwt.client.widgets.tab.Tab#setTitle
     */
    public void setPickerTitle(String pickerTitle) {
        setAttribute("pickerTitle", pickerTitle);
    }

    /**
     * If {@link com.smartgwt.client.widgets.tab.TabSet#getShowTabPicker showTabPicker} is true for this TabSet, if set this
     * property will determine the title of the picker menu item for this tab. If unset, {@link
     * com.smartgwt.client.widgets.tab.Tab#getTitle title} will be used instead
     *
     * @return  See {@link com.smartgwt.client.docs.HTMLString HTMLString} 
     * @see com.smartgwt.client.widgets.tab.TabSet#getShowTabPicker
     * @see com.smartgwt.client.widgets.tab.Tab#getTitle
     */
    public String getPickerTitle()  {
        return getAttributeAsString("pickerTitle");
    }
    

    /**
     * Specifies the prompt to be displayed when the mouse hovers over the tab.
     *
     * @param prompt  See {@link com.smartgwt.client.docs.HTMLString HTMLString} . Default value is null
     */
    public void setPrompt(String prompt) {
        setAttribute("prompt", prompt);
    }

    /**
     * Specifies the prompt to be displayed when the mouse hovers over the tab.
     *
     * @return  See {@link com.smartgwt.client.docs.HTMLString HTMLString} 
     */
    public String getPrompt()  {
        return getAttributeAsString("prompt");
    }
    
    

    /**
     * You can specify an explicit width for the tab using this property.  Note that tabs automatically size to make room for
     * the full title, but if you want to e.g. specify a uniform width for all tabs in a TabSet, this property enables you to
     * do so.
     *
     * @param width  Default value is 100
     */
    public void setWidth(int width) {
        setAttribute("width", width);
    }

    /**
     * You can specify an explicit width for the tab using this property.  Note that tabs automatically size to make room for
     * the full title, but if you want to e.g. specify a uniform width for all tabs in a TabSet, this property enables you to
     * do so.
     *
     * @return int
     */
    public int getWidth()  {
        return getAttributeAsInt("width");
    }
    

    // ********************* Methods ***********************
    /**
     * Add a tabDeselected handler.
     * <p>
     * Optional handler to fire when a tab is deselected. Returning false will cancel the new selection, leaving this tab
     * selected. As with {@link com.smartgwt.client.widgets.tab.TabSet#addTabSelectedHandler TabSet.tabSelected} this method
     * only fires when the tabset is drawn.
     *
     * @param handler the tabDeselected handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addTabDeselectedHandler(com.smartgwt.client.widgets.tab.events.TabDeselectedHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.tab.events.TabDeselectedEvent.getType()) == 0) setupTabDeselectedEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.tab.events.TabDeselectedEvent.getType());
    }

    private native void setupTabDeselectedEvent() /*-{
        var obj = null;
        obj = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        var selfJ = this;
        var tabDeselected = $debox($entry(function(param){
            var event = @com.smartgwt.client.widgets.tab.events.TabDeselectedEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
            selfJ.@com.smartgwt.client.core.DataClass::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                var ret = event.@com.smartgwt.client.event.Cancellable::isCancelled()();
                return !ret;
            }));
        obj.tabDeselected = 
            function () {
                var param = {"tabSet" : arguments[0], "tabNum" : arguments[1], "tabPane" : arguments[2], "ID" : arguments[3], "tab" : arguments[4], "newTab" : arguments[5], "name" : arguments[6]};
                return tabDeselected(param) == true;
            }
        ;
   }-*/;
    /**
     * Add a tabSelected handler.
     * <p>
     * Optional handler to fire when a tab is selected. As with {@link
     * com.smartgwt.client.widgets.tab.TabSet#addTabSelectedHandler TabSet.tabSelected} this method only fires when the tabset
     * is drawn.
     *
     * @param handler the tabSelected handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addTabSelectedHandler(com.smartgwt.client.widgets.tab.events.TabSelectedHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.tab.events.TabSelectedEvent.getType()) == 0) setupTabSelectedEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.tab.events.TabSelectedEvent.getType());
    }

    private native void setupTabSelectedEvent() /*-{
        var obj = null;
        obj = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        var selfJ = this;
        var tabSelected = $entry(function(){
            var param = {"tabSet" : arguments[0], "tabNum" : arguments[1], "tabPane" : arguments[2], "ID" : arguments[3], "tab" : arguments[4], "name" : arguments[5]};
            var event = @com.smartgwt.client.widgets.tab.events.TabSelectedEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
            selfJ.@com.smartgwt.client.core.DataClass::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
            });
        obj.tabSelected =  tabSelected 
        ;
   }-*/;

    // ********************* Static Methods ***********************

    // ***********************************************************


    /**
     * Optional ID for the tab, which can later be used to reference the tab. APIs requiring a reference to a tab will accept
     * the tabs ID  [including  {@link com.smartgwt.client.widgets.tab.TabSet#selectTab TabSet.selectTab}, {@link
     * com.smartgwt.client.widgets.tab.TabSet#updateTab TabSet.updateTab}, {@link
     * com.smartgwt.client.widgets.tab.TabSet#removeTab TabSet.removeTab}].<br> The ID will also be passed to the {@link
     * com.smartgwt.client.widgets.tab.TabSet#addTabSelectedHandler TabSet.tabSelected} and {@link
     * com.smartgwt.client.widgets.tab.TabSet#addTabDeselectedHandler TabSet.tabDeselected} handler functions, if specified.
     * <p> Note that if you provide an ID, it must be globally unique.
     *
     * @param ID ID Default value is null
     */
    public void setID(String ID) {
        internalSetID(ID, false, true);
    }

    /**
     * Optional ID for the tab, which can later be used to reference the tab. APIs requiring a reference to a tab will accept
     * the tabs ID  [including  {@link com.smartgwt.client.widgets.tab.TabSet#selectTab TabSet.selectTab}, {@link
     * com.smartgwt.client.widgets.tab.TabSet#updateTab TabSet.updateTab}, {@link
     * com.smartgwt.client.widgets.tab.TabSet#removeTab TabSet.removeTab}].<br> The ID will also be passed to the {@link
     * com.smartgwt.client.widgets.tab.TabSet#addTabSelectedHandler TabSet.tabSelected} and {@link
     * com.smartgwt.client.widgets.tab.TabSet#addTabDeselectedHandler TabSet.tabDeselected} handler functions, if specified.
     * <p> Note that if you provide an ID, it must be globally unique.
     *
     *
     * @return String
     */
    public String getID()  {
        return this.id;
    }

    /**
     * Specifies the title of the this tab.  To change the title after the TabSet has been created, call {@link
     * com.smartgwt.client.widgets.tab.TabSet#setTabTitle TabSet.setTabTitle}.
     *
     * @param title title Default value is null
     */
    public void setTitle(String title) {
        if(tabSet == null || !tabSet.isDrawn()) {
            setAttribute("title", title);
        } else {
            tabSet.setTabTitle(this, title);
        }
    }

    /**
     * Specifies the title of the this tab.
     *
     * @return String
     */
    public String getTitle()  {
        if(tabSet == null || !tabSet.isDrawn()) {
            return getAttributeAsString("title");
        } else {
            return tabSet.getTab(getID()).getAttributeAsString("title");
        }
    }
    
    /**
     * If specified, this tab will initially be rendered in a disabled state.
     *
     * @param disabled disabled Default value is null
     */
    public void setDisabled(boolean disabled) {
        if(tabSet == null || !tabSet.isDrawn()) {
            setAttribute("disabled", disabled);
        } else {
            if(disabled) {
                tabSet.disableTab(getID());
            } else {
                tabSet.enableTab(getID());
            }
        }
    }

    /**
     * If specified, this tab will initially be rendered in a disabled state. To enable or disable tabs on the fly use the
     * {@link com.smartgwt.client.widgets.tab.TabSet#enableTab TabSet.enableTab}, and {@link
     * com.smartgwt.client.widgets.tab.TabSet#disableTab TabSet.disableTab} methods.
     *
     *
     * @return Boolean
     */
    public Boolean getDisabled()  {
        if(tabSet == null || !tabSet.isDrawn()) {
            return getAttributeAsBoolean("disabled");
        } else {
            return tabSet.getTab(getID()).getAttributeAsBoolean("disabled");
        }
    }

    /**
     * If specified, this tab will show an icon next to the tab title.  Note that as with  {@link
     * com.smartgwt.client.widgets.Button#getIcon icon}, the URL of a tabs icon will be updated to reflect disabled state.<br>
     * If desired a click handler may be assigned to the icon, which will be fired when the user clicks the tab. This method
     * takes a single parameter <code>tab</code>, a pointer to the tab object.
     *
     * @param icon icon Default value is null
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#layout_tabs_orientation" target="examples">Orientation Example</a>
     */
    public void setIcon(String icon) {
        if(tabSet == null || !tabSet.isDrawn()) {
            setAttribute("icon", icon);
        } else {
            tabSet.setTabIcon(getID(), icon);
        }
    }

    /**
     * If specified, this tab will show an icon next to the tab title.  Note that as with  {@link
     * com.smartgwt.client.widgets.Button#getIcon icon}, the URL of a tabs icon will be updated to reflect disabled state.<br>
     * If desired a click handler may be assigned to the icon, which will be fired when the user clicks the tab. This method
     * takes a single parameter <code>tab</code>, a pointer to the tab object.
     *
     * @param icon icon Default value is null
     * @param iconWidth the icon width
     * @param iconHeight the icon height
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#layout_tabs_orientation" target="examples">Orientation Example</a>
     */
    public void setIcon(String icon, int iconWidth, int iconHeight) {
        setIcon(icon);
        setIconWidth(iconWidth);
        setIconHeight(iconHeight);
    }

    /**
     * If specified, this tab will show an icon next to the tab title.  Note that as with  {@link
     * com.smartgwt.client.widgets.Button#getIcon icon}, the URL of a tabs icon will be updated to reflect disabled state.<br>
     * If desired a click handler may be assigned to the icon, which will be fired when the user clicks the tab. This method
     * takes a single parameter <code>tab</code>, a pointer to the tab object.
     *
     * @param icon icon Default value is null
     * @param iconSize the icon size
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#layout_tabs_orientation" target="examples">Orientation Example</a>
     */
    public void setIcon(String icon, int iconSize) {
        setIcon(icon);
        setIconSize(iconSize);
    }

    /**
     * If specified, this tab will show an icon next to the tab title.  Note that as with  {@link
     * com.smartgwt.client.widgets.Button#getIcon icon}, the URL of a tabs icon will be updated to reflect disabled state.<br>
     * If desired a click handler may be assigned to the icon, which will be fired when the user clicks the tab. This method
     * takes a single parameter <code>tab</code>, a pointer to the tab object.
     *
     *
     * @return String
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#layout_tabs_orientation" target="examples">Orientation Example</a>
     */
    public String getIcon()  {
        if(tabSet == null || !tabSet.isDrawn()) {
            return getAttributeAsString("icon");
        } else {
            return tabSet.getTab(getID()).getAttributeAsString("icon");
        }
    }
    
    public void setCanClose(boolean canClose) {
        setAttribute("canClose", canClose);
    }

    public void setPaneID(String paneID) {
        setAttribute("pane", paneID);
    }

    /**
     * Provide a separate style for the title text. If set and the ImgTab is vertical, a "v" will be automatically
     * prepended to the style name (hence "tabTitle" -> "vtabTitle").
     *
     * @param titleStyle the title style
     */
    public void setTitleStyle(String titleStyle) {
        setAttribute("titleStyle", titleStyle);
    }

    /**
     * A separate style for the title text. If set and the ImgTab is vertical, a "v" will be automatically
     * prepended to the style name (hence "tabTitle" -> "vtabTitle").
     *
     * @return the title style
     */
    public String getTitleStyle() {
        return getAttribute("titleStyle");
    }

    /**
     * Specifies the pane associated with this tab. You can change the pane associated with a given tab after the TabSet
     * has been created by calling {@link com.smartgwt.client.widgets.tab.TabSet#updateTab(int, com.smartgwt.client.widgets.Canvas)}
     *
     * @param pane the tab pane
     */
    public void setPane(Canvas pane) {
        if (tabSet == null || !tabSet.isCreated()) {
            setAttribute("pane", pane.getOrCreateJsObj());
        } else {
            tabSet.updateTab(this, pane);
        }
    }

    /**
     * The pane associated with the tab.
     *
     * @return the tab pane
     */
    public Canvas getPane() {
        return Canvas.getByJSObject(getAttributeAsJavaScriptObject("pane"));
    }

    /**
     * Context menu to show for this tab.
     *
     * @param contextMenu contextMenu Default value is null
     */
    public void setContextMenu(Menu contextMenu) {
        setAttribute("contextMenu", contextMenu.getOrCreateJsObj());
    }

    /**
     * Context menu to show for this object, an instance of the Menu widget.
     *
     * @return Menu
     */
    public Menu getContextMenu()  {
        return (Menu)Menu.getByJSObject(getAttributeAsJavaScriptObject("contextMenu"));
    }

    private TabSet tabSet;

    public TabSet getTabSet() {
        return tabSet;
    }

    public void setTabSet(TabSet tabSet) {
        this.tabSet = tabSet;
    }

    private static boolean isTab(Object object) {
        return object instanceof Tab;
    }

    private static boolean isTab(JavaScriptObject jsObj) {
        Object ref = JSOHelper.getAttributeAsObject((JavaScriptObject) jsObj, SC.REF);
        return ref instanceof Tab;
    }

    private static TabSet getTabSet(JavaScriptObject jsObj) {
        Object ref = JSOHelper.getAttributeAsObject((JavaScriptObject) jsObj, SC.REF);
        if(ref instanceof Tab) {
            return ((Tab) ref).getTabSet();
        } else {
            return null;
        }
    }

    /**
     * Returns the live Canvas used to represent this tab in a tabSet.
     * Will return null if this Tab has not been added to a TabSet or if the tabset is not yet drawn.
     * <P>
     * The underlying SmartClient class of the returned canvas depends on {@link #getUseSimpleTabs}.
     * If this property is false, the returned canvas will be a {@link com.smartgwt.client.widgets.tab.ImgTab} 
     * instance. If true the canvas will be a {@link com.smartgwt.client.widgets.tab.Button} instance. 
     * Note that you can make use of ImgTab APIs by using the <code>getJsObj()</code> and <code>create()</code>
     * APIs to "cast" to the appropriate type - for example:<br>
     * <code>ImgTab liveTab = ImgTab.create(myTabSet.getTabCanvas(2).getJsObj());</code>
     * @return live Canvas for this tab in a tabSet.
     */
    public StatefulCanvas getTabCanvas () {
        if (tabSet == null) return null;
        JavaScriptObject canvasJS = this.getTabCanvasJS(tabSet.getJsObj(), this.getJsObj());
        if (canvasJS == null) return null;
        
        return StatefulCanvas.getOrCreateRef(canvasJS);
    }
    private native JavaScriptObject getTabCanvasJS (JavaScriptObject tabSet, JavaScriptObject tabConfig) /*-{
        if (tabSet == null || tabConfig == null) return null;
        var tab = tabSet.getTab(tabConfig);
        if ($wnd.isc.isA.Canvas(tab)) return tab;
        return null;
    }-*/;
    

}



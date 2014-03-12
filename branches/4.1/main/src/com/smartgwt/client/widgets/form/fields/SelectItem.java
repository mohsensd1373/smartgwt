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
 
package com.smartgwt.client.widgets.form.fields;


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
 * FormItem that allows picking between several mutually exclusive options via a select list. <P> Options may be derived
 * from a <code>dataSource</code> or a <code>valueMap</code>. <P> Note that to select the first option as a default value
 * for the item, {@link com.smartgwt.client.widgets.form.fields.SelectItem#getDefaultToFirstOption defaultToFirstOption}
 * may be set.
 * @see com.smartgwt.client.widgets.form.fields.FormItem#getValueMap
 */
@BeanFactory.FrameworkClass
public class SelectItem extends FormItem implements PickList, com.smartgwt.client.widgets.form.fields.events.HasDataArrivedHandlers {

    public static SelectItem getOrCreateRef(JavaScriptObject jsObj) {

        if(jsObj == null) return null;

        RefDataClass obj = RefDataClass.getRef(jsObj);

		if(obj != null && JSOHelper.getAttribute(jsObj,"__ref")==null) {
            return com.smartgwt.client.util.ObjectFactory.createFormItem("SelectItem",jsObj);

        } else
        if(obj != null) {
            obj.setJsObj(jsObj);
            return (SelectItem) obj;
        } else {
            return new SelectItem(jsObj);
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
        $wnd.isc.SelectItem.changeDefaults(autoChildName + "Defaults", defaults.@com.smartgwt.client.widgets.Canvas::getConfig()());
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
        $wnd.isc.SelectItem.changeDefaults(autoChildName + "Defaults", defaults.@com.smartgwt.client.widgets.form.fields.FormItem::getJsObj()());
    }-*/;

    public static native void changePickerIconDefaults(FormItemIcon defaults) /*-{
        $wnd.isc.SelectItem.changeDefaults("pickerIconDefaults", defaults.@com.smartgwt.client.core.DataClass::getJsObj()());
    }-*/;

    public SelectItem(){
        setAttribute("editorType", "SelectItem");
    }

    public SelectItem(JavaScriptObject jsObj){
        
        setJavaScriptObject(jsObj);
    }


    public SelectItem(String name) {
        setName(name);
                setAttribute("editorType", "SelectItem");
    }


    public SelectItem(String name, String title) {
        setName(name);
		setTitle(title);
                setAttribute("editorType", "SelectItem");
    }


    // ********************* Properties / Attributes ***********************

    /**
     * If this item's value is set (via {@link com.smartgwt.client.widgets.form.fields.SelectItem#setValue SelectItem.setValue}
     * or similar) to a value which is not present in the {@link com.smartgwt.client.types.ValueMap}, should the value be
     * rejected. <P> If set to <code>false</code> the setValue() call will have no effect if the value is not a valid option.
     * <P> If set to <code>true</code> the item's value will be update to the new value, and the value will be added to the set
     * of options displayed in the pick-list until the next call to {@link
     * com.smartgwt.client.widgets.form.fields.SelectItem#setValueMap SelectItem.setValueMap} or {@link
     * com.smartgwt.client.widgets.form.fields.SelectItem#setValue SelectItem.setValue}. <P> Exception: If the value is set to
     * <code>null</code> but there is no null entry in the valueMap for this item, setting <code>addUnknownValues</code> to
     * true will not cause a null option to show up at the top of the select item pickList. Whether an empty option is shown in
     * the pickList is governed by {@link com.smartgwt.client.widgets.form.fields.SelectItem#getAllowEmptyValue
     * allowEmptyValue} instead. <P> Note that this property has no effect if the selectItem has a specified {@link
     * com.smartgwt.client.widgets.form.fields.SelectItem#getOptionDataSource optionDataSource}. If {@link
     * com.smartgwt.client.widgets.form.fields.SelectItem#setValue SelectItem.setValue} is called on a databound SelectItem and
     * the new value does not match any loaded options, the value will be accepted, but not added to the options displayed in
     * the pickList. Also note that if a {@link com.smartgwt.client.widgets.form.fields.SelectItem#getDisplayField
     * displayField} exists, a fetch will be performed in an attempt to retrieve a valid display value, as described under
     * {@link com.smartgwt.client.widgets.form.fields.FormItem#getFetchMissingValues fetchMissingValues}.   If specified the
     * {@link com.smartgwt.client.widgets.form.fields.FormItem#getLoadingDisplayValue loadingDisplayValue} will be displayed
     * while the  fetch is in progress, and then the real value (mapped to a display field value if a matching record was
     * found) will be displayed when the fetch completes.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param addUnknownValues  Default value is true
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#form_dep_dep_selects" target="examples">Dependent Selects Example</a>
     */
    public void setAddUnknownValues(Boolean addUnknownValues) {
        setAttribute("addUnknownValues", addUnknownValues);
    }

    /**
     * If this item's value is set (via {@link com.smartgwt.client.widgets.form.fields.SelectItem#setValue SelectItem.setValue}
     * or similar) to a value which is not present in the {@link com.smartgwt.client.types.ValueMap}, should the value be
     * rejected. <P> If set to <code>false</code> the setValue() call will have no effect if the value is not a valid option.
     * <P> If set to <code>true</code> the item's value will be update to the new value, and the value will be added to the set
     * of options displayed in the pick-list until the next call to {@link
     * com.smartgwt.client.widgets.form.fields.SelectItem#setValueMap SelectItem.setValueMap} or {@link
     * com.smartgwt.client.widgets.form.fields.SelectItem#setValue SelectItem.setValue}. <P> Exception: If the value is set to
     * <code>null</code> but there is no null entry in the valueMap for this item, setting <code>addUnknownValues</code> to
     * true will not cause a null option to show up at the top of the select item pickList. Whether an empty option is shown in
     * the pickList is governed by {@link com.smartgwt.client.widgets.form.fields.SelectItem#getAllowEmptyValue
     * allowEmptyValue} instead. <P> Note that this property has no effect if the selectItem has a specified {@link
     * com.smartgwt.client.widgets.form.fields.SelectItem#getOptionDataSource optionDataSource}. If {@link
     * com.smartgwt.client.widgets.form.fields.SelectItem#setValue SelectItem.setValue} is called on a databound SelectItem and
     * the new value does not match any loaded options, the value will be accepted, but not added to the options displayed in
     * the pickList. Also note that if a {@link com.smartgwt.client.widgets.form.fields.SelectItem#getDisplayField
     * displayField} exists, a fetch will be performed in an attempt to retrieve a valid display value, as described under
     * {@link com.smartgwt.client.widgets.form.fields.FormItem#getFetchMissingValues fetchMissingValues}.   If specified the
     * {@link com.smartgwt.client.widgets.form.fields.FormItem#getLoadingDisplayValue loadingDisplayValue} will be displayed
     * while the  fetch is in progress, and then the real value (mapped to a display field value if a matching record was
     * found) will be displayed when the fetch completes.
     *
     * @return Boolean
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#form_dep_dep_selects" target="examples">Dependent Selects Example</a>
     */
    public Boolean getAddUnknownValues()  {
        return getAttributeAsBoolean("addUnknownValues");
    }

    /**
     * If set to true, always show an empty option in this item's pickList, allowing the user to clear the value (even if there
     * is no empty entry in the valueMap for the item). <P> The empty value will be displayed with the {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getEmptyDisplayValue emptyDisplayValue}. <P> With a {@link
     * com.smartgwt.client.widgets.form.fields.SelectItem#getOptionDataSource databound selectItem}, enabling
     * <code>allowEmptyValue</code> disables data paging - all data matching the  current criteria will be requested.
     *
     * @param allowEmptyValue  Default value is false
     */
    public void setAllowEmptyValue(Boolean allowEmptyValue) {
        setAttribute("allowEmptyValue", allowEmptyValue);
    }

    /**
     * If set to true, always show an empty option in this item's pickList, allowing the user to clear the value (even if there
     * is no empty entry in the valueMap for the item). <P> The empty value will be displayed with the {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getEmptyDisplayValue emptyDisplayValue}. <P> With a {@link
     * com.smartgwt.client.widgets.form.fields.SelectItem#getOptionDataSource databound selectItem}, enabling
     * <code>allowEmptyValue</code> disables data paging - all data matching the  current criteria will be requested.
     *
     * @return Boolean
     */
    public Boolean getAllowEmptyValue()  {
        return getAttributeAsBoolean("allowEmptyValue");
    }

    /**
     * If this select item retrieves its options from a <code>dataSource</code>, should options be fetched from the server when
     * the item is first drawn, or should this fetch be delayed until the user opens the pickList. <P> The default is true in
     * order to allow the user to select a value via keyboard input while keyboard focus is on the SelectItem but the pickList
     * has not actually been shown.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param autoFetchData  Default value is true
     */
    public void setAutoFetchData(Boolean autoFetchData) {
        setAttribute("autoFetchData", autoFetchData);
    }

    /**
     * If this select item retrieves its options from a <code>dataSource</code>, should options be fetched from the server when
     * the item is first drawn, or should this fetch be delayed until the user opens the pickList. <P> The default is true in
     * order to allow the user to select a value via keyboard input while keyboard focus is on the SelectItem but the pickList
     * has not actually been shown.
     *
     * @return Boolean
     */
    public Boolean getAutoFetchData()  {
        return getAttributeAsBoolean("autoFetchData");
    }

    /**
     * For databound pickLists (see  optionDataSource), by default Smart GWT will cache and re-use datasets shown by pickLists
     * in an LRU (least recently used) caching pattern. <P> Setting this flag to false avoids this caching for situations where
     * it is too aggressive.
     *
     * @param cachePickListResults  Default value is true
     */
    public void setCachePickListResults(Boolean cachePickListResults) {
        setAttribute("cachePickListResults", cachePickListResults);
    }

    /**
     * For databound pickLists (see  optionDataSource), by default Smart GWT will cache and re-use datasets shown by pickLists
     * in an LRU (least recently used) caching pattern. <P> Setting this flag to false avoids this caching for situations where
     * it is too aggressive.
     *
     * @return Boolean
     */
    public Boolean getCachePickListResults()  {
        return getAttributeAsBoolean("cachePickListResults");
    }

    /**
     * Base CSS class name for a form item's control box (surrounds text box and picker). <P> NOTE: See the {@link
     * com.smartgwt.client.docs.CompoundFormItem_skinning} discussion for special skinning considerations.
     *
     * @param controlStyle  See {@link com.smartgwt.client.docs.FormItemBaseStyle FormItemBaseStyle} . Default value is "selectItemControl", [IRA]
     * @see com.smartgwt.client.widgets.form.fields.FormItem#setCellStyle
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setControlStyle(String controlStyle) {
        setAttribute("controlStyle", controlStyle);
    }

    /**
     * Base CSS class name for a form item's control box (surrounds text box and picker). <P> NOTE: See the {@link
     * com.smartgwt.client.docs.CompoundFormItem_skinning} discussion for special skinning considerations.
     *
     * @return  See {@link com.smartgwt.client.docs.FormItemBaseStyle FormItemBaseStyle} 
     * @see com.smartgwt.client.widgets.form.fields.FormItem#getCellStyle
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public String getControlStyle()  {
        return getAttributeAsString("controlStyle");
    }

    /**
     * Select the first option as the default value for this SelectItem.  <P> If options are derived from a dataSource, the
     * first value returned by the server will be used, otherwise the first value in the valueMap.  Note that setting this
     * property to true will trigger a fetch at soon as the form is created, because the form will try to establish a default
     * value at that time. <P> If enabled, this setting overrides {@link
     * com.smartgwt.client.widgets.form.fields.SelectItem#getDefaultValue defaultValue} and {@link
     * com.smartgwt.client.widgets.form.fields.SelectItem#defaultDynamicValue SelectItem.defaultDynamicValue}.
     *
     * @param defaultToFirstOption  Default value is false
     */
    public void setDefaultToFirstOption(Boolean defaultToFirstOption) {
        setAttribute("defaultToFirstOption", defaultToFirstOption);
    }

    /**
     * Select the first option as the default value for this SelectItem.  <P> If options are derived from a dataSource, the
     * first value returned by the server will be used, otherwise the first value in the valueMap.  Note that setting this
     * property to true will trigger a fetch at soon as the form is created, because the form will try to establish a default
     * value at that time. <P> If enabled, this setting overrides {@link
     * com.smartgwt.client.widgets.form.fields.SelectItem#getDefaultValue defaultValue} and {@link
     * com.smartgwt.client.widgets.form.fields.SelectItem#defaultDynamicValue SelectItem.defaultDynamicValue}.
     *
     * @return Boolean
     */
    public Boolean getDefaultToFirstOption()  {
        return getAttributeAsBoolean("defaultToFirstOption");
    }

    /**
     * Static default value for this SelectItem. To default to the first option use {@link
     * com.smartgwt.client.widgets.form.fields.SelectItem#getDefaultToFirstOption defaultToFirstOption} instead.
     *
     * @param defaultValue  Default value is null
     */
    public void setDefaultValue(Boolean defaultValue) {
        setAttribute("defaultValue", defaultValue);
    }

    /**
     * Static default value for this SelectItem. To default to the first option use {@link
     * com.smartgwt.client.widgets.form.fields.SelectItem#getDefaultToFirstOption defaultToFirstOption} instead.
     *
     * @return Boolean
     */
    public Boolean getDefaultValue()  {
        return getAttributeAsBoolean("defaultValue");
    }

    /**
     * Specifies an alternative field from which display values should be retrieved for this item. <P> The display field can be
     * either another field value in the same record or a field that must be retrieved from a related {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getOptionDataSource optionDataSource}. <P> If this item is not
     * databound ({@link com.smartgwt.client.widgets.form.fields.FormItem#getOptionDataSource optionDataSource} is unset), or
     * bound  to the same dataSource as the form as a whole, this item will call {@link
     * com.smartgwt.client.widgets.form.DynamicForm#getValue form.getValue()}  the form named after is implemented by picking
     * up the value of the specified field from the Form's values object. <P> Otherwise this item will attempt to map its
     * underlying value to a display value by retrieving a record from the {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getOptionDataSource optionDataSource} where the  {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getValueField valueField} matches this item's value, and displaying the
     * <code>displayField</code> value from that record. Note that if <code>optionDataSource</code> is set and this value is
     * not set, {@link com.smartgwt.client.widgets.form.fields.FormItem#getDisplayFieldName FormItem.getDisplayFieldName} will
     * return the dataSource title field by default. <P> This essentially enables the specified <code>optionDataSource</code>
     * to be used as a server based {@link valueMap}.
     *
     * @param displayField  Default value is null
     * @see com.smartgwt.client.widgets.form.fields.FormItem#invalidateDisplayValueCache
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#selected_value_combobox_category" target="examples">List - Related Records Example</a>
     */
    public void setDisplayField(String displayField) {
        setAttribute("displayField", displayField);
    }

    /**
     * Specifies an alternative field from which display values should be retrieved for this item. <P> The display field can be
     * either another field value in the same record or a field that must be retrieved from a related {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getOptionDataSource optionDataSource}. <P> If this item is not
     * databound ({@link com.smartgwt.client.widgets.form.fields.FormItem#getOptionDataSource optionDataSource} is unset), or
     * bound  to the same dataSource as the form as a whole, this item will call {@link
     * com.smartgwt.client.widgets.form.DynamicForm#getValue form.getValue()}  the form named after is implemented by picking
     * up the value of the specified field from the Form's values object. <P> Otherwise this item will attempt to map its
     * underlying value to a display value by retrieving a record from the {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getOptionDataSource optionDataSource} where the  {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getValueField valueField} matches this item's value, and displaying the
     * <code>displayField</code> value from that record. Note that if <code>optionDataSource</code> is set and this value is
     * not set, {@link com.smartgwt.client.widgets.form.fields.FormItem#getDisplayFieldName FormItem.getDisplayFieldName} will
     * return the dataSource title field by default. <P> This essentially enables the specified <code>optionDataSource</code>
     * to be used as a server based {@link valueMap}.
     *
     * <p>To get the property value after the component has been drawn/initialized, you must
     * call {@link #getDisplayFieldName getDisplayFieldName} instead.
     *
     * @return String
     * @see com.smartgwt.client.widgets.form.fields.FormItem#invalidateDisplayValueCache
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#selected_value_combobox_category" target="examples">List - Related Records Example</a>
     */
    public String getDisplayField()  {
        return getAttributeAsString("displayField");
    }

    /**
     * By default HTML values in a selectItem will be interpreted by the browser. Setting this flag to true will causes HTML
     * characters to be escaped, meaning the raw value of the field (for example <code>"&lt;b&gt;AAA&lt;/b&gt;"</code>) is
     * displayed to the user rather than the interpreted HTML (for example <code>"<b>AAA</b>"</code>)
     *
     * @param escapeHTML  Default value is false
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setEscapeHTML(Boolean escapeHTML) {
        setAttribute("escapeHTML", escapeHTML);
    }

    /**
     * By default HTML values in a selectItem will be interpreted by the browser. Setting this flag to true will causes HTML
     * characters to be escaped, meaning the raw value of the field (for example <code>"&lt;b&gt;AAA&lt;/b&gt;"</code>) is
     * displayed to the user rather than the interpreted HTML (for example <code>"<b>AAA</b>"</code>)
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public Boolean getEscapeHTML()  {
        return getAttributeAsBoolean("escapeHTML");
    }

    /**
     * If this item has a specified <code>optionDataSource</code> and this property is <code>true</code>, the list of fields
     * used by this pickList will be passed to the datasource as {@link com.smartgwt.client.data.DSRequest#getOutputs outputs}.
     * If the datasource supports this feature the returned fields will be limited to this list. A custom datasource will need
     * to add code to implement field limiting. <P> This list of used fields consists of the values of {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getValueField valueField}, {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getDisplayField displayField} and {@link
     * com.smartgwt.client.widgets.form.fields.SelectItem#getPickListFields pickListFields}. <P> NOTE: When enabled, {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getSelectedRecord getSelectedRecord} will only include the fetched
     * fields.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param fetchDisplayedFieldsOnly  Default value is null
     */
    public void setFetchDisplayedFieldsOnly(Boolean fetchDisplayedFieldsOnly) {
        setAttribute("fetchDisplayedFieldsOnly", fetchDisplayedFieldsOnly);
    }

    /**
     * If this item has a specified <code>optionDataSource</code> and this property is <code>true</code>, the list of fields
     * used by this pickList will be passed to the datasource as {@link com.smartgwt.client.data.DSRequest#getOutputs outputs}.
     * If the datasource supports this feature the returned fields will be limited to this list. A custom datasource will need
     * to add code to implement field limiting. <P> This list of used fields consists of the values of {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getValueField valueField}, {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getDisplayField displayField} and {@link
     * com.smartgwt.client.widgets.form.fields.SelectItem#getPickListFields pickListFields}. <P> NOTE: When enabled, {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getSelectedRecord getSelectedRecord} will only include the fetched
     * fields.
     *
     * @return Boolean
     */
    public Boolean getFetchDisplayedFieldsOnly()  {
        return getAttributeAsBoolean("fetchDisplayedFieldsOnly");
    }

    /**
     * If <code>filterLocally</code> is set for this item, and this item is showing options  from a dataSource, fetch the
     * entire set of options from the server, and use these values to map the item value to the appropriate display value. Also
     * use <code>"local"</code> type filtering on drop down list of options. <P> This means data will only be fetched once from
     * the server, and then filtered on the client. <P> Note - when this property is set to <code>false</code>, filtering will
     * still be  performed on the client if a complete set of data for some criteria has been cached by a fetch, and a
     * subsequent fetch has more restrictive criteria. To explicitly disable client-side filtering set the {@link
     * com.smartgwt.client.widgets.form.fields.SelectItem#getUseClientFiltering useClientFiltering} property to false.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param filterLocally  Default value is false
     * @see com.smartgwt.client.widgets.form.fields.FormItem#setFilterLocally
     */
    public void setFilterLocally(Boolean filterLocally) {
        setAttribute("filterLocally", filterLocally);
    }

    /**
     * If <code>filterLocally</code> is set for this item, and this item is showing options  from a dataSource, fetch the
     * entire set of options from the server, and use these values to map the item value to the appropriate display value. Also
     * use <code>"local"</code> type filtering on drop down list of options. <P> This means data will only be fetched once from
     * the server, and then filtered on the client. <P> Note - when this property is set to <code>false</code>, filtering will
     * still be  performed on the client if a complete set of data for some criteria has been cached by a fetch, and a
     * subsequent fetch has more restrictive criteria. To explicitly disable client-side filtering set the {@link
     * com.smartgwt.client.widgets.form.fields.SelectItem#getUseClientFiltering useClientFiltering} property to false.
     *
     * @return Boolean
     * @see com.smartgwt.client.widgets.form.fields.FormItem#getFilterLocally
     */
    public Boolean getFilterLocally()  {
        return getAttributeAsBoolean("filterLocally");
    }

    /**
     * If true, multiple values may be selected. <P> The SelectItem will either render as a drop-down allowing multiple
     * selections, or a multi-row list of options similar to a small headerless {@link
     * com.smartgwt.client.widgets.grid.ListGrid}, based on the {@link com.smartgwt.client.types.MultipleAppearance} setting.
     * <P> The logical value of the formItem, as retrieved by {@link com.smartgwt.client.widgets.form.fields.FormItem#getValue
     * getValue()} and set via {@link com.smartgwt.client.widgets.form.fields.FormItem#setValue setValue()}, is an Array of
     * Strings reflecting the selected values. <P> When this value is true, we disable doubleClick events by default, instead
     * issuing two single clicks by forcibly setting {@link com.smartgwt.client.widgets.Canvas#getNoDoubleClicks
     * noDoubleClicks: true}. If you need to work with doubleClick events, you can disable this default behavior by explicitly
     * setting formItem.pickListProperties.noDoubleClicks: false. <P> Note: <code>multiple:true</code> SelectItems with
     * multipleAppearance:"grid" do not currently support optionDataSource binding.  You can get around this by calling {@link
     * com.smartgwt.client.data.DataSource#fetchData DataSource.fetchData} directly and calling {@link
     * com.smartgwt.client.data.List#getValueMap dsResponse.data.getValueMap()} to obtain a valueMap.
     *
     * @param multiple  Default value is false
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setMultiple(Boolean multiple) {
        setAttribute("multiple", multiple);
    }

    /**
     * If true, multiple values may be selected. <P> The SelectItem will either render as a drop-down allowing multiple
     * selections, or a multi-row list of options similar to a small headerless {@link
     * com.smartgwt.client.widgets.grid.ListGrid}, based on the {@link com.smartgwt.client.types.MultipleAppearance} setting.
     * <P> The logical value of the formItem, as retrieved by {@link com.smartgwt.client.widgets.form.fields.FormItem#getValue
     * getValue()} and set via {@link com.smartgwt.client.widgets.form.fields.FormItem#setValue setValue()}, is an Array of
     * Strings reflecting the selected values. <P> When this value is true, we disable doubleClick events by default, instead
     * issuing two single clicks by forcibly setting {@link com.smartgwt.client.widgets.Canvas#getNoDoubleClicks
     * noDoubleClicks: true}. If you need to work with doubleClick events, you can disable this default behavior by explicitly
     * setting formItem.pickListProperties.noDoubleClicks: false. <P> Note: <code>multiple:true</code> SelectItems with
     * multipleAppearance:"grid" do not currently support optionDataSource binding.  You can get around this by calling {@link
     * com.smartgwt.client.data.DataSource#fetchData DataSource.fetchData} directly and calling {@link
     * com.smartgwt.client.data.List#getValueMap dsResponse.data.getValueMap()} to obtain a valueMap.
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public Boolean getMultiple()  {
        return getAttributeAsBoolean("multiple");
    }

    /**
     * How should items with {@link com.smartgwt.client.widgets.form.fields.SelectItem#getMultiple multiple} set to 'true' be
     * displayed?
     *
     * @param multipleAppearance  Default value is "picklist"
     */
    public void setMultipleAppearance(MultipleAppearance multipleAppearance) {
        setAttribute("multipleAppearance", multipleAppearance == null ? null : multipleAppearance.getValue());
    }

    /**
     * How should items with {@link com.smartgwt.client.widgets.form.fields.SelectItem#getMultiple multiple} set to 'true' be
     * displayed?
     *
     * @return MultipleAppearance
     */
    public MultipleAppearance getMultipleAppearance()  {
        return EnumUtil.getEnum(MultipleAppearance.values(), getAttribute("multipleAppearance"));
    }

    /**
     * Causes the PickList to open when the down arrow is pressed, default false.   <P> For native OS widgets, the down arrow
     * changes the value of a select on Windows, but  opens the select on Macs.  This setting is not recommended unless you are
     * certain that  all users of your applications will expect the Mac convention.
     *
     * @param openOnDownArrow  Default value is false
     */
    public void setOpenOnDownArrow(Boolean openOnDownArrow) {
        setAttribute("openOnDownArrow", openOnDownArrow);
    }

    /**
     * Causes the PickList to open when the down arrow is pressed, default false.   <P> For native OS widgets, the down arrow
     * changes the value of a select on Windows, but  opens the select on Macs.  This setting is not recommended unless you are
     * certain that  all users of your applications will expect the Mac convention.
     *
     * @return Boolean
     */
    public Boolean getOpenOnDownArrow()  {
        return getAttributeAsBoolean("openOnDownArrow");
    }

    /**
     * Causes the PickList to open when the spacebar is pressed, default false.   <P> For native OS widgets, space opens the
     * PickList on Macs, but not on Windows.  Consider using this setting if your users are almost entirely Mac users, or
     * enabling it only for users running MacOS.   <P> However, before using this setting, consider that it means that Spacebar
     * will not be able to be used for another purpose when focus is in a SelectItem.
     *
     * @param openOnSpace  Default value is false
     */
    public void setOpenOnSpace(Boolean openOnSpace) {
        setAttribute("openOnSpace", openOnSpace);
    }

    /**
     * Causes the PickList to open when the spacebar is pressed, default false.   <P> For native OS widgets, space opens the
     * PickList on Macs, but not on Windows.  Consider using this setting if your users are almost entirely Mac users, or
     * enabling it only for users running MacOS.   <P> However, before using this setting, consider that it means that Spacebar
     * will not be able to be used for another purpose when focus is in a SelectItem.
     *
     * @return Boolean
     */
    public Boolean getOpenOnSpace()  {
        return getAttributeAsBoolean("openOnSpace");
    }

    /**
     * If this item has a specified <code>optionDataSource</code>, this attribute may be set to specify an explicit {@link
     * com.smartgwt.client.data.DSRequest#getOperationId operationId} when performing a fetch against the option dataSource to
     * pick up display value mapping.
     *
     * @param optionOperationId  Default value is null
     */
    public void setOptionOperationId(String optionOperationId) {
        setAttribute("optionOperationId", optionOperationId);
    }

    /**
     * If this item has a specified <code>optionDataSource</code>, this attribute may be set to specify an explicit {@link
     * com.smartgwt.client.data.DSRequest#getOperationId operationId} when performing a fetch against the option dataSource to
     * pick up display value mapping.
     *
     * @return String
     */
    public String getOptionOperationId()  {
        return getAttributeAsString("optionOperationId");
    }

    /**
     * If {@link com.smartgwt.client.widgets.form.fields.SelectItem#getShowPickerIcon showPickerIcon} is true for this item,
     * this property governs the size of the picker icon. If unset, the picker icon will be sized as a square to fit in the
     * available height for the icon. <p> It is not recommended to change the pickerIconHeight from the default value if {@link
     * com.smartgwt.client.docs.Skinning spriting} is enabled because the image sprites are set up assuming specific, fixed
     * dimensions of the picker icon. If the pickerIconHeight must be changed, then the {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getPickerIconStyle pickerIconStyle} should be changed to a custom CSS
     * style name.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param pickerIconHeight  Default value is null
     */
    public void setPickerIconHeight(Integer pickerIconHeight) {
        setAttribute("pickerIconHeight", pickerIconHeight);
    }

    /**
     * If {@link com.smartgwt.client.widgets.form.fields.SelectItem#getShowPickerIcon showPickerIcon} is true for this item,
     * this property governs the size of the picker icon. If unset, the picker icon will be sized as a square to fit in the
     * available height for the icon. <p> It is not recommended to change the pickerIconHeight from the default value if {@link
     * com.smartgwt.client.docs.Skinning spriting} is enabled because the image sprites are set up assuming specific, fixed
     * dimensions of the picker icon. If the pickerIconHeight must be changed, then the {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getPickerIconStyle pickerIconStyle} should be changed to a custom CSS
     * style name.
     *
     * @return Integer
     */
    public Integer getPickerIconHeight()  {
        return getAttributeAsInt("pickerIconHeight");
    }

    /**
     * If {@link com.smartgwt.client.widgets.form.fields.SelectItem#getShowPickerIcon showPickerIcon} is true for this item,
     * this property governs the {@link com.smartgwt.client.widgets.form.fields.FormItemIcon#getSrc src} of the picker icon
     * image to be displayed.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param pickerIconSrc  See {@link com.smartgwt.client.docs.SCImgURL SCImgURL} . Default value is "[SKIN]/DynamicForm/SelectItem_PickButton_icon.gif"
     */
    public void setPickerIconSrc(String pickerIconSrc) {
        setAttribute("pickerIconSrc", pickerIconSrc);
    }

    /**
     * If {@link com.smartgwt.client.widgets.form.fields.SelectItem#getShowPickerIcon showPickerIcon} is true for this item,
     * this property governs the {@link com.smartgwt.client.widgets.form.fields.FormItemIcon#getSrc src} of the picker icon
     * image to be displayed.
     *
     * @return  See {@link com.smartgwt.client.docs.SCImgURL SCImgURL} 
     */
    public String getPickerIconSrc()  {
        return getAttributeAsString("pickerIconSrc");
    }

    /**
     * Base CSS class name for a form item's picker icon cell. If unset, inherits from this item's {@link
     * com.smartgwt.client.widgets.form.fields.SelectItem#getControlStyle controlStyle}.
     *
     * @param pickerIconStyle  See {@link com.smartgwt.client.docs.FormItemBaseStyle FormItemBaseStyle} . Default value is "selectItemPickerIcon"
     * @see com.smartgwt.client.widgets.form.fields.FormItem#setCellStyle
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setPickerIconStyle(String pickerIconStyle) {
        setAttribute("pickerIconStyle", pickerIconStyle);
    }

    /**
     * Base CSS class name for a form item's picker icon cell. If unset, inherits from this item's {@link
     * com.smartgwt.client.widgets.form.fields.SelectItem#getControlStyle controlStyle}.
     *
     * @return  See {@link com.smartgwt.client.docs.FormItemBaseStyle FormItemBaseStyle} 
     * @see com.smartgwt.client.widgets.form.fields.FormItem#getCellStyle
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public String getPickerIconStyle()  {
        return getAttributeAsString("pickerIconStyle");
    }

    /**
     * If {@link com.smartgwt.client.widgets.form.fields.SelectItem#getShowPickerIcon showPickerIcon} is true for this item,
     * this property governs the size of the picker icon. If unset, the picker icon will be sized as a square to fit in the
     * available height for the icon. <p> It is not recommended to change the pickerIconWidth from the default value if {@link
     * com.smartgwt.client.docs.Skinning spriting} is enabled because the image sprites are set up assuming specific, fixed
     * dimensions of the picker icon. If the pickerIconWidth must be changed, then the {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getPickerIconStyle pickerIconStyle} should be changed to a custom CSS
     * style name.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param pickerIconWidth  Default value is null
     */
    public void setPickerIconWidth(Integer pickerIconWidth) {
        setAttribute("pickerIconWidth", pickerIconWidth);
    }

    /**
     * If {@link com.smartgwt.client.widgets.form.fields.SelectItem#getShowPickerIcon showPickerIcon} is true for this item,
     * this property governs the size of the picker icon. If unset, the picker icon will be sized as a square to fit in the
     * available height for the icon. <p> It is not recommended to change the pickerIconWidth from the default value if {@link
     * com.smartgwt.client.docs.Skinning spriting} is enabled because the image sprites are set up assuming specific, fixed
     * dimensions of the picker icon. If the pickerIconWidth must be changed, then the {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getPickerIconStyle pickerIconStyle} should be changed to a custom CSS
     * style name.
     *
     * @return Integer
     */
    public Integer getPickerIconWidth()  {
        return getAttributeAsInt("pickerIconWidth");
    }

    /**
     * If this item has a databound pickList (for example  optionDataSource is set), this property can be used to provide
     * static filter criteria when retrieving the data for the pickList.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param pickListCriteria  Default value is null
     */
    public void setPickListCriteria(Criteria pickListCriteria) {
        setAttribute("pickListCriteria", pickListCriteria.getJsObj());
    }

    /**
     * If this item has a databound pickList (for example  optionDataSource is set), this property can be used to provide
     * static filter criteria when retrieving the data for the pickList.
     *
     * @return Criteria
     */
    public Criteria getPickListCriteria()  {
        return new Criteria(getAttributeAsJavaScriptObject("pickListCriteria"));
    }

    /**
     * This property allows the developer to specify which field[s] will be displayed in the  drop down list of options. <P>
     * Only applies to databound pickLists (see  optionDataSource, or pickLists with custom data set up via the advanced 
     * PickList.getClientPickListData method. <P> If this property is unset, we display the  displayField, if specified, 
     * otherwise the  valueField. <P> If there are multiple fields, column headers will be shown for each field, the height of
     * which can be customized via the  pickListHeaderHeight attribute. <P> Each field to display should be specified as a
     * {@link com.smartgwt.client.widgets.grid.ListGridField} object. Note that unlike in {@link
     * com.smartgwt.client.widgets.grid.ListGrid listGrids}, dataSource fields marked as  {@link
     * com.smartgwt.client.data.DataSourceField#getHidden hidden:true} will be hidden by default in pickLists. To override this
     * behavior, ensure that you specify an explicit value for  {@link com.smartgwt.client.widgets.grid.ListGridField#showIf
     * showIf}.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param pickListFields  Default value is null
     * @see com.smartgwt.client.widgets.form.fields.SelectItem#setValueField
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#selected_value_combobox_category" target="examples">List - Related Records Example</a>
     */
    public void setPickListFields(ListGridField... pickListFields) {
        setAttribute("pickListFields", pickListFields);
    }

    /**
     * This property allows the developer to specify which field[s] will be displayed in the  drop down list of options. <P>
     * Only applies to databound pickLists (see  optionDataSource, or pickLists with custom data set up via the advanced 
     * PickList.getClientPickListData method. <P> If this property is unset, we display the  displayField, if specified, 
     * otherwise the  valueField. <P> If there are multiple fields, column headers will be shown for each field, the height of
     * which can be customized via the  pickListHeaderHeight attribute. <P> Each field to display should be specified as a
     * {@link com.smartgwt.client.widgets.grid.ListGridField} object. Note that unlike in {@link
     * com.smartgwt.client.widgets.grid.ListGrid listGrids}, dataSource fields marked as  {@link
     * com.smartgwt.client.data.DataSourceField#getHidden hidden:true} will be hidden by default in pickLists. To override this
     * behavior, ensure that you specify an explicit value for  {@link com.smartgwt.client.widgets.grid.ListGridField#showIf
     * showIf}.
     *
     * @return ListGridField...
     * @see com.smartgwt.client.widgets.form.fields.SelectItem#getValueField
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#selected_value_combobox_category" target="examples">List - Related Records Example</a>
     */
    public ListGridField[] getPickListFields()  {
        return com.smartgwt.client.util.ConvertTo.arrayOfListGridField(getAttributeAsJavaScriptObject("pickListFields"));
    }

    /**
     * Indicates whether or not this SelectItem will load its list of options  {@link
     * com.smartgwt.client.data.DataSource#getProgressiveLoading progressively}.  This property is copied onto the underlying
     * PickList.
     *
     * @param progressiveLoading  Default value is null
     * @see com.smartgwt.client.data.DataSource#setProgressiveLoading
     * @see com.smartgwt.client.docs.ProgressiveLoading ProgressiveLoading overview and related methods
     */
    public void setProgressiveLoading(Boolean progressiveLoading) {
        setAttribute("progressiveLoading", progressiveLoading);
    }

    /**
     * Indicates whether or not this SelectItem will load its list of options  {@link
     * com.smartgwt.client.data.DataSource#getProgressiveLoading progressively}.  This property is copied onto the underlying
     * PickList.
     *
     * @return Boolean
     * @see com.smartgwt.client.data.DataSource#getProgressiveLoading
     * @see com.smartgwt.client.docs.ProgressiveLoading ProgressiveLoading overview and related methods
     */
    public Boolean getProgressiveLoading()  {
        return getAttributeAsBoolean("progressiveLoading");
    }

    /**
     * Select items will submit their containing form on enter keypress  if {@link
     * com.smartgwt.client.widgets.form.DynamicForm#getSaveOnEnter saveOnEnter} is true. Setting this property to
     * <code>false</code> will disable this behavior. <P> Note that if the drop down list of options (pickList) is visible an
     * <code>Enter</code> keypress is used to select a value from the available set of options and will not automatically cause
     * form submission.
     *
     * @param saveOnEnter  Default value is true
     */
    public void setSaveOnEnter(Boolean saveOnEnter) {
        setAttribute("saveOnEnter", saveOnEnter);
    }

    /**
     * Select items will submit their containing form on enter keypress  if {@link
     * com.smartgwt.client.widgets.form.DynamicForm#getSaveOnEnter saveOnEnter} is true. Setting this property to
     * <code>false</code> will disable this behavior. <P> Note that if the drop down list of options (pickList) is visible an
     * <code>Enter</code> keypress is used to select a value from the available set of options and will not automatically cause
     * form submission.
     *
     * @return Boolean
     */
    public Boolean getSaveOnEnter()  {
        return getAttributeAsBoolean("saveOnEnter");
    }

    /**
     * When this item receives focus, should it be re-styled to indicate it has focus?
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param showFocused  Default value is true, [IRWA]
     * @see com.smartgwt.client.widgets.form.fields.FormItem#setCellStyle
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setShowFocused(Boolean showFocused) {
        setAttribute("showFocused", showFocused);
    }

    /**
     * When this item receives focus, should it be re-styled to indicate it has focus?
     *
     * @return Boolean
     * @see com.smartgwt.client.widgets.form.fields.FormItem#getCellStyle
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public Boolean getShowFocused()  {
        return getAttributeAsBoolean("showFocused");
    }

    /**
     * If showing a hint for this form item, should it be shown within the field? <P>CSS style for the hint is {@link
     * com.smartgwt.client.widgets.form.fields.SelectItem#getTextBoxStyle textBoxStyle} with the suffix "Hint" appended to it.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param showHintInField  Default value is null
     * @see com.smartgwt.client.widgets.form.fields.FormItem#setHint
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setShowHintInField(Boolean showHintInField) {
        setAttribute("showHintInField", showHintInField);
    }

    /**
     * If showing a hint for this form item, should it be shown within the field? <P>CSS style for the hint is {@link
     * com.smartgwt.client.widgets.form.fields.SelectItem#getTextBoxStyle textBoxStyle} with the suffix "Hint" appended to it.
     *
     * @return Boolean
     * @see com.smartgwt.client.widgets.form.fields.FormItem#getHint
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public Boolean getShowHintInField()  {
        return getAttributeAsBoolean("showHintInField");
    }

    /**
     * If this item is part of a databound form, and has a specified <code>valueMap</code>, by default we show the valueMap
     * options in the pickList for the item. Setting this property to true will ensure that the options displayed in our
     * pickList are derived from the form's <code>dataSource</code>.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param showOptionsFromDataSource  Default value is null
     * @see com.smartgwt.client.docs.Databinding Databinding overview and related methods
     */
    public void setShowOptionsFromDataSource(Boolean showOptionsFromDataSource) {
        setAttribute("showOptionsFromDataSource", showOptionsFromDataSource);
    }

    /**
     * If this item is part of a databound form, and has a specified <code>valueMap</code>, by default we show the valueMap
     * options in the pickList for the item. Setting this property to true will ensure that the options displayed in our
     * pickList are derived from the form's <code>dataSource</code>.
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.Databinding Databinding overview and related methods
     */
    public Boolean getShowOptionsFromDataSource()  {
        return getAttributeAsBoolean("showOptionsFromDataSource");
    }

    /**
     * When the user rolls over the select item, should the pickButton display it's  <code>Over</code> state?
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param showOver  Default value is true
     */
    public void setShowOver(Boolean showOver) {
        setAttribute("showOver", showOver);
    }

    /**
     * When the user rolls over the select item, should the pickButton display it's  <code>Over</code> state?
     *
     * @return Boolean
     */
    public Boolean getShowOver()  {
        return getAttributeAsBoolean("showOver");
    }

    /**
     * Should we show a special 'picker' {@link com.smartgwt.client.widgets.form.fields.FormItemIcon icon} for this form item?
     * Picker icons are customizable via {@link com.smartgwt.client.widgets.form.fields.FormItem#getPickerIconProperties
     * pickerIconProperties}. By default they will be rendered inside the form item's "control box" area, and will call {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#showPicker FormItem.showPicker} when clicked.
     *
     * @param showPickerIcon  Default value is true
     */
    public void setShowPickerIcon(Boolean showPickerIcon) {
        setAttribute("showPickerIcon", showPickerIcon);
    }

    /**
     * Should we show a special 'picker' {@link com.smartgwt.client.widgets.form.fields.FormItemIcon icon} for this form item?
     * Picker icons are customizable via {@link com.smartgwt.client.widgets.form.fields.FormItem#getPickerIconProperties
     * pickerIconProperties}. By default they will be rendered inside the form item's "control box" area, and will call {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#showPicker FormItem.showPicker} when clicked.
     *
     * @return Boolean
     */
    public Boolean getShowPickerIcon()  {
        return getAttributeAsBoolean("showPickerIcon");
    }

    /**
     * Specifies the field by which this item should be initially sorted.  Can be set to  either a {@link
     * com.smartgwt.client.widgets.grid.ListGridField#getName field name} or the index of the field in the fields  Array. Note
     * that if <code>sortField</code> is initially specified as a number, it will be converted to a string (field name) after
     * the item is initialized.
     *
     * @param sortField  Default value is null
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#grid_sort_sort" target="examples">Sort Example</a>
     */
    public void setSortField(String sortField) {
        setAttribute("sortField", sortField);
    }

    /**
     * Specifies the field by which this item should be initially sorted.  Can be set to  either a {@link
     * com.smartgwt.client.widgets.grid.ListGridField#getName field name} or the index of the field in the fields  Array. Note
     * that if <code>sortField</code> is initially specified as a number, it will be converted to a string (field name) after
     * the item is initialized.
     *
     * @return String
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#grid_sort_sort" target="examples">Sort Example</a>
     */
    public String getSortField()  {
        return getAttributeAsString("sortField");
    }

    /**
     * Specifies the field by which this item should be initially sorted.  Can be set to  either a {@link
     * com.smartgwt.client.widgets.grid.ListGridField#getName field name} or the index of the field in the fields  Array. Note
     * that if <code>sortField</code> is initially specified as a number, it will be converted to a string (field name) after
     * the item is initialized.
     *
     * @param sortField  Default value is null
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#grid_sort_sort" target="examples">Sort Example</a>
     */
    public void setSortField(Integer sortField) {
        setAttribute("sortField", sortField);
    }

    /**
     * Base CSS class name for a form item's text box element. <P> NOTE: See the {@link
     * com.smartgwt.client.docs.CompoundFormItem_skinning} discussion for special skinning considerations.
     *
     * @param textBoxStyle  See {@link com.smartgwt.client.docs.FormItemBaseStyle FormItemBaseStyle} . Default value is "selectItemText", [IRA]
     * @see com.smartgwt.client.widgets.form.fields.FormItem#setCellStyle
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setTextBoxStyle(String textBoxStyle) {
        setAttribute("textBoxStyle", textBoxStyle);
    }

    /**
     * Base CSS class name for a form item's text box element. <P> NOTE: See the {@link
     * com.smartgwt.client.docs.CompoundFormItem_skinning} discussion for special skinning considerations.
     *
     * @return  See {@link com.smartgwt.client.docs.FormItemBaseStyle FormItemBaseStyle} 
     * @see com.smartgwt.client.widgets.form.fields.FormItem#getCellStyle
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public String getTextBoxStyle()  {
        return getAttributeAsString("textBoxStyle");
    }

    /**
     * When applying filter criteria to pickList data, what type of matching to use. <P> For a databound pickList ({@link
     * com.smartgwt.client.widgets.form.fields.SelectItem#getOptionDataSource optionDataSource} set),
     * <code>textMatchStyle</code> is sent to the server as {@link com.smartgwt.client.data.DSRequest#getTextMatchStyle
     * textMatchStyle}. <P> For a non-databound pickList, <code>textMatchStyle</code> is applied by  
     * filterClientPickListData().
     *
     * @param textMatchStyle  Default value is "startsWith"
     */
    public void setTextMatchStyle(TextMatchStyle textMatchStyle) {
        setAttribute("textMatchStyle", textMatchStyle == null ? null : textMatchStyle.getValue());
    }

    /**
     * When applying filter criteria to pickList data, what type of matching to use. <P> For a databound pickList ({@link
     * com.smartgwt.client.widgets.form.fields.SelectItem#getOptionDataSource optionDataSource} set),
     * <code>textMatchStyle</code> is sent to the server as {@link com.smartgwt.client.data.DSRequest#getTextMatchStyle
     * textMatchStyle}. <P> For a non-databound pickList, <code>textMatchStyle</code> is applied by  
     * filterClientPickListData().
     *
     * @return TextMatchStyle
     */
    public TextMatchStyle getTextMatchStyle()  {
        return EnumUtil.getEnum(TextMatchStyle.values(), getAttribute("textMatchStyle"));
    }

    /**
     * For {@link com.smartgwt.client.widgets.form.fields.SelectItem#getOptionDataSource databound} items, this property will
     * be passed to the generated ResultSet data object for the pickList as {@link
     * com.smartgwt.client.data.ResultSet#getUseClientFiltering useClientFiltering}. Setting to false will disable filtering on
     * the client and ensure criteria are always passed to the DataSource directly.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param useClientFiltering  Default value is null
     */
    public void setUseClientFiltering(Boolean useClientFiltering) {
        setAttribute("useClientFiltering", useClientFiltering);
    }

    /**
     * For {@link com.smartgwt.client.widgets.form.fields.SelectItem#getOptionDataSource databound} items, this property will
     * be passed to the generated ResultSet data object for the pickList as {@link
     * com.smartgwt.client.data.ResultSet#getUseClientFiltering useClientFiltering}. Setting to false will disable filtering on
     * the client and ensure criteria are always passed to the DataSource directly.
     *
     * @return Boolean
     */
    public Boolean getUseClientFiltering()  {
        return getAttributeAsBoolean("useClientFiltering");
    }

    /**
     * If this form item maps data values to display values by retrieving the  {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getDisplayField displayField} values from an  {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getOptionDataSource optionDataSource}, this property  denotes the the
     * field to use as the underlying data value in records from the  optionDataSource.<br> If unset, assumed to be the {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getName name} of this form item.
     *
     * @param valueField  Default value is null
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#selected_value_combobox_category" target="examples">List - Related Records Example</a>
     */
    public void setValueField(String valueField) {
        setAttribute("valueField", valueField);
    }

    /**
     * If this form item maps data values to display values by retrieving the  {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getDisplayField displayField} values from an  {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getOptionDataSource optionDataSource}, this property  denotes the the
     * field to use as the underlying data value in records from the  optionDataSource.<br> If unset, assumed to be the {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getName name} of this form item.
     *
     * <p>To get the property value after the component has been drawn/initialized, you must
     * call {@link #getValueFieldName getValueFieldName} instead.
     *
     * @return String
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#selected_value_combobox_category" target="examples">List - Related Records Example</a>
     */
    public String getValueField()  {
        return getAttributeAsString("valueField");
    }

    // ********************* Methods ***********************
    /**
     * Add a dataArrived handler.
     * <p>
     * If this item is showing a dataBound pickList, this notification method will be fired  when new data arrives from the
     * server.
     *
     * @param handler the dataArrived handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addDataArrivedHandler(com.smartgwt.client.widgets.form.fields.events.DataArrivedHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.form.fields.events.DataArrivedEvent.getType()) == 0) setupDataArrivedEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.form.fields.events.DataArrivedEvent.getType());
    }

    private native void setupDataArrivedEvent() /*-{
        var obj = null;
        obj = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        var selfJ = this;
        var dataArrived = $entry(function(){
            var param = {"startRow" : arguments[0], "endRow" : arguments[1], "data" : arguments[2]};
            var event = @com.smartgwt.client.widgets.form.fields.events.DataArrivedEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
            selfJ.@com.smartgwt.client.core.DataClass::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
            });
        obj.dataArrived =  dataArrived 
        ;
   }-*/;
	/**
     * Expression evaluated to determine the {@link com.smartgwt.client.widgets.form.fields.SelectItem#getDefaultValue
     * defaultValue} when no value is provided for this item. To default to the first option use {@link
     * com.smartgwt.client.widgets.form.fields.SelectItem#getDefaultToFirstOption defaultToFirstOption} instead.
     */
    public native void defaultDynamicValue() /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        self.defaultDynamicValue();
    }-*/;

	/**
     * Returns the <code>displayField</code> for this item. This will typically be specified explicitly via the {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getDisplayField displayField} attribute. However, if  that property is
     * unset, and the {@link com.smartgwt.client.widgets.form.fields.FormItem#getValueField valueField} for this item is 
     * hidden in the {@link com.smartgwt.client.widgets.form.fields.FormItem#getOptionDataSource optionDataSource}, this method
     * will return the title field for the <code>optionDataSource</code>.
     *
     * @return display field name, or null if there is no separate display field to use.
     */
    public native String getDisplayFieldName() /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        var ret = self.getDisplayFieldName();
        return ret;
    }-*/;

	/**
     * For a SelectItem with an {@link com.smartgwt.client.widgets.form.fields.SelectItem#getOptionDataSource optionDataSource}
     * and allowing multiple selection ({@link com.smartgwt.client.widgets.form.fields.SelectItem#getMultiple via
     * multiple:true}), returns the list of currently selected records, or null if none are selected.
     *
     * @return the list of selected records, or null if none are selected
     */
    public native ListGridRecord[] getSelectedRecords() /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        var ret = self.getSelectedRecords();
        if(ret == null) return null;
        return @com.smartgwt.client.util.ConvertTo::arrayOfListGridRecord(Lcom/google/gwt/core/client/JavaScriptObject;)(ret);
    }-*/;

	/**
     * Getter method to retrieve the {@link com.smartgwt.client.widgets.form.fields.FormItem#getValueField valueField} for this
     * item. If unset, default behavior will return the {@link com.smartgwt.client.widgets.form.fields.FormItem#getName name}
     * of this field.
     *
     * @return fieldName to use a "value field" in records from this items               {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getOptionDataSource optionDataSource}
     */
    public native String getValueFieldName() /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        var ret = self.getValueFieldName();
        return ret;
    }-*/;

	/**
     * Method to show a picker for this item. By default this method is called if the user clicks on a {@link
     * com.smartgwt.client.widgets.form.fields.SelectItem#getShowPickerIcon pickerIcon}.  May also be called programmatically.
     * <P> Default implementation lazily creates and shows the {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getPicker Picker Autochild}. May be overridden to implement some custom
     * picker for this item.
     */
    public native void showPicker() /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        self.showPicker();
    }-*/;


    // ********************* Static Methods ***********************

    /** 
     * Class level method to set the default properties of this class.  If set, then all
     * existing and subsequently created instances of this class will automatically have
     * default properties corresponding to
     * the properties of the class instance passed to this function.
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
     * @param selectItemProperties properties that should be used as new defaults when instances of this class are created
     */
    public static native void setDefaultProperties(SelectItem selectItemProperties) /*-{
    	var properties = $wnd.isc.addProperties({},selectItemProperties.@com.smartgwt.client.core.RefDataClass::getJsObj()());
        @com.smartgwt.client.util.JSOHelper::cleanProperties(Lcom/google/gwt/core/client/JavaScriptObject;Z)(properties,false);
        $wnd.isc.SelectItem.addProperties(properties);
    }-*/;

    // ***********************************************************


    static {
        init();
    }

    private static native void init()/*-{
        if ($wnd.isc.SelectItem.getPrototype().__getPickListFilterCriteria == null) {
            $wnd.isc.SelectItem.getPrototype().__getPickListFilterCriteria = $wnd.isc.SelectItem.getPrototype().getPickListFilterCriteria;
            $wnd.isc.SelectItem.getPrototype().getPickListFilterCriteria = $entry(function() {
                var jObj = this.__ref;
                //if widget was not created in java via smartgwt, fallback to old behavior
                if(jObj && @com.smartgwt.client.widgets.form.fields.SelectItem::isSelectItem(Lcom/smartgwt/client/widgets/form/fields/FormItem;)(jObj)) {
                    jObj.@com.smartgwt.client.widgets.form.fields.SelectItem::setJsObj(Lcom/google/gwt/core/client/JavaScriptObject;)(this);
                    var critJ = jObj.@com.smartgwt.client.widgets.form.fields.SelectItem::getPickListFilterCriteria()();
                    return critJ == null ? {} : critJ.@com.smartgwt.client.data.Criteria::getJsObj()();
                } else {
                    return this.__getPickListFilterCriteria();
                }
            });
        }
    }-*/;

    private static boolean isSelectItem(FormItem formItem) {
        return formItem instanceof SelectItem;
    }

    /**
     * Returns a set of filter criteria to be applied to the data displayed in the pickList when it is shown.
     * <br>
     * If this is a databound item, the criteria will be passed as criteria to DataSource.fetchData(). Otherwise an equivalent client-side filter
     * will be performed on the data returned by PickList.getClientPickListData().
     * <br>
     * By default returns PickList.pickListCriteria if specified, otherwise an empty set of criteria so all records will be displayed.
     *
     * <b>Note : this is an override point - if overridden this method will be called by the live form item during filtering.
     * However it is recommended that developers use
     * {@link #setPickListFilterCriteriaFunction(FormItemCriteriaFunction)} to build custom criteria instead of overriding this method directly. This ensures that
     * the custom filter criteria generating code will be called even if the form item was automatically generated based on a template
     * passed to {@link com.smartgwt.client.widgets.grid.ListGridField#setEditorType}.</b>
     *
     * @return criteria to be used for databound or local filtering
     */
    protected native Criteria getPickListFilterCriteria() /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        var critJS = self.__getPickListFilterCriteria();
        return critJS == null ? null : @com.smartgwt.client.data.Criteria::new(Lcom/google/gwt/core/client/JavaScriptObject;)(critJS);
    }-*/;

    //------------------- From PickList -------

    /**
     * Maximum height to show the pick list before it starts to scroll. Note that by default the pickList will be sized
     * to the height required by its content so it will be taller when more rows are available as selectable options.
     *
     * @param pickListHeight pickListHeight Default value is 300
     */
    public void setPickListHeight(int pickListHeight) {
        setAttribute("pickListHeight", pickListHeight);
    }

    /**
     * Maximum height to show the pick list before it starts to scroll. Note that by default the pickList will be sized
     * to the height required by its content so it will be taller when more rows are available as selectable options.
     *
     * @return int
     */
    public int getPickListHeight() {
        return getAttributeAsInt("pickListHeight");
    }

    /**
     * Height for an empty pick list (showing the empty message), if the pick list has no records and {@link
     * com.smartgwt.client.widgets.form.fields.PickList#getHideEmptyPickList hideEmptyPickList} is <code>false</code>.
     *
     * @param emptyPickListHeight emptyPickListHeight Default value is 100
     */
    public void setEmptyPickListHeight(int emptyPickListHeight) {
        setAttribute("emptyPickListHeight", emptyPickListHeight);
    }

    /**
     * Height for an empty pick list (showing the empty message), if the pick list has no records and {@link
     * com.smartgwt.client.widgets.form.fields.PickList#getHideEmptyPickList hideEmptyPickList} is <code>false</code>.
     *
     * @return int
     */
    public int getEmptyPickListHeight() {
        return getAttributeAsInt("emptyPickListHeight");
    }

    /**
     * Empty message to display in the pickList if  {@link com.smartgwt.client.widgets.form.fields.PickList#getHideEmptyPickList
     * hideEmptyPickList} is <code>false</code>. <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param emptyPickListMessage emptyPickListMessage Default value is null
     */
    public void setEmptyPickListMessage(String emptyPickListMessage) {
        setAttribute("emptyPickListMessage", emptyPickListMessage);
    }

    /**
     * Empty message to display in the pickList if  {@link com.smartgwt.client.widgets.form.fields.PickList#getHideEmptyPickList
     * hideEmptyPickList} is <code>false</code>.
     *
     * @return String
     */
    public String getEmptyPickListMessage() {
        return getAttributeAsString("emptyPickListMessage");
    }

    /**
     * If this pickList contains no options, should it be hidden? If unset, default behavior is to allow the empty
     * pickList to show if it is databound.
     *
     * @param hideEmptyPickList hideEmptyPickList Default value is null
     */
    public void setHideEmptyPickList(Boolean hideEmptyPickList) {
        setAttribute("hideEmptyPickList", hideEmptyPickList);
    }

    /**
     * If this pickList contains no options, should it be hidden? If unset, default behavior is to allow the empty
     * pickList to show if it is databound.
     *
     * @return Boolean
     */
    public Boolean getHideEmptyPickList() {
        return getAttributeAsBoolean("hideEmptyPickList");
    }

    /**
     * Default width to show the pickList. If not specified, the width of this form item's element will be used
     * instead.
     *
     * @param pickListWidth pickListWidth Default value is null
     */
    public void setPickListWidth(Integer pickListWidth) {
        setAttribute("pickListWidth", pickListWidth);
    }

    /**
     * Default width to show the pickList. If not specified, the width of this form item's element will be used
     * instead.
     *
     * @return Integer
     */
    public Integer getPickListWidth() {
        return getAttributeAsInt("pickListWidth");
    }

    /**
     * Base Style for pickList cells.  As with ListGrid Cells, will have 'over', 'selected' and 'disabled' appended on
     * changes of state for the cells.
     *
     * @param pickListBaseStyle pickListBaseStyle Default value is "pickListCell"
     */
    public void setPickListBaseStyle(String pickListBaseStyle) {
        setAttribute("pickListBaseStyle", pickListBaseStyle);
    }

    /**
     * Base Style for pickList cells.  As with ListGrid Cells, will have 'over', 'selected' and 'disabled' appended on
     * changes of state for the cells.
     *
     * @return String
     */
    public String getPickListBaseStyle() {
        return getAttributeAsString("pickListBaseStyle");
    }

    /**
     * If true, when the pickList is shown, it will be shown via an animated reveal effect <p><b>Note : </b> This is an
     * advanced setting</p>
     *
     * @param animatePickList animatePickList Default value is null
     */
    public void setAnimatePickList(Boolean animatePickList) {
        setAttribute("animatePickList", animatePickList);
    }

    /**
     * If true, when the pickList is shown, it will be shown via an animated reveal effect
     *
     * @return Boolean
     */
    public Boolean getAnimatePickList() {
        return getAttributeAsBoolean("animatePickList");
    }

    /**
     * If this.animatePickList is true - this specifies the duration of the animation effect applied when showing the
     * pickList <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param animationTime animationTime Default value is 200
     */
    public void setAnimationTime(int animationTime) {
        setAttribute("animationTime", animationTime);
    }

    /**
     * If this.animatePickList is true - this specifies the duration of the animation effect applied when showing the
     * pickList
     *
     * @return int
     */
    public int getAnimationTime() {
        return getAttributeAsInt("animationTime");
    }

    /**
     * If this pick list is showing multiple fields, this property determines the height of the column headers for those
     * fields. Set to zero to suppress the headers entirely.
     *
     * @param pickListHeaderHeight pickListHeaderHeight Default value is 22
     */
    public void setPickListHeaderHeight(int pickListHeaderHeight) {
        setAttribute("pickListHeaderHeight", pickListHeaderHeight);
    }

    /**
     * If this pick list is showing multiple fields, this property determines the height of the column headers for those
     * fields. Set to zero to suppress the headers entirely.
     *
     * @return int
     */
    public int getPickListHeaderHeight() {
        return getAttributeAsInt("pickListHeaderHeight");
    }

    /**
     * Specifies the field by which this item should be initially sorted.  Can be set to  either a {@link
     * com.smartgwt.client.widgets.grid.ListGridField#getName() 'field name'} or the index of the field in the fields  Array.
     * Note that if <code>sortField</code> is initially specified as a number, it will be converted to a string (field name)
     * after the item is initialized. <P> To programmatically change sort field or direction after initialization, call
     * ${isc.DocUtils.linkForRef('sort')}.
     *
     *
     * @return Integer
     */
    public Integer getSortFieldAsInt()  {
        return getAttributeAsInt("sortField");
    }

    /**
     * For Databound formItems, this property determines which column  {@link com.smartgwt.client.widgets.form.fields.FormItem#getValueIcons
     * valueIcons} should show up in for this formItem's pickList.<br> If unset valueIcons show up in the {@link
     * com.smartgwt.client.widgets.form.fields.PickList#getDisplayField displayField} column if specified,  otherwise
     * the {@link com.smartgwt.client.widgets.form.fields.PickList#getValueField valueField} column.<br> In most cases
     * only the <code>displayField</code> or <code>valueField</code> will be visible. This property is typically only
     * required if custom {@link com.smartgwt.client.widgets.form.fields.PickList#getPickListFields pickListFields}
     * have been specified for this item. <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param valueIconField valueIconField Default value is null
     */
    public void setValueIconField(String valueIconField) {
        setAttribute("valueIconField", valueIconField);
    }

    /**
     * For Databound formItems, this property determines which column  {@link com.smartgwt.client.widgets.form.fields.FormItem#getValueIcons
     * valueIcons} should show up in for this formItem's pickList.<br> If unset valueIcons show up in the {@link
     * com.smartgwt.client.widgets.form.fields.PickList#getDisplayField displayField} column if specified,  otherwise
     * the {@link com.smartgwt.client.widgets.form.fields.PickList#getValueField valueField} column.<br> In most cases
     * only the <code>displayField</code> or <code>valueField</code> will be visible. This property is typically only
     * required if custom {@link com.smartgwt.client.widgets.form.fields.PickList#getPickListFields pickListFields}
     * have been specified for this item.
     *
     * @return String
     */
    public String getValueIconField() {
        return getAttributeAsString("valueIconField");
    }

    /**
     * If true, even non-matching options will be shown, with configurable  {@link com.smartgwt.client.widgets.form.fields.PickList#getSeparatorRows
     * separatorRows} in between.  Not valid for {@link com.smartgwt.client.widgets.form.fields.PickList#getOptionDataSource
     * optionDataSource}.
     *
     * @param showAllOptions showAllOptions Default value is null
     */
    public void setShowAllOptions(Boolean showAllOptions) {
        setAttribute("showAllOptions", showAllOptions);
    }

    /**
     * If true, even non-matching options will be shown, with configurable  {@link com.smartgwt.client.widgets.form.fields.PickList#getSeparatorRows
     * separatorRows} in between.  Not valid for {@link com.smartgwt.client.widgets.form.fields.PickList#getOptionDataSource
     * optionDataSource}.
     *
     * @return Boolean
     */
    public Boolean getShowAllOptions() {
        return getAttributeAsBoolean("showAllOptions");
    }

    /**
     * If this item has a specified <code>optionDataSource</code>, and this property is not null, this will be passed to
     * the datasource as {@link com.smartgwt.client.rpc.RPCRequest} properties when performing the filter operation on
     * the dataSource to obtain the set of options for the list. <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param optionFilterContext optionFilterContext Default value is null
     */
    public void setPickListCriteria(DSRequest optionFilterContext) {
        setAttribute("optionFilterContext", optionFilterContext);
    }

    /**
     * If set, this FormItem will derive data to show in the PickList by fetching records from the specified
     * <code>optionDataSource</code>.  The fetched data will be used as a {@link com.smartgwt.client.widgets.form.fields.FormItem#getValueMap
     * valueMap} by extracting the {@link com.smartgwt.client.widgets.form.fields.FormItem#getValueField valueField} and
     * {@link com.smartgwt.client.widgets.form.fields.FormItem#getDisplayField displayField} in the loaded records, to
     * derive one valueMap entry per record loaded from the optionDataSource.  Multiple fields from the fetched data may
     * be shown in the pickList by setting {@link com.smartgwt.client.widgets.form.fields.SelectItem#getPickListFields
     * pickListFields}. <P> The data will be retrieved via a "fetch" operation on the DataSource, passing the  {@link
     * com.smartgwt.client.widgets.form.fields.PickList#getPickListCriteria pickListCriteria} (if set) as criteria, and passing {@link
     * com.smartgwt.client.widgets.form.fields.SelectItem#getOptionFilterContext optionFilterContext} (if set) as
     * DSRequest properties. <P> The fetch will be triggered when the pickList is first shown, or, you can set {@link
     * com.smartgwt.client.widgets.form.fields.SelectItem#getAutoFetchData autoFetchData} to fetch when the FormItem is
     * first drawn.  You can also call {@link com.smartgwt.client.widgets.form.fields.PickList#fetchData} at any time to manually  trigger
     * a fetch. <P> Data paging is automatically enabled if the optionDataSource supports it.  As the pickList is
     * scrolled by the user, requests for additional data will be automatically issued. <P> For a pickList attached to a
     * ComboBoxItem, new fetches are issued as the user types, with criteria set as described under {@link
     * com.smartgwt.client.widgets.form.fields.ComboBoxItem#getPickListFilterCriteria}. If your dataSource is not
     * capable of filtering results by search criteria (eg the dataSource is backed by an XML flat file), you can set
     * {@link com.smartgwt.client.widgets.form.fields.SelectItem#getFilterLocally filterLocally} to have the entire
     * dataset loaded up front and filtering performed in the browser.  This disables data paging. <P> Setting
     * optionDataSource also enables the basic {@link com.smartgwt.client.widgets.form.fields.FormItem#getOptionDataSource
     * optionDataSource} behaviors, eg, fetching individual display values before the pickList is shown. <P> Note that
     * if a normal, static {@link com.smartgwt.client.widgets.form.fields.FormItem#getValueMap valueMap} is <b>also</b>
     * specified for the field (either directly in the form item or as part of the field definition in the dataSource),
     * it will be preferred to the data derived from the optionDataSource for whatever mappings are present. <p><b>Note
     * : </b> This is an advanced setting</p>
     *
     * @param optionDataSource optionDataSource Default value is null
     */
    public void setOptionDataSource(DataSource dataSource) {
        setAttribute("optionDataSource", dataSource);
    }

    public DataSource getOptionDataSource() {
        return DataSource.getOrCreateRef(getAttributeAsJavaScriptObject("optionDataSource"));
    }

    public void setSeparatorRows(ListGridRecord[] separatorRows) {
        setAttribute("separatorRows", separatorRows);
    }

    /**
     * Default values used when no value is provided for this item. Note that whenever this item's value is cleared by the user
     * or set to <code>null</code> programmatically, it will be reverted to the <code>defaultValues</code>.
     *
     * @param defaultValues the defaultValues. Default value is null
     */
    public void setDefaultValues(String... defaultValues) {
        setAttribute("defaultValue", defaultValues);
    }

    /**
     * Default values used when no value is provided for this item. Note that whenever this item's value is cleared by the user
     * or set to <code>null</code> programmatically, it will be reverted to the <code>defaultValues</code>.
     *
     * @param defaultValues the defaultValues. Default value is null
     */
    public void setDefaultValues(Integer... defaultValues) {
        setAttribute("defaultValue", defaultValues);
    }

    public void setFetchDelay(Integer fetchDelay) {
        setAttribute("fetchDelay", fetchDelay);
    }

    public Integer getFetchDelay() {
        return getAttributeAsInt("fetchDelay");
    }

    // ********************* Methods ***********************

    /**
     * Returns the values of a SelectItem with multiple=true as an array of Strings.
     *
     * @return value of selection. If no values are selected, and empty array is returned
     */
    public native String[] getValues() /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        var value;
        if(self.getValue) {
             value = self.getValue();
        } else {
            value = self.value;
        }
        if(value == null) {
            value = [];
        } else if(!$wnd.isc.isA.Array(value)) {
            value = [value];
        }
        return  @com.smartgwt.client.util.JSOHelper::convertToJavaStringArray(Lcom/google/gwt/core/client/JavaScriptObject;)(value);
    }-*/;

    /**
     * Set the values of a SelectItem with multiple=true.
     *
     * @param values the SelectItem values
     */
    public native void setValues(String... values) /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        var valuesJS = @com.smartgwt.client.util.JSOHelper::convertToJavaScriptArray([Ljava/lang/Object;)(values);
        if(self.setValue) {
            self.setValue(valuesJS);
        } else {
            self.value = valuesJS;
        }
    }-*/;

    /**
     * If true, multiple values may be selected. <P> The SelectItem will either render as a drop-down allowing multiple
     * selections, or a multi-row list of options similar to a small headerless {@link
     * com.smartgwt.client.widgets.grid.ListGrid}, based on the {@link com.smartgwt.client.types.MultipleAppearance} setting.
     * <P> The logical value of the formItem, as retrieved by {@link com.smartgwt.client.widgets.form.fields.FormItem#getValue
     * getValue()} and set via {@link com.smartgwt.client.widgets.form.fields.FormItem#setValue setValue()}, is an Array of
     * Strings reflecting the selected values. <P> When this value is true, we disable doubleClick events by default, instead
     * issuing two single clicks by forcibly setting {@link com.smartgwt.client.widgets.Canvas#getNoDoubleClicks
     * noDoubleClicks: true}. If you need to work with doubleClick events, you can disable this default behavior by explicitly
     * setting formItem.pickListProperties.noDoubleClicks: false. <P> Note: <code>multiple:true</code> SelectItems do not
     * currently support optionDataSource binding.  You can get around this by calling {@link
     * com.smartgwt.client.data.DataSource#fetchData DataSource.fetchData} directly and calling {@link
     * com.smartgwt.client.data.List#getValueMap dsResponse.data.getValueMap()} to obtain a valueMap.
     *
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public Boolean isMultiple()  {
        return getAttributeAsBoolean("multiple");
    }

    public native ListGridRecord[] filterClientPickListData() /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        var dataJS =  self.filterClientPickListData();
        return @com.smartgwt.client.util.ConvertTo::arrayOfListGridRecord(Lcom/google/gwt/core/client/JavaScriptObject;)(dataJS);
    }-*/;

    public native ListGridRecord[] getClientPickListData() /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        var dataJS =  self.getClientPickListData();
        return @com.smartgwt.client.util.ConvertTo::arrayOfListGridRecord(Lcom/google/gwt/core/client/JavaScriptObject;)(dataJS);
    }-*/;

//------------------- end PickList -------

    /**
     * Returns the entire record object associated with the current value for this item (or null if no matching record exists
     * in the PickList data). Most commonly used for databound pickListItems to retrieve the values of other fields in the record.
     *
     * @return the selected record or null
     */
    public native ListGridRecord getSelectedRecord() /*-{
	    var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
	    var ret = self.getSelectedRecord();
	    if(ret == null || ret === undefined) return null;
	    var retVal = @com.smartgwt.client.core.RefDataClass::getRef(Lcom/google/gwt/core/client/JavaScriptObject;)(ret);
	    if(retVal == null) {
	        retVal = @com.smartgwt.client.widgets.grid.ListGridRecord::new(Lcom/google/gwt/core/client/JavaScriptObject;)(ret);
	    }
	    return retVal;
	}-*/;

    /**
     * Set the pick list filter criteria function / handler.
     *
     * @param filterCriteriaFunction the filter criteria function
     * @deprecated in favor of {@link #setPickListFilterCriteriaFunction(FormItemCriteriaFunction)}
     */
    public native void setPickListFilterCriteriaFunction(FilterCriteriaFunction filterCriteriaFunction) /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        self.getPickListFilterCriteria = $entry(function() {
            var crit = filterCriteriaFunction.@com.smartgwt.client.widgets.form.fields.FilterCriteriaFunction::getCriteria()();
            return crit == null ? null : crit.@com.smartgwt.client.data.Criteria::getJsObj()();
        });
    }-*/;

    /**
     * Set up a method to return filter criteria for options displayed for this item.
     * <br>
     * The criteria returned by this method are used to decide which options should appear in the
     * drop-down PickList shown by this SelectItem.
     * <br>
     * Static criteria, specified via pickListCriteria, will always be included in addition to criteria
     * returned by this method.
     *
     */
    public native void setPickListFilterCriteriaFunction(FormItemCriteriaFunction filterCriteriaFunction) /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        self.getPickListFilterCriteria = $entry(function() {
            var context = @com.smartgwt.client.widgets.form.fields.FormItemFunctionContext::new()();
            var itemJ = @com.smartgwt.client.widgets.form.fields.SelectItem::getOrCreateRef(Lcom/google/gwt/core/client/JavaScriptObject;)(this);
            context.@com.smartgwt.client.widgets.form.fields.FormItemFunctionContext::setFormItem(Lcom/smartgwt/client/widgets/form/fields/FormItem;)(itemJ);
            var crit = filterCriteriaFunction.@com.smartgwt.client.widgets.form.fields.FormItemCriteriaFunction::getCriteria(Lcom/smartgwt/client/widgets/form/fields/FormItemFunctionContext;)(context);
            return crit == null ? null : crit.@com.smartgwt.client.data.Criteria::getJsObj()();
        });
    }-*/;


    /**
     * Set the properties to be applied to the pickList created for this Form Item.
     *
     * @param pickListProperties the pick list properties
     */
    public void setPickListProperties(ListGrid pickListProperties) {
        JavaScriptObject configJS = pickListProperties.getConfig();
        if (configJS != null) {
            configJS = JSOHelper.cleanProperties(configJS, true);
            JSOHelper.deleteAttribute(configJS, "alternateRecordStyles");
        }
        setAttribute("pickListProperties", configJS);
    }

    public void setOptionFilterContext(DSRequest dsRequestProperties) {
        setAttribute("optionFilterContext", dsRequestProperties);
    }

    /**
     * Return the value tracked by this form item.
     *
     * @return value of this element
     */
    public native String getValueAsString() /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        var ret;
        if(self.setValue) {
             ret = self.getValue();
        } else {
            ret = self.value;
        }
        return ret == null || ret === undefined ? null : ret.toString();
    }-*/;

    /**
     * This method sorts the pickList on one or more fields, creating the underlying JS object
     * if needed. Pass in an array of SortSpecifiers to have the grid's data sorted by the fields in each
     * specifier.property and in the directions specified.  The grid can be sorted by any combination
     * of fields, including fields specified in the fields array, whether visible or hidden, and
     * {@link com.smartgwt.client.data.DataSource#getFields() 'unused fields from the underlying dataSource'},
     * if there is one.  If multiple fields are sorted, those that are visible show a directional icon and a small
     * {@link com.smartgwt.client.widgets.grid.ListGrid#getSortNumeralStyle() 'sort-numeral'} indicating that
     * field's index in the sort configuration.
     * <P>
     * See {@link com.smartgwt.client.widgets.grid.ListGrid#addSort}
     * and {@link com.smartgwt.client.widgets.grid.ListGrid#alterSort}
     * APIs for information on making changes to the current sort configuration.
     * @param sortSpecifiers Array of SortSpecifier objects
     */
    public native void setPickListSort(SortSpecifier[] sortSpecifiers) /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()(),
            specifiers = @com.smartgwt.client.util.JSOHelper::convertToJavaScriptArray([Ljava/lang/Object;)(sortSpecifiers);
        if (self != null && self.pickList != null) self.pickList.setSort(specifiers);
        else {
            var configJS = this.@com.smartgwt.client.core.DataClass::getAttributeAsJavaScriptObject(Ljava/lang/String;)("pickListProperties");
            if (configJS == null) {
                configJS = {};
                this.@com.smartgwt.client.core.DataClass::setAttribute(Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)("pickListProperties", configJS);
            }
            configJS.initialSort = specifiers;
        }
    }-*/;

	/**
     * Only applies to databound items (see  optionDataSource).<br> Performs a fetch type operation on this item's DataSource
     * to retrieve the set of valid options for the item, based on the current  pickListCriteria.
     */
    public native void fetchData() /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        self.fetchData();
    }-*/;

	/**
	 * @see {@link SelectItem#fetchData()}
	 */
	public void fetchData(DSCallback callback){
		fetchData(callback,null);
	}
	
	/**
     * Only applies to databound items (see  optionDataSource).<br> Performs a fetch type operation on this item's DataSource
     * to retrieve the set of valid options for the item, based on the current  pickListCriteria.
     * @param callback Callback to fire when the fetch completes. Callback will               fire with 4 parameters:<ul> 
     * <li><code>item</code> a pointer to the form item  <li><code>dsResponse</code> the {@link
     * com.smartgwt.client.data.DSResponse} returned by the server  <li><code>data</code> the raw data returned by the server 
     * <li><code>dsRequest</code> the {@link com.smartgwt.client.data.DSRequest} sent to the server  </ul>
     * @param requestProperties properties to apply to the              dsRequest for this fetch.
     */
    public native void fetchData(DSCallback callback, DSRequest requestProperties) /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        self.fetchData(
			$entry( function(item,dsResponse,data,dsRequest) { 
				if(callback!=null) callback.@com.smartgwt.client.data.DSCallback::execute(Lcom/smartgwt/client/data/DSResponse;Ljava/lang/Object;Lcom/smartgwt/client/data/DSRequest;)(
					@com.smartgwt.client.data.DSResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(dsResponse), 
					data, 
					@com.smartgwt.client.data.DSRequest::new(Lcom/google/gwt/core/client/JavaScriptObject;)(dsRequest)
				);
			}), requestProperties == null ? null : requestProperties.@com.smartgwt.client.core.DataClass::getJsObj()());
    }-*/;


}



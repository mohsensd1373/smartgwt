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
 
package com.smartgwt.client.widgets.form.fields;



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
 * FormItem for managing a text field.
 */
public class TextItem extends FormItem {

    public static TextItem getOrCreateRef(JavaScriptObject jsObj) {
        if(jsObj == null) return null;
        RefDataClass obj = RefDataClass.getRef(jsObj);
        if(obj != null) {
            obj.setJsObj(jsObj);
            return (TextItem) obj;
        } else {
            return new TextItem(jsObj);
        }
    }

    public TextItem(){
        setType("TextItem");
    }

    public TextItem(JavaScriptObject jsObj){
        super(jsObj);
    }

    public TextItem(String name) {
        setName(name);
        setType("TextItem");
    }

    public TextItem(String name, String title) {
        setName(name);
		setTitle(title);
        setType("TextItem");
    }

    // ********************* Properties / Attributes ***********************

    /**
     * Default width for fields.
     *
     * @param width width Default value is 150
     */
    public void setWidth(int width) {
        setAttribute("width", width);
    }

    /**
     * Default width for fields.
     *
     *
     * @return int
     */
    public int getWidth()  {
        return getAttributeAsInt("width");
    }

    /**
     * Default height for text items.
     *
     * @param height height Default value is 19
     */
    public void setHeight(int height) {
        setAttribute("height", height);
    }

    /**
     * Default height for text items.
     *
     *
     * @return int
     */
    public int getHeight()  {
        return getAttributeAsInt("height");
    }

    /**
     * Base CSS class name for this item's input element. NOTE: See the CompoundFormItem_skinning discussion for special
     * skinning considerations.
     *
     * @param textBoxStyle textBoxStyle Default value is "textItem"
     */
    public void setTextBoxStyle(String textBoxStyle) {
        setAttribute("textBoxStyle", textBoxStyle);
    }

    /**
     * Base CSS class name for this item's input element. NOTE: See the CompoundFormItem_skinning discussion for special
     * skinning considerations.
     *
     *
     * @return String
     */
    public String getTextBoxStyle()  {
        return getAttributeAsString("textBoxStyle");
    }

    /**
     * if set, maximum number of characters for this field
     *
     * @param length length Default value is null
     */
    public void setLength(Integer length) {
        setAttribute("length", length);
    }

    /**
     * if set, maximum number of characters for this field
     *
     *
     * @return Integer
     */
    public Integer getLength()  {
        return getAttributeAsInt("length");
    }

    /**
     * Allows the {@link com.smartgwt.client.widgets.form.DynamicForm#getSelectOnFocus 'selectOnFocus'} behavior to be
     * configured on a per-FormItem basis.  Normally all items in a form default to the value of {@link
     * com.smartgwt.client.widgets.form.DynamicForm#getSelectOnFocus selectOnFocus}.
     *
     * @param selectOnFocus selectOnFocus Default value is null
     */
    public void setSelectOnFocus(Boolean selectOnFocus) {
        setAttribute("selectOnFocus", selectOnFocus);
    }

    /**
     * Allows the {@link com.smartgwt.client.widgets.form.DynamicForm#getSelectOnFocus 'selectOnFocus'} behavior to be
     * configured on a per-FormItem basis.  Normally all items in a form default to the value of {@link
     * com.smartgwt.client.widgets.form.DynamicForm#getSelectOnFocus selectOnFocus}.
     *
     *
     * @return Boolean
     */
    public Boolean getSelectOnFocus()  {
        return getAttributeAsBoolean("selectOnFocus");
    }

    /**
     * If showing hint for this form item, should it be shown within the field? <P>Note when this property is true, {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getHintStyle hintStyle} is not used - class "textItemHint" is always
     * used.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param showHintInField showHintInField Default value is null
     */
    public void setShowHintInField(Boolean showHintInField) {
        setAttribute("showHintInField", showHintInField);
    }

    /**
     * If showing hint for this form item, should it be shown within the field? <P>Note when this property is true, {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getHintStyle hintStyle} is not used - class "textItemHint" is always
     * used.
     *
     *
     * @return Boolean
     */
    public Boolean getShowHintInField()  {
        return getAttributeAsBoolean("showHintInField");
    }
             
    /**
     * Should entered characters be converted to upper or lowercase? Also applies to values applied with {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#setValue}.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param characterCasing characterCasing Default value is TextItem.DEFAULT
     */
    public void setCharacterCasing(CharacterCasing characterCasing) {
        setAttribute("characterCasing", characterCasing.getValue());
    }

    /**
     * Should entered characters be converted to upper or lowercase? Also applies to values applied with {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#setValue}.
     *
     *
     * @return CharacterCasing
     */
    public CharacterCasing getCharacterCasing()  {
        return EnumUtil.getEnum(CharacterCasing.values(), getAttribute("characterCasing"));
    }

    /**
     * Sets a keypress filter regular expression to limit valid characters that can be entered by the user. If defined, keys
     * that match the regular expression are allowed; all others are suppressed. The filter is applied after character casing,
     * if defined.
     * Set the keyPressFilter for this item
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param keyPressFilter new keyPress filter for the item. Default value is null
     */
    public void setKeyPressFilter(String keyPressFilter) {
        setAttribute("keyPressFilter", keyPressFilter);
    }

    /**
     * Sets a keypress filter regular expression to limit valid characters that can be entered by the user. If defined, keys
     * that match the regular expression are allowed; all others are suppressed. The filter is applied after character casing,
     * if defined.
     *
     *
     * @return String
     */
    public String getKeyPressFilter()  {
        return getAttributeAsString("keyPressFilter");
    }

    // ********************* Methods ***********************

    /**
     * Returns the hint text for this item. Default implementation returns {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getHint hint}, or  null if there is no hint to show.
     *
     * @return HTML to show as the hint for the item
     */
    public native String getHint() /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        return self.getHint();
    }-*/;


    /**
     * Puts focus into this form item and selects characters between the given indices. Only applies to drawn text based items.
     * @param start selection starting character index
     * @param end end of selection character index
     */
    public native void setSelectionRange(int start, int end) /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        self.setSelectionRange(start, end);
    }-*/;

    /**
     * Put focus in this item and select the entire value. Only applies to text based items
     */
    public native void selectValue() /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        self.selectValue();
    }-*/;

    /**
     * If this item currently has focus, clear the current selection. leaving focus in the item. Has no effect if the item is
     * undrawn or unfocussed. Only applies to text-based items.
     */
    public native void deselectValue() /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        self.deselectValue();
    }-*/;

    /**
     * If this item currently has focus, clear the current selection. leaving focus in the item. Has no effect if the item is
     * undrawn or unfocussed. Only applies to text-based items.
     * @param start By default the text insertion cursor will be moved to the end of the   current value - pass in this parameter to move to
     * the start instead
     */
    public native void deselectValue(boolean start) /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        self.deselectValue(start);
    }-*/;


    // ********************* Static Methods ***********************


    /**
     * For text-based items, this method returns the indices of the start/end of the current selection. Returns null if the
     * item doesn't have focus.
     *
     * @return 2 element array showing character index of the current selection's  start and end point within this item's value. May be
     * null if the item doesn't have focus.
     */
    public native int[] getSelectionRange() /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        var selection = self.getSelectionRange();
        return selection == null || selection === undefined ? null : @com.smartgwt.client.util.JSOHelper::convertToJavaIntArray(Lcom/google/gwt/core/client/JavaScriptObject;)(selection);
    }-*/;    

}





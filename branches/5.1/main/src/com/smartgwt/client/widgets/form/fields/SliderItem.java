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
 * FormItem that uses a {@link com.smartgwt.client.widgets.Slider} component to present an interface for picking from
 * either a continuous range or a range with a small number of discrete values.
 */
@BeanFactory.FrameworkClass
public class SliderItem extends CanvasItem {

    public static SliderItem getOrCreateRef(JavaScriptObject jsObj) {

        if(jsObj == null) return null;

        RefDataClass obj = RefDataClass.getRef(jsObj);

		if(obj != null && JSOHelper.getAttribute(jsObj,"__ref")==null) {
            return com.smartgwt.client.util.ObjectFactory.createFormItem("SliderItem",jsObj);

        } else
        if(obj != null) {
            obj.setJsObj(jsObj);
            return (SliderItem) obj;
        } else {
            return new SliderItem(jsObj);
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
        $wnd.isc.SliderItem.changeDefaults(autoChildName + "Defaults", defaults.@com.smartgwt.client.widgets.Canvas::getConfig()());
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
        $wnd.isc.SliderItem.changeDefaults(autoChildName + "Defaults", defaults.@com.smartgwt.client.widgets.form.fields.FormItem::getJsObj()());
    }-*/;
    /**
     * Changes the defaults for DrawItem AutoChildren named <code>autoChildName</code>.
     *
     * @param autoChildName name of an AutoChild to customize the defaults for.
     * @param defaults DrawItem defaults to apply. These defaults override any existing properties
     * without destroying or wiping out non-overridden properties.
     * @see com.smartgwt.client.docs.AutoChildUsage
     */
    public static native void changeAutoChildDefaults(String autoChildName, DrawItem defaults) /*-{
        $wnd.isc.SliderItem.changeDefaults(autoChildName + "Defaults", defaults.@com.smartgwt.client.widgets.drawing.DrawItem::getJsObj()());
    }-*/;

    public static native void changePickerIconDefaults(FormItemIcon defaults) /*-{
        $wnd.isc.SliderItem.changeDefaults("pickerIconDefaults", defaults.@com.smartgwt.client.core.DataClass::getJsObj()());
    }-*/;

    public SliderItem(){
        setAttribute("editorType", "SliderItem");
    }

    public SliderItem(JavaScriptObject jsObj){
        
        setJavaScriptObject(jsObj);
    }


    public SliderItem(String name) {
        setName(name);
                setAttribute("editorType", "SliderItem");
    }


    public SliderItem(String name, String title) {
        setName(name);
		setTitle(title);
                setAttribute("editorType", "SliderItem");
    }


    // ********************* Properties / Attributes ***********************

    /**
     * Should this sliderItem update its value and fire change handlers while the user is actively dragging the slider. Setting
     * this attribute value to <code>false</code> will suppress any change notifications from the user dragging the slider
     * thumb until the user releases the mouse at the final position. This can be useful to avoid repeatedly firing expensive
     * operations such as server fetches while the user drags through a range of values.
     *
     * @param changeOnDrag  Default value is true
     */
    public void setChangeOnDrag(Boolean changeOnDrag) {
        setAttribute("changeOnDrag", changeOnDrag);
    }

    /**
     * Should this sliderItem update its value and fire change handlers while the user is actively dragging the slider. Setting
     * this attribute value to <code>false</code> will suppress any change notifications from the user dragging the slider
     * thumb until the user releases the mouse at the final position. This can be useful to avoid repeatedly firing expensive
     * operations such as server fetches while the user drags through a range of values.
     *
     * @return Boolean
     */
    public Boolean getChangeOnDrag()  {
        return getAttributeAsBoolean("changeOnDrag");
    }
    

    /**
     * Default value for this sliderItems is 1.
     *
     * @param defaultValue  Default value is 1
     */
    public void setDefaultValue(int defaultValue) {
        setAttribute("defaultValue", defaultValue);
    }

    /**
     * Default value for this sliderItems is 1.
     *
     * @return int
     */
    public int getDefaultValue()  {
        return getAttributeAsInt("defaultValue");
    }
    

    /**
     * The maximum slider value. The slider value is equal to maxValue when the thumb is at the top or right of the slider
     * (unless flipValues is true, in which case the maximum value is at the bottom/left of the slider)
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Sets the {@link com.smartgwt.client.widgets.Slider#getMaxValue maximum value} of the slider
     *
     * @param maxValue the new maximum value <b>Note:</b>Use Doubles rather Floats when manipulating decimal values.  See {@link
     * com.smartgwt.client.docs.GwtFloatVsDouble} for details. Default value is 100
     * @see com.smartgwt.client.widgets.Slider#setFlipValues
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#form_controls_various" target="examples">Number - Slider Example</a>
     * @deprecated  {@link com.smartgwt.client.docs.GwtFloatVsDouble GwtFloatVsDouble}
     */
    public void setMaxValue(float maxValue) {
        setAttribute("maxValue", maxValue);
    }

    /**
     * The maximum slider value. The slider value is equal to maxValue when the thumb is at the top or right of the slider
     * (unless flipValues is true, in which case the maximum value is at the bottom/left of the slider)
     *
     * @return float
     * @see com.smartgwt.client.widgets.Slider#getFlipValues
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#form_controls_various" target="examples">Number - Slider Example</a>
     * @deprecated  {@link com.smartgwt.client.docs.GwtFloatVsDouble GwtFloatVsDouble}
     */
    public float getMaxValue()  {
        return getAttributeAsFloat("maxValue");
    }

    /**
     * The maximum slider value. The slider value is equal to maxValue when the thumb is at the top or right of the slider
     * (unless flipValues is true, in which case the maximum value is at the bottom/left of the slider)
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Sets the {@link com.smartgwt.client.widgets.Slider#getMaxValue maximum value} of the slider
     *
     * @param maxValue the new maximum value <b>Note:</b>Use Doubles rather Floats when manipulating decimal values.  See {@link
     * com.smartgwt.client.docs.GwtFloatVsDouble} for details. Default value is 100
     * @see com.smartgwt.client.widgets.Slider#setFlipValues
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#form_controls_various" target="examples">Number - Slider Example</a>
     */
    public void setMaxValue(double maxValue) {
        setAttribute("maxValue", maxValue);
    }

    /**
     * The maximum slider value. The slider value is equal to maxValue when the thumb is at the top or right of the slider
     * (unless flipValues is true, in which case the maximum value is at the bottom/left of the slider)
     *
     * @return double
     * @see com.smartgwt.client.widgets.Slider#getFlipValues
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#form_controls_various" target="examples">Number - Slider Example</a>
     */
    public double getMaxValueAsDouble()  {
        return getAttributeAsDouble("maxValue");
    }
    

    /**
     * The minimum slider value. The slider value is equal to minValue when the thumb is at the bottom or left of the slider
     * (unless flipValues is true, in which case the minimum value is at the top/right of the slider)
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Sets the {@link com.smartgwt.client.widgets.Slider#getMinValue minimum value} of the slider
     *
     * @param minValue the new minimum value <b>Note:</b>Use Doubles rather Floats when manipulating decimal values.  See {@link
     * com.smartgwt.client.docs.GwtFloatVsDouble} for details. Default value is 1
     * @see com.smartgwt.client.widgets.Slider#setFlipValues
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#form_controls_various" target="examples">Number - Slider Example</a>
     * @deprecated  {@link com.smartgwt.client.docs.GwtFloatVsDouble GwtFloatVsDouble}
     */
    public void setMinValue(float minValue) {
        setAttribute("minValue", minValue);
    }

    /**
     * The minimum slider value. The slider value is equal to minValue when the thumb is at the bottom or left of the slider
     * (unless flipValues is true, in which case the minimum value is at the top/right of the slider)
     *
     * @return float
     * @see com.smartgwt.client.widgets.Slider#getFlipValues
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#form_controls_various" target="examples">Number - Slider Example</a>
     * @deprecated  {@link com.smartgwt.client.docs.GwtFloatVsDouble GwtFloatVsDouble}
     */
    public float getMinValue()  {
        return getAttributeAsFloat("minValue");
    }

    /**
     * The minimum slider value. The slider value is equal to minValue when the thumb is at the bottom or left of the slider
     * (unless flipValues is true, in which case the minimum value is at the top/right of the slider)
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Sets the {@link com.smartgwt.client.widgets.Slider#getMinValue minimum value} of the slider
     *
     * @param minValue the new minimum value <b>Note:</b>Use Doubles rather Floats when manipulating decimal values.  See {@link
     * com.smartgwt.client.docs.GwtFloatVsDouble} for details. Default value is 1
     * @see com.smartgwt.client.widgets.Slider#setFlipValues
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#form_controls_various" target="examples">Number - Slider Example</a>
     */
    public void setMinValue(double minValue) {
        setAttribute("minValue", minValue);
    }

    /**
     * The minimum slider value. The slider value is equal to minValue when the thumb is at the bottom or left of the slider
     * (unless flipValues is true, in which case the minimum value is at the top/right of the slider)
     *
     * @return double
     * @see com.smartgwt.client.widgets.Slider#getFlipValues
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#form_controls_various" target="examples">Number - Slider Example</a>
     */
    public double getMinValueAsDouble()  {
        return getAttributeAsDouble("minValue");
    }
    

    /**
     * The number of discrete values represented by slider. If specified, the range of valid values (between
     * <code>minValue</code> and <code>maxValue</code>) will be divided into this many steps. As the thumb is moved along the
     * track it will only select these values and appear to jump between the steps.
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Sets the {@link com.smartgwt.client.widgets.Slider#getNumValues number of values} for the slider
     *
     * @param numValues the new number of values <b>Note:</b>Use Doubles rather Floats when manipulating decimal values.  See {@link
     * com.smartgwt.client.docs.GwtFloatVsDouble} for details. Default value is null
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#form_controls_various" target="examples">Number - Slider Example</a>
     */
    public void setNumValues(Integer numValues) {
        setAttribute("numValues", numValues);
    }

    /**
     * The number of discrete values represented by slider. If specified, the range of valid values (between
     * <code>minValue</code> and <code>maxValue</code>) will be divided into this many steps. As the thumb is moved along the
     * track it will only select these values and appear to jump between the steps.
     *
     * @return Integer
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#form_controls_various" target="examples">Number - Slider Example</a>
     */
    public Integer getNumValues()  {
        return getAttributeAsInt("numValues");
    }
    

    /**
     * If {@link com.smartgwt.client.widgets.Slider#getRoundValues roundValues} is false, the slider value will be rounded to
     * this number of decimal places. If set to null the value will not be rounded
     *
     * @param roundPrecision  Default value is 1
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#form_controls_various" target="examples">Number - Slider Example</a>
     */
    public void setRoundPrecision(int roundPrecision) {
        setAttribute("roundPrecision", roundPrecision);
    }

    /**
     * If {@link com.smartgwt.client.widgets.Slider#getRoundValues roundValues} is false, the slider value will be rounded to
     * this number of decimal places. If set to null the value will not be rounded
     *
     * @return int
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#form_controls_various" target="examples">Number - Slider Example</a>
     */
    public int getRoundPrecision()  {
        return getAttributeAsInt("roundPrecision");
    }
    

    /**
     * Specifies whether the slider value should be rounded to the nearest integer.  If set to false, values will be rounded to
     * a fixed number of decimal places controlled by {@link
     * com.smartgwt.client.widgets.form.fields.SliderItem#getRoundPrecision roundPrecision}.
     *
     * @param roundValues  Default value is true
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#form_controls_various" target="examples">Number - Slider Example</a>
     */
    public void setRoundValues(Boolean roundValues) {
        setAttribute("roundValues", roundValues);
    }

    /**
     * Specifies whether the slider value should be rounded to the nearest integer.  If set to false, values will be rounded to
     * a fixed number of decimal places controlled by {@link
     * com.smartgwt.client.widgets.form.fields.SliderItem#getRoundPrecision roundPrecision}.
     *
     * @return Boolean
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#form_controls_various" target="examples">Number - Slider Example</a>
     */
    public Boolean getRoundValues()  {
        return getAttributeAsBoolean("roundValues");
    }
    

    /**
     * This item is an autoChild generated {@link com.smartgwt.client.widgets.Canvas} displayed by the SliderItem and is an
     * instance of {@link com.smartgwt.client.widgets.Slider} by default. It is customizable  via the standard {@link
     * com.smartgwt.client.types.AutoChild} pattern, by customizing {@link
     * com.smartgwt.client.widgets.form.fields.SliderItem#getSliderProperties sliderProperties} and {@link
     * com.smartgwt.client.widgets.form.fields.SliderItem#getSliderConstructor sliderConstructor}.
     * <p>
     * For an overview of how to use and configure AutoChildren, see {@link com.smartgwt.client.docs.AutoChildUsage Using AutoChildren}.
     *
     * @return Canvas
     */
    public Canvas getSlider()  {
        return (Canvas)Canvas.getByJSObject(getAttributeAsJavaScriptObject("slider"));
    }
    
    
    

    /**
     * Indicates whether this is a vertical or horizontal slider.
     *
     * @param vertical  Default value is false
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#controls_category_slider" target="examples">Slider Example</a>
     */
    public void setVertical(Boolean vertical) {
        setAttribute("vertical", vertical);
    }

    /**
     * Indicates whether this is a vertical or horizontal slider.
     *
     * @return Boolean
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#controls_category_slider" target="examples">Slider Example</a>
     */
    public Boolean getVertical()  {
        return getAttributeAsBoolean("vertical");
    }
    

    // ********************* Methods ***********************

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
     * @param sliderItemProperties properties that should be used as new defaults when instances of this class are created
     */
    public static native void setDefaultProperties(SliderItem sliderItemProperties) /*-{
    	var properties = $wnd.isc.addProperties({},sliderItemProperties.@com.smartgwt.client.core.RefDataClass::getJsObj()());
        @com.smartgwt.client.util.JSOHelper::cleanProperties(Lcom/google/gwt/core/client/JavaScriptObject;Z)(properties,false);
        $wnd.isc.SliderItem.addProperties(properties);
    }-*/;

    // ***********************************************************


    /**
     * Return the value tracked by this form item.
     *
     * @return value of this element
     */
    public native Float getValueAsFloat() /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        var ret;
        if(self.setValue) {
             ret = self.getValue();
        } else {
            ret = self.value;
        }
        return @com.smartgwt.client.util.JSOHelper::toFloat(F)(ret);
    }-*/;    

}



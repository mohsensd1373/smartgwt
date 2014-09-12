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
 
package com.smartgwt.client.widgets.tree;


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
 * The Smart GWT system supports hierarchical data (also referred to as tree data due to its "branching" organization)
 * with: <ul>   <li> the {@link com.smartgwt.client.widgets.tree.Tree} class, which manipulates hierarchical data sets  
 * <li> the TreeGrid widget class, which extends the ListGrid class to visually        present tree data in an
 * expandable/collapsible format. </ul> For information on DataBinding Trees, see {@link
 * com.smartgwt.client.docs.TreeDataBinding}. <p> A TreeGrid works just like a {@link
 * com.smartgwt.client.widgets.grid.ListGrid}, except one column (specified by {@link
 * com.smartgwt.client.widgets.tree.TreeGridField#getTreeField treeField}) shows a hierarchical {@link
 * com.smartgwt.client.widgets.tree.Tree}.  A TreeGrid is not limited to displaying just the {@link
 * com.smartgwt.client.widgets.tree.Tree} column - you can define additional columns (via {@link
 * com.smartgwt.client.widgets.tree.TreeGrid#getFields fields}) which will render just like the columns of a {@link
 * com.smartgwt.client.widgets.grid.ListGrid}, and support all of the functionality of ListGrid columns, such as {@link
 * com.smartgwt.client.widgets.grid.ListGridField#formatCellValue formatters}. <p> Except where explicitly overridden,
 * {@link com.smartgwt.client.widgets.grid.ListGrid} methods, callbacks, and properties apply to TreeGrids as well.  The
 * {@link com.smartgwt.client.widgets.grid.ListGrid} defines some methods as taking/returning {@link
 * com.smartgwt.client.widgets.grid.ListGridField} and {@link com.smartgwt.client.widgets.grid.ListGridRecord}.  When using
 * those methods in a TreeGrid, those types will be {@link com.smartgwt.client.widgets.tree.TreeGridField} and {@link
 * com.smartgwt.client.widgets.tree.TreeNode}, respectively.
 */
@BeanFactory.FrameworkClass
@BeanFactory.ScClassName("TreeGrid")
public class TreeGrid extends ListGrid implements com.smartgwt.client.widgets.tree.events.HasDataArrivedHandlers, com.smartgwt.client.widgets.tree.events.HasFolderClickHandlers, com.smartgwt.client.widgets.tree.events.HasFolderClosedHandlers, com.smartgwt.client.widgets.tree.events.HasFolderContextClickHandlers, com.smartgwt.client.widgets.tree.events.HasFolderOpenedHandlers, com.smartgwt.client.widgets.tree.events.HasLeafClickHandlers, com.smartgwt.client.widgets.tree.events.HasLeafContextClickHandlers, com.smartgwt.client.widgets.tree.events.HasNodeClickHandlers, com.smartgwt.client.widgets.tree.events.HasNodeContextClickHandlers, com.smartgwt.client.widgets.tree.events.HasFolderDropHandlers {

    public static TreeGrid getOrCreateRef(JavaScriptObject jsObj) {
        if (jsObj == null) return null;
        final BaseWidget refInstance = BaseWidget.getRef(jsObj);
        if (refInstance == null) {
            return new TreeGrid(jsObj);
        } else {
            assert refInstance instanceof TreeGrid;
            return (TreeGrid)refInstance;
        }
    }

    private static final TreeGrid TEST_INSTANCE = new TreeGrid();
    static {
        TEST_INSTANCE.setID("isc_TreeGrid_testInstance");
    }

    @Override
    protected TreeGrid getTestInstance() {
        return TEST_INSTANCE;
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
        $wnd.isc.TreeGrid.changeDefaults(autoChildName + "Defaults", defaults.@com.smartgwt.client.widgets.Canvas::getConfig()());
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
        $wnd.isc.TreeGrid.changeDefaults(autoChildName + "Defaults", defaults.@com.smartgwt.client.widgets.form.fields.FormItem::getJsObj()());
    }-*/;

    public TreeGrid(){
        setAnimateFolderSpeed(3000);setAlternateRecordStyles(false);
				scClassName = "TreeGrid";
    }

    public TreeGrid(JavaScriptObject jsObj){
        scClassName = "TreeGrid";
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
     * If {@link com.smartgwt.client.widgets.tree.TreeGrid#getShowOpener showOpener} is true, should we display the opener icon
     * for folders even if they have no children? <P> Note that for trees which {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getLoadDataOnDemand load data on demand}, we may not know if a folder has any
     * descendants if it has never been opened. As such we will show the opener icon next to the folder. Once the user opens
     * the icon and a fetch occurs, if the folder is empty, and this property is false, the opener icon will be hidden. <P> For
     * more information on load on demand trees, and how we determine whether a node is a a folder or a leaf, please refer to
     * the {@link com.smartgwt.client.docs.TreeDataBinding} documentation.
     *
     * @param alwaysShowOpener  Default value is false
     */
    public void setAlwaysShowOpener(Boolean alwaysShowOpener) {
        setAttribute("alwaysShowOpener", alwaysShowOpener, true);
    }

    /**
     * If {@link com.smartgwt.client.widgets.tree.TreeGrid#getShowOpener showOpener} is true, should we display the opener icon
     * for folders even if they have no children? <P> Note that for trees which {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getLoadDataOnDemand load data on demand}, we may not know if a folder has any
     * descendants if it has never been opened. As such we will show the opener icon next to the folder. Once the user opens
     * the icon and a fetch occurs, if the folder is empty, and this property is false, the opener icon will be hidden. <P> For
     * more information on load on demand trees, and how we determine whether a node is a a folder or a leaf, please refer to
     * the {@link com.smartgwt.client.docs.TreeDataBinding} documentation.
     *
     * @return Boolean
     */
    public Boolean getAlwaysShowOpener()  {
        Boolean result = getAttributeAsBoolean("alwaysShowOpener");
        return result == null ? false : result;
    }
    

    /**
     * When animating folder opening / closing, this property can be set to apply an animated acceleration effect. This allows
     * the animation speed to be "weighted", for example expanding or collapsing at a faster rate toward the beginning of the
     * animation than at the end.
     *
     * @param animateFolderEffect  Default value is null
     */
    public void setAnimateFolderEffect(AnimationAcceleration animateFolderEffect) {
        setAttribute("animateFolderEffect", animateFolderEffect == null ? null : animateFolderEffect.getValue(), true);
    }

    /**
     * When animating folder opening / closing, this property can be set to apply an animated acceleration effect. This allows
     * the animation speed to be "weighted", for example expanding or collapsing at a faster rate toward the beginning of the
     * animation than at the end.
     *
     * @return AnimationAcceleration
     */
    public AnimationAcceleration getAnimateFolderEffect()  {
        return EnumUtil.getEnum(AnimationAcceleration.values(), getAttribute("animateFolderEffect"));
    }
    

    /**
     * If {@link com.smartgwt.client.widgets.tree.TreeGrid#getAnimateFolders animateFolders} is true for this grid, this number
     * can be set to designate the maximum number of rows to animate at a time when opening / closing a folder.
     *
     * @param animateFolderMaxRows  Default value is null
     * @see com.smartgwt.client.widgets.tree.TreeGrid#getAnimateFolderMaxRows
     */
    public void setAnimateFolderMaxRows(Integer animateFolderMaxRows) {
        setAttribute("animateFolderMaxRows", animateFolderMaxRows, true);
    }

    /**
     * If {@link com.smartgwt.client.widgets.tree.TreeGrid#getAnimateFolders animateFolders} is true for this grid, this number
     * can be set to designate the maximum number of rows to animate at a time when opening / closing a folder.
     *
     * @return If {@link com.smartgwt.client.widgets.tree.TreeGrid#getAnimateFolders animateFolders} is true for this treeGrid, this
     * method returns the  the maximum number of rows to animate at a time when opening / closing a folder. This method will
     * return {@link com.smartgwt.client.widgets.tree.TreeGrid#getAnimateFolderMaxRows animateFolderMaxRows} if set. Otherwise
     * the value will be calculated as 3x the number of rows required to fill a viewport, capped at a maximum value of 75.
     * @see com.smartgwt.client.widgets.tree.TreeGrid#getAnimateFolderMaxRows
     */
    public Integer getAnimateFolderMaxRows()  {
        return getAttributeAsInt("animateFolderMaxRows");
    }
    

    /**
     * If true, when folders are opened / closed children will be animated into view.
     *
     * @param animateFolders  Default value is true
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#effects_animation_tree" target="examples">Tree Folders Example</a>
     */
    public void setAnimateFolders(Boolean animateFolders) {
        setAttribute("animateFolders", animateFolders, true);
    }

    /**
     * If true, when folders are opened / closed children will be animated into view.
     *
     * @return Boolean
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#effects_animation_tree" target="examples">Tree Folders Example</a>
     */
    public Boolean getAnimateFolders()  {
        Boolean result = getAttributeAsBoolean("animateFolders");
        return result == null ? true : result;
    }
    

    /**
     * When animating folder opening / closing, this property designates the speed of the animation in pixels shown (or hidden)
     * per second. Takes precedence over the  {@link com.smartgwt.client.widgets.tree.TreeGrid#getAnimateFolderTime
     * animateFolderTime} property, which allows the developer to specify a duration for the animation rather than a speed.
     *
     * @param animateFolderSpeed  Default value is 3000
     * @see com.smartgwt.client.widgets.tree.TreeGrid#setAnimateFolderTime
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#effects_animation_tree" target="examples">Tree Folders Example</a>
     */
    public void setAnimateFolderSpeed(int animateFolderSpeed) {
        setAttribute("animateFolderSpeed", animateFolderSpeed, true);
    }

    /**
     * When animating folder opening / closing, this property designates the speed of the animation in pixels shown (or hidden)
     * per second. Takes precedence over the  {@link com.smartgwt.client.widgets.tree.TreeGrid#getAnimateFolderTime
     * animateFolderTime} property, which allows the developer to specify a duration for the animation rather than a speed.
     *
     * @return int
     * @see com.smartgwt.client.widgets.tree.TreeGrid#getAnimateFolderTime
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#effects_animation_tree" target="examples">Tree Folders Example</a>
     */
    public int getAnimateFolderSpeed()  {
        return getAttributeAsInt("animateFolderSpeed");
    }
    

    /**
     * When animating folder opening / closing, if {@link com.smartgwt.client.widgets.tree.TreeGrid#getAnimateFolderSpeed
     * animateFolderSpeed} is not set, this property designates the duration of the animation in ms.
     *
     * @param animateFolderTime  Default value is 100
     * @see com.smartgwt.client.widgets.tree.TreeGrid#setAnimateFolderSpeed
     */
    public void setAnimateFolderTime(int animateFolderTime) {
        setAttribute("animateFolderTime", animateFolderTime, true);
    }

    /**
     * When animating folder opening / closing, if {@link com.smartgwt.client.widgets.tree.TreeGrid#getAnimateFolderSpeed
     * animateFolderSpeed} is not set, this property designates the duration of the animation in ms.
     *
     * @return int
     * @see com.smartgwt.client.widgets.tree.TreeGrid#getAnimateFolderSpeed
     */
    public int getAnimateFolderTime()  {
        return getAttributeAsInt("animateFolderTime");
    }
    

    /**
     * With {@link com.smartgwt.client.widgets.tree.TreeGrid#getLoadDataOnDemand loadDataOnDemand}:true, TreeGrids fetch data
     * by selecting the child nodes of each parent, which should be exact match, so we default to
     * <code>autoFetchTextMatchStyle:"exact"</code>. See {@link
     * com.smartgwt.client.widgets.grid.ListGrid#getAutoFetchTextMatchStyle autoFetchTextMatchStyle} for details.
     *
     * @param autoFetchTextMatchStyle  Default value is "exact"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setAutoFetchTextMatchStyle(TextMatchStyle autoFetchTextMatchStyle)  throws IllegalStateException {
        setAttribute("autoFetchTextMatchStyle", autoFetchTextMatchStyle == null ? null : autoFetchTextMatchStyle.getValue(), false);
    }

    /**
     * With {@link com.smartgwt.client.widgets.tree.TreeGrid#getLoadDataOnDemand loadDataOnDemand}:true, TreeGrids fetch data
     * by selecting the child nodes of each parent, which should be exact match, so we default to
     * <code>autoFetchTextMatchStyle:"exact"</code>. See {@link
     * com.smartgwt.client.widgets.grid.ListGrid#getAutoFetchTextMatchStyle autoFetchTextMatchStyle} for details.
     *
     * @return TextMatchStyle
     */
    public TextMatchStyle getAutoFetchTextMatchStyle()  {
        return EnumUtil.getEnum(TextMatchStyle.values(), getAttribute("autoFetchTextMatchStyle"));
    }
    

    /**
     * For dataBound treeGrids this specifies the {@link com.smartgwt.client.widgets.tree.ResultTree#getAutoPreserveOpenState
     * autoPreserveOpenState}, governing whether the open state of the tree should be preserved when new data arrives due to
     * cache invalidation.
     *
     * @param autoPreserveOpenState  Default value is null
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setAutoPreserveOpenState(PreserveOpenState autoPreserveOpenState)  throws IllegalStateException {
        setAttribute("autoPreserveOpenState", autoPreserveOpenState == null ? null : autoPreserveOpenState.getValue(), false);
    }

    /**
     * For dataBound treeGrids this specifies the {@link com.smartgwt.client.widgets.tree.ResultTree#getAutoPreserveOpenState
     * autoPreserveOpenState}, governing whether the open state of the tree should be preserved when new data arrives due to
     * cache invalidation.
     *
     * @return PreserveOpenState
     */
    public PreserveOpenState getAutoPreserveOpenState()  {
        return EnumUtil.getEnum(PreserveOpenState.values(), getAttribute("autoPreserveOpenState"));
    }
    

    /**
     * Indicates whether records can be dropped into this listGrid.
     *
     * @param canAcceptDroppedRecords  Default value is false
     * @see com.smartgwt.client.widgets.tree.TreeNode#setCanDrag
     * @see com.smartgwt.client.widgets.tree.TreeNode#setCanAcceptDrop
     * @see com.smartgwt.client.docs.Dragdrop Dragdrop overview and related methods
     * @see <a href="http://www.smartclient.com/smartgwtee/showcase/#tree_reparent_sql" target="examples">Tree Reparent Example</a>
     */
    public void setCanAcceptDroppedRecords(Boolean canAcceptDroppedRecords) {
        setAttribute("canAcceptDroppedRecords", canAcceptDroppedRecords, true);
    }

    /**
     * Indicates whether records can be dropped into this listGrid.
     *
     * @return Boolean
     * @see com.smartgwt.client.widgets.tree.TreeNode#getCanDrag
     * @see com.smartgwt.client.widgets.tree.TreeNode#getCanAcceptDrop
     * @see com.smartgwt.client.docs.Dragdrop Dragdrop overview and related methods
     * @see <a href="http://www.smartclient.com/smartgwtee/showcase/#tree_reparent_sql" target="examples">Tree Reparent Example</a>
     */
    public Boolean getCanAcceptDroppedRecords()  {
        Boolean result = getAttributeAsBoolean("canAcceptDroppedRecords");
        return result == null ? false : result;
    }
    

    /**
     * Indicates whether records can be dragged from this listGrid and dropped elsewhere. <p> <strong>NOTE:</strong> If
     * <code>canDragRecordsOut</code> is initially enabled or might be dynamically enabled after the grid is created, it may be
     * desirable to disable {@link com.smartgwt.client.widgets.Canvas#getUseTouchScrolling touch scrolling} so that
     * touch-dragging a record starts a drag operation rather than a scroll. If {@link
     * com.smartgwt.client.widgets.Canvas#getDisableTouchScrollingForDrag disableTouchScrollingForDrag} is set to
     * <code>true</code>, then touch scrolling will be disabled automatically. However, for {@link
     * com.smartgwt.client.docs.Accessibility accessibility} reasons, it is recommended to leave touch scrolling enabled and
     * provide an alternative set of controls that can be used to perform drag and drop of records out of the grid.
     *
     * @param canDragRecordsOut  Default value is false
     * @see com.smartgwt.client.widgets.tree.TreeNode#setCanDrag
     * @see com.smartgwt.client.widgets.tree.TreeNode#setCanAcceptDrop
     * @see com.smartgwt.client.docs.Dragdrop Dragdrop overview and related methods
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#tree_interaction_drop_events" target="examples">Drop Events Example</a>
     */
    public void setCanDragRecordsOut(Boolean canDragRecordsOut) {
        setAttribute("canDragRecordsOut", canDragRecordsOut, true);
    }

    /**
     * Indicates whether records can be dragged from this listGrid and dropped elsewhere. <p> <strong>NOTE:</strong> If
     * <code>canDragRecordsOut</code> is initially enabled or might be dynamically enabled after the grid is created, it may be
     * desirable to disable {@link com.smartgwt.client.widgets.Canvas#getUseTouchScrolling touch scrolling} so that
     * touch-dragging a record starts a drag operation rather than a scroll. If {@link
     * com.smartgwt.client.widgets.Canvas#getDisableTouchScrollingForDrag disableTouchScrollingForDrag} is set to
     * <code>true</code>, then touch scrolling will be disabled automatically. However, for {@link
     * com.smartgwt.client.docs.Accessibility accessibility} reasons, it is recommended to leave touch scrolling enabled and
     * provide an alternative set of controls that can be used to perform drag and drop of records out of the grid.
     *
     * @return Boolean
     * @see com.smartgwt.client.widgets.tree.TreeNode#getCanDrag
     * @see com.smartgwt.client.widgets.tree.TreeNode#getCanAcceptDrop
     * @see com.smartgwt.client.docs.Dragdrop Dragdrop overview and related methods
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#tree_interaction_drop_events" target="examples">Drop Events Example</a>
     */
    public Boolean getCanDragRecordsOut()  {
        Boolean result = getAttributeAsBoolean("canDragRecordsOut");
        return result == null ? false : result;
    }
    

    /**
     * Whether drops are allowed on leaf nodes. <P> Dropping is ordinarily not allowed on leaf nodes unless {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getCanReorderRecords canReorderRecords} is set.   <P> The default action for a
     * drop on a leaf node is to place the node in that leaf's parent folder.  This can be customized by overriding {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#folderDrop TreeGrid.folderDrop}. <P> Note that enabling
     * <code>canDropOnLeaves</code> is usually only appropriate where you intend to add a custom {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#folderDrop TreeGrid.folderDrop} implementation that <b>does not</b> add a
     * child node under the leaf.  If you want to add a child nodes to a leaf, instead of enabling canDropOnLeaves, use empty
     * folders instead - see {@link com.smartgwt.client.widgets.tree.Tree#isFolder Tree.isFolder} for how to control whether a
     * node is considered a folder.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param canDropOnLeaves  Default value is false
     */
    public void setCanDropOnLeaves(Boolean canDropOnLeaves) {
        setAttribute("canDropOnLeaves", canDropOnLeaves, true);
    }

    /**
     * Whether drops are allowed on leaf nodes. <P> Dropping is ordinarily not allowed on leaf nodes unless {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getCanReorderRecords canReorderRecords} is set.   <P> The default action for a
     * drop on a leaf node is to place the node in that leaf's parent folder.  This can be customized by overriding {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#folderDrop TreeGrid.folderDrop}. <P> Note that enabling
     * <code>canDropOnLeaves</code> is usually only appropriate where you intend to add a custom {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#folderDrop TreeGrid.folderDrop} implementation that <b>does not</b> add a
     * child node under the leaf.  If you want to add a child nodes to a leaf, instead of enabling canDropOnLeaves, use empty
     * folders instead - see {@link com.smartgwt.client.widgets.tree.Tree#isFolder Tree.isFolder} for how to control whether a
     * node is considered a folder.
     *
     * @return Boolean
     */
    public Boolean getCanDropOnLeaves()  {
        Boolean result = getAttributeAsBoolean("canDropOnLeaves");
        return result == null ? false : result;
    }
    

    /**
     * Indicates whether records can be reordered by dragging within this <code>ListGrid</code>. <p> <strong>NOTE:</strong> If
     * <code>canReorderRecords</code> is initially enabled or might be {@link
     * com.smartgwt.client.widgets.grid.ListGrid#setCanReorderRecords dynamically enabled} after the grid is created, it may be
     * desirable to disable {@link com.smartgwt.client.widgets.Canvas#getUseTouchScrolling touch scrolling} so that
     * touch-dragging a record starts a reorder operation rather than a scroll. If {@link
     * com.smartgwt.client.widgets.Canvas#getDisableTouchScrollingForDrag disableTouchScrollingForDrag} is set to
     * <code>true</code>, then touch scrolling will be disabled automatically. However, for {@link
     * com.smartgwt.client.docs.Accessibility accessibility} reasons, it is recommended to leave touch scrolling enabled and
     * provide an alternative set of controls that can be used to perform drag-reordering of records.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param canReorderRecords  Default value is false
     * @see com.smartgwt.client.widgets.tree.TreeNode#setCanDrag
     * @see com.smartgwt.client.widgets.tree.TreeNode#setCanAcceptDrop
     * @see com.smartgwt.client.docs.Dragdrop Dragdrop overview and related methods
     * @see <a href="http://www.smartclient.com/smartgwtee/showcase/#tree_reparent_sql" target="examples">Tree Reparent Example</a>
     */
    public void setCanReorderRecords(Boolean canReorderRecords) {
        setAttribute("canReorderRecords", canReorderRecords, true);
    }

    /**
     * Indicates whether records can be reordered by dragging within this <code>ListGrid</code>. <p> <strong>NOTE:</strong> If
     * <code>canReorderRecords</code> is initially enabled or might be {@link
     * com.smartgwt.client.widgets.grid.ListGrid#setCanReorderRecords dynamically enabled} after the grid is created, it may be
     * desirable to disable {@link com.smartgwt.client.widgets.Canvas#getUseTouchScrolling touch scrolling} so that
     * touch-dragging a record starts a reorder operation rather than a scroll. If {@link
     * com.smartgwt.client.widgets.Canvas#getDisableTouchScrollingForDrag disableTouchScrollingForDrag} is set to
     * <code>true</code>, then touch scrolling will be disabled automatically. However, for {@link
     * com.smartgwt.client.docs.Accessibility accessibility} reasons, it is recommended to leave touch scrolling enabled and
     * provide an alternative set of controls that can be used to perform drag-reordering of records.
     *
     * @return Boolean
     * @see com.smartgwt.client.widgets.tree.TreeNode#getCanDrag
     * @see com.smartgwt.client.widgets.tree.TreeNode#getCanAcceptDrop
     * @see com.smartgwt.client.docs.Dragdrop Dragdrop overview and related methods
     * @see <a href="http://www.smartclient.com/smartgwtee/showcase/#tree_reparent_sql" target="examples">Tree Reparent Example</a>
     */
    public Boolean getCanReorderRecords()  {
        Boolean result = getAttributeAsBoolean("canReorderRecords");
        return result == null ? false : result;
    }
    

    /**
     * If set this property allows the user to reparent nodes by dragging them from their current folder to a new folder.<br>
     * <b>Backcompat:</b> For backwards compatibility with versions prior to Smart GWT 1.5, if this property is unset, but
     * <code>this.canAcceptDroppedRecords</code> is true, we allow nodes to be dragged to different folders.
     *
     * @param canReparentNodes  Default value is null
     * @see com.smartgwt.client.widgets.tree.TreeNode#setCanDrag
     * @see com.smartgwt.client.widgets.tree.TreeNode#setCanAcceptDrop
     * @see com.smartgwt.client.docs.Dragdrop Dragdrop overview and related methods
     */
    public void setCanReparentNodes(Boolean canReparentNodes) {
        setAttribute("canReparentNodes", canReparentNodes, true);
    }

    /**
     * If set this property allows the user to reparent nodes by dragging them from their current folder to a new folder.<br>
     * <b>Backcompat:</b> For backwards compatibility with versions prior to Smart GWT 1.5, if this property is unset, but
     * <code>this.canAcceptDroppedRecords</code> is true, we allow nodes to be dragged to different folders.
     *
     * @return Boolean
     * @see com.smartgwt.client.widgets.tree.TreeNode#getCanDrag
     * @see com.smartgwt.client.widgets.tree.TreeNode#getCanAcceptDrop
     * @see com.smartgwt.client.docs.Dragdrop Dragdrop overview and related methods
     */
    public Boolean getCanReparentNodes()  {
        return getAttributeAsBoolean("canReparentNodes");
    }
    

    /**
     * This property is not supported on TreeGrid, and only applies to the {@link com.smartgwt.client.widgets.grid.ListGrid}
     * superclass.
     *
     * @param canSelectAll  Default value is null
     * @see com.smartgwt.client.docs.Selection Selection overview and related methods
     */
    public void setCanSelectAll(Boolean canSelectAll) {
        setAttribute("canSelectAll", canSelectAll, true);
    }

    /**
     * This property is not supported on TreeGrid, and only applies to the {@link com.smartgwt.client.widgets.grid.ListGrid}
     * superclass.
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.Selection Selection overview and related methods
     */
    public Boolean getCanSelectAll()  {
        return getAttributeAsBoolean("canSelectAll");
    }
    

    /**
     * Message displayed when user attempts to drop a node into a child of itself.
     *
     * @param cantDragIntoChildMessage  Default value is "You can't drag an item into one of it's children."
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.widgets.tree.TreeGrid#setCanDragRecordsOut
     * @see com.smartgwt.client.widgets.tree.TreeGrid#setCanAcceptDroppedRecords
     * @see com.smartgwt.client.widgets.tree.TreeGrid#setCanReorderRecords
     */
    public void setCantDragIntoChildMessage(String cantDragIntoChildMessage)  throws IllegalStateException {
        setAttribute("cantDragIntoChildMessage", cantDragIntoChildMessage, false);
    }

    /**
     * Message displayed when user attempts to drop a node into a child of itself.
     *
     * @return String
     * @see com.smartgwt.client.widgets.tree.TreeGrid#getCanDragRecordsOut
     * @see com.smartgwt.client.widgets.tree.TreeGrid#getCanAcceptDroppedRecords
     * @see com.smartgwt.client.widgets.tree.TreeGrid#getCanReorderRecords
     */
    public String getCantDragIntoChildMessage()  {
        return getAttributeAsString("cantDragIntoChildMessage");
    }
    

    /**
     * Message displayed when user attempts to drop a dragged node onto itself.
     *
     * @param cantDragIntoSelfMessage  Default value is "You can't drag an item into itself."
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.widgets.tree.TreeGrid#setCanDragRecordsOut
     * @see com.smartgwt.client.widgets.tree.TreeGrid#setCanAcceptDroppedRecords
     * @see com.smartgwt.client.widgets.tree.TreeGrid#setCanReorderRecords
     */
    public void setCantDragIntoSelfMessage(String cantDragIntoSelfMessage)  throws IllegalStateException {
        setAttribute("cantDragIntoSelfMessage", cantDragIntoSelfMessage, false);
    }

    /**
     * Message displayed when user attempts to drop a dragged node onto itself.
     *
     * @return String
     * @see com.smartgwt.client.widgets.tree.TreeGrid#getCanDragRecordsOut
     * @see com.smartgwt.client.widgets.tree.TreeGrid#getCanAcceptDroppedRecords
     * @see com.smartgwt.client.widgets.tree.TreeGrid#getCanReorderRecords
     */
    public String getCantDragIntoSelfMessage()  {
        return getAttributeAsString("cantDragIntoSelfMessage");
    }
    

    /**
     * Should children be selected when parent is selected? And should parent be selected when any child is selected?
     *
     * @param cascadeSelection  Default value is false
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setCascadeSelection(Boolean cascadeSelection)  throws IllegalStateException {
        setAttribute("cascadeSelection", cascadeSelection, false);
    }

    /**
     * Should children be selected when parent is selected? And should parent be selected when any child is selected?
     *
     * @return Boolean
     */
    public Boolean getCascadeSelection()  {
        Boolean result = getAttributeAsBoolean("cascadeSelection");
        return result == null ? false : result;
    }
    

    /**
     * This suffix will be appended to the {@link com.smartgwt.client.widgets.tree.TreeGrid#getFolderIcon folderIcon} for
     * closed folders. If {@link com.smartgwt.client.widgets.tree.TreeGrid#getShowOpenIcons showOpenIcons} is set to
     * <code>false</code> this suffix will also be appended to open folders' icons.
     *
     * @param closedIconSuffix  Default value is "closed"
     */
    public void setClosedIconSuffix(String closedIconSuffix) {
        setAttribute("closedIconSuffix", closedIconSuffix, true);
    }

    /**
     * This suffix will be appended to the {@link com.smartgwt.client.widgets.tree.TreeGrid#getFolderIcon folderIcon} for
     * closed folders. If {@link com.smartgwt.client.widgets.tree.TreeGrid#getShowOpenIcons showOpenIcons} is set to
     * <code>false</code> this suffix will also be appended to open folders' icons.
     *
     * @return String
     */
    public String getClosedIconSuffix()  {
        return getAttributeAsString("closedIconSuffix");
    }
    

    /**
     * The base filename for connector icons shown when {@link com.smartgwt.client.widgets.tree.TreeGrid#getShowConnectors
     * showConnectors} is true. Connector icons are rendered into the title field of each row and show the dotted hierarchy
     * lines between siblings of the same parent node. For each node, a connector icon may be shown:<ul> <li>As an opener icon
     * for folder nodes, next to the folder icon</li> <li>In place of an opener icon for leaf nodes, next to the leaf icon</li>
     * <li>As a standalone vertical continuation line in the indent to the left of the node, to show     a connection between
     * some ancestor node's siblings (only relevant if     {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getShowFullConnectors showFullConnectors} is true).</li> </ul> Note that
     * {@link com.smartgwt.client.widgets.tree.TreeGrid#getShowFullConnectors showFullConnectors} governs whether connector
     * lines will be displayed for all indent levels, or just for the innermost level of the tree. <P> The filenames for these
     * icons are assembled from this base filename and the state of the node.  Assuming the connectorImage is set to
     * <code>{baseName}.{extension}</code>, the full set of images to be displayed will be: <P>
     * <code>{baseName}_ancestor[_rtl].{extension}</code> if {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getShowFullConnectors showFullConnectors}  is true, this is the URL for the
     * vertical continuation image to be displayed at the  appropriate indent levels for ancestor nodes with subsequent
     * children. <P> For nodes with no children: <ul> <li><code>{baseName}_single[_rtl].{extension}</code>: Shown when there is
     * no connector line  attached to the parent or previous sibling, and no connector line to the next sibling. For  {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getShowFullConnectors showFullConnectors:true} trees, there will always be a 
     * connector leading to the parent or previous sibling if its present in the tree so this  icon can only be displayed for
     * the first row.</li> <li><code>{baseName}_start[_rtl].{extension}</code>:  Shown when the there is no connector  line
     * attached to the parent or previous sibling, but there is a connector to the next  sibling. As with <code>_single</code>
     * this will only ever be used for the first row if  {@link com.smartgwt.client.widgets.tree.TreeGrid#getShowFullConnectors
     * showFullConnectors} is true</li> <li><code>{baseName}_end[_rtl].{extension}</code>:  Shown if we are not showing a
     * connector   line attached to the next sibling of this node (but are showing a connection to the previous  sibling or
     * parent).</li> <li><code>{baseName}_middle[_rtl].{extension}</code>:  Shown where the we have a connector  line leading
     * to both the previous sibling (or parent) and the next sibling. </ul> For folders with children. Note that if {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getShowFullConnectors showFullConnectors} is false, open folders will never
     * show a connector to subsequent siblings: <ul> <li><code>{baseName}_opened_single[_rtl].{extension}</code> opened folder
     * node with   children when no connector line is shown attaching to either the folder's previous sibling  or parent, or to
     * any subsequent siblings.</li> <li><code>{baseName}_opened_start[_rtl].{extension}</code>:  opened folder with children 
     * when the there is no connector line attached to the parent or previous sibling, but there   is a connector to the next
     * sibling.</li> <li><code>{baseName}_opened_end[_rtl].{extension}</code>:  opened folder with children   if we are not
     * showing a connector line attached to the next sibling of this node (but are  showing a connection to the previous
     * sibling or parent).</li> <li><code>{baseName}_opened_middle[_rtl].{extension}</code>: opened folder with children  
     * where the we have a connector line leading to both the previous sibling (or parent) and the  next sibling. </ul> <ul>
     * <li><code>{baseName}_closed_single[_rtl].{extension}</code> closed folder node with   children when no connector line is
     * shown attaching to either the folder's previous sibling  or parent, or to any subsequent siblings.</li>
     * <li><code>{baseName}_closed_start[_rtl].{extension}</code>:  closed folder with children  when the there is no connector
     * line attached to the parent or previous sibling, but there   is a connector to the next sibling.</li>
     * <li><code>{baseName}_closed_end[_rtl].{extension}</code>:  closed folder with children   if we are not showing a
     * connector line attached to the next sibling of this node (but are  showing a connection to the previous sibling or
     * parent).</li> <li><code>{baseName}_closed_middle[_rtl].{extension}</code>: closed folder with children   where the we
     * have a connector line leading to both the previous sibling (or parent) and the  next sibling. </ul> (Note '[_rtl]' means
     * that "_rtl" will be attached if isRTL() is true for this widget).
     *
     * @param connectorImage  See {@link com.smartgwt.client.docs.SCImgURL SCImgURL} . Default value is "[SKIN]connector.gif"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setConnectorImage(String connectorImage)  throws IllegalStateException {
        setAttribute("connectorImage", connectorImage, false);
    }

    /**
     * The base filename for connector icons shown when {@link com.smartgwt.client.widgets.tree.TreeGrid#getShowConnectors
     * showConnectors} is true. Connector icons are rendered into the title field of each row and show the dotted hierarchy
     * lines between siblings of the same parent node. For each node, a connector icon may be shown:<ul> <li>As an opener icon
     * for folder nodes, next to the folder icon</li> <li>In place of an opener icon for leaf nodes, next to the leaf icon</li>
     * <li>As a standalone vertical continuation line in the indent to the left of the node, to show     a connection between
     * some ancestor node's siblings (only relevant if     {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getShowFullConnectors showFullConnectors} is true).</li> </ul> Note that
     * {@link com.smartgwt.client.widgets.tree.TreeGrid#getShowFullConnectors showFullConnectors} governs whether connector
     * lines will be displayed for all indent levels, or just for the innermost level of the tree. <P> The filenames for these
     * icons are assembled from this base filename and the state of the node.  Assuming the connectorImage is set to
     * <code>{baseName}.{extension}</code>, the full set of images to be displayed will be: <P>
     * <code>{baseName}_ancestor[_rtl].{extension}</code> if {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getShowFullConnectors showFullConnectors}  is true, this is the URL for the
     * vertical continuation image to be displayed at the  appropriate indent levels for ancestor nodes with subsequent
     * children. <P> For nodes with no children: <ul> <li><code>{baseName}_single[_rtl].{extension}</code>: Shown when there is
     * no connector line  attached to the parent or previous sibling, and no connector line to the next sibling. For  {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getShowFullConnectors showFullConnectors:true} trees, there will always be a 
     * connector leading to the parent or previous sibling if its present in the tree so this  icon can only be displayed for
     * the first row.</li> <li><code>{baseName}_start[_rtl].{extension}</code>:  Shown when the there is no connector  line
     * attached to the parent or previous sibling, but there is a connector to the next  sibling. As with <code>_single</code>
     * this will only ever be used for the first row if  {@link com.smartgwt.client.widgets.tree.TreeGrid#getShowFullConnectors
     * showFullConnectors} is true</li> <li><code>{baseName}_end[_rtl].{extension}</code>:  Shown if we are not showing a
     * connector   line attached to the next sibling of this node (but are showing a connection to the previous  sibling or
     * parent).</li> <li><code>{baseName}_middle[_rtl].{extension}</code>:  Shown where the we have a connector  line leading
     * to both the previous sibling (or parent) and the next sibling. </ul> For folders with children. Note that if {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getShowFullConnectors showFullConnectors} is false, open folders will never
     * show a connector to subsequent siblings: <ul> <li><code>{baseName}_opened_single[_rtl].{extension}</code> opened folder
     * node with   children when no connector line is shown attaching to either the folder's previous sibling  or parent, or to
     * any subsequent siblings.</li> <li><code>{baseName}_opened_start[_rtl].{extension}</code>:  opened folder with children 
     * when the there is no connector line attached to the parent or previous sibling, but there   is a connector to the next
     * sibling.</li> <li><code>{baseName}_opened_end[_rtl].{extension}</code>:  opened folder with children   if we are not
     * showing a connector line attached to the next sibling of this node (but are  showing a connection to the previous
     * sibling or parent).</li> <li><code>{baseName}_opened_middle[_rtl].{extension}</code>: opened folder with children  
     * where the we have a connector line leading to both the previous sibling (or parent) and the  next sibling. </ul> <ul>
     * <li><code>{baseName}_closed_single[_rtl].{extension}</code> closed folder node with   children when no connector line is
     * shown attaching to either the folder's previous sibling  or parent, or to any subsequent siblings.</li>
     * <li><code>{baseName}_closed_start[_rtl].{extension}</code>:  closed folder with children  when the there is no connector
     * line attached to the parent or previous sibling, but there   is a connector to the next sibling.</li>
     * <li><code>{baseName}_closed_end[_rtl].{extension}</code>:  closed folder with children   if we are not showing a
     * connector line attached to the next sibling of this node (but are  showing a connection to the previous sibling or
     * parent).</li> <li><code>{baseName}_closed_middle[_rtl].{extension}</code>: closed folder with children   where the we
     * have a connector line leading to both the previous sibling (or parent) and the  next sibling. </ul> (Note '[_rtl]' means
     * that "_rtl" will be attached if isRTL() is true for this widget).
     *
     * @return  See {@link com.smartgwt.client.docs.SCImgURL SCImgURL} 
     */
    public String getConnectorImage()  {
        return getAttributeAsString("connectorImage");
    }
    

    /**
     * If no fields are specified, create a single field with  {@link
     * com.smartgwt.client.widgets.tree.TreeGridField#getTreeField treeField} set to <code>true</code> to show the tree. <P>
     * This automatically generated field will display values derived by calling {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getNodeTitle TreeGrid.getNodeTitle}, and have the column title set to the
     * specified {@link com.smartgwt.client.widgets.tree.TreeGrid#getTreeFieldTitle treeFieldTitle}. <P> Has no effect if
     * fields are explicitly specified. <P> This is a convenience setting to allow a TreeGrid to be created without specifying
     * a field list.  If fields are specified, refer to the documentation on property {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getAutoAssignTreeField autoAssignTreeField} for a way to automatically have
     * one of the fields be use as the tree field if no fields have {@link
     * com.smartgwt.client.widgets.tree.TreeGridField#getTreeField treeField} set. <P> For databound treeGrids, if there is no
     * explicit fields array specified, developers who wish to pick up all fields from the DataSource definition rather than
     * displaying this single automatically generated tree field may  either set this property to false, or set {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getUseAllDataSourceFields useAllDataSourceFields} to <code>true</code>.
     *
     * @param createDefaultTreeField  Default value is true
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setCreateDefaultTreeField(Boolean createDefaultTreeField)  throws IllegalStateException {
        setAttribute("createDefaultTreeField", createDefaultTreeField, false);
    }

    /**
     * If no fields are specified, create a single field with  {@link
     * com.smartgwt.client.widgets.tree.TreeGridField#getTreeField treeField} set to <code>true</code> to show the tree. <P>
     * This automatically generated field will display values derived by calling {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getNodeTitle TreeGrid.getNodeTitle}, and have the column title set to the
     * specified {@link com.smartgwt.client.widgets.tree.TreeGrid#getTreeFieldTitle treeFieldTitle}. <P> Has no effect if
     * fields are explicitly specified. <P> This is a convenience setting to allow a TreeGrid to be created without specifying
     * a field list.  If fields are specified, refer to the documentation on property {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getAutoAssignTreeField autoAssignTreeField} for a way to automatically have
     * one of the fields be use as the tree field if no fields have {@link
     * com.smartgwt.client.widgets.tree.TreeGridField#getTreeField treeField} set. <P> For databound treeGrids, if there is no
     * explicit fields array specified, developers who wish to pick up all fields from the DataSource definition rather than
     * displaying this single automatically generated tree field may  either set this property to false, or set {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getUseAllDataSourceFields useAllDataSourceFields} to <code>true</code>.
     *
     * @return Boolean
     */
    public Boolean getCreateDefaultTreeField()  {
        Boolean result = getAttributeAsBoolean("createDefaultTreeField");
        return result == null ? true : result;
    }
    

    /**
     * This property allows the developer to rename the  {@link com.smartgwt.client.widgets.tree.TreeNode#getShowDropIcon
     * default node.showDropIcon} property.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param customIconDropProperty  Default value is "showDropIcon"
     * @see com.smartgwt.client.widgets.tree.TreeGrid#setCustomIconProperty
     * @see com.smartgwt.client.widgets.tree.TreeGrid#setShowCustomIconDrop
     */
    public void setCustomIconDropProperty(String customIconDropProperty) {
        setAttribute("customIconDropProperty", customIconDropProperty, true);
    }

    /**
     * This property allows the developer to rename the  {@link com.smartgwt.client.widgets.tree.TreeNode#getShowDropIcon
     * default node.showDropIcon} property.
     *
     * @return String
     * @see com.smartgwt.client.widgets.tree.TreeGrid#getCustomIconProperty
     * @see com.smartgwt.client.widgets.tree.TreeGrid#getShowCustomIconDrop
     */
    public String getCustomIconDropProperty()  {
        return getAttributeAsString("customIconDropProperty");
    }
    

    /**
     * This property allows the developer to rename the  {@link com.smartgwt.client.widgets.tree.TreeNode#getShowOpenIcon
     * default node.showOpenIcon} property.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param customIconOpenProperty  Default value is "showOpenIcon"
     * @see com.smartgwt.client.widgets.tree.TreeGrid#setCustomIconProperty
     * @see com.smartgwt.client.widgets.tree.TreeGrid#setShowCustomIconOpen
     */
    public void setCustomIconOpenProperty(String customIconOpenProperty) {
        setAttribute("customIconOpenProperty", customIconOpenProperty, true);
    }

    /**
     * This property allows the developer to rename the  {@link com.smartgwt.client.widgets.tree.TreeNode#getShowOpenIcon
     * default node.showOpenIcon} property.
     *
     * @return String
     * @see com.smartgwt.client.widgets.tree.TreeGrid#getCustomIconProperty
     * @see com.smartgwt.client.widgets.tree.TreeGrid#getShowCustomIconOpen
     */
    public String getCustomIconOpenProperty()  {
        return getAttributeAsString("customIconOpenProperty");
    }
    

    /**
     * This property allows the developer to rename the  {@link com.smartgwt.client.widgets.tree.TreeNode#getIcon default
     * node.icon} property.
     *
     * @param customIconProperty  Default value is "icon"
     */
    public void setCustomIconProperty(String customIconProperty) {
        setAttribute("customIconProperty", customIconProperty, true);
    }

    /**
     * This property allows the developer to rename the  {@link com.smartgwt.client.widgets.tree.TreeNode#getIcon default
     * node.icon} property.
     *
     * @return String
     */
    public String getCustomIconProperty()  {
        return getAttributeAsString("customIconProperty");
    }
    
    

    /**
     * Mode of fetching records from server. <P> fetchMode:"local" implies that local filtering will always be performed. See
     * {@link com.smartgwt.client.widgets.tree.TreeGrid#getKeepParentsOnFilter keepParentsOnFilter} for additional filtering
     * details. <P> fetchMode:"basic" or "paged" implies that if search criteria change, the entire tree will be discarded and
     * re-fetched from the server.  When retrieving the replacement tree data, the default behavior will be to preserve the
     * {@link com.smartgwt.client.widgets.tree.TreeGrid#getOpenState openState} for any nodes that the server returns which
     * were previously opened by the user.  Note that this implies that if {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getLoadDataOnDemand loadDataOnDemand} is enabled and the server returns only
     * root-level nodes, open state will be preserved only for root-level nodes, and children of open root-level nodes will be
     * immediately fetched from the server if they are not included in the server's initial response. <P> fetchMode:"paged"
     * enables paging for nodes that have very large numbers of children. Whenever the children of a folder are loaded, the
     * <code>resultTree</code> will set {@link com.smartgwt.client.data.DSRequest#getStartRow startRow} and {@link
     * com.smartgwt.client.data.DSRequest#getEndRow endRow} when requesting children from the DataSource, and will manage
     * loading of further children on demand, similar to how a {@link com.smartgwt.client.data.ResultSet} manages paging for
     * lists.  For a deeper discussion see the <b>Paging large sets of children</b> section of the {@link
     * com.smartgwt.client.docs.TreeDataBinding} overview.
     *
     * @param dataFetchMode  Default value is "basic"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.docs.TreeDataBinding TreeDataBinding overview and related methods
     * @see <a href="http://www.smartclient.com/smartgwtee/showcase/#tree-paging-for-children" target="examples">Paging for Children Example</a>
     */
    public void setDataFetchMode(FetchMode dataFetchMode)  throws IllegalStateException {
        setAttribute("dataFetchMode", dataFetchMode == null ? null : dataFetchMode.getValue(), false);
    }

    /**
     * Mode of fetching records from server. <P> fetchMode:"local" implies that local filtering will always be performed. See
     * {@link com.smartgwt.client.widgets.tree.TreeGrid#getKeepParentsOnFilter keepParentsOnFilter} for additional filtering
     * details. <P> fetchMode:"basic" or "paged" implies that if search criteria change, the entire tree will be discarded and
     * re-fetched from the server.  When retrieving the replacement tree data, the default behavior will be to preserve the
     * {@link com.smartgwt.client.widgets.tree.TreeGrid#getOpenState openState} for any nodes that the server returns which
     * were previously opened by the user.  Note that this implies that if {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getLoadDataOnDemand loadDataOnDemand} is enabled and the server returns only
     * root-level nodes, open state will be preserved only for root-level nodes, and children of open root-level nodes will be
     * immediately fetched from the server if they are not included in the server's initial response. <P> fetchMode:"paged"
     * enables paging for nodes that have very large numbers of children. Whenever the children of a folder are loaded, the
     * <code>resultTree</code> will set {@link com.smartgwt.client.data.DSRequest#getStartRow startRow} and {@link
     * com.smartgwt.client.data.DSRequest#getEndRow endRow} when requesting children from the DataSource, and will manage
     * loading of further children on demand, similar to how a {@link com.smartgwt.client.data.ResultSet} manages paging for
     * lists.  For a deeper discussion see the <b>Paging large sets of children</b> section of the {@link
     * com.smartgwt.client.docs.TreeDataBinding} overview.
     *
     * @return FetchMode
     * @see com.smartgwt.client.docs.TreeDataBinding TreeDataBinding overview and related methods
     * @see <a href="http://www.smartclient.com/smartgwtee/showcase/#tree-paging-for-children" target="examples">Paging for Children Example</a>
     */
    public FetchMode getDataFetchMode()  {
        return EnumUtil.getEnum(FetchMode.values(), getAttribute("dataFetchMode"));
    }
    

    /**
     * For a <code>TreeGrid</code> that uses a DataSource, these properties will be passed to the automatically-created
     * ResultTree.  This can be used for various customizations such as modifying the automatically-chosen {@link
     * com.smartgwt.client.widgets.tree.Tree#getParentIdField parentIdField}.
     *
     * @return Tree
     * @see com.smartgwt.client.docs.Databinding Databinding overview and related methods
     */
    public Tree getDataProperties()  {
        return Tree.getOrCreateRef(getAttributeAsJavaScriptObject("dataProperties"));
    }
    
    

    /**
     * Specifies the type of nodes displayed in the treeGrid.
     *
     * @param displayNodeType  Default value is Tree.FOLDERS_AND_LEAVES
     * @see com.smartgwt.client.types.DisplayNodeType
     */
    public void setDisplayNodeType(DisplayNodeType displayNodeType) {
        setAttribute("displayNodeType", displayNodeType == null ? null : displayNodeType.getValue(), true);
    }

    /**
     * Specifies the type of nodes displayed in the treeGrid.
     *
     * @return DisplayNodeType
     * @see com.smartgwt.client.types.DisplayNodeType
     */
    public DisplayNodeType getDisplayNodeType()  {
        return EnumUtil.getEnum(DisplayNodeType.values(), getAttribute("displayNodeType"));
    }
    
    

    /**
     * If {@link com.smartgwt.client.widgets.tree.TreeGrid#getShowDropIcons showDropIcons} is true, this suffix will be
     * appended to the {@link com.smartgwt.client.widgets.tree.TreeGrid#getFolderIcon folderIcon} when the user drop-hovers
     * over some folder.
     *
     * @param dropIconSuffix  Default value is "drop"
     */
    public void setDropIconSuffix(String dropIconSuffix) {
        setAttribute("dropIconSuffix", dropIconSuffix, true);
    }

    /**
     * If {@link com.smartgwt.client.widgets.tree.TreeGrid#getShowDropIcons showDropIcons} is true, this suffix will be
     * appended to the {@link com.smartgwt.client.widgets.tree.TreeGrid#getFolderIcon folderIcon} when the user drop-hovers
     * over some folder.
     *
     * @return String
     */
    public String getDropIconSuffix()  {
        return getAttributeAsString("dropIconSuffix");
    }
    

    /**
     * The amount of gap (in pixels) between the extraIcon (see {@link com.smartgwt.client.widgets.tree.TreeGrid#getExtraIcon
     * TreeGrid.getExtraIcon}) or checkbox icon and the {@link com.smartgwt.client.widgets.tree.TreeGrid#getNodeIcon nodeIcon}/
     * {@link com.smartgwt.client.widgets.tree.TreeGrid#getFolderIcon folderIcon} or node text.
     *
     * @param extraIconGap  Default value is 2
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setExtraIconGap(int extraIconGap)  throws IllegalStateException {
        setAttribute("extraIconGap", extraIconGap, false);
    }

    /**
     * The amount of gap (in pixels) between the extraIcon (see {@link com.smartgwt.client.widgets.tree.TreeGrid#getExtraIcon
     * TreeGrid.getExtraIcon}) or checkbox icon and the {@link com.smartgwt.client.widgets.tree.TreeGrid#getNodeIcon nodeIcon}/
     * {@link com.smartgwt.client.widgets.tree.TreeGrid#getFolderIcon folderIcon} or node text.
     *
     * @return int
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public int getExtraIconGap()  {
        return getAttributeAsInt("extraIconGap");
    }
    

    /**
     * An array of field objects, specifying the order, layout, dynamic calculation, and sorting behavior of each field in the
     * treeGrid object. In TreeGrids, the fields array specifies columns. Each field in the fields array is TreeGridField
     * object. <p> If {@link com.smartgwt.client.widgets.tree.TreeGrid#getDataSource dataSource} is also set, this value acts
     * as a set of overrides as explained in {@link com.smartgwt.client.widgets.DataBoundComponent#getFields fields}.
     *
     * @param fields  Default value is null
     * @see com.smartgwt.client.widgets.tree.TreeGridField
     * @see com.smartgwt.client.docs.Databinding Databinding overview and related methods
     */
    public void setFields(TreeGridField... fields) {
        setAttribute("fields", fields, true);
    }
    
    
    
    

    /**
     * The URL of the base icon for all folder nodes in this treeGrid. Note that this URL will have {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getOpenIconSuffix openIconSuffix}, {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getClosedIconSuffix closedIconSuffix} or  {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getDropIconSuffix dropIconSuffix} appended to indicate state changes if
     * appropriate -  see documentation on  {@link com.smartgwt.client.widgets.tree.TreeGrid#getShowOpenIcons showOpenIcons}
     * and {@link com.smartgwt.client.widgets.tree.TreeGrid#getShowDropIcons showDropIcons}.
     *
     * @param folderIcon  See {@link com.smartgwt.client.docs.SCImgURL SCImgURL} . Default value is "[SKIN]folder.gif"
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#tree_appearance_node_titles" target="examples">Node Titles Example</a>
     */
    public void setFolderIcon(String folderIcon) {
        setAttribute("folderIcon", folderIcon, true);
    }

    /**
     * The URL of the base icon for all folder nodes in this treeGrid. Note that this URL will have {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getOpenIconSuffix openIconSuffix}, {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getClosedIconSuffix closedIconSuffix} or  {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getDropIconSuffix dropIconSuffix} appended to indicate state changes if
     * appropriate -  see documentation on  {@link com.smartgwt.client.widgets.tree.TreeGrid#getShowOpenIcons showOpenIcons}
     * and {@link com.smartgwt.client.widgets.tree.TreeGrid#getShowDropIcons showDropIcons}.
     *
     * @return  See {@link com.smartgwt.client.docs.SCImgURL SCImgURL} 
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#tree_appearance_node_titles" target="examples">Node Titles Example</a>
     */
    public String getFolderIcon()  {
        return getAttributeAsString("folderIcon");
    }
    
    

    /**
     * The standard size (same height and width, in pixels) of node icons in this          treeGrid.
     *
     * @param iconSize  Default value is 16
     */
    public void setIconSize(int iconSize) {
        setAttribute("iconSize", iconSize, true);
    }

    /**
     * The standard size (same height and width, in pixels) of node icons in this          treeGrid.
     *
     * @return int
     */
    public int getIconSize()  {
        return getAttributeAsInt("iconSize");
    }
    

    /**
     * For record components placed "within" the {@link com.smartgwt.client.widgets.tree.TreeGridField#getTreeField treeField}
     * column, should the component be indented to the position where a title would normally show? <P> For more general
     * placement of embedded components, see {@link com.smartgwt.client.widgets.grid.ListGrid#addEmbeddedComponent
     * addEmbeddedComponent}.
     *
     * @param indentRecordComponents  Default value is true
     */
    public void setIndentRecordComponents(Boolean indentRecordComponents) {
        setAttribute("indentRecordComponents", indentRecordComponents, true);
    }

    /**
     * For record components placed "within" the {@link com.smartgwt.client.widgets.tree.TreeGridField#getTreeField treeField}
     * column, should the component be indented to the position where a title would normally show? <P> For more general
     * placement of embedded components, see {@link com.smartgwt.client.widgets.grid.ListGrid#addEmbeddedComponent
     * addEmbeddedComponent}.
     *
     * @return Boolean
     */
    public Boolean getIndentRecordComponents()  {
        Boolean result = getAttributeAsBoolean("indentRecordComponents");
        return result == null ? true : result;
    }
    

    /**
     * The amount of indentation (in pixels) to add to a node's icon/title for each level down in this tree's hierarchy. <p>
     * This value is ignored when {@link com.smartgwt.client.widgets.tree.TreeGrid#getShowConnectors showConnectors} is
     * <code>true</code> because fixed-size images are used to render the connectors.
     *
     * @param indentSize  Default value is 20
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setIndentSize(int indentSize) {
        setAttribute("indentSize", indentSize, true);
    }

    /**
     * The amount of indentation (in pixels) to add to a node's icon/title for each level down in this tree's hierarchy. <p>
     * This value is ignored when {@link com.smartgwt.client.widgets.tree.TreeGrid#getShowConnectors showConnectors} is
     * <code>true</code> because fixed-size images are used to render the connectors.
     *
     * @return int
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public int getIndentSize()  {
        return getAttributeAsInt("indentSize");
    }
    
    

    /**
     * If set, tree-based filtering is performed such that parent nodes are kept as long as they have children that match the
     * filter criteria, even if the parents themselves do not match the filter criteria. If not set, filtering will exclude
     * parent nodes not matching the criteria and all nodes below it in the tree. <P> When <code>keepParentsOnFilter</code> is
     * enabled for paged ResultTrees, server-side filtering is required. <P> When enabled for non-paged trees, {@link
     * com.smartgwt.client.types.FetchMode fetchMode:"local"} is automatically enabled so that all filtering behavior shifts to
     * the client-side and full criteria are no longer sent to the server.  Instead, server fetches will always load all nodes,
     * or with {@link com.smartgwt.client.widgets.tree.TreeGrid#getLoadDataOnDemand loadDataOnDemand}:true, will always load
     * all nodes under a given parent. This means that the server does not need to implement special tree filtering logic. <P>
     * Optionally, {@link com.smartgwt.client.widgets.tree.ResultTree#getServerFilterFields serverFilterFields} can be set to a
     * list of field names that will be sent to the server whenever they are present in the criteria.
     *
     * @param keepParentsOnFilter  Default value is null
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.docs.TreeDataBinding TreeDataBinding overview and related methods
     */
    public void setKeepParentsOnFilter(Boolean keepParentsOnFilter)  throws IllegalStateException {
        setAttribute("keepParentsOnFilter", keepParentsOnFilter, false);
    }

    /**
     * If set, tree-based filtering is performed such that parent nodes are kept as long as they have children that match the
     * filter criteria, even if the parents themselves do not match the filter criteria. If not set, filtering will exclude
     * parent nodes not matching the criteria and all nodes below it in the tree. <P> When <code>keepParentsOnFilter</code> is
     * enabled for paged ResultTrees, server-side filtering is required. <P> When enabled for non-paged trees, {@link
     * com.smartgwt.client.types.FetchMode fetchMode:"local"} is automatically enabled so that all filtering behavior shifts to
     * the client-side and full criteria are no longer sent to the server.  Instead, server fetches will always load all nodes,
     * or with {@link com.smartgwt.client.widgets.tree.TreeGrid#getLoadDataOnDemand loadDataOnDemand}:true, will always load
     * all nodes under a given parent. This means that the server does not need to implement special tree filtering logic. <P>
     * Optionally, {@link com.smartgwt.client.widgets.tree.ResultTree#getServerFilterFields serverFilterFields} can be set to a
     * list of field names that will be sent to the server whenever they are present in the criteria.
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.TreeDataBinding TreeDataBinding overview and related methods
     */
    public Boolean getKeepParentsOnFilter()  {
        return getAttributeAsBoolean("keepParentsOnFilter");
    }
    

    /**
     * If {@link com.smartgwt.client.widgets.grid.ListGrid#getSelectionAppearance selectionAppearance}:"checkbox"  is set on
     * the treegrid, and a node can't be selected, should a gap be left where the checkbox icon would normally appear, in order
     * to make the node's icon and title line up with the content for other nodes in the same parent? <p> Has no effect if
     * {@link com.smartgwt.client.widgets.tree.TreeGrid#getShowDisabledSelectionCheckbox showDisabledSelectionCheckbox} is
     * <code>true</code>
     *
     * @param leaveSelectionCheckboxGap  Default value is true
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.widgets.grid.ListGrid#setRecordCanSelectProperty
     */
    public void setLeaveSelectionCheckboxGap(Boolean leaveSelectionCheckboxGap)  throws IllegalStateException {
        setAttribute("leaveSelectionCheckboxGap", leaveSelectionCheckboxGap, false);
    }

    /**
     * If {@link com.smartgwt.client.widgets.grid.ListGrid#getSelectionAppearance selectionAppearance}:"checkbox"  is set on
     * the treegrid, and a node can't be selected, should a gap be left where the checkbox icon would normally appear, in order
     * to make the node's icon and title line up with the content for other nodes in the same parent? <p> Has no effect if
     * {@link com.smartgwt.client.widgets.tree.TreeGrid#getShowDisabledSelectionCheckbox showDisabledSelectionCheckbox} is
     * <code>true</code>
     *
     * @return Boolean
     * @see com.smartgwt.client.widgets.grid.ListGrid#getRecordCanSelectProperty
     */
    public Boolean getLeaveSelectionCheckboxGap()  {
        Boolean result = getAttributeAsBoolean("leaveSelectionCheckboxGap");
        return result == null ? true : result;
    }
    

    /**
     * For databound treeGrid instances, should the entire tree of data be loaded on initial  fetch, or should folders load
     * their children as they are opened. <P> If unset, calling {@link com.smartgwt.client.widgets.tree.TreeGrid#fetchData
     * TreeGrid.fetchData} will default it to true, otherwise, if a ResultTree is passed to {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#setData TreeGrid.setData}, the {@link
     * com.smartgwt.client.widgets.tree.ResultTree#getLoadDataOnDemand loadDataOnDemand} setting is respected. <P> Note that
     * when using <code>loadDataOnDemand</code>, every node returned by the server is assumed be a folder which may load
     * further children.  See {@link com.smartgwt.client.widgets.tree.ResultTree#getDefaultIsFolder defaultIsFolder} for how to
     * control this behavior.
     *
     * @param loadDataOnDemand  Default value is null
     * @see com.smartgwt.client.widgets.tree.TreeGrid#setDataFetchMode
     * @see com.smartgwt.client.docs.Databinding Databinding overview and related methods
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#tree_databinding_init_ondemand" target="examples">Initial Data & Load on Demand Example</a>
     */
    public void setLoadDataOnDemand(Boolean loadDataOnDemand) {
        setAttribute("loadDataOnDemand", loadDataOnDemand, true);
    }

    /**
     * For databound treeGrid instances, should the entire tree of data be loaded on initial  fetch, or should folders load
     * their children as they are opened. <P> If unset, calling {@link com.smartgwt.client.widgets.tree.TreeGrid#fetchData
     * TreeGrid.fetchData} will default it to true, otherwise, if a ResultTree is passed to {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#setData TreeGrid.setData}, the {@link
     * com.smartgwt.client.widgets.tree.ResultTree#getLoadDataOnDemand loadDataOnDemand} setting is respected. <P> Note that
     * when using <code>loadDataOnDemand</code>, every node returned by the server is assumed be a folder which may load
     * further children.  See {@link com.smartgwt.client.widgets.tree.ResultTree#getDefaultIsFolder defaultIsFolder} for how to
     * control this behavior.
     *
     * @return Boolean
     * @see com.smartgwt.client.widgets.tree.TreeGrid#getDataFetchMode
     * @see com.smartgwt.client.docs.Databinding Databinding overview and related methods
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#tree_databinding_init_ondemand" target="examples">Initial Data & Load on Demand Example</a>
     */
    public Boolean getLoadDataOnDemand()  {
        return getAttributeAsBoolean("loadDataOnDemand");
    }
    

    /**
     * The filename of the icon displayed use as the default drag tracker when for multiple files and/or folders are being
     * dragged.
     *
     * @param manyItemsImage  See {@link com.smartgwt.client.docs.SCImgURL SCImgURL} . Default value is "[SKIN]folder_file.gif"
     * @see com.smartgwt.client.docs.Dragdrop Dragdrop overview and related methods
     */
    public void setManyItemsImage(String manyItemsImage) {
        setAttribute("manyItemsImage", manyItemsImage, true);
    }

    /**
     * The filename of the icon displayed use as the default drag tracker when for multiple files and/or folders are being
     * dragged.
     *
     * @return  See {@link com.smartgwt.client.docs.SCImgURL SCImgURL} 
     * @see com.smartgwt.client.docs.Dragdrop Dragdrop overview and related methods
     */
    public String getManyItemsImage()  {
        return getAttributeAsString("manyItemsImage");
    }
    

    /**
     * The filename of the default icon for all leaf nodes in this grid. To specify a  custom image for an individual node, set
     * the {@link com.smartgwt.client.widgets.tree.TreeGrid#getCustomIconProperty customIconProperty} directly on the node.
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Set the icon for a particular treenode to a specified URL
     *
     * @param nodeIcon tree node See {@link com.smartgwt.client.docs.SCImgURL SCImgURL} . Default value is "[SKIN]file.gif"
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#tree_appearance_node_titles" target="examples">Node Titles Example</a>
     */
    public void setNodeIcon(String nodeIcon) {
        setAttribute("nodeIcon", nodeIcon, true);
    }

    /**
     * The filename of the default icon for all leaf nodes in this grid. To specify a  custom image for an individual node, set
     * the {@link com.smartgwt.client.widgets.tree.TreeGrid#getCustomIconProperty customIconProperty} directly on the node.
     *
     * @return  See {@link com.smartgwt.client.docs.SCImgURL SCImgURL} 
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#tree_appearance_node_titles" target="examples">Node Titles Example</a>
     */
    public String getNodeIcon()  {
        return getAttributeAsString("nodeIcon");
    }
    

    /**
     * For TreeGrids with loadDataOnDemand: true, a message to show the user if an attempt is  made to open a folder, and thus
     * load that node's children, while we are offline and  there is no offline cache of that data.  The message will be
     * presented to the user in  in a pop-up dialog box.
     *
     * @param offlineNodeMessage  Default value is "This data not available while offline"
     */
    public void setOfflineNodeMessage(String offlineNodeMessage) {
        setAttribute("offlineNodeMessage", offlineNodeMessage, true);
    }

    /**
     * For TreeGrids with loadDataOnDemand: true, a message to show the user if an attempt is  made to open a folder, and thus
     * load that node's children, while we are offline and  there is no offline cache of that data.  The message will be
     * presented to the user in  in a pop-up dialog box.
     *
     * @return String
     */
    public String getOfflineNodeMessage()  {
        return getAttributeAsString("offlineNodeMessage");
    }
    

    /**
     * Height in pixels of the opener icons, that is, the icons which show the open or closed state of the node, typically a
     * [+] or [-] symbol. <P> If not specified, {@link com.smartgwt.client.widgets.tree.TreeGrid#getOpenerIconSize
     * openerIconSize} is used instead.
     *
     * @param openerIconHeight  Default value is null
     */
    public void setOpenerIconHeight(Integer openerIconHeight) {
        setAttribute("openerIconHeight", openerIconHeight, true);
    }

    /**
     * Height in pixels of the opener icons, that is, the icons which show the open or closed state of the node, typically a
     * [+] or [-] symbol. <P> If not specified, {@link com.smartgwt.client.widgets.tree.TreeGrid#getOpenerIconSize
     * openerIconSize} is used instead.
     *
     * @return Integer
     */
    public Integer getOpenerIconHeight()  {
        return getAttributeAsInt("openerIconHeight");
    }
    

    /**
     * Default width and height in pixels of the opener icons, that is, the icons which show the open or closed state of the
     * node, typically a [+] or [-] symbol, if not overridden by {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getOpenerIconWidth openerIconWidth}/{@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getOpenerIconHeight openerIconHeight}. <P> If {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getShowConnectors showConnectors} is true, the opener icon includes the
     * connector line, and defaults to {@link com.smartgwt.client.widgets.grid.ListGrid#getCellHeight cellHeight}. <P>
     * Otherwise, <code>openerIconSize</code> defaults to {@link com.smartgwt.client.widgets.tree.TreeGrid#getIconSize
     * iconSize}.
     *
     * @param openerIconSize  Default value is null
     */
    public void setOpenerIconSize(Integer openerIconSize) {
        setAttribute("openerIconSize", openerIconSize, true);
    }

    /**
     * Default width and height in pixels of the opener icons, that is, the icons which show the open or closed state of the
     * node, typically a [+] or [-] symbol, if not overridden by {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getOpenerIconWidth openerIconWidth}/{@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getOpenerIconHeight openerIconHeight}. <P> If {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getShowConnectors showConnectors} is true, the opener icon includes the
     * connector line, and defaults to {@link com.smartgwt.client.widgets.grid.ListGrid#getCellHeight cellHeight}. <P>
     * Otherwise, <code>openerIconSize</code> defaults to {@link com.smartgwt.client.widgets.tree.TreeGrid#getIconSize
     * iconSize}.
     *
     * @return Integer
     */
    public Integer getOpenerIconSize()  {
        return getAttributeAsInt("openerIconSize");
    }
    

    /**
     * Width in pixels of the opener icons, that is, the icons which show the open or closed state of the node, typically a [+]
     * or [-] symbol. <P> If not specified, {@link com.smartgwt.client.widgets.tree.TreeGrid#getOpenerIconSize openerIconSize}
     * is used instead.
     *
     * @param openerIconWidth  Default value is null
     */
    public void setOpenerIconWidth(Integer openerIconWidth) {
        setAttribute("openerIconWidth", openerIconWidth, true);
    }

    /**
     * Width in pixels of the opener icons, that is, the icons which show the open or closed state of the node, typically a [+]
     * or [-] symbol. <P> If not specified, {@link com.smartgwt.client.widgets.tree.TreeGrid#getOpenerIconSize openerIconSize}
     * is used instead.
     *
     * @return Integer
     */
    public Integer getOpenerIconWidth()  {
        return getAttributeAsInt("openerIconWidth");
    }
    

    /**
     * The base filename of the opener icon for the folder node when 'showConnectors' is false for this TreeGrid.<br> The
     * opener icon is displayed beside the folder icon in the Tree column for folder nodes. Clicking on this icon will toggle
     * the open state of the folder.<br> The filenames for these icons are assembled from this base filename and the state of
     * the node, as follows:<br> If the openerImage is set to <code>{baseName}.{extension}</code>, 
     * <code>{baseName}_opened.{extension}</code> will be displayed next to opened folders, and
     * <code>{baseName}_closed.{extension}</code> will be displayed next to closed folders, or if this page is in RTL mode,
     * <code>{baseName}_opened_rtl.{extension}</code> and <code>{baseName}_closed_rtl.{extension}</code> will be used.
     *
     * @param openerImage  See {@link com.smartgwt.client.docs.SCImgURL SCImgURL} . Default value is "[SKIN]opener.gif"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setOpenerImage(String openerImage)  throws IllegalStateException {
        setAttribute("openerImage", openerImage, false);
    }

    /**
     * The base filename of the opener icon for the folder node when 'showConnectors' is false for this TreeGrid.<br> The
     * opener icon is displayed beside the folder icon in the Tree column for folder nodes. Clicking on this icon will toggle
     * the open state of the folder.<br> The filenames for these icons are assembled from this base filename and the state of
     * the node, as follows:<br> If the openerImage is set to <code>{baseName}.{extension}</code>, 
     * <code>{baseName}_opened.{extension}</code> will be displayed next to opened folders, and
     * <code>{baseName}_closed.{extension}</code> will be displayed next to closed folders, or if this page is in RTL mode,
     * <code>{baseName}_opened_rtl.{extension}</code> and <code>{baseName}_closed_rtl.{extension}</code> will be used.
     *
     * @return  See {@link com.smartgwt.client.docs.SCImgURL SCImgURL} 
     */
    public String getOpenerImage()  {
        return getAttributeAsString("openerImage");
    }
    

    /**
     * If {@link com.smartgwt.client.widgets.tree.TreeGrid#getShowOpenIcons showOpenIcons} is true, this suffix will be
     * appended to the {@link com.smartgwt.client.widgets.tree.TreeGrid#getFolderIcon folderIcon} for open folders in this
     * grid.
     *
     * @param openIconSuffix  Default value is "open"
     */
    public void setOpenIconSuffix(String openIconSuffix) {
        setAttribute("openIconSuffix", openIconSuffix, true);
    }

    /**
     * If {@link com.smartgwt.client.widgets.tree.TreeGrid#getShowOpenIcons showOpenIcons} is true, this suffix will be
     * appended to the {@link com.smartgwt.client.widgets.tree.TreeGrid#getFolderIcon folderIcon} for open folders in this
     * grid.
     *
     * @return String
     */
    public String getOpenIconSuffix()  {
        return getAttributeAsString("openIconSuffix");
    }
    

    /**
     * Message displayed when user attempts to drag a node into a parent that already contains a child of the same name.
     *
     * @param parentAlreadyContainsChildMessage  Default value is "This item already contains a child item with that name."
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.widgets.tree.TreeGrid#setCanDragRecordsOut
     * @see com.smartgwt.client.widgets.tree.TreeGrid#setCanAcceptDroppedRecords
     * @see com.smartgwt.client.widgets.tree.TreeGrid#setCanReorderRecords
     */
    public void setParentAlreadyContainsChildMessage(String parentAlreadyContainsChildMessage)  throws IllegalStateException {
        setAttribute("parentAlreadyContainsChildMessage", parentAlreadyContainsChildMessage, false);
    }

    /**
     * Message displayed when user attempts to drag a node into a parent that already contains a child of the same name.
     *
     * @return String
     * @see com.smartgwt.client.widgets.tree.TreeGrid#getCanDragRecordsOut
     * @see com.smartgwt.client.widgets.tree.TreeGrid#getCanAcceptDroppedRecords
     * @see com.smartgwt.client.widgets.tree.TreeGrid#getCanReorderRecords
     */
    public String getParentAlreadyContainsChildMessage()  {
        return getAttributeAsString("parentAlreadyContainsChildMessage");
    }
    

    /**
     * If {@link com.smartgwt.client.widgets.tree.TreeGrid#getCanAcceptDroppedRecords canAcceptDroppedRecords} is true for this
     * treeGrid, this property governs whether the user can drop between, or over records within the grid. This controls what
     * {@link com.smartgwt.client.types.RecordDropPosition} is passed to the {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#recordDrop TreeGrid.recordDrop} event handler.
     *
     * @param recordDropAppearance  Default value is ListGrid.BOTH
     */
    public void setRecordDropAppearance(RecordDropAppearance recordDropAppearance) {
        setAttribute("recordDropAppearance", recordDropAppearance == null ? null : recordDropAppearance.getValue(), true);
    }

    /**
     * If {@link com.smartgwt.client.widgets.tree.TreeGrid#getCanAcceptDroppedRecords canAcceptDroppedRecords} is true for this
     * treeGrid, this property governs whether the user can drop between, or over records within the grid. This controls what
     * {@link com.smartgwt.client.types.RecordDropPosition} is passed to the {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#recordDrop TreeGrid.recordDrop} event handler.
     *
     * @return RecordDropAppearance
     */
    public RecordDropAppearance getRecordDropAppearance()  {
        return EnumUtil.getEnum(RecordDropAppearance.values(), getAttribute("recordDropAppearance"));
    }
    

    /**
     * If specified, the selection object for this list will use this property to mark records as selected.  In other words, if
     * this attribute were set to <code>"isSelected"</code> any records in the listGrid data where <code>"isSelected"</code> is
     * <code>true</code> will show up as selected in the grid. Similarly if records are selected within the grid after the grid
     * has been created, this property will be set to true on the selected records.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param selectionProperty  Default value is null
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public void setSelectionProperty(String selectionProperty)  throws IllegalStateException {
        setAttribute("selectionProperty", selectionProperty, false);
    }

    /**
     * If specified, the selection object for this list will use this property to mark records as selected.  In other words, if
     * this attribute were set to <code>"isSelected"</code> any records in the listGrid data where <code>"isSelected"</code> is
     * <code>true</code> will show up as selected in the grid. Similarly if records are selected within the grid after the grid
     * has been created, this property will be set to true on the selected records.
     *
     * @return String
     * @see com.smartgwt.client.docs.Appearance Appearance overview and related methods
     */
    public String getSelectionProperty()  {
        return getAttributeAsString("selectionProperty");
    }
    

    /**
     * If specified, this attribute will override {@link com.smartgwt.client.widgets.tree.Tree#getSeparateFolders
     * separateFolders} on the data for this treeGrid. <P> Specifies whether folders and leaves should be segregated in the
     * treeGrid display. Use {@link com.smartgwt.client.widgets.tree.Tree#getSortFoldersBeforeLeaves sortFoldersBeforeLeaves}
     * to customize whether folders appear before  or after their sibling leaves. <P> If unset, at the treeGrid level, the
     * property can be set directly on {@link com.smartgwt.client.widgets.tree.TreeGrid#getData the tree data object} or for
     * dataBound TreeGrids on the {@link com.smartgwt.client.widgets.tree.TreeGrid#getDataProperties dataProperties}.
     *
     * @param separateFolders  Default value is null
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setSeparateFolders(Boolean separateFolders)  throws IllegalStateException {
        setAttribute("separateFolders", separateFolders, false);
    }

    /**
     * If specified, this attribute will override {@link com.smartgwt.client.widgets.tree.Tree#getSeparateFolders
     * separateFolders} on the data for this treeGrid. <P> Specifies whether folders and leaves should be segregated in the
     * treeGrid display. Use {@link com.smartgwt.client.widgets.tree.Tree#getSortFoldersBeforeLeaves sortFoldersBeforeLeaves}
     * to customize whether folders appear before  or after their sibling leaves. <P> If unset, at the treeGrid level, the
     * property can be set directly on {@link com.smartgwt.client.widgets.tree.TreeGrid#getData the tree data object} or for
     * dataBound TreeGrids on the {@link com.smartgwt.client.widgets.tree.TreeGrid#getDataProperties dataProperties}.
     *
     * @return Boolean
     */
    public Boolean getSeparateFolders()  {
        return getAttributeAsBoolean("separateFolders");
    }
    

    /**
     * When {@link com.smartgwt.client.widgets.tree.TreeGrid#getKeepParentsOnFilter keepParentsOnFilter} is enabled for {@link
     * com.smartgwt.client.types.FetchMode fetchMode:"local"} ResultTrees, this property lists field names that will be sent to
     * the server if they are present in the criteria.
     *
     * @param serverFilterFields  Default value is null
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setServerFilterFields(String... serverFilterFields)  throws IllegalStateException {
        setAttribute("serverFilterFields", serverFilterFields, false);
    }

    /**
     * When {@link com.smartgwt.client.widgets.tree.TreeGrid#getKeepParentsOnFilter keepParentsOnFilter} is enabled for {@link
     * com.smartgwt.client.types.FetchMode fetchMode:"local"} ResultTrees, this property lists field names that will be sent to
     * the server if they are present in the criteria.
     *
     * @return String...
     */
    public String[] getServerFilterFields()  {
        return com.smartgwt.client.util.ConvertTo.arrayOfString(getAttributeAsJavaScriptObject("serverFilterFields"));
    }
    

    /**
     * Should this treeGrid show connector lines illustrating the tree's hierarchy? <P> For the set of images used to show
     * connectors, see {@link com.smartgwt.client.widgets.tree.TreeGrid#getConnectorImage connectorImage}. <P> <b>Note</b>: in
     * order for connector images to be perfectly connected, all styles for cells must have no top or bottom border or padding.
     * If you see small gaps in connector lines, check your CSS files.  See the example below for an example of correct
     * configuration, including example CSS.
     *
     * @param showConnectors  Default value is false
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#tree_appearance_connectors" target="examples">Connectors Example</a>
     */
    public void setShowConnectors(Boolean showConnectors) {
        setAttribute("showConnectors", showConnectors, true);
    }

    /**
     * Should this treeGrid show connector lines illustrating the tree's hierarchy? <P> For the set of images used to show
     * connectors, see {@link com.smartgwt.client.widgets.tree.TreeGrid#getConnectorImage connectorImage}. <P> <b>Note</b>: in
     * order for connector images to be perfectly connected, all styles for cells must have no top or bottom border or padding.
     * If you see small gaps in connector lines, check your CSS files.  See the example below for an example of correct
     * configuration, including example CSS.
     *
     * @return Boolean
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#tree_appearance_connectors" target="examples">Connectors Example</a>
     */
    public Boolean getShowConnectors()  {
        Boolean result = getAttributeAsBoolean("showConnectors");
        return result == null ? false : result;
    }
    

    /**
     * Should folder nodes showing custom icons (set via the {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getCustomIconProperty customIconProperty}, default {@link
     * com.smartgwt.client.widgets.tree.TreeNode#getIcon icon}), show drop state images when the user is drop-hovering over the
     * folder. If true, the {@link com.smartgwt.client.widgets.tree.TreeGrid#getDropIconSuffix dropIconSuffix} will be appended
     * to the image URL (so <code>"customFolder.gif"</code> might be replaced with  <code>"customFolder_drop.gif"</code>).<br>
     * Can be overridden at the node level via the default property {@link
     * com.smartgwt.client.widgets.tree.TreeNode#getShowDropIcon showDropIcon} and that property can be renamed via {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getCustomIconDropProperty customIconDropProperty}.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param showCustomIconDrop  Default value is false
     */
    public void setShowCustomIconDrop(Boolean showCustomIconDrop) {
        setAttribute("showCustomIconDrop", showCustomIconDrop, true);
    }

    /**
     * Should folder nodes showing custom icons (set via the {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getCustomIconProperty customIconProperty}, default {@link
     * com.smartgwt.client.widgets.tree.TreeNode#getIcon icon}), show drop state images when the user is drop-hovering over the
     * folder. If true, the {@link com.smartgwt.client.widgets.tree.TreeGrid#getDropIconSuffix dropIconSuffix} will be appended
     * to the image URL (so <code>"customFolder.gif"</code> might be replaced with  <code>"customFolder_drop.gif"</code>).<br>
     * Can be overridden at the node level via the default property {@link
     * com.smartgwt.client.widgets.tree.TreeNode#getShowDropIcon showDropIcon} and that property can be renamed via {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getCustomIconDropProperty customIconDropProperty}.
     *
     * @return Boolean
     */
    public Boolean getShowCustomIconDrop()  {
        Boolean result = getAttributeAsBoolean("showCustomIconDrop");
        return result == null ? false : result;
    }
    

    /**
     * Should folder nodes showing custom icons (set via the {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getCustomIconProperty customIconProperty}), show open state images when the
     * folder is opened. If true, the {@link com.smartgwt.client.widgets.tree.TreeGrid#getOpenIconSuffix openIconSuffix} will
     * be appended to the image URL (so <code>"customFolder.gif"</code> might be replaced with 
     * <code>"customFolder_open.gif"</code>).<br> <b>Note</b> that the {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getClosedIconSuffix closedIconSuffix} is never appended to custom folder
     * icons.<br> Can be overridden at the node level via the default property {@link
     * com.smartgwt.client.widgets.tree.TreeNode#getShowOpenIcon showOpenIcon} and that property can be renamed via {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getCustomIconOpenProperty customIconOpenProperty}.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param showCustomIconOpen  Default value is false
     */
    public void setShowCustomIconOpen(Boolean showCustomIconOpen) {
        setAttribute("showCustomIconOpen", showCustomIconOpen, true);
    }

    /**
     * Should folder nodes showing custom icons (set via the {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getCustomIconProperty customIconProperty}), show open state images when the
     * folder is opened. If true, the {@link com.smartgwt.client.widgets.tree.TreeGrid#getOpenIconSuffix openIconSuffix} will
     * be appended to the image URL (so <code>"customFolder.gif"</code> might be replaced with 
     * <code>"customFolder_open.gif"</code>).<br> <b>Note</b> that the {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getClosedIconSuffix closedIconSuffix} is never appended to custom folder
     * icons.<br> Can be overridden at the node level via the default property {@link
     * com.smartgwt.client.widgets.tree.TreeNode#getShowOpenIcon showOpenIcon} and that property can be renamed via {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getCustomIconOpenProperty customIconOpenProperty}.
     *
     * @return Boolean
     */
    public Boolean getShowCustomIconOpen()  {
        Boolean result = getAttributeAsBoolean("showCustomIconOpen");
        return result == null ? false : result;
    }
    

    /**
     * Should tree nodes show a disabled checkbox  {@link com.smartgwt.client.widgets.grid.ListGrid#getSelectionAppearance
     * selectionAppearance}:"checkbox"  is set on the treegrid, and a node can't be selected?  <P> If set to <code>false</code>
     * the treeGrid will use  {@link com.smartgwt.client.widgets.tree.TreeGrid#getLeaveSelectionCheckboxGap
     * leaveSelectionCheckboxGap} to determine whether to leave a blank space where the checkbox would normally appear.
     *
     * @param showDisabledSelectionCheckbox  Default value is false
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.widgets.grid.ListGrid#setRecordCanSelectProperty
     */
    public void setShowDisabledSelectionCheckbox(Boolean showDisabledSelectionCheckbox)  throws IllegalStateException {
        setAttribute("showDisabledSelectionCheckbox", showDisabledSelectionCheckbox, false);
    }

    /**
     * Should tree nodes show a disabled checkbox  {@link com.smartgwt.client.widgets.grid.ListGrid#getSelectionAppearance
     * selectionAppearance}:"checkbox"  is set on the treegrid, and a node can't be selected?  <P> If set to <code>false</code>
     * the treeGrid will use  {@link com.smartgwt.client.widgets.tree.TreeGrid#getLeaveSelectionCheckboxGap
     * leaveSelectionCheckboxGap} to determine whether to leave a blank space where the checkbox would normally appear.
     *
     * @return Boolean
     * @see com.smartgwt.client.widgets.grid.ListGrid#getRecordCanSelectProperty
     */
    public Boolean getShowDisabledSelectionCheckbox()  {
        Boolean result = getAttributeAsBoolean("showDisabledSelectionCheckbox");
        return result == null ? false : result;
    }
    

    /**
     * If true, when the user drags a droppable target over a folder in this TreeGrid, show  a different icon folder icon. This
     * is achieved by appending the {@link com.smartgwt.client.widgets.tree.TreeGrid#getDropIconSuffix dropIconSuffix} onto the
     * {@link com.smartgwt.client.widgets.tree.TreeGrid#getFolderIcon folderIcon} URL (for example
     * <code>"[SKIN]/folder.gif"</code> may be replaced by <code>"[SKIN]/folder_drop.gif"</code>).
     *
     * @param showDropIcons  Default value is true
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#tree_appearance_node_titles" target="examples">Node Titles Example</a>
     */
    public void setShowDropIcons(Boolean showDropIcons) {
        setAttribute("showDropIcons", showDropIcons, true);
    }

    /**
     * If true, when the user drags a droppable target over a folder in this TreeGrid, show  a different icon folder icon. This
     * is achieved by appending the {@link com.smartgwt.client.widgets.tree.TreeGrid#getDropIconSuffix dropIconSuffix} onto the
     * {@link com.smartgwt.client.widgets.tree.TreeGrid#getFolderIcon folderIcon} URL (for example
     * <code>"[SKIN]/folder.gif"</code> may be replaced by <code>"[SKIN]/folder_drop.gif"</code>).
     *
     * @return Boolean
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#tree_appearance_node_titles" target="examples">Node Titles Example</a>
     */
    public Boolean getShowDropIcons()  {
        Boolean result = getAttributeAsBoolean("showDropIcons");
        return result == null ? true : result;
    }
    

    /**
     * If {@link com.smartgwt.client.widgets.tree.TreeGrid#getShowConnectors showConnectors} is true, this property determines
     * whether we should show vertical continuation lines for each level of indenting within the tree. Setting to false will
     * show only the hierarchy lines are only shown for the most indented path ("sparse" connectors).
     *
     * @param showFullConnectors  Default value is true
     */
    public void setShowFullConnectors(Boolean showFullConnectors) {
        setAttribute("showFullConnectors", showFullConnectors, true);
    }

    /**
     * If {@link com.smartgwt.client.widgets.tree.TreeGrid#getShowConnectors showConnectors} is true, this property determines
     * whether we should show vertical continuation lines for each level of indenting within the tree. Setting to false will
     * show only the hierarchy lines are only shown for the most indented path ("sparse" connectors).
     *
     * @return Boolean
     */
    public Boolean getShowFullConnectors()  {
        Boolean result = getAttributeAsBoolean("showFullConnectors");
        return result == null ? true : result;
    }
    

    /**
     * Should the {@link com.smartgwt.client.widgets.tree.TreeGrid#getOpenerImage opener icon} be displayed next to folder
     * nodes? This is an icon which visually indicates whether the folder is opened or closed (typically via a [+] or [-]
     * image, or a turn-down arrow) and may be clicked to expand or collapse the folder. <P> For folders with no children, this
     * icon is not shown unless  {@link com.smartgwt.client.widgets.tree.TreeGrid#getAlwaysShowOpener alwaysShowOpener} is
     * <code>true</code>. Note that for trees which {@link com.smartgwt.client.widgets.tree.TreeGrid#getLoadDataOnDemand load
     * data on demand}, we may not know if a folder has any descendants if it has never been opened. As such we will show the
     * opener icon next to the folder. Once the user opens the icon and a fetch occurs, if the folder is empty, and {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getAlwaysShowOpener alwaysShowOpener} is false, the opener icon will be
     * hidden. <P> For more information on load on demand trees, and how we determine whether a node is a a folder or a leaf,
     * please refer to the {@link com.smartgwt.client.docs.TreeDataBinding} documentation.
     *
     * @param showOpener  Default value is true
     */
    public void setShowOpener(Boolean showOpener) {
        setAttribute("showOpener", showOpener, true);
    }

    /**
     * Should the {@link com.smartgwt.client.widgets.tree.TreeGrid#getOpenerImage opener icon} be displayed next to folder
     * nodes? This is an icon which visually indicates whether the folder is opened or closed (typically via a [+] or [-]
     * image, or a turn-down arrow) and may be clicked to expand or collapse the folder. <P> For folders with no children, this
     * icon is not shown unless  {@link com.smartgwt.client.widgets.tree.TreeGrid#getAlwaysShowOpener alwaysShowOpener} is
     * <code>true</code>. Note that for trees which {@link com.smartgwt.client.widgets.tree.TreeGrid#getLoadDataOnDemand load
     * data on demand}, we may not know if a folder has any descendants if it has never been opened. As such we will show the
     * opener icon next to the folder. Once the user opens the icon and a fetch occurs, if the folder is empty, and {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getAlwaysShowOpener alwaysShowOpener} is false, the opener icon will be
     * hidden. <P> For more information on load on demand trees, and how we determine whether a node is a a folder or a leaf,
     * please refer to the {@link com.smartgwt.client.docs.TreeDataBinding} documentation.
     *
     * @return Boolean
     */
    public Boolean getShowOpener()  {
        Boolean result = getAttributeAsBoolean("showOpener");
        return result == null ? true : result;
    }
    

    /**
     * If true, show a different icon for <code>open</code> folders than closed folders. This is achieved by appending the
     * {@link com.smartgwt.client.widgets.tree.TreeGrid#getOpenIconSuffix openIconSuffix} onto the  {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getFolderIcon folderIcon} URL [for example <code>"[SKIN]/folder.gif"</code>
     * might be  replaced by <code>"[SKIN]/folder_open.gif"</code>.<br> <b>Note</b> If this property is set to
     * <code>false</code> the same icon is shown for open folders as for closed folders, unless a custom folder icon was
     * specified. This will be determined by {@link com.smartgwt.client.widgets.tree.TreeGrid#getFolderIcon folderIcon} plus
     * the {@link com.smartgwt.client.widgets.tree.TreeGrid#getClosedIconSuffix closedIconSuffix}.
     *
     * @param showOpenIcons  Default value is true
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#tree_appearance_node_titles" target="examples">Node Titles Example</a>
     */
    public void setShowOpenIcons(Boolean showOpenIcons) {
        setAttribute("showOpenIcons", showOpenIcons, true);
    }

    /**
     * If true, show a different icon for <code>open</code> folders than closed folders. This is achieved by appending the
     * {@link com.smartgwt.client.widgets.tree.TreeGrid#getOpenIconSuffix openIconSuffix} onto the  {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getFolderIcon folderIcon} URL [for example <code>"[SKIN]/folder.gif"</code>
     * might be  replaced by <code>"[SKIN]/folder_open.gif"</code>.<br> <b>Note</b> If this property is set to
     * <code>false</code> the same icon is shown for open folders as for closed folders, unless a custom folder icon was
     * specified. This will be determined by {@link com.smartgwt.client.widgets.tree.TreeGrid#getFolderIcon folderIcon} plus
     * the {@link com.smartgwt.client.widgets.tree.TreeGrid#getClosedIconSuffix closedIconSuffix}.
     *
     * @return Boolean
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#tree_appearance_node_titles" target="examples">Node Titles Example</a>
     */
    public Boolean getShowOpenIcons()  {
        Boolean result = getAttributeAsBoolean("showOpenIcons");
        return result == null ? true : result;
    }
    

    /**
     * Should partially selected parents be shown with special icon?
     *
     * @param showPartialSelection  Default value is false
     */
    public void setShowPartialSelection(Boolean showPartialSelection) {
        setAttribute("showPartialSelection", showPartialSelection, true);
    }

    /**
     * Should partially selected parents be shown with special icon?
     *
     * @return Boolean
     */
    public Boolean getShowPartialSelection()  {
        Boolean result = getAttributeAsBoolean("showPartialSelection");
        return result == null ? false : result;
    }
    

    /**
     * Specifies whether the root node should be displayed in the treeGrid. <P> This property is only available for "children"
     * modelType trees, hence is not allowed for trees that load data from the server dynamically via {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#fetchData TreeGrid.fetchData}.   <P> To get the equivalent of a visible "root"
     * node in a tree that loads data dynamically, add a singular, top-level parent to the data.  However, note that this
     * top-level parent will technically be the only child of root, and the implicit root object will be returned by {@link
     * com.smartgwt.client.widgets.tree.Tree#getRoot this.data.getRoot()}.
     *
     * @param showRoot  Default value is false
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setShowRoot(Boolean showRoot)  throws IllegalStateException {
        setAttribute("showRoot", showRoot, false);
    }

    /**
     * Specifies whether the root node should be displayed in the treeGrid. <P> This property is only available for "children"
     * modelType trees, hence is not allowed for trees that load data from the server dynamically via {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#fetchData TreeGrid.fetchData}.   <P> To get the equivalent of a visible "root"
     * node in a tree that loads data dynamically, add a singular, top-level parent to the data.  However, note that this
     * top-level parent will technically be the only child of root, and the implicit root object will be returned by {@link
     * com.smartgwt.client.widgets.tree.Tree#getRoot this.data.getRoot()}.
     *
     * @return Boolean
     */
    public Boolean getShowRoot()  {
        Boolean result = getAttributeAsBoolean("showRoot");
        return result == null ? false : result;
    }
    

    /**
     * If specified, this attribute will override {@link com.smartgwt.client.widgets.tree.Tree#getSortFoldersBeforeLeaves
     * sortFoldersBeforeLeaves} on the data for this treeGrid. <P> Specifies whether when {@link
     * com.smartgwt.client.widgets.tree.Tree#getSeparateFolders separateFolders} is true, folders should be displayed before or
     * after their sibling leaves in a sorted tree. If set to true, with sortDirection set to Array.ASCENDING, folders are
     * displayed before their sibling leaves and with sort direction set to Array.DESCENDING they are displayed after. To
     * invert this behavior, set this property to false.
     *
     * @param sortFoldersBeforeLeaves  Default value is null
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.widgets.tree.TreeGrid#setSeparateFolders
     */
    public void setSortFoldersBeforeLeaves(Boolean sortFoldersBeforeLeaves)  throws IllegalStateException {
        setAttribute("sortFoldersBeforeLeaves", sortFoldersBeforeLeaves, false);
    }

    /**
     * If specified, this attribute will override {@link com.smartgwt.client.widgets.tree.Tree#getSortFoldersBeforeLeaves
     * sortFoldersBeforeLeaves} on the data for this treeGrid. <P> Specifies whether when {@link
     * com.smartgwt.client.widgets.tree.Tree#getSeparateFolders separateFolders} is true, folders should be displayed before or
     * after their sibling leaves in a sorted tree. If set to true, with sortDirection set to Array.ASCENDING, folders are
     * displayed before their sibling leaves and with sort direction set to Array.DESCENDING they are displayed after. To
     * invert this behavior, set this property to false.
     *
     * @return Boolean
     * @see com.smartgwt.client.widgets.tree.TreeGrid#getSeparateFolders
     */
    public Boolean getSortFoldersBeforeLeaves()  {
        return getAttributeAsBoolean("sortFoldersBeforeLeaves");
    }
    

    /**
     * Visible title for the tree column (field).
     *
     * @param treeFieldTitle  Default value is "Name"
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setTreeFieldTitle(String treeFieldTitle)  throws IllegalStateException {
        setAttribute("treeFieldTitle", treeFieldTitle, false);
    }

    /**
     * Visible title for the tree column (field).
     *
     * @return String
     */
    public String getTreeFieldTitle()  {
        return getAttributeAsString("treeFieldTitle");
    }
    
    

    /**
     * If true, the set of fields given by the "default binding" (see  {@link
     * com.smartgwt.client.widgets.DataBoundComponent#getFields fields}) is used, with any fields specified in
     * <code>component.fields</code> acting as overrides that can suppress or modify the display of individual fields, without
     * having to list the entire set of fields that should be shown. <P> If <code>component.fields</code> contains fields that
     * are not found in the DataSource, they will be shown after the most recently referred to DataSource field.  If the new
     * fields appear first, they will be shown first. <P> <a
     * href="http://www.smartclient.com/smartgwt/showcase/#form_validation_customized_binding" target="examples">This
     * example</a> shows a mixture of component fields and DataSource fields, and how they interact for validation.
     *
     * @param useAllDataSourceFields  Default value is null
     * @see com.smartgwt.client.docs.Databinding Databinding overview and related methods
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#form_validation_customized_binding" target="examples">Customized Binding Example</a>
     */
    public void setUseAllDataSourceFields(Boolean useAllDataSourceFields) {
        setAttribute("useAllDataSourceFields", useAllDataSourceFields, true);
    }

    /**
     * If true, the set of fields given by the "default binding" (see  {@link
     * com.smartgwt.client.widgets.DataBoundComponent#getFields fields}) is used, with any fields specified in
     * <code>component.fields</code> acting as overrides that can suppress or modify the display of individual fields, without
     * having to list the entire set of fields that should be shown. <P> If <code>component.fields</code> contains fields that
     * are not found in the DataSource, they will be shown after the most recently referred to DataSource field.  If the new
     * fields appear first, they will be shown first. <P> <a
     * href="http://www.smartclient.com/smartgwt/showcase/#form_validation_customized_binding" target="examples">This
     * example</a> shows a mixture of component fields and DataSource fields, and how they interact for validation.
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.Databinding Databinding overview and related methods
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#form_validation_customized_binding" target="examples">Customized Binding Example</a>
     */
    public Boolean getUseAllDataSourceFields()  {
        return getAttributeAsBoolean("useAllDataSourceFields");
    }
    

    // ********************* Methods ***********************
	/**
     * Overridden to disallow editing of the {@link com.smartgwt.client.widgets.tree.TreeNode#getName name} field of this
     * grid's data tree. Also disallows editing of the auto-generated tree field, which displays the result of {@link
     * com.smartgwt.client.widgets.tree.Tree#getTitle Tree.getTitle} on the node.
     *
     * @return Whether to allow editing this cell
     */
    public native Boolean canEditCell() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.canEditCell();
        if(ret == null) return null;
        return @com.smartgwt.client.util.JSOHelper::toBoolean(Z)(ret);
    }-*/;

    /**
     * Add a dataArrived handler.
     * <p>
     * Notification method fired whenever this TreeGrid receives new data nodes from the  dataSource. Only applies to databound
     * TreeGrids where {@link com.smartgwt.client.widgets.tree.TreeGrid#getData data} is a  {@link
     * com.smartgwt.client.widgets.tree.ResultTree} - either explicitly created and applied via {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#setData TreeGrid.setData} or automatically generated via a {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#fetchData fetchData()} call.
     *
     * @param handler the dataArrived handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addDataArrivedHandler(com.smartgwt.client.widgets.tree.events.DataArrivedHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.tree.events.DataArrivedEvent.getType()) == 0) setupDataArrivedEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.tree.events.DataArrivedEvent.getType());
    }

    private native void setupDataArrivedEvent() /*-{
        var obj = null;
        var selfJ = this;
        var dataArrived = $entry(function(){
            var param = {"parentNode" : arguments[0]};

                var event = @com.smartgwt.client.widgets.tree.events.DataArrivedEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
            });
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({dataArrived:  dataArrived              });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.dataArrived =  dataArrived             ;
        }
   }-*/;
	/**
     * Exports this component's data with client-side formatters applied, so is suitable for direct display to users.  See
     * {@link com.smartgwt.client.widgets.grid.ListGrid#exportClientData ListGrid.exportClientData} for details of the general 
     * requirements and restrictions when exporting client data. <p> The following notes apply when exporting client data from
     * TreeGrids:<ul> <li>Export only works correctly if you specify {@link com.smartgwt.client.widgets.tree.TreeGrid#getFields
     * fields}; if you allow it to     generate a {@link com.smartgwt.client.widgets.tree.TreeGrid#getCreateDefaultTreeField
     * default field}, nothing will be exported</li> <li>Only visible nodes are exported; if you close a node, its children are
     * not exported      even if they are loaded and known to the client</li> <li>Tree nodes are exported as a flat list, in
     * the same order they are displayed in the      TreeGrid</li> </ul>
     * @see com.smartgwt.client.widgets.grid.ListGrid#exportClientData
     */
    public native void exportClientData() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.exportClientData();
    }-*/;

    /**
     * @see TreeGrid#exportClientData
     */
    public void exportClientData(DSRequest requestProperties){
        exportClientData(requestProperties, null);
    }

	/**
     * Exports this component's data with client-side formatters applied, so is suitable for direct display to users.  See
     * {@link com.smartgwt.client.widgets.grid.ListGrid#exportClientData ListGrid.exportClientData} for details of the general 
     * requirements and restrictions when exporting client data. <p> The following notes apply when exporting client data from
     * TreeGrids:<ul> <li>Export only works correctly if you specify {@link com.smartgwt.client.widgets.tree.TreeGrid#getFields
     * fields}; if you allow it to     generate a {@link com.smartgwt.client.widgets.tree.TreeGrid#getCreateDefaultTreeField
     * default field}, nothing will be exported</li> <li>Only visible nodes are exported; if you close a node, its children are
     * not exported      even if they are loaded and known to the client</li> <li>Tree nodes are exported as a flat list, in
     * the same order they are displayed in the      TreeGrid</li> </ul>
     * @param requestProperties Request properties for the export.  Note that specifying {@link com.smartgwt.client.data.DSRequest#getExportData
     * exportData} on the request properties  allows the developer to pass in an explicit data set to export.
     * @param callback Optional callback.  If  you specify {@link com.smartgwt.client.data.DSRequest#getExportToClient exportToClient}: false
     * in the request  properties, this callback will fire after export completes.  Otherwise the callback will  fire right
     * before the download request is made to the server.
     * @see com.smartgwt.client.widgets.grid.ListGrid#exportClientData
     */
    public native void exportClientData(DSRequest requestProperties, RPCCallback callback) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.exportClientData(requestProperties == null ? null : requestProperties.@com.smartgwt.client.core.DataClass::getJsObj()(), 
			$entry( function(response, rawData, request) { 
				if(callback!=null) callback.@com.smartgwt.client.rpc.RPCCallback::execute(Lcom/smartgwt/client/rpc/RPCResponse;Ljava/lang/Object;Lcom/smartgwt/client/rpc/RPCRequest;)(
					@com.smartgwt.client.rpc.RPCResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(response), 
					rawData, 
					@com.smartgwt.client.rpc.RPCRequest::new(Lcom/google/gwt/core/client/JavaScriptObject;)(request)
				);
			}));
    }-*/;
	
    /**
     * Add a folderClick handler.
     * <p>
     * This method is called when a folder record is clicked on.
     *
     * @param handler the folderClick handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addFolderClickHandler(com.smartgwt.client.widgets.tree.events.FolderClickHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.tree.events.FolderClickEvent.getType()) == 0) setupFolderClickEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.tree.events.FolderClickEvent.getType());
    }

    private native void setupFolderClickEvent() /*-{
        var obj = null;
        var selfJ = this;
        var folderClick = $entry(function(){
            var param = {"viewer" : arguments[0], "folder" : arguments[1], "recordNum" : arguments[2]};

                var event = @com.smartgwt.client.widgets.tree.events.FolderClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
            });
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({folderClick:  folderClick              });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.folderClick =  folderClick             ;
        }
   }-*/;
    /**
     * Add a folderClosed handler.
     * <p>
     * This method is called when a folder is closed either via the user manipulating the expand/collapse control in the UI or
     * via {@link com.smartgwt.client.widgets.tree.TreeGrid#closeFolder TreeGrid.closeFolder}.  You can return
     * <code>false</code> to cancel the close.
     *
     * @param handler the folderClosed handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addFolderClosedHandler(com.smartgwt.client.widgets.tree.events.FolderClosedHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.tree.events.FolderClosedEvent.getType()) == 0) setupFolderClosedEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.tree.events.FolderClosedEvent.getType());
    }

    private native void setupFolderClosedEvent() /*-{
        var obj = null;
        var selfJ = this;
        var folderClosed = $debox($entry(function(param){
                var event = @com.smartgwt.client.widgets.tree.events.FolderClosedEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                var ret = event.@com.smartgwt.client.event.Cancellable::isCancelled()();
                return !ret;
            }));
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({folderClosed: 
                function () {
                    var param = {"node" : arguments[0]};
                    return folderClosed(param) == true;
                }
             });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.folderClosed = 
                function () {
                    var param = {"node" : arguments[0]};
                    return folderClosed(param) == true;
                }
            ;
        }
   }-*/;
    /**
     * Add a folderContextClick handler.
     * <p>
     * This method is called when a context click occurs on a folder record.
     *
     * @param handler the folderContextClick handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addFolderContextClickHandler(com.smartgwt.client.widgets.tree.events.FolderContextClickHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.tree.events.FolderContextClickEvent.getType()) == 0) setupFolderContextClickEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.tree.events.FolderContextClickEvent.getType());
    }

    private native void setupFolderContextClickEvent() /*-{
        var obj = null;
        var selfJ = this;
        var folderContextClick = $debox($entry(function(param){
                var event = @com.smartgwt.client.widgets.tree.events.FolderContextClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                var ret = event.@com.smartgwt.client.event.Cancellable::isCancelled()();
                return !ret;
            }));
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({folderContextClick: 
                function () {
                    var param = {"viewer" : arguments[0], "folder" : arguments[1], "recordNum" : arguments[2]};
                    return folderContextClick(param) == true;
                }
             });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.folderContextClick = 
                function () {
                    var param = {"viewer" : arguments[0], "folder" : arguments[1], "recordNum" : arguments[2]};
                    return folderContextClick(param) == true;
                }
            ;
        }
   }-*/;
    /**
     * Add a folderOpened handler.
     * <p>
     * This method is called when a folder is opened either via the user manipulating the expand/collapse control in the UI or
     * via {@link com.smartgwt.client.widgets.tree.TreeGrid#openFolder TreeGrid.openFolder}.  You can return <code>false</code>
     * to cancel the open.
     *
     * @param handler the folderOpened handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addFolderOpenedHandler(com.smartgwt.client.widgets.tree.events.FolderOpenedHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.tree.events.FolderOpenedEvent.getType()) == 0) setupFolderOpenedEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.tree.events.FolderOpenedEvent.getType());
    }

    private native void setupFolderOpenedEvent() /*-{
        var obj = null;
        var selfJ = this;
        var folderOpened = $debox($entry(function(param){
                var event = @com.smartgwt.client.widgets.tree.events.FolderOpenedEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                var ret = event.@com.smartgwt.client.event.Cancellable::isCancelled()();
                return !ret;
            }));
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({folderOpened: 
                function () {
                    var param = {"node" : arguments[0]};
                    return folderOpened(param) == true;
                }
             });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.folderOpened = 
                function () {
                    var param = {"node" : arguments[0]};
                    return folderOpened(param) == true;
                }
            ;
        }
   }-*/;
	/**
     * Returns the row number of the most recent mouse event.
     *
     * @return row number, or -2 if beyond last drawn row
     */
    public native int getEventRow() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.getEventRow();
        return ret;
    }-*/;

	/**
     * Returns the row number of the most recent mouse event.
     * @param y optional y-coordinate to obtain row number, in lieu of the y                        coordinate of the last mouse event
     *
     * @return row number, or -2 if beyond last drawn row
     */
    public native int getEventRow(Integer y) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.getEventRow(y == null ? null : y.@java.lang.Integer::intValue()());
        return ret;
    }-*/;
	


	/**
     * Get the appropriate open/close opener icon for a node. Returns null if {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getShowOpener showOpener} is set to false.
     * @param node tree node in question
     *
     * @return URL for the icon to show the node's open state
     */
    public native String getOpenIcon(TreeNode node) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.getOpenIcon(node.@com.smartgwt.client.core.DataClass::getJsObj()());
        return ret;
    }-*/;


	/**
     * Returns a snapshot of the current open state of this grid's data as a {@link com.smartgwt.client.docs.TreeGridOpenState}
     * object.<br> This object can be passed to {@link com.smartgwt.client.widgets.tree.TreeGrid#setOpenState
     * TreeGrid.setOpenState} to open the same set of folders within the treeGrid's data (assuming the nodes are still present
     * in the data).
     *
     * @return current open state for the grid.
     * @see com.smartgwt.client.widgets.tree.TreeGrid#setOpenState
     */
    public native String getOpenState() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.getOpenState();
        return ret;
    }-*/;

	/**
     * Returns a snapshot of the current selection within this treeGrid as  a {@link
     * com.smartgwt.client.docs.ListGridSelectedState} object.<br> This object can be passed to {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#setSelectedPaths TreeGrid.setSelectedPaths} to reset this grid's selection the
     * current state (assuming the same data is present in the grid).<br>
     *
     * @return current state of this grid's selection
     * @see com.smartgwt.client.widgets.tree.TreeGrid#setSelectedPaths
     */
    public native String getSelectedPaths() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.getSelectedPaths();
        return ret;
    }-*/;

	/**
     * Returns true if the last event occurred over {@link com.smartgwt.client.widgets.tree.TreeGrid#getExtraIcon extra icon}
     * for the current node. <P> Returns false if the event did not occur over an extraIcon, or if no extraIcon is showing for
     * the node in question.
     *
     * @return true if the user clicked the extra icon
     */
    public native Boolean isOverExtraIcon() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.isOverExtraIcon();
        if(ret == null) return null;
        return @com.smartgwt.client.util.JSOHelper::toBoolean(Z)(ret);
    }-*/;

	/**
     * Returns true if the last event occurred over the indented area or over the open / close icon of a folder node in this
     * TreeGrid. Returns false if the event did not occur over a folder node.
     *
     * @return true if the user clicked the open icon
     */
    public native Boolean isOverOpenArea() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.isOverOpenArea();
        if(ret == null) return null;
        return @com.smartgwt.client.util.JSOHelper::toBoolean(Z)(ret);
    }-*/;

    /**
     * Add a leafClick handler.
     * <p>
     * This method is called when a leaf record is clicked on.
     *
     * @param handler the leafClick handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addLeafClickHandler(com.smartgwt.client.widgets.tree.events.LeafClickHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.tree.events.LeafClickEvent.getType()) == 0) setupLeafClickEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.tree.events.LeafClickEvent.getType());
    }

    private native void setupLeafClickEvent() /*-{
        var obj = null;
        var selfJ = this;
        var leafClick = $entry(function(){
            var param = {"viewer" : arguments[0], "leaf" : arguments[1], "recordNum" : arguments[2]};

                var event = @com.smartgwt.client.widgets.tree.events.LeafClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
            });
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({leafClick:  leafClick              });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.leafClick =  leafClick             ;
        }
   }-*/;
    /**
     * Add a leafContextClick handler.
     * <p>
     * This method is called when a context click occurs on a leaf record.
     *
     * @param handler the leafContextClick handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addLeafContextClickHandler(com.smartgwt.client.widgets.tree.events.LeafContextClickHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.tree.events.LeafContextClickEvent.getType()) == 0) setupLeafContextClickEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.tree.events.LeafContextClickEvent.getType());
    }

    private native void setupLeafContextClickEvent() /*-{
        var obj = null;
        var selfJ = this;
        var leafContextClick = $debox($entry(function(param){
                var event = @com.smartgwt.client.widgets.tree.events.LeafContextClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                var ret = event.@com.smartgwt.client.event.Cancellable::isCancelled()();
                return !ret;
            }));
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({leafContextClick: 
                function () {
                    var param = {"viewer" : arguments[0], "leaf" : arguments[1], "recordNum" : arguments[2]};
                    return leafContextClick(param) == true;
                }
             });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.leafContextClick = 
                function () {
                    var param = {"viewer" : arguments[0], "leaf" : arguments[1], "recordNum" : arguments[2]};
                    return leafContextClick(param) == true;
                }
            ;
        }
   }-*/;
    /**
     * Add a nodeClick handler.
     * <p>
     * This method is called when a leaf or folder record is clicked on.  Note that if you set up a callback for
     * <code>nodeClick()</code> and e.g. {@link com.smartgwt.client.widgets.tree.TreeGrid#addLeafClickHandler
     * TreeGrid.leafClick}, then both will fire (in that order) if a leaf is clicked on.
     *
     * @param handler the nodeClick handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addNodeClickHandler(com.smartgwt.client.widgets.tree.events.NodeClickHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.tree.events.NodeClickEvent.getType()) == 0) setupNodeClickEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.tree.events.NodeClickEvent.getType());
    }

    private native void setupNodeClickEvent() /*-{
        var obj = null;
        var selfJ = this;
        var nodeClick = $entry(function(){
            var param = {"viewer" : arguments[0], "node" : arguments[1], "recordNum" : arguments[2]};

                var event = @com.smartgwt.client.widgets.tree.events.NodeClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
            });
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({nodeClick:  nodeClick              });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.nodeClick =  nodeClick             ;
        }
   }-*/;
    /**
     * Add a nodeContextClick handler.
     * <p>
     * This method is called when a context click occurs on a leaf or folder record.  Note that if you set up a callback for
     * <code>nodeContextClick()</code> and e.g. {@link com.smartgwt.client.widgets.tree.TreeGrid#addLeafContextClickHandler
     * TreeGrid.leafContextClick}, then both will fire (in that order) if a leaf is contextclicked - unless
     * <code>nodeContextClick()</code> returns false, in which case no further contextClick callbacks will be called.
     *
     * @param handler the nodeContextClick handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addNodeContextClickHandler(com.smartgwt.client.widgets.tree.events.NodeContextClickHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.tree.events.NodeContextClickEvent.getType()) == 0) setupNodeContextClickEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.tree.events.NodeContextClickEvent.getType());
    }

    private native void setupNodeContextClickEvent() /*-{
        var obj = null;
        var selfJ = this;
        var nodeContextClick = $debox($entry(function(param){
                var event = @com.smartgwt.client.widgets.tree.events.NodeContextClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                var ret = event.@com.smartgwt.client.event.Cancellable::isCancelled()();
                return !ret;
            }));
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({nodeContextClick: 
                function () {
                    var param = {"viewer" : arguments[0], "node" : arguments[1], "recordNum" : arguments[2]};
                    return nodeContextClick(param) == true;
                }
             });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.nodeContextClick = 
                function () {
                    var param = {"viewer" : arguments[0], "node" : arguments[1], "recordNum" : arguments[2]};
                    return nodeContextClick(param) == true;
                }
            ;
        }
   }-*/;
    /**
     * Add a folderDrop handler.
     * <p>
     * Notification method fired when treeNode(s) are dropped into a folder of this TreeGrid. This method fires before the
     * standard {@link com.smartgwt.client.widgets.tree.TreeGrid#folderDrop TreeGrid.folderDrop} processing occurs and
     * returning false will suppress that default behavior.
     *
     * @param handler the folderDrop handler
     * @return {@link HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addFolderDropHandler(com.smartgwt.client.widgets.tree.events.FolderDropHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.tree.events.FolderDropEvent.getType()) == 0) setupFolderDropEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.tree.events.FolderDropEvent.getType());
    }

    private native void setupFolderDropEvent() /*-{
        var obj = null;
        var selfJ = this;
        var onFolderDrop = $debox($entry(function(param){
                var event = @com.smartgwt.client.widgets.tree.events.FolderDropEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                var ret = event.@com.smartgwt.client.event.Cancellable::isCancelled()();
                return !ret;
            }));
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({onFolderDrop: 
                function () {
                    var param = {"nodes" : arguments[0], "folder" : arguments[1], "index" : arguments[2], "dropPosition" : arguments[3], "sourceWidget" : arguments[4]};
                    return onFolderDrop(param) == true;
                }
             });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.onFolderDrop = 
                function () {
                    var param = {"nodes" : arguments[0], "folder" : arguments[1], "index" : arguments[2], "dropPosition" : arguments[3], "sourceWidget" : arguments[4]};
                    return onFolderDrop(param) == true;
                }
            ;
        }
   }-*/;
	/**
     * Handle a doubleClick on a tree node - override of ListGrid stringMethod of same name.  If the node is a folder, this
     * implementation calls {@link com.smartgwt.client.widgets.tree.TreeGrid#toggleFolder TreeGrid.toggleFolder} on it.  If the
     * node is a leaf, calls {@link com.smartgwt.client.widgets.tree.TreeGrid#openLeaf TreeGrid.openLeaf} on it.
     * @see com.smartgwt.client.widgets.grid.events.RecordDoubleClickEvent
     */
    public native void recordDoubleClick() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.recordDoubleClick();
    }-*/;



	/**
     * Reset this set of open folders within this grid's data to match the  {@link com.smartgwt.client.docs.TreeGridOpenState}
     * object passed in.<br> Used to restore previous state retrieved from the grid by a call to  {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getOpenState TreeGrid.getOpenState}.
     * @param openState Object describing the desired set of open folders.. See {@link com.smartgwt.client.docs.TreeGridOpenState TreeGridOpenState}
     * @see com.smartgwt.client.widgets.tree.TreeGrid#getOpenState
     */
    public native void setOpenState(String openState) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.setOpenState(openState);
    }-*/;




	/**
     * Reset this grid's selection to match the {@link com.smartgwt.client.docs.ListGridSelectedState} object passed in.<br>
     * Used to restore previous state retrieved from the grid by a call to  {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getSelectedPaths TreeGrid.getSelectedPaths}.
     * @param selectedPaths Object describing the desired selection state of                                              the grid. See {@link com.smartgwt.client.docs.ListGridSelectedState ListGridSelectedState}
     * @see com.smartgwt.client.widgets.tree.TreeGrid#getSelectedPaths
     */
    public native void setSelectedPaths(String selectedPaths) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.setSelectedPaths(selectedPaths);
    }-*/;




	/**
     * Opens the folder specified by node if it's closed, and closes it if it's open. TreeGrid will redraw if there's a change
     * in the folder's open/closed state.
     * @param node node to toggle
     */
    public native void toggleFolder(TreeNode node) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.toggleFolder(node.@com.smartgwt.client.core.DataClass::getJsObj()());
    }-*/;




	/**
     * Transfer a list of {@link com.smartgwt.client.widgets.tree.TreeNode}s from another component (does not have to be a
     * databound component) into this component.  This method is only applicable to list-type components, such as {@link
     * com.smartgwt.client.widgets.grid.ListGrid listGrid}, {@link com.smartgwt.client.widgets.tree.TreeGrid treeGrid} or
     * {@link com.smartgwt.client.widgets.tile.TileGrid tileGrid}. <P> This method implements the automatic drag-copy and
     * drag-move behavior and calling it is equivalent to completing a drag and drop of the <code>nodes</code>. <P> Note that
     * this method is asynchronous - it may need to perform server turnarounds to prevent duplicates in the target component's
     * data.  If you wish to be notified when the transfer process has completed, you can either pass the optional callback to
     * this method or implement the {@link com.smartgwt.client.widgets.DataBoundComponent#dropComplete
     * DataBoundComponent.dropComplete} method on this component. <P> See also {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#transferSelectedData TreeGrid.transferSelectedData}.
     * @param nodes Nodes to transfer to this component
     * @param folder The target folder (eg, of a drop interaction), for context
     * @param index Insert point within the target folder data for the transferred nodes
     * @param sourceWidget The databound or non-databound component from which the nodes                              are to be transferred.
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#tree_interaction_drop_events" target="examples">Drop Events Example</a>
     */
    public native void transferNodes(TreeNode[] nodes, TreeNode folder, Integer index, Canvas sourceWidget) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.transferNodes(@com.smartgwt.client.util.JSOHelper::convertToJavaScriptArray([Ljava/lang/Object;)(nodes), folder.@com.smartgwt.client.core.DataClass::getJsObj()(), index == null ? null : index.@java.lang.Integer::intValue()(), sourceWidget.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()());
    }-*/;


	/**
     * Transfer a list of {@link com.smartgwt.client.widgets.tree.TreeNode}s from another component (does not have to be a
     * databound component) into this component.  This method is only applicable to list-type components, such as {@link
     * com.smartgwt.client.widgets.grid.ListGrid listGrid}, {@link com.smartgwt.client.widgets.tree.TreeGrid treeGrid} or
     * {@link com.smartgwt.client.widgets.tile.TileGrid tileGrid}. <P> This method implements the automatic drag-copy and
     * drag-move behavior and calling it is equivalent to completing a drag and drop of the <code>nodes</code>. <P> Note that
     * this method is asynchronous - it may need to perform server turnarounds to prevent duplicates in the target component's
     * data.  If you wish to be notified when the transfer process has completed, you can either pass the optional callback to
     * this method or implement the {@link com.smartgwt.client.widgets.DataBoundComponent#dropComplete
     * DataBoundComponent.dropComplete} method on this component. <P> See also {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#transferSelectedData TreeGrid.transferSelectedData}.
     * @param nodes Nodes to transfer to this component
     * @param folder The target folder (eg, of a drop interaction), for context
     * @param index Insert point within the target folder data for the transferred nodes
     * @param sourceWidget The databound or non-databound component from which the nodes                              are to be transferred.
     * @param callback optional callback to be fired when the transfer process has                       completed.  The callback will be
     * passed a single parameter "records",                       the list of nodes actually transferred to this component (it
     * is called                       "records" because this is logic shared with {@link
     * com.smartgwt.client.widgets.grid.ListGrid}). See {@link com.smartgwt.client.docs.Callback Callback}
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#tree_interaction_drop_events" target="examples">Drop Events Example</a>
     */
    public native void transferNodes(TreeNode[] nodes, TreeNode folder, Integer index, Canvas sourceWidget, String callback) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.transferNodes(@com.smartgwt.client.util.JSOHelper::convertToJavaScriptArray([Ljava/lang/Object;)(nodes), folder.@com.smartgwt.client.core.DataClass::getJsObj()(), index == null ? null : index.@java.lang.Integer::intValue()(), sourceWidget.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()(), callback);
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
     * @param treeGridProperties properties that should be used as new defaults when instances of this class are created
     */
    public static native void setDefaultProperties(TreeGrid treeGridProperties) /*-{
    	var properties = $wnd.isc.addProperties({},treeGridProperties.@com.smartgwt.client.widgets.BaseWidget::getConfig()());
        @com.smartgwt.client.util.JSOHelper::cleanProperties(Lcom/google/gwt/core/client/JavaScriptObject;Z)(properties,false);
        $wnd.isc.TreeGrid.addProperties(properties);
    }-*/;

    // ***********************************************************


    protected void onInit() {
        super.onInit();
        onInit_TreeGrid();
    }

    private native void onInit_TreeGrid() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self._getNodeTitle = self.getNodeTitle;
        self.getNodeTitle = $debox($entry(function(node, recordNum, field) {
            var jObj = this.__ref;
            var nodeJ = @com.smartgwt.client.data.Record::getOrCreateRef(Lcom/google/gwt/core/client/JavaScriptObject;)(node);
            var fieldJ = @com.smartgwt.client.widgets.grid.ListGridField::getOrCreateRef(Lcom/google/gwt/core/client/JavaScriptObject;)(field);
            return jObj.@com.smartgwt.client.widgets.tree.TreeGrid::getNodeTitle(Lcom/smartgwt/client/data/Record;ILcom/smartgwt/client/widgets/grid/ListGridField;)(nodeJ, recordNum, fieldJ);
        }));

        self._getIcon = self.getIcon;
        self.getIcon = $debox($entry(function(node, defaultState) {
            defaultState = !!defaultState;
            if ($wnd.isc.isA.Number(node)) node = this.data.get(node);
            var jObj = this.__ref;
            var nodeJ = @com.smartgwt.client.data.Record::getOrCreateRef(Lcom/google/gwt/core/client/JavaScriptObject;)(node);
            return jObj.@com.smartgwt.client.widgets.tree.TreeGrid::getIcon(Lcom/smartgwt/client/data/Record;Z)(nodeJ, defaultState);
        }));

        self._getExtraIcon = self.getExtraIcon;
        self.getExtraIcon = $debox($entry(function(node) {
            if ($wnd.isc.isA.Number(node)) node = this.data.get(node);
            var jObj = this.__ref;
            var nodeJ = @com.smartgwt.client.widgets.tree.TreeNode::getOrCreateRef(Lcom/google/gwt/core/client/JavaScriptObject;)(node);
            return jObj.@com.smartgwt.client.widgets.tree.TreeGrid::getExtraIcon(Lcom/smartgwt/client/widgets/tree/TreeNode;)(nodeJ);
        }));
    }-*/;

    /**
     * This inherited {@link com.smartgwt.client.widgets.grid.ListGrid#startEditingNew ListGrid API} is not supported by the
     * TreeGrid since adding a new tree node arbitrarily at the end of the tree is usually not useful. Instead, to add a new
     * tree node and begin editing it, use either of these two strategies: <ol> <li> add a new node to the client-side Tree
     * model via {@link com.smartgwt.client.widgets.tree.Tree#add Tree.add}, then use {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getStartEditing startEditing} to begin editing this node.  Note that if using
     * a DataSource, when the node is saved, an "update" operation will be used since adding a node directly to the client-side
     * {@link com.smartgwt.client.widgets.tree.ResultTree} effectively means a new node has been added server side. <li> use
     * {@link com.smartgwt.client.data.DataSource#addData DataSource.addData} to immediately save a new node.  Automatic cache
     * sync by the {@link com.smartgwt.client.widgets.tree.ResultTree} will cause the node to be integrated into the tree.
     * When the callback to addData() fires, locate the new node by matching primary key and call {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getStartEditing startEditing} to begin editing it. </ol>
     */
    public native void startEditingNew() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.startEditingNew();
    }-*/;

    /**
     * &#010 Returns the title to show for a node in the tree column.  If the field specifies the&#010 <code>name</code> attribute, then the current <code>node[field.name]</code> is returned.&#010 Otherwise, the result of calling {@link com.smartgwt.client.widgets.tree.Tree#getTitle} on the node is called.&#010 <br><br>&#010 You can override this method to return a custom title for node titles in the tree column.&#010&#010
     *
     * <b>Note</b> : This is an override point
     *
     * @param node      The node for which the title is being requested.
     * @param recordNum The index of the node.
     * @param field     The field for which the title is being requested.
     * @return the title to display.
     */
    protected native String getNodeTitle(Record node, int recordNum, ListGridField field) /*-{
            var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
            var title = self._getNodeTitle(node.@com.smartgwt.client.core.DataClass::getJsObj()(), recordNum, field.@com.smartgwt.client.core.DataClass::getJsObj()());
            return title == null ? "" : title.toString();
    }-*/;

    /**
     * Get the appropriate icon for a node.&#010 <P>&#010 By default icons are derived from {@link com.smartgwt.client.widgets.tree.TreeGrid#getFolderIcon folderIcon} and {@link com.smartgwt.client.widgets.tree.TreeGrid#getNodeIcon nodeIcon}.&#010 Custom icons for individual nodes can be overridden by setting the {@link com.smartgwt.client.widgets.tree.TreeGrid#getCustomIconProperty customIconProperty}&#010 on a node.&#010 <p>&#010 If you want to suppress icons altogether, provide an override of this method that simply&#010 returns null.&#010 <p> &#010 Note that the full icon URL will be derived by applying {@link com.smartgwt.client.widgets.Canvas#getImgURL} to the&#010 value returned from this method.&#010&#010
     * <p>
     * <b>Note</b>: This is an override point
     *
     * @param node tree node in question
     * @param defaultState defaultState
     *
     * @return URL for icon to show for this node
     */
    protected native String getIcon(Record node, boolean defaultState) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        return self._getIcon(node.@com.smartgwt.client.core.DataClass::getJsObj()(), defaultState);
    }-*/;

    /**
     * Set the icon for a particular TreeNode to a specified URL
     * @param node the tree node
     * @param icon path to the resource
     */
    public native void setCustomNodeIcon(Record node, String icon) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        return self.setNodeIcon(node.@com.smartgwt.client.core.DataClass::getJsObj()(), icon);
    }-*/;


    /**
     * Get an additional icon to show between the open icon and folder/node icon for a particular  node. <P> NOTE: If {@link
     * com.smartgwt.client.widgets.grid.ListGrid#getSelectionAppearance selectionAppearance} is <code>"checkbox"</code>, this
     * method will NOT be called. Extra icons cannot be shown for that appearance.
     * <p>
     * <b>Note</b>: This is an override point
     * @param node tree node in question
     *
     * @return URL for the extra icon (null if none required). See {@link com.smartgwt.client.docs.TreeNode TreeNode}
     */
    public native String getExtraIcon(TreeNode node) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        return self._getExtraIcon(node.@com.smartgwt.client.core.DataClass::getJsObj()());
    }-*/;




    /**
     * When the user is dragging a droppable element over this grid, this method returns the folder&#010 which would contain the item if dropped. This is the current drop node if the user is hovering&#010 over a folder, or the node's parent if the user is hovering over a leaf.&#010
     *
     * @return target drop folder
     */
    public native TreeNode getDropFolder() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var node = self.getDropFolder();
        if(node == null || node === undefined) return null;
        return @com.smartgwt.client.widgets.tree.TreeNode::getOrCreateRef(Lcom/google/gwt/core/client/JavaScriptObject;)(node);
    }-*/;

    /**
     * A {@link com.smartgwt.client.widgets.tree.Tree} object containing of nested {@link
     * com.smartgwt.client.widgets.tree.TreeNode}s to  display as rows in this TreeGrid.   The <code>data</code> property will
     * typically not be explicitly specified for  databound TreeGrids, where the data is returned from the server via databound
     * component methods such as <code>fetchData()</code>
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Set the {@link com.smartgwt.client.widgets.tree.Tree} object this TreeGrid will view and manipulate.
     *
     * @param data Tree to show. Default value is null
     */
    public void setData(Tree data) {
        setAttribute("data", data == null ? null : data.getOrCreateJsObj(), true);
    }

    /**
     * A {@link com.smartgwt.client.widgets.tree.Tree} object containing of nested {@link
     * com.smartgwt.client.widgets.tree.TreeNode}s to  display as rows in this TreeGrid.   The <code>data</code> property will
     * typically not be explicitly specified for  databound TreeGrids, where the data is returned from the server via databound
     * component methods such as <code>fetchData()</code>
     *
     *
     * @return Tree
     */
    public Tree getData()  {
        JavaScriptObject jso = getAttributeAsJavaScriptObject("data");
        if (JSOHelper.isScClassInstance(jso) &&
            "ResultTree".equals(JSOHelper.getClassName(jso)))
        {
            return ResultTree.getOrCreateRef(jso);
        }
        return Tree.getOrCreateRef(jso);
    }

    /**
     * Synonym for {@link #getData()}
     *
     * @return the underlying tree
     */
    public Tree getTree() {
        return getData();
    }

    /**
     * For databound TreeGrids, this attribute can be used to customize the ResultTree object 
     * created for this TreeGrid when data is fetched
     *
     * @param resultTreeProperties the data properties
     */
    public void setDataProperties(Tree resultTreeProperties) {
        JavaScriptObject config = resultTreeProperties.getConfig();
        setAttribute("dataProperties", JSOHelper.cleanProperties(config, true), true);
    }

    /**
     * Return the tree nodes as a flat array of ListGridRecords. Internally this method retrieves all the nodes via
     * {@link Tree#getOpenList(TreeNode)}. You should favor working with the underlying {@link #getTree() Tree} data
     * structure when working with a TreeGrid.
     *
     * @return the tree nodes as ListGridRecord's
     */
    public ListGridRecord[] getRecords() {
        Tree tree = getData();
        if(isCreated()){
            TreeNode root = tree.getRoot();
            if(root == null) {
                return null;
            } else {
                return tree.getOpenList(tree.getRoot());
            }
        } else {
            return tree.getData();
        }
    }

    /**
     * You can specify the initial set of data for a databound TreeGrid using this property. The value of this attribute
     * should be a list of <code>parentId</code> linked ${isc.DocUtils.linkForRef('object:TreeNode')}s in a format
     * equivalent to that documented on {@link com.smartgwt.client.widgets.tree.Tree#getData data}.
     * <p/>
     *
     * @param initialData initialData Default value is null
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setInitialData(TreeNode[] initialData) throws IllegalStateException {
        setAttribute("initialData", initialData, false);
    }

    /**
     * Uses a "fetch" operation on the current {@link com.smartgwt.client.data.DataSource} to retrieve data that matches
     * the provided criteria, and displays the matching data in this component as a tree. <P> This method will create a
     * {@link com.smartgwt.client.data.ResultTree} to manage tree data, which will subsequently be available as
     * <code>treeGrid.data</code>.  DataSource records returned by the "fetch" operation are linked into a tree
     * structure according to {@link com.smartgwt.client.data.DataSourceField#getPrimaryKey primaryKey} and {@link
     * com.smartgwt.client.data.DataSourceField#getForeignKey foreignKey} declarations on DataSource fields.  See the
     * {@link com.smartgwt.client.docs.TreeDataBinding} topic for complete details. <P> By default, the created
     * ResultTree will use folder-by-folder load on demand, asking the server for the children of each folder as the
     * user opens it. <P> The {@link com.smartgwt.client.data.ResultTree} created by <code>fetchData()</code> can be
     * customized by setting {@link com.smartgwt.client.widgets.grid.ListGrid#getDataProperties dataProperties} to an
     * Object containing properties and methods to apply to the created ResultTree.  For example, the property that
     * determines whether a node is a folder ({@link com.smartgwt.client.widgets.tree.Tree#getIsFolderProperty
     * isFolderProperty}) can be customized, or level-by-level loading can be disabled via {@link
     * com.smartgwt.client.data.ResultTree#getLoadDataOnDemand loadDataOnDemand}. <P> The callback passed to
     * <code>fetchData</code> will fire once, the first time that data is loaded from the server.  If using
     * folder-by-folder load on demand, use the {@link com.smartgwt.client.data.ResultTree#dataArrived} notification to be
     * notified each time new nodes are loaded. <P> Note that, if criteria are passed to <code>fetchData()</code>, they
     * will be passed every time a new "fetch" operation is sent to the server.  This allows you to retrieve multiple
     * different tree structures from the same DataSource.  However note that the server is expected to always respond
     * with an intact tree - returned nodes which do not have parents are dropped from the dataset and not displayed.
     */
    public native void fetchData() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.fetchData();
    }-*/;

    /**
     * Uses a "fetch" operation on the current {@link com.smartgwt.client.data.DataSource} to retrieve data that matches
     * the provided criteria, and displays the matching data in this component as a tree. <P> This method will create a
     * {@link com.smartgwt.client.data.ResultTree} to manage tree data, which will subsequently be available as
     * <code>treeGrid.data</code>.  DataSource records returned by the "fetch" operation are linked into a tree
     * structure according to {@link com.smartgwt.client.data.DataSourceField#getPrimaryKey primaryKey} and {@link
     * com.smartgwt.client.data.DataSourceField#getForeignKey foreignKey} declarations on DataSource fields.  See the
     * {@link com.smartgwt.client.docs.TreeDataBinding} topic for complete details. <P> By default, the created
     * ResultTree will use folder-by-folder load on demand, asking the server for the children of each folder as the
     * user opens it. <P> The {@link com.smartgwt.client.data.ResultTree} created by <code>fetchData()</code> can be
     * customized by setting {@link com.smartgwt.client.widgets.grid.ListGrid#getDataProperties dataProperties} to an
     * Object containing properties and methods to apply to the created ResultTree.  For example, the property that
     * determines whether a node is a folder ({@link com.smartgwt.client.widgets.tree.Tree#getIsFolderProperty
     * isFolderProperty}) can be customized, or level-by-level loading can be disabled via {@link
     * com.smartgwt.client.data.ResultTree#getLoadDataOnDemand loadDataOnDemand}. <P> The callback passed to
     * <code>fetchData</code> will fire once, the first time that data is loaded from the server.  If using
     * folder-by-folder load on demand, use the {@link com.smartgwt.client.data.ResultTree#dataArrived} notification to be
     * notified each time new nodes are loaded. <P> Note that, if criteria are passed to <code>fetchData()</code>, they
     * will be passed every time a new "fetch" operation is sent to the server.  This allows you to retrieve multiple
     * different tree structures from the same DataSource.  However note that the server is expected to always respond
     * with an intact tree - returned nodes which do not have parents are dropped from the dataset and not displayed.
     *
     * @param criteria Search criteria.                       If a {@link com.smartgwt.client.widgets.form.DynamicForm}
     *                 is passed in as this argument                      instead of a raw criteria object, will be
     *                 derived by calling                      {@link com.smartgwt.client.widgets.form.DynamicForm#getValuesAsCriteria}
     */
    public native void fetchData(Criteria criteria) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.fetchData(criteria == null ? null : criteria.@com.smartgwt.client.data.Criteria::getJsObj()());
    }-*/;

    /**
     * Uses a "fetch" operation on the current {@link com.smartgwt.client.data.DataSource} to retrieve data that matches
     * the provided criteria, and displays the matching data in this component as a tree. <P> This method will create a
     * {@link com.smartgwt.client.data.ResultTree} to manage tree data, which will subsequently be available as
     * <code>treeGrid.data</code>.  DataSource records returned by the "fetch" operation are linked into a tree
     * structure according to {@link com.smartgwt.client.data.DataSourceField#getPrimaryKey primaryKey} and {@link
     * com.smartgwt.client.data.DataSourceField#getForeignKey foreignKey} declarations on DataSource fields.  See the
     * {@link com.smartgwt.client.docs.TreeDataBinding} topic for complete details. <P> By default, the created
     * ResultTree will use folder-by-folder load on demand, asking the server for the children of each folder as the
     * user opens it. <P> The {@link com.smartgwt.client.data.ResultTree} created by <code>fetchData()</code> can be
     * customized by setting {@link com.smartgwt.client.widgets.grid.ListGrid#getDataProperties dataProperties} to an
     * Object containing properties and methods to apply to the created ResultTree.  For example, the property that
     * determines whether a node is a folder ({@link com.smartgwt.client.widgets.tree.Tree#getIsFolderProperty
     * isFolderProperty}) can be customized, or level-by-level loading can be disabled via {@link
     * com.smartgwt.client.data.ResultTree#getLoadDataOnDemand loadDataOnDemand}. <P> The callback passed to
     * <code>fetchData</code> will fire once, the first time that data is loaded from the server.  If using
     * folder-by-folder load on demand, use the {@link com.smartgwt.client.data.ResultTree#dataArrived} notification to be
     * notified each time new nodes are loaded. <P> Note that, if criteria are passed to <code>fetchData()</code>, they
     * will be passed every time a new "fetch" operation is sent to the server.  This allows you to retrieve multiple
     * different tree structures from the same DataSource.  However note that the server is expected to always respond
     * with an intact tree - returned nodes which do not have parents are dropped from the dataset and not displayed.
     *
     * @param criteria Search criteria.                       If a {@link com.smartgwt.client.widgets.form.DynamicForm}
     *                 is passed in as this argument                      instead of a raw criteria object, will be
     *                 derived by calling                      {@link com.smartgwt.client.widgets.form.DynamicForm#getValuesAsCriteria}
     * @param callback callback to invoke when a fetch is complete.  Fires                                          only
     *                 if server contact was required
     */
    public native void fetchData(Criteria criteria, DSCallback callback) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var critJS = criteria == null ? null : criteria.@com.smartgwt.client.data.Criteria::getJsObj()();
        self.fetchData(critJS, $entry(function (dsResponse, data, dsRequest) {
            var responseJ = @com.smartgwt.client.data.DSResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(dsResponse);
            var requestJ = @com.smartgwt.client.data.DSRequest::new(Lcom/google/gwt/core/client/JavaScriptObject;)(dsRequest);
            if(callback != null) callback.@com.smartgwt.client.data.DSCallback::execute(Lcom/smartgwt/client/data/DSResponse;Ljava/lang/Object;Lcom/smartgwt/client/data/DSRequest;)(responseJ, data, requestJ);
        }));
    }-*/;

    /**
     * Uses a "fetch" operation on the current {@link com.smartgwt.client.data.DataSource} to retrieve data that matches
     * the provided criteria, and displays the matching data in this component as a tree. <P> This method will create a
     * {@link com.smartgwt.client.data.ResultTree} to manage tree data, which will subsequently be available as
     * <code>treeGrid.data</code>.  DataSource records returned by the "fetch" operation are linked into a tree
     * structure according to {@link com.smartgwt.client.data.DataSourceField#getPrimaryKey primaryKey} and {@link
     * com.smartgwt.client.data.DataSourceField#getForeignKey foreignKey} declarations on DataSource fields.  See the
     * {@link com.smartgwt.client.docs.TreeDataBinding} topic for complete details. <P> By default, the created
     * ResultTree will use folder-by-folder load on demand, asking the server for the children of each folder as the
     * user opens it. <P> The {@link com.smartgwt.client.data.ResultTree} created by <code>fetchData()</code> can be
     * customized by setting {@link com.smartgwt.client.widgets.grid.ListGrid#getDataProperties dataProperties} to an
     * Object containing properties and methods to apply to the created ResultTree.  For example, the property that
     * determines whether a node is a folder ({@link com.smartgwt.client.widgets.tree.Tree#getIsFolderProperty
     * isFolderProperty}) can be customized, or level-by-level loading can be disabled via {@link
     * com.smartgwt.client.data.ResultTree#getLoadDataOnDemand loadDataOnDemand}. <P> The callback passed to
     * <code>fetchData</code> will fire once, the first time that data is loaded from the server.  If using
     * folder-by-folder load on demand, use the {@link com.smartgwt.client.data.ResultTree#dataArrived} notification to be
     * notified each time new nodes are loaded. <P> Note that, if criteria are passed to <code>fetchData()</code>, they
     * will be passed every time a new "fetch" operation is sent to the server.  This allows you to retrieve multiple
     * different tree structures from the same DataSource.  However note that the server is expected to always respond
     * with an intact tree - returned nodes which do not have parents are dropped from the dataset and not displayed.
     *
     * @param criteria          Search criteria.                       If a {@link com.smartgwt.client.widgets.form.DynamicForm}
     *                          is passed in as this argument                      instead of a raw criteria object,
     *                          will be derived by calling                      {@link com.smartgwt.client.widgets.form.DynamicForm#getValuesAsCriteria}
     * @param callback          callback to invoke when a fetch is complete.  Fires
     *                          only if server contact was required
     * @param requestProperties additional properties to set on the DSRequest
     *                          that will be issued
     */
    public native void fetchData(Criteria criteria, DSCallback callback, DSRequest requestProperties) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var critJS = criteria == null ? null : criteria.@com.smartgwt.client.data.Criteria::getJsObj()();
        var requestPropertiesJS = requestProperties == null ? null : requestProperties.@com.smartgwt.client.core.DataClass::getJsObj()();
        self.fetchData(critJS, $entry(function (dsResponse, data, dsRequest) {
            var responseJ = @com.smartgwt.client.data.DSResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(dsResponse);
            var requestJ = @com.smartgwt.client.data.DSRequest::new(Lcom/google/gwt/core/client/JavaScriptObject;)(dsRequest);
            if(callback != null) callback.@com.smartgwt.client.data.DSCallback::execute(Lcom/smartgwt/client/data/DSResponse;Ljava/lang/Object;Lcom/smartgwt/client/data/DSRequest;)(responseJ, data, requestJ);
        }), requestPropertiesJS);
    }-*/;

    /**
     * Retrieves data that matches the provided criteria and displays the matching data in this component. <P> This
     * method behaves exactly like {@link com.smartgwt.client.widgets.tree.TreeGrid#fetchData} except that {@link
     * com.smartgwt.client.data.DSRequest#getTextMatchStyle textMatchStyle} is automatically set to "substring" so that
     * String-valued fields are matched by case-insensitive substring comparison.
     *
     * @param criteria Search criteria.                       If a {@link com.smartgwt.client.widgets.form.DynamicForm}
     *                 is passed in as this argument                      instead of a raw criteria object, will be
     *                 derived by calling                      {@link com.smartgwt.client.widgets.form.DynamicForm#getValuesAsCriteria}
     */
    public native void filterData(Criteria criteria) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.filterData(criteria == null ? null : criteria.@com.smartgwt.client.data.Criteria::getJsObj()());
    }-*/;

    /**
     * Retrieves data that matches the provided criteria and displays the matching data in this component. <P> This
     * method behaves exactly like {@link com.smartgwt.client.widgets.tree.TreeGrid#fetchData} except that {@link
     * com.smartgwt.client.data.DSRequest#getTextMatchStyle textMatchStyle} is automatically set to "substring" so that
     * String-valued fields are matched by case-insensitive substring comparison.
     *
     * @param criteria Search criteria.                       If a {@link com.smartgwt.client.widgets.form.DynamicForm}
     *                 is passed in as this argument                      instead of a raw criteria object, will be
     *                 derived by calling                      {@link com.smartgwt.client.widgets.form.DynamicForm#getValuesAsCriteria}
     * @param callback callback to invoke when a fetch is complete.  Fires                                          only
     *                 if server contact was required; see                                          {@link
     *                 com.smartgwt.client.widgets.DataBoundComponent#fetchData} for details
     */
    public native void filterData(Criteria criteria, DSCallback callback) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var critJS = criteria == null ? null : criteria.@com.smartgwt.client.data.Criteria::getJsObj()();
        self.filterData(critJS, $entry(function (dsResponse, data, dsRequest) {
            var responseJ = @com.smartgwt.client.data.DSResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(dsResponse);
            var requestJ = @com.smartgwt.client.data.DSRequest::new(Lcom/google/gwt/core/client/JavaScriptObject;)(dsRequest);
            if(callback != null) callback.@com.smartgwt.client.data.DSCallback::execute(Lcom/smartgwt/client/data/DSResponse;Ljava/lang/Object;Lcom/smartgwt/client/data/DSRequest;)(responseJ, data, requestJ);
        }));
    }-*/;

    /**
     * Retrieves data that matches the provided criteria and displays the matching data in this component. <P> This
     * method behaves exactly like {@link com.smartgwt.client.widgets.tree.TreeGrid#fetchData} except that {@link
     * com.smartgwt.client.data.DSRequest#getTextMatchStyle textMatchStyle} is automatically set to "substring" so that
     * String-valued fields are matched by case-insensitive substring comparison.
     *
     * @param criteria          Search criteria.                       If a {@link com.smartgwt.client.widgets.form.DynamicForm}
     *                          is passed in as this argument                      instead of a raw criteria object,
     *                          will be derived by calling                      {@link com.smartgwt.client.widgets.form.DynamicForm#getValuesAsCriteria}
     * @param callback          callback to invoke when a fetch is complete.  Fires
     *                              only if server contact was required; see
     *                          {@link com.smartgwt.client.widgets.DataBoundComponent#fetchData} for details
     * @param requestProperties for databound components only - optional                            additional
     *                          properties to set on the DSRequest that will be issued
     */
    public native void filterData(Criteria criteria, DSCallback callback, DSRequest requestProperties) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var critJS = criteria == null ? null : criteria.@com.smartgwt.client.data.Criteria::getJsObj()();
        var requestPropertiesJS = requestProperties == null ? null : requestProperties.@com.smartgwt.client.core.DataClass::getJsObj()();
        self.filterData(critJS, $entry(function (dsResponse, data, dsRequest) {
            var responseJ = @com.smartgwt.client.data.DSResponse::new(Lcom/google/gwt/core/client/JavaScriptObject;)(dsResponse);
            var requestJ = @com.smartgwt.client.data.DSRequest::new(Lcom/google/gwt/core/client/JavaScriptObject;)(dsRequest);
            if(callback != null) callback.@com.smartgwt.client.data.DSCallback::execute(Lcom/smartgwt/client/data/DSResponse;Ljava/lang/Object;Lcom/smartgwt/client/data/DSRequest;)(responseJ, data, requestJ);
        }), requestPropertiesJS);
    }-*/;

    /**
     * Return the first selected record in this component.<br><br> This method is appropriate if <code>{@link com.smartgwt.client.widgets.grid.ListGrid#getSelectionType selectionType}</code> is <code>"single"</code>, or if you only care about the first selected record in a multiple-record selection. To access all selected records, use <code>{@link com.smartgwt.client.widgets.grid.ListGrid#getSelection}</code> instead.
     *
     * @return first selected record, or null if nothing selected
     */
    public native TreeNode getSelectedRecord() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.getSelectedRecord();
        if(ret == null || ret === undefined) return null;
        var retVal = @com.smartgwt.client.widgets.tree.TreeNode::getOrCreateRef(Lcom/google/gwt/core/client/JavaScriptObject;)(ret);
        return retVal;
    }-*/;

    /**
     * Return the pointer to a particular record by record number. Synonym for {@link com.smartgwt.client.widgets.grid.ListGrid#getCellRecord}.
     * @param recordNum row index of record to return.
     *
     * @return Record object for the row.
     */
    public native TreeNode getRecord(int recordNum) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.getRecord(recordNum);
        if(ret == null || ret === undefined) return null;
        var retVal = @com.smartgwt.client.widgets.tree.TreeNode::getOrCreateRef(Lcom/google/gwt/core/client/JavaScriptObject;)(ret);
        return retVal;
    }-*/;

    /**
     * For databound trees, use this attribute to supply a ${isc.DocUtils.linkForRef('ResultTree.rootValue')} for this component's generated data object. <P>  This property allows you to have a particular component navigate a tree starting from any given node as the root.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param treeRootValue treeRootValue Default value is null
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setTreeRootValue(String treeRootValue) throws IllegalStateException {
        setAttribute("treeRootValue", treeRootValue, false);
    }

    /**
     * For databound trees, use this attribute to supply a ${isc.DocUtils.linkForRef('ResultTree.rootValue')} for this component's generated data object. <P>  This property allows you to have a particular component navigate a tree starting from any given node as the root.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param treeRootValue treeRootValue Default value is null
     * @throws IllegalStateException this property cannot be changed after the component has been created
     */
    public void setTreeRootValue(Integer treeRootValue) throws IllegalStateException {
        setAttribute("treeRootValue", treeRootValue, false);
    }

    /**
     * For databound trees, use this attribute to supply a ${isc.DocUtils.linkForRef('ResultTree.rootValue')} for this component's generated data object. <P>  This property allows you to have a particular component navigate a tree starting from any given node as the root.
     *
     * @return tree root value as String
     */
    public String getTreeRootValue() {
        return getAttribute("treeRootValue");
    }

    /**
     * Return the horizontal alignment for cell contents. Default implementation will always left-align the special {@link
     * com.smartgwt.client.widgets.tree.TreeGridField#getTreeField treeField} [or right-align if the page is in RTL mode] -
     * otherwise will return {@link com.smartgwt.client.widgets.grid.ListGridField#getCellAlign cellAlign} if specified,
     * otherwise {@link com.smartgwt.client.widgets.grid.ListGridField#getAlign align}.
     * @param record this cell's record
     * @param rowNum row number for the cell
     * @param colNum column number of the cell
     *
     * @return Horizontal alignment of cell contents: 'right', 'center', or 'left'
     */
    public native Alignment getCellAlign(ListGridRecord record, int rowNum, int colNum) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var recordJS = record.@com.smartgwt.client.data.Record::getJsObj()();
        var ret = self.getCellAlign(recordJS, rowNum, colNum);
        if(ret == null || ret === undefined) return null;
        var enumValues = @com.smartgwt.client.types.Alignment::values()();
        return @com.smartgwt.client.util.EnumUtil::getEnum([Lcom/smartgwt/client/types/ValueEnum;Ljava/lang/String;)(enumValues, ret);
    }-*/;

    @Override
    public native void setCellValueHoverFormatter(CellValueHoverFormatter formatter) /*-{
        var self;
        if (this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            self = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
        } else {
            self = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
        }

        var newCellValueHoverHTMLFun;
        if (formatter == null) {
            newCellValueHoverHTMLFun = $wnd.isc[this.@com.smartgwt.client.widgets.BaseWidget::scClassName].getInstanceProperty("cellValueHoverHTML");
        } else {
            newCellValueHoverHTMLFun = $entry(function (record, rowNum, colNum, defaultHTML) {
                var nodeJ = @com.smartgwt.client.widgets.tree.TreeNode::getOrCreateRef(Lcom/google/gwt/core/client/JavaScriptObject;)(record);
                return formatter.@com.smartgwt.client.widgets.grid.CellValueHoverFormatter::getHoverHTML(Lcom/smartgwt/client/widgets/grid/ListGridRecord;IILjava/lang/String;)(nodeJ, rowNum, colNum, defaultHTML);
            });
        }
        self.cellValueHoverHTML = newCellValueHoverHTMLFun;
    }-*/;

    /**
     * This method overrides {@link com.smartgwt.client.widgets.grid.ListGrid#willAcceptDrop} and works as follows: <br><br>
     * First, {@link com.smartgwt.client.widgets.grid.ListGrid#willAcceptDrop} (the superclass definition) is consulted.  If it
     * returns false, then this method returns false immediately.<br> This handles the following cases:<br> - reordering of
     * records within this TreeGrid when {@link com.smartgwt.client.widgets.grid.ListGrid#getCanReorderRecords
     * canReorderRecords} is true<br> - accepting dropped records from another dragTarget when {@link
     * com.smartgwt.client.widgets.grid.ListGrid#getCanAcceptDroppedRecords canAcceptDroppedRecords}    is true and the
     * dragTarget gives us a valid set of records to drop into place.<br> - disallowing drop over disabled nodes, or nodes with
     * <code>canAcceptDrop:false</code> <br> This method will also return false if the drop occurred over a leaf node whose
     * immediate  parent has <code>canAcceptDrop</code> set to <code>false</code><br> If {@link
     * com.smartgwt.client.widgets.tree.TreeGrid#getCanReparentNodes canReparentNodes} is true, and the user is dragging a node
     * from one folder to another, this method will return true to allow the change of parent folder.<br> <br><br> Otherwise
     * this method returns true.
     * <b>  Note: </b> This is an override point.
     *
     * @return true if this component will accept a drop of the dragData
     */
    public Boolean willAcceptDrop() {
    	return super.willAcceptDrop();
    }

    /**
     * This ListGrid superclass event does not fire on a TreeGrid, use {@link #addFolderDropHandler(com.smartgwt.client.widgets.tree.events.FolderDropHandler)} instead.
     *
     * @param handler the onRecordDrop handler
     * @return {@link HandlerRegistration} used to remove this handler
     *
     * @throws UnsupportedOperationException
     */
    public HandlerRegistration addRecordDropHandler(com.smartgwt.client.widgets.grid.events.RecordDropHandler handler) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("This event inherited from ListGrid does not fire for a TreeGrid. Use TreeGrid.addFolderDropHandler instead.");
    }

    public LogicalStructureObject setLogicalStructure(TreeGridLogicalStructure s) {
        super.setLogicalStructure(s);
        try {
            s.alwaysShowOpener = getAttributeAsString("alwaysShowOpener");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.alwaysShowOpener:" + t.getMessage() + "\n";
        }
        try {
            s.animateFolderEffect = getAttributeAsString("animateFolderEffect");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.animateFolderEffect:" + t.getMessage() + "\n";
        }
        try {
            s.animateFolderMaxRows = getAttributeAsString("animateFolderMaxRows");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.animateFolderMaxRows:" + t.getMessage() + "\n";
        }
        try {
            s.animateFolders = getAttributeAsString("animateFolders");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.animateFolders:" + t.getMessage() + "\n";
        }
        try {
            s.animateFolderSpeed = getAttributeAsString("animateFolderSpeed");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.animateFolderSpeed:" + t.getMessage() + "\n";
        }
        try {
            s.animateFolderTime = getAttributeAsString("animateFolderTime");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.animateFolderTime:" + t.getMessage() + "\n";
        }
        try {
            s.autoFetchTextMatchStyle = getAttributeAsString("autoFetchTextMatchStyle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.autoFetchTextMatchStyle:" + t.getMessage() + "\n";
        }
        try {
            s.autoPreserveOpenState = getAttributeAsString("autoPreserveOpenState");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.autoPreserveOpenState:" + t.getMessage() + "\n";
        }
        try {
            s.canAcceptDroppedRecords = getAttributeAsString("canAcceptDroppedRecords");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.canAcceptDroppedRecords:" + t.getMessage() + "\n";
        }
        try {
            s.canDragRecordsOut = getAttributeAsString("canDragRecordsOut");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.canDragRecordsOut:" + t.getMessage() + "\n";
        }
        try {
            s.canDropOnLeaves = getAttributeAsString("canDropOnLeaves");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.canDropOnLeaves:" + t.getMessage() + "\n";
        }
        try {
            s.canReorderRecords = getAttributeAsString("canReorderRecords");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.canReorderRecords:" + t.getMessage() + "\n";
        }
        try {
            s.canReparentNodes = getAttributeAsString("canReparentNodes");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.canReparentNodes:" + t.getMessage() + "\n";
        }
        try {
            s.canSelectAll = getAttributeAsString("canSelectAll");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.canSelectAll:" + t.getMessage() + "\n";
        }
        try {
            s.cantDragIntoChildMessage = getAttributeAsString("cantDragIntoChildMessage");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.cantDragIntoChildMessage:" + t.getMessage() + "\n";
        }
        try {
            s.cantDragIntoSelfMessage = getAttributeAsString("cantDragIntoSelfMessage");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.cantDragIntoSelfMessage:" + t.getMessage() + "\n";
        }
        try {
            s.cascadeSelection = getAttributeAsString("cascadeSelection");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.cascadeSelection:" + t.getMessage() + "\n";
        }
        try {
            s.closedIconSuffix = getAttributeAsString("closedIconSuffix");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.closedIconSuffix:" + t.getMessage() + "\n";
        }
        try {
            s.connectorImage = getAttributeAsString("connectorImage");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.connectorImage:" + t.getMessage() + "\n";
        }
        try {
            s.createDefaultTreeField = getAttributeAsString("createDefaultTreeField");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.createDefaultTreeField:" + t.getMessage() + "\n";
        }
        try {
            s.customIconDropProperty = getAttributeAsString("customIconDropProperty");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.customIconDropProperty:" + t.getMessage() + "\n";
        }
        try {
            s.customIconOpenProperty = getAttributeAsString("customIconOpenProperty");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.customIconOpenProperty:" + t.getMessage() + "\n";
        }
        try {
            s.customIconProperty = getAttributeAsString("customIconProperty");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.customIconProperty:" + t.getMessage() + "\n";
        }
        try {
            s.dataFetchMode = getAttributeAsString("dataFetchMode");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.dataFetchMode:" + t.getMessage() + "\n";
        }
        try {
            s.dataProperties = getDataProperties();
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.dataProperties:" + t.getMessage() + "\n";
        }
        try {
            s.dataSourceAsDataSource = getDataSource();
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.dataSourceAsDataSource:" + t.getMessage() + "\n";
        }
        try {
            s.dataSourceAsString = getAttributeAsString("dataSource");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.dataSourceAsString:" + t.getMessage() + "\n";
        }
        try {
            s.displayNodeType = getAttributeAsString("displayNodeType");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.displayNodeType:" + t.getMessage() + "\n";
        }
        try {
            s.dropIconSuffix = getAttributeAsString("dropIconSuffix");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.dropIconSuffix:" + t.getMessage() + "\n";
        }
        try {
            s.extraIconGap = getAttributeAsString("extraIconGap");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.extraIconGap:" + t.getMessage() + "\n";
        }
        try {
            s.folderIcon = getAttributeAsString("folderIcon");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.folderIcon:" + t.getMessage() + "\n";
        }
        try {
            s.iconSize = getAttributeAsString("iconSize");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.iconSize:" + t.getMessage() + "\n";
        }
        try {
            s.indentRecordComponents = getAttributeAsString("indentRecordComponents");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.indentRecordComponents:" + t.getMessage() + "\n";
        }
        try {
            s.indentSize = getAttributeAsString("indentSize");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.indentSize:" + t.getMessage() + "\n";
        }
        try {
            s.keepParentsOnFilter = getAttributeAsString("keepParentsOnFilter");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.keepParentsOnFilter:" + t.getMessage() + "\n";
        }
        try {
            s.leaveSelectionCheckboxGap = getAttributeAsString("leaveSelectionCheckboxGap");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.leaveSelectionCheckboxGap:" + t.getMessage() + "\n";
        }
        try {
            s.loadDataOnDemand = getAttributeAsString("loadDataOnDemand");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.loadDataOnDemand:" + t.getMessage() + "\n";
        }
        try {
            s.manyItemsImage = getAttributeAsString("manyItemsImage");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.manyItemsImage:" + t.getMessage() + "\n";
        }
        try {
            s.nodeIcon = getAttributeAsString("nodeIcon");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.nodeIcon:" + t.getMessage() + "\n";
        }
        try {
            s.offlineNodeMessage = getAttributeAsString("offlineNodeMessage");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.offlineNodeMessage:" + t.getMessage() + "\n";
        }
        try {
            s.openerIconHeight = getAttributeAsString("openerIconHeight");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.openerIconHeight:" + t.getMessage() + "\n";
        }
        try {
            s.openerIconSize = getAttributeAsString("openerIconSize");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.openerIconSize:" + t.getMessage() + "\n";
        }
        try {
            s.openerIconWidth = getAttributeAsString("openerIconWidth");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.openerIconWidth:" + t.getMessage() + "\n";
        }
        try {
            s.openerImage = getAttributeAsString("openerImage");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.openerImage:" + t.getMessage() + "\n";
        }
        try {
            s.openIconSuffix = getAttributeAsString("openIconSuffix");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.openIconSuffix:" + t.getMessage() + "\n";
        }
        try {
            s.parentAlreadyContainsChildMessage = getAttributeAsString("parentAlreadyContainsChildMessage");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.parentAlreadyContainsChildMessage:" + t.getMessage() + "\n";
        }
        try {
            s.recordDropAppearance = getAttributeAsString("recordDropAppearance");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.recordDropAppearance:" + t.getMessage() + "\n";
        }
        try {
            s.selectionProperty = getAttributeAsString("selectionProperty");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.selectionProperty:" + t.getMessage() + "\n";
        }
        try {
            s.separateFolders = getAttributeAsString("separateFolders");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.separateFolders:" + t.getMessage() + "\n";
        }
        try {
            s.serverFilterFields = getAttributeAsStringArray("serverFilterFields");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.serverFilterFieldsArray:" + t.getMessage() + "\n";
        }
        try {
            s.showConnectors = getAttributeAsString("showConnectors");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.showConnectors:" + t.getMessage() + "\n";
        }
        try {
            s.showCustomIconDrop = getAttributeAsString("showCustomIconDrop");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.showCustomIconDrop:" + t.getMessage() + "\n";
        }
        try {
            s.showCustomIconOpen = getAttributeAsString("showCustomIconOpen");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.showCustomIconOpen:" + t.getMessage() + "\n";
        }
        try {
            s.showDisabledSelectionCheckbox = getAttributeAsString("showDisabledSelectionCheckbox");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.showDisabledSelectionCheckbox:" + t.getMessage() + "\n";
        }
        try {
            s.showDropIcons = getAttributeAsString("showDropIcons");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.showDropIcons:" + t.getMessage() + "\n";
        }
        try {
            s.showFullConnectors = getAttributeAsString("showFullConnectors");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.showFullConnectors:" + t.getMessage() + "\n";
        }
        try {
            s.showOpener = getAttributeAsString("showOpener");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.showOpener:" + t.getMessage() + "\n";
        }
        try {
            s.showOpenIcons = getAttributeAsString("showOpenIcons");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.showOpenIcons:" + t.getMessage() + "\n";
        }
        try {
            s.showPartialSelection = getAttributeAsString("showPartialSelection");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.showPartialSelection:" + t.getMessage() + "\n";
        }
        try {
            s.showRoot = getAttributeAsString("showRoot");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.showRoot:" + t.getMessage() + "\n";
        }
        try {
            s.sortFoldersBeforeLeaves = getAttributeAsString("sortFoldersBeforeLeaves");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.sortFoldersBeforeLeaves:" + t.getMessage() + "\n";
        }
        try {
            s.treeFieldTitle = getAttributeAsString("treeFieldTitle");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.treeFieldTitle:" + t.getMessage() + "\n";
        }
        try {
            s.treeRootValue = getAttributeAsString("treeRootValue");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.treeRootValue:" + t.getMessage() + "\n";
        }
        try {
            s.useAllDataSourceFields = getAttributeAsString("useAllDataSourceFields");
        } catch (Throwable t) {
            s.logicalStructureErrors += "TreeGrid.useAllDataSourceFields:" + t.getMessage() + "\n";
        }
        return s;
    }

    public LogicalStructureObject getLogicalStructure() {
        TreeGridLogicalStructure s = new TreeGridLogicalStructure();
        setLogicalStructure(s);
        return s;
    }
}


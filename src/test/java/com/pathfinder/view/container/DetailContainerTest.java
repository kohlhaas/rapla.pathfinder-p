/**
 * 
 */
package com.pathfinder.view.container;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.pathfinder.model.RoomModel;
import com.vaadin.data.util.BeanItem;
import com.vaadin.ui.AbstractOrderedLayout;
import com.vaadin.ui.CustomComponent;

/**
 * @author tim
 * 
 */
public class DetailContainerTest {

	private DetailContainer<?> detailContainer;

	@Before
	public void initialize() {
		RoomModel model = new RoomModel("Name", "Link", "Id", new String[] {
				"Searchfield 1", "Searchfield 2" }, "Room Number", "Room Type",
				"Course", "Department");
		detailContainer = new DetailContainer<RoomModel>(RoomModel.class,
				new BeanItem<RoomModel>(model), "");
	}

	@Test
	public void buildLayoutTest() {
		// TODO: to be continued when DetailImage implemented

		detailContainer.buildLayout();

		// Check if Root Layout has three components (AccordionView, Keyboard
		// and Searchfield)
		AbstractOrderedLayout rootLayout = (AbstractOrderedLayout) ((CustomComponent) detailContainer)
				.iterator().next();
		Assert.assertEquals(2, rootLayout.getComponentCount());
	}
}

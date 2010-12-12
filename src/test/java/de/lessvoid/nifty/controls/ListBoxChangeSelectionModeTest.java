package de.lessvoid.nifty.controls;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import de.lessvoid.nifty.controls.ListBox;
import de.lessvoid.nifty.controls.ListBoxSelectionModeMulti;
import de.lessvoid.nifty.controls.ListBoxSelectionModeSingle;
import de.lessvoid.nifty.controls.listbox.ListBoxImpl;
import de.lessvoid.nifty.controls.listbox.TestItem;

public class ListBoxChangeSelectionModeTest {
  private ListBox<TestItem> listBox = new ListBoxImpl<TestItem>();
  private TestItem o1 = new TestItem("o1");
  private TestItem o2 = new TestItem("o2");

  @Before
  public void before() {
    listBox.addItem(o1);
    listBox.addItem(o2);
  }

  @Test
  public void testChangeFromDefaultToMultipleWithoutSelection() {
    listBox.changeSelectionMode(new ListBoxSelectionModeMulti<TestItem>());
    assertSelection();
  }

  @Test
  public void testChangeFromDefaultToMultipleWithSingleSelection() {
    listBox.selectItemByIndex(0);
    listBox.changeSelectionMode(new ListBoxSelectionModeMulti<TestItem>());
    assertSelection(o1);
  }

  @Test
  public void testChangeFromMultipleToSingleWithoutSelection() {
    listBox.changeSelectionMode(new ListBoxSelectionModeMulti<TestItem>());
    listBox.changeSelectionMode(new ListBoxSelectionModeSingle<TestItem>());
    assertSelection();
  }

  @Test
  public void testChangeFromMultipleToSingleWithSingleSelection() {
    listBox.changeSelectionMode(new ListBoxSelectionModeMulti<TestItem>());
    listBox.selectItem(o1);
    listBox.changeSelectionMode(new ListBoxSelectionModeSingle<TestItem>());
    assertSelection(o1);
  }

  @Test
  public void testChangeFromMultipleToSingleWithMultipleSelection() {
    listBox.changeSelectionMode(new ListBoxSelectionModeMulti<TestItem>());
    listBox.selectItem(o1);
    listBox.selectItem(o2);
    listBox.changeSelectionMode(new ListBoxSelectionModeSingle<TestItem>());
    assertSelection(o1);
  }

  private void assertSelection(final Object ... selection) {
    assertEquals(selection.length, listBox.getSelection().size());
    int i = 0;
    for (Object o : selection) {
      assertEquals(o, listBox.getSelection().get(i));
      i++;
    }
  }
}

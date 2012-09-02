package de.lessvoid.nifty.renderer.lwjgl2.render;

import org.lwjgl.input.Cursor;

import de.lessvoid.nifty.spi.render.MouseCursor;

public class LwjglMouseCursor implements MouseCursor {
  private Cursor cursor;

  public LwjglMouseCursor(final Cursor cursor) {
    this.cursor = cursor;
  }

  public void dispose() {
    cursor.destroy();
  }

  Cursor getCursor() {
    return cursor;
  }
}

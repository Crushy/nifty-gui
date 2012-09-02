package de.lessvoid.nifty.renderer.lwjgl2.render;

import de.lessvoid.nifty.renderer.lwjgl2.render.font.CharacterInfo;
import de.lessvoid.nifty.renderer.lwjgl2.render.font.Font;
import de.lessvoid.nifty.spi.render.RenderDevice;
import de.lessvoid.nifty.spi.render.RenderFont;
import de.lessvoid.nifty.tools.resourceloader.NiftyResourceLoader;

public class LwjglRenderFont2 implements RenderFont {
  private Font font;

  public LwjglRenderFont2(final String name, final RenderDevice device, final NiftyResourceLoader resourceLoader) {
    //font = new Font(device, resourceLoader);
    //font.init(name);
  }

  public int getHeight() {
    return 1;//return font.getHeight();
  }

  public int getWidth(final String text) {
    return 1;//return font.getStringWidth(text, 1.f);
  }

  public int getWidth(final String text, final float size) {
    return 1;//return font.getStringWidth(text, size);
  }

  public static int getKerning(final CharacterInfo charInfoC, final char nextc) {
    Integer kern = charInfoC.getKerning().get(Character.valueOf(nextc));
    if (kern != null) {
      return kern.intValue();
    }
    return 0;
  }

  public int getCharacterAdvance(final char currentCharacter, final char nextCharacter, final float size) {
    return font.getCharacterWidth(currentCharacter, nextCharacter, size);
  }

  public Font getFont() {
    return font;
  }

  public void dispose() {
  }  
}

package de.lessvoid.nifty.controls;

import de.lessvoid.nifty.render.NiftyImage;

/**
 * The ImageSelect control allows the selection of an image from a predefined
 * set of images.
 * @author void
 */
public interface ImageSelect extends NiftyControl {

  /**
   * Select the previous image (if possible).
   */
  void backClick();

  /**
   * Select the next image (if possible).
   */
  void forwardClick();

  /**
   * Add another image to the possible selection.
   * @param image the image
   */
  void addImage(NiftyImage image);

  /**
   * Get the current selected image index.
   * @return image index
   */
  int getSelectedImageIndex();

  /**
   * Set the current image index which will select this image. If the
   * imageIndex is not valid nothing is changed.
   * @param imageIndex image index
   */
  void setSelectedImageIndex(int imageIndex);

  /**
   * Remove Image.
   * @param image image
   */
  void removeImage(NiftyImage image);

  /**
   * Number of images
   * @Return Number of images
   */
  int getImageCount();
}

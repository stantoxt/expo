package expo.modules.image;

import android.view.View;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

import androidx.appcompat.widget.AppCompatCheckBox;

public class ExpoImageManager extends SimpleViewManager<View> {
  private static final String REACT_CLASS = "ExpoImage";

  @Override
  public String getName() {
    return REACT_CLASS;
  }

  @Override
  public View createViewInstance(ThemedReactContext c) {
    // TODO: Implement some actually useful functionality
    AppCompatCheckBox cb = new AppCompatCheckBox(c);
    cb.setChecked(true);
    return cb;
  }
}

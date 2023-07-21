// Generated by view binder compiler. Do not edit!
package com.vedantlaheri.videon.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.vedantlaheri.videon.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SpeedDialogBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final AppCompatImageButton minusBtn;

  @NonNull
  public final AppCompatImageButton plusBtn;

  @NonNull
  public final CheckBox speedCheckBox;

  @NonNull
  public final TextView speedText;

  private SpeedDialogBinding(@NonNull LinearLayout rootView, @NonNull AppCompatImageButton minusBtn,
      @NonNull AppCompatImageButton plusBtn, @NonNull CheckBox speedCheckBox,
      @NonNull TextView speedText) {
    this.rootView = rootView;
    this.minusBtn = minusBtn;
    this.plusBtn = plusBtn;
    this.speedCheckBox = speedCheckBox;
    this.speedText = speedText;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SpeedDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SpeedDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.speed_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SpeedDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.minusBtn;
      AppCompatImageButton minusBtn = ViewBindings.findChildViewById(rootView, id);
      if (minusBtn == null) {
        break missingId;
      }

      id = R.id.plusBtn;
      AppCompatImageButton plusBtn = ViewBindings.findChildViewById(rootView, id);
      if (plusBtn == null) {
        break missingId;
      }

      id = R.id.speedCheckBox;
      CheckBox speedCheckBox = ViewBindings.findChildViewById(rootView, id);
      if (speedCheckBox == null) {
        break missingId;
      }

      id = R.id.speedText;
      TextView speedText = ViewBindings.findChildViewById(rootView, id);
      if (speedText == null) {
        break missingId;
      }

      return new SpeedDialogBinding((LinearLayout) rootView, minusBtn, plusBtn, speedCheckBox,
          speedText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

// Generated by view binder compiler. Do not edit!
package com.vedantlaheri.videon.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.vedantlaheri.videon.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class VideoMoreFeaturesBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final MaterialButton deleteBtn;

  @NonNull
  public final MaterialButton infoBtn;

  @NonNull
  public final MaterialButton renameBtn;

  @NonNull
  public final MaterialButton shareBtn;

  private VideoMoreFeaturesBinding(@NonNull LinearLayout rootView,
      @NonNull MaterialButton deleteBtn, @NonNull MaterialButton infoBtn,
      @NonNull MaterialButton renameBtn, @NonNull MaterialButton shareBtn) {
    this.rootView = rootView;
    this.deleteBtn = deleteBtn;
    this.infoBtn = infoBtn;
    this.renameBtn = renameBtn;
    this.shareBtn = shareBtn;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static VideoMoreFeaturesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static VideoMoreFeaturesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.video_more_features, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static VideoMoreFeaturesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.deleteBtn;
      MaterialButton deleteBtn = ViewBindings.findChildViewById(rootView, id);
      if (deleteBtn == null) {
        break missingId;
      }

      id = R.id.infoBtn;
      MaterialButton infoBtn = ViewBindings.findChildViewById(rootView, id);
      if (infoBtn == null) {
        break missingId;
      }

      id = R.id.renameBtn;
      MaterialButton renameBtn = ViewBindings.findChildViewById(rootView, id);
      if (renameBtn == null) {
        break missingId;
      }

      id = R.id.shareBtn;
      MaterialButton shareBtn = ViewBindings.findChildViewById(rootView, id);
      if (shareBtn == null) {
        break missingId;
      }

      return new VideoMoreFeaturesBinding((LinearLayout) rootView, deleteBtn, infoBtn, renameBtn,
          shareBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

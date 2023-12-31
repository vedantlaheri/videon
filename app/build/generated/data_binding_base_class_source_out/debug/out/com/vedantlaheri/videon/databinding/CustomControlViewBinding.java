// Generated by view binder compiler. Do not edit!
package com.vedantlaheri.videon.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import com.vedantlaheri.videon.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CustomControlViewBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton backBtn;

  @NonNull
  public final LinearLayout bottomController;

  @NonNull
  public final TextView exoDuration;

  @NonNull
  public final TextView exoPosition;

  @NonNull
  public final DefaultTimeBar exoProgress;

  @NonNull
  public final ImageButton fullScreenBtn;

  @NonNull
  public final ImageButton moreFeaturesBtn;

  @NonNull
  public final ImageButton nextBtn;

  @NonNull
  public final ImageButton orientationBtn;

  @NonNull
  public final ImageButton playPauseBtn;

  @NonNull
  public final ImageButton prevBtn;

  @NonNull
  public final ImageButton repeatBtn;

  @NonNull
  public final LinearLayout topController;

  @NonNull
  public final TextView videoTitle;

  private CustomControlViewBinding(@NonNull ConstraintLayout rootView, @NonNull ImageButton backBtn,
      @NonNull LinearLayout bottomController, @NonNull TextView exoDuration,
      @NonNull TextView exoPosition, @NonNull DefaultTimeBar exoProgress,
      @NonNull ImageButton fullScreenBtn, @NonNull ImageButton moreFeaturesBtn,
      @NonNull ImageButton nextBtn, @NonNull ImageButton orientationBtn,
      @NonNull ImageButton playPauseBtn, @NonNull ImageButton prevBtn,
      @NonNull ImageButton repeatBtn, @NonNull LinearLayout topController,
      @NonNull TextView videoTitle) {
    this.rootView = rootView;
    this.backBtn = backBtn;
    this.bottomController = bottomController;
    this.exoDuration = exoDuration;
    this.exoPosition = exoPosition;
    this.exoProgress = exoProgress;
    this.fullScreenBtn = fullScreenBtn;
    this.moreFeaturesBtn = moreFeaturesBtn;
    this.nextBtn = nextBtn;
    this.orientationBtn = orientationBtn;
    this.playPauseBtn = playPauseBtn;
    this.prevBtn = prevBtn;
    this.repeatBtn = repeatBtn;
    this.topController = topController;
    this.videoTitle = videoTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CustomControlViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CustomControlViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.custom_control_view, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CustomControlViewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backBtn;
      ImageButton backBtn = ViewBindings.findChildViewById(rootView, id);
      if (backBtn == null) {
        break missingId;
      }

      id = R.id.bottomController;
      LinearLayout bottomController = ViewBindings.findChildViewById(rootView, id);
      if (bottomController == null) {
        break missingId;
      }

      id = R.id.exo_duration;
      TextView exoDuration = ViewBindings.findChildViewById(rootView, id);
      if (exoDuration == null) {
        break missingId;
      }

      id = R.id.exo_position;
      TextView exoPosition = ViewBindings.findChildViewById(rootView, id);
      if (exoPosition == null) {
        break missingId;
      }

      id = R.id.exo_progress;
      DefaultTimeBar exoProgress = ViewBindings.findChildViewById(rootView, id);
      if (exoProgress == null) {
        break missingId;
      }

      id = R.id.fullScreenBtn;
      ImageButton fullScreenBtn = ViewBindings.findChildViewById(rootView, id);
      if (fullScreenBtn == null) {
        break missingId;
      }

      id = R.id.moreFeaturesBtn;
      ImageButton moreFeaturesBtn = ViewBindings.findChildViewById(rootView, id);
      if (moreFeaturesBtn == null) {
        break missingId;
      }

      id = R.id.nextBtn;
      ImageButton nextBtn = ViewBindings.findChildViewById(rootView, id);
      if (nextBtn == null) {
        break missingId;
      }

      id = R.id.orientationBtn;
      ImageButton orientationBtn = ViewBindings.findChildViewById(rootView, id);
      if (orientationBtn == null) {
        break missingId;
      }

      id = R.id.playPauseBtn;
      ImageButton playPauseBtn = ViewBindings.findChildViewById(rootView, id);
      if (playPauseBtn == null) {
        break missingId;
      }

      id = R.id.prevBtn;
      ImageButton prevBtn = ViewBindings.findChildViewById(rootView, id);
      if (prevBtn == null) {
        break missingId;
      }

      id = R.id.repeatBtn;
      ImageButton repeatBtn = ViewBindings.findChildViewById(rootView, id);
      if (repeatBtn == null) {
        break missingId;
      }

      id = R.id.topController;
      LinearLayout topController = ViewBindings.findChildViewById(rootView, id);
      if (topController == null) {
        break missingId;
      }

      id = R.id.videoTitle;
      TextView videoTitle = ViewBindings.findChildViewById(rootView, id);
      if (videoTitle == null) {
        break missingId;
      }

      return new CustomControlViewBinding((ConstraintLayout) rootView, backBtn, bottomController,
          exoDuration, exoPosition, exoProgress, fullScreenBtn, moreFeaturesBtn, nextBtn,
          orientationBtn, playPauseBtn, prevBtn, repeatBtn, topController, videoTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

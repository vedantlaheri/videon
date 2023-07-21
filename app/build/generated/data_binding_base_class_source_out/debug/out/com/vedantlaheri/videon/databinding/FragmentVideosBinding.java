// Generated by view binder compiler. Do not edit!
package com.vedantlaheri.videon.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.vedantlaheri.videon.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentVideosBinding implements ViewBinding {
  @NonNull
  private final SwipeRefreshLayout rootView;

  @NonNull
  public final RecyclerView VideoRV;

  @NonNull
  public final ExtendedFloatingActionButton nowPlayingBtn;

  @NonNull
  public final TextView totalVideos;

  private FragmentVideosBinding(@NonNull SwipeRefreshLayout rootView, @NonNull RecyclerView VideoRV,
      @NonNull ExtendedFloatingActionButton nowPlayingBtn, @NonNull TextView totalVideos) {
    this.rootView = rootView;
    this.VideoRV = VideoRV;
    this.nowPlayingBtn = nowPlayingBtn;
    this.totalVideos = totalVideos;
  }

  @Override
  @NonNull
  public SwipeRefreshLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentVideosBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentVideosBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_videos, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentVideosBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.VideoRV;
      RecyclerView VideoRV = ViewBindings.findChildViewById(rootView, id);
      if (VideoRV == null) {
        break missingId;
      }

      id = R.id.nowPlayingBtn;
      ExtendedFloatingActionButton nowPlayingBtn = ViewBindings.findChildViewById(rootView, id);
      if (nowPlayingBtn == null) {
        break missingId;
      }

      id = R.id.totalVideos;
      TextView totalVideos = ViewBindings.findChildViewById(rootView, id);
      if (totalVideos == null) {
        break missingId;
      }

      return new FragmentVideosBinding((SwipeRefreshLayout) rootView, VideoRV, nowPlayingBtn,
          totalVideos);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
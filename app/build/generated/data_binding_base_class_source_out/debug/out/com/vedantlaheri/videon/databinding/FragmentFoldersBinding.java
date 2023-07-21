// Generated by view binder compiler. Do not edit!
package com.vedantlaheri.videon.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.vedantlaheri.videon.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentFoldersBinding implements ViewBinding {
  @NonNull
  private final LinearLayoutCompat rootView;

  @NonNull
  public final RecyclerView FoldersRV;

  @NonNull
  public final TextView totalFolders;

  private FragmentFoldersBinding(@NonNull LinearLayoutCompat rootView,
      @NonNull RecyclerView FoldersRV, @NonNull TextView totalFolders) {
    this.rootView = rootView;
    this.FoldersRV = FoldersRV;
    this.totalFolders = totalFolders;
  }

  @Override
  @NonNull
  public LinearLayoutCompat getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFoldersBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFoldersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_folders, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFoldersBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.FoldersRV;
      RecyclerView FoldersRV = ViewBindings.findChildViewById(rootView, id);
      if (FoldersRV == null) {
        break missingId;
      }

      id = R.id.totalFolders;
      TextView totalFolders = ViewBindings.findChildViewById(rootView, id);
      if (totalFolders == null) {
        break missingId;
      }

      return new FragmentFoldersBinding((LinearLayoutCompat) rootView, FoldersRV, totalFolders);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

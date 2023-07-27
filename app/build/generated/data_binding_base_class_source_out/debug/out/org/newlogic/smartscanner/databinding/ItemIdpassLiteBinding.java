// Generated by view binder compiler. Do not edit!
package org.newlogic.smartscanner.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.newlogic.smartscanner.R;

public final class ItemIdpassLiteBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatImageView icon;

  @NonNull
  public final ConstraintLayout item;

  @NonNull
  public final View separator;

  @NonNull
  public final TextView txtIdpass;

  private ItemIdpassLiteBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatImageView icon, @NonNull ConstraintLayout item, @NonNull View separator,
      @NonNull TextView txtIdpass) {
    this.rootView = rootView;
    this.icon = icon;
    this.item = item;
    this.separator = separator;
    this.txtIdpass = txtIdpass;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemIdpassLiteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemIdpassLiteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_idpass_lite, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemIdpassLiteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.icon;
      AppCompatImageView icon = rootView.findViewById(id);
      if (icon == null) {
        break missingId;
      }

      ConstraintLayout item = (ConstraintLayout) rootView;

      id = R.id.separator;
      View separator = rootView.findViewById(id);
      if (separator == null) {
        break missingId;
      }

      id = R.id.txt_idpass;
      TextView txtIdpass = rootView.findViewById(id);
      if (txtIdpass == null) {
        break missingId;
      }

      return new ItemIdpassLiteBinding((ConstraintLayout) rootView, icon, item, separator,
          txtIdpass);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
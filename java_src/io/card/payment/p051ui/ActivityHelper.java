package io.card.payment.p051ui;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
/* renamed from: io.card.payment.ui.ActivityHelper */
/* loaded from: classes7.dex */
public class ActivityHelper {
    @TargetApi(11)
    private static boolean actionBarNonNull(Activity activity) {
        return activity.getActionBar() != null;
    }

    private static boolean actionBarSupported() {
        return true;
    }

    @TargetApi(11)
    public static void addActionBarIfSupported(Activity activity) {
        if (actionBarSupported()) {
            activity.requestWindowFeature(8);
        }
    }

    public static boolean holoSupported() {
        return true;
    }

    @TargetApi(14)
    private static void setActionBarHomeIcon(ActionBar actionBar, Drawable drawable) {
        actionBar.setIcon(drawable);
    }

    @TargetApi(11)
    public static void setActivityTheme(Activity activity, boolean z) {
        if (z && activity.getApplicationInfo().theme != 0) {
            activity.setTheme(activity.getApplicationInfo().theme);
        } else if (holoSupported()) {
            activity.setTheme(16973934);
        } else {
            activity.setTheme(16973836);
        }
    }

    @TargetApi(11)
    public static void setFlagSecure(Activity activity) {
        activity.getWindow().addFlags(8192);
    }

    @TargetApi(11)
    private static void setupActionBar(Activity activity, String str, Drawable drawable) {
        ActionBar actionBar = activity.getActionBar();
        actionBar.setBackgroundDrawable(Appearance.ACTIONBAR_BACKGROUND);
        actionBar.setTitle(str);
        TextView textView = (TextView) activity.findViewById(Resources.getSystem().getIdentifier("action_bar_title", "id", "android"));
        if (textView != null) {
            textView.setTextColor(-1);
        }
        actionBar.setDisplayHomeAsUpEnabled(false);
        if (drawable != null) {
            setActionBarHomeIcon(actionBar, drawable);
        } else {
            actionBar.setDisplayShowHomeEnabled(false);
        }
    }

    public static void setupActionBarIfSupported(Activity activity, TextView textView, String str, String str2, Drawable drawable) {
        if (str2 == null) {
            str2 = "";
        }
        activity.setTitle(str2 + str);
        if (actionBarSupported() && actionBarNonNull(activity)) {
            setupActionBar(activity, str, drawable);
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else if (textView != null) {
            textView.setText(str);
        }
    }
}

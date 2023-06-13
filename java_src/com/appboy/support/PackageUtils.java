package com.appboy.support;

import android.content.Context;
/* loaded from: classes.dex */
public class PackageUtils {
    private static final String TAG = C43664k20.m29433n(PackageUtils.class);
    private static String sPackageName;

    public static String getResourcePackageName(Context context) {
        String str = sPackageName;
        if (str != null) {
            return str;
        }
        String packageName = context.getPackageName();
        sPackageName = packageName;
        return packageName;
    }
}

package com.google.android.libraries.places.internal;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
/* loaded from: classes6.dex */
public final class zzfp {
    public static int zza(int i, int i2, int i3) {
        return zzc(i, i2, i3) ? i3 : i2;
    }

    public static void zzb(ImageView imageView, int i) {
        Drawable drawable = imageView.getDrawable();
        int rgb = Color.rgb(Color.red(i), Color.green(i), Color.blue(i));
        Drawable mutate = drawable.mutate();
        mutate.setColorFilter(rgb, PorterDuff.Mode.SRC_ATOP);
        mutate.setAlpha(Color.alpha(i));
    }

    public static boolean zzc(int i, int i2, int i3) {
        double zzf = zzf(i);
        double zze = zze(zzf(i2), zzf);
        if (zze > 3.0d || zze > zze(zzf(i3), zzf)) {
            return false;
        }
        return true;
    }

    private static double zzd(double d) {
        return d <= 0.03928d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
    }

    private static double zze(double d, double d2) {
        return Math.round(((Math.max(d, d2) + 0.05d) / (Math.min(d, d2) + 0.05d)) * 100.0d) / 100.0d;
    }

    private static double zzf(int i) {
        return (zzd(Color.red(i) / 255.0d) * 0.2126d) + (zzd(Color.green(i) / 255.0d) * 0.7152d) + (zzd(Color.blue(i) / 255.0d) * 0.0722d);
    }
}

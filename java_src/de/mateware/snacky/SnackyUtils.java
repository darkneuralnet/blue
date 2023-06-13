package de.mateware.snacky;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
/* loaded from: classes7.dex */
public class SnackyUtils {
    /* renamed from: a */
    public static Drawable m43961a(Context context, int i, int i2) {
        return new BitmapDrawable(context.getResources(), Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888));
    }

    /* renamed from: b */
    public static Drawable m43960b(Drawable drawable, int i) {
        Drawable m90834r = P61.m90834r(drawable);
        if (m90834r != null) {
            Drawable mutate = m90834r.mutate();
            P61.m90838n(mutate, i);
            return mutate;
        }
        return m90834r;
    }
}

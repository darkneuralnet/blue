package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.internal.Asserts;
/* loaded from: classes5.dex */
public abstract class zag {
    final zad zaa;
    protected int zab;

    public zag(Uri uri, int i) {
        this.zab = 0;
        this.zaa = new zad(uri);
        this.zab = i;
    }

    public abstract void zaa(Drawable drawable, boolean z, boolean z2, boolean z3);

    public final void zab(Context context, C42708iQ6 c42708iQ6, boolean z) {
        Drawable drawable;
        int i = this.zab;
        if (i != 0) {
            drawable = context.getResources().getDrawable(i);
        } else {
            drawable = null;
        }
        zaa(drawable, z, false, false);
    }

    public final void zac(Context context, Bitmap bitmap, boolean z) {
        Asserts.checkNotNull(bitmap);
        zaa(new BitmapDrawable(context.getResources(), bitmap), false, false, true);
    }
}
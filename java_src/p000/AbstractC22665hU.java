package p000;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C17096a;
/* renamed from: hU */
/* loaded from: classes5.dex */
public abstract class AbstractC22665hU implements InterfaceC47891r96<Bitmap> {
    @Override // p000.InterfaceC47891r96
    /* renamed from: b */
    public final VL4<Bitmap> mo3853b(Context context, VL4<Bitmap> vl4, int i, int i2) {
        if (C47029pi6.m18906t(i, i2)) {
            InterfaceC20044eU m53152f = ComponentCallbacks2C17096a.m53155c(context).m53152f();
            Bitmap bitmap = vl4.get();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap mo36359c = mo36359c(m53152f, bitmap, i, i2);
            if (!bitmap.equals(mo36359c)) {
                return C20872gU.m39360f(mo36359c, m53152f);
            }
            return vl4;
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    /* renamed from: c */
    public abstract Bitmap mo36359c(InterfaceC20044eU interfaceC20044eU, Bitmap bitmap, int i, int i2);
}

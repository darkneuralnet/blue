package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import java.security.MessageDigest;
/* renamed from: X61 */
/* loaded from: classes5.dex */
public class X61 implements InterfaceC47891r96<Drawable> {

    /* renamed from: b */
    public final InterfaceC47891r96<Bitmap> f42644b;

    /* renamed from: c */
    public final boolean f42645c;

    public X61(InterfaceC47891r96<Bitmap> interfaceC47891r96, boolean z) {
        this.f42644b = interfaceC47891r96;
        this.f42645c = z;
    }

    @Override // p000.InterfaceC38133ak2
    /* renamed from: a */
    public void mo3854a(MessageDigest messageDigest) {
        this.f42644b.mo3854a(messageDigest);
    }

    @Override // p000.InterfaceC47891r96
    /* renamed from: b */
    public VL4<Drawable> mo3853b(Context context, VL4<Drawable> vl4, int i, int i2) {
        InterfaceC20044eU m53152f = ComponentCallbacks2C17096a.m53155c(context).m53152f();
        Drawable drawable = vl4.get();
        VL4<Bitmap> m78831a = W61.m78831a(m53152f, drawable, i, i2);
        if (m78831a == null) {
            if (!this.f42645c) {
                return vl4;
            }
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
        VL4<Bitmap> mo3853b = this.f42644b.mo3853b(context, m78831a, i, i2);
        if (mo3853b.equals(m78831a)) {
            mo3853b.mo5712b();
            return vl4;
        }
        return m77403d(context, mo3853b);
    }

    /* renamed from: c */
    public InterfaceC47891r96<BitmapDrawable> m77404c() {
        return this;
    }

    /* renamed from: d */
    public final VL4<Drawable> m77403d(Context context, VL4<Bitmap> vl4) {
        return C39959dn2.m43717f(context.getResources(), vl4);
    }

    @Override // p000.InterfaceC38133ak2
    public boolean equals(Object obj) {
        if (obj instanceof X61) {
            return this.f42644b.equals(((X61) obj).f42644b);
        }
        return false;
    }

    @Override // p000.InterfaceC38133ak2
    public int hashCode() {
        return this.f42644b.hashCode();
    }
}

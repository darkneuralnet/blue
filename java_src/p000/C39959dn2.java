package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
/* renamed from: dn2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39959dn2 implements VL4<BitmapDrawable>, InterfaceC50187v22 {

    /* renamed from: b */
    public final Resources f77217b;

    /* renamed from: c */
    public final VL4<Bitmap> f77218c;

    public C39959dn2(Resources resources, VL4<Bitmap> vl4) {
        this.f77217b = (Resources) C52865zZ3.m1111d(resources);
        this.f77218c = (VL4) C52865zZ3.m1111d(vl4);
    }

    /* renamed from: f */
    public static VL4<BitmapDrawable> m43717f(Resources resources, VL4<Bitmap> vl4) {
        if (vl4 == null) {
            return null;
        }
        return new C39959dn2(resources, vl4);
    }

    @Override // p000.VL4
    /* renamed from: a */
    public int mo5713a() {
        return this.f77218c.mo5713a();
    }

    @Override // p000.VL4
    /* renamed from: b */
    public void mo5712b() {
        this.f77218c.mo5712b();
    }

    @Override // p000.InterfaceC50187v22
    /* renamed from: c */
    public void mo5711c() {
        VL4<Bitmap> vl4 = this.f77218c;
        if (vl4 instanceof InterfaceC50187v22) {
            ((InterfaceC50187v22) vl4).mo5711c();
        }
    }

    @Override // p000.VL4
    /* renamed from: d */
    public Class<BitmapDrawable> mo5710d() {
        return BitmapDrawable.class;
    }

    @Override // p000.VL4
    /* renamed from: e */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f77217b, this.f77218c.get());
    }
}

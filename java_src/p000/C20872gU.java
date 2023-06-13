package p000;

import android.graphics.Bitmap;
/* renamed from: gU */
/* loaded from: classes5.dex */
public class C20872gU implements VL4<Bitmap>, InterfaceC50187v22 {

    /* renamed from: b */
    public final Bitmap f82281b;

    /* renamed from: c */
    public final InterfaceC20044eU f82282c;

    public C20872gU(Bitmap bitmap, InterfaceC20044eU interfaceC20044eU) {
        this.f82281b = (Bitmap) C52865zZ3.m1110e(bitmap, "Bitmap must not be null");
        this.f82282c = (InterfaceC20044eU) C52865zZ3.m1110e(interfaceC20044eU, "BitmapPool must not be null");
    }

    /* renamed from: f */
    public static C20872gU m39360f(Bitmap bitmap, InterfaceC20044eU interfaceC20044eU) {
        if (bitmap == null) {
            return null;
        }
        return new C20872gU(bitmap, interfaceC20044eU);
    }

    @Override // p000.VL4
    /* renamed from: a */
    public int mo5713a() {
        return C47029pi6.m18918h(this.f82281b);
    }

    @Override // p000.VL4
    /* renamed from: b */
    public void mo5712b() {
        this.f82282c.mo16193c(this.f82281b);
    }

    @Override // p000.InterfaceC50187v22
    /* renamed from: c */
    public void mo5711c() {
        this.f82281b.prepareToDraw();
    }

    @Override // p000.VL4
    /* renamed from: d */
    public Class<Bitmap> mo5710d() {
        return Bitmap.class;
    }

    @Override // p000.VL4
    /* renamed from: e */
    public Bitmap get() {
        return this.f82281b;
    }
}

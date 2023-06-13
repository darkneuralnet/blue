package p000;

import com.google.mlkit.vision.barcode.internal.BarcodeScannerImpl;
/* renamed from: F68 */
/* loaded from: classes6.dex */
public final class F68 {

    /* renamed from: a */
    public final C34231Le8 f8754a;

    /* renamed from: b */
    public final C33549Ih1 f8755b;

    public F68(C34231Le8 c34231Le8, C33549Ih1 c33549Ih1) {
        this.f8754a = c34231Le8;
        this.f8755b = c33549Ih1;
    }

    /* renamed from: a */
    public final BarcodeScannerImpl m107739a() {
        C9555Xx c9555Xx;
        c9555Xx = BarcodeScannerImpl.f74662i;
        return m107738b(c9555Xx);
    }

    /* renamed from: b */
    public final BarcodeScannerImpl m107738b(C9555Xx c9555Xx) {
        return new BarcodeScannerImpl(c9555Xx, (BA8) this.f8754a.m98291b(c9555Xx), this.f8755b.m101805a(c9555Xx.m76029b()), C44720lo9.m26787b(CC7.m112615d()));
    }
}

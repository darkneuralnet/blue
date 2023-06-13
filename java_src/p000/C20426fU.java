package p000;

import android.graphics.Bitmap;
/* renamed from: fU */
/* loaded from: classes5.dex */
public class C20426fU implements InterfaceC20044eU {
    @Override // p000.InterfaceC20044eU
    /* renamed from: a */
    public void mo16195a(int i) {
    }

    @Override // p000.InterfaceC20044eU
    /* renamed from: b */
    public void mo16194b() {
    }

    @Override // p000.InterfaceC20044eU
    /* renamed from: c */
    public void mo16193c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // p000.InterfaceC20044eU
    /* renamed from: d */
    public Bitmap mo16192d(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // p000.InterfaceC20044eU
    /* renamed from: e */
    public Bitmap mo16191e(int i, int i2, Bitmap.Config config) {
        return mo16192d(i, i2, config);
    }
}

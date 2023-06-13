package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
/* renamed from: O61 */
/* loaded from: classes5.dex */
public final class O61 implements InterfaceC49192tM4<Drawable, byte[]> {

    /* renamed from: a */
    public final InterfaceC20044eU f25879a;

    /* renamed from: b */
    public final InterfaceC49192tM4<Bitmap, byte[]> f25880b;

    /* renamed from: c */
    public final InterfaceC49192tM4<C49692uC1, byte[]> f25881c;

    public O61(InterfaceC20044eU interfaceC20044eU, InterfaceC49192tM4<Bitmap, byte[]> interfaceC49192tM4, InterfaceC49192tM4<C49692uC1, byte[]> interfaceC49192tM42) {
        this.f25879a = interfaceC20044eU;
        this.f25880b = interfaceC49192tM4;
        this.f25881c = interfaceC49192tM42;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static VL4<C49692uC1> m92916b(VL4<Drawable> vl4) {
        return vl4;
    }

    @Override // p000.InterfaceC49192tM4
    /* renamed from: a */
    public VL4<byte[]> mo9029a(VL4<Drawable> vl4, C48964sy3 c48964sy3) {
        Drawable drawable = vl4.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f25880b.mo9029a(C20872gU.m39360f(((BitmapDrawable) drawable).getBitmap(), this.f25879a), c48964sy3);
        }
        if (drawable instanceof C49692uC1) {
            return this.f25881c.mo9029a(m92916b(vl4), c48964sy3);
        }
        return null;
    }
}

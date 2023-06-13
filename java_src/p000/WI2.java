package p000;

import android.content.Context;
/* renamed from: WI2 */
/* loaded from: classes4.dex */
public final class WI2 implements InterfaceC48812sj1<InterfaceC41639gd3> {

    /* renamed from: a */
    public final VH2 f40750a;

    /* renamed from: b */
    public final Y94<Context> f40751b;

    public WI2(VH2 vh2, Y94<Context> y94) {
        this.f40750a = vh2;
        this.f40751b = y94;
    }

    /* renamed from: a */
    public static WI2 m78603a(VH2 vh2, Y94<Context> y94) {
        return new WI2(vh2, y94);
    }

    /* renamed from: c */
    public static InterfaceC41639gd3 m78601c(VH2 vh2, Context context) {
        return (InterfaceC41639gd3) C51679xZ3.m5002e(vh2.m80070b0(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC41639gd3 get() {
        return m78601c(this.f40750a, this.f40751b.get());
    }
}

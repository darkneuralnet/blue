package p000;

import android.content.Context;
/* renamed from: MJ2 */
/* loaded from: classes4.dex */
public final class MJ2 implements InterfaceC48812sj1<ZC6> {

    /* renamed from: a */
    public final VH2 f22970a;

    /* renamed from: b */
    public final Y94<Context> f22971b;

    public MJ2(VH2 vh2, Y94<Context> y94) {
        this.f22970a = vh2;
        this.f22971b = y94;
    }

    /* renamed from: a */
    public static MJ2 m95447a(VH2 vh2, Y94<Context> y94) {
        return new MJ2(vh2, y94);
    }

    /* renamed from: c */
    public static ZC6 m95445c(VH2 vh2, Context context) {
        return (ZC6) C51679xZ3.m5002e(vh2.m80083S0(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public ZC6 get() {
        return m95445c(this.f22970a, this.f22971b.get());
    }
}

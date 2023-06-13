package p000;

import android.content.Context;
import android.telephony.TelephonyManager;
/* renamed from: zJ2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C52720zJ2 implements InterfaceC48812sj1<TelephonyManager> {

    /* renamed from: a */
    public final VH2 f121059a;

    /* renamed from: b */
    public final Y94<Context> f121060b;

    public C52720zJ2(VH2 vh2, Y94<Context> y94) {
        this.f121059a = vh2;
        this.f121060b = y94;
    }

    /* renamed from: a */
    public static C52720zJ2 m1543a(VH2 vh2, Y94<Context> y94) {
        return new C52720zJ2(vh2, y94);
    }

    /* renamed from: c */
    public static TelephonyManager m1541c(VH2 vh2, Context context) {
        return (TelephonyManager) C51679xZ3.m5002e(vh2.m80109F0(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public TelephonyManager get() {
        return m1541c(this.f121059a, this.f121060b.get());
    }
}

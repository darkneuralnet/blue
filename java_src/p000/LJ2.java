package p000;

import android.content.Context;
import android.net.wifi.WifiManager;
/* renamed from: LJ2 */
/* loaded from: classes4.dex */
public final class LJ2 implements InterfaceC48812sj1<WifiManager> {

    /* renamed from: a */
    public final VH2 f21091a;

    /* renamed from: b */
    public final Y94<Context> f21092b;

    public LJ2(VH2 vh2, Y94<Context> y94) {
        this.f21091a = vh2;
        this.f21092b = y94;
    }

    /* renamed from: a */
    public static LJ2 m97347a(VH2 vh2, Y94<Context> y94) {
        return new LJ2(vh2, y94);
    }

    /* renamed from: c */
    public static WifiManager m97345c(VH2 vh2, Context context) {
        return (WifiManager) C51679xZ3.m5002e(vh2.m80085R0(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public WifiManager get() {
        return m97345c(this.f21091a, this.f21092b.get());
    }
}

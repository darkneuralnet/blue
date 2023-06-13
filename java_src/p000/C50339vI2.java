package p000;

import android.content.Context;
import android.net.ConnectivityManager;
/* renamed from: vI2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50339vI2 implements InterfaceC48812sj1<ConnectivityManager> {

    /* renamed from: a */
    public final VH2 f113808a;

    /* renamed from: b */
    public final Y94<Context> f113809b;

    public C50339vI2(VH2 vh2, Y94<Context> y94) {
        this.f113808a = vh2;
        this.f113809b = y94;
    }

    /* renamed from: a */
    public static C50339vI2 m8928a(VH2 vh2, Y94<Context> y94) {
        return new C50339vI2(vh2, y94);
    }

    /* renamed from: c */
    public static ConnectivityManager m8926c(VH2 vh2, Context context) {
        return (ConnectivityManager) C51679xZ3.m5002e(vh2.m80023z(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public ConnectivityManager get() {
        return m8926c(this.f113808a, this.f113809b.get());
    }
}

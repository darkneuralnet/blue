package p000;

import android.content.pm.PackageManager;
/* renamed from: nj */
/* loaded from: classes4.dex */
public final class C26573nj implements InterfaceC48812sj1<PackageManager> {

    /* renamed from: a */
    public final C22711hj f100391a;

    public C26573nj(C22711hj c22711hj) {
        this.f100391a = c22711hj;
    }

    /* renamed from: a */
    public static C26573nj m23276a(C22711hj c22711hj) {
        return new C26573nj(c22711hj);
    }

    /* renamed from: c */
    public static PackageManager m23274c(C22711hj c22711hj) {
        return (PackageManager) C51679xZ3.m5002e(c22711hj.m35997f());
    }

    @Override // p000.Y94
    /* renamed from: b */
    public PackageManager get() {
        return m23274c(this.f100391a);
    }
}

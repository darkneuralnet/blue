package p000;

import android.app.Application;
/* renamed from: vj */
/* loaded from: classes4.dex */
public final class C29614vj implements InterfaceC48812sj1<Application> {

    /* renamed from: a */
    public final C22711hj f114541a;

    public C29614vj(C22711hj c22711hj) {
        this.f114541a = c22711hj;
    }

    /* renamed from: a */
    public static C29614vj m8242a(C22711hj c22711hj) {
        return new C29614vj(c22711hj);
    }

    /* renamed from: c */
    public static Application m8240c(C22711hj c22711hj) {
        return (Application) C51679xZ3.m5002e(c22711hj.m35983m());
    }

    @Override // p000.Y94
    /* renamed from: b */
    public Application get() {
        return m8240c(this.f114541a);
    }
}

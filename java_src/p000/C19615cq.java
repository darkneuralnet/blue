package p000;

import com.google.android.gms.auth.api.signin.GoogleSignInClient;
/* renamed from: cq */
/* loaded from: classes2.dex */
public final class C19615cq implements InterfaceC48812sj1<C10390Zp> {

    /* renamed from: a */
    public final Y94<C51174wi2> f75687a;

    /* renamed from: b */
    public final Y94<C22454gl> f75688b;

    /* renamed from: c */
    public final Y94<InterfaceC22767hq> f75689c;

    /* renamed from: d */
    public final Y94<InterfaceC5093Lp> f75690d;

    /* renamed from: e */
    public final Y94<InterfaceC36655Vo2> f75691e;

    /* renamed from: f */
    public final Y94<GoogleSignInClient> f75692f;

    public C19615cq(Y94<C51174wi2> y94, Y94<C22454gl> y942, Y94<InterfaceC22767hq> y943, Y94<InterfaceC5093Lp> y944, Y94<InterfaceC36655Vo2> y945, Y94<GoogleSignInClient> y946) {
        this.f75687a = y94;
        this.f75688b = y942;
        this.f75689c = y943;
        this.f75690d = y944;
        this.f75691e = y945;
        this.f75692f = y946;
    }

    /* renamed from: a */
    public static C19615cq m45001a(Y94<C51174wi2> y94, Y94<C22454gl> y942, Y94<InterfaceC22767hq> y943, Y94<InterfaceC5093Lp> y944, Y94<InterfaceC36655Vo2> y945, Y94<GoogleSignInClient> y946) {
        return new C19615cq(y94, y942, y943, y944, y945, y946);
    }

    /* renamed from: c */
    public static C10390Zp m44999c(C51174wi2 c51174wi2, C22454gl c22454gl, InterfaceC22767hq interfaceC22767hq, InterfaceC5093Lp interfaceC5093Lp, InterfaceC36655Vo2 interfaceC36655Vo2, GoogleSignInClient googleSignInClient) {
        return new C10390Zp(c51174wi2, c22454gl, interfaceC22767hq, interfaceC5093Lp, interfaceC36655Vo2, googleSignInClient);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C10390Zp get() {
        return m44999c(this.f75687a.get(), this.f75688b.get(), this.f75689c.get(), this.f75690d.get(), this.f75691e.get(), this.f75692f.get());
    }
}

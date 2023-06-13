package co.bird.android.feature.servicecenter.whitelist;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.servicecenter.whitelist.WhitelistImeiLandingActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.servicecenter.whitelist.a */
/* loaded from: classes3.dex */
public final class C15749a {

    /* renamed from: co.bird.android.feature.servicecenter.whitelist.a$a */
    /* loaded from: classes3.dex */
    public static final class C15750a implements WhitelistImeiLandingActivity.InterfaceC15746b.InterfaceC15747a {
        @Override // co.bird.android.feature.servicecenter.whitelist.WhitelistImeiLandingActivity.InterfaceC15746b.InterfaceC15747a
        /* renamed from: a */
        public WhitelistImeiLandingActivity.InterfaceC15746b mo56671a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C29759w6 c29759w6) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c29759w6);
            return new C15751b(interfaceC44393lG2, baseActivity, scopeProvider, c29759w6);
        }

        private C15750a() {
        }
    }

    /* renamed from: co.bird.android.feature.servicecenter.whitelist.a$b */
    /* loaded from: classes3.dex */
    public static final class C15751b implements WhitelistImeiLandingActivity.InterfaceC15746b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65607a;

        /* renamed from: b */
        public final C15751b f65608b;

        /* renamed from: c */
        public Y94<BaseActivity> f65609c;

        /* renamed from: d */
        public Y94<C29759w6> f65610d;

        /* renamed from: e */
        public Y94<C37812aB6> f65611e;

        /* renamed from: f */
        public Y94<ScopeProvider> f65612f;

        /* renamed from: g */
        public Y94<InterfaceC40099e13> f65613g;

        /* renamed from: h */
        public Y94<XY3> f65614h;

        /* renamed from: i */
        public Y94<InterfaceC44647lh6> f65615i;

        /* renamed from: j */
        public Y94<InterfaceC36047Sy6> f65616j;

        /* renamed from: k */
        public Y94<C36207Tq4> f65617k;

        /* renamed from: l */
        public Y94<C43038iy6> f65618l;

        /* renamed from: m */
        public Y94<C51174wi2> f65619m;

        /* renamed from: n */
        public Y94<XA6> f65620n;

        /* renamed from: co.bird.android.feature.servicecenter.whitelist.a$b$a */
        /* loaded from: classes3.dex */
        public static final class C15752a implements Y94<C51174wi2> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65621a;

            public C15752a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65621a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C51174wi2 get() {
                return (C51174wi2) C51679xZ3.m5003d(this.f65621a.mo27492m2());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.whitelist.a$b$b */
        /* loaded from: classes3.dex */
        public static final class C15753b implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65622a;

            public C15753b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65622a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f65622a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.whitelist.a$b$c */
        /* loaded from: classes3.dex */
        public static final class C15754c implements Y94<XY3> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65623a;

            public C15754c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65623a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public XY3 get() {
                return (XY3) C51679xZ3.m5003d(this.f65623a.mo27529Z1());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.whitelist.a$b$d */
        /* loaded from: classes3.dex */
        public static final class C15755d implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65624a;

            public C15755d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65624a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f65624a.mo27595B1());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.whitelist.a$b$e */
        /* loaded from: classes3.dex */
        public static final class C15756e implements Y94<InterfaceC44647lh6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65625a;

            public C15756e(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65625a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC44647lh6 get() {
                return (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65625a.mo27459x1());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.whitelist.a$b$f */
        /* loaded from: classes3.dex */
        public static final class C15757f implements Y94<InterfaceC36047Sy6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65626a;

            public C15757f(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65626a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC36047Sy6 get() {
                return (InterfaceC36047Sy6) C51679xZ3.m5003d(this.f65626a.mo27571K2());
            }
        }

        @Override // co.bird.android.feature.servicecenter.whitelist.WhitelistImeiLandingActivity.InterfaceC15746b
        /* renamed from: a */
        public void mo56670a(WhitelistImeiLandingActivity whitelistImeiLandingActivity) {
            m56668c(whitelistImeiLandingActivity);
        }

        /* renamed from: b */
        public final void m56669b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C29759w6 c29759w6) {
            this.f65609c = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c29759w6);
            this.f65610d = m44621a;
            this.f65611e = V51.m80429b(C38405bB6.m64864a(this.f65609c, m44621a));
            this.f65612f = C39546d52.m44621a(scopeProvider);
            this.f65613g = new C15753b(interfaceC44393lG2);
            this.f65614h = new C15754c(interfaceC44393lG2);
            this.f65615i = new C15756e(interfaceC44393lG2);
            this.f65616j = new C15757f(interfaceC44393lG2);
            C15755d c15755d = new C15755d(interfaceC44393lG2);
            this.f65617k = c15755d;
            this.f65618l = C32303Cy6.m111187a(this.f65615i, this.f65616j, c15755d, this.f65612f, this.f65613g);
            C15752a c15752a = new C15752a(interfaceC44393lG2);
            this.f65619m = c15752a;
            this.f65620n = V51.m80429b(YA6.m75476a(this.f65611e, this.f65612f, this.f65613g, this.f65614h, this.f65618l, c15752a));
        }

        /* renamed from: c */
        public final WhitelistImeiLandingActivity m56668c(WhitelistImeiLandingActivity whitelistImeiLandingActivity) {
            C5135Ly.m96068n(whitelistImeiLandingActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65607a.mo27461w2()));
            C5135Ly.m96066p(whitelistImeiLandingActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65607a.mo27595B1()));
            C5135Ly.m96071k(whitelistImeiLandingActivity, (Handler) C51679xZ3.m5003d(this.f65607a.mo27535X2()));
            C5135Ly.m96067o(whitelistImeiLandingActivity, (C22454gl) C51679xZ3.m5003d(this.f65607a.mo27479r()));
            C5135Ly.m96080b(whitelistImeiLandingActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65607a.mo27519d0()));
            C5135Ly.m96075g(whitelistImeiLandingActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f65607a.mo27453z2()));
            C5135Ly.m96064r(whitelistImeiLandingActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65607a.mo27459x1()));
            C5135Ly.m96081a(whitelistImeiLandingActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f65607a.mo27474s()));
            C5135Ly.m96073i(whitelistImeiLandingActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f65607a.mo27558P0()));
            C5135Ly.m96074h(whitelistImeiLandingActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f65607a.mo27598A0()));
            C5135Ly.m96077e(whitelistImeiLandingActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f65607a.mo27507i0()));
            C5135Ly.m96070l(whitelistImeiLandingActivity, (FO2) C51679xZ3.m5003d(this.f65607a.mo27456y2()));
            C5135Ly.m96065q(whitelistImeiLandingActivity, (YR4) C51679xZ3.m5003d(this.f65607a.mo27525b0()));
            C5135Ly.m96079c(whitelistImeiLandingActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f65607a.mo27460x()));
            C5135Ly.m96078d(whitelistImeiLandingActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f65607a.mo27517d3()));
            C5135Ly.m96072j(whitelistImeiLandingActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65607a.mo27482q()));
            C5135Ly.m96076f(whitelistImeiLandingActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f65607a.mo27483p3()));
            QA6.m88804b(whitelistImeiLandingActivity, this.f65620n.get());
            return whitelistImeiLandingActivity;
        }

        public C15751b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C29759w6 c29759w6) {
            this.f65608b = this;
            this.f65607a = interfaceC44393lG2;
            m56669b(interfaceC44393lG2, baseActivity, scopeProvider, c29759w6);
        }
    }

    private C15749a() {
    }

    /* renamed from: a */
    public static WhitelistImeiLandingActivity.InterfaceC15746b.InterfaceC15747a m56672a() {
        return new C15750a();
    }
}

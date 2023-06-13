package co.bird.android.feature.rideendsummary;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.rideendsummary.RideRatingActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.rideendsummary.c */
/* loaded from: classes3.dex */
public final class C15265c {

    /* renamed from: co.bird.android.feature.rideendsummary.c$a */
    /* loaded from: classes3.dex */
    public static final class C15266a implements RideRatingActivity.InterfaceC15249a.InterfaceC15250a {
        @Override // co.bird.android.feature.rideendsummary.RideRatingActivity.InterfaceC15249a.InterfaceC15250a
        /* renamed from: a */
        public RideRatingActivity.InterfaceC15249a mo57468a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C6237P5 c6237p5, EO4 eo4) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c6237p5);
            C51679xZ3.m5005b(eo4);
            return new C15267b(interfaceC44393lG2, baseActivity, scopeProvider, c6237p5, eo4);
        }

        private C15266a() {
        }
    }

    /* renamed from: co.bird.android.feature.rideendsummary.c$b */
    /* loaded from: classes3.dex */
    public static final class C15267b implements RideRatingActivity.InterfaceC15249a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64720a;

        /* renamed from: b */
        public final C15267b f64721b;

        /* renamed from: c */
        public Y94<InterfaceC32874Fk1> f64722c;

        /* renamed from: d */
        public Y94<GI3> f64723d;

        /* renamed from: e */
        public Y94<C22454gl> f64724e;

        /* renamed from: f */
        public Y94<C36207Tq4> f64725f;

        /* renamed from: g */
        public Y94<ScopeProvider> f64726g;

        /* renamed from: h */
        public Y94<InterfaceC40099e13> f64727h;

        /* renamed from: i */
        public Y94<BaseActivity> f64728i;

        /* renamed from: j */
        public Y94<EO4> f64729j;

        /* renamed from: k */
        public Y94<C6237P5> f64730k;

        /* renamed from: l */
        public Y94<C46051o35> f64731l;

        /* renamed from: m */
        public Y94<InterfaceC42493i35> f64732m;

        /* renamed from: n */
        public Y94<C41307g35> f64733n;

        /* renamed from: o */
        public Y94<Q25> f64734o;

        /* renamed from: co.bird.android.feature.rideendsummary.c$b$a */
        /* loaded from: classes3.dex */
        public static final class C15268a implements Y94<C22454gl> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64735a;

            public C15268a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64735a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C22454gl get() {
                return (C22454gl) C51679xZ3.m5003d(this.f64735a.mo27479r());
            }
        }

        /* renamed from: co.bird.android.feature.rideendsummary.c$b$b */
        /* loaded from: classes3.dex */
        public static final class C15269b implements Y94<InterfaceC32874Fk1> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64736a;

            public C15269b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64736a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC32874Fk1 get() {
                return (InterfaceC32874Fk1) C51679xZ3.m5003d(this.f64736a.mo27578H1());
            }
        }

        /* renamed from: co.bird.android.feature.rideendsummary.c$b$c */
        /* loaded from: classes3.dex */
        public static final class C15270c implements Y94<GI3> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64737a;

            public C15270c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64737a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public GI3 get() {
                return (GI3) C51679xZ3.m5003d(this.f64737a.mo27565M2());
            }
        }

        /* renamed from: co.bird.android.feature.rideendsummary.c$b$d */
        /* loaded from: classes3.dex */
        public static final class C15271d implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64738a;

            public C15271d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64738a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f64738a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.feature.rideendsummary.c$b$e */
        /* loaded from: classes3.dex */
        public static final class C15272e implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64739a;

            public C15272e(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64739a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f64739a.mo27595B1());
            }
        }

        @Override // co.bird.android.feature.rideendsummary.RideRatingActivity.InterfaceC15249a
        /* renamed from: a */
        public void mo57467a(RideRatingActivity rideRatingActivity) {
            m57465c(rideRatingActivity);
        }

        /* renamed from: b */
        public final void m57466b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C6237P5 c6237p5, EO4 eo4) {
            this.f64722c = new C15269b(interfaceC44393lG2);
            this.f64723d = new C15270c(interfaceC44393lG2);
            this.f64724e = new C15268a(interfaceC44393lG2);
            this.f64725f = new C15272e(interfaceC44393lG2);
            this.f64726g = C39546d52.m44621a(scopeProvider);
            this.f64727h = new C15271d(interfaceC44393lG2);
            this.f64728i = C39546d52.m44621a(baseActivity);
            this.f64729j = C39546d52.m44621a(eo4);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c6237p5);
            this.f64730k = m44621a;
            C46644p35 m20013a = C46644p35.m20013a(this.f64728i, this.f64729j, m44621a);
            this.f64731l = m20013a;
            Y94<InterfaceC42493i35> m80429b = V51.m80429b(m20013a);
            this.f64732m = m80429b;
            C41900h35 m36876a = C41900h35.m36876a(this.f64722c, this.f64723d, this.f64724e, this.f64725f, this.f64726g, this.f64727h, m80429b);
            this.f64733n = m36876a;
            this.f64734o = V51.m80429b(m36876a);
        }

        /* renamed from: c */
        public final RideRatingActivity m57465c(RideRatingActivity rideRatingActivity) {
            C5135Ly.m96068n(rideRatingActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64720a.mo27461w2()));
            C5135Ly.m96066p(rideRatingActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64720a.mo27595B1()));
            C5135Ly.m96071k(rideRatingActivity, (Handler) C51679xZ3.m5003d(this.f64720a.mo27535X2()));
            C5135Ly.m96067o(rideRatingActivity, (C22454gl) C51679xZ3.m5003d(this.f64720a.mo27479r()));
            C5135Ly.m96080b(rideRatingActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64720a.mo27519d0()));
            C5135Ly.m96075g(rideRatingActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f64720a.mo27453z2()));
            C5135Ly.m96064r(rideRatingActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f64720a.mo27459x1()));
            C5135Ly.m96081a(rideRatingActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f64720a.mo27474s()));
            C5135Ly.m96073i(rideRatingActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f64720a.mo27558P0()));
            C5135Ly.m96074h(rideRatingActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f64720a.mo27598A0()));
            C5135Ly.m96077e(rideRatingActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f64720a.mo27507i0()));
            C5135Ly.m96070l(rideRatingActivity, (FO2) C51679xZ3.m5003d(this.f64720a.mo27456y2()));
            C5135Ly.m96065q(rideRatingActivity, (YR4) C51679xZ3.m5003d(this.f64720a.mo27525b0()));
            C5135Ly.m96079c(rideRatingActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f64720a.mo27460x()));
            C5135Ly.m96078d(rideRatingActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f64720a.mo27517d3()));
            C5135Ly.m96072j(rideRatingActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f64720a.mo27482q()));
            C5135Ly.m96076f(rideRatingActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f64720a.mo27483p3()));
            P25.m91041b(rideRatingActivity, this.f64734o.get());
            return rideRatingActivity;
        }

        public C15267b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C6237P5 c6237p5, EO4 eo4) {
            this.f64721b = this;
            this.f64720a = interfaceC44393lG2;
            m57466b(interfaceC44393lG2, baseActivity, scopeProvider, c6237p5, eo4);
        }
    }

    private C15265c() {
    }

    /* renamed from: a */
    public static RideRatingActivity.InterfaceC15249a.InterfaceC15250a m57469a() {
        return new C15266a();
    }
}

package co.bird.android.feature.rideendsummary;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.rideendsummary.RideFeedbackActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.rideendsummary.b */
/* loaded from: classes3.dex */
public final class C15258b {

    /* renamed from: co.bird.android.feature.rideendsummary.b$a */
    /* loaded from: classes3.dex */
    public static final class C15259a implements RideFeedbackActivity.InterfaceC15246b.InterfaceC15247a {
        @Override // co.bird.android.feature.rideendsummary.RideFeedbackActivity.InterfaceC15246b.InterfaceC15247a
        /* renamed from: a */
        public RideFeedbackActivity.InterfaceC15246b mo57477a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C3022H5 c3022h5, EO4 eo4) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c3022h5);
            C51679xZ3.m5005b(eo4);
            return new C15260b(interfaceC44393lG2, baseActivity, scopeProvider, c3022h5, eo4);
        }

        private C15259a() {
        }
    }

    /* renamed from: co.bird.android.feature.rideendsummary.b$b */
    /* loaded from: classes3.dex */
    public static final class C15260b implements RideFeedbackActivity.InterfaceC15246b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64702a;

        /* renamed from: b */
        public final C15260b f64703b;

        /* renamed from: c */
        public Y94<C22454gl> f64704c;

        /* renamed from: d */
        public Y94<InterfaceC32874Fk1> f64705d;

        /* renamed from: e */
        public Y94<Handler> f64706e;

        /* renamed from: f */
        public Y94<ScopeProvider> f64707f;

        /* renamed from: g */
        public Y94<BaseActivity> f64708g;

        /* renamed from: h */
        public Y94<EO4> f64709h;

        /* renamed from: i */
        public Y94<C3022H5> f64710i;

        /* renamed from: j */
        public Y94<C48052rR4> f64711j;

        /* renamed from: k */
        public Y94<InterfaceC45680nR4> f64712k;

        /* renamed from: l */
        public Y94<InterfaceC40099e13> f64713l;

        /* renamed from: m */
        public Y94<C44494lR4> f64714m;

        /* renamed from: n */
        public Y94<InterfaceC42715iR4> f64715n;

        /* renamed from: co.bird.android.feature.rideendsummary.b$b$a */
        /* loaded from: classes3.dex */
        public static final class C15261a implements Y94<C22454gl> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64716a;

            public C15261a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64716a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C22454gl get() {
                return (C22454gl) C51679xZ3.m5003d(this.f64716a.mo27479r());
            }
        }

        /* renamed from: co.bird.android.feature.rideendsummary.b$b$b */
        /* loaded from: classes3.dex */
        public static final class C15262b implements Y94<InterfaceC32874Fk1> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64717a;

            public C15262b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64717a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC32874Fk1 get() {
                return (InterfaceC32874Fk1) C51679xZ3.m5003d(this.f64717a.mo27578H1());
            }
        }

        /* renamed from: co.bird.android.feature.rideendsummary.b$b$c */
        /* loaded from: classes3.dex */
        public static final class C15263c implements Y94<Handler> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64718a;

            public C15263c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64718a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public Handler get() {
                return (Handler) C51679xZ3.m5003d(this.f64718a.mo27535X2());
            }
        }

        /* renamed from: co.bird.android.feature.rideendsummary.b$b$d */
        /* loaded from: classes3.dex */
        public static final class C15264d implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64719a;

            public C15264d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64719a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f64719a.mo27461w2());
            }
        }

        @Override // co.bird.android.feature.rideendsummary.RideFeedbackActivity.InterfaceC15246b
        /* renamed from: a */
        public void mo57476a(RideFeedbackActivity rideFeedbackActivity) {
            m57474c(rideFeedbackActivity);
        }

        /* renamed from: b */
        public final void m57475b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C3022H5 c3022h5, EO4 eo4) {
            this.f64704c = new C15261a(interfaceC44393lG2);
            this.f64705d = new C15262b(interfaceC44393lG2);
            this.f64706e = new C15263c(interfaceC44393lG2);
            this.f64707f = C39546d52.m44621a(scopeProvider);
            this.f64708g = C39546d52.m44621a(baseActivity);
            this.f64709h = C39546d52.m44621a(eo4);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c3022h5);
            this.f64710i = m44621a;
            C48644sR4 m14194a = C48644sR4.m14194a(this.f64708g, this.f64709h, m44621a);
            this.f64711j = m14194a;
            this.f64712k = V51.m80429b(m14194a);
            C15264d c15264d = new C15264d(interfaceC44393lG2);
            this.f64713l = c15264d;
            C45087mR4 m25624a = C45087mR4.m25624a(this.f64704c, this.f64705d, this.f64706e, this.f64707f, this.f64712k, c15264d);
            this.f64714m = m25624a;
            this.f64715n = V51.m80429b(m25624a);
        }

        /* renamed from: c */
        public final RideFeedbackActivity m57474c(RideFeedbackActivity rideFeedbackActivity) {
            C5135Ly.m96068n(rideFeedbackActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64702a.mo27461w2()));
            C5135Ly.m96066p(rideFeedbackActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64702a.mo27595B1()));
            C5135Ly.m96071k(rideFeedbackActivity, (Handler) C51679xZ3.m5003d(this.f64702a.mo27535X2()));
            C5135Ly.m96067o(rideFeedbackActivity, (C22454gl) C51679xZ3.m5003d(this.f64702a.mo27479r()));
            C5135Ly.m96080b(rideFeedbackActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64702a.mo27519d0()));
            C5135Ly.m96075g(rideFeedbackActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f64702a.mo27453z2()));
            C5135Ly.m96064r(rideFeedbackActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f64702a.mo27459x1()));
            C5135Ly.m96081a(rideFeedbackActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f64702a.mo27474s()));
            C5135Ly.m96073i(rideFeedbackActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f64702a.mo27558P0()));
            C5135Ly.m96074h(rideFeedbackActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f64702a.mo27598A0()));
            C5135Ly.m96077e(rideFeedbackActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f64702a.mo27507i0()));
            C5135Ly.m96070l(rideFeedbackActivity, (FO2) C51679xZ3.m5003d(this.f64702a.mo27456y2()));
            C5135Ly.m96065q(rideFeedbackActivity, (YR4) C51679xZ3.m5003d(this.f64702a.mo27525b0()));
            C5135Ly.m96079c(rideFeedbackActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f64702a.mo27460x()));
            C5135Ly.m96078d(rideFeedbackActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f64702a.mo27517d3()));
            C5135Ly.m96072j(rideFeedbackActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f64702a.mo27482q()));
            C5135Ly.m96076f(rideFeedbackActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f64702a.mo27483p3()));
            C42122hR4.m36397b(rideFeedbackActivity, this.f64715n.get());
            return rideFeedbackActivity;
        }

        public C15260b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C3022H5 c3022h5, EO4 eo4) {
            this.f64703b = this;
            this.f64702a = interfaceC44393lG2;
            m57475b(interfaceC44393lG2, baseActivity, scopeProvider, c3022h5, eo4);
        }
    }

    private C15258b() {
    }

    /* renamed from: a */
    public static RideFeedbackActivity.InterfaceC15246b.InterfaceC15247a m57478a() {
        return new C15259a();
    }
}

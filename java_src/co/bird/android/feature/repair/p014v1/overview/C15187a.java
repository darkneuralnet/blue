package co.bird.android.feature.repair.p014v1.overview;

import android.content.Context;
import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.repair.p014v1.overview.RepairOverviewActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.repair.v1.overview.a */
/* loaded from: classes3.dex */
public final class C15187a {

    /* renamed from: co.bird.android.feature.repair.v1.overview.a$a */
    /* loaded from: classes3.dex */
    public static final class C15188a implements RepairOverviewActivity.InterfaceC15184a.InterfaceC15185a {
        @Override // co.bird.android.feature.repair.p014v1.overview.RepairOverviewActivity.InterfaceC15184a.InterfaceC15185a
        /* renamed from: a */
        public RepairOverviewActivity.InterfaceC15184a mo57579a(InterfaceC44393lG2 interfaceC44393lG2, InterfaceC34875Ny4 interfaceC34875Ny4, BaseActivity baseActivity, ScopeProvider scopeProvider, C22548h5 c22548h5) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(interfaceC34875Ny4);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c22548h5);
            return new C15189b(interfaceC44393lG2, interfaceC34875Ny4, baseActivity, scopeProvider, c22548h5);
        }

        private C15188a() {
        }
    }

    /* renamed from: co.bird.android.feature.repair.v1.overview.a$b */
    /* loaded from: classes3.dex */
    public static final class C15189b implements RepairOverviewActivity.InterfaceC15184a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64587a;

        /* renamed from: b */
        public final C15189b f64588b;

        /* renamed from: c */
        public Y94<InterfaceC10636aM> f64589c;

        /* renamed from: d */
        public Y94<GI3> f64590d;

        /* renamed from: e */
        public Y94<InterfaceC37857aG6> f64591e;

        /* renamed from: f */
        public Y94<InterfaceC40099e13> f64592f;

        /* renamed from: g */
        public Y94<ScopeProvider> f64593g;

        /* renamed from: h */
        public Y94<InterfaceC32301Cy4> f64594h;

        /* renamed from: i */
        public Y94<BaseActivity> f64595i;

        /* renamed from: j */
        public Y94<C22548h5> f64596j;

        /* renamed from: k */
        public Y94<C49102tC4> f64597k;

        /* renamed from: l */
        public Y94<Context> f64598l;

        /* renamed from: m */
        public Y94<C36207Tq4> f64599m;

        /* renamed from: n */
        public Y94<UB4> f64600n;

        /* renamed from: o */
        public Y94<C52668zD4> f64601o;

        /* renamed from: p */
        public Y94<C45545nC4> f64602p;

        /* renamed from: co.bird.android.feature.repair.v1.overview.a$b$a */
        /* loaded from: classes3.dex */
        public static final class C15190a implements Y94<Context> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64603a;

            public C15190a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64603a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public Context get() {
                return (Context) C51679xZ3.m5003d(this.f64603a.mo27552R1());
            }
        }

        /* renamed from: co.bird.android.feature.repair.v1.overview.a$b$b */
        /* loaded from: classes3.dex */
        public static final class C15191b implements Y94<InterfaceC10636aM> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64604a;

            public C15191b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64604a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC10636aM get() {
                return (InterfaceC10636aM) C51679xZ3.m5003d(this.f64604a.mo27460x());
            }
        }

        /* renamed from: co.bird.android.feature.repair.v1.overview.a$b$c */
        /* loaded from: classes3.dex */
        public static final class C15192c implements Y94<GI3> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64605a;

            public C15192c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64605a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public GI3 get() {
                return (GI3) C51679xZ3.m5003d(this.f64605a.mo27565M2());
            }
        }

        /* renamed from: co.bird.android.feature.repair.v1.overview.a$b$d */
        /* loaded from: classes3.dex */
        public static final class C15193d implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64606a;

            public C15193d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64606a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f64606a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.feature.repair.v1.overview.a$b$e */
        /* loaded from: classes3.dex */
        public static final class C15194e implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64607a;

            public C15194e(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64607a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f64607a.mo27595B1());
            }
        }

        /* renamed from: co.bird.android.feature.repair.v1.overview.a$b$f */
        /* loaded from: classes3.dex */
        public static final class C15195f implements Y94<InterfaceC32301Cy4> {

            /* renamed from: a */
            public final InterfaceC34875Ny4 f64608a;

            public C15195f(InterfaceC34875Ny4 interfaceC34875Ny4) {
                this.f64608a = interfaceC34875Ny4;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC32301Cy4 get() {
                return (InterfaceC32301Cy4) C51679xZ3.m5003d(this.f64608a.mo93097a());
            }
        }

        /* renamed from: co.bird.android.feature.repair.v1.overview.a$b$g */
        /* loaded from: classes3.dex */
        public static final class C15196g implements Y94<InterfaceC37857aG6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64609a;

            public C15196g(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64609a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC37857aG6 get() {
                return (InterfaceC37857aG6) C51679xZ3.m5003d(this.f64609a.mo27549T2());
            }
        }

        @Override // co.bird.android.feature.repair.p014v1.overview.RepairOverviewActivity.InterfaceC15184a
        /* renamed from: a */
        public void mo57578a(RepairOverviewActivity repairOverviewActivity) {
            m57576c(repairOverviewActivity);
        }

        /* renamed from: b */
        public final void m57577b(InterfaceC44393lG2 interfaceC44393lG2, InterfaceC34875Ny4 interfaceC34875Ny4, BaseActivity baseActivity, ScopeProvider scopeProvider, C22548h5 c22548h5) {
            this.f64589c = new C15191b(interfaceC44393lG2);
            this.f64590d = new C15192c(interfaceC44393lG2);
            this.f64591e = new C15196g(interfaceC44393lG2);
            this.f64592f = new C15193d(interfaceC44393lG2);
            this.f64593g = C39546d52.m44621a(scopeProvider);
            this.f64594h = new C15195f(interfaceC34875Ny4);
            this.f64595i = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c22548h5);
            this.f64596j = m44621a;
            this.f64597k = V51.m80429b(C49695uC4.m10644a(this.f64595i, m44621a));
            this.f64598l = new C15190a(interfaceC44393lG2);
            C15194e c15194e = new C15194e(interfaceC44393lG2);
            this.f64599m = c15194e;
            this.f64600n = VB4.m80244a(this.f64598l, c15194e);
            AD4 m115960a = AD4.m115960a(this.f64598l);
            this.f64601o = m115960a;
            this.f64602p = V51.m80429b(C47917rC4.m16265a(this.f64589c, this.f64590d, this.f64591e, this.f64592f, this.f64593g, this.f64594h, this.f64597k, this.f64600n, m115960a));
        }

        /* renamed from: c */
        public final RepairOverviewActivity m57576c(RepairOverviewActivity repairOverviewActivity) {
            C5135Ly.m96068n(repairOverviewActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64587a.mo27461w2()));
            C5135Ly.m96066p(repairOverviewActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64587a.mo27595B1()));
            C5135Ly.m96071k(repairOverviewActivity, (Handler) C51679xZ3.m5003d(this.f64587a.mo27535X2()));
            C5135Ly.m96067o(repairOverviewActivity, (C22454gl) C51679xZ3.m5003d(this.f64587a.mo27479r()));
            C5135Ly.m96080b(repairOverviewActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64587a.mo27519d0()));
            C5135Ly.m96075g(repairOverviewActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f64587a.mo27453z2()));
            C5135Ly.m96064r(repairOverviewActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f64587a.mo27459x1()));
            C5135Ly.m96081a(repairOverviewActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f64587a.mo27474s()));
            C5135Ly.m96073i(repairOverviewActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f64587a.mo27558P0()));
            C5135Ly.m96074h(repairOverviewActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f64587a.mo27598A0()));
            C5135Ly.m96077e(repairOverviewActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f64587a.mo27507i0()));
            C5135Ly.m96070l(repairOverviewActivity, (FO2) C51679xZ3.m5003d(this.f64587a.mo27456y2()));
            C5135Ly.m96065q(repairOverviewActivity, (YR4) C51679xZ3.m5003d(this.f64587a.mo27525b0()));
            C5135Ly.m96079c(repairOverviewActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f64587a.mo27460x()));
            C5135Ly.m96078d(repairOverviewActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f64587a.mo27517d3()));
            C5135Ly.m96072j(repairOverviewActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f64587a.mo27482q()));
            C5135Ly.m96076f(repairOverviewActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f64587a.mo27483p3()));
            OB4.m92638b(repairOverviewActivity, this.f64602p.get());
            return repairOverviewActivity;
        }

        public C15189b(InterfaceC44393lG2 interfaceC44393lG2, InterfaceC34875Ny4 interfaceC34875Ny4, BaseActivity baseActivity, ScopeProvider scopeProvider, C22548h5 c22548h5) {
            this.f64588b = this;
            this.f64587a = interfaceC44393lG2;
            m57577b(interfaceC44393lG2, interfaceC34875Ny4, baseActivity, scopeProvider, c22548h5);
        }
    }

    private C15187a() {
    }

    /* renamed from: a */
    public static RepairOverviewActivity.InterfaceC15184a.InterfaceC15185a m57580a() {
        return new C15188a();
    }
}

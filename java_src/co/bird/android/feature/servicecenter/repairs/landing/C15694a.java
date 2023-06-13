package co.bird.android.feature.servicecenter.repairs.landing;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.servicecenter.repairs.landing.RepairsScanActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.servicecenter.repairs.landing.a */
/* loaded from: classes3.dex */
public final class C15694a {

    /* renamed from: co.bird.android.feature.servicecenter.repairs.landing.a$a */
    /* loaded from: classes3.dex */
    public static final class C15695a implements RepairsScanActivity.InterfaceC15691a.InterfaceC15692a {
        @Override // co.bird.android.feature.servicecenter.repairs.landing.RepairsScanActivity.InterfaceC15691a.InterfaceC15692a
        /* renamed from: a */
        public RepairsScanActivity.InterfaceC15691a mo56736a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C25907m5 c25907m5, DQ3 dq3) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c25907m5);
            C51679xZ3.m5005b(dq3);
            return new C15696b(interfaceC44393lG2, baseActivity, scopeProvider, c25907m5, dq3);
        }

        private C15695a() {
        }
    }

    /* renamed from: co.bird.android.feature.servicecenter.repairs.landing.a$b */
    /* loaded from: classes3.dex */
    public static final class C15696b implements RepairsScanActivity.InterfaceC15691a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65500a;

        /* renamed from: b */
        public final C15696b f65501b;

        /* renamed from: c */
        public Y94<InterfaceC44647lh6> f65502c;

        /* renamed from: d */
        public Y94<InterfaceC36047Sy6> f65503d;

        /* renamed from: e */
        public Y94<C36207Tq4> f65504e;

        /* renamed from: f */
        public Y94<ScopeProvider> f65505f;

        /* renamed from: g */
        public Y94<InterfaceC40099e13> f65506g;

        /* renamed from: h */
        public Y94<C43038iy6> f65507h;

        /* renamed from: i */
        public Y94<BaseActivity> f65508i;

        /* renamed from: j */
        public Y94<C25907m5> f65509j;

        /* renamed from: k */
        public Y94<C39041cG4> f65510k;

        /* renamed from: l */
        public Y94<InterfaceC38448bG4> f65511l;

        /* renamed from: m */
        public Y94<DQ3> f65512m;

        /* renamed from: n */
        public Y94<ZF4> f65513n;

        /* renamed from: o */
        public Y94<UF4> f65514o;

        /* renamed from: co.bird.android.feature.servicecenter.repairs.landing.a$b$a */
        /* loaded from: classes3.dex */
        public static final class C15697a implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65515a;

            public C15697a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65515a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f65515a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.repairs.landing.a$b$b */
        /* loaded from: classes3.dex */
        public static final class C15698b implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65516a;

            public C15698b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65516a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f65516a.mo27595B1());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.repairs.landing.a$b$c */
        /* loaded from: classes3.dex */
        public static final class C15699c implements Y94<InterfaceC44647lh6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65517a;

            public C15699c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65517a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC44647lh6 get() {
                return (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65517a.mo27459x1());
            }
        }

        /* renamed from: co.bird.android.feature.servicecenter.repairs.landing.a$b$d */
        /* loaded from: classes3.dex */
        public static final class C15700d implements Y94<InterfaceC36047Sy6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f65518a;

            public C15700d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f65518a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC36047Sy6 get() {
                return (InterfaceC36047Sy6) C51679xZ3.m5003d(this.f65518a.mo27571K2());
            }
        }

        @Override // co.bird.android.feature.servicecenter.repairs.landing.RepairsScanActivity.InterfaceC15691a
        /* renamed from: a */
        public void mo56735a(RepairsScanActivity repairsScanActivity) {
            m56733c(repairsScanActivity);
        }

        /* renamed from: b */
        public final void m56734b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C25907m5 c25907m5, DQ3 dq3) {
            this.f65502c = new C15699c(interfaceC44393lG2);
            this.f65503d = new C15700d(interfaceC44393lG2);
            this.f65504e = new C15698b(interfaceC44393lG2);
            this.f65505f = C39546d52.m44621a(scopeProvider);
            C15697a c15697a = new C15697a(interfaceC44393lG2);
            this.f65506g = c15697a;
            this.f65507h = C32303Cy6.m111187a(this.f65502c, this.f65503d, this.f65504e, this.f65505f, c15697a);
            this.f65508i = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c25907m5);
            this.f65509j = m44621a;
            C39652dG4 m44461a = C39652dG4.m44461a(this.f65508i, m44621a);
            this.f65510k = m44461a;
            this.f65511l = V51.m80429b(m44461a);
            InterfaceC48812sj1 m44621a2 = C39546d52.m44621a(dq3);
            this.f65512m = m44621a2;
            C37855aG4 m71720a = C37855aG4.m71720a(this.f65507h, this.f65504e, this.f65511l, this.f65505f, this.f65506g, m44621a2);
            this.f65513n = m71720a;
            this.f65514o = V51.m80429b(m71720a);
        }

        /* renamed from: c */
        public final RepairsScanActivity m56733c(RepairsScanActivity repairsScanActivity) {
            C5135Ly.m96068n(repairsScanActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65500a.mo27461w2()));
            C5135Ly.m96066p(repairsScanActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65500a.mo27595B1()));
            C5135Ly.m96071k(repairsScanActivity, (Handler) C51679xZ3.m5003d(this.f65500a.mo27535X2()));
            C5135Ly.m96067o(repairsScanActivity, (C22454gl) C51679xZ3.m5003d(this.f65500a.mo27479r()));
            C5135Ly.m96080b(repairsScanActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65500a.mo27519d0()));
            C5135Ly.m96075g(repairsScanActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f65500a.mo27453z2()));
            C5135Ly.m96064r(repairsScanActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65500a.mo27459x1()));
            C5135Ly.m96081a(repairsScanActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f65500a.mo27474s()));
            C5135Ly.m96073i(repairsScanActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f65500a.mo27558P0()));
            C5135Ly.m96074h(repairsScanActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f65500a.mo27598A0()));
            C5135Ly.m96077e(repairsScanActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f65500a.mo27507i0()));
            C5135Ly.m96070l(repairsScanActivity, (FO2) C51679xZ3.m5003d(this.f65500a.mo27456y2()));
            C5135Ly.m96065q(repairsScanActivity, (YR4) C51679xZ3.m5003d(this.f65500a.mo27525b0()));
            C5135Ly.m96079c(repairsScanActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f65500a.mo27460x()));
            C5135Ly.m96078d(repairsScanActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f65500a.mo27517d3()));
            C5135Ly.m96072j(repairsScanActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65500a.mo27482q()));
            C5135Ly.m96076f(repairsScanActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f65500a.mo27483p3()));
            TF4.m84123b(repairsScanActivity, this.f65514o.get());
            return repairsScanActivity;
        }

        public C15696b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C25907m5 c25907m5, DQ3 dq3) {
            this.f65501b = this;
            this.f65500a = interfaceC44393lG2;
            m56734b(interfaceC44393lG2, baseActivity, scopeProvider, c25907m5, dq3);
        }
    }

    private C15694a() {
    }

    /* renamed from: a */
    public static RepairsScanActivity.InterfaceC15691a.InterfaceC15692a m56737a() {
        return new C15695a();
    }
}

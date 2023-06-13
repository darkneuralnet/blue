package co.bird.android.feature.repair.p014v1.search;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.repair.p014v1.search.RepairSearchActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.repair.v1.search.a */
/* loaded from: classes3.dex */
public final class C15201a {

    /* renamed from: co.bird.android.feature.repair.v1.search.a$a */
    /* loaded from: classes3.dex */
    public static final class C15202a implements RepairSearchActivity.InterfaceC15198b.InterfaceC15199a {
        @Override // co.bird.android.feature.repair.p014v1.search.RepairSearchActivity.InterfaceC15198b.InterfaceC15199a
        /* renamed from: a */
        public RepairSearchActivity.InterfaceC15198b mo57563a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C23123i5 c23123i5) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c23123i5);
            return new C15203b(interfaceC44393lG2, baseActivity, scopeProvider, c23123i5);
        }

        private C15202a() {
        }
    }

    /* renamed from: co.bird.android.feature.repair.v1.search.a$b */
    /* loaded from: classes3.dex */
    public static final class C15203b implements RepairSearchActivity.InterfaceC15198b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64612a;

        /* renamed from: b */
        public final C15203b f64613b;

        /* renamed from: c */
        public Y94<ScopeProvider> f64614c;

        /* renamed from: d */
        public Y94<BaseActivity> f64615d;

        /* renamed from: e */
        public Y94<C23123i5> f64616e;

        /* renamed from: f */
        public Y94<WC4> f64617f;

        /* renamed from: g */
        public Y94<SC4> f64618g;

        /* renamed from: h */
        public Y94<InterfaceC40099e13> f64619h;

        /* renamed from: i */
        public Y94<InterfaceC52659zC4> f64620i;

        /* renamed from: j */
        public Y94<QC4> f64621j;

        /* renamed from: k */
        public Y94<EC4> f64622k;

        /* renamed from: co.bird.android.feature.repair.v1.search.a$b$a */
        /* loaded from: classes3.dex */
        public static final class C15204a implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64623a;

            public C15204a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64623a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f64623a.mo27461w2());
            }
        }

        @Override // co.bird.android.feature.repair.p014v1.search.RepairSearchActivity.InterfaceC15198b
        /* renamed from: a */
        public void mo57562a(RepairSearchActivity repairSearchActivity) {
            m57560c(repairSearchActivity);
        }

        /* renamed from: b */
        public final void m57561b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C23123i5 c23123i5) {
            this.f64614c = C39546d52.m44621a(scopeProvider);
            this.f64615d = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c23123i5);
            this.f64616e = m44621a;
            XC4 m77185a = XC4.m77185a(this.f64615d, m44621a);
            this.f64617f = m77185a;
            this.f64618g = V51.m80429b(m77185a);
            this.f64619h = new C15204a(interfaceC44393lG2);
            Y94<InterfaceC52659zC4> m80429b = V51.m80429b(CC4.m112653a());
            this.f64620i = m80429b;
            RC4 m87201a = RC4.m87201a(this.f64614c, this.f64618g, this.f64619h, m80429b);
            this.f64621j = m87201a;
            this.f64622k = V51.m80429b(m87201a);
        }

        /* renamed from: c */
        public final RepairSearchActivity m57560c(RepairSearchActivity repairSearchActivity) {
            C5135Ly.m96068n(repairSearchActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64612a.mo27461w2()));
            C5135Ly.m96066p(repairSearchActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64612a.mo27595B1()));
            C5135Ly.m96071k(repairSearchActivity, (Handler) C51679xZ3.m5003d(this.f64612a.mo27535X2()));
            C5135Ly.m96067o(repairSearchActivity, (C22454gl) C51679xZ3.m5003d(this.f64612a.mo27479r()));
            C5135Ly.m96080b(repairSearchActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64612a.mo27519d0()));
            C5135Ly.m96075g(repairSearchActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f64612a.mo27453z2()));
            C5135Ly.m96064r(repairSearchActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f64612a.mo27459x1()));
            C5135Ly.m96081a(repairSearchActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f64612a.mo27474s()));
            C5135Ly.m96073i(repairSearchActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f64612a.mo27558P0()));
            C5135Ly.m96074h(repairSearchActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f64612a.mo27598A0()));
            C5135Ly.m96077e(repairSearchActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f64612a.mo27507i0()));
            C5135Ly.m96070l(repairSearchActivity, (FO2) C51679xZ3.m5003d(this.f64612a.mo27456y2()));
            C5135Ly.m96065q(repairSearchActivity, (YR4) C51679xZ3.m5003d(this.f64612a.mo27525b0()));
            C5135Ly.m96079c(repairSearchActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f64612a.mo27460x()));
            C5135Ly.m96078d(repairSearchActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f64612a.mo27517d3()));
            C5135Ly.m96072j(repairSearchActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f64612a.mo27482q()));
            C5135Ly.m96076f(repairSearchActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f64612a.mo27483p3()));
            C51473xC4.m5679b(repairSearchActivity, this.f64622k.get());
            return repairSearchActivity;
        }

        public C15203b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C23123i5 c23123i5) {
            this.f64613b = this;
            this.f64612a = interfaceC44393lG2;
            m57561b(interfaceC44393lG2, baseActivity, scopeProvider, c23123i5);
        }
    }

    private C15201a() {
    }

    /* renamed from: a */
    public static RepairSearchActivity.InterfaceC15198b.InterfaceC15199a m57564a() {
        return new C15202a();
    }
}

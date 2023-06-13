package co.bird.android.feature.nestdetails;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.nestdetails.NestDetailsActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.nestdetails.a */
/* loaded from: classes3.dex */
public final class C14992a {

    /* renamed from: co.bird.android.feature.nestdetails.a$a */
    /* loaded from: classes3.dex */
    public static final class C14993a implements NestDetailsActivity.InterfaceC14989a.InterfaceC14990a {
        @Override // co.bird.android.feature.nestdetails.NestDetailsActivity.InterfaceC14989a.InterfaceC14990a
        /* renamed from: a */
        public NestDetailsActivity.InterfaceC14989a mo57922a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C27137p4 c27137p4, boolean z) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c27137p4);
            C51679xZ3.m5005b(Boolean.valueOf(z));
            return new C14994b(interfaceC44393lG2, baseActivity, scopeProvider, c27137p4, Boolean.valueOf(z));
        }

        private C14993a() {
        }
    }

    /* renamed from: co.bird.android.feature.nestdetails.a$b */
    /* loaded from: classes3.dex */
    public static final class C14994b implements NestDetailsActivity.InterfaceC14989a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64231a;

        /* renamed from: b */
        public final C14994b f64232b;

        /* renamed from: c */
        public Y94<InterfaceC10636aM> f64233c;

        /* renamed from: d */
        public Y94<InterfaceC12495bn> f64234d;

        /* renamed from: e */
        public Y94<InterfaceC40099e13> f64235e;

        /* renamed from: f */
        public Y94<ScopeProvider> f64236f;

        /* renamed from: g */
        public Y94<BaseActivity> f64237g;

        /* renamed from: h */
        public Y94<C27137p4> f64238h;

        /* renamed from: i */
        public Y94<Q23> f64239i;

        /* renamed from: j */
        public Y94<Boolean> f64240j;

        /* renamed from: k */
        public Y94<C51394x43> f64241k;

        /* renamed from: l */
        public Y94<C47662qm6> f64242l;

        /* renamed from: m */
        public Y94<N23> f64243m;

        /* renamed from: co.bird.android.feature.nestdetails.a$b$a */
        /* loaded from: classes3.dex */
        public static final class C14995a implements Y94<InterfaceC12495bn> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64244a;

            public C14995a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64244a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC12495bn get() {
                return (InterfaceC12495bn) C51679xZ3.m5003d(this.f64244a.mo27516e0());
            }
        }

        /* renamed from: co.bird.android.feature.nestdetails.a$b$b */
        /* loaded from: classes3.dex */
        public static final class C14996b implements Y94<InterfaceC10636aM> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64245a;

            public C14996b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64245a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC10636aM get() {
                return (InterfaceC10636aM) C51679xZ3.m5003d(this.f64245a.mo27460x());
            }
        }

        /* renamed from: co.bird.android.feature.nestdetails.a$b$c */
        /* loaded from: classes3.dex */
        public static final class C14997c implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64246a;

            public C14997c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64246a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f64246a.mo27461w2());
            }
        }

        @Override // co.bird.android.feature.nestdetails.NestDetailsActivity.InterfaceC14989a
        /* renamed from: a */
        public void mo57921a(NestDetailsActivity nestDetailsActivity) {
            m57919c(nestDetailsActivity);
        }

        /* renamed from: b */
        public final void m57920b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C27137p4 c27137p4, Boolean bool) {
            this.f64233c = new C14996b(interfaceC44393lG2);
            this.f64234d = new C14995a(interfaceC44393lG2);
            this.f64235e = new C14997c(interfaceC44393lG2);
            this.f64236f = C39546d52.m44621a(scopeProvider);
            this.f64237g = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c27137p4);
            this.f64238h = m44621a;
            this.f64239i = V51.m80429b(R23.m87398a(this.f64237g, m44621a));
            InterfaceC48812sj1 m44621a2 = C39546d52.m44621a(bool);
            this.f64240j = m44621a2;
            Y94<C51394x43> m80429b = V51.m80429b(C51987y43.m4178a(m44621a2));
            this.f64241k = m80429b;
            Y94<C47662qm6> m80429b2 = V51.m80429b(C48255rm6.m15401a(this.f64237g, this.f64238h, m80429b));
            this.f64242l = m80429b2;
            this.f64243m = V51.m80429b(O23.m92986a(this.f64233c, this.f64234d, this.f64235e, this.f64236f, this.f64239i, m80429b2));
        }

        /* renamed from: c */
        public final NestDetailsActivity m57919c(NestDetailsActivity nestDetailsActivity) {
            C5135Ly.m96068n(nestDetailsActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64231a.mo27461w2()));
            C5135Ly.m96066p(nestDetailsActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64231a.mo27595B1()));
            C5135Ly.m96071k(nestDetailsActivity, (Handler) C51679xZ3.m5003d(this.f64231a.mo27535X2()));
            C5135Ly.m96067o(nestDetailsActivity, (C22454gl) C51679xZ3.m5003d(this.f64231a.mo27479r()));
            C5135Ly.m96080b(nestDetailsActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64231a.mo27519d0()));
            C5135Ly.m96075g(nestDetailsActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f64231a.mo27453z2()));
            C5135Ly.m96064r(nestDetailsActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f64231a.mo27459x1()));
            C5135Ly.m96081a(nestDetailsActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f64231a.mo27474s()));
            C5135Ly.m96073i(nestDetailsActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f64231a.mo27558P0()));
            C5135Ly.m96074h(nestDetailsActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f64231a.mo27598A0()));
            C5135Ly.m96077e(nestDetailsActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f64231a.mo27507i0()));
            C5135Ly.m96070l(nestDetailsActivity, (FO2) C51679xZ3.m5003d(this.f64231a.mo27456y2()));
            C5135Ly.m96065q(nestDetailsActivity, (YR4) C51679xZ3.m5003d(this.f64231a.mo27525b0()));
            C5135Ly.m96079c(nestDetailsActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f64231a.mo27460x()));
            C5135Ly.m96078d(nestDetailsActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f64231a.mo27517d3()));
            C5135Ly.m96072j(nestDetailsActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f64231a.mo27482q()));
            C5135Ly.m96076f(nestDetailsActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f64231a.mo27483p3()));
            G23.m105937b(nestDetailsActivity, this.f64243m.get());
            return nestDetailsActivity;
        }

        public C14994b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C27137p4 c27137p4, Boolean bool) {
            this.f64232b = this;
            this.f64231a = interfaceC44393lG2;
            m57920b(interfaceC44393lG2, baseActivity, scopeProvider, c27137p4, bool);
        }
    }

    private C14992a() {
    }

    /* renamed from: a */
    public static NestDetailsActivity.InterfaceC14989a.InterfaceC14990a m57923a() {
        return new C14993a();
    }
}

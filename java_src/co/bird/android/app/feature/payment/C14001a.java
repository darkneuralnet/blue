package co.bird.android.app.feature.payment;

import android.os.Handler;
import co.bird.android.app.feature.payment.CashpayActivity;
import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.app.feature.payment.a */
/* loaded from: classes2.dex */
public final class C14001a {

    /* renamed from: co.bird.android.app.feature.payment.a$a */
    /* loaded from: classes2.dex */
    public static final class C14002a implements CashpayActivity.InterfaceC13997a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f61955a;

        /* renamed from: b */
        public final C14002a f61956b;

        /* renamed from: c */
        public Y94<BaseActivity> f61957c;

        /* renamed from: d */
        public Y94<C22545h3> f61958d;

        /* renamed from: e */
        public Y94<C33071Gg0> f61959e;

        /* renamed from: f */
        public Y94<C36207Tq4> f61960f;

        /* renamed from: g */
        public Y94<ScopeProvider> f61961g;

        /* renamed from: h */
        public Y94<InterfaceC40099e13> f61962h;

        /* renamed from: i */
        public Y94<AM3> f61963i;

        /* renamed from: j */
        public Y94<C31901Bg0> f61964j;

        /* renamed from: co.bird.android.app.feature.payment.a$a$a */
        /* loaded from: classes2.dex */
        public static final class C14003a implements Y94<AM3> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61965a;

            public C14003a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61965a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public AM3 get() {
                return (AM3) C51679xZ3.m5003d(this.f61965a.mo27471t());
            }
        }

        /* renamed from: co.bird.android.app.feature.payment.a$a$b */
        /* loaded from: classes2.dex */
        public static final class C14004b implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61966a;

            public C14004b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61966a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f61966a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.app.feature.payment.a$a$c */
        /* loaded from: classes2.dex */
        public static final class C14005c implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f61967a;

            public C14005c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f61967a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f61967a.mo27595B1());
            }
        }

        @Override // co.bird.android.app.feature.payment.CashpayActivity.InterfaceC13997a
        /* renamed from: a */
        public void mo60194a(CashpayActivity cashpayActivity) {
            m60192c(cashpayActivity);
        }

        /* renamed from: b */
        public final void m60193b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C22545h3 c22545h3) {
            this.f61957c = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c22545h3);
            this.f61958d = m44621a;
            this.f61959e = V51.m80429b(C33539Ig0.m101821a(this.f61957c, m44621a));
            this.f61960f = new C14005c(interfaceC44393lG2);
            this.f61961g = C39546d52.m44621a(scopeProvider);
            this.f61962h = new C14004b(interfaceC44393lG2);
            C14003a c14003a = new C14003a(interfaceC44393lG2);
            this.f61963i = c14003a;
            this.f61964j = V51.m80429b(C32135Cg0.m111908a(this.f61959e, this.f61960f, this.f61961g, this.f61962h, c14003a));
        }

        /* renamed from: c */
        public final CashpayActivity m60192c(CashpayActivity cashpayActivity) {
            C5135Ly.m96068n(cashpayActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f61955a.mo27461w2()));
            C5135Ly.m96066p(cashpayActivity, (C36207Tq4) C51679xZ3.m5003d(this.f61955a.mo27595B1()));
            C5135Ly.m96071k(cashpayActivity, (Handler) C51679xZ3.m5003d(this.f61955a.mo27535X2()));
            C5135Ly.m96067o(cashpayActivity, (C22454gl) C51679xZ3.m5003d(this.f61955a.mo27479r()));
            C5135Ly.m96080b(cashpayActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f61955a.mo27519d0()));
            C5135Ly.m96075g(cashpayActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f61955a.mo27453z2()));
            C5135Ly.m96064r(cashpayActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f61955a.mo27459x1()));
            C5135Ly.m96081a(cashpayActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f61955a.mo27474s()));
            C5135Ly.m96073i(cashpayActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f61955a.mo27558P0()));
            C5135Ly.m96074h(cashpayActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f61955a.mo27598A0()));
            C5135Ly.m96077e(cashpayActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f61955a.mo27507i0()));
            C5135Ly.m96070l(cashpayActivity, (FO2) C51679xZ3.m5003d(this.f61955a.mo27456y2()));
            C5135Ly.m96065q(cashpayActivity, (YR4) C51679xZ3.m5003d(this.f61955a.mo27525b0()));
            C5135Ly.m96079c(cashpayActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f61955a.mo27460x()));
            C5135Ly.m96078d(cashpayActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f61955a.mo27517d3()));
            C5135Ly.m96072j(cashpayActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f61955a.mo27482q()));
            C5135Ly.m96076f(cashpayActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f61955a.mo27483p3()));
            C50559vg0.m8271b(cashpayActivity, this.f61964j.get());
            return cashpayActivity;
        }

        public C14002a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C22545h3 c22545h3) {
            this.f61956b = this;
            this.f61955a = interfaceC44393lG2;
            m60193b(interfaceC44393lG2, baseActivity, scopeProvider, c22545h3);
        }
    }

    /* renamed from: co.bird.android.app.feature.payment.a$b */
    /* loaded from: classes2.dex */
    public static final class C14006b implements CashpayActivity.InterfaceC13997a.InterfaceC13998a {
        @Override // co.bird.android.app.feature.payment.CashpayActivity.InterfaceC13997a.InterfaceC13998a
        /* renamed from: a */
        public CashpayActivity.InterfaceC13997a mo60188a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C22545h3 c22545h3) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c22545h3);
            return new C14002a(interfaceC44393lG2, baseActivity, scopeProvider, c22545h3);
        }

        private C14006b() {
        }
    }

    private C14001a() {
    }

    /* renamed from: a */
    public static CashpayActivity.InterfaceC13997a.InterfaceC13998a m60195a() {
        return new C14006b();
    }
}

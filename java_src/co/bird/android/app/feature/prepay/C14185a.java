package co.bird.android.app.feature.prepay;

import android.os.Handler;
import co.bird.android.app.feature.prepay.PaymentMethodActivity;
import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.app.feature.prepay.a */
/* loaded from: classes2.dex */
public final class C14185a {

    /* renamed from: co.bird.android.app.feature.prepay.a$a */
    /* loaded from: classes2.dex */
    public static final class C14186a implements PaymentMethodActivity.InterfaceC14182b.InterfaceC14183a {
        @Override // co.bird.android.app.feature.prepay.PaymentMethodActivity.InterfaceC14182b.InterfaceC14183a
        /* renamed from: a */
        public PaymentMethodActivity.InterfaceC14182b mo59664a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            return new C14187b(interfaceC44393lG2, baseActivity, scopeProvider);
        }

        private C14186a() {
        }
    }

    /* renamed from: co.bird.android.app.feature.prepay.a$b */
    /* loaded from: classes2.dex */
    public static final class C14187b implements PaymentMethodActivity.InterfaceC14182b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f62294a;

        /* renamed from: b */
        public final C14187b f62295b;

        /* renamed from: c */
        public Y94<ScopeProvider> f62296c;

        /* renamed from: d */
        public Y94<BaseActivity> f62297d;

        /* renamed from: e */
        public Y94<C45652nO3> f62298e;

        /* renamed from: f */
        public Y94<InterfaceC40099e13> f62299f;

        /* renamed from: g */
        public Y94<AM3> f62300g;

        /* renamed from: h */
        public Y94<VM3> f62301h;

        /* renamed from: i */
        public Y94<InterfaceC52757zN3> f62302i;

        /* renamed from: j */
        public Y94<YR4> f62303j;

        /* renamed from: k */
        public Y94<InterfaceC1880Ea> f62304k;

        /* renamed from: l */
        public Y94<C39112cO3> f62305l;

        /* renamed from: co.bird.android.app.feature.prepay.a$b$a */
        /* loaded from: classes2.dex */
        public static final class C14188a implements Y94<InterfaceC1880Ea> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62306a;

            public C14188a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62306a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC1880Ea get() {
                return (InterfaceC1880Ea) C51679xZ3.m5003d(this.f62306a.mo27519d0());
            }
        }

        /* renamed from: co.bird.android.app.feature.prepay.a$b$b */
        /* loaded from: classes2.dex */
        public static final class C14189b implements Y94<AM3> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62307a;

            public C14189b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62307a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public AM3 get() {
                return (AM3) C51679xZ3.m5003d(this.f62307a.mo27471t());
            }
        }

        /* renamed from: co.bird.android.app.feature.prepay.a$b$c */
        /* loaded from: classes2.dex */
        public static final class C14190c implements Y94<VM3> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62308a;

            public C14190c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62308a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public VM3 get() {
                return (VM3) C51679xZ3.m5003d(this.f62308a.mo27585F());
            }
        }

        /* renamed from: co.bird.android.app.feature.prepay.a$b$d */
        /* loaded from: classes2.dex */
        public static final class C14191d implements Y94<InterfaceC52757zN3> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62309a;

            public C14191d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62309a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC52757zN3 get() {
                return (InterfaceC52757zN3) C51679xZ3.m5003d(this.f62309a.mo27518d2());
            }
        }

        /* renamed from: co.bird.android.app.feature.prepay.a$b$e */
        /* loaded from: classes2.dex */
        public static final class C14192e implements Y94<YR4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62310a;

            public C14192e(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62310a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public YR4 get() {
                return (YR4) C51679xZ3.m5003d(this.f62310a.mo27525b0());
            }
        }

        /* renamed from: co.bird.android.app.feature.prepay.a$b$f */
        /* loaded from: classes2.dex */
        public static final class C14193f implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f62311a;

            public C14193f(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f62311a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f62311a.mo27461w2());
            }
        }

        @Override // co.bird.android.app.feature.prepay.PaymentMethodActivity.InterfaceC14182b
        /* renamed from: a */
        public void mo59663a(PaymentMethodActivity paymentMethodActivity) {
            m59661c(paymentMethodActivity);
        }

        /* renamed from: b */
        public final void m59662b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider) {
            this.f62296c = C39546d52.m44621a(scopeProvider);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(baseActivity);
            this.f62297d = m44621a;
            this.f62298e = V51.m80429b(C46245oO3.m21233a(m44621a));
            this.f62299f = new C14193f(interfaceC44393lG2);
            this.f62300g = new C14189b(interfaceC44393lG2);
            this.f62301h = new C14190c(interfaceC44393lG2);
            this.f62302i = new C14191d(interfaceC44393lG2);
            this.f62303j = new C14192e(interfaceC44393lG2);
            C14188a c14188a = new C14188a(interfaceC44393lG2);
            this.f62304k = c14188a;
            this.f62305l = V51.m80429b(C43280jO3.m30727a(this.f62296c, this.f62298e, this.f62299f, this.f62300g, this.f62301h, this.f62302i, this.f62303j, c14188a));
        }

        /* renamed from: c */
        public final PaymentMethodActivity m59661c(PaymentMethodActivity paymentMethodActivity) {
            C5135Ly.m96068n(paymentMethodActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f62294a.mo27461w2()));
            C5135Ly.m96066p(paymentMethodActivity, (C36207Tq4) C51679xZ3.m5003d(this.f62294a.mo27595B1()));
            C5135Ly.m96071k(paymentMethodActivity, (Handler) C51679xZ3.m5003d(this.f62294a.mo27535X2()));
            C5135Ly.m96067o(paymentMethodActivity, (C22454gl) C51679xZ3.m5003d(this.f62294a.mo27479r()));
            C5135Ly.m96080b(paymentMethodActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f62294a.mo27519d0()));
            C5135Ly.m96075g(paymentMethodActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f62294a.mo27453z2()));
            C5135Ly.m96064r(paymentMethodActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f62294a.mo27459x1()));
            C5135Ly.m96081a(paymentMethodActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f62294a.mo27474s()));
            C5135Ly.m96073i(paymentMethodActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f62294a.mo27558P0()));
            C5135Ly.m96074h(paymentMethodActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f62294a.mo27598A0()));
            C5135Ly.m96077e(paymentMethodActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f62294a.mo27507i0()));
            C5135Ly.m96070l(paymentMethodActivity, (FO2) C51679xZ3.m5003d(this.f62294a.mo27456y2()));
            C5135Ly.m96065q(paymentMethodActivity, (YR4) C51679xZ3.m5003d(this.f62294a.mo27525b0()));
            C5135Ly.m96079c(paymentMethodActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f62294a.mo27460x()));
            C5135Ly.m96078d(paymentMethodActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f62294a.mo27517d3()));
            C5135Ly.m96072j(paymentMethodActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f62294a.mo27482q()));
            C5135Ly.m96076f(paymentMethodActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f62294a.mo27483p3()));
            C47422qN3.m17582b(paymentMethodActivity, this.f62305l.get());
            return paymentMethodActivity;
        }

        public C14187b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider) {
            this.f62295b = this;
            this.f62294a = interfaceC44393lG2;
            m59662b(interfaceC44393lG2, baseActivity, scopeProvider);
        }
    }

    private C14185a() {
    }

    /* renamed from: a */
    public static PaymentMethodActivity.InterfaceC14182b.InterfaceC14183a m59665a() {
        return new C14186a();
    }
}

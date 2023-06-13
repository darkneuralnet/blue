package co.bird.android.feature.payment.quickpayment;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.payment.quickpayment.QuickPaymentActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.payment.quickpayment.a */
/* loaded from: classes3.dex */
public final class C15118a {

    /* renamed from: co.bird.android.feature.payment.quickpayment.a$a */
    /* loaded from: classes3.dex */
    public static final class C15119a implements QuickPaymentActivity.InterfaceC15114a.InterfaceC15115a {
        @Override // co.bird.android.feature.payment.quickpayment.QuickPaymentActivity.InterfaceC15114a.InterfaceC15115a
        /* renamed from: a */
        public QuickPaymentActivity.InterfaceC15114a mo57694a(InterfaceC44393lG2 interfaceC44393lG2, QuickPaymentActivity.C15116b c15116b, BaseActivity baseActivity, ScopeProvider scopeProvider, C10566a5 c10566a5) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(c15116b);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c10566a5);
            return new C15120b(c15116b, interfaceC44393lG2, baseActivity, scopeProvider, c10566a5);
        }

        private C15119a() {
        }
    }

    /* renamed from: co.bird.android.feature.payment.quickpayment.a$b */
    /* loaded from: classes3.dex */
    public static final class C15120b implements QuickPaymentActivity.InterfaceC15114a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64470a;

        /* renamed from: b */
        public final C15120b f64471b;

        /* renamed from: c */
        public Y94<C36207Tq4> f64472c;

        /* renamed from: d */
        public Y94<InterfaceC1880Ea> f64473d;

        /* renamed from: e */
        public Y94<InterfaceC46037o21> f64474e;

        /* renamed from: f */
        public Y94<InterfaceC44647lh6> f64475f;

        /* renamed from: g */
        public Y94<InterfaceC35660Rh6> f64476g;

        /* renamed from: h */
        public Y94<AM3> f64477h;

        /* renamed from: i */
        public Y94<InterfaceC42586iD1> f64478i;

        /* renamed from: j */
        public Y94<InterfaceC50768w10> f64479j;

        /* renamed from: k */
        public Y94<InterfaceC40001dr4> f64480k;

        /* renamed from: l */
        public Y94<InterfaceC40099e13> f64481l;

        /* renamed from: m */
        public Y94<ScopeProvider> f64482m;

        /* renamed from: n */
        public Y94<BaseActivity> f64483n;

        /* renamed from: o */
        public Y94<C10566a5> f64484o;

        /* renamed from: p */
        public Y94<C39872de4> f64485p;

        /* renamed from: q */
        public Y94<C41057fe4> f64486q;

        /* renamed from: r */
        public Y94<InterfaceC39261ce4> f64487r;

        /* renamed from: s */
        public Y94<C38075ae4> f64488s;

        /* renamed from: co.bird.android.feature.payment.quickpayment.a$b$a */
        /* loaded from: classes3.dex */
        public static final class C15121a implements Y94<InterfaceC1880Ea> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64489a;

            public C15121a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64489a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC1880Ea get() {
                return (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64489a.mo27519d0());
            }
        }

        /* renamed from: co.bird.android.feature.payment.quickpayment.a$b$b */
        /* loaded from: classes3.dex */
        public static final class C15122b implements Y94<InterfaceC46037o21> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64490a;

            public C15122b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64490a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC46037o21 get() {
                return (InterfaceC46037o21) C51679xZ3.m5003d(this.f64490a.mo27483p3());
            }
        }

        /* renamed from: co.bird.android.feature.payment.quickpayment.a$b$c */
        /* loaded from: classes3.dex */
        public static final class C15123c implements Y94<InterfaceC50768w10> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64491a;

            public C15123c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64491a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC50768w10 get() {
                return (InterfaceC50768w10) C51679xZ3.m5003d(this.f64491a.mo27541W());
            }
        }

        /* renamed from: co.bird.android.feature.payment.quickpayment.a$b$d */
        /* loaded from: classes3.dex */
        public static final class C15124d implements Y94<InterfaceC42586iD1> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64492a;

            public C15124d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64492a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC42586iD1 get() {
                return (InterfaceC42586iD1) C51679xZ3.m5003d(this.f64492a.mo27539W2());
            }
        }

        /* renamed from: co.bird.android.feature.payment.quickpayment.a$b$e */
        /* loaded from: classes3.dex */
        public static final class C15125e implements Y94<AM3> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64493a;

            public C15125e(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64493a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public AM3 get() {
                return (AM3) C51679xZ3.m5003d(this.f64493a.mo27471t());
            }
        }

        /* renamed from: co.bird.android.feature.payment.quickpayment.a$b$f */
        /* loaded from: classes3.dex */
        public static final class C15126f implements Y94<InterfaceC35660Rh6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64494a;

            public C15126f(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64494a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC35660Rh6 get() {
                return (InterfaceC35660Rh6) C51679xZ3.m5003d(this.f64494a.mo27500k1());
            }
        }

        /* renamed from: co.bird.android.feature.payment.quickpayment.a$b$g */
        /* loaded from: classes3.dex */
        public static final class C15127g implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64495a;

            public C15127g(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64495a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f64495a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.feature.payment.quickpayment.a$b$h */
        /* loaded from: classes3.dex */
        public static final class C15128h implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64496a;

            public C15128h(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64496a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f64496a.mo27595B1());
            }
        }

        /* renamed from: co.bird.android.feature.payment.quickpayment.a$b$i */
        /* loaded from: classes3.dex */
        public static final class C15129i implements Y94<InterfaceC40001dr4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64497a;

            public C15129i(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64497a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40001dr4 get() {
                return (InterfaceC40001dr4) C51679xZ3.m5003d(this.f64497a.mo27482q());
            }
        }

        /* renamed from: co.bird.android.feature.payment.quickpayment.a$b$j */
        /* loaded from: classes3.dex */
        public static final class C15130j implements Y94<InterfaceC44647lh6> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64498a;

            public C15130j(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64498a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC44647lh6 get() {
                return (InterfaceC44647lh6) C51679xZ3.m5003d(this.f64498a.mo27459x1());
            }
        }

        @Override // co.bird.android.feature.payment.quickpayment.QuickPaymentActivity.InterfaceC15114a
        /* renamed from: a */
        public void mo57693a(QuickPaymentActivity quickPaymentActivity) {
            m57691c(quickPaymentActivity);
        }

        /* renamed from: b */
        public final void m57692b(QuickPaymentActivity.C15116b c15116b, InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C10566a5 c10566a5) {
            this.f64472c = new C15128h(interfaceC44393lG2);
            this.f64473d = new C15121a(interfaceC44393lG2);
            this.f64474e = new C15122b(interfaceC44393lG2);
            this.f64475f = new C15130j(interfaceC44393lG2);
            this.f64476g = new C15126f(interfaceC44393lG2);
            this.f64477h = new C15125e(interfaceC44393lG2);
            this.f64478i = new C15124d(interfaceC44393lG2);
            this.f64479j = new C15123c(interfaceC44393lG2);
            this.f64480k = new C15129i(interfaceC44393lG2);
            this.f64481l = new C15127g(interfaceC44393lG2);
            this.f64482m = C39546d52.m44621a(scopeProvider);
            this.f64483n = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c10566a5);
            this.f64484o = m44621a;
            this.f64485p = V51.m80429b(C40464ee4.m42667a(this.f64483n, this.f64478i, m44621a));
            Y94<C41057fe4> m80429b = V51.m80429b(C41650ge4.m37940a(this.f64483n, this.f64478i));
            this.f64486q = m80429b;
            Y94<InterfaceC39261ce4> m80429b2 = V51.m80429b(C15131b.m57680a(c15116b, this.f64485p, m80429b));
            this.f64487r = m80429b2;
            this.f64488s = V51.m80429b(C38668be4.m64219a(this.f64472c, this.f64473d, this.f64474e, this.f64475f, this.f64476g, this.f64477h, this.f64478i, this.f64479j, this.f64480k, this.f64481l, this.f64482m, m80429b2));
        }

        /* renamed from: c */
        public final QuickPaymentActivity m57691c(QuickPaymentActivity quickPaymentActivity) {
            C5135Ly.m96068n(quickPaymentActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64470a.mo27461w2()));
            C5135Ly.m96066p(quickPaymentActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64470a.mo27595B1()));
            C5135Ly.m96071k(quickPaymentActivity, (Handler) C51679xZ3.m5003d(this.f64470a.mo27535X2()));
            C5135Ly.m96067o(quickPaymentActivity, (C22454gl) C51679xZ3.m5003d(this.f64470a.mo27479r()));
            C5135Ly.m96080b(quickPaymentActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64470a.mo27519d0()));
            C5135Ly.m96075g(quickPaymentActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f64470a.mo27453z2()));
            C5135Ly.m96064r(quickPaymentActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f64470a.mo27459x1()));
            C5135Ly.m96081a(quickPaymentActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f64470a.mo27474s()));
            C5135Ly.m96073i(quickPaymentActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f64470a.mo27558P0()));
            C5135Ly.m96074h(quickPaymentActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f64470a.mo27598A0()));
            C5135Ly.m96077e(quickPaymentActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f64470a.mo27507i0()));
            C5135Ly.m96070l(quickPaymentActivity, (FO2) C51679xZ3.m5003d(this.f64470a.mo27456y2()));
            C5135Ly.m96065q(quickPaymentActivity, (YR4) C51679xZ3.m5003d(this.f64470a.mo27525b0()));
            C5135Ly.m96079c(quickPaymentActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f64470a.mo27460x()));
            C5135Ly.m96078d(quickPaymentActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f64470a.mo27517d3()));
            C5135Ly.m96072j(quickPaymentActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f64470a.mo27482q()));
            C5135Ly.m96076f(quickPaymentActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f64470a.mo27483p3()));
            C47570qd4.m17314b(quickPaymentActivity, this.f64488s.get());
            return quickPaymentActivity;
        }

        public C15120b(QuickPaymentActivity.C15116b c15116b, InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C10566a5 c10566a5) {
            this.f64471b = this;
            this.f64470a = interfaceC44393lG2;
            m57692b(c15116b, interfaceC44393lG2, baseActivity, scopeProvider, c10566a5);
        }
    }

    private C15118a() {
    }

    /* renamed from: a */
    public static QuickPaymentActivity.InterfaceC15114a.InterfaceC15115a m57695a() {
        return new C15119a();
    }
}

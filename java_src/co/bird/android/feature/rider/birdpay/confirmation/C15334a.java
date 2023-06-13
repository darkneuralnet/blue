package co.bird.android.feature.rider.birdpay.confirmation;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.rider.birdpay.confirmation.C15347e;
import co.bird.android.feature.rider.birdpay.confirmation.InterfaceC15342b;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.rider.birdpay.confirmation.a */
/* loaded from: classes3.dex */
public final class C15334a {

    /* renamed from: co.bird.android.feature.rider.birdpay.confirmation.a$a */
    /* loaded from: classes3.dex */
    public static final class C15335a implements InterfaceC15342b.InterfaceC15343a {
        @Override // co.bird.android.feature.rider.birdpay.confirmation.InterfaceC15342b.InterfaceC15343a
        /* renamed from: a */
        public InterfaceC15342b mo57358a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            return new C15336b(interfaceC44393lG2, baseActivity);
        }

        private C15335a() {
        }
    }

    /* renamed from: co.bird.android.feature.rider.birdpay.confirmation.a$b */
    /* loaded from: classes3.dex */
    public static final class C15336b implements InterfaceC15342b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64870a;

        /* renamed from: b */
        public final C15336b f64871b;

        /* renamed from: c */
        public Y94<BaseActivity> f64872c;

        /* renamed from: d */
        public Y94<C15347e.C15349b> f64873d;

        /* renamed from: e */
        public Y94<C41483gM3> f64874e;

        /* renamed from: f */
        public Y94<ScopeProvider> f64875f;

        /* renamed from: g */
        public Y94<InterfaceC1880Ea> f64876g;

        /* renamed from: h */
        public Y94<InterfaceC23227iO> f64877h;

        /* renamed from: i */
        public Y94<C22454gl> f64878i;

        /* renamed from: j */
        public Y94<InterfaceC40099e13> f64879j;

        /* renamed from: k */
        public Y94<C36207Tq4> f64880k;

        /* renamed from: l */
        public Y94<C15347e> f64881l;

        /* renamed from: co.bird.android.feature.rider.birdpay.confirmation.a$b$a */
        /* loaded from: classes3.dex */
        public static final class C15337a implements Y94<InterfaceC1880Ea> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64882a;

            public C15337a(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64882a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC1880Ea get() {
                return (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64882a.mo27519d0());
            }
        }

        /* renamed from: co.bird.android.feature.rider.birdpay.confirmation.a$b$b */
        /* loaded from: classes3.dex */
        public static final class C15338b implements Y94<C22454gl> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64883a;

            public C15338b(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64883a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C22454gl get() {
                return (C22454gl) C51679xZ3.m5003d(this.f64883a.mo27479r());
            }
        }

        /* renamed from: co.bird.android.feature.rider.birdpay.confirmation.a$b$c */
        /* loaded from: classes3.dex */
        public static final class C15339c implements Y94<InterfaceC23227iO> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64884a;

            public C15339c(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64884a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC23227iO get() {
                return (InterfaceC23227iO) C51679xZ3.m5003d(this.f64884a.mo27536X1());
            }
        }

        /* renamed from: co.bird.android.feature.rider.birdpay.confirmation.a$b$d */
        /* loaded from: classes3.dex */
        public static final class C15340d implements Y94<InterfaceC40099e13> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64885a;

            public C15340d(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64885a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public InterfaceC40099e13 get() {
                return (InterfaceC40099e13) C51679xZ3.m5003d(this.f64885a.mo27461w2());
            }
        }

        /* renamed from: co.bird.android.feature.rider.birdpay.confirmation.a$b$e */
        /* loaded from: classes3.dex */
        public static final class C15341e implements Y94<C36207Tq4> {

            /* renamed from: a */
            public final InterfaceC44393lG2 f64886a;

            public C15341e(InterfaceC44393lG2 interfaceC44393lG2) {
                this.f64886a = interfaceC44393lG2;
            }

            @Override // p000.Y94
            /* renamed from: a */
            public C36207Tq4 get() {
                return (C36207Tq4) C51679xZ3.m5003d(this.f64886a.mo27595B1());
            }
        }

        @Override // co.bird.android.feature.rider.birdpay.confirmation.InterfaceC15342b
        /* renamed from: a */
        public void mo57359a(PaymentConfirmationActivity paymentConfirmationActivity) {
            m57365c(paymentConfirmationActivity);
        }

        /* renamed from: b */
        public final void m57366b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity) {
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(baseActivity);
            this.f64872c = m44621a;
            this.f64873d = V51.m80429b(C15346d.m57352a(m44621a));
            this.f64874e = V51.m80429b(C42076hM3.m36526a(this.f64872c));
            this.f64875f = V51.m80429b(this.f64872c);
            this.f64876g = new C15337a(interfaceC44393lG2);
            this.f64877h = new C15339c(interfaceC44393lG2);
            this.f64878i = new C15338b(interfaceC44393lG2);
            this.f64879j = new C15340d(interfaceC44393lG2);
            C15341e c15341e = new C15341e(interfaceC44393lG2);
            this.f64880k = c15341e;
            this.f64881l = V51.m80429b(C15359f.m57315a(this.f64873d, this.f64874e, this.f64875f, this.f64876g, this.f64877h, this.f64878i, this.f64879j, c15341e));
        }

        /* renamed from: c */
        public final PaymentConfirmationActivity m57365c(PaymentConfirmationActivity paymentConfirmationActivity) {
            C5135Ly.m96068n(paymentConfirmationActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64870a.mo27461w2()));
            C5135Ly.m96066p(paymentConfirmationActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64870a.mo27595B1()));
            C5135Ly.m96071k(paymentConfirmationActivity, (Handler) C51679xZ3.m5003d(this.f64870a.mo27535X2()));
            C5135Ly.m96067o(paymentConfirmationActivity, (C22454gl) C51679xZ3.m5003d(this.f64870a.mo27479r()));
            C5135Ly.m96080b(paymentConfirmationActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64870a.mo27519d0()));
            C5135Ly.m96075g(paymentConfirmationActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f64870a.mo27453z2()));
            C5135Ly.m96064r(paymentConfirmationActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f64870a.mo27459x1()));
            C5135Ly.m96081a(paymentConfirmationActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f64870a.mo27474s()));
            C5135Ly.m96073i(paymentConfirmationActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f64870a.mo27558P0()));
            C5135Ly.m96074h(paymentConfirmationActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f64870a.mo27598A0()));
            C5135Ly.m96077e(paymentConfirmationActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f64870a.mo27507i0()));
            C5135Ly.m96070l(paymentConfirmationActivity, (FO2) C51679xZ3.m5003d(this.f64870a.mo27456y2()));
            C5135Ly.m96065q(paymentConfirmationActivity, (YR4) C51679xZ3.m5003d(this.f64870a.mo27525b0()));
            C5135Ly.m96079c(paymentConfirmationActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f64870a.mo27460x()));
            C5135Ly.m96078d(paymentConfirmationActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f64870a.mo27517d3()));
            C5135Ly.m96072j(paymentConfirmationActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f64870a.mo27482q()));
            C5135Ly.m96076f(paymentConfirmationActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f64870a.mo27483p3()));
            RL3.m86833b(paymentConfirmationActivity, this.f64881l.get());
            return paymentConfirmationActivity;
        }

        public C15336b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity) {
            this.f64871b = this;
            this.f64870a = interfaceC44393lG2;
            m57366b(interfaceC44393lG2, baseActivity);
        }
    }

    private C15334a() {
    }

    /* renamed from: a */
    public static InterfaceC15342b.InterfaceC15343a m57367a() {
        return new C15335a();
    }
}

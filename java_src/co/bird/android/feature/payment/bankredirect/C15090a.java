package co.bird.android.feature.payment.bankredirect;

import android.os.Handler;
import co.bird.android.buava.Optional;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.payment.bankredirect.AddBalanceActivity;
import co.bird.android.model.constant.PaymentMethod;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.payment.bankredirect.a */
/* loaded from: classes3.dex */
public final class C15090a {

    /* renamed from: co.bird.android.feature.payment.bankredirect.a$a */
    /* loaded from: classes3.dex */
    public static final class C15091a implements AddBalanceActivity.InterfaceC15085a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64402a;

        /* renamed from: b */
        public final PaymentMethod f64403b;

        /* renamed from: c */
        public final ScopeProvider f64404c;

        /* renamed from: d */
        public final Optional<C38887c04> f64405d;

        /* renamed from: e */
        public final C15091a f64406e;

        /* renamed from: f */
        public Y94<BaseActivity> f64407f;

        /* renamed from: g */
        public Y94<C5462N2> f64408g;

        /* renamed from: h */
        public Y94<C9609Y6> f64409h;

        /* renamed from: i */
        public Y94<InterfaceC9297X6> f64410i;

        @Override // co.bird.android.feature.payment.bankredirect.AddBalanceActivity.InterfaceC15085a
        /* renamed from: a */
        public void mo57784a(AddBalanceActivity addBalanceActivity) {
            m57781d(addBalanceActivity);
        }

        /* renamed from: b */
        public final C7647T6 m57783b() {
            return new C7647T6((InterfaceC40099e13) C51679xZ3.m5003d(this.f64402a.mo27461w2()), (VM3) C51679xZ3.m5003d(this.f64402a.mo27585F()), this.f64403b, this.f64404c, (C36207Tq4) C51679xZ3.m5003d(this.f64402a.mo27595B1()), this.f64410i.get(), (InterfaceC44647lh6) C51679xZ3.m5003d(this.f64402a.mo27459x1()), this.f64405d);
        }

        /* renamed from: c */
        public final void m57782c(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C5462N2 c5462n2, PaymentMethod paymentMethod, Optional<C38887c04> optional) {
            this.f64407f = C39546d52.m44621a(baseActivity);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(c5462n2);
            this.f64408g = m44621a;
            C10114Z6 m73731a = C10114Z6.m73731a(this.f64407f, m44621a);
            this.f64409h = m73731a;
            this.f64410i = V51.m80429b(m73731a);
        }

        /* renamed from: d */
        public final AddBalanceActivity m57781d(AddBalanceActivity addBalanceActivity) {
            C5135Ly.m96068n(addBalanceActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64402a.mo27461w2()));
            C5135Ly.m96066p(addBalanceActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64402a.mo27595B1()));
            C5135Ly.m96071k(addBalanceActivity, (Handler) C51679xZ3.m5003d(this.f64402a.mo27535X2()));
            C5135Ly.m96067o(addBalanceActivity, (C22454gl) C51679xZ3.m5003d(this.f64402a.mo27479r()));
            C5135Ly.m96080b(addBalanceActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64402a.mo27519d0()));
            C5135Ly.m96075g(addBalanceActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f64402a.mo27453z2()));
            C5135Ly.m96064r(addBalanceActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f64402a.mo27459x1()));
            C5135Ly.m96081a(addBalanceActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f64402a.mo27474s()));
            C5135Ly.m96073i(addBalanceActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f64402a.mo27558P0()));
            C5135Ly.m96074h(addBalanceActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f64402a.mo27598A0()));
            C5135Ly.m96077e(addBalanceActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f64402a.mo27507i0()));
            C5135Ly.m96070l(addBalanceActivity, (FO2) C51679xZ3.m5003d(this.f64402a.mo27456y2()));
            C5135Ly.m96065q(addBalanceActivity, (YR4) C51679xZ3.m5003d(this.f64402a.mo27525b0()));
            C5135Ly.m96079c(addBalanceActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f64402a.mo27460x()));
            C5135Ly.m96078d(addBalanceActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f64402a.mo27517d3()));
            C5135Ly.m96072j(addBalanceActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f64402a.mo27482q()));
            C5135Ly.m96076f(addBalanceActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f64402a.mo27483p3()));
            C3325I6.m102957b(addBalanceActivity, m57783b());
            return addBalanceActivity;
        }

        public C15091a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C5462N2 c5462n2, PaymentMethod paymentMethod, Optional<C38887c04> optional) {
            this.f64406e = this;
            this.f64402a = interfaceC44393lG2;
            this.f64403b = paymentMethod;
            this.f64404c = scopeProvider;
            this.f64405d = optional;
            m57782c(interfaceC44393lG2, baseActivity, scopeProvider, c5462n2, paymentMethod, optional);
        }
    }

    /* renamed from: co.bird.android.feature.payment.bankredirect.a$b */
    /* loaded from: classes3.dex */
    public static final class C15092b implements AddBalanceActivity.InterfaceC15085a.InterfaceC15086a {
        @Override // co.bird.android.feature.payment.bankredirect.AddBalanceActivity.InterfaceC15085a.InterfaceC15086a
        /* renamed from: a */
        public AddBalanceActivity.InterfaceC15085a mo57780a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C5462N2 c5462n2, PaymentMethod paymentMethod, Optional<C38887c04> optional) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c5462n2);
            C51679xZ3.m5005b(paymentMethod);
            C51679xZ3.m5005b(optional);
            return new C15091a(interfaceC44393lG2, baseActivity, scopeProvider, c5462n2, paymentMethod, optional);
        }

        private C15092b() {
        }
    }

    private C15090a() {
    }

    /* renamed from: a */
    public static AddBalanceActivity.InterfaceC15085a.InterfaceC15086a m57785a() {
        return new C15092b();
    }
}

package co.bird.android.feature.payment.bankredirect;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.payment.bankredirect.BankRedirectLaunchActivity;
import co.bird.android.model.constant.PaymentMethod;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.payment.bankredirect.b */
/* loaded from: classes3.dex */
public final class C15093b {

    /* renamed from: co.bird.android.feature.payment.bankredirect.b$a */
    /* loaded from: classes3.dex */
    public static final class C15094a implements BankRedirectLaunchActivity.InterfaceC15088a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64411a;

        /* renamed from: b */
        public final String f64412b;

        /* renamed from: c */
        public final String f64413c;

        /* renamed from: d */
        public final PaymentMethod f64414d;

        /* renamed from: e */
        public final ScopeProvider f64415e;

        /* renamed from: f */
        public final BaseActivity f64416f;

        /* renamed from: g */
        public final C22546h4 f64417g;

        /* renamed from: h */
        public final C15094a f64418h;

        @Override // co.bird.android.feature.payment.bankredirect.BankRedirectLaunchActivity.InterfaceC15088a
        /* renamed from: a */
        public void mo57778a(BankRedirectLaunchActivity bankRedirectLaunchActivity) {
            m57775d(bankRedirectLaunchActivity);
        }

        /* renamed from: b */
        public final C26297mx m57777b() {
            return new C26297mx((InterfaceC40099e13) C51679xZ3.m5003d(this.f64411a.mo27461w2()), (VM3) C51679xZ3.m5003d(this.f64411a.mo27585F()), this.f64412b, this.f64413c, this.f64414d, this.f64415e, (C36207Tq4) C51679xZ3.m5003d(this.f64411a.mo27595B1()), (InterfaceC44647lh6) C51679xZ3.m5003d(this.f64411a.mo27459x1()), m57776c());
        }

        /* renamed from: c */
        public final C27107ox m57776c() {
            return new C27107ox(this.f64416f, this.f64417g);
        }

        /* renamed from: d */
        public final BankRedirectLaunchActivity m57775d(BankRedirectLaunchActivity bankRedirectLaunchActivity) {
            C5135Ly.m96068n(bankRedirectLaunchActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64411a.mo27461w2()));
            C5135Ly.m96066p(bankRedirectLaunchActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64411a.mo27595B1()));
            C5135Ly.m96071k(bankRedirectLaunchActivity, (Handler) C51679xZ3.m5003d(this.f64411a.mo27535X2()));
            C5135Ly.m96067o(bankRedirectLaunchActivity, (C22454gl) C51679xZ3.m5003d(this.f64411a.mo27479r()));
            C5135Ly.m96080b(bankRedirectLaunchActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64411a.mo27519d0()));
            C5135Ly.m96075g(bankRedirectLaunchActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f64411a.mo27453z2()));
            C5135Ly.m96064r(bankRedirectLaunchActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f64411a.mo27459x1()));
            C5135Ly.m96081a(bankRedirectLaunchActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f64411a.mo27474s()));
            C5135Ly.m96073i(bankRedirectLaunchActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f64411a.mo27558P0()));
            C5135Ly.m96074h(bankRedirectLaunchActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f64411a.mo27598A0()));
            C5135Ly.m96077e(bankRedirectLaunchActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f64411a.mo27507i0()));
            C5135Ly.m96070l(bankRedirectLaunchActivity, (FO2) C51679xZ3.m5003d(this.f64411a.mo27456y2()));
            C5135Ly.m96065q(bankRedirectLaunchActivity, (YR4) C51679xZ3.m5003d(this.f64411a.mo27525b0()));
            C5135Ly.m96079c(bankRedirectLaunchActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f64411a.mo27460x()));
            C5135Ly.m96078d(bankRedirectLaunchActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f64411a.mo27517d3()));
            C5135Ly.m96072j(bankRedirectLaunchActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f64411a.mo27482q()));
            C5135Ly.m96076f(bankRedirectLaunchActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f64411a.mo27483p3()));
            C25563kx.m28099b(bankRedirectLaunchActivity, m57777b());
            return bankRedirectLaunchActivity;
        }

        public C15094a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C22546h4 c22546h4, String str, String str2, String str3, PaymentMethod paymentMethod) {
            this.f64418h = this;
            this.f64411a = interfaceC44393lG2;
            this.f64412b = str;
            this.f64413c = str2;
            this.f64414d = paymentMethod;
            this.f64415e = scopeProvider;
            this.f64416f = baseActivity;
            this.f64417g = c22546h4;
        }
    }

    /* renamed from: co.bird.android.feature.payment.bankredirect.b$b */
    /* loaded from: classes3.dex */
    public static final class C15095b implements BankRedirectLaunchActivity.InterfaceC15088a.InterfaceC15089a {
        @Override // co.bird.android.feature.payment.bankredirect.BankRedirectLaunchActivity.InterfaceC15088a.InterfaceC15089a
        /* renamed from: a */
        public BankRedirectLaunchActivity.InterfaceC15088a mo57774a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C22546h4 c22546h4, String str, String str2, String str3, PaymentMethod paymentMethod) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c22546h4);
            C51679xZ3.m5005b(str);
            C51679xZ3.m5005b(str2);
            C51679xZ3.m5005b(paymentMethod);
            return new C15094a(interfaceC44393lG2, baseActivity, scopeProvider, c22546h4, str, str2, str3, paymentMethod);
        }

        private C15095b() {
        }
    }

    private C15093b() {
    }

    /* renamed from: a */
    public static BankRedirectLaunchActivity.InterfaceC15088a.InterfaceC15089a m57779a() {
        return new C15095b();
    }
}

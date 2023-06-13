package co.bird.android.feature.selfservepayment.refund;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.selfservepayment.refund.RefundAccountBalanceActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.selfservepayment.refund.a */
/* loaded from: classes3.dex */
public final class C15548a {

    /* renamed from: co.bird.android.feature.selfservepayment.refund.a$a */
    /* loaded from: classes3.dex */
    public static final class C15549a implements RefundAccountBalanceActivity.InterfaceC15545a.InterfaceC15546a {
        @Override // co.bird.android.feature.selfservepayment.refund.RefundAccountBalanceActivity.InterfaceC15545a.InterfaceC15546a
        /* renamed from: a */
        public RefundAccountBalanceActivity.InterfaceC15545a mo56947a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C13387c5 c13387c5, DQ3 dq3) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c13387c5);
            C51679xZ3.m5005b(dq3);
            return new C15550b(interfaceC44393lG2, baseActivity, scopeProvider, c13387c5, dq3);
        }

        private C15549a() {
        }
    }

    /* renamed from: co.bird.android.feature.selfservepayment.refund.a$b */
    /* loaded from: classes3.dex */
    public static final class C15550b implements RefundAccountBalanceActivity.InterfaceC15545a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65232a;

        /* renamed from: b */
        public final BaseActivity f65233b;

        /* renamed from: c */
        public final C13387c5 f65234c;

        /* renamed from: d */
        public final ScopeProvider f65235d;

        /* renamed from: e */
        public final C15550b f65236e;

        @Override // co.bird.android.feature.selfservepayment.refund.RefundAccountBalanceActivity.InterfaceC15545a
        /* renamed from: a */
        public void mo56946a(RefundAccountBalanceActivity refundAccountBalanceActivity) {
            m56945b(refundAccountBalanceActivity);
        }

        /* renamed from: b */
        public final RefundAccountBalanceActivity m56945b(RefundAccountBalanceActivity refundAccountBalanceActivity) {
            C5135Ly.m96068n(refundAccountBalanceActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65232a.mo27461w2()));
            C5135Ly.m96066p(refundAccountBalanceActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65232a.mo27595B1()));
            C5135Ly.m96071k(refundAccountBalanceActivity, (Handler) C51679xZ3.m5003d(this.f65232a.mo27535X2()));
            C5135Ly.m96067o(refundAccountBalanceActivity, (C22454gl) C51679xZ3.m5003d(this.f65232a.mo27479r()));
            C5135Ly.m96080b(refundAccountBalanceActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65232a.mo27519d0()));
            C5135Ly.m96075g(refundAccountBalanceActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f65232a.mo27453z2()));
            C5135Ly.m96064r(refundAccountBalanceActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65232a.mo27459x1()));
            C5135Ly.m96081a(refundAccountBalanceActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f65232a.mo27474s()));
            C5135Ly.m96073i(refundAccountBalanceActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f65232a.mo27558P0()));
            C5135Ly.m96074h(refundAccountBalanceActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f65232a.mo27598A0()));
            C5135Ly.m96077e(refundAccountBalanceActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f65232a.mo27507i0()));
            C5135Ly.m96070l(refundAccountBalanceActivity, (FO2) C51679xZ3.m5003d(this.f65232a.mo27456y2()));
            C5135Ly.m96065q(refundAccountBalanceActivity, (YR4) C51679xZ3.m5003d(this.f65232a.mo27525b0()));
            C5135Ly.m96079c(refundAccountBalanceActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f65232a.mo27460x()));
            C5135Ly.m96078d(refundAccountBalanceActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f65232a.mo27517d3()));
            C5135Ly.m96072j(refundAccountBalanceActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65232a.mo27482q()));
            C5135Ly.m96076f(refundAccountBalanceActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f65232a.mo27483p3()));
            C51286wt4.m6184b(refundAccountBalanceActivity, m56944c());
            return refundAccountBalanceActivity;
        }

        /* renamed from: c */
        public final C32958Ft4 m56944c() {
            return new C32958Ft4(m56943d(), this.f65235d, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65232a.mo27461w2()), (C22454gl) C51679xZ3.m5003d(this.f65232a.mo27479r()), (C36207Tq4) C51679xZ3.m5003d(this.f65232a.mo27595B1()), (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65232a.mo27519d0()), (YR4) C51679xZ3.m5003d(this.f65232a.mo27525b0()), (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65232a.mo27459x1()));
        }

        /* renamed from: d */
        public final C33660It4 m56943d() {
            return new C33660It4(this.f65233b, this.f65234c);
        }

        public C15550b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C13387c5 c13387c5, DQ3 dq3) {
            this.f65236e = this;
            this.f65232a = interfaceC44393lG2;
            this.f65233b = baseActivity;
            this.f65234c = c13387c5;
            this.f65235d = scopeProvider;
        }
    }

    private C15548a() {
    }

    /* renamed from: a */
    public static RefundAccountBalanceActivity.InterfaceC15545a.InterfaceC15546a m56948a() {
        return new C15549a();
    }
}

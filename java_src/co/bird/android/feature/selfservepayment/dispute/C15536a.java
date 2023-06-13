package co.bird.android.feature.selfservepayment.dispute;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.selfservepayment.dispute.DisputeChargeActivity;
import co.bird.android.model.wire.WireRide;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.selfservepayment.dispute.a */
/* loaded from: classes3.dex */
public final class C15536a {

    /* renamed from: co.bird.android.feature.selfservepayment.dispute.a$a */
    /* loaded from: classes3.dex */
    public static final class C15537a implements DisputeChargeActivity.InterfaceC15533a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65215a;

        /* renamed from: b */
        public final BaseActivity f65216b;

        /* renamed from: c */
        public final C30028x3 f65217c;

        /* renamed from: d */
        public final ScopeProvider f65218d;

        /* renamed from: e */
        public final WireRide f65219e;

        /* renamed from: f */
        public final String f65220f;

        /* renamed from: g */
        public final String f65221g;

        /* renamed from: h */
        public final C15537a f65222h;

        @Override // co.bird.android.feature.selfservepayment.dispute.DisputeChargeActivity.InterfaceC15533a
        /* renamed from: a */
        public void mo56961a(DisputeChargeActivity disputeChargeActivity) {
            m56958d(disputeChargeActivity);
        }

        /* renamed from: b */
        public final A51 m56960b() {
            return new A51(m56959c(), this.f65218d, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65215a.mo27461w2()), (C22454gl) C51679xZ3.m5003d(this.f65215a.mo27479r()), (C36207Tq4) C51679xZ3.m5003d(this.f65215a.mo27595B1()), (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65215a.mo27519d0()), (YR4) C51679xZ3.m5003d(this.f65215a.mo27525b0()), this.f65219e, this.f65220f, this.f65221g);
        }

        /* renamed from: c */
        public final E51 m56959c() {
            return new E51(this.f65216b, this.f65217c);
        }

        /* renamed from: d */
        public final DisputeChargeActivity m56958d(DisputeChargeActivity disputeChargeActivity) {
            C5135Ly.m96068n(disputeChargeActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65215a.mo27461w2()));
            C5135Ly.m96066p(disputeChargeActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65215a.mo27595B1()));
            C5135Ly.m96071k(disputeChargeActivity, (Handler) C51679xZ3.m5003d(this.f65215a.mo27535X2()));
            C5135Ly.m96067o(disputeChargeActivity, (C22454gl) C51679xZ3.m5003d(this.f65215a.mo27479r()));
            C5135Ly.m96080b(disputeChargeActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65215a.mo27519d0()));
            C5135Ly.m96075g(disputeChargeActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f65215a.mo27453z2()));
            C5135Ly.m96064r(disputeChargeActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65215a.mo27459x1()));
            C5135Ly.m96081a(disputeChargeActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f65215a.mo27474s()));
            C5135Ly.m96073i(disputeChargeActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f65215a.mo27558P0()));
            C5135Ly.m96074h(disputeChargeActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f65215a.mo27598A0()));
            C5135Ly.m96077e(disputeChargeActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f65215a.mo27507i0()));
            C5135Ly.m96070l(disputeChargeActivity, (FO2) C51679xZ3.m5003d(this.f65215a.mo27456y2()));
            C5135Ly.m96065q(disputeChargeActivity, (YR4) C51679xZ3.m5003d(this.f65215a.mo27525b0()));
            C5135Ly.m96079c(disputeChargeActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f65215a.mo27460x()));
            C5135Ly.m96078d(disputeChargeActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f65215a.mo27517d3()));
            C5135Ly.m96072j(disputeChargeActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65215a.mo27482q()));
            C5135Ly.m96076f(disputeChargeActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f65215a.mo27483p3()));
            C49624u51.m10883b(disputeChargeActivity, m56960b());
            return disputeChargeActivity;
        }

        public C15537a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C30028x3 c30028x3, WireRide wireRide, String str, String str2) {
            this.f65222h = this;
            this.f65215a = interfaceC44393lG2;
            this.f65216b = baseActivity;
            this.f65217c = c30028x3;
            this.f65218d = scopeProvider;
            this.f65219e = wireRide;
            this.f65220f = str;
            this.f65221g = str2;
        }
    }

    /* renamed from: co.bird.android.feature.selfservepayment.dispute.a$b */
    /* loaded from: classes3.dex */
    public static final class C15538b implements DisputeChargeActivity.InterfaceC15533a.InterfaceC15534a {
        @Override // co.bird.android.feature.selfservepayment.dispute.DisputeChargeActivity.InterfaceC15533a.InterfaceC15534a
        /* renamed from: a */
        public DisputeChargeActivity.InterfaceC15533a mo56957a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C30028x3 c30028x3, WireRide wireRide, String str, String str2) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c30028x3);
            C51679xZ3.m5005b(wireRide);
            C51679xZ3.m5005b(str);
            C51679xZ3.m5005b(str2);
            return new C15537a(interfaceC44393lG2, baseActivity, scopeProvider, c30028x3, wireRide, str, str2);
        }

        private C15538b() {
        }
    }

    private C15536a() {
    }

    /* renamed from: a */
    public static DisputeChargeActivity.InterfaceC15533a.InterfaceC15534a m56962a() {
        return new C15538b();
    }
}

package co.bird.android.feature.transferorder.landing;

import android.content.Context;
import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.transferorder.landing.TransferOrderLandingActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.transferorder.landing.a */
/* loaded from: classes3.dex */
public final class C15797a {

    /* renamed from: co.bird.android.feature.transferorder.landing.a$a */
    /* loaded from: classes3.dex */
    public static final class C15798a implements TransferOrderLandingActivity.InterfaceC15795a.InterfaceC15796a {
        @Override // co.bird.android.feature.transferorder.landing.TransferOrderLandingActivity.InterfaceC15795a.InterfaceC15796a
        /* renamed from: a */
        public TransferOrderLandingActivity.InterfaceC15795a mo56550a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, DQ3 dq3, ScopeProvider scopeProvider, C26359n6 c26359n6) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(dq3);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c26359n6);
            return new C15799b(interfaceC44393lG2, baseActivity, dq3, scopeProvider, c26359n6);
        }

        private C15798a() {
        }
    }

    /* renamed from: co.bird.android.feature.transferorder.landing.a$b */
    /* loaded from: classes3.dex */
    public static final class C15799b implements TransferOrderLandingActivity.InterfaceC15795a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65690a;

        /* renamed from: b */
        public final BaseActivity f65691b;

        /* renamed from: c */
        public final C26359n6 f65692c;

        /* renamed from: d */
        public final ScopeProvider f65693d;

        /* renamed from: e */
        public final C15799b f65694e;

        @Override // co.bird.android.feature.transferorder.landing.TransferOrderLandingActivity.InterfaceC15795a
        /* renamed from: a */
        public void mo56549a(TransferOrderLandingActivity transferOrderLandingActivity) {
            m56548b(transferOrderLandingActivity);
        }

        /* renamed from: b */
        public final TransferOrderLandingActivity m56548b(TransferOrderLandingActivity transferOrderLandingActivity) {
            C5135Ly.m96068n(transferOrderLandingActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65690a.mo27461w2()));
            C5135Ly.m96066p(transferOrderLandingActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65690a.mo27595B1()));
            C5135Ly.m96071k(transferOrderLandingActivity, (Handler) C51679xZ3.m5003d(this.f65690a.mo27535X2()));
            C5135Ly.m96067o(transferOrderLandingActivity, (C22454gl) C51679xZ3.m5003d(this.f65690a.mo27479r()));
            C5135Ly.m96080b(transferOrderLandingActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65690a.mo27519d0()));
            C5135Ly.m96075g(transferOrderLandingActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f65690a.mo27453z2()));
            C5135Ly.m96064r(transferOrderLandingActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65690a.mo27459x1()));
            C5135Ly.m96081a(transferOrderLandingActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f65690a.mo27474s()));
            C5135Ly.m96073i(transferOrderLandingActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f65690a.mo27558P0()));
            C5135Ly.m96074h(transferOrderLandingActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f65690a.mo27598A0()));
            C5135Ly.m96077e(transferOrderLandingActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f65690a.mo27507i0()));
            C5135Ly.m96070l(transferOrderLandingActivity, (FO2) C51679xZ3.m5003d(this.f65690a.mo27456y2()));
            C5135Ly.m96065q(transferOrderLandingActivity, (YR4) C51679xZ3.m5003d(this.f65690a.mo27525b0()));
            C5135Ly.m96079c(transferOrderLandingActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f65690a.mo27460x()));
            C5135Ly.m96078d(transferOrderLandingActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f65690a.mo27517d3()));
            C5135Ly.m96072j(transferOrderLandingActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65690a.mo27482q()));
            C5135Ly.m96076f(transferOrderLandingActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f65690a.mo27483p3()));
            C43137j86.m31061b(transferOrderLandingActivity, m56546d());
            return transferOrderLandingActivity;
        }

        /* renamed from: c */
        public final C37330Yl2 m56547c() {
            return new C37330Yl2((Context) C51679xZ3.m5003d(this.f65690a.mo27552R1()));
        }

        /* renamed from: d */
        public final I86 m56546d() {
            return new I86(m56545e(), (C36207Tq4) C51679xZ3.m5003d(this.f65690a.mo27595B1()), m56547c(), (InterfaceC40099e13) C51679xZ3.m5003d(this.f65690a.mo27461w2()), this.f65693d, (O86) C51679xZ3.m5003d(this.f65690a.mo27485p()), m56544f());
        }

        /* renamed from: e */
        public final K86 m56545e() {
            return new K86(this.f65691b, this.f65692c);
        }

        /* renamed from: f */
        public final C43038iy6 m56544f() {
            return new C43038iy6((InterfaceC44647lh6) C51679xZ3.m5003d(this.f65690a.mo27459x1()), (InterfaceC36047Sy6) C51679xZ3.m5003d(this.f65690a.mo27571K2()), (C36207Tq4) C51679xZ3.m5003d(this.f65690a.mo27595B1()), this.f65693d, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65690a.mo27461w2()));
        }

        public C15799b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, DQ3 dq3, ScopeProvider scopeProvider, C26359n6 c26359n6) {
            this.f65694e = this;
            this.f65690a = interfaceC44393lG2;
            this.f65691b = baseActivity;
            this.f65692c = c26359n6;
            this.f65693d = scopeProvider;
        }
    }

    private C15797a() {
    }

    /* renamed from: a */
    public static TransferOrderLandingActivity.InterfaceC15795a.InterfaceC15796a m56551a() {
        return new C15798a();
    }
}

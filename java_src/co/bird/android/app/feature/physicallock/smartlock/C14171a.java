package co.bird.android.app.feature.physicallock.smartlock;

import android.os.Handler;
import co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockActivity;
import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.app.feature.physicallock.smartlock.a */
/* loaded from: classes2.dex */
public final class C14171a {

    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.a$a */
    /* loaded from: classes2.dex */
    public static final class C14172a implements SmartlockOperatorUnlockActivity.InterfaceC14132a.InterfaceC14133a {
        @Override // co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockActivity.InterfaceC14132a.InterfaceC14133a
        /* renamed from: a */
        public SmartlockOperatorUnlockActivity.InterfaceC14132a mo59705a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C22550h6 c22550h6) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c22550h6);
            return new C14173b(interfaceC44393lG2, baseActivity, scopeProvider, c22550h6);
        }

        private C14172a() {
        }
    }

    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.a$b */
    /* loaded from: classes2.dex */
    public static final class C14173b implements SmartlockOperatorUnlockActivity.InterfaceC14132a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f62253a;

        /* renamed from: b */
        public final ScopeProvider f62254b;

        /* renamed from: c */
        public final BaseActivity f62255c;

        /* renamed from: d */
        public final C22550h6 f62256d;

        /* renamed from: e */
        public final C14173b f62257e;

        @Override // co.bird.android.app.feature.physicallock.smartlock.SmartlockOperatorUnlockActivity.InterfaceC14132a
        /* renamed from: a */
        public void mo59704a(SmartlockOperatorUnlockActivity smartlockOperatorUnlockActivity) {
            m59703b(smartlockOperatorUnlockActivity);
        }

        /* renamed from: b */
        public final SmartlockOperatorUnlockActivity m59703b(SmartlockOperatorUnlockActivity smartlockOperatorUnlockActivity) {
            C5135Ly.m96068n(smartlockOperatorUnlockActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f62253a.mo27461w2()));
            C5135Ly.m96066p(smartlockOperatorUnlockActivity, (C36207Tq4) C51679xZ3.m5003d(this.f62253a.mo27595B1()));
            C5135Ly.m96071k(smartlockOperatorUnlockActivity, (Handler) C51679xZ3.m5003d(this.f62253a.mo27535X2()));
            C5135Ly.m96067o(smartlockOperatorUnlockActivity, (C22454gl) C51679xZ3.m5003d(this.f62253a.mo27479r()));
            C5135Ly.m96080b(smartlockOperatorUnlockActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f62253a.mo27519d0()));
            C5135Ly.m96075g(smartlockOperatorUnlockActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f62253a.mo27453z2()));
            C5135Ly.m96064r(smartlockOperatorUnlockActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f62253a.mo27459x1()));
            C5135Ly.m96081a(smartlockOperatorUnlockActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f62253a.mo27474s()));
            C5135Ly.m96073i(smartlockOperatorUnlockActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f62253a.mo27558P0()));
            C5135Ly.m96074h(smartlockOperatorUnlockActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f62253a.mo27598A0()));
            C5135Ly.m96077e(smartlockOperatorUnlockActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f62253a.mo27507i0()));
            C5135Ly.m96070l(smartlockOperatorUnlockActivity, (FO2) C51679xZ3.m5003d(this.f62253a.mo27456y2()));
            C5135Ly.m96065q(smartlockOperatorUnlockActivity, (YR4) C51679xZ3.m5003d(this.f62253a.mo27525b0()));
            C5135Ly.m96079c(smartlockOperatorUnlockActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f62253a.mo27460x()));
            C5135Ly.m96078d(smartlockOperatorUnlockActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f62253a.mo27517d3()));
            C5135Ly.m96072j(smartlockOperatorUnlockActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f62253a.mo27482q()));
            C5135Ly.m96076f(smartlockOperatorUnlockActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f62253a.mo27483p3()));
            KJ5.m99013b(smartlockOperatorUnlockActivity, m59702c());
            return smartlockOperatorUnlockActivity;
        }

        /* renamed from: c */
        public final SmartlockOperatorUnlockPresenter m59702c() {
            return new SmartlockOperatorUnlockPresenter((InterfaceC5225MD) C51679xZ3.m5003d(this.f62253a.mo27513f2()), (InterfaceC42042hI5) C51679xZ3.m5003d(this.f62253a.mo27469t2()), this.f62254b, m59701d());
        }

        /* renamed from: d */
        public final C47990rK5 m59701d() {
            return new C47990rK5(this.f62255c, this.f62256d);
        }

        public C14173b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C22550h6 c22550h6) {
            this.f62257e = this;
            this.f62253a = interfaceC44393lG2;
            this.f62254b = scopeProvider;
            this.f62255c = baseActivity;
            this.f62256d = c22550h6;
        }
    }

    private C14171a() {
    }

    /* renamed from: a */
    public static SmartlockOperatorUnlockActivity.InterfaceC14132a.InterfaceC14133a m59706a() {
        return new C14172a();
    }
}

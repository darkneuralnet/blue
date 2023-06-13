package co.bird.android.feature.healthcheck;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.healthcheck.HealthCheckActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.healthcheck.a */
/* loaded from: classes3.dex */
public final class C14886a {

    /* renamed from: co.bird.android.feature.healthcheck.a$a */
    /* loaded from: classes3.dex */
    public static final class C14887a implements HealthCheckActivity.InterfaceC14884a.InterfaceC14885a {
        @Override // co.bird.android.feature.healthcheck.HealthCheckActivity.InterfaceC14884a.InterfaceC14885a
        /* renamed from: a */
        public HealthCheckActivity.InterfaceC14884a mo58065a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C3874J3 c3874j3, InterfaceC39343cm6 interfaceC39343cm6) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c3874j3);
            C51679xZ3.m5005b(interfaceC39343cm6);
            return new C14888b(interfaceC44393lG2, baseActivity, scopeProvider, c3874j3, interfaceC39343cm6);
        }

        private C14887a() {
        }
    }

    /* renamed from: co.bird.android.feature.healthcheck.a$b */
    /* loaded from: classes3.dex */
    public static final class C14888b implements HealthCheckActivity.InterfaceC14884a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64081a;

        /* renamed from: b */
        public final ScopeProvider f64082b;

        /* renamed from: c */
        public final C3874J3 f64083c;

        /* renamed from: d */
        public final InterfaceC39343cm6 f64084d;

        /* renamed from: e */
        public final C14888b f64085e;

        @Override // co.bird.android.feature.healthcheck.HealthCheckActivity.InterfaceC14884a
        /* renamed from: a */
        public void mo58064a(HealthCheckActivity healthCheckActivity) {
            m58061d(healthCheckActivity);
        }

        /* renamed from: b */
        public final C43224jI1 m58063b() {
            return new C43224jI1(this.f64082b, m58062c(), (InterfaceC40099e13) C51679xZ3.m5003d(this.f64081a.mo27461w2()), (C36207Tq4) C51679xZ3.m5003d(this.f64081a.mo27595B1()), this.f64084d, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f64081a.mo27517d3()), (InterfaceC49430tl6) C51679xZ3.m5003d(this.f64081a.mo27589D0()));
        }

        /* renamed from: c */
        public final C47375qI1 m58062c() {
            return new C47375qI1(this.f64083c);
        }

        /* renamed from: d */
        public final HealthCheckActivity m58061d(HealthCheckActivity healthCheckActivity) {
            C5135Ly.m96068n(healthCheckActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64081a.mo27461w2()));
            C5135Ly.m96066p(healthCheckActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64081a.mo27595B1()));
            C5135Ly.m96071k(healthCheckActivity, (Handler) C51679xZ3.m5003d(this.f64081a.mo27535X2()));
            C5135Ly.m96067o(healthCheckActivity, (C22454gl) C51679xZ3.m5003d(this.f64081a.mo27479r()));
            C5135Ly.m96080b(healthCheckActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64081a.mo27519d0()));
            C5135Ly.m96075g(healthCheckActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f64081a.mo27453z2()));
            C5135Ly.m96064r(healthCheckActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f64081a.mo27459x1()));
            C5135Ly.m96081a(healthCheckActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f64081a.mo27474s()));
            C5135Ly.m96073i(healthCheckActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f64081a.mo27558P0()));
            C5135Ly.m96074h(healthCheckActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f64081a.mo27598A0()));
            C5135Ly.m96077e(healthCheckActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f64081a.mo27507i0()));
            C5135Ly.m96070l(healthCheckActivity, (FO2) C51679xZ3.m5003d(this.f64081a.mo27456y2()));
            C5135Ly.m96065q(healthCheckActivity, (YR4) C51679xZ3.m5003d(this.f64081a.mo27525b0()));
            C5135Ly.m96079c(healthCheckActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f64081a.mo27460x()));
            C5135Ly.m96078d(healthCheckActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f64081a.mo27517d3()));
            C5135Ly.m96072j(healthCheckActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f64081a.mo27482q()));
            C5135Ly.m96076f(healthCheckActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f64081a.mo27483p3()));
            QH1.m88671b(healthCheckActivity, m58063b());
            return healthCheckActivity;
        }

        public C14888b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C3874J3 c3874j3, InterfaceC39343cm6 interfaceC39343cm6) {
            this.f64085e = this;
            this.f64081a = interfaceC44393lG2;
            this.f64082b = scopeProvider;
            this.f64083c = c3874j3;
            this.f64084d = interfaceC39343cm6;
        }
    }

    private C14886a() {
    }

    /* renamed from: a */
    public static HealthCheckActivity.InterfaceC14884a.InterfaceC14885a m58066a() {
        return new C14887a();
    }
}

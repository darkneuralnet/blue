package co.bird.android.app.feature.flightsheet;

import android.content.Context;
import android.os.Handler;
import co.bird.android.app.feature.flightsheet.FlightSheetActivity;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.FlightSheetContext;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.app.feature.flightsheet.a */
/* loaded from: classes2.dex */
public final class C13740a {

    /* renamed from: co.bird.android.app.feature.flightsheet.a$a */
    /* loaded from: classes2.dex */
    public static final class C13741a implements FlightSheetActivity.InterfaceC13735a.InterfaceC13736a {
        @Override // co.bird.android.app.feature.flightsheet.FlightSheetActivity.InterfaceC13735a.InterfaceC13736a
        /* renamed from: a */
        public FlightSheetActivity.InterfaceC13735a mo60659a(InterfaceC44393lG2 interfaceC44393lG2, FlightSheetActivity.C13738b c13738b, BaseActivity baseActivity, ScopeProvider scopeProvider, boolean z, FlightSheetContext flightSheetContext) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(Boolean.valueOf(z));
            C51679xZ3.m5005b(flightSheetContext);
            return new C13742b(interfaceC44393lG2, baseActivity, scopeProvider, Boolean.valueOf(z), flightSheetContext);
        }

        private C13741a() {
        }
    }

    /* renamed from: co.bird.android.app.feature.flightsheet.a$b */
    /* loaded from: classes2.dex */
    public static final class C13742b implements FlightSheetActivity.InterfaceC13735a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f61443a;

        /* renamed from: b */
        public final ScopeProvider f61444b;

        /* renamed from: c */
        public final FlightSheetContext f61445c;

        /* renamed from: d */
        public final C13742b f61446d;

        /* renamed from: e */
        public Y94<BaseActivity> f61447e;

        /* renamed from: f */
        public Y94<C36690Vs1> f61448f;

        @Override // co.bird.android.app.feature.flightsheet.FlightSheetActivity.InterfaceC13735a
        /* renamed from: a */
        public void mo60658a(FlightSheetActivity flightSheetActivity) {
            m60652g(flightSheetActivity);
        }

        /* renamed from: b */
        public final C31739Ao0 m60657b() {
            return new C31739Ao0((InterfaceC36185To0) C51679xZ3.m5003d(this.f61443a.mo27481q2()), (InterfaceC46473om3) C51679xZ3.m5003d(this.f61443a.mo27584F0()), (InterfaceC48164rd5) C51679xZ3.m5003d(this.f61443a.mo27463w()), this.f61444b, this.f61448f.get());
        }

        /* renamed from: c */
        public final C33648Is1 m60656c() {
            return new C33648Is1(m60654e(), this.f61444b);
        }

        /* renamed from: d */
        public final C42390ht1 m60655d() {
            return new C42390ht1((Context) C51679xZ3.m5003d(this.f61443a.mo27552R1()));
        }

        /* renamed from: e */
        public final C35529Qt1 m60654e() {
            return new C35529Qt1((InterfaceC46473om3) C51679xZ3.m5003d(this.f61443a.mo27584F0()), (InterfaceC30556yL) C51679xZ3.m5003d(this.f61443a.mo27509g3()), (InterfaceC48265rn6) C51679xZ3.m5003d(this.f61443a.mo27515e3()), (InterfaceC1880Ea) C51679xZ3.m5003d(this.f61443a.mo27519d0()), m60651h(), this.f61448f.get(), (InterfaceC40099e13) C51679xZ3.m5003d(this.f61443a.mo27461w2()), (C36207Tq4) C51679xZ3.m5003d(this.f61443a.mo27595B1()), this.f61444b, (C22454gl) C51679xZ3.m5003d(this.f61443a.mo27479r()), m60657b(), this.f61445c, m60655d());
        }

        /* renamed from: f */
        public final void m60653f(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, Boolean bool, FlightSheetContext flightSheetContext) {
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(baseActivity);
            this.f61447e = m44621a;
            this.f61448f = V51.m80429b(C37158Xs1.m76195a(m44621a));
        }

        /* renamed from: g */
        public final FlightSheetActivity m60652g(FlightSheetActivity flightSheetActivity) {
            C5135Ly.m96068n(flightSheetActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f61443a.mo27461w2()));
            C5135Ly.m96066p(flightSheetActivity, (C36207Tq4) C51679xZ3.m5003d(this.f61443a.mo27595B1()));
            C5135Ly.m96071k(flightSheetActivity, (Handler) C51679xZ3.m5003d(this.f61443a.mo27535X2()));
            C5135Ly.m96067o(flightSheetActivity, (C22454gl) C51679xZ3.m5003d(this.f61443a.mo27479r()));
            C5135Ly.m96080b(flightSheetActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f61443a.mo27519d0()));
            C5135Ly.m96075g(flightSheetActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f61443a.mo27453z2()));
            C5135Ly.m96064r(flightSheetActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f61443a.mo27459x1()));
            C5135Ly.m96081a(flightSheetActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f61443a.mo27474s()));
            C5135Ly.m96073i(flightSheetActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f61443a.mo27558P0()));
            C5135Ly.m96074h(flightSheetActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f61443a.mo27598A0()));
            C5135Ly.m96077e(flightSheetActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f61443a.mo27507i0()));
            C5135Ly.m96070l(flightSheetActivity, (FO2) C51679xZ3.m5003d(this.f61443a.mo27456y2()));
            C5135Ly.m96065q(flightSheetActivity, (YR4) C51679xZ3.m5003d(this.f61443a.mo27525b0()));
            C5135Ly.m96079c(flightSheetActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f61443a.mo27460x()));
            C5135Ly.m96078d(flightSheetActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f61443a.mo27517d3()));
            C5135Ly.m96072j(flightSheetActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f61443a.mo27482q()));
            C5135Ly.m96076f(flightSheetActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f61443a.mo27483p3()));
            C45938ns1.m22266b(flightSheetActivity, m60656c());
            return flightSheetActivity;
        }

        /* renamed from: h */
        public final C42826id4 m60651h() {
            return new C42826id4((InterfaceC1880Ea) C51679xZ3.m5003d(this.f61443a.mo27519d0()));
        }

        public C13742b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, Boolean bool, FlightSheetContext flightSheetContext) {
            this.f61446d = this;
            this.f61443a = interfaceC44393lG2;
            this.f61444b = scopeProvider;
            this.f61445c = flightSheetContext;
            m60653f(interfaceC44393lG2, baseActivity, scopeProvider, bool, flightSheetContext);
        }
    }

    private C13740a() {
    }

    /* renamed from: a */
    public static FlightSheetActivity.InterfaceC13735a.InterfaceC13736a m60660a() {
        return new C13741a();
    }
}

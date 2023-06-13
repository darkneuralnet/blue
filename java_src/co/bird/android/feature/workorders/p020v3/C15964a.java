package co.bird.android.feature.workorders.p020v3;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.workorders.p020v3.InspectionV3Activity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.workorders.v3.a */
/* loaded from: classes3.dex */
public final class C15964a {

    /* renamed from: co.bird.android.feature.workorders.v3.a$a */
    /* loaded from: classes3.dex */
    public static final class C15965a implements InspectionV3Activity.InterfaceC15962a.InterfaceC15963a {
        @Override // co.bird.android.feature.workorders.p020v3.InspectionV3Activity.InterfaceC15962a.InterfaceC15963a
        /* renamed from: a */
        public InspectionV3Activity.InterfaceC15962a mo56209a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C8185U3 c8185u3, DQ3 dq3) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c8185u3);
            C51679xZ3.m5005b(dq3);
            return new C15966b(interfaceC44393lG2, baseActivity, scopeProvider, c8185u3, dq3);
        }

        private C15965a() {
        }
    }

    /* renamed from: co.bird.android.feature.workorders.v3.a$b */
    /* loaded from: classes3.dex */
    public static final class C15966b implements InspectionV3Activity.InterfaceC15962a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65990a;

        /* renamed from: b */
        public final DQ3 f65991b;

        /* renamed from: c */
        public final BaseActivity f65992c;

        /* renamed from: d */
        public final C8185U3 f65993d;

        /* renamed from: e */
        public final ScopeProvider f65994e;

        /* renamed from: f */
        public final C15966b f65995f;

        @Override // co.bird.android.feature.workorders.p020v3.InspectionV3Activity.InterfaceC15962a
        /* renamed from: a */
        public void mo56208a(InspectionV3Activity inspectionV3Activity) {
            m56207b(inspectionV3Activity);
        }

        /* renamed from: b */
        public final InspectionV3Activity m56207b(InspectionV3Activity inspectionV3Activity) {
            C5135Ly.m96068n(inspectionV3Activity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65990a.mo27461w2()));
            C5135Ly.m96066p(inspectionV3Activity, (C36207Tq4) C51679xZ3.m5003d(this.f65990a.mo27595B1()));
            C5135Ly.m96071k(inspectionV3Activity, (Handler) C51679xZ3.m5003d(this.f65990a.mo27535X2()));
            C5135Ly.m96067o(inspectionV3Activity, (C22454gl) C51679xZ3.m5003d(this.f65990a.mo27479r()));
            C5135Ly.m96080b(inspectionV3Activity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65990a.mo27519d0()));
            C5135Ly.m96075g(inspectionV3Activity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f65990a.mo27453z2()));
            C5135Ly.m96064r(inspectionV3Activity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65990a.mo27459x1()));
            C5135Ly.m96081a(inspectionV3Activity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f65990a.mo27474s()));
            C5135Ly.m96073i(inspectionV3Activity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f65990a.mo27558P0()));
            C5135Ly.m96074h(inspectionV3Activity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f65990a.mo27598A0()));
            C5135Ly.m96077e(inspectionV3Activity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f65990a.mo27507i0()));
            C5135Ly.m96070l(inspectionV3Activity, (FO2) C51679xZ3.m5003d(this.f65990a.mo27456y2()));
            C5135Ly.m96065q(inspectionV3Activity, (YR4) C51679xZ3.m5003d(this.f65990a.mo27525b0()));
            C5135Ly.m96079c(inspectionV3Activity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f65990a.mo27460x()));
            C5135Ly.m96078d(inspectionV3Activity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f65990a.mo27517d3()));
            C5135Ly.m96072j(inspectionV3Activity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65990a.mo27482q()));
            C5135Ly.m96076f(inspectionV3Activity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f65990a.mo27483p3()));
            V32.m80460b(inspectionV3Activity, m56206c());
            return inspectionV3Activity;
        }

        /* renamed from: c */
        public final L42 m56206c() {
            return new L42((InterfaceC48265rn6) C51679xZ3.m5003d(this.f65990a.mo27515e3()), this.f65991b, (C36207Tq4) C51679xZ3.m5003d(this.f65990a.mo27595B1()), (InterfaceC40099e13) C51679xZ3.m5003d(this.f65990a.mo27461w2()), m56205d(), this.f65994e, new C44279l42());
        }

        /* renamed from: d */
        public final R42 m56205d() {
            return new R42(this.f65992c, this.f65993d);
        }

        public C15966b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C8185U3 c8185u3, DQ3 dq3) {
            this.f65995f = this;
            this.f65990a = interfaceC44393lG2;
            this.f65991b = dq3;
            this.f65992c = baseActivity;
            this.f65993d = c8185u3;
            this.f65994e = scopeProvider;
        }
    }

    private C15964a() {
    }

    /* renamed from: a */
    public static InspectionV3Activity.InterfaceC15962a.InterfaceC15963a m56210a() {
        return new C15965a();
    }
}

package co.bird.android.feature.repair.p016v3.overview;

import android.content.Context;
import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.repair.p016v3.overview.RepairV3OverviewActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.repair.v3.overview.a */
/* loaded from: classes3.dex */
public final class C15235a {

    /* renamed from: co.bird.android.feature.repair.v3.overview.a$a */
    /* loaded from: classes3.dex */
    public static final class C15236a implements RepairV3OverviewActivity.InterfaceC15233a.InterfaceC15234a {
        @Override // co.bird.android.feature.repair.p016v3.overview.RepairV3OverviewActivity.InterfaceC15233a.InterfaceC15234a
        /* renamed from: a */
        public RepairV3OverviewActivity.InterfaceC15233a mo57516a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C25596l5 c25596l5, DQ3 dq3) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c25596l5);
            C51679xZ3.m5005b(dq3);
            return new C15237b(interfaceC44393lG2, baseActivity, scopeProvider, c25596l5, dq3);
        }

        private C15236a() {
        }
    }

    /* renamed from: co.bird.android.feature.repair.v3.overview.a$b */
    /* loaded from: classes3.dex */
    public static final class C15237b implements RepairV3OverviewActivity.InterfaceC15233a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64667a;

        /* renamed from: b */
        public final DQ3 f64668b;

        /* renamed from: c */
        public final BaseActivity f64669c;

        /* renamed from: d */
        public final C25596l5 f64670d;

        /* renamed from: e */
        public final ScopeProvider f64671e;

        /* renamed from: f */
        public final C15237b f64672f;

        @Override // co.bird.android.feature.repair.p016v3.overview.RepairV3OverviewActivity.InterfaceC15233a
        /* renamed from: a */
        public void mo57515a(RepairV3OverviewActivity repairV3OverviewActivity) {
            m57514b(repairV3OverviewActivity);
        }

        /* renamed from: b */
        public final RepairV3OverviewActivity m57514b(RepairV3OverviewActivity repairV3OverviewActivity) {
            C5135Ly.m96068n(repairV3OverviewActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64667a.mo27461w2()));
            C5135Ly.m96066p(repairV3OverviewActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64667a.mo27595B1()));
            C5135Ly.m96071k(repairV3OverviewActivity, (Handler) C51679xZ3.m5003d(this.f64667a.mo27535X2()));
            C5135Ly.m96067o(repairV3OverviewActivity, (C22454gl) C51679xZ3.m5003d(this.f64667a.mo27479r()));
            C5135Ly.m96080b(repairV3OverviewActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64667a.mo27519d0()));
            C5135Ly.m96075g(repairV3OverviewActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f64667a.mo27453z2()));
            C5135Ly.m96064r(repairV3OverviewActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f64667a.mo27459x1()));
            C5135Ly.m96081a(repairV3OverviewActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f64667a.mo27474s()));
            C5135Ly.m96073i(repairV3OverviewActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f64667a.mo27558P0()));
            C5135Ly.m96074h(repairV3OverviewActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f64667a.mo27598A0()));
            C5135Ly.m96077e(repairV3OverviewActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f64667a.mo27507i0()));
            C5135Ly.m96070l(repairV3OverviewActivity, (FO2) C51679xZ3.m5003d(this.f64667a.mo27456y2()));
            C5135Ly.m96065q(repairV3OverviewActivity, (YR4) C51679xZ3.m5003d(this.f64667a.mo27525b0()));
            C5135Ly.m96079c(repairV3OverviewActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f64667a.mo27460x()));
            C5135Ly.m96078d(repairV3OverviewActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f64667a.mo27517d3()));
            C5135Ly.m96072j(repairV3OverviewActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f64667a.mo27482q()));
            C5135Ly.m96076f(repairV3OverviewActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f64667a.mo27483p3()));
            TE4.m84162b(repairV3OverviewActivity, m57512d());
            return repairV3OverviewActivity;
        }

        /* renamed from: c */
        public final WE4 m57513c() {
            return new WE4((Context) C51679xZ3.m5003d(this.f64667a.mo27552R1()));
        }

        /* renamed from: d */
        public final C50907wF4 m57512d() {
            return new C50907wF4((InterfaceC48265rn6) C51679xZ3.m5003d(this.f64667a.mo27515e3()), (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64667a.mo27519d0()), this.f64668b, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64667a.mo27461w2()), m57513c(), m57511e(), this.f64671e, (C36207Tq4) C51679xZ3.m5003d(this.f64667a.mo27595B1()));
        }

        /* renamed from: e */
        public final GF4 m57511e() {
            return new GF4(this.f64669c, this.f64670d);
        }

        public C15237b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C25596l5 c25596l5, DQ3 dq3) {
            this.f64672f = this;
            this.f64667a = interfaceC44393lG2;
            this.f64668b = dq3;
            this.f64669c = baseActivity;
            this.f64670d = c25596l5;
            this.f64671e = scopeProvider;
        }
    }

    private C15235a() {
    }

    /* renamed from: a */
    public static RepairV3OverviewActivity.InterfaceC15233a.InterfaceC15234a m57517a() {
        return new C15236a();
    }
}

package co.bird.android.feature.maintenance;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.maintenance.MaintenanceLandingActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.maintenance.a */
/* loaded from: classes3.dex */
public final class C14946a {

    /* renamed from: co.bird.android.feature.maintenance.a$a */
    /* loaded from: classes3.dex */
    public static final class C14947a implements MaintenanceLandingActivity.InterfaceC14944a.InterfaceC14945a {
        @Override // co.bird.android.feature.maintenance.MaintenanceLandingActivity.InterfaceC14944a.InterfaceC14945a
        /* renamed from: a */
        public MaintenanceLandingActivity.InterfaceC14944a mo57992a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C25093k4 c25093k4) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c25093k4);
            return new C14948b(interfaceC44393lG2, baseActivity, scopeProvider, c25093k4);
        }

        private C14947a() {
        }
    }

    /* renamed from: co.bird.android.feature.maintenance.a$b */
    /* loaded from: classes3.dex */
    public static final class C14948b implements MaintenanceLandingActivity.InterfaceC14944a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64148a;

        /* renamed from: b */
        public final BaseActivity f64149b;

        /* renamed from: c */
        public final C25093k4 f64150c;

        /* renamed from: d */
        public final C14948b f64151d;

        @Override // co.bird.android.feature.maintenance.MaintenanceLandingActivity.InterfaceC14944a
        /* renamed from: a */
        public void mo57991a(MaintenanceLandingActivity maintenanceLandingActivity) {
            m57990b(maintenanceLandingActivity);
        }

        /* renamed from: b */
        public final MaintenanceLandingActivity m57990b(MaintenanceLandingActivity maintenanceLandingActivity) {
            C5135Ly.m96068n(maintenanceLandingActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64148a.mo27461w2()));
            C5135Ly.m96066p(maintenanceLandingActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64148a.mo27595B1()));
            C5135Ly.m96071k(maintenanceLandingActivity, (Handler) C51679xZ3.m5003d(this.f64148a.mo27535X2()));
            C5135Ly.m96067o(maintenanceLandingActivity, (C22454gl) C51679xZ3.m5003d(this.f64148a.mo27479r()));
            C5135Ly.m96080b(maintenanceLandingActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64148a.mo27519d0()));
            C5135Ly.m96075g(maintenanceLandingActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f64148a.mo27453z2()));
            C5135Ly.m96064r(maintenanceLandingActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f64148a.mo27459x1()));
            C5135Ly.m96081a(maintenanceLandingActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f64148a.mo27474s()));
            C5135Ly.m96073i(maintenanceLandingActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f64148a.mo27558P0()));
            C5135Ly.m96074h(maintenanceLandingActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f64148a.mo27598A0()));
            C5135Ly.m96077e(maintenanceLandingActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f64148a.mo27507i0()));
            C5135Ly.m96070l(maintenanceLandingActivity, (FO2) C51679xZ3.m5003d(this.f64148a.mo27456y2()));
            C5135Ly.m96065q(maintenanceLandingActivity, (YR4) C51679xZ3.m5003d(this.f64148a.mo27525b0()));
            C5135Ly.m96079c(maintenanceLandingActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f64148a.mo27460x()));
            C5135Ly.m96078d(maintenanceLandingActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f64148a.mo27517d3()));
            C5135Ly.m96072j(maintenanceLandingActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f64148a.mo27482q()));
            C5135Ly.m96076f(maintenanceLandingActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f64148a.mo27483p3()));
            C42030hH2.m36568a(maintenanceLandingActivity, m57989c());
            return maintenanceLandingActivity;
        }

        /* renamed from: c */
        public final C43216jH2 m57989c() {
            return new C43216jH2(this.f64149b, this.f64150c);
        }

        public C14948b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C25093k4 c25093k4) {
            this.f64151d = this;
            this.f64148a = interfaceC44393lG2;
            this.f64149b = baseActivity;
            this.f64150c = c25093k4;
        }
    }

    private C14946a() {
    }

    /* renamed from: a */
    public static MaintenanceLandingActivity.InterfaceC14944a.InterfaceC14945a m57993a() {
        return new C14947a();
    }
}

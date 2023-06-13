package co.bird.android.feature.fleetstatus.common;

import android.os.Handler;
import androidx.fragment.app.FragmentManager;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.fleetstatus.common.FleetActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.fleetstatus.common.a */
/* loaded from: classes3.dex */
public final class C14796a {

    /* renamed from: co.bird.android.feature.fleetstatus.common.a$a */
    /* loaded from: classes3.dex */
    public static final class C14797a implements FleetActivity.InterfaceC14793a.InterfaceC14794a {
        @Override // co.bird.android.feature.fleetstatus.common.FleetActivity.InterfaceC14793a.InterfaceC14794a
        /* renamed from: a */
        public FleetActivity.InterfaceC14793a mo58220a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, AbstractC30071xE abstractC30071xE, FragmentManager fragmentManager, int i) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(abstractC30071xE);
            C51679xZ3.m5005b(fragmentManager);
            C51679xZ3.m5005b(Integer.valueOf(i));
            return new C14798b(interfaceC44393lG2, baseActivity, scopeProvider, abstractC30071xE, fragmentManager, Integer.valueOf(i));
        }

        private C14797a() {
        }
    }

    /* renamed from: co.bird.android.feature.fleetstatus.common.a$b */
    /* loaded from: classes3.dex */
    public static final class C14798b implements FleetActivity.InterfaceC14793a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f63926a;

        /* renamed from: b */
        public final ScopeProvider f63927b;

        /* renamed from: c */
        public final AbstractC30071xE f63928c;

        /* renamed from: d */
        public final C14798b f63929d;

        /* renamed from: e */
        public Y94<FragmentManager> f63930e;

        /* renamed from: f */
        public Y94<Integer> f63931f;

        /* renamed from: g */
        public Y94<C44129kp1> f63932g;

        @Override // co.bird.android.feature.fleetstatus.common.FleetActivity.InterfaceC14793a
        /* renamed from: a */
        public C44129kp1 mo58219a() {
            return this.f63932g.get();
        }

        @Override // co.bird.android.feature.fleetstatus.common.FleetActivity.InterfaceC14793a
        /* renamed from: b */
        public void mo58218b(FleetActivity fleetActivity) {
            m58215e(fleetActivity);
        }

        /* renamed from: c */
        public final C47094pp1 m58217c() {
            return new C47094pp1((InterfaceC31992Bq1) C51679xZ3.m5003d(this.f63926a.mo27496l1()), this.f63932g.get(), this.f63927b, this.f63928c);
        }

        /* renamed from: d */
        public final void m58216d(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, AbstractC30071xE abstractC30071xE, FragmentManager fragmentManager, Integer num) {
            this.f63930e = C39546d52.m44621a(fragmentManager);
            InterfaceC48812sj1 m44621a = C39546d52.m44621a(num);
            this.f63931f = m44621a;
            this.f63932g = V51.m80429b(C44722lp1.m26768a(this.f63930e, m44621a));
        }

        /* renamed from: e */
        public final FleetActivity m58215e(FleetActivity fleetActivity) {
            C5135Ly.m96068n(fleetActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f63926a.mo27461w2()));
            C5135Ly.m96066p(fleetActivity, (C36207Tq4) C51679xZ3.m5003d(this.f63926a.mo27595B1()));
            C5135Ly.m96071k(fleetActivity, (Handler) C51679xZ3.m5003d(this.f63926a.mo27535X2()));
            C5135Ly.m96067o(fleetActivity, (C22454gl) C51679xZ3.m5003d(this.f63926a.mo27479r()));
            C5135Ly.m96080b(fleetActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f63926a.mo27519d0()));
            C5135Ly.m96075g(fleetActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f63926a.mo27453z2()));
            C5135Ly.m96064r(fleetActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f63926a.mo27459x1()));
            C5135Ly.m96081a(fleetActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f63926a.mo27474s()));
            C5135Ly.m96073i(fleetActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f63926a.mo27558P0()));
            C5135Ly.m96074h(fleetActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f63926a.mo27598A0()));
            C5135Ly.m96077e(fleetActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f63926a.mo27507i0()));
            C5135Ly.m96070l(fleetActivity, (FO2) C51679xZ3.m5003d(this.f63926a.mo27456y2()));
            C5135Ly.m96065q(fleetActivity, (YR4) C51679xZ3.m5003d(this.f63926a.mo27525b0()));
            C5135Ly.m96079c(fleetActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f63926a.mo27460x()));
            C5135Ly.m96078d(fleetActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f63926a.mo27517d3()));
            C5135Ly.m96072j(fleetActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f63926a.mo27482q()));
            C5135Ly.m96076f(fleetActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f63926a.mo27483p3()));
            C47677qo1.m16967c(fleetActivity, m58217c());
            C47677qo1.m16969a(fleetActivity, this.f63932g.get());
            return fleetActivity;
        }

        public C14798b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, AbstractC30071xE abstractC30071xE, FragmentManager fragmentManager, Integer num) {
            this.f63929d = this;
            this.f63926a = interfaceC44393lG2;
            this.f63927b = scopeProvider;
            this.f63928c = abstractC30071xE;
            m58216d(interfaceC44393lG2, baseActivity, scopeProvider, abstractC30071xE, fragmentManager, num);
        }
    }

    private C14796a() {
    }

    /* renamed from: a */
    public static FleetActivity.InterfaceC14793a.InterfaceC14794a m58221a() {
        return new C14797a();
    }
}

package co.bird.android.feature.repair.pastrepairs;

import android.content.Context;
import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.repair.pastrepairs.PastRepairsActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.repair.pastrepairs.a */
/* loaded from: classes3.dex */
public final class C15173a {

    /* renamed from: co.bird.android.feature.repair.pastrepairs.a$a */
    /* loaded from: classes3.dex */
    public static final class C15174a implements PastRepairsActivity.InterfaceC15171a.InterfaceC15172a {
        @Override // co.bird.android.feature.repair.pastrepairs.PastRepairsActivity.InterfaceC15171a.InterfaceC15172a
        /* renamed from: a */
        public PastRepairsActivity.InterfaceC15171a mo57602a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C3880J4 c3880j4) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c3880j4);
            return new C15175b(interfaceC44393lG2, baseActivity, scopeProvider, c3880j4);
        }

        private C15174a() {
        }
    }

    /* renamed from: co.bird.android.feature.repair.pastrepairs.a$b */
    /* loaded from: classes3.dex */
    public static final class C15175b implements PastRepairsActivity.InterfaceC15171a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64569a;

        /* renamed from: b */
        public final BaseActivity f64570b;

        /* renamed from: c */
        public final C3880J4 f64571c;

        /* renamed from: d */
        public final ScopeProvider f64572d;

        /* renamed from: e */
        public final C15175b f64573e;

        @Override // co.bird.android.feature.repair.pastrepairs.PastRepairsActivity.InterfaceC15171a
        /* renamed from: a */
        public void mo57601a(PastRepairsActivity pastRepairsActivity) {
            m57600b(pastRepairsActivity);
        }

        /* renamed from: b */
        public final PastRepairsActivity m57600b(PastRepairsActivity pastRepairsActivity) {
            C5135Ly.m96068n(pastRepairsActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64569a.mo27461w2()));
            C5135Ly.m96066p(pastRepairsActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64569a.mo27595B1()));
            C5135Ly.m96071k(pastRepairsActivity, (Handler) C51679xZ3.m5003d(this.f64569a.mo27535X2()));
            C5135Ly.m96067o(pastRepairsActivity, (C22454gl) C51679xZ3.m5003d(this.f64569a.mo27479r()));
            C5135Ly.m96080b(pastRepairsActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64569a.mo27519d0()));
            C5135Ly.m96075g(pastRepairsActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f64569a.mo27453z2()));
            C5135Ly.m96064r(pastRepairsActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f64569a.mo27459x1()));
            C5135Ly.m96081a(pastRepairsActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f64569a.mo27474s()));
            C5135Ly.m96073i(pastRepairsActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f64569a.mo27558P0()));
            C5135Ly.m96074h(pastRepairsActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f64569a.mo27598A0()));
            C5135Ly.m96077e(pastRepairsActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f64569a.mo27507i0()));
            C5135Ly.m96070l(pastRepairsActivity, (FO2) C51679xZ3.m5003d(this.f64569a.mo27456y2()));
            C5135Ly.m96065q(pastRepairsActivity, (YR4) C51679xZ3.m5003d(this.f64569a.mo27525b0()));
            C5135Ly.m96079c(pastRepairsActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f64569a.mo27460x()));
            C5135Ly.m96078d(pastRepairsActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f64569a.mo27517d3()));
            C5135Ly.m96072j(pastRepairsActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f64569a.mo27482q()));
            C5135Ly.m96076f(pastRepairsActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f64569a.mo27483p3()));
            PI3.m90499b(pastRepairsActivity, m57598d());
            return pastRepairsActivity;
        }

        /* renamed from: c */
        public final RI3 m57599c() {
            return new RI3((Context) C51679xZ3.m5003d(this.f64569a.mo27552R1()));
        }

        /* renamed from: d */
        public final ZI3 m57598d() {
            return new ZI3((InterfaceC46473om3) C51679xZ3.m5003d(this.f64569a.mo27584F0()), (InterfaceC36176Tn0) C51679xZ3.m5003d(this.f64569a.mo27574J2()), m57599c(), m57597e(), this.f64572d);
        }

        /* renamed from: e */
        public final C37881aJ3 m57597e() {
            return new C37881aJ3(this.f64570b, this.f64571c);
        }

        public C15175b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C3880J4 c3880j4) {
            this.f64573e = this;
            this.f64569a = interfaceC44393lG2;
            this.f64570b = baseActivity;
            this.f64571c = c3880j4;
            this.f64572d = scopeProvider;
        }
    }

    private C15173a() {
    }

    /* renamed from: a */
    public static PastRepairsActivity.InterfaceC15171a.InterfaceC15172a m57603a() {
        return new C15174a();
    }
}

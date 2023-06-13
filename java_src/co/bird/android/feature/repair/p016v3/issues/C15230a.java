package co.bird.android.feature.repair.p016v3.issues;

import android.content.Context;
import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.repair.p016v3.issues.RepairV3IssueActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.repair.v3.issues.a */
/* loaded from: classes3.dex */
public final class C15230a {

    /* renamed from: co.bird.android.feature.repair.v3.issues.a$a */
    /* loaded from: classes3.dex */
    public static final class C15231a implements RepairV3IssueActivity.InterfaceC15228a.InterfaceC15229a {
        @Override // co.bird.android.feature.repair.p016v3.issues.RepairV3IssueActivity.InterfaceC15228a.InterfaceC15229a
        /* renamed from: a */
        public RepairV3IssueActivity.InterfaceC15228a mo57524a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C25096k5 c25096k5) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c25096k5);
            return new C15232b(interfaceC44393lG2, baseActivity, scopeProvider, c25096k5);
        }

        private C15231a() {
        }
    }

    /* renamed from: co.bird.android.feature.repair.v3.issues.a$b */
    /* loaded from: classes3.dex */
    public static final class C15232b implements RepairV3IssueActivity.InterfaceC15228a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64661a;

        /* renamed from: b */
        public final BaseActivity f64662b;

        /* renamed from: c */
        public final C25096k5 f64663c;

        /* renamed from: d */
        public final ScopeProvider f64664d;

        /* renamed from: e */
        public final C15232b f64665e;

        @Override // co.bird.android.feature.repair.p016v3.issues.RepairV3IssueActivity.InterfaceC15228a
        /* renamed from: a */
        public void mo57523a(RepairV3IssueActivity repairV3IssueActivity) {
            m57522b(repairV3IssueActivity);
        }

        /* renamed from: b */
        public final RepairV3IssueActivity m57522b(RepairV3IssueActivity repairV3IssueActivity) {
            C5135Ly.m96068n(repairV3IssueActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64661a.mo27461w2()));
            C5135Ly.m96066p(repairV3IssueActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64661a.mo27595B1()));
            C5135Ly.m96071k(repairV3IssueActivity, (Handler) C51679xZ3.m5003d(this.f64661a.mo27535X2()));
            C5135Ly.m96067o(repairV3IssueActivity, (C22454gl) C51679xZ3.m5003d(this.f64661a.mo27479r()));
            C5135Ly.m96080b(repairV3IssueActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64661a.mo27519d0()));
            C5135Ly.m96075g(repairV3IssueActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f64661a.mo27453z2()));
            C5135Ly.m96064r(repairV3IssueActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f64661a.mo27459x1()));
            C5135Ly.m96081a(repairV3IssueActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f64661a.mo27474s()));
            C5135Ly.m96073i(repairV3IssueActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f64661a.mo27558P0()));
            C5135Ly.m96074h(repairV3IssueActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f64661a.mo27598A0()));
            C5135Ly.m96077e(repairV3IssueActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f64661a.mo27507i0()));
            C5135Ly.m96070l(repairV3IssueActivity, (FO2) C51679xZ3.m5003d(this.f64661a.mo27456y2()));
            C5135Ly.m96065q(repairV3IssueActivity, (YR4) C51679xZ3.m5003d(this.f64661a.mo27525b0()));
            C5135Ly.m96079c(repairV3IssueActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f64661a.mo27460x()));
            C5135Ly.m96078d(repairV3IssueActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f64661a.mo27517d3()));
            C5135Ly.m96072j(repairV3IssueActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f64661a.mo27482q()));
            C5135Ly.m96076f(repairV3IssueActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f64661a.mo27483p3()));
            C42598iE4.m34298b(repairV3IssueActivity, m57520d());
            return repairV3IssueActivity;
        }

        /* renamed from: c */
        public final C44377lE4 m57521c() {
            return new C44377lE4((Context) C51679xZ3.m5003d(this.f64661a.mo27552R1()));
        }

        /* renamed from: d */
        public final IE4 m57520d() {
            return new IE4((InterfaceC46473om3) C51679xZ3.m5003d(this.f64661a.mo27584F0()), (InterfaceC48265rn6) C51679xZ3.m5003d(this.f64661a.mo27515e3()), (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64661a.mo27519d0()), (InterfaceC45686nS1) C51679xZ3.m5003d(this.f64661a.mo27498k3()), (InterfaceC40099e13) C51679xZ3.m5003d(this.f64661a.mo27461w2()), m57521c(), m57519e(), this.f64664d);
        }

        /* renamed from: e */
        public final SE4 m57519e() {
            return new SE4(this.f64662b, this.f64663c);
        }

        public C15232b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C25096k5 c25096k5) {
            this.f64665e = this;
            this.f64661a = interfaceC44393lG2;
            this.f64662b = baseActivity;
            this.f64663c = c25096k5;
            this.f64664d = scopeProvider;
        }
    }

    private C15230a() {
    }

    /* renamed from: a */
    public static RepairV3IssueActivity.InterfaceC15228a.InterfaceC15229a m57525a() {
        return new C15231a();
    }
}

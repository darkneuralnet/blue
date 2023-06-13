package co.bird.android.feature.workorders.inspection;

import android.content.Context;
import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.workorders.inspection.WorkOrderInspectionActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.workorders.inspection.a */
/* loaded from: classes3.dex */
public final class C15937a {

    /* renamed from: co.bird.android.feature.workorders.inspection.a$a */
    /* loaded from: classes3.dex */
    public static final class C15938a implements WorkOrderInspectionActivity.InterfaceC15934a.InterfaceC15935a {
        @Override // co.bird.android.feature.workorders.inspection.WorkOrderInspectionActivity.InterfaceC15934a.InterfaceC15935a
        /* renamed from: a */
        public WorkOrderInspectionActivity.InterfaceC15934a mo56246a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C30417y6 c30417y6) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c30417y6);
            return new C15939b(interfaceC44393lG2, baseActivity, scopeProvider, c30417y6);
        }

        private C15938a() {
        }
    }

    /* renamed from: co.bird.android.feature.workorders.inspection.a$b */
    /* loaded from: classes3.dex */
    public static final class C15939b implements WorkOrderInspectionActivity.InterfaceC15934a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65942a;

        /* renamed from: b */
        public final BaseActivity f65943b;

        /* renamed from: c */
        public final C30417y6 f65944c;

        /* renamed from: d */
        public final ScopeProvider f65945d;

        /* renamed from: e */
        public final C15939b f65946e;

        @Override // co.bird.android.feature.workorders.inspection.WorkOrderInspectionActivity.InterfaceC15934a
        /* renamed from: a */
        public void mo56245a(WorkOrderInspectionActivity workOrderInspectionActivity) {
            m56244b(workOrderInspectionActivity);
        }

        /* renamed from: b */
        public final WorkOrderInspectionActivity m56244b(WorkOrderInspectionActivity workOrderInspectionActivity) {
            C5135Ly.m96068n(workOrderInspectionActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65942a.mo27461w2()));
            C5135Ly.m96066p(workOrderInspectionActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65942a.mo27595B1()));
            C5135Ly.m96071k(workOrderInspectionActivity, (Handler) C51679xZ3.m5003d(this.f65942a.mo27535X2()));
            C5135Ly.m96067o(workOrderInspectionActivity, (C22454gl) C51679xZ3.m5003d(this.f65942a.mo27479r()));
            C5135Ly.m96080b(workOrderInspectionActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65942a.mo27519d0()));
            C5135Ly.m96075g(workOrderInspectionActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f65942a.mo27453z2()));
            C5135Ly.m96064r(workOrderInspectionActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65942a.mo27459x1()));
            C5135Ly.m96081a(workOrderInspectionActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f65942a.mo27474s()));
            C5135Ly.m96073i(workOrderInspectionActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f65942a.mo27558P0()));
            C5135Ly.m96074h(workOrderInspectionActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f65942a.mo27598A0()));
            C5135Ly.m96077e(workOrderInspectionActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f65942a.mo27507i0()));
            C5135Ly.m96070l(workOrderInspectionActivity, (FO2) C51679xZ3.m5003d(this.f65942a.mo27456y2()));
            C5135Ly.m96065q(workOrderInspectionActivity, (YR4) C51679xZ3.m5003d(this.f65942a.mo27525b0()));
            C5135Ly.m96079c(workOrderInspectionActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f65942a.mo27460x()));
            C5135Ly.m96078d(workOrderInspectionActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f65942a.mo27517d3()));
            C5135Ly.m96072j(workOrderInspectionActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65942a.mo27482q()));
            C5135Ly.m96076f(workOrderInspectionActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f65942a.mo27483p3()));
            FD6.m107432b(workOrderInspectionActivity, m56241e());
            return workOrderInspectionActivity;
        }

        /* renamed from: c */
        public final GD6 m56243c() {
            return new GD6((InterfaceC48923su2) C51679xZ3.m5003d(this.f65942a.mo27505j0()));
        }

        /* renamed from: d */
        public final C43193jE6 m56242d() {
            return new C43193jE6((Context) C51679xZ3.m5003d(this.f65942a.mo27552R1()));
        }

        /* renamed from: e */
        public final YE6 m56241e() {
            return new YE6((InterfaceC44647lh6) C51679xZ3.m5003d(this.f65942a.mo27459x1()), (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65942a.mo27519d0()), (InterfaceC40099e13) C51679xZ3.m5003d(this.f65942a.mo27461w2()), (InterfaceC37857aG6) C51679xZ3.m5003d(this.f65942a.mo27549T2()), (InterfaceC49339tc5) C51679xZ3.m5003d(this.f65942a.mo27576I1()), m56240f(), this.f65945d, m56242d());
        }

        /* renamed from: f */
        public final C44388lF6 m56240f() {
            return new C44388lF6(this.f65943b, this.f65944c, m56243c());
        }

        public C15939b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C30417y6 c30417y6) {
            this.f65946e = this;
            this.f65942a = interfaceC44393lG2;
            this.f65943b = baseActivity;
            this.f65944c = c30417y6;
            this.f65945d = scopeProvider;
        }
    }

    private C15937a() {
    }

    /* renamed from: a */
    public static WorkOrderInspectionActivity.InterfaceC15934a.InterfaceC15935a m56247a() {
        return new C15938a();
    }
}

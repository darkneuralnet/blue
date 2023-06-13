package co.bird.android.feature.repair.p016v3.overview.nonrepair;

import co.bird.android.feature.repair.p016v3.overview.nonrepair.InterfaceC15243b;
/* renamed from: co.bird.android.feature.repair.v3.overview.nonrepair.a */
/* loaded from: classes3.dex */
public final class C15240a {

    /* renamed from: co.bird.android.feature.repair.v3.overview.nonrepair.a$a */
    /* loaded from: classes3.dex */
    public static final class C15241a implements InterfaceC15243b.InterfaceC15244a {
        @Override // co.bird.android.feature.repair.p016v3.overview.nonrepair.InterfaceC15243b.InterfaceC15244a
        /* renamed from: a */
        public InterfaceC15243b mo57497a(InterfaceC44393lG2 interfaceC44393lG2) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            return new C15242b(interfaceC44393lG2);
        }

        private C15241a() {
        }
    }

    /* renamed from: co.bird.android.feature.repair.v3.overview.nonrepair.a$b */
    /* loaded from: classes3.dex */
    public static final class C15242b implements InterfaceC15243b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64682a;

        /* renamed from: b */
        public final C15242b f64683b;

        @Override // co.bird.android.feature.repair.p016v3.overview.nonrepair.InterfaceC15243b
        /* renamed from: a */
        public void mo57498a(NonRepairSurveyActivity nonRepairSurveyActivity) {
            m57500b(nonRepairSurveyActivity);
        }

        /* renamed from: b */
        public final NonRepairSurveyActivity m57500b(NonRepairSurveyActivity nonRepairSurveyActivity) {
            C4650Ky.m98043b(nonRepairSurveyActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64682a.mo27461w2()));
            C4650Ky.m98042c(nonRepairSurveyActivity, (C22454gl) C51679xZ3.m5003d(this.f64682a.mo27479r()));
            C4650Ky.m98041d(nonRepairSurveyActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64682a.mo27595B1()));
            C49073t93.m12992b(nonRepairSurveyActivity, m57499c());
            return nonRepairSurveyActivity;
        }

        /* renamed from: c */
        public final D93 m57499c() {
            return new D93((InterfaceC48265rn6) C51679xZ3.m5003d(this.f64682a.mo27515e3()), (InterfaceC40099e13) C51679xZ3.m5003d(this.f64682a.mo27461w2()));
        }

        public C15242b(InterfaceC44393lG2 interfaceC44393lG2) {
            this.f64683b = this;
            this.f64682a = interfaceC44393lG2;
        }
    }

    private C15240a() {
    }

    /* renamed from: a */
    public static InterfaceC15243b.InterfaceC15244a m57501a() {
        return new C15241a();
    }
}

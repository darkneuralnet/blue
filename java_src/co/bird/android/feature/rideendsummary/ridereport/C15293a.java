package co.bird.android.feature.rideendsummary.ridereport;

import co.bird.android.feature.rideendsummary.ridereport.InterfaceC15296b;
/* renamed from: co.bird.android.feature.rideendsummary.ridereport.a */
/* loaded from: classes3.dex */
public final class C15293a {

    /* renamed from: co.bird.android.feature.rideendsummary.ridereport.a$a */
    /* loaded from: classes3.dex */
    public static final class C15294a implements InterfaceC15296b.InterfaceC15297a {
        @Override // co.bird.android.feature.rideendsummary.ridereport.InterfaceC15296b.InterfaceC15297a
        /* renamed from: a */
        public InterfaceC15296b mo57430a(InterfaceC44393lG2 interfaceC44393lG2) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            return new C15295b(interfaceC44393lG2);
        }

        private C15294a() {
        }
    }

    /* renamed from: co.bird.android.feature.rideendsummary.ridereport.a$b */
    /* loaded from: classes3.dex */
    public static final class C15295b implements InterfaceC15296b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64788a;

        /* renamed from: b */
        public final C15295b f64789b;

        @Override // co.bird.android.feature.rideendsummary.ridereport.InterfaceC15296b
        /* renamed from: a */
        public void mo57431a(RideReportActivity rideReportActivity) {
            m57433b(rideReportActivity);
        }

        /* renamed from: b */
        public final RideReportActivity m57433b(RideReportActivity rideReportActivity) {
            C4650Ky.m98043b(rideReportActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64788a.mo27461w2()));
            C4650Ky.m98042c(rideReportActivity, (C22454gl) C51679xZ3.m5003d(this.f64788a.mo27479r()));
            C4650Ky.m98041d(rideReportActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64788a.mo27595B1()));
            C47237q35.m18245b(rideReportActivity, m57432c());
            return rideReportActivity;
        }

        /* renamed from: c */
        public final F35 m57432c() {
            return new F35((YR4) C51679xZ3.m5003d(this.f64788a.mo27525b0()), (InterfaceC40099e13) C51679xZ3.m5003d(this.f64788a.mo27461w2()));
        }

        public C15295b(InterfaceC44393lG2 interfaceC44393lG2) {
            this.f64789b = this;
            this.f64788a = interfaceC44393lG2;
        }
    }

    private C15293a() {
    }

    /* renamed from: a */
    public static InterfaceC15296b.InterfaceC15297a m57434a() {
        return new C15294a();
    }
}

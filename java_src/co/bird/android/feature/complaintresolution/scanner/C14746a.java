package co.bird.android.feature.complaintresolution.scanner;

import co.bird.android.feature.complaintresolution.scanner.InterfaceC14749b;
/* renamed from: co.bird.android.feature.complaintresolution.scanner.a */
/* loaded from: classes3.dex */
public final class C14746a {

    /* renamed from: co.bird.android.feature.complaintresolution.scanner.a$a */
    /* loaded from: classes3.dex */
    public static final class C14747a implements InterfaceC14749b.InterfaceC14750a {
        @Override // co.bird.android.feature.complaintresolution.scanner.InterfaceC14749b.InterfaceC14750a
        /* renamed from: a */
        public InterfaceC14749b mo58407a(InterfaceC44393lG2 interfaceC44393lG2) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            return new C14748b(interfaceC44393lG2);
        }

        private C14747a() {
        }
    }

    /* renamed from: co.bird.android.feature.complaintresolution.scanner.a$b */
    /* loaded from: classes3.dex */
    public static final class C14748b implements InterfaceC14749b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f63729a;

        /* renamed from: b */
        public final C14748b f63730b;

        @Override // co.bird.android.feature.complaintresolution.scanner.InterfaceC14749b
        /* renamed from: a */
        public void mo58408a(VehicleInvolvedScanActivity vehicleInvolvedScanActivity) {
            m58410b(vehicleInvolvedScanActivity);
        }

        /* renamed from: b */
        public final VehicleInvolvedScanActivity m58410b(VehicleInvolvedScanActivity vehicleInvolvedScanActivity) {
            C4650Ky.m98043b(vehicleInvolvedScanActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f63729a.mo27461w2()));
            C4650Ky.m98042c(vehicleInvolvedScanActivity, (C22454gl) C51679xZ3.m5003d(this.f63729a.mo27479r()));
            C4650Ky.m98041d(vehicleInvolvedScanActivity, (C36207Tq4) C51679xZ3.m5003d(this.f63729a.mo27595B1()));
            C34526Ml6.m94916b(vehicleInvolvedScanActivity, m58409c());
            return vehicleInvolvedScanActivity;
        }

        /* renamed from: c */
        public final C36866Wl6 m58409c() {
            return new C36866Wl6((InterfaceC46473om3) C51679xZ3.m5003d(this.f63729a.mo27584F0()), (C36207Tq4) C51679xZ3.m5003d(this.f63729a.mo27595B1()), (InterfaceC40099e13) C51679xZ3.m5003d(this.f63729a.mo27461w2()));
        }

        public C14748b(InterfaceC44393lG2 interfaceC44393lG2) {
            this.f63730b = this;
            this.f63729a = interfaceC44393lG2;
        }
    }

    private C14746a() {
    }

    /* renamed from: a */
    public static InterfaceC14749b.InterfaceC14750a m58411a() {
        return new C14747a();
    }
}

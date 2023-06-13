package co.bird.android.feature.bulkscanner.scan.capture;

import co.bird.android.feature.bulkscanner.scan.capture.InterfaceC14635a;
/* renamed from: co.bird.android.feature.bulkscanner.scan.capture.b */
/* loaded from: classes3.dex */
public final class C14637b {

    /* renamed from: co.bird.android.feature.bulkscanner.scan.capture.b$a */
    /* loaded from: classes3.dex */
    public static final class C14638a implements InterfaceC14635a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f63484a;

        /* renamed from: b */
        public final C14638a f63485b;

        @Override // co.bird.android.feature.bulkscanner.scan.capture.InterfaceC14635a
        /* renamed from: a */
        public void mo58588a(CaptureBulkScannerActivity captureBulkScannerActivity) {
            m58586c(captureBulkScannerActivity);
        }

        /* renamed from: b */
        public final C36797We0 m58587b() {
            return new C36797We0((InterfaceC46473om3) C51679xZ3.m5003d(this.f63484a.mo27584F0()), (C36207Tq4) C51679xZ3.m5003d(this.f63484a.mo27595B1()), (InterfaceC40099e13) C51679xZ3.m5003d(this.f63484a.mo27461w2()));
        }

        /* renamed from: c */
        public final CaptureBulkScannerActivity m58586c(CaptureBulkScannerActivity captureBulkScannerActivity) {
            C4650Ky.m98043b(captureBulkScannerActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f63484a.mo27461w2()));
            C4650Ky.m98042c(captureBulkScannerActivity, (C22454gl) C51679xZ3.m5003d(this.f63484a.mo27479r()));
            C4650Ky.m98041d(captureBulkScannerActivity, (C36207Tq4) C51679xZ3.m5003d(this.f63484a.mo27595B1()));
            C32585Ee0.m108617b(captureBulkScannerActivity, m58587b());
            return captureBulkScannerActivity;
        }

        public C14638a(InterfaceC44393lG2 interfaceC44393lG2) {
            this.f63485b = this;
            this.f63484a = interfaceC44393lG2;
        }
    }

    /* renamed from: co.bird.android.feature.bulkscanner.scan.capture.b$b */
    /* loaded from: classes3.dex */
    public static final class C14639b implements InterfaceC14635a.InterfaceC14636a {
        @Override // co.bird.android.feature.bulkscanner.scan.capture.InterfaceC14635a.InterfaceC14636a
        /* renamed from: a */
        public InterfaceC14635a mo58585a(InterfaceC44393lG2 interfaceC44393lG2) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            return new C14638a(interfaceC44393lG2);
        }

        private C14639b() {
        }
    }

    private C14637b() {
    }

    /* renamed from: a */
    public static InterfaceC14635a.InterfaceC14636a m58589a() {
        return new C14639b();
    }
}

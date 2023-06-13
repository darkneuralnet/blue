package co.bird.android.feature.identification;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.identification.IdentificationScannerActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.identification.b */
/* loaded from: classes3.dex */
public final class C14898b {

    /* renamed from: co.bird.android.feature.identification.b$a */
    /* loaded from: classes3.dex */
    public static final class C14899a implements IdentificationScannerActivity.InterfaceC14892a.InterfaceC14893a {
        @Override // co.bird.android.feature.identification.IdentificationScannerActivity.InterfaceC14892a.InterfaceC14893a
        /* renamed from: a */
        public IdentificationScannerActivity.InterfaceC14892a mo58050a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C7319S3 c7319s3) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c7319s3);
            return new C14900b(interfaceC44393lG2, baseActivity, scopeProvider, c7319s3);
        }

        private C14899a() {
        }
    }

    /* renamed from: co.bird.android.feature.identification.b$b */
    /* loaded from: classes3.dex */
    public static final class C14900b implements IdentificationScannerActivity.InterfaceC14892a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64093a;

        /* renamed from: b */
        public final BaseActivity f64094b;

        /* renamed from: c */
        public final C7319S3 f64095c;

        /* renamed from: d */
        public final ScopeProvider f64096d;

        /* renamed from: e */
        public final C14900b f64097e;

        @Override // co.bird.android.feature.identification.IdentificationScannerActivity.InterfaceC14892a
        /* renamed from: a */
        public void mo58049a(IdentificationScannerActivity identificationScannerActivity) {
            m58046d(identificationScannerActivity);
        }

        /* renamed from: b */
        public final IV1 m58048b() {
            return new IV1((InterfaceC45102mT1) C51679xZ3.m5003d(this.f64093a.mo27568L1()), m58047c(), this.f64096d, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64093a.mo27461w2()), (C22454gl) C51679xZ3.m5003d(this.f64093a.mo27479r()), (InterfaceC35660Rh6) C51679xZ3.m5003d(this.f64093a.mo27500k1()), (InterfaceC6097Oh) C51679xZ3.m5003d(this.f64093a.mo27470t0()), (C36207Tq4) C51679xZ3.m5003d(this.f64093a.mo27595B1()), (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64093a.mo27519d0()));
        }

        /* renamed from: c */
        public final TV1 m58047c() {
            return new TV1(this.f64094b, this.f64095c);
        }

        /* renamed from: d */
        public final IdentificationScannerActivity m58046d(IdentificationScannerActivity identificationScannerActivity) {
            C5135Ly.m96068n(identificationScannerActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64093a.mo27461w2()));
            C5135Ly.m96066p(identificationScannerActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64093a.mo27595B1()));
            C5135Ly.m96071k(identificationScannerActivity, (Handler) C51679xZ3.m5003d(this.f64093a.mo27535X2()));
            C5135Ly.m96067o(identificationScannerActivity, (C22454gl) C51679xZ3.m5003d(this.f64093a.mo27479r()));
            C5135Ly.m96080b(identificationScannerActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64093a.mo27519d0()));
            C5135Ly.m96075g(identificationScannerActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f64093a.mo27453z2()));
            C5135Ly.m96064r(identificationScannerActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f64093a.mo27459x1()));
            C5135Ly.m96081a(identificationScannerActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f64093a.mo27474s()));
            C5135Ly.m96073i(identificationScannerActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f64093a.mo27558P0()));
            C5135Ly.m96074h(identificationScannerActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f64093a.mo27598A0()));
            C5135Ly.m96077e(identificationScannerActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f64093a.mo27507i0()));
            C5135Ly.m96070l(identificationScannerActivity, (FO2) C51679xZ3.m5003d(this.f64093a.mo27456y2()));
            C5135Ly.m96065q(identificationScannerActivity, (YR4) C51679xZ3.m5003d(this.f64093a.mo27525b0()));
            C5135Ly.m96079c(identificationScannerActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f64093a.mo27460x()));
            C5135Ly.m96078d(identificationScannerActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f64093a.mo27517d3()));
            C5135Ly.m96072j(identificationScannerActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f64093a.mo27482q()));
            C5135Ly.m96076f(identificationScannerActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f64093a.mo27483p3()));
            C48085rV1.m15845b(identificationScannerActivity, m58048b());
            return identificationScannerActivity;
        }

        public C14900b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C7319S3 c7319s3) {
            this.f64097e = this;
            this.f64093a = interfaceC44393lG2;
            this.f64094b = baseActivity;
            this.f64095c = c7319s3;
            this.f64096d = scopeProvider;
        }
    }

    private C14898b() {
    }

    /* renamed from: a */
    public static IdentificationScannerActivity.InterfaceC14892a.InterfaceC14893a m58051a() {
        return new C14899a();
    }
}

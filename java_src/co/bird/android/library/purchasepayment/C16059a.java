package co.bird.android.library.purchasepayment;

import android.app.Activity;
import co.bird.android.library.purchasepayment.InterfaceC16062b;
import co.bird.android.model.PaymentAddSource;
/* renamed from: co.bird.android.library.purchasepayment.a */
/* loaded from: classes3.dex */
public final class C16059a {

    /* renamed from: co.bird.android.library.purchasepayment.a$a */
    /* loaded from: classes3.dex */
    public static final class C16060a implements InterfaceC16062b.InterfaceC16063a {
        @Override // co.bird.android.library.purchasepayment.InterfaceC16062b.InterfaceC16063a
        /* renamed from: a */
        public InterfaceC16062b mo55979a(InterfaceC44393lG2 interfaceC44393lG2, Activity activity, PaymentAddSource paymentAddSource) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(activity);
            C51679xZ3.m5005b(paymentAddSource);
            return new C16061b(interfaceC44393lG2, activity, paymentAddSource);
        }

        private C16060a() {
        }
    }

    /* renamed from: co.bird.android.library.purchasepayment.a$b */
    /* loaded from: classes3.dex */
    public static final class C16061b implements InterfaceC16062b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f66144a;

        /* renamed from: b */
        public final PaymentAddSource f66145b;

        /* renamed from: c */
        public final C16061b f66146c;

        @Override // co.bird.android.library.purchasepayment.InterfaceC16062b
        /* renamed from: a */
        public void mo55980a(PurchasePaymentActivity purchasePaymentActivity) {
            m55982b(purchasePaymentActivity);
        }

        /* renamed from: b */
        public final PurchasePaymentActivity m55982b(PurchasePaymentActivity purchasePaymentActivity) {
            C4650Ky.m98043b(purchasePaymentActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f66144a.mo27461w2()));
            C4650Ky.m98042c(purchasePaymentActivity, (C22454gl) C51679xZ3.m5003d(this.f66144a.mo27479r()));
            C4650Ky.m98041d(purchasePaymentActivity, (C36207Tq4) C51679xZ3.m5003d(this.f66144a.mo27595B1()));
            C48725sa4.m13976b(purchasePaymentActivity, m55981c());
            return purchasePaymentActivity;
        }

        /* renamed from: c */
        public final C32553Ea4 m55981c() {
            return new C32553Ea4((AM3) C51679xZ3.m5003d(this.f66144a.mo27471t()), (InterfaceC42586iD1) C51679xZ3.m5003d(this.f66144a.mo27539W2()), (InterfaceC1880Ea) C51679xZ3.m5003d(this.f66144a.mo27519d0()), (C36207Tq4) C51679xZ3.m5003d(this.f66144a.mo27595B1()), (InterfaceC35660Rh6) C51679xZ3.m5003d(this.f66144a.mo27500k1()), (InterfaceC40099e13) C51679xZ3.m5003d(this.f66144a.mo27461w2()), this.f66145b);
        }

        public C16061b(InterfaceC44393lG2 interfaceC44393lG2, Activity activity, PaymentAddSource paymentAddSource) {
            this.f66146c = this;
            this.f66144a = interfaceC44393lG2;
            this.f66145b = paymentAddSource;
        }
    }

    private C16059a() {
    }

    /* renamed from: a */
    public static InterfaceC16062b.InterfaceC16063a m55983a() {
        return new C16060a();
    }
}

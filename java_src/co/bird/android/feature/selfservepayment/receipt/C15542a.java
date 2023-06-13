package co.bird.android.feature.selfservepayment.receipt;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.selfservepayment.receipt.TransactionReceiptActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.selfservepayment.receipt.a */
/* loaded from: classes3.dex */
public final class C15542a {

    /* renamed from: co.bird.android.feature.selfservepayment.receipt.a$a */
    /* loaded from: classes3.dex */
    public static final class C15543a implements TransactionReceiptActivity.InterfaceC15539a.InterfaceC15540a {
        @Override // co.bird.android.feature.selfservepayment.receipt.TransactionReceiptActivity.InterfaceC15539a.InterfaceC15540a
        /* renamed from: a */
        public TransactionReceiptActivity.InterfaceC15539a mo56954a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C25914m6 c25914m6, String str, String str2) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            C51679xZ3.m5005b(baseActivity);
            C51679xZ3.m5005b(scopeProvider);
            C51679xZ3.m5005b(c25914m6);
            C51679xZ3.m5005b(str);
            return new C15544b(interfaceC44393lG2, baseActivity, scopeProvider, c25914m6, str, str2);
        }

        private C15543a() {
        }
    }

    /* renamed from: co.bird.android.feature.selfservepayment.receipt.a$b */
    /* loaded from: classes3.dex */
    public static final class C15544b implements TransactionReceiptActivity.InterfaceC15539a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65224a;

        /* renamed from: b */
        public final BaseActivity f65225b;

        /* renamed from: c */
        public final C25914m6 f65226c;

        /* renamed from: d */
        public final ScopeProvider f65227d;

        /* renamed from: e */
        public final String f65228e;

        /* renamed from: f */
        public final String f65229f;

        /* renamed from: g */
        public final C15544b f65230g;

        @Override // co.bird.android.feature.selfservepayment.receipt.TransactionReceiptActivity.InterfaceC15539a
        /* renamed from: a */
        public void mo56953a(TransactionReceiptActivity transactionReceiptActivity) {
            m56952b(transactionReceiptActivity);
        }

        /* renamed from: b */
        public final TransactionReceiptActivity m56952b(TransactionReceiptActivity transactionReceiptActivity) {
            C5135Ly.m96068n(transactionReceiptActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65224a.mo27461w2()));
            C5135Ly.m96066p(transactionReceiptActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65224a.mo27595B1()));
            C5135Ly.m96071k(transactionReceiptActivity, (Handler) C51679xZ3.m5003d(this.f65224a.mo27535X2()));
            C5135Ly.m96067o(transactionReceiptActivity, (C22454gl) C51679xZ3.m5003d(this.f65224a.mo27479r()));
            C5135Ly.m96080b(transactionReceiptActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65224a.mo27519d0()));
            C5135Ly.m96075g(transactionReceiptActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f65224a.mo27453z2()));
            C5135Ly.m96064r(transactionReceiptActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f65224a.mo27459x1()));
            C5135Ly.m96081a(transactionReceiptActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f65224a.mo27474s()));
            C5135Ly.m96073i(transactionReceiptActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f65224a.mo27558P0()));
            C5135Ly.m96074h(transactionReceiptActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f65224a.mo27598A0()));
            C5135Ly.m96077e(transactionReceiptActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f65224a.mo27507i0()));
            C5135Ly.m96070l(transactionReceiptActivity, (FO2) C51679xZ3.m5003d(this.f65224a.mo27456y2()));
            C5135Ly.m96065q(transactionReceiptActivity, (YR4) C51679xZ3.m5003d(this.f65224a.mo27525b0()));
            C5135Ly.m96079c(transactionReceiptActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f65224a.mo27460x()));
            C5135Ly.m96078d(transactionReceiptActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f65224a.mo27517d3()));
            C5135Ly.m96072j(transactionReceiptActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f65224a.mo27482q()));
            C5135Ly.m96076f(transactionReceiptActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f65224a.mo27483p3()));
            I76.m102932b(transactionReceiptActivity, m56951c());
            return transactionReceiptActivity;
        }

        /* renamed from: c */
        public final X76 m56951c() {
            return new X76(m56950d(), this.f65227d, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65224a.mo27461w2()), (C36207Tq4) C51679xZ3.m5003d(this.f65224a.mo27595B1()), (InterfaceC1880Ea) C51679xZ3.m5003d(this.f65224a.mo27519d0()), (VM3) C51679xZ3.m5003d(this.f65224a.mo27585F()), this.f65228e, this.f65229f);
        }

        /* renamed from: d */
        public final Z76 m56950d() {
            return new Z76(this.f65225b, this.f65226c);
        }

        public C15544b(InterfaceC44393lG2 interfaceC44393lG2, BaseActivity baseActivity, ScopeProvider scopeProvider, C25914m6 c25914m6, String str, String str2) {
            this.f65230g = this;
            this.f65224a = interfaceC44393lG2;
            this.f65225b = baseActivity;
            this.f65226c = c25914m6;
            this.f65227d = scopeProvider;
            this.f65228e = str;
            this.f65229f = str2;
        }
    }

    private C15542a() {
    }

    /* renamed from: a */
    public static TransactionReceiptActivity.InterfaceC15539a.InterfaceC15540a m56955a() {
        return new C15543a();
    }
}

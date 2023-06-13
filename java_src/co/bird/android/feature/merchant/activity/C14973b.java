package co.bird.android.feature.merchant.activity;

import android.os.Handler;
import co.bird.android.feature.merchant.activity.MerchantHistoryDetailsActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: co.bird.android.feature.merchant.activity.b */
/* loaded from: classes3.dex */
public final class C14973b {

    /* renamed from: co.bird.android.feature.merchant.activity.b$a */
    /* loaded from: classes3.dex */
    public static final class C14974a implements MerchantHistoryDetailsActivity.InterfaceC14953a.InterfaceC14954a {

        /* renamed from: a */
        public MerchantHistoryDetailsActivity.C14955b f64193a;

        /* renamed from: b */
        public InterfaceC44393lG2 f64194b;

        @Override // co.bird.android.feature.merchant.activity.MerchantHistoryDetailsActivity.InterfaceC14953a.InterfaceC14954a
        public MerchantHistoryDetailsActivity.InterfaceC14953a build() {
            C51679xZ3.m5006a(this.f64193a, MerchantHistoryDetailsActivity.C14955b.class);
            C51679xZ3.m5006a(this.f64194b, InterfaceC44393lG2.class);
            return new C14975b(this.f64193a, this.f64194b);
        }

        @Override // co.bird.android.feature.merchant.activity.MerchantHistoryDetailsActivity.InterfaceC14953a.InterfaceC14954a
        /* renamed from: c */
        public C14974a mo57954a(InterfaceC44393lG2 interfaceC44393lG2) {
            this.f64194b = (InterfaceC44393lG2) C51679xZ3.m5005b(interfaceC44393lG2);
            return this;
        }

        @Override // co.bird.android.feature.merchant.activity.MerchantHistoryDetailsActivity.InterfaceC14953a.InterfaceC14954a
        /* renamed from: d */
        public C14974a mo57953b(MerchantHistoryDetailsActivity.C14955b c14955b) {
            this.f64193a = (MerchantHistoryDetailsActivity.C14955b) C51679xZ3.m5005b(c14955b);
            return this;
        }

        private C14974a() {
        }
    }

    /* renamed from: co.bird.android.feature.merchant.activity.b$b */
    /* loaded from: classes3.dex */
    public static final class C14975b implements MerchantHistoryDetailsActivity.InterfaceC14953a {

        /* renamed from: a */
        public final InterfaceC44393lG2 f64195a;

        /* renamed from: b */
        public final C14975b f64196b;

        /* renamed from: c */
        public Y94<ScopeProvider> f64197c;

        /* renamed from: d */
        public Y94<L66> f64198d;

        @Override // co.bird.android.feature.merchant.activity.MerchantHistoryDetailsActivity.InterfaceC14953a
        /* renamed from: a */
        public void mo57950a(MerchantHistoryDetailsActivity merchantHistoryDetailsActivity) {
            m57948c(merchantHistoryDetailsActivity);
        }

        /* renamed from: b */
        public final void m57949b(MerchantHistoryDetailsActivity.C14955b c14955b, InterfaceC44393lG2 interfaceC44393lG2) {
            this.f64197c = V51.m80429b(C14988e.m57930a(c14955b));
            this.f64198d = V51.m80429b(C14987d.m57933a(c14955b));
        }

        /* renamed from: c */
        public final MerchantHistoryDetailsActivity m57948c(MerchantHistoryDetailsActivity merchantHistoryDetailsActivity) {
            C5135Ly.m96068n(merchantHistoryDetailsActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f64195a.mo27461w2()));
            C5135Ly.m96066p(merchantHistoryDetailsActivity, (C36207Tq4) C51679xZ3.m5003d(this.f64195a.mo27595B1()));
            C5135Ly.m96071k(merchantHistoryDetailsActivity, (Handler) C51679xZ3.m5003d(this.f64195a.mo27535X2()));
            C5135Ly.m96067o(merchantHistoryDetailsActivity, (C22454gl) C51679xZ3.m5003d(this.f64195a.mo27479r()));
            C5135Ly.m96080b(merchantHistoryDetailsActivity, (InterfaceC1880Ea) C51679xZ3.m5003d(this.f64195a.mo27519d0()));
            C5135Ly.m96075g(merchantHistoryDetailsActivity, (InterfaceC32604Eg1) C51679xZ3.m5003d(this.f64195a.mo27453z2()));
            C5135Ly.m96064r(merchantHistoryDetailsActivity, (InterfaceC44647lh6) C51679xZ3.m5003d(this.f64195a.mo27459x1()));
            C5135Ly.m96081a(merchantHistoryDetailsActivity, (InterfaceC44637lg6) C51679xZ3.m5003d(this.f64195a.mo27474s()));
            C5135Ly.m96073i(merchantHistoryDetailsActivity, (InterfaceC47617qi1) C51679xZ3.m5003d(this.f64195a.mo27558P0()));
            C5135Ly.m96074h(merchantHistoryDetailsActivity, (InterfaceC36675Vq4) C51679xZ3.m5003d(this.f64195a.mo27598A0()));
            C5135Ly.m96077e(merchantHistoryDetailsActivity, (InterfaceC43160jB0) C51679xZ3.m5003d(this.f64195a.mo27507i0()));
            C5135Ly.m96070l(merchantHistoryDetailsActivity, (FO2) C51679xZ3.m5003d(this.f64195a.mo27456y2()));
            C5135Ly.m96065q(merchantHistoryDetailsActivity, (YR4) C51679xZ3.m5003d(this.f64195a.mo27525b0()));
            C5135Ly.m96079c(merchantHistoryDetailsActivity, (InterfaceC10636aM) C51679xZ3.m5003d(this.f64195a.mo27460x()));
            C5135Ly.m96078d(merchantHistoryDetailsActivity, (InterfaceC27246pJ) C51679xZ3.m5003d(this.f64195a.mo27517d3()));
            C5135Ly.m96072j(merchantHistoryDetailsActivity, (InterfaceC40001dr4) C51679xZ3.m5003d(this.f64195a.mo27482q()));
            C5135Ly.m96076f(merchantHistoryDetailsActivity, (InterfaceC46037o21) C51679xZ3.m5003d(this.f64195a.mo27483p3()));
            GQ2.m105134b(merchantHistoryDetailsActivity, m57947d());
            return merchantHistoryDetailsActivity;
        }

        /* renamed from: d */
        public final J66 m57947d() {
            return new J66((InterfaceC37961aS2) C51679xZ3.m5003d(this.f64195a.mo27550S1()), this.f64197c.get(), this.f64198d.get(), (InterfaceC40099e13) C51679xZ3.m5003d(this.f64195a.mo27461w2()));
        }

        public C14975b(MerchantHistoryDetailsActivity.C14955b c14955b, InterfaceC44393lG2 interfaceC44393lG2) {
            this.f64196b = this;
            this.f64195a = interfaceC44393lG2;
            m57949b(c14955b, interfaceC44393lG2);
        }
    }

    private C14973b() {
    }

    /* renamed from: a */
    public static MerchantHistoryDetailsActivity.InterfaceC14953a.InterfaceC14954a m57955a() {
        return new C14974a();
    }
}

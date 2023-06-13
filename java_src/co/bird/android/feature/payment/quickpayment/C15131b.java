package co.bird.android.feature.payment.quickpayment;

import co.bird.android.feature.payment.quickpayment.QuickPaymentActivity;
/* renamed from: co.bird.android.feature.payment.quickpayment.b */
/* loaded from: classes3.dex */
public final class C15131b implements InterfaceC48812sj1<InterfaceC39261ce4> {

    /* renamed from: a */
    public final QuickPaymentActivity.C15116b f64499a;

    /* renamed from: b */
    public final Y94<C39872de4> f64500b;

    /* renamed from: c */
    public final Y94<C41057fe4> f64501c;

    public C15131b(QuickPaymentActivity.C15116b c15116b, Y94<C39872de4> y94, Y94<C41057fe4> y942) {
        this.f64499a = c15116b;
        this.f64500b = y94;
        this.f64501c = y942;
    }

    /* renamed from: a */
    public static C15131b m57680a(QuickPaymentActivity.C15116b c15116b, Y94<C39872de4> y94, Y94<C41057fe4> y942) {
        return new C15131b(c15116b, y94, y942);
    }

    /* renamed from: c */
    public static InterfaceC39261ce4 m57678c(QuickPaymentActivity.C15116b c15116b, C39872de4 c39872de4, C41057fe4 c41057fe4) {
        return (InterfaceC39261ce4) C51679xZ3.m5002e(c15116b.m57696a(c39872de4, c41057fe4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC39261ce4 get() {
        return m57678c(this.f64499a, this.f64500b.get(), this.f64501c.get());
    }
}

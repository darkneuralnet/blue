package p000;

import com.stripe.android.Stripe;
/* renamed from: wJ2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50941wJ2 implements InterfaceC48812sj1<Stripe> {

    /* renamed from: a */
    public final VH2 f115784a;

    /* renamed from: b */
    public final Y94<C22454gl> f115785b;

    public C50941wJ2(VH2 vh2, Y94<C22454gl> y94) {
        this.f115784a = vh2;
        this.f115785b = y94;
    }

    /* renamed from: a */
    public static C50941wJ2 m7022a(VH2 vh2, Y94<C22454gl> y94) {
        return new C50941wJ2(vh2, y94);
    }

    /* renamed from: c */
    public static Stripe m7020c(VH2 vh2, C22454gl c22454gl) {
        return (Stripe) C51679xZ3.m5002e(vh2.m80115C0(c22454gl));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public Stripe get() {
        return m7020c(this.f115784a, this.f115785b.get());
    }
}

package p000;

import co.bird.android.library.purchasepayment.PurchasePaymentActivity;
import dagger.MembersInjector;
/* renamed from: sa4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48725sa4 implements MembersInjector<PurchasePaymentActivity> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f109010a;

    /* renamed from: b */
    public final Y94<C22454gl> f109011b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f109012c;

    /* renamed from: d */
    public final Y94<C32553Ea4> f109013d;

    /* renamed from: b */
    public static void m13976b(PurchasePaymentActivity purchasePaymentActivity, C32553Ea4 c32553Ea4) {
        purchasePaymentActivity.f66123j = c32553Ea4;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(PurchasePaymentActivity purchasePaymentActivity) {
        C4650Ky.m98043b(purchasePaymentActivity, this.f109010a.get());
        C4650Ky.m98042c(purchasePaymentActivity, this.f109011b.get());
        C4650Ky.m98041d(purchasePaymentActivity, this.f109012c.get());
        m13976b(purchasePaymentActivity, this.f109013d.get());
    }
}

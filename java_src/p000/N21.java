package p000;

import io.reactivex.AbstractC23437E;
/* renamed from: N21 */
/* loaded from: classes6.dex */
public final class N21 implements InterfaceC49405tj1<L46> {

    /* renamed from: a */
    public final Z94<AbstractC23437E> f23992a;

    public N21(Z94<AbstractC23437E> z94) {
        this.f23992a = z94;
    }

    /* renamed from: a */
    public static N21 m94441a(Z94<AbstractC23437E> z94) {
        return new N21(z94);
    }

    /* renamed from: c */
    public static L46 m94439c(AbstractC23437E abstractC23437E) {
        return (L46) C52272yZ3.m3257d(I21.m103042e(abstractC23437E));
    }

    @Override // p000.Z94
    /* renamed from: b */
    public L46 get() {
        return m94439c(this.f23992a.get());
    }
}

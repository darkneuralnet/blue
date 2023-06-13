package p000;

import io.reactivex.AbstractC23437E;
/* renamed from: Mk0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34511Mk0 implements InterfaceC49405tj1<C34277Lk0> {

    /* renamed from: a */
    public final Z94<AbstractC23437E> f23446a;

    public C34511Mk0(Z94<AbstractC23437E> z94) {
        this.f23446a = z94;
    }

    /* renamed from: a */
    public static C34511Mk0 m94984a(Z94<AbstractC23437E> z94) {
        return new C34511Mk0(z94);
    }

    /* renamed from: c */
    public static C34277Lk0 m94982c(AbstractC23437E abstractC23437E) {
        return new C34277Lk0(abstractC23437E);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C34277Lk0 get() {
        return m94982c(this.f23446a.get());
    }
}

package p000;

import io.reactivex.AbstractC23437E;
/* renamed from: we5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51137we5 implements InterfaceC49405tj1<C50544ve5> {

    /* renamed from: a */
    public final Z94<AbstractC23437E> f116301a;

    /* renamed from: b */
    public final Z94<C25174kX> f116302b;

    /* renamed from: c */
    public final Z94<C50206v41> f116303c;

    /* renamed from: d */
    public final Z94<C48705sY2> f116304d;

    public C51137we5(Z94<AbstractC23437E> z94, Z94<C25174kX> z942, Z94<C50206v41> z943, Z94<C48705sY2> z944) {
        this.f116301a = z94;
        this.f116302b = z942;
        this.f116303c = z943;
        this.f116304d = z944;
    }

    /* renamed from: a */
    public static C51137we5 m6558a(Z94<AbstractC23437E> z94, Z94<C25174kX> z942, Z94<C50206v41> z943, Z94<C48705sY2> z944) {
        return new C51137we5(z94, z942, z943, z944);
    }

    /* renamed from: c */
    public static C50544ve5 m6556c(AbstractC23437E abstractC23437E, C25174kX c25174kX, Object obj, Object obj2) {
        return new C50544ve5(abstractC23437E, c25174kX, (C50206v41) obj, (C48705sY2) obj2);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C50544ve5 get() {
        return m6556c(this.f116301a.get(), this.f116302b.get(), this.f116303c.get(), this.f116304d.get());
    }
}

package p000;

import io.reactivex.AbstractC23437E;
/* renamed from: ny0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45997ny0 implements InterfaceC49405tj1<L46> {

    /* renamed from: a */
    public final Z94<AbstractC23437E> f101161a;

    /* renamed from: b */
    public final Z94<K46> f101162b;

    public C45997ny0(Z94<AbstractC23437E> z94, Z94<K46> z942) {
        this.f101161a = z94;
        this.f101162b = z942;
    }

    /* renamed from: a */
    public static C45997ny0 m22050a(Z94<AbstractC23437E> z94, Z94<K46> z942) {
        return new C45997ny0(z94, z942);
    }

    /* renamed from: c */
    public static L46 m22048c(AbstractC23437E abstractC23437E, K46 k46) {
        return (L46) C52272yZ3.m3257d(AbstractC42439hy0.m35443f(abstractC23437E, k46));
    }

    @Override // p000.Z94
    /* renamed from: b */
    public L46 get() {
        return m22048c(this.f101161a.get(), this.f101162b.get());
    }
}

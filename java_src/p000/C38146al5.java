package p000;

import io.reactivex.AbstractC23437E;
/* renamed from: al5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C38146al5 implements InterfaceC49405tj1<C37558Zk5> {

    /* renamed from: a */
    public final Z94<AbstractC23437E> f51193a;

    public C38146al5(Z94<AbstractC23437E> z94) {
        this.f51193a = z94;
    }

    /* renamed from: a */
    public static C38146al5 m70780a(Z94<AbstractC23437E> z94) {
        return new C38146al5(z94);
    }

    /* renamed from: c */
    public static C37558Zk5 m70778c(AbstractC23437E abstractC23437E) {
        return new C37558Zk5(abstractC23437E);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C37558Zk5 get() {
        return m70778c(this.f51193a.get());
    }
}

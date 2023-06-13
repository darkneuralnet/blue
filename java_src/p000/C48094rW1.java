package p000;
/* renamed from: rW1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C48094rW1 implements InterfaceC49405tj1<C47501qW1> {

    /* renamed from: a */
    public final Z94<AbstractC48686sW1> f107235a;

    public C48094rW1(Z94<AbstractC48686sW1> z94) {
        this.f107235a = z94;
    }

    /* renamed from: a */
    public static C48094rW1 m15836a(Z94<AbstractC48686sW1> z94) {
        return new C48094rW1(z94);
    }

    /* renamed from: c */
    public static C47501qW1 m15834c(AbstractC48686sW1 abstractC48686sW1) {
        return new C47501qW1(abstractC48686sW1);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C47501qW1 get() {
        return m15834c(this.f107235a.get());
    }
}

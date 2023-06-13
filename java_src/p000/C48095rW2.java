package p000;
/* renamed from: rW2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C48095rW2 implements InterfaceC49405tj1<C47502qW2> {

    /* renamed from: a */
    public final Z94<C50544ve5> f107236a;

    /* renamed from: b */
    public final Z94<Integer> f107237b;

    public C48095rW2(Z94<C50544ve5> z94, Z94<Integer> z942) {
        this.f107236a = z94;
        this.f107237b = z942;
    }

    /* renamed from: a */
    public static C48095rW2 m15833a(Z94<C50544ve5> z94, Z94<Integer> z942) {
        return new C48095rW2(z94, z942);
    }

    /* renamed from: c */
    public static C47502qW2 m15831c(C50544ve5 c50544ve5, int i) {
        return new C47502qW2(c50544ve5, i);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C47502qW2 get() {
        return m15831c(this.f107236a.get(), this.f107237b.get().intValue());
    }
}

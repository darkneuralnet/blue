package p000;
/* renamed from: Gm5  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33130Gm5 implements InterfaceC48220rj1<AbstractC52403ym5> {

    /* renamed from: a */
    public final Y94<InterfaceC38734bl0> f12408a;

    public C33130Gm5(Y94<InterfaceC38734bl0> y94) {
        this.f12408a = y94;
    }

    /* renamed from: a */
    public static AbstractC52403ym5 m104763a(InterfaceC38734bl0 interfaceC38734bl0) {
        return (AbstractC52403ym5) CZ3.m112115c(AbstractC32896Fm5.m106591a(interfaceC38734bl0), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static C33130Gm5 m104762b(Y94<InterfaceC38734bl0> y94) {
        return new C33130Gm5(y94);
    }

    @Override // p000.Y94
    /* renamed from: c */
    public AbstractC52403ym5 get() {
        return m104763a(this.f12408a.get());
    }
}

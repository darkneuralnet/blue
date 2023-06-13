package p000;
/* renamed from: my0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45404my0 implements InterfaceC49405tj1<AbstractC48686sW1> {

    /* renamed from: a */
    public final Z94<Boolean> f99145a;

    /* renamed from: b */
    public final Z94<C36502Ux2> f99146b;

    /* renamed from: c */
    public final Z94<V36> f99147c;

    public C45404my0(Z94<Boolean> z94, Z94<C36502Ux2> z942, Z94<V36> z943) {
        this.f99145a = z94;
        this.f99146b = z942;
        this.f99147c = z943;
    }

    /* renamed from: a */
    public static C45404my0 m24625a(Z94<Boolean> z94, Z94<C36502Ux2> z942, Z94<V36> z943) {
        return new C45404my0(z94, z942, z943);
    }

    /* renamed from: c */
    public static AbstractC48686sW1 m24623c(boolean z, Z94<C36502Ux2> z94, Z94<V36> z942) {
        return (AbstractC48686sW1) C52272yZ3.m3257d(AbstractC42439hy0.m35444e(z, z94, z942));
    }

    @Override // p000.Z94
    /* renamed from: b */
    public AbstractC48686sW1 get() {
        return m24623c(this.f99145a.get().booleanValue(), this.f99146b, this.f99147c);
    }
}

package p000;
/* renamed from: ZF6 */
/* loaded from: classes3.dex */
public final class ZF6 implements InterfaceC48812sj1<YF6> {

    /* renamed from: a */
    public final Y94<C33468Hy1> f48088a;

    /* renamed from: b */
    public final Y94<C26572ni> f48089b;

    public ZF6(Y94<C33468Hy1> y94, Y94<C26572ni> y942) {
        this.f48088a = y94;
        this.f48089b = y942;
    }

    /* renamed from: a */
    public static ZF6 m73476a(Y94<C33468Hy1> y94, Y94<C26572ni> y942) {
        return new ZF6(y94, y942);
    }

    /* renamed from: c */
    public static YF6 m73474c(C33468Hy1 c33468Hy1, C26572ni c26572ni) {
        return new YF6(c33468Hy1, c26572ni);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public YF6 get() {
        return m73474c(this.f48088a.get(), this.f48089b.get());
    }
}

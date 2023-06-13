package p000;
/* renamed from: nb3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C45770nb3 implements InterfaceC48812sj1<C45177mb3> {

    /* renamed from: a */
    public final Y94<InterfaceC46353oa3> f100170a;

    /* renamed from: b */
    public final Y94<AbstractC48272ro3> f100171b;

    /* renamed from: c */
    public final Y94<AbstractC31868Bc3> f100172c;

    /* renamed from: d */
    public final Y94<AbstractC35144Pc3> f100173d;

    public C45770nb3(Y94<InterfaceC46353oa3> y94, Y94<AbstractC48272ro3> y942, Y94<AbstractC31868Bc3> y943, Y94<AbstractC35144Pc3> y944) {
        this.f100170a = y94;
        this.f100171b = y942;
        this.f100172c = y943;
        this.f100173d = y944;
    }

    /* renamed from: a */
    public static C45770nb3 m23486a(Y94<InterfaceC46353oa3> y94, Y94<AbstractC48272ro3> y942, Y94<AbstractC31868Bc3> y943, Y94<AbstractC35144Pc3> y944) {
        return new C45770nb3(y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static C45177mb3 m23484c(InterfaceC46353oa3 interfaceC46353oa3, AbstractC48272ro3 abstractC48272ro3, AbstractC31868Bc3 abstractC31868Bc3, AbstractC35144Pc3 abstractC35144Pc3) {
        return new C45177mb3(interfaceC46353oa3, abstractC48272ro3, abstractC31868Bc3, abstractC35144Pc3);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C45177mb3 get() {
        return m23484c(this.f100170a.get(), this.f100171b.get(), this.f100172c.get(), this.f100173d.get());
    }
}

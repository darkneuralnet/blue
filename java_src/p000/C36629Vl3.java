package p000;
/* renamed from: Vl3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C36629Vl3 implements InterfaceC48812sj1<C36395Ul3> {

    /* renamed from: a */
    public final Y94<InterfaceC1880Ea> f39723a;

    /* renamed from: b */
    public final Y94<InterfaceC12495bn> f39724b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f39725c;

    public C36629Vl3(Y94<InterfaceC1880Ea> y94, Y94<InterfaceC12495bn> y942, Y94<C36207Tq4> y943) {
        this.f39723a = y94;
        this.f39724b = y942;
        this.f39725c = y943;
    }

    /* renamed from: a */
    public static C36629Vl3 m79450a(Y94<InterfaceC1880Ea> y94, Y94<InterfaceC12495bn> y942, Y94<C36207Tq4> y943) {
        return new C36629Vl3(y94, y942, y943);
    }

    /* renamed from: c */
    public static C36395Ul3 m79448c(InterfaceC1880Ea interfaceC1880Ea, InterfaceC12495bn interfaceC12495bn, C36207Tq4 c36207Tq4) {
        return new C36395Ul3(interfaceC1880Ea, interfaceC12495bn, c36207Tq4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C36395Ul3 get() {
        return m79448c(this.f39723a.get(), this.f39724b.get(), this.f39725c.get());
    }
}

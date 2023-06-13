package p000;
/* renamed from: m21  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44851m21 implements InterfaceC48812sj1<C44258l21> {

    /* renamed from: a */
    public final Y94<C22454gl> f97208a;

    /* renamed from: b */
    public final Y94<C36207Tq4> f97209b;

    public C44851m21(Y94<C22454gl> y94, Y94<C36207Tq4> y942) {
        this.f97208a = y94;
        this.f97209b = y942;
    }

    /* renamed from: a */
    public static C44851m21 m26462a(Y94<C22454gl> y94, Y94<C36207Tq4> y942) {
        return new C44851m21(y94, y942);
    }

    /* renamed from: c */
    public static C44258l21 m26460c(C22454gl c22454gl, C36207Tq4 c36207Tq4) {
        return new C44258l21(c22454gl, c36207Tq4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C44258l21 get() {
        return m26460c(this.f97208a.get(), this.f97209b.get());
    }
}

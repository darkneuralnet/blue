package p000;
/* renamed from: nm3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45880nm3 implements InterfaceC48812sj1<C45287mm3> {

    /* renamed from: a */
    public final Y94<C22454gl> f100490a;

    /* renamed from: b */
    public final Y94<InterfaceC44647lh6> f100491b;

    /* renamed from: c */
    public final Y94<InterfaceC40099e13> f100492c;

    public C45880nm3(Y94<C22454gl> y94, Y94<InterfaceC44647lh6> y942, Y94<InterfaceC40099e13> y943) {
        this.f100490a = y94;
        this.f100491b = y942;
        this.f100492c = y943;
    }

    /* renamed from: a */
    public static C45880nm3 m23180a(Y94<C22454gl> y94, Y94<InterfaceC44647lh6> y942, Y94<InterfaceC40099e13> y943) {
        return new C45880nm3(y94, y942, y943);
    }

    /* renamed from: c */
    public static C45287mm3 m23178c(C22454gl c22454gl, InterfaceC44647lh6 interfaceC44647lh6, InterfaceC40099e13 interfaceC40099e13) {
        return new C45287mm3(c22454gl, interfaceC44647lh6, interfaceC40099e13);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C45287mm3 get() {
        return m23178c(this.f100490a.get(), this.f100491b.get(), this.f100492c.get());
    }
}

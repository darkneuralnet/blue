package p000;
/* renamed from: ni3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C45840ni3 implements InterfaceC48812sj1<C45247mi3> {

    /* renamed from: a */
    public final Y94<C22454gl> f100370a;

    /* renamed from: b */
    public final Y94<InterfaceC46473om3> f100371b;

    /* renamed from: c */
    public final Y94<InterfaceC35660Rh6> f100372c;

    /* renamed from: d */
    public final Y94<C36207Tq4> f100373d;

    public C45840ni3(Y94<C22454gl> y94, Y94<InterfaceC46473om3> y942, Y94<InterfaceC35660Rh6> y943, Y94<C36207Tq4> y944) {
        this.f100370a = y94;
        this.f100371b = y942;
        this.f100372c = y943;
        this.f100373d = y944;
    }

    /* renamed from: a */
    public static C45840ni3 m23282a(Y94<C22454gl> y94, Y94<InterfaceC46473om3> y942, Y94<InterfaceC35660Rh6> y943, Y94<C36207Tq4> y944) {
        return new C45840ni3(y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static C45247mi3 m23280c(C22454gl c22454gl, InterfaceC46473om3 interfaceC46473om3, InterfaceC35660Rh6 interfaceC35660Rh6, C36207Tq4 c36207Tq4) {
        return new C45247mi3(c22454gl, interfaceC46473om3, interfaceC35660Rh6, c36207Tq4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C45247mi3 get() {
        return m23280c(this.f100370a.get(), this.f100371b.get(), this.f100372c.get(), this.f100373d.get());
    }
}

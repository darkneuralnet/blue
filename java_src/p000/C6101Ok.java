package p000;
/* renamed from: Ok */
/* loaded from: classes4.dex */
public final class C6101Ok implements InterfaceC48812sj1<C36207Tq4> {

    /* renamed from: a */
    public final C22711hj f27158a;

    /* renamed from: b */
    public final Y94<C22454gl> f27159b;

    /* renamed from: c */
    public final Y94<C51174wi2> f27160c;

    public C6101Ok(C22711hj c22711hj, Y94<C22454gl> y94, Y94<C51174wi2> y942) {
        this.f27158a = c22711hj;
        this.f27159b = y94;
        this.f27160c = y942;
    }

    /* renamed from: a */
    public static C6101Ok m91601a(C22711hj c22711hj, Y94<C22454gl> y94, Y94<C51174wi2> y942) {
        return new C6101Ok(c22711hj, y94, y942);
    }

    /* renamed from: c */
    public static C36207Tq4 m91599c(C22711hj c22711hj, C22454gl c22454gl, C51174wi2 c51174wi2) {
        return (C36207Tq4) C51679xZ3.m5002e(c22711hj.m36041I0(c22454gl, c51174wi2));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C36207Tq4 get() {
        return m91599c(this.f27158a, this.f27159b.get(), this.f27160c.get());
    }
}

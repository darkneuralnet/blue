package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: xd4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51719xd4 implements InterfaceC48812sj1<C51126wd4> {

    /* renamed from: a */
    public final Y94<ScopeProvider> f117908a;

    /* renamed from: b */
    public final Y94<C52312yd4> f117909b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f117910c;

    /* renamed from: d */
    public final Y94<InterfaceC37520Zg3> f117911d;

    /* renamed from: e */
    public final Y94<InterfaceC42586iD1> f117912e;

    public C51719xd4(Y94<ScopeProvider> y94, Y94<C52312yd4> y942, Y94<C36207Tq4> y943, Y94<InterfaceC37520Zg3> y944, Y94<InterfaceC42586iD1> y945) {
        this.f117908a = y94;
        this.f117909b = y942;
        this.f117910c = y943;
        this.f117911d = y944;
        this.f117912e = y945;
    }

    /* renamed from: a */
    public static C51719xd4 m4920a(Y94<ScopeProvider> y94, Y94<C52312yd4> y942, Y94<C36207Tq4> y943, Y94<InterfaceC37520Zg3> y944, Y94<InterfaceC42586iD1> y945) {
        return new C51719xd4(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static C51126wd4 m4918c(ScopeProvider scopeProvider, C52312yd4 c52312yd4, C36207Tq4 c36207Tq4, InterfaceC37520Zg3 interfaceC37520Zg3, InterfaceC42586iD1 interfaceC42586iD1) {
        return new C51126wd4(scopeProvider, c52312yd4, c36207Tq4, interfaceC37520Zg3, interfaceC42586iD1);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C51126wd4 get() {
        return m4918c(this.f117908a.get(), this.f117909b.get(), this.f117910c.get(), this.f117911d.get(), this.f117912e.get());
    }
}

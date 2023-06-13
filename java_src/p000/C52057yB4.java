package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: yB4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52057yB4 implements InterfaceC48812sj1<C50871wB4> {

    /* renamed from: a */
    public final Y94<InterfaceC10636aM> f118927a;

    /* renamed from: b */
    public final Y94<C36207Tq4> f118928b;

    /* renamed from: c */
    public final Y94<ScopeProvider> f118929c;

    /* renamed from: d */
    public final Y94<InterfaceC52650zB4> f118930d;

    /* renamed from: e */
    public final Y94<InterfaceC40099e13> f118931e;

    /* renamed from: f */
    public final Y94<FA4> f118932f;

    /* renamed from: g */
    public final Y94<InterfaceC47926rD4> f118933g;

    /* renamed from: h */
    public final Y94<C22454gl> f118934h;

    public C52057yB4(Y94<InterfaceC10636aM> y94, Y94<C36207Tq4> y942, Y94<ScopeProvider> y943, Y94<InterfaceC52650zB4> y944, Y94<InterfaceC40099e13> y945, Y94<FA4> y946, Y94<InterfaceC47926rD4> y947, Y94<C22454gl> y948) {
        this.f118927a = y94;
        this.f118928b = y942;
        this.f118929c = y943;
        this.f118930d = y944;
        this.f118931e = y945;
        this.f118932f = y946;
        this.f118933g = y947;
        this.f118934h = y948;
    }

    /* renamed from: a */
    public static C52057yB4 m3876a(Y94<InterfaceC10636aM> y94, Y94<C36207Tq4> y942, Y94<ScopeProvider> y943, Y94<InterfaceC52650zB4> y944, Y94<InterfaceC40099e13> y945, Y94<FA4> y946, Y94<InterfaceC47926rD4> y947, Y94<C22454gl> y948) {
        return new C52057yB4(y94, y942, y943, y944, y945, y946, y947, y948);
    }

    /* renamed from: c */
    public static C50871wB4 m3874c(InterfaceC10636aM interfaceC10636aM, C36207Tq4 c36207Tq4, ScopeProvider scopeProvider, InterfaceC52650zB4 interfaceC52650zB4, InterfaceC40099e13 interfaceC40099e13, FA4 fa4, InterfaceC47926rD4 interfaceC47926rD4, C22454gl c22454gl) {
        return new C50871wB4(interfaceC10636aM, c36207Tq4, scopeProvider, interfaceC52650zB4, interfaceC40099e13, fa4, interfaceC47926rD4, c22454gl);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C50871wB4 get() {
        return m3874c(this.f118927a.get(), this.f118928b.get(), this.f118929c.get(), this.f118930d.get(), this.f118931e.get(), this.f118932f.get(), this.f118933g.get(), this.f118934h.get());
    }
}

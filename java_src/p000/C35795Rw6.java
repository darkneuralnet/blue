package p000;

import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: Rw6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C35795Rw6 {

    /* renamed from: a */
    public final Y94<InterfaceC20340fF> f32923a;

    /* renamed from: b */
    public final Y94<InterfaceC27246pJ> f32924b;

    /* renamed from: c */
    public final Y94<InterfaceC51791xk6> f32925c;

    /* renamed from: d */
    public final Y94<InterfaceC1880Ea> f32926d;

    public C35795Rw6(Y94<InterfaceC20340fF> y94, Y94<InterfaceC27246pJ> y942, Y94<InterfaceC51791xk6> y943, Y94<InterfaceC1880Ea> y944) {
        this.f32923a = y94;
        this.f32924b = y942;
        this.f32925c = y943;
        this.f32926d = y944;
    }

    /* renamed from: a */
    public static C35795Rw6 m86184a(Y94<InterfaceC20340fF> y94, Y94<InterfaceC27246pJ> y942, Y94<InterfaceC51791xk6> y943, Y94<InterfaceC1880Ea> y944) {
        return new C35795Rw6(y94, y942, y943, y944);
    }

    /* renamed from: c */
    public static C34157Kw6 m86182c(InterfaceC20340fF interfaceC20340fF, InterfaceC27246pJ interfaceC27246pJ, InterfaceC51791xk6 interfaceC51791xk6, InterfaceC1880Ea interfaceC1880Ea, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC40099e13 interfaceC40099e13, InterfaceC36029Sw6 interfaceC36029Sw6) {
        return new C34157Kw6(interfaceC20340fF, interfaceC27246pJ, interfaceC51791xk6, interfaceC1880Ea, lifecycleScopeProvider, interfaceC40099e13, interfaceC36029Sw6);
    }

    /* renamed from: b */
    public C34157Kw6 m86183b(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC40099e13 interfaceC40099e13, InterfaceC36029Sw6 interfaceC36029Sw6) {
        return m86182c(this.f32923a.get(), this.f32924b.get(), this.f32925c.get(), this.f32926d.get(), lifecycleScopeProvider, interfaceC40099e13, interfaceC36029Sw6);
    }
}

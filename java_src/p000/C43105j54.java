package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: j54  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C43105j54 {

    /* renamed from: a */
    public final Y94<InterfaceC1880Ea> f92126a;

    /* renamed from: b */
    public final Y94<InterfaceC20792gH> f92127b;

    /* renamed from: c */
    public final Y94<InterfaceC27246pJ> f92128c;

    public C43105j54(Y94<InterfaceC1880Ea> y94, Y94<InterfaceC20792gH> y942, Y94<InterfaceC27246pJ> y943) {
        this.f92126a = y94;
        this.f92127b = y942;
        this.f92128c = y943;
    }

    /* renamed from: a */
    public static C43105j54 m31142a(Y94<InterfaceC1880Ea> y94, Y94<InterfaceC20792gH> y942, Y94<InterfaceC27246pJ> y943) {
        return new C43105j54(y94, y942, y943);
    }

    /* renamed from: c */
    public static C41326g54 m31140c(InterfaceC1880Ea interfaceC1880Ea, InterfaceC20792gH interfaceC20792gH, InterfaceC27246pJ interfaceC27246pJ, ScopeProvider scopeProvider, InterfaceC45477n54 interfaceC45477n54) {
        return new C41326g54(interfaceC1880Ea, interfaceC20792gH, interfaceC27246pJ, scopeProvider, interfaceC45477n54);
    }

    /* renamed from: b */
    public C41326g54 m31141b(ScopeProvider scopeProvider, InterfaceC45477n54 interfaceC45477n54) {
        return m31140c(this.f92126a.get(), this.f92127b.get(), this.f92128c.get(), scopeProvider, interfaceC45477n54);
    }
}

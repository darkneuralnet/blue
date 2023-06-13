package p000;
/* renamed from: qM6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C47416qM6<T> implements InterfaceC50972wM6<T> {

    /* renamed from: a */
    public InterfaceC50972wM6<T> f105196a;

    /* renamed from: b */
    public static <T> void m17586b(InterfaceC50972wM6<T> interfaceC50972wM6, InterfaceC50972wM6<T> interfaceC50972wM62) {
        C46814pL6.m19449j(interfaceC50972wM62);
        C47416qM6 c47416qM6 = (C47416qM6) interfaceC50972wM6;
        if (c47416qM6.f105196a != null) {
            throw new IllegalStateException();
        }
        c47416qM6.f105196a = interfaceC50972wM62;
    }

    @Override // p000.InterfaceC50972wM6
    /* renamed from: a */
    public final T mo6967a() {
        InterfaceC50972wM6<T> interfaceC50972wM6 = this.f105196a;
        if (interfaceC50972wM6 != null) {
            return interfaceC50972wM6.mo6967a();
        }
        throw new IllegalStateException();
    }
}

package p000;
/* renamed from: Jb7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33735Jb7 implements InterfaceC35607Rb7 {

    /* renamed from: a */
    public final InterfaceC35607Rb7[] f17895a;

    public C33735Jb7(InterfaceC35607Rb7... interfaceC35607Rb7Arr) {
        this.f17895a = interfaceC35607Rb7Arr;
    }

    @Override // p000.InterfaceC35607Rb7
    /* renamed from: a */
    public final InterfaceC35373Qb7 mo72912a(Class cls) {
        InterfaceC35607Rb7[] interfaceC35607Rb7Arr = this.f17895a;
        for (int i = 0; i < 2; i++) {
            InterfaceC35607Rb7 interfaceC35607Rb7 = interfaceC35607Rb7Arr[i];
            if (interfaceC35607Rb7.mo72911b(cls)) {
                return interfaceC35607Rb7.mo72912a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // p000.InterfaceC35607Rb7
    /* renamed from: b */
    public final boolean mo72911b(Class cls) {
        InterfaceC35607Rb7[] interfaceC35607Rb7Arr = this.f17895a;
        for (int i = 0; i < 2; i++) {
            if (interfaceC35607Rb7Arr[i].mo72911b(cls)) {
                return true;
            }
        }
        return false;
    }
}

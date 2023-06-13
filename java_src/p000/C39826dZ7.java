package p000;
/* renamed from: dZ7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39826dZ7 extends AbstractC44551lX7 {
    private C39826dZ7() {
        super();
    }

    /* renamed from: e */
    public static <E> InterfaceC47489qU7<E> m44119e(Object obj, long j) {
        return (InterfaceC47489qU7) C35410Qf8.m88254M(obj, j);
    }

    @Override // p000.AbstractC44551lX7
    /* renamed from: a */
    public final void mo27170a(Object obj, long j) {
        m44119e(obj, j).zzv();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    @Override // p000.AbstractC44551lX7
    /* renamed from: b */
    public final <E> void mo27169b(Object obj, Object obj2, long j) {
        InterfaceC47489qU7<E> m44119e = m44119e(obj, j);
        InterfaceC47489qU7<E> m44119e2 = m44119e(obj2, j);
        int size = m44119e.size();
        int size2 = m44119e2.size();
        InterfaceC47489qU7<E> interfaceC47489qU7 = m44119e;
        interfaceC47489qU7 = m44119e;
        if (size > 0 && size2 > 0) {
            boolean mo17485i = m44119e.mo17485i();
            InterfaceC47489qU7<E> interfaceC47489qU72 = m44119e;
            if (!mo17485i) {
                interfaceC47489qU72 = m44119e.mo1502n(size2 + size);
            }
            interfaceC47489qU72.addAll(m44119e2);
            interfaceC47489qU7 = interfaceC47489qU72;
        }
        if (size > 0) {
            m44119e2 = interfaceC47489qU7;
        }
        C35410Qf8.m88237i(obj, j, m44119e2);
    }
}

package p000;
/* renamed from: fg8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41081fg8 extends AbstractC49975ug8 {
    public /* synthetic */ C41081fg8(C31900Bf8 c31900Bf8) {
        super(null);
    }

    @Override // p000.AbstractC49975ug8
    /* renamed from: a */
    public final void mo9882a(Object obj, long j) {
        ((InterfaceC35383Qc8) C38229at8.m65316f(obj, j)).zzb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    @Override // p000.AbstractC49975ug8
    /* renamed from: b */
    public final <E> void mo9881b(Object obj, Object obj2, long j) {
        InterfaceC35383Qc8<E> interfaceC35383Qc8 = (InterfaceC35383Qc8) C38229at8.m65316f(obj, j);
        InterfaceC35383Qc8<E> interfaceC35383Qc82 = (InterfaceC35383Qc8) C38229at8.m65316f(obj2, j);
        int size = interfaceC35383Qc8.size();
        int size2 = interfaceC35383Qc82.size();
        InterfaceC35383Qc8<E> interfaceC35383Qc83 = interfaceC35383Qc8;
        interfaceC35383Qc83 = interfaceC35383Qc8;
        if (size > 0 && size2 > 0) {
            boolean zzc = interfaceC35383Qc8.zzc();
            InterfaceC35383Qc8<E> interfaceC35383Qc84 = interfaceC35383Qc8;
            if (!zzc) {
                interfaceC35383Qc84 = interfaceC35383Qc8.mo41068d(size2 + size);
            }
            interfaceC35383Qc84.addAll(interfaceC35383Qc82);
            interfaceC35383Qc83 = interfaceC35383Qc84;
        }
        if (size > 0) {
            interfaceC35383Qc82 = interfaceC35383Qc83;
        }
        C38229at8.m65306p(obj, j, interfaceC35383Qc82);
    }

    private C41081fg8() {
        super(null);
    }
}

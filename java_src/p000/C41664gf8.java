package p000;
/* renamed from: gf8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41664gf8 extends AbstractC33772Jf8 {
    public /* synthetic */ C41664gf8(C37264Yd8 c37264Yd8) {
        super(null);
    }

    @Override // p000.AbstractC33772Jf8
    /* renamed from: a */
    public final void mo37920a(Object obj, long j) {
        ((InterfaceC47544qa8) C37192Xv8.m76068k(obj, j)).zzb();
    }

    @Override // p000.AbstractC33772Jf8
    /* renamed from: b */
    public final void mo37919b(Object obj, Object obj2, long j) {
        InterfaceC47544qa8 interfaceC47544qa8 = (InterfaceC47544qa8) C37192Xv8.m76068k(obj, j);
        InterfaceC47544qa8 interfaceC47544qa82 = (InterfaceC47544qa8) C37192Xv8.m76068k(obj2, j);
        int size = interfaceC47544qa8.size();
        int size2 = interfaceC47544qa82.size();
        if (size > 0 && size2 > 0) {
            if (!interfaceC47544qa8.zzc()) {
                interfaceC47544qa8 = interfaceC47544qa8.mo17376d(size2 + size);
            }
            interfaceC47544qa8.addAll(interfaceC47544qa82);
        }
        if (size > 0) {
            interfaceC47544qa82 = interfaceC47544qa8;
        }
        C37192Xv8.m76055x(obj, j, interfaceC47544qa82);
    }

    private C41664gf8() {
        super(null);
    }
}

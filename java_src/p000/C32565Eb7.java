package p000;
/* renamed from: Eb7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32565Eb7 extends AbstractC33033Gb7 {
    public /* synthetic */ C32565Eb7(C32331Db7 c32331Db7) {
        super(null);
    }

    @Override // p000.AbstractC33033Gb7
    /* renamed from: a */
    public final void mo104978a(Object obj, long j) {
        ((InterfaceC46367ob7) C34212Lc7.m96567k(obj, j)).zbb();
    }

    @Override // p000.AbstractC33033Gb7
    /* renamed from: b */
    public final void mo104977b(Object obj, Object obj2, long j) {
        InterfaceC46367ob7 interfaceC46367ob7 = (InterfaceC46367ob7) C34212Lc7.m96567k(obj, j);
        InterfaceC46367ob7 interfaceC46367ob72 = (InterfaceC46367ob7) C34212Lc7.m96567k(obj2, j);
        int size = interfaceC46367ob7.size();
        int size2 = interfaceC46367ob72.size();
        if (size > 0 && size2 > 0) {
            if (!interfaceC46367ob7.zbc()) {
                interfaceC46367ob7 = interfaceC46367ob7.mo1043r0(size2 + size);
            }
            interfaceC46367ob7.addAll(interfaceC46367ob72);
        }
        if (size > 0) {
            interfaceC46367ob72 = interfaceC46367ob7;
        }
        C34212Lc7.m96554x(obj, j, interfaceC46367ob72);
    }

    private C32565Eb7() {
        super(null);
    }
}

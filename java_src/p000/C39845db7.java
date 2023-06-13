package p000;
/* renamed from: db7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39845db7 implements InterfaceC35832Sa7 {

    /* renamed from: b */
    public final int f76866b = 32149011;

    /* renamed from: c */
    public final EnumC35616Rc7 f76867c;

    public C39845db7(InterfaceC42809ib7 interfaceC42809ib7, int i, EnumC35616Rc7 enumC35616Rc7, boolean z, boolean z2) {
        this.f76867c = enumC35616Rc7;
    }

    @Override // p000.InterfaceC35832Sa7
    /* renamed from: B */
    public final EnumC35850Sc7 mo44033B() {
        return this.f76867c.m86544a();
    }

    @Override // p000.InterfaceC35832Sa7
    /* renamed from: Q0 */
    public final InterfaceC38651bc7 mo44032Q0(InterfaceC38651bc7 interfaceC38651bc7, InterfaceC38651bc7 interfaceC38651bc72) {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        int i = ((C39845db7) obj).f76866b;
        return 0;
    }

    @Override // p000.InterfaceC35832Sa7
    /* renamed from: i0 */
    public final boolean mo44031i0() {
        return false;
    }

    @Override // p000.InterfaceC35832Sa7
    /* renamed from: n0 */
    public final boolean mo44030n0() {
        return false;
    }

    @Override // p000.InterfaceC35832Sa7
    /* renamed from: x3 */
    public final InterfaceC35841Sb7 mo44029x3(InterfaceC35841Sb7 interfaceC35841Sb7, InterfaceC36075Tb7 interfaceC36075Tb7) {
        ((C38048ab7) interfaceC35841Sb7).m71107n((AbstractC41030fb7) interfaceC36075Tb7);
        return interfaceC35841Sb7;
    }

    @Override // p000.InterfaceC35832Sa7
    /* renamed from: y */
    public final int mo44028y() {
        return 32149011;
    }

    @Override // p000.InterfaceC35832Sa7
    public final EnumC35616Rc7 zbd() {
        return this.f76867c;
    }
}

package p000;

import p000.C46610p01;
/* renamed from: Y31 */
/* loaded from: classes.dex */
public class Y31 extends C46610p01 {

    /* renamed from: m */
    public int f44482m;

    public Y31(AbstractC41387gB6 abstractC41387gB6) {
        super(abstractC41387gB6);
        if (abstractC41387gB6 instanceof C40304eN1) {
            this.f102905e = C46610p01.EnumC27118a.HORIZONTAL_DIMENSION;
        } else {
            this.f102905e = C46610p01.EnumC27118a.VERTICAL_DIMENSION;
        }
    }

    @Override // p000.C46610p01
    /* renamed from: d */
    public void mo20170d(int i) {
        if (this.f102910j) {
            return;
        }
        this.f102910j = true;
        this.f102907g = i;
        for (InterfaceC44238l01 interfaceC44238l01 : this.f102911k) {
            interfaceC44238l01.mo5649a(interfaceC44238l01);
        }
    }
}

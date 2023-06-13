package p000;
/* renamed from: bb7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C38641bb7 extends C38048ab7 implements InterfaceC36309Ub7 {
    public C38641bb7(AbstractC39234cb7 abstractC39234cb7) {
        super(abstractC39234cb7);
    }

    @Override // p000.C38048ab7
    /* renamed from: r */
    public final void mo64286r() {
        super.mo64286r();
        if (((AbstractC39234cb7) this.f50703c).zbb != C36066Ta7.m83378e()) {
            AbstractC39234cb7 abstractC39234cb7 = (AbstractC39234cb7) this.f50703c;
            abstractC39234cb7.zbb = abstractC39234cb7.zbb.clone();
        }
    }

    @Override // p000.C38048ab7, p000.InterfaceC35841Sb7
    /* renamed from: t */
    public final AbstractC39234cb7 mo64284u1() {
        if (!((AbstractC39234cb7) this.f50703c).m41132o()) {
            return (AbstractC39234cb7) this.f50703c;
        }
        ((AbstractC39234cb7) this.f50703c).zbb.m83375h();
        return (AbstractC39234cb7) super.mo64284u1();
    }
}

package p000;
/* renamed from: au7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C38238au7 extends C37641Zt7 implements InterfaceC41823gv7 {
    public C38238au7(AbstractC38831bu7 abstractC38831bu7) {
        super(abstractC38831bu7);
    }

    @Override // p000.C37641Zt7
    /* renamed from: o */
    public final void mo65288o() {
        super.mo65288o();
        AbstractC38831bu7 abstractC38831bu7 = (AbstractC38831bu7) this.f49451c;
        abstractC38831bu7.zzb = abstractC38831bu7.zzb.clone();
    }

    @Override // p000.C37641Zt7, p000.InterfaceC40637ev7
    /* renamed from: p */
    public final AbstractC38831bu7 zzv() {
        if (this.f49452d) {
            return (AbstractC38831bu7) this.f49451c;
        }
        ((AbstractC38831bu7) this.f49451c).zzb.m108241i();
        return (AbstractC38831bu7) super.zzv();
    }
}

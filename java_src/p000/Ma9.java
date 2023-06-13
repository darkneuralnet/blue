package p000;
/* renamed from: Ma9 */
/* loaded from: classes5.dex */
public class Ma9 extends Fa9 implements InterfaceC51161wg9 {
    public Ma9(Ta9 ta9) {
        super(ta9);
    }

    @Override // p000.Fa9
    /* renamed from: o */
    public final void mo95153o() {
        super.mo95153o();
        Ta9 ta9 = (Ta9) this.f9743c;
        ta9.zzb = ta9.zzb.clone();
    }

    @Override // p000.Fa9, p000.InterfaceC42861ig9
    /* renamed from: p */
    public final Ta9 zzs() {
        if (this.f9744d) {
            return (Ta9) this.f9743c;
        }
        ((Ta9) this.f9743c).zzb.m44104h();
        return (Ta9) super.zzs();
    }
}

package p000;

import android.util.Range;
import p000.InterfaceC44592lc1;
/* renamed from: Cp */
/* loaded from: classes.dex */
public final class C1188Cp implements ZU5<AbstractC0749Bp> {

    /* renamed from: a */
    public final AbstractC2481Fp f4744a;

    /* renamed from: b */
    public final InterfaceC44592lc1.AbstractC25737a f4745b;

    public C1188Cp(AbstractC2481Fp abstractC2481Fp, InterfaceC44592lc1.AbstractC25737a abstractC25737a) {
        this.f4744a = abstractC2481Fp;
        this.f4745b = abstractC25737a;
    }

    @Override // p000.ZU5
    /* renamed from: a */
    public AbstractC0749Bp get() {
        int m4596e = C30318xp.m4596e(this.f4744a);
        int m4595f = C30318xp.m4595f(this.f4744a);
        int mo40601c = this.f4744a.mo40601c();
        Range<Integer> mo40600d = this.f4744a.mo40600d();
        int mo7873c = this.f4745b.mo7873c();
        if (mo40601c == -1) {
            C33928Jx2.m99533a("AudioSrcAdPrflRslvr", "Resolved AUDIO channel count from AudioProfile: " + mo7873c);
            mo40601c = mo7873c;
        } else {
            C33928Jx2.m99533a("AudioSrcAdPrflRslvr", "Media spec AUDIO channel count overrides AudioProfile [AudioProfile channel count: " + mo7873c + ", Resolved Channel Count: " + mo40601c + "]");
        }
        int mo7869g = this.f4745b.mo7869g();
        int m4594g = C30318xp.m4594g(mo40600d, mo40601c, m4595f, mo7869g);
        C33928Jx2.m99533a("AudioSrcAdPrflRslvr", "Using resolved AUDIO sample rate or nearest supported from AudioProfile: " + m4594g + "Hz. [AudioProfile sample rate: " + mo7869g + "Hz]");
        return AbstractC0749Bp.m113457a().mo42457d(m4596e).mo42458c(m4595f).mo42456e(mo40601c).mo42455f(m4594g).m113456b();
    }
}

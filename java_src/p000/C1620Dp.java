package p000;

import android.util.Range;
/* renamed from: Dp */
/* loaded from: classes.dex */
public final class C1620Dp implements ZU5<AbstractC0749Bp> {

    /* renamed from: a */
    public final AbstractC2481Fp f6382a;

    public C1620Dp(AbstractC2481Fp abstractC2481Fp) {
        this.f6382a = abstractC2481Fp;
    }

    @Override // p000.ZU5
    /* renamed from: a */
    public AbstractC0749Bp get() {
        int m4594g;
        int m4596e = C30318xp.m4596e(this.f6382a);
        int m4595f = C30318xp.m4595f(this.f6382a);
        int mo40601c = this.f6382a.mo40601c();
        if (mo40601c == -1) {
            C33928Jx2.m99533a("DefAudioResolver", "Using fallback AUDIO channel count: 1");
            mo40601c = 1;
        } else {
            C33928Jx2.m99533a("DefAudioResolver", "Using supplied AUDIO channel count: " + mo40601c);
        }
        Range<Integer> mo40600d = this.f6382a.mo40600d();
        if (AbstractC2481Fp.f10268b.equals(mo40600d)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Using fallback AUDIO sample rate: ");
            m4594g = 44100;
            sb.append(44100);
            sb.append("Hz");
            C33928Jx2.m99533a("DefAudioResolver", sb.toString());
        } else {
            m4594g = C30318xp.m4594g(mo40600d, mo40601c, m4595f, mo40600d.getUpper().intValue());
            C33928Jx2.m99533a("DefAudioResolver", "Using AUDIO sample rate resolved from AudioSpec: " + m4594g + "Hz");
        }
        return AbstractC0749Bp.m113457a().mo42457d(m4596e).mo42458c(m4595f).mo42456e(mo40601c).mo42455f(m4594g).m113456b();
    }
}

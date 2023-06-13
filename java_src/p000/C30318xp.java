package p000;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import p000.AbstractC45112mU2;
import p000.InterfaceC44592lc1;
/* renamed from: xp */
/* loaded from: classes.dex */
public final class C30318xp {
    private C30318xp() {
    }

    /* renamed from: b */
    public static /* synthetic */ int m4599b(int i, Integer num, Integer num2) {
        float signum;
        int abs = Math.abs(num.intValue() - i) - Math.abs(num2.intValue() - i);
        if (abs == 0) {
            signum = Math.signum(num.intValue() - num2.intValue());
        } else {
            signum = Math.signum(abs);
        }
        return (int) signum;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d5  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AbstractC45112mU2 m4598c(FP2 fp2, AbstractC52434yp6 abstractC52434yp6) {
        boolean z;
        String m107254e = FP2.m107254e(fp2.mo91219c());
        int m107253f = FP2.m107253f(fp2.mo91219c());
        if (abstractC52434yp6 != null && abstractC52434yp6.mo2520g() != null) {
            InterfaceC44592lc1.AbstractC25737a mo2520g = abstractC52434yp6.mo2520g();
            String mo7871e = mo2520g.mo7871e();
            int mo7870f = mo2520g.mo7870f();
            if (Objects.equals(mo7871e, "audio/none")) {
                C33928Jx2.m99533a("AudioConfigUtil", "EncoderProfiles contains undefined AUDIO mime type so cannot be used. May rely on fallback defaults to derive settings [chosen mime type: " + m107254e + "(profile: " + m107253f + ")]");
            } else {
                z = true;
                if (fp2.mo91219c() == -1) {
                    C33928Jx2.m99533a("AudioConfigUtil", "MediaSpec contains OUTPUT_FORMAT_AUTO. Using EncoderProfiles to derive AUDIO settings [mime type: " + mo7871e + "(profile: " + mo7870f + ")]");
                    m107253f = mo7870f;
                } else if (Objects.equals(m107254e, mo7871e) && m107253f == mo7870f) {
                    C33928Jx2.m99533a("AudioConfigUtil", "MediaSpec audio mime/profile matches EncoderProfiles. Using EncoderProfiles to derive AUDIO settings [mime type: " + mo7871e + "(profile: " + m107253f + ")]");
                } else {
                    C33928Jx2.m99533a("AudioConfigUtil", "MediaSpec audio mime or profile does not match EncoderProfiles, so EncoderProfiles settings cannot be used. May rely on fallback defaults to derive AUDIO settings [EncoderProfiles mime type: " + mo7871e + "(profile: " + mo7870f + "), chosen mime type: " + m107254e + "(profile: " + m107253f + ")]");
                }
                m107254e = mo7871e;
                AbstractC45112mU2.AbstractC26107a mo25525c = AbstractC45112mU2.m25531a(m107254e).mo25525c(m107253f);
                if (z) {
                    mo25525c.mo25526b(abstractC52434yp6);
                }
                return mo25525c.mo25527a();
            }
        }
        z = false;
        AbstractC45112mU2.AbstractC26107a mo25525c2 = AbstractC45112mU2.m25531a(m107254e).mo25525c(m107253f);
        if (z) {
        }
        return mo25525c2.mo25527a();
    }

    /* renamed from: d */
    public static AbstractC0749Bp m4597d(AbstractC45112mU2 abstractC45112mU2, AbstractC2481Fp abstractC2481Fp) {
        ZU5 c1620Dp;
        AbstractC52434yp6 mo25530b = abstractC45112mU2.mo25530b();
        if (mo25530b != null) {
            InterfaceC44592lc1.AbstractC25737a mo2520g = mo25530b.mo2520g();
            Objects.requireNonNull(mo2520g);
            c1620Dp = new C1188Cp(abstractC2481Fp, mo2520g);
        } else {
            c1620Dp = new C1620Dp(abstractC2481Fp);
        }
        return (AbstractC0749Bp) c1620Dp.get();
    }

    /* renamed from: e */
    public static int m4596e(AbstractC2481Fp abstractC2481Fp) {
        int mo40599e = abstractC2481Fp.mo40599e();
        if (mo40599e == -1) {
            C33928Jx2.m99533a("AudioConfigUtil", "Using default AUDIO source: 5");
            return 5;
        }
        C33928Jx2.m99533a("AudioConfigUtil", "Using provided AUDIO source: " + mo40599e);
        return mo40599e;
    }

    /* renamed from: f */
    public static int m4595f(AbstractC2481Fp abstractC2481Fp) {
        int mo40598f = abstractC2481Fp.mo40598f();
        if (mo40598f == -1) {
            C33928Jx2.m99533a("AudioConfigUtil", "Using default AUDIO source format: 2");
            return 2;
        }
        C33928Jx2.m99533a("AudioConfigUtil", "Using provided AUDIO source format: " + mo40598f);
        return mo40598f;
    }

    /* renamed from: g */
    public static int m4594g(Range<Integer> range, int i, int i2, final int i3) {
        ArrayList arrayList = null;
        int i4 = 0;
        int i5 = i3;
        while (true) {
            if (range.contains((Range<Integer>) Integer.valueOf(i5))) {
                if (C1995Ep.m108335a(i5, i, i2)) {
                    return i5;
                }
                C33928Jx2.m99533a("AudioConfigUtil", "Sample rate " + i5 + "Hz is not supported by audio source with channel count " + i + " and source format " + i2);
            } else {
                C33928Jx2.m99533a("AudioConfigUtil", "Sample rate " + i5 + "Hz is not in target range " + range);
            }
            if (arrayList == null) {
                C33928Jx2.m99533a("AudioConfigUtil", "Trying common sample rates in proximity order to target " + i3 + "Hz");
                arrayList = new ArrayList(AbstractC0749Bp.f2920a);
                Collections.sort(arrayList, new Comparator() { // from class: wp
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int m4599b;
                        m4599b = C30318xp.m4599b(i3, (Integer) obj, (Integer) obj2);
                        return m4599b;
                    }
                });
            }
            if (i4 < arrayList.size()) {
                i5 = ((Integer) arrayList.get(i4)).intValue();
                i4++;
            } else {
                C33928Jx2.m99533a("AudioConfigUtil", "No sample rate found in target range or supported by audio source. Falling back to default sample rate of 44100Hz");
                return 44100;
            }
        }
    }
}

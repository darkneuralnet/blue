package p000;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.Objects;
import p000.AbstractC45112mU2;
/* renamed from: Zo6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37595Zo6 {
    private C37595Zo6() {
    }

    /* renamed from: a */
    public static int m72479a(Range<Integer> range, int i, Range<Integer> range2) {
        if (range2 != null) {
            try {
                range = range2.intersect(range);
            } catch (IllegalArgumentException unused) {
                if (range.getUpper().intValue() < range2.getLower().intValue()) {
                    return range2.getLower().intValue();
                }
                return range2.getUpper().intValue();
            }
        }
        return range.clamp(Integer.valueOf(i)).intValue();
    }

    /* renamed from: b */
    public static AbstractC39983dp6 m72478b(AbstractC45112mU2 abstractC45112mU2, EnumC47841r46 enumC47841r46, AbstractC51248wp6 abstractC51248wp6, Size size, Range<Integer> range) {
        ZU5 c40576ep6;
        AbstractC52434yp6 mo25530b = abstractC45112mU2.mo25530b();
        if (mo25530b != null) {
            c40576ep6 = new C41169fp6(abstractC45112mU2.mo25529c(), enumC47841r46, abstractC51248wp6, size, mo25530b.mo2519h(), range);
        } else {
            c40576ep6 = new C40576ep6(abstractC45112mU2.mo25529c(), enumC47841r46, abstractC51248wp6, size, range);
        }
        return (AbstractC39983dp6) c40576ep6.get();
    }

    /* renamed from: c */
    public static AbstractC45112mU2 m72477c(FP2 fp2, AbstractC52434yp6 abstractC52434yp6) {
        String m107251h = FP2.m107251h(fp2.mo91219c());
        boolean z = false;
        if (abstractC52434yp6 != null) {
            String mo4513i = abstractC52434yp6.mo2519h().mo4513i();
            if (Objects.equals(mo4513i, "video/none")) {
                C33928Jx2.m99533a("VideoConfigUtil", "EncoderProfiles contains undefined VIDEO mime type so cannot be used. May rely on fallback defaults to derive settings [chosen mime type: " + m107251h + "]");
            } else {
                if (fp2.mo91219c() == -1) {
                    C33928Jx2.m99533a("VideoConfigUtil", "MediaSpec contains OUTPUT_FORMAT_AUTO. Using EncoderProfiles to derive VIDEO settings [mime type: " + mo4513i + "]");
                } else if (Objects.equals(m107251h, mo4513i)) {
                    C33928Jx2.m99533a("VideoConfigUtil", "MediaSpec video mime matches EncoderProfiles. Using EncoderProfiles to derive VIDEO settings [mime type: " + mo4513i + "]");
                } else {
                    C33928Jx2.m99533a("VideoConfigUtil", "MediaSpec video mime does not match EncoderProfiles, so EncoderProfiles settings cannot be used. May rely on fallback defaults to derive VIDEO settings [EncoderProfiles mime type: " + mo4513i + ", chosen mime type: " + m107251h + "]");
                }
                m107251h = mo4513i;
                z = true;
            }
        } else {
            C33928Jx2.m99533a("VideoConfigUtil", "No EncoderProfiles present. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + m107251h + "]");
        }
        AbstractC45112mU2.AbstractC26107a m25531a = AbstractC45112mU2.m25531a(m107251h);
        if (z) {
            m25531a.mo25526b(abstractC52434yp6);
        }
        return m25531a.mo25527a();
    }

    /* renamed from: d */
    public static int m72476d(int i, int i2, int i3, int i4, int i5, int i6, int i7, Range<Integer> range) {
        String str;
        int doubleValue = (int) (i * new Rational(i2, i3).doubleValue() * new Rational(i4, i5).doubleValue() * new Rational(i6, i7).doubleValue());
        if (C33928Jx2.m99528f("VideoConfigUtil")) {
            str = String.format("Base Bitrate(%dbps) * Frame Rate Ratio(%d / %d) * Width Ratio(%d / %d) * Height Ratio(%d / %d) = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(doubleValue));
        } else {
            str = "";
        }
        if (!AbstractC51248wp6.f116609b.equals(range)) {
            doubleValue = range.clamp(Integer.valueOf(doubleValue)).intValue();
            if (C33928Jx2.m99528f("VideoConfigUtil")) {
                str = str + String.format("\nClamped to range %s -> %dbps", range, Integer.valueOf(doubleValue));
            }
        }
        C33928Jx2.m99533a("VideoConfigUtil", str);
        return doubleValue;
    }
}

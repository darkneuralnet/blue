package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bA\u0010BR\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001b\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u0017\u0010!\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010\u0017R\u0017\u0010#\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\"\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010%\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b$\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017R\u0017\u0010(\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b&\u0010\u0015\u001a\u0004\b'\u0010\u0017R\u0017\u0010*\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b'\u0010\u0015\u001a\u0004\b)\u0010\u0017R\u0017\u0010,\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b)\u0010\u0015\u001a\u0004\b+\u0010\u0017R\u0017\u0010.\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b-\u0010\u0017R\u0017\u0010/\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b \u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u00101\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b0\u0010\u0017R\u0017\u00102\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b+\u0010\u0015\u001a\u0004\b\u0011\u0010\u0017R\u0017\u00103\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u00108\u001a\u0002048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b$\u00107R\u0017\u00109\u001a\u0002048\u0006¢\u0006\f\n\u0004\b0\u00106\u001a\u0004\b\"\u00107R\u001a\u0010;\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010\u0015\u001a\u0004\b:\u0010\u0017R\u0017\u0010<\u001a\u0002048\u0006¢\u0006\f\n\u0004\b\u0016\u00106\u001a\u0004\b5\u00107R \u0010@\u001a\b\u0012\u0004\u0012\u0002040=8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010>\u001a\u0004\b&\u0010?¨\u0006C"}, m28432d2 = {"LFm0;", "", "", "b", "[F", "x", "()[F", "SrgbPrimaries", "c", "s", "Ntsc1953Primaries", "Lj96;", DateTokenConverter.CONVERTER_KEY, "Lj96;", "getSrgbTransferParameters$ui_graphics_release", "()Lj96;", "SrgbTransferParameters", "e", "NoneTransferParameters", "LSO4;", "f", "LSO4;", "w", "()LSO4;", "Srgb", "g", "q", "LinearSrgb", "h", "o", "ExtendedSrgb", "i", "p", "LinearExtendedSrgb", "j", "Bt709", "k", "Bt2020", "l", "m", "DciP3", "n", "DisplayP3", "r", "Ntsc1953", "v", "SmpteC", "AdobeRgb", "u", "ProPhotoRgb", "Aces", "Acescg", "LBm0;", "t", "LBm0;", "()LBm0;", "CieXyz", "CieLab", "y", "Unspecified", "Oklab", "", "[LBm0;", "()[LBm0;", "ColorSpacesArray", "<init>", "()V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Fm0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32891Fm0 {

    /* renamed from: a */
    public static final C32891Fm0 f10082a = new C32891Fm0();

    /* renamed from: b */
    public static final float[] f10083b;

    /* renamed from: c */
    public static final float[] f10084c;

    /* renamed from: d */
    public static final C43147j96 f10085d;

    /* renamed from: e */
    public static final C43147j96 f10086e;

    /* renamed from: f */
    public static final SO4 f10087f;

    /* renamed from: g */
    public static final SO4 f10088g;

    /* renamed from: h */
    public static final SO4 f10089h;

    /* renamed from: i */
    public static final SO4 f10090i;

    /* renamed from: j */
    public static final SO4 f10091j;

    /* renamed from: k */
    public static final SO4 f10092k;

    /* renamed from: l */
    public static final SO4 f10093l;

    /* renamed from: m */
    public static final SO4 f10094m;

    /* renamed from: n */
    public static final SO4 f10095n;

    /* renamed from: o */
    public static final SO4 f10096o;

    /* renamed from: p */
    public static final SO4 f10097p;

    /* renamed from: q */
    public static final SO4 f10098q;

    /* renamed from: r */
    public static final SO4 f10099r;

    /* renamed from: s */
    public static final SO4 f10100s;

    /* renamed from: t */
    public static final AbstractC31955Bm0 f10101t;

    /* renamed from: u */
    public static final AbstractC31955Bm0 f10102u;

    /* renamed from: v */
    public static final SO4 f10103v;

    /* renamed from: w */
    public static final AbstractC31955Bm0 f10104w;

    /* renamed from: x */
    public static final AbstractC31955Bm0[] f10105x;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f10083b = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f10084c = fArr2;
        C43147j96 c43147j96 = new C43147j96(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        f10085d = c43147j96;
        C43147j96 c43147j962 = new C43147j96(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        f10086e = c43147j962;
        C51057wW1 c51057wW1 = C51057wW1.f116104a;
        SO4 so4 = new SO4("sRGB IEC61966-2.1", fArr, c51057wW1.m6719e(), c43147j96, 0);
        f10087f = so4;
        SO4 so42 = new SO4("sRGB IEC61966-2.1 (Linear)", fArr, c51057wW1.m6719e(), 1.0d, 0.0f, 1.0f, 1);
        f10088g = so42;
        SO4 so43 = new SO4("scRGB-nl IEC 61966-2-2:2003", fArr, c51057wW1.m6719e(), null, new X51() { // from class: Dm0
            @Override // p000.X51
            /* renamed from: a */
            public final double mo77425a(double d) {
                double m106618c;
                m106618c = C32891Fm0.m106618c(d);
                return m106618c;
            }
        }, new X51() { // from class: Em0
            @Override // p000.X51
            /* renamed from: a */
            public final double mo77425a(double d) {
                double m106617d;
                m106617d = C32891Fm0.m106617d(d);
                return m106617d;
            }
        }, -0.799f, 2.399f, c43147j96, 2);
        f10089h = so43;
        SO4 so44 = new SO4("scRGB IEC 61966-2-2:2003", fArr, c51057wW1.m6719e(), 1.0d, -0.5f, 7.499f, 3);
        f10090i = so44;
        SO4 so45 = new SO4("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, c51057wW1.m6719e(), new C43147j96(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 4);
        f10091j = so45;
        SO4 so46 = new SO4("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, c51057wW1.m6719e(), new C43147j96(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, null), 5);
        f10092k = so46;
        SO4 so47 = new SO4("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new NA6(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f10093l = so47;
        SO4 so48 = new SO4("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, c51057wW1.m6719e(), c43147j96, 7);
        f10094m = so48;
        SO4 so49 = new SO4("NTSC (1953)", fArr2, c51057wW1.m6723a(), new C43147j96(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 8);
        f10095n = so49;
        SO4 so410 = new SO4("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, c51057wW1.m6719e(), new C43147j96(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 9);
        f10096o = so410;
        SO4 so411 = new SO4("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, c51057wW1.m6719e(), 2.2d, 0.0f, 1.0f, 10);
        f10097p = so411;
        SO4 so412 = new SO4("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, c51057wW1.m6722b(), new C43147j96(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, null), 11);
        f10098q = so412;
        SO4 so413 = new SO4("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, c51057wW1.m6720d(), 1.0d, -65504.0f, 65504.0f, 12);
        f10099r = so413;
        SO4 so414 = new SO4("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, c51057wW1.m6720d(), 1.0d, -65504.0f, 65504.0f, 13);
        f10100s = so414;
        ZH6 zh6 = new ZH6("Generic XYZ", 14);
        f10101t = zh6;
        C35692Rl2 c35692Rl2 = new C35692Rl2("Generic L*a*b*", 15);
        f10102u = c35692Rl2;
        SO4 so415 = new SO4("None", fArr, c51057wW1.m6719e(), c43147j962, 16);
        f10103v = so415;
        C35864Se3 c35864Se3 = new C35864Se3("Oklab", 17);
        f10104w = c35864Se3;
        f10105x = new AbstractC31955Bm0[]{so4, so42, so43, so44, so45, so46, so47, so48, so49, so410, so411, so412, so413, so414, zh6, c35692Rl2, so415, c35864Se3};
    }

    private C32891Fm0() {
    }

    /* renamed from: c */
    public static final double m106618c(double d) {
        return C32189Cm0.m111743a(d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    /* renamed from: d */
    public static final double m106617d(double d) {
        return C32189Cm0.m111742b(d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    /* renamed from: e */
    public final SO4 m106616e() {
        return f10099r;
    }

    /* renamed from: f */
    public final SO4 m106615f() {
        return f10100s;
    }

    /* renamed from: g */
    public final SO4 m106614g() {
        return f10097p;
    }

    /* renamed from: h */
    public final SO4 m106613h() {
        return f10092k;
    }

    /* renamed from: i */
    public final SO4 m106612i() {
        return f10091j;
    }

    /* renamed from: j */
    public final AbstractC31955Bm0 m106611j() {
        return f10102u;
    }

    /* renamed from: k */
    public final AbstractC31955Bm0 m106610k() {
        return f10101t;
    }

    /* renamed from: l */
    public final AbstractC31955Bm0[] m106609l() {
        return f10105x;
    }

    /* renamed from: m */
    public final SO4 m106608m() {
        return f10093l;
    }

    /* renamed from: n */
    public final SO4 m106607n() {
        return f10094m;
    }

    /* renamed from: o */
    public final SO4 m106606o() {
        return f10089h;
    }

    /* renamed from: p */
    public final SO4 m106605p() {
        return f10090i;
    }

    /* renamed from: q */
    public final SO4 m106604q() {
        return f10088g;
    }

    /* renamed from: r */
    public final SO4 m106603r() {
        return f10095n;
    }

    /* renamed from: s */
    public final float[] m106602s() {
        return f10084c;
    }

    /* renamed from: t */
    public final AbstractC31955Bm0 m106601t() {
        return f10104w;
    }

    /* renamed from: u */
    public final SO4 m106600u() {
        return f10098q;
    }

    /* renamed from: v */
    public final SO4 m106599v() {
        return f10096o;
    }

    /* renamed from: w */
    public final SO4 m106598w() {
        return f10087f;
    }

    /* renamed from: x */
    public final float[] m106597x() {
        return f10083b;
    }

    /* renamed from: y */
    public final SO4 m106596y() {
        return f10103v;
    }
}

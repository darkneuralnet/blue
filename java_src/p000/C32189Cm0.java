package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import p000.C32999Fy0;
import p000.C51212wm0;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000b\u001a+\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007\u001a8\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0000\u001a8\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0000\u001aH\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0000\u001aH\u0010\u0017\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0000\u001a8\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0000\u001a8\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0000\u001a\u0018\u0010\u0015\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0000\u001a\u0018\u0010\u0011\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u0019H\u0000\u001a\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0000\u001a\u0018\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019H\u0000\u001a\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019H\u0000\u001a(\u0010#\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001fH\u0000\u001a(\u0010$\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001fH\u0000\u001a(\u0010%\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001fH\u0000\u001a\u0018\u0010&\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019H\u0000\u001a \u0010\u0014\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u0019H\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006*"}, m28432d2 = {"LBm0;", "destination", "Lpw4;", "intent", "LFy0;", "h", "(LBm0;LBm0;I)LFy0;", "LNA6;", "whitePoint", "LD6;", "adaptation", "c", "", "x", C17296a.f69688o, "b", DateTokenConverter.CONVERTER_KEY, "g", "q", "s", "e", "f", "r", "t", "", "", "m", "j", "lhs", "rhs", "k", "", "r0", "r1", "r2", "n", "o", "p", "l", "matrix", "srcWhitePoint", "dstWhitePoint", "ui-graphics_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Cm0 */
/* loaded from: classes.dex */
public final class C32189Cm0 {
    /* renamed from: a */
    public static final double m111743a(double d, double d2, double d3, double d4, double d5, double d6) {
        return Math.copySign(m111727q(d < 0.0d ? -d : d, d2, d3, d4, d5, d6), d);
    }

    /* renamed from: b */
    public static final double m111742b(double d, double d2, double d3, double d4, double d5, double d6) {
        return Math.copySign(m111725s(d < 0.0d ? -d : d, d2, d3, d4, d5, d6), d);
    }

    @JvmOverloads
    /* renamed from: c */
    public static final AbstractC31955Bm0 m111741c(AbstractC31955Bm0 abstractC31955Bm0, NA6 whitePoint, AbstractC1381D6 adaptation) {
        Intrinsics.checkNotNullParameter(abstractC31955Bm0, "<this>");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(adaptation, "adaptation");
        if (C51212wm0.m6387e(abstractC31955Bm0.m113509g(), C51212wm0.f116470a.m6382b())) {
            SO4 so4 = (SO4) abstractC31955Bm0;
            if (m111738f(so4.m85555N(), whitePoint)) {
                return abstractC31955Bm0;
            }
            return new SO4(so4, m111733k(m111739e(adaptation.m110913b(), so4.m85555N().m94260c(), whitePoint.m94260c()), so4.m85556M()), whitePoint);
        }
        return abstractC31955Bm0;
    }

    /* renamed from: d */
    public static /* synthetic */ AbstractC31955Bm0 m111740d(AbstractC31955Bm0 abstractC31955Bm0, NA6 na6, AbstractC1381D6 abstractC1381D6, int i, Object obj) {
        if ((i & 2) != 0) {
            abstractC1381D6 = AbstractC1381D6.f5239b.m110912a();
        }
        return m111741c(abstractC31955Bm0, na6, abstractC1381D6);
    }

    /* renamed from: e */
    public static final float[] m111739e(float[] matrix, float[] srcWhitePoint, float[] dstWhitePoint) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(srcWhitePoint, "srcWhitePoint");
        Intrinsics.checkNotNullParameter(dstWhitePoint, "dstWhitePoint");
        float[] m111731m = m111731m(matrix, srcWhitePoint);
        float[] m111731m2 = m111731m(matrix, dstWhitePoint);
        return m111733k(m111734j(matrix), m111732l(new float[]{m111731m2[0] / m111731m[0], m111731m2[1] / m111731m[1], m111731m2[2] / m111731m[2]}, matrix));
    }

    /* renamed from: f */
    public static final boolean m111738f(NA6 a, NA6 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        if (a == b) {
            return true;
        }
        if (Math.abs(a.m94262a() - b.m94262a()) < 0.001f && Math.abs(a.m94261b() - b.m94261b()) < 0.001f) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static final boolean m111737g(float[] a, float[] b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        if (a == b) {
            return true;
        }
        int length = a.length;
        for (int i = 0; i < length; i++) {
            if (Float.compare(a[i], b[i]) != 0 && Math.abs(a[i] - b[i]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public static final C32999Fy0 m111736h(AbstractC31955Bm0 connect, AbstractC31955Bm0 destination, int i) {
        Intrinsics.checkNotNullParameter(connect, "$this$connect");
        Intrinsics.checkNotNullParameter(destination, "destination");
        C32891Fm0 c32891Fm0 = C32891Fm0.f10082a;
        if (connect == c32891Fm0.m106598w()) {
            if (destination == c32891Fm0.m106598w()) {
                return C32999Fy0.f10623g.m106134d();
            }
            if (destination == c32891Fm0.m106601t() && C47167pw4.m18415e(i, C47167pw4.f104351a.m18413b())) {
                return C32999Fy0.f10623g.m106133e();
            }
        } else if (connect == c32891Fm0.m106601t() && destination == c32891Fm0.m106598w() && C47167pw4.m18415e(i, C47167pw4.f104351a.m18413b())) {
            return C32999Fy0.f10623g.m106135c();
        }
        if (connect == destination) {
            return C32999Fy0.f10623g.m106132f(connect);
        }
        long m113509g = connect.m113509g();
        C51212wm0.C29958a c29958a = C51212wm0.f116470a;
        if (C51212wm0.m6387e(m113509g, c29958a.m6382b()) && C51212wm0.m6387e(destination.m113509g(), c29958a.m6382b())) {
            return new C32999Fy0.C2544b((SO4) connect, (SO4) destination, i, null);
        }
        return new C32999Fy0(connect, destination, i, null);
    }

    /* renamed from: i */
    public static /* synthetic */ C32999Fy0 m111735i(AbstractC31955Bm0 abstractC31955Bm0, AbstractC31955Bm0 abstractC31955Bm02, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            abstractC31955Bm02 = C32891Fm0.f10082a.m106598w();
        }
        if ((i2 & 2) != 0) {
            i = C47167pw4.f104351a.m18413b();
        }
        return m111736h(abstractC31955Bm0, abstractC31955Bm02, i);
    }

    /* renamed from: j */
    public static final float[] m111734j(float[] m) {
        Intrinsics.checkNotNullParameter(m, "m");
        float f = m[0];
        float f2 = m[3];
        float f3 = m[6];
        float f4 = m[1];
        float f5 = m[4];
        float f6 = m[7];
        float f7 = m[2];
        float f8 = m[5];
        float f9 = m[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f * f10) + (f2 * f11) + (f3 * f12);
        float[] fArr = new float[m.length];
        fArr[0] = f10 / f13;
        fArr[1] = f11 / f13;
        fArr[2] = f12 / f13;
        fArr[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr;
    }

    /* renamed from: k */
    public static final float[] m111733k(float[] lhs, float[] rhs) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        float f = lhs[3];
        float f2 = rhs[1];
        float f3 = lhs[6];
        float f4 = rhs[2];
        float f5 = lhs[1];
        float f6 = rhs[0];
        float f7 = lhs[4];
        float f8 = lhs[7];
        float f9 = lhs[5];
        float f10 = lhs[8];
        float f11 = lhs[0];
        float f12 = rhs[4];
        float f13 = (rhs[3] * f11) + (f * f12);
        float f14 = rhs[5];
        float f15 = lhs[1];
        float f16 = rhs[3];
        float f17 = lhs[2];
        float f18 = f11 * rhs[6];
        float f19 = lhs[3];
        float f20 = rhs[7];
        float f21 = f18 + (f19 * f20);
        float f22 = rhs[8];
        float f23 = rhs[6];
        return new float[]{(lhs[0] * rhs[0]) + (f * f2) + (f3 * f4), (f5 * f6) + (f2 * f7) + (f8 * f4), (lhs[2] * f6) + (rhs[1] * f9) + (f4 * f10), f13 + (f3 * f14), (f15 * f16) + (f7 * f12) + (f8 * f14), (f16 * f17) + (f9 * rhs[4]) + (f14 * f10), f21 + (f3 * f22), (f15 * f23) + (lhs[4] * f20) + (f8 * f22), (f17 * f23) + (lhs[5] * rhs[7]) + (f10 * f22)};
    }

    /* renamed from: l */
    public static final float[] m111732l(float[] lhs, float[] rhs) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        float f = lhs[0];
        float f2 = lhs[1];
        float f3 = lhs[2];
        return new float[]{lhs[0] * rhs[0], lhs[1] * rhs[1], lhs[2] * rhs[2], rhs[3] * f, rhs[4] * f2, rhs[5] * f3, f * rhs[6], f2 * rhs[7], f3 * rhs[8]};
    }

    /* renamed from: m */
    public static final float[] m111731m(float[] lhs, float[] rhs) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        float f = rhs[0];
        float f2 = rhs[1];
        float f3 = rhs[2];
        rhs[0] = (lhs[0] * f) + (lhs[3] * f2) + (lhs[6] * f3);
        rhs[1] = (lhs[1] * f) + (lhs[4] * f2) + (lhs[7] * f3);
        rhs[2] = (lhs[2] * f) + (lhs[5] * f2) + (lhs[8] * f3);
        return rhs;
    }

    /* renamed from: n */
    public static final float m111730n(float[] lhs, float f, float f2, float f3) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        return (lhs[0] * f) + (lhs[3] * f2) + (lhs[6] * f3);
    }

    /* renamed from: o */
    public static final float m111729o(float[] lhs, float f, float f2, float f3) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        return (lhs[1] * f) + (lhs[4] * f2) + (lhs[7] * f3);
    }

    /* renamed from: p */
    public static final float m111728p(float[] lhs, float f, float f2, float f3) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        return (lhs[2] * f) + (lhs[5] * f2) + (lhs[8] * f3);
    }

    /* renamed from: q */
    public static final double m111727q(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 * d4 ? (Math.pow(d, 1.0d / d6) - d3) / d2 : d / d4;
    }

    /* renamed from: r */
    public static final double m111726r(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        return d >= d5 * d4 ? (Math.pow(d - d6, 1.0d / d8) - d3) / d2 : (d - d7) / d4;
    }

    /* renamed from: s */
    public static final double m111725s(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 ? Math.pow((d2 * d) + d3, d6) : d * d4;
    }

    /* renamed from: t */
    public static final double m111724t(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        return d >= d5 ? Math.pow((d2 * d) + d3, d8) + d6 : (d4 * d) + d7;
    }
}

package p000;
/* renamed from: bN2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C38509bN2 {
    /* renamed from: a */
    public static double m64628a(double d) {
        return Math.asin(Math.sqrt(d)) * 2.0d;
    }

    /* renamed from: b */
    public static double m64627b(double d) {
        double sin = Math.sin(d * 0.5d);
        return sin * sin;
    }

    /* renamed from: c */
    public static double m64626c(double d, double d2, double d3) {
        return m64627b(d - d2) + (m64627b(d3) * Math.cos(d) * Math.cos(d2));
    }

    /* renamed from: d */
    public static double m64625d(double d) {
        return Math.log(Math.tan((d * 0.5d) + 0.7853981633974483d));
    }

    /* renamed from: e */
    public static double m64624e(double d, double d2) {
        return ((d % d2) + d2) % d2;
    }

    /* renamed from: f */
    public static double m64623f(double d, double d2, double d3) {
        return (d < d2 || d >= d3) ? m64624e(d - d2, d3 - d2) + d2 : d;
    }
}

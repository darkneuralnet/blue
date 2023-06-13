package p000;
/* renamed from: aN2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C37916aN2 {

    /* renamed from: a */
    public static final double f50372a = Math.log(10.0d);

    /* renamed from: b */
    public static final double f50373b = (Math.sqrt(5.0d) - 1.0d) / 2.0d;

    /* renamed from: a */
    public static int m71519a(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: b */
    public static double m71518b(double d, double d2, double d3, double d4) {
        if (d2 > d) {
            d = d2;
        }
        if (d3 <= d) {
            d3 = d;
        }
        return d4 > d3 ? d4 : d3;
    }

    /* renamed from: c */
    public static double m71517c(double d) {
        return m71516d(d, f50373b);
    }

    /* renamed from: d */
    public static double m71516d(double d, double d2) {
        double d3 = d + d2;
        return d3 < 1.0d ? d3 : d3 - Math.floor(d3);
    }
}

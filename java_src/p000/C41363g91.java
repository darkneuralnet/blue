package p000;

import java.io.PrintStream;
import java.util.Arrays;
/* renamed from: g91  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C41363g91 {

    /* renamed from: b */
    public static C41363g91 f81685b = new C41363g91();

    /* renamed from: c */
    public static String[] f81686c = {"standard", "accelerate", "decelerate", "linear"};

    /* renamed from: a */
    public String f81687a = "identity";

    /* renamed from: g91$a */
    /* loaded from: classes.dex */
    public static class C20763a extends C41363g91 {

        /* renamed from: h */
        public static double f81688h = 0.01d;

        /* renamed from: i */
        public static double f81689i = 1.0E-4d;

        /* renamed from: d */
        public double f81690d;

        /* renamed from: e */
        public double f81691e;

        /* renamed from: f */
        public double f81692f;

        /* renamed from: g */
        public double f81693g;

        public C20763a(String str) {
            this.f81687a = str;
            int indexOf = str.indexOf(40);
            int indexOf2 = str.indexOf(44, indexOf);
            this.f81690d = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
            int i = indexOf2 + 1;
            int indexOf3 = str.indexOf(44, i);
            this.f81691e = Double.parseDouble(str.substring(i, indexOf3).trim());
            int i2 = indexOf3 + 1;
            int indexOf4 = str.indexOf(44, i2);
            this.f81692f = Double.parseDouble(str.substring(i2, indexOf4).trim());
            int i3 = indexOf4 + 1;
            this.f81693g = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
        }

        @Override // p000.C41363g91
        /* renamed from: a */
        public double mo39969a(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > f81688h) {
                d2 *= 0.5d;
                if (m39967d(d3) < d) {
                    d3 += d2;
                } else {
                    d3 -= d2;
                }
            }
            double d4 = d3 - d2;
            double m39967d = m39967d(d4);
            double d5 = d3 + d2;
            double m39967d2 = m39967d(d5);
            double m39966e = m39966e(d4);
            return (((m39966e(d5) - m39966e) * (d - m39967d)) / (m39967d2 - m39967d)) + m39966e;
        }

        @Override // p000.C41363g91
        /* renamed from: b */
        public double mo39968b(double d) {
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > f81689i) {
                d2 *= 0.5d;
                if (m39967d(d3) < d) {
                    d3 += d2;
                } else {
                    d3 -= d2;
                }
            }
            double d4 = d3 - d2;
            double m39967d = m39967d(d4);
            double d5 = d3 + d2;
            return (m39966e(d5) - m39966e(d4)) / (m39967d(d5) - m39967d);
        }

        /* renamed from: d */
        public final double m39967d(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.f81690d * d2 * d3 * d) + (this.f81692f * d3 * d * d) + (d * d * d);
        }

        /* renamed from: e */
        public final double m39966e(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.f81691e * d2 * d3 * d) + (this.f81693g * d3 * d * d) + (d * d * d);
        }
    }

    /* renamed from: c */
    public static C41363g91 m39970c(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new C20763a(str);
        }
        if (str.startsWith("spline")) {
            return new JQ5(str);
        }
        if (str.startsWith("Schlick")) {
            return new C36172Tm5(str);
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1354466595:
                if (str.equals("accelerate")) {
                    c = 0;
                    break;
                }
                break;
            case -1263948740:
                if (str.equals("decelerate")) {
                    c = 1;
                    break;
                }
                break;
            case -1197605014:
                if (str.equals("anticipate")) {
                    c = 2;
                    break;
                }
                break;
            case -1102672091:
                if (str.equals("linear")) {
                    c = 3;
                    break;
                }
                break;
            case -749065269:
                if (str.equals("overshoot")) {
                    c = 4;
                    break;
                }
                break;
            case 1312628413:
                if (str.equals("standard")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C20763a("cubic(0.4, 0.05, 0.8, 0.7)");
            case 1:
                return new C20763a("cubic(0.0, 0.0, 0.2, 0.95)");
            case 2:
                return new C20763a("cubic(0.36, 0, 0.66, -0.56)");
            case 3:
                return new C20763a("cubic(1, 1, 0, 0)");
            case 4:
                return new C20763a("cubic(0.34, 1.56, 0.64, 1)");
            case 5:
                return new C20763a("cubic(0.4, 0.0, 0.2, 1)");
            default:
                PrintStream printStream = System.err;
                printStream.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f81686c));
                return f81685b;
        }
    }

    /* renamed from: a */
    public double mo39969a(double d) {
        return d;
    }

    /* renamed from: b */
    public double mo39968b(double d) {
        return 1.0d;
    }

    public String toString() {
        return this.f81687a;
    }
}

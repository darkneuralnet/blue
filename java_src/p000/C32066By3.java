package p000;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
/* renamed from: By3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C32066By3 {

    /* renamed from: b */
    public static C32066By3 f3145b = new C32066By3();

    /* renamed from: a */
    public DecimalFormat f3146a;

    public C32066By3() {
        this.f3146a = m113212b(325);
    }

    /* renamed from: a */
    public static C32066By3 m113213a(int i) {
        return new C32066By3(i);
    }

    /* renamed from: b */
    public static DecimalFormat m113212b(int i) {
        try {
            DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance(Locale.US);
            decimalFormat.applyPattern("0");
            decimalFormat.setMaximumFractionDigits(i);
            return decimalFormat;
        } catch (ClassCastException unused) {
            throw new RuntimeException("Unable to create DecimalFormat for Locale.US");
        }
    }

    /* renamed from: c */
    public synchronized String m113211c(double d) {
        String str;
        if (Double.isNaN(d)) {
            return "NaN";
        }
        if (Double.isInfinite(d)) {
            if (d > 0.0d) {
                str = "Inf";
            } else {
                str = "-Inf";
            }
            return str;
        }
        return this.f3146a.format(d);
    }

    public C32066By3(int i) {
        this.f3146a = m113212b(i);
    }
}

package p000;
/* renamed from: Tm5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C36172Tm5 extends C41363g91 {

    /* renamed from: d */
    public double f36062d;

    /* renamed from: e */
    public double f36063e;

    public C36172Tm5(String str) {
        this.f81687a = str;
        int indexOf = str.indexOf(40);
        int indexOf2 = str.indexOf(44, indexOf);
        this.f36062d = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
        int i = indexOf2 + 1;
        this.f36063e = Double.parseDouble(str.substring(i, str.indexOf(44, i)).trim());
    }

    @Override // p000.C41363g91
    /* renamed from: a */
    public double mo39969a(double d) {
        return m82976e(d);
    }

    @Override // p000.C41363g91
    /* renamed from: b */
    public double mo39968b(double d) {
        return m82977d(d);
    }

    /* renamed from: d */
    public final double m82977d(double d) {
        double d2 = this.f36063e;
        if (d < d2) {
            double d3 = this.f36062d;
            return ((d3 * d2) * d2) / ((((d2 - d) * d3) + d) * ((d3 * (d2 - d)) + d));
        }
        double d4 = this.f36062d;
        return (((d2 - 1.0d) * d4) * (d2 - 1.0d)) / (((((-d4) * (d2 - d)) - d) + 1.0d) * ((((-d4) * (d2 - d)) - d) + 1.0d));
    }

    /* renamed from: e */
    public final double m82976e(double d) {
        double d2 = this.f36063e;
        if (d < d2) {
            return (d2 * d) / (d + (this.f36062d * (d2 - d)));
        }
        return ((1.0d - d2) * (d - 1.0d)) / ((1.0d - d) - (this.f36062d * (d2 - d)));
    }
}

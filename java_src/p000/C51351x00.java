package p000;
/* renamed from: x00  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C51351x00 {

    /* renamed from: a */
    public final double f116955a;

    /* renamed from: b */
    public final double f116956b;

    /* renamed from: c */
    public final double f116957c;

    /* renamed from: d */
    public final double f116958d;

    /* renamed from: e */
    public final double f116959e;

    /* renamed from: f */
    public final double f116960f;

    public C51351x00(double d, double d2, double d3, double d4) {
        this.f116955a = d;
        this.f116956b = d3;
        this.f116957c = d2;
        this.f116958d = d4;
        this.f116959e = (d + d2) / 2.0d;
        this.f116960f = (d3 + d4) / 2.0d;
    }

    /* renamed from: a */
    public boolean m6009a(double d, double d2) {
        return this.f116955a <= d && d <= this.f116957c && this.f116956b <= d2 && d2 <= this.f116958d;
    }

    /* renamed from: b */
    public boolean m6008b(C51351x00 c51351x00) {
        return c51351x00.f116955a >= this.f116955a && c51351x00.f116957c <= this.f116957c && c51351x00.f116956b >= this.f116956b && c51351x00.f116958d <= this.f116958d;
    }

    /* renamed from: c */
    public boolean m6007c(GW3 gw3) {
        return m6009a(gw3.f12013a, gw3.f12014b);
    }

    /* renamed from: d */
    public boolean m6006d(double d, double d2, double d3, double d4) {
        return d < this.f116957c && this.f116955a < d2 && d3 < this.f116958d && this.f116956b < d4;
    }

    /* renamed from: e */
    public boolean m6005e(C51351x00 c51351x00) {
        return m6006d(c51351x00.f116955a, c51351x00.f116957c, c51351x00.f116956b, c51351x00.f116958d);
    }
}

package p000;
/* renamed from: pp0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C47093pp0 {

    /* renamed from: a */
    public boolean f104123a = true;

    /* renamed from: b */
    public int f104124b = 53;

    /* renamed from: c */
    public long f104125c = 0;

    /* renamed from: d */
    public long f104126d;

    /* renamed from: b */
    public static int m18658b(long j, int i) {
        return (j & (1 << i)) != 0 ? 1 : 0;
    }

    /* renamed from: d */
    public static int m18656d(long j, long j2) {
        int i = 0;
        for (int i2 = 52; i2 >= 0; i2--) {
            if (m18658b(j, i2) != m18658b(j2, i2)) {
                return i;
            }
            i++;
        }
        return 52;
    }

    /* renamed from: e */
    public static long m18655e(long j) {
        return j >> 52;
    }

    /* renamed from: f */
    public static long m18654f(long j, int i) {
        return j & (~((1 << i) - 1));
    }

    /* renamed from: a */
    public void m18659a(double d) {
        long doubleToLongBits = Double.doubleToLongBits(d);
        if (this.f104123a) {
            this.f104125c = doubleToLongBits;
            this.f104126d = m18655e(doubleToLongBits);
            this.f104123a = false;
        } else if (m18655e(doubleToLongBits) != this.f104126d) {
            this.f104125c = 0L;
        } else {
            int m18656d = m18656d(this.f104125c, doubleToLongBits);
            this.f104124b = m18656d;
            this.f104125c = m18654f(this.f104125c, 64 - (m18656d + 12));
        }
    }

    /* renamed from: c */
    public double m18657c() {
        return Double.longBitsToDouble(this.f104125c);
    }
}

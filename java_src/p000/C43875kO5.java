package p000;
/* renamed from: kO5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C43875kO5 implements TQ5 {

    /* renamed from: c */
    public double f94329c;

    /* renamed from: d */
    public double f94330d;

    /* renamed from: e */
    public double f94331e;

    /* renamed from: f */
    public float f94332f;

    /* renamed from: g */
    public float f94333g;

    /* renamed from: h */
    public float f94334h;

    /* renamed from: i */
    public float f94335i;

    /* renamed from: j */
    public float f94336j;

    /* renamed from: a */
    public double f94327a = 0.5d;

    /* renamed from: b */
    public boolean f94328b = false;

    /* renamed from: k */
    public int f94337k = 0;

    @Override // p000.TQ5
    /* renamed from: a */
    public float mo29024a() {
        return 0.0f;
    }

    @Override // p000.TQ5
    /* renamed from: b */
    public boolean mo29023b() {
        double d = this.f94333g - this.f94330d;
        double d2 = this.f94329c;
        double d3 = this.f94334h;
        if (Math.sqrt((((d3 * d3) * this.f94335i) + ((d2 * d) * d)) / d2) <= this.f94336j) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void m29022c(double d) {
        double d2 = this.f94329c;
        double d3 = this.f94327a;
        int sqrt = (int) ((9.0d / ((Math.sqrt(d2 / this.f94335i) * d) * 4.0d)) + 1.0d);
        double d4 = d / sqrt;
        int i = 0;
        while (i < sqrt) {
            float f = this.f94333g;
            double d5 = this.f94330d;
            float f2 = this.f94334h;
            double d6 = d2;
            float f3 = this.f94335i;
            double d7 = d3;
            double d8 = f2 + ((((((-d2) * (f - d5)) - (f2 * d3)) / f3) * d4) / 2.0d);
            double d9 = ((((-((f + ((d4 * d8) / 2.0d)) - d5)) * d6) - (d8 * d7)) / f3) * d4;
            float f4 = (float) (f2 + d9);
            this.f94334h = f4;
            float f5 = (float) (f + ((f2 + (d9 / 2.0d)) * d4));
            this.f94333g = f5;
            int i2 = this.f94337k;
            if (i2 > 0) {
                if (f5 < 0.0f && (i2 & 1) == 1) {
                    this.f94333g = -f5;
                    this.f94334h = -f4;
                }
                float f6 = this.f94333g;
                if (f6 > 1.0f && (i2 & 2) == 2) {
                    this.f94333g = 2.0f - f6;
                    this.f94334h = -this.f94334h;
                }
            }
            i++;
            d2 = d6;
            d3 = d7;
        }
    }

    /* renamed from: d */
    public void m29021d(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        this.f94330d = f2;
        this.f94327a = f6;
        this.f94328b = false;
        this.f94333g = f;
        this.f94331e = f3;
        this.f94329c = f5;
        this.f94335i = f4;
        this.f94336j = f7;
        this.f94337k = i;
        this.f94332f = 0.0f;
    }

    @Override // p000.TQ5
    public float getInterpolation(float f) {
        m29022c(f - this.f94332f);
        this.f94332f = f;
        return this.f94333g;
    }
}

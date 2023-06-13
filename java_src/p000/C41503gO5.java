package p000;

import p000.AbstractC46690p81;
/* renamed from: gO5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41503gO5 {

    /* renamed from: a */
    public double f82119a;

    /* renamed from: b */
    public double f82120b;

    /* renamed from: c */
    public boolean f82121c;

    /* renamed from: d */
    public double f82122d;

    /* renamed from: e */
    public double f82123e;

    /* renamed from: f */
    public double f82124f;

    /* renamed from: g */
    public double f82125g;

    /* renamed from: h */
    public double f82126h;

    /* renamed from: i */
    public double f82127i;

    /* renamed from: j */
    public final AbstractC46690p81.C27167o f82128j;

    public C41503gO5() {
        this.f82119a = Math.sqrt(1500.0d);
        this.f82120b = 0.5d;
        this.f82121c = false;
        this.f82127i = Double.MAX_VALUE;
        this.f82128j = new AbstractC46690p81.C27167o();
    }

    /* renamed from: a */
    public float m39509a() {
        return (float) this.f82127i;
    }

    /* renamed from: b */
    public final void m39508b() {
        if (this.f82121c) {
            return;
        }
        if (this.f82127i != Double.MAX_VALUE) {
            double d = this.f82120b;
            if (d > 1.0d) {
                double d2 = this.f82119a;
                this.f82124f = ((-d) * d2) + (d2 * Math.sqrt((d * d) - 1.0d));
                double d3 = this.f82120b;
                double d4 = this.f82119a;
                this.f82125g = ((-d3) * d4) - (d4 * Math.sqrt((d3 * d3) - 1.0d));
            } else if (d >= 0.0d && d < 1.0d) {
                this.f82126h = this.f82119a * Math.sqrt(1.0d - (d * d));
            }
            this.f82121c = true;
            return;
        }
        throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
    }

    /* renamed from: c */
    public boolean m39507c(float f, float f2) {
        if (Math.abs(f2) < this.f82123e && Math.abs(f - m39509a()) < this.f82122d) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public C41503gO5 m39506d(float f) {
        if (f >= 0.0f) {
            this.f82120b = f;
            this.f82121c = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    /* renamed from: e */
    public C41503gO5 m39505e(float f) {
        this.f82127i = f;
        return this;
    }

    /* renamed from: f */
    public C41503gO5 m39504f(float f) {
        if (f > 0.0f) {
            this.f82119a = Math.sqrt(f);
            this.f82121c = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* renamed from: g */
    public void m39503g(double d) {
        double abs = Math.abs(d);
        this.f82122d = abs;
        this.f82123e = abs * 62.5d;
    }

    /* renamed from: h */
    public AbstractC46690p81.C27167o m39502h(double d, double d2, long j) {
        double cos;
        double d3;
        m39508b();
        double d4 = j / 1000.0d;
        double d5 = d - this.f82127i;
        double d6 = this.f82120b;
        if (d6 > 1.0d) {
            double d7 = this.f82125g;
            double d8 = this.f82124f;
            double d9 = d5 - (((d7 * d5) - d2) / (d7 - d8));
            double d10 = ((d5 * d7) - d2) / (d7 - d8);
            d3 = (Math.pow(2.718281828459045d, d7 * d4) * d9) + (Math.pow(2.718281828459045d, this.f82124f * d4) * d10);
            double d11 = this.f82125g;
            double pow = d9 * d11 * Math.pow(2.718281828459045d, d11 * d4);
            double d12 = this.f82124f;
            cos = pow + (d10 * d12 * Math.pow(2.718281828459045d, d12 * d4));
        } else if (d6 == 1.0d) {
            double d13 = this.f82119a;
            double d14 = d2 + (d13 * d5);
            double d15 = d5 + (d14 * d4);
            d3 = Math.pow(2.718281828459045d, (-d13) * d4) * d15;
            double pow2 = d15 * Math.pow(2.718281828459045d, (-this.f82119a) * d4);
            double d16 = this.f82119a;
            cos = (d14 * Math.pow(2.718281828459045d, (-d16) * d4)) + (pow2 * (-d16));
        } else {
            double d17 = 1.0d / this.f82126h;
            double d18 = this.f82119a;
            double d19 = d17 * ((d6 * d18 * d5) + d2);
            double pow3 = Math.pow(2.718281828459045d, (-d6) * d18 * d4) * ((Math.cos(this.f82126h * d4) * d5) + (Math.sin(this.f82126h * d4) * d19));
            double d20 = this.f82119a;
            double d21 = this.f82120b;
            double pow4 = Math.pow(2.718281828459045d, (-d21) * d20 * d4);
            double d22 = this.f82126h;
            double sin = (-d22) * d5 * Math.sin(d22 * d4);
            double d23 = this.f82126h;
            cos = ((-d20) * pow3 * d21) + (pow4 * (sin + (d19 * d23 * Math.cos(d23 * d4))));
            d3 = pow3;
        }
        AbstractC46690p81.C27167o c27167o = this.f82128j;
        c27167o.f103181a = (float) (d3 + this.f82127i);
        c27167o.f103182b = (float) cos;
        return c27167o;
    }

    public C41503gO5(float f) {
        this.f82119a = Math.sqrt(1500.0d);
        this.f82120b = 0.5d;
        this.f82121c = false;
        this.f82127i = Double.MAX_VALUE;
        this.f82128j = new AbstractC46690p81.C27167o();
        this.f82127i = f;
    }
}

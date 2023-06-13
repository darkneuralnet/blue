package p000;

import android.graphics.Paint;
/* renamed from: Yu */
/* loaded from: classes5.dex */
public abstract class AbstractC10074Yu extends AbstractC47770qx4 {

    /* renamed from: b */
    public AbstractC9544Xu f47605b;

    /* renamed from: c */
    public D96 f47606c;

    /* renamed from: d */
    public Paint f47607d;

    /* renamed from: e */
    public Paint f47608e;

    /* renamed from: f */
    public Paint f47609f;

    /* renamed from: g */
    public Paint f47610g;

    public AbstractC10074Yu(C32951Fs6 c32951Fs6, D96 d96, AbstractC9544Xu abstractC9544Xu) {
        super(c32951Fs6);
        this.f47606c = d96;
        this.f47605b = abstractC9544Xu;
        if (this.f106125a != null) {
            this.f47608e = new Paint(1);
            Paint paint = new Paint();
            this.f47607d = paint;
            paint.setColor(-7829368);
            this.f47607d.setStrokeWidth(1.0f);
            this.f47607d.setStyle(Paint.Style.STROKE);
            this.f47607d.setAlpha(90);
            Paint paint2 = new Paint();
            this.f47609f = paint2;
            paint2.setColor(-16777216);
            this.f47609f.setStrokeWidth(1.0f);
            this.f47609f.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint(1);
            this.f47610g = paint3;
            paint3.setStyle(Paint.Style.STROKE);
        }
    }

    /* renamed from: a */
    public void mo8936a(float f, float f2, boolean z) {
        float f3;
        double d;
        C32951Fs6 c32951Fs6 = this.f106125a;
        if (c32951Fs6 != null && c32951Fs6.m106376k() > 10.0f && !this.f106125a.m106364w()) {
            OE2 m110831g = this.f47606c.m110831g(this.f106125a.m106379h(), this.f106125a.m106377j());
            OE2 m110831g2 = this.f47606c.m110831g(this.f106125a.m106379h(), this.f106125a.m106381f());
            if (!z) {
                f3 = (float) m110831g2.f26255d;
                d = m110831g.f26255d;
            } else {
                f3 = (float) m110831g.f26255d;
                d = m110831g2.f26255d;
            }
            OE2.m92597c(m110831g);
            OE2.m92597c(m110831g2);
            f = f3;
            f2 = (float) d;
        }
        mo10483b(f, f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5, types: [int] */
    /* renamed from: b */
    public void mo10483b(float f, float f2) {
        double ceil;
        double m91638w;
        float f3 = f;
        int m76128s = this.f47605b.m76128s();
        double abs = Math.abs(f2 - f3);
        if (m76128s != 0 && abs > 0.0d && !Double.isInfinite(abs)) {
            double m91636y = AbstractC34967Oi6.m91636y(abs / m76128s);
            if (this.f47605b.m76149D() && m91636y < this.f47605b.m76132o()) {
                m91636y = this.f47605b.m76132o();
            }
            double m91636y2 = AbstractC34967Oi6.m91636y(Math.pow(10.0d, (int) Math.log10(m91636y)));
            if (((int) (m91636y / m91636y2)) > 5) {
                m91636y = Math.floor(m91636y2 * 10.0d);
            }
            int m76124w = this.f47605b.m76124w();
            if (this.f47605b.m76150C()) {
                m91636y = ((float) abs) / (m76128s - 1);
                AbstractC9544Xu abstractC9544Xu = this.f47605b;
                abstractC9544Xu.f44180n = m76128s;
                if (abstractC9544Xu.f44178l.length < m76128s) {
                    abstractC9544Xu.f44178l = new float[m76128s];
                }
                for (int i = 0; i < m76128s; i++) {
                    this.f47605b.f44178l[i] = f3;
                    f3 = (float) (f3 + m91636y);
                }
            } else {
                int i2 = (m91636y > 0.0d ? 1 : (m91636y == 0.0d ? 0 : -1));
                if (i2 == 0) {
                    ceil = 0.0d;
                } else {
                    ceil = Math.ceil(f3 / m91636y) * m91636y;
                }
                if (this.f47605b.m76124w()) {
                    ceil -= m91636y;
                }
                if (i2 == 0) {
                    m91638w = 0.0d;
                } else {
                    m91638w = AbstractC34967Oi6.m91638w(Math.floor(f2 / m91636y) * m91636y);
                }
                if (i2 != 0) {
                    double d = ceil;
                    m76124w = m76124w;
                    while (d <= m91638w) {
                        d += m91636y;
                        m76124w++;
                    }
                }
                AbstractC9544Xu abstractC9544Xu2 = this.f47605b;
                abstractC9544Xu2.f44180n = m76124w;
                if (abstractC9544Xu2.f44178l.length < m76124w) {
                    abstractC9544Xu2.f44178l = new float[m76124w];
                }
                for (int i3 = 0; i3 < m76124w; i3++) {
                    if (ceil == 0.0d) {
                        ceil = 0.0d;
                    }
                    this.f47605b.f44178l[i3] = (float) ceil;
                    ceil += m91636y;
                }
                m76128s = m76124w;
            }
            if (m91636y < 1.0d) {
                this.f47605b.f44181o = (int) Math.ceil(-Math.log10(m91636y));
            } else {
                this.f47605b.f44181o = 0;
            }
            if (this.f47605b.m76124w()) {
                AbstractC9544Xu abstractC9544Xu3 = this.f47605b;
                if (abstractC9544Xu3.f44179m.length < m76128s) {
                    abstractC9544Xu3.f44179m = new float[m76128s];
                }
                float f4 = ((float) m91636y) / 2.0f;
                for (int i4 = 0; i4 < m76128s; i4++) {
                    AbstractC9544Xu abstractC9544Xu4 = this.f47605b;
                    abstractC9544Xu4.f44179m[i4] = abstractC9544Xu4.f44178l[i4] + f4;
                }
                return;
            }
            return;
        }
        AbstractC9544Xu abstractC9544Xu5 = this.f47605b;
        abstractC9544Xu5.f44178l = new float[0];
        abstractC9544Xu5.f44179m = new float[0];
        abstractC9544Xu5.f44180n = 0;
    }

    /* renamed from: c */
    public Paint m74024c() {
        return this.f47608e;
    }
}

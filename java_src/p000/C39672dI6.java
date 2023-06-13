package p000;

import android.graphics.Canvas;
import android.graphics.Path;
import com.github.mikephil.charting.charts.RadarChart;
import java.util.List;
/* renamed from: dI6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C39672dI6 extends C38468bI6 {

    /* renamed from: r */
    public RadarChart f76411r;

    /* renamed from: s */
    public Path f76412s;

    public C39672dI6(C32951Fs6 c32951Fs6, C37875aI6 c37875aI6, RadarChart radarChart) {
        super(c32951Fs6, c37875aI6, null);
        this.f76412s = new Path();
        this.f76411r = radarChart;
    }

    @Override // p000.AbstractC10074Yu
    /* renamed from: b */
    public void mo10483b(float f, float f2) {
        double ceil;
        double m91638w;
        int i;
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
            boolean m76124w = this.f47605b.m76124w();
            if (this.f47605b.m76150C()) {
                float f4 = ((float) abs) / (m76128s - 1);
                AbstractC9544Xu abstractC9544Xu = this.f47605b;
                abstractC9544Xu.f44180n = m76128s;
                if (abstractC9544Xu.f44178l.length < m76128s) {
                    abstractC9544Xu.f44178l = new float[m76128s];
                }
                for (int i2 = 0; i2 < m76128s; i2++) {
                    this.f47605b.f44178l[i2] = f3;
                    f3 += f4;
                }
            } else {
                int i3 = (m91636y > 0.0d ? 1 : (m91636y == 0.0d ? 0 : -1));
                if (i3 == 0) {
                    ceil = 0.0d;
                } else {
                    ceil = Math.ceil(f3 / m91636y) * m91636y;
                }
                if (m76124w) {
                    ceil -= m91636y;
                }
                if (i3 == 0) {
                    m91638w = 0.0d;
                } else {
                    m91638w = AbstractC34967Oi6.m91638w(Math.floor(f2 / m91636y) * m91636y);
                }
                if (i3 != 0) {
                    i = m76124w;
                    for (double d = ceil; d <= m91638w; d += m91636y) {
                        i++;
                    }
                } else {
                    i = m76124w;
                }
                int i4 = i + 1;
                AbstractC9544Xu abstractC9544Xu2 = this.f47605b;
                abstractC9544Xu2.f44180n = i4;
                if (abstractC9544Xu2.f44178l.length < i4) {
                    abstractC9544Xu2.f44178l = new float[i4];
                }
                for (int i5 = 0; i5 < i4; i5++) {
                    if (ceil == 0.0d) {
                        ceil = 0.0d;
                    }
                    this.f47605b.f44178l[i5] = (float) ceil;
                    ceil += m91636y;
                }
                m76128s = i4;
            }
            if (m91636y < 1.0d) {
                this.f47605b.f44181o = (int) Math.ceil(-Math.log10(m91636y));
            } else {
                this.f47605b.f44181o = 0;
            }
            if (m76124w != 0) {
                AbstractC9544Xu abstractC9544Xu3 = this.f47605b;
                if (abstractC9544Xu3.f44179m.length < m76128s) {
                    abstractC9544Xu3.f44179m = new float[m76128s];
                }
                float[] fArr = abstractC9544Xu3.f44178l;
                float f5 = (fArr[1] - fArr[0]) / 2.0f;
                for (int i6 = 0; i6 < m76128s; i6++) {
                    AbstractC9544Xu abstractC9544Xu4 = this.f47605b;
                    abstractC9544Xu4.f44179m[i6] = abstractC9544Xu4.f44178l[i6] + f5;
                }
            }
            AbstractC9544Xu abstractC9544Xu5 = this.f47605b;
            float[] fArr2 = abstractC9544Xu5.f44178l;
            float f6 = fArr2[0];
            abstractC9544Xu5.f44171H = f6;
            float f7 = fArr2[m76128s - 1];
            abstractC9544Xu5.f44170G = f7;
            abstractC9544Xu5.f44172I = Math.abs(f7 - f6);
            return;
        }
        AbstractC9544Xu abstractC9544Xu6 = this.f47605b;
        abstractC9544Xu6.f44178l = new float[0];
        abstractC9544Xu6.f44179m = new float[0];
        abstractC9544Xu6.f44180n = 0;
    }

    @Override // p000.C38468bI6
    /* renamed from: i */
    public void mo44408i(Canvas canvas) {
        if (this.f57244h.m93268f() && this.f57244h.m76152A()) {
            this.f47608e.setTypeface(this.f57244h.m93271c());
            this.f47608e.setTextSize(this.f57244h.m93272b());
            this.f47608e.setColor(this.f57244h.m93273a());
            PE2 m52001z = this.f76411r.m52001z();
            PE2 m90558c = PE2.m90558c(0.0f, 0.0f);
            float m51960l0 = this.f76411r.m51960l0();
            int i = this.f57244h.m71679a0() ? this.f57244h.f44180n : this.f57244h.f44180n - 1;
            for (int i2 = !this.f57244h.m71680Z(); i2 < i; i2++) {
                C37875aI6 c37875aI6 = this.f57244h;
                AbstractC34967Oi6.m91643r(m52001z, (c37875aI6.f44178l[i2] - c37875aI6.f44171H) * m51960l0, this.f76411r.m51969j0(), m90558c);
                canvas.drawText(this.f57244h.m76133n(i2), m90558c.f28146c + 10.0f, m90558c.f28147d, this.f47608e);
            }
            PE2.m90555f(m52001z);
            PE2.m90555f(m90558c);
        }
    }

    @Override // p000.C38468bI6
    /* renamed from: l */
    public void mo44407l(Canvas canvas) {
        List<C38203ar2> m76127t = this.f57244h.m76127t();
        if (m76127t == null) {
            return;
        }
        float m51958n0 = this.f76411r.m51958n0();
        float m51960l0 = this.f76411r.m51960l0();
        PE2 m52001z = this.f76411r.m52001z();
        PE2 m90558c = PE2.m90558c(0.0f, 0.0f);
        for (int i = 0; i < m76127t.size(); i++) {
            C38203ar2 c38203ar2 = m76127t.get(i);
            if (c38203ar2.m93268f()) {
                this.f47610g.setColor(c38203ar2.m65384n());
                this.f47610g.setPathEffect(c38203ar2.m65388j());
                this.f47610g.setStrokeWidth(c38203ar2.m65383o());
                float m65385m = (c38203ar2.m65385m() - this.f76411r.mo28587g()) * m51960l0;
                Path path = this.f76412s;
                path.reset();
                for (int i2 = 0; i2 < ((C35235Pm4) this.f76411r.getData()).m33548k().mo21241L0(); i2++) {
                    AbstractC34967Oi6.m91643r(m52001z, m65385m, (i2 * m51958n0) + this.f76411r.m51969j0(), m90558c);
                    if (i2 == 0) {
                        path.moveTo(m90558c.f28146c, m90558c.f28147d);
                    } else {
                        path.lineTo(m90558c.f28146c, m90558c.f28147d);
                    }
                }
                path.close();
                canvas.drawPath(path, this.f47610g);
            }
        }
        PE2.m90555f(m52001z);
        PE2.m90555f(m90558c);
    }
}

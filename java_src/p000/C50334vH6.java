package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.charts.BarChart;
import java.util.List;
import p000.C38203ar2;
import p000.C49149tH6;
/* renamed from: vH6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C50334vH6 extends C49742uH6 {

    /* renamed from: p */
    public BarChart f113799p;

    /* renamed from: q */
    public Path f113800q;

    public C50334vH6(C32951Fs6 c32951Fs6, C49149tH6 c49149tH6, D96 d96, BarChart barChart) {
        super(c32951Fs6, c49149tH6, d96);
        this.f113800q = new Path();
        this.f113799p = barChart;
    }

    @Override // p000.C49742uH6, p000.AbstractC10074Yu
    /* renamed from: a */
    public void mo8936a(float f, float f2, boolean z) {
        float f3;
        double d;
        if (this.f106125a.m106376k() > 10.0f && !this.f106125a.m106364w()) {
            OE2 m110831g = this.f47606c.m110831g(this.f106125a.m106379h(), this.f106125a.m106381f());
            OE2 m110831g2 = this.f47606c.m110831g(this.f106125a.m106379h(), this.f106125a.m106377j());
            if (z) {
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

    @Override // p000.C49742uH6
    /* renamed from: d */
    public void mo8935d() {
        this.f47608e.setTypeface(this.f112153h.m93271c());
        this.f47608e.setTextSize(this.f112153h.m93272b());
        C37536Zi1 m91659b = AbstractC34967Oi6.m91659b(this.f47608e, this.f112153h.m76126u());
        float f = m91659b.f48980d;
        C37536Zi1 m91641t = AbstractC34967Oi6.m91641t(m91659b.f48979c, f, this.f112153h.m12531P());
        this.f112153h.f110252J = Math.round((int) (m91659b.f48979c + (this.f112153h.m93270d() * 3.5f)));
        this.f112153h.f110253K = Math.round(f);
        C49149tH6 c49149tH6 = this.f112153h;
        c49149tH6.f110254L = (int) (m91641t.f48979c + (c49149tH6.m93270d() * 3.5f));
        this.f112153h.f110255M = Math.round(m91641t.f48980d);
        C37536Zi1.m72660c(m91641t);
    }

    @Override // p000.C49742uH6
    /* renamed from: e */
    public void mo8934e(Canvas canvas, float f, float f2, Path path) {
        path.moveTo(this.f106125a.m106378i(), f2);
        path.lineTo(this.f106125a.m106379h(), f2);
        canvas.drawPath(path, this.f47607d);
        path.reset();
    }

    @Override // p000.C49742uH6
    /* renamed from: g */
    public void mo8933g(Canvas canvas, float f, PE2 pe2) {
        float m12531P = this.f112153h.m12531P();
        boolean m76124w = this.f112153h.m76124w();
        int i = this.f112153h.f44180n * 2;
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2 += 2) {
            if (m76124w) {
                fArr[i2 + 1] = this.f112153h.f44179m[i2 / 2];
            } else {
                fArr[i2 + 1] = this.f112153h.f44178l[i2 / 2];
            }
        }
        this.f47606c.m110827k(fArr);
        for (int i3 = 0; i3 < i; i3 += 2) {
            float f2 = fArr[i3 + 1];
            if (this.f106125a.m106404D(f2)) {
                AbstractC33806Jj6 m76125v = this.f112153h.m76125v();
                C49149tH6 c49149tH6 = this.f112153h;
                m10482f(canvas, m76125v.mo58186a(c49149tH6.f44178l[i3 / 2], c49149tH6), f, f2, pe2, m12531P);
            }
        }
    }

    @Override // p000.C49742uH6
    /* renamed from: h */
    public RectF mo8932h() {
        this.f112156k.set(this.f106125a.m106372o());
        this.f112156k.inset(0.0f, -this.f47605b.m76129r());
        return this.f112156k;
    }

    @Override // p000.C49742uH6
    /* renamed from: i */
    public void mo7041i(Canvas canvas) {
        if (this.f112153h.m93268f() && this.f112153h.m76152A()) {
            float m93270d = this.f112153h.m93270d();
            this.f47608e.setTypeface(this.f112153h.m93271c());
            this.f47608e.setTextSize(this.f112153h.m93272b());
            this.f47608e.setColor(this.f112153h.m93273a());
            PE2 m90558c = PE2.m90558c(0.0f, 0.0f);
            if (this.f112153h.m12530Q() == C49149tH6.EnumC28671a.TOP) {
                m90558c.f28146c = 0.0f;
                m90558c.f28147d = 0.5f;
                mo8933g(canvas, this.f106125a.m106378i() + m93270d, m90558c);
            } else if (this.f112153h.m12530Q() == C49149tH6.EnumC28671a.TOP_INSIDE) {
                m90558c.f28146c = 1.0f;
                m90558c.f28147d = 0.5f;
                mo8933g(canvas, this.f106125a.m106378i() - m93270d, m90558c);
            } else if (this.f112153h.m12530Q() == C49149tH6.EnumC28671a.BOTTOM) {
                m90558c.f28146c = 1.0f;
                m90558c.f28147d = 0.5f;
                mo8933g(canvas, this.f106125a.m106379h() - m93270d, m90558c);
            } else if (this.f112153h.m12530Q() == C49149tH6.EnumC28671a.BOTTOM_INSIDE) {
                m90558c.f28146c = 1.0f;
                m90558c.f28147d = 0.5f;
                mo8933g(canvas, this.f106125a.m106379h() + m93270d, m90558c);
            } else {
                m90558c.f28146c = 0.0f;
                m90558c.f28147d = 0.5f;
                mo8933g(canvas, this.f106125a.m106378i() + m93270d, m90558c);
                m90558c.f28146c = 1.0f;
                m90558c.f28147d = 0.5f;
                mo8933g(canvas, this.f106125a.m106379h() - m93270d, m90558c);
            }
            PE2.m90555f(m90558c);
        }
    }

    @Override // p000.C49742uH6
    /* renamed from: j */
    public void mo8931j(Canvas canvas) {
        if (this.f112153h.m76123x() && this.f112153h.m93268f()) {
            this.f47609f.setColor(this.f112153h.m76136k());
            this.f47609f.setStrokeWidth(this.f112153h.m76134m());
            if (this.f112153h.m12530Q() == C49149tH6.EnumC28671a.TOP || this.f112153h.m12530Q() == C49149tH6.EnumC28671a.TOP_INSIDE || this.f112153h.m12530Q() == C49149tH6.EnumC28671a.BOTH_SIDED) {
                canvas.drawLine(this.f106125a.m106378i(), this.f106125a.m106377j(), this.f106125a.m106378i(), this.f106125a.m106381f(), this.f47609f);
            }
            if (this.f112153h.m12530Q() == C49149tH6.EnumC28671a.BOTTOM || this.f112153h.m12530Q() == C49149tH6.EnumC28671a.BOTTOM_INSIDE || this.f112153h.m12530Q() == C49149tH6.EnumC28671a.BOTH_SIDED) {
                canvas.drawLine(this.f106125a.m106379h(), this.f106125a.m106377j(), this.f106125a.m106379h(), this.f106125a.m106381f(), this.f47609f);
            }
        }
    }

    @Override // p000.C49742uH6
    /* renamed from: n */
    public void mo7040n(Canvas canvas) {
        List<C38203ar2> m76127t = this.f112153h.m76127t();
        if (m76127t != null && m76127t.size() > 0) {
            float[] fArr = this.f112157l;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            Path path = this.f113800q;
            path.reset();
            for (int i = 0; i < m76127t.size(); i++) {
                C38203ar2 c38203ar2 = m76127t.get(i);
                if (c38203ar2.m93268f()) {
                    int save = canvas.save();
                    this.f112158m.set(this.f106125a.m106372o());
                    this.f112158m.inset(0.0f, -c38203ar2.m65383o());
                    canvas.clipRect(this.f112158m);
                    this.f47610g.setStyle(Paint.Style.STROKE);
                    this.f47610g.setColor(c38203ar2.m65384n());
                    this.f47610g.setStrokeWidth(c38203ar2.m65383o());
                    this.f47610g.setPathEffect(c38203ar2.m65388j());
                    fArr[1] = c38203ar2.m65385m();
                    this.f47606c.m110827k(fArr);
                    path.moveTo(this.f106125a.m106379h(), fArr[1]);
                    path.lineTo(this.f106125a.m106378i(), fArr[1]);
                    canvas.drawPath(path, this.f47610g);
                    path.reset();
                    String m65387k = c38203ar2.m65387k();
                    if (m65387k != null && !m65387k.equals("")) {
                        this.f47610g.setStyle(c38203ar2.m65382p());
                        this.f47610g.setPathEffect(null);
                        this.f47610g.setColor(c38203ar2.m93273a());
                        this.f47610g.setStrokeWidth(0.5f);
                        this.f47610g.setTextSize(c38203ar2.m93272b());
                        float m91660a = AbstractC34967Oi6.m91660a(this.f47610g, m65387k);
                        float m91656e = AbstractC34967Oi6.m91656e(4.0f) + c38203ar2.m93270d();
                        float m65383o = c38203ar2.m65383o() + m91660a + c38203ar2.m93269e();
                        C38203ar2.EnumC12183a m65386l = c38203ar2.m65386l();
                        if (m65386l == C38203ar2.EnumC12183a.RIGHT_TOP) {
                            this.f47610g.setTextAlign(Paint.Align.RIGHT);
                            canvas.drawText(m65387k, this.f106125a.m106378i() - m91656e, (fArr[1] - m65383o) + m91660a, this.f47610g);
                        } else if (m65386l == C38203ar2.EnumC12183a.RIGHT_BOTTOM) {
                            this.f47610g.setTextAlign(Paint.Align.RIGHT);
                            canvas.drawText(m65387k, this.f106125a.m106378i() - m91656e, fArr[1] + m65383o, this.f47610g);
                        } else if (m65386l == C38203ar2.EnumC12183a.LEFT_TOP) {
                            this.f47610g.setTextAlign(Paint.Align.LEFT);
                            canvas.drawText(m65387k, this.f106125a.m106379h() + m91656e, (fArr[1] - m65383o) + m91660a, this.f47610g);
                        } else {
                            this.f47610g.setTextAlign(Paint.Align.LEFT);
                            canvas.drawText(m65387k, this.f106125a.m106401G() + m91656e, fArr[1] + m65383o, this.f47610g);
                        }
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
    }
}

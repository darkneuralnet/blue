package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.List;
import p000.C38203ar2;
import p000.C49149tH6;
/* renamed from: uH6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C49742uH6 extends AbstractC10074Yu {

    /* renamed from: h */
    public C49149tH6 f112153h;

    /* renamed from: i */
    public Path f112154i;

    /* renamed from: j */
    public float[] f112155j;

    /* renamed from: k */
    public RectF f112156k;

    /* renamed from: l */
    public float[] f112157l;

    /* renamed from: m */
    public RectF f112158m;

    /* renamed from: n */
    public float[] f112159n;

    /* renamed from: o */
    public Path f112160o;

    public C49742uH6(C32951Fs6 c32951Fs6, C49149tH6 c49149tH6, D96 d96) {
        super(c32951Fs6, d96, c49149tH6);
        this.f112154i = new Path();
        this.f112155j = new float[2];
        this.f112156k = new RectF();
        this.f112157l = new float[2];
        this.f112158m = new RectF();
        this.f112159n = new float[4];
        this.f112160o = new Path();
        this.f112153h = c49149tH6;
        this.f47608e.setColor(-16777216);
        this.f47608e.setTextAlign(Paint.Align.CENTER);
        this.f47608e.setTextSize(AbstractC34967Oi6.m91656e(10.0f));
    }

    @Override // p000.AbstractC10074Yu
    /* renamed from: a */
    public void mo8936a(float f, float f2, boolean z) {
        float f3;
        double d;
        if (this.f106125a.m106376k() > 10.0f && !this.f106125a.m106365v()) {
            OE2 m110831g = this.f47606c.m110831g(this.f106125a.m106379h(), this.f106125a.m106377j());
            OE2 m110831g2 = this.f47606c.m110831g(this.f106125a.m106378i(), this.f106125a.m106377j());
            if (z) {
                f3 = (float) m110831g2.f26254c;
                d = m110831g.f26254c;
            } else {
                f3 = (float) m110831g.f26254c;
                d = m110831g2.f26254c;
            }
            OE2.m92597c(m110831g);
            OE2.m92597c(m110831g2);
            f = f3;
            f2 = (float) d;
        }
        mo10483b(f, f2);
    }

    @Override // p000.AbstractC10074Yu
    /* renamed from: b */
    public void mo10483b(float f, float f2) {
        super.mo10483b(f, f2);
        mo8935d();
    }

    /* renamed from: d */
    public void mo8935d() {
        String m76126u = this.f112153h.m76126u();
        this.f47608e.setTypeface(this.f112153h.m93271c());
        this.f47608e.setTextSize(this.f112153h.m93272b());
        C37536Zi1 m91659b = AbstractC34967Oi6.m91659b(this.f47608e, m76126u);
        float f = m91659b.f48979c;
        float m91660a = AbstractC34967Oi6.m91660a(this.f47608e, "Q");
        C37536Zi1 m91641t = AbstractC34967Oi6.m91641t(f, m91660a, this.f112153h.m12531P());
        this.f112153h.f110252J = Math.round(f);
        this.f112153h.f110253K = Math.round(m91660a);
        this.f112153h.f110254L = Math.round(m91641t.f48979c);
        this.f112153h.f110255M = Math.round(m91641t.f48980d);
        C37536Zi1.m72660c(m91641t);
        C37536Zi1.m72660c(m91659b);
    }

    /* renamed from: e */
    public void mo8934e(Canvas canvas, float f, float f2, Path path) {
        path.moveTo(f, this.f106125a.m106381f());
        path.lineTo(f, this.f106125a.m106377j());
        canvas.drawPath(path, this.f47607d);
        path.reset();
    }

    /* renamed from: f */
    public void m10482f(Canvas canvas, String str, float f, float f2, PE2 pe2, float f3) {
        AbstractC34967Oi6.m91654g(canvas, str, f, f2, this.f47608e, pe2, f3);
    }

    /* renamed from: g */
    public void mo8933g(Canvas canvas, float f, PE2 pe2) {
        float m12531P = this.f112153h.m12531P();
        boolean m76124w = this.f112153h.m76124w();
        int i = this.f112153h.f44180n * 2;
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2 += 2) {
            if (m76124w) {
                fArr[i2] = this.f112153h.f44179m[i2 / 2];
            } else {
                fArr[i2] = this.f112153h.f44178l[i2 / 2];
            }
        }
        this.f47606c.m110827k(fArr);
        for (int i3 = 0; i3 < i; i3 += 2) {
            float f2 = fArr[i3];
            if (this.f106125a.m106405C(f2)) {
                AbstractC33806Jj6 m76125v = this.f112153h.m76125v();
                C49149tH6 c49149tH6 = this.f112153h;
                int i4 = i3 / 2;
                String mo58186a = m76125v.mo58186a(c49149tH6.f44178l[i4], c49149tH6);
                if (this.f112153h.m12529R()) {
                    int i5 = this.f112153h.f44180n;
                    if (i4 == i5 - 1 && i5 > 1) {
                        float m91657d = AbstractC34967Oi6.m91657d(this.f47608e, mo58186a);
                        if (m91657d > this.f106125a.m106400H() * 2.0f && f2 + m91657d > this.f106125a.m106374m()) {
                            f2 -= m91657d / 2.0f;
                        }
                    } else if (i3 == 0) {
                        f2 += AbstractC34967Oi6.m91657d(this.f47608e, mo58186a) / 2.0f;
                    }
                }
                m10482f(canvas, mo58186a, f2, f, pe2, m12531P);
            }
        }
    }

    /* renamed from: h */
    public RectF mo8932h() {
        this.f112156k.set(this.f106125a.m106372o());
        this.f112156k.inset(-this.f47605b.m76129r(), 0.0f);
        return this.f112156k;
    }

    /* renamed from: i */
    public void mo7041i(Canvas canvas) {
        if (this.f112153h.m93268f() && this.f112153h.m76152A()) {
            float m93269e = this.f112153h.m93269e();
            this.f47608e.setTypeface(this.f112153h.m93271c());
            this.f47608e.setTextSize(this.f112153h.m93272b());
            this.f47608e.setColor(this.f112153h.m93273a());
            PE2 m90558c = PE2.m90558c(0.0f, 0.0f);
            if (this.f112153h.m12530Q() == C49149tH6.EnumC28671a.TOP) {
                m90558c.f28146c = 0.5f;
                m90558c.f28147d = 1.0f;
                mo8933g(canvas, this.f106125a.m106377j() - m93269e, m90558c);
            } else if (this.f112153h.m12530Q() == C49149tH6.EnumC28671a.TOP_INSIDE) {
                m90558c.f28146c = 0.5f;
                m90558c.f28147d = 1.0f;
                mo8933g(canvas, this.f106125a.m106377j() + m93269e + this.f112153h.f110255M, m90558c);
            } else if (this.f112153h.m12530Q() == C49149tH6.EnumC28671a.BOTTOM) {
                m90558c.f28146c = 0.5f;
                m90558c.f28147d = 0.0f;
                mo8933g(canvas, this.f106125a.m106381f() + m93269e, m90558c);
            } else if (this.f112153h.m12530Q() == C49149tH6.EnumC28671a.BOTTOM_INSIDE) {
                m90558c.f28146c = 0.5f;
                m90558c.f28147d = 0.0f;
                mo8933g(canvas, (this.f106125a.m106381f() - m93269e) - this.f112153h.f110255M, m90558c);
            } else {
                m90558c.f28146c = 0.5f;
                m90558c.f28147d = 1.0f;
                mo8933g(canvas, this.f106125a.m106377j() - m93269e, m90558c);
                m90558c.f28146c = 0.5f;
                m90558c.f28147d = 0.0f;
                mo8933g(canvas, this.f106125a.m106381f() + m93269e, m90558c);
            }
            PE2.m90555f(m90558c);
        }
    }

    /* renamed from: j */
    public void mo8931j(Canvas canvas) {
        if (this.f112153h.m76123x() && this.f112153h.m93268f()) {
            this.f47609f.setColor(this.f112153h.m76136k());
            this.f47609f.setStrokeWidth(this.f112153h.m76134m());
            this.f47609f.setPathEffect(this.f112153h.m76135l());
            if (this.f112153h.m12530Q() == C49149tH6.EnumC28671a.TOP || this.f112153h.m12530Q() == C49149tH6.EnumC28671a.TOP_INSIDE || this.f112153h.m12530Q() == C49149tH6.EnumC28671a.BOTH_SIDED) {
                canvas.drawLine(this.f106125a.m106379h(), this.f106125a.m106377j(), this.f106125a.m106378i(), this.f106125a.m106377j(), this.f47609f);
            }
            if (this.f112153h.m12530Q() == C49149tH6.EnumC28671a.BOTTOM || this.f112153h.m12530Q() == C49149tH6.EnumC28671a.BOTTOM_INSIDE || this.f112153h.m12530Q() == C49149tH6.EnumC28671a.BOTH_SIDED) {
                canvas.drawLine(this.f106125a.m106379h(), this.f106125a.m106381f(), this.f106125a.m106378i(), this.f106125a.m106381f(), this.f47609f);
            }
        }
    }

    /* renamed from: k */
    public void m10481k(Canvas canvas) {
        if (this.f112153h.m76121z() && this.f112153h.m93268f()) {
            int save = canvas.save();
            canvas.clipRect(mo8932h());
            if (this.f112155j.length != this.f47605b.f44180n * 2) {
                this.f112155j = new float[this.f112153h.f44180n * 2];
            }
            float[] fArr = this.f112155j;
            for (int i = 0; i < fArr.length; i += 2) {
                float[] fArr2 = this.f112153h.f44178l;
                int i2 = i / 2;
                fArr[i] = fArr2[i2];
                fArr[i + 1] = fArr2[i2];
            }
            this.f47606c.m110827k(fArr);
            m10478o();
            Path path = this.f112154i;
            path.reset();
            for (int i3 = 0; i3 < fArr.length; i3 += 2) {
                mo8934e(canvas, fArr[i3], fArr[i3 + 1], path);
            }
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: l */
    public void m10480l(Canvas canvas, C38203ar2 c38203ar2, float[] fArr, float f) {
        String m65387k = c38203ar2.m65387k();
        if (m65387k != null && !m65387k.equals("")) {
            this.f47610g.setStyle(c38203ar2.m65382p());
            this.f47610g.setPathEffect(null);
            this.f47610g.setColor(c38203ar2.m93273a());
            this.f47610g.setStrokeWidth(0.5f);
            this.f47610g.setTextSize(c38203ar2.m93272b());
            float m65383o = c38203ar2.m65383o() + c38203ar2.m93270d();
            C38203ar2.EnumC12183a m65386l = c38203ar2.m65386l();
            if (m65386l == C38203ar2.EnumC12183a.RIGHT_TOP) {
                this.f47610g.setTextAlign(Paint.Align.LEFT);
                canvas.drawText(m65387k, fArr[0] + m65383o, this.f106125a.m106377j() + f + AbstractC34967Oi6.m91660a(this.f47610g, m65387k), this.f47610g);
            } else if (m65386l == C38203ar2.EnumC12183a.RIGHT_BOTTOM) {
                this.f47610g.setTextAlign(Paint.Align.LEFT);
                canvas.drawText(m65387k, fArr[0] + m65383o, this.f106125a.m106381f() - f, this.f47610g);
            } else if (m65386l == C38203ar2.EnumC12183a.LEFT_TOP) {
                this.f47610g.setTextAlign(Paint.Align.RIGHT);
                canvas.drawText(m65387k, fArr[0] - m65383o, this.f106125a.m106377j() + f + AbstractC34967Oi6.m91660a(this.f47610g, m65387k), this.f47610g);
            } else {
                this.f47610g.setTextAlign(Paint.Align.RIGHT);
                canvas.drawText(m65387k, fArr[0] - m65383o, this.f106125a.m106381f() - f, this.f47610g);
            }
        }
    }

    /* renamed from: m */
    public void m10479m(Canvas canvas, C38203ar2 c38203ar2, float[] fArr) {
        float[] fArr2 = this.f112159n;
        fArr2[0] = fArr[0];
        fArr2[1] = this.f106125a.m106377j();
        float[] fArr3 = this.f112159n;
        fArr3[2] = fArr[0];
        fArr3[3] = this.f106125a.m106381f();
        this.f112160o.reset();
        Path path = this.f112160o;
        float[] fArr4 = this.f112159n;
        path.moveTo(fArr4[0], fArr4[1]);
        Path path2 = this.f112160o;
        float[] fArr5 = this.f112159n;
        path2.lineTo(fArr5[2], fArr5[3]);
        this.f47610g.setStyle(Paint.Style.STROKE);
        this.f47610g.setColor(c38203ar2.m65384n());
        this.f47610g.setStrokeWidth(c38203ar2.m65383o());
        this.f47610g.setPathEffect(c38203ar2.m65388j());
        canvas.drawPath(this.f112160o, this.f47610g);
    }

    /* renamed from: n */
    public void mo7040n(Canvas canvas) {
        List<C38203ar2> m76127t = this.f112153h.m76127t();
        if (m76127t != null && m76127t.size() > 0) {
            float[] fArr = this.f112157l;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            for (int i = 0; i < m76127t.size(); i++) {
                C38203ar2 c38203ar2 = m76127t.get(i);
                if (c38203ar2.m93268f()) {
                    int save = canvas.save();
                    this.f112158m.set(this.f106125a.m106372o());
                    this.f112158m.inset(-c38203ar2.m65383o(), 0.0f);
                    canvas.clipRect(this.f112158m);
                    fArr[0] = c38203ar2.m65385m();
                    fArr[1] = 0.0f;
                    this.f47606c.m110827k(fArr);
                    m10479m(canvas, c38203ar2, fArr);
                    m10480l(canvas, c38203ar2, fArr, c38203ar2.m93269e() + 2.0f);
                    canvas.restoreToCount(save);
                }
            }
        }
    }

    /* renamed from: o */
    public void m10478o() {
        this.f47607d.setColor(this.f112153h.m76131p());
        this.f47607d.setStrokeWidth(this.f112153h.m76129r());
        this.f47607d.setPathEffect(this.f112153h.m76130q());
    }
}

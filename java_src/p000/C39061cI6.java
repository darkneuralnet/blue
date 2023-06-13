package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.List;
import p000.C37875aI6;
import p000.C38203ar2;
/* renamed from: cI6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C39061cI6 extends C38468bI6 {

    /* renamed from: r */
    public Path f60366r;

    /* renamed from: s */
    public Path f60367s;

    /* renamed from: t */
    public float[] f60368t;

    public C39061cI6(C32951Fs6 c32951Fs6, C37875aI6 c37875aI6, D96 d96) {
        super(c32951Fs6, c37875aI6, d96);
        this.f60366r = new Path();
        this.f60367s = new Path();
        this.f60368t = new float[4];
        this.f47610g.setTextAlign(Paint.Align.LEFT);
    }

    @Override // p000.AbstractC10074Yu
    /* renamed from: a */
    public void mo8936a(float f, float f2, boolean z) {
        float f3;
        double d;
        if (this.f106125a.m106380g() > 10.0f && !this.f106125a.m106365v()) {
            OE2 m110831g = this.f47606c.m110831g(this.f106125a.m106379h(), this.f106125a.m106377j());
            OE2 m110831g2 = this.f47606c.m110831g(this.f106125a.m106378i(), this.f106125a.m106377j());
            if (!z) {
                f3 = (float) m110831g.f26254c;
                d = m110831g2.f26254c;
            } else {
                f3 = (float) m110831g2.f26254c;
                d = m110831g.f26254c;
            }
            OE2.m92597c(m110831g);
            OE2.m92597c(m110831g2);
            f = f3;
            f2 = (float) d;
        }
        mo10483b(f, f2);
    }

    @Override // p000.C38468bI6
    /* renamed from: d */
    public void mo61613d(Canvas canvas, float f, float[] fArr, float f2) {
        this.f47608e.setTypeface(this.f57244h.m93271c());
        this.f47608e.setTextSize(this.f57244h.m93272b());
        this.f47608e.setColor(this.f57244h.m93273a());
        int i = this.f57244h.m71679a0() ? this.f57244h.f44180n : this.f57244h.f44180n - 1;
        for (int i2 = !this.f57244h.m71680Z(); i2 < i; i2++) {
            canvas.drawText(this.f57244h.m76133n(i2), fArr[i2 * 2], f - f2, this.f47608e);
        }
    }

    @Override // p000.C38468bI6
    /* renamed from: e */
    public void mo61612e(Canvas canvas) {
        int save = canvas.save();
        this.f57250n.set(this.f106125a.m106372o());
        this.f57250n.inset(-this.f57244h.m71681Y(), 0.0f);
        canvas.clipRect(this.f57253q);
        OE2 m110833e = this.f47606c.m110833e(0.0f, 0.0f);
        this.f57245i.setColor(this.f57244h.m71682X());
        this.f57245i.setStrokeWidth(this.f57244h.m71681Y());
        Path path = this.f60366r;
        path.reset();
        path.moveTo(((float) m110833e.f26254c) - 1.0f, this.f106125a.m106377j());
        path.lineTo(((float) m110833e.f26254c) - 1.0f, this.f106125a.m106381f());
        canvas.drawPath(path, this.f57245i);
        canvas.restoreToCount(save);
    }

    @Override // p000.C38468bI6
    /* renamed from: f */
    public RectF mo61611f() {
        this.f57247k.set(this.f106125a.m106372o());
        this.f57247k.inset(-this.f47605b.m76129r(), 0.0f);
        return this.f57247k;
    }

    @Override // p000.C38468bI6
    /* renamed from: g */
    public float[] mo61610g() {
        int length = this.f57248l.length;
        int i = this.f57244h.f44180n;
        if (length != i * 2) {
            this.f57248l = new float[i * 2];
        }
        float[] fArr = this.f57248l;
        for (int i2 = 0; i2 < fArr.length; i2 += 2) {
            fArr[i2] = this.f57244h.f44178l[i2 / 2];
        }
        this.f47606c.m110827k(fArr);
        return fArr;
    }

    @Override // p000.C38468bI6
    /* renamed from: h */
    public Path mo61609h(Path path, int i, float[] fArr) {
        path.moveTo(fArr[i], this.f106125a.m106377j());
        path.lineTo(fArr[i], this.f106125a.m106381f());
        return path;
    }

    @Override // p000.C38468bI6
    /* renamed from: i */
    public void mo44408i(Canvas canvas) {
        float m106381f;
        float f;
        float m106377j;
        if (this.f57244h.m93268f() && this.f57244h.m76152A()) {
            float[] mo61610g = mo61610g();
            this.f47608e.setTypeface(this.f57244h.m93271c());
            this.f47608e.setTextSize(this.f57244h.m93272b());
            this.f47608e.setColor(this.f57244h.m93273a());
            this.f47608e.setTextAlign(Paint.Align.CENTER);
            float m91656e = AbstractC34967Oi6.m91656e(2.5f);
            float m91660a = AbstractC34967Oi6.m91660a(this.f47608e, "Q");
            C37875aI6.EnumC10624a m71690P = this.f57244h.m71690P();
            C37875aI6.EnumC10625b m71689Q = this.f57244h.m71689Q();
            if (m71690P == C37875aI6.EnumC10624a.LEFT) {
                if (m71689Q == C37875aI6.EnumC10625b.OUTSIDE_CHART) {
                    m106377j = this.f106125a.m106377j();
                } else {
                    m106377j = this.f106125a.m106377j();
                }
                f = m106377j - m91656e;
            } else {
                if (m71689Q == C37875aI6.EnumC10625b.OUTSIDE_CHART) {
                    m106381f = this.f106125a.m106381f();
                } else {
                    m106381f = this.f106125a.m106381f();
                }
                f = m106381f + m91660a + m91656e;
            }
            mo61613d(canvas, f, mo61610g, this.f57244h.m93269e());
        }
    }

    @Override // p000.C38468bI6
    /* renamed from: j */
    public void mo61608j(Canvas canvas) {
        if (this.f57244h.m93268f() && this.f57244h.m76123x()) {
            this.f47609f.setColor(this.f57244h.m76136k());
            this.f47609f.setStrokeWidth(this.f57244h.m76134m());
            if (this.f57244h.m71690P() == C37875aI6.EnumC10624a.LEFT) {
                canvas.drawLine(this.f106125a.m106379h(), this.f106125a.m106377j(), this.f106125a.m106378i(), this.f106125a.m106377j(), this.f47609f);
            } else {
                canvas.drawLine(this.f106125a.m106379h(), this.f106125a.m106381f(), this.f106125a.m106378i(), this.f106125a.m106381f(), this.f47609f);
            }
        }
    }

    @Override // p000.C38468bI6
    /* renamed from: l */
    public void mo44407l(Canvas canvas) {
        List<C38203ar2> m76127t = this.f57244h.m76127t();
        if (m76127t != null && m76127t.size() > 0) {
            float[] fArr = this.f60368t;
            float f = 0.0f;
            fArr[0] = 0.0f;
            char c = 1;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            Path path = this.f60367s;
            path.reset();
            int i = 0;
            while (i < m76127t.size()) {
                C38203ar2 c38203ar2 = m76127t.get(i);
                if (c38203ar2.m93268f()) {
                    int save = canvas.save();
                    this.f57253q.set(this.f106125a.m106372o());
                    this.f57253q.inset(-c38203ar2.m65383o(), f);
                    canvas.clipRect(this.f57253q);
                    fArr[0] = c38203ar2.m65385m();
                    fArr[2] = c38203ar2.m65385m();
                    this.f47606c.m110827k(fArr);
                    fArr[c] = this.f106125a.m106377j();
                    fArr[3] = this.f106125a.m106381f();
                    path.moveTo(fArr[0], fArr[c]);
                    path.lineTo(fArr[2], fArr[3]);
                    this.f47610g.setStyle(Paint.Style.STROKE);
                    this.f47610g.setColor(c38203ar2.m65384n());
                    this.f47610g.setPathEffect(c38203ar2.m65388j());
                    this.f47610g.setStrokeWidth(c38203ar2.m65383o());
                    canvas.drawPath(path, this.f47610g);
                    path.reset();
                    String m65387k = c38203ar2.m65387k();
                    if (m65387k != null && !m65387k.equals("")) {
                        this.f47610g.setStyle(c38203ar2.m65382p());
                        this.f47610g.setPathEffect(null);
                        this.f47610g.setColor(c38203ar2.m93273a());
                        this.f47610g.setTypeface(c38203ar2.m93271c());
                        this.f47610g.setStrokeWidth(0.5f);
                        this.f47610g.setTextSize(c38203ar2.m93272b());
                        float m65383o = c38203ar2.m65383o() + c38203ar2.m93270d();
                        float m91656e = AbstractC34967Oi6.m91656e(2.0f) + c38203ar2.m93269e();
                        C38203ar2.EnumC12183a m65386l = c38203ar2.m65386l();
                        if (m65386l == C38203ar2.EnumC12183a.RIGHT_TOP) {
                            this.f47610g.setTextAlign(Paint.Align.LEFT);
                            canvas.drawText(m65387k, fArr[0] + m65383o, this.f106125a.m106377j() + m91656e + AbstractC34967Oi6.m91660a(this.f47610g, m65387k), this.f47610g);
                        } else if (m65386l == C38203ar2.EnumC12183a.RIGHT_BOTTOM) {
                            this.f47610g.setTextAlign(Paint.Align.LEFT);
                            canvas.drawText(m65387k, fArr[0] + m65383o, this.f106125a.m106381f() - m91656e, this.f47610g);
                        } else if (m65386l == C38203ar2.EnumC12183a.LEFT_TOP) {
                            this.f47610g.setTextAlign(Paint.Align.RIGHT);
                            canvas.drawText(m65387k, fArr[0] - m65383o, this.f106125a.m106377j() + m91656e + AbstractC34967Oi6.m91660a(this.f47610g, m65387k), this.f47610g);
                        } else {
                            this.f47610g.setTextAlign(Paint.Align.RIGHT);
                            canvas.drawText(m65387k, fArr[0] - m65383o, this.f106125a.m106381f() - m91656e, this.f47610g);
                        }
                    }
                    canvas.restoreToCount(save);
                }
                i++;
                f = 0.0f;
                c = 1;
            }
        }
    }
}

package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.List;
import p000.C37875aI6;
import p000.C38203ar2;
/* renamed from: bI6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C38468bI6 extends AbstractC10074Yu {

    /* renamed from: h */
    public C37875aI6 f57244h;

    /* renamed from: i */
    public Paint f57245i;

    /* renamed from: j */
    public Path f57246j;

    /* renamed from: k */
    public RectF f57247k;

    /* renamed from: l */
    public float[] f57248l;

    /* renamed from: m */
    public Path f57249m;

    /* renamed from: n */
    public RectF f57250n;

    /* renamed from: o */
    public Path f57251o;

    /* renamed from: p */
    public float[] f57252p;

    /* renamed from: q */
    public RectF f57253q;

    public C38468bI6(C32951Fs6 c32951Fs6, C37875aI6 c37875aI6, D96 d96) {
        super(c32951Fs6, d96, c37875aI6);
        this.f57246j = new Path();
        this.f57247k = new RectF();
        this.f57248l = new float[2];
        this.f57249m = new Path();
        this.f57250n = new RectF();
        this.f57251o = new Path();
        this.f57252p = new float[2];
        this.f57253q = new RectF();
        this.f57244h = c37875aI6;
        if (this.f106125a != null) {
            this.f47608e.setColor(-16777216);
            this.f47608e.setTextSize(AbstractC34967Oi6.m91656e(10.0f));
            Paint paint = new Paint(1);
            this.f57245i = paint;
            paint.setColor(-7829368);
            this.f57245i.setStrokeWidth(1.0f);
            this.f57245i.setStyle(Paint.Style.STROKE);
        }
    }

    /* renamed from: d */
    public void mo61613d(Canvas canvas, float f, float[] fArr, float f2) {
        int i = this.f57244h.m71679a0() ? this.f57244h.f44180n : this.f57244h.f44180n - 1;
        for (int i2 = !this.f57244h.m71680Z(); i2 < i; i2++) {
            canvas.drawText(this.f57244h.m76133n(i2), f, fArr[(i2 * 2) + 1] + f2, this.f47608e);
        }
    }

    /* renamed from: e */
    public void mo61612e(Canvas canvas) {
        int save = canvas.save();
        this.f57250n.set(this.f106125a.m106372o());
        this.f57250n.inset(0.0f, -this.f57244h.m71681Y());
        canvas.clipRect(this.f57250n);
        OE2 m110833e = this.f47606c.m110833e(0.0f, 0.0f);
        this.f57245i.setColor(this.f57244h.m71682X());
        this.f57245i.setStrokeWidth(this.f57244h.m71681Y());
        Path path = this.f57249m;
        path.reset();
        path.moveTo(this.f106125a.m106379h(), (float) m110833e.f26255d);
        path.lineTo(this.f106125a.m106378i(), (float) m110833e.f26255d);
        canvas.drawPath(path, this.f57245i);
        canvas.restoreToCount(save);
    }

    /* renamed from: f */
    public RectF mo61611f() {
        this.f57247k.set(this.f106125a.m106372o());
        this.f57247k.inset(0.0f, -this.f47605b.m76129r());
        return this.f57247k;
    }

    /* renamed from: g */
    public float[] mo61610g() {
        int length = this.f57248l.length;
        int i = this.f57244h.f44180n;
        if (length != i * 2) {
            this.f57248l = new float[i * 2];
        }
        float[] fArr = this.f57248l;
        for (int i2 = 0; i2 < fArr.length; i2 += 2) {
            fArr[i2 + 1] = this.f57244h.f44178l[i2 / 2];
        }
        this.f47606c.m110827k(fArr);
        return fArr;
    }

    /* renamed from: h */
    public Path mo61609h(Path path, int i, float[] fArr) {
        int i2 = i + 1;
        path.moveTo(this.f106125a.m106401G(), fArr[i2]);
        path.lineTo(this.f106125a.m106378i(), fArr[i2]);
        return path;
    }

    /* renamed from: i */
    public void mo44408i(Canvas canvas) {
        float m106378i;
        float m106378i2;
        float f;
        if (this.f57244h.m93268f() && this.f57244h.m76152A()) {
            float[] mo61610g = mo61610g();
            this.f47608e.setTypeface(this.f57244h.m93271c());
            this.f47608e.setTextSize(this.f57244h.m93272b());
            this.f47608e.setColor(this.f57244h.m93273a());
            float m93270d = this.f57244h.m93270d();
            float m91660a = (AbstractC34967Oi6.m91660a(this.f47608e, "A") / 2.5f) + this.f57244h.m93269e();
            C37875aI6.EnumC10624a m71690P = this.f57244h.m71690P();
            C37875aI6.EnumC10625b m71689Q = this.f57244h.m71689Q();
            if (m71690P == C37875aI6.EnumC10624a.LEFT) {
                if (m71689Q == C37875aI6.EnumC10625b.OUTSIDE_CHART) {
                    this.f47608e.setTextAlign(Paint.Align.RIGHT);
                    m106378i = this.f106125a.m106401G();
                    f = m106378i - m93270d;
                } else {
                    this.f47608e.setTextAlign(Paint.Align.LEFT);
                    m106378i2 = this.f106125a.m106401G();
                    f = m106378i2 + m93270d;
                }
            } else if (m71689Q == C37875aI6.EnumC10625b.OUTSIDE_CHART) {
                this.f47608e.setTextAlign(Paint.Align.LEFT);
                m106378i2 = this.f106125a.m106378i();
                f = m106378i2 + m93270d;
            } else {
                this.f47608e.setTextAlign(Paint.Align.RIGHT);
                m106378i = this.f106125a.m106378i();
                f = m106378i - m93270d;
            }
            mo61613d(canvas, f, mo61610g, m91660a);
        }
    }

    /* renamed from: j */
    public void mo61608j(Canvas canvas) {
        if (this.f57244h.m93268f() && this.f57244h.m76123x()) {
            this.f47609f.setColor(this.f57244h.m76136k());
            this.f47609f.setStrokeWidth(this.f57244h.m76134m());
            if (this.f57244h.m71690P() == C37875aI6.EnumC10624a.LEFT) {
                canvas.drawLine(this.f106125a.m106379h(), this.f106125a.m106377j(), this.f106125a.m106379h(), this.f106125a.m106381f(), this.f47609f);
            } else {
                canvas.drawLine(this.f106125a.m106378i(), this.f106125a.m106377j(), this.f106125a.m106378i(), this.f106125a.m106381f(), this.f47609f);
            }
        }
    }

    /* renamed from: k */
    public void m64695k(Canvas canvas) {
        if (!this.f57244h.m93268f()) {
            return;
        }
        if (this.f57244h.m76121z()) {
            int save = canvas.save();
            canvas.clipRect(mo61611f());
            float[] mo61610g = mo61610g();
            this.f47607d.setColor(this.f57244h.m76131p());
            this.f47607d.setStrokeWidth(this.f57244h.m76129r());
            this.f47607d.setPathEffect(this.f57244h.m76130q());
            Path path = this.f57246j;
            path.reset();
            for (int i = 0; i < mo61610g.length; i += 2) {
                canvas.drawPath(mo61609h(path, i, mo61610g), this.f47607d);
                path.reset();
            }
            canvas.restoreToCount(save);
        }
        if (this.f57244h.m71678b0()) {
            mo61612e(canvas);
        }
    }

    /* renamed from: l */
    public void mo44407l(Canvas canvas) {
        List<C38203ar2> m76127t = this.f57244h.m76127t();
        if (m76127t != null && m76127t.size() > 0) {
            float[] fArr = this.f57252p;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            Path path = this.f57251o;
            path.reset();
            for (int i = 0; i < m76127t.size(); i++) {
                C38203ar2 c38203ar2 = m76127t.get(i);
                if (c38203ar2.m93268f()) {
                    int save = canvas.save();
                    this.f57253q.set(this.f106125a.m106372o());
                    this.f57253q.inset(0.0f, -c38203ar2.m65383o());
                    canvas.clipRect(this.f57253q);
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
                        this.f47610g.setTypeface(c38203ar2.m93271c());
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

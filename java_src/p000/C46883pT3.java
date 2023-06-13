package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieEntry;
import java.lang.ref.WeakReference;
import java.util.List;
/* renamed from: pT3  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C46883pT3 extends RS0 {

    /* renamed from: g */
    public PieChart f103717g;

    /* renamed from: h */
    public Paint f103718h;

    /* renamed from: i */
    public Paint f103719i;

    /* renamed from: j */
    public Paint f103720j;

    /* renamed from: k */
    public TextPaint f103721k;

    /* renamed from: l */
    public Paint f103722l;

    /* renamed from: m */
    public StaticLayout f103723m;

    /* renamed from: n */
    public CharSequence f103724n;

    /* renamed from: o */
    public RectF f103725o;

    /* renamed from: p */
    public RectF[] f103726p;

    /* renamed from: q */
    public WeakReference<Bitmap> f103727q;

    /* renamed from: r */
    public Canvas f103728r;

    /* renamed from: s */
    public Path f103729s;

    /* renamed from: t */
    public RectF f103730t;

    /* renamed from: u */
    public Path f103731u;

    /* renamed from: v */
    public Path f103732v;

    /* renamed from: w */
    public RectF f103733w;

    public C46883pT3(PieChart pieChart, C42279hi0 c42279hi0, C32951Fs6 c32951Fs6) {
        super(c42279hi0, c32951Fs6);
        this.f103725o = new RectF();
        this.f103726p = new RectF[]{new RectF(), new RectF(), new RectF()};
        this.f103729s = new Path();
        this.f103730t = new RectF();
        this.f103731u = new Path();
        this.f103732v = new Path();
        this.f103733w = new RectF();
        this.f103717g = pieChart;
        Paint paint = new Paint(1);
        this.f103718h = paint;
        paint.setColor(-1);
        this.f103718h.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.f103719i = paint2;
        paint2.setColor(-1);
        this.f103719i.setStyle(Paint.Style.FILL);
        this.f103719i.setAlpha(105);
        TextPaint textPaint = new TextPaint(1);
        this.f103721k = textPaint;
        textPaint.setColor(-16777216);
        this.f103721k.setTextSize(AbstractC34967Oi6.m91656e(12.0f));
        this.f32039f.setTextSize(AbstractC34967Oi6.m91656e(13.0f));
        this.f32039f.setColor(-1);
        this.f32039f.setTextAlign(Paint.Align.CENTER);
        Paint paint3 = new Paint(1);
        this.f103722l = paint3;
        paint3.setColor(-1);
        this.f103722l.setTextAlign(Paint.Align.CENTER);
        this.f103722l.setTextSize(AbstractC34967Oi6.m91656e(13.0f));
        Paint paint4 = new Paint(1);
        this.f103720j = paint4;
        paint4.setStyle(Paint.Style.STROKE);
    }

    @Override // p000.RS0
    /* renamed from: b */
    public void mo15000b(Canvas canvas) {
        Bitmap bitmap;
        int m106374m = (int) this.f106125a.m106374m();
        int m106375l = (int) this.f106125a.m106375l();
        WeakReference<Bitmap> weakReference = this.f103727q;
        if (weakReference == null) {
            bitmap = null;
        } else {
            bitmap = weakReference.get();
        }
        if (bitmap == null || bitmap.getWidth() != m106374m || bitmap.getHeight() != m106375l) {
            if (m106374m > 0 && m106375l > 0) {
                bitmap = Bitmap.createBitmap(m106374m, m106375l, Bitmap.Config.ARGB_4444);
                this.f103727q = new WeakReference<>(bitmap);
                this.f103728r = new Canvas(bitmap);
            } else {
                return;
            }
        }
        bitmap.eraseColor(0);
        for (XO1 xo1 : ((C47476qT3) this.f103717g.getData()).m33552f()) {
            if (xo1.isVisible() && xo1.mo21241L0() > 0) {
                m19233j(canvas, xo1);
            }
        }
    }

    @Override // p000.RS0
    /* renamed from: c */
    public void mo14999c(Canvas canvas) {
        m19231l(canvas);
        canvas.drawBitmap(this.f103727q.get(), 0.0f, 0.0f, (Paint) null);
        m19234i(canvas);
    }

    @Override // p000.RS0
    /* renamed from: d */
    public void mo14998d(Canvas canvas, OM1[] om1Arr) {
        boolean z;
        float f;
        int i;
        RectF rectF;
        float f2;
        float[] fArr;
        boolean z2;
        float f3;
        float f4;
        PE2 pe2;
        XO1 mo17499d;
        float f5;
        int i2;
        float m77041m0;
        boolean z3;
        float f6;
        float f7;
        float f8;
        float[] fArr2;
        float f9;
        int i3;
        float f10;
        float f11;
        float f12;
        OM1[] om1Arr2 = om1Arr;
        if (this.f103717g.m51977y0() && !this.f103717g.m51995A0()) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.f103717g.m51976z0()) {
            return;
        }
        float m36088a = this.f32035b.m36088a();
        float m36087b = this.f32035b.m36087b();
        float m51969j0 = this.f103717g.m51969j0();
        float[] m51982t0 = this.f103717g.m51982t0();
        float[] m51988n0 = this.f103717g.m51988n0();
        PE2 m51987o0 = this.f103717g.m51987o0();
        float mo51963f0 = this.f103717g.mo51963f0();
        if (z) {
            f = (this.f103717g.m51981u0() / 100.0f) * mo51963f0;
        } else {
            f = 0.0f;
        }
        RectF rectF2 = this.f103733w;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        int i4 = 0;
        while (i4 < om1Arr2.length) {
            int m92387h = (int) om1Arr2[i4].m92387h();
            if (m92387h < m51982t0.length && (mo17499d = ((C47476qT3) this.f103717g.getData()).mo17499d(om1Arr2[i4].m92391d())) != null && mo17499d.mo4023Q()) {
                int mo21241L0 = mo17499d.mo21241L0();
                int i5 = 0;
                for (int i6 = 0; i6 < mo21241L0; i6++) {
                    if (Math.abs(mo17499d.mo21237h(i6).mo51938c()) > AbstractC34967Oi6.f27086e) {
                        i5++;
                    }
                }
                if (m92387h == 0) {
                    i2 = 1;
                    f5 = 0.0f;
                } else {
                    f5 = m51988n0[m92387h - 1] * m36088a;
                    i2 = 1;
                }
                if (i5 <= i2) {
                    m77041m0 = 0.0f;
                } else {
                    m77041m0 = mo17499d.m77041m0();
                }
                float f13 = m51982t0[m92387h];
                float m77039s = mo17499d.m77039s();
                int i7 = i4;
                float f14 = mo51963f0 + m77039s;
                float f15 = f;
                rectF2.set(this.f103717g.m51983s0());
                float f16 = -m77039s;
                rectF2.inset(f16, f16);
                if (m77041m0 > 0.0f && f13 <= 180.0f) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f32036c.setColor(mo17499d.mo4030A0(m92387h));
                if (i5 == 1) {
                    f6 = 0.0f;
                } else {
                    f6 = m77041m0 / (mo51963f0 * 0.017453292f);
                }
                if (i5 == 1) {
                    f7 = 0.0f;
                } else {
                    f7 = m77041m0 / (f14 * 0.017453292f);
                }
                float f17 = m51969j0 + (((f6 / 2.0f) + f5) * m36087b);
                float f18 = (f13 - f6) * m36087b;
                if (f18 < 0.0f) {
                    f8 = 0.0f;
                } else {
                    f8 = f18;
                }
                float f19 = (((f7 / 2.0f) + f5) * m36087b) + m51969j0;
                float f20 = (f13 - f7) * m36087b;
                if (f20 < 0.0f) {
                    f20 = 0.0f;
                }
                this.f103729s.reset();
                int i8 = (f8 > 360.0f ? 1 : (f8 == 360.0f ? 0 : -1));
                if (i8 >= 0 && f8 % 360.0f <= AbstractC34967Oi6.f27086e) {
                    this.f103729s.addCircle(m51987o0.f28146c, m51987o0.f28147d, f14, Path.Direction.CW);
                    fArr2 = m51982t0;
                    f9 = f5;
                    i3 = i5;
                    z2 = z;
                } else {
                    fArr2 = m51982t0;
                    f9 = f5;
                    double d = f19 * 0.017453292f;
                    i3 = i5;
                    z2 = z;
                    this.f103729s.moveTo(m51987o0.f28146c + (((float) Math.cos(d)) * f14), m51987o0.f28147d + (f14 * ((float) Math.sin(d))));
                    this.f103729s.arcTo(rectF2, f19, f20);
                }
                if (z3) {
                    double d2 = f17 * 0.017453292f;
                    i = i7;
                    rectF = rectF2;
                    f2 = f15;
                    pe2 = m51987o0;
                    fArr = fArr2;
                    f10 = m19235h(m51987o0, mo51963f0, f13 * m36087b, (((float) Math.cos(d2)) * mo51963f0) + m51987o0.f28146c, m51987o0.f28147d + (((float) Math.sin(d2)) * mo51963f0), f17, f8);
                } else {
                    rectF = rectF2;
                    pe2 = m51987o0;
                    i = i7;
                    f2 = f15;
                    fArr = fArr2;
                    f10 = 0.0f;
                }
                RectF rectF3 = this.f103730t;
                float f21 = pe2.f28146c;
                float f22 = pe2.f28147d;
                rectF3.set(f21 - f2, f22 - f2, f21 + f2, f22 + f2);
                if (z2 && (f2 > 0.0f || z3)) {
                    if (z3) {
                        if (f10 < 0.0f) {
                            f10 = -f10;
                        }
                        f11 = Math.max(f2, f10);
                    } else {
                        f11 = f2;
                    }
                    if (i3 != 1 && f11 != 0.0f) {
                        f12 = m77041m0 / (f11 * 0.017453292f);
                    } else {
                        f12 = 0.0f;
                    }
                    float f23 = ((f9 + (f12 / 2.0f)) * m36087b) + m51969j0;
                    float f24 = (f13 - f12) * m36087b;
                    if (f24 < 0.0f) {
                        f24 = 0.0f;
                    }
                    float f25 = f23 + f24;
                    if (i8 >= 0 && f8 % 360.0f <= AbstractC34967Oi6.f27086e) {
                        this.f103729s.addCircle(pe2.f28146c, pe2.f28147d, f11, Path.Direction.CCW);
                        f3 = m36088a;
                        f4 = m36087b;
                    } else {
                        double d3 = f25 * 0.017453292f;
                        f3 = m36088a;
                        f4 = m36087b;
                        this.f103729s.lineTo(pe2.f28146c + (((float) Math.cos(d3)) * f11), pe2.f28147d + (f11 * ((float) Math.sin(d3))));
                        this.f103729s.arcTo(this.f103730t, f25, -f24);
                    }
                } else {
                    f3 = m36088a;
                    f4 = m36087b;
                    if (f8 % 360.0f > AbstractC34967Oi6.f27086e) {
                        if (z3) {
                            double d4 = (f17 + (f8 / 2.0f)) * 0.017453292f;
                            this.f103729s.lineTo(pe2.f28146c + (((float) Math.cos(d4)) * f10), pe2.f28147d + (f10 * ((float) Math.sin(d4))));
                        } else {
                            this.f103729s.lineTo(pe2.f28146c, pe2.f28147d);
                        }
                    }
                }
                this.f103729s.close();
                this.f103728r.drawPath(this.f103729s, this.f32036c);
            } else {
                i = i4;
                rectF = rectF2;
                f2 = f;
                fArr = m51982t0;
                z2 = z;
                f3 = m36088a;
                f4 = m36087b;
                pe2 = m51987o0;
            }
            i4 = i + 1;
            m36088a = f3;
            rectF2 = rectF;
            f = f2;
            m51987o0 = pe2;
            m36087b = f4;
            m51982t0 = fArr;
            z = z2;
            om1Arr2 = om1Arr;
        }
        PE2.m90555f(m51987o0);
    }

    @Override // p000.RS0
    /* renamed from: e */
    public void mo14997e(Canvas canvas) {
        int i;
        float[] fArr;
        float[] fArr2;
        float f;
        float f2;
        float f3;
        List<XO1> list;
        PE2 pe2;
        float f4;
        Canvas canvas2;
        float f5;
        float mo51938c;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        EnumC48069rT3 enumC48069rT3;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        PE2 pe22;
        AbstractC33806Jj6 abstractC33806Jj6;
        PE2 pe23;
        XO1 xo1;
        float f12;
        List<XO1> list2;
        PieEntry pieEntry;
        Canvas canvas3;
        String str;
        String str2;
        Canvas canvas4;
        PE2 pe24;
        PE2 pe25;
        Canvas canvas5 = canvas;
        PE2 m51987o0 = this.f103717g.m51987o0();
        float mo51963f0 = this.f103717g.mo51963f0();
        float m51969j0 = this.f103717g.m51969j0();
        float[] m51982t0 = this.f103717g.m51982t0();
        float[] m51988n0 = this.f103717g.m51988n0();
        float m36088a = this.f32035b.m36088a();
        float m36087b = this.f32035b.m36087b();
        float m51981u0 = (mo51963f0 - ((this.f103717g.m51981u0() * mo51963f0) / 100.0f)) / 2.0f;
        float m51981u02 = this.f103717g.m51981u0() / 100.0f;
        float f13 = (mo51963f0 / 10.0f) * 3.6f;
        if (this.f103717g.m51977y0()) {
            f13 = (mo51963f0 - (mo51963f0 * m51981u02)) / 2.0f;
            if (!this.f103717g.m51995A0() && this.f103717g.m51976z0()) {
                m51969j0 = (float) (m51969j0 + ((m51981u0 * 360.0f) / (mo51963f0 * 6.283185307179586d)));
            }
        }
        float f14 = m51969j0;
        float f15 = mo51963f0 - f13;
        C47476qT3 c47476qT3 = (C47476qT3) this.f103717g.getData();
        List<XO1> m33552f = c47476qT3.m33552f();
        float m17495u = c47476qT3.m17495u();
        boolean m51978x0 = this.f103717g.m51978x0();
        canvas.save();
        float m91656e = AbstractC34967Oi6.m91656e(5.0f);
        int i2 = 0;
        int i3 = 0;
        while (i3 < m33552f.size()) {
            XO1 xo12 = m33552f.get(i3);
            boolean mo4014i0 = xo12.mo4014i0();
            if (!mo4014i0 && !m51978x0) {
                i = i3;
                list = m33552f;
                f4 = mo51963f0;
                fArr = m51982t0;
                fArr2 = m51988n0;
                f = m36088a;
                f2 = m36087b;
                f3 = f14;
                canvas2 = canvas5;
                pe2 = m51987o0;
            } else {
                EnumC48069rT3 m77047H = xo12.m77047H();
                EnumC48069rT3 m77049F0 = xo12.m77049F0();
                m86739a(xo12);
                int i4 = i2;
                i = i3;
                float m91660a = AbstractC34967Oi6.m91660a(this.f32039f, "Q") + AbstractC34967Oi6.m91656e(4.0f);
                AbstractC33806Jj6 mo4019b0 = xo12.mo4019b0();
                int mo21241L0 = xo12.mo21241L0();
                List<XO1> list3 = m33552f;
                this.f103720j.setColor(xo12.m77038y0());
                this.f103720j.setStrokeWidth(AbstractC34967Oi6.m91656e(xo12.m77044d0()));
                float m19225r = m19225r(xo12);
                PE2 m90557d = PE2.m90557d(xo12.mo4025M0());
                PE2 pe26 = m51987o0;
                m90557d.f28146c = AbstractC34967Oi6.m91656e(m90557d.f28146c);
                m90557d.f28147d = AbstractC34967Oi6.m91656e(m90557d.f28147d);
                int i5 = 0;
                while (i5 < mo21241L0) {
                    PE2 pe27 = m90557d;
                    PieEntry mo21237h = xo12.mo21237h(i5);
                    if (i4 == 0) {
                        f5 = 0.0f;
                    } else {
                        f5 = m51988n0[i4 - 1] * m36088a;
                    }
                    int i6 = mo21241L0;
                    float f16 = f14 + ((f5 + ((m51982t0[i4] - ((m19225r / (f15 * 0.017453292f)) / 2.0f)) / 2.0f)) * m36087b);
                    float f17 = m19225r;
                    if (this.f103717g.m51994B0()) {
                        mo51938c = (mo21237h.mo51938c() / m17495u) * 100.0f;
                    } else {
                        mo51938c = mo21237h.mo51938c();
                    }
                    String m99907g = mo4019b0.m99907g(mo51938c, mo21237h);
                    float[] fArr3 = m51982t0;
                    String m51931h = mo21237h.m51931h();
                    AbstractC33806Jj6 abstractC33806Jj62 = mo4019b0;
                    double d = f16 * 0.017453292f;
                    float[] fArr4 = m51988n0;
                    float f18 = m36088a;
                    float cos = (float) Math.cos(d);
                    float f19 = m36087b;
                    float sin = (float) Math.sin(d);
                    if (m51978x0 && m77047H == EnumC48069rT3.OUTSIDE_SLICE) {
                        z = true;
                    } else {
                        z = false;
                    }
                    float f20 = f14;
                    if (mo4014i0 && m77049F0 == EnumC48069rT3.OUTSIDE_SLICE) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (m51978x0 && m77047H == EnumC48069rT3.INSIDE_SLICE) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    EnumC48069rT3 enumC48069rT32 = m77047H;
                    if (mo4014i0 && m77049F0 == EnumC48069rT3.INSIDE_SLICE) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z && !z2) {
                        enumC48069rT3 = m77049F0;
                        f11 = sin;
                        pe23 = pe26;
                        pe22 = pe27;
                        abstractC33806Jj6 = abstractC33806Jj62;
                        str2 = m51931h;
                        xo1 = xo12;
                        f8 = mo51963f0;
                        canvas4 = canvas;
                        list2 = list3;
                        pieEntry = mo21237h;
                    } else {
                        float m77043e0 = xo12.m77043e0();
                        float m77040o = xo12.m77040o();
                        float m77045L = xo12.m77045L() / 100.0f;
                        enumC48069rT3 = m77049F0;
                        if (this.f103717g.m51977y0()) {
                            float f21 = mo51963f0 * m51981u02;
                            f6 = ((mo51963f0 - f21) * m77045L) + f21;
                        } else {
                            f6 = mo51963f0 * m77045L;
                        }
                        if (xo12.m77048G0()) {
                            f7 = m77040o * f15 * ((float) Math.abs(Math.sin(d)));
                        } else {
                            f7 = m77040o * f15;
                        }
                        PE2 pe28 = pe26;
                        float f22 = pe28.f28146c;
                        float f23 = (f6 * cos) + f22;
                        f8 = mo51963f0;
                        float f24 = pe28.f28147d;
                        float f25 = (f6 * sin) + f24;
                        float f26 = (m77043e0 + 1.0f) * f15;
                        float f27 = (f26 * cos) + f22;
                        float f28 = f24 + (f26 * sin);
                        double d2 = f16 % 360.0d;
                        if (d2 >= 90.0d && d2 <= 270.0d) {
                            float f29 = f27 - f7;
                            this.f32039f.setTextAlign(Paint.Align.RIGHT);
                            if (z) {
                                this.f103722l.setTextAlign(Paint.Align.RIGHT);
                            }
                            f9 = f29;
                            f10 = f29 - m91656e;
                        } else {
                            f9 = f27 + f7;
                            this.f32039f.setTextAlign(Paint.Align.LEFT);
                            if (z) {
                                this.f103722l.setTextAlign(Paint.Align.LEFT);
                            }
                            f10 = f9 + m91656e;
                        }
                        if (xo12.m77038y0() != 1122867) {
                            if (xo12.m77046H0()) {
                                this.f103720j.setColor(xo12.mo4030A0(i5));
                            }
                            f11 = sin;
                            xo1 = xo12;
                            abstractC33806Jj6 = abstractC33806Jj62;
                            pe22 = pe27;
                            pe23 = pe28;
                            f12 = f10;
                            list2 = list3;
                            pieEntry = mo21237h;
                            canvas.drawLine(f23, f25, f27, f28, this.f103720j);
                            canvas.drawLine(f27, f28, f9, f28, this.f103720j);
                        } else {
                            f11 = sin;
                            pe22 = pe27;
                            abstractC33806Jj6 = abstractC33806Jj62;
                            pe23 = pe28;
                            xo1 = xo12;
                            f12 = f10;
                            list2 = list3;
                            pieEntry = mo21237h;
                        }
                        if (z && z2) {
                            m19230m(canvas, m99907g, f12, f28, xo1.mo4011m(i5));
                            if (i5 < c47476qT3.m33551g() && m51931h != null) {
                                canvas3 = canvas;
                                str = m51931h;
                                m19232k(canvas3, str, f12, f28 + m91660a);
                                str2 = str;
                                canvas4 = canvas3;
                            } else {
                                canvas4 = canvas;
                                str2 = m51931h;
                            }
                        } else {
                            canvas3 = canvas;
                            float f30 = f12;
                            str = m51931h;
                            if (z) {
                                if (i5 < c47476qT3.m33551g() && str != null) {
                                    m19232k(canvas3, str, f30, f28 + (m91660a / 2.0f));
                                }
                            } else if (z2) {
                                str2 = str;
                                canvas4 = canvas3;
                                m19230m(canvas, m99907g, f30, f28 + (m91660a / 2.0f), xo1.mo4011m(i5));
                            }
                            str2 = str;
                            canvas4 = canvas3;
                        }
                    }
                    if (!z3 && !z4) {
                        pe24 = pe23;
                    } else {
                        pe24 = pe23;
                        float f31 = (f15 * cos) + pe24.f28146c;
                        float f32 = (f15 * f11) + pe24.f28147d;
                        this.f32039f.setTextAlign(Paint.Align.CENTER);
                        if (z3 && z4) {
                            m19230m(canvas, m99907g, f31, f32, xo1.mo4011m(i5));
                            if (i5 < c47476qT3.m33551g() && str2 != null) {
                                m19232k(canvas4, str2, f31, f32 + m91660a);
                            }
                        } else {
                            if (z3) {
                                if (i5 < c47476qT3.m33551g() && str2 != null) {
                                    m19232k(canvas4, str2, f31, f32 + (m91660a / 2.0f));
                                }
                            } else if (z4) {
                                m19230m(canvas, m99907g, f31, f32 + (m91660a / 2.0f), xo1.mo4011m(i5));
                            }
                            if (pieEntry.m116047b() == null && xo1.mo4027D()) {
                                Drawable m116047b = pieEntry.m116047b();
                                pe25 = pe22;
                                float f33 = pe25.f28147d;
                                AbstractC34967Oi6.m91655f(canvas, m116047b, (int) (((f15 + f33) * cos) + pe24.f28146c), (int) (((f33 + f15) * f11) + pe24.f28147d + pe25.f28146c), m116047b.getIntrinsicWidth(), m116047b.getIntrinsicHeight());
                            } else {
                                pe25 = pe22;
                            }
                            i4++;
                            i5++;
                            m90557d = pe25;
                            xo12 = xo1;
                            mo51963f0 = f8;
                            m19225r = f17;
                            mo21241L0 = i6;
                            list3 = list2;
                            m51982t0 = fArr3;
                            m51988n0 = fArr4;
                            m36088a = f18;
                            f14 = f20;
                            m77047H = enumC48069rT32;
                            m77049F0 = enumC48069rT3;
                            mo4019b0 = abstractC33806Jj6;
                            pe26 = pe24;
                            m36087b = f19;
                        }
                    }
                    if (pieEntry.m116047b() == null) {
                    }
                    pe25 = pe22;
                    i4++;
                    i5++;
                    m90557d = pe25;
                    xo12 = xo1;
                    mo51963f0 = f8;
                    m19225r = f17;
                    mo21241L0 = i6;
                    list3 = list2;
                    m51982t0 = fArr3;
                    m51988n0 = fArr4;
                    m36088a = f18;
                    f14 = f20;
                    m77047H = enumC48069rT32;
                    m77049F0 = enumC48069rT3;
                    mo4019b0 = abstractC33806Jj6;
                    pe26 = pe24;
                    m36087b = f19;
                }
                fArr = m51982t0;
                fArr2 = m51988n0;
                f = m36088a;
                f2 = m36087b;
                f3 = f14;
                list = list3;
                pe2 = pe26;
                f4 = mo51963f0;
                canvas2 = canvas;
                PE2.m90555f(m90557d);
                i2 = i4;
            }
            i3 = i + 1;
            canvas5 = canvas2;
            m51987o0 = pe2;
            mo51963f0 = f4;
            m33552f = list;
            m51982t0 = fArr;
            m51988n0 = fArr2;
            m36088a = f;
            m36087b = f2;
            f14 = f3;
        }
        PE2.m90555f(m51987o0);
        canvas.restore();
    }

    @Override // p000.RS0
    /* renamed from: f */
    public void mo14996f() {
    }

    /* renamed from: h */
    public float m19235h(PE2 pe2, float f, float f2, float f3, float f4, float f5, float f6) {
        double d = (f5 + f6) * 0.017453292f;
        float cos = pe2.f28146c + (((float) Math.cos(d)) * f);
        float sin = pe2.f28147d + (((float) Math.sin(d)) * f);
        double d2 = (f5 + (f6 / 2.0f)) * 0.017453292f;
        return (float) ((f - ((float) ((Math.sqrt(Math.pow(cos - f3, 2.0d) + Math.pow(sin - f4, 2.0d)) / 2.0d) * Math.tan(((180.0d - f2) / 2.0d) * 0.017453292519943295d)))) - Math.sqrt(Math.pow((pe2.f28146c + (((float) Math.cos(d2)) * f)) - ((cos + f3) / 2.0f), 2.0d) + Math.pow((pe2.f28147d + (((float) Math.sin(d2)) * f)) - ((sin + f4) / 2.0f), 2.0d)));
    }

    /* renamed from: i */
    public void m19234i(Canvas canvas) {
        float mo51963f0;
        PE2 pe2;
        CharSequence m51986p0 = this.f103717g.m51986p0();
        if (this.f103717g.m51979w0() && m51986p0 != null) {
            PE2 m51987o0 = this.f103717g.m51987o0();
            PE2 m51985q0 = this.f103717g.m51985q0();
            float f = m51987o0.f28146c + m51985q0.f28146c;
            float f2 = m51987o0.f28147d + m51985q0.f28147d;
            if (this.f103717g.m51977y0() && !this.f103717g.m51995A0()) {
                mo51963f0 = this.f103717g.mo51963f0() * (this.f103717g.m51981u0() / 100.0f);
            } else {
                mo51963f0 = this.f103717g.mo51963f0();
            }
            RectF[] rectFArr = this.f103726p;
            RectF rectF = rectFArr[0];
            rectF.left = f - mo51963f0;
            rectF.top = f2 - mo51963f0;
            rectF.right = f + mo51963f0;
            rectF.bottom = f2 + mo51963f0;
            RectF rectF2 = rectFArr[1];
            rectF2.set(rectF);
            float m51984r0 = this.f103717g.m51984r0() / 100.0f;
            if (m51984r0 > 0.0d) {
                rectF2.inset((rectF2.width() - (rectF2.width() * m51984r0)) / 2.0f, (rectF2.height() - (rectF2.height() * m51984r0)) / 2.0f);
            }
            if (m51986p0.equals(this.f103724n) && rectF2.equals(this.f103725o)) {
                pe2 = m51985q0;
            } else {
                this.f103725o.set(rectF2);
                this.f103724n = m51986p0;
                pe2 = m51985q0;
                this.f103723m = new StaticLayout(m51986p0, 0, m51986p0.length(), this.f103721k, (int) Math.max(Math.ceil(this.f103725o.width()), 1.0d), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            }
            canvas.save();
            Path path = this.f103732v;
            path.reset();
            path.addOval(rectF, Path.Direction.CW);
            canvas.clipPath(path);
            canvas.translate(rectF2.left, rectF2.top + ((rectF2.height() - this.f103723m.getHeight()) / 2.0f));
            this.f103723m.draw(canvas);
            canvas.restore();
            PE2.m90555f(m51987o0);
            PE2.m90555f(pe2);
        }
    }

    /* renamed from: j */
    public void m19233j(Canvas canvas, XO1 xo1) {
        boolean z;
        float f;
        boolean z2;
        float m19225r;
        boolean z3;
        int i;
        float f2;
        float f3;
        int i2;
        int i3;
        float f4;
        float f5;
        float[] fArr;
        float f6;
        float f7;
        int i4;
        RectF rectF;
        RectF rectF2;
        PE2 pe2;
        float f8;
        PE2 pe22;
        int i5;
        float f9;
        float f10;
        PE2 pe23;
        XO1 xo12 = xo1;
        float m51969j0 = this.f103717g.m51969j0();
        float m36088a = this.f32035b.m36088a();
        float m36087b = this.f32035b.m36087b();
        RectF m51983s0 = this.f103717g.m51983s0();
        int mo21241L0 = xo1.mo21241L0();
        float[] m51982t0 = this.f103717g.m51982t0();
        PE2 m51987o0 = this.f103717g.m51987o0();
        float mo51963f0 = this.f103717g.mo51963f0();
        if (this.f103717g.m51977y0() && !this.f103717g.m51995A0()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = (this.f103717g.m51981u0() / 100.0f) * mo51963f0;
        } else {
            f = 0.0f;
        }
        float m51981u0 = (mo51963f0 - ((this.f103717g.m51981u0() * mo51963f0) / 100.0f)) / 2.0f;
        RectF rectF3 = new RectF();
        if (z && this.f103717g.m51976z0()) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < mo21241L0; i7++) {
            if (Math.abs(xo12.mo21237h(i7).mo51938c()) > AbstractC34967Oi6.f27086e) {
                i6++;
            }
        }
        if (i6 <= 1) {
            m19225r = 0.0f;
        } else {
            m19225r = m19225r(xo12);
        }
        int i8 = 0;
        float f11 = 0.0f;
        while (i8 < mo21241L0) {
            float f12 = m51982t0[i8];
            float abs = Math.abs(xo12.mo21237h(i8).mo51938c());
            float f13 = AbstractC34967Oi6.f27086e;
            if (abs <= f13 || (this.f103717g.m51993C0(i8) && !z2)) {
                f11 += f12 * m36088a;
                i2 = i8;
                f6 = mo51963f0;
                f4 = m51969j0;
                f5 = m36088a;
                rectF2 = m51983s0;
                i = mo21241L0;
                fArr = m51982t0;
                i4 = i6;
                rectF = rectF3;
                f7 = f;
                pe2 = m51987o0;
            } else {
                if (m19225r > 0.0f && f12 <= 180.0f) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                i = mo21241L0;
                this.f32036c.setColor(xo12.mo4030A0(i8));
                if (i6 == 1) {
                    f2 = 0.0f;
                } else {
                    f2 = m19225r / (mo51963f0 * 0.017453292f);
                }
                float f14 = m51969j0 + ((f11 + (f2 / 2.0f)) * m36087b);
                float f15 = (f12 - f2) * m36087b;
                if (f15 < 0.0f) {
                    f3 = 0.0f;
                } else {
                    f3 = f15;
                }
                this.f103729s.reset();
                if (z2) {
                    float f16 = mo51963f0 - m51981u0;
                    i2 = i8;
                    i3 = i6;
                    double d = f14 * 0.017453292f;
                    f4 = m51969j0;
                    f5 = m36088a;
                    float cos = m51987o0.f28146c + (((float) Math.cos(d)) * f16);
                    float sin = m51987o0.f28147d + (f16 * ((float) Math.sin(d)));
                    rectF3.set(cos - m51981u0, sin - m51981u0, cos + m51981u0, sin + m51981u0);
                } else {
                    i2 = i8;
                    i3 = i6;
                    f4 = m51969j0;
                    f5 = m36088a;
                }
                double d2 = f14 * 0.017453292f;
                float f17 = f;
                float cos2 = m51987o0.f28146c + (((float) Math.cos(d2)) * mo51963f0);
                float sin2 = m51987o0.f28147d + (((float) Math.sin(d2)) * mo51963f0);
                int i9 = (f3 > 360.0f ? 1 : (f3 == 360.0f ? 0 : -1));
                if (i9 >= 0 && f3 % 360.0f <= f13) {
                    fArr = m51982t0;
                    this.f103729s.addCircle(m51987o0.f28146c, m51987o0.f28147d, mo51963f0, Path.Direction.CW);
                } else {
                    fArr = m51982t0;
                    if (z2) {
                        this.f103729s.arcTo(rectF3, f14 + 180.0f, -180.0f);
                    }
                    this.f103729s.arcTo(m51983s0, f14, f3);
                }
                RectF rectF4 = this.f103730t;
                float f18 = m51987o0.f28146c;
                float f19 = m51987o0.f28147d;
                RectF rectF5 = rectF3;
                rectF4.set(f18 - f17, f19 - f17, f18 + f17, f19 + f17);
                if (z) {
                    if (f17 <= 0.0f && !z3) {
                        f6 = mo51963f0;
                        f7 = f17;
                        i4 = i3;
                        rectF = rectF5;
                        f8 = 360.0f;
                        rectF2 = m51983s0;
                        pe2 = m51987o0;
                    } else {
                        if (z3) {
                            i4 = i3;
                            rectF2 = m51983s0;
                            f7 = f17;
                            i5 = 1;
                            f6 = mo51963f0;
                            pe22 = m51987o0;
                            float m19235h = m19235h(m51987o0, mo51963f0, f12 * m36087b, cos2, sin2, f14, f3);
                            if (m19235h < 0.0f) {
                                m19235h = -m19235h;
                            }
                            f9 = Math.max(f7, m19235h);
                        } else {
                            f6 = mo51963f0;
                            pe22 = m51987o0;
                            f7 = f17;
                            i4 = i3;
                            rectF2 = m51983s0;
                            i5 = 1;
                            f9 = f7;
                        }
                        if (i4 != i5 && f9 != 0.0f) {
                            f10 = m19225r / (f9 * 0.017453292f);
                        } else {
                            f10 = 0.0f;
                        }
                        float f20 = f4 + ((f11 + (f10 / 2.0f)) * m36087b);
                        float f21 = (f12 - f10) * m36087b;
                        if (f21 < 0.0f) {
                            f21 = 0.0f;
                        }
                        float f22 = f20 + f21;
                        if (i9 >= 0 && f3 % 360.0f <= f13) {
                            this.f103729s.addCircle(pe22.f28146c, pe22.f28147d, f9, Path.Direction.CCW);
                            pe23 = pe22;
                            rectF = rectF5;
                        } else {
                            if (z2) {
                                float f23 = f6 - m51981u0;
                                double d3 = 0.017453292f * f22;
                                pe23 = pe22;
                                float cos3 = pe22.f28146c + (((float) Math.cos(d3)) * f23);
                                float sin3 = pe23.f28147d + (f23 * ((float) Math.sin(d3)));
                                rectF = rectF5;
                                rectF.set(cos3 - m51981u0, sin3 - m51981u0, cos3 + m51981u0, sin3 + m51981u0);
                                this.f103729s.arcTo(rectF, f22, 180.0f);
                            } else {
                                pe23 = pe22;
                                rectF = rectF5;
                                double d4 = f22 * 0.017453292f;
                                this.f103729s.lineTo(pe23.f28146c + (((float) Math.cos(d4)) * f9), pe23.f28147d + (f9 * ((float) Math.sin(d4))));
                            }
                            this.f103729s.arcTo(this.f103730t, f22, -f21);
                        }
                        pe2 = pe23;
                        this.f103729s.close();
                        this.f103728r.drawPath(this.f103729s, this.f32036c);
                        f11 += f12 * f5;
                    }
                } else {
                    f6 = mo51963f0;
                    f7 = f17;
                    i4 = i3;
                    rectF = rectF5;
                    rectF2 = m51983s0;
                    pe2 = m51987o0;
                    f8 = 360.0f;
                }
                if (f3 % f8 > f13) {
                    if (z3) {
                        float m19235h2 = m19235h(pe2, f6, f12 * m36087b, cos2, sin2, f14, f3);
                        double d5 = 0.017453292f * (f14 + (f3 / 2.0f));
                        this.f103729s.lineTo(pe2.f28146c + (((float) Math.cos(d5)) * m19235h2), pe2.f28147d + (m19235h2 * ((float) Math.sin(d5))));
                    } else {
                        this.f103729s.lineTo(pe2.f28146c, pe2.f28147d);
                    }
                }
                this.f103729s.close();
                this.f103728r.drawPath(this.f103729s, this.f32036c);
                f11 += f12 * f5;
            }
            i8 = i2 + 1;
            xo12 = xo1;
            f = f7;
            rectF3 = rectF;
            m51987o0 = pe2;
            i6 = i4;
            mo51963f0 = f6;
            mo21241L0 = i;
            m51983s0 = rectF2;
            m51969j0 = f4;
            m36088a = f5;
            m51982t0 = fArr;
        }
        PE2.m90555f(m51987o0);
    }

    /* renamed from: k */
    public void m19232k(Canvas canvas, String str, float f, float f2) {
        canvas.drawText(str, f, f2, this.f103722l);
    }

    /* renamed from: l */
    public void m19231l(Canvas canvas) {
        if (this.f103717g.m51977y0() && this.f103728r != null) {
            float mo51963f0 = this.f103717g.mo51963f0();
            float m51981u0 = (this.f103717g.m51981u0() / 100.0f) * mo51963f0;
            PE2 m51987o0 = this.f103717g.m51987o0();
            if (Color.alpha(this.f103718h.getColor()) > 0) {
                this.f103728r.drawCircle(m51987o0.f28146c, m51987o0.f28147d, m51981u0, this.f103718h);
            }
            if (Color.alpha(this.f103719i.getColor()) > 0 && this.f103717g.m51980v0() > this.f103717g.m51981u0()) {
                int alpha = this.f103719i.getAlpha();
                float m51980v0 = mo51963f0 * (this.f103717g.m51980v0() / 100.0f);
                this.f103719i.setAlpha((int) (alpha * this.f32035b.m36088a() * this.f32035b.m36087b()));
                this.f103731u.reset();
                this.f103731u.addCircle(m51987o0.f28146c, m51987o0.f28147d, m51980v0, Path.Direction.CW);
                this.f103731u.addCircle(m51987o0.f28146c, m51987o0.f28147d, m51981u0, Path.Direction.CCW);
                this.f103728r.drawPath(this.f103731u, this.f103719i);
                this.f103719i.setAlpha(alpha);
            }
            PE2.m90555f(m51987o0);
        }
    }

    /* renamed from: m */
    public void m19230m(Canvas canvas, String str, float f, float f2, int i) {
        this.f32039f.setColor(i);
        canvas.drawText(str, f, f2, this.f32039f);
    }

    /* renamed from: n */
    public TextPaint m19229n() {
        return this.f103721k;
    }

    /* renamed from: o */
    public Paint m19228o() {
        return this.f103722l;
    }

    /* renamed from: p */
    public Paint m19227p() {
        return this.f103718h;
    }

    /* renamed from: q */
    public Paint m19226q() {
        return this.f103719i;
    }

    /* renamed from: r */
    public float m19225r(XO1 xo1) {
        if (!xo1.m77042g()) {
            return xo1.m77041m0();
        }
        if (xo1.m77041m0() / this.f106125a.m106368s() > (xo1.mo21239Y() / ((C47476qT3) this.f103717g.getData()).m17495u()) * 2.0f) {
            return 0.0f;
        }
        return xo1.m77041m0();
    }

    /* renamed from: s */
    public void m19224s() {
        Canvas canvas = this.f103728r;
        if (canvas != null) {
            canvas.setBitmap(null);
            this.f103728r = null;
        }
        WeakReference<Bitmap> weakReference = this.f103727q;
        if (weakReference != null) {
            Bitmap bitmap = weakReference.get();
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f103727q.clear();
            this.f103727q = null;
        }
    }
}

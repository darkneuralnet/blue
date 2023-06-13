package p000;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.BarEntry;
import java.util.List;
/* renamed from: rx */
/* loaded from: classes5.dex */
public class C28070rx extends AbstractC0361Ax {

    /* renamed from: h */
    public InterfaceC28967tx f107940h;

    /* renamed from: i */
    public RectF f107941i;

    /* renamed from: j */
    public C27739qx[] f107942j;

    /* renamed from: k */
    public Paint f107943k;

    /* renamed from: l */
    public Paint f107944l;

    /* renamed from: m */
    public RectF f107945m;

    public C28070rx(InterfaceC28967tx interfaceC28967tx, C42279hi0 c42279hi0, C32951Fs6 c32951Fs6) {
        super(c42279hi0, c32951Fs6);
        this.f107941i = new RectF();
        this.f107945m = new RectF();
        this.f107940h = interfaceC28967tx;
        Paint paint = new Paint(1);
        this.f32037d = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f32037d.setColor(Color.rgb(0, 0, 0));
        this.f32037d.setAlpha(120);
        Paint paint2 = new Paint(1);
        this.f107943k = paint2;
        paint2.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint(1);
        this.f107944l = paint3;
        paint3.setStyle(Paint.Style.STROKE);
    }

    @Override // p000.RS0
    /* renamed from: b */
    public void mo15000b(Canvas canvas) {
        C28485sx mo11172q = this.f107940h.mo11172q();
        for (int i = 0; i < mo11172q.m33553e(); i++) {
            XN1 xn1 = (XN1) mo11172q.mo17499d(i);
            if (xn1.isVisible()) {
                mo14995j(canvas, xn1, i);
            }
        }
    }

    @Override // p000.RS0
    /* renamed from: c */
    public void mo14999c(Canvas canvas) {
    }

    @Override // p000.RS0
    /* renamed from: d */
    public void mo14998d(Canvas canvas, OM1[] om1Arr) {
        boolean z;
        float mo51938c;
        float f;
        C28485sx mo11172q = this.f107940h.mo11172q();
        for (OM1 om1 : om1Arr) {
            XN1 xn1 = (XN1) mo11172q.mo17499d(om1.m92391d());
            if (xn1 != null && xn1.mo4023Q()) {
                BarEntry barEntry = (BarEntry) xn1.mo21235p0(om1.m92387h(), om1.m92385j());
                if (m114828h(barEntry, xn1)) {
                    D96 mo2231d = this.f107940h.mo2231d(xn1.mo4013j0());
                    this.f32037d.setColor(xn1.mo90K0());
                    this.f32037d.setAlpha(xn1.mo9452I0());
                    if (om1.m92388g() >= 0 && barEntry.m51940l()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (this.f107940h.mo11174f()) {
                            mo51938c = barEntry.m51943i();
                            f = -barEntry.m51944h();
                        } else {
                            C41147fn4 c41147fn4 = barEntry.m51942j()[om1.m92388g()];
                            throw null;
                        }
                    } else {
                        mo51938c = barEntry.mo51938c();
                        f = 0.0f;
                    }
                    mo14993l(barEntry.mo51930g(), mo51938c, f, mo11172q.m13373s() / 2.0f, mo2231d);
                    mo14992m(om1, this.f107941i);
                    canvas.drawRect(this.f107941i, this.f32037d);
                } else {
                    continue;
                }
            }
        }
    }

    @Override // p000.RS0
    /* renamed from: e */
    public void mo14997e(Canvas canvas) {
        float f;
        float f2;
        List list;
        PE2 pe2;
        int i;
        float f3;
        boolean z;
        float[] fArr;
        D96 d96;
        boolean z2;
        float f4;
        int i2;
        float f5;
        int i3;
        BarEntry barEntry;
        float[] fArr2;
        float f6;
        float f7;
        float f8;
        BarEntry barEntry2;
        float f9;
        float f10;
        float f11;
        boolean z3;
        int i4;
        AbstractC33806Jj6 abstractC33806Jj6;
        List list2;
        PE2 pe22;
        BarEntry barEntry3;
        float f12;
        float f13;
        float f14;
        if (mo71520g(this.f107940h)) {
            List m33552f = this.f107940h.mo11172q().m33552f();
            float m91656e = AbstractC34967Oi6.m91656e(4.5f);
            boolean mo11175e = this.f107940h.mo11175e();
            int i5 = 0;
            while (i5 < this.f107940h.mo11172q().m33553e()) {
                XN1 xn1 = (XN1) m33552f.get(i5);
                if (!m114827i(xn1)) {
                    list = m33552f;
                    f11 = m91656e;
                    z3 = mo11175e;
                } else {
                    m86739a(xn1);
                    boolean mo2229p = this.f107940h.mo2229p(xn1.mo4013j0());
                    float m91660a = AbstractC34967Oi6.m91660a(this.f32039f, "8");
                    if (mo11175e) {
                        f = -m91656e;
                    } else {
                        f = m91660a + m91656e;
                    }
                    if (mo11175e) {
                        f2 = m91660a + m91656e;
                    } else {
                        f2 = -m91656e;
                    }
                    if (mo2229p) {
                        f = (-f) - m91660a;
                        f2 = (-f2) - m91660a;
                    }
                    float f15 = f;
                    float f16 = f2;
                    C27739qx c27739qx = this.f107942j[i5];
                    float m36087b = this.f32035b.m36087b();
                    AbstractC33806Jj6 mo4019b0 = xn1.mo4019b0();
                    PE2 m90557d = PE2.m90557d(xn1.mo4025M0());
                    m90557d.f28146c = AbstractC34967Oi6.m91656e(m90557d.f28146c);
                    m90557d.f28147d = AbstractC34967Oi6.m91656e(m90557d.f28147d);
                    if (!xn1.mo9451M()) {
                        int i6 = 0;
                        while (i6 < c27739qx.f86260b.length * this.f32035b.m36088a()) {
                            float[] fArr3 = c27739qx.f86260b;
                            float f17 = (fArr3[i6] + fArr3[i6 + 2]) / 2.0f;
                            if (!this.f106125a.m106407A(f17)) {
                                break;
                            }
                            int i7 = i6 + 1;
                            if (this.f106125a.m106404D(c27739qx.f86260b[i7]) && this.f106125a.m106361z(f17)) {
                                int i8 = i6 / 4;
                                BarEntry barEntry4 = (BarEntry) xn1.mo21237h(i8);
                                float mo51938c = barEntry4.mo51938c();
                                if (xn1.mo4014i0()) {
                                    String m99911b = mo4019b0.m99911b(barEntry4);
                                    int i9 = (mo51938c > 0.0f ? 1 : (mo51938c == 0.0f ? 0 : -1));
                                    float[] fArr4 = c27739qx.f86260b;
                                    if (i9 >= 0) {
                                        f14 = fArr4[i7] + f15;
                                    } else {
                                        f14 = fArr4[i6 + 3] + f16;
                                    }
                                    barEntry3 = barEntry4;
                                    f12 = f17;
                                    i4 = i6;
                                    list2 = m33552f;
                                    pe22 = m90557d;
                                    float f18 = f14;
                                    abstractC33806Jj6 = mo4019b0;
                                    mo14994k(canvas, m99911b, f12, f18, xn1.mo4011m(i8));
                                } else {
                                    barEntry3 = barEntry4;
                                    f12 = f17;
                                    i4 = i6;
                                    abstractC33806Jj6 = mo4019b0;
                                    list2 = m33552f;
                                    pe22 = m90557d;
                                }
                                if (barEntry3.m116047b() != null && xn1.mo4027D()) {
                                    Drawable m116047b = barEntry3.m116047b();
                                    if (mo51938c >= 0.0f) {
                                        f13 = c27739qx.f86260b[i7] + f15;
                                    } else {
                                        f13 = c27739qx.f86260b[i4 + 3] + f16;
                                    }
                                    AbstractC34967Oi6.m91655f(canvas, m116047b, (int) (f12 + pe22.f28146c), (int) (f13 + pe22.f28147d), m116047b.getIntrinsicWidth(), m116047b.getIntrinsicHeight());
                                }
                            } else {
                                i4 = i6;
                                abstractC33806Jj6 = mo4019b0;
                                list2 = m33552f;
                                pe22 = m90557d;
                            }
                            i6 = i4 + 4;
                            m90557d = pe22;
                            mo4019b0 = abstractC33806Jj6;
                            m33552f = list2;
                        }
                        list = m33552f;
                        pe2 = m90557d;
                    } else {
                        list = m33552f;
                        pe2 = m90557d;
                        D96 mo2231d = this.f107940h.mo2231d(xn1.mo4013j0());
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < xn1.mo21241L0() * this.f32035b.m36088a()) {
                            BarEntry barEntry5 = (BarEntry) xn1.mo21237h(i10);
                            float[] m51941k = barEntry5.m51941k();
                            float[] fArr5 = c27739qx.f86260b;
                            float f19 = (fArr5[i11] + fArr5[i11 + 2]) / 2.0f;
                            int mo4011m = xn1.mo4011m(i10);
                            if (m51941k == null) {
                                if (!this.f106125a.m106407A(f19)) {
                                    break;
                                }
                                int i12 = i11 + 1;
                                if (this.f106125a.m106404D(c27739qx.f86260b[i12]) && this.f106125a.m106361z(f19)) {
                                    if (xn1.mo4014i0()) {
                                        String m99911b2 = mo4019b0.m99911b(barEntry5);
                                        float f20 = c27739qx.f86260b[i12];
                                        if (barEntry5.mo51938c() >= 0.0f) {
                                            f10 = f15;
                                        } else {
                                            f10 = f16;
                                        }
                                        float f21 = f20 + f10;
                                        f8 = f19;
                                        f3 = m91656e;
                                        fArr = m51941k;
                                        barEntry2 = barEntry5;
                                        i = i10;
                                        z = mo11175e;
                                        d96 = mo2231d;
                                        mo14994k(canvas, m99911b2, f8, f21, mo4011m);
                                    } else {
                                        f8 = f19;
                                        i = i10;
                                        f3 = m91656e;
                                        z = mo11175e;
                                        fArr = m51941k;
                                        barEntry2 = barEntry5;
                                        d96 = mo2231d;
                                    }
                                    if (barEntry2.m116047b() != null && xn1.mo4027D()) {
                                        Drawable m116047b2 = barEntry2.m116047b();
                                        float f22 = c27739qx.f86260b[i12];
                                        if (barEntry2.mo51938c() >= 0.0f) {
                                            f9 = f15;
                                        } else {
                                            f9 = f16;
                                        }
                                        AbstractC34967Oi6.m91655f(canvas, m116047b2, (int) (pe2.f28146c + f8), (int) (f22 + f9 + pe2.f28147d), m116047b2.getIntrinsicWidth(), m116047b2.getIntrinsicHeight());
                                    }
                                } else {
                                    mo2231d = mo2231d;
                                    mo11175e = mo11175e;
                                    m91656e = m91656e;
                                    i10 = i10;
                                }
                            } else {
                                BarEntry barEntry6 = barEntry5;
                                i = i10;
                                f3 = m91656e;
                                z = mo11175e;
                                fArr = m51941k;
                                d96 = mo2231d;
                                float f23 = f19;
                                int length = fArr.length * 2;
                                float[] fArr6 = new float[length];
                                float f24 = -barEntry6.m51944h();
                                float f25 = 0.0f;
                                int i13 = 0;
                                int i14 = 0;
                                while (i13 < length) {
                                    float f26 = fArr[i14];
                                    int i15 = (f26 > 0.0f ? 1 : (f26 == 0.0f ? 0 : -1));
                                    if (i15 == 0 && (f25 == 0.0f || f24 == 0.0f)) {
                                        float f27 = f24;
                                        f24 = f26;
                                        f7 = f27;
                                    } else if (i15 >= 0) {
                                        f25 += f26;
                                        f7 = f24;
                                        f24 = f25;
                                    } else {
                                        f7 = f24 - f26;
                                    }
                                    fArr6[i13 + 1] = f24 * m36087b;
                                    i13 += 2;
                                    i14++;
                                    f24 = f7;
                                }
                                d96.m110827k(fArr6);
                                int i16 = 0;
                                while (i16 < length) {
                                    float f28 = fArr[i16 / 2];
                                    if ((f28 == 0.0f && f24 == 0.0f && f25 > 0.0f) || f28 < 0.0f) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    float f29 = fArr6[i16 + 1];
                                    if (z2) {
                                        f4 = f16;
                                    } else {
                                        f4 = f15;
                                    }
                                    float f30 = f29 + f4;
                                    int i17 = i16;
                                    if (!this.f106125a.m106407A(f23)) {
                                        break;
                                    }
                                    if (this.f106125a.m106404D(f30) && this.f106125a.m106361z(f23)) {
                                        if (xn1.mo4014i0()) {
                                            BarEntry barEntry7 = barEntry6;
                                            f6 = f30;
                                            i3 = i17;
                                            barEntry = barEntry7;
                                            fArr2 = fArr6;
                                            i2 = length;
                                            f5 = f23;
                                            mo14994k(canvas, mo4019b0.m99910c(f28, barEntry7), f23, f6, mo4011m);
                                        } else {
                                            f6 = f30;
                                            i2 = length;
                                            f5 = f23;
                                            i3 = i17;
                                            barEntry = barEntry6;
                                            fArr2 = fArr6;
                                        }
                                        if (barEntry.m116047b() != null && xn1.mo4027D()) {
                                            Drawable m116047b3 = barEntry.m116047b();
                                            AbstractC34967Oi6.m91655f(canvas, m116047b3, (int) (f5 + pe2.f28146c), (int) (f6 + pe2.f28147d), m116047b3.getIntrinsicWidth(), m116047b3.getIntrinsicHeight());
                                        }
                                    } else {
                                        i2 = length;
                                        f5 = f23;
                                        i3 = i17;
                                        barEntry = barEntry6;
                                        fArr2 = fArr6;
                                    }
                                    i16 = i3 + 2;
                                    fArr6 = fArr2;
                                    barEntry6 = barEntry;
                                    length = i2;
                                    f23 = f5;
                                }
                            }
                            if (fArr == null) {
                                i11 += 4;
                            } else {
                                i11 += fArr.length * 4;
                            }
                            i10 = i + 1;
                            mo2231d = d96;
                            mo11175e = z;
                            m91656e = f3;
                        }
                    }
                    f11 = m91656e;
                    z3 = mo11175e;
                    PE2.m90555f(pe2);
                }
                i5++;
                mo11175e = z3;
                m33552f = list;
                m91656e = f11;
            }
        }
    }

    @Override // p000.RS0
    /* renamed from: f */
    public void mo14996f() {
        int i;
        C28485sx mo11172q = this.f107940h.mo11172q();
        this.f107942j = new C27739qx[mo11172q.m33553e()];
        for (int i2 = 0; i2 < this.f107942j.length; i2++) {
            XN1 xn1 = (XN1) mo11172q.mo17499d(i2);
            C27739qx[] c27739qxArr = this.f107942j;
            int mo21241L0 = xn1.mo21241L0() * 4;
            if (xn1.mo9451M()) {
                i = xn1.mo9444n();
            } else {
                i = 1;
            }
            c27739qxArr[i2] = new C27739qx(mo21241L0 * i, mo11172q.m33553e(), xn1.mo9451M());
        }
    }

    /* renamed from: j */
    public void mo14995j(Canvas canvas, XN1 xn1, int i) {
        boolean z;
        D96 mo2231d = this.f107940h.mo2231d(xn1.mo4013j0());
        this.f107944l.setColor(xn1.mo9448X());
        this.f107944l.setStrokeWidth(AbstractC34967Oi6.m91656e(xn1.mo9453E()));
        boolean z2 = true;
        if (xn1.mo9453E() > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        float m36088a = this.f32035b.m36088a();
        float m36087b = this.f32035b.m36087b();
        if (this.f107940h.mo11173m()) {
            this.f107943k.setColor(xn1.mo9454B0());
            float m13373s = this.f107940h.mo11172q().m13373s() / 2.0f;
            int min = Math.min((int) Math.ceil(xn1.mo21241L0() * m36088a), xn1.mo21241L0());
            for (int i2 = 0; i2 < min; i2++) {
                float mo51930g = ((BarEntry) xn1.mo21237h(i2)).mo51930g();
                RectF rectF = this.f107945m;
                rectF.left = mo51930g - m13373s;
                rectF.right = mo51930g + m13373s;
                mo2231d.m110823p(rectF);
                if (this.f106125a.m106361z(this.f107945m.right)) {
                    if (!this.f106125a.m106407A(this.f107945m.left)) {
                        break;
                    }
                    this.f107945m.top = this.f106125a.m106377j();
                    this.f107945m.bottom = this.f106125a.m106381f();
                    canvas.drawRect(this.f107945m, this.f107943k);
                }
            }
        }
        C27739qx c27739qx = this.f107942j[i];
        c27739qx.m35408b(m36088a, m36087b);
        c27739qx.m16766g(i);
        c27739qx.m16765h(this.f107940h.mo2229p(xn1.mo4013j0()));
        c27739qx.m16767f(this.f107940h.mo11172q().m13373s());
        c27739qx.mo16768e(xn1);
        mo2231d.m110827k(c27739qx.f86260b);
        if (xn1.mo4016g0().size() != 1) {
            z2 = false;
        }
        if (z2) {
            this.f32036c.setColor(xn1.getColor());
        }
        for (int i3 = 0; i3 < c27739qx.m35407c(); i3 += 4) {
            int i4 = i3 + 2;
            if (this.f106125a.m106361z(c27739qx.f86260b[i4])) {
                if (this.f106125a.m106407A(c27739qx.f86260b[i3])) {
                    if (!z2) {
                        this.f32036c.setColor(xn1.mo4030A0(i3 / 4));
                    }
                    if (xn1.mo4009s0() != null) {
                        GD1 mo4009s0 = xn1.mo4009s0();
                        Paint paint = this.f32036c;
                        float[] fArr = c27739qx.f86260b;
                        float f = fArr[i3];
                        paint.setShader(new LinearGradient(f, fArr[i3 + 3], f, fArr[i3 + 1], mo4009s0.m105642b(), mo4009s0.m105643a(), Shader.TileMode.MIRROR));
                    }
                    if (xn1.mo4010r() != null) {
                        Paint paint2 = this.f32036c;
                        float[] fArr2 = c27739qx.f86260b;
                        float f2 = fArr2[i3];
                        float f3 = fArr2[i3 + 3];
                        float f4 = fArr2[i3 + 1];
                        int i5 = i3 / 4;
                        paint2.setShader(new LinearGradient(f2, f3, f2, f4, xn1.mo4024N0(i5).m105642b(), xn1.mo4024N0(i5).m105643a(), Shader.TileMode.MIRROR));
                    }
                    float[] fArr3 = c27739qx.f86260b;
                    int i6 = i3 + 1;
                    int i7 = i3 + 3;
                    canvas.drawRect(fArr3[i3], fArr3[i6], fArr3[i4], fArr3[i7], this.f32036c);
                    if (z) {
                        float[] fArr4 = c27739qx.f86260b;
                        canvas.drawRect(fArr4[i3], fArr4[i6], fArr4[i4], fArr4[i7], this.f107944l);
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: k */
    public void mo14994k(Canvas canvas, String str, float f, float f2, int i) {
        this.f32039f.setColor(i);
        canvas.drawText(str, f, f2, this.f32039f);
    }

    /* renamed from: l */
    public void mo14993l(float f, float f2, float f3, float f4, D96 d96) {
        this.f107941i.set(f - f4, f2, f + f4, f3);
        d96.m110825n(this.f107941i, this.f32035b.m36087b());
    }

    /* renamed from: m */
    public void mo14992m(OM1 om1, RectF rectF) {
        om1.m92382m(rectF.centerX(), rectF.top);
    }
}

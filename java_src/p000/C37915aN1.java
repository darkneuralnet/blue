package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.BarEntry;
import java.util.List;
/* renamed from: aN1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C37915aN1 extends C28070rx {

    /* renamed from: n */
    public RectF f50371n;

    public C37915aN1(InterfaceC28967tx interfaceC28967tx, C42279hi0 c42279hi0, C32951Fs6 c32951Fs6) {
        super(interfaceC28967tx, c42279hi0, c32951Fs6);
        this.f50371n = new RectF();
        this.f32039f.setTextAlign(Paint.Align.LEFT);
    }

    @Override // p000.C28070rx, p000.RS0
    /* renamed from: e */
    public void mo14997e(Canvas canvas) {
        List list;
        int i;
        PE2 pe2;
        int i2;
        float f;
        float[] fArr;
        float f2;
        float f3;
        boolean z;
        float f4;
        int i3;
        float[] fArr2;
        float f5;
        float f6;
        float f7;
        float f8;
        BarEntry barEntry;
        float f9;
        float f10;
        float f11;
        int i4;
        List list2;
        int i5;
        float f12;
        PE2 pe22;
        C27739qx c27739qx;
        AbstractC33806Jj6 abstractC33806Jj6;
        float f13;
        if (mo71520g(this.f107940h)) {
            List m33552f = this.f107940h.mo11172q().m33552f();
            float m91656e = AbstractC34967Oi6.m91656e(5.0f);
            boolean mo11175e = this.f107940h.mo11175e();
            int i6 = 0;
            while (i6 < this.f107940h.mo11172q().m33553e()) {
                XN1 xn1 = (XN1) m33552f.get(i6);
                if (!m114827i(xn1)) {
                    list = m33552f;
                    i = i6;
                } else {
                    boolean mo2229p = this.f107940h.mo2229p(xn1.mo4013j0());
                    m86739a(xn1);
                    float f14 = 2.0f;
                    float m91660a = AbstractC34967Oi6.m91660a(this.f32039f, "10") / 2.0f;
                    AbstractC33806Jj6 mo4019b0 = xn1.mo4019b0();
                    C27739qx c27739qx2 = this.f107942j[i6];
                    float m36087b = this.f32035b.m36087b();
                    PE2 m90557d = PE2.m90557d(xn1.mo4025M0());
                    m90557d.f28146c = AbstractC34967Oi6.m91656e(m90557d.f28146c);
                    m90557d.f28147d = AbstractC34967Oi6.m91656e(m90557d.f28147d);
                    if (!xn1.mo9451M()) {
                        int i7 = 0;
                        while (i7 < c27739qx2.f86260b.length * this.f32035b.m36088a()) {
                            float[] fArr3 = c27739qx2.f86260b;
                            int i8 = i7 + 1;
                            float f15 = fArr3[i8];
                            float f16 = (fArr3[i7 + 3] + f15) / f14;
                            if (!this.f106125a.m106406B(f15)) {
                                break;
                            }
                            if (!this.f106125a.m106405C(c27739qx2.f86260b[i7]) || !this.f106125a.m106362y(c27739qx2.f86260b[i8])) {
                                i4 = i7;
                                c27739qx = c27739qx2;
                                list2 = m33552f;
                                i5 = i6;
                                pe22 = m90557d;
                                abstractC33806Jj6 = mo4019b0;
                            } else {
                                BarEntry barEntry2 = (BarEntry) xn1.mo21237h(i7 / 4);
                                float mo51938c = barEntry2.mo51938c();
                                String m99911b = mo4019b0.m99911b(barEntry2);
                                float m91657d = AbstractC34967Oi6.m91657d(this.f32039f, m99911b);
                                if (mo11175e) {
                                    f10 = m91656e;
                                } else {
                                    f10 = -(m91657d + m91656e);
                                }
                                if (mo11175e) {
                                    f11 = -(m91657d + m91656e);
                                } else {
                                    f11 = m91656e;
                                }
                                if (mo2229p) {
                                    f10 = (-f10) - m91657d;
                                    f11 = (-f11) - m91657d;
                                }
                                float f17 = f10;
                                float f18 = f11;
                                if (xn1.mo4014i0()) {
                                    float f19 = c27739qx2.f86260b[i7 + 2];
                                    if (mo51938c >= 0.0f) {
                                        f13 = f17;
                                    } else {
                                        f13 = f18;
                                    }
                                    i4 = i7;
                                    list2 = m33552f;
                                    pe22 = m90557d;
                                    f12 = f18;
                                    c27739qx = c27739qx2;
                                    i5 = i6;
                                    abstractC33806Jj6 = mo4019b0;
                                    mo14994k(canvas, m99911b, f19 + f13, f16 + m91660a, xn1.mo4011m(i7 / 2));
                                } else {
                                    i4 = i7;
                                    list2 = m33552f;
                                    i5 = i6;
                                    f12 = f18;
                                    pe22 = m90557d;
                                    c27739qx = c27739qx2;
                                    abstractC33806Jj6 = mo4019b0;
                                }
                                if (barEntry2.m116047b() != null && xn1.mo4027D()) {
                                    Drawable m116047b = barEntry2.m116047b();
                                    float f20 = c27739qx.f86260b[i4 + 2];
                                    if (mo51938c < 0.0f) {
                                        f17 = f12;
                                    }
                                    AbstractC34967Oi6.m91655f(canvas, m116047b, (int) (f20 + f17 + pe22.f28146c), (int) (f16 + pe22.f28147d), m116047b.getIntrinsicWidth(), m116047b.getIntrinsicHeight());
                                }
                            }
                            i7 = i4 + 4;
                            m90557d = pe22;
                            mo4019b0 = abstractC33806Jj6;
                            c27739qx2 = c27739qx;
                            m33552f = list2;
                            i6 = i5;
                            f14 = 2.0f;
                        }
                        list = m33552f;
                        i = i6;
                        pe2 = m90557d;
                    } else {
                        list = m33552f;
                        i = i6;
                        pe2 = m90557d;
                        D96 mo2231d = this.f107940h.mo2231d(xn1.mo4013j0());
                        int i9 = 0;
                        int i10 = 0;
                        while (i9 < xn1.mo21241L0() * this.f32035b.m36088a()) {
                            BarEntry barEntry3 = (BarEntry) xn1.mo21237h(i9);
                            int mo4011m = xn1.mo4011m(i9);
                            float[] m51941k = barEntry3.m51941k();
                            if (m51941k == null) {
                                int i11 = i10 + 1;
                                if (!this.f106125a.m106406B(c27739qx2.f86260b[i11])) {
                                    break;
                                } else if (this.f106125a.m106405C(c27739qx2.f86260b[i10]) && this.f106125a.m106362y(c27739qx2.f86260b[i11])) {
                                    String m99911b2 = mo4019b0.m99911b(barEntry3);
                                    float m91657d2 = AbstractC34967Oi6.m91657d(this.f32039f, m99911b2);
                                    if (mo11175e) {
                                        f7 = m91656e;
                                    } else {
                                        f7 = -(m91657d2 + m91656e);
                                    }
                                    if (mo11175e) {
                                        f8 = -(m91657d2 + m91656e);
                                    } else {
                                        f8 = m91656e;
                                    }
                                    if (mo2229p) {
                                        f7 = (-f7) - m91657d2;
                                        f8 = (-f8) - m91657d2;
                                    }
                                    float f21 = f7;
                                    float f22 = f8;
                                    if (xn1.mo4014i0()) {
                                        float f23 = c27739qx2.f86260b[i10 + 2];
                                        if (barEntry3.mo51938c() >= 0.0f) {
                                            f9 = f21;
                                        } else {
                                            f9 = f22;
                                        }
                                        float f24 = c27739qx2.f86260b[i11] + m91660a;
                                        f = m91660a;
                                        fArr = m51941k;
                                        barEntry = barEntry3;
                                        i2 = i9;
                                        mo14994k(canvas, m99911b2, f23 + f9, f24, mo4011m);
                                    } else {
                                        i2 = i9;
                                        f = m91660a;
                                        fArr = m51941k;
                                        barEntry = barEntry3;
                                    }
                                    if (barEntry.m116047b() != null && xn1.mo4027D()) {
                                        Drawable m116047b2 = barEntry.m116047b();
                                        float f25 = c27739qx2.f86260b[i10 + 2];
                                        if (barEntry.mo51938c() < 0.0f) {
                                            f21 = f22;
                                        }
                                        AbstractC34967Oi6.m91655f(canvas, m116047b2, (int) (f25 + f21 + pe2.f28146c), (int) (c27739qx2.f86260b[i11] + pe2.f28147d), m116047b2.getIntrinsicWidth(), m116047b2.getIntrinsicHeight());
                                    }
                                }
                            } else {
                                i2 = i9;
                                f = m91660a;
                                fArr = m51941k;
                                int length = fArr.length * 2;
                                float[] fArr4 = new float[length];
                                float f26 = -barEntry3.m51944h();
                                float f27 = 0.0f;
                                int i12 = 0;
                                int i13 = 0;
                                while (i12 < length) {
                                    float f28 = fArr[i13];
                                    int i14 = (f28 > 0.0f ? 1 : (f28 == 0.0f ? 0 : -1));
                                    if (i14 == 0 && (f27 == 0.0f || f26 == 0.0f)) {
                                        float f29 = f26;
                                        f26 = f28;
                                        f6 = f29;
                                    } else if (i14 >= 0) {
                                        f27 += f28;
                                        f6 = f26;
                                        f26 = f27;
                                    } else {
                                        f6 = f26 - f28;
                                    }
                                    fArr4[i12] = f26 * m36087b;
                                    i12 += 2;
                                    i13++;
                                    f26 = f6;
                                }
                                mo2231d.m110827k(fArr4);
                                int i15 = 0;
                                while (i15 < length) {
                                    float f30 = fArr[i15 / 2];
                                    String m99910c = mo4019b0.m99910c(f30, barEntry3);
                                    float m91657d3 = AbstractC34967Oi6.m91657d(this.f32039f, m99910c);
                                    if (mo11175e) {
                                        f2 = m91656e;
                                    } else {
                                        f2 = -(m91657d3 + m91656e);
                                    }
                                    int i16 = length;
                                    if (mo11175e) {
                                        f3 = -(m91657d3 + m91656e);
                                    } else {
                                        f3 = m91656e;
                                    }
                                    if (mo2229p) {
                                        f2 = (-f2) - m91657d3;
                                        f3 = (-f3) - m91657d3;
                                    }
                                    if ((f30 == 0.0f && f26 == 0.0f && f27 > 0.0f) || f30 < 0.0f) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    float f31 = fArr4[i15];
                                    if (z) {
                                        f2 = f3;
                                    }
                                    float f32 = f31 + f2;
                                    float[] fArr5 = c27739qx2.f86260b;
                                    float f33 = (fArr5[i10 + 1] + fArr5[i10 + 3]) / 2.0f;
                                    if (!this.f106125a.m106406B(f33)) {
                                        break;
                                    }
                                    if (!this.f106125a.m106405C(f32) || !this.f106125a.m106362y(f33)) {
                                        i3 = i15;
                                        fArr2 = fArr4;
                                    } else {
                                        if (xn1.mo4014i0()) {
                                            f4 = f33;
                                            i3 = i15;
                                            fArr2 = fArr4;
                                            f5 = f32;
                                            mo14994k(canvas, m99910c, f32, f33 + f, mo4011m);
                                        } else {
                                            f4 = f33;
                                            i3 = i15;
                                            fArr2 = fArr4;
                                            f5 = f32;
                                        }
                                        if (barEntry3.m116047b() != null && xn1.mo4027D()) {
                                            Drawable m116047b3 = barEntry3.m116047b();
                                            AbstractC34967Oi6.m91655f(canvas, m116047b3, (int) (f5 + pe2.f28146c), (int) (f4 + pe2.f28147d), m116047b3.getIntrinsicWidth(), m116047b3.getIntrinsicHeight());
                                        }
                                    }
                                    i15 = i3 + 2;
                                    length = i16;
                                    fArr4 = fArr2;
                                }
                            }
                            if (fArr == null) {
                                i10 += 4;
                            } else {
                                i10 += fArr.length * 4;
                            }
                            i9 = i2 + 1;
                            m91660a = f;
                        }
                    }
                    PE2.m90555f(pe2);
                }
                i6 = i + 1;
                m33552f = list;
            }
        }
    }

    @Override // p000.C28070rx, p000.RS0
    /* renamed from: f */
    public void mo14996f() {
        int i;
        C28485sx mo11172q = this.f107940h.mo11172q();
        this.f107942j = new ZM1[mo11172q.m33553e()];
        for (int i2 = 0; i2 < this.f107942j.length; i2++) {
            XN1 xn1 = (XN1) mo11172q.mo17499d(i2);
            C27739qx[] c27739qxArr = this.f107942j;
            int mo21241L0 = xn1.mo21241L0() * 4;
            if (xn1.mo9451M()) {
                i = xn1.mo9444n();
            } else {
                i = 1;
            }
            c27739qxArr[i2] = new ZM1(mo21241L0 * i, mo11172q.m33553e(), xn1.mo9451M());
        }
    }

    @Override // p000.RS0
    /* renamed from: g */
    public boolean mo71520g(InterfaceC44058ki0 interfaceC44058ki0) {
        if (interfaceC44058ki0.getData().m33551g() < interfaceC44058ki0.mo28585i() * this.f106125a.m106369r()) {
            return true;
        }
        return false;
    }

    @Override // p000.C28070rx
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
                RectF rectF = this.f50371n;
                rectF.top = mo51930g - m13373s;
                rectF.bottom = mo51930g + m13373s;
                mo2231d.m110823p(rectF);
                if (this.f106125a.m106406B(this.f50371n.bottom)) {
                    if (!this.f106125a.m106362y(this.f50371n.top)) {
                        break;
                    }
                    this.f50371n.left = this.f106125a.m106379h();
                    this.f50371n.right = this.f106125a.m106378i();
                    canvas.drawRect(this.f50371n, this.f107943k);
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
            int i4 = i3 + 3;
            if (this.f106125a.m106406B(c27739qx.f86260b[i4])) {
                int i5 = i3 + 1;
                if (this.f106125a.m106362y(c27739qx.f86260b[i5])) {
                    if (!z2) {
                        this.f32036c.setColor(xn1.mo4030A0(i3 / 4));
                    }
                    float[] fArr = c27739qx.f86260b;
                    int i6 = i3 + 2;
                    canvas.drawRect(fArr[i3], fArr[i5], fArr[i6], fArr[i4], this.f32036c);
                    if (z) {
                        float[] fArr2 = c27739qx.f86260b;
                        canvas.drawRect(fArr2[i3], fArr2[i5], fArr2[i6], fArr2[i4], this.f107944l);
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // p000.C28070rx
    /* renamed from: k */
    public void mo14994k(Canvas canvas, String str, float f, float f2, int i) {
        this.f32039f.setColor(i);
        canvas.drawText(str, f, f2, this.f32039f);
    }

    @Override // p000.C28070rx
    /* renamed from: l */
    public void mo14993l(float f, float f2, float f3, float f4, D96 d96) {
        this.f107941i.set(f2, f - f4, f3, f + f4);
        d96.m110824o(this.f107941i, this.f32035b.m36087b());
    }

    @Override // p000.C28070rx
    /* renamed from: m */
    public void mo14992m(OM1 om1, RectF rectF) {
        om1.m92382m(rectF.centerY(), rectF.right);
    }
}

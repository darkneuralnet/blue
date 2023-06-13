package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.CandleEntry;
import java.util.List;
import p000.AbstractC0361Ax;
/* renamed from: hd0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C42229hd0 extends AbstractC53043zr2 {

    /* renamed from: i */
    public InterfaceC41636gd0 f85612i;

    /* renamed from: j */
    public float[] f85613j;

    /* renamed from: k */
    public float[] f85614k;

    /* renamed from: l */
    public float[] f85615l;

    /* renamed from: m */
    public float[] f85616m;

    /* renamed from: n */
    public float[] f85617n;

    public C42229hd0(InterfaceC41636gd0 interfaceC41636gd0, C42279hi0 c42279hi0, C32951Fs6 c32951Fs6) {
        super(c42279hi0, c32951Fs6);
        this.f85613j = new float[8];
        this.f85614k = new float[4];
        this.f85615l = new float[4];
        this.f85616m = new float[4];
        this.f85617n = new float[4];
        this.f85612i = interfaceC41636gd0;
    }

    @Override // p000.RS0
    /* renamed from: b */
    public void mo15000b(Canvas canvas) {
        for (T t : this.f85612i.mo37971n().m33552f()) {
            if (t.isVisible()) {
                m36134k(canvas, t);
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
        C41043fd0 mo37971n = this.f85612i.mo37971n();
        for (OM1 om1 : om1Arr) {
            OO1 oo1 = (InterfaceC43278jO1) mo37971n.mo17499d(om1.m92391d());
            if (oo1 != null && oo1.mo4023Q()) {
                CandleEntry candleEntry = (CandleEntry) oo1.mo21235p0(om1.m92387h(), om1.m92385j());
                if (m114828h(candleEntry, oo1)) {
                    OE2 m110833e = this.f85612i.mo2231d(oo1.mo4013j0()).m110833e(candleEntry.mo51930g(), ((candleEntry.m51935j() * this.f32035b.m36087b()) + (candleEntry.m51936i() * this.f32035b.m36087b())) / 2.0f);
                    om1.m92382m((float) m110833e.f26254c, (float) m110833e.f26255d);
                    m222j(canvas, (float) m110833e.f26254c, (float) m110833e.f26255d, oo1);
                }
            }
        }
    }

    @Override // p000.RS0
    /* renamed from: e */
    public void mo14997e(Canvas canvas) {
        InterfaceC43278jO1 interfaceC43278jO1;
        CandleEntry candleEntry;
        float f;
        if (mo71520g(this.f85612i)) {
            List<T> m33552f = this.f85612i.mo37971n().m33552f();
            for (int i = 0; i < m33552f.size(); i++) {
                InterfaceC43278jO1 interfaceC43278jO12 = (InterfaceC43278jO1) m33552f.get(i);
                if (m114827i(interfaceC43278jO12) && interfaceC43278jO12.mo21241L0() >= 1) {
                    m86739a(interfaceC43278jO12);
                    D96 mo2231d = this.f85612i.mo2231d(interfaceC43278jO12.mo4013j0());
                    this.f1449g.m114826a(this.f85612i, interfaceC43278jO12);
                    float m36088a = this.f32035b.m36088a();
                    float m36087b = this.f32035b.m36087b();
                    AbstractC0361Ax.C0362a c0362a = this.f1449g;
                    float[] m110836b = mo2231d.m110836b(interfaceC43278jO12, m36088a, m36087b, c0362a.f1450a, c0362a.f1451b);
                    float m91656e = AbstractC34967Oi6.m91656e(5.0f);
                    AbstractC33806Jj6 mo4019b0 = interfaceC43278jO12.mo4019b0();
                    PE2 m90557d = PE2.m90557d(interfaceC43278jO12.mo4025M0());
                    m90557d.f28146c = AbstractC34967Oi6.m91656e(m90557d.f28146c);
                    m90557d.f28147d = AbstractC34967Oi6.m91656e(m90557d.f28147d);
                    int i2 = 0;
                    while (i2 < m110836b.length) {
                        float f2 = m110836b[i2];
                        float f3 = m110836b[i2 + 1];
                        if (!this.f106125a.m106407A(f2)) {
                            break;
                        }
                        if (this.f106125a.m106361z(f2) && this.f106125a.m106404D(f3)) {
                            int i3 = i2 / 2;
                            CandleEntry candleEntry2 = (CandleEntry) interfaceC43278jO12.mo21237h(this.f1449g.f1450a + i3);
                            if (interfaceC43278jO12.mo4014i0()) {
                                candleEntry = candleEntry2;
                                f = f3;
                                interfaceC43278jO1 = interfaceC43278jO12;
                                m36133l(canvas, mo4019b0.m99908e(candleEntry2), f2, f3 - m91656e, interfaceC43278jO12.mo4011m(i3));
                            } else {
                                candleEntry = candleEntry2;
                                f = f3;
                                interfaceC43278jO1 = interfaceC43278jO12;
                            }
                            if (candleEntry.m116047b() != null && interfaceC43278jO1.mo4027D()) {
                                Drawable m116047b = candleEntry.m116047b();
                                AbstractC34967Oi6.m91655f(canvas, m116047b, (int) (f2 + m90557d.f28146c), (int) (f + m90557d.f28147d), m116047b.getIntrinsicWidth(), m116047b.getIntrinsicHeight());
                            }
                        } else {
                            interfaceC43278jO1 = interfaceC43278jO12;
                        }
                        i2 += 2;
                        interfaceC43278jO12 = interfaceC43278jO1;
                    }
                    PE2.m90555f(m90557d);
                }
            }
        }
    }

    @Override // p000.RS0
    /* renamed from: f */
    public void mo14996f() {
    }

    /* renamed from: k */
    public void m36134k(Canvas canvas, InterfaceC43278jO1 interfaceC43278jO1) {
        int m30740l0;
        int m30743J0;
        int m30740l02;
        int m30738t;
        int m30742S;
        D96 mo2231d = this.f85612i.mo2231d(interfaceC43278jO1.mo4013j0());
        float m36087b = this.f32035b.m36087b();
        float m30735v0 = interfaceC43278jO1.m30735v0();
        boolean m30736u = interfaceC43278jO1.m30736u();
        this.f1449g.m114826a(this.f85612i, interfaceC43278jO1);
        this.f32036c.setStrokeWidth(interfaceC43278jO1.m30739o0());
        int i = this.f1449g.f1450a;
        while (true) {
            AbstractC0361Ax.C0362a c0362a = this.f1449g;
            if (i <= c0362a.f1452c + c0362a.f1450a) {
                CandleEntry candleEntry = (CandleEntry) interfaceC43278jO1.mo21237h(i);
                if (candleEntry != null) {
                    float mo51930g = candleEntry.mo51930g();
                    float m51934k = candleEntry.m51934k();
                    float m51937h = candleEntry.m51937h();
                    float m51936i = candleEntry.m51936i();
                    float m51935j = candleEntry.m51935j();
                    if (m30736u) {
                        float[] fArr = this.f85613j;
                        fArr[0] = mo51930g;
                        fArr[2] = mo51930g;
                        fArr[4] = mo51930g;
                        fArr[6] = mo51930g;
                        int i2 = (m51934k > m51937h ? 1 : (m51934k == m51937h ? 0 : -1));
                        if (i2 > 0) {
                            fArr[1] = m51936i * m36087b;
                            fArr[3] = m51934k * m36087b;
                            fArr[5] = m51935j * m36087b;
                            fArr[7] = m51937h * m36087b;
                        } else if (m51934k < m51937h) {
                            fArr[1] = m51936i * m36087b;
                            fArr[3] = m51937h * m36087b;
                            fArr[5] = m51935j * m36087b;
                            fArr[7] = m51934k * m36087b;
                        } else {
                            fArr[1] = m51936i * m36087b;
                            float f = m51934k * m36087b;
                            fArr[3] = f;
                            fArr[5] = m51935j * m36087b;
                            fArr[7] = f;
                        }
                        mo2231d.m110827k(fArr);
                        if (interfaceC43278jO1.m30741f0()) {
                            if (i2 > 0) {
                                Paint paint = this.f32036c;
                                if (interfaceC43278jO1.m30742S() == 1122867) {
                                    m30742S = interfaceC43278jO1.mo4030A0(i);
                                } else {
                                    m30742S = interfaceC43278jO1.m30742S();
                                }
                                paint.setColor(m30742S);
                            } else if (m51934k < m51937h) {
                                Paint paint2 = this.f32036c;
                                if (interfaceC43278jO1.m30738t() == 1122867) {
                                    m30738t = interfaceC43278jO1.mo4030A0(i);
                                } else {
                                    m30738t = interfaceC43278jO1.m30738t();
                                }
                                paint2.setColor(m30738t);
                            } else {
                                Paint paint3 = this.f32036c;
                                if (interfaceC43278jO1.m30740l0() == 1122867) {
                                    m30740l02 = interfaceC43278jO1.mo4030A0(i);
                                } else {
                                    m30740l02 = interfaceC43278jO1.m30740l0();
                                }
                                paint3.setColor(m30740l02);
                            }
                        } else {
                            Paint paint4 = this.f32036c;
                            if (interfaceC43278jO1.m30743J0() == 1122867) {
                                m30743J0 = interfaceC43278jO1.mo4030A0(i);
                            } else {
                                m30743J0 = interfaceC43278jO1.m30743J0();
                            }
                            paint4.setColor(m30743J0);
                        }
                        this.f32036c.setStyle(Paint.Style.STROKE);
                        canvas.drawLines(this.f85613j, this.f32036c);
                        float[] fArr2 = this.f85614k;
                        fArr2[0] = (mo51930g - 0.5f) + m30735v0;
                        fArr2[1] = m51937h * m36087b;
                        fArr2[2] = (mo51930g + 0.5f) - m30735v0;
                        fArr2[3] = m51934k * m36087b;
                        mo2231d.m110827k(fArr2);
                        if (i2 > 0) {
                            if (interfaceC43278jO1.m30742S() == 1122867) {
                                this.f32036c.setColor(interfaceC43278jO1.mo4030A0(i));
                            } else {
                                this.f32036c.setColor(interfaceC43278jO1.m30742S());
                            }
                            this.f32036c.setStyle(interfaceC43278jO1.m30737t0());
                            float[] fArr3 = this.f85614k;
                            canvas.drawRect(fArr3[0], fArr3[3], fArr3[2], fArr3[1], this.f32036c);
                        } else if (m51934k < m51937h) {
                            if (interfaceC43278jO1.m30738t() == 1122867) {
                                this.f32036c.setColor(interfaceC43278jO1.mo4030A0(i));
                            } else {
                                this.f32036c.setColor(interfaceC43278jO1.m30738t());
                            }
                            this.f32036c.setStyle(interfaceC43278jO1.m30744I());
                            float[] fArr4 = this.f85614k;
                            canvas.drawRect(fArr4[0], fArr4[1], fArr4[2], fArr4[3], this.f32036c);
                        } else {
                            if (interfaceC43278jO1.m30740l0() == 1122867) {
                                this.f32036c.setColor(interfaceC43278jO1.mo4030A0(i));
                            } else {
                                this.f32036c.setColor(interfaceC43278jO1.m30740l0());
                            }
                            float[] fArr5 = this.f85614k;
                            canvas.drawLine(fArr5[0], fArr5[1], fArr5[2], fArr5[3], this.f32036c);
                        }
                    } else {
                        float[] fArr6 = this.f85615l;
                        fArr6[0] = mo51930g;
                        fArr6[1] = m51936i * m36087b;
                        fArr6[2] = mo51930g;
                        fArr6[3] = m51935j * m36087b;
                        float[] fArr7 = this.f85616m;
                        fArr7[0] = (mo51930g - 0.5f) + m30735v0;
                        float f2 = m51934k * m36087b;
                        fArr7[1] = f2;
                        fArr7[2] = mo51930g;
                        fArr7[3] = f2;
                        float[] fArr8 = this.f85617n;
                        fArr8[0] = (0.5f + mo51930g) - m30735v0;
                        float f3 = m51937h * m36087b;
                        fArr8[1] = f3;
                        fArr8[2] = mo51930g;
                        fArr8[3] = f3;
                        mo2231d.m110827k(fArr6);
                        mo2231d.m110827k(this.f85616m);
                        mo2231d.m110827k(this.f85617n);
                        if (m51934k > m51937h) {
                            if (interfaceC43278jO1.m30742S() == 1122867) {
                                m30740l0 = interfaceC43278jO1.mo4030A0(i);
                            } else {
                                m30740l0 = interfaceC43278jO1.m30742S();
                            }
                        } else if (m51934k < m51937h) {
                            if (interfaceC43278jO1.m30738t() == 1122867) {
                                m30740l0 = interfaceC43278jO1.mo4030A0(i);
                            } else {
                                m30740l0 = interfaceC43278jO1.m30738t();
                            }
                        } else if (interfaceC43278jO1.m30740l0() == 1122867) {
                            m30740l0 = interfaceC43278jO1.mo4030A0(i);
                        } else {
                            m30740l0 = interfaceC43278jO1.m30740l0();
                        }
                        this.f32036c.setColor(m30740l0);
                        float[] fArr9 = this.f85615l;
                        canvas.drawLine(fArr9[0], fArr9[1], fArr9[2], fArr9[3], this.f32036c);
                        float[] fArr10 = this.f85616m;
                        canvas.drawLine(fArr10[0], fArr10[1], fArr10[2], fArr10[3], this.f32036c);
                        float[] fArr11 = this.f85617n;
                        canvas.drawLine(fArr11[0], fArr11[1], fArr11[2], fArr11[3], this.f32036c);
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: l */
    public void m36133l(Canvas canvas, String str, float f, float f2, int i) {
        this.f32039f.setColor(i);
        canvas.drawText(str, f, f2, this.f32039f);
    }
}

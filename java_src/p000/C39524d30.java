package p000;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.BubbleEntry;
import java.util.List;
import p000.AbstractC0361Ax;
/* renamed from: d30  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C39524d30 extends AbstractC0361Ax {

    /* renamed from: h */
    public InterfaceC40709f30 f76057h;

    /* renamed from: i */
    public float[] f76058i;

    /* renamed from: j */
    public float[] f76059j;

    /* renamed from: k */
    public float[] f76060k;

    public C39524d30(InterfaceC40709f30 interfaceC40709f30, C42279hi0 c42279hi0, C32951Fs6 c32951Fs6) {
        super(c42279hi0, c32951Fs6);
        this.f76058i = new float[4];
        this.f76059j = new float[2];
        this.f76060k = new float[3];
        this.f76057h = interfaceC40709f30;
        this.f32036c.setStyle(Paint.Style.FILL);
        this.f32037d.setStyle(Paint.Style.STROKE);
        this.f32037d.setStrokeWidth(AbstractC34967Oi6.m91656e(1.5f));
    }

    @Override // p000.RS0
    /* renamed from: b */
    public void mo15000b(Canvas canvas) {
        for (T t : this.f76057h.mo42233a().m33552f()) {
            if (t.isVisible()) {
                m44663j(canvas, t);
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
        C40116e30 mo42233a = this.f76057h.mo42233a();
        float m36087b = this.f32035b.m36087b();
        for (OM1 om1 : om1Arr) {
            InterfaceC41499gO1 interfaceC41499gO1 = (InterfaceC41499gO1) mo42233a.mo17499d(om1.m92391d());
            if (interfaceC41499gO1 != null && interfaceC41499gO1.mo4023Q()) {
                BubbleEntry bubbleEntry = (BubbleEntry) interfaceC41499gO1.mo21235p0(om1.m92387h(), om1.m92385j());
                if (bubbleEntry.mo51938c() == om1.m92385j() && m114828h(bubbleEntry, interfaceC41499gO1)) {
                    D96 mo2231d = this.f76057h.mo2231d(interfaceC41499gO1.mo4013j0());
                    float[] fArr = this.f76058i;
                    fArr[0] = 0.0f;
                    fArr[2] = 1.0f;
                    mo2231d.m110827k(fArr);
                    boolean m39512w = interfaceC41499gO1.m39512w();
                    float[] fArr2 = this.f76058i;
                    float min = Math.min(Math.abs(this.f106125a.m106381f() - this.f106125a.m106377j()), Math.abs(fArr2[2] - fArr2[0]));
                    this.f76059j[0] = bubbleEntry.mo51930g();
                    this.f76059j[1] = bubbleEntry.mo51938c() * m36087b;
                    mo2231d.m110827k(this.f76059j);
                    float[] fArr3 = this.f76059j;
                    om1.m92382m(fArr3[0], fArr3[1]);
                    float m44661l = m44661l(bubbleEntry.m51939h(), interfaceC41499gO1.m39513j(), min, m39512w) / 2.0f;
                    if (this.f106125a.m106406B(this.f76059j[1] + m44661l) && this.f106125a.m106362y(this.f76059j[1] - m44661l) && this.f106125a.m106361z(this.f76059j[0] + m44661l)) {
                        if (this.f106125a.m106407A(this.f76059j[0] - m44661l)) {
                            int mo4030A0 = interfaceC41499gO1.mo4030A0((int) bubbleEntry.mo51930g());
                            Color.RGBToHSV(Color.red(mo4030A0), Color.green(mo4030A0), Color.blue(mo4030A0), this.f76060k);
                            float[] fArr4 = this.f76060k;
                            fArr4[2] = fArr4[2] * 0.5f;
                            this.f32037d.setColor(Color.HSVToColor(Color.alpha(mo4030A0), this.f76060k));
                            this.f32037d.setStrokeWidth(interfaceC41499gO1.m39514h0());
                            float[] fArr5 = this.f76059j;
                            canvas.drawCircle(fArr5[0], fArr5[1], m44661l, this.f32037d);
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override // p000.RS0
    /* renamed from: e */
    public void mo14997e(Canvas canvas) {
        float f;
        int i;
        BubbleEntry bubbleEntry;
        float f2;
        float f3;
        C40116e30 mo42233a = this.f76057h.mo42233a();
        if (mo42233a != null && mo71520g(this.f76057h)) {
            List<T> m33552f = mo42233a.m33552f();
            float m91660a = AbstractC34967Oi6.m91660a(this.f32039f, "1");
            for (int i2 = 0; i2 < m33552f.size(); i2++) {
                InterfaceC41499gO1 interfaceC41499gO1 = (InterfaceC41499gO1) m33552f.get(i2);
                if (m114827i(interfaceC41499gO1) && interfaceC41499gO1.mo21241L0() >= 1) {
                    m86739a(interfaceC41499gO1);
                    float max = Math.max(0.0f, Math.min(1.0f, this.f32035b.m36088a()));
                    float m36087b = this.f32035b.m36087b();
                    this.f1449g.m114826a(this.f76057h, interfaceC41499gO1);
                    D96 mo2231d = this.f76057h.mo2231d(interfaceC41499gO1.mo4013j0());
                    AbstractC0361Ax.C0362a c0362a = this.f1449g;
                    float[] m110837a = mo2231d.m110837a(interfaceC41499gO1, m36087b, c0362a.f1450a, c0362a.f1451b);
                    if (max == 1.0f) {
                        f = m36087b;
                    } else {
                        f = max;
                    }
                    AbstractC33806Jj6 mo4019b0 = interfaceC41499gO1.mo4019b0();
                    PE2 m90557d = PE2.m90557d(interfaceC41499gO1.mo4025M0());
                    m90557d.f28146c = AbstractC34967Oi6.m91656e(m90557d.f28146c);
                    m90557d.f28147d = AbstractC34967Oi6.m91656e(m90557d.f28147d);
                    for (int i3 = 0; i3 < m110837a.length; i3 = i + 2) {
                        int i4 = i3 / 2;
                        int mo4011m = interfaceC41499gO1.mo4011m(this.f1449g.f1450a + i4);
                        int argb = Color.argb(Math.round(255.0f * f), Color.red(mo4011m), Color.green(mo4011m), Color.blue(mo4011m));
                        float f4 = m110837a[i3];
                        float f5 = m110837a[i3 + 1];
                        if (!this.f106125a.m106407A(f4)) {
                            break;
                        }
                        if (this.f106125a.m106361z(f4) && this.f106125a.m106404D(f5)) {
                            BubbleEntry bubbleEntry2 = (BubbleEntry) interfaceC41499gO1.mo21237h(i4 + this.f1449g.f1450a);
                            if (interfaceC41499gO1.mo4014i0()) {
                                bubbleEntry = bubbleEntry2;
                                f2 = f5;
                                f3 = f4;
                                i = i3;
                                m44662k(canvas, mo4019b0.m99909d(bubbleEntry2), f4, f5 + (0.5f * m91660a), argb);
                            } else {
                                bubbleEntry = bubbleEntry2;
                                f2 = f5;
                                f3 = f4;
                                i = i3;
                            }
                            if (bubbleEntry.m116047b() != null && interfaceC41499gO1.mo4027D()) {
                                Drawable m116047b = bubbleEntry.m116047b();
                                AbstractC34967Oi6.m91655f(canvas, m116047b, (int) (f3 + m90557d.f28146c), (int) (f2 + m90557d.f28147d), m116047b.getIntrinsicWidth(), m116047b.getIntrinsicHeight());
                            }
                        } else {
                            i = i3;
                        }
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

    /* renamed from: j */
    public void m44663j(Canvas canvas, InterfaceC41499gO1 interfaceC41499gO1) {
        if (interfaceC41499gO1.mo21241L0() < 1) {
            return;
        }
        D96 mo2231d = this.f76057h.mo2231d(interfaceC41499gO1.mo4013j0());
        float m36087b = this.f32035b.m36087b();
        this.f1449g.m114826a(this.f76057h, interfaceC41499gO1);
        float[] fArr = this.f76058i;
        fArr[0] = 0.0f;
        fArr[2] = 1.0f;
        mo2231d.m110827k(fArr);
        boolean m39512w = interfaceC41499gO1.m39512w();
        float[] fArr2 = this.f76058i;
        float min = Math.min(Math.abs(this.f106125a.m106381f() - this.f106125a.m106377j()), Math.abs(fArr2[2] - fArr2[0]));
        int i = this.f1449g.f1450a;
        while (true) {
            AbstractC0361Ax.C0362a c0362a = this.f1449g;
            if (i <= c0362a.f1452c + c0362a.f1450a) {
                BubbleEntry bubbleEntry = (BubbleEntry) interfaceC41499gO1.mo21237h(i);
                this.f76059j[0] = bubbleEntry.mo51930g();
                this.f76059j[1] = bubbleEntry.mo51938c() * m36087b;
                mo2231d.m110827k(this.f76059j);
                float m44661l = m44661l(bubbleEntry.m51939h(), interfaceC41499gO1.m39513j(), min, m39512w) / 2.0f;
                if (this.f106125a.m106406B(this.f76059j[1] + m44661l) && this.f106125a.m106362y(this.f76059j[1] - m44661l) && this.f106125a.m106361z(this.f76059j[0] + m44661l)) {
                    if (this.f106125a.m106407A(this.f76059j[0] - m44661l)) {
                        this.f32036c.setColor(interfaceC41499gO1.mo4030A0((int) bubbleEntry.mo51930g()));
                        float[] fArr3 = this.f76059j;
                        canvas.drawCircle(fArr3[0], fArr3[1], m44661l, this.f32036c);
                    } else {
                        return;
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: k */
    public void m44662k(Canvas canvas, String str, float f, float f2, int i) {
        this.f32039f.setColor(i);
        canvas.drawText(str, f, f2, this.f32039f);
    }

    /* renamed from: l */
    public float m44661l(float f, float f2, float f3, boolean z) {
        if (z) {
            f = f2 == 0.0f ? 1.0f : (float) Math.sqrt(f / f2);
        }
        return f3 * f;
    }
}

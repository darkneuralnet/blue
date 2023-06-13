package p000;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.RadarEntry;
import kotlin.KotlinVersion;
/* renamed from: Om4  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C35001Om4 extends AbstractC51857xr2 {

    /* renamed from: i */
    public RadarChart f27296i;

    /* renamed from: j */
    public Paint f27297j;

    /* renamed from: k */
    public Paint f27298k;

    /* renamed from: l */
    public Path f27299l;

    /* renamed from: m */
    public Path f27300m;

    public C35001Om4(RadarChart radarChart, C42279hi0 c42279hi0, C32951Fs6 c32951Fs6) {
        super(c42279hi0, c32951Fs6);
        this.f27299l = new Path();
        this.f27300m = new Path();
        this.f27296i = radarChart;
        Paint paint = new Paint(1);
        this.f32037d = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f32037d.setStrokeWidth(2.0f);
        this.f32037d.setColor(Color.rgb((int) KotlinVersion.MAX_COMPONENT_VALUE, 187, 115));
        Paint paint2 = new Paint(1);
        this.f27297j = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f27298k = new Paint(1);
    }

    @Override // p000.RS0
    /* renamed from: b */
    public void mo15000b(Canvas canvas) {
        C35235Pm4 c35235Pm4 = (C35235Pm4) this.f27296i.getData();
        int mo21241L0 = c35235Pm4.m33548k().mo21241L0();
        for (InterfaceC38526bP1 interfaceC38526bP1 : c35235Pm4.m33552f()) {
            if (interfaceC38526bP1.isVisible()) {
                m91455n(canvas, interfaceC38526bP1, mo21241L0);
            }
        }
    }

    @Override // p000.RS0
    /* renamed from: c */
    public void mo14999c(Canvas canvas) {
        m91452q(canvas);
    }

    @Override // p000.RS0
    /* renamed from: d */
    public void mo14998d(Canvas canvas, OM1[] om1Arr) {
        int i;
        int i2;
        float m51958n0 = this.f27296i.m51958n0();
        float m51960l0 = this.f27296i.m51960l0();
        PE2 m52001z = this.f27296i.m52001z();
        PE2 m90558c = PE2.m90558c(0.0f, 0.0f);
        C35235Pm4 c35235Pm4 = (C35235Pm4) this.f27296i.getData();
        int length = om1Arr.length;
        int i3 = 0;
        int i4 = 0;
        while (i4 < length) {
            OM1 om1 = om1Arr[i4];
            InterfaceC38526bP1 mo17499d = c35235Pm4.mo17499d(om1.m92391d());
            if (mo17499d != null && mo17499d.mo4023Q()) {
                Entry entry = (RadarEntry) mo17499d.mo21237h((int) om1.m92387h());
                if (m114828h(entry, mo17499d)) {
                    AbstractC34967Oi6.m91643r(m52001z, (entry.mo51938c() - this.f27296i.mo28587g()) * m51960l0 * this.f32035b.m36087b(), (om1.m92387h() * m51958n0 * this.f32035b.m36088a()) + this.f27296i.m51969j0(), m90558c);
                    om1.m92382m(m90558c.f28146c, m90558c.f28147d);
                    m222j(canvas, m90558c.f28146c, m90558c.f28147d, mo17499d);
                    if (mo17499d.m64560q0() && !Float.isNaN(m90558c.f28146c) && !Float.isNaN(m90558c.f28147d)) {
                        int m64565V = mo17499d.m64565V();
                        if (m64565V == 1122867) {
                            m64565V = mo17499d.mo4030A0(i3);
                        }
                        if (mo17499d.m64559z() < 255) {
                            m64565V = C33593Im0.m101729a(m64565V, mo17499d.m64559z());
                        }
                        i = i4;
                        i2 = i3;
                        m91454o(canvas, m90558c, mo17499d.m64561n0(), mo17499d.m64564Z(), mo17499d.m64563a(), m64565V, mo17499d.m64562k0());
                        i4 = i + 1;
                        i3 = i2;
                    }
                }
            }
            i = i4;
            i2 = i3;
            i4 = i + 1;
            i3 = i2;
        }
        PE2.m90555f(m52001z);
        PE2.m90555f(m90558c);
    }

    @Override // p000.RS0
    /* renamed from: e */
    public void mo14997e(Canvas canvas) {
        int i;
        float f;
        RadarEntry radarEntry;
        int i2;
        InterfaceC38526bP1 interfaceC38526bP1;
        int i3;
        float f2;
        PE2 pe2;
        AbstractC33806Jj6 abstractC33806Jj6;
        float m36088a = this.f32035b.m36088a();
        float m36087b = this.f32035b.m36087b();
        float m51958n0 = this.f27296i.m51958n0();
        float m51960l0 = this.f27296i.m51960l0();
        PE2 m52001z = this.f27296i.m52001z();
        PE2 m90558c = PE2.m90558c(0.0f, 0.0f);
        PE2 m90558c2 = PE2.m90558c(0.0f, 0.0f);
        float m91656e = AbstractC34967Oi6.m91656e(5.0f);
        int i4 = 0;
        while (i4 < ((C35235Pm4) this.f27296i.getData()).m33553e()) {
            InterfaceC38526bP1 mo17499d = ((C35235Pm4) this.f27296i.getData()).mo17499d(i4);
            if (!m114827i(mo17499d)) {
                i = i4;
                f = m36088a;
            } else {
                m86739a(mo17499d);
                AbstractC33806Jj6 mo4019b0 = mo17499d.mo4019b0();
                PE2 m90557d = PE2.m90557d(mo17499d.mo4025M0());
                m90557d.f28146c = AbstractC34967Oi6.m91656e(m90557d.f28146c);
                m90557d.f28147d = AbstractC34967Oi6.m91656e(m90557d.f28147d);
                int i5 = 0;
                while (i5 < mo17499d.mo21241L0()) {
                    RadarEntry radarEntry2 = (RadarEntry) mo17499d.mo21237h(i5);
                    PE2 pe22 = m90557d;
                    float f3 = i5 * m51958n0 * m36088a;
                    AbstractC34967Oi6.m91643r(m52001z, (radarEntry2.mo51938c() - this.f27296i.mo28587g()) * m51960l0 * m36087b, f3 + this.f27296i.m51969j0(), m90558c);
                    if (mo17499d.mo4014i0()) {
                        radarEntry = radarEntry2;
                        i2 = i5;
                        f2 = m36088a;
                        pe2 = pe22;
                        abstractC33806Jj6 = mo4019b0;
                        interfaceC38526bP1 = mo17499d;
                        i3 = i4;
                        m91453p(canvas, mo4019b0.m99905i(radarEntry2), m90558c.f28146c, m90558c.f28147d - m91656e, mo17499d.mo4011m(i5));
                    } else {
                        radarEntry = radarEntry2;
                        i2 = i5;
                        interfaceC38526bP1 = mo17499d;
                        i3 = i4;
                        f2 = m36088a;
                        pe2 = pe22;
                        abstractC33806Jj6 = mo4019b0;
                    }
                    if (radarEntry.m116047b() != null && interfaceC38526bP1.mo4027D()) {
                        Drawable m116047b = radarEntry.m116047b();
                        AbstractC34967Oi6.m91643r(m52001z, (radarEntry.mo51938c() * m51960l0 * m36087b) + pe2.f28147d, f3 + this.f27296i.m51969j0(), m90558c2);
                        float f4 = m90558c2.f28147d + pe2.f28146c;
                        m90558c2.f28147d = f4;
                        AbstractC34967Oi6.m91655f(canvas, m116047b, (int) m90558c2.f28146c, (int) f4, m116047b.getIntrinsicWidth(), m116047b.getIntrinsicHeight());
                    }
                    i5 = i2 + 1;
                    m90557d = pe2;
                    mo17499d = interfaceC38526bP1;
                    mo4019b0 = abstractC33806Jj6;
                    i4 = i3;
                    m36088a = f2;
                }
                i = i4;
                f = m36088a;
                PE2.m90555f(m90557d);
            }
            i4 = i + 1;
            m36088a = f;
        }
        PE2.m90555f(m52001z);
        PE2.m90555f(m90558c);
        PE2.m90555f(m90558c2);
    }

    @Override // p000.RS0
    /* renamed from: f */
    public void mo14996f() {
    }

    /* renamed from: n */
    public void m91455n(Canvas canvas, InterfaceC38526bP1 interfaceC38526bP1, int i) {
        float m36088a = this.f32035b.m36088a();
        float m36087b = this.f32035b.m36087b();
        float m51958n0 = this.f27296i.m51958n0();
        float m51960l0 = this.f27296i.m51960l0();
        PE2 m52001z = this.f27296i.m52001z();
        PE2 m90558c = PE2.m90558c(0.0f, 0.0f);
        Path path = this.f27299l;
        path.reset();
        boolean z = false;
        for (int i2 = 0; i2 < interfaceC38526bP1.mo21241L0(); i2++) {
            this.f32036c.setColor(interfaceC38526bP1.mo4030A0(i2));
            AbstractC34967Oi6.m91643r(m52001z, (((RadarEntry) interfaceC38526bP1.mo21237h(i2)).mo51938c() - this.f27296i.mo28587g()) * m51960l0 * m36087b, (i2 * m51958n0 * m36088a) + this.f27296i.m51969j0(), m90558c);
            if (!Float.isNaN(m90558c.f28146c)) {
                if (!z) {
                    path.moveTo(m90558c.f28146c, m90558c.f28147d);
                    z = true;
                } else {
                    path.lineTo(m90558c.f28146c, m90558c.f28147d);
                }
            }
        }
        if (interfaceC38526bP1.mo21241L0() > i) {
            path.lineTo(m52001z.f28146c, m52001z.f28147d);
        }
        path.close();
        if (interfaceC38526bP1.mo6218x0()) {
            Drawable mo6219f = interfaceC38526bP1.mo6219f();
            if (mo6219f != null) {
                m4555m(canvas, path, mo6219f);
            } else {
                m4556l(canvas, path, interfaceC38526bP1.mo6217y(), interfaceC38526bP1.mo6222T());
            }
        }
        this.f32036c.setStrokeWidth(interfaceC38526bP1.mo6221W());
        this.f32036c.setStyle(Paint.Style.STROKE);
        if (!interfaceC38526bP1.mo6218x0() || interfaceC38526bP1.mo6222T() < 255) {
            canvas.drawPath(path, this.f32036c);
        }
        PE2.m90555f(m52001z);
        PE2.m90555f(m90558c);
    }

    /* renamed from: o */
    public void m91454o(Canvas canvas, PE2 pe2, float f, float f2, int i, int i2, float f3) {
        canvas.save();
        float m91656e = AbstractC34967Oi6.m91656e(f2);
        float m91656e2 = AbstractC34967Oi6.m91656e(f);
        if (i != 1122867) {
            Path path = this.f27300m;
            path.reset();
            path.addCircle(pe2.f28146c, pe2.f28147d, m91656e, Path.Direction.CW);
            if (m91656e2 > 0.0f) {
                path.addCircle(pe2.f28146c, pe2.f28147d, m91656e2, Path.Direction.CCW);
            }
            this.f27298k.setColor(i);
            this.f27298k.setStyle(Paint.Style.FILL);
            canvas.drawPath(path, this.f27298k);
        }
        if (i2 != 1122867) {
            this.f27298k.setColor(i2);
            this.f27298k.setStyle(Paint.Style.STROKE);
            this.f27298k.setStrokeWidth(AbstractC34967Oi6.m91656e(f3));
            canvas.drawCircle(pe2.f28146c, pe2.f28147d, m91656e, this.f27298k);
        }
        canvas.restore();
    }

    /* renamed from: p */
    public void m91453p(Canvas canvas, String str, float f, float f2, int i) {
        this.f32039f.setColor(i);
        canvas.drawText(str, f, f2, this.f32039f);
    }

    /* renamed from: q */
    public void m91452q(Canvas canvas) {
        float m51958n0 = this.f27296i.m51958n0();
        float m51960l0 = this.f27296i.m51960l0();
        float m51969j0 = this.f27296i.m51969j0();
        PE2 m52001z = this.f27296i.m52001z();
        this.f27297j.setStrokeWidth(this.f27296i.m51954r0());
        this.f27297j.setColor(this.f27296i.m51956p0());
        this.f27297j.setAlpha(this.f27296i.m51957o0());
        int m51959m0 = this.f27296i.m51959m0() + 1;
        int mo21241L0 = ((C35235Pm4) this.f27296i.getData()).m33548k().mo21241L0();
        PE2 m90558c = PE2.m90558c(0.0f, 0.0f);
        for (int i = 0; i < mo21241L0; i += m51959m0) {
            AbstractC34967Oi6.m91643r(m52001z, this.f27296i.m51951u0() * m51960l0, (i * m51958n0) + m51969j0, m90558c);
            canvas.drawLine(m52001z.f28146c, m52001z.f28147d, m90558c.f28146c, m90558c.f28147d, this.f27297j);
        }
        PE2.m90555f(m90558c);
        this.f27297j.setStrokeWidth(this.f27296i.m51953s0());
        this.f27297j.setColor(this.f27296i.m51955q0());
        this.f27297j.setAlpha(this.f27296i.m51957o0());
        int i2 = this.f27296i.m51952t0().f44180n;
        PE2 m90558c2 = PE2.m90558c(0.0f, 0.0f);
        PE2 m90558c3 = PE2.m90558c(0.0f, 0.0f);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = 0;
            while (i4 < ((C35235Pm4) this.f27296i.getData()).m33551g()) {
                float mo28587g = (this.f27296i.m51952t0().f44178l[i3] - this.f27296i.mo28587g()) * m51960l0;
                AbstractC34967Oi6.m91643r(m52001z, mo28587g, (i4 * m51958n0) + m51969j0, m90558c2);
                i4++;
                AbstractC34967Oi6.m91643r(m52001z, mo28587g, (i4 * m51958n0) + m51969j0, m90558c3);
                canvas.drawLine(m90558c2.f28146c, m90558c2.f28147d, m90558c3.f28146c, m90558c3.f28147d, this.f27297j);
            }
        }
        PE2.m90555f(m90558c2);
        PE2.m90555f(m90558c3);
    }
}

package p000;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.github.mikephil.charting.data.Entry;
import java.util.List;
import p000.AbstractC0361Ax;
/* renamed from: mm5  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C45289mm5 extends AbstractC53043zr2 {

    /* renamed from: i */
    public InterfaceC46475om5 f98734i;

    /* renamed from: j */
    public float[] f98735j;

    public C45289mm5(InterfaceC46475om5 interfaceC46475om5, C42279hi0 c42279hi0, C32951Fs6 c32951Fs6) {
        super(c42279hi0, c32951Fs6);
        this.f98735j = new float[2];
        this.f98734i = interfaceC46475om5;
    }

    @Override // p000.RS0
    /* renamed from: b */
    public void mo15000b(Canvas canvas) {
        for (T t : this.f98734i.mo20507b().m33552f()) {
            if (t.isVisible()) {
                m25024k(canvas, t);
            }
        }
    }

    @Override // p000.RS0
    /* renamed from: c */
    public void mo14999c(Canvas canvas) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [AA, com.github.mikephil.charting.data.Entry] */
    @Override // p000.RS0
    /* renamed from: d */
    public void mo14998d(Canvas canvas, OM1[] om1Arr) {
        C45882nm5 mo20507b = this.f98734i.mo20507b();
        for (OM1 om1 : om1Arr) {
            InterfaceC40322eP1 interfaceC40322eP1 = (InterfaceC40322eP1) mo20507b.mo17499d(om1.m92391d());
            if (interfaceC40322eP1 != null && interfaceC40322eP1.mo4023Q()) {
                ?? mo21235p0 = interfaceC40322eP1.mo21235p0(om1.m92387h(), om1.m92385j());
                if (m114828h(mo21235p0, interfaceC40322eP1)) {
                    OE2 m110833e = this.f98734i.mo2231d(interfaceC40322eP1.mo4013j0()).m110833e(mo21235p0.mo51930g(), mo21235p0.mo51938c() * this.f32035b.m36087b());
                    om1.m92382m((float) m110833e.f26254c, (float) m110833e.f26255d);
                    m222j(canvas, (float) m110833e.f26254c, (float) m110833e.f26255d, interfaceC40322eP1);
                }
            }
        }
    }

    @Override // p000.RS0
    /* renamed from: e */
    public void mo14997e(Canvas canvas) {
        InterfaceC40322eP1 interfaceC40322eP1;
        Entry entry;
        if (mo71520g(this.f98734i)) {
            List<T> m33552f = this.f98734i.mo20507b().m33552f();
            for (int i = 0; i < this.f98734i.mo20507b().m33553e(); i++) {
                InterfaceC40322eP1 interfaceC40322eP12 = (InterfaceC40322eP1) m33552f.get(i);
                if (m114827i(interfaceC40322eP12) && interfaceC40322eP12.mo21241L0() >= 1) {
                    m86739a(interfaceC40322eP12);
                    this.f1449g.m114826a(this.f98734i, interfaceC40322eP12);
                    D96 mo2231d = this.f98734i.mo2231d(interfaceC40322eP12.mo4013j0());
                    float m36088a = this.f32035b.m36088a();
                    float m36087b = this.f32035b.m36087b();
                    AbstractC0361Ax.C0362a c0362a = this.f1449g;
                    float[] m110834d = mo2231d.m110834d(interfaceC40322eP12, m36088a, m36087b, c0362a.f1450a, c0362a.f1451b);
                    float m91656e = AbstractC34967Oi6.m91656e(interfaceC40322eP12.m42934l());
                    AbstractC33806Jj6 mo4019b0 = interfaceC40322eP12.mo4019b0();
                    PE2 m90557d = PE2.m90557d(interfaceC40322eP12.mo4025M0());
                    m90557d.f28146c = AbstractC34967Oi6.m91656e(m90557d.f28146c);
                    m90557d.f28147d = AbstractC34967Oi6.m91656e(m90557d.f28147d);
                    int i2 = 0;
                    while (i2 < m110834d.length && this.f106125a.m106407A(m110834d[i2])) {
                        if (this.f106125a.m106361z(m110834d[i2])) {
                            int i3 = i2 + 1;
                            if (this.f106125a.m106404D(m110834d[i3])) {
                                int i4 = i2 / 2;
                                Entry mo21237h = interfaceC40322eP12.mo21237h(this.f1449g.f1450a + i4);
                                if (interfaceC40322eP12.mo4014i0()) {
                                    entry = mo21237h;
                                    interfaceC40322eP1 = interfaceC40322eP12;
                                    m25023l(canvas, mo4019b0.m99906h(mo21237h), m110834d[i2], m110834d[i3] - m91656e, interfaceC40322eP12.mo4011m(i4 + this.f1449g.f1450a));
                                } else {
                                    entry = mo21237h;
                                    interfaceC40322eP1 = interfaceC40322eP12;
                                }
                                if (entry.m116047b() != null && interfaceC40322eP1.mo4027D()) {
                                    Drawable m116047b = entry.m116047b();
                                    AbstractC34967Oi6.m91655f(canvas, m116047b, (int) (m110834d[i2] + m90557d.f28146c), (int) (m110834d[i3] + m90557d.f28147d), m116047b.getIntrinsicWidth(), m116047b.getIntrinsicHeight());
                                }
                                i2 += 2;
                                interfaceC40322eP12 = interfaceC40322eP1;
                            }
                        }
                        interfaceC40322eP1 = interfaceC40322eP12;
                        i2 += 2;
                        interfaceC40322eP12 = interfaceC40322eP1;
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
    public void m25024k(Canvas canvas, InterfaceC40322eP1 interfaceC40322eP1) {
        if (interfaceC40322eP1.mo21241L0() < 1) {
            return;
        }
        this.f98734i.mo2231d(interfaceC40322eP1.mo4013j0());
        this.f32035b.m36087b();
        interfaceC40322eP1.m42935J();
        Log.i("MISSING", "There's no IShapeRenderer specified for ScatterDataSet");
    }

    /* renamed from: l */
    public void m25023l(Canvas canvas, String str, float f, float f2, int i) {
        this.f32039f.setColor(i);
        canvas.drawText(str, f, f2, this.f32039f);
    }
}

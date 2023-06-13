package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import com.github.mikephil.charting.data.Entry;
import p000.AbstractC42872ii0;
import p000.C41175fq2;
/* loaded from: classes5.dex */
public abstract class PieRadarChartBase<T extends AbstractC42872ii0<? extends InterfaceC46243oO1<? extends Entry>>> extends Chart<T> {

    /* renamed from: F */
    public float f70088F;

    /* renamed from: G */
    public float f70089G;

    /* renamed from: H */
    public boolean f70090H;

    /* renamed from: I */
    public float f70091I;

    /* renamed from: com.github.mikephil.charting.charts.PieRadarChartBase$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C17434a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f70092a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f70093b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f70094c;

        static {
            int[] iArr = new int[C41175fq2.EnumC20549e.values().length];
            f70094c = iArr;
            try {
                iArr[C41175fq2.EnumC20549e.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70094c[C41175fq2.EnumC20549e.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[C41175fq2.EnumC20548d.values().length];
            f70093b = iArr2;
            try {
                iArr2[C41175fq2.EnumC20548d.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f70093b[C41175fq2.EnumC20548d.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f70093b[C41175fq2.EnumC20548d.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[C41175fq2.EnumC20550f.values().length];
            f70092a = iArr3;
            try {
                iArr3[C41175fq2.EnumC20550f.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f70092a[C41175fq2.EnumC20550f.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public PieRadarChartBase(Context context) {
        super(context);
        this.f70088F = 270.0f;
        this.f70089G = 270.0f;
        this.f70090H = true;
        this.f70091I = 0.0f;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    /* renamed from: O */
    public void mo51950O() {
        super.mo51950O();
        this.f70046n = new C49254tT3(this);
    }

    @Override // com.github.mikephil.charting.charts.Chart
    /* renamed from: T */
    public void mo51966T() {
        if (this.f70035c == null) {
            return;
        }
        mo51965Y();
        if (this.f70045m != null) {
            this.f70048p.m35769a(this.f70035c);
        }
        mo51967r();
    }

    /* renamed from: Y */
    public void mo51965Y() {
    }

    /* renamed from: Z */
    public float m51975Z(float f, float f2) {
        float f3;
        float f4;
        PE2 m52001z = m52001z();
        float f5 = m52001z.f28146c;
        if (f > f5) {
            f3 = f - f5;
        } else {
            f3 = f5 - f;
        }
        float f6 = m52001z.f28147d;
        if (f2 > f6) {
            f4 = f2 - f6;
        } else {
            f4 = f6 - f2;
        }
        float sqrt = (float) Math.sqrt(Math.pow(f3, 2.0d) + Math.pow(f4, 2.0d));
        PE2.m90555f(m52001z);
        return sqrt;
    }

    /* renamed from: a0 */
    public float m51974a0(float f, float f2) {
        PE2 m52001z = m52001z();
        double d = f - m52001z.f28146c;
        double d2 = f2 - m52001z.f28147d;
        float degrees = (float) Math.toDegrees(Math.acos(d2 / Math.sqrt((d * d) + (d2 * d2))));
        if (f > m52001z.f28146c) {
            degrees = 360.0f - degrees;
        }
        float f3 = degrees + 90.0f;
        if (f3 > 360.0f) {
            f3 -= 360.0f;
        }
        PE2.m90555f(m52001z);
        return f3;
    }

    /* renamed from: b0 */
    public float m51973b0() {
        RectF m106372o = this.f70051s.m106372o();
        m106372o.left += m52023D();
        m106372o.top += m52021F();
        m106372o.right -= m52022E();
        m106372o.bottom -= m52024C();
        return Math.min(m106372o.width(), m106372o.height());
    }

    /* renamed from: c0 */
    public abstract int mo51964c0(float f);

    @Override // android.view.View
    public void computeScroll() {
        AbstractView$OnTouchListenerC44651li0 abstractView$OnTouchListenerC44651li0 = this.f70046n;
        if (abstractView$OnTouchListenerC44651li0 instanceof C49254tT3) {
            ((C49254tT3) abstractView$OnTouchListenerC44651li0).m12302g();
        }
    }

    /* renamed from: d0 */
    public PE2 m51972d0(PE2 pe2, float f, float f2) {
        PE2 m90558c = PE2.m90558c(0.0f, 0.0f);
        m51971e0(pe2, f, f2, m90558c);
        return m90558c;
    }

    /* renamed from: e0 */
    public void m51971e0(PE2 pe2, float f, float f2, PE2 pe22) {
        double d = f;
        double d2 = f2;
        pe22.f28146c = (float) (pe2.f28146c + (Math.cos(Math.toRadians(d2)) * d));
        pe22.f28147d = (float) (pe2.f28147d + (d * Math.sin(Math.toRadians(d2))));
    }

    /* renamed from: f0 */
    public abstract float mo51963f0();

    /* renamed from: g0 */
    public float m51970g0() {
        return this.f70089G;
    }

    /* renamed from: h0 */
    public abstract float mo51962h0();

    @Override // p000.InterfaceC44058ki0
    /* renamed from: i */
    public int mo28585i() {
        return this.f70035c.m33551g();
    }

    /* renamed from: i0 */
    public abstract float mo51961i0();

    /* renamed from: j0 */
    public float m51969j0() {
        return this.f70088F;
    }

    /* renamed from: k0 */
    public boolean m51968k0() {
        return this.f70090H;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractView$OnTouchListenerC44651li0 abstractView$OnTouchListenerC44651li0;
        if (this.f70043k && (abstractView$OnTouchListenerC44651li0 = this.f70046n) != null) {
            return abstractView$OnTouchListenerC44651li0.onTouch(this, motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007b, code lost:
        if (r2 != 2) goto L33;
     */
    @Override // com.github.mikephil.charting.charts.Chart
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo51967r() {
        float f;
        float f2;
        float f3;
        float m91656e;
        float f4;
        float f5;
        float f6;
        float min;
        C41175fq2 c41175fq2 = this.f70045m;
        float f7 = 0.0f;
        if (c41175fq2 != null && c41175fq2.m93268f() && !this.f70045m.m40775D()) {
            float min2 = Math.min(this.f70045m.f80802x, this.f70051s.m106374m() * this.f70045m.m40759v());
            int i = C17434a.f70094c[this.f70045m.m40756y().ordinal()];
            if (i != 1) {
                if (i == 2 && (this.f70045m.m40778A() == C41175fq2.EnumC20550f.TOP || this.f70045m.m40778A() == C41175fq2.EnumC20550f.BOTTOM)) {
                    min = Math.min(this.f70045m.f80803y + mo51961i0(), this.f70051s.m106375l() * this.f70045m.m40759v());
                    int i2 = C17434a.f70092a[this.f70045m.m40778A().ordinal()];
                    if (i2 != 1) {
                    }
                    f6 = min;
                    m91656e = 0.0f;
                    f5 = 0.0f;
                    f7 += mo51962h0();
                    f = m91656e + mo51962h0();
                    f3 = f6 + mo51962h0();
                    f2 = f5 + mo51962h0();
                }
                m91656e = 0.0f;
                f5 = 0.0f;
                f6 = f5;
                f7 += mo51962h0();
                f = m91656e + mo51962h0();
                f3 = f6 + mo51962h0();
                f2 = f5 + mo51962h0();
            } else {
                if (this.f70045m.m40760u() != C41175fq2.EnumC20548d.LEFT && this.f70045m.m40760u() != C41175fq2.EnumC20548d.RIGHT) {
                    m91656e = 0.0f;
                } else if (this.f70045m.m40778A() == C41175fq2.EnumC20550f.CENTER) {
                    m91656e = min2 + AbstractC34967Oi6.m91656e(13.0f);
                } else {
                    m91656e = min2 + AbstractC34967Oi6.m91656e(8.0f);
                    C41175fq2 c41175fq22 = this.f70045m;
                    float f8 = c41175fq22.f80803y + c41175fq22.f80804z;
                    PE2 m52002y = m52002y();
                    if (this.f70045m.m40760u() == C41175fq2.EnumC20548d.RIGHT) {
                        f4 = (getWidth() - m91656e) + 15.0f;
                    } else {
                        f4 = m91656e - 15.0f;
                    }
                    float f9 = f8 + 15.0f;
                    float m51975Z = m51975Z(f4, f9);
                    PE2 m51972d0 = m51972d0(m52002y, mo51963f0(), m51974a0(f4, f9));
                    float m51975Z2 = m51975Z(m51972d0.f28146c, m51972d0.f28147d);
                    float m91656e2 = AbstractC34967Oi6.m91656e(5.0f);
                    if (f9 < m52002y.f28147d || getHeight() - m91656e <= getWidth()) {
                        if (m51975Z < m51975Z2) {
                            m91656e = m91656e2 + (m51975Z2 - m51975Z);
                        } else {
                            m91656e = 0.0f;
                        }
                    }
                    PE2.m90555f(m52002y);
                    PE2.m90555f(m51972d0);
                }
                int i3 = C17434a.f70093b[this.f70045m.m40760u().ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            int i4 = C17434a.f70092a[this.f70045m.m40778A().ordinal()];
                            if (i4 != 1) {
                                if (i4 == 2) {
                                    min = Math.min(this.f70045m.f80803y, this.f70051s.m106375l() * this.f70045m.m40759v());
                                    f5 = min;
                                    m91656e = 0.0f;
                                    f6 = 0.0f;
                                    f7 += mo51962h0();
                                    f = m91656e + mo51962h0();
                                    f3 = f6 + mo51962h0();
                                    f2 = f5 + mo51962h0();
                                }
                            } else {
                                min = Math.min(this.f70045m.f80803y, this.f70051s.m106375l() * this.f70045m.m40759v());
                                f6 = min;
                                m91656e = 0.0f;
                                f5 = 0.0f;
                                f7 += mo51962h0();
                                f = m91656e + mo51962h0();
                                f3 = f6 + mo51962h0();
                                f2 = f5 + mo51962h0();
                            }
                        }
                        m91656e = 0.0f;
                        f5 = 0.0f;
                        f6 = f5;
                        f7 += mo51962h0();
                        f = m91656e + mo51962h0();
                        f3 = f6 + mo51962h0();
                        f2 = f5 + mo51962h0();
                    } else {
                        f5 = 0.0f;
                        f6 = f5;
                        f7 += mo51962h0();
                        f = m91656e + mo51962h0();
                        f3 = f6 + mo51962h0();
                        f2 = f5 + mo51962h0();
                    }
                } else {
                    f5 = 0.0f;
                    f6 = 0.0f;
                    f7 = m91656e;
                    m91656e = 0.0f;
                    f7 += mo51962h0();
                    f = m91656e + mo51962h0();
                    f3 = f6 + mo51962h0();
                    f2 = f5 + mo51962h0();
                }
            }
        } else {
            f = 0.0f;
            f2 = 0.0f;
            f3 = 0.0f;
        }
        float m91656e3 = AbstractC34967Oi6.m91656e(this.f70091I);
        if (this instanceof RadarChart) {
            C49149tH6 mo51991M = mo51991M();
            if (mo51991M.m93268f() && mo51991M.m76152A()) {
                m91656e3 = Math.max(m91656e3, mo51991M.f110254L);
            }
        }
        float m52021F = f3 + m52021F();
        float m52022E = f + m52022E();
        float m52024C = f2 + m52024C();
        float max = Math.max(m91656e3, f7 + m52023D());
        float max2 = Math.max(m91656e3, m52021F);
        float max3 = Math.max(m91656e3, m52022E);
        float max4 = Math.max(m91656e3, Math.max(mo51962h0(), m52024C));
        this.f70051s.m106397K(max, max2, max3, max4);
        if (this.f70034b) {
            Log.i("MPAndroidChart", "offsetLeft: " + max + ", offsetTop: " + max2 + ", offsetRight: " + max3 + ", offsetBottom: " + max4);
        }
    }

    public void setMinOffset(float f) {
        this.f70091I = f;
    }

    public void setRotationAngle(float f) {
        this.f70089G = f;
        this.f70088F = AbstractC34967Oi6.m91644q(f);
    }

    public void setRotationEnabled(boolean z) {
        this.f70090H = z;
    }

    public PieRadarChartBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f70088F = 270.0f;
        this.f70089G = 270.0f;
        this.f70090H = true;
        this.f70091I = 0.0f;
    }

    public PieRadarChartBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f70088F = 270.0f;
        this.f70089G = 270.0f;
        this.f70090H = true;
        this.f70091I = 0.0f;
    }
}

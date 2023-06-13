package com.github.mikephil.charting.charts;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.Iterator;
import p000.AbstractC42872ii0;
/* loaded from: classes5.dex */
public abstract class Chart<T extends AbstractC42872ii0<? extends InterfaceC46243oO1<? extends Entry>>> extends ViewGroup implements InterfaceC44058ki0 {

    /* renamed from: A */
    public float f70029A;

    /* renamed from: B */
    public boolean f70030B;

    /* renamed from: C */
    public RO1 f70031C;

    /* renamed from: D */
    public ArrayList<Runnable> f70032D;

    /* renamed from: E */
    public boolean f70033E;

    /* renamed from: b */
    public boolean f70034b;

    /* renamed from: c */
    public T f70035c;

    /* renamed from: d */
    public boolean f70036d;

    /* renamed from: e */
    public boolean f70037e;

    /* renamed from: f */
    public float f70038f;

    /* renamed from: g */
    public WY0 f70039g;

    /* renamed from: h */
    public Paint f70040h;

    /* renamed from: i */
    public Paint f70041i;

    /* renamed from: j */
    public C49149tH6 f70042j;

    /* renamed from: k */
    public boolean f70043k;

    /* renamed from: l */
    public C51352x01 f70044l;

    /* renamed from: m */
    public C41175fq2 f70045m;

    /* renamed from: n */
    public AbstractView$OnTouchListenerC44651li0 f70046n;

    /* renamed from: o */
    public String f70047o;

    /* renamed from: p */
    public C42361hq2 f70048p;

    /* renamed from: q */
    public RS0 f70049q;

    /* renamed from: r */
    public InterfaceC49800uO1 f70050r;

    /* renamed from: s */
    public C32951Fs6 f70051s;

    /* renamed from: t */
    public C42279hi0 f70052t;

    /* renamed from: u */
    public float f70053u;

    /* renamed from: v */
    public float f70054v;

    /* renamed from: w */
    public float f70055w;

    /* renamed from: x */
    public float f70056x;

    /* renamed from: y */
    public boolean f70057y;

    /* renamed from: z */
    public OM1[] f70058z;

    /* renamed from: com.github.mikephil.charting.charts.Chart$a */
    /* loaded from: classes5.dex */
    public class C17432a implements ValueAnimator.AnimatorUpdateListener {
        public C17432a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            Chart.this.postInvalidate();
        }
    }

    public Chart(Context context) {
        super(context);
        this.f70034b = false;
        this.f70035c = null;
        this.f70036d = true;
        this.f70037e = true;
        this.f70038f = 0.9f;
        this.f70039g = new WY0(0);
        this.f70043k = true;
        this.f70047o = "No chart data available.";
        this.f70051s = new C32951Fs6();
        this.f70053u = 0.0f;
        this.f70054v = 0.0f;
        this.f70055w = 0.0f;
        this.f70056x = 0.0f;
        this.f70057y = false;
        this.f70029A = 0.0f;
        this.f70030B = true;
        this.f70032D = new ArrayList<>();
        this.f70033E = false;
        mo51950O();
    }

    /* renamed from: A */
    public C51352x01 m52026A() {
        return this.f70044l;
    }

    /* renamed from: B */
    public float m52025B() {
        return this.f70038f;
    }

    /* renamed from: C */
    public float m52024C() {
        return this.f70055w;
    }

    /* renamed from: D */
    public float m52023D() {
        return this.f70056x;
    }

    /* renamed from: E */
    public float m52022E() {
        return this.f70054v;
    }

    /* renamed from: F */
    public float m52021F() {
        return this.f70053u;
    }

    /* renamed from: G */
    public OM1 mo51997G(float f, float f2) {
        if (this.f70035c == null) {
            Log.e("MPAndroidChart", "Can't select by touch. No data set.");
            return null;
        }
        return m52020H().mo7729a(f, f2);
    }

    /* renamed from: H */
    public InterfaceC49800uO1 m52020H() {
        return this.f70050r;
    }

    /* renamed from: I */
    public C41175fq2 m52019I() {
        return this.f70045m;
    }

    /* renamed from: J */
    public float[] mo51992J(OM1 om1) {
        return new float[]{om1.m92390e(), om1.m92389f()};
    }

    /* renamed from: K */
    public InterfaceC42845if3 m52018K() {
        return null;
    }

    /* renamed from: L */
    public C32951Fs6 m52017L() {
        return this.f70051s;
    }

    /* renamed from: M */
    public C49149tH6 mo51991M() {
        return this.f70042j;
    }

    /* renamed from: N */
    public void m52016N(OM1 om1, boolean z) {
        if (om1 == null) {
            this.f70058z = null;
        } else {
            if (this.f70034b) {
                Log.i("MPAndroidChart", "Highlighted: " + om1.toString());
            }
            if (this.f70035c.mo17498h(om1) == null) {
                this.f70058z = null;
            } else {
                this.f70058z = new OM1[]{om1};
            }
        }
        m52011U(this.f70058z);
        invalidate();
    }

    /* renamed from: O */
    public void mo51950O() {
        setWillNotDraw(false);
        this.f70052t = new C42279hi0(new C17432a());
        AbstractC34967Oi6.m91639v(getContext());
        this.f70029A = AbstractC34967Oi6.m91656e(500.0f);
        this.f70044l = new C51352x01();
        C41175fq2 c41175fq2 = new C41175fq2();
        this.f70045m = c41175fq2;
        this.f70048p = new C42361hq2(this.f70051s, c41175fq2);
        this.f70042j = new C49149tH6();
        this.f70040h = new Paint(1);
        Paint paint = new Paint(1);
        this.f70041i = paint;
        paint.setColor(Color.rgb(247, 189, 51));
        this.f70041i.setTextAlign(Paint.Align.CENTER);
        this.f70041i.setTextSize(AbstractC34967Oi6.m91656e(12.0f));
        if (this.f70034b) {
            Log.i("", "Chart.init()");
        }
    }

    /* renamed from: P */
    public boolean m52015P() {
        return this.f70037e;
    }

    /* renamed from: Q */
    public boolean m52014Q() {
        return this.f70030B;
    }

    /* renamed from: R */
    public boolean m52013R() {
        return this.f70036d;
    }

    /* renamed from: S */
    public boolean m52012S() {
        return this.f70034b;
    }

    /* renamed from: T */
    public abstract void mo51966T();

    /* renamed from: U */
    public void m52011U(OM1[] om1Arr) {
        OM1 om1;
        if (om1Arr != null && om1Arr.length > 0 && (om1 = om1Arr[0]) != null) {
            this.f70046n.m26942d(om1);
        } else {
            this.f70046n.m26942d(null);
        }
    }

    /* renamed from: V */
    public void m52010V(float f, float f2) {
        float max;
        T t = this.f70035c;
        if (t != null && t.m33551g() >= 2) {
            max = Math.abs(f2 - f);
        } else {
            max = Math.max(Math.abs(f), Math.abs(f2));
        }
        this.f70039g.m78241j(AbstractC34967Oi6.m91652i(max));
    }

    /* renamed from: W */
    public final void m52009W(View view) {
        if (view.getBackground() != null) {
            view.getBackground().setCallback(null);
        }
        if (view instanceof ViewGroup) {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i < viewGroup.getChildCount()) {
                    m52009W(viewGroup.getChildAt(i));
                    i++;
                } else {
                    viewGroup.removeAllViews();
                    return;
                }
            }
        }
    }

    /* renamed from: X */
    public boolean m52008X() {
        OM1[] om1Arr = this.f70058z;
        return (om1Arr == null || om1Arr.length <= 0 || om1Arr[0] == null) ? false : true;
    }

    public T getData() {
        return this.f70035c;
    }

    @Override // p000.InterfaceC44058ki0
    /* renamed from: j */
    public float mo28584j() {
        return this.f70029A;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f70033E) {
            m52009W(this);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f70035c == null) {
            if (!TextUtils.isEmpty(this.f70047o)) {
                PE2 m52002y = m52002y();
                canvas.drawText(this.f70047o, m52002y.f28146c, m52002y.f28147d, this.f70041i);
            }
        } else if (!this.f70057y) {
            mo51967r();
            this.f70057y = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            getChildAt(i5).layout(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int m91656e = (int) AbstractC34967Oi6.m91656e(50.0f);
        setMeasuredDimension(Math.max(getSuggestedMinimumWidth(), View.resolveSize(m91656e, i)), Math.max(getSuggestedMinimumHeight(), View.resolveSize(m91656e, i2)));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (this.f70034b) {
            Log.i("MPAndroidChart", "OnSizeChanged()");
        }
        if (i > 0 && i2 > 0 && i < 10000 && i2 < 10000) {
            if (this.f70034b) {
                Log.i("MPAndroidChart", "Setting chart dimens, width: " + i + ", height: " + i2);
            }
            this.f70051s.m106396L(i, i2);
        } else if (this.f70034b) {
            Log.w("MPAndroidChart", "*Avoiding* setting chart dimens! width: " + i + ", height: " + i2);
        }
        mo51966T();
        Iterator<Runnable> it = this.f70032D.iterator();
        while (it.hasNext()) {
            post(it.next());
        }
        this.f70032D.clear();
        super.onSizeChanged(i, i2, i3, i4);
    }

    /* renamed from: r */
    public abstract void mo51967r();

    /* renamed from: s */
    public void m52007s() {
        this.f70035c = null;
        this.f70057y = false;
        this.f70058z = null;
        this.f70046n.m26942d(null);
        invalidate();
    }

    public void setData(T t) {
        this.f70035c = t;
        this.f70057y = false;
        if (t == null) {
            return;
        }
        m52010V(t.m33543p(), t.m33545n());
        for (InterfaceC46243oO1 interfaceC46243oO1 : this.f70035c.m33552f()) {
            if (interfaceC46243oO1.mo4028C0() || interfaceC46243oO1.mo4019b0() == this.f70039g) {
                interfaceC46243oO1.mo4018c0(this.f70039g);
            }
        }
        mo51966T();
        if (this.f70034b) {
            Log.i("MPAndroidChart", "Data is set.");
        }
    }

    public void setDescription(C51352x01 c51352x01) {
        this.f70044l = c51352x01;
    }

    public void setDragDecelerationEnabled(boolean z) {
        this.f70037e = z;
    }

    public void setDragDecelerationFrictionCoef(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f >= 1.0f) {
            f = 0.999f;
        }
        this.f70038f = f;
    }

    @Deprecated
    public void setDrawMarkerViews(boolean z) {
        setDrawMarkers(z);
    }

    public void setDrawMarkers(boolean z) {
        this.f70030B = z;
    }

    public void setExtraBottomOffset(float f) {
        this.f70055w = AbstractC34967Oi6.m91656e(f);
    }

    public void setExtraLeftOffset(float f) {
        this.f70056x = AbstractC34967Oi6.m91656e(f);
    }

    public void setExtraOffsets(float f, float f2, float f3, float f4) {
        setExtraLeftOffset(f);
        setExtraTopOffset(f2);
        setExtraRightOffset(f3);
        setExtraBottomOffset(f4);
    }

    public void setExtraRightOffset(float f) {
        this.f70054v = AbstractC34967Oi6.m91656e(f);
    }

    public void setExtraTopOffset(float f) {
        this.f70053u = AbstractC34967Oi6.m91656e(f);
    }

    public void setHardwareAccelerationEnabled(boolean z) {
        if (z) {
            setLayerType(2, null);
        } else {
            setLayerType(1, null);
        }
    }

    public void setHighlightPerTapEnabled(boolean z) {
        this.f70036d = z;
    }

    public void setHighlighter(C43465ji0 c43465ji0) {
        this.f70050r = c43465ji0;
    }

    public void setLogEnabled(boolean z) {
        this.f70034b = z;
    }

    public void setMarker(RO1 ro1) {
        this.f70031C = ro1;
    }

    @Deprecated
    public void setMarkerView(RO1 ro1) {
        setMarker(ro1);
    }

    public void setMaxHighlightDistance(float f) {
        this.f70029A = AbstractC34967Oi6.m91656e(f);
    }

    public void setNoDataText(String str) {
        this.f70047o = str;
    }

    public void setNoDataTextColor(int i) {
        this.f70041i.setColor(i);
    }

    public void setNoDataTextTypeface(Typeface typeface) {
        this.f70041i.setTypeface(typeface);
    }

    public void setOnChartGestureListener(InterfaceC42845if3 interfaceC42845if3) {
    }

    public void setOnChartValueSelectedListener(InterfaceC43438jf3 interfaceC43438jf3) {
    }

    public void setOnTouchListener(AbstractView$OnTouchListenerC44651li0 abstractView$OnTouchListenerC44651li0) {
        this.f70046n = abstractView$OnTouchListenerC44651li0;
    }

    public void setPaint(Paint paint, int i) {
        if (i != 7) {
            if (i == 11) {
                this.f70040h = paint;
                return;
            }
            return;
        }
        this.f70041i = paint;
    }

    public void setRenderer(RS0 rs0) {
        if (rs0 != null) {
            this.f70049q = rs0;
        }
    }

    public void setTouchEnabled(boolean z) {
        this.f70043k = z;
    }

    public void setUnbindEnabled(boolean z) {
        this.f70033E = z;
    }

    /* renamed from: t */
    public void m52006t() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    /* renamed from: u */
    public void m52005u(Canvas canvas) {
        float f;
        float f2;
        C51352x01 c51352x01 = this.f70044l;
        if (c51352x01 != null && c51352x01.m93268f()) {
            PE2 m6004i = this.f70044l.m6004i();
            this.f70040h.setTypeface(this.f70044l.m93271c());
            this.f70040h.setTextSize(this.f70044l.m93272b());
            this.f70040h.setColor(this.f70044l.m93273a());
            this.f70040h.setTextAlign(this.f70044l.m6002k());
            if (m6004i == null) {
                f2 = (getWidth() - this.f70051s.m106400H()) - this.f70044l.m93270d();
                f = (getHeight() - this.f70051s.m106402F()) - this.f70044l.m93269e();
            } else {
                float f3 = m6004i.f28146c;
                f = m6004i.f28147d;
                f2 = f3;
            }
            canvas.drawText(this.f70044l.m6003j(), f2, f, this.f70040h);
        }
    }

    /* renamed from: v */
    public void mo51999v(Canvas canvas) {
        if (this.f70031C != null && m52014Q() && m52008X()) {
            int i = 0;
            while (true) {
                OM1[] om1Arr = this.f70058z;
                if (i < om1Arr.length) {
                    OM1 om1 = om1Arr[i];
                    InterfaceC46243oO1 mo17499d = this.f70035c.mo17499d(om1.m92391d());
                    Entry mo17498h = this.f70035c.mo17498h(this.f70058z[i]);
                    int mo21238b = mo17499d.mo21238b(mo17498h);
                    if (mo17498h != null && mo21238b <= mo17499d.mo21241L0() * this.f70052t.m36088a()) {
                        float[] mo51992J = mo51992J(om1);
                        if (this.f70051s.m106363x(mo51992J[0], mo51992J[1])) {
                            this.f70031C.mo51948b(mo17498h, om1);
                            this.f70031C.mo51949a(canvas, mo51992J[0], mo51992J[1]);
                        }
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: w */
    public void m52004w() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    /* renamed from: x */
    public C42279hi0 m52003x() {
        return this.f70052t;
    }

    /* renamed from: y */
    public PE2 m52002y() {
        return PE2.m90558c(getWidth() / 2.0f, getHeight() / 2.0f);
    }

    /* renamed from: z */
    public PE2 m52001z() {
        return this.f70051s.m106373n();
    }

    public Chart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f70034b = false;
        this.f70035c = null;
        this.f70036d = true;
        this.f70037e = true;
        this.f70038f = 0.9f;
        this.f70039g = new WY0(0);
        this.f70043k = true;
        this.f70047o = "No chart data available.";
        this.f70051s = new C32951Fs6();
        this.f70053u = 0.0f;
        this.f70054v = 0.0f;
        this.f70055w = 0.0f;
        this.f70056x = 0.0f;
        this.f70057y = false;
        this.f70029A = 0.0f;
        this.f70030B = true;
        this.f70032D = new ArrayList<>();
        this.f70033E = false;
        mo51950O();
    }

    public Chart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f70034b = false;
        this.f70035c = null;
        this.f70036d = true;
        this.f70037e = true;
        this.f70038f = 0.9f;
        this.f70039g = new WY0(0);
        this.f70043k = true;
        this.f70047o = "No chart data available.";
        this.f70051s = new C32951Fs6();
        this.f70053u = 0.0f;
        this.f70054v = 0.0f;
        this.f70055w = 0.0f;
        this.f70056x = 0.0f;
        this.f70057y = false;
        this.f70029A = 0.0f;
        this.f70030B = true;
        this.f70032D = new ArrayList<>();
        this.f70033E = false;
        mo51950O();
    }
}

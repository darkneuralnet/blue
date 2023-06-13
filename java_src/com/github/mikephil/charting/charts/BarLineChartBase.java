package com.github.mikephil.charting.charts;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import com.github.mikephil.charting.data.Entry;
import p000.AbstractC30353xx;
import p000.C37875aI6;
import p000.C41175fq2;
import p000.C49149tH6;
@SuppressLint({"RtlHardcoded"})
/* loaded from: classes5.dex */
public abstract class BarLineChartBase<T extends AbstractC30353xx<? extends YN1<? extends Entry>>> extends Chart<T> implements InterfaceC30784yx {

    /* renamed from: A0 */
    public long f69988A0;

    /* renamed from: B0 */
    public RectF f69989B0;

    /* renamed from: C0 */
    public Matrix f69990C0;

    /* renamed from: D0 */
    public Matrix f69991D0;

    /* renamed from: E0 */
    public boolean f69992E0;

    /* renamed from: F */
    public int f69993F;

    /* renamed from: F0 */
    public float[] f69994F0;

    /* renamed from: G */
    public boolean f69995G;

    /* renamed from: G0 */
    public OE2 f69996G0;

    /* renamed from: H */
    public boolean f69997H;

    /* renamed from: H0 */
    public OE2 f69998H0;

    /* renamed from: I */
    public boolean f69999I;

    /* renamed from: I0 */
    public float[] f70000I0;

    /* renamed from: J */
    public boolean f70001J;

    /* renamed from: K */
    public boolean f70002K;

    /* renamed from: P */
    public boolean f70003P;

    /* renamed from: Q */
    public boolean f70004Q;

    /* renamed from: R */
    public boolean f70005R;

    /* renamed from: S */
    public Paint f70006S;

    /* renamed from: T */
    public Paint f70007T;

    /* renamed from: U */
    public boolean f70008U;

    /* renamed from: W */
    public boolean f70009W;

    /* renamed from: p0 */
    public boolean f70010p0;

    /* renamed from: q0 */
    public float f70011q0;

    /* renamed from: r0 */
    public boolean f70012r0;

    /* renamed from: s0 */
    public C37875aI6 f70013s0;

    /* renamed from: t0 */
    public C37875aI6 f70014t0;

    /* renamed from: u0 */
    public C38468bI6 f70015u0;

    /* renamed from: v0 */
    public C38468bI6 f70016v0;

    /* renamed from: w0 */
    public D96 f70017w0;

    /* renamed from: x0 */
    public D96 f70018x0;

    /* renamed from: y0 */
    public C49742uH6 f70019y0;

    /* renamed from: z0 */
    public long f70020z0;

    /* renamed from: com.github.mikephil.charting.charts.BarLineChartBase$a */
    /* loaded from: classes5.dex */
    public class RunnableC17430a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ float f70021b;

        /* renamed from: c */
        public final /* synthetic */ float f70022c;

        /* renamed from: d */
        public final /* synthetic */ float f70023d;

        /* renamed from: e */
        public final /* synthetic */ float f70024e;

        public RunnableC17430a(float f, float f2, float f3, float f4) {
            this.f70021b = f;
            this.f70022c = f2;
            this.f70023d = f3;
            this.f70024e = f4;
        }

        @Override // java.lang.Runnable
        public void run() {
            BarLineChartBase.this.f70051s.m106397K(this.f70021b, this.f70022c, this.f70023d, this.f70024e);
            BarLineChartBase.this.m52028t0();
            BarLineChartBase.this.mo51996u0();
        }
    }

    /* renamed from: com.github.mikephil.charting.charts.BarLineChartBase$b */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C17431b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f70026a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f70027b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f70028c;

        static {
            int[] iArr = new int[C41175fq2.EnumC20549e.values().length];
            f70028c = iArr;
            try {
                iArr[C41175fq2.EnumC20549e.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70028c[C41175fq2.EnumC20549e.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[C41175fq2.EnumC20548d.values().length];
            f70027b = iArr2;
            try {
                iArr2[C41175fq2.EnumC20548d.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f70027b[C41175fq2.EnumC20548d.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f70027b[C41175fq2.EnumC20548d.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[C41175fq2.EnumC20550f.values().length];
            f70026a = iArr3;
            try {
                iArr3[C41175fq2.EnumC20550f.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f70026a[C41175fq2.EnumC20550f.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public BarLineChartBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f69993F = 100;
        this.f69995G = false;
        this.f69997H = false;
        this.f69999I = true;
        this.f70001J = true;
        this.f70002K = true;
        this.f70003P = true;
        this.f70004Q = true;
        this.f70005R = true;
        this.f70008U = false;
        this.f70009W = false;
        this.f70010p0 = false;
        this.f70011q0 = 15.0f;
        this.f70012r0 = false;
        this.f70020z0 = 0L;
        this.f69988A0 = 0L;
        this.f69989B0 = new RectF();
        this.f69990C0 = new Matrix();
        this.f69991D0 = new Matrix();
        this.f69992E0 = false;
        this.f69994F0 = new float[2];
        this.f69996G0 = OE2.m92598b(0.0d, 0.0d);
        this.f69998H0 = OE2.m92598b(0.0d, 0.0d);
        this.f70000I0 = new float[2];
    }

    @Override // com.github.mikephil.charting.charts.Chart
    /* renamed from: O */
    public void mo51950O() {
        super.mo51950O();
        this.f70013s0 = new C37875aI6(C37875aI6.EnumC10624a.LEFT);
        this.f70014t0 = new C37875aI6(C37875aI6.EnumC10624a.RIGHT);
        this.f70017w0 = new D96(this.f70051s);
        this.f70018x0 = new D96(this.f70051s);
        this.f70015u0 = new C38468bI6(this.f70051s, this.f70013s0, this.f70017w0);
        this.f70016v0 = new C38468bI6(this.f70051s, this.f70014t0, this.f70018x0);
        this.f70019y0 = new C49742uH6(this.f70051s, this.f70042j, this.f70017w0);
        setHighlighter(new C43465ji0(this));
        this.f70046n = new C29996wx(this, this.f70051s.m106371p(), 3.0f);
        Paint paint = new Paint();
        this.f70006S = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f70006S.setColor(Color.rgb(240, 240, 240));
        Paint paint2 = new Paint();
        this.f70007T = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f70007T.setColor(-16777216);
        this.f70007T.setStrokeWidth(AbstractC34967Oi6.m91656e(1.0f));
    }

    @Override // com.github.mikephil.charting.charts.Chart
    /* renamed from: T */
    public void mo51966T() {
        if (this.f70035c == null) {
            if (this.f70034b) {
                Log.i("MPAndroidChart", "Preparing... DATA NOT SET.");
                return;
            }
            return;
        }
        if (this.f70034b) {
            Log.i("MPAndroidChart", "Preparing...");
        }
        RS0 rs0 = this.f70049q;
        if (rs0 != null) {
            rs0.mo14996f();
        }
        mo52048Z();
        C38468bI6 c38468bI6 = this.f70015u0;
        C37875aI6 c37875aI6 = this.f70013s0;
        c38468bI6.mo8936a(c37875aI6.f44171H, c37875aI6.f44170G, c37875aI6.m71677c0());
        C38468bI6 c38468bI62 = this.f70016v0;
        C37875aI6 c37875aI62 = this.f70014t0;
        c38468bI62.mo8936a(c37875aI62.f44171H, c37875aI62.f44170G, c37875aI62.m71677c0());
        C49742uH6 c49742uH6 = this.f70019y0;
        C49149tH6 c49149tH6 = this.f70042j;
        c49742uH6.mo8936a(c49149tH6.f44171H, c49149tH6.f44170G, false);
        if (this.f70045m != null) {
            this.f70048p.m35769a(this.f70035c);
        }
        mo51967r();
    }

    /* renamed from: Y */
    public void m52049Y() {
        ((AbstractC30353xx) this.f70035c).m33554c(mo2232c(), mo2230o());
        this.f70042j.mo71674j(((AbstractC30353xx) this.f70035c).m33546m(), ((AbstractC30353xx) this.f70035c).m33547l());
        if (this.f70013s0.m93268f()) {
            C37875aI6 c37875aI6 = this.f70013s0;
            C37875aI6.EnumC10624a enumC10624a = C37875aI6.EnumC10624a.LEFT;
            c37875aI6.mo71674j(((AbstractC30353xx) this.f70035c).m33542q(enumC10624a), ((AbstractC30353xx) this.f70035c).m33544o(enumC10624a));
        }
        if (this.f70014t0.m93268f()) {
            C37875aI6 c37875aI62 = this.f70014t0;
            C37875aI6.EnumC10624a enumC10624a2 = C37875aI6.EnumC10624a.RIGHT;
            c37875aI62.mo71674j(((AbstractC30353xx) this.f70035c).m33542q(enumC10624a2), ((AbstractC30353xx) this.f70035c).m33544o(enumC10624a2));
        }
        mo51967r();
    }

    /* renamed from: Z */
    public void mo52048Z() {
        this.f70042j.mo71674j(((AbstractC30353xx) this.f70035c).m33546m(), ((AbstractC30353xx) this.f70035c).m33547l());
        C37875aI6 c37875aI6 = this.f70013s0;
        C37875aI6.EnumC10624a enumC10624a = C37875aI6.EnumC10624a.LEFT;
        c37875aI6.mo71674j(((AbstractC30353xx) this.f70035c).m33542q(enumC10624a), ((AbstractC30353xx) this.f70035c).m33544o(enumC10624a));
        C37875aI6 c37875aI62 = this.f70014t0;
        C37875aI6.EnumC10624a enumC10624a2 = C37875aI6.EnumC10624a.RIGHT;
        c37875aI62.mo71674j(((AbstractC30353xx) this.f70035c).m33542q(enumC10624a2), ((AbstractC30353xx) this.f70035c).m33544o(enumC10624a2));
    }

    /* renamed from: a0 */
    public void m52047a0(RectF rectF) {
        rectF.left = 0.0f;
        rectF.right = 0.0f;
        rectF.top = 0.0f;
        rectF.bottom = 0.0f;
        C41175fq2 c41175fq2 = this.f70045m;
        if (c41175fq2 != null && c41175fq2.m93268f() && !this.f70045m.m40775D()) {
            int i = C17431b.f70028c[this.f70045m.m40756y().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    int i2 = C17431b.f70026a[this.f70045m.m40778A().ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            rectF.bottom += Math.min(this.f70045m.f80803y, this.f70051s.m106375l() * this.f70045m.m40759v()) + this.f70045m.m93269e();
                            return;
                        }
                        return;
                    }
                    rectF.top += Math.min(this.f70045m.f80803y, this.f70051s.m106375l() * this.f70045m.m40759v()) + this.f70045m.m93269e();
                    return;
                }
                return;
            }
            int i3 = C17431b.f70027b[this.f70045m.m40760u().ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        int i4 = C17431b.f70026a[this.f70045m.m40778A().ordinal()];
                        if (i4 != 1) {
                            if (i4 == 2) {
                                rectF.bottom += Math.min(this.f70045m.f80803y, this.f70051s.m106375l() * this.f70045m.m40759v()) + this.f70045m.m93269e();
                                return;
                            }
                            return;
                        }
                        rectF.top += Math.min(this.f70045m.f80803y, this.f70051s.m106375l() * this.f70045m.m40759v()) + this.f70045m.m93269e();
                        return;
                    }
                    return;
                }
                rectF.right += Math.min(this.f70045m.f80802x, this.f70051s.m106374m() * this.f70045m.m40759v()) + this.f70045m.m93270d();
                return;
            }
            rectF.left += Math.min(this.f70045m.f80802x, this.f70051s.m106374m() * this.f70045m.m40759v()) + this.f70045m.m93270d();
        }
    }

    /* renamed from: b0 */
    public void m52046b0(Canvas canvas) {
        if (this.f70008U) {
            canvas.drawRect(this.f70051s.m106372o(), this.f70006S);
        }
        if (this.f70009W) {
            canvas.drawRect(this.f70051s.m106372o(), this.f70007T);
        }
    }

    @Override // p000.InterfaceC30784yx
    /* renamed from: c */
    public float mo2232c() {
        mo2231d(C37875aI6.EnumC10624a.LEFT).m110830h(this.f70051s.m106379h(), this.f70051s.m106381f(), this.f69996G0);
        return (float) Math.max(this.f70042j.f44171H, this.f69996G0.f26254c);
    }

    /* renamed from: c0 */
    public C37875aI6 m52045c0(C37875aI6.EnumC10624a enumC10624a) {
        if (enumC10624a == C37875aI6.EnumC10624a.LEFT) {
            return this.f70013s0;
        }
        return this.f70014t0;
    }

    @Override // android.view.View
    public void computeScroll() {
        AbstractView$OnTouchListenerC44651li0 abstractView$OnTouchListenerC44651li0 = this.f70046n;
        if (abstractView$OnTouchListenerC44651li0 instanceof C29996wx) {
            ((C29996wx) abstractView$OnTouchListenerC44651li0).m6085f();
        }
    }

    @Override // p000.InterfaceC30784yx
    /* renamed from: d */
    public D96 mo2231d(C37875aI6.EnumC10624a enumC10624a) {
        if (enumC10624a == C37875aI6.EnumC10624a.LEFT) {
            return this.f70017w0;
        }
        return this.f70018x0;
    }

    /* renamed from: d0 */
    public C37875aI6 m52044d0() {
        return this.f70013s0;
    }

    /* renamed from: e0 */
    public float m52043e0(C37875aI6.EnumC10624a enumC10624a) {
        if (enumC10624a == C37875aI6.EnumC10624a.LEFT) {
            return this.f70013s0.f44172I;
        }
        return this.f70014t0.f44172I;
    }

    /* renamed from: f0 */
    public C37875aI6 m52042f0() {
        return this.f70014t0;
    }

    @Override // p000.InterfaceC44058ki0
    /* renamed from: g */
    public float mo28587g() {
        return Math.min(this.f70013s0.f44171H, this.f70014t0.f44171H);
    }

    /* renamed from: g0 */
    public YN1 m52041g0(float f, float f2) {
        OM1 mo51997G = mo51997G(f, f2);
        if (mo51997G != null) {
            return (YN1) ((AbstractC30353xx) this.f70035c).mo17499d(mo51997G.m92391d());
        }
        return null;
    }

    @Override // com.github.mikephil.charting.charts.Chart, p000.InterfaceC44058ki0, p000.InterfaceC30784yx
    public /* bridge */ /* synthetic */ AbstractC30353xx getData() {
        return (AbstractC30353xx) super.getData();
    }

    @Override // android.view.View
    public float getScaleX() {
        C32951Fs6 c32951Fs6 = this.f70051s;
        if (c32951Fs6 == null) {
            return 1.0f;
        }
        return c32951Fs6.m106370q();
    }

    @Override // android.view.View
    public float getScaleY() {
        C32951Fs6 c32951Fs6 = this.f70051s;
        if (c32951Fs6 == null) {
            return 1.0f;
        }
        return c32951Fs6.m106369r();
    }

    @Override // p000.InterfaceC44058ki0
    /* renamed from: h */
    public float mo28586h() {
        return Math.max(this.f70013s0.f44170G, this.f70014t0.f44170G);
    }

    /* renamed from: h0 */
    public boolean m52040h0() {
        return this.f70051s.m106367t();
    }

    @Override // p000.InterfaceC44058ki0
    /* renamed from: i */
    public int mo28585i() {
        return this.f69993F;
    }

    /* renamed from: i0 */
    public boolean m52039i0() {
        if (this.f70013s0.m71677c0() || this.f70014t0.m71677c0()) {
            return true;
        }
        return false;
    }

    /* renamed from: j0 */
    public boolean m52038j0() {
        return this.f70010p0;
    }

    /* renamed from: k0 */
    public boolean m52037k0() {
        return this.f69999I;
    }

    /* renamed from: l0 */
    public boolean m52036l0() {
        return this.f70002K || this.f70003P;
    }

    /* renamed from: m0 */
    public boolean m52035m0() {
        return this.f70002K;
    }

    /* renamed from: n0 */
    public boolean m52034n0() {
        return this.f70003P;
    }

    @Override // p000.InterfaceC30784yx
    /* renamed from: o */
    public float mo2230o() {
        mo2231d(C37875aI6.EnumC10624a.LEFT).m110830h(this.f70051s.m106378i(), this.f70051s.m106381f(), this.f69998H0);
        return (float) Math.min(this.f70042j.f44170G, this.f69998H0.f26254c);
    }

    /* renamed from: o0 */
    public boolean m52033o0() {
        return this.f70051s.m106366u();
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f70035c == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        m52046b0(canvas);
        if (this.f69995G) {
            m52049Y();
        }
        if (this.f70013s0.m93268f()) {
            C38468bI6 c38468bI6 = this.f70015u0;
            C37875aI6 c37875aI6 = this.f70013s0;
            c38468bI6.mo8936a(c37875aI6.f44171H, c37875aI6.f44170G, c37875aI6.m71677c0());
        }
        if (this.f70014t0.m93268f()) {
            C38468bI6 c38468bI62 = this.f70016v0;
            C37875aI6 c37875aI62 = this.f70014t0;
            c38468bI62.mo8936a(c37875aI62.f44171H, c37875aI62.f44170G, c37875aI62.m71677c0());
        }
        if (this.f70042j.m93268f()) {
            C49742uH6 c49742uH6 = this.f70019y0;
            C49149tH6 c49149tH6 = this.f70042j;
            c49742uH6.mo8936a(c49149tH6.f44171H, c49149tH6.f44170G, false);
        }
        this.f70019y0.mo8931j(canvas);
        this.f70015u0.mo61608j(canvas);
        this.f70016v0.mo61608j(canvas);
        if (this.f70042j.m76122y()) {
            this.f70019y0.m10481k(canvas);
        }
        if (this.f70013s0.m76122y()) {
            this.f70015u0.m64695k(canvas);
        }
        if (this.f70014t0.m76122y()) {
            this.f70016v0.m64695k(canvas);
        }
        if (this.f70042j.m93268f() && this.f70042j.m76151B()) {
            this.f70019y0.mo7040n(canvas);
        }
        if (this.f70013s0.m93268f() && this.f70013s0.m76151B()) {
            this.f70015u0.mo44407l(canvas);
        }
        if (this.f70014t0.m93268f() && this.f70014t0.m76151B()) {
            this.f70016v0.mo44407l(canvas);
        }
        int save = canvas.save();
        canvas.clipRect(this.f70051s.m106372o());
        this.f70049q.mo15000b(canvas);
        if (!this.f70042j.m76122y()) {
            this.f70019y0.m10481k(canvas);
        }
        if (!this.f70013s0.m76122y()) {
            this.f70015u0.m64695k(canvas);
        }
        if (!this.f70014t0.m76122y()) {
            this.f70016v0.m64695k(canvas);
        }
        if (m52008X()) {
            this.f70049q.mo14998d(canvas, this.f70058z);
        }
        canvas.restoreToCount(save);
        this.f70049q.mo14999c(canvas);
        if (this.f70042j.m93268f() && !this.f70042j.m76151B()) {
            this.f70019y0.mo7040n(canvas);
        }
        if (this.f70013s0.m93268f() && !this.f70013s0.m76151B()) {
            this.f70015u0.mo44407l(canvas);
        }
        if (this.f70014t0.m93268f() && !this.f70014t0.m76151B()) {
            this.f70016v0.mo44407l(canvas);
        }
        this.f70019y0.mo7041i(canvas);
        this.f70015u0.mo44408i(canvas);
        this.f70016v0.mo44408i(canvas);
        if (m52038j0()) {
            int save2 = canvas.save();
            canvas.clipRect(this.f70051s.m106372o());
            this.f70049q.mo14997e(canvas);
            canvas.restoreToCount(save2);
        } else {
            this.f70049q.mo14997e(canvas);
        }
        this.f70048p.m35765e(canvas);
        m52005u(canvas);
        mo51999v(canvas);
        if (this.f70034b) {
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            long j = this.f70020z0 + currentTimeMillis2;
            this.f70020z0 = j;
            long j2 = this.f69988A0 + 1;
            this.f69988A0 = j2;
            Log.i("MPAndroidChart", "Drawtime: " + currentTimeMillis2 + " ms, average: " + (j / j2) + " ms, cycles: " + this.f69988A0);
        }
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        float[] fArr = this.f70000I0;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        if (this.f70012r0) {
            fArr[0] = this.f70051s.m106379h();
            this.f70000I0[1] = this.f70051s.m106377j();
            mo2231d(C37875aI6.EnumC10624a.LEFT).m110828j(this.f70000I0);
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f70012r0) {
            mo2231d(C37875aI6.EnumC10624a.LEFT).m110827k(this.f70000I0);
            this.f70051s.m106382e(this.f70000I0, this);
            return;
        }
        C32951Fs6 c32951Fs6 = this.f70051s;
        c32951Fs6.m106398J(c32951Fs6.m106371p(), this, true);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        AbstractView$OnTouchListenerC44651li0 abstractView$OnTouchListenerC44651li0 = this.f70046n;
        if (abstractView$OnTouchListenerC44651li0 == null || this.f70035c == null || !this.f70043k) {
            return false;
        }
        return abstractView$OnTouchListenerC44651li0.onTouch(this, motionEvent);
    }

    @Override // p000.InterfaceC30784yx
    /* renamed from: p */
    public boolean mo2229p(C37875aI6.EnumC10624a enumC10624a) {
        return m52045c0(enumC10624a).m71677c0();
    }

    /* renamed from: p0 */
    public boolean m52032p0() {
        return this.f70001J;
    }

    /* renamed from: q0 */
    public boolean m52031q0() {
        return this.f69997H;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    /* renamed from: r */
    public void mo51967r() {
        if (!this.f69992E0) {
            m52047a0(this.f69989B0);
            RectF rectF = this.f69989B0;
            float f = rectF.left + 0.0f;
            float f2 = rectF.top + 0.0f;
            float f3 = rectF.right + 0.0f;
            float f4 = rectF.bottom + 0.0f;
            if (this.f70013s0.m71676d0()) {
                f += this.f70013s0.m71685U(this.f70015u0.m74024c());
            }
            if (this.f70014t0.m71676d0()) {
                f3 += this.f70014t0.m71685U(this.f70016v0.m74024c());
            }
            if (this.f70042j.m93268f() && this.f70042j.m76152A()) {
                C49149tH6 c49149tH6 = this.f70042j;
                float m93269e = c49149tH6.f110255M + c49149tH6.m93269e();
                if (this.f70042j.m12530Q() == C49149tH6.EnumC28671a.BOTTOM) {
                    f4 += m93269e;
                } else {
                    if (this.f70042j.m12530Q() != C49149tH6.EnumC28671a.TOP) {
                        if (this.f70042j.m12530Q() == C49149tH6.EnumC28671a.BOTH_SIDED) {
                            f4 += m93269e;
                        }
                    }
                    f2 += m93269e;
                }
            }
            float m52021F = f2 + m52021F();
            float m52022E = f3 + m52022E();
            float m52024C = f4 + m52024C();
            float m52023D = f + m52023D();
            float m91656e = AbstractC34967Oi6.m91656e(this.f70011q0);
            this.f70051s.m106397K(Math.max(m91656e, m52023D), Math.max(m91656e, m52021F), Math.max(m91656e, m52022E), Math.max(m91656e, m52024C));
            if (this.f70034b) {
                Log.i("MPAndroidChart", "offsetLeft: " + m52023D + ", offsetTop: " + m52021F + ", offsetRight: " + m52022E + ", offsetBottom: " + m52024C);
                StringBuilder sb = new StringBuilder();
                sb.append("Content: ");
                sb.append(this.f70051s.m106372o().toString());
                Log.i("MPAndroidChart", sb.toString());
            }
        }
        m52028t0();
        mo51996u0();
    }

    /* renamed from: r0 */
    public boolean m52030r0() {
        return this.f70004Q;
    }

    /* renamed from: s0 */
    public boolean m52029s0() {
        return this.f70005R;
    }

    public void setAutoScaleMinMaxEnabled(boolean z) {
        this.f69995G = z;
    }

    public void setBorderColor(int i) {
        this.f70007T.setColor(i);
    }

    public void setBorderWidth(float f) {
        this.f70007T.setStrokeWidth(AbstractC34967Oi6.m91656e(f));
    }

    public void setClipValuesToContent(boolean z) {
        this.f70010p0 = z;
    }

    public void setDoubleTapToZoomEnabled(boolean z) {
        this.f69999I = z;
    }

    public void setDragEnabled(boolean z) {
        this.f70002K = z;
        this.f70003P = z;
    }

    public void setDragOffsetX(float f) {
        this.f70051s.m106395M(f);
    }

    public void setDragOffsetY(float f) {
        this.f70051s.m106394N(f);
    }

    public void setDragXEnabled(boolean z) {
        this.f70002K = z;
    }

    public void setDragYEnabled(boolean z) {
        this.f70003P = z;
    }

    public void setDrawBorders(boolean z) {
        this.f70009W = z;
    }

    public void setDrawGridBackground(boolean z) {
        this.f70008U = z;
    }

    public void setGridBackgroundColor(int i) {
        this.f70006S.setColor(i);
    }

    public void setHighlightPerDragEnabled(boolean z) {
        this.f70001J = z;
    }

    public void setKeepPositionOnRotation(boolean z) {
        this.f70012r0 = z;
    }

    public void setMaxVisibleValueCount(int i) {
        this.f69993F = i;
    }

    public void setMinOffset(float f) {
        this.f70011q0 = f;
    }

    public void setOnDrawListener(InterfaceC34712Ng3 interfaceC34712Ng3) {
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void setPaint(Paint paint, int i) {
        super.setPaint(paint, i);
        if (i == 4) {
            this.f70006S = paint;
        }
    }

    public void setPinchZoom(boolean z) {
        this.f69997H = z;
    }

    public void setRendererLeftYAxis(C38468bI6 c38468bI6) {
        this.f70015u0 = c38468bI6;
    }

    public void setRendererRightYAxis(C38468bI6 c38468bI6) {
        this.f70016v0 = c38468bI6;
    }

    public void setScaleEnabled(boolean z) {
        this.f70004Q = z;
        this.f70005R = z;
    }

    public void setScaleMinima(float f, float f2) {
        this.f70051s.m106389S(f);
        this.f70051s.m106388T(f2);
    }

    public void setScaleXEnabled(boolean z) {
        this.f70004Q = z;
    }

    public void setScaleYEnabled(boolean z) {
        this.f70005R = z;
    }

    public void setViewPortOffsets(float f, float f2, float f3, float f4) {
        this.f69992E0 = true;
        post(new RunnableC17430a(f, f2, f3, f4));
    }

    public void setVisibleXRange(float f, float f2) {
        float f3 = this.f70042j.f44172I;
        this.f70051s.m106391Q(f3 / f, f3 / f2);
    }

    public void setVisibleXRangeMaximum(float f) {
        this.f70051s.m106389S(this.f70042j.f44172I / f);
    }

    public void setVisibleXRangeMinimum(float f) {
        this.f70051s.m106393O(this.f70042j.f44172I / f);
    }

    public void setVisibleYRange(float f, float f2, C37875aI6.EnumC10624a enumC10624a) {
        this.f70051s.m106390R(m52043e0(enumC10624a) / f, m52043e0(enumC10624a) / f2);
    }

    public void setVisibleYRangeMaximum(float f, C37875aI6.EnumC10624a enumC10624a) {
        this.f70051s.m106388T(m52043e0(enumC10624a) / f);
    }

    public void setVisibleYRangeMinimum(float f, C37875aI6.EnumC10624a enumC10624a) {
        this.f70051s.m106392P(m52043e0(enumC10624a) / f);
    }

    public void setXAxisRenderer(C49742uH6 c49742uH6) {
        this.f70019y0 = c49742uH6;
    }

    /* renamed from: t0 */
    public void m52028t0() {
        this.f70018x0.mo109333l(this.f70014t0.m71677c0());
        this.f70017w0.mo109333l(this.f70013s0.m71677c0());
    }

    /* renamed from: u0 */
    public void mo51996u0() {
        if (this.f70034b) {
            Log.i("MPAndroidChart", "Preparing Value-Px Matrix, xmin: " + this.f70042j.f44171H + ", xmax: " + this.f70042j.f44170G + ", xdelta: " + this.f70042j.f44172I);
        }
        D96 d96 = this.f70018x0;
        C49149tH6 c49149tH6 = this.f70042j;
        float f = c49149tH6.f44171H;
        float f2 = c49149tH6.f44172I;
        C37875aI6 c37875aI6 = this.f70014t0;
        d96.m110826m(f, f2, c37875aI6.f44172I, c37875aI6.f44171H);
        D96 d962 = this.f70017w0;
        C49149tH6 c49149tH62 = this.f70042j;
        float f3 = c49149tH62.f44171H;
        float f4 = c49149tH62.f44172I;
        C37875aI6 c37875aI62 = this.f70013s0;
        d962.m110826m(f3, f4, c37875aI62.f44172I, c37875aI62.f44171H);
    }

    /* renamed from: v0 */
    public void m52027v0(float f, float f2, float f3, float f4) {
        this.f70051s.m106387U(f, f2, f3, -f4, this.f69990C0);
        this.f70051s.m106398J(this.f69990C0, this, false);
        mo51967r();
        postInvalidate();
    }

    public BarLineChartBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69993F = 100;
        this.f69995G = false;
        this.f69997H = false;
        this.f69999I = true;
        this.f70001J = true;
        this.f70002K = true;
        this.f70003P = true;
        this.f70004Q = true;
        this.f70005R = true;
        this.f70008U = false;
        this.f70009W = false;
        this.f70010p0 = false;
        this.f70011q0 = 15.0f;
        this.f70012r0 = false;
        this.f70020z0 = 0L;
        this.f69988A0 = 0L;
        this.f69989B0 = new RectF();
        this.f69990C0 = new Matrix();
        this.f69991D0 = new Matrix();
        this.f69992E0 = false;
        this.f69994F0 = new float[2];
        this.f69996G0 = OE2.m92598b(0.0d, 0.0d);
        this.f69998H0 = OE2.m92598b(0.0d, 0.0d);
        this.f70000I0 = new float[2];
    }

    public BarLineChartBase(Context context) {
        super(context);
        this.f69993F = 100;
        this.f69995G = false;
        this.f69997H = false;
        this.f69999I = true;
        this.f70001J = true;
        this.f70002K = true;
        this.f70003P = true;
        this.f70004Q = true;
        this.f70005R = true;
        this.f70008U = false;
        this.f70009W = false;
        this.f70010p0 = false;
        this.f70011q0 = 15.0f;
        this.f70012r0 = false;
        this.f70020z0 = 0L;
        this.f69988A0 = 0L;
        this.f69989B0 = new RectF();
        this.f69990C0 = new Matrix();
        this.f69991D0 = new Matrix();
        this.f69992E0 = false;
        this.f69994F0 = new float[2];
        this.f69996G0 = OE2.m92598b(0.0d, 0.0d);
        this.f69998H0 = OE2.m92598b(0.0d, 0.0d);
        this.f70000I0 = new float[2];
    }
}

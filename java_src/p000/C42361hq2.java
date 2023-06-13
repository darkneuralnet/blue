package p000;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.C41175fq2;
/* renamed from: hq2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C42361hq2 extends AbstractC47770qx4 {

    /* renamed from: b */
    public Paint f85978b;

    /* renamed from: c */
    public Paint f85979c;

    /* renamed from: d */
    public C41175fq2 f85980d;

    /* renamed from: e */
    public List<C41768gq2> f85981e;

    /* renamed from: f */
    public Paint.FontMetrics f85982f;

    /* renamed from: g */
    public Path f85983g;

    /* renamed from: hq2$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C22770a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f85984a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f85985b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f85986c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f85987d;

        static {
            int[] iArr = new int[C41175fq2.EnumC20547c.values().length];
            f85987d = iArr;
            try {
                iArr[C41175fq2.EnumC20547c.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f85987d[C41175fq2.EnumC20547c.EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f85987d[C41175fq2.EnumC20547c.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f85987d[C41175fq2.EnumC20547c.CIRCLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f85987d[C41175fq2.EnumC20547c.SQUARE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f85987d[C41175fq2.EnumC20547c.LINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[C41175fq2.EnumC20549e.values().length];
            f85986c = iArr2;
            try {
                iArr2[C41175fq2.EnumC20549e.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f85986c[C41175fq2.EnumC20549e.VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[C41175fq2.EnumC20550f.values().length];
            f85985b = iArr3;
            try {
                iArr3[C41175fq2.EnumC20550f.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f85985b[C41175fq2.EnumC20550f.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f85985b[C41175fq2.EnumC20550f.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr4 = new int[C41175fq2.EnumC20548d.values().length];
            f85984a = iArr4;
            try {
                iArr4[C41175fq2.EnumC20548d.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f85984a[C41175fq2.EnumC20548d.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f85984a[C41175fq2.EnumC20548d.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public C42361hq2(C32951Fs6 c32951Fs6, C41175fq2 c41175fq2) {
        super(c32951Fs6);
        this.f85981e = new ArrayList(16);
        this.f85982f = new Paint.FontMetrics();
        this.f85983g = new Path();
        this.f85980d = c41175fq2;
        Paint paint = new Paint(1);
        this.f85978b = paint;
        paint.setTextSize(AbstractC34967Oi6.m91656e(9.0f));
        this.f85978b.setTextAlign(Paint.Align.LEFT);
        Paint paint2 = new Paint(1);
        this.f85979c = paint2;
        paint2.setStyle(Paint.Style.FILL);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [oO1] */
    /* JADX WARN: Type inference failed for: r7v1, types: [oO1] */
    /* renamed from: a */
    public void m35769a(AbstractC42872ii0<?> abstractC42872ii0) {
        String label;
        AbstractC42872ii0<?> abstractC42872ii02;
        AbstractC42872ii0<?> abstractC42872ii03 = abstractC42872ii0;
        if (!this.f85980d.m40774E()) {
            this.f85981e.clear();
            int i = 0;
            while (i < abstractC42872ii0.m33553e()) {
                ?? mo17499d = abstractC42872ii03.mo17499d(i);
                List<Integer> mo4016g0 = mo17499d.mo4016g0();
                int mo21241L0 = mo17499d.mo21241L0();
                if (mo17499d instanceof XN1) {
                    XN1 xn1 = (XN1) mo17499d;
                    if (xn1.mo9451M()) {
                        String[] mo9450N = xn1.mo9450N();
                        for (int i2 = 0; i2 < mo4016g0.size() && i2 < xn1.mo9444n(); i2++) {
                            this.f85981e.add(new C41768gq2(mo9450N[i2 % mo9450N.length], mo17499d.mo4017d(), mo17499d.mo4015i(), mo17499d.mo4026G(), mo17499d.mo4029C(), mo4016g0.get(i2).intValue()));
                        }
                        if (xn1.getLabel() != null) {
                            this.f85981e.add(new C41768gq2(mo17499d.getLabel(), C41175fq2.EnumC20547c.NONE, Float.NaN, Float.NaN, null, 1122867));
                        }
                        abstractC42872ii02 = abstractC42872ii03;
                        i++;
                        abstractC42872ii03 = abstractC42872ii02;
                    }
                }
                if (mo17499d instanceof XO1) {
                    XO1 xo1 = (XO1) mo17499d;
                    for (int i3 = 0; i3 < mo4016g0.size() && i3 < mo21241L0; i3++) {
                        this.f85981e.add(new C41768gq2(xo1.mo21237h(i3).m51931h(), mo17499d.mo4017d(), mo17499d.mo4015i(), mo17499d.mo4026G(), mo17499d.mo4029C(), mo4016g0.get(i3).intValue()));
                    }
                    if (xo1.getLabel() != null) {
                        this.f85981e.add(new C41768gq2(mo17499d.getLabel(), C41175fq2.EnumC20547c.NONE, Float.NaN, Float.NaN, null, 1122867));
                    }
                } else {
                    if (mo17499d instanceof InterfaceC43278jO1) {
                        InterfaceC43278jO1 interfaceC43278jO1 = (InterfaceC43278jO1) mo17499d;
                        if (interfaceC43278jO1.m30742S() != 1122867) {
                            int m30742S = interfaceC43278jO1.m30742S();
                            int m30738t = interfaceC43278jO1.m30738t();
                            this.f85981e.add(new C41768gq2(null, mo17499d.mo4017d(), mo17499d.mo4015i(), mo17499d.mo4026G(), mo17499d.mo4029C(), m30742S));
                            this.f85981e.add(new C41768gq2(mo17499d.getLabel(), mo17499d.mo4017d(), mo17499d.mo4015i(), mo17499d.mo4026G(), mo17499d.mo4029C(), m30738t));
                        }
                    }
                    for (int i4 = 0; i4 < mo4016g0.size() && i4 < mo21241L0; i4++) {
                        if (i4 < mo4016g0.size() - 1 && i4 < mo21241L0 - 1) {
                            label = null;
                        } else {
                            label = abstractC42872ii0.mo17499d(i).getLabel();
                        }
                        this.f85981e.add(new C41768gq2(label, mo17499d.mo4017d(), mo17499d.mo4015i(), mo17499d.mo4026G(), mo17499d.mo4029C(), mo4016g0.get(i4).intValue()));
                    }
                }
                abstractC42872ii02 = abstractC42872ii0;
                i++;
                abstractC42872ii03 = abstractC42872ii02;
            }
            if (this.f85980d.m40766o() != null) {
                Collections.addAll(this.f85981e, this.f85980d.m40766o());
            }
            this.f85980d.m40773F(this.f85981e);
        }
        Typeface m93271c = this.f85980d.m93271c();
        if (m93271c != null) {
            this.f85978b.setTypeface(m93271c);
        }
        this.f85978b.setTextSize(this.f85980d.m93272b());
        this.f85978b.setColor(this.f85980d.m93273a());
        this.f85980d.m40772i(this.f85978b, this.f106125a);
    }

    /* renamed from: b */
    public void m35768b(Canvas canvas, float f, float f2, C41768gq2 c41768gq2, C41175fq2 c41175fq2) {
        float f3;
        float f4;
        int i = c41768gq2.f84343f;
        if (i != 1122868 && i != 1122867 && i != 0) {
            int save = canvas.save();
            C41175fq2.EnumC20547c enumC20547c = c41768gq2.f84339b;
            if (enumC20547c == C41175fq2.EnumC20547c.DEFAULT) {
                enumC20547c = c41175fq2.m40765p();
            }
            this.f85979c.setColor(c41768gq2.f84343f);
            if (Float.isNaN(c41768gq2.f84340c)) {
                f3 = c41175fq2.m40762s();
            } else {
                f3 = c41768gq2.f84340c;
            }
            float m91656e = AbstractC34967Oi6.m91656e(f3);
            float f5 = m91656e / 2.0f;
            int i2 = C22770a.f85987d[enumC20547c.ordinal()];
            if (i2 != 3 && i2 != 4) {
                if (i2 != 5) {
                    if (i2 == 6) {
                        if (Float.isNaN(c41768gq2.f84341d)) {
                            f4 = c41175fq2.m40763r();
                        } else {
                            f4 = c41768gq2.f84341d;
                        }
                        float m91656e2 = AbstractC34967Oi6.m91656e(f4);
                        DashPathEffect dashPathEffect = c41768gq2.f84342e;
                        if (dashPathEffect == null) {
                            dashPathEffect = c41175fq2.m40764q();
                        }
                        this.f85979c.setStyle(Paint.Style.STROKE);
                        this.f85979c.setStrokeWidth(m91656e2);
                        this.f85979c.setPathEffect(dashPathEffect);
                        this.f85983g.reset();
                        this.f85983g.moveTo(f, f2);
                        this.f85983g.lineTo(f + m91656e, f2);
                        canvas.drawPath(this.f85983g, this.f85979c);
                    }
                } else {
                    this.f85979c.setStyle(Paint.Style.FILL);
                    canvas.drawRect(f, f2 - f5, f + m91656e, f2 + f5, this.f85979c);
                }
            } else {
                this.f85979c.setStyle(Paint.Style.FILL);
                canvas.drawCircle(f + f5, f2, f5, this.f85979c);
            }
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: c */
    public void m35767c(Canvas canvas, float f, float f2, String str) {
        canvas.drawText(str, f, f2, this.f85978b);
    }

    /* renamed from: d */
    public Paint m35766d() {
        return this.f85978b;
    }

    /* renamed from: e */
    public void m35765e(Canvas canvas) {
        float f;
        float f2;
        float f3;
        boolean z;
        float m91656e;
        float f4;
        float f5;
        boolean z2;
        List<Boolean> list;
        List<C37536Zi1> list2;
        int i;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float m106377j;
        float f12;
        boolean z3;
        float m91656e2;
        float f13;
        float f14;
        float f15;
        C41175fq2.EnumC20546b enumC20546b;
        C41768gq2 c41768gq2;
        float f16;
        String str;
        float f17;
        float f18;
        float m106381f;
        float m106378i;
        float m106379h;
        float f19;
        double d;
        if (!this.f85980d.m93268f()) {
            return;
        }
        Typeface m93271c = this.f85980d.m93271c();
        if (m93271c != null) {
            this.f85978b.setTypeface(m93271c);
        }
        this.f85978b.setTextSize(this.f85980d.m93272b());
        this.f85978b.setColor(this.f85980d.m93273a());
        float m91649l = AbstractC34967Oi6.m91649l(this.f85978b, this.f85982f);
        float m91647n = AbstractC34967Oi6.m91647n(this.f85978b, this.f85982f) + AbstractC34967Oi6.m91656e(this.f85980d.m40776C());
        float m91660a = m91649l - (AbstractC34967Oi6.m91660a(this.f85978b, "ABC") / 2.0f);
        C41768gq2[] m40767n = this.f85980d.m40767n();
        float m91656e3 = AbstractC34967Oi6.m91656e(this.f85980d.m40761t());
        float m91656e4 = AbstractC34967Oi6.m91656e(this.f85980d.m40777B());
        C41175fq2.EnumC20549e m40756y = this.f85980d.m40756y();
        C41175fq2.EnumC20548d m40760u = this.f85980d.m40760u();
        C41175fq2.EnumC20550f m40778A = this.f85980d.m40778A();
        C41175fq2.EnumC20546b m40768m = this.f85980d.m40768m();
        float m91656e5 = AbstractC34967Oi6.m91656e(this.f85980d.m40762s());
        float m91656e6 = AbstractC34967Oi6.m91656e(this.f85980d.m40755z());
        float m93269e = this.f85980d.m93269e();
        float m93270d = this.f85980d.m93270d();
        int i2 = C22770a.f85984a[m40760u.ordinal()];
        float f20 = m91656e6;
        float f21 = m91656e4;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    f = m91649l;
                    f2 = m91647n;
                    f3 = 0.0f;
                } else {
                    C41175fq2.EnumC20549e enumC20549e = C41175fq2.EnumC20549e.VERTICAL;
                    if (m40756y == enumC20549e) {
                        m106379h = this.f106125a.m106374m() / 2.0f;
                    } else {
                        m106379h = this.f106125a.m106379h() + (this.f106125a.m106376k() / 2.0f);
                    }
                    C41175fq2.EnumC20546b enumC20546b2 = C41175fq2.EnumC20546b.LEFT_TO_RIGHT;
                    f2 = m91647n;
                    if (m40768m == enumC20546b2) {
                        f19 = m93270d;
                    } else {
                        f19 = -m93270d;
                    }
                    f3 = m106379h + f19;
                    if (m40756y == enumC20549e) {
                        double d2 = f3;
                        if (m40768m == enumC20546b2) {
                            f = m91649l;
                            d = ((-this.f85980d.f80802x) / 2.0d) + m93270d;
                        } else {
                            f = m91649l;
                            d = (this.f85980d.f80802x / 2.0d) - m93270d;
                        }
                        f3 = (float) (d2 + d);
                    } else {
                        f = m91649l;
                    }
                }
            } else {
                f = m91649l;
                f2 = m91647n;
                if (m40756y == C41175fq2.EnumC20549e.VERTICAL) {
                    m106378i = this.f106125a.m106374m();
                } else {
                    m106378i = this.f106125a.m106378i();
                }
                f3 = m106378i - m93270d;
                if (m40768m == C41175fq2.EnumC20546b.LEFT_TO_RIGHT) {
                    f3 -= this.f85980d.f80802x;
                }
            }
        } else {
            f = m91649l;
            f2 = m91647n;
            if (m40756y != C41175fq2.EnumC20549e.VERTICAL) {
                m93270d += this.f106125a.m106379h();
            }
            if (m40768m == C41175fq2.EnumC20546b.RIGHT_TO_LEFT) {
                f3 = m93270d + this.f85980d.f80802x;
            } else {
                f3 = m93270d;
            }
        }
        int i3 = C22770a.f85986c[m40756y.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                int i4 = C22770a.f85985b[m40778A.ordinal()];
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            f12 = 0.0f;
                        } else {
                            C41175fq2 c41175fq2 = this.f85980d;
                            f12 = ((this.f106125a.m106375l() / 2.0f) - (c41175fq2.f80803y / 2.0f)) + c41175fq2.m93269e();
                        }
                    } else {
                        if (m40760u == C41175fq2.EnumC20548d.CENTER) {
                            m106381f = this.f106125a.m106375l();
                        } else {
                            m106381f = this.f106125a.m106381f();
                        }
                        f12 = m106381f - (this.f85980d.f80803y + m93269e);
                    }
                } else {
                    if (m40760u == C41175fq2.EnumC20548d.CENTER) {
                        m106377j = 0.0f;
                    } else {
                        m106377j = this.f106125a.m106377j();
                    }
                    f12 = m106377j + m93269e;
                }
                float f22 = f12;
                float f23 = 0.0f;
                boolean z4 = false;
                int i5 = 0;
                while (i5 < m40767n.length) {
                    C41768gq2 c41768gq22 = m40767n[i5];
                    if (c41768gq22.f84339b != C41175fq2.EnumC20547c.NONE) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (Float.isNaN(c41768gq22.f84340c)) {
                        m91656e2 = m91656e5;
                    } else {
                        m91656e2 = AbstractC34967Oi6.m91656e(c41768gq22.f84340c);
                    }
                    if (z3) {
                        C41175fq2.EnumC20546b enumC20546b3 = C41175fq2.EnumC20546b.LEFT_TO_RIGHT;
                        if (m40768m == enumC20546b3) {
                            f18 = f3 + f23;
                        } else {
                            f18 = f3 - (m91656e2 - f23);
                        }
                        f16 = f18;
                        f14 = m91660a;
                        f15 = f20;
                        f13 = f3;
                        enumC20546b = m40768m;
                        m35768b(canvas, f16, f22 + m91660a, c41768gq22, this.f85980d);
                        if (enumC20546b == enumC20546b3) {
                            f16 += m91656e2;
                        }
                        c41768gq2 = c41768gq22;
                    } else {
                        f13 = f3;
                        f14 = m91660a;
                        f15 = f20;
                        enumC20546b = m40768m;
                        c41768gq2 = c41768gq22;
                        f16 = f13;
                    }
                    if (c41768gq2.f84338a != null) {
                        if (z3 && !z4) {
                            if (enumC20546b == C41175fq2.EnumC20546b.LEFT_TO_RIGHT) {
                                f17 = m91656e3;
                            } else {
                                f17 = -m91656e3;
                            }
                            f16 += f17;
                        } else if (z4) {
                            f16 = f13;
                        }
                        if (enumC20546b == C41175fq2.EnumC20546b.RIGHT_TO_LEFT) {
                            f16 -= AbstractC34967Oi6.m91657d(this.f85978b, str);
                        }
                        float f24 = f16;
                        if (!z4) {
                            m35767c(canvas, f24, f22 + f, c41768gq2.f84338a);
                        } else {
                            f22 += f + f2;
                            m35767c(canvas, f24, f22 + f, c41768gq2.f84338a);
                        }
                        f22 += f + f2;
                        f23 = 0.0f;
                    } else {
                        f23 += m91656e2 + f15;
                        z4 = true;
                    }
                    i5++;
                    m40768m = enumC20546b;
                    f20 = f15;
                    m91660a = f14;
                    f3 = f13;
                }
                return;
            }
            return;
        }
        float f25 = f3;
        float f26 = f20;
        List<C37536Zi1> m40769l = this.f85980d.m40769l();
        List<C37536Zi1> m40770k = this.f85980d.m40770k();
        List<Boolean> m40771j = this.f85980d.m40771j();
        int i6 = C22770a.f85985b[m40778A.ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    m93269e = 0.0f;
                } else {
                    m93269e += (this.f106125a.m106375l() - this.f85980d.f80803y) / 2.0f;
                }
            } else {
                m93269e = (this.f106125a.m106375l() - m93269e) - this.f85980d.f80803y;
            }
        }
        int length = m40767n.length;
        float f27 = f25;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            float f28 = f26;
            C41768gq2 c41768gq23 = m40767n[i7];
            float f29 = f27;
            int i9 = length;
            if (c41768gq23.f84339b != C41175fq2.EnumC20547c.NONE) {
                z = true;
            } else {
                z = false;
            }
            if (Float.isNaN(c41768gq23.f84340c)) {
                m91656e = m91656e5;
            } else {
                m91656e = AbstractC34967Oi6.m91656e(c41768gq23.f84340c);
            }
            if (i7 < m40771j.size() && m40771j.get(i7).booleanValue()) {
                f5 = m93269e + f + f2;
                f4 = f25;
            } else {
                f4 = f29;
                f5 = m93269e;
            }
            if (f4 == f25 && m40760u == C41175fq2.EnumC20548d.CENTER && i8 < m40769l.size()) {
                if (m40768m == C41175fq2.EnumC20546b.RIGHT_TO_LEFT) {
                    f11 = m40769l.get(i8).f48979c;
                } else {
                    f11 = -m40769l.get(i8).f48979c;
                }
                f4 += f11 / 2.0f;
                i8++;
            }
            int i10 = i8;
            if (c41768gq23.f84338a == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                if (m40768m == C41175fq2.EnumC20546b.RIGHT_TO_LEFT) {
                    f4 -= m91656e;
                }
                float f30 = f4;
                list2 = m40769l;
                i = i7;
                list = m40771j;
                m35768b(canvas, f30, f5 + m91660a, c41768gq23, this.f85980d);
                if (m40768m == C41175fq2.EnumC20546b.LEFT_TO_RIGHT) {
                    f4 = f30 + m91656e;
                } else {
                    f4 = f30;
                }
            } else {
                list = m40771j;
                list2 = m40769l;
                i = i7;
            }
            if (!z2) {
                if (z) {
                    if (m40768m == C41175fq2.EnumC20546b.RIGHT_TO_LEFT) {
                        f10 = -m91656e3;
                    } else {
                        f10 = m91656e3;
                    }
                    f4 += f10;
                }
                C41175fq2.EnumC20546b enumC20546b4 = C41175fq2.EnumC20546b.RIGHT_TO_LEFT;
                if (m40768m == enumC20546b4) {
                    f4 -= m40770k.get(i).f48979c;
                }
                m35767c(canvas, f4, f5 + f, c41768gq23.f84338a);
                if (m40768m == C41175fq2.EnumC20546b.LEFT_TO_RIGHT) {
                    f4 += m40770k.get(i).f48979c;
                }
                if (m40768m == enumC20546b4) {
                    f6 = f21;
                    f9 = -f6;
                } else {
                    f6 = f21;
                    f9 = f6;
                }
                f27 = f4 + f9;
                f7 = f28;
            } else {
                f6 = f21;
                if (m40768m == C41175fq2.EnumC20546b.RIGHT_TO_LEFT) {
                    f7 = f28;
                    f8 = -f7;
                } else {
                    f7 = f28;
                    f8 = f7;
                }
                f27 = f4 + f8;
            }
            f21 = f6;
            f26 = f7;
            i7 = i + 1;
            m93269e = f5;
            length = i9;
            i8 = i10;
            m40769l = list2;
            m40771j = list;
        }
    }
}

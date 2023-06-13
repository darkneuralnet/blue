package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.Entry;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import p000.AbstractC0361Ax;
import p000.C45336mr2;
/* renamed from: jr2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C43557jr2 extends AbstractC51857xr2 {

    /* renamed from: i */
    public InterfaceC44743lr2 f93446i;

    /* renamed from: j */
    public Paint f93447j;

    /* renamed from: k */
    public WeakReference<Bitmap> f93448k;

    /* renamed from: l */
    public Canvas f93449l;

    /* renamed from: m */
    public Bitmap.Config f93450m;

    /* renamed from: n */
    public Path f93451n;

    /* renamed from: o */
    public Path f93452o;

    /* renamed from: p */
    public float[] f93453p;

    /* renamed from: q */
    public Path f93454q;

    /* renamed from: r */
    public HashMap<InterfaceC46243oO1, C25034b> f93455r;

    /* renamed from: s */
    public float[] f93456s;

    /* renamed from: jr2$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C25033a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f93457a;

        static {
            int[] iArr = new int[C45336mr2.EnumC26273a.values().length];
            f93457a = iArr;
            try {
                iArr[C45336mr2.EnumC26273a.LINEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f93457a[C45336mr2.EnumC26273a.STEPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f93457a[C45336mr2.EnumC26273a.CUBIC_BEZIER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f93457a[C45336mr2.EnumC26273a.HORIZONTAL_BEZIER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C43557jr2(InterfaceC44743lr2 interfaceC44743lr2, C42279hi0 c42279hi0, C32951Fs6 c32951Fs6) {
        super(c42279hi0, c32951Fs6);
        this.f93450m = Bitmap.Config.ARGB_8888;
        this.f93451n = new Path();
        this.f93452o = new Path();
        this.f93453p = new float[4];
        this.f93454q = new Path();
        this.f93455r = new HashMap<>();
        this.f93456s = new float[2];
        this.f93446i = interfaceC44743lr2;
        Paint paint = new Paint(1);
        this.f93447j = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f93447j.setColor(-1);
    }

    @Override // p000.RS0
    /* renamed from: b */
    public void mo15000b(Canvas canvas) {
        Bitmap bitmap;
        int m106374m = (int) this.f106125a.m106374m();
        int m106375l = (int) this.f106125a.m106375l();
        WeakReference<Bitmap> weakReference = this.f93448k;
        if (weakReference == null) {
            bitmap = null;
        } else {
            bitmap = weakReference.get();
        }
        if (bitmap == null || bitmap.getWidth() != m106374m || bitmap.getHeight() != m106375l) {
            if (m106374m > 0 && m106375l > 0) {
                bitmap = Bitmap.createBitmap(m106374m, m106375l, this.f93450m);
                this.f93448k = new WeakReference<>(bitmap);
                this.f93449l = new Canvas(bitmap);
            } else {
                return;
            }
        }
        bitmap.eraseColor(0);
        for (T t : this.f93446i.mo26738k().m33552f()) {
            if (t.isVisible()) {
                m29834q(canvas, t);
            }
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f32036c);
    }

    @Override // p000.RS0
    /* renamed from: c */
    public void mo14999c(Canvas canvas) {
        m29837n(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [AA, com.github.mikephil.charting.data.Entry] */
    @Override // p000.RS0
    /* renamed from: d */
    public void mo14998d(Canvas canvas, OM1[] om1Arr) {
        C44150kr2 mo26738k = this.f93446i.mo26738k();
        for (OM1 om1 : om1Arr) {
            MO1 mo1 = (MO1) mo26738k.mo17499d(om1.m92391d());
            if (mo1 != null && mo1.mo4023Q()) {
                ?? mo21235p0 = mo1.mo21235p0(om1.m92387h(), om1.m92385j());
                if (m114828h(mo21235p0, mo1)) {
                    OE2 m110833e = this.f93446i.mo2231d(mo1.mo4013j0()).m110833e(mo21235p0.mo51930g(), mo21235p0.mo51938c() * this.f32035b.m36087b());
                    om1.m92382m((float) m110833e.f26254c, (float) m110833e.f26255d);
                    m222j(canvas, (float) m110833e.f26254c, (float) m110833e.f26255d, mo1);
                }
            }
        }
    }

    @Override // p000.RS0
    /* renamed from: e */
    public void mo14997e(Canvas canvas) {
        int i;
        MO1 mo1;
        Entry entry;
        if (mo71520g(this.f93446i)) {
            List<T> m33552f = this.f93446i.mo26738k().m33552f();
            for (int i2 = 0; i2 < m33552f.size(); i2++) {
                MO1 mo12 = (MO1) m33552f.get(i2);
                if (m114827i(mo12) && mo12.mo21241L0() >= 1) {
                    m86739a(mo12);
                    D96 mo2231d = this.f93446i.mo2231d(mo12.mo4013j0());
                    int mo24846w0 = (int) (mo12.mo24846w0() * 1.75f);
                    if (!mo12.mo24857P()) {
                        mo24846w0 /= 2;
                    }
                    int i3 = mo24846w0;
                    this.f1449g.m114826a(this.f93446i, mo12);
                    float m36088a = this.f32035b.m36088a();
                    float m36087b = this.f32035b.m36087b();
                    AbstractC0361Ax.C0362a c0362a = this.f1449g;
                    float[] m110835c = mo2231d.m110835c(mo12, m36088a, m36087b, c0362a.f1450a, c0362a.f1451b);
                    AbstractC33806Jj6 mo4019b0 = mo12.mo4019b0();
                    PE2 m90557d = PE2.m90557d(mo12.mo4025M0());
                    m90557d.f28146c = AbstractC34967Oi6.m91656e(m90557d.f28146c);
                    m90557d.f28147d = AbstractC34967Oi6.m91656e(m90557d.f28147d);
                    int i4 = 0;
                    while (i4 < m110835c.length) {
                        float f = m110835c[i4];
                        float f2 = m110835c[i4 + 1];
                        if (!this.f106125a.m106407A(f)) {
                            break;
                        }
                        if (this.f106125a.m106361z(f) && this.f106125a.m106404D(f2)) {
                            int i5 = i4 / 2;
                            Entry mo21237h = mo12.mo21237h(this.f1449g.f1450a + i5);
                            if (mo12.mo4014i0()) {
                                entry = mo21237h;
                                i = i3;
                                mo1 = mo12;
                                m29830u(canvas, mo4019b0.m99906h(mo21237h), f, f2 - i3, mo12.mo4011m(i5));
                            } else {
                                entry = mo21237h;
                                i = i3;
                                mo1 = mo12;
                            }
                            if (entry.m116047b() != null && mo1.mo4027D()) {
                                Drawable m116047b = entry.m116047b();
                                AbstractC34967Oi6.m91655f(canvas, m116047b, (int) (f + m90557d.f28146c), (int) (f2 + m90557d.f28147d), m116047b.getIntrinsicWidth(), m116047b.getIntrinsicHeight());
                            }
                        } else {
                            i = i3;
                            mo1 = mo12;
                        }
                        i4 += 2;
                        mo12 = mo1;
                        i3 = i;
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

    /* JADX WARN: Type inference failed for: r14v2, types: [AA, com.github.mikephil.charting.data.Entry] */
    /* renamed from: n */
    public void m29837n(Canvas canvas) {
        boolean z;
        boolean z2;
        C25034b c25034b;
        Bitmap m29826b;
        this.f32036c.setStyle(Paint.Style.FILL);
        float m36087b = this.f32035b.m36087b();
        float[] fArr = this.f93456s;
        char c = 0;
        float f = 0.0f;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        List<T> m33552f = this.f93446i.mo26738k().m33552f();
        int i = 0;
        while (i < m33552f.size()) {
            MO1 mo1 = (MO1) m33552f.get(i);
            if (mo1.isVisible() && mo1.mo24857P() && mo1.mo21241L0() != 0) {
                this.f93447j.setColor(mo1.mo24848e());
                D96 mo2231d = this.f93446i.mo2231d(mo1.mo4013j0());
                this.f1449g.m114826a(this.f93446i, mo1);
                float mo24846w0 = mo1.mo24846w0();
                float mo24855R = mo1.mo24855R();
                if (mo1.mo24856P0() && mo24855R < mo24846w0 && mo24855R > f) {
                    z = true;
                } else {
                    z = c == 1 ? 1 : 0;
                }
                if (z && mo1.mo24848e() == 1122867) {
                    z2 = true;
                } else {
                    z2 = c == 1 ? 1 : 0;
                }
                if (this.f93455r.containsKey(mo1)) {
                    c25034b = this.f93455r.get(mo1);
                } else {
                    c25034b = new C25034b(this, null);
                    this.f93455r.put(mo1, c25034b);
                }
                if (c25034b.m29825c(mo1)) {
                    c25034b.m29827a(mo1, z, z2);
                }
                AbstractC0361Ax.C0362a c0362a = this.f1449g;
                int i2 = c0362a.f1452c;
                int i3 = c0362a.f1450a;
                int i4 = i2 + i3;
                char c2 = c;
                while (i3 <= i4) {
                    ?? mo21237h = mo1.mo21237h(i3);
                    if (mo21237h == 0) {
                        break;
                    }
                    this.f93456s[c2] = mo21237h.mo51930g();
                    this.f93456s[1] = mo21237h.mo51938c() * m36087b;
                    mo2231d.m110827k(this.f93456s);
                    if (!this.f106125a.m106407A(this.f93456s[c2])) {
                        break;
                    }
                    if (this.f106125a.m106361z(this.f93456s[c2]) && this.f106125a.m106404D(this.f93456s[1]) && (m29826b = c25034b.m29826b(i3)) != null) {
                        float[] fArr2 = this.f93456s;
                        canvas.drawBitmap(m29826b, fArr2[c2] - mo24846w0, fArr2[1] - mo24846w0, (Paint) null);
                    }
                    i3++;
                    c2 = 0;
                }
            }
            i++;
            c = 0;
            f = 0.0f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [AA, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r2v10, types: [AA, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.github.mikephil.charting.data.Entry] */
    /* renamed from: o */
    public void m29836o(MO1 mo1) {
        float m36087b = this.f32035b.m36087b();
        D96 mo2231d = this.f93446i.mo2231d(mo1.mo4013j0());
        this.f1449g.m114826a(this.f93446i, mo1);
        float mo24854a0 = mo1.mo24854a0();
        this.f93451n.reset();
        AbstractC0361Ax.C0362a c0362a = this.f1449g;
        if (c0362a.f1452c >= 1) {
            int i = c0362a.f1450a + 1;
            ?? mo21237h = mo1.mo21237h(Math.max(i - 2, 0));
            ?? mo21237h2 = mo1.mo21237h(Math.max(i - 1, 0));
            if (mo21237h2 == 0) {
                return;
            }
            this.f93451n.moveTo(mo21237h2.mo51930g(), mo21237h2.mo51938c() * m36087b);
            int i2 = this.f1449g.f1450a + 1;
            int i3 = -1;
            Entry entry = mo21237h2;
            Entry entry2 = mo21237h2;
            Entry entry3 = mo21237h;
            while (true) {
                AbstractC0361Ax.C0362a c0362a2 = this.f1449g;
                Entry entry4 = entry2;
                if (i2 > c0362a2.f1452c + c0362a2.f1450a) {
                    break;
                }
                if (i3 != i2) {
                    entry4 = mo1.mo21237h(i2);
                }
                int i4 = i2 + 1;
                if (i4 < mo1.mo21241L0()) {
                    i2 = i4;
                }
                ?? mo21237h3 = mo1.mo21237h(i2);
                this.f93451n.cubicTo(entry.mo51930g() + ((entry4.mo51930g() - entry3.mo51930g()) * mo24854a0), (entry.mo51938c() + ((entry4.mo51938c() - entry3.mo51938c()) * mo24854a0)) * m36087b, entry4.mo51930g() - ((mo21237h3.mo51930g() - entry.mo51930g()) * mo24854a0), (entry4.mo51938c() - ((mo21237h3.mo51938c() - entry.mo51938c()) * mo24854a0)) * m36087b, entry4.mo51930g(), entry4.mo51938c() * m36087b);
                entry3 = entry;
                entry = entry4;
                entry2 = mo21237h3;
                int i5 = i2;
                i2 = i4;
                i3 = i5;
            }
        }
        if (mo1.mo6218x0()) {
            this.f93452o.reset();
            this.f93452o.addPath(this.f93451n);
            m29835p(this.f93449l, mo1, this.f93452o, mo2231d, this.f1449g);
        }
        this.f32036c.setColor(mo1.getColor());
        this.f32036c.setStyle(Paint.Style.STROKE);
        mo2231d.m110829i(this.f93451n);
        this.f93449l.drawPath(this.f93451n, this.f32036c);
        this.f32036c.setPathEffect(null);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.github.mikephil.charting.data.Entry] */
    /* renamed from: p */
    public void m29835p(Canvas canvas, MO1 mo1, Path path, D96 d96, AbstractC0361Ax.C0362a c0362a) {
        float mo16015a = mo1.mo24860B().mo16015a(mo1, this.f93446i);
        path.lineTo(mo1.mo21237h(c0362a.f1450a + c0362a.f1452c).mo51930g(), mo16015a);
        path.lineTo(mo1.mo21237h(c0362a.f1450a).mo51930g(), mo16015a);
        path.close();
        d96.m110829i(path);
        Drawable mo6219f = mo1.mo6219f();
        if (mo6219f != null) {
            m4555m(canvas, path, mo6219f);
        } else {
            m4556l(canvas, path, mo1.mo6217y(), mo1.mo6222T());
        }
    }

    /* renamed from: q */
    public void m29834q(Canvas canvas, MO1 mo1) {
        if (mo1.mo21241L0() < 1) {
            return;
        }
        this.f32036c.setStrokeWidth(mo1.mo6221W());
        this.f32036c.setPathEffect(mo1.mo24859F());
        int i = C25033a.f93457a[mo1.mo24844z0().ordinal()];
        if (i != 3) {
            if (i != 4) {
                m29832s(canvas, mo1);
            } else {
                m29833r(mo1);
            }
        } else {
            m29836o(mo1);
        }
        this.f32036c.setPathEffect(null);
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [AA, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r4v4, types: [AA, com.github.mikephil.charting.data.Entry] */
    /* renamed from: r */
    public void m29833r(MO1 mo1) {
        float m36087b = this.f32035b.m36087b();
        D96 mo2231d = this.f93446i.mo2231d(mo1.mo4013j0());
        this.f1449g.m114826a(this.f93446i, mo1);
        this.f93451n.reset();
        AbstractC0361Ax.C0362a c0362a = this.f1449g;
        if (c0362a.f1452c >= 1) {
            ?? mo21237h = mo1.mo21237h(c0362a.f1450a);
            this.f93451n.moveTo(mo21237h.mo51930g(), mo21237h.mo51938c() * m36087b);
            int i = this.f1449g.f1450a + 1;
            Entry entry = mo21237h;
            while (true) {
                AbstractC0361Ax.C0362a c0362a2 = this.f1449g;
                if (i > c0362a2.f1452c + c0362a2.f1450a) {
                    break;
                }
                ?? mo21237h2 = mo1.mo21237h(i);
                float mo51930g = entry.mo51930g() + ((mo21237h2.mo51930g() - entry.mo51930g()) / 2.0f);
                this.f93451n.cubicTo(mo51930g, entry.mo51938c() * m36087b, mo51930g, mo21237h2.mo51938c() * m36087b, mo21237h2.mo51930g(), mo21237h2.mo51938c() * m36087b);
                i++;
                entry = mo21237h2;
            }
        }
        if (mo1.mo6218x0()) {
            this.f93452o.reset();
            this.f93452o.addPath(this.f93451n);
            m29835p(this.f93449l, mo1, this.f93452o, mo2231d, this.f1449g);
        }
        this.f32036c.setColor(mo1.getColor());
        this.f32036c.setStyle(Paint.Style.STROKE);
        mo2231d.m110829i(this.f93451n);
        this.f93449l.drawPath(this.f93451n, this.f32036c);
        this.f32036c.setPathEffect(null);
    }

    /* JADX WARN: Type inference failed for: r12v11, types: [AA, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r13v5, types: [AA, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r8v22, types: [AA, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r8v4, types: [AA, com.github.mikephil.charting.data.Entry] */
    /* renamed from: s */
    public void m29832s(Canvas canvas, MO1 mo1) {
        boolean z;
        int i;
        Canvas canvas2;
        int i2;
        int mo21241L0 = mo1.mo21241L0();
        if (mo1.mo24844z0() == C45336mr2.EnumC26273a.STEPPED) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 4;
        } else {
            i = 2;
        }
        D96 mo2231d = this.f93446i.mo2231d(mo1.mo4013j0());
        float m36087b = this.f32035b.m36087b();
        this.f32036c.setStyle(Paint.Style.STROKE);
        if (mo1.mo24851c()) {
            canvas2 = this.f93449l;
        } else {
            canvas2 = canvas;
        }
        this.f1449g.m114826a(this.f93446i, mo1);
        if (mo1.mo6218x0() && mo21241L0 > 0) {
            m29831t(canvas, mo1, mo2231d, this.f1449g);
        }
        if (mo1.mo4016g0().size() > 1) {
            int i3 = i * 2;
            if (this.f93453p.length <= i3) {
                this.f93453p = new float[i * 4];
            }
            int i4 = this.f1449g.f1450a;
            while (true) {
                AbstractC0361Ax.C0362a c0362a = this.f1449g;
                if (i4 > c0362a.f1452c + c0362a.f1450a) {
                    break;
                }
                ?? mo21237h = mo1.mo21237h(i4);
                if (mo21237h != 0) {
                    this.f93453p[0] = mo21237h.mo51930g();
                    this.f93453p[1] = mo21237h.mo51938c() * m36087b;
                    if (i4 < this.f1449g.f1451b) {
                        ?? mo21237h2 = mo1.mo21237h(i4 + 1);
                        if (mo21237h2 == 0) {
                            break;
                        } else if (z) {
                            this.f93453p[2] = mo21237h2.mo51930g();
                            float[] fArr = this.f93453p;
                            float f = fArr[1];
                            fArr[3] = f;
                            fArr[4] = fArr[2];
                            fArr[5] = f;
                            fArr[6] = mo21237h2.mo51930g();
                            this.f93453p[7] = mo21237h2.mo51938c() * m36087b;
                        } else {
                            this.f93453p[2] = mo21237h2.mo51930g();
                            this.f93453p[3] = mo21237h2.mo51938c() * m36087b;
                        }
                    } else {
                        float[] fArr2 = this.f93453p;
                        fArr2[2] = fArr2[0];
                        fArr2[3] = fArr2[1];
                    }
                    mo2231d.m110827k(this.f93453p);
                    if (!this.f106125a.m106407A(this.f93453p[0])) {
                        break;
                    } else if (this.f106125a.m106361z(this.f93453p[2]) && (this.f106125a.m106406B(this.f93453p[1]) || this.f106125a.m106362y(this.f93453p[3]))) {
                        this.f32036c.setColor(mo1.mo4030A0(i4));
                        canvas2.drawLines(this.f93453p, 0, i3, this.f32036c);
                    }
                }
                i4++;
            }
        } else {
            int i5 = mo21241L0 * i;
            if (this.f93453p.length < Math.max(i5, i) * 2) {
                this.f93453p = new float[Math.max(i5, i) * 4];
            }
            if (mo1.mo21237h(this.f1449g.f1450a) != null) {
                int i6 = this.f1449g.f1450a;
                int i7 = 0;
                while (true) {
                    AbstractC0361Ax.C0362a c0362a2 = this.f1449g;
                    if (i6 > c0362a2.f1452c + c0362a2.f1450a) {
                        break;
                    }
                    if (i6 == 0) {
                        i2 = 0;
                    } else {
                        i2 = i6 - 1;
                    }
                    ?? mo21237h3 = mo1.mo21237h(i2);
                    ?? mo21237h4 = mo1.mo21237h(i6);
                    if (mo21237h3 != 0 && mo21237h4 != 0) {
                        int i8 = i7 + 1;
                        this.f93453p[i7] = mo21237h3.mo51930g();
                        int i9 = i8 + 1;
                        this.f93453p[i8] = mo21237h3.mo51938c() * m36087b;
                        if (z) {
                            int i10 = i9 + 1;
                            this.f93453p[i9] = mo21237h4.mo51930g();
                            int i11 = i10 + 1;
                            this.f93453p[i10] = mo21237h3.mo51938c() * m36087b;
                            int i12 = i11 + 1;
                            this.f93453p[i11] = mo21237h4.mo51930g();
                            i9 = i12 + 1;
                            this.f93453p[i12] = mo21237h3.mo51938c() * m36087b;
                        }
                        int i13 = i9 + 1;
                        this.f93453p[i9] = mo21237h4.mo51930g();
                        this.f93453p[i13] = mo21237h4.mo51938c() * m36087b;
                        i7 = i13 + 1;
                    }
                    i6++;
                }
                if (i7 > 0) {
                    mo2231d.m110827k(this.f93453p);
                    this.f32036c.setColor(mo1.getColor());
                    canvas2.drawLines(this.f93453p, 0, Math.max((this.f1449g.f1452c + 1) * i, i) * 2, this.f32036c);
                }
            }
        }
        this.f32036c.setPathEffect(null);
    }

    /* renamed from: t */
    public void m29831t(Canvas canvas, MO1 mo1, D96 d96, AbstractC0361Ax.C0362a c0362a) {
        int i;
        int i2;
        Path path = this.f93454q;
        int i3 = c0362a.f1450a;
        int i4 = c0362a.f1452c + i3;
        int i5 = 0;
        do {
            i = (i5 * 128) + i3;
            i2 = i + 128;
            if (i2 > i4) {
                i2 = i4;
            }
            if (i <= i2) {
                m29829v(mo1, i, i2, path);
                d96.m110829i(path);
                Drawable mo6219f = mo1.mo6219f();
                if (mo6219f != null) {
                    m4555m(canvas, path, mo6219f);
                } else {
                    m4556l(canvas, path, mo1.mo6217y(), mo1.mo6222T());
                }
            }
            i5++;
        } while (i <= i2);
    }

    /* renamed from: u */
    public void m29830u(Canvas canvas, String str, float f, float f2, int i) {
        this.f32039f.setColor(i);
        canvas.drawText(str, f, f2, this.f32039f);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [AA, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r4v3, types: [AA, com.github.mikephil.charting.data.Entry] */
    /* renamed from: v */
    public final void m29829v(MO1 mo1, int i, int i2, Path path) {
        boolean z;
        float mo16015a = mo1.mo24860B().mo16015a(mo1, this.f93446i);
        float m36087b = this.f32035b.m36087b();
        if (mo1.mo24844z0() == C45336mr2.EnumC26273a.STEPPED) {
            z = true;
        } else {
            z = false;
        }
        path.reset();
        ?? mo21237h = mo1.mo21237h(i);
        path.moveTo(mo21237h.mo51930g(), mo16015a);
        path.lineTo(mo21237h.mo51930g(), mo21237h.mo51938c() * m36087b);
        int i3 = i + 1;
        Entry entry = null;
        AbstractC0045AA abstractC0045AA = mo21237h;
        while (i3 <= i2) {
            ?? mo21237h2 = mo1.mo21237h(i3);
            if (z) {
                path.lineTo(mo21237h2.mo51930g(), abstractC0045AA.mo51938c() * m36087b);
            }
            path.lineTo(mo21237h2.mo51930g(), mo21237h2.mo51938c() * m36087b);
            i3++;
            abstractC0045AA = mo21237h2;
            entry = mo21237h2;
        }
        if (entry != null) {
            path.lineTo(entry.mo51930g(), mo16015a);
        }
        path.close();
    }

    /* renamed from: w */
    public void m29828w() {
        Canvas canvas = this.f93449l;
        if (canvas != null) {
            canvas.setBitmap(null);
            this.f93449l = null;
        }
        WeakReference<Bitmap> weakReference = this.f93448k;
        if (weakReference != null) {
            Bitmap bitmap = weakReference.get();
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f93448k.clear();
            this.f93448k = null;
        }
    }

    /* renamed from: jr2$b */
    /* loaded from: classes5.dex */
    public class C25034b {

        /* renamed from: a */
        public Path f93458a;

        /* renamed from: b */
        public Bitmap[] f93459b;

        public C25034b() {
            this.f93458a = new Path();
        }

        /* renamed from: a */
        public void m29827a(MO1 mo1, boolean z, boolean z2) {
            int mo24845x = mo1.mo24845x();
            float mo24846w0 = mo1.mo24846w0();
            float mo24855R = mo1.mo24855R();
            for (int i = 0; i < mo24845x; i++) {
                int i2 = (int) (mo24846w0 * 2.1d);
                Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_4444);
                Canvas canvas = new Canvas(createBitmap);
                this.f93459b[i] = createBitmap;
                C43557jr2.this.f32036c.setColor(mo1.mo24858O(i));
                if (z2) {
                    this.f93458a.reset();
                    this.f93458a.addCircle(mo24846w0, mo24846w0, mo24846w0, Path.Direction.CW);
                    this.f93458a.addCircle(mo24846w0, mo24846w0, mo24855R, Path.Direction.CCW);
                    canvas.drawPath(this.f93458a, C43557jr2.this.f32036c);
                } else {
                    canvas.drawCircle(mo24846w0, mo24846w0, mo24846w0, C43557jr2.this.f32036c);
                    if (z) {
                        canvas.drawCircle(mo24846w0, mo24846w0, mo24855R, C43557jr2.this.f93447j);
                    }
                }
            }
        }

        /* renamed from: b */
        public Bitmap m29826b(int i) {
            Bitmap[] bitmapArr = this.f93459b;
            return bitmapArr[i % bitmapArr.length];
        }

        /* renamed from: c */
        public boolean m29825c(MO1 mo1) {
            int mo24845x = mo1.mo24845x();
            Bitmap[] bitmapArr = this.f93459b;
            if (bitmapArr == null) {
                this.f93459b = new Bitmap[mo24845x];
                return true;
            } else if (bitmapArr.length != mo24845x) {
                this.f93459b = new Bitmap[mo24845x];
                return true;
            } else {
                return false;
            }
        }

        public /* synthetic */ C25034b(C43557jr2 c43557jr2, C25033a c25033a) {
            this();
        }
    }
}

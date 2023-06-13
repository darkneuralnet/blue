package p000;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import p000.C36311Uc0;
import p000.OP5;
/* renamed from: Xl0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37094Xl0 {

    /* renamed from: t0 */
    public static final boolean f43807t0 = false;

    /* renamed from: u0 */
    public static final Paint f43808u0 = null;

    /* renamed from: A */
    public Typeface f43809A;

    /* renamed from: B */
    public Typeface f43810B;

    /* renamed from: C */
    public Typeface f43811C;

    /* renamed from: D */
    public C36311Uc0 f43812D;

    /* renamed from: E */
    public C36311Uc0 f43813E;

    /* renamed from: G */
    public CharSequence f43815G;

    /* renamed from: H */
    public CharSequence f43816H;

    /* renamed from: I */
    public boolean f43817I;

    /* renamed from: K */
    public boolean f43819K;

    /* renamed from: L */
    public Bitmap f43820L;

    /* renamed from: M */
    public Paint f43821M;

    /* renamed from: N */
    public float f43822N;

    /* renamed from: O */
    public float f43823O;

    /* renamed from: P */
    public float f43824P;

    /* renamed from: Q */
    public float f43825Q;

    /* renamed from: R */
    public float f43826R;

    /* renamed from: S */
    public int f43827S;

    /* renamed from: T */
    public int[] f43828T;

    /* renamed from: U */
    public boolean f43829U;

    /* renamed from: V */
    public final TextPaint f43830V;

    /* renamed from: W */
    public final TextPaint f43831W;

    /* renamed from: X */
    public TimeInterpolator f43832X;

    /* renamed from: Y */
    public TimeInterpolator f43833Y;

    /* renamed from: Z */
    public float f43834Z;

    /* renamed from: a */
    public final View f43835a;

    /* renamed from: a0 */
    public float f43836a0;

    /* renamed from: b */
    public float f43837b;

    /* renamed from: b0 */
    public float f43838b0;

    /* renamed from: c */
    public boolean f43839c;

    /* renamed from: c0 */
    public ColorStateList f43840c0;

    /* renamed from: d */
    public float f43841d;

    /* renamed from: d0 */
    public float f43842d0;

    /* renamed from: e */
    public float f43843e;

    /* renamed from: e0 */
    public float f43844e0;

    /* renamed from: f */
    public int f43845f;

    /* renamed from: f0 */
    public float f43846f0;

    /* renamed from: g */
    public final Rect f43847g;

    /* renamed from: g0 */
    public ColorStateList f43848g0;

    /* renamed from: h */
    public final Rect f43849h;

    /* renamed from: h0 */
    public float f43850h0;

    /* renamed from: i */
    public final RectF f43851i;

    /* renamed from: i0 */
    public float f43852i0;

    /* renamed from: j0 */
    public float f43854j0;

    /* renamed from: k0 */
    public StaticLayout f43856k0;

    /* renamed from: l0 */
    public float f43858l0;

    /* renamed from: m0 */
    public float f43860m0;

    /* renamed from: n */
    public ColorStateList f43861n;

    /* renamed from: n0 */
    public float f43862n0;

    /* renamed from: o */
    public ColorStateList f43863o;

    /* renamed from: o0 */
    public CharSequence f43864o0;

    /* renamed from: p */
    public int f43865p;

    /* renamed from: q */
    public float f43867q;

    /* renamed from: r */
    public float f43869r;

    /* renamed from: s */
    public float f43871s;

    /* renamed from: t */
    public float f43873t;

    /* renamed from: u */
    public float f43874u;

    /* renamed from: v */
    public float f43875v;

    /* renamed from: w */
    public Typeface f43876w;

    /* renamed from: x */
    public Typeface f43877x;

    /* renamed from: y */
    public Typeface f43878y;

    /* renamed from: z */
    public Typeface f43879z;

    /* renamed from: j */
    public int f43853j = 16;

    /* renamed from: k */
    public int f43855k = 16;

    /* renamed from: l */
    public float f43857l = 15.0f;

    /* renamed from: m */
    public float f43859m = 15.0f;

    /* renamed from: F */
    public TextUtils.TruncateAt f43814F = TextUtils.TruncateAt.END;

    /* renamed from: J */
    public boolean f43818J = true;

    /* renamed from: p0 */
    public int f43866p0 = 1;

    /* renamed from: q0 */
    public float f43868q0 = 0.0f;

    /* renamed from: r0 */
    public float f43870r0 = 1.0f;

    /* renamed from: s0 */
    public int f43872s0 = OP5.f26536n;

    /* renamed from: Xl0$a */
    /* loaded from: classes6.dex */
    public class C9488a implements C36311Uc0.InterfaceC8332a {
        public C9488a() {
        }

        @Override // p000.C36311Uc0.InterfaceC8332a
        /* renamed from: a */
        public void mo76376a(Typeface typeface) {
            C37094Xl0.this.m76429Z(typeface);
        }
    }

    /* renamed from: Xl0$b */
    /* loaded from: classes6.dex */
    public class C9489b implements C36311Uc0.InterfaceC8332a {
        public C9489b() {
        }

        @Override // p000.C36311Uc0.InterfaceC8332a
        /* renamed from: a */
        public void mo76376a(Typeface typeface) {
            C37094Xl0.this.m76407k0(typeface);
        }
    }

    public C37094Xl0(View view) {
        this.f43835a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f43830V = textPaint;
        this.f43831W = new TextPaint(textPaint);
        this.f43849h = new Rect();
        this.f43847g = new Rect();
        this.f43851i = new RectF();
        this.f43843e = m76420e();
        m76442M(view.getContext().getResources().getConfiguration());
    }

    /* renamed from: H */
    public static boolean m76447H(float f, float f2) {
        return Math.abs(f - f2) < 1.0E-5f;
    }

    /* renamed from: L */
    public static float m76443L(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return C27325pf.m19015a(f, f2, f3);
    }

    /* renamed from: Q */
    public static boolean m76438Q(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    /* renamed from: a */
    public static int m76428a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), Math.round((Color.red(i) * f2) + (Color.red(i2) * f)), Math.round((Color.green(i) * f2) + (Color.green(i2) * f)), Math.round((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    /* renamed from: A */
    public float m76457A() {
        return this.f43843e;
    }

    /* renamed from: A0 */
    public void m76456A0(TextUtils.TruncateAt truncateAt) {
        this.f43814F = truncateAt;
        m76440O();
    }

    /* renamed from: B */
    public int m76455B() {
        return this.f43866p0;
    }

    /* renamed from: B0 */
    public void m76454B0(Typeface typeface) {
        boolean m76427a0 = m76427a0(typeface);
        boolean m76405l0 = m76405l0(typeface);
        if (m76427a0 || m76405l0) {
            m76440O();
        }
    }

    /* renamed from: C */
    public final Layout.Alignment m76453C() {
        int m75415b = YD1.m75415b(this.f43853j, this.f43817I ? 1 : 0) & 7;
        if (m75415b != 1) {
            if (m75415b != 5) {
                if (this.f43817I) {
                    return Layout.Alignment.ALIGN_OPPOSITE;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            } else if (this.f43817I) {
                return Layout.Alignment.ALIGN_NORMAL;
            } else {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    /* renamed from: C0 */
    public final boolean m76452C0() {
        return this.f43866p0 > 1 && (!this.f43817I || this.f43839c) && !this.f43819K;
    }

    /* renamed from: D */
    public CharSequence m76451D() {
        return this.f43815G;
    }

    /* renamed from: E */
    public final void m76450E(TextPaint textPaint) {
        textPaint.setTextSize(this.f43859m);
        textPaint.setTypeface(this.f43876w);
        textPaint.setLetterSpacing(this.f43850h0);
    }

    /* renamed from: F */
    public final void m76449F(TextPaint textPaint) {
        textPaint.setTextSize(this.f43857l);
        textPaint.setTypeface(this.f43879z);
        textPaint.setLetterSpacing(this.f43852i0);
    }

    /* renamed from: G */
    public final void m76448G(float f) {
        Rect rect;
        if (this.f43839c) {
            RectF rectF = this.f43851i;
            if (f < this.f43843e) {
                rect = this.f43847g;
            } else {
                rect = this.f43849h;
            }
            rectF.set(rect);
            return;
        }
        this.f43851i.left = m76443L(this.f43847g.left, this.f43849h.left, f, this.f43832X);
        this.f43851i.top = m76443L(this.f43867q, this.f43869r, f, this.f43832X);
        this.f43851i.right = m76443L(this.f43847g.right, this.f43849h.right, f, this.f43832X);
        this.f43851i.bottom = m76443L(this.f43847g.bottom, this.f43849h.bottom, f, this.f43832X);
    }

    /* renamed from: I */
    public final boolean m76446I() {
        return C38790bq6.m62548D(this.f43835a) == 1;
    }

    /* renamed from: J */
    public final boolean m76445J() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f43863o;
        if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f43861n) != null && colorStateList.isStateful())) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public final boolean m76444K(CharSequence charSequence, boolean z) {
        X06 x06;
        if (z) {
            x06 = Y06.f44430d;
        } else {
            x06 = Y06.f44429c;
        }
        return x06.mo75856a(charSequence, 0, charSequence.length());
    }

    /* renamed from: M */
    public void m76442M(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f43878y;
            if (typeface != null) {
                this.f43877x = C32807Fc6.m106902b(configuration, typeface);
            }
            Typeface typeface2 = this.f43810B;
            if (typeface2 != null) {
                this.f43809A = C32807Fc6.m106902b(configuration, typeface2);
            }
            Typeface typeface3 = this.f43877x;
            if (typeface3 == null) {
                typeface3 = this.f43878y;
            }
            this.f43876w = typeface3;
            Typeface typeface4 = this.f43809A;
            if (typeface4 == null) {
                typeface4 = this.f43810B;
            }
            this.f43879z = typeface4;
            m76439P(true);
        }
    }

    /* renamed from: N */
    public final float m76441N(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: O */
    public void m76440O() {
        m76439P(false);
    }

    /* renamed from: P */
    public void m76439P(boolean z) {
        if ((this.f43835a.getHeight() > 0 && this.f43835a.getWidth() > 0) || z) {
            m76426b(z);
            m76424c();
        }
    }

    /* renamed from: R */
    public void m76437R(ColorStateList colorStateList) {
        if (this.f43863o != colorStateList || this.f43861n != colorStateList) {
            this.f43863o = colorStateList;
            this.f43861n = colorStateList;
            m76440O();
        }
    }

    /* renamed from: S */
    public void m76436S(int i, int i2, int i3, int i4) {
        if (!m76438Q(this.f43849h, i, i2, i3, i4)) {
            this.f43849h.set(i, i2, i3, i4);
            this.f43829U = true;
        }
    }

    /* renamed from: T */
    public void m76435T(Rect rect) {
        m76436S(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: U */
    public void m76434U(int i) {
        N06 n06 = new N06(this.f43835a.getContext(), i);
        if (n06.m94481i() != null) {
            this.f43863o = n06.m94481i();
        }
        if (n06.m94480j() != 0.0f) {
            this.f43859m = n06.m94480j();
        }
        ColorStateList colorStateList = n06.f23949c;
        if (colorStateList != null) {
            this.f43840c0 = colorStateList;
        }
        this.f43836a0 = n06.f23954h;
        this.f43838b0 = n06.f23955i;
        this.f43834Z = n06.f23956j;
        this.f43850h0 = n06.f23958l;
        C36311Uc0 c36311Uc0 = this.f43813E;
        if (c36311Uc0 != null) {
            c36311Uc0.m81267c();
        }
        this.f43813E = new C36311Uc0(new C9488a(), n06.m94485e());
        n06.m94483g(this.f43835a.getContext(), this.f43813E);
        m76440O();
    }

    /* renamed from: V */
    public final void m76433V(float f) {
        this.f43860m0 = f;
        C38790bq6.m62470m0(this.f43835a);
    }

    /* renamed from: W */
    public void m76432W(ColorStateList colorStateList) {
        if (this.f43863o != colorStateList) {
            this.f43863o = colorStateList;
            m76440O();
        }
    }

    /* renamed from: X */
    public void m76431X(int i) {
        if (this.f43855k != i) {
            this.f43855k = i;
            m76440O();
        }
    }

    /* renamed from: Y */
    public void m76430Y(float f) {
        if (this.f43859m != f) {
            this.f43859m = f;
            m76440O();
        }
    }

    /* renamed from: Z */
    public void m76429Z(Typeface typeface) {
        if (m76427a0(typeface)) {
            m76440O();
        }
    }

    /* renamed from: a0 */
    public final boolean m76427a0(Typeface typeface) {
        C36311Uc0 c36311Uc0 = this.f43813E;
        if (c36311Uc0 != null) {
            c36311Uc0.m81267c();
        }
        if (this.f43878y != typeface) {
            this.f43878y = typeface;
            Typeface m106902b = C32807Fc6.m106902b(this.f43835a.getContext().getResources().getConfiguration(), typeface);
            this.f43877x = m106902b;
            if (m106902b == null) {
                m106902b = this.f43878y;
            }
            this.f43876w = m106902b;
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void m76426b(boolean z) {
        float f;
        int i;
        StaticLayout staticLayout;
        m76412i(1.0f, z);
        CharSequence charSequence = this.f43816H;
        if (charSequence != null && (staticLayout = this.f43856k0) != null) {
            this.f43864o0 = TextUtils.ellipsize(charSequence, this.f43830V, staticLayout.getWidth(), this.f43814F);
        }
        CharSequence charSequence2 = this.f43864o0;
        float f2 = 0.0f;
        if (charSequence2 != null) {
            this.f43858l0 = m76441N(this.f43830V, charSequence2);
        } else {
            this.f43858l0 = 0.0f;
        }
        int m75415b = YD1.m75415b(this.f43855k, this.f43817I ? 1 : 0);
        int i2 = m75415b & 112;
        if (i2 != 48) {
            if (i2 != 80) {
                this.f43869r = this.f43849h.centerY() - ((this.f43830V.descent() - this.f43830V.ascent()) / 2.0f);
            } else {
                this.f43869r = this.f43849h.bottom + this.f43830V.ascent();
            }
        } else {
            this.f43869r = this.f43849h.top;
        }
        int i3 = m75415b & 8388615;
        if (i3 != 1) {
            if (i3 != 5) {
                this.f43873t = this.f43849h.left;
            } else {
                this.f43873t = this.f43849h.right - this.f43858l0;
            }
        } else {
            this.f43873t = this.f43849h.centerX() - (this.f43858l0 / 2.0f);
        }
        m76412i(0.0f, z);
        StaticLayout staticLayout2 = this.f43856k0;
        if (staticLayout2 != null) {
            f = staticLayout2.getHeight();
        } else {
            f = 0.0f;
        }
        StaticLayout staticLayout3 = this.f43856k0;
        if (staticLayout3 != null && this.f43866p0 > 1) {
            f2 = staticLayout3.getWidth();
        } else {
            CharSequence charSequence3 = this.f43816H;
            if (charSequence3 != null) {
                f2 = m76441N(this.f43830V, charSequence3);
            }
        }
        StaticLayout staticLayout4 = this.f43856k0;
        if (staticLayout4 != null) {
            i = staticLayout4.getLineCount();
        } else {
            i = 0;
        }
        this.f43865p = i;
        int m75415b2 = YD1.m75415b(this.f43853j, this.f43817I ? 1 : 0);
        int i4 = m75415b2 & 112;
        if (i4 != 48) {
            if (i4 != 80) {
                this.f43867q = this.f43847g.centerY() - (f / 2.0f);
            } else {
                this.f43867q = (this.f43847g.bottom - f) + this.f43830V.descent();
            }
        } else {
            this.f43867q = this.f43847g.top;
        }
        int i5 = m75415b2 & 8388615;
        if (i5 != 1) {
            if (i5 != 5) {
                this.f43871s = this.f43847g.left;
            } else {
                this.f43871s = this.f43847g.right - f2;
            }
        } else {
            this.f43871s = this.f43847g.centerX() - (f2 / 2.0f);
        }
        m76410j();
        m76395q0(this.f43837b);
    }

    /* renamed from: b0 */
    public void m76425b0(int i) {
        this.f43845f = i;
    }

    /* renamed from: c */
    public final void m76424c() {
        m76416g(this.f43837b);
    }

    /* renamed from: c0 */
    public void m76423c0(int i, int i2, int i3, int i4) {
        if (!m76438Q(this.f43847g, i, i2, i3, i4)) {
            this.f43847g.set(i, i2, i3, i4);
            this.f43829U = true;
        }
    }

    /* renamed from: d */
    public final float m76422d(float f) {
        float f2 = this.f43843e;
        if (f <= f2) {
            return C27325pf.m19014b(1.0f, 0.0f, this.f43841d, f2, f);
        }
        return C27325pf.m19014b(0.0f, 1.0f, f2, 1.0f, f);
    }

    /* renamed from: d0 */
    public void m76421d0(Rect rect) {
        m76423c0(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: e */
    public final float m76420e() {
        float f = this.f43841d;
        return f + ((1.0f - f) * 0.5f);
    }

    /* renamed from: e0 */
    public void m76419e0(float f) {
        if (this.f43852i0 != f) {
            this.f43852i0 = f;
            m76440O();
        }
    }

    /* renamed from: f */
    public final boolean m76418f(CharSequence charSequence) {
        boolean m76446I = m76446I();
        if (this.f43818J) {
            return m76444K(charSequence, m76446I);
        }
        return m76446I;
    }

    /* renamed from: f0 */
    public void m76417f0(int i) {
        N06 n06 = new N06(this.f43835a.getContext(), i);
        if (n06.m94481i() != null) {
            this.f43861n = n06.m94481i();
        }
        if (n06.m94480j() != 0.0f) {
            this.f43857l = n06.m94480j();
        }
        ColorStateList colorStateList = n06.f23949c;
        if (colorStateList != null) {
            this.f43848g0 = colorStateList;
        }
        this.f43844e0 = n06.f23954h;
        this.f43846f0 = n06.f23955i;
        this.f43842d0 = n06.f23956j;
        this.f43852i0 = n06.f23958l;
        C36311Uc0 c36311Uc0 = this.f43812D;
        if (c36311Uc0 != null) {
            c36311Uc0.m81267c();
        }
        this.f43812D = new C36311Uc0(new C9489b(), n06.m94485e());
        n06.m94483g(this.f43835a.getContext(), this.f43812D);
        m76440O();
    }

    /* renamed from: g */
    public final void m76416g(float f) {
        float f2;
        m76448G(f);
        if (this.f43839c) {
            if (f < this.f43843e) {
                this.f43874u = this.f43871s;
                this.f43875v = this.f43867q;
                m76395q0(0.0f);
                f2 = 0.0f;
            } else {
                this.f43874u = this.f43873t;
                this.f43875v = this.f43869r - Math.max(0, this.f43845f);
                m76395q0(1.0f);
                f2 = 1.0f;
            }
        } else {
            this.f43874u = m76443L(this.f43871s, this.f43873t, f, this.f43832X);
            this.f43875v = m76443L(this.f43867q, this.f43869r, f, this.f43832X);
            m76395q0(f);
            f2 = f;
        }
        TimeInterpolator timeInterpolator = C27325pf.f103880b;
        m76433V(1.0f - m76443L(0.0f, 1.0f, 1.0f - f, timeInterpolator));
        m76415g0(m76443L(1.0f, 0.0f, f, timeInterpolator));
        if (this.f43863o != this.f43861n) {
            this.f43830V.setColor(m76428a(m76386v(), m76390t(), f2));
        } else {
            this.f43830V.setColor(m76390t());
        }
        float f3 = this.f43850h0;
        float f4 = this.f43852i0;
        if (f3 != f4) {
            this.f43830V.setLetterSpacing(m76443L(f4, f3, f, timeInterpolator));
        } else {
            this.f43830V.setLetterSpacing(f3);
        }
        this.f43824P = m76443L(this.f43842d0, this.f43834Z, f, null);
        this.f43825Q = m76443L(this.f43844e0, this.f43836a0, f, null);
        this.f43826R = m76443L(this.f43846f0, this.f43838b0, f, null);
        int m76428a = m76428a(m76388u(this.f43848g0), m76388u(this.f43840c0), f);
        this.f43827S = m76428a;
        this.f43830V.setShadowLayer(this.f43824P, this.f43825Q, this.f43826R, m76428a);
        if (this.f43839c) {
            this.f43830V.setAlpha((int) (m76422d(f) * this.f43830V.getAlpha()));
        }
        C38790bq6.m62470m0(this.f43835a);
    }

    /* renamed from: g0 */
    public final void m76415g0(float f) {
        this.f43862n0 = f;
        C38790bq6.m62470m0(this.f43835a);
    }

    /* renamed from: h */
    public final void m76414h(float f) {
        m76412i(f, false);
    }

    /* renamed from: h0 */
    public void m76413h0(ColorStateList colorStateList) {
        if (this.f43861n != colorStateList) {
            this.f43861n = colorStateList;
            m76440O();
        }
    }

    /* renamed from: i */
    public final void m76412i(float f, boolean z) {
        float f2;
        float f3;
        Typeface typeface;
        boolean z2;
        boolean z3;
        boolean z4;
        StaticLayout staticLayout;
        boolean z5;
        boolean z6;
        if (this.f43815G == null) {
            return;
        }
        float width = this.f43849h.width();
        float width2 = this.f43847g.width();
        if (m76447H(f, 1.0f)) {
            f2 = this.f43859m;
            f3 = this.f43850h0;
            this.f43822N = 1.0f;
            typeface = this.f43876w;
        } else {
            float f4 = this.f43857l;
            float f5 = this.f43852i0;
            Typeface typeface2 = this.f43879z;
            if (m76447H(f, 0.0f)) {
                this.f43822N = 1.0f;
            } else {
                this.f43822N = m76443L(this.f43857l, this.f43859m, f, this.f43833Y) / this.f43857l;
            }
            float f6 = this.f43859m / this.f43857l;
            float f7 = width2 * f6;
            if (z || f7 <= width) {
                width = width2;
            } else {
                width = Math.min(width / f6, width2);
            }
            f2 = f4;
            f3 = f5;
            typeface = typeface2;
        }
        int i = 1;
        boolean z7 = false;
        if (width > 0.0f) {
            if (this.f43823O != f2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.f43854j0 != f3) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (this.f43811C != typeface) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (this.f43856k0 != null && width != staticLayout.getWidth()) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z2 && !z3 && !z5 && !z4 && !this.f43829U) {
                z6 = false;
            } else {
                z6 = true;
            }
            this.f43823O = f2;
            this.f43854j0 = f3;
            this.f43811C = typeface;
            this.f43829U = false;
            TextPaint textPaint = this.f43830V;
            if (this.f43822N != 1.0f) {
                z7 = true;
            }
            textPaint.setLinearText(z7);
            z7 = z6;
        }
        if (this.f43816H == null || z7) {
            this.f43830V.setTextSize(this.f43823O);
            this.f43830V.setTypeface(this.f43811C);
            this.f43830V.setLetterSpacing(this.f43854j0);
            this.f43817I = m76418f(this.f43815G);
            if (m76452C0()) {
                i = this.f43866p0;
            }
            StaticLayout m76408k = m76408k(i, width, this.f43817I);
            this.f43856k0 = m76408k;
            this.f43816H = m76408k.getText();
        }
    }

    /* renamed from: i0 */
    public void m76411i0(int i) {
        if (this.f43853j != i) {
            this.f43853j = i;
            m76440O();
        }
    }

    /* renamed from: j */
    public final void m76410j() {
        Bitmap bitmap = this.f43820L;
        if (bitmap != null) {
            bitmap.recycle();
            this.f43820L = null;
        }
    }

    /* renamed from: j0 */
    public void m76409j0(float f) {
        if (this.f43857l != f) {
            this.f43857l = f;
            m76440O();
        }
    }

    /* renamed from: k */
    public final StaticLayout m76408k(int i, float f, boolean z) {
        Layout.Alignment m76453C;
        StaticLayout staticLayout = null;
        try {
            if (i == 1) {
                m76453C = Layout.Alignment.ALIGN_NORMAL;
            } else {
                m76453C = m76453C();
            }
            staticLayout = OP5.m92330b(this.f43815G, this.f43830V, (int) f).m92328d(this.f43814F).m92325g(z).m92329c(m76453C).m92326f(false).m92323i(i).m92324h(this.f43868q0, this.f43870r0).m92327e(this.f43872s0).m92322j(null).m92331a();
        } catch (OP5.C5994a e) {
            Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
        }
        return (StaticLayout) HZ3.m103731g(staticLayout);
    }

    /* renamed from: k0 */
    public void m76407k0(Typeface typeface) {
        if (m76405l0(typeface)) {
            m76440O();
        }
    }

    /* renamed from: l */
    public void m76406l(Canvas canvas) {
        boolean z;
        int save = canvas.save();
        if (this.f43816H != null && this.f43851i.width() > 0.0f && this.f43851i.height() > 0.0f) {
            this.f43830V.setTextSize(this.f43823O);
            float f = this.f43874u;
            float f2 = this.f43875v;
            if (this.f43819K && this.f43820L != null) {
                z = true;
            } else {
                z = false;
            }
            float f3 = this.f43822N;
            if (f3 != 1.0f && !this.f43839c) {
                canvas.scale(f3, f3, f, f2);
            }
            if (z) {
                canvas.drawBitmap(this.f43820L, f, f2, this.f43821M);
                canvas.restoreToCount(save);
                return;
            }
            if (m76452C0() && (!this.f43839c || this.f43837b > this.f43843e)) {
                m76404m(canvas, this.f43874u - this.f43856k0.getLineStart(0), f2);
            } else {
                canvas.translate(f, f2);
                this.f43856k0.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: l0 */
    public final boolean m76405l0(Typeface typeface) {
        C36311Uc0 c36311Uc0 = this.f43812D;
        if (c36311Uc0 != null) {
            c36311Uc0.m81267c();
        }
        if (this.f43810B != typeface) {
            this.f43810B = typeface;
            Typeface m106902b = C32807Fc6.m106902b(this.f43835a.getContext().getResources().getConfiguration(), typeface);
            this.f43809A = m106902b;
            if (m106902b == null) {
                m106902b = this.f43810B;
            }
            this.f43879z = m106902b;
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final void m76404m(Canvas canvas, float f, float f2) {
        int alpha = this.f43830V.getAlpha();
        canvas.translate(f, f2);
        float f3 = alpha;
        this.f43830V.setAlpha((int) (this.f43862n0 * f3));
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            TextPaint textPaint = this.f43830V;
            textPaint.setShadowLayer(this.f43824P, this.f43825Q, this.f43826R, HM2.m103955a(this.f43827S, textPaint.getAlpha()));
        }
        this.f43856k0.draw(canvas);
        this.f43830V.setAlpha((int) (this.f43860m0 * f3));
        if (i >= 31) {
            TextPaint textPaint2 = this.f43830V;
            textPaint2.setShadowLayer(this.f43824P, this.f43825Q, this.f43826R, HM2.m103955a(this.f43827S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f43856k0.getLineBaseline(0);
        CharSequence charSequence = this.f43864o0;
        float f4 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f4, this.f43830V);
        if (i >= 31) {
            this.f43830V.setShadowLayer(this.f43824P, this.f43825Q, this.f43826R, this.f43827S);
        }
        if (!this.f43839c) {
            String trim = this.f43864o0.toString().trim();
            if (trim.endsWith("…")) {
                trim = trim.substring(0, trim.length() - 1);
            }
            String str = trim;
            this.f43830V.setAlpha(alpha);
            canvas.drawText(str, 0, Math.min(this.f43856k0.getLineEnd(0), str.length()), 0.0f, f4, (Paint) this.f43830V);
        }
    }

    /* renamed from: m0 */
    public void m76403m0(float f) {
        float m41476b = C40898fN2.m41476b(f, 0.0f, 1.0f);
        if (m41476b != this.f43837b) {
            this.f43837b = m41476b;
            m76424c();
        }
    }

    /* renamed from: n */
    public final void m76402n() {
        if (this.f43820L == null && !this.f43847g.isEmpty() && !TextUtils.isEmpty(this.f43816H)) {
            m76416g(0.0f);
            int width = this.f43856k0.getWidth();
            int height = this.f43856k0.getHeight();
            if (width > 0 && height > 0) {
                this.f43820L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.f43856k0.draw(new Canvas(this.f43820L));
                if (this.f43821M == null) {
                    this.f43821M = new Paint(3);
                }
            }
        }
    }

    /* renamed from: n0 */
    public void m76401n0(boolean z) {
        this.f43839c = z;
    }

    /* renamed from: o */
    public void m76400o(RectF rectF, int i, int i2) {
        this.f43817I = m76418f(this.f43815G);
        rectF.left = Math.max(m76394r(i, i2), this.f43849h.left);
        rectF.top = this.f43849h.top;
        rectF.right = Math.min(m76392s(rectF, i, i2), this.f43849h.right);
        rectF.bottom = this.f43849h.top + m76396q();
    }

    /* renamed from: o0 */
    public void m76399o0(float f) {
        this.f43841d = f;
        this.f43843e = m76420e();
    }

    /* renamed from: p */
    public ColorStateList m76398p() {
        return this.f43863o;
    }

    /* renamed from: p0 */
    public void m76397p0(int i) {
        this.f43872s0 = i;
    }

    /* renamed from: q */
    public float m76396q() {
        m76450E(this.f43831W);
        return -this.f43831W.ascent();
    }

    /* renamed from: q0 */
    public final void m76395q0(float f) {
        boolean z;
        m76414h(f);
        if (f43807t0 && this.f43822N != 1.0f) {
            z = true;
        } else {
            z = false;
        }
        this.f43819K = z;
        if (z) {
            m76402n();
        }
        C38790bq6.m62470m0(this.f43835a);
    }

    /* renamed from: r */
    public final float m76394r(int i, int i2) {
        if (i2 != 17 && (i2 & 7) != 1) {
            if ((i2 & 8388613) != 8388613 && (i2 & 5) != 5) {
                if (this.f43817I) {
                    return this.f43849h.right - this.f43858l0;
                }
                return this.f43849h.left;
            } else if (this.f43817I) {
                return this.f43849h.left;
            } else {
                return this.f43849h.right - this.f43858l0;
            }
        }
        return (i / 2.0f) - (this.f43858l0 / 2.0f);
    }

    /* renamed from: r0 */
    public void m76393r0(float f) {
        this.f43868q0 = f;
    }

    /* renamed from: s */
    public final float m76392s(RectF rectF, int i, int i2) {
        if (i2 != 17 && (i2 & 7) != 1) {
            if ((i2 & 8388613) != 8388613 && (i2 & 5) != 5) {
                if (this.f43817I) {
                    return this.f43849h.right;
                }
                return rectF.left + this.f43858l0;
            } else if (this.f43817I) {
                return rectF.left + this.f43858l0;
            } else {
                return this.f43849h.right;
            }
        }
        return (i / 2.0f) + (this.f43858l0 / 2.0f);
    }

    /* renamed from: s0 */
    public void m76391s0(float f) {
        this.f43870r0 = f;
    }

    /* renamed from: t */
    public int m76390t() {
        return m76388u(this.f43863o);
    }

    /* renamed from: t0 */
    public void m76389t0(int i) {
        if (i != this.f43866p0) {
            this.f43866p0 = i;
            m76410j();
            m76440O();
        }
    }

    /* renamed from: u */
    public final int m76388u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f43828T;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    /* renamed from: u0 */
    public void m76387u0(TimeInterpolator timeInterpolator) {
        this.f43832X = timeInterpolator;
        m76440O();
    }

    /* renamed from: v */
    public final int m76386v() {
        return m76388u(this.f43861n);
    }

    /* renamed from: v0 */
    public void m76385v0(boolean z) {
        this.f43818J = z;
    }

    /* renamed from: w */
    public int m76384w() {
        return this.f43865p;
    }

    /* renamed from: w0 */
    public final boolean m76383w0(int[] iArr) {
        this.f43828T = iArr;
        if (m76445J()) {
            m76440O();
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public float m76382x() {
        m76449F(this.f43831W);
        return (-this.f43831W.ascent()) + this.f43831W.descent();
    }

    /* renamed from: x0 */
    public void m76381x0(PP5 pp5) {
        if (pp5 != null) {
            m76439P(true);
        }
    }

    /* renamed from: y */
    public float m76380y() {
        m76449F(this.f43831W);
        return -this.f43831W.ascent();
    }

    /* renamed from: y0 */
    public void m76379y0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f43815G, charSequence)) {
            this.f43815G = charSequence;
            this.f43816H = null;
            m76410j();
            m76440O();
        }
    }

    /* renamed from: z */
    public float m76378z() {
        return this.f43837b;
    }

    /* renamed from: z0 */
    public void m76377z0(TimeInterpolator timeInterpolator) {
        this.f43833Y = timeInterpolator;
        m76440O();
    }
}

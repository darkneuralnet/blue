package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.KotlinVersion;
import p000.C38306b16;
/* renamed from: com.google.android.material.chip.a */
/* loaded from: classes6.dex */
public class C17738a extends PM2 implements Drawable.Callback, C38306b16.InterfaceC12272b {

    /* renamed from: e1 */
    public static final int[] f72546e1 = {16842910};

    /* renamed from: f1 */
    public static final ShapeDrawable f72547f1 = new ShapeDrawable(new OvalShape());

    /* renamed from: A */
    public ColorStateList f72548A;

    /* renamed from: A0 */
    public float f72549A0;

    /* renamed from: B */
    public ColorStateList f72550B;

    /* renamed from: B0 */
    public final Context f72551B0;

    /* renamed from: C */
    public float f72552C;

    /* renamed from: C0 */
    public final Paint f72553C0;

    /* renamed from: D */
    public float f72554D;

    /* renamed from: D0 */
    public final Paint f72555D0;

    /* renamed from: E */
    public ColorStateList f72556E;

    /* renamed from: E0 */
    public final Paint.FontMetrics f72557E0;

    /* renamed from: F */
    public float f72558F;

    /* renamed from: F0 */
    public final RectF f72559F0;

    /* renamed from: G */
    public ColorStateList f72560G;

    /* renamed from: G0 */
    public final PointF f72561G0;

    /* renamed from: H */
    public CharSequence f72562H;

    /* renamed from: H0 */
    public final Path f72563H0;

    /* renamed from: I */
    public boolean f72564I;

    /* renamed from: I0 */
    public final C38306b16 f72565I0;

    /* renamed from: J */
    public Drawable f72566J;

    /* renamed from: J0 */
    public int f72567J0;

    /* renamed from: K */
    public ColorStateList f72568K;

    /* renamed from: K0 */
    public int f72569K0;

    /* renamed from: L0 */
    public int f72570L0;

    /* renamed from: M0 */
    public int f72571M0;

    /* renamed from: N0 */
    public int f72572N0;

    /* renamed from: O0 */
    public int f72573O0;

    /* renamed from: P */
    public float f72574P;

    /* renamed from: P0 */
    public boolean f72575P0;

    /* renamed from: Q */
    public boolean f72576Q;

    /* renamed from: Q0 */
    public int f72577Q0;

    /* renamed from: R */
    public boolean f72578R;

    /* renamed from: R0 */
    public int f72579R0;

    /* renamed from: S */
    public Drawable f72580S;

    /* renamed from: S0 */
    public ColorFilter f72581S0;

    /* renamed from: T */
    public Drawable f72582T;

    /* renamed from: T0 */
    public PorterDuffColorFilter f72583T0;

    /* renamed from: U */
    public ColorStateList f72584U;

    /* renamed from: U0 */
    public ColorStateList f72585U0;

    /* renamed from: V0 */
    public PorterDuff.Mode f72586V0;

    /* renamed from: W */
    public float f72587W;

    /* renamed from: W0 */
    public int[] f72588W0;

    /* renamed from: X */
    public CharSequence f72589X;

    /* renamed from: X0 */
    public boolean f72590X0;

    /* renamed from: Y */
    public boolean f72591Y;

    /* renamed from: Y0 */
    public ColorStateList f72592Y0;

    /* renamed from: Z */
    public boolean f72593Z;

    /* renamed from: Z0 */
    public WeakReference<InterfaceC17739a> f72594Z0;

    /* renamed from: a1 */
    public TextUtils.TruncateAt f72595a1;

    /* renamed from: b1 */
    public boolean f72596b1;

    /* renamed from: c1 */
    public int f72597c1;

    /* renamed from: d1 */
    public boolean f72598d1;

    /* renamed from: p0 */
    public Drawable f72599p0;

    /* renamed from: q0 */
    public ColorStateList f72600q0;

    /* renamed from: r0 */
    public YV2 f72601r0;

    /* renamed from: s0 */
    public YV2 f72602s0;

    /* renamed from: t0 */
    public float f72603t0;

    /* renamed from: u0 */
    public float f72604u0;

    /* renamed from: v0 */
    public float f72605v0;

    /* renamed from: w0 */
    public float f72606w0;

    /* renamed from: x0 */
    public float f72607x0;

    /* renamed from: y0 */
    public float f72608y0;

    /* renamed from: z0 */
    public float f72609z0;

    /* renamed from: com.google.android.material.chip.a$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC17739a {
        /* renamed from: a */
        void mo49805a();
    }

    public C17738a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f72554D = -1.0f;
        this.f72553C0 = new Paint(1);
        this.f72557E0 = new Paint.FontMetrics();
        this.f72559F0 = new RectF();
        this.f72561G0 = new PointF();
        this.f72563H0 = new Path();
        this.f72579R0 = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f72586V0 = PorterDuff.Mode.SRC_IN;
        this.f72594Z0 = new WeakReference<>(null);
        m90427P(context);
        this.f72551B0 = context;
        C38306b16 c38306b16 = new C38306b16(this);
        this.f72565I0 = c38306b16;
        this.f72562H = "";
        c38306b16.m65107e().density = context.getResources().getDisplayMetrics().density;
        this.f72555D0 = null;
        int[] iArr = f72546e1;
        setState(iArr);
        m49865b2(iArr);
        this.f72596b1 = true;
        if (C52886zb5.f121583a) {
            f72547f1.setTint(-1);
        }
    }

    /* renamed from: A0 */
    public static C17738a m49930A0(Context context, AttributeSet attributeSet, int i, int i2) {
        C17738a c17738a = new C17738a(context, attributeSet, i, i2);
        c17738a.m49848k1(attributeSet, i, i2);
        return c17738a;
    }

    /* renamed from: d1 */
    public static boolean m49862d1(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h1 */
    public static boolean m49854h1(N06 n06) {
        if (n06 != null && n06.m94481i() != null && n06.m94481i().isStateful()) {
            return true;
        }
        return false;
    }

    /* renamed from: i1 */
    public static boolean m49852i1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: j1 */
    public static boolean m49850j1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: A1 */
    public void m49929A1(int i) {
        m49807z1(this.f72551B0.getResources().getDimension(i));
    }

    /* renamed from: A2 */
    public void m49928A2(int i) {
        m49806z2(this.f72551B0.getResources().getDimension(i));
    }

    /* renamed from: B0 */
    public final void m49927B0(Canvas canvas, Rect rect) {
        if (m49919D2()) {
            m49835q0(rect, this.f72559F0);
            RectF rectF = this.f72559F0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f72599p0.setBounds(0, 0, (int) this.f72559F0.width(), (int) this.f72559F0.height());
            this.f72599p0.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: B1 */
    public void m49926B1(Drawable drawable) {
        Drawable drawable2;
        Drawable m49897M0 = m49897M0();
        if (m49897M0 != drawable) {
            float m49832r0 = m49832r0();
            if (drawable != null) {
                drawable2 = P61.m90834r(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.f72566J = drawable2;
            float m49832r02 = m49832r0();
            m49910G2(m49897M0);
            if (m49916E2()) {
                m49838p0(this.f72566J);
            }
            invalidateSelf();
            if (m49832r0 != m49832r02) {
                m49846l1();
            }
        }
    }

    /* renamed from: B2 */
    public void m49925B2(boolean z) {
        if (this.f72590X0 != z) {
            this.f72590X0 = z;
            m49907H2();
            onStateChange(getState());
        }
    }

    /* renamed from: C0 */
    public final void m49924C0(Canvas canvas, Rect rect) {
        if (!this.f72598d1) {
            this.f72553C0.setColor(this.f72569K0);
            this.f72553C0.setStyle(Paint.Style.FILL);
            this.f72553C0.setColorFilter(m49866b1());
            this.f72559F0.set(rect);
            canvas.drawRoundRect(this.f72559F0, m49901K0(), m49901K0(), this.f72553C0);
        }
    }

    /* renamed from: C1 */
    public void m49923C1(int i) {
        m49926B1(C29611vi.m8248b(this.f72551B0, i));
    }

    /* renamed from: C2 */
    public boolean m49922C2() {
        return this.f72596b1;
    }

    /* renamed from: D0 */
    public final void m49921D0(Canvas canvas, Rect rect) {
        if (m49916E2()) {
            m49835q0(rect, this.f72559F0);
            RectF rectF = this.f72559F0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f72566J.setBounds(0, 0, (int) this.f72559F0.width(), (int) this.f72559F0.height());
            this.f72566J.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: D1 */
    public void m49920D1(float f) {
        if (this.f72574P != f) {
            float m49832r0 = m49832r0();
            this.f72574P = f;
            float m49832r02 = m49832r0();
            invalidateSelf();
            if (m49832r0 != m49832r02) {
                m49846l1();
            }
        }
    }

    /* renamed from: D2 */
    public final boolean m49919D2() {
        return this.f72593Z && this.f72599p0 != null && this.f72575P0;
    }

    /* renamed from: E0 */
    public final void m49918E0(Canvas canvas, Rect rect) {
        if (this.f72558F > 0.0f && !this.f72598d1) {
            this.f72553C0.setColor(this.f72571M0);
            this.f72553C0.setStyle(Paint.Style.STROKE);
            if (!this.f72598d1) {
                this.f72553C0.setColorFilter(m49866b1());
            }
            RectF rectF = this.f72559F0;
            float f = this.f72558F;
            rectF.set(rect.left + (f / 2.0f), rect.top + (f / 2.0f), rect.right - (f / 2.0f), rect.bottom - (f / 2.0f));
            float f2 = this.f72554D - (this.f72558F / 2.0f);
            canvas.drawRoundRect(this.f72559F0, f2, f2, this.f72553C0);
        }
    }

    /* renamed from: E1 */
    public void m49917E1(int i) {
        m49920D1(this.f72551B0.getResources().getDimension(i));
    }

    /* renamed from: E2 */
    public final boolean m49916E2() {
        return this.f72564I && this.f72566J != null;
    }

    /* renamed from: F0 */
    public final void m49915F0(Canvas canvas, Rect rect) {
        if (!this.f72598d1) {
            this.f72553C0.setColor(this.f72567J0);
            this.f72553C0.setStyle(Paint.Style.FILL);
            this.f72559F0.set(rect);
            canvas.drawRoundRect(this.f72559F0, m49901K0(), m49901K0(), this.f72553C0);
        }
    }

    /* renamed from: F1 */
    public void m49914F1(ColorStateList colorStateList) {
        this.f72576Q = true;
        if (this.f72568K != colorStateList) {
            this.f72568K = colorStateList;
            if (m49916E2()) {
                P61.m90837o(this.f72566J, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: F2 */
    public final boolean m49913F2() {
        return this.f72578R && this.f72580S != null;
    }

    /* renamed from: G0 */
    public final void m49912G0(Canvas canvas, Rect rect) {
        if (m49913F2()) {
            m49826t0(rect, this.f72559F0);
            RectF rectF = this.f72559F0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f72580S.setBounds(0, 0, (int) this.f72559F0.width(), (int) this.f72559F0.height());
            if (C52886zb5.f121583a) {
                this.f72582T.setBounds(this.f72580S.getBounds());
                this.f72582T.jumpToCurrentState();
                this.f72582T.draw(canvas);
            } else {
                this.f72580S.draw(canvas);
            }
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: G1 */
    public void m49911G1(int i) {
        m49914F1(C29611vi.m8249a(this.f72551B0, i));
    }

    /* renamed from: G2 */
    public final void m49910G2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* renamed from: H0 */
    public final void m49909H0(Canvas canvas, Rect rect) {
        this.f72553C0.setColor(this.f72572N0);
        this.f72553C0.setStyle(Paint.Style.FILL);
        this.f72559F0.set(rect);
        if (!this.f72598d1) {
            canvas.drawRoundRect(this.f72559F0, m49901K0(), m49901K0(), this.f72553C0);
            return;
        }
        m90403h(new RectF(rect), this.f72563H0);
        super.m90386q(canvas, this.f72553C0, this.f72563H0, m90382u());
    }

    /* renamed from: H1 */
    public void m49908H1(int i) {
        m49905I1(this.f72551B0.getResources().getBoolean(i));
    }

    /* renamed from: H2 */
    public final void m49907H2() {
        this.f72592Y0 = this.f72590X0 ? C52886zb5.m1051d(this.f72560G) : null;
    }

    /* renamed from: I0 */
    public final void m49906I0(Canvas canvas, Rect rect) {
        Paint paint = this.f72555D0;
        if (paint != null) {
            paint.setColor(C33827Jm0.m99845p(-16777216, 127));
            canvas.drawRect(rect, this.f72555D0);
            if (m49916E2() || m49919D2()) {
                m49835q0(rect, this.f72559F0);
                canvas.drawRect(this.f72559F0, this.f72555D0);
            }
            if (this.f72562H != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f72555D0);
            }
            if (m49913F2()) {
                m49826t0(rect, this.f72559F0);
                canvas.drawRect(this.f72559F0, this.f72555D0);
            }
            this.f72555D0.setColor(C33827Jm0.m99845p(-65536, 127));
            m49829s0(rect, this.f72559F0);
            canvas.drawRect(this.f72559F0, this.f72555D0);
            this.f72555D0.setColor(C33827Jm0.m99845p(-16711936, 127));
            m49823u0(rect, this.f72559F0);
            canvas.drawRect(this.f72559F0, this.f72555D0);
        }
    }

    /* renamed from: I1 */
    public void m49905I1(boolean z) {
        boolean z2;
        if (this.f72564I != z) {
            boolean m49916E2 = m49916E2();
            this.f72564I = z;
            boolean m49916E22 = m49916E2();
            if (m49916E2 != m49916E22) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (m49916E22) {
                    m49838p0(this.f72566J);
                } else {
                    m49910G2(this.f72566J);
                }
                invalidateSelf();
                m49846l1();
            }
        }
    }

    @TargetApi(21)
    /* renamed from: I2 */
    public final void m49904I2() {
        this.f72582T = new RippleDrawable(C52886zb5.m1051d(m49877W0()), this.f72580S, f72547f1);
    }

    /* renamed from: J0 */
    public final void m49903J0(Canvas canvas, Rect rect) {
        boolean z;
        if (this.f72562H != null) {
            Paint.Align m49811y0 = m49811y0(rect, this.f72561G0);
            m49817w0(rect, this.f72559F0);
            if (this.f72565I0.m65108d() != null) {
                this.f72565I0.m65107e().drawableState = getState();
                this.f72565I0.m65102j(this.f72551B0);
            }
            this.f72565I0.m65107e().setTextAlign(m49811y0);
            int i = 0;
            if (Math.round(this.f72565I0.m65106f(m49875X0().toString())) > Math.round(this.f72559F0.width())) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.f72559F0);
            }
            CharSequence charSequence = this.f72562H;
            if (z && this.f72595a1 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f72565I0.m65107e(), this.f72559F0.width(), this.f72595a1);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f72561G0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f72565I0.m65107e());
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: J1 */
    public void m49902J1(float f) {
        if (this.f72552C != f) {
            this.f72552C = f;
            invalidateSelf();
            m49846l1();
        }
    }

    /* renamed from: K0 */
    public float m49901K0() {
        return this.f72598d1 ? m90434I() : this.f72554D;
    }

    /* renamed from: K1 */
    public void m49900K1(int i) {
        m49902J1(this.f72551B0.getResources().getDimension(i));
    }

    /* renamed from: L0 */
    public float m49899L0() {
        return this.f72549A0;
    }

    /* renamed from: L1 */
    public void m49898L1(float f) {
        if (this.f72603t0 != f) {
            this.f72603t0 = f;
            invalidateSelf();
            m49846l1();
        }
    }

    /* renamed from: M0 */
    public Drawable m49897M0() {
        Drawable drawable = this.f72566J;
        if (drawable != null) {
            return P61.m90835q(drawable);
        }
        return null;
    }

    /* renamed from: M1 */
    public void m49896M1(int i) {
        m49898L1(this.f72551B0.getResources().getDimension(i));
    }

    /* renamed from: N0 */
    public float m49895N0() {
        return this.f72552C;
    }

    /* renamed from: N1 */
    public void m49894N1(ColorStateList colorStateList) {
        if (this.f72556E != colorStateList) {
            this.f72556E = colorStateList;
            if (this.f72598d1) {
                m90396k0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: O0 */
    public float m49893O0() {
        return this.f72603t0;
    }

    /* renamed from: O1 */
    public void m49892O1(int i) {
        m49894N1(C29611vi.m8249a(this.f72551B0, i));
    }

    /* renamed from: P0 */
    public Drawable m49891P0() {
        Drawable drawable = this.f72580S;
        if (drawable != null) {
            return P61.m90835q(drawable);
        }
        return null;
    }

    /* renamed from: P1 */
    public void m49890P1(float f) {
        if (this.f72558F != f) {
            this.f72558F = f;
            this.f72553C0.setStrokeWidth(f);
            if (this.f72598d1) {
                super.m90394l0(f);
            }
            invalidateSelf();
        }
    }

    /* renamed from: Q0 */
    public CharSequence m49889Q0() {
        return this.f72589X;
    }

    /* renamed from: Q1 */
    public void m49888Q1(int i) {
        m49890P1(this.f72551B0.getResources().getDimension(i));
    }

    /* renamed from: R0 */
    public int[] m49887R0() {
        return this.f72588W0;
    }

    /* renamed from: R1 */
    public final void m49886R1(ColorStateList colorStateList) {
        if (this.f72548A != colorStateList) {
            this.f72548A = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: S0 */
    public void m49885S0(RectF rectF) {
        m49823u0(getBounds(), rectF);
    }

    /* renamed from: S1 */
    public void m49884S1(Drawable drawable) {
        Drawable drawable2;
        Drawable m49891P0 = m49891P0();
        if (m49891P0 != drawable) {
            float m49820v0 = m49820v0();
            if (drawable != null) {
                drawable2 = P61.m90834r(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.f72580S = drawable2;
            if (C52886zb5.f121583a) {
                m49904I2();
            }
            float m49820v02 = m49820v0();
            m49910G2(m49891P0);
            if (m49913F2()) {
                m49838p0(this.f72580S);
            }
            invalidateSelf();
            if (m49820v0 != m49820v02) {
                m49846l1();
            }
        }
    }

    /* renamed from: T0 */
    public final float m49883T0() {
        Drawable drawable;
        if (this.f72575P0) {
            drawable = this.f72599p0;
        } else {
            drawable = this.f72566J;
        }
        float f = this.f72574P;
        if (f <= 0.0f && drawable != null) {
            f = (float) Math.ceil(C36704Vt6.m79303e(this.f72551B0, 24));
            if (drawable.getIntrinsicHeight() <= f) {
                return drawable.getIntrinsicHeight();
            }
        }
        return f;
    }

    /* renamed from: T1 */
    public void m49882T1(CharSequence charSequence) {
        if (this.f72589X != charSequence) {
            this.f72589X = C2697GG.m105577c().m105572h(charSequence);
            invalidateSelf();
        }
    }

    /* renamed from: U0 */
    public final float m49881U0() {
        Drawable drawable;
        if (this.f72575P0) {
            drawable = this.f72599p0;
        } else {
            drawable = this.f72566J;
        }
        float f = this.f72574P;
        if (f <= 0.0f && drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return f;
    }

    /* renamed from: U1 */
    public void m49880U1(float f) {
        if (this.f72609z0 != f) {
            this.f72609z0 = f;
            invalidateSelf();
            if (m49913F2()) {
                m49846l1();
            }
        }
    }

    /* renamed from: V0 */
    public TextUtils.TruncateAt m49879V0() {
        return this.f72595a1;
    }

    /* renamed from: V1 */
    public void m49878V1(int i) {
        m49880U1(this.f72551B0.getResources().getDimension(i));
    }

    /* renamed from: W0 */
    public ColorStateList m49877W0() {
        return this.f72560G;
    }

    /* renamed from: W1 */
    public void m49876W1(int i) {
        m49884S1(C29611vi.m8248b(this.f72551B0, i));
    }

    /* renamed from: X0 */
    public CharSequence m49875X0() {
        return this.f72562H;
    }

    /* renamed from: X1 */
    public void m49874X1(float f) {
        if (this.f72587W != f) {
            this.f72587W = f;
            invalidateSelf();
            if (m49913F2()) {
                m49846l1();
            }
        }
    }

    /* renamed from: Y0 */
    public N06 m49873Y0() {
        return this.f72565I0.m65108d();
    }

    /* renamed from: Y1 */
    public void m49872Y1(int i) {
        m49874X1(this.f72551B0.getResources().getDimension(i));
    }

    /* renamed from: Z0 */
    public float m49871Z0() {
        return this.f72607x0;
    }

    /* renamed from: Z1 */
    public void m49870Z1(float f) {
        if (this.f72608y0 != f) {
            this.f72608y0 = f;
            invalidateSelf();
            if (m49913F2()) {
                m49846l1();
            }
        }
    }

    @Override // p000.C38306b16.InterfaceC12272b
    /* renamed from: a */
    public void mo49869a() {
        m49846l1();
        invalidateSelf();
    }

    /* renamed from: a1 */
    public float m49868a1() {
        return this.f72606w0;
    }

    /* renamed from: a2 */
    public void m49867a2(int i) {
        m49870Z1(this.f72551B0.getResources().getDimension(i));
    }

    /* renamed from: b1 */
    public final ColorFilter m49866b1() {
        ColorFilter colorFilter = this.f72581S0;
        return colorFilter != null ? colorFilter : this.f72583T0;
    }

    /* renamed from: b2 */
    public boolean m49865b2(int[] iArr) {
        if (!Arrays.equals(this.f72588W0, iArr)) {
            this.f72588W0 = iArr;
            if (m49913F2()) {
                return m49844m1(getState(), iArr);
            }
            return false;
        }
        return false;
    }

    /* renamed from: c1 */
    public boolean m49864c1() {
        return this.f72590X0;
    }

    /* renamed from: c2 */
    public void m49863c2(ColorStateList colorStateList) {
        if (this.f72584U != colorStateList) {
            this.f72584U = colorStateList;
            if (m49913F2()) {
                P61.m90837o(this.f72580S, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: d2 */
    public void m49861d2(int i) {
        m49863c2(C29611vi.m8249a(this.f72551B0, i));
    }

    @Override // p000.PM2, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i2 = this.f72579R0;
            if (i2 < 255) {
                i = C45797ne0.m23376a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i2);
            } else {
                i = 0;
            }
            m49915F0(canvas, bounds);
            m49924C0(canvas, bounds);
            if (this.f72598d1) {
                super.draw(canvas);
            }
            m49918E0(canvas, bounds);
            m49909H0(canvas, bounds);
            m49921D0(canvas, bounds);
            m49927B0(canvas, bounds);
            if (this.f72596b1) {
                m49903J0(canvas, bounds);
            }
            m49912G0(canvas, bounds);
            m49906I0(canvas, bounds);
            if (this.f72579R0 < 255) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: e1 */
    public boolean m49860e1() {
        return this.f72591Y;
    }

    /* renamed from: e2 */
    public void m49859e2(boolean z) {
        boolean z2;
        if (this.f72578R != z) {
            boolean m49913F2 = m49913F2();
            this.f72578R = z;
            boolean m49913F22 = m49913F2();
            if (m49913F2 != m49913F22) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (m49913F22) {
                    m49838p0(this.f72580S);
                } else {
                    m49910G2(this.f72580S);
                }
                invalidateSelf();
                m49846l1();
            }
        }
    }

    /* renamed from: f1 */
    public boolean m49858f1() {
        return m49850j1(this.f72580S);
    }

    /* renamed from: f2 */
    public void m49857f2(InterfaceC17739a interfaceC17739a) {
        this.f72594Z0 = new WeakReference<>(interfaceC17739a);
    }

    /* renamed from: g1 */
    public boolean m49856g1() {
        return this.f72578R;
    }

    /* renamed from: g2 */
    public void m49855g2(TextUtils.TruncateAt truncateAt) {
        this.f72595a1 = truncateAt;
    }

    @Override // p000.PM2, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f72579R0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f72581S0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f72552C;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f72603t0 + m49832r0() + this.f72606w0 + this.f72565I0.m65106f(m49875X0().toString()) + this.f72607x0 + m49820v0() + this.f72549A0), this.f72597c1);
    }

    @Override // p000.PM2, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // p000.PM2, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f72598d1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f72554D);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f72554D);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    /* renamed from: h2 */
    public void m49853h2(YV2 yv2) {
        this.f72602s0 = yv2;
    }

    /* renamed from: i2 */
    public void m49851i2(int i) {
        m49853h2(YV2.m74982d(this.f72551B0, i));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p000.PM2, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!m49852i1(this.f72548A) && !m49852i1(this.f72550B) && !m49852i1(this.f72556E) && ((!this.f72590X0 || !m49852i1(this.f72592Y0)) && !m49854h1(this.f72565I0.m65108d()) && !m49808z0() && !m49850j1(this.f72566J) && !m49850j1(this.f72599p0) && !m49852i1(this.f72585U0))) {
            return false;
        }
        return true;
    }

    /* renamed from: j2 */
    public void m49849j2(float f) {
        if (this.f72605v0 != f) {
            float m49832r0 = m49832r0();
            this.f72605v0 = f;
            float m49832r02 = m49832r0();
            invalidateSelf();
            if (m49832r0 != m49832r02) {
                m49846l1();
            }
        }
    }

    /* renamed from: k1 */
    public final void m49848k1(AttributeSet attributeSet, int i, int i2) {
        TypedArray m21866i = C46052o36.m21866i(this.f72551B0, attributeSet, C37098Xl4.Chip, i, i2, new int[0]);
        this.f72598d1 = m21866i.hasValue(C37098Xl4.Chip_shapeAppearance);
        m49886R1(NM2.m94029b(this.f72551B0, m21866i, C37098Xl4.Chip_chipSurfaceColor));
        m49819v1(NM2.m94029b(this.f72551B0, m21866i, C37098Xl4.Chip_chipBackgroundColor));
        m49902J1(m21866i.getDimension(C37098Xl4.Chip_chipMinHeight, 0.0f));
        int i3 = C37098Xl4.Chip_chipCornerRadius;
        if (m21866i.hasValue(i3)) {
            m49813x1(m21866i.getDimension(i3, 0.0f));
        }
        m49894N1(NM2.m94029b(this.f72551B0, m21866i, C37098Xl4.Chip_chipStrokeColor));
        m49890P1(m21866i.getDimension(C37098Xl4.Chip_chipStrokeWidth, 0.0f));
        m49839o2(NM2.m94029b(this.f72551B0, m21866i, C37098Xl4.Chip_rippleColor));
        m49824t2(m21866i.getText(C37098Xl4.Chip_android_text));
        N06 m94024g = NM2.m94024g(this.f72551B0, m21866i, C37098Xl4.Chip_android_textAppearance);
        m94024g.m94478l(m21866i.getDimension(C37098Xl4.Chip_android_textSize, m94024g.m94480j()));
        m49821u2(m94024g);
        int i4 = m21866i.getInt(C37098Xl4.Chip_android_ellipsize, 0);
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    m49855g2(TextUtils.TruncateAt.END);
                }
            } else {
                m49855g2(TextUtils.TruncateAt.MIDDLE);
            }
        } else {
            m49855g2(TextUtils.TruncateAt.START);
        }
        m49905I1(m21866i.getBoolean(C37098Xl4.Chip_chipIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            m49905I1(m21866i.getBoolean(C37098Xl4.Chip_chipIconEnabled, false));
        }
        m49926B1(NM2.m94026e(this.f72551B0, m21866i, C37098Xl4.Chip_chipIcon));
        int i5 = C37098Xl4.Chip_chipIconTint;
        if (m21866i.hasValue(i5)) {
            m49914F1(NM2.m94029b(this.f72551B0, m21866i, i5));
        }
        m49920D1(m21866i.getDimension(C37098Xl4.Chip_chipIconSize, -1.0f));
        m49859e2(m21866i.getBoolean(C37098Xl4.Chip_closeIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            m49859e2(m21866i.getBoolean(C37098Xl4.Chip_closeIconEnabled, false));
        }
        m49884S1(NM2.m94026e(this.f72551B0, m21866i, C37098Xl4.Chip_closeIcon));
        m49863c2(NM2.m94029b(this.f72551B0, m21866i, C37098Xl4.Chip_closeIconTint));
        m49874X1(m21866i.getDimension(C37098Xl4.Chip_closeIconSize, 0.0f));
        m49842n1(m21866i.getBoolean(C37098Xl4.Chip_android_checkable, false));
        m49822u1(m21866i.getBoolean(C37098Xl4.Chip_checkedIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            m49822u1(m21866i.getBoolean(C37098Xl4.Chip_checkedIconEnabled, false));
        }
        m49837p1(NM2.m94026e(this.f72551B0, m21866i, C37098Xl4.Chip_checkedIcon));
        int i6 = C37098Xl4.Chip_checkedIconTint;
        if (m21866i.hasValue(i6)) {
            m49831r1(NM2.m94029b(this.f72551B0, m21866i, i6));
        }
        m49830r2(YV2.m74983c(this.f72551B0, m21866i, C37098Xl4.Chip_showMotionSpec));
        m49853h2(YV2.m74983c(this.f72551B0, m21866i, C37098Xl4.Chip_hideMotionSpec));
        m49898L1(m21866i.getDimension(C37098Xl4.Chip_chipStartPadding, 0.0f));
        m49845l2(m21866i.getDimension(C37098Xl4.Chip_iconStartPadding, 0.0f));
        m49849j2(m21866i.getDimension(C37098Xl4.Chip_iconEndPadding, 0.0f));
        m49806z2(m21866i.getDimension(C37098Xl4.Chip_textStartPadding, 0.0f));
        m49815w2(m21866i.getDimension(C37098Xl4.Chip_textEndPadding, 0.0f));
        m49870Z1(m21866i.getDimension(C37098Xl4.Chip_closeIconStartPadding, 0.0f));
        m49880U1(m21866i.getDimension(C37098Xl4.Chip_closeIconEndPadding, 0.0f));
        m49807z1(m21866i.getDimension(C37098Xl4.Chip_chipEndPadding, 0.0f));
        m49841n2(m21866i.getDimensionPixelSize(C37098Xl4.Chip_android_maxWidth, Integer.MAX_VALUE));
        m21866i.recycle();
    }

    /* renamed from: k2 */
    public void m49847k2(int i) {
        m49849j2(this.f72551B0.getResources().getDimension(i));
    }

    /* renamed from: l1 */
    public void m49846l1() {
        InterfaceC17739a interfaceC17739a = this.f72594Z0.get();
        if (interfaceC17739a != null) {
            interfaceC17739a.mo49805a();
        }
    }

    /* renamed from: l2 */
    public void m49845l2(float f) {
        if (this.f72604u0 != f) {
            float m49832r0 = m49832r0();
            this.f72604u0 = f;
            float m49832r02 = m49832r0();
            invalidateSelf();
            if (m49832r0 != m49832r02) {
                m49846l1();
            }
        }
    }

    /* renamed from: m1 */
    public final boolean m49844m1(int[] iArr, int[] iArr2) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        int i6;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f72548A;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(iArr, this.f72567J0);
        } else {
            i = 0;
        }
        int m90395l = m90395l(i);
        boolean z5 = true;
        if (this.f72567J0 != m90395l) {
            this.f72567J0 = m90395l;
            onStateChange = true;
        }
        ColorStateList colorStateList2 = this.f72550B;
        if (colorStateList2 != null) {
            i2 = colorStateList2.getColorForState(iArr, this.f72569K0);
        } else {
            i2 = 0;
        }
        int m90395l2 = m90395l(i2);
        if (this.f72569K0 != m90395l2) {
            this.f72569K0 = m90395l2;
            onStateChange = true;
        }
        int m103948h = HM2.m103948h(m90395l, m90395l2);
        if (this.f72570L0 != m103948h) {
            z = true;
        } else {
            z = false;
        }
        if (m90379x() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z | z2) {
            this.f72570L0 = m103948h;
            m90416a0(ColorStateList.valueOf(m103948h));
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f72556E;
        if (colorStateList3 != null) {
            i3 = colorStateList3.getColorForState(iArr, this.f72571M0);
        } else {
            i3 = 0;
        }
        if (this.f72571M0 != i3) {
            this.f72571M0 = i3;
            onStateChange = true;
        }
        if (this.f72592Y0 != null && C52886zb5.m1050e(iArr)) {
            i4 = this.f72592Y0.getColorForState(iArr, this.f72572N0);
        } else {
            i4 = 0;
        }
        if (this.f72572N0 != i4) {
            this.f72572N0 = i4;
            if (this.f72590X0) {
                onStateChange = true;
            }
        }
        if (this.f72565I0.m65108d() != null && this.f72565I0.m65108d().m94481i() != null) {
            i5 = this.f72565I0.m65108d().m94481i().getColorForState(iArr, this.f72573O0);
        } else {
            i5 = 0;
        }
        if (this.f72573O0 != i5) {
            this.f72573O0 = i5;
            onStateChange = true;
        }
        if (m49862d1(getState(), 16842912) && this.f72591Y) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f72575P0 != z3 && this.f72599p0 != null) {
            float m49832r0 = m49832r0();
            this.f72575P0 = z3;
            if (m49832r0 != m49832r0()) {
                onStateChange = true;
                z4 = true;
            } else {
                z4 = false;
                onStateChange = true;
            }
        } else {
            z4 = false;
        }
        ColorStateList colorStateList4 = this.f72585U0;
        if (colorStateList4 != null) {
            i6 = colorStateList4.getColorForState(iArr, this.f72577Q0);
        } else {
            i6 = 0;
        }
        if (this.f72577Q0 != i6) {
            this.f72577Q0 = i6;
            this.f72583T0 = C40750f71.m42008k(this, this.f72585U0, this.f72586V0);
        } else {
            z5 = onStateChange;
        }
        if (m49850j1(this.f72566J)) {
            z5 |= this.f72566J.setState(iArr);
        }
        if (m49850j1(this.f72599p0)) {
            z5 |= this.f72599p0.setState(iArr);
        }
        if (m49850j1(this.f72580S)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z5 |= this.f72580S.setState(iArr3);
        }
        if (C52886zb5.f121583a && m49850j1(this.f72582T)) {
            z5 |= this.f72582T.setState(iArr2);
        }
        if (z5) {
            invalidateSelf();
        }
        if (z4) {
            m49846l1();
        }
        return z5;
    }

    /* renamed from: m2 */
    public void m49843m2(int i) {
        m49845l2(this.f72551B0.getResources().getDimension(i));
    }

    /* renamed from: n1 */
    public void m49842n1(boolean z) {
        if (this.f72591Y != z) {
            this.f72591Y = z;
            float m49832r0 = m49832r0();
            if (!z && this.f72575P0) {
                this.f72575P0 = false;
            }
            float m49832r02 = m49832r0();
            invalidateSelf();
            if (m49832r0 != m49832r02) {
                m49846l1();
            }
        }
    }

    /* renamed from: n2 */
    public void m49841n2(int i) {
        this.f72597c1 = i;
    }

    /* renamed from: o1 */
    public void m49840o1(int i) {
        m49842n1(this.f72551B0.getResources().getBoolean(i));
    }

    /* renamed from: o2 */
    public void m49839o2(ColorStateList colorStateList) {
        if (this.f72560G != colorStateList) {
            this.f72560G = colorStateList;
            m49907H2();
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m49916E2()) {
            onLayoutDirectionChanged |= P61.m90839m(this.f72566J, i);
        }
        if (m49919D2()) {
            onLayoutDirectionChanged |= P61.m90839m(this.f72599p0, i);
        }
        if (m49913F2()) {
            onLayoutDirectionChanged |= P61.m90839m(this.f72580S, i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (m49916E2()) {
            onLevelChange |= this.f72566J.setLevel(i);
        }
        if (m49919D2()) {
            onLevelChange |= this.f72599p0.setLevel(i);
        }
        if (m49913F2()) {
            onLevelChange |= this.f72580S.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // p000.PM2, android.graphics.drawable.Drawable, p000.C38306b16.InterfaceC12272b
    public boolean onStateChange(int[] iArr) {
        if (this.f72598d1) {
            super.onStateChange(iArr);
        }
        return m49844m1(iArr, m49887R0());
    }

    /* renamed from: p0 */
    public final void m49838p0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        P61.m90839m(drawable, P61.m90846f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f72580S) {
            if (drawable.isStateful()) {
                drawable.setState(m49887R0());
            }
            P61.m90837o(drawable, this.f72584U);
            return;
        }
        Drawable drawable2 = this.f72566J;
        if (drawable == drawable2 && this.f72576Q) {
            P61.m90837o(drawable2, this.f72568K);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    /* renamed from: p1 */
    public void m49837p1(Drawable drawable) {
        if (this.f72599p0 != drawable) {
            float m49832r0 = m49832r0();
            this.f72599p0 = drawable;
            float m49832r02 = m49832r0();
            m49910G2(this.f72599p0);
            m49838p0(this.f72599p0);
            invalidateSelf();
            if (m49832r0 != m49832r02) {
                m49846l1();
            }
        }
    }

    /* renamed from: p2 */
    public void m49836p2(int i) {
        m49839o2(C29611vi.m8249a(this.f72551B0, i));
    }

    /* renamed from: q0 */
    public final void m49835q0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m49916E2() || m49919D2()) {
            float f = this.f72603t0 + this.f72604u0;
            float m49881U0 = m49881U0();
            if (P61.m90846f(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + m49881U0;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - m49881U0;
            }
            float m49883T0 = m49883T0();
            float exactCenterY = rect.exactCenterY() - (m49883T0 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + m49883T0;
        }
    }

    /* renamed from: q1 */
    public void m49834q1(int i) {
        m49837p1(C29611vi.m8248b(this.f72551B0, i));
    }

    /* renamed from: q2 */
    public void m49833q2(boolean z) {
        this.f72596b1 = z;
    }

    /* renamed from: r0 */
    public float m49832r0() {
        if (!m49916E2() && !m49919D2()) {
            return 0.0f;
        }
        return this.f72604u0 + m49881U0() + this.f72605v0;
    }

    /* renamed from: r1 */
    public void m49831r1(ColorStateList colorStateList) {
        if (this.f72600q0 != colorStateList) {
            this.f72600q0 = colorStateList;
            if (m49808z0()) {
                P61.m90837o(this.f72599p0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: r2 */
    public void m49830r2(YV2 yv2) {
        this.f72601r0 = yv2;
    }

    /* renamed from: s0 */
    public final void m49829s0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (m49913F2()) {
            float f = this.f72549A0 + this.f72609z0 + this.f72587W + this.f72608y0 + this.f72607x0;
            if (P61.m90846f(this) == 0) {
                rectF.right = rect.right - f;
            } else {
                rectF.left = rect.left + f;
            }
        }
    }

    /* renamed from: s1 */
    public void m49828s1(int i) {
        m49831r1(C29611vi.m8249a(this.f72551B0, i));
    }

    /* renamed from: s2 */
    public void m49827s2(int i) {
        m49830r2(YV2.m74982d(this.f72551B0, i));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // p000.PM2, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f72579R0 != i) {
            this.f72579R0 = i;
            invalidateSelf();
        }
    }

    @Override // p000.PM2, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f72581S0 != colorFilter) {
            this.f72581S0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p000.PM2, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.f72585U0 != colorStateList) {
            this.f72585U0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p000.PM2, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f72586V0 != mode) {
            this.f72586V0 = mode;
            this.f72583T0 = C40750f71.m42008k(this, this.f72585U0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m49916E2()) {
            visible |= this.f72566J.setVisible(z, z2);
        }
        if (m49919D2()) {
            visible |= this.f72599p0.setVisible(z, z2);
        }
        if (m49913F2()) {
            visible |= this.f72580S.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* renamed from: t0 */
    public final void m49826t0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m49913F2()) {
            float f = this.f72549A0 + this.f72609z0;
            if (P61.m90846f(this) == 0) {
                float f2 = rect.right - f;
                rectF.right = f2;
                rectF.left = f2 - this.f72587W;
            } else {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + this.f72587W;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f72587W;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* renamed from: t1 */
    public void m49825t1(int i) {
        m49822u1(this.f72551B0.getResources().getBoolean(i));
    }

    /* renamed from: t2 */
    public void m49824t2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.f72562H, charSequence)) {
            this.f72562H = charSequence;
            this.f72565I0.m65103i(true);
            invalidateSelf();
            m49846l1();
        }
    }

    /* renamed from: u0 */
    public final void m49823u0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m49913F2()) {
            float f = this.f72549A0 + this.f72609z0 + this.f72587W + this.f72608y0 + this.f72607x0;
            if (P61.m90846f(this) == 0) {
                float f2 = rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = i;
                rectF.right = i + f;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    /* renamed from: u1 */
    public void m49822u1(boolean z) {
        boolean z2;
        if (this.f72593Z != z) {
            boolean m49919D2 = m49919D2();
            this.f72593Z = z;
            boolean m49919D22 = m49919D2();
            if (m49919D2 != m49919D22) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (m49919D22) {
                    m49838p0(this.f72599p0);
                } else {
                    m49910G2(this.f72599p0);
                }
                invalidateSelf();
                m49846l1();
            }
        }
    }

    /* renamed from: u2 */
    public void m49821u2(N06 n06) {
        this.f72565I0.m65104h(n06, this.f72551B0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: v0 */
    public float m49820v0() {
        if (m49913F2()) {
            return this.f72608y0 + this.f72587W + this.f72609z0;
        }
        return 0.0f;
    }

    /* renamed from: v1 */
    public void m49819v1(ColorStateList colorStateList) {
        if (this.f72550B != colorStateList) {
            this.f72550B = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: v2 */
    public void m49818v2(int i) {
        m49821u2(new N06(this.f72551B0, i));
    }

    /* renamed from: w0 */
    public final void m49817w0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f72562H != null) {
            float m49832r0 = this.f72603t0 + m49832r0() + this.f72606w0;
            float m49820v0 = this.f72549A0 + m49820v0() + this.f72607x0;
            if (P61.m90846f(this) == 0) {
                rectF.left = rect.left + m49832r0;
                rectF.right = rect.right - m49820v0;
            } else {
                rectF.left = rect.left + m49820v0;
                rectF.right = rect.right - m49832r0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    /* renamed from: w1 */
    public void m49816w1(int i) {
        m49819v1(C29611vi.m8249a(this.f72551B0, i));
    }

    /* renamed from: w2 */
    public void m49815w2(float f) {
        if (this.f72607x0 != f) {
            this.f72607x0 = f;
            invalidateSelf();
            m49846l1();
        }
    }

    /* renamed from: x0 */
    public final float m49814x0() {
        this.f72565I0.m65107e().getFontMetrics(this.f72557E0);
        Paint.FontMetrics fontMetrics = this.f72557E0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    @Deprecated
    /* renamed from: x1 */
    public void m49813x1(float f) {
        if (this.f72554D != f) {
            this.f72554D = f;
            setShapeAppearanceModel(m90438E().m31522w(f));
        }
    }

    /* renamed from: x2 */
    public void m49812x2(int i) {
        m49815w2(this.f72551B0.getResources().getDimension(i));
    }

    /* renamed from: y0 */
    public Paint.Align m49811y0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f72562H != null) {
            float m49832r0 = this.f72603t0 + m49832r0() + this.f72606w0;
            if (P61.m90846f(this) == 0) {
                pointF.x = rect.left + m49832r0;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = rect.right - m49832r0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - m49814x0();
        }
        return align;
    }

    @Deprecated
    /* renamed from: y1 */
    public void m49810y1(int i) {
        m49813x1(this.f72551B0.getResources().getDimension(i));
    }

    /* renamed from: y2 */
    public void m49809y2(float f) {
        N06 m49873Y0 = m49873Y0();
        if (m49873Y0 != null) {
            m49873Y0.m94478l(f);
            this.f72565I0.m65107e().setTextSize(f);
            mo49869a();
        }
    }

    /* renamed from: z0 */
    public final boolean m49808z0() {
        return this.f72593Z && this.f72599p0 != null && this.f72591Y;
    }

    /* renamed from: z1 */
    public void m49807z1(float f) {
        if (this.f72549A0 != f) {
            this.f72549A0 = f;
            invalidateSelf();
            m49846l1();
        }
    }

    /* renamed from: z2 */
    public void m49806z2(float f) {
        if (this.f72606w0 != f) {
            this.f72606w0 = f;
            invalidateSelf();
            m49846l1();
        }
    }
}

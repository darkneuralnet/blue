package p000;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
/* renamed from: CM2 */
/* loaded from: classes6.dex */
public class CM2 {

    /* renamed from: u */
    public static final boolean f3977u = true;

    /* renamed from: v */
    public static final boolean f3978v = false;

    /* renamed from: a */
    public final MaterialButton f3979a;

    /* renamed from: b */
    public C43037iy5 f3980b;

    /* renamed from: c */
    public int f3981c;

    /* renamed from: d */
    public int f3982d;

    /* renamed from: e */
    public int f3983e;

    /* renamed from: f */
    public int f3984f;

    /* renamed from: g */
    public int f3985g;

    /* renamed from: h */
    public int f3986h;

    /* renamed from: i */
    public PorterDuff.Mode f3987i;

    /* renamed from: j */
    public ColorStateList f3988j;

    /* renamed from: k */
    public ColorStateList f3989k;

    /* renamed from: l */
    public ColorStateList f3990l;

    /* renamed from: m */
    public Drawable f3991m;

    /* renamed from: q */
    public boolean f3995q;

    /* renamed from: s */
    public LayerDrawable f3997s;

    /* renamed from: t */
    public int f3998t;

    /* renamed from: n */
    public boolean f3992n = false;

    /* renamed from: o */
    public boolean f3993o = false;

    /* renamed from: p */
    public boolean f3994p = false;

    /* renamed from: r */
    public boolean f3996r = true;

    public CM2(MaterialButton materialButton, C43037iy5 c43037iy5) {
        this.f3979a = materialButton;
        this.f3980b = c43037iy5;
    }

    /* renamed from: A */
    public void m112329A(boolean z) {
        this.f3992n = z;
        m112320J();
    }

    /* renamed from: B */
    public void m112328B(ColorStateList colorStateList) {
        if (this.f3989k != colorStateList) {
            this.f3989k = colorStateList;
            m112320J();
        }
    }

    /* renamed from: C */
    public void m112327C(int i) {
        if (this.f3986h != i) {
            this.f3986h = i;
            m112320J();
        }
    }

    /* renamed from: D */
    public void m112326D(ColorStateList colorStateList) {
        if (this.f3988j != colorStateList) {
            this.f3988j = colorStateList;
            if (m112313f() != null) {
                P61.m90837o(m112313f(), this.f3988j);
            }
        }
    }

    /* renamed from: E */
    public void m112325E(PorterDuff.Mode mode) {
        if (this.f3987i != mode) {
            this.f3987i = mode;
            if (m112313f() != null && this.f3987i != null) {
                P61.m90836p(m112313f(), this.f3987i);
            }
        }
    }

    /* renamed from: F */
    public void m112324F(boolean z) {
        this.f3996r = z;
    }

    /* renamed from: G */
    public final void m112323G(int i, int i2) {
        int m62538I = C38790bq6.m62538I(this.f3979a);
        int paddingTop = this.f3979a.getPaddingTop();
        int m62540H = C38790bq6.m62540H(this.f3979a);
        int paddingBottom = this.f3979a.getPaddingBottom();
        int i3 = this.f3983e;
        int i4 = this.f3984f;
        this.f3984f = i2;
        this.f3983e = i;
        if (!this.f3993o) {
            m112322H();
        }
        C38790bq6.m62529M0(this.f3979a, m62538I, (paddingTop + i) - i3, m62540H, (paddingBottom + i2) - i4);
    }

    /* renamed from: H */
    public final void m112322H() {
        this.f3979a.setInternalBackground(m112318a());
        PM2 m112313f = m112313f();
        if (m112313f != null) {
            m112313f.m90417Z(this.f3998t);
            m112313f.setState(this.f3979a.getDrawableState());
        }
    }

    /* renamed from: I */
    public final void m112321I(C43037iy5 c43037iy5) {
        if (f3978v && !this.f3993o) {
            int m62538I = C38790bq6.m62538I(this.f3979a);
            int paddingTop = this.f3979a.getPaddingTop();
            int m62540H = C38790bq6.m62540H(this.f3979a);
            int paddingBottom = this.f3979a.getPaddingBottom();
            m112322H();
            C38790bq6.m62529M0(this.f3979a, m62538I, paddingTop, m62540H, paddingBottom);
            return;
        }
        if (m112313f() != null) {
            m112313f().setShapeAppearanceModel(c43037iy5);
        }
        if (m112305n() != null) {
            m112305n().setShapeAppearanceModel(c43037iy5);
        }
        if (m112314e() != null) {
            m112314e().setShapeAppearanceModel(c43037iy5);
        }
    }

    /* renamed from: J */
    public final void m112320J() {
        int i;
        PM2 m112313f = m112313f();
        PM2 m112305n = m112305n();
        if (m112313f != null) {
            m112313f.m90398j0(this.f3986h, this.f3989k);
            if (m112305n != null) {
                float f = this.f3986h;
                if (this.f3992n) {
                    i = HM2.m103952d(this.f3979a, C49961uf4.colorSurface);
                } else {
                    i = 0;
                }
                m112305n.m90400i0(f, i);
            }
        }
    }

    /* renamed from: K */
    public final InsetDrawable m112319K(Drawable drawable) {
        return new InsetDrawable(drawable, this.f3981c, this.f3983e, this.f3982d, this.f3984f);
    }

    /* renamed from: a */
    public final Drawable m112318a() {
        int i;
        PM2 pm2 = new PM2(this.f3980b);
        pm2.m90427P(this.f3979a.getContext());
        P61.m90837o(pm2, this.f3988j);
        PorterDuff.Mode mode = this.f3987i;
        if (mode != null) {
            P61.m90836p(pm2, mode);
        }
        pm2.m90398j0(this.f3986h, this.f3989k);
        PM2 pm22 = new PM2(this.f3980b);
        pm22.setTint(0);
        float f = this.f3986h;
        if (this.f3992n) {
            i = HM2.m103952d(this.f3979a, C49961uf4.colorSurface);
        } else {
            i = 0;
        }
        pm22.m90400i0(f, i);
        if (f3977u) {
            PM2 pm23 = new PM2(this.f3980b);
            this.f3991m = pm23;
            P61.m90838n(pm23, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(C52886zb5.m1051d(this.f3990l), m112319K(new LayerDrawable(new Drawable[]{pm22, pm2})), this.f3991m);
            this.f3997s = rippleDrawable;
            return rippleDrawable;
        }
        C48736sb5 c48736sb5 = new C48736sb5(this.f3980b);
        this.f3991m = c48736sb5;
        P61.m90837o(c48736sb5, C52886zb5.m1051d(this.f3990l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{pm22, pm2, this.f3991m});
        this.f3997s = layerDrawable;
        return m112319K(layerDrawable);
    }

    /* renamed from: b */
    public int m112317b() {
        return this.f3985g;
    }

    /* renamed from: c */
    public int m112316c() {
        return this.f3984f;
    }

    /* renamed from: d */
    public int m112315d() {
        return this.f3983e;
    }

    /* renamed from: e */
    public InterfaceC32302Cy5 m112314e() {
        LayerDrawable layerDrawable = this.f3997s;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 1) {
            if (this.f3997s.getNumberOfLayers() > 2) {
                return (InterfaceC32302Cy5) this.f3997s.getDrawable(2);
            }
            return (InterfaceC32302Cy5) this.f3997s.getDrawable(1);
        }
        return null;
    }

    /* renamed from: f */
    public PM2 m112313f() {
        return m112312g(false);
    }

    /* renamed from: g */
    public final PM2 m112312g(boolean z) {
        LayerDrawable layerDrawable = this.f3997s;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 0) {
            if (f3977u) {
                return (PM2) ((LayerDrawable) ((InsetDrawable) this.f3997s.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
            }
            return (PM2) this.f3997s.getDrawable(!z ? 1 : 0);
        }
        return null;
    }

    /* renamed from: h */
    public ColorStateList m112311h() {
        return this.f3990l;
    }

    /* renamed from: i */
    public C43037iy5 m112310i() {
        return this.f3980b;
    }

    /* renamed from: j */
    public ColorStateList m112309j() {
        return this.f3989k;
    }

    /* renamed from: k */
    public int m112308k() {
        return this.f3986h;
    }

    /* renamed from: l */
    public ColorStateList m112307l() {
        return this.f3988j;
    }

    /* renamed from: m */
    public PorterDuff.Mode m112306m() {
        return this.f3987i;
    }

    /* renamed from: n */
    public final PM2 m112305n() {
        return m112312g(true);
    }

    /* renamed from: o */
    public boolean m112304o() {
        return this.f3993o;
    }

    /* renamed from: p */
    public boolean m112303p() {
        return this.f3995q;
    }

    /* renamed from: q */
    public boolean m112302q() {
        return this.f3996r;
    }

    /* renamed from: r */
    public void m112301r(TypedArray typedArray) {
        this.f3981c = typedArray.getDimensionPixelOffset(C37098Xl4.MaterialButton_android_insetLeft, 0);
        this.f3982d = typedArray.getDimensionPixelOffset(C37098Xl4.MaterialButton_android_insetRight, 0);
        this.f3983e = typedArray.getDimensionPixelOffset(C37098Xl4.MaterialButton_android_insetTop, 0);
        this.f3984f = typedArray.getDimensionPixelOffset(C37098Xl4.MaterialButton_android_insetBottom, 0);
        int i = C37098Xl4.MaterialButton_cornerRadius;
        if (typedArray.hasValue(i)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i, -1);
            this.f3985g = dimensionPixelSize;
            m112293z(this.f3980b.m31522w(dimensionPixelSize));
            this.f3994p = true;
        }
        this.f3986h = typedArray.getDimensionPixelSize(C37098Xl4.MaterialButton_strokeWidth, 0);
        this.f3987i = C36704Vt6.m79293o(typedArray.getInt(C37098Xl4.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f3988j = NM2.m94029b(this.f3979a.getContext(), typedArray, C37098Xl4.MaterialButton_backgroundTint);
        this.f3989k = NM2.m94029b(this.f3979a.getContext(), typedArray, C37098Xl4.MaterialButton_strokeColor);
        this.f3990l = NM2.m94029b(this.f3979a.getContext(), typedArray, C37098Xl4.MaterialButton_rippleColor);
        this.f3995q = typedArray.getBoolean(C37098Xl4.MaterialButton_android_checkable, false);
        this.f3998t = typedArray.getDimensionPixelSize(C37098Xl4.MaterialButton_elevation, 0);
        this.f3996r = typedArray.getBoolean(C37098Xl4.MaterialButton_toggleCheckedStateOnClick, true);
        int m62538I = C38790bq6.m62538I(this.f3979a);
        int paddingTop = this.f3979a.getPaddingTop();
        int m62540H = C38790bq6.m62540H(this.f3979a);
        int paddingBottom = this.f3979a.getPaddingBottom();
        if (typedArray.hasValue(C37098Xl4.MaterialButton_android_background)) {
            m112299t();
        } else {
            m112322H();
        }
        C38790bq6.m62529M0(this.f3979a, m62538I + this.f3981c, paddingTop + this.f3983e, m62540H + this.f3982d, paddingBottom + this.f3984f);
    }

    /* renamed from: s */
    public void m112300s(int i) {
        if (m112313f() != null) {
            m112313f().setTint(i);
        }
    }

    /* renamed from: t */
    public void m112299t() {
        this.f3993o = true;
        this.f3979a.setSupportBackgroundTintList(this.f3988j);
        this.f3979a.setSupportBackgroundTintMode(this.f3987i);
    }

    /* renamed from: u */
    public void m112298u(boolean z) {
        this.f3995q = z;
    }

    /* renamed from: v */
    public void m112297v(int i) {
        if (!this.f3994p || this.f3985g != i) {
            this.f3985g = i;
            this.f3994p = true;
            m112293z(this.f3980b.m31522w(i));
        }
    }

    /* renamed from: w */
    public void m112296w(int i) {
        m112323G(this.f3983e, i);
    }

    /* renamed from: x */
    public void m112295x(int i) {
        m112323G(i, this.f3984f);
    }

    /* renamed from: y */
    public void m112294y(ColorStateList colorStateList) {
        if (this.f3990l != colorStateList) {
            this.f3990l = colorStateList;
            boolean z = f3977u;
            if (z && (this.f3979a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f3979a.getBackground()).setColor(C52886zb5.m1051d(colorStateList));
            } else if (!z && (this.f3979a.getBackground() instanceof C48736sb5)) {
                ((C48736sb5) this.f3979a.getBackground()).setTintList(C52886zb5.m1051d(colorStateList));
            }
        }
    }

    /* renamed from: z */
    public void m112293z(C43037iy5 c43037iy5) {
        this.f3980b = c43037iy5;
        m112321I(c43037iy5);
    }
}

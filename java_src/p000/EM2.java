package p000;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import com.google.android.material.card.MaterialCardView;
import kotlin.KotlinVersion;
import p000.C43037iy5;
/* renamed from: EM2 */
/* loaded from: classes6.dex */
public class EM2 {

    /* renamed from: A */
    public static final Drawable f7319A;

    /* renamed from: z */
    public static final double f7320z = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a */
    public final MaterialCardView f7321a;

    /* renamed from: c */
    public final PM2 f7323c;

    /* renamed from: d */
    public final PM2 f7324d;

    /* renamed from: e */
    public int f7325e;

    /* renamed from: f */
    public int f7326f;

    /* renamed from: g */
    public int f7327g;

    /* renamed from: h */
    public int f7328h;

    /* renamed from: i */
    public Drawable f7329i;

    /* renamed from: j */
    public Drawable f7330j;

    /* renamed from: k */
    public ColorStateList f7331k;

    /* renamed from: l */
    public ColorStateList f7332l;

    /* renamed from: m */
    public C43037iy5 f7333m;

    /* renamed from: n */
    public ColorStateList f7334n;

    /* renamed from: o */
    public Drawable f7335o;

    /* renamed from: p */
    public LayerDrawable f7336p;

    /* renamed from: q */
    public PM2 f7337q;

    /* renamed from: r */
    public PM2 f7338r;

    /* renamed from: t */
    public boolean f7340t;

    /* renamed from: u */
    public ValueAnimator f7341u;

    /* renamed from: v */
    public final TimeInterpolator f7342v;

    /* renamed from: w */
    public final int f7343w;

    /* renamed from: x */
    public final int f7344x;

    /* renamed from: b */
    public final Rect f7322b = new Rect();

    /* renamed from: s */
    public boolean f7339s = false;

    /* renamed from: y */
    public float f7345y = 0.0f;

    /* renamed from: EM2$a */
    /* loaded from: classes6.dex */
    public class C1798a extends InsetDrawable {
        public C1798a(Drawable drawable, int i, int i2, int i3, int i4) {
            super(drawable, i, i2, i3, i4);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        ColorDrawable colorDrawable;
        if (Build.VERSION.SDK_INT <= 28) {
            colorDrawable = new ColorDrawable();
        } else {
            colorDrawable = null;
        }
        f7319A = colorDrawable;
    }

    public EM2(MaterialCardView materialCardView, AttributeSet attributeSet, int i, int i2) {
        this.f7321a = materialCardView;
        PM2 pm2 = new PM2(materialCardView.getContext(), attributeSet, i, i2);
        this.f7323c = pm2;
        pm2.m90427P(materialCardView.getContext());
        pm2.m90404g0(-12303292);
        C43037iy5.C24658b m31523v = pm2.m90438E().m31523v();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, C37098Xl4.CardView, i, C50021ul4.CardView);
        int i3 = C37098Xl4.CardView_cardCornerRadius;
        if (obtainStyledAttributes.hasValue(i3)) {
            m31523v.m31493o(obtainStyledAttributes.getDimension(i3, 0.0f));
        }
        this.f7324d = new PM2();
        m109152L(m31523v.m31495m());
        this.f7342v = C37997aW2.m71260g(materialCardView.getContext(), C49961uf4.motionEasingLinearInterpolator, C27325pf.f103879a);
        this.f7343w = C37997aW2.m71261f(materialCardView.getContext(), C49961uf4.motionDurationShort2, 300);
        this.f7344x = C37997aW2.m71261f(materialCardView.getContext(), C49961uf4.motionDurationShort1, 300);
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void m109119u(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f7330j.setAlpha((int) (255.0f * floatValue));
        this.f7345y = floatValue;
    }

    /* renamed from: A */
    public void m109163A(boolean z) {
        this.f7340t = z;
    }

    /* renamed from: B */
    public void m109162B(boolean z) {
        m109161C(z, false);
    }

    /* renamed from: C */
    public void m109161C(boolean z, boolean z2) {
        int i;
        float f;
        Drawable drawable = this.f7330j;
        if (drawable != null) {
            if (z2) {
                m109138b(z);
                return;
            }
            if (z) {
                i = KotlinVersion.MAX_COMPONENT_VALUE;
            } else {
                i = 0;
            }
            drawable.setAlpha(i);
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            this.f7345y = f;
        }
    }

    /* renamed from: D */
    public void m109160D(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = P61.m90834r(drawable).mutate();
            this.f7330j = mutate;
            P61.m90837o(mutate, this.f7332l);
            m109162B(this.f7321a.isChecked());
        } else {
            this.f7330j = f7319A;
        }
        LayerDrawable layerDrawable = this.f7336p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(C33795Ji4.mtrl_card_checked_layer_id, this.f7330j);
        }
    }

    /* renamed from: E */
    public void m109159E(int i) {
        this.f7327g = i;
        m109117w(this.f7321a.getMeasuredWidth(), this.f7321a.getMeasuredHeight());
    }

    /* renamed from: F */
    public void m109158F(int i) {
        this.f7325e = i;
    }

    /* renamed from: G */
    public void m109157G(int i) {
        this.f7326f = i;
    }

    /* renamed from: H */
    public void m109156H(ColorStateList colorStateList) {
        this.f7332l = colorStateList;
        Drawable drawable = this.f7330j;
        if (drawable != null) {
            P61.m90837o(drawable, colorStateList);
        }
    }

    /* renamed from: I */
    public void m109155I(float f) {
        m109152L(this.f7333m.m31522w(f));
        this.f7329i.invalidateSelf();
        if (m109147Q() || m109148P()) {
            m109145S();
        }
        if (m109147Q()) {
            m109142V();
        }
    }

    /* renamed from: J */
    public void m109154J(float f) {
        this.f7323c.m90414b0(f);
        PM2 pm2 = this.f7324d;
        if (pm2 != null) {
            pm2.m90414b0(f);
        }
        PM2 pm22 = this.f7338r;
        if (pm22 != null) {
            pm22.m90414b0(f);
        }
    }

    /* renamed from: K */
    public void m109153K(ColorStateList colorStateList) {
        this.f7331k = colorStateList;
        m109141W();
    }

    /* renamed from: L */
    public void m109152L(C43037iy5 c43037iy5) {
        this.f7333m = c43037iy5;
        this.f7323c.setShapeAppearanceModel(c43037iy5);
        PM2 pm2 = this.f7323c;
        pm2.m90406f0(!pm2.m90424S());
        PM2 pm22 = this.f7324d;
        if (pm22 != null) {
            pm22.setShapeAppearanceModel(c43037iy5);
        }
        PM2 pm23 = this.f7338r;
        if (pm23 != null) {
            pm23.setShapeAppearanceModel(c43037iy5);
        }
        PM2 pm24 = this.f7337q;
        if (pm24 != null) {
            pm24.setShapeAppearanceModel(c43037iy5);
        }
    }

    /* renamed from: M */
    public void m109151M(ColorStateList colorStateList) {
        if (this.f7334n == colorStateList) {
            return;
        }
        this.f7334n = colorStateList;
        m109140X();
    }

    /* renamed from: N */
    public void m109150N(int i) {
        if (i == this.f7328h) {
            return;
        }
        this.f7328h = i;
        m109140X();
    }

    /* renamed from: O */
    public void m109149O(int i, int i2, int i3, int i4) {
        this.f7322b.set(i, i2, i3, i4);
        m109145S();
    }

    /* renamed from: P */
    public final boolean m109148P() {
        return this.f7321a.m68892o() && !m109133g();
    }

    /* renamed from: Q */
    public final boolean m109147Q() {
        if (this.f7321a.m68892o() && m109133g() && this.f7321a.m68890q()) {
            return true;
        }
        return false;
    }

    /* renamed from: R */
    public void m109146R() {
        Drawable drawable;
        Drawable drawable2 = this.f7329i;
        if (this.f7321a.isClickable()) {
            drawable = m109126n();
        } else {
            drawable = this.f7324d;
        }
        this.f7329i = drawable;
        if (drawable2 != drawable) {
            m109143U(drawable);
        }
    }

    /* renamed from: S */
    public void m109145S() {
        boolean z;
        float f;
        if (!m109148P() && !m109147Q()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            f = m109137c();
        } else {
            f = 0.0f;
        }
        int m109125o = (int) (f - m109125o());
        MaterialCardView materialCardView = this.f7321a;
        Rect rect = this.f7322b;
        materialCardView.m49997x(rect.left + m109125o, rect.top + m109125o, rect.right + m109125o, rect.bottom + m109125o);
    }

    /* renamed from: T */
    public void m109144T() {
        this.f7323c.m90417Z(this.f7321a.m68898i());
    }

    /* renamed from: U */
    public final void m109143U(Drawable drawable) {
        if (this.f7321a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.f7321a.getForeground()).setDrawable(drawable);
        } else {
            this.f7321a.setForeground(m109124p(drawable));
        }
    }

    /* renamed from: V */
    public void m109142V() {
        if (!m109123q()) {
            this.f7321a.m49996y(m109124p(this.f7323c));
        }
        this.f7321a.setForeground(m109124p(this.f7329i));
    }

    /* renamed from: W */
    public final void m109141W() {
        Drawable drawable;
        if (C52886zb5.f121583a && (drawable = this.f7335o) != null) {
            ((RippleDrawable) drawable).setColor(this.f7331k);
            return;
        }
        PM2 pm2 = this.f7337q;
        if (pm2 != null) {
            pm2.m90416a0(this.f7331k);
        }
    }

    /* renamed from: X */
    public void m109140X() {
        this.f7324d.m90398j0(this.f7328h, this.f7334n);
    }

    /* renamed from: b */
    public void m109138b(boolean z) {
        float f;
        float f2;
        int i;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        if (z) {
            f2 = 1.0f - this.f7345y;
        } else {
            f2 = this.f7345y;
        }
        ValueAnimator valueAnimator = this.f7341u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f7341u = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f7345y, f);
        this.f7341u = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: DM2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                EM2.this.m109119u(valueAnimator2);
            }
        });
        this.f7341u.setInterpolator(this.f7342v);
        ValueAnimator valueAnimator2 = this.f7341u;
        if (z) {
            i = this.f7343w;
        } else {
            i = this.f7344x;
        }
        valueAnimator2.setDuration(i * f2);
        this.f7341u.start();
    }

    /* renamed from: c */
    public final float m109137c() {
        return Math.max(Math.max(m109136d(this.f7333m.m31528q(), this.f7323c.m90434I()), m109136d(this.f7333m.m31526s(), this.f7323c.m90433J())), Math.max(m109136d(this.f7333m.m31534k(), this.f7323c.m90383t()), m109136d(this.f7333m.m31536i(), this.f7323c.m90384s())));
    }

    /* renamed from: d */
    public final float m109136d(QC0 qc0, float f) {
        if (qc0 instanceof C39853dc5) {
            return (float) ((1.0d - f7320z) * f);
        }
        if (qc0 instanceof EF0) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: e */
    public final float m109135e() {
        float f;
        float m68893n = this.f7321a.m68893n();
        if (m109147Q()) {
            f = m109137c();
        } else {
            f = 0.0f;
        }
        return m68893n + f;
    }

    /* renamed from: f */
    public final float m109134f() {
        float f;
        float m68893n = this.f7321a.m68893n() * 1.5f;
        if (m109147Q()) {
            f = m109137c();
        } else {
            f = 0.0f;
        }
        return m68893n + f;
    }

    /* renamed from: g */
    public final boolean m109133g() {
        return this.f7323c.m90424S();
    }

    /* renamed from: h */
    public final Drawable m109132h() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        PM2 m109130j = m109130j();
        this.f7337q = m109130j;
        m109130j.m90416a0(this.f7331k);
        stateListDrawable.addState(new int[]{16842919}, this.f7337q);
        return stateListDrawable;
    }

    /* renamed from: i */
    public final Drawable m109131i() {
        if (C52886zb5.f121583a) {
            this.f7338r = m109130j();
            return new RippleDrawable(this.f7331k, null, this.f7338r);
        }
        return m109132h();
    }

    /* renamed from: j */
    public final PM2 m109130j() {
        return new PM2(this.f7333m);
    }

    /* renamed from: k */
    public void m109129k() {
        Drawable drawable = this.f7335o;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i = bounds.bottom;
            this.f7335o.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            this.f7335o.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    /* renamed from: l */
    public PM2 m109128l() {
        return this.f7323c;
    }

    /* renamed from: m */
    public int m109127m() {
        return this.f7327g;
    }

    /* renamed from: n */
    public final Drawable m109126n() {
        if (this.f7335o == null) {
            this.f7335o = m109131i();
        }
        if (this.f7336p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f7335o, this.f7324d, this.f7330j});
            this.f7336p = layerDrawable;
            layerDrawable.setId(2, C33795Ji4.mtrl_card_checked_layer_id);
        }
        return this.f7336p;
    }

    /* renamed from: o */
    public final float m109125o() {
        if (this.f7321a.m68892o() && this.f7321a.m68890q()) {
            return (float) ((1.0d - f7320z) * this.f7321a.m50000u());
        }
        return 0.0f;
    }

    /* renamed from: p */
    public final Drawable m109124p(Drawable drawable) {
        int i;
        int i2;
        if (this.f7321a.m68890q()) {
            i2 = (int) Math.ceil(m109134f());
            i = (int) Math.ceil(m109135e());
        } else {
            i = 0;
            i2 = 0;
        }
        return new C1798a(drawable, i, i2, i, i2);
    }

    /* renamed from: q */
    public boolean m109123q() {
        return this.f7339s;
    }

    /* renamed from: r */
    public boolean m109122r() {
        return this.f7340t;
    }

    /* renamed from: s */
    public final boolean m109121s() {
        return (this.f7327g & 80) == 80;
    }

    /* renamed from: t */
    public final boolean m109120t() {
        return (this.f7327g & 8388613) == 8388613;
    }

    /* renamed from: v */
    public void m109118v(TypedArray typedArray) {
        Drawable drawable;
        ColorStateList m94029b = NM2.m94029b(this.f7321a.getContext(), typedArray, C37098Xl4.MaterialCardView_strokeColor);
        this.f7334n = m94029b;
        if (m94029b == null) {
            this.f7334n = ColorStateList.valueOf(-1);
        }
        this.f7328h = typedArray.getDimensionPixelSize(C37098Xl4.MaterialCardView_strokeWidth, 0);
        boolean z = typedArray.getBoolean(C37098Xl4.MaterialCardView_android_checkable, false);
        this.f7340t = z;
        this.f7321a.setLongClickable(z);
        this.f7332l = NM2.m94029b(this.f7321a.getContext(), typedArray, C37098Xl4.MaterialCardView_checkedIconTint);
        m109160D(NM2.m94026e(this.f7321a.getContext(), typedArray, C37098Xl4.MaterialCardView_checkedIcon));
        m109157G(typedArray.getDimensionPixelSize(C37098Xl4.MaterialCardView_checkedIconSize, 0));
        m109158F(typedArray.getDimensionPixelSize(C37098Xl4.MaterialCardView_checkedIconMargin, 0));
        this.f7327g = typedArray.getInteger(C37098Xl4.MaterialCardView_checkedIconGravity, 8388661);
        ColorStateList m94029b2 = NM2.m94029b(this.f7321a.getContext(), typedArray, C37098Xl4.MaterialCardView_rippleColor);
        this.f7331k = m94029b2;
        if (m94029b2 == null) {
            this.f7331k = ColorStateList.valueOf(HM2.m103952d(this.f7321a, C49961uf4.colorControlHighlight));
        }
        m109114z(NM2.m94029b(this.f7321a.getContext(), typedArray, C37098Xl4.MaterialCardView_cardForegroundColor));
        m109141W();
        m109144T();
        m109140X();
        this.f7321a.m49996y(m109124p(this.f7323c));
        if (this.f7321a.isClickable()) {
            drawable = m109126n();
        } else {
            drawable = this.f7324d;
        }
        this.f7329i = drawable;
        this.f7321a.setForeground(m109124p(drawable));
    }

    /* renamed from: w */
    public void m109117w(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if (this.f7336p != null) {
            if (this.f7321a.m68890q()) {
                i3 = (int) Math.ceil(m109134f() * 2.0f);
                i4 = (int) Math.ceil(m109135e() * 2.0f);
            } else {
                i3 = 0;
                i4 = 0;
            }
            if (m109120t()) {
                i5 = ((i - this.f7325e) - this.f7326f) - i4;
            } else {
                i5 = this.f7325e;
            }
            if (m109121s()) {
                i6 = this.f7325e;
            } else {
                i6 = ((i2 - this.f7325e) - this.f7326f) - i3;
            }
            int i11 = i6;
            if (m109120t()) {
                i7 = this.f7325e;
            } else {
                i7 = ((i - this.f7325e) - this.f7326f) - i4;
            }
            if (m109121s()) {
                i8 = ((i2 - this.f7325e) - this.f7326f) - i3;
            } else {
                i8 = this.f7325e;
            }
            int i12 = i8;
            if (C38790bq6.m62548D(this.f7321a) == 1) {
                i10 = i7;
                i9 = i5;
            } else {
                i9 = i7;
                i10 = i5;
            }
            this.f7336p.setLayerInset(2, i10, i12, i9, i11);
        }
    }

    /* renamed from: x */
    public void m109116x(boolean z) {
        this.f7339s = z;
    }

    /* renamed from: y */
    public void m109115y(ColorStateList colorStateList) {
        this.f7323c.m90416a0(colorStateList);
    }

    /* renamed from: z */
    public void m109114z(ColorStateList colorStateList) {
        PM2 pm2 = this.f7324d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        pm2.m90416a0(colorStateList);
    }
}

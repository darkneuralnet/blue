package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
/* loaded from: classes6.dex */
public class MaterialCardView extends CardView implements Checkable, InterfaceC32302Cy5 {

    /* renamed from: o */
    public static final int[] f72474o = {16842911};

    /* renamed from: p */
    public static final int[] f72475p = {16842912};

    /* renamed from: q */
    public static final int[] f72476q = {C49961uf4.state_dragged};

    /* renamed from: r */
    public static final int f72477r = C50021ul4.Widget_MaterialComponents_CardView;

    /* renamed from: k */
    public final EM2 f72478k;

    /* renamed from: l */
    public boolean f72479l;

    /* renamed from: m */
    public boolean f72480m;

    /* renamed from: n */
    public boolean f72481n;

    /* renamed from: com.google.android.material.card.MaterialCardView$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC17725a {
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f72480m;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        QM2.m88638f(this, this.f72478k.m109128l());
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (m49999v()) {
            View.mergeDrawableStates(onCreateDrawableState, f72474o);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f72475p);
        }
        if (m49998w()) {
            View.mergeDrawableStates(onCreateDrawableState, f72476q);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(m49999v());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f72478k.m109117w(getMeasuredWidth(), getMeasuredHeight());
    }

    /* renamed from: s */
    public final void m50002s() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f72478k.m109129k();
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f72479l) {
            if (!this.f72478k.m109123q()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f72478k.m109116x(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        this.f72478k.m109115y(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.f72478k.m109144T();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.f72478k.m109114z(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.f72478k.m109163A(z);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f72480m != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f72478k.m109160D(drawable);
    }

    public void setCheckedIconGravity(int i) {
        if (this.f72478k.m109127m() != i) {
            this.f72478k.m109159E(i);
        }
    }

    public void setCheckedIconMargin(int i) {
        this.f72478k.m109158F(i);
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.f72478k.m109158F(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconResource(int i) {
        this.f72478k.m109160D(C29611vi.m8248b(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.f72478k.m109157G(i);
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.f72478k.m109157G(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f72478k.m109156H(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        EM2 em2 = this.f72478k;
        if (em2 != null) {
            em2.m109146R();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.f72478k.m109149O(i, i2, i3, i4);
    }

    public void setDragged(boolean z) {
        if (this.f72481n != z) {
            this.f72481n = z;
            refreshDrawableState();
            m50002s();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.f72478k.m109142V();
    }

    public void setOnCheckedChangeListener(InterfaceC17725a interfaceC17725a) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.f72478k.m109142V();
        this.f72478k.m109145S();
    }

    public void setProgress(float f) {
        this.f72478k.m109154J(f);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        this.f72478k.m109155I(f);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f72478k.m109153K(colorStateList);
    }

    public void setRippleColorResource(int i) {
        this.f72478k.m109153K(C29611vi.m8249a(getContext(), i));
    }

    @Override // p000.InterfaceC32302Cy5
    public void setShapeAppearanceModel(C43037iy5 c43037iy5) {
        setClipToOutline(c43037iy5.m31524u(m50001t()));
        this.f72478k.m109152L(c43037iy5);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(int i) {
        this.f72478k.m109150N(i);
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.f72478k.m109142V();
        this.f72478k.m109145S();
    }

    /* renamed from: t */
    public final RectF m50001t() {
        RectF rectF = new RectF();
        rectF.set(this.f72478k.m109128l().getBounds());
        return rectF;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (m49999v() && isEnabled()) {
            this.f72480m = !this.f72480m;
            refreshDrawableState();
            m50002s();
            this.f72478k.m109161C(this.f72480m, true);
        }
    }

    /* renamed from: u */
    public float m50000u() {
        return super.m68891p();
    }

    /* renamed from: v */
    public boolean m49999v() {
        EM2 em2 = this.f72478k;
        return em2 != null && em2.m109122r();
    }

    /* renamed from: w */
    public boolean m49998w() {
        return this.f72481n;
    }

    /* renamed from: x */
    public void m49997x(int i, int i2, int i3, int i4) {
        super.setContentPadding(i, i2, i3, i4);
    }

    /* renamed from: y */
    public void m49996y(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C49961uf4.materialCardViewStyle);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f72478k.m109115y(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f72478k.m109151M(colorStateList);
        invalidate();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        super(VM2.m79935c(context, attributeSet, i, r6), attributeSet, i);
        int i2 = f72477r;
        this.f72480m = false;
        this.f72481n = false;
        this.f72479l = true;
        TypedArray m21866i = C46052o36.m21866i(getContext(), attributeSet, C37098Xl4.MaterialCardView, i, i2, new int[0]);
        EM2 em2 = new EM2(this, attributeSet, i, i2);
        this.f72478k = em2;
        em2.m109115y(super.m68899h());
        em2.m109149O(super.m68896k(), super.m68894m(), super.m68895l(), super.m68897j());
        em2.m109118v(m21866i);
        m21866i.recycle();
    }
}

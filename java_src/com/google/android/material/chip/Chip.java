package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.material.chip.C17738a;
import com.google.android.material.chip.Chip;
import java.util.List;
import p000.C27125p2;
import p000.GM2;
/* loaded from: classes6.dex */
public class Chip extends AppCompatCheckBox implements C17738a.InterfaceC17739a, InterfaceC32302Cy5, GM2<Chip> {

    /* renamed from: f */
    public C17738a f72513f;

    /* renamed from: g */
    public InsetDrawable f72514g;

    /* renamed from: h */
    public RippleDrawable f72515h;

    /* renamed from: i */
    public View.OnClickListener f72516i;

    /* renamed from: j */
    public CompoundButton.OnCheckedChangeListener f72517j;

    /* renamed from: k */
    public GM2.InterfaceC2832a<Chip> f72518k;

    /* renamed from: l */
    public boolean f72519l;

    /* renamed from: m */
    public boolean f72520m;

    /* renamed from: n */
    public boolean f72521n;

    /* renamed from: o */
    public boolean f72522o;

    /* renamed from: p */
    public boolean f72523p;

    /* renamed from: q */
    public int f72524q;

    /* renamed from: r */
    public int f72525r;

    /* renamed from: s */
    public CharSequence f72526s;

    /* renamed from: t */
    public final C17732c f72527t;

    /* renamed from: u */
    public boolean f72528u;

    /* renamed from: v */
    public final Rect f72529v;

    /* renamed from: w */
    public final RectF f72530w;

    /* renamed from: x */
    public final P06 f72531x;

    /* renamed from: y */
    public static final int f72511y = C50021ul4.Widget_MaterialComponents_Chip_Action;

    /* renamed from: z */
    public static final Rect f72512z = new Rect();

    /* renamed from: A */
    public static final int[] f72509A = {16842913};

    /* renamed from: B */
    public static final int[] f72510B = {16842911};

    /* renamed from: com.google.android.material.chip.Chip$a */
    /* loaded from: classes6.dex */
    public class C17730a extends P06 {
        public C17730a() {
        }

        @Override // p000.P06
        /* renamed from: a */
        public void mo49941a(int i) {
        }

        @Override // p000.P06
        /* renamed from: b */
        public void mo49940b(Typeface typeface, boolean z) {
            CharSequence text;
            Chip chip = Chip.this;
            if (chip.f72513f.m49922C2()) {
                text = Chip.this.f72513f.m49875X0();
            } else {
                text = Chip.this.getText();
            }
            chip.setText(text);
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$b */
    /* loaded from: classes6.dex */
    public class C17731b extends ViewOutlineProvider {
        public C17731b() {
        }

        @Override // android.view.ViewOutlineProvider
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f72513f != null) {
                Chip.this.f72513f.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$c */
    /* loaded from: classes6.dex */
    public class C17732c extends AbstractC51766xi1 {
        public C17732c(Chip chip) {
            super(chip);
        }

        @Override // p000.AbstractC51766xi1
        /* renamed from: B */
        public void mo4857B(C27125p2 c27125p2) {
            c27125p2.m20084d0(Chip.this.m49942z());
            c27125p2.m20078g0(Chip.this.isClickable());
            c27125p2.m20080f0(Chip.this.getAccessibilityClassName());
            c27125p2.m20112N0(Chip.this.getText());
        }

        @Override // p000.AbstractC51766xi1
        /* renamed from: C */
        public void mo4856C(int i, C27125p2 c27125p2) {
            String str = "";
            if (i == 1) {
                CharSequence m49950r = Chip.this.m49950r();
                if (m49950r != null) {
                    c27125p2.m20072j0(m49950r);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i2 = C40534el4.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        str = text;
                    }
                    objArr[0] = str;
                    c27125p2.m20072j0(context.getString(i2, objArr).trim());
                }
                c27125p2.m20090a0(Chip.this.m49948t());
                c27125p2.m20089b(C27125p2.C27126a.f102997i);
                c27125p2.m20064n0(Chip.this.isEnabled());
                return;
            }
            c27125p2.m20072j0("");
            c27125p2.m20090a0(Chip.f72512z);
        }

        @Override // p000.AbstractC51766xi1
        /* renamed from: D */
        public void mo4855D(int i, boolean z) {
            if (i == 1) {
                Chip.this.f72522o = z;
                Chip.this.refreshDrawableState();
            }
        }

        @Override // p000.AbstractC51766xi1
        /* renamed from: o */
        public int mo4833o(float f, float f2) {
            return (Chip.this.m49946v() && Chip.this.m49949s().contains(f, f2)) ? 1 : 0;
        }

        @Override // p000.AbstractC51766xi1
        /* renamed from: p */
        public void mo4832p(List<Integer> list) {
            list.add(0);
            if (Chip.this.m49946v() && Chip.this.m49978A() && Chip.this.f72516i != null) {
                list.add(1);
            }
        }

        @Override // p000.AbstractC51766xi1
        /* renamed from: y */
        public boolean mo4823y(int i, int i2, Bundle bundle) {
            if (i2 == 16) {
                if (i == 0) {
                    return Chip.this.performClick();
                }
                if (i == 1) {
                    return Chip.this.m49976C();
                }
                return false;
            }
            return false;
        }
    }

    public Chip(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void m49977B(CompoundButton compoundButton, boolean z) {
        GM2.InterfaceC2832a<Chip> interfaceC2832a = this.f72518k;
        if (interfaceC2832a != null) {
            interfaceC2832a.mo18934a(this, z);
        }
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f72517j;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z);
        }
    }

    /* renamed from: A */
    public boolean m49978A() {
        C17738a c17738a = this.f72513f;
        return c17738a != null && c17738a.m49856g1();
    }

    /* renamed from: C */
    public boolean m49976C() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f72516i;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        if (this.f72528u) {
            this.f72527t.m4849J(1, 1);
        }
        return z;
    }

    /* renamed from: D */
    public final void m49975D() {
        if (this.f72514g != null) {
            this.f72514g = null;
            setMinWidth(0);
            setMinHeight((int) m49951q());
            m49969J();
        }
    }

    /* renamed from: E */
    public final void m49974E(boolean z) {
        if (this.f72521n != z) {
            this.f72521n = z;
            refreshDrawableState();
        }
    }

    /* renamed from: F */
    public final void m49973F(boolean z) {
        if (this.f72520m != z) {
            this.f72520m = z;
            refreshDrawableState();
        }
    }

    /* renamed from: G */
    public boolean m49972G() {
        return this.f72523p;
    }

    /* renamed from: H */
    public final void m49971H(C17738a c17738a) {
        if (c17738a != null) {
            c17738a.m49857f2(null);
        }
    }

    /* renamed from: I */
    public final void m49970I() {
        if (m49946v() && m49978A() && this.f72516i != null) {
            C38790bq6.m62452v0(this, this.f72527t);
            this.f72528u = true;
            return;
        }
        C38790bq6.m62452v0(this, null);
        this.f72528u = false;
    }

    /* renamed from: J */
    public final void m49969J() {
        if (C52886zb5.f121583a) {
            m49968K();
            return;
        }
        this.f72513f.m49925B2(true);
        C38790bq6.m62553A0(this, m49952p());
        m49967L();
        m49953o();
    }

    /* renamed from: K */
    public final void m49968K() {
        this.f72515h = new RippleDrawable(C52886zb5.m1051d(this.f72513f.m49877W0()), m49952p(), null);
        this.f72513f.m49925B2(false);
        C38790bq6.m62553A0(this, this.f72515h);
        m49967L();
    }

    /* renamed from: L */
    public final void m49967L() {
        C17738a c17738a;
        if (!TextUtils.isEmpty(getText()) && (c17738a = this.f72513f) != null) {
            int m49899L0 = (int) (c17738a.m49899L0() + this.f72513f.m49871Z0() + this.f72513f.m49820v0());
            int m49893O0 = (int) (this.f72513f.m49893O0() + this.f72513f.m49868a1() + this.f72513f.m49832r0());
            if (this.f72514g != null) {
                Rect rect = new Rect();
                this.f72514g.getPadding(rect);
                m49893O0 += rect.left;
                m49899L0 += rect.right;
            }
            C38790bq6.m62529M0(this, m49893O0, getPaddingTop(), m49899L0, getPaddingBottom());
        }
    }

    /* renamed from: M */
    public final void m49966M() {
        TextPaint paint = getPaint();
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            paint.drawableState = c17738a.getState();
        }
        N06 m49947u = m49947u();
        if (m49947u != null) {
            m49947u.m94476n(getContext(), paint, this.f72531x);
        }
    }

    /* renamed from: N */
    public final void m49965N(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                        if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                Log.w("Chip", "Chip text must be vertically center and start aligned");
                                return;
                            }
                            return;
                        }
                        throw new UnsupportedOperationException("Chip does not support multi-line text");
                    }
                    throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                }
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
    }

    @Override // com.google.android.material.chip.C17738a.InterfaceC17739a
    /* renamed from: a */
    public void mo49805a() {
        m49954n(this.f72525r);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.f72528u) {
            return super.dispatchHoverEvent(motionEvent);
        }
        if (!this.f72527t.m4839i(motionEvent) && !super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f72528u) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (this.f72527t.m4838j(keyEvent) && this.f72527t.m4834n() != Integer.MIN_VALUE) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        boolean z;
        super.drawableStateChanged();
        C17738a c17738a = this.f72513f;
        if (c17738a != null && c17738a.m49858f1()) {
            z = this.f72513f.m49865b2(m49955m());
        } else {
            z = false;
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f72526s)) {
            return this.f72526s;
        }
        if (m49942z()) {
            ViewParent parent = getParent();
            if (!(parent instanceof ChipGroup) || !((ChipGroup) parent).m49933n()) {
                return "android.widget.Button";
            }
            return "android.widget.RadioButton";
        } else if (isClickable()) {
            return "android.widget.Button";
        } else {
            return "android.view.View";
        }
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            return c17738a.m49879V0();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.f72528u && (this.f72527t.m4834n() == 1 || this.f72527t.m4837k() == 1)) {
            rect.set(m49948t());
        } else {
            super.getFocusedRect(rect);
        }
    }

    /* renamed from: l */
    public final void m49956l(C17738a c17738a) {
        c17738a.m49857f2(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    /* renamed from: m */
    public final int[] m49955m() {
        ?? isEnabled = isEnabled();
        int i = isEnabled;
        if (this.f72522o) {
            i = isEnabled + 1;
        }
        int i2 = i;
        if (this.f72521n) {
            i2 = i + 1;
        }
        int i3 = i2;
        if (this.f72520m) {
            i3 = i2 + 1;
        }
        int i4 = i3;
        if (isChecked()) {
            i4 = i3 + 1;
        }
        int[] iArr = new int[i4];
        int i5 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i5 = 1;
        }
        if (this.f72522o) {
            iArr[i5] = 16842908;
            i5++;
        }
        if (this.f72521n) {
            iArr[i5] = 16843623;
            i5++;
        }
        if (this.f72520m) {
            iArr[i5] = 16842919;
            i5++;
        }
        if (isChecked()) {
            iArr[i5] = 16842913;
        }
        return iArr;
    }

    /* renamed from: n */
    public boolean m49954n(int i) {
        int i2;
        this.f72525r = i;
        int i3 = 0;
        if (!m49972G()) {
            if (this.f72514g != null) {
                m49975D();
            } else {
                m49969J();
            }
            return false;
        }
        int max = Math.max(0, i - this.f72513f.getIntrinsicHeight());
        int max2 = Math.max(0, i - this.f72513f.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.f72514g != null) {
                m49975D();
            } else {
                m49969J();
            }
            return false;
        }
        if (max2 > 0) {
            i2 = max2 / 2;
        } else {
            i2 = 0;
        }
        if (max > 0) {
            i3 = max / 2;
        }
        if (this.f72514g != null) {
            Rect rect = new Rect();
            this.f72514g.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                m49969J();
                return true;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        m49943y(i2, i3, i2, i3);
        m49969J();
        return true;
    }

    /* renamed from: o */
    public final void m49953o() {
        if (m49952p() == this.f72514g && this.f72513f.getCallback() == null) {
            this.f72513f.setCallback(this.f72514g);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        QM2.m88638f(this, this.f72513f);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f72509A);
        }
        if (m49942z()) {
            View.mergeDrawableStates(onCreateDrawableState, f72510B);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f72528u) {
            this.f72527t.m4824x(z, i, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                m49974E(false);
            }
        } else {
            m49974E(m49949s().contains(motionEvent.getX(), motionEvent.getY()));
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(m49942z());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            C27125p2 m20096V0 = C27125p2.m20096V0(accessibilityNodeInfo);
            if (chipGroup.mo49409d()) {
                i = chipGroup.m49936k(this);
            } else {
                i = -1;
            }
            m20096V0.m20074i0(C27125p2.C27128c.m20033a(chipGroup.m49410c(this), 1, i, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (m49949s().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f72524q != i) {
            this.f72524q = i;
            m49967L();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 != 3) goto L18;
     */
    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = m49949s().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f72520m) {
                        if (!contains) {
                            m49973F(false);
                        }
                        z = true;
                    }
                }
                z = false;
            } else if (this.f72520m) {
                m49976C();
                z = true;
                m49973F(false);
            }
            z = false;
            m49973F(false);
        } else {
            if (contains) {
                m49973F(true);
                z = true;
            }
            z = false;
        }
        if (z || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public Drawable m49952p() {
        InsetDrawable insetDrawable = this.f72514g;
        if (insetDrawable == null) {
            return this.f72513f;
        }
        return insetDrawable;
    }

    /* renamed from: q */
    public float m49951q() {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            return c17738a.m49895N0();
        }
        return 0.0f;
    }

    /* renamed from: r */
    public CharSequence m49950r() {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            return c17738a.m49889Q0();
        }
        return null;
    }

    /* renamed from: s */
    public final RectF m49949s() {
        this.f72530w.setEmpty();
        if (m49946v() && this.f72516i != null) {
            this.f72513f.m49885S0(this.f72530w);
        }
        return this.f72530w;
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f72526s = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != m49952p() && drawable != this.f72515h) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != m49952p() && drawable != this.f72515h) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49842n1(z);
        }
    }

    public void setCheckableResource(int i) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49840o1(i);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        C17738a c17738a = this.f72513f;
        if (c17738a == null) {
            this.f72519l = z;
        } else if (c17738a.m49860e1()) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49837p1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49834q1(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49831r1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49828s1(i);
        }
    }

    public void setCheckedIconVisible(int i) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49825t1(i);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49819v1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49816w1(i);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49813x1(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49810y1(i);
        }
    }

    public void setChipDrawable(C17738a c17738a) {
        C17738a c17738a2 = this.f72513f;
        if (c17738a2 != c17738a) {
            m49971H(c17738a2);
            this.f72513f = c17738a;
            c17738a.m49833q2(false);
            m49956l(this.f72513f);
            m49954n(this.f72525r);
        }
    }

    public void setChipEndPadding(float f) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49807z1(f);
        }
    }

    public void setChipEndPaddingResource(int i) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49929A1(i);
        }
    }

    public void setChipIcon(Drawable drawable) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49926B1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49923C1(i);
        }
    }

    public void setChipIconSize(float f) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49920D1(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49917E1(i);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49914F1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49911G1(i);
        }
    }

    public void setChipIconVisible(int i) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49908H1(i);
        }
    }

    public void setChipMinHeight(float f) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49902J1(f);
        }
    }

    public void setChipMinHeightResource(int i) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49900K1(i);
        }
    }

    public void setChipStartPadding(float f) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49898L1(f);
        }
    }

    public void setChipStartPaddingResource(int i) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49896M1(i);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49894N1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49892O1(i);
        }
    }

    public void setChipStrokeWidth(float f) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49890P1(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49888Q1(i);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49884S1(drawable);
        }
        m49970I();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49882T1(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49880U1(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49878V1(i);
        }
    }

    public void setCloseIconResource(int i) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49876W1(i);
        }
        m49970I();
    }

    public void setCloseIconSize(float f) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49874X1(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49872Y1(i);
        }
    }

    public void setCloseIconStartPadding(float f) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49870Z1(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49867a2(i);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49863c2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49861d2(i);
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m90417Z(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f72513f == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            C17738a c17738a = this.f72513f;
            if (c17738a != null) {
                c17738a.m49855g2(truncateAt);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f72523p = z;
        m49954n(this.f72525r);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(YV2 yv2) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49853h2(yv2);
        }
    }

    public void setHideMotionSpecResource(int i) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49851i2(i);
        }
    }

    public void setIconEndPadding(float f) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49849j2(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49847k2(i);
        }
    }

    public void setIconStartPadding(float f) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49845l2(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49843m2(i);
        }
    }

    @Override // p000.GM2
    public void setInternalOnCheckedChangeListener(GM2.InterfaceC2832a<Chip> interfaceC2832a) {
        this.f72518k = interfaceC2832a;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f72513f == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49841n2(i);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f72517j = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f72516i = onClickListener;
        m49970I();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49839o2(colorStateList);
        }
        if (!this.f72513f.m49864c1()) {
            m49968K();
        }
    }

    public void setRippleColorResource(int i) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49836p2(i);
            if (!this.f72513f.m49864c1()) {
                m49968K();
            }
        }
    }

    @Override // p000.InterfaceC32302Cy5
    public void setShapeAppearanceModel(C43037iy5 c43037iy5) {
        this.f72513f.setShapeAppearanceModel(c43037iy5);
    }

    public void setShowMotionSpec(YV2 yv2) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49830r2(yv2);
        }
    }

    public void setShowMotionSpecResource(int i) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49827s2(i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        C17738a c17738a = this.f72513f;
        if (c17738a == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (c17738a.m49922C2()) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        super.setText(charSequence2, bufferType);
        C17738a c17738a2 = this.f72513f;
        if (c17738a2 != null) {
            c17738a2.m49824t2(charSequence);
        }
    }

    public void setTextAppearance(N06 n06) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49821u2(n06);
        }
        m49966M();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49815w2(f);
        }
    }

    public void setTextEndPaddingResource(int i) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49812x2(i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49809y2(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics()));
        }
        m49966M();
    }

    public void setTextStartPadding(float f) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49806z2(f);
        }
    }

    public void setTextStartPaddingResource(int i) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49928A2(i);
        }
    }

    /* renamed from: t */
    public final Rect m49948t() {
        RectF m49949s = m49949s();
        this.f72529v.set((int) m49949s.left, (int) m49949s.top, (int) m49949s.right, (int) m49949s.bottom);
        return this.f72529v;
    }

    /* renamed from: u */
    public final N06 m49947u() {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            return c17738a.m49873Y0();
        }
        return null;
    }

    /* renamed from: v */
    public final boolean m49946v() {
        C17738a c17738a = this.f72513f;
        return (c17738a == null || c17738a.m49891P0() == null) ? false : true;
    }

    /* renamed from: w */
    public final void m49945w(Context context, AttributeSet attributeSet, int i) {
        TypedArray m21866i = C46052o36.m21866i(context, attributeSet, C37098Xl4.Chip, i, f72511y, new int[0]);
        this.f72523p = m21866i.getBoolean(C37098Xl4.Chip_ensureMinTouchTargetSize, false);
        this.f72525r = (int) Math.ceil(m21866i.getDimension(C37098Xl4.Chip_chipMinTouchTargetSize, (float) Math.ceil(C36704Vt6.m79303e(getContext(), 48))));
        m21866i.recycle();
    }

    /* renamed from: x */
    public final void m49944x() {
        setOutlineProvider(new C17731b());
    }

    /* renamed from: y */
    public final void m49943y(int i, int i2, int i3, int i4) {
        this.f72514g = new InsetDrawable((Drawable) this.f72513f, i, i2, i3, i4);
    }

    /* renamed from: z */
    public boolean m49942z() {
        C17738a c17738a = this.f72513f;
        return c17738a != null && c17738a.m49860e1();
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C49961uf4.chipStyle);
    }

    public void setCloseIconVisible(boolean z) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49859e2(z);
        }
        m49970I();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Chip(Context context, AttributeSet attributeSet, int i) {
        super(VM2.m79935c(context, attributeSet, i, r4), attributeSet, i);
        int i2 = f72511y;
        this.f72529v = new Rect();
        this.f72530w = new RectF();
        this.f72531x = new C17730a();
        Context context2 = getContext();
        m49965N(attributeSet);
        C17738a m49930A0 = C17738a.m49930A0(context2, attributeSet, i, i2);
        m49945w(context2, attributeSet, i);
        setChipDrawable(m49930A0);
        m49930A0.m90417Z(C38790bq6.m62447y(this));
        TypedArray m21866i = C46052o36.m21866i(context2, attributeSet, C37098Xl4.Chip, i, i2, new int[0]);
        boolean hasValue = m21866i.hasValue(C37098Xl4.Chip_shapeAppearance);
        m21866i.recycle();
        this.f72527t = new C17732c(this);
        m49970I();
        if (!hasValue) {
            m49944x();
        }
        setChecked(this.f72519l);
        setText(m49930A0.m49875X0());
        setEllipsize(m49930A0.m49879V0());
        m49966M();
        if (!this.f72513f.m49922C2()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m49967L();
        if (m49972G()) {
            setMinHeight(this.f72525r);
        }
        this.f72524q = C38790bq6.m62548D(this);
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: Ni0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Chip.this.m49977B(compoundButton, z);
            }
        });
    }

    public void setCheckedIconVisible(boolean z) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49822u1(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49905I1(z);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49818v2(i);
        }
        m49966M();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C17738a c17738a = this.f72513f;
        if (c17738a != null) {
            c17738a.m49818v2(i);
        }
        m49966M();
    }
}

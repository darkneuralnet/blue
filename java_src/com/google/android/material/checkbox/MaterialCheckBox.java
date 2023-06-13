package com.google.android.material.checkbox;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* loaded from: classes6.dex */
public class MaterialCheckBox extends AppCompatCheckBox {

    /* renamed from: B */
    public static final int[] f72483B;

    /* renamed from: C */
    public static final int[][] f72484C;
    @SuppressLint({"DiscouragedApi"})

    /* renamed from: D */
    public static final int f72485D;

    /* renamed from: f */
    public final LinkedHashSet<InterfaceC17729c> f72487f;

    /* renamed from: g */
    public final LinkedHashSet<InterfaceC17728b> f72488g;

    /* renamed from: h */
    public ColorStateList f72489h;

    /* renamed from: i */
    public boolean f72490i;

    /* renamed from: j */
    public boolean f72491j;

    /* renamed from: k */
    public boolean f72492k;

    /* renamed from: l */
    public CharSequence f72493l;

    /* renamed from: m */
    public Drawable f72494m;

    /* renamed from: n */
    public Drawable f72495n;

    /* renamed from: o */
    public boolean f72496o;

    /* renamed from: p */
    public ColorStateList f72497p;

    /* renamed from: q */
    public ColorStateList f72498q;

    /* renamed from: r */
    public PorterDuff.Mode f72499r;

    /* renamed from: s */
    public int f72500s;

    /* renamed from: t */
    public int[] f72501t;

    /* renamed from: u */
    public boolean f72502u;

    /* renamed from: v */
    public CharSequence f72503v;

    /* renamed from: w */
    public CompoundButton.OnCheckedChangeListener f72504w;

    /* renamed from: x */
    public final C7220Re f72505x;

    /* renamed from: y */
    public final AbstractC27016oe f72506y;

    /* renamed from: z */
    public static final int f72486z = C50021ul4.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: A */
    public static final int[] f72482A = {C49961uf4.state_indeterminate};

    /* loaded from: classes6.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C17726a();

        /* renamed from: b */
        public int f72507b;

        /* renamed from: com.google.android.material.checkbox.MaterialCheckBox$SavedState$a */
        /* loaded from: classes6.dex */
        public class C17726a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, C17727a c17727a) {
            this(parcel);
        }

        /* renamed from: a */
        public final String m49983a() {
            int i = this.f72507b;
            return i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked";
        }

        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + m49983a() + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.f72507b));
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f72507b = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    /* renamed from: com.google.android.material.checkbox.MaterialCheckBox$a */
    /* loaded from: classes6.dex */
    public class C17727a extends AbstractC27016oe {
        public C17727a() {
        }

        @Override // p000.AbstractC27016oe
        public void onAnimationEnd(Drawable drawable) {
            super.onAnimationEnd(drawable);
            ColorStateList colorStateList = MaterialCheckBox.this.f72497p;
            if (colorStateList != null) {
                P61.m90837o(drawable, colorStateList);
            }
        }

        @Override // p000.AbstractC27016oe
        public void onAnimationStart(Drawable drawable) {
            super.onAnimationStart(drawable);
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.f72497p;
            if (colorStateList != null) {
                P61.m90838n(drawable, colorStateList.getColorForState(materialCheckBox.f72501t, MaterialCheckBox.this.f72497p.getDefaultColor()));
            }
        }
    }

    /* renamed from: com.google.android.material.checkbox.MaterialCheckBox$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC17728b {
        /* renamed from: a */
        void m49980a(MaterialCheckBox materialCheckBox, int i);
    }

    /* renamed from: com.google.android.material.checkbox.MaterialCheckBox$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC17729c {
        /* renamed from: a */
        void m49979a(MaterialCheckBox materialCheckBox, boolean z);
    }

    static {
        int i = C49961uf4.state_error;
        f72483B = new int[]{i};
        f72484C = new int[][]{new int[]{16842910, i}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
        f72485D = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public MaterialCheckBox(Context context) {
        this(context, null);
    }

    /* renamed from: e */
    public final String m49994e() {
        int i = this.f72500s;
        if (i == 1) {
            return getResources().getString(C40534el4.mtrl_checkbox_state_description_checked);
        }
        if (i == 0) {
            return getResources().getString(C40534el4.mtrl_checkbox_state_description_unchecked);
        }
        return getResources().getString(C40534el4.mtrl_checkbox_state_description_indeterminate);
    }

    /* renamed from: f */
    public int m49993f() {
        return this.f72500s;
    }

    /* renamed from: g */
    public final ColorStateList m49992g() {
        if (this.f72489h == null) {
            int[][] iArr = f72484C;
            int[] iArr2 = new int[iArr.length];
            int m103952d = HM2.m103952d(this, C49961uf4.colorControlActivated);
            int m103952d2 = HM2.m103952d(this, C49961uf4.colorError);
            int m103952d3 = HM2.m103952d(this, C49961uf4.colorSurface);
            int m103952d4 = HM2.m103952d(this, C49961uf4.colorOnSurface);
            iArr2[0] = HM2.m103947i(m103952d3, m103952d2, 1.0f);
            iArr2[1] = HM2.m103947i(m103952d3, m103952d, 1.0f);
            iArr2[2] = HM2.m103947i(m103952d3, m103952d4, 0.54f);
            iArr2[3] = HM2.m103947i(m103952d3, m103952d4, 0.38f);
            iArr2[4] = HM2.m103947i(m103952d3, m103952d4, 0.38f);
            this.f72489h = new ColorStateList(iArr, iArr2);
        }
        return this.f72489h;
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f72494m;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f72497p;
    }

    /* renamed from: h */
    public final ColorStateList m49991h() {
        ColorStateList colorStateList = this.f72497p;
        if (colorStateList != null) {
            return colorStateList;
        }
        if (super.getButtonTintList() != null) {
            return super.getButtonTintList();
        }
        return mo69955b();
    }

    /* renamed from: i */
    public final boolean m49990i(Z46 z46) {
        int m73755n = z46.m73755n(C37098Xl4.MaterialCheckBox_android_button, 0);
        int m73755n2 = z46.m73755n(C37098Xl4.MaterialCheckBox_buttonCompat, 0);
        if (m73755n != f72485D || m73755n2 != 0) {
            return false;
        }
        return true;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.f72500s == 1;
    }

    /* renamed from: j */
    public boolean m49989j() {
        return this.f72492k;
    }

    /* renamed from: k */
    public final void m49988k() {
        this.f72494m = C40750f71.m42016c(this.f72494m, this.f72497p, C48921su0.m13544c(this));
        this.f72495n = C40750f71.m42016c(this.f72495n, this.f72498q, this.f72499r);
        m49986m();
        m49985n();
        super.setButtonDrawable(C40750f71.m42018a(this.f72494m, this.f72495n));
        refreshDrawableState();
    }

    /* renamed from: l */
    public final void m49987l() {
        if (Build.VERSION.SDK_INT >= 30 && this.f72503v == null) {
            super.setStateDescription(m49994e());
        }
    }

    /* renamed from: m */
    public final void m49986m() {
        C7220Re c7220Re;
        if (!this.f72496o) {
            return;
        }
        C7220Re c7220Re2 = this.f72505x;
        if (c7220Re2 != null) {
            c7220Re2.m86511g(this.f72506y);
            this.f72505x.m86516b(this.f72506y);
        }
        Drawable drawable = this.f72494m;
        if ((drawable instanceof AnimatedStateListDrawable) && (c7220Re = this.f72505x) != null) {
            int i = C33795Ji4.checked;
            int i2 = C33795Ji4.unchecked;
            ((AnimatedStateListDrawable) drawable).addTransition(i, i2, c7220Re, false);
            ((AnimatedStateListDrawable) this.f72494m).addTransition(C33795Ji4.indeterminate, i2, this.f72505x, false);
        }
    }

    /* renamed from: n */
    public final void m49985n() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f72494m;
        if (drawable != null && (colorStateList2 = this.f72497p) != null) {
            P61.m90837o(drawable, colorStateList2);
        }
        Drawable drawable2 = this.f72495n;
        if (drawable2 != null && (colorStateList = this.f72498q) != null) {
            P61.m90837o(drawable2, colorStateList);
        }
    }

    /* renamed from: o */
    public final void m49984o() {
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f72490i && this.f72497p == null && this.f72498q == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (m49993f() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f72482A);
        }
        if (m49989j()) {
            View.mergeDrawableStates(onCreateDrawableState, f72483B);
        }
        this.f72501t = C40750f71.m42014e(onCreateDrawableState);
        m49984o();
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable m13546a;
        int i;
        if (this.f72491j && TextUtils.isEmpty(getText()) && (m13546a = C48921su0.m13546a(this)) != null) {
            if (C36704Vt6.m79294n(this)) {
                i = -1;
            } else {
                i = 1;
            }
            int width = ((getWidth() - m13546a.getIntrinsicWidth()) / 2) * i;
            int save = canvas.save();
            canvas.translate(width, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() != null) {
                Rect bounds = m13546a.getBounds();
                P61.m90840l(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && m49989j()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f72493l));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.f72507b);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f72507b = m49993f();
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C29611vi.m8248b(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f72495n = drawable;
        m49988k();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(C29611vi.m8248b(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f72498q == colorStateList) {
            return;
        }
        this.f72498q = colorStateList;
        m49988k();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f72499r == mode) {
            return;
        }
        this.f72499r = mode;
        m49988k();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f72497p == colorStateList) {
            return;
        }
        this.f72497p = colorStateList;
        m49988k();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        m49988k();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.f72491j = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        boolean z;
        AutofillManager m20824a;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f72500s != i) {
            this.f72500s = i;
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            super.setChecked(z);
            refreshDrawableState();
            m49987l();
            if (this.f72502u) {
                return;
            }
            this.f72502u = true;
            LinkedHashSet<InterfaceC17728b> linkedHashSet = this.f72488g;
            if (linkedHashSet != null) {
                Iterator<InterfaceC17728b> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().m49980a(this, this.f72500s);
                }
            }
            if (this.f72500s != 2 && (onCheckedChangeListener = this.f72504w) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (m20824a = C27010ob.m20824a(getContext().getSystemService(AutofillManager.class))) != null) {
                m20824a.notifyValueChanged(this);
            }
            this.f72502u = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        m49984o();
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f72493l = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.f72492k == z) {
            return;
        }
        this.f72492k = z;
        refreshDrawableState();
        Iterator<InterfaceC17729c> it = this.f72487f.iterator();
        while (it.hasNext()) {
            it.next().m49979a(this, this.f72492k);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f72504w = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f72503v = charSequence;
        if (charSequence == null) {
            m49987l();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f72490i = z;
        if (z) {
            C48921su0.m13543d(this, m49992g());
        } else {
            C48921su0.m13543d(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C49961uf4.checkboxStyle);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f72494m = drawable;
        this.f72496o = false;
        m49988k();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(VM2.m79935c(context, attributeSet, i, r4), attributeSet, i);
        int i2 = f72486z;
        this.f72487f = new LinkedHashSet<>();
        this.f72488g = new LinkedHashSet<>();
        this.f72505x = C7220Re.m86517a(getContext(), C52935zg4.mtrl_checkbox_button_checked_unchecked);
        this.f72506y = new C17727a();
        Context context2 = getContext();
        this.f72494m = C48921su0.m13546a(this);
        this.f72497p = m49991h();
        setSupportButtonTintList(null);
        Z46 m21865j = C46052o36.m21865j(context2, attributeSet, C37098Xl4.MaterialCheckBox, i, i2, new int[0]);
        this.f72495n = m21865j.m73762g(C37098Xl4.MaterialCheckBox_buttonIcon);
        if (this.f72494m != null && C46052o36.m21868g(context2) && m49990i(m21865j)) {
            super.setButtonDrawable((Drawable) null);
            this.f72494m = C29611vi.m8248b(context2, C52935zg4.mtrl_checkbox_button);
            this.f72496o = true;
            if (this.f72495n == null) {
                this.f72495n = C29611vi.m8248b(context2, C52935zg4.mtrl_checkbox_button_icon);
            }
        }
        this.f72498q = NM2.m94030a(context2, m21865j, C37098Xl4.MaterialCheckBox_buttonIconTint);
        this.f72499r = C36704Vt6.m79293o(m21865j.m73758k(C37098Xl4.MaterialCheckBox_buttonIconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f72490i = m21865j.m73768a(C37098Xl4.MaterialCheckBox_useMaterialThemeColors, false);
        this.f72491j = m21865j.m73768a(C37098Xl4.MaterialCheckBox_centerIfNoTextEnabled, true);
        this.f72492k = m21865j.m73768a(C37098Xl4.MaterialCheckBox_errorShown, false);
        this.f72493l = m21865j.m73753p(C37098Xl4.MaterialCheckBox_errorAccessibilityLabel);
        int i3 = C37098Xl4.MaterialCheckBox_checkedState;
        if (m21865j.m73750s(i3)) {
            setCheckedState(m21865j.m73758k(i3, 0));
        }
        m21865j.m73746w();
        m49988k();
    }
}

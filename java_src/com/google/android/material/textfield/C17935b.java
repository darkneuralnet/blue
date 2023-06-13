package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
@SuppressLint({"ViewConstructor"})
/* renamed from: com.google.android.material.textfield.b */
/* loaded from: classes6.dex */
public class C17935b extends LinearLayout {

    /* renamed from: b */
    public final TextInputLayout f73590b;

    /* renamed from: c */
    public final TextView f73591c;

    /* renamed from: d */
    public CharSequence f73592d;

    /* renamed from: e */
    public final CheckableImageButton f73593e;

    /* renamed from: f */
    public ColorStateList f73594f;

    /* renamed from: g */
    public PorterDuff.Mode f73595g;

    /* renamed from: h */
    public int f73596h;

    /* renamed from: i */
    public ImageView.ScaleType f73597i;

    /* renamed from: j */
    public View.OnLongClickListener f73598j;

    /* renamed from: k */
    public boolean f73599k;

    public C17935b(TextInputLayout textInputLayout, Z46 z46) {
        super(textInputLayout.getContext());
        this.f73590b = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C50603vk4.design_text_input_start_icon, (ViewGroup) this, false);
        this.f73593e = checkableImageButton;
        CP1.m112259e(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f73591c = appCompatTextView;
        m48574i(z46);
        m48575h(z46);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    /* renamed from: A */
    public void m48585A(C27125p2 c27125p2) {
        if (this.f73591c.getVisibility() == 0) {
            c27125p2.m20050u0(this.f73591c);
            c27125p2.m20108P0(this.f73591c);
            return;
        }
        c27125p2.m20108P0(this.f73593e);
    }

    /* renamed from: B */
    public void m48584B() {
        int m62538I;
        EditText editText = this.f73590b.editText;
        if (editText == null) {
            return;
        }
        if (m48572k()) {
            m62538I = 0;
        } else {
            m62538I = C38790bq6.m62538I(editText);
        }
        C38790bq6.m62529M0(this.f73591c, m62538I, editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(C35172Pf4.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    /* renamed from: C */
    public final void m48583C() {
        int i;
        boolean z;
        int i2 = 8;
        if (this.f73592d != null && !this.f73599k) {
            i = 0;
        } else {
            i = 8;
        }
        if (this.f73593e.getVisibility() != 0 && i != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            i2 = 0;
        }
        setVisibility(i2);
        this.f73591c.setVisibility(i);
        this.f73590b.updateDummyDrawables();
    }

    /* renamed from: a */
    public CharSequence m48582a() {
        return this.f73592d;
    }

    /* renamed from: b */
    public ColorStateList m48581b() {
        return this.f73591c.getTextColors();
    }

    /* renamed from: c */
    public TextView m48580c() {
        return this.f73591c;
    }

    /* renamed from: d */
    public CharSequence m48579d() {
        return this.f73593e.getContentDescription();
    }

    /* renamed from: e */
    public Drawable m48578e() {
        return this.f73593e.getDrawable();
    }

    /* renamed from: f */
    public int m48577f() {
        return this.f73596h;
    }

    /* renamed from: g */
    public ImageView.ScaleType m48576g() {
        return this.f73597i;
    }

    /* renamed from: h */
    public final void m48575h(Z46 z46) {
        this.f73591c.setVisibility(8);
        this.f73591c.setId(C33795Ji4.textinput_prefix_text);
        this.f73591c.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        C38790bq6.m62448x0(this.f73591c, 1);
        m48568o(z46.m73755n(C37098Xl4.TextInputLayout_prefixTextAppearance, 0));
        int i = C37098Xl4.TextInputLayout_prefixTextColor;
        if (z46.m73750s(i)) {
            m48567p(z46.m73766c(i));
        }
        m48569n(z46.m73753p(C37098Xl4.TextInputLayout_prefixText));
    }

    /* renamed from: i */
    public final void m48574i(Z46 z46) {
        if (NM2.m94022i(getContext())) {
            C39093cM2.m61541c((ViewGroup.MarginLayoutParams) this.f73593e.getLayoutParams(), 0);
        }
        m48562u(null);
        m48561v(null);
        int i = C37098Xl4.TextInputLayout_startIconTint;
        if (z46.m73750s(i)) {
            this.f73594f = NM2.m94030a(getContext(), z46, i);
        }
        int i2 = C37098Xl4.TextInputLayout_startIconTintMode;
        if (z46.m73750s(i2)) {
            this.f73595g = C36704Vt6.m79293o(z46.m73758k(i2, -1), null);
        }
        int i3 = C37098Xl4.TextInputLayout_startIconDrawable;
        if (z46.m73750s(i3)) {
            m48564s(z46.m73762g(i3));
            int i4 = C37098Xl4.TextInputLayout_startIconContentDescription;
            if (z46.m73750s(i4)) {
                m48565r(z46.m73753p(i4));
            }
            m48566q(z46.m73768a(C37098Xl4.TextInputLayout_startIconCheckable, true));
        }
        m48563t(z46.m73763f(C37098Xl4.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(C35172Pf4.mtrl_min_touch_target_size)));
        int i5 = C37098Xl4.TextInputLayout_startIconScaleType;
        if (z46.m73750s(i5)) {
            m48560w(CP1.m112262b(z46.m73758k(i5, -1)));
        }
    }

    /* renamed from: j */
    public boolean m48573j() {
        return this.f73593e.m49421a();
    }

    /* renamed from: k */
    public boolean m48572k() {
        return this.f73593e.getVisibility() == 0;
    }

    /* renamed from: l */
    public void m48571l(boolean z) {
        this.f73599k = z;
        m48583C();
    }

    /* renamed from: m */
    public void m48570m() {
        CP1.m112260d(this.f73590b, this.f73593e, this.f73594f);
    }

    /* renamed from: n */
    public void m48569n(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.f73592d = charSequence2;
        this.f73591c.setText(charSequence);
        m48583C();
    }

    /* renamed from: o */
    public void m48568o(int i) {
        Q26.m89061o(this.f73591c, i);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m48584B();
    }

    /* renamed from: p */
    public void m48567p(ColorStateList colorStateList) {
        this.f73591c.setTextColor(colorStateList);
    }

    /* renamed from: q */
    public void m48566q(boolean z) {
        this.f73593e.setCheckable(z);
    }

    /* renamed from: r */
    public void m48565r(CharSequence charSequence) {
        if (m48579d() != charSequence) {
            this.f73593e.setContentDescription(charSequence);
        }
    }

    /* renamed from: s */
    public void m48564s(Drawable drawable) {
        this.f73593e.setImageDrawable(drawable);
        if (drawable != null) {
            CP1.m112263a(this.f73590b, this.f73593e, this.f73594f, this.f73595g);
            m48557z(true);
            m48570m();
            return;
        }
        m48557z(false);
        m48562u(null);
        m48561v(null);
        m48565r(null);
    }

    /* renamed from: t */
    public void m48563t(int i) {
        if (i >= 0) {
            if (i != this.f73596h) {
                this.f73596h = i;
                CP1.m112257g(this.f73593e, i);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    /* renamed from: u */
    public void m48562u(View.OnClickListener onClickListener) {
        CP1.m112256h(this.f73593e, onClickListener, this.f73598j);
    }

    /* renamed from: v */
    public void m48561v(View.OnLongClickListener onLongClickListener) {
        this.f73598j = onLongClickListener;
        CP1.m112255i(this.f73593e, onLongClickListener);
    }

    /* renamed from: w */
    public void m48560w(ImageView.ScaleType scaleType) {
        this.f73597i = scaleType;
        CP1.m112254j(this.f73593e, scaleType);
    }

    /* renamed from: x */
    public void m48559x(ColorStateList colorStateList) {
        if (this.f73594f != colorStateList) {
            this.f73594f = colorStateList;
            CP1.m112263a(this.f73590b, this.f73593e, colorStateList, this.f73595g);
        }
    }

    /* renamed from: y */
    public void m48558y(PorterDuff.Mode mode) {
        if (this.f73595g != mode) {
            this.f73595g = mode;
            CP1.m112263a(this.f73590b, this.f73593e, this.f73594f, mode);
        }
    }

    /* renamed from: z */
    public void m48557z(boolean z) {
        int i;
        if (m48572k() != z) {
            CheckableImageButton checkableImageButton = this.f73593e;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            m48584B();
            m48583C();
        }
    }
}

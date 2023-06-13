package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.C11032g;
import androidx.appcompat.view.menu.InterfaceC11039j;
import androidx.appcompat.widget.LinearLayoutCompat;
/* loaded from: classes6.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements InterfaceC11039j.InterfaceC11040a {

    /* renamed from: r */
    public static final int[] f72993r = {16842912};

    /* renamed from: h */
    public int f72994h;

    /* renamed from: i */
    public boolean f72995i;

    /* renamed from: j */
    public boolean f72996j;

    /* renamed from: k */
    public final CheckedTextView f72997k;

    /* renamed from: l */
    public FrameLayout f72998l;

    /* renamed from: m */
    public C11032g f72999m;

    /* renamed from: n */
    public ColorStateList f73000n;

    /* renamed from: o */
    public boolean f73001o;

    /* renamed from: p */
    public Drawable f73002p;

    /* renamed from: q */
    public final C5148M1 f73003q;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    /* loaded from: classes6.dex */
    public class C17831a extends C5148M1 {
        public C17831a() {
        }

        @Override // p000.C5148M1
        public void onInitializeAccessibilityNodeInfo(View view, C27125p2 c27125p2) {
            super.onInitializeAccessibilityNodeInfo(view, c27125p2);
            c27125p2.m20084d0(NavigationMenuItemView.this.f72996j);
        }
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11039j.InterfaceC11040a
    /* renamed from: c */
    public boolean mo49374c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11039j.InterfaceC11040a
    /* renamed from: d */
    public void mo49373d(C11032g c11032g, int i) {
        int i2;
        this.f72999m = c11032g;
        if (c11032g.getItemId() > 0) {
            setId(c11032g.getItemId());
        }
        if (c11032g.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        if (getBackground() == null) {
            C38790bq6.m62553A0(this, m49404g());
        }
        setCheckable(c11032g.isCheckable());
        setChecked(c11032g.isChecked());
        setEnabled(c11032g.isEnabled());
        setTitle(c11032g.getTitle());
        setIcon(c11032g.getIcon());
        m49402i(c11032g.getActionView());
        setContentDescription(c11032g.getContentDescription());
        E56.m109403a(this, c11032g.getTooltipText());
        m49405f();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11039j.InterfaceC11040a
    /* renamed from: e */
    public C11032g mo49372e() {
        return this.f72999m;
    }

    /* renamed from: f */
    public final void m49405f() {
        if (m49400k()) {
            this.f72997k.setVisibility(8);
            FrameLayout frameLayout = this.f72998l;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).width = -1;
                this.f72998l.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.f72997k.setVisibility(0);
        FrameLayout frameLayout2 = this.f72998l;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams2).width = -2;
            this.f72998l.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: g */
    public final StateListDrawable m49404g() {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(C50553vf4.colorControlHighlight, typedValue, true)) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(f72993r, new ColorDrawable(typedValue.data));
            stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            return stateListDrawable;
        }
        return null;
    }

    /* renamed from: h */
    public void m49403h() {
        FrameLayout frameLayout = this.f72998l;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.f72997k.setCompoundDrawables(null, null, null, null);
    }

    /* renamed from: i */
    public final void m49402i(View view) {
        if (view != null) {
            if (this.f72998l == null) {
                this.f72998l = (FrameLayout) ((ViewStub) findViewById(C33795Ji4.design_menu_item_action_area_stub)).inflate();
            }
            this.f72998l.removeAllViews();
            this.f72998l.addView(view);
        }
    }

    /* renamed from: j */
    public void m49401j(ColorStateList colorStateList) {
        boolean z;
        this.f73000n = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        this.f73001o = z;
        C11032g c11032g = this.f72999m;
        if (c11032g != null) {
            setIcon(c11032g.getIcon());
        }
    }

    /* renamed from: k */
    public final boolean m49400k() {
        if (this.f72999m.getTitle() == null && this.f72999m.getIcon() == null && this.f72999m.getActionView() != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C11032g c11032g = this.f72999m;
        if (c11032g != null && c11032g.isCheckable() && this.f72999m.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f72993r);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f72996j != z) {
            this.f72996j = z;
            this.f73003q.sendAccessibilityEvent(this.f72997k, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f72997k.setChecked(z);
        CheckedTextView checkedTextView = this.f72997k;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), z ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f73001o) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = P61.m90834r(drawable).mutate();
                P61.m90837o(drawable, this.f73000n);
            }
            int i = this.f72994h;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f72995i) {
            if (this.f73002p == null) {
                Drawable m10397f = C49785uM4.m10397f(getResources(), C52935zg4.navigation_empty_icon, getContext().getTheme());
                this.f73002p = m10397f;
                if (m10397f != null) {
                    int i2 = this.f72994h;
                    m10397f.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f73002p;
        }
        Q26.m89066j(this.f72997k, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f72997k.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f72994h = i;
    }

    public void setMaxLines(int i) {
        this.f72997k.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f72995i = z;
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearance(int i) {
        Q26.m89061o(this.f72997k, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f72997k.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f72997k.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C17831a c17831a = new C17831a();
        this.f73003q = c17831a;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C50603vk4.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C35172Pf4.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C33795Ji4.design_menu_item_text);
        this.f72997k = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C38790bq6.m62452v0(checkedTextView, c17831a);
    }
}

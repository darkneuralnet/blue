package com.google.android.material.search;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar;
import p000.C7051R1;
/* loaded from: classes6.dex */
public class SearchBar extends Toolbar {

    /* renamed from: H0 */
    public static final int f73168H0 = C50021ul4.Widget_Material3_SearchBar;

    /* renamed from: A0 */
    public Integer f73169A0;

    /* renamed from: B0 */
    public Drawable f73170B0;

    /* renamed from: C0 */
    public int f73171C0;

    /* renamed from: D0 */
    public boolean f73172D0;

    /* renamed from: E0 */
    public PM2 f73173E0;

    /* renamed from: F0 */
    public final AccessibilityManager f73174F0;

    /* renamed from: G0 */
    public final C7051R1.InterfaceC7053b f73175G0;

    /* renamed from: s0 */
    public final TextView f73176s0;

    /* renamed from: t0 */
    public final boolean f73177t0;

    /* renamed from: u0 */
    public final boolean f73178u0;

    /* renamed from: v0 */
    public final C46515oq5 f73179v0;

    /* renamed from: w0 */
    public final Drawable f73180w0;

    /* renamed from: x0 */
    public final boolean f73181x0;

    /* renamed from: y0 */
    public final boolean f73182y0;

    /* renamed from: z0 */
    public View f73183z0;

    /* loaded from: classes6.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C17856a();

        /* renamed from: d */
        public String f73184d;

        /* renamed from: com.google.android.material.search.SearchBar$SavedState$a */
        /* loaded from: classes6.dex */
        public class C17856a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f73184d);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f73184d = parcel.readString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: com.google.android.material.search.SearchBar$a */
    /* loaded from: classes6.dex */
    public class View$OnAttachStateChangeListenerC17857a implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC17857a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            C7051R1.m87425a(SearchBar.this.f73174F0, SearchBar.this.f73175G0);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            C7051R1.m87424b(SearchBar.this.f73174F0, SearchBar.this.f73175G0);
        }
    }

    public SearchBar(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0 */
    public /* synthetic */ void m49214w0(boolean z) {
        setFocusableInTouchMode(z);
    }

    /* renamed from: A0 */
    public final void m49237A0(int i, int i2) {
        View view = this.f73183z0;
        if (view != null) {
            view.measure(i, i2);
        }
    }

    /* renamed from: B0 */
    public final void m49236B0() {
        if (this.f73178u0 && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C35172Pf4.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C35172Pf4.m3_searchbar_margin_vertical);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = m49226k0(marginLayoutParams.leftMargin, dimensionPixelSize);
            marginLayoutParams.topMargin = m49226k0(marginLayoutParams.topMargin, dimensionPixelSize2);
            marginLayoutParams.rightMargin = m49226k0(marginLayoutParams.rightMargin, dimensionPixelSize);
            marginLayoutParams.bottomMargin = m49226k0(marginLayoutParams.bottomMargin, dimensionPixelSize2);
        }
    }

    /* renamed from: C0 */
    public final void m49235C0(boolean z) {
        Drawable drawable;
        ImageButton m114368d = B56.m114368d(this);
        if (m114368d == null) {
            return;
        }
        m114368d.setClickable(!z);
        m114368d.setFocusable(!z);
        Drawable background = m114368d.getBackground();
        if (background != null) {
            this.f73170B0 = background;
        }
        if (z) {
            drawable = null;
        } else {
            drawable = this.f73170B0;
        }
        m114368d.setBackgroundDrawable(drawable);
    }

    /* renamed from: D0 */
    public final void m49234D0() {
        if (getLayoutParams() instanceof AppBarLayout.LayoutParams) {
            AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) getLayoutParams();
            if (this.f73172D0) {
                if (layoutParams.m50402c() == 0) {
                    layoutParams.m50398g(53);
                }
            } else if (layoutParams.m50402c() == 53) {
                layoutParams.m50398g(0);
            }
        }
    }

    /* renamed from: E0 */
    public final void m49233E0() {
        AccessibilityManager accessibilityManager = this.f73174F0;
        if (accessibilityManager != null) {
            if (accessibilityManager.isEnabled() && this.f73174F0.isTouchExplorationEnabled()) {
                setFocusableInTouchMode(true);
            }
            addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC17857a());
        }
    }

    /* renamed from: F0 */
    public void m49232F0() {
        this.f73179v0.m20464b(this);
    }

    /* renamed from: G0 */
    public final void m49231G0(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "title") == null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "subtitle") == null) {
                return;
            }
            throw new UnsupportedOperationException("SearchBar does not support subtitle. Use hint or text instead.");
        }
        throw new UnsupportedOperationException("SearchBar does not support title. Use hint or text instead.");
    }

    @Override // androidx.appcompat.widget.Toolbar
    /* renamed from: R */
    public void mo49230R(int i) {
        super.mo49230R(i);
        this.f73171C0 = i;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f73177t0 && this.f73183z0 == null && !(view instanceof ActionMenuView)) {
            this.f73183z0 = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: k0 */
    public final int m49226k0(int i, int i2) {
        return i == 0 ? i2 : i;
    }

    /* renamed from: l0 */
    public View m49225l0() {
        return this.f73183z0;
    }

    /* renamed from: m0 */
    public float m49224m0() {
        PM2 pm2 = this.f73173E0;
        return pm2 != null ? pm2.m90380w() : C38790bq6.m62447y(this);
    }

    /* renamed from: n0 */
    public float m49223n0() {
        return this.f73173E0.m90434I();
    }

    /* renamed from: o0 */
    public CharSequence m49222o0() {
        return this.f73176s0.getHint();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        QM2.m88638f(this, this.f73173E0);
        m49236B0();
        m49234D0();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        CharSequence m49218s0 = m49218s0();
        boolean isEmpty = TextUtils.isEmpty(m49218s0);
        if (Build.VERSION.SDK_INT >= 26) {
            accessibilityNodeInfo.setHintText(m49222o0());
            accessibilityNodeInfo.setShowingHintText(isEmpty);
        }
        if (isEmpty) {
            m49218s0 = m49222o0();
        }
        accessibilityNodeInfo.setText(m49218s0);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m49213x0();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m49237A0(i, i2);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m67617a());
        setText(savedState.f73184d);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        String charSequence;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        CharSequence m49218s0 = m49218s0();
        if (m49218s0 == null) {
            charSequence = null;
        } else {
            charSequence = m49218s0.toString();
        }
        savedState.f73184d = charSequence;
        return savedState;
    }

    /* renamed from: p0 */
    public int m49221p0() {
        return this.f73171C0;
    }

    /* renamed from: q0 */
    public int m49220q0() {
        return this.f73173E0.m90437F().getDefaultColor();
    }

    /* renamed from: r0 */
    public float m49219r0() {
        return this.f73173E0.m90435H();
    }

    /* renamed from: s0 */
    public CharSequence m49218s0() {
        return this.f73176s0.getText();
    }

    public void setCenterView(View view) {
        View view2 = this.f73183z0;
        if (view2 != null) {
            removeView(view2);
            this.f73183z0 = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z) {
        this.f73172D0 = z;
        m49234D0();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        PM2 pm2 = this.f73173E0;
        if (pm2 != null) {
            pm2.m90417Z(f);
        }
    }

    public void setHint(CharSequence charSequence) {
        this.f73176s0.setHint(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(m49211z0(drawable));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        boolean z;
        if (this.f73182y0) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        if (onClickListener == null) {
            z = true;
        } else {
            z = false;
        }
        m49235C0(z);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z) {
        this.f73179v0.m20465a(z);
    }

    public void setStrokeColor(int i) {
        if (m49220q0() != i) {
            this.f73173E0.m90396k0(ColorStateList.valueOf(i));
        }
    }

    public void setStrokeWidth(float f) {
        if (m49219r0() != f) {
            this.f73173E0.m90394l0(f);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(CharSequence charSequence) {
        this.f73176s0.setText(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    /* renamed from: t0 */
    public final void m49217t0(C43037iy5 c43037iy5, float f, float f2, int i) {
        PM2 pm2 = new PM2(c43037iy5);
        this.f73173E0 = pm2;
        pm2.m90427P(getContext());
        this.f73173E0.m90417Z(f);
        if (f2 >= 0.0f) {
            this.f73173E0.m90400i0(f2, i);
        }
        int m103952d = HM2.m103952d(this, C49961uf4.colorSurface);
        int m103952d2 = HM2.m103952d(this, C49961uf4.colorControlHighlight);
        this.f73173E0.m90416a0(ColorStateList.valueOf(m103952d));
        ColorStateList valueOf = ColorStateList.valueOf(m103952d2);
        PM2 pm22 = this.f73173E0;
        C38790bq6.m62553A0(this, new RippleDrawable(valueOf, pm22, pm22));
    }

    /* renamed from: u0 */
    public final void m49216u0() {
        Drawable m69794F;
        if (m69794F() == null) {
            m69794F = this.f73180w0;
        } else {
            m69794F = m69794F();
        }
        setNavigationIcon(m69794F);
        m49235C0(true);
    }

    /* renamed from: v0 */
    public final void m49215v0(int i, String str, String str2) {
        if (i != -1) {
            Q26.m89061o(this.f73176s0, i);
        }
        setText(str);
        setHint(str2);
        if (m69794F() == null) {
            C39093cM2.m61540d((ViewGroup.MarginLayoutParams) this.f73176s0.getLayoutParams(), getResources().getDimensionPixelSize(C35172Pf4.m3_searchbar_text_margin_start_no_navigation_icon));
        }
    }

    /* renamed from: x0 */
    public final void m49213x0() {
        View view = this.f73183z0;
        if (view == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
        int i = measuredWidth2 + measuredWidth;
        int measuredHeight = this.f73183z0.getMeasuredHeight();
        int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
        m49212y0(this.f73183z0, measuredWidth2, measuredHeight2, i, measuredHeight2 + measuredHeight);
    }

    /* renamed from: y0 */
    public final void m49212y0(View view, int i, int i2, int i3, int i4) {
        if (C38790bq6.m62548D(this) == 1) {
            view.layout(getMeasuredWidth() - i3, i2, getMeasuredWidth() - i, i4);
        } else {
            view.layout(i, i2, i3, i4);
        }
    }

    /* renamed from: z0 */
    public final Drawable m49211z0(Drawable drawable) {
        int i;
        int m103952d;
        if (this.f73181x0 && drawable != null) {
            Integer num = this.f73169A0;
            if (num != null) {
                m103952d = num.intValue();
            } else {
                if (drawable == this.f73180w0) {
                    i = C49961uf4.colorOnSurfaceVariant;
                } else {
                    i = C49961uf4.colorOnSurface;
                }
                m103952d = HM2.m103952d(this, i);
            }
            Drawable m90834r = P61.m90834r(drawable.mutate());
            P61.m90838n(m90834r, m103952d);
            return m90834r;
        }
        return drawable;
    }

    /* loaded from: classes6.dex */
    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        /* renamed from: a */
        public boolean f73185a;

        public ScrollingViewBehavior() {
            this.f73185a = false;
        }

        /* renamed from: a */
        public final void m49207a(AppBarLayout appBarLayout) {
            appBarLayout.setBackgroundColor(0);
            appBarLayout.setTargetElevation(0.0f);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean onDependentViewChanged = super.onDependentViewChanged(coordinatorLayout, view, view2);
            if (!this.f73185a && (view2 instanceof AppBarLayout)) {
                this.f73185a = true;
                m49207a((AppBarLayout) view2);
            }
            return onDependentViewChanged;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public boolean shouldHeaderOverlapScrollingChild() {
            return true;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f73185a = false;
        }
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C49961uf4.materialSearchBarStyle);
    }

    public void setHint(int i) {
        this.f73176s0.setHint(i);
    }

    public void setText(int i) {
        this.f73176s0.setText(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SearchBar(Context context, AttributeSet attributeSet, int i) {
        super(VM2.m79935c(context, attributeSet, i, r6), attributeSet, i);
        int i2 = f73168H0;
        this.f73171C0 = -1;
        this.f73175G0 = new C7051R1.InterfaceC7053b() { // from class: nq5
            @Override // p000.C7051R1.InterfaceC7053b
            public final void onTouchExplorationStateChanged(boolean z) {
                SearchBar.this.m49214w0(z);
            }
        };
        Context context2 = getContext();
        m49231G0(attributeSet);
        this.f73180w0 = C29611vi.m8248b(context2, C52935zg4.ic_search_black_24);
        this.f73179v0 = new C46515oq5();
        TypedArray m21866i = C46052o36.m21866i(context2, attributeSet, C37098Xl4.SearchBar, i, i2, new int[0]);
        C43037iy5 m31495m = C43037iy5.m31540e(context2, attributeSet, i, i2).m31495m();
        float dimension = m21866i.getDimension(C37098Xl4.SearchBar_elevation, 0.0f);
        this.f73178u0 = m21866i.getBoolean(C37098Xl4.SearchBar_defaultMarginsEnabled, true);
        this.f73172D0 = m21866i.getBoolean(C37098Xl4.SearchBar_defaultScrollFlagsEnabled, true);
        boolean z = m21866i.getBoolean(C37098Xl4.SearchBar_hideNavigationIcon, false);
        this.f73182y0 = m21866i.getBoolean(C37098Xl4.SearchBar_forceDefaultNavigationOnClickListener, false);
        this.f73181x0 = m21866i.getBoolean(C37098Xl4.SearchBar_tintNavigationIcon, true);
        int i3 = C37098Xl4.SearchBar_navigationIconTint;
        if (m21866i.hasValue(i3)) {
            this.f73169A0 = Integer.valueOf(m21866i.getColor(i3, -1));
        }
        int resourceId = m21866i.getResourceId(C37098Xl4.SearchBar_android_textAppearance, -1);
        String string = m21866i.getString(C37098Xl4.SearchBar_android_text);
        String string2 = m21866i.getString(C37098Xl4.SearchBar_android_hint);
        float dimension2 = m21866i.getDimension(C37098Xl4.SearchBar_strokeWidth, -1.0f);
        int color = m21866i.getColor(C37098Xl4.SearchBar_strokeColor, 0);
        m21866i.recycle();
        if (!z) {
            m49216u0();
        }
        setClickable(true);
        setFocusable(true);
        LayoutInflater.from(context2).inflate(C50603vk4.mtrl_search_bar, this);
        this.f73177t0 = true;
        this.f73176s0 = (TextView) findViewById(C33795Ji4.search_bar_text_view);
        C38790bq6.m62545E0(this, dimension);
        m49215v0(resourceId, string, string2);
        m49217t0(m31495m, dimension, dimension2, color);
        this.f73174F0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        m49233E0();
    }
}

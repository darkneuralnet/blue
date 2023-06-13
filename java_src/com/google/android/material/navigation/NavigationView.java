package com.google.android.material.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C11028e;
import androidx.appcompat.view.menu.C11032g;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import p000.C43037iy5;
/* loaded from: classes6.dex */
public class NavigationView extends ScrimInsetsFrameLayout {

    /* renamed from: v */
    public static final int[] f73111v = {16842912};

    /* renamed from: w */
    public static final int[] f73112w = {-16842910};

    /* renamed from: x */
    public static final int f73113x = C50021ul4.Widget_Design_NavigationView;

    /* renamed from: i */
    public final V03 f73114i;

    /* renamed from: j */
    public final W03 f73115j;

    /* renamed from: k */
    public InterfaceC17850c f73116k;

    /* renamed from: l */
    public final int f73117l;

    /* renamed from: m */
    public final int[] f73118m;

    /* renamed from: n */
    public MenuInflater f73119n;

    /* renamed from: o */
    public ViewTreeObserver.OnGlobalLayoutListener f73120o;

    /* renamed from: p */
    public boolean f73121p;

    /* renamed from: q */
    public boolean f73122q;

    /* renamed from: r */
    public int f73123r;

    /* renamed from: s */
    public int f73124s;

    /* renamed from: t */
    public Path f73125t;

    /* renamed from: u */
    public final RectF f73126u;

    /* renamed from: com.google.android.material.navigation.NavigationView$a */
    /* loaded from: classes6.dex */
    public class C17848a implements C11028e.InterfaceC11029a {
        public C17848a() {
        }

        @Override // androidx.appcompat.view.menu.C11028e.InterfaceC11029a
        /* renamed from: a */
        public boolean mo5020a(C11028e c11028e, MenuItem menuItem) {
            InterfaceC17850c interfaceC17850c = NavigationView.this.f73116k;
            return interfaceC17850c != null && interfaceC17850c.mo49287b(menuItem);
        }

        @Override // androidx.appcompat.view.menu.C11028e.InterfaceC11029a
        /* renamed from: b */
        public void mo5019b(C11028e c11028e) {
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$b */
    /* loaded from: classes6.dex */
    public class ViewTreeObserver$OnGlobalLayoutListenerC17849b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserver$OnGlobalLayoutListenerC17849b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.f73118m);
            boolean z7 = true;
            if (NavigationView.this.f73118m[1] == 0) {
                z = true;
            } else {
                z = false;
            }
            NavigationView.this.f73115j.m78990q(z);
            NavigationView navigationView2 = NavigationView.this;
            if (z && navigationView2.m49293n()) {
                z2 = true;
            } else {
                z2 = false;
            }
            navigationView2.setDrawTopInsetForeground(z2);
            if (NavigationView.this.f73118m[0] != 0 && NavigationView.this.f73118m[0] + NavigationView.this.getWidth() != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            NavigationView.this.setDrawLeftInsetForeground(z3);
            Activity m43152a = C40195eB0.m43152a(NavigationView.this.getContext());
            if (m43152a != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                m43152a.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
                if (displayMetrics.heightPixels - NavigationView.this.getHeight() == NavigationView.this.f73118m[1]) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (Color.alpha(m43152a.getWindow().getNavigationBarColor()) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                NavigationView navigationView3 = NavigationView.this;
                if (z4 && z5 && navigationView3.m49294m()) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                navigationView3.setDrawBottomInsetForeground(z6);
                if (displayMetrics.widthPixels != NavigationView.this.f73118m[0] && displayMetrics.widthPixels - NavigationView.this.getWidth() != NavigationView.this.f73118m[0]) {
                    z7 = false;
                }
                NavigationView.this.setDrawRightInsetForeground(z7);
            }
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC17850c {
        /* renamed from: b */
        boolean mo49287b(MenuItem menuItem);
    }

    public NavigationView(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    /* renamed from: a */
    public void mo45938a(DB6 db6) {
        this.f73115j.m78994k(db6);
    }

    /* renamed from: d */
    public final ColorStateList m49301d(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList m8249a = C29611vi.m8249a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C50553vf4.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = m8249a.getDefaultColor();
        int[] iArr = f73112w;
        return new ColorStateList(new int[][]{iArr, f73111v, FrameLayout.EMPTY_STATE_SET}, new int[]{m8249a.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.f73125t == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.f73125t);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    /* renamed from: e */
    public final Drawable m49300e(Z46 z46) {
        return m49299f(z46, NM2.m94030a(getContext(), z46, C37098Xl4.NavigationView_itemShapeFillColor));
    }

    /* renamed from: f */
    public final Drawable m49299f(Z46 z46, ColorStateList colorStateList) {
        PM2 pm2 = new PM2(C43037iy5.m31543b(getContext(), z46.m73755n(C37098Xl4.NavigationView_itemShapeAppearance, 0), z46.m73755n(C37098Xl4.NavigationView_itemShapeAppearanceOverlay, 0)).m31495m());
        pm2.m90416a0(colorStateList);
        return new InsetDrawable((Drawable) pm2, z46.m73763f(C37098Xl4.NavigationView_itemShapeInsetStart, 0), z46.m73763f(C37098Xl4.NavigationView_itemShapeInsetTop, 0), z46.m73763f(C37098Xl4.NavigationView_itemShapeInsetEnd, 0), z46.m73763f(C37098Xl4.NavigationView_itemShapeInsetBottom, 0));
    }

    /* renamed from: g */
    public View mo45937g(int i) {
        return this.f73115j.m78993n(i);
    }

    /* renamed from: h */
    public Menu m49298h() {
        return this.f73114i;
    }

    /* renamed from: i */
    public final MenuInflater m49297i() {
        if (this.f73119n == null) {
            this.f73119n = new C39177cV5(getContext());
        }
        return this.f73119n;
    }

    /* renamed from: j */
    public final boolean m49296j(Z46 z46) {
        if (!z46.m73750s(C37098Xl4.NavigationView_itemShapeAppearance) && !z46.m73750s(C37098Xl4.NavigationView_itemShapeAppearanceOverlay)) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public View mo45936k(int i) {
        return this.f73115j.m78991p(i);
    }

    /* renamed from: l */
    public void m49295l(int i) {
        this.f73115j.m78998K(true);
        m49297i().inflate(i, this.f73114i);
        this.f73115j.m78998K(false);
        this.f73115j.mo49322f(false);
    }

    /* renamed from: m */
    public boolean m49294m() {
        return this.f73122q;
    }

    /* renamed from: n */
    public boolean m49293n() {
        return this.f73121p;
    }

    /* renamed from: o */
    public final void m49292o(int i, int i2) {
        if ((getParent() instanceof DrawerLayout) && this.f73124s > 0 && (getBackground() instanceof PM2)) {
            PM2 pm2 = (PM2) getBackground();
            C43037iy5.C24658b m31523v = pm2.m90438E().m31523v();
            if (YD1.m75415b(this.f73123r, C38790bq6.m62548D(this)) == 3) {
                m31523v.m31509K(this.f73124s);
                m31523v.m31518B(this.f73124s);
            } else {
                m31523v.m31513G(this.f73124s);
                m31523v.m31485w(this.f73124s);
            }
            pm2.setShapeAppearanceModel(m31523v.m31495m());
            if (this.f73125t == null) {
                this.f73125t = new Path();
            }
            this.f73125t.reset();
            this.f73126u.set(0.0f, 0.0f, i, i2);
            C43630jy5.m29567k().m29573e(pm2.m90438E(), pm2.m90378y(), this.f73126u, this.f73125t);
            invalidate();
            return;
        }
        this.f73125t = null;
        this.f73126u.setEmpty();
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        QM2.m88639e(this);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f73120o);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i = View.MeasureSpec.makeMeasureSpec(this.f73117l, 1073741824);
            }
        } else {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.f73117l), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m67617a());
        this.f73114i.m70159S(savedState.f73127d);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f73127d = bundle;
        this.f73114i.m70157U(bundle);
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m49292o(i, i2);
    }

    /* renamed from: p */
    public final void m49291p() {
        this.f73120o = new ViewTreeObserver$OnGlobalLayoutListenerC17849b();
        getViewTreeObserver().addOnGlobalLayoutListener(this.f73120o);
    }

    public void setBottomInsetScrimEnabled(boolean z) {
        this.f73122q = z;
    }

    public void setCheckedItem(int i) {
        MenuItem findItem = this.f73114i.findItem(i);
        if (findItem != null) {
            this.f73115j.m78989r((C11032g) findItem);
        }
    }

    public void setDividerInsetEnd(int i) {
        this.f73115j.m78988s(i);
    }

    public void setDividerInsetStart(int i) {
        this.f73115j.m78987t(i);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        QM2.m88640d(this, f);
    }

    public void setItemBackground(Drawable drawable) {
        this.f73115j.m78985v(drawable);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(NA0.m94299e(getContext(), i));
    }

    public void setItemHorizontalPadding(int i) {
        this.f73115j.m78983x(i);
    }

    public void setItemHorizontalPaddingResource(int i) {
        this.f73115j.m78983x(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPadding(int i) {
        this.f73115j.m78982y(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.f73115j.m78982y(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconSize(int i) {
        this.f73115j.m78981z(i);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f73115j.m79008A(colorStateList);
    }

    public void setItemMaxLines(int i) {
        this.f73115j.m79007B(i);
    }

    public void setItemTextAppearance(int i) {
        this.f73115j.m79006C(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f73115j.m79005D(colorStateList);
    }

    public void setItemVerticalPadding(int i) {
        this.f73115j.m79004E(i);
    }

    public void setItemVerticalPaddingResource(int i) {
        this.f73115j.m79004E(getResources().getDimensionPixelSize(i));
    }

    public void setNavigationItemSelectedListener(InterfaceC17850c interfaceC17850c) {
        this.f73116k = interfaceC17850c;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        W03 w03 = this.f73115j;
        if (w03 != null) {
            w03.m79003F(i);
        }
    }

    public void setSubheaderInsetEnd(int i) {
        this.f73115j.m79001H(i);
    }

    public void setSubheaderInsetStart(int i) {
        this.f73115j.m79000I(i);
    }

    public void setTopInsetScrimEnabled(boolean z) {
        this.f73121p = z;
    }

    /* loaded from: classes6.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C17847a();

        /* renamed from: d */
        public Bundle f73127d;

        /* renamed from: com.google.android.material.navigation.NavigationView$SavedState$a */
        /* loaded from: classes6.dex */
        public class C17847a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f73127d = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f73127d);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C49961uf4.navigationViewStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        super(VM2.m79935c(context, attributeSet, i, r9), attributeSet, i);
        ColorStateList m49301d;
        int i2 = f73113x;
        W03 w03 = new W03();
        this.f73115j = w03;
        this.f73118m = new int[2];
        this.f73121p = true;
        this.f73122q = true;
        this.f73123r = 0;
        this.f73124s = 0;
        this.f73126u = new RectF();
        Context context2 = getContext();
        V03 v03 = new V03(context2);
        this.f73114i = v03;
        Z46 m21865j = C46052o36.m21865j(context2, attributeSet, C37098Xl4.NavigationView, i, i2, new int[0]);
        int i3 = C37098Xl4.NavigationView_android_background;
        if (m21865j.m73750s(i3)) {
            C38790bq6.m62553A0(this, m21865j.m73762g(i3));
        }
        this.f73124s = m21865j.m73763f(C37098Xl4.NavigationView_drawerLayoutCornerSize, 0);
        this.f73123r = m21865j.m73758k(C37098Xl4.NavigationView_android_layout_gravity, 0);
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            C43037iy5 m31495m = C43037iy5.m31540e(context2, attributeSet, i, i2).m31495m();
            Drawable background = getBackground();
            PM2 pm2 = new PM2(m31495m);
            if (background instanceof ColorDrawable) {
                pm2.m90416a0(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            pm2.m90427P(context2);
            C38790bq6.m62553A0(this, pm2);
        }
        int i4 = C37098Xl4.NavigationView_elevation;
        if (m21865j.m73750s(i4)) {
            setElevation(m21865j.m73763f(i4, 0));
        }
        setFitsSystemWindows(m21865j.m73768a(C37098Xl4.NavigationView_android_fitsSystemWindows, false));
        this.f73117l = m21865j.m73763f(C37098Xl4.NavigationView_android_maxWidth, 0);
        int i5 = C37098Xl4.NavigationView_subheaderColor;
        ColorStateList m73766c = m21865j.m73750s(i5) ? m21865j.m73766c(i5) : null;
        int i6 = C37098Xl4.NavigationView_subheaderTextAppearance;
        int m73755n = m21865j.m73750s(i6) ? m21865j.m73755n(i6, 0) : 0;
        if (m73755n == 0 && m73766c == null) {
            m73766c = m49301d(16842808);
        }
        int i7 = C37098Xl4.NavigationView_itemIconTint;
        if (m21865j.m73750s(i7)) {
            m49301d = m21865j.m73766c(i7);
        } else {
            m49301d = m49301d(16842808);
        }
        int i8 = C37098Xl4.NavigationView_itemTextAppearance;
        int m73755n2 = m21865j.m73750s(i8) ? m21865j.m73755n(i8, 0) : 0;
        int i9 = C37098Xl4.NavigationView_itemIconSize;
        if (m21865j.m73750s(i9)) {
            setItemIconSize(m21865j.m73763f(i9, 0));
        }
        int i10 = C37098Xl4.NavigationView_itemTextColor;
        ColorStateList m73766c2 = m21865j.m73750s(i10) ? m21865j.m73766c(i10) : null;
        if (m73755n2 == 0 && m73766c2 == null) {
            m73766c2 = m49301d(16842806);
        }
        Drawable m73762g = m21865j.m73762g(C37098Xl4.NavigationView_itemBackground);
        if (m73762g == null && m49296j(m21865j)) {
            m73762g = m49300e(m21865j);
            ColorStateList m94030a = NM2.m94030a(context2, m21865j, C37098Xl4.NavigationView_itemRippleColor);
            if (m94030a != null) {
                w03.m78984w(new RippleDrawable(C52886zb5.m1051d(m94030a), null, m49299f(m21865j, null)));
            }
        }
        int i11 = C37098Xl4.NavigationView_itemHorizontalPadding;
        if (m21865j.m73750s(i11)) {
            setItemHorizontalPadding(m21865j.m73763f(i11, 0));
        }
        int i12 = C37098Xl4.NavigationView_itemVerticalPadding;
        if (m21865j.m73750s(i12)) {
            setItemVerticalPadding(m21865j.m73763f(i12, 0));
        }
        setDividerInsetStart(m21865j.m73763f(C37098Xl4.NavigationView_dividerInsetStart, 0));
        setDividerInsetEnd(m21865j.m73763f(C37098Xl4.NavigationView_dividerInsetEnd, 0));
        setSubheaderInsetStart(m21865j.m73763f(C37098Xl4.NavigationView_subheaderInsetStart, 0));
        setSubheaderInsetEnd(m21865j.m73763f(C37098Xl4.NavigationView_subheaderInsetEnd, 0));
        setTopInsetScrimEnabled(m21865j.m73768a(C37098Xl4.NavigationView_topInsetScrimEnabled, this.f73121p));
        setBottomInsetScrimEnabled(m21865j.m73768a(C37098Xl4.NavigationView_bottomInsetScrimEnabled, this.f73122q));
        int m73763f = m21865j.m73763f(C37098Xl4.NavigationView_itemIconPadding, 0);
        setItemMaxLines(m21865j.m73758k(C37098Xl4.NavigationView_itemMaxLines, 1));
        v03.mo70074V(new C17848a());
        w03.m78986u(1);
        w03.mo12397i(context2, v03);
        if (m73755n != 0) {
            w03.m78999J(m73755n);
        }
        w03.m79002G(m73766c);
        w03.m79008A(m49301d);
        w03.m79003F(getOverScrollMode());
        if (m73755n2 != 0) {
            w03.m79006C(m73755n2);
        }
        w03.m79005D(m73766c2);
        w03.m78985v(m73762g);
        w03.m78982y(m73763f);
        v03.m70150b(w03);
        addView((View) w03.m78992o(this));
        int i13 = C37098Xl4.NavigationView_menu;
        if (m21865j.m73750s(i13)) {
            m49295l(m21865j.m73755n(i13, 0));
        }
        int i14 = C37098Xl4.NavigationView_headerLayout;
        if (m21865j.m73750s(i14)) {
            mo45936k(m21865j.m73755n(i14, 0));
        }
        m21865j.m73746w();
        m49291p();
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.f73114i.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f73115j.m78989r((C11032g) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}

package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C11028e;
import androidx.appcompat.view.menu.InterfaceC11039j;
import androidx.customview.view.AbsSavedState;
/* loaded from: classes6.dex */
public abstract class NavigationBarView extends FrameLayout {

    /* renamed from: b */
    public final ZY2 f73105b;

    /* renamed from: c */
    public final NavigationBarMenuView f73106c;

    /* renamed from: d */
    public final NavigationBarPresenter f73107d;

    /* renamed from: e */
    public MenuInflater f73108e;

    /* loaded from: classes6.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C17843a();

        /* renamed from: d */
        public Bundle f73109d;

        /* renamed from: com.google.android.material.navigation.NavigationBarView$SavedState$a */
        /* loaded from: classes6.dex */
        public class C17843a implements Parcelable.ClassLoaderCreator<SavedState> {
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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        public final void m49307b(Parcel parcel, ClassLoader classLoader) {
            this.f73109d = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f73109d);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m49307b(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$a */
    /* loaded from: classes6.dex */
    public class C17844a implements C11028e.InterfaceC11029a {
        public C17844a() {
        }

        @Override // androidx.appcompat.view.menu.C11028e.InterfaceC11029a
        /* renamed from: a */
        public boolean mo5020a(C11028e c11028e, MenuItem menuItem) {
            NavigationBarView.this.getClass();
            NavigationBarView.this.getClass();
            return false;
        }

        @Override // androidx.appcompat.view.menu.C11028e.InterfaceC11029a
        /* renamed from: b */
        public void mo5019b(C11028e c11028e) {
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC17845b {
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC17846c {
    }

    public NavigationBarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(VM2.m79935c(context, attributeSet, i, i2), attributeSet, i);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.f73107d = navigationBarPresenter;
        Context context2 = getContext();
        int[] iArr = C37098Xl4.NavigationBarView;
        int i3 = C37098Xl4.NavigationBarView_itemTextAppearanceInactive;
        int i4 = C37098Xl4.NavigationBarView_itemTextAppearanceActive;
        Z46 m21865j = C46052o36.m21865j(context2, attributeSet, iArr, i, i2, i3, i4);
        ZY2 zy2 = new ZY2(context2, getClass(), mo49278e());
        this.f73105b = zy2;
        NavigationBarMenuView mo49279d = mo49279d(context2);
        this.f73106c = mo49279d;
        navigationBarPresenter.m49324c(mo49279d);
        navigationBarPresenter.m49326a(1);
        mo49279d.setPresenter(navigationBarPresenter);
        zy2.m70150b(navigationBarPresenter);
        navigationBarPresenter.mo12397i(getContext(), zy2);
        int i5 = C37098Xl4.NavigationBarView_itemIconTint;
        if (m21865j.m73750s(i5)) {
            mo49279d.setIconTintList(m21865j.m73766c(i5));
        } else {
            mo49279d.setIconTintList(mo49279d.m49342e(16842808));
        }
        setItemIconSize(m21865j.m73763f(C37098Xl4.NavigationBarView_itemIconSize, getResources().getDimensionPixelSize(C35172Pf4.mtrl_navigation_bar_item_default_icon_size)));
        if (m21865j.m73750s(i3)) {
            setItemTextAppearanceInactive(m21865j.m73755n(i3, 0));
        }
        if (m21865j.m73750s(i4)) {
            setItemTextAppearanceActive(m21865j.m73755n(i4, 0));
        }
        int i6 = C37098Xl4.NavigationBarView_itemTextColor;
        if (m21865j.m73750s(i6)) {
            setItemTextColor(m21865j.m73766c(i6));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            C38790bq6.m62553A0(this, m49313c(context2));
        }
        int i7 = C37098Xl4.NavigationBarView_itemPaddingTop;
        if (m21865j.m73750s(i7)) {
            setItemPaddingTop(m21865j.m73763f(i7, 0));
        }
        int i8 = C37098Xl4.NavigationBarView_itemPaddingBottom;
        if (m21865j.m73750s(i8)) {
            setItemPaddingBottom(m21865j.m73763f(i8, 0));
        }
        int i9 = C37098Xl4.NavigationBarView_elevation;
        if (m21865j.m73750s(i9)) {
            setElevation(m21865j.m73763f(i9, 0));
        }
        P61.m90837o(getBackground().mutate(), NM2.m94030a(context2, m21865j, C37098Xl4.NavigationBarView_backgroundTint));
        setLabelVisibilityMode(m21865j.m73757l(C37098Xl4.NavigationBarView_labelVisibilityMode, -1));
        int m73755n = m21865j.m73755n(C37098Xl4.NavigationBarView_itemBackground, 0);
        if (m73755n != 0) {
            mo49279d.setItemBackgroundRes(m73755n);
        } else {
            setItemRippleColor(NM2.m94030a(context2, m21865j, C37098Xl4.NavigationBarView_itemRippleColor));
        }
        int m73755n2 = m21865j.m73755n(C37098Xl4.NavigationBarView_itemActiveIndicatorStyle, 0);
        if (m73755n2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(m73755n2, C37098Xl4.NavigationBarActiveIndicator);
            setItemActiveIndicatorWidth(obtainStyledAttributes.getDimensionPixelSize(C37098Xl4.NavigationBarActiveIndicator_android_width, 0));
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(C37098Xl4.NavigationBarActiveIndicator_android_height, 0));
            setItemActiveIndicatorMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(C37098Xl4.NavigationBarActiveIndicator_marginHorizontal, 0));
            setItemActiveIndicatorColor(NM2.m94029b(context2, obtainStyledAttributes, C37098Xl4.NavigationBarActiveIndicator_android_color));
            setItemActiveIndicatorShapeAppearance(C43037iy5.m31543b(context2, obtainStyledAttributes.getResourceId(C37098Xl4.NavigationBarActiveIndicator_shapeAppearance, 0), 0).m31495m());
            obtainStyledAttributes.recycle();
        }
        int i10 = C37098Xl4.NavigationBarView_menu;
        if (m21865j.m73750s(i10)) {
            m49308j(m21865j.m73755n(i10, 0));
        }
        m21865j.m73746w();
        addView(mo49279d);
        zy2.mo70074V(new C17844a());
    }

    /* renamed from: c */
    public final PM2 m49313c(Context context) {
        PM2 pm2 = new PM2();
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            pm2.m90416a0(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
        }
        pm2.m90427P(context);
        return pm2;
    }

    /* renamed from: d */
    public abstract NavigationBarMenuView mo49279d(Context context);

    /* renamed from: e */
    public abstract int mo49278e();

    /* renamed from: f */
    public Menu m49312f() {
        return this.f73105b;
    }

    /* renamed from: g */
    public final MenuInflater m49311g() {
        if (this.f73108e == null) {
            this.f73108e = new C39177cV5(getContext());
        }
        return this.f73108e;
    }

    /* renamed from: h */
    public InterfaceC11039j m49310h() {
        return this.f73106c;
    }

    /* renamed from: i */
    public NavigationBarPresenter m49309i() {
        return this.f73107d;
    }

    /* renamed from: j */
    public void m49308j(int i) {
        this.f73107d.m49320k(true);
        m49311g().inflate(i, this.f73105b);
        this.f73107d.m49320k(false);
        this.f73107d.mo49322f(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        QM2.m88639e(this);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m67617a());
        this.f73105b.m70159S(savedState.f73109d);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f73109d = bundle;
        this.f73105b.m70157U(bundle);
        return savedState;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        QM2.m88640d(this, f);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f73106c.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.f73106c.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.f73106c.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.f73106c.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(C43037iy5 c43037iy5) {
        this.f73106c.setItemActiveIndicatorShapeAppearance(c43037iy5);
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.f73106c.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(Drawable drawable) {
        this.f73106c.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i) {
        this.f73106c.setItemBackgroundRes(i);
    }

    public void setItemIconSize(int i) {
        this.f73106c.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f73106c.setIconTintList(colorStateList);
    }

    public void setItemOnTouchListener(int i, View.OnTouchListener onTouchListener) {
        this.f73106c.setItemOnTouchListener(i, onTouchListener);
    }

    public void setItemPaddingBottom(int i) {
        this.f73106c.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(int i) {
        this.f73106c.setItemPaddingTop(i);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f73106c.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i) {
        this.f73106c.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f73106c.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f73106c.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f73106c.m49339i() != i) {
            this.f73106c.setLabelVisibilityMode(i);
            this.f73107d.mo49322f(false);
        }
    }

    public void setOnItemReselectedListener(InterfaceC17845b interfaceC17845b) {
    }

    public void setOnItemSelectedListener(InterfaceC17846c interfaceC17846c) {
    }

    public void setSelectedItemId(int i) {
        MenuItem findItem = this.f73105b.findItem(i);
        if (findItem != null && !this.f73105b.m70163O(findItem, this.f73107d, 0)) {
            findItem.setChecked(true);
        }
    }
}

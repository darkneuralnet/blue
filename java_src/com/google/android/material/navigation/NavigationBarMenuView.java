package com.google.android.material.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.view.menu.C11028e;
import androidx.appcompat.view.menu.C11032g;
import androidx.appcompat.view.menu.InterfaceC11039j;
import androidx.transition.AutoTransition;
import androidx.transition.C12055c;
import androidx.transition.TransitionSet;
import com.google.android.material.badge.C17671a;
import java.util.HashSet;
import p000.C27125p2;
/* loaded from: classes6.dex */
public abstract class NavigationBarMenuView extends ViewGroup implements InterfaceC11039j {

    /* renamed from: E */
    public static final int[] f73067E = {16842912};

    /* renamed from: F */
    public static final int[] f73068F = {-16842910};

    /* renamed from: A */
    public boolean f73069A;

    /* renamed from: B */
    public ColorStateList f73070B;

    /* renamed from: C */
    public NavigationBarPresenter f73071C;

    /* renamed from: D */
    public C11028e f73072D;

    /* renamed from: b */
    public final TransitionSet f73073b;

    /* renamed from: c */
    public final View.OnClickListener f73074c;

    /* renamed from: d */
    public final InterfaceC41591gY3<NavigationBarItemView> f73075d;

    /* renamed from: e */
    public final SparseArray<View.OnTouchListener> f73076e;

    /* renamed from: f */
    public int f73077f;

    /* renamed from: g */
    public NavigationBarItemView[] f73078g;

    /* renamed from: h */
    public int f73079h;

    /* renamed from: i */
    public int f73080i;

    /* renamed from: j */
    public ColorStateList f73081j;

    /* renamed from: k */
    public int f73082k;

    /* renamed from: l */
    public ColorStateList f73083l;

    /* renamed from: m */
    public final ColorStateList f73084m;

    /* renamed from: n */
    public int f73085n;

    /* renamed from: o */
    public int f73086o;

    /* renamed from: p */
    public Drawable f73087p;

    /* renamed from: q */
    public ColorStateList f73088q;

    /* renamed from: r */
    public int f73089r;

    /* renamed from: s */
    public final SparseArray<C17671a> f73090s;

    /* renamed from: t */
    public int f73091t;

    /* renamed from: u */
    public int f73092u;

    /* renamed from: v */
    public boolean f73093v;

    /* renamed from: w */
    public int f73094w;

    /* renamed from: x */
    public int f73095x;

    /* renamed from: y */
    public int f73096y;

    /* renamed from: z */
    public C43037iy5 f73097z;

    /* renamed from: com.google.android.material.navigation.NavigationBarMenuView$a */
    /* loaded from: classes6.dex */
    public class View$OnClickListenerC17841a implements View.OnClickListener {
        public View$OnClickListenerC17841a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C11032g mo49372e = ((NavigationBarItemView) view).mo49372e();
            if (!NavigationBarMenuView.this.f73072D.m70163O(mo49372e, NavigationBarMenuView.this.f73071C, 0)) {
                mo49372e.setChecked(true);
            }
        }
    }

    public NavigationBarMenuView(Context context) {
        super(context);
        this.f73075d = new C43963kY3(5);
        this.f73076e = new SparseArray<>(5);
        this.f73079h = 0;
        this.f73080i = 0;
        this.f73090s = new SparseArray<>(5);
        this.f73091t = -1;
        this.f73092u = -1;
        this.f73069A = false;
        this.f73084m = m49342e(16842808);
        if (isInEditMode()) {
            this.f73073b = null;
        } else {
            AutoTransition autoTransition = new AutoTransition();
            this.f73073b = autoTransition;
            autoTransition.m65861M0(0);
            autoTransition.mo65847q0(C37997aW2.m71261f(getContext(), C49961uf4.motionDurationMedium4, getResources().getInteger(C35667Ri4.material_motion_duration_long_1)));
            autoTransition.mo65845s0(C37997aW2.m71260g(getContext(), C49961uf4.motionEasingStandard, C27325pf.f103880b));
            autoTransition.m65869C0(new A26());
        }
        this.f73074c = new View$OnClickListenerC17841a();
        C38790bq6.m62539H0(this, 1);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11039j
    /* renamed from: a */
    public void mo49346a(C11028e c11028e) {
        this.f73072D = c11028e;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: d */
    public void m49343d() {
        removeAllViews();
        NavigationBarItemView[] navigationBarItemViewArr = this.f73078g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                if (navigationBarItemView != null) {
                    this.f73075d.mo9829b(navigationBarItemView);
                    navigationBarItemView.m49368i();
                }
            }
        }
        if (this.f73072D.size() == 0) {
            this.f73079h = 0;
            this.f73080i = 0;
            this.f73078g = null;
            return;
        }
        m49332p();
        this.f73078g = new NavigationBarItemView[this.f73072D.size()];
        boolean m49334n = m49334n(this.f73077f, this.f73072D.m70168G().size());
        for (int i = 0; i < this.f73072D.size(); i++) {
            this.f73071C.m49320k(true);
            this.f73072D.getItem(i).setCheckable(true);
            this.f73071C.m49320k(false);
            NavigationBarItemView m49337k = m49337k();
            this.f73078g[i] = m49337k;
            m49337k.setIconTintList(this.f73081j);
            m49337k.setIconSize(this.f73082k);
            m49337k.setTextColor(this.f73084m);
            m49337k.setTextAppearanceInactive(this.f73085n);
            m49337k.setTextAppearanceActive(this.f73086o);
            m49337k.setTextColor(this.f73083l);
            int i2 = this.f73091t;
            if (i2 != -1) {
                m49337k.setItemPaddingTop(i2);
            }
            int i3 = this.f73092u;
            if (i3 != -1) {
                m49337k.setItemPaddingBottom(i3);
            }
            m49337k.setActiveIndicatorWidth(this.f73094w);
            m49337k.setActiveIndicatorHeight(this.f73095x);
            m49337k.setActiveIndicatorMarginHorizontal(this.f73096y);
            m49337k.setActiveIndicatorDrawable(m49341f());
            m49337k.setActiveIndicatorResizeable(this.f73069A);
            m49337k.setActiveIndicatorEnabled(this.f73093v);
            Drawable drawable = this.f73087p;
            if (drawable != null) {
                m49337k.setItemBackground(drawable);
            } else {
                m49337k.setItemBackground(this.f73089r);
            }
            m49337k.setItemRippleColor(this.f73088q);
            m49337k.setShifting(m49334n);
            m49337k.setLabelVisibilityMode(this.f73077f);
            C11032g c11032g = (C11032g) this.f73072D.getItem(i);
            m49337k.mo49373d(c11032g, 0);
            m49337k.setItemPosition(i);
            int itemId = c11032g.getItemId();
            m49337k.setOnTouchListener(this.f73076e.get(itemId));
            m49337k.setOnClickListener(this.f73074c);
            int i4 = this.f73079h;
            if (i4 != 0 && itemId == i4) {
                this.f73080i = i;
            }
            m49330r(m49337k);
            addView(m49337k);
        }
        int min = Math.min(this.f73072D.size() - 1, this.f73080i);
        this.f73080i = min;
        this.f73072D.getItem(min).setChecked(true);
    }

    /* renamed from: e */
    public ColorStateList m49342e(int i) {
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
        int[] iArr = f73068F;
        return new ColorStateList(new int[][]{iArr, f73067E, ViewGroup.EMPTY_STATE_SET}, new int[]{m8249a.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    /* renamed from: f */
    public final Drawable m49341f() {
        if (this.f73097z != null && this.f73070B != null) {
            PM2 pm2 = new PM2(this.f73097z);
            pm2.m90416a0(this.f73070B);
            return pm2;
        }
        return null;
    }

    /* renamed from: g */
    public abstract NavigationBarItemView mo49285g(Context context);

    /* renamed from: h */
    public SparseArray<C17671a> m49340h() {
        return this.f73090s;
    }

    /* renamed from: i */
    public int m49339i() {
        return this.f73077f;
    }

    /* renamed from: j */
    public C11028e m49338j() {
        return this.f73072D;
    }

    /* renamed from: k */
    public final NavigationBarItemView m49337k() {
        NavigationBarItemView mo9830a = this.f73075d.mo9830a();
        if (mo9830a == null) {
            return mo49285g(getContext());
        }
        return mo9830a;
    }

    /* renamed from: l */
    public int m49336l() {
        return this.f73079h;
    }

    /* renamed from: m */
    public int m49335m() {
        return this.f73080i;
    }

    /* renamed from: n */
    public boolean m49334n(int i, int i2) {
        if (i == -1) {
            if (i2 > 3) {
                return true;
            }
        } else if (i == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final boolean m49333o(int i) {
        return i != -1;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C27125p2.m20096V0(accessibilityNodeInfo).m20076h0(C27125p2.C27127b.m20034b(1, this.f73072D.m70168G().size(), false, 1));
    }

    /* renamed from: p */
    public final void m49332p() {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.f73072D.size(); i++) {
            hashSet.add(Integer.valueOf(this.f73072D.getItem(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.f73090s.size(); i2++) {
            int keyAt = this.f73090s.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.f73090s.delete(keyAt);
            }
        }
    }

    /* renamed from: q */
    public void m49331q(SparseArray<C17671a> sparseArray) {
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            if (this.f73090s.indexOfKey(keyAt) < 0) {
                this.f73090s.append(keyAt, sparseArray.get(keyAt));
            }
        }
        NavigationBarItemView[] navigationBarItemViewArr = this.f73078g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.m49386A(this.f73090s.get(navigationBarItemView.getId()));
            }
        }
    }

    /* renamed from: r */
    public final void m49330r(NavigationBarItemView navigationBarItemView) {
        C17671a c17671a;
        int id = navigationBarItemView.getId();
        if (m49333o(id) && (c17671a = this.f73090s.get(id)) != null) {
            navigationBarItemView.m49386A(c17671a);
        }
    }

    /* renamed from: s */
    public void m49329s(boolean z) {
        this.f73069A = z;
        NavigationBarItemView[] navigationBarItemViewArr = this.f73078g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorResizeable(z);
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f73081j = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f73078g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f73070B = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f73078g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorDrawable(m49341f());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.f73093v = z;
        NavigationBarItemView[] navigationBarItemViewArr = this.f73078g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorEnabled(z);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.f73095x = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f73078g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorHeight(i);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.f73096y = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f73078g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorMarginHorizontal(i);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(C43037iy5 c43037iy5) {
        this.f73097z = c43037iy5;
        NavigationBarItemView[] navigationBarItemViewArr = this.f73078g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorDrawable(m49341f());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.f73094w = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f73078g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorWidth(i);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f73087p = drawable;
        NavigationBarItemView[] navigationBarItemViewArr = this.f73078g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.f73089r = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f73078g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(int i) {
        this.f73082k = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f73078g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setIconSize(i);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setItemOnTouchListener(int i, View.OnTouchListener onTouchListener) {
        if (onTouchListener == null) {
            this.f73076e.remove(i);
        } else {
            this.f73076e.put(i, onTouchListener);
        }
        NavigationBarItemView[] navigationBarItemViewArr = this.f73078g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                if (navigationBarItemView.mo49372e().getItemId() == i) {
                    navigationBarItemView.setOnTouchListener(onTouchListener);
                }
            }
        }
    }

    public void setItemPaddingBottom(int i) {
        this.f73092u = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f73078g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemPaddingBottom(i);
            }
        }
    }

    public void setItemPaddingTop(int i) {
        this.f73091t = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f73078g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemPaddingTop(i);
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f73088q = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f73078g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.f73086o = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f73078g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.f73083l;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f73085n = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f73078g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.f73083l;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f73083l = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f73078g;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.f73077f = i;
    }

    public void setPresenter(NavigationBarPresenter navigationBarPresenter) {
        this.f73071C = navigationBarPresenter;
    }

    /* renamed from: t */
    public void m49328t(int i) {
        int size = this.f73072D.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = this.f73072D.getItem(i2);
            if (i == item.getItemId()) {
                this.f73079h = i;
                this.f73080i = i2;
                item.setChecked(true);
                return;
            }
        }
    }

    /* renamed from: u */
    public void m49327u() {
        TransitionSet transitionSet;
        C11028e c11028e = this.f73072D;
        if (c11028e != null && this.f73078g != null) {
            int size = c11028e.size();
            if (size != this.f73078g.length) {
                m49343d();
                return;
            }
            int i = this.f73079h;
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = this.f73072D.getItem(i2);
                if (item.isChecked()) {
                    this.f73079h = item.getItemId();
                    this.f73080i = i2;
                }
            }
            if (i != this.f73079h && (transitionSet = this.f73073b) != null) {
                C12055c.m65804b(this, transitionSet);
            }
            boolean m49334n = m49334n(this.f73077f, this.f73072D.m70168G().size());
            for (int i3 = 0; i3 < size; i3++) {
                this.f73071C.m49320k(true);
                this.f73078g[i3].setLabelVisibilityMode(this.f73077f);
                this.f73078g[i3].setShifting(m49334n);
                this.f73078g[i3].mo49373d((C11032g) this.f73072D.getItem(i3), 0);
                this.f73071C.m49320k(false);
            }
        }
    }
}

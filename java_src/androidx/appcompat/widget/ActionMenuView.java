package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C11028e;
import androidx.appcompat.view.menu.C11032g;
import androidx.appcompat.view.menu.InterfaceC11037i;
import androidx.appcompat.view.menu.InterfaceC11039j;
import androidx.appcompat.widget.LinearLayoutCompat;
/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements C11028e.InterfaceC11030b, InterfaceC11039j {

    /* renamed from: b */
    public C11028e f52060b;

    /* renamed from: c */
    public Context f52061c;

    /* renamed from: d */
    public int f52062d;

    /* renamed from: e */
    public boolean f52063e;

    /* renamed from: f */
    public ActionMenuPresenter f52064f;

    /* renamed from: g */
    public InterfaceC11037i.InterfaceC11038a f52065g;

    /* renamed from: h */
    public C11028e.InterfaceC11029a f52066h;

    /* renamed from: i */
    public boolean f52067i;

    /* renamed from: j */
    public int f52068j;

    /* renamed from: k */
    public int f52069k;

    /* renamed from: l */
    public int f52070l;

    /* renamed from: m */
    public InterfaceC11062d f52071m;

    /* loaded from: classes.dex */
    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {
        @ViewDebug.ExportedProperty

        /* renamed from: a */
        public boolean f52072a;
        @ViewDebug.ExportedProperty

        /* renamed from: b */
        public int f52073b;
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public int f52074c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public boolean f52075d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public boolean f52076e;

        /* renamed from: f */
        public boolean f52077f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f52072a = layoutParams.f52072a;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f52072a = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    /* loaded from: classes.dex */
    public interface InterfaceC11059a {
        /* renamed from: a */
        boolean mo69984a();

        /* renamed from: b */
        boolean mo69983b();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    /* loaded from: classes.dex */
    public static class C11060b implements InterfaceC11037i.InterfaceC11038a {
        @Override // androidx.appcompat.view.menu.InterfaceC11037i.InterfaceC11038a
        /* renamed from: b */
        public void mo69982b(C11028e c11028e, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC11037i.InterfaceC11038a
        /* renamed from: c */
        public boolean mo69981c(C11028e c11028e) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    /* loaded from: classes.dex */
    public class C11061c implements C11028e.InterfaceC11029a {
        public C11061c() {
        }

        @Override // androidx.appcompat.view.menu.C11028e.InterfaceC11029a
        /* renamed from: a */
        public boolean mo5020a(C11028e c11028e, MenuItem menuItem) {
            InterfaceC11062d interfaceC11062d = ActionMenuView.this.f52071m;
            if (interfaceC11062d != null && interfaceC11062d.onMenuItemClick(menuItem)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.C11028e.InterfaceC11029a
        /* renamed from: b */
        public void mo5019b(C11028e c11028e) {
            C11028e.InterfaceC11029a interfaceC11029a = ActionMenuView.this.f52066h;
            if (interfaceC11029a != null) {
                interfaceC11029a.mo5019b(c11028e);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    /* loaded from: classes.dex */
    public interface InterfaceC11062d {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* renamed from: q */
    public static int m69988q(View view, int i, int i2, int i3, int i4) {
        ActionMenuItemView actionMenuItemView;
        boolean z;
        int i5;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        if (view instanceof ActionMenuItemView) {
            actionMenuItemView = (ActionMenuItemView) view;
        } else {
            actionMenuItemView = null;
        }
        boolean z2 = true;
        if (actionMenuItemView != null && actionMenuItemView.m70205f()) {
            z = true;
        } else {
            z = false;
        }
        if (i2 > 0) {
            i5 = 2;
            if (!z || i2 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i6 = measuredWidth / i;
                if (measuredWidth % i != 0) {
                    i6++;
                }
                if (!z || i6 >= 2) {
                    i5 = i6;
                }
                if (!layoutParams.f52072a || !z) {
                    z2 = false;
                }
                layoutParams.f52075d = z2;
                layoutParams.f52073b = i5;
                view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
                return i5;
            }
        }
        i5 = 0;
        if (!layoutParams.f52072a) {
        }
        z2 = false;
        layoutParams.f52075d = z2;
        layoutParams.f52073b = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11039j
    /* renamed from: a */
    public void mo49346a(C11028e c11028e) {
        this.f52060b = c11028e;
    }

    @Override // androidx.appcompat.view.menu.C11028e.InterfaceC11030b
    /* renamed from: b */
    public boolean mo70000b(C11032g c11032g) {
        return this.f52060b.m70164N(c11032g, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* renamed from: f */
    public void m69999f() {
        ActionMenuPresenter actionMenuPresenter = this.f52064f;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m70028B();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* renamed from: g */
    public LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* renamed from: h */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* renamed from: i */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutParams layoutParams2;
        if (layoutParams != null) {
            if (layoutParams instanceof LayoutParams) {
                layoutParams2 = new LayoutParams((LayoutParams) layoutParams);
            } else {
                layoutParams2 = new LayoutParams(layoutParams);
            }
            if (((LinearLayout.LayoutParams) layoutParams2).gravity <= 0) {
                ((LinearLayout.LayoutParams) layoutParams2).gravity = 16;
            }
            return layoutParams2;
        }
        return generateDefaultLayoutParams();
    }

    /* renamed from: j */
    public LayoutParams m69995j() {
        LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.f52072a = true;
        return generateDefaultLayoutParams;
    }

    /* renamed from: k */
    public Menu m69994k() {
        if (this.f52060b == null) {
            Context context = getContext();
            C11028e c11028e = new C11028e(context);
            this.f52060b = c11028e;
            c11028e.mo70074V(new C11061c());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f52064f = actionMenuPresenter;
            actionMenuPresenter.m70018L(true);
            ActionMenuPresenter actionMenuPresenter2 = this.f52064f;
            InterfaceC11037i.InterfaceC11038a interfaceC11038a = this.f52065g;
            if (interfaceC11038a == null) {
                interfaceC11038a = new C11060b();
            }
            actionMenuPresenter2.mo70079j(interfaceC11038a);
            this.f52060b.m70148c(this.f52064f, this.f52061c);
            this.f52064f.m70020J(this);
        }
        return this.f52060b;
    }

    /* renamed from: l */
    public boolean m69993l(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC11059a)) {
            z = false | ((InterfaceC11059a) childAt).mo69984a();
        }
        if (i > 0 && (childAt2 instanceof InterfaceC11059a)) {
            return z | ((InterfaceC11059a) childAt2).mo69983b();
        }
        return z;
    }

    /* renamed from: m */
    public boolean m69992m() {
        ActionMenuPresenter actionMenuPresenter = this.f52064f;
        return actionMenuPresenter != null && actionMenuPresenter.m70026D();
    }

    /* renamed from: n */
    public boolean m69991n() {
        ActionMenuPresenter actionMenuPresenter = this.f52064f;
        return actionMenuPresenter != null && actionMenuPresenter.m70024F();
    }

    /* renamed from: o */
    public boolean m69990o() {
        ActionMenuPresenter actionMenuPresenter = this.f52064f;
        return actionMenuPresenter != null && actionMenuPresenter.m70023G();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f52064f;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo49322f(false);
            if (this.f52064f.m70023G()) {
                this.f52064f.m70026D();
                this.f52064f.m70017M();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m69999f();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        if (!this.f52067i) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean m74027b = C37406Yt6.m74027b(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f52072a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m69993l(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m74027b) {
                        i6 = getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        width = i6 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                        i6 = width - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i6, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams).leftMargin) + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    m69993l(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        if (i15 > 0) {
            i5 = paddingRight / i15;
        } else {
            i5 = 0;
        }
        int max = Math.max(0, i5);
        if (m74027b) {
            int width2 = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.f52072a) {
                    int i17 = width2 - ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.f52072a) {
                int i20 = paddingLeft + ((LinearLayout.LayoutParams) layoutParams3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = i20 + measuredWidth4 + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + max;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        C11028e c11028e;
        boolean z2 = this.f52067i;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        this.f52067i = z;
        if (z2 != z) {
            this.f52068j = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f52067i && (c11028e = this.f52060b) != null && size != this.f52068j) {
            this.f52068j = size;
            c11028e.mo70165M(true);
        }
        int childCount = getChildCount();
        if (this.f52067i && childCount > 0) {
            m69987r(i, i2);
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams).rightMargin = 0;
            ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: p */
    public boolean m69989p() {
        return this.f52063e;
    }

    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* renamed from: r */
    public final void m69987r(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        int i7;
        int i8;
        boolean z5;
        int i9;
        ?? r14;
        boolean z6;
        int i10;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i11 = size - paddingLeft;
        int i12 = this.f52069k;
        int i13 = i11 / i12;
        int i14 = i11 % i12;
        if (i13 == 0) {
            setMeasuredDimension(i11, 0);
            return;
        }
        int i15 = i12 + (i14 / i13);
        int childCount = getChildCount();
        int i16 = 0;
        int i17 = 0;
        boolean z7 = false;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        long j = 0;
        while (i17 < childCount) {
            View childAt = getChildAt(i17);
            int i21 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z8 = childAt instanceof ActionMenuItemView;
                int i22 = i18 + 1;
                if (z8) {
                    int i23 = this.f52070l;
                    i9 = i22;
                    r14 = 0;
                    childAt.setPadding(i23, 0, i23, 0);
                } else {
                    i9 = i22;
                    r14 = 0;
                }
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.f52077f = r14;
                layoutParams.f52074c = r14;
                layoutParams.f52073b = r14;
                layoutParams.f52075d = r14;
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = r14;
                ((LinearLayout.LayoutParams) layoutParams).rightMargin = r14;
                if (z8 && ((ActionMenuItemView) childAt).m70205f()) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                layoutParams.f52076e = z6;
                if (layoutParams.f52072a) {
                    i10 = 1;
                } else {
                    i10 = i13;
                }
                int m69988q = m69988q(childAt, i15, i10, childMeasureSpec, paddingTop);
                i19 = Math.max(i19, m69988q);
                if (layoutParams.f52075d) {
                    i20++;
                }
                if (layoutParams.f52072a) {
                    z7 = true;
                }
                i13 -= m69988q;
                i16 = Math.max(i16, childAt.getMeasuredHeight());
                if (m69988q == 1) {
                    j |= 1 << i17;
                    i16 = i16;
                }
                i18 = i9;
            }
            i17++;
            size2 = i21;
        }
        int i24 = size2;
        if (z7 && i18 == 2) {
            z = true;
        } else {
            z = false;
        }
        boolean z9 = false;
        while (i20 > 0 && i13 > 0) {
            int i25 = Integer.MAX_VALUE;
            int i26 = 0;
            int i27 = 0;
            long j2 = 0;
            while (i27 < childCount) {
                boolean z10 = z9;
                LayoutParams layoutParams2 = (LayoutParams) getChildAt(i27).getLayoutParams();
                int i28 = i16;
                if (layoutParams2.f52075d) {
                    int i29 = layoutParams2.f52073b;
                    if (i29 < i25) {
                        j2 = 1 << i27;
                        i25 = i29;
                        i26 = 1;
                    } else if (i29 == i25) {
                        i26++;
                        j2 |= 1 << i27;
                    }
                }
                i27++;
                i16 = i28;
                z9 = z10;
            }
            z2 = z9;
            i5 = i16;
            j |= j2;
            if (i26 > i13) {
                i3 = mode;
                i4 = i11;
                break;
            }
            int i30 = i25 + 1;
            int i31 = 0;
            while (i31 < childCount) {
                View childAt2 = getChildAt(i31);
                LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                int i32 = i11;
                int i33 = mode;
                long j3 = 1 << i31;
                if ((j2 & j3) == 0) {
                    if (layoutParams3.f52073b == i30) {
                        j |= j3;
                    }
                    z5 = z;
                } else {
                    if (z && layoutParams3.f52076e && i13 == 1) {
                        int i34 = this.f52070l;
                        z5 = z;
                        childAt2.setPadding(i34 + i15, 0, i34, 0);
                    } else {
                        z5 = z;
                    }
                    layoutParams3.f52073b++;
                    layoutParams3.f52077f = true;
                    i13--;
                }
                i31++;
                mode = i33;
                i11 = i32;
                z = z5;
            }
            i16 = i5;
            z9 = true;
        }
        i3 = mode;
        i4 = i11;
        z2 = z9;
        i5 = i16;
        if (!z7 && i18 == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (i13 > 0 && j != 0 && (i13 < i18 - 1 || z3 || i19 > 1)) {
            float bitCount = Long.bitCount(j);
            if (!z3) {
                i6 = 0;
                if ((j & 1) != 0 && !((LayoutParams) getChildAt(0).getLayoutParams()).f52076e) {
                    bitCount -= 0.5f;
                }
                int i35 = childCount - 1;
                if ((j & (1 << i35)) != 0 && !((LayoutParams) getChildAt(i35).getLayoutParams()).f52076e) {
                    bitCount -= 0.5f;
                }
            } else {
                i6 = 0;
            }
            if (bitCount > 0.0f) {
                i8 = (int) ((i13 * i15) / bitCount);
            } else {
                i8 = i6;
            }
            z4 = z2;
            for (int i36 = i6; i36 < childCount; i36++) {
                if ((j & (1 << i36)) != 0) {
                    View childAt3 = getChildAt(i36);
                    LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams4.f52074c = i8;
                        layoutParams4.f52077f = true;
                        if (i36 == 0 && !layoutParams4.f52076e) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = (-i8) / 2;
                        }
                        z4 = true;
                    } else if (layoutParams4.f52072a) {
                        layoutParams4.f52074c = i8;
                        layoutParams4.f52077f = true;
                        ((LinearLayout.LayoutParams) layoutParams4).rightMargin = (-i8) / 2;
                        z4 = true;
                    } else {
                        if (i36 != 0) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = i8 / 2;
                        }
                        if (i36 != childCount - 1) {
                            ((LinearLayout.LayoutParams) layoutParams4).rightMargin = i8 / 2;
                        }
                    }
                }
            }
        } else {
            i6 = 0;
            z4 = z2;
        }
        if (z4) {
            for (int i37 = i6; i37 < childCount; i37++) {
                View childAt4 = getChildAt(i37);
                LayoutParams layoutParams5 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams5.f52077f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams5.f52073b * i15) + layoutParams5.f52074c, 1073741824), childMeasureSpec);
                }
            }
        }
        if (i3 != 1073741824) {
            i7 = i5;
        } else {
            i7 = i24;
        }
        setMeasuredDimension(i4, i7);
    }

    /* renamed from: s */
    public C11028e m69986s() {
        return this.f52060b;
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f52064f.m70021I(z);
    }

    public void setMenuCallbacks(InterfaceC11037i.InterfaceC11038a interfaceC11038a, C11028e.InterfaceC11029a interfaceC11029a) {
        this.f52065g = interfaceC11038a;
        this.f52066h = interfaceC11029a;
    }

    public void setOnMenuItemClickListener(InterfaceC11062d interfaceC11062d) {
        this.f52071m = interfaceC11062d;
    }

    public void setOverflowIcon(Drawable drawable) {
        m69994k();
        this.f52064f.m70019K(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.f52063e = z;
    }

    public void setPopupTheme(int i) {
        if (this.f52062d != i) {
            this.f52062d = i;
            if (i == 0) {
                this.f52061c = getContext();
            } else {
                this.f52061c = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f52064f = actionMenuPresenter;
        actionMenuPresenter.m70020J(this);
    }

    /* renamed from: t */
    public boolean m69985t() {
        ActionMenuPresenter actionMenuPresenter = this.f52064f;
        return actionMenuPresenter != null && actionMenuPresenter.m70017M();
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f52069k = (int) (56.0f * f);
        this.f52070l = (int) (f * 4.0f);
        this.f52061c = context;
        this.f52062d = 0;
    }
}

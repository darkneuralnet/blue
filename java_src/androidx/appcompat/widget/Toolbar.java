package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.menu.C11028e;
import androidx.appcompat.view.menu.C11032g;
import androidx.appcompat.view.menu.InterfaceC11037i;
import androidx.appcompat.view.menu.SubMenuC11044l;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.time.DurationKt;
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements VP2 {

    /* renamed from: A */
    public ColorStateList f52319A;

    /* renamed from: B */
    public ColorStateList f52320B;

    /* renamed from: C */
    public boolean f52321C;

    /* renamed from: D */
    public boolean f52322D;

    /* renamed from: E */
    public final ArrayList<View> f52323E;

    /* renamed from: F */
    public final ArrayList<View> f52324F;

    /* renamed from: G */
    public final int[] f52325G;

    /* renamed from: H */
    public final YP2 f52326H;

    /* renamed from: I */
    public ArrayList<MenuItem> f52327I;

    /* renamed from: J */
    public InterfaceC11133g f52328J;

    /* renamed from: K */
    public final ActionMenuView.InterfaceC11062d f52329K;

    /* renamed from: P */
    public C11135a f52330P;

    /* renamed from: Q */
    public ActionMenuPresenter f52331Q;

    /* renamed from: R */
    public C11132f f52332R;

    /* renamed from: S */
    public InterfaceC11037i.InterfaceC11038a f52333S;

    /* renamed from: T */
    public C11028e.InterfaceC11029a f52334T;

    /* renamed from: U */
    public boolean f52335U;

    /* renamed from: W */
    public OnBackInvokedCallback f52336W;

    /* renamed from: b */
    public ActionMenuView f52337b;

    /* renamed from: c */
    public TextView f52338c;

    /* renamed from: d */
    public TextView f52339d;

    /* renamed from: e */
    public ImageButton f52340e;

    /* renamed from: f */
    public ImageView f52341f;

    /* renamed from: g */
    public Drawable f52342g;

    /* renamed from: h */
    public CharSequence f52343h;

    /* renamed from: i */
    public ImageButton f52344i;

    /* renamed from: j */
    public View f52345j;

    /* renamed from: k */
    public Context f52346k;

    /* renamed from: l */
    public int f52347l;

    /* renamed from: m */
    public int f52348m;

    /* renamed from: n */
    public int f52349n;

    /* renamed from: o */
    public int f52350o;

    /* renamed from: p */
    public int f52351p;

    /* renamed from: p0 */
    public OnBackInvokedDispatcher f52352p0;

    /* renamed from: q */
    public int f52353q;

    /* renamed from: q0 */
    public boolean f52354q0;

    /* renamed from: r */
    public int f52355r;

    /* renamed from: r0 */
    public final Runnable f52356r0;

    /* renamed from: s */
    public int f52357s;

    /* renamed from: t */
    public int f52358t;

    /* renamed from: u */
    public C39863dd5 f52359u;

    /* renamed from: v */
    public int f52360v;

    /* renamed from: w */
    public int f52361w;

    /* renamed from: x */
    public int f52362x;

    /* renamed from: y */
    public CharSequence f52363y;

    /* renamed from: z */
    public CharSequence f52364z;

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    /* loaded from: classes.dex */
    public class C11127a implements ActionMenuView.InterfaceC11062d {
        public C11127a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC11062d
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.f52326H.m75099j(menuItem)) {
                return true;
            }
            InterfaceC11133g interfaceC11133g = Toolbar.this.f52328J;
            if (interfaceC11133g != null) {
                return interfaceC11133g.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    /* loaded from: classes.dex */
    public class RunnableC11128b implements Runnable {
        public RunnableC11128b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.m69764f0();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    /* loaded from: classes.dex */
    public class C11129c implements C11028e.InterfaceC11029a {
        public C11129c() {
        }

        @Override // androidx.appcompat.view.menu.C11028e.InterfaceC11029a
        /* renamed from: a */
        public boolean mo5020a(C11028e c11028e, MenuItem menuItem) {
            C11028e.InterfaceC11029a interfaceC11029a = Toolbar.this.f52334T;
            if (interfaceC11029a != null && interfaceC11029a.mo5020a(c11028e, menuItem)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.C11028e.InterfaceC11029a
        /* renamed from: b */
        public void mo5019b(C11028e c11028e) {
            if (!Toolbar.this.f52337b.m69990o()) {
                Toolbar.this.f52326H.m75098k(c11028e);
            }
            C11028e.InterfaceC11029a interfaceC11029a = Toolbar.this.f52334T;
            if (interfaceC11029a != null) {
                interfaceC11029a.mo5019b(c11028e);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC11130d implements View.OnClickListener {
        public View$OnClickListenerC11130d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.m69765f();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    /* loaded from: classes.dex */
    public static class C11131e {
        private C11131e() {
        }

        /* renamed from: a */
        public static OnBackInvokedDispatcher m69738a(View view) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
            return findOnBackInvokedDispatcher;
        }

        /* renamed from: b */
        public static OnBackInvokedCallback m69737b(final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: z56
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        /* renamed from: c */
        public static void m69736c(Object obj, Object obj2) {
            C36800We3.m78054a(obj).registerOnBackInvokedCallback(DurationKt.NANOS_IN_MILLIS, C37034Xe3.m76742a(obj2));
        }

        /* renamed from: d */
        public static void m69735d(Object obj, Object obj2) {
            C36800We3.m78054a(obj).unregisterOnBackInvokedCallback(C37034Xe3.m76742a(obj2));
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    /* loaded from: classes.dex */
    public class C11132f implements InterfaceC11037i {

        /* renamed from: b */
        public C11028e f52372b;

        /* renamed from: c */
        public C11032g f52373c;

        public C11132f() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC11037i
        /* renamed from: b */
        public void mo49325b(C11028e c11028e, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC11037i
        /* renamed from: d */
        public boolean mo12399d(C11028e c11028e, C11032g c11032g) {
            Toolbar.this.m69761h();
            ViewParent parent = Toolbar.this.f52344i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f52344i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f52344i);
            }
            Toolbar.this.f52345j = c11032g.getActionView();
            this.f52373c = c11032g;
            ViewParent parent2 = Toolbar.this.f52345j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f52345j);
                }
                LayoutParams generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f51478a = (toolbar4.f52350o & 112) | 8388611;
                generateDefaultLayoutParams.f52365b = 2;
                toolbar4.f52345j.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f52345j);
            }
            Toolbar.this.m69770c0();
            Toolbar.this.requestLayout();
            c11032g.m70103r(true);
            View view = Toolbar.this.f52345j;
            if (view instanceof InterfaceC36860Wl0) {
                ((InterfaceC36860Wl0) view).onActionViewExpanded();
            }
            Toolbar.this.m69762g0();
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC11037i
        /* renamed from: e */
        public Parcelable mo49323e() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC11037i
        /* renamed from: f */
        public void mo49322f(boolean z) {
            if (this.f52373c != null) {
                C11028e c11028e = this.f52372b;
                boolean z2 = false;
                if (c11028e != null) {
                    int size = c11028e.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f52372b.getItem(i) == this.f52373c) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo12398h(this.f52372b, this.f52373c);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC11037i
        /* renamed from: g */
        public boolean mo49321g() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC11037i
        public int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC11037i
        /* renamed from: h */
        public boolean mo12398h(C11028e c11028e, C11032g c11032g) {
            View view = Toolbar.this.f52345j;
            if (view instanceof InterfaceC36860Wl0) {
                ((InterfaceC36860Wl0) view).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f52345j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f52344i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f52345j = null;
            toolbar3.m69773b();
            this.f52373c = null;
            Toolbar.this.requestLayout();
            c11032g.m70103r(false);
            Toolbar.this.m69762g0();
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC11037i
        /* renamed from: i */
        public void mo12397i(Context context, C11028e c11028e) {
            C11032g c11032g;
            C11028e c11028e2 = this.f52372b;
            if (c11028e2 != null && (c11032g = this.f52373c) != null) {
                c11028e2.mo70073f(c11032g);
            }
            this.f52372b = c11028e;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC11037i
        /* renamed from: l */
        public void mo49319l(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC11037i
        /* renamed from: m */
        public boolean mo49318m(SubMenuC11044l subMenuC11044l) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$g */
    /* loaded from: classes.dex */
    public interface InterfaceC11133g {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    /* renamed from: D */
    private MenuInflater m69796D() {
        return new C39177cV5(getContext());
    }

    /* renamed from: A */
    public final int m69799A(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C39093cM2.m61542b(marginLayoutParams) + C39093cM2.m61543a(marginLayoutParams);
    }

    /* renamed from: B */
    public Drawable m69798B() {
        ImageView imageView = this.f52341f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    /* renamed from: C */
    public Menu m69797C() {
        m69758k();
        return this.f52337b.m69994k();
    }

    /* renamed from: E */
    public CharSequence m69795E() {
        ImageButton imageButton = this.f52340e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    /* renamed from: F */
    public Drawable m69794F() {
        ImageButton imageButton = this.f52340e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* renamed from: G */
    public CharSequence m69793G() {
        return this.f52364z;
    }

    /* renamed from: H */
    public CharSequence m69792H() {
        return this.f52363y;
    }

    /* renamed from: I */
    public int m69791I() {
        return this.f52358t;
    }

    /* renamed from: J */
    public int m69790J() {
        return this.f52355r;
    }

    /* renamed from: K */
    public int m69789K() {
        return this.f52353q;
    }

    /* renamed from: L */
    public int m69788L() {
        return this.f52357s;
    }

    /* renamed from: M */
    public final int m69787M(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: N */
    public final int m69786N(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            View view = list.get(i3);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - i;
            int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - i2;
            int max = Math.max(0, i5);
            int max2 = Math.max(0, i6);
            int max3 = Math.max(0, -i5);
            int max4 = Math.max(0, -i6);
            i4 += max + view.getMeasuredWidth() + max2;
            i3++;
            i2 = max4;
            i = max3;
        }
        return i4;
    }

    /* renamed from: O */
    public JV0 m69785O() {
        if (this.f52330P == null) {
            this.f52330P = new C11135a(this, true);
        }
        return this.f52330P;
    }

    /* renamed from: P */
    public boolean m69784P() {
        C11132f c11132f = this.f52332R;
        return (c11132f == null || c11132f.f52373c == null) ? false : true;
    }

    /* renamed from: Q */
    public boolean m69783Q() {
        ActionMenuView actionMenuView = this.f52337b;
        return actionMenuView != null && actionMenuView.m69992m();
    }

    /* renamed from: R */
    public void mo49230R(int i) {
        m69796D().inflate(i, m69797C());
    }

    /* renamed from: S */
    public void m69782S() {
        Iterator<MenuItem> it = this.f52327I.iterator();
        while (it.hasNext()) {
            m69797C().removeItem(it.next().getItemId());
        }
        m69774a0();
    }

    /* renamed from: T */
    public final boolean m69781T(View view) {
        return view.getParent() == this || this.f52324F.contains(view);
    }

    /* renamed from: U */
    public boolean m69780U() {
        ActionMenuView actionMenuView = this.f52337b;
        return actionMenuView != null && actionMenuView.m69991n();
    }

    /* renamed from: V */
    public boolean m69779V() {
        ActionMenuView actionMenuView = this.f52337b;
        return actionMenuView != null && actionMenuView.m69990o();
    }

    /* renamed from: W */
    public final int m69778W(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int m69751r = m69751r(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, m69751r, max + measuredWidth, view.getMeasuredHeight() + m69751r);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    /* renamed from: X */
    public final int m69777X(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int m69751r = m69751r(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, m69751r, max, view.getMeasuredHeight() + m69751r);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
    }

    /* renamed from: Y */
    public final int m69776Y(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: Z */
    public final void m69775Z(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: a0 */
    public final void m69774a0() {
        Menu m69797C = m69797C();
        ArrayList<MenuItem> m69743z = m69743z();
        this.f52326H.m75101h(m69797C, m69796D());
        ArrayList<MenuItem> m69743z2 = m69743z();
        m69743z2.removeAll(m69743z);
        this.f52327I = m69743z2;
    }

    @Override // p000.VP2
    public void addMenuProvider(InterfaceC50411vQ2 interfaceC50411vQ2) {
        this.f52326H.m75106c(interfaceC50411vQ2);
    }

    /* renamed from: b */
    public void m69773b() {
        for (int size = this.f52324F.size() - 1; size >= 0; size--) {
            addView(this.f52324F.get(size));
        }
        this.f52324F.clear();
    }

    /* renamed from: b0 */
    public final void m69772b0() {
        removeCallbacks(this.f52356r0);
        post(this.f52356r0);
    }

    /* renamed from: c */
    public final void m69771c(List<View> list, int i) {
        boolean z;
        if (C38790bq6.m62548D(this) == 1) {
            z = true;
        } else {
            z = false;
        }
        int childCount = getChildCount();
        int m75415b = YD1.m75415b(i, C38790bq6.m62548D(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f52365b == 0 && m69766e0(childAt) && m69752q(layoutParams.f51478a) == m75415b) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.f52365b == 0 && m69766e0(childAt2) && m69752q(layoutParams2.f51478a) == m75415b) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: c0 */
    public void m69770c0() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((LayoutParams) childAt.getLayoutParams()).f52365b != 2 && childAt != this.f52337b) {
                removeViewAt(childCount);
                this.f52324F.add(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    /* renamed from: d */
    public final void m69769d(View view, boolean z) {
        LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams2)) {
            layoutParams = generateLayoutParams(layoutParams2);
        } else {
            layoutParams = (LayoutParams) layoutParams2;
        }
        layoutParams.f52365b = 1;
        if (z && this.f52345j != null) {
            view.setLayoutParams(layoutParams);
            this.f52324F.add(view);
            return;
        }
        addView(view, layoutParams);
    }

    /* renamed from: d0 */
    public final boolean m69768d0() {
        if (!this.f52335U) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m69766e0(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public boolean m69767e() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f52337b) != null && actionMenuView.m69989p();
    }

    /* renamed from: e0 */
    public final boolean m69766e0(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: f */
    public void m69765f() {
        C11032g c11032g;
        C11132f c11132f = this.f52332R;
        if (c11132f == null) {
            c11032g = null;
        } else {
            c11032g = c11132f.f52373c;
        }
        if (c11032g != null) {
            c11032g.collapseActionView();
        }
    }

    /* renamed from: f0 */
    public boolean m69764f0() {
        ActionMenuView actionMenuView = this.f52337b;
        return actionMenuView != null && actionMenuView.m69985t();
    }

    /* renamed from: g */
    public void m69763g() {
        ActionMenuView actionMenuView = this.f52337b;
        if (actionMenuView != null) {
            actionMenuView.m69999f();
        }
    }

    /* renamed from: g0 */
    void m69762g0() {
        boolean z;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher m69738a = C11131e.m69738a(this);
            if (m69784P() && m69738a != null && C38790bq6.m62506Y(this) && this.f52354q0) {
                z = true;
            } else {
                z = false;
            }
            if (z && this.f52352p0 == null) {
                if (this.f52336W == null) {
                    this.f52336W = C11131e.m69737b(new Runnable() { // from class: x56
                        @Override // java.lang.Runnable
                        public final void run() {
                            Toolbar.this.m69765f();
                        }
                    });
                }
                C11131e.m69736c(m69738a, this.f52336W);
                this.f52352p0 = m69738a;
            } else if (!z && (onBackInvokedDispatcher = this.f52352p0) != null) {
                C11131e.m69735d(onBackInvokedDispatcher, this.f52336W);
                this.f52352p0 = null;
            }
        }
    }

    /* renamed from: h */
    public void m69761h() {
        if (this.f52344i == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, C50553vf4.toolbarNavigationButtonStyle);
            this.f52344i = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f52342g);
            this.f52344i.setContentDescription(this.f52343h);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f51478a = (this.f52350o & 112) | 8388611;
            generateDefaultLayoutParams.f52365b = 2;
            this.f52344i.setLayoutParams(generateDefaultLayoutParams);
            this.f52344i.setOnClickListener(new View$OnClickListenerC11130d());
        }
    }

    /* renamed from: i */
    public final void m69760i() {
        if (this.f52359u == null) {
            this.f52359u = new C39863dd5();
        }
    }

    /* renamed from: j */
    public final void m69759j() {
        if (this.f52341f == null) {
            this.f52341f = new AppCompatImageView(getContext());
        }
    }

    /* renamed from: k */
    public final void m69758k() {
        m69757l();
        if (this.f52337b.m69986s() == null) {
            C11028e c11028e = (C11028e) this.f52337b.m69994k();
            if (this.f52332R == null) {
                this.f52332R = new C11132f();
            }
            this.f52337b.setExpandedActionViewsExclusive(true);
            c11028e.m70148c(this.f52332R, this.f52346k);
            m69762g0();
        }
    }

    /* renamed from: l */
    public final void m69757l() {
        if (this.f52337b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f52337b = actionMenuView;
            actionMenuView.setPopupTheme(this.f52347l);
            this.f52337b.setOnMenuItemClickListener(this.f52329K);
            this.f52337b.setMenuCallbacks(this.f52333S, new C11129c());
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f51478a = (this.f52350o & 112) | 8388613;
            this.f52337b.setLayoutParams(generateDefaultLayoutParams);
            m69769d(this.f52337b, false);
        }
    }

    /* renamed from: m */
    public final void m69756m() {
        if (this.f52340e == null) {
            this.f52340e = new AppCompatImageButton(getContext(), null, C50553vf4.toolbarNavigationButtonStyle);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f51478a = (this.f52350o & 112) | 8388611;
            this.f52340e.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: n */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: o */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m69762g0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f52356r0);
        m69762g0();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f52322D = false;
        }
        if (!this.f52322D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f52322D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f52322D = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x029f A[LOOP:0: B:104:0x029d->B:105:0x029f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c1 A[LOOP:1: B:107:0x02bf->B:108:0x02c1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02fa A[LOOP:2: B:116:0x02f8->B:117:0x02fa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0227  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5;
        int i6;
        int i7;
        boolean m69766e0;
        boolean m69766e02;
        int i8;
        int i9;
        int i10;
        TextView textView;
        TextView textView2;
        boolean z3;
        int i11;
        int i12;
        int i13;
        int i14;
        int paddingTop;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int size;
        int i22;
        int size2;
        int i23;
        int i24;
        int size3;
        if (C38790bq6.m62548D(this) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i25 = width - paddingRight;
        int[] iArr = this.f52325G;
        iArr[1] = 0;
        iArr[0] = 0;
        int m62546E = C38790bq6.m62546E(this);
        if (m62546E >= 0) {
            i5 = Math.min(m62546E, i4 - i2);
        } else {
            i5 = 0;
        }
        if (m69766e0(this.f52340e)) {
            if (z2) {
                i7 = m69777X(this.f52340e, i25, iArr, i5);
                i6 = paddingLeft;
                if (m69766e0(this.f52344i)) {
                    if (z2) {
                        i7 = m69777X(this.f52344i, i7, iArr, i5);
                    } else {
                        i6 = m69778W(this.f52344i, i6, iArr, i5);
                    }
                }
                if (m69766e0(this.f52337b)) {
                    if (z2) {
                        i6 = m69778W(this.f52337b, i6, iArr, i5);
                    } else {
                        i7 = m69777X(this.f52337b, i7, iArr, i5);
                    }
                }
                int m69746w = m69746w();
                int m69745x = m69745x();
                iArr[0] = Math.max(0, m69746w - i6);
                iArr[1] = Math.max(0, m69745x - (i25 - i7));
                int max = Math.max(i6, m69746w);
                int min = Math.min(i7, i25 - m69745x);
                if (m69766e0(this.f52345j)) {
                    if (z2) {
                        min = m69777X(this.f52345j, min, iArr, i5);
                    } else {
                        max = m69778W(this.f52345j, max, iArr, i5);
                    }
                }
                if (m69766e0(this.f52341f)) {
                    if (z2) {
                        min = m69777X(this.f52341f, min, iArr, i5);
                    } else {
                        max = m69778W(this.f52341f, max, iArr, i5);
                    }
                }
                m69766e0 = m69766e0(this.f52338c);
                m69766e02 = m69766e0(this.f52339d);
                if (!m69766e0) {
                    LayoutParams layoutParams = (LayoutParams) this.f52338c.getLayoutParams();
                    i8 = paddingRight;
                    i9 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.f52338c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + 0;
                } else {
                    i8 = paddingRight;
                    i9 = 0;
                }
                if (!m69766e02) {
                    LayoutParams layoutParams2 = (LayoutParams) this.f52339d.getLayoutParams();
                    i10 = width;
                    i9 += ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + this.f52339d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                } else {
                    i10 = width;
                }
                if (m69766e0 && !m69766e02) {
                    i12 = paddingLeft;
                    i14 = i5;
                } else {
                    if (!m69766e0) {
                        textView = this.f52338c;
                    } else {
                        textView = this.f52339d;
                    }
                    if (!m69766e02) {
                        textView2 = this.f52339d;
                    } else {
                        textView2 = this.f52338c;
                    }
                    LayoutParams layoutParams3 = (LayoutParams) textView.getLayoutParams();
                    LayoutParams layoutParams4 = (LayoutParams) textView2.getLayoutParams();
                    if ((!m69766e0 && this.f52338c.getMeasuredWidth() > 0) || (m69766e02 && this.f52339d.getMeasuredWidth() > 0)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    i11 = this.f52362x & 112;
                    i12 = paddingLeft;
                    if (i11 == 48) {
                        if (i11 != 80) {
                            int i26 = (((height - paddingTop2) - paddingBottom) - i9) / 2;
                            int i27 = ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin;
                            i14 = i5;
                            int i28 = this.f52357s;
                            i13 = max;
                            if (i26 < i27 + i28) {
                                i26 = i27 + i28;
                            } else {
                                int i29 = (((height - paddingBottom) - i9) - i26) - paddingTop2;
                                int i30 = ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin;
                                int i31 = this.f52358t;
                                if (i29 < i30 + i31) {
                                    i26 = Math.max(0, i26 - ((((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin + i31) - i29));
                                }
                            }
                            paddingTop = paddingTop2 + i26;
                        } else {
                            i13 = max;
                            i14 = i5;
                            paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin) - this.f52358t) - i9;
                        }
                    } else {
                        i13 = max;
                        i14 = i5;
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin + this.f52357s;
                    }
                    if (!z2) {
                        if (z3) {
                            i19 = this.f52353q;
                        } else {
                            i19 = 0;
                        }
                        int i32 = i19 - iArr[1];
                        min -= Math.max(0, i32);
                        iArr[1] = Math.max(0, -i32);
                        if (m69766e0) {
                            int measuredWidth = min - this.f52338c.getMeasuredWidth();
                            int measuredHeight = this.f52338c.getMeasuredHeight() + paddingTop;
                            this.f52338c.layout(measuredWidth, paddingTop, min, measuredHeight);
                            i20 = measuredWidth - this.f52355r;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f52338c.getLayoutParams())).bottomMargin;
                        } else {
                            i20 = min;
                        }
                        if (m69766e02) {
                            int i33 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f52339d.getLayoutParams())).topMargin;
                            this.f52339d.layout(min - this.f52339d.getMeasuredWidth(), i33, min, this.f52339d.getMeasuredHeight() + i33);
                            i21 = min - this.f52355r;
                        } else {
                            i21 = min;
                        }
                        if (z3) {
                            min = Math.min(i20, i21);
                        }
                        max = i13;
                    } else {
                        if (z3) {
                            i16 = this.f52353q;
                            i15 = 0;
                        } else {
                            i15 = 0;
                            i16 = 0;
                        }
                        int i34 = i16 - iArr[i15];
                        max = i13 + Math.max(i15, i34);
                        iArr[i15] = Math.max(i15, -i34);
                        if (m69766e0) {
                            int measuredWidth2 = this.f52338c.getMeasuredWidth() + max;
                            int measuredHeight2 = this.f52338c.getMeasuredHeight() + paddingTop;
                            this.f52338c.layout(max, paddingTop, measuredWidth2, measuredHeight2);
                            i17 = measuredWidth2 + this.f52355r;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f52338c.getLayoutParams())).bottomMargin;
                        } else {
                            i17 = max;
                        }
                        if (m69766e02) {
                            int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f52339d.getLayoutParams())).topMargin;
                            int measuredWidth3 = this.f52339d.getMeasuredWidth() + max;
                            this.f52339d.layout(max, i35, measuredWidth3, this.f52339d.getMeasuredHeight() + i35);
                            i18 = measuredWidth3 + this.f52355r;
                        } else {
                            i18 = max;
                        }
                        if (z3) {
                            max = Math.max(i17, i18);
                        }
                        m69771c(this.f52323E, 3);
                        size = this.f52323E.size();
                        for (i22 = i15; i22 < size; i22++) {
                            max = m69778W(this.f52323E.get(i22), max, iArr, i14);
                        }
                        int i36 = i14;
                        m69771c(this.f52323E, 5);
                        size2 = this.f52323E.size();
                        for (i23 = i15; i23 < size2; i23++) {
                            min = m69777X(this.f52323E.get(i23), min, iArr, i36);
                        }
                        m69771c(this.f52323E, 1);
                        int m69786N = m69786N(this.f52323E, iArr);
                        i24 = (i12 + (((i10 - i12) - i8) / 2)) - (m69786N / 2);
                        int i37 = m69786N + i24;
                        if (i24 >= max) {
                            if (i37 > min) {
                                max = i24 - (i37 - min);
                            } else {
                                max = i24;
                            }
                        }
                        size3 = this.f52323E.size();
                        while (i15 < size3) {
                            max = m69778W(this.f52323E.get(i15), max, iArr, i36);
                            i15++;
                        }
                        this.f52323E.clear();
                        return;
                    }
                }
                i15 = 0;
                m69771c(this.f52323E, 3);
                size = this.f52323E.size();
                while (i22 < size) {
                }
                int i362 = i14;
                m69771c(this.f52323E, 5);
                size2 = this.f52323E.size();
                while (i23 < size2) {
                }
                m69771c(this.f52323E, 1);
                int m69786N2 = m69786N(this.f52323E, iArr);
                i24 = (i12 + (((i10 - i12) - i8) / 2)) - (m69786N2 / 2);
                int i372 = m69786N2 + i24;
                if (i24 >= max) {
                }
                size3 = this.f52323E.size();
                while (i15 < size3) {
                }
                this.f52323E.clear();
                return;
            }
            i6 = m69778W(this.f52340e, paddingLeft, iArr, i5);
        } else {
            i6 = paddingLeft;
        }
        i7 = i25;
        if (m69766e0(this.f52344i)) {
        }
        if (m69766e0(this.f52337b)) {
        }
        int m69746w2 = m69746w();
        int m69745x2 = m69745x();
        iArr[0] = Math.max(0, m69746w2 - i6);
        iArr[1] = Math.max(0, m69745x2 - (i25 - i7));
        int max2 = Math.max(i6, m69746w2);
        int min2 = Math.min(i7, i25 - m69745x2);
        if (m69766e0(this.f52345j)) {
        }
        if (m69766e0(this.f52341f)) {
        }
        m69766e0 = m69766e0(this.f52338c);
        m69766e02 = m69766e0(this.f52339d);
        if (!m69766e0) {
        }
        if (!m69766e02) {
        }
        if (m69766e0) {
        }
        if (!m69766e0) {
        }
        if (!m69766e02) {
        }
        LayoutParams layoutParams32 = (LayoutParams) textView.getLayoutParams();
        LayoutParams layoutParams42 = (LayoutParams) textView2.getLayoutParams();
        if (!m69766e0) {
        }
        z3 = false;
        i11 = this.f52362x & 112;
        i12 = paddingLeft;
        if (i11 == 48) {
        }
        if (!z2) {
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f52325G;
        boolean m74027b = C37406Yt6.m74027b(this);
        int i10 = 0;
        int i11 = !m74027b ? 1 : 0;
        if (m69766e0(this.f52340e)) {
            m69775Z(this.f52340e, i, 0, i2, 0, this.f52351p);
            i3 = this.f52340e.getMeasuredWidth() + m69799A(this.f52340e);
            i4 = Math.max(0, this.f52340e.getMeasuredHeight() + m69787M(this.f52340e));
            i5 = View.combineMeasuredStates(0, this.f52340e.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (m69766e0(this.f52344i)) {
            m69775Z(this.f52344i, i, 0, i2, 0, this.f52351p);
            i3 = this.f52344i.getMeasuredWidth() + m69799A(this.f52344i);
            i4 = Math.max(i4, this.f52344i.getMeasuredHeight() + m69787M(this.f52344i));
            i5 = View.combineMeasuredStates(i5, this.f52344i.getMeasuredState());
        }
        int m69744y = m69744y();
        int max = 0 + Math.max(m69744y, i3);
        iArr[m74027b ? 1 : 0] = Math.max(0, m69744y - i3);
        if (m69766e0(this.f52337b)) {
            m69775Z(this.f52337b, i, max, i2, 0, this.f52351p);
            i6 = this.f52337b.getMeasuredWidth() + m69799A(this.f52337b);
            i4 = Math.max(i4, this.f52337b.getMeasuredHeight() + m69787M(this.f52337b));
            i5 = View.combineMeasuredStates(i5, this.f52337b.getMeasuredState());
        } else {
            i6 = 0;
        }
        int m69747v = m69747v();
        int max2 = max + Math.max(m69747v, i6);
        iArr[i11] = Math.max(0, m69747v - i6);
        if (m69766e0(this.f52345j)) {
            max2 += m69776Y(this.f52345j, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f52345j.getMeasuredHeight() + m69787M(this.f52345j));
            i5 = View.combineMeasuredStates(i5, this.f52345j.getMeasuredState());
        }
        if (m69766e0(this.f52341f)) {
            max2 += m69776Y(this.f52341f, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f52341f.getMeasuredHeight() + m69787M(this.f52341f));
            i5 = View.combineMeasuredStates(i5, this.f52341f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((LayoutParams) childAt.getLayoutParams()).f52365b == 0 && m69766e0(childAt)) {
                max2 += m69776Y(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + m69787M(childAt));
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i13 = this.f52357s + this.f52358t;
        int i14 = this.f52353q + this.f52355r;
        if (m69766e0(this.f52338c)) {
            m69776Y(this.f52338c, i, max2 + i14, i2, i13, iArr);
            int measuredWidth = this.f52338c.getMeasuredWidth() + m69799A(this.f52338c);
            i7 = this.f52338c.getMeasuredHeight() + m69787M(this.f52338c);
            i8 = View.combineMeasuredStates(i5, this.f52338c.getMeasuredState());
            i9 = measuredWidth;
        } else {
            i7 = 0;
            i8 = i5;
            i9 = 0;
        }
        if (m69766e0(this.f52339d)) {
            i9 = Math.max(i9, m69776Y(this.f52339d, i, max2 + i14, i2, i7 + i13, iArr));
            i7 += this.f52339d.getMeasuredHeight() + m69787M(this.f52339d);
            i8 = View.combineMeasuredStates(i8, this.f52339d.getMeasuredState());
        }
        int max3 = Math.max(i4, i7);
        int paddingLeft = max2 + i9 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, (-16777216) & i8);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, i8 << 16);
        if (!m69768d0()) {
            i10 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        C11028e c11028e;
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m67617a());
        ActionMenuView actionMenuView = this.f52337b;
        if (actionMenuView != null) {
            c11028e = actionMenuView.m69986s();
        } else {
            c11028e = null;
        }
        int i = savedState.f52366d;
        if (i != 0 && this.f52332R != null && c11028e != null && (findItem = c11028e.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (savedState.f52367e) {
            m69772b0();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        m69760i();
        C39863dd5 c39863dd5 = this.f52359u;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        c39863dd5.m44003d(z);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C11032g c11032g;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C11132f c11132f = this.f52332R;
        if (c11132f != null && (c11032g = c11132f.f52373c) != null) {
            savedState.f52366d = c11032g.getItemId();
        }
        savedState.f52367e = m69779V();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f52321C = false;
        }
        if (!this.f52321C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f52321C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f52321C = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    /* renamed from: p */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ActionBar.LayoutParams) {
            return new LayoutParams((ActionBar.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* renamed from: q */
    public final int m69752q(int i) {
        int m62548D = C38790bq6.m62548D(this);
        int m75415b = YD1.m75415b(i, m62548D) & 7;
        if (m75415b != 1 && m75415b != 3 && m75415b != 5) {
            if (m62548D != 1) {
                return 3;
            }
            return 5;
        }
        return m75415b;
    }

    /* renamed from: r */
    public final int m69751r(View view, int i) {
        int i2;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i > 0) {
            i2 = (measuredHeight - i) / 2;
        } else {
            i2 = 0;
        }
        int m69750s = m69750s(layoutParams.f51478a);
        if (m69750s != 48) {
            if (m69750s != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                if (i3 < i4) {
                    i3 = i4;
                } else {
                    int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
                    int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    if (i5 < i6) {
                        i3 = Math.max(0, i3 - (i6 - i5));
                    }
                }
                return paddingTop + i3;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - i2;
        }
        return getPaddingTop() - i2;
    }

    @Override // p000.VP2
    public void removeMenuProvider(InterfaceC50411vQ2 interfaceC50411vQ2) {
        this.f52326H.m75097l(interfaceC50411vQ2);
    }

    /* renamed from: s */
    public final int m69750s(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.f52362x & 112;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.f52354q0 != z) {
            this.f52354q0 = z;
            m69762g0();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C29611vi.m8248b(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.f52335U = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f52361w) {
            this.f52361w = i;
            if (m69794F() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f52360v) {
            this.f52360v = i;
            if (m69794F() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int i, int i2) {
        m69760i();
        this.f52359u.m44004c(i, i2);
    }

    public void setContentInsetsRelative(int i, int i2) {
        m69760i();
        this.f52359u.m44002e(i, i2);
    }

    public void setLogo(int i) {
        setLogo(C29611vi.m8248b(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setMenu(C11028e c11028e, ActionMenuPresenter actionMenuPresenter) {
        if (c11028e == null && this.f52337b == null) {
            return;
        }
        m69757l();
        C11028e m69986s = this.f52337b.m69986s();
        if (m69986s == c11028e) {
            return;
        }
        if (m69986s != null) {
            m69986s.m70161Q(this.f52331Q);
            m69986s.m70161Q(this.f52332R);
        }
        if (this.f52332R == null) {
            this.f52332R = new C11132f();
        }
        actionMenuPresenter.m70021I(true);
        if (c11028e != null) {
            c11028e.m70148c(actionMenuPresenter, this.f52346k);
            c11028e.m70148c(this.f52332R, this.f52346k);
        } else {
            actionMenuPresenter.mo12397i(this.f52346k, null);
            this.f52332R.mo12397i(this.f52346k, null);
            actionMenuPresenter.mo49322f(true);
            this.f52332R.mo49322f(true);
        }
        this.f52337b.setPopupTheme(this.f52347l);
        this.f52337b.setPresenter(actionMenuPresenter);
        this.f52331Q = actionMenuPresenter;
        m69762g0();
    }

    public void setMenuCallbacks(InterfaceC11037i.InterfaceC11038a interfaceC11038a, C11028e.InterfaceC11029a interfaceC11029a) {
        this.f52333S = interfaceC11038a;
        this.f52334T = interfaceC11029a;
        ActionMenuView actionMenuView = this.f52337b;
        if (actionMenuView != null) {
            actionMenuView.setMenuCallbacks(interfaceC11038a, interfaceC11029a);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C29611vi.m8248b(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m69756m();
        this.f52340e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC11133g interfaceC11133g) {
        this.f52328J = interfaceC11133g;
    }

    public void setOverflowIcon(Drawable drawable) {
        m69758k();
        this.f52337b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f52347l != i) {
            this.f52347l = i;
            if (i == 0) {
                this.f52346k = getContext();
            } else {
                this.f52346k = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextAppearance(Context context, int i) {
        this.f52349n = i;
        TextView textView = this.f52339d;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMargin(int i, int i2, int i3, int i4) {
        this.f52353q = i;
        this.f52357s = i2;
        this.f52355r = i3;
        this.f52358t = i4;
        requestLayout();
    }

    public void setTitleMarginBottom(int i) {
        this.f52358t = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f52355r = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f52353q = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f52357s = i;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, int i) {
        this.f52348m = i;
        TextView textView = this.f52338c;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    /* renamed from: t */
    public int m69749t() {
        C39863dd5 c39863dd5 = this.f52359u;
        if (c39863dd5 != null) {
            return c39863dd5.m44006a();
        }
        return 0;
    }

    /* renamed from: u */
    public int m69748u() {
        C39863dd5 c39863dd5 = this.f52359u;
        if (c39863dd5 != null) {
            return c39863dd5.m44005b();
        }
        return 0;
    }

    /* renamed from: v */
    public int m69747v() {
        boolean z;
        C11028e m69986s;
        ActionMenuView actionMenuView = this.f52337b;
        if (actionMenuView != null && (m69986s = actionMenuView.m69986s()) != null && m69986s.hasVisibleItems()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Math.max(m69749t(), Math.max(this.f52361w, 0));
        }
        return m69749t();
    }

    /* renamed from: w */
    public int m69746w() {
        if (C38790bq6.m62548D(this) == 1) {
            return m69747v();
        }
        return m69744y();
    }

    /* renamed from: x */
    public int m69745x() {
        if (C38790bq6.m62548D(this) == 1) {
            return m69744y();
        }
        return m69747v();
    }

    /* renamed from: y */
    public int m69744y() {
        if (m69794F() != null) {
            return Math.max(m69748u(), Math.max(this.f52360v, 0));
        }
        return m69748u();
    }

    /* renamed from: z */
    public final ArrayList<MenuItem> m69743z() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu m69797C = m69797C();
        for (int i = 0; i < m69797C.size(); i++) {
            arrayList.add(m69797C.getItem(i));
        }
        return arrayList;
    }

    /* loaded from: classes.dex */
    public static class LayoutParams extends ActionBar.LayoutParams {

        /* renamed from: b */
        public int f52365b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f52365b = 0;
        }

        /* renamed from: a */
        public void m69742a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f52365b = 0;
            this.f51478a = 8388627;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ActionBar.LayoutParams) layoutParams);
            this.f52365b = 0;
            this.f52365b = layoutParams.f52365b;
        }

        public LayoutParams(ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
            this.f52365b = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f52365b = 0;
            m69742a(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f52365b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C50553vf4.toolbarStyle);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m69761h();
        }
        ImageButton imageButton = this.f52344i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m69761h();
            this.f52344i.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f52344i;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f52342g);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m69759j();
            if (!m69781T(this.f52341f)) {
                m69769d(this.f52341f, true);
            }
        } else {
            ImageView imageView = this.f52341f;
            if (imageView != null && m69781T(imageView)) {
                removeView(this.f52341f);
                this.f52324F.remove(this.f52341f);
            }
        }
        ImageView imageView2 = this.f52341f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m69759j();
        }
        ImageView imageView = this.f52341f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m69756m();
        }
        ImageButton imageButton = this.f52340e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            E56.m109403a(this.f52340e, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m69756m();
            if (!m69781T(this.f52340e)) {
                m69769d(this.f52340e, true);
            }
        } else {
            ImageButton imageButton = this.f52340e;
            if (imageButton != null && m69781T(imageButton)) {
                removeView(this.f52340e);
                this.f52324F.remove(this.f52340e);
            }
        }
        ImageButton imageButton2 = this.f52340e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f52339d == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f52339d = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f52339d.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f52349n;
                if (i != 0) {
                    this.f52339d.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f52320B;
                if (colorStateList != null) {
                    this.f52339d.setTextColor(colorStateList);
                }
            }
            if (!m69781T(this.f52339d)) {
                m69769d(this.f52339d, true);
            }
        } else {
            TextView textView = this.f52339d;
            if (textView != null && m69781T(textView)) {
                removeView(this.f52339d);
                this.f52324F.remove(this.f52339d);
            }
        }
        TextView textView2 = this.f52339d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f52364z = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f52320B = colorStateList;
        TextView textView = this.f52339d;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f52338c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f52338c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f52338c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f52348m;
                if (i != 0) {
                    this.f52338c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f52319A;
                if (colorStateList != null) {
                    this.f52338c.setTextColor(colorStateList);
                }
            }
            if (!m69781T(this.f52338c)) {
                m69769d(this.f52338c, true);
            }
        } else {
            TextView textView = this.f52338c;
            if (textView != null && m69781T(textView)) {
                removeView(this.f52338c);
                this.f52324F.remove(this.f52338c);
            }
        }
        TextView textView2 = this.f52338c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f52363y = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f52319A = colorStateList;
        TextView textView = this.f52338c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C11126a();

        /* renamed from: d */
        public int f52366d;

        /* renamed from: e */
        public boolean f52367e;

        /* renamed from: androidx.appcompat.widget.Toolbar$SavedState$a */
        /* loaded from: classes.dex */
        public class C11126a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            this.f52366d = parcel.readInt();
            this.f52367e = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f52366d);
            parcel.writeInt(this.f52367e ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52362x = 8388627;
        this.f52323E = new ArrayList<>();
        this.f52324F = new ArrayList<>();
        this.f52325G = new int[2];
        this.f52326H = new YP2(new Runnable() { // from class: w56
            @Override // java.lang.Runnable
            public final void run() {
                Toolbar.this.m69782S();
            }
        });
        this.f52327I = new ArrayList<>();
        this.f52329K = new C11127a();
        this.f52356r0 = new RunnableC11128b();
        Context context2 = getContext();
        int[] iArr = C43509jm4.Toolbar;
        Z46 m73747v = Z46.m73747v(context2, attributeSet, iArr, i, 0);
        C38790bq6.m62456t0(this, context, iArr, attributeSet, m73747v.m73751r(), i, 0);
        this.f52348m = m73747v.m73755n(C43509jm4.Toolbar_titleTextAppearance, 0);
        this.f52349n = m73747v.m73755n(C43509jm4.Toolbar_subtitleTextAppearance, 0);
        this.f52362x = m73747v.m73757l(C43509jm4.Toolbar_android_gravity, this.f52362x);
        this.f52350o = m73747v.m73757l(C43509jm4.Toolbar_buttonGravity, 48);
        int m73764e = m73747v.m73764e(C43509jm4.Toolbar_titleMargin, 0);
        int i2 = C43509jm4.Toolbar_titleMargins;
        m73764e = m73747v.m73750s(i2) ? m73747v.m73764e(i2, m73764e) : m73764e;
        this.f52358t = m73764e;
        this.f52357s = m73764e;
        this.f52355r = m73764e;
        this.f52353q = m73764e;
        int m73764e2 = m73747v.m73764e(C43509jm4.Toolbar_titleMarginStart, -1);
        if (m73764e2 >= 0) {
            this.f52353q = m73764e2;
        }
        int m73764e3 = m73747v.m73764e(C43509jm4.Toolbar_titleMarginEnd, -1);
        if (m73764e3 >= 0) {
            this.f52355r = m73764e3;
        }
        int m73764e4 = m73747v.m73764e(C43509jm4.Toolbar_titleMarginTop, -1);
        if (m73764e4 >= 0) {
            this.f52357s = m73764e4;
        }
        int m73764e5 = m73747v.m73764e(C43509jm4.Toolbar_titleMarginBottom, -1);
        if (m73764e5 >= 0) {
            this.f52358t = m73764e5;
        }
        this.f52351p = m73747v.m73763f(C43509jm4.Toolbar_maxButtonHeight, -1);
        int m73764e6 = m73747v.m73764e(C43509jm4.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int m73764e7 = m73747v.m73764e(C43509jm4.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int m73763f = m73747v.m73763f(C43509jm4.Toolbar_contentInsetLeft, 0);
        int m73763f2 = m73747v.m73763f(C43509jm4.Toolbar_contentInsetRight, 0);
        m69760i();
        this.f52359u.m44004c(m73763f, m73763f2);
        if (m73764e6 != Integer.MIN_VALUE || m73764e7 != Integer.MIN_VALUE) {
            this.f52359u.m44002e(m73764e6, m73764e7);
        }
        this.f52360v = m73747v.m73764e(C43509jm4.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f52361w = m73747v.m73764e(C43509jm4.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f52342g = m73747v.m73762g(C43509jm4.Toolbar_collapseIcon);
        this.f52343h = m73747v.m73753p(C43509jm4.Toolbar_collapseContentDescription);
        CharSequence m73753p = m73747v.m73753p(C43509jm4.Toolbar_title);
        if (!TextUtils.isEmpty(m73753p)) {
            setTitle(m73753p);
        }
        CharSequence m73753p2 = m73747v.m73753p(C43509jm4.Toolbar_subtitle);
        if (!TextUtils.isEmpty(m73753p2)) {
            setSubtitle(m73753p2);
        }
        this.f52346k = getContext();
        setPopupTheme(m73747v.m73755n(C43509jm4.Toolbar_popupTheme, 0));
        Drawable m73762g = m73747v.m73762g(C43509jm4.Toolbar_navigationIcon);
        if (m73762g != null) {
            setNavigationIcon(m73762g);
        }
        CharSequence m73753p3 = m73747v.m73753p(C43509jm4.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(m73753p3)) {
            setNavigationContentDescription(m73753p3);
        }
        Drawable m73762g2 = m73747v.m73762g(C43509jm4.Toolbar_logo);
        if (m73762g2 != null) {
            setLogo(m73762g2);
        }
        CharSequence m73753p4 = m73747v.m73753p(C43509jm4.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(m73753p4)) {
            setLogoDescription(m73753p4);
        }
        int i3 = C43509jm4.Toolbar_titleTextColor;
        if (m73747v.m73750s(i3)) {
            setTitleTextColor(m73747v.m73766c(i3));
        }
        int i4 = C43509jm4.Toolbar_subtitleTextColor;
        if (m73747v.m73750s(i4)) {
            setSubtitleTextColor(m73747v.m73766c(i4));
        }
        int i5 = C43509jm4.Toolbar_menu;
        if (m73747v.m73750s(i5)) {
            mo49230R(m73747v.m73755n(i5, 0));
        }
        m73747v.m73746w();
    }
}

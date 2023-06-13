package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.InterfaceC11037i;
import p000.DB6;
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements IV0, K43, L43 {

    /* renamed from: G */
    public static final int[] f51995G = {C50553vf4.actionBarSize, 16842841};

    /* renamed from: A */
    public OverScroller f51996A;

    /* renamed from: B */
    public ViewPropertyAnimator f51997B;

    /* renamed from: C */
    public final AnimatorListenerAdapter f51998C;

    /* renamed from: D */
    public final Runnable f51999D;

    /* renamed from: E */
    public final Runnable f52000E;

    /* renamed from: F */
    public final M43 f52001F;

    /* renamed from: b */
    public int f52002b;

    /* renamed from: c */
    public int f52003c;

    /* renamed from: d */
    public ContentFrameLayout f52004d;

    /* renamed from: e */
    public ActionBarContainer f52005e;

    /* renamed from: f */
    public JV0 f52006f;

    /* renamed from: g */
    public Drawable f52007g;

    /* renamed from: h */
    public boolean f52008h;

    /* renamed from: i */
    public boolean f52009i;

    /* renamed from: j */
    public boolean f52010j;

    /* renamed from: k */
    public boolean f52011k;

    /* renamed from: l */
    public boolean f52012l;

    /* renamed from: m */
    public int f52013m;

    /* renamed from: n */
    public int f52014n;

    /* renamed from: o */
    public final Rect f52015o;

    /* renamed from: p */
    public final Rect f52016p;

    /* renamed from: q */
    public final Rect f52017q;

    /* renamed from: r */
    public final Rect f52018r;

    /* renamed from: s */
    public final Rect f52019s;

    /* renamed from: t */
    public final Rect f52020t;

    /* renamed from: u */
    public final Rect f52021u;

    /* renamed from: v */
    public DB6 f52022v;

    /* renamed from: w */
    public DB6 f52023w;

    /* renamed from: x */
    public DB6 f52024x;

    /* renamed from: y */
    public DB6 f52025y;

    /* renamed from: z */
    public InterfaceC11050d f52026z;

    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    /* loaded from: classes.dex */
    public class C11047a extends AnimatorListenerAdapter {
        public C11047a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f51997B = null;
            actionBarOverlayLayout.f52012l = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f51997B = null;
            actionBarOverlayLayout.f52012l = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    /* loaded from: classes.dex */
    public class RunnableC11048b implements Runnable {
        public RunnableC11048b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m70043n();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f51997B = actionBarOverlayLayout.f52005e.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f51998C);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    /* loaded from: classes.dex */
    public class RunnableC11049c implements Runnable {
        public RunnableC11049c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m70043n();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f51997B = actionBarOverlayLayout.f52005e.animate().translationY(-ActionBarOverlayLayout.this.f52005e.getHeight()).setListener(ActionBarOverlayLayout.this.f51998C);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    /* loaded from: classes.dex */
    public interface InterfaceC11050d {
        /* renamed from: a */
        void mo70035a();

        /* renamed from: b */
        void mo70034b();

        /* renamed from: c */
        void mo70033c();

        /* renamed from: d */
        void mo70032d();

        /* renamed from: e */
        void mo70031e(int i);

        /* renamed from: f */
        void mo70030f(boolean z);
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    @Override // p000.IV0
    /* renamed from: a */
    public boolean mo70056a() {
        m70038s();
        return this.f52006f.mo69725a();
    }

    /* renamed from: b */
    public final void m70055b() {
        m70043n();
        this.f52000E.run();
    }

    @Override // p000.IV0
    /* renamed from: c */
    public boolean mo70054c() {
        m70038s();
        return this.f52006f.mo69723c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // p000.IV0
    /* renamed from: d */
    public boolean mo70053d() {
        m70038s();
        return this.f52006f.mo69722d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f52007g != null && !this.f52008h) {
            if (this.f52005e.getVisibility() == 0) {
                i = (int) (this.f52005e.getBottom() + this.f52005e.getTranslationY() + 0.5f);
            } else {
                i = 0;
            }
            this.f52007g.setBounds(0, i, getWidth(), this.f52007g.getIntrinsicHeight() + i);
            this.f52007g.draw(canvas);
        }
    }

    @Override // p000.IV0
    /* renamed from: e */
    public boolean mo70052e() {
        m70038s();
        return this.f52006f.mo69721e();
    }

    @Override // p000.IV0
    /* renamed from: f */
    public boolean mo70051f() {
        m70038s();
        return this.f52006f.mo69720f();
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // p000.IV0
    /* renamed from: g */
    public void mo70050g(int i) {
        m70038s();
        if (i != 2) {
            if (i != 5) {
                if (i == 109) {
                    setOverlayMode(true);
                    return;
                }
                return;
            }
            this.f52006f.mo69710p();
            return;
        }
        this.f52006f.mo69715k();
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f52001F.m95845a();
    }

    @Override // p000.IV0
    /* renamed from: h */
    public void mo70049h() {
        m70038s();
        this.f52006f.mo69713m();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m70048i(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (z) {
            int i = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            int i2 = rect.left;
            if (i != i2) {
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i2;
                z5 = true;
                if (z2) {
                    int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                    int i4 = rect.top;
                    if (i3 != i4) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i4;
                        z5 = true;
                    }
                }
                if (z4) {
                    int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    int i6 = rect.right;
                    if (i5 != i6) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i6;
                        z5 = true;
                    }
                }
                if (z3) {
                    int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    int i8 = rect.bottom;
                    if (i7 != i8) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i8;
                        return true;
                    }
                }
                return z5;
            }
        }
        z5 = false;
        if (z2) {
        }
        if (z4) {
        }
        if (z3) {
        }
        return z5;
    }

    @Override // android.view.ViewGroup
    /* renamed from: j */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: k */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: l */
    public int m70045l() {
        ActionBarContainer actionBarContainer = this.f52005e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    /* renamed from: m */
    public final JV0 m70044m(View view) {
        if (view instanceof JV0) {
            return (JV0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).m69785O();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* renamed from: n */
    public void m70043n() {
        removeCallbacks(this.f51999D);
        removeCallbacks(this.f52000E);
        ViewPropertyAnimator viewPropertyAnimator = this.f51997B;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: o */
    public final void m70042o(Context context) {
        boolean z;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f51995G);
        boolean z2 = false;
        this.f52002b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f52007g = drawable;
        if (drawable == null) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.f52008h = z2;
        this.f51996A = new OverScroller(context);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m70038s();
        DB6 m110764z = DB6.m110764z(windowInsets, this);
        boolean m70048i = m70048i(this.f52005e, new Rect(m110764z.m110779k(), m110764z.m110777m(), m110764z.m110778l(), m110764z.m110780j()), true, true, false, true);
        C38790bq6.m62487f(this, m110764z, this.f52015o);
        Rect rect = this.f52015o;
        DB6 m110775o = m110764z.m110775o(rect.left, rect.top, rect.right, rect.bottom);
        this.f52022v = m110775o;
        boolean z = true;
        if (!this.f52023w.equals(m110775o)) {
            this.f52023w = this.f52022v;
            m70048i = true;
        }
        if (!this.f52016p.equals(this.f52015o)) {
            this.f52016p.set(this.f52015o);
        } else {
            z = m70048i;
        }
        if (z) {
            requestLayout();
        }
        return m110764z.m110789a().m110787c().m110788b().m110766x();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m70042o(getContext());
        C38790bq6.m62458s0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m70043n();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        int measuredHeight;
        m70038s();
        measureChildWithMargins(this.f52005e, i, 0, i2, 0);
        LayoutParams layoutParams = (LayoutParams) this.f52005e.getLayoutParams();
        int max = Math.max(0, this.f52005e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
        int max2 = Math.max(0, this.f52005e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f52005e.getMeasuredState());
        if ((C38790bq6.m62520R(this) & 256) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            measuredHeight = this.f52002b;
            if (this.f52010j && this.f52005e.m70067b() != null) {
                measuredHeight += this.f52002b;
            }
        } else {
            measuredHeight = this.f52005e.getVisibility() != 8 ? this.f52005e.getMeasuredHeight() : 0;
        }
        this.f52017q.set(this.f52015o);
        DB6 db6 = this.f52022v;
        this.f52024x = db6;
        if (!this.f52009i && !z) {
            Rect rect = this.f52017q;
            rect.top += measuredHeight;
            rect.bottom += 0;
            this.f52024x = db6.m110775o(0, measuredHeight, 0, 0);
        } else {
            this.f52024x = new DB6.C1417b(this.f52024x).m110759d(D32.m111005b(db6.m110779k(), this.f52024x.m110777m() + measuredHeight, this.f52024x.m110778l(), this.f52024x.m110780j() + 0)).m110762a();
        }
        m70048i(this.f52004d, this.f52017q, true, true, true, true);
        if (!this.f52025y.equals(this.f52024x)) {
            DB6 db62 = this.f52024x;
            this.f52025y = db62;
            C38790bq6.m62484g(this.f52004d, db62);
        }
        measureChildWithMargins(this.f52004d, i, 0, i2, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.f52004d.getLayoutParams();
        int max3 = Math.max(max, this.f52004d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
        int max4 = Math.max(max2, this.f52004d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f52004d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (this.f52011k && z) {
            if (m70036u(f2)) {
                m70055b();
            } else {
                m70037t();
            }
            this.f52012l = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // p000.L43
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScroll(view, i, i2, i3, i4, i5);
    }

    @Override // p000.K43
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // p000.K43
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // p000.K43
    public void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        super.onWindowSystemUiVisibilityChanged(i);
        m70038s();
        int i2 = this.f52014n ^ i;
        this.f52014n = i;
        boolean z2 = false;
        if ((i & 4) == 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 256) != 0) {
            z2 = true;
        }
        InterfaceC11050d interfaceC11050d = this.f52026z;
        if (interfaceC11050d != null) {
            interfaceC11050d.mo70030f(!z2);
            if (!z && z2) {
                this.f52026z.mo70033c();
            } else {
                this.f52026z.mo70035a();
            }
        }
        if ((i2 & 256) != 0 && this.f52026z != null) {
            C38790bq6.m62458s0(this);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f52003c = i;
        InterfaceC11050d interfaceC11050d = this.f52026z;
        if (interfaceC11050d != null) {
            interfaceC11050d.mo70031e(i);
        }
    }

    /* renamed from: p */
    public boolean m70041p() {
        return this.f52009i;
    }

    /* renamed from: q */
    public final void m70040q() {
        m70043n();
        postDelayed(this.f52000E, 600L);
    }

    /* renamed from: r */
    public final void m70039r() {
        m70043n();
        postDelayed(this.f51999D, 600L);
    }

    /* renamed from: s */
    public void m70038s() {
        if (this.f52004d == null) {
            this.f52004d = (ContentFrameLayout) findViewById(C39902dh4.action_bar_activity_content);
            this.f52005e = (ActionBarContainer) findViewById(C39902dh4.action_bar_container);
            this.f52006f = m70044m(findViewById(C39902dh4.action_bar));
        }
    }

    public void setActionBarHideOffset(int i) {
        m70043n();
        this.f52005e.setTranslationY(-Math.max(0, Math.min(i, this.f52005e.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC11050d interfaceC11050d) {
        this.f52026z = interfaceC11050d;
        if (getWindowToken() != null) {
            this.f52026z.mo70031e(this.f52003c);
            int i = this.f52014n;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C38790bq6.m62458s0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f52010j = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f52011k) {
            this.f52011k = z;
            if (!z) {
                m70043n();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        m70038s();
        this.f52006f.setIcon(i);
    }

    public void setLogo(int i) {
        m70038s();
        this.f52006f.mo69703w(i);
    }

    @Override // p000.IV0
    public void setMenu(Menu menu, InterfaceC11037i.InterfaceC11038a interfaceC11038a) {
        m70038s();
        this.f52006f.setMenu(menu, interfaceC11038a);
    }

    @Override // p000.IV0
    public void setMenuPrepared() {
        m70038s();
        this.f52006f.setMenuPrepared();
    }

    public void setOverlayMode(boolean z) {
        boolean z2;
        this.f52009i = z;
        if (z && getContext().getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f52008h = z2;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // p000.IV0
    public void setWindowCallback(Window.Callback callback) {
        m70038s();
        this.f52006f.setWindowCallback(callback);
    }

    @Override // p000.IV0
    public void setWindowTitle(CharSequence charSequence) {
        m70038s();
        this.f52006f.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: t */
    public final void m70037t() {
        m70043n();
        this.f51999D.run();
    }

    /* renamed from: u */
    public final boolean m70036u(float f) {
        this.f51996A.fling(0, 0, 0, (int) f, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f51996A.getFinalY() > this.f52005e.getHeight()) {
            return true;
        }
        return false;
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52003c = 0;
        this.f52015o = new Rect();
        this.f52016p = new Rect();
        this.f52017q = new Rect();
        this.f52018r = new Rect();
        this.f52019s = new Rect();
        this.f52020t = new Rect();
        this.f52021u = new Rect();
        DB6 db6 = DB6.f5337b;
        this.f52022v = db6;
        this.f52023w = db6;
        this.f52024x = db6;
        this.f52025y = db6;
        this.f51998C = new C11047a();
        this.f51999D = new RunnableC11048b();
        this.f52000E = new RunnableC11049c();
        m70042o(context);
        this.f52001F = new M43(this);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // p000.K43
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // p000.K43
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f52001F.m95844b(view, view2, i);
        this.f52013m = m70045l();
        m70043n();
        InterfaceC11050d interfaceC11050d = this.f52026z;
        if (interfaceC11050d != null) {
            interfaceC11050d.mo70032d();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f52005e.getVisibility() != 0) {
            return false;
        }
        return this.f52011k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f52011k && !this.f52012l) {
            if (this.f52013m <= this.f52005e.getHeight()) {
                m70039r();
            } else {
                m70040q();
            }
        }
        InterfaceC11050d interfaceC11050d = this.f52026z;
        if (interfaceC11050d != null) {
            interfaceC11050d.mo70034b();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f52013m + i2;
        this.f52013m = i5;
        setActionBarHideOffset(i5);
    }

    public void setIcon(Drawable drawable) {
        m70038s();
        this.f52006f.setIcon(drawable);
    }
}

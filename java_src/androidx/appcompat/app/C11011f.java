package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.menu.C11028e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p000.AbstractC2614G2;
/* renamed from: androidx.appcompat.app.f */
/* loaded from: classes.dex */
public class C11011f extends ActionBar implements ActionBarOverlayLayout.InterfaceC11050d {

    /* renamed from: E */
    public static final Interpolator f51734E = new AccelerateInterpolator();

    /* renamed from: F */
    public static final Interpolator f51735F = new DecelerateInterpolator();

    /* renamed from: A */
    public boolean f51736A;

    /* renamed from: a */
    public Context f51740a;

    /* renamed from: b */
    public Context f51741b;

    /* renamed from: c */
    public Activity f51742c;

    /* renamed from: d */
    public ActionBarOverlayLayout f51743d;

    /* renamed from: e */
    public ActionBarContainer f51744e;

    /* renamed from: f */
    public JV0 f51745f;

    /* renamed from: g */
    public ActionBarContextView f51746g;

    /* renamed from: h */
    public View f51747h;

    /* renamed from: i */
    public ScrollingTabContainerView f51748i;

    /* renamed from: l */
    public boolean f51751l;

    /* renamed from: m */
    public C11015d f51752m;

    /* renamed from: n */
    public AbstractC2614G2 f51753n;

    /* renamed from: o */
    public AbstractC2614G2.InterfaceC2615a f51754o;

    /* renamed from: p */
    public boolean f51755p;

    /* renamed from: r */
    public boolean f51757r;

    /* renamed from: u */
    public boolean f51760u;

    /* renamed from: v */
    public boolean f51761v;

    /* renamed from: w */
    public boolean f51762w;

    /* renamed from: y */
    public C35057Os6 f51764y;

    /* renamed from: z */
    public boolean f51765z;

    /* renamed from: j */
    public ArrayList<Object> f51749j = new ArrayList<>();

    /* renamed from: k */
    public int f51750k = -1;

    /* renamed from: q */
    public ArrayList<ActionBar.InterfaceC10952a> f51756q = new ArrayList<>();

    /* renamed from: s */
    public int f51758s = 0;

    /* renamed from: t */
    public boolean f51759t = true;

    /* renamed from: x */
    public boolean f51763x = true;

    /* renamed from: B */
    public final InterfaceC35291Ps6 f51737B = new C11012a();

    /* renamed from: C */
    public final InterfaceC35291Ps6 f51738C = new C11013b();

    /* renamed from: D */
    public final InterfaceC35759Rs6 f51739D = new C11014c();

    /* renamed from: androidx.appcompat.app.f$a */
    /* loaded from: classes.dex */
    public class C11012a extends C35525Qs6 {
        public C11012a() {
        }

        @Override // p000.C35525Qs6, p000.InterfaceC35291Ps6
        /* renamed from: b */
        public void mo4254b(View view) {
            View view2;
            C11011f c11011f = C11011f.this;
            if (c11011f.f51759t && (view2 = c11011f.f51747h) != null) {
                view2.setTranslationY(0.0f);
                C11011f.this.f51744e.setTranslationY(0.0f);
            }
            C11011f.this.f51744e.setVisibility(8);
            C11011f.this.f51744e.setTransitioning(false);
            C11011f c11011f2 = C11011f.this;
            c11011f2.f51764y = null;
            c11011f2.m70236K();
            ActionBarOverlayLayout actionBarOverlayLayout = C11011f.this.f51743d;
            if (actionBarOverlayLayout != null) {
                C38790bq6.m62458s0(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.f$b */
    /* loaded from: classes.dex */
    public class C11013b extends C35525Qs6 {
        public C11013b() {
        }

        @Override // p000.C35525Qs6, p000.InterfaceC35291Ps6
        /* renamed from: b */
        public void mo4254b(View view) {
            C11011f c11011f = C11011f.this;
            c11011f.f51764y = null;
            c11011f.f51744e.requestLayout();
        }
    }

    /* renamed from: androidx.appcompat.app.f$c */
    /* loaded from: classes.dex */
    public class C11014c implements InterfaceC35759Rs6 {
        public C11014c() {
        }

        @Override // p000.InterfaceC35759Rs6
        /* renamed from: a */
        public void mo70207a(View view) {
            ((View) C11011f.this.f51744e.getParent()).invalidate();
        }
    }

    /* renamed from: androidx.appcompat.app.f$d */
    /* loaded from: classes.dex */
    public class C11015d extends AbstractC2614G2 implements C11028e.InterfaceC11029a {

        /* renamed from: d */
        public final Context f51769d;

        /* renamed from: e */
        public final C11028e f51770e;

        /* renamed from: f */
        public AbstractC2614G2.InterfaceC2615a f51771f;

        /* renamed from: g */
        public WeakReference<View> f51772g;

        public C11015d(Context context, AbstractC2614G2.InterfaceC2615a interfaceC2615a) {
            this.f51769d = context;
            this.f51771f = interfaceC2615a;
            C11028e m70156W = new C11028e(context).m70156W(1);
            this.f51770e = m70156W;
            m70156W.mo70074V(this);
        }

        @Override // androidx.appcompat.view.menu.C11028e.InterfaceC11029a
        /* renamed from: a */
        public boolean mo5020a(C11028e c11028e, MenuItem menuItem) {
            AbstractC2614G2.InterfaceC2615a interfaceC2615a = this.f51771f;
            if (interfaceC2615a != null) {
                return interfaceC2615a.mo70352a(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.C11028e.InterfaceC11029a
        /* renamed from: b */
        public void mo5019b(C11028e c11028e) {
            if (this.f51771f == null) {
                return;
            }
            mo17554k();
            C11011f.this.f51746g.m70057n();
        }

        @Override // p000.AbstractC2614G2
        /* renamed from: c */
        public void mo17560c() {
            C11011f c11011f = C11011f.this;
            if (c11011f.f51752m != this) {
                return;
            }
            if (!C11011f.m70237J(c11011f.f51760u, c11011f.f51761v, false)) {
                C11011f c11011f2 = C11011f.this;
                c11011f2.f51753n = this;
                c11011f2.f51754o = this.f51771f;
            } else {
                this.f51771f.mo70351b(this);
            }
            this.f51771f = null;
            C11011f.this.m70238I(false);
            C11011f.this.f51746g.m70064g();
            C11011f c11011f3 = C11011f.this;
            c11011f3.f51743d.setHideOnContentScrollEnabled(c11011f3.f51736A);
            C11011f.this.f51752m = null;
        }

        @Override // p000.AbstractC2614G2
        /* renamed from: d */
        public View mo17559d() {
            WeakReference<View> weakReference = this.f51772g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // p000.AbstractC2614G2
        /* renamed from: e */
        public Menu mo17558e() {
            return this.f51770e;
        }

        @Override // p000.AbstractC2614G2
        /* renamed from: f */
        public MenuInflater mo17557f() {
            return new C39177cV5(this.f51769d);
        }

        @Override // p000.AbstractC2614G2
        /* renamed from: g */
        public CharSequence mo17556g() {
            return C11011f.this.f51746g.m70063h();
        }

        @Override // p000.AbstractC2614G2
        /* renamed from: i */
        public CharSequence mo17555i() {
            return C11011f.this.f51746g.m70062i();
        }

        @Override // p000.AbstractC2614G2
        /* renamed from: k */
        public void mo17554k() {
            if (C11011f.this.f51752m != this) {
                return;
            }
            this.f51770e.m70139h0();
            try {
                this.f51771f.mo70349d(this, this.f51770e);
            } finally {
                this.f51770e.m70140g0();
            }
        }

        @Override // p000.AbstractC2614G2
        /* renamed from: l */
        public boolean mo17553l() {
            return C11011f.this.f51746g.m70059l();
        }

        @Override // p000.AbstractC2614G2
        /* renamed from: m */
        public void mo17552m(View view) {
            C11011f.this.f51746g.setCustomView(view);
            this.f51772g = new WeakReference<>(view);
        }

        @Override // p000.AbstractC2614G2
        /* renamed from: n */
        public void mo17551n(int i) {
            mo17550o(C11011f.this.f51740a.getResources().getString(i));
        }

        @Override // p000.AbstractC2614G2
        /* renamed from: o */
        public void mo17550o(CharSequence charSequence) {
            C11011f.this.f51746g.setSubtitle(charSequence);
        }

        @Override // p000.AbstractC2614G2
        /* renamed from: q */
        public void mo17549q(int i) {
            mo17548r(C11011f.this.f51740a.getResources().getString(i));
        }

        @Override // p000.AbstractC2614G2
        /* renamed from: r */
        public void mo17548r(CharSequence charSequence) {
            C11011f.this.f51746g.setTitle(charSequence);
        }

        @Override // p000.AbstractC2614G2
        /* renamed from: s */
        public void mo17547s(boolean z) {
            super.mo17547s(z);
            C11011f.this.f51746g.setTitleOptional(z);
        }

        /* renamed from: t */
        public boolean m70206t() {
            this.f51770e.m70139h0();
            try {
                return this.f51771f.mo70350c(this, this.f51770e);
            } finally {
                this.f51770e.m70140g0();
            }
        }
    }

    public C11011f(Activity activity, boolean z) {
        this.f51742c = activity;
        View decorView = activity.getWindow().getDecorView();
        m70230Q(decorView);
        if (z) {
            return;
        }
        this.f51747h = decorView.findViewById(16908290);
    }

    /* renamed from: J */
    public static boolean m70237J(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: A */
    public void mo70246A(Drawable drawable) {
        this.f51745f.mo69709q(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: B */
    public void mo70245B(boolean z) {
        this.f51745f.mo69705u(z);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: C */
    public void mo70244C(boolean z) {
        C35057Os6 c35057Os6;
        this.f51765z = z;
        if (!z && (c35057Os6 = this.f51764y) != null) {
            c35057Os6.m91243a();
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: D */
    public void mo70243D(int i) {
        mo70242E(this.f51740a.getString(i));
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: E */
    public void mo70242E(CharSequence charSequence) {
        this.f51745f.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: F */
    public void mo70241F(CharSequence charSequence) {
        this.f51745f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: G */
    public void mo70240G() {
        if (this.f51760u) {
            this.f51760u = false;
            m70223X(false);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: H */
    public AbstractC2614G2 mo70239H(AbstractC2614G2.InterfaceC2615a interfaceC2615a) {
        C11015d c11015d = this.f51752m;
        if (c11015d != null) {
            c11015d.mo17560c();
        }
        this.f51743d.setHideOnContentScrollEnabled(false);
        this.f51746g.m70058m();
        C11015d c11015d2 = new C11015d(this.f51746g.getContext(), interfaceC2615a);
        if (c11015d2.m70206t()) {
            this.f51752m = c11015d2;
            c11015d2.mo17554k();
            this.f51746g.m70061j(c11015d2);
            m70238I(true);
            return c11015d2;
        }
        return null;
    }

    /* renamed from: I */
    public void m70238I(boolean z) {
        C34823Ns6 mo69707s;
        C34823Ns6 mo44751f;
        if (z) {
            m70224W();
        } else {
            m70231P();
        }
        if (m70225V()) {
            if (z) {
                mo44751f = this.f51745f.mo69707s(4, 100L);
                mo69707s = this.f51746g.mo44751f(0, 200L);
            } else {
                mo69707s = this.f51745f.mo69707s(0, 200L);
                mo44751f = this.f51746g.mo44751f(8, 100L);
            }
            C35057Os6 c35057Os6 = new C35057Os6();
            c35057Os6.m91240d(mo44751f, mo69707s);
            c35057Os6.m91236h();
        } else if (z) {
            this.f51745f.setVisibility(4);
            this.f51746g.setVisibility(0);
        } else {
            this.f51745f.setVisibility(0);
            this.f51746g.setVisibility(8);
        }
    }

    /* renamed from: K */
    public void m70236K() {
        AbstractC2614G2.InterfaceC2615a interfaceC2615a = this.f51754o;
        if (interfaceC2615a != null) {
            interfaceC2615a.mo70351b(this.f51753n);
            this.f51753n = null;
            this.f51754o = null;
        }
    }

    /* renamed from: L */
    public void m70235L(boolean z) {
        View view;
        int[] iArr;
        C35057Os6 c35057Os6 = this.f51764y;
        if (c35057Os6 != null) {
            c35057Os6.m91243a();
        }
        if (this.f51758s == 0 && (this.f51765z || z)) {
            this.f51744e.setAlpha(1.0f);
            this.f51744e.setTransitioning(true);
            C35057Os6 c35057Os62 = new C35057Os6();
            float f = -this.f51744e.getHeight();
            if (z) {
                this.f51744e.getLocationInWindow(new int[]{0, 0});
                f -= iArr[1];
            }
            C34823Ns6 m93236n = C38790bq6.m62490e(this.f51744e).m93236n(f);
            m93236n.m93239k(this.f51739D);
            c35057Os62.m91241c(m93236n);
            if (this.f51759t && (view = this.f51747h) != null) {
                c35057Os62.m91241c(C38790bq6.m62490e(view).m93236n(f));
            }
            c35057Os62.m91238f(f51734E);
            c35057Os62.m91239e(250L);
            c35057Os62.m91237g(this.f51737B);
            this.f51764y = c35057Os62;
            c35057Os62.m91236h();
            return;
        }
        this.f51737B.mo4254b(null);
    }

    /* renamed from: M */
    public void m70234M(boolean z) {
        View view;
        View view2;
        int[] iArr;
        C35057Os6 c35057Os6 = this.f51764y;
        if (c35057Os6 != null) {
            c35057Os6.m91243a();
        }
        this.f51744e.setVisibility(0);
        if (this.f51758s == 0 && (this.f51765z || z)) {
            this.f51744e.setTranslationY(0.0f);
            float f = -this.f51744e.getHeight();
            if (z) {
                this.f51744e.getLocationInWindow(new int[]{0, 0});
                f -= iArr[1];
            }
            this.f51744e.setTranslationY(f);
            C35057Os6 c35057Os62 = new C35057Os6();
            C34823Ns6 m93236n = C38790bq6.m62490e(this.f51744e).m93236n(0.0f);
            m93236n.m93239k(this.f51739D);
            c35057Os62.m91241c(m93236n);
            if (this.f51759t && (view2 = this.f51747h) != null) {
                view2.setTranslationY(f);
                c35057Os62.m91241c(C38790bq6.m62490e(this.f51747h).m93236n(0.0f));
            }
            c35057Os62.m91238f(f51735F);
            c35057Os62.m91239e(250L);
            c35057Os62.m91237g(this.f51738C);
            this.f51764y = c35057Os62;
            c35057Os62.m91236h();
        } else {
            this.f51744e.setAlpha(1.0f);
            this.f51744e.setTranslationY(0.0f);
            if (this.f51759t && (view = this.f51747h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f51738C.mo4254b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f51743d;
        if (actionBarOverlayLayout != null) {
            C38790bq6.m62458s0(actionBarOverlayLayout);
        }
    }

    /* renamed from: N */
    public final JV0 m70233N(View view) {
        String str;
        if (view instanceof JV0) {
            return (JV0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).m69785O();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        if (view != null) {
            str = view.getClass().getSimpleName();
        } else {
            str = "null";
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: O */
    public int m70232O() {
        return this.f51745f.mo69717i();
    }

    /* renamed from: P */
    public final void m70231P() {
        if (this.f51762w) {
            this.f51762w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f51743d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m70223X(false);
        }
    }

    /* renamed from: Q */
    public final void m70230Q(View view) {
        boolean z;
        boolean z2;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C39902dh4.decor_content_parent);
        this.f51743d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f51745f = m70233N(view.findViewById(C39902dh4.action_bar));
        this.f51746g = (ActionBarContextView) view.findViewById(C39902dh4.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C39902dh4.action_bar_container);
        this.f51744e = actionBarContainer;
        JV0 jv0 = this.f51745f;
        if (jv0 != null && this.f51746g != null && actionBarContainer != null) {
            this.f51740a = jv0.getContext();
            if ((this.f51745f.mo69712n() & 4) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f51751l = true;
            }
            C0843C2 m112965b = C0843C2.m112965b(this.f51740a);
            if (!m112965b.m112966a() && !z) {
                z2 = false;
            } else {
                z2 = true;
            }
            mo70245B(z2);
            m70227T(m112965b.m112960g());
            TypedArray obtainStyledAttributes = this.f51740a.obtainStyledAttributes(null, C43509jm4.ActionBar, C50553vf4.actionBarStyle, 0);
            if (obtainStyledAttributes.getBoolean(C43509jm4.ActionBar_hideOnContentScroll, false)) {
                m70226U(true);
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C43509jm4.ActionBar_elevation, 0);
            if (dimensionPixelSize != 0) {
                m70228S(dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
    }

    /* renamed from: R */
    public void m70229R(int i, int i2) {
        int mo69712n = this.f51745f.mo69712n();
        if ((i2 & 4) != 0) {
            this.f51751l = true;
        }
        this.f51745f.mo69718h((i & i2) | ((~i2) & mo69712n));
    }

    /* renamed from: S */
    public void m70228S(float f) {
        C38790bq6.m62545E0(this.f51744e, f);
    }

    /* renamed from: T */
    public final void m70227T(boolean z) {
        boolean z2;
        boolean z3;
        this.f51757r = z;
        if (!z) {
            this.f51745f.mo69704v(null);
            this.f51744e.setTabContainer(this.f51748i);
        } else {
            this.f51744e.setTabContainer(null);
            this.f51745f.mo69704v(this.f51748i);
        }
        boolean z4 = true;
        if (m70232O() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        ScrollingTabContainerView scrollingTabContainerView = this.f51748i;
        if (scrollingTabContainerView != null) {
            if (z2) {
                scrollingTabContainerView.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f51743d;
                if (actionBarOverlayLayout != null) {
                    C38790bq6.m62458s0(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
        }
        JV0 jv0 = this.f51745f;
        if (!this.f51757r && z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        jv0.mo69714l(z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f51743d;
        if (this.f51757r || !z2) {
            z4 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z4);
    }

    /* renamed from: U */
    public void m70226U(boolean z) {
        if (z && !this.f51743d.m70041p()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f51736A = z;
        this.f51743d.setHideOnContentScrollEnabled(z);
    }

    /* renamed from: V */
    public final boolean m70225V() {
        return C38790bq6.m62504Z(this.f51744e);
    }

    /* renamed from: W */
    public final void m70224W() {
        if (!this.f51762w) {
            this.f51762w = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f51743d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            m70223X(false);
        }
    }

    /* renamed from: X */
    public final void m70223X(boolean z) {
        if (m70237J(this.f51760u, this.f51761v, this.f51762w)) {
            if (!this.f51763x) {
                this.f51763x = true;
                m70234M(z);
            }
        } else if (this.f51763x) {
            this.f51763x = false;
            m70235L(z);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC11050d
    /* renamed from: a */
    public void mo70035a() {
        if (this.f51761v) {
            this.f51761v = false;
            m70223X(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC11050d
    /* renamed from: b */
    public void mo70034b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC11050d
    /* renamed from: c */
    public void mo70033c() {
        if (!this.f51761v) {
            this.f51761v = true;
            m70223X(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC11050d
    /* renamed from: d */
    public void mo70032d() {
        C35057Os6 c35057Os6 = this.f51764y;
        if (c35057Os6 != null) {
            c35057Os6.m91243a();
            this.f51764y = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC11050d
    /* renamed from: e */
    public void mo70031e(int i) {
        this.f51758s = i;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC11050d
    /* renamed from: f */
    public void mo70030f(boolean z) {
        this.f51759t = z;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: h */
    public boolean mo70222h() {
        JV0 jv0 = this.f51745f;
        if (jv0 != null && jv0.mo69719g()) {
            this.f51745f.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: i */
    public void mo70221i(boolean z) {
        if (z == this.f51755p) {
            return;
        }
        this.f51755p = z;
        int size = this.f51756q.size();
        for (int i = 0; i < size; i++) {
            this.f51756q.get(i).m70458a(z);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: j */
    public int mo70220j() {
        return this.f51745f.mo69712n();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: k */
    public Context mo70219k() {
        if (this.f51741b == null) {
            TypedValue typedValue = new TypedValue();
            this.f51740a.getTheme().resolveAttribute(C50553vf4.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f51741b = new ContextThemeWrapper(this.f51740a, i);
            } else {
                this.f51741b = this.f51740a;
            }
        }
        return this.f51741b;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: l */
    public void mo70218l() {
        if (!this.f51760u) {
            this.f51760u = true;
            m70223X(false);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: n */
    public void mo70217n(Configuration configuration) {
        m70227T(C0843C2.m112965b(this.f51740a).m112960g());
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: p */
    public boolean mo70216p(int i, KeyEvent keyEvent) {
        Menu mo17558e;
        int i2;
        C11015d c11015d = this.f51752m;
        if (c11015d == null || (mo17558e = c11015d.mo17558e()) == null) {
            return false;
        }
        if (keyEvent != null) {
            i2 = keyEvent.getDeviceId();
        } else {
            i2 = -1;
        }
        boolean z = true;
        if (KeyCharacterMap.load(i2).getKeyboardType() == 1) {
            z = false;
        }
        mo17558e.setQwertyMode(z);
        return mo17558e.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: s */
    public void mo70215s(Drawable drawable) {
        this.f51744e.setPrimaryBackground(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: t */
    public void mo70214t(View view, ActionBar.LayoutParams layoutParams) {
        view.setLayoutParams(layoutParams);
        this.f51745f.mo69711o(view);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: u */
    public void mo70213u(boolean z) {
        if (!this.f51751l) {
            mo70212v(z);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: v */
    public void mo70212v(boolean z) {
        m70229R(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: w */
    public void mo70211w(boolean z) {
        m70229R(z ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: x */
    public void mo70210x(boolean z) {
        m70229R(z ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: y */
    public void mo70209y(int i) {
        this.f51745f.mo69716j(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: z */
    public void mo70208z(int i) {
        this.f51745f.mo69702x(i);
    }

    public C11011f(Dialog dialog) {
        m70230Q(dialog.getWindow().getDecorView());
    }
}

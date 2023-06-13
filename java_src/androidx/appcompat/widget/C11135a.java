package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.C11028e;
import androidx.appcompat.view.menu.InterfaceC11037i;
import androidx.appcompat.widget.Toolbar;
/* renamed from: androidx.appcompat.widget.a */
/* loaded from: classes.dex */
public class C11135a implements JV0 {

    /* renamed from: a */
    public Toolbar f52379a;

    /* renamed from: b */
    public int f52380b;

    /* renamed from: c */
    public View f52381c;

    /* renamed from: d */
    public View f52382d;

    /* renamed from: e */
    public Drawable f52383e;

    /* renamed from: f */
    public Drawable f52384f;

    /* renamed from: g */
    public Drawable f52385g;

    /* renamed from: h */
    public boolean f52386h;

    /* renamed from: i */
    public CharSequence f52387i;

    /* renamed from: j */
    public CharSequence f52388j;

    /* renamed from: k */
    public CharSequence f52389k;

    /* renamed from: l */
    public Window.Callback f52390l;

    /* renamed from: m */
    public boolean f52391m;

    /* renamed from: n */
    public ActionMenuPresenter f52392n;

    /* renamed from: o */
    public int f52393o;

    /* renamed from: p */
    public int f52394p;

    /* renamed from: q */
    public Drawable f52395q;

    /* renamed from: androidx.appcompat.widget.a$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC11136a implements View.OnClickListener {

        /* renamed from: b */
        public final C2055F2 f52396b;

        public View$OnClickListenerC11136a() {
            this.f52396b = new C2055F2(C11135a.this.f52379a.getContext(), 0, 16908332, 0, 0, C11135a.this.f52387i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C11135a c11135a = C11135a.this;
            Window.Callback callback = c11135a.f52390l;
            if (callback != null && c11135a.f52391m) {
                callback.onMenuItemSelected(0, this.f52396b);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.a$b */
    /* loaded from: classes.dex */
    public class C11137b extends C35525Qs6 {

        /* renamed from: a */
        public boolean f52398a = false;

        /* renamed from: b */
        public final /* synthetic */ int f52399b;

        public C11137b(int i) {
            this.f52399b = i;
        }

        @Override // p000.C35525Qs6, p000.InterfaceC35291Ps6
        /* renamed from: a */
        public void mo4255a(View view) {
            this.f52398a = true;
        }

        @Override // p000.C35525Qs6, p000.InterfaceC35291Ps6
        /* renamed from: b */
        public void mo4254b(View view) {
            if (!this.f52398a) {
                C11135a.this.f52379a.setVisibility(this.f52399b);
            }
        }

        @Override // p000.C35525Qs6, p000.InterfaceC35291Ps6
        /* renamed from: c */
        public void mo4253c(View view) {
            C11135a.this.f52379a.setVisibility(0);
        }
    }

    public C11135a(Toolbar toolbar, boolean z) {
        this(toolbar, z, C49428tl4.abc_action_bar_up_description, C34947Og4.abc_ic_ab_back_material);
    }

    /* renamed from: A */
    public void m69733A(int i) {
        if (i == this.f52394p) {
            return;
        }
        this.f52394p = i;
        if (TextUtils.isEmpty(this.f52379a.m69795E())) {
            mo69716j(this.f52394p);
        }
    }

    /* renamed from: B */
    public void m69732B(Drawable drawable) {
        this.f52384f = drawable;
        m69726H();
    }

    /* renamed from: C */
    public void m69731C(CharSequence charSequence) {
        this.f52389k = charSequence;
        m69728F();
    }

    /* renamed from: D */
    public void m69730D(CharSequence charSequence) {
        this.f52388j = charSequence;
        if ((this.f52380b & 8) != 0) {
            this.f52379a.setSubtitle(charSequence);
        }
    }

    /* renamed from: E */
    public final void m69729E(CharSequence charSequence) {
        this.f52387i = charSequence;
        if ((this.f52380b & 8) != 0) {
            this.f52379a.setTitle(charSequence);
            if (this.f52386h) {
                C38790bq6.m62446y0(this.f52379a.getRootView(), charSequence);
            }
        }
    }

    /* renamed from: F */
    public final void m69728F() {
        if ((this.f52380b & 4) != 0) {
            if (TextUtils.isEmpty(this.f52389k)) {
                this.f52379a.setNavigationContentDescription(this.f52394p);
            } else {
                this.f52379a.setNavigationContentDescription(this.f52389k);
            }
        }
    }

    /* renamed from: G */
    public final void m69727G() {
        if ((this.f52380b & 4) != 0) {
            Toolbar toolbar = this.f52379a;
            Drawable drawable = this.f52385g;
            if (drawable == null) {
                drawable = this.f52395q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f52379a.setNavigationIcon((Drawable) null);
    }

    /* renamed from: H */
    public final void m69726H() {
        Drawable drawable;
        int i = this.f52380b;
        if ((i & 2) != 0) {
            if ((i & 1) != 0) {
                drawable = this.f52384f;
                if (drawable == null) {
                    drawable = this.f52383e;
                }
            } else {
                drawable = this.f52383e;
            }
        } else {
            drawable = null;
        }
        this.f52379a.setLogo(drawable);
    }

    @Override // p000.JV0
    /* renamed from: a */
    public boolean mo69725a() {
        return this.f52379a.m69767e();
    }

    @Override // p000.JV0
    /* renamed from: b */
    public void mo69724b(Drawable drawable) {
        C38790bq6.m62553A0(this.f52379a, drawable);
    }

    @Override // p000.JV0
    /* renamed from: c */
    public boolean mo69723c() {
        return this.f52379a.m69764f0();
    }

    @Override // p000.JV0
    public void collapseActionView() {
        this.f52379a.m69765f();
    }

    @Override // p000.JV0
    /* renamed from: d */
    public boolean mo69722d() {
        return this.f52379a.m69779V();
    }

    @Override // p000.JV0
    /* renamed from: e */
    public boolean mo69721e() {
        return this.f52379a.m69783Q();
    }

    @Override // p000.JV0
    /* renamed from: f */
    public boolean mo69720f() {
        return this.f52379a.m69780U();
    }

    @Override // p000.JV0
    /* renamed from: g */
    public boolean mo69719g() {
        return this.f52379a.m69784P();
    }

    @Override // p000.JV0
    public Context getContext() {
        return this.f52379a.getContext();
    }

    @Override // p000.JV0
    /* renamed from: h */
    public void mo69718h(int i) {
        View view;
        int i2 = this.f52380b ^ i;
        this.f52380b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m69728F();
                }
                m69727G();
            }
            if ((i2 & 3) != 0) {
                m69726H();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f52379a.setTitle(this.f52387i);
                    this.f52379a.setSubtitle(this.f52388j);
                } else {
                    this.f52379a.setTitle((CharSequence) null);
                    this.f52379a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && (view = this.f52382d) != null) {
                if ((i & 16) != 0) {
                    this.f52379a.addView(view);
                } else {
                    this.f52379a.removeView(view);
                }
            }
        }
    }

    @Override // p000.JV0
    /* renamed from: i */
    public int mo69717i() {
        return this.f52393o;
    }

    @Override // p000.JV0
    /* renamed from: j */
    public void mo69716j(int i) {
        m69731C(i == 0 ? null : getContext().getString(i));
    }

    @Override // p000.JV0
    /* renamed from: k */
    public void mo69715k() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // p000.JV0
    /* renamed from: l */
    public void mo69714l(boolean z) {
        this.f52379a.setCollapsible(z);
    }

    @Override // p000.JV0
    /* renamed from: m */
    public void mo69713m() {
        this.f52379a.m69763g();
    }

    @Override // p000.JV0
    /* renamed from: n */
    public int mo69712n() {
        return this.f52380b;
    }

    @Override // p000.JV0
    /* renamed from: o */
    public void mo69711o(View view) {
        View view2 = this.f52382d;
        if (view2 != null && (this.f52380b & 16) != 0) {
            this.f52379a.removeView(view2);
        }
        this.f52382d = view;
        if (view != null && (this.f52380b & 16) != 0) {
            this.f52379a.addView(view);
        }
    }

    @Override // p000.JV0
    /* renamed from: p */
    public void mo69710p() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // p000.JV0
    /* renamed from: q */
    public void mo69709q(Drawable drawable) {
        this.f52385g = drawable;
        m69727G();
    }

    @Override // p000.JV0
    /* renamed from: r */
    public Menu mo69708r() {
        return this.f52379a.m69797C();
    }

    @Override // p000.JV0
    /* renamed from: s */
    public C34823Ns6 mo69707s(int i, long j) {
        float f;
        C34823Ns6 m62490e = C38790bq6.m62490e(this.f52379a);
        if (i == 0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        return m62490e.m93248b(f).m93244f(j).m93242h(new C11137b(i));
    }

    @Override // p000.JV0
    public void setIcon(int i) {
        setIcon(i != 0 ? C29611vi.m8248b(getContext(), i) : null);
    }

    @Override // p000.JV0
    public void setMenu(Menu menu, InterfaceC11037i.InterfaceC11038a interfaceC11038a) {
        if (this.f52392n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f52379a.getContext());
            this.f52392n = actionMenuPresenter;
            actionMenuPresenter.m70192s(C39902dh4.action_menu_presenter);
        }
        this.f52392n.mo70079j(interfaceC11038a);
        this.f52379a.setMenu((C11028e) menu, this.f52392n);
    }

    @Override // p000.JV0
    public void setMenuPrepared() {
        this.f52391m = true;
    }

    @Override // p000.JV0
    public void setTitle(CharSequence charSequence) {
        this.f52386h = true;
        m69729E(charSequence);
    }

    @Override // p000.JV0
    public void setVisibility(int i) {
        this.f52379a.setVisibility(i);
    }

    @Override // p000.JV0
    public void setWindowCallback(Window.Callback callback) {
        this.f52390l = callback;
    }

    @Override // p000.JV0
    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f52386h) {
            m69729E(charSequence);
        }
    }

    @Override // p000.JV0
    /* renamed from: t */
    public ViewGroup mo69706t() {
        return this.f52379a;
    }

    @Override // p000.JV0
    /* renamed from: u */
    public void mo69705u(boolean z) {
    }

    @Override // p000.JV0
    /* renamed from: v */
    public void mo69704v(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.f52381c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f52379a;
            if (parent == toolbar) {
                toolbar.removeView(this.f52381c);
            }
        }
        this.f52381c = scrollingTabContainerView;
        if (scrollingTabContainerView != null && this.f52393o == 2) {
            this.f52379a.addView(scrollingTabContainerView, 0);
            Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.f52381c.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams).width = -2;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = -2;
            layoutParams.f51478a = 8388691;
            scrollingTabContainerView.setAllowCollapse(true);
        }
    }

    @Override // p000.JV0
    /* renamed from: w */
    public void mo69703w(int i) {
        m69732B(i != 0 ? C29611vi.m8248b(getContext(), i) : null);
    }

    @Override // p000.JV0
    /* renamed from: x */
    public void mo69702x(int i) {
        mo69709q(i != 0 ? C29611vi.m8248b(getContext(), i) : null);
    }

    @Override // p000.JV0
    /* renamed from: y */
    public void mo69701y(InterfaceC11037i.InterfaceC11038a interfaceC11038a, C11028e.InterfaceC11029a interfaceC11029a) {
        this.f52379a.setMenuCallbacks(interfaceC11038a, interfaceC11029a);
    }

    /* renamed from: z */
    public final int m69700z() {
        if (this.f52379a.m69794F() != null) {
            this.f52395q = this.f52379a.m69794F();
            return 15;
        }
        return 11;
    }

    public C11135a(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.f52393o = 0;
        this.f52394p = 0;
        this.f52379a = toolbar;
        this.f52387i = toolbar.m69792H();
        this.f52388j = toolbar.m69793G();
        this.f52386h = this.f52387i != null;
        this.f52385g = toolbar.m69794F();
        Z46 m73747v = Z46.m73747v(toolbar.getContext(), null, C43509jm4.ActionBar, C50553vf4.actionBarStyle, 0);
        this.f52395q = m73747v.m73762g(C43509jm4.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence m73753p = m73747v.m73753p(C43509jm4.ActionBar_title);
            if (!TextUtils.isEmpty(m73753p)) {
                setTitle(m73753p);
            }
            CharSequence m73753p2 = m73747v.m73753p(C43509jm4.ActionBar_subtitle);
            if (!TextUtils.isEmpty(m73753p2)) {
                m69730D(m73753p2);
            }
            Drawable m73762g = m73747v.m73762g(C43509jm4.ActionBar_logo);
            if (m73762g != null) {
                m69732B(m73762g);
            }
            Drawable m73762g2 = m73747v.m73762g(C43509jm4.ActionBar_icon);
            if (m73762g2 != null) {
                setIcon(m73762g2);
            }
            if (this.f52385g == null && (drawable = this.f52395q) != null) {
                mo69709q(drawable);
            }
            mo69718h(m73747v.m73758k(C43509jm4.ActionBar_displayOptions, 0));
            int m73755n = m73747v.m73755n(C43509jm4.ActionBar_customNavigationLayout, 0);
            if (m73755n != 0) {
                mo69711o(LayoutInflater.from(this.f52379a.getContext()).inflate(m73755n, (ViewGroup) this.f52379a, false));
                mo69718h(this.f52380b | 16);
            }
            int m73756m = m73747v.m73756m(C43509jm4.ActionBar_height, 0);
            if (m73756m > 0) {
                ViewGroup.LayoutParams layoutParams = this.f52379a.getLayoutParams();
                layoutParams.height = m73756m;
                this.f52379a.setLayoutParams(layoutParams);
            }
            int m73764e = m73747v.m73764e(C43509jm4.ActionBar_contentInsetStart, -1);
            int m73764e2 = m73747v.m73764e(C43509jm4.ActionBar_contentInsetEnd, -1);
            if (m73764e >= 0 || m73764e2 >= 0) {
                this.f52379a.setContentInsetsRelative(Math.max(m73764e, 0), Math.max(m73764e2, 0));
            }
            int m73755n2 = m73747v.m73755n(C43509jm4.ActionBar_titleTextStyle, 0);
            if (m73755n2 != 0) {
                Toolbar toolbar2 = this.f52379a;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), m73755n2);
            }
            int m73755n3 = m73747v.m73755n(C43509jm4.ActionBar_subtitleTextStyle, 0);
            if (m73755n3 != 0) {
                Toolbar toolbar3 = this.f52379a;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), m73755n3);
            }
            int m73755n4 = m73747v.m73755n(C43509jm4.ActionBar_popupTheme, 0);
            if (m73755n4 != 0) {
                this.f52379a.setPopupTheme(m73755n4);
            }
        } else {
            this.f52380b = m69700z();
        }
        m73747v.m73746w();
        m69733A(i);
        this.f52389k = this.f52379a.m69795E();
        this.f52379a.setNavigationOnClickListener(new View$OnClickListenerC11136a());
    }

    @Override // p000.JV0
    public void setIcon(Drawable drawable) {
        this.f52383e = drawable;
        m69726H();
    }
}

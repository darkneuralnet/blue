package androidx.appcompat.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
/* renamed from: androidx.appcompat.app.a */
/* loaded from: classes.dex */
public class C10990a implements DrawerLayout.InterfaceC11567e {

    /* renamed from: a */
    public final InterfaceC10992b f51687a;

    /* renamed from: b */
    public final DrawerLayout f51688b;

    /* renamed from: c */
    public C43122j71 f51689c;

    /* renamed from: d */
    public boolean f51690d;

    /* renamed from: e */
    public Drawable f51691e;

    /* renamed from: f */
    public boolean f51692f;

    /* renamed from: g */
    public boolean f51693g;

    /* renamed from: h */
    public final int f51694h;

    /* renamed from: i */
    public final int f51695i;

    /* renamed from: j */
    public View.OnClickListener f51696j;

    /* renamed from: k */
    public boolean f51697k;

    /* renamed from: androidx.appcompat.app.a$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC10991a implements View.OnClickListener {
        public View$OnClickListenerC10991a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C10990a c10990a = C10990a.this;
            if (c10990a.f51692f) {
                c10990a.m70311n();
                return;
            }
            View.OnClickListener onClickListener = c10990a.f51696j;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.a$b */
    /* loaded from: classes.dex */
    public interface InterfaceC10992b {
        /* renamed from: a */
        Context mo70308a();

        /* renamed from: b */
        boolean mo70307b();

        /* renamed from: c */
        Drawable mo70306c();

        /* renamed from: d */
        void mo70305d(Drawable drawable, int i);

        /* renamed from: e */
        void mo70304e(int i);
    }

    /* renamed from: androidx.appcompat.app.a$c */
    /* loaded from: classes.dex */
    public interface InterfaceC10993c {
        InterfaceC10992b getDrawerToggleDelegate();
    }

    /* renamed from: androidx.appcompat.app.a$d */
    /* loaded from: classes.dex */
    public static class C10994d implements InterfaceC10992b {

        /* renamed from: a */
        public final Activity f51699a;

        /* renamed from: androidx.appcompat.app.a$d$a */
        /* loaded from: classes.dex */
        public static class C10995a {
            private C10995a() {
            }

            /* renamed from: a */
            public static void m70310a(android.app.ActionBar actionBar, int i) {
                actionBar.setHomeActionContentDescription(i);
            }

            /* renamed from: b */
            public static void m70309b(android.app.ActionBar actionBar, Drawable drawable) {
                actionBar.setHomeAsUpIndicator(drawable);
            }
        }

        public C10994d(Activity activity) {
            this.f51699a = activity;
        }

        @Override // androidx.appcompat.app.C10990a.InterfaceC10992b
        /* renamed from: a */
        public Context mo70308a() {
            android.app.ActionBar actionBar = this.f51699a.getActionBar();
            if (actionBar != null) {
                return actionBar.getThemedContext();
            }
            return this.f51699a;
        }

        @Override // androidx.appcompat.app.C10990a.InterfaceC10992b
        /* renamed from: b */
        public boolean mo70307b() {
            android.app.ActionBar actionBar = this.f51699a.getActionBar();
            if (actionBar != null && (actionBar.getDisplayOptions() & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.app.C10990a.InterfaceC10992b
        /* renamed from: c */
        public Drawable mo70306c() {
            TypedArray obtainStyledAttributes = mo70308a().obtainStyledAttributes(null, new int[]{16843531}, 16843470, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // androidx.appcompat.app.C10990a.InterfaceC10992b
        /* renamed from: d */
        public void mo70305d(Drawable drawable, int i) {
            android.app.ActionBar actionBar = this.f51699a.getActionBar();
            if (actionBar != null) {
                C10995a.m70309b(actionBar, drawable);
                C10995a.m70310a(actionBar, i);
            }
        }

        @Override // androidx.appcompat.app.C10990a.InterfaceC10992b
        /* renamed from: e */
        public void mo70304e(int i) {
            android.app.ActionBar actionBar = this.f51699a.getActionBar();
            if (actionBar != null) {
                C10995a.m70310a(actionBar, i);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.a$e */
    /* loaded from: classes.dex */
    public static class C10996e implements InterfaceC10992b {

        /* renamed from: a */
        public final Toolbar f51700a;

        /* renamed from: b */
        public final Drawable f51701b;

        /* renamed from: c */
        public final CharSequence f51702c;

        public C10996e(Toolbar toolbar) {
            this.f51700a = toolbar;
            this.f51701b = toolbar.m69794F();
            this.f51702c = toolbar.m69795E();
        }

        @Override // androidx.appcompat.app.C10990a.InterfaceC10992b
        /* renamed from: a */
        public Context mo70308a() {
            return this.f51700a.getContext();
        }

        @Override // androidx.appcompat.app.C10990a.InterfaceC10992b
        /* renamed from: b */
        public boolean mo70307b() {
            return true;
        }

        @Override // androidx.appcompat.app.C10990a.InterfaceC10992b
        /* renamed from: c */
        public Drawable mo70306c() {
            return this.f51701b;
        }

        @Override // androidx.appcompat.app.C10990a.InterfaceC10992b
        /* renamed from: d */
        public void mo70305d(Drawable drawable, int i) {
            this.f51700a.setNavigationIcon(drawable);
            mo70304e(i);
        }

        @Override // androidx.appcompat.app.C10990a.InterfaceC10992b
        /* renamed from: e */
        public void mo70304e(int i) {
            if (i == 0) {
                this.f51700a.setNavigationContentDescription(this.f51702c);
            } else {
                this.f51700a.setNavigationContentDescription(i);
            }
        }
    }

    public C10990a(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int i, int i2) {
        this(activity, toolbar, drawerLayout, null, i, i2);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC11567e
    /* renamed from: a */
    public void mo67560a(View view) {
        m70314k(1.0f);
        if (this.f51692f) {
            m70319f(this.f51695i);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC11567e
    /* renamed from: b */
    public void mo67559b(View view) {
        m70314k(0.0f);
        if (this.f51692f) {
            m70319f(this.f51694h);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC11567e
    /* renamed from: c */
    public void mo67558c(int i) {
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC11567e
    /* renamed from: d */
    public void mo67557d(View view, float f) {
        if (this.f51690d) {
            m70314k(Math.min(1.0f, Math.max(0.0f, f)));
        } else {
            m70314k(0.0f);
        }
    }

    /* renamed from: e */
    public Drawable m70320e() {
        return this.f51687a.mo70306c();
    }

    /* renamed from: f */
    public void m70319f(int i) {
        this.f51687a.mo70304e(i);
    }

    /* renamed from: g */
    public void m70318g(Drawable drawable, int i) {
        if (!this.f51697k && !this.f51687a.mo70307b()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.f51697k = true;
        }
        this.f51687a.mo70305d(drawable, i);
    }

    /* renamed from: h */
    public void m70317h(boolean z) {
        int i;
        if (z != this.f51692f) {
            if (z) {
                C43122j71 c43122j71 = this.f51689c;
                if (this.f51688b.m67611C(8388611)) {
                    i = this.f51695i;
                } else {
                    i = this.f51694h;
                }
                m70318g(c43122j71, i);
            } else {
                m70318g(this.f51691e, 0);
            }
            this.f51692f = z;
        }
    }

    /* renamed from: i */
    public void m70316i(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = this.f51688b.getResources().getDrawable(i);
        } else {
            drawable = null;
        }
        m70315j(drawable);
    }

    /* renamed from: j */
    public void m70315j(Drawable drawable) {
        if (drawable == null) {
            this.f51691e = m70320e();
            this.f51693g = false;
        } else {
            this.f51691e = drawable;
            this.f51693g = true;
        }
        if (!this.f51692f) {
            m70318g(this.f51691e, 0);
        }
    }

    /* renamed from: k */
    public final void m70314k(float f) {
        if (f == 1.0f) {
            this.f51689c.m31076g(true);
        } else if (f == 0.0f) {
            this.f51689c.m31076g(false);
        }
        this.f51689c.m31078e(f);
    }

    /* renamed from: l */
    public void m70313l(View.OnClickListener onClickListener) {
        this.f51696j = onClickListener;
    }

    /* renamed from: m */
    public void m70312m() {
        int i;
        if (this.f51688b.m67611C(8388611)) {
            m70314k(1.0f);
        } else {
            m70314k(0.0f);
        }
        if (this.f51692f) {
            C43122j71 c43122j71 = this.f51689c;
            if (this.f51688b.m67611C(8388611)) {
                i = this.f51695i;
            } else {
                i = this.f51694h;
            }
            m70318g(c43122j71, i);
        }
    }

    /* renamed from: n */
    public void m70311n() {
        int m67575q = this.f51688b.m67575q(8388611);
        if (this.f51688b.m67608F(8388611) && m67575q != 2) {
            this.f51688b.m67588d(8388611);
        } else if (m67575q != 1) {
            this.f51688b.m67603K(8388611);
        }
    }

    public C10990a(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, C43122j71 c43122j71, int i, int i2) {
        this.f51690d = true;
        this.f51692f = true;
        this.f51697k = false;
        if (toolbar != null) {
            this.f51687a = new C10996e(toolbar);
            toolbar.setNavigationOnClickListener(new View$OnClickListenerC10991a());
        } else if (activity instanceof InterfaceC10993c) {
            this.f51687a = ((InterfaceC10993c) activity).getDrawerToggleDelegate();
        } else {
            this.f51687a = new C10994d(activity);
        }
        this.f51688b = drawerLayout;
        this.f51694h = i;
        this.f51695i = i2;
        if (c43122j71 == null) {
            this.f51689c = new C43122j71(this.f51687a.mo70308a());
        } else {
            this.f51689c = c43122j71;
        }
        this.f51691e = m70320e();
    }
}

package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.view.menu.C11028e;
import androidx.appcompat.view.menu.InterfaceC11037i;
import androidx.appcompat.widget.C11135a;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
/* renamed from: androidx.appcompat.app.e */
/* loaded from: classes.dex */
public class C11005e extends ActionBar {

    /* renamed from: a */
    public final JV0 f51719a;

    /* renamed from: b */
    public final Window.Callback f51720b;

    /* renamed from: c */
    public final AppCompatDelegateImpl.InterfaceC10972g f51721c;

    /* renamed from: d */
    public boolean f51722d;

    /* renamed from: e */
    public boolean f51723e;

    /* renamed from: f */
    public boolean f51724f;

    /* renamed from: g */
    public ArrayList<ActionBar.InterfaceC10952a> f51725g = new ArrayList<>();

    /* renamed from: h */
    public final Runnable f51726h = new RunnableC11006a();

    /* renamed from: i */
    public final Toolbar.InterfaceC11133g f51727i;

    /* renamed from: androidx.appcompat.app.e$a */
    /* loaded from: classes.dex */
    public class RunnableC11006a implements Runnable {
        public RunnableC11006a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C11005e.this.m70254J();
        }
    }

    /* renamed from: androidx.appcompat.app.e$b */
    /* loaded from: classes.dex */
    public class C11007b implements Toolbar.InterfaceC11133g {
        public C11007b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.InterfaceC11133g
        public boolean onMenuItemClick(MenuItem menuItem) {
            return C11005e.this.f51720b.onMenuItemSelected(0, menuItem);
        }
    }

    /* renamed from: androidx.appcompat.app.e$c */
    /* loaded from: classes.dex */
    public final class C11008c implements InterfaceC11037i.InterfaceC11038a {

        /* renamed from: b */
        public boolean f51730b;

        public C11008c() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC11037i.InterfaceC11038a
        /* renamed from: b */
        public void mo69982b(C11028e c11028e, boolean z) {
            if (this.f51730b) {
                return;
            }
            this.f51730b = true;
            C11005e.this.f51719a.mo69713m();
            C11005e.this.f51720b.onPanelClosed(108, c11028e);
            this.f51730b = false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC11037i.InterfaceC11038a
        /* renamed from: c */
        public boolean mo69981c(C11028e c11028e) {
            C11005e.this.f51720b.onMenuOpened(108, c11028e);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.e$d */
    /* loaded from: classes.dex */
    public final class C11009d implements C11028e.InterfaceC11029a {
        public C11009d() {
        }

        @Override // androidx.appcompat.view.menu.C11028e.InterfaceC11029a
        /* renamed from: a */
        public boolean mo5020a(C11028e c11028e, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.C11028e.InterfaceC11029a
        /* renamed from: b */
        public void mo5019b(C11028e c11028e) {
            if (C11005e.this.f51719a.mo69722d()) {
                C11005e.this.f51720b.onPanelClosed(108, c11028e);
            } else if (C11005e.this.f51720b.onPreparePanel(0, null, c11028e)) {
                C11005e.this.f51720b.onMenuOpened(108, c11028e);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.e$e */
    /* loaded from: classes.dex */
    public class C11010e implements AppCompatDelegateImpl.InterfaceC10972g {
        public C11010e() {
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.InterfaceC10972g
        /* renamed from: a */
        public boolean mo70247a(int i) {
            if (i == 0) {
                C11005e c11005e = C11005e.this;
                if (!c11005e.f51722d) {
                    c11005e.f51719a.setMenuPrepared();
                    C11005e.this.f51722d = true;
                    return false;
                }
                return false;
            }
            return false;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.InterfaceC10972g
        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(C11005e.this.f51719a.getContext());
            }
            return null;
        }
    }

    public C11005e(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        C11007b c11007b = new C11007b();
        this.f51727i = c11007b;
        HZ3.m103731g(toolbar);
        C11135a c11135a = new C11135a(toolbar, false);
        this.f51719a = c11135a;
        this.f51720b = (Window.Callback) HZ3.m103731g(callback);
        c11135a.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(c11007b);
        c11135a.setWindowTitle(charSequence);
        this.f51721c = new C11010e();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: A */
    public void mo70246A(Drawable drawable) {
        this.f51719a.mo69709q(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: B */
    public void mo70245B(boolean z) {
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: C */
    public void mo70244C(boolean z) {
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: D */
    public void mo70243D(int i) {
        JV0 jv0 = this.f51719a;
        jv0.setTitle(i != 0 ? jv0.getContext().getText(i) : null);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: E */
    public void mo70242E(CharSequence charSequence) {
        this.f51719a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: F */
    public void mo70241F(CharSequence charSequence) {
        this.f51719a.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: G */
    public void mo70240G() {
        this.f51719a.setVisibility(0);
    }

    /* renamed from: I */
    public final Menu m70255I() {
        if (!this.f51723e) {
            this.f51719a.mo69701y(new C11008c(), new C11009d());
            this.f51723e = true;
        }
        return this.f51719a.mo69708r();
    }

    /* renamed from: J */
    public void m70254J() {
        C11028e c11028e;
        Menu m70255I = m70255I();
        if (m70255I instanceof C11028e) {
            c11028e = (C11028e) m70255I;
        } else {
            c11028e = null;
        }
        if (c11028e != null) {
            c11028e.m70139h0();
        }
        try {
            m70255I.clear();
            if (!this.f51720b.onCreatePanelMenu(0, m70255I) || !this.f51720b.onPreparePanel(0, null, m70255I)) {
                m70255I.clear();
            }
        } finally {
            if (c11028e != null) {
                c11028e.m70140g0();
            }
        }
    }

    /* renamed from: K */
    public void m70253K(int i, int i2) {
        this.f51719a.mo69718h((i & i2) | ((~i2) & this.f51719a.mo69712n()));
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: g */
    public boolean mo70252g() {
        return this.f51719a.mo69721e();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: h */
    public boolean mo70222h() {
        if (this.f51719a.mo69719g()) {
            this.f51719a.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: i */
    public void mo70221i(boolean z) {
        if (z == this.f51724f) {
            return;
        }
        this.f51724f = z;
        int size = this.f51725g.size();
        for (int i = 0; i < size; i++) {
            this.f51725g.get(i).m70458a(z);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: j */
    public int mo70220j() {
        return this.f51719a.mo69712n();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: k */
    public Context mo70219k() {
        return this.f51719a.getContext();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: l */
    public void mo70218l() {
        this.f51719a.setVisibility(8);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: m */
    public boolean mo70251m() {
        this.f51719a.mo69706t().removeCallbacks(this.f51726h);
        C38790bq6.m62468n0(this.f51719a.mo69706t(), this.f51726h);
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: n */
    public void mo70217n(Configuration configuration) {
        super.mo70217n(configuration);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: o */
    public void mo70250o() {
        this.f51719a.mo69706t().removeCallbacks(this.f51726h);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: p */
    public boolean mo70216p(int i, KeyEvent keyEvent) {
        int i2;
        Menu m70255I = m70255I();
        if (m70255I == null) {
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
        m70255I.setQwertyMode(z);
        return m70255I.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: q */
    public boolean mo70249q(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo70248r();
        }
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: r */
    public boolean mo70248r() {
        return this.f51719a.mo69723c();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: s */
    public void mo70215s(Drawable drawable) {
        this.f51719a.mo69724b(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: t */
    public void mo70214t(View view, ActionBar.LayoutParams layoutParams) {
        if (view != null) {
            view.setLayoutParams(layoutParams);
        }
        this.f51719a.mo69711o(view);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: u */
    public void mo70213u(boolean z) {
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: v */
    public void mo70212v(boolean z) {
        m70253K(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: w */
    public void mo70211w(boolean z) {
        m70253K(z ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: x */
    public void mo70210x(boolean z) {
        m70253K(z ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: y */
    public void mo70209y(int i) {
        this.f51719a.mo69716j(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: z */
    public void mo70208z(int i) {
        this.f51719a.mo69702x(i);
    }
}

package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.InterfaceC11039j;
import p000.AbstractC3314I2;
/* renamed from: androidx.appcompat.view.menu.g */
/* loaded from: classes.dex */
public final class C11032g implements InterfaceMenuItemC39788dV5 {

    /* renamed from: A */
    public View f51901A;

    /* renamed from: B */
    public AbstractC3314I2 f51902B;

    /* renamed from: C */
    public MenuItem.OnActionExpandListener f51903C;

    /* renamed from: E */
    public ContextMenu.ContextMenuInfo f51905E;

    /* renamed from: a */
    public final int f51906a;

    /* renamed from: b */
    public final int f51907b;

    /* renamed from: c */
    public final int f51908c;

    /* renamed from: d */
    public final int f51909d;

    /* renamed from: e */
    public CharSequence f51910e;

    /* renamed from: f */
    public CharSequence f51911f;

    /* renamed from: g */
    public Intent f51912g;

    /* renamed from: h */
    public char f51913h;

    /* renamed from: j */
    public char f51915j;

    /* renamed from: l */
    public Drawable f51917l;

    /* renamed from: n */
    public C11028e f51919n;

    /* renamed from: o */
    public SubMenuC11044l f51920o;

    /* renamed from: p */
    public Runnable f51921p;

    /* renamed from: q */
    public MenuItem.OnMenuItemClickListener f51922q;

    /* renamed from: r */
    public CharSequence f51923r;

    /* renamed from: s */
    public CharSequence f51924s;

    /* renamed from: z */
    public int f51931z;

    /* renamed from: i */
    public int f51914i = 4096;

    /* renamed from: k */
    public int f51916k = 4096;

    /* renamed from: m */
    public int f51918m = 0;

    /* renamed from: t */
    public ColorStateList f51925t = null;

    /* renamed from: u */
    public PorterDuff.Mode f51926u = null;

    /* renamed from: v */
    public boolean f51927v = false;

    /* renamed from: w */
    public boolean f51928w = false;

    /* renamed from: x */
    public boolean f51929x = false;

    /* renamed from: y */
    public int f51930y = 16;

    /* renamed from: D */
    public boolean f51904D = false;

    /* renamed from: androidx.appcompat.view.menu.g$a */
    /* loaded from: classes.dex */
    public class C11033a implements AbstractC3314I2.InterfaceC3316b {
        public C11033a() {
        }

        @Override // p000.AbstractC3314I2.InterfaceC3316b
        public void onActionProviderVisibilityChanged(boolean z) {
            C11032g c11032g = C11032g.this;
            c11032g.f51919n.m70166L(c11032g);
        }
    }

    public C11032g(C11028e c11028e, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f51919n = c11028e;
        this.f51906a = i2;
        this.f51907b = i;
        this.f51908c = i3;
        this.f51909d = i4;
        this.f51910e = charSequence;
        this.f51931z = i5;
    }

    /* renamed from: d */
    public static void m70117d(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* renamed from: A */
    public boolean m70120A() {
        return this.f51919n.mo70075J() && m70114g() != 0;
    }

    /* renamed from: B */
    public boolean m70119B() {
        return (this.f51931z & 4) == 4;
    }

    @Override // p000.InterfaceMenuItemC39788dV5
    /* renamed from: a */
    public InterfaceMenuItemC39788dV5 mo44208a(AbstractC3314I2 abstractC3314I2) {
        AbstractC3314I2 abstractC3314I22 = this.f51902B;
        if (abstractC3314I22 != null) {
            abstractC3314I22.m103049h();
        }
        this.f51901A = null;
        this.f51902B = abstractC3314I2;
        this.f51919n.mo70165M(true);
        AbstractC3314I2 abstractC3314I23 = this.f51902B;
        if (abstractC3314I23 != null) {
            abstractC3314I23.mo17519j(new C11033a());
        }
        return this;
    }

    @Override // p000.InterfaceMenuItemC39788dV5
    /* renamed from: b */
    public AbstractC3314I2 mo44207b() {
        return this.f51902B;
    }

    /* renamed from: c */
    public void m70118c() {
        this.f51919n.m70167K(this);
    }

    @Override // p000.InterfaceMenuItemC39788dV5, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f51931z & 8) == 0) {
            return false;
        }
        if (this.f51901A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f51903C;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f51919n.mo70073f(this);
    }

    /* renamed from: e */
    public final Drawable m70116e(Drawable drawable) {
        if (drawable != null && this.f51929x && (this.f51927v || this.f51928w)) {
            drawable = P61.m90834r(drawable).mutate();
            if (this.f51927v) {
                P61.m90837o(drawable, this.f51925t);
            }
            if (this.f51928w) {
                P61.m90836p(drawable, this.f51926u);
            }
            this.f51929x = false;
        }
        return drawable;
    }

    @Override // p000.InterfaceMenuItemC39788dV5, android.view.MenuItem
    public boolean expandActionView() {
        if (!m70111j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f51903C;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
            return false;
        }
        return this.f51919n.mo70070m(this);
    }

    /* renamed from: f */
    public int m70115f() {
        return this.f51909d;
    }

    /* renamed from: g */
    public char m70114g() {
        return this.f51919n.mo70076I() ? this.f51915j : this.f51913h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p000.InterfaceMenuItemC39788dV5, android.view.MenuItem
    public View getActionView() {
        View view = this.f51901A;
        if (view != null) {
            return view;
        }
        AbstractC3314I2 abstractC3314I2 = this.f51902B;
        if (abstractC3314I2 != null) {
            View mo17521d = abstractC3314I2.mo17521d(this);
            this.f51901A = mo17521d;
            return mo17521d;
        }
        return null;
    }

    @Override // p000.InterfaceMenuItemC39788dV5, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f51916k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f51915j;
    }

    @Override // p000.InterfaceMenuItemC39788dV5, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f51923r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f51907b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f51917l;
        if (drawable != null) {
            return m70116e(drawable);
        }
        if (this.f51918m != 0) {
            Drawable m8248b = C29611vi.m8248b(this.f51919n.m70126w(), this.f51918m);
            this.f51918m = 0;
            this.f51917l = m8248b;
            return m70116e(m8248b);
        }
        return null;
    }

    @Override // p000.InterfaceMenuItemC39788dV5, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f51925t;
    }

    @Override // p000.InterfaceMenuItemC39788dV5, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f51926u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f51912g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f51906a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f51905E;
    }

    @Override // p000.InterfaceMenuItemC39788dV5, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f51914i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f51913h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f51908c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f51920o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f51910e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f51911f;
        return charSequence != null ? charSequence : this.f51910e;
    }

    @Override // p000.InterfaceMenuItemC39788dV5, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f51924s;
    }

    /* renamed from: h */
    public String m70113h() {
        int i;
        char m70114g = m70114g();
        if (m70114g == 0) {
            return "";
        }
        Resources resources = this.f51919n.m70126w().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f51919n.m70126w()).hasPermanentMenuKey()) {
            sb.append(resources.getString(C49428tl4.abc_prepend_shortcut_label));
        }
        if (this.f51919n.mo70076I()) {
            i = this.f51916k;
        } else {
            i = this.f51914i;
        }
        m70117d(sb, i, 65536, resources.getString(C49428tl4.abc_menu_meta_shortcut_label));
        m70117d(sb, i, 4096, resources.getString(C49428tl4.abc_menu_ctrl_shortcut_label));
        m70117d(sb, i, 2, resources.getString(C49428tl4.abc_menu_alt_shortcut_label));
        m70117d(sb, i, 1, resources.getString(C49428tl4.abc_menu_shift_shortcut_label));
        m70117d(sb, i, 4, resources.getString(C49428tl4.abc_menu_sym_shortcut_label));
        m70117d(sb, i, 8, resources.getString(C49428tl4.abc_menu_function_shortcut_label));
        if (m70114g != '\b') {
            if (m70114g != '\n') {
                if (m70114g != ' ') {
                    sb.append(m70114g);
                } else {
                    sb.append(resources.getString(C49428tl4.abc_menu_space_shortcut_label));
                }
            } else {
                sb.append(resources.getString(C49428tl4.abc_menu_enter_shortcut_label));
            }
        } else {
            sb.append(resources.getString(C49428tl4.abc_menu_delete_shortcut_label));
        }
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f51920o != null;
    }

    /* renamed from: i */
    public CharSequence m70112i(InterfaceC11039j.InterfaceC11040a interfaceC11040a) {
        if (interfaceC11040a != null && interfaceC11040a.mo49374c()) {
            return getTitleCondensed();
        }
        return getTitle();
    }

    @Override // p000.InterfaceMenuItemC39788dV5, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f51904D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f51930y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f51930y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f51930y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC3314I2 abstractC3314I2 = this.f51902B;
        if (abstractC3314I2 != null && abstractC3314I2.mo17520g()) {
            if ((this.f51930y & 8) == 0 && this.f51902B.mo17522b()) {
                return true;
            }
            return false;
        } else if ((this.f51930y & 8) == 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: j */
    public boolean m70111j() {
        AbstractC3314I2 abstractC3314I2;
        if ((this.f51931z & 8) == 0) {
            return false;
        }
        if (this.f51901A == null && (abstractC3314I2 = this.f51902B) != null) {
            this.f51901A = abstractC3314I2.mo17521d(this);
        }
        if (this.f51901A == null) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public boolean m70110k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f51922q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C11028e c11028e = this.f51919n;
        if (c11028e.mo70072h(c11028e, this)) {
            return true;
        }
        Runnable runnable = this.f51921p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f51912g != null) {
            try {
                this.f51919n.m70126w().startActivity(this.f51912g);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        AbstractC3314I2 abstractC3314I2 = this.f51902B;
        if (abstractC3314I2 != null && abstractC3314I2.mo17524e()) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public boolean m70109l() {
        return (this.f51930y & 32) == 32;
    }

    /* renamed from: m */
    public boolean m70108m() {
        return (this.f51930y & 4) != 0;
    }

    /* renamed from: n */
    public boolean m70107n() {
        return (this.f51931z & 1) == 1;
    }

    /* renamed from: o */
    public boolean m70106o() {
        return (this.f51931z & 2) == 2;
    }

    @Override // p000.InterfaceMenuItemC39788dV5, android.view.MenuItem
    /* renamed from: p */
    public InterfaceMenuItemC39788dV5 setActionView(int i) {
        Context m70126w = this.f51919n.m70126w();
        setActionView(LayoutInflater.from(m70126w).inflate(i, (ViewGroup) new LinearLayout(m70126w), false));
        return this;
    }

    @Override // p000.InterfaceMenuItemC39788dV5, android.view.MenuItem
    /* renamed from: q */
    public InterfaceMenuItemC39788dV5 setActionView(View view) {
        int i;
        this.f51901A = view;
        this.f51902B = null;
        if (view != null && view.getId() == -1 && (i = this.f51906a) > 0) {
            view.setId(i);
        }
        this.f51919n.m70167K(this);
        return this;
    }

    /* renamed from: r */
    public void m70103r(boolean z) {
        this.f51904D = z;
        this.f51919n.mo70165M(false);
    }

    /* renamed from: s */
    public void m70102s(boolean z) {
        int i;
        int i2 = this.f51930y;
        int i3 = i2 & (-3);
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        int i4 = i | i3;
        this.f51930y = i4;
        if (i2 != i4) {
            this.f51919n.mo70165M(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f51915j == c) {
            return this;
        }
        this.f51915j = Character.toLowerCase(c);
        this.f51919n.mo70165M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.f51930y;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f51930y = i2;
        if (i != i2) {
            this.f51919n.mo70165M(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.f51930y & 4) != 0) {
            this.f51919n.m70155X(this);
        } else {
            m70102s(z);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.f51930y |= 16;
        } else {
            this.f51930y &= -17;
        }
        this.f51919n.mo70165M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f51918m = 0;
        this.f51917l = drawable;
        this.f51929x = true;
        this.f51919n.mo70165M(false);
        return this;
    }

    @Override // p000.InterfaceMenuItemC39788dV5, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f51925t = colorStateList;
        this.f51927v = true;
        this.f51929x = true;
        this.f51919n.mo70165M(false);
        return this;
    }

    @Override // p000.InterfaceMenuItemC39788dV5, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f51926u = mode;
        this.f51928w = true;
        this.f51929x = true;
        this.f51919n.mo70165M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f51912g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        if (this.f51913h == c) {
            return this;
        }
        this.f51913h = c;
        this.f51919n.mo70165M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f51903C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f51922q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f51913h = c;
        this.f51915j = Character.toLowerCase(c2);
        this.f51919n.mo70165M(false);
        return this;
    }

    @Override // p000.InterfaceMenuItemC39788dV5, android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f51931z = i;
        this.f51919n.m70167K(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f51910e = charSequence;
        this.f51919n.mo70165M(false);
        SubMenuC11044l subMenuC11044l = this.f51920o;
        if (subMenuC11044l != null) {
            subMenuC11044l.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f51911f = charSequence;
        this.f51919n.mo70165M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (m70096y(z)) {
            this.f51919n.m70166L(this);
        }
        return this;
    }

    /* renamed from: t */
    public void m70101t(boolean z) {
        this.f51930y = (z ? 4 : 0) | (this.f51930y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f51910e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: u */
    public void m70100u(boolean z) {
        if (z) {
            this.f51930y |= 32;
        } else {
            this.f51930y &= -33;
        }
    }

    /* renamed from: v */
    public void m70099v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f51905E = contextMenuInfo;
    }

    @Override // p000.InterfaceMenuItemC39788dV5, android.view.MenuItem
    /* renamed from: w */
    public InterfaceMenuItemC39788dV5 setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    /* renamed from: x */
    public void m70097x(SubMenuC11044l subMenuC11044l) {
        this.f51920o = subMenuC11044l;
        subMenuC11044l.setHeaderTitle(getTitle());
    }

    /* renamed from: y */
    public boolean m70096y(boolean z) {
        int i;
        int i2 = this.f51930y;
        int i3 = i2 & (-9);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        int i4 = i | i3;
        this.f51930y = i4;
        if (i2 == i4) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public boolean m70095z() {
        return this.f51919n.m70171C();
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC39788dV5 setContentDescription(CharSequence charSequence) {
        this.f51923r = charSequence;
        this.f51919n.mo70165M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC39788dV5 setTooltipText(CharSequence charSequence) {
        this.f51924s = charSequence;
        this.f51919n.mo70165M(false);
        return this;
    }

    @Override // p000.InterfaceMenuItemC39788dV5, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f51915j == c && this.f51916k == i) {
            return this;
        }
        this.f51915j = Character.toLowerCase(c);
        this.f51916k = KeyEvent.normalizeMetaState(i);
        this.f51919n.mo70165M(false);
        return this;
    }

    @Override // p000.InterfaceMenuItemC39788dV5, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f51913h == c && this.f51914i == i) {
            return this;
        }
        this.f51913h = c;
        this.f51914i = KeyEvent.normalizeMetaState(i);
        this.f51919n.mo70165M(false);
        return this;
    }

    @Override // p000.InterfaceMenuItemC39788dV5, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f51913h = c;
        this.f51914i = KeyEvent.normalizeMetaState(i);
        this.f51915j = Character.toLowerCase(c2);
        this.f51916k = KeyEvent.normalizeMetaState(i2);
        this.f51919n.mo70165M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f51917l = null;
        this.f51918m = i;
        this.f51929x = true;
        this.f51919n.mo70165M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        return setTitle(this.f51919n.m70126w().getString(i));
    }
}

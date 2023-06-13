package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* renamed from: F2 */
/* loaded from: classes.dex */
public class C2055F2 implements InterfaceMenuItemC39788dV5 {

    /* renamed from: a */
    public final int f8454a;

    /* renamed from: b */
    public final int f8455b;

    /* renamed from: c */
    public final int f8456c;

    /* renamed from: d */
    public CharSequence f8457d;

    /* renamed from: e */
    public CharSequence f8458e;

    /* renamed from: f */
    public Intent f8459f;

    /* renamed from: g */
    public char f8460g;

    /* renamed from: i */
    public char f8462i;

    /* renamed from: k */
    public Drawable f8464k;

    /* renamed from: l */
    public Context f8465l;

    /* renamed from: m */
    public MenuItem.OnMenuItemClickListener f8466m;

    /* renamed from: n */
    public CharSequence f8467n;

    /* renamed from: o */
    public CharSequence f8468o;

    /* renamed from: h */
    public int f8461h = 4096;

    /* renamed from: j */
    public int f8463j = 4096;

    /* renamed from: p */
    public ColorStateList f8469p = null;

    /* renamed from: q */
    public PorterDuff.Mode f8470q = null;

    /* renamed from: r */
    public boolean f8471r = false;

    /* renamed from: s */
    public boolean f8472s = false;

    /* renamed from: t */
    public int f8473t = 16;

    public C2055F2(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f8465l = context;
        this.f8454a = i2;
        this.f8455b = i;
        this.f8456c = i4;
        this.f8457d = charSequence;
    }

    @Override // p000.InterfaceMenuItemC39788dV5
    /* renamed from: a */
    public InterfaceMenuItemC39788dV5 mo44208a(AbstractC3314I2 abstractC3314I2) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceMenuItemC39788dV5
    /* renamed from: b */
    public AbstractC3314I2 mo44207b() {
        return null;
    }

    /* renamed from: c */
    public final void m108096c() {
        Drawable drawable = this.f8464k;
        if (drawable != null) {
            if (this.f8471r || this.f8472s) {
                Drawable m90834r = P61.m90834r(drawable);
                this.f8464k = m90834r;
                Drawable mutate = m90834r.mutate();
                this.f8464k = mutate;
                if (this.f8471r) {
                    P61.m90837o(mutate, this.f8469p);
                }
                if (this.f8472s) {
                    P61.m90836p(this.f8464k, this.f8470q);
                }
            }
        }
    }

    @Override // p000.InterfaceMenuItemC39788dV5, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // p000.InterfaceMenuItemC39788dV5, android.view.MenuItem
    /* renamed from: d */
    public InterfaceMenuItemC39788dV5 setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceMenuItemC39788dV5, android.view.MenuItem
    /* renamed from: e */
    public InterfaceMenuItemC39788dV5 setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceMenuItemC39788dV5, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // p000.InterfaceMenuItemC39788dV5, android.view.MenuItem
    /* renamed from: f */
    public InterfaceMenuItemC39788dV5 setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceMenuItemC39788dV5, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // p000.InterfaceMenuItemC39788dV5, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f8463j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f8462i;
    }

    @Override // p000.InterfaceMenuItemC39788dV5, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f8467n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f8455b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f8464k;
    }

    @Override // p000.InterfaceMenuItemC39788dV5, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f8469p;
    }

    @Override // p000.InterfaceMenuItemC39788dV5, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f8470q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f8459f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f8454a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p000.InterfaceMenuItemC39788dV5, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f8461h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f8460g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f8456c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f8457d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f8458e;
        return charSequence != null ? charSequence : this.f8457d;
    }

    @Override // p000.InterfaceMenuItemC39788dV5, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f8468o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // p000.InterfaceMenuItemC39788dV5, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f8473t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f8473t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f8473t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f8473t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f8462i = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f8473t = (z ? 1 : 0) | (this.f8473t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f8473t = (z ? 2 : 0) | (this.f8473t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f8473t = (z ? 16 : 0) | (this.f8473t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f8464k = drawable;
        m108096c();
        return this;
    }

    @Override // p000.InterfaceMenuItemC39788dV5, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f8469p = colorStateList;
        this.f8471r = true;
        m108096c();
        return this;
    }

    @Override // p000.InterfaceMenuItemC39788dV5, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f8470q = mode;
        this.f8472s = true;
        m108096c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f8459f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f8460g = c;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f8466m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f8460g = c;
        this.f8462i = Character.toLowerCase(c2);
        return this;
    }

    @Override // p000.InterfaceMenuItemC39788dV5, android.view.MenuItem
    public void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f8457d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f8458e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        this.f8473t = (this.f8473t & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // p000.InterfaceMenuItemC39788dV5, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f8462i = Character.toLowerCase(c);
        this.f8463j = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC39788dV5 setContentDescription(CharSequence charSequence) {
        this.f8467n = charSequence;
        return this;
    }

    @Override // p000.InterfaceMenuItemC39788dV5, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        this.f8460g = c;
        this.f8461h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f8457d = this.f8465l.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC39788dV5 setTooltipText(CharSequence charSequence) {
        this.f8468o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f8464k = NA0.m94299e(this.f8465l, i);
        m108096c();
        return this;
    }

    @Override // p000.InterfaceMenuItemC39788dV5, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f8460g = c;
        this.f8461h = KeyEvent.normalizeMetaState(i);
        this.f8462i = Character.toLowerCase(c2);
        this.f8463j = KeyEvent.normalizeMetaState(i2);
        return this;
    }
}

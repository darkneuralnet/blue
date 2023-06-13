package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p000.AbstractC3314I2;
/* renamed from: qQ2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuItemC47448qQ2 extends AbstractC1415DB implements MenuItem {

    /* renamed from: d */
    public final InterfaceMenuItemC39788dV5 f105286d;

    /* renamed from: e */
    public Method f105287e;

    /* renamed from: qQ2$a */
    /* loaded from: classes.dex */
    public class C27598a extends AbstractC3314I2 {

        /* renamed from: d */
        public final ActionProvider f105288d;

        public C27598a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f105288d = actionProvider;
        }

        @Override // p000.AbstractC3314I2
        /* renamed from: a */
        public boolean mo17526a() {
            return this.f105288d.hasSubMenu();
        }

        @Override // p000.AbstractC3314I2
        /* renamed from: c */
        public View mo17525c() {
            return this.f105288d.onCreateActionView();
        }

        @Override // p000.AbstractC3314I2
        /* renamed from: e */
        public boolean mo17524e() {
            return this.f105288d.onPerformDefaultAction();
        }

        @Override // p000.AbstractC3314I2
        /* renamed from: f */
        public void mo17523f(SubMenu subMenu) {
            this.f105288d.onPrepareSubMenu(MenuItemC47448qQ2.this.m110803d(subMenu));
        }
    }

    /* renamed from: qQ2$b */
    /* loaded from: classes.dex */
    public class ActionProvider$VisibilityListenerC27599b extends C27598a implements ActionProvider.VisibilityListener {

        /* renamed from: f */
        public AbstractC3314I2.InterfaceC3316b f105290f;

        public ActionProvider$VisibilityListenerC27599b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // p000.AbstractC3314I2
        /* renamed from: b */
        public boolean mo17522b() {
            return this.f105288d.isVisible();
        }

        @Override // p000.AbstractC3314I2
        /* renamed from: d */
        public View mo17521d(MenuItem menuItem) {
            return this.f105288d.onCreateActionView(menuItem);
        }

        @Override // p000.AbstractC3314I2
        /* renamed from: g */
        public boolean mo17520g() {
            return this.f105288d.overridesItemVisibility();
        }

        @Override // p000.AbstractC3314I2
        /* renamed from: j */
        public void mo17519j(AbstractC3314I2.InterfaceC3316b interfaceC3316b) {
            ActionProvider$VisibilityListenerC27599b actionProvider$VisibilityListenerC27599b;
            this.f105290f = interfaceC3316b;
            ActionProvider actionProvider = this.f105288d;
            if (interfaceC3316b != null) {
                actionProvider$VisibilityListenerC27599b = this;
            } else {
                actionProvider$VisibilityListenerC27599b = null;
            }
            actionProvider.setVisibilityListener(actionProvider$VisibilityListenerC27599b);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            AbstractC3314I2.InterfaceC3316b interfaceC3316b = this.f105290f;
            if (interfaceC3316b != null) {
                interfaceC3316b.onActionProviderVisibilityChanged(z);
            }
        }
    }

    /* renamed from: qQ2$c */
    /* loaded from: classes.dex */
    public static class C27600c extends FrameLayout implements InterfaceC36860Wl0 {

        /* renamed from: b */
        public final CollapsibleActionView f105292b;

        public C27600c(View view) {
            super(view.getContext());
            this.f105292b = (CollapsibleActionView) view;
            addView(view);
        }

        /* renamed from: a */
        public View m17518a() {
            return (View) this.f105292b;
        }

        @Override // p000.InterfaceC36860Wl0
        public void onActionViewCollapsed() {
            this.f105292b.onActionViewCollapsed();
        }

        @Override // p000.InterfaceC36860Wl0
        public void onActionViewExpanded() {
            this.f105292b.onActionViewExpanded();
        }
    }

    /* renamed from: qQ2$d */
    /* loaded from: classes.dex */
    public class MenuItem$OnActionExpandListenerC27601d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        public final MenuItem.OnActionExpandListener f105293a;

        public MenuItem$OnActionExpandListenerC27601d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f105293a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f105293a.onMenuItemActionCollapse(MenuItemC47448qQ2.this.m110804c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f105293a.onMenuItemActionExpand(MenuItemC47448qQ2.this.m110804c(menuItem));
        }
    }

    /* renamed from: qQ2$e */
    /* loaded from: classes.dex */
    public class MenuItem$OnMenuItemClickListenerC27602e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: b */
        public final MenuItem.OnMenuItemClickListener f105295b;

        public MenuItem$OnMenuItemClickListenerC27602e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f105295b = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f105295b.onMenuItemClick(MenuItemC47448qQ2.this.m110804c(menuItem));
        }
    }

    public MenuItemC47448qQ2(Context context, InterfaceMenuItemC39788dV5 interfaceMenuItemC39788dV5) {
        super(context);
        if (interfaceMenuItemC39788dV5 != null) {
            this.f105286d = interfaceMenuItemC39788dV5;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f105286d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f105286d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC3314I2 mo44207b = this.f105286d.mo44207b();
        if (mo44207b instanceof C27598a) {
            return ((C27598a) mo44207b).f105288d;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f105286d.getActionView();
        if (actionView instanceof C27600c) {
            return ((C27600c) actionView).m17518a();
        }
        return actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f105286d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f105286d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f105286d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f105286d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f105286d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f105286d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f105286d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f105286d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f105286d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f105286d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f105286d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f105286d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f105286d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return m110803d(this.f105286d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f105286d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f105286d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f105286d.getTooltipText();
    }

    /* renamed from: h */
    public void m17527h(boolean z) {
        try {
            if (this.f105287e == null) {
                this.f105287e = this.f105286d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f105287e.invoke(this.f105286d, Boolean.valueOf(z));
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f105286d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f105286d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f105286d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f105286d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f105286d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f105286d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ActionProvider$VisibilityListenerC27599b actionProvider$VisibilityListenerC27599b = new ActionProvider$VisibilityListenerC27599b(this.f5328a, actionProvider);
        InterfaceMenuItemC39788dV5 interfaceMenuItemC39788dV5 = this.f105286d;
        if (actionProvider == null) {
            actionProvider$VisibilityListenerC27599b = null;
        }
        interfaceMenuItemC39788dV5.mo44208a(actionProvider$VisibilityListenerC27599b);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C27600c(view);
        }
        this.f105286d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f105286d.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f105286d.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f105286d.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f105286d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f105286d.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f105286d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f105286d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f105286d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f105286d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f105286d.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        MenuItem$OnActionExpandListenerC27601d menuItem$OnActionExpandListenerC27601d;
        InterfaceMenuItemC39788dV5 interfaceMenuItemC39788dV5 = this.f105286d;
        if (onActionExpandListener != null) {
            menuItem$OnActionExpandListenerC27601d = new MenuItem$OnActionExpandListenerC27601d(onActionExpandListener);
        } else {
            menuItem$OnActionExpandListenerC27601d = null;
        }
        interfaceMenuItemC39788dV5.setOnActionExpandListener(menuItem$OnActionExpandListenerC27601d);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        MenuItem$OnMenuItemClickListenerC27602e menuItem$OnMenuItemClickListenerC27602e;
        InterfaceMenuItemC39788dV5 interfaceMenuItemC39788dV5 = this.f105286d;
        if (onMenuItemClickListener != null) {
            menuItem$OnMenuItemClickListenerC27602e = new MenuItem$OnMenuItemClickListenerC27602e(onMenuItemClickListener);
        } else {
            menuItem$OnMenuItemClickListenerC27602e = null;
        }
        interfaceMenuItemC39788dV5.setOnMenuItemClickListener(menuItem$OnMenuItemClickListenerC27602e);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f105286d.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        this.f105286d.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        this.f105286d.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f105286d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f105286d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f105286d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return this.f105286d.setVisible(z);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f105286d.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f105286d.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        this.f105286d.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f105286d.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f105286d.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        this.f105286d.setActionView(i);
        View actionView = this.f105286d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f105286d.setActionView(new C27600c(actionView));
        }
        return this;
    }
}

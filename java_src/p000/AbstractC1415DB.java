package p000;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
/* renamed from: DB */
/* loaded from: classes.dex */
public abstract class AbstractC1415DB {

    /* renamed from: a */
    public final Context f5328a;

    /* renamed from: b */
    public NA5<InterfaceMenuItemC39788dV5, MenuItem> f5329b;

    /* renamed from: c */
    public NA5<InterfaceSubMenuC48089rV5, SubMenu> f5330c;

    public AbstractC1415DB(Context context) {
        this.f5328a = context;
    }

    /* renamed from: c */
    public final MenuItem m110804c(MenuItem menuItem) {
        if (menuItem instanceof InterfaceMenuItemC39788dV5) {
            InterfaceMenuItemC39788dV5 interfaceMenuItemC39788dV5 = (InterfaceMenuItemC39788dV5) menuItem;
            if (this.f5329b == null) {
                this.f5329b = new NA5<>();
            }
            MenuItem menuItem2 = this.f5329b.get(interfaceMenuItemC39788dV5);
            if (menuItem2 == null) {
                MenuItemC47448qQ2 menuItemC47448qQ2 = new MenuItemC47448qQ2(this.f5328a, interfaceMenuItemC39788dV5);
                this.f5329b.put(interfaceMenuItemC39788dV5, menuItemC47448qQ2);
                return menuItemC47448qQ2;
            }
            return menuItem2;
        }
        return menuItem;
    }

    /* renamed from: d */
    public final SubMenu m110803d(SubMenu subMenu) {
        if (subMenu instanceof InterfaceSubMenuC48089rV5) {
            InterfaceSubMenuC48089rV5 interfaceSubMenuC48089rV5 = (InterfaceSubMenuC48089rV5) subMenu;
            if (this.f5330c == null) {
                this.f5330c = new NA5<>();
            }
            SubMenu subMenu2 = this.f5330c.get(interfaceSubMenuC48089rV5);
            if (subMenu2 == null) {
                XS5 xs5 = new XS5(this.f5328a, interfaceSubMenuC48089rV5);
                this.f5330c.put(interfaceSubMenuC48089rV5, xs5);
                return xs5;
            }
            return subMenu2;
        }
        return subMenu;
    }

    /* renamed from: e */
    public final void m110802e() {
        NA5<InterfaceMenuItemC39788dV5, MenuItem> na5 = this.f5329b;
        if (na5 != null) {
            na5.clear();
        }
        NA5<InterfaceSubMenuC48089rV5, SubMenu> na52 = this.f5330c;
        if (na52 != null) {
            na52.clear();
        }
    }

    /* renamed from: f */
    public final void m110801f(int i) {
        if (this.f5329b == null) {
            return;
        }
        int i2 = 0;
        while (i2 < this.f5329b.size()) {
            if (this.f5329b.m94264i(i2).getGroupId() == i) {
                this.f5329b.mo34405k(i2);
                i2--;
            }
            i2++;
        }
    }

    /* renamed from: g */
    public final void m110800g(int i) {
        if (this.f5329b == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f5329b.size(); i2++) {
            if (this.f5329b.m94264i(i2).getItemId() == i) {
                this.f5329b.mo34405k(i2);
                return;
            }
        }
    }
}

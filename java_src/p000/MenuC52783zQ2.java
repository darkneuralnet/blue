package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
/* renamed from: zQ2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC52783zQ2 extends AbstractC1415DB implements Menu {

    /* renamed from: d */
    public final InterfaceMenuC38584bV5 f121322d;

    public MenuC52783zQ2(Context context, InterfaceMenuC38584bV5 interfaceMenuC38584bV5) {
        super(context);
        if (interfaceMenuC38584bV5 != null) {
            this.f121322d = interfaceMenuC38584bV5;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m110804c(this.f121322d.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = this.f121322d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m110804c(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return m110803d(this.f121322d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        m110802e();
        this.f121322d.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f121322d.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        return m110804c(this.f121322d.findItem(i));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return m110804c(this.f121322d.getItem(i));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f121322d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f121322d.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return this.f121322d.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f121322d.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        m110801f(i);
        this.f121322d.removeGroup(i);
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        m110800g(i);
        this.f121322d.removeItem(i);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f121322d.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        this.f121322d.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        this.f121322d.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f121322d.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f121322d.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return m110804c(this.f121322d.add(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return m110803d(this.f121322d.addSubMenu(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m110804c(this.f121322d.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return m110803d(this.f121322d.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return m110804c(this.f121322d.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return m110803d(this.f121322d.addSubMenu(i, i2, i3, i4));
    }
}

package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C11028e;
/* renamed from: androidx.appcompat.view.menu.l */
/* loaded from: classes.dex */
public class SubMenuC11044l extends C11028e implements SubMenu {

    /* renamed from: B */
    public C11028e f51969B;

    /* renamed from: C */
    public C11032g f51970C;

    public SubMenuC11044l(Context context, C11028e c11028e, C11032g c11032g) {
        super(context);
        this.f51969B = c11028e;
        this.f51970C = c11032g;
    }

    @Override // androidx.appcompat.view.menu.C11028e
    /* renamed from: F */
    public C11028e mo70078F() {
        return this.f51969B.mo70078F();
    }

    @Override // androidx.appcompat.view.menu.C11028e
    /* renamed from: H */
    public boolean mo70077H() {
        return this.f51969B.mo70077H();
    }

    @Override // androidx.appcompat.view.menu.C11028e
    /* renamed from: I */
    public boolean mo70076I() {
        return this.f51969B.mo70076I();
    }

    @Override // androidx.appcompat.view.menu.C11028e
    /* renamed from: J */
    public boolean mo70075J() {
        return this.f51969B.mo70075J();
    }

    @Override // androidx.appcompat.view.menu.C11028e
    /* renamed from: V */
    public void mo70074V(C11028e.InterfaceC11029a interfaceC11029a) {
        this.f51969B.mo70074V(interfaceC11029a);
    }

    @Override // androidx.appcompat.view.menu.C11028e
    /* renamed from: f */
    public boolean mo70073f(C11032g c11032g) {
        return this.f51969B.mo70073f(c11032g);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f51970C;
    }

    @Override // androidx.appcompat.view.menu.C11028e
    /* renamed from: h */
    public boolean mo70072h(C11028e c11028e, MenuItem menuItem) {
        if (!super.mo70072h(c11028e, menuItem) && !this.f51969B.mo70072h(c11028e, menuItem)) {
            return false;
        }
        return true;
    }

    /* renamed from: i0 */
    public Menu m70071i0() {
        return this.f51969B;
    }

    @Override // androidx.appcompat.view.menu.C11028e
    /* renamed from: m */
    public boolean mo70070m(C11032g c11032g) {
        return this.f51969B.mo70070m(c11032g);
    }

    @Override // androidx.appcompat.view.menu.C11028e, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f51969B.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.m70153Z(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.m70147c0(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.m70145d0(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f51970C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.C11028e, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f51969B.setQwertyMode(z);
    }

    @Override // androidx.appcompat.view.menu.C11028e
    /* renamed from: v */
    public String mo70069v() {
        int i;
        C11032g c11032g = this.f51970C;
        if (c11032g != null) {
            i = c11032g.getItemId();
        } else {
            i = 0;
        }
        if (i == 0) {
            return null;
        }
        return super.mo70069v() + ":" + i;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.m70154Y(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.m70149b0(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f51970C.setIcon(i);
        return this;
    }
}

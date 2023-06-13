package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* renamed from: XS5 */
/* loaded from: classes.dex */
public class XS5 extends MenuC52783zQ2 implements SubMenu {

    /* renamed from: e */
    public final InterfaceSubMenuC48089rV5 f43269e;

    public XS5(Context context, InterfaceSubMenuC48089rV5 interfaceSubMenuC48089rV5) {
        super(context, interfaceSubMenuC48089rV5);
        this.f43269e = interfaceSubMenuC48089rV5;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f43269e.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return m110804c(this.f43269e.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        this.f43269e.setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        this.f43269e.setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f43269e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f43269e.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f43269e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f43269e.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f43269e.setIcon(drawable);
        return this;
    }
}

package p000;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C11028e;
import androidx.appcompat.view.menu.C11032g;
/* renamed from: ZY2 */
/* loaded from: classes6.dex */
public final class ZY2 extends C11028e {

    /* renamed from: B */
    public final Class<?> f48748B;

    /* renamed from: C */
    public final int f48749C;

    public ZY2(Context context, Class<?> cls, int i) {
        super(context);
        this.f48748B = cls;
        this.f48749C = i;
    }

    @Override // androidx.appcompat.view.menu.C11028e
    /* renamed from: a */
    public MenuItem mo70152a(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 <= this.f48749C) {
            m70139h0();
            MenuItem mo70152a = super.mo70152a(i, i2, i3, charSequence);
            if (mo70152a instanceof C11032g) {
                ((C11032g) mo70152a).m70101t(true);
            }
            m70140g0();
            return mo70152a;
        }
        String simpleName = this.f48748B.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + this.f48749C + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }

    @Override // androidx.appcompat.view.menu.C11028e, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f48748B.getSimpleName() + " does not support submenus");
    }
}

package p000;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C11028e;
import androidx.appcompat.view.menu.C11032g;
/* renamed from: V03 */
/* loaded from: classes6.dex */
public class V03 extends C11028e {
    public V03(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.C11028e, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C11032g c11032g = (C11032g) mo70152a(i, i2, i3, charSequence);
        Y03 y03 = new Y03(m70126w(), this, c11032g);
        c11032g.m70097x(y03);
        return y03;
    }
}

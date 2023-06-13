package p000;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import p000.AbstractC2614G2;
/* renamed from: aV5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C37991aV5 extends ActionMode {

    /* renamed from: a */
    public final Context f50576a;

    /* renamed from: b */
    public final AbstractC2614G2 f50577b;

    /* renamed from: aV5$a */
    /* loaded from: classes.dex */
    public static class C10726a implements AbstractC2614G2.InterfaceC2615a {

        /* renamed from: a */
        public final ActionMode.Callback f50578a;

        /* renamed from: b */
        public final Context f50579b;

        /* renamed from: c */
        public final ArrayList<C37991aV5> f50580c = new ArrayList<>();

        /* renamed from: d */
        public final NA5<Menu, Menu> f50581d = new NA5<>();

        public C10726a(Context context, ActionMode.Callback callback) {
            this.f50579b = context;
            this.f50578a = callback;
        }

        @Override // p000.AbstractC2614G2.InterfaceC2615a
        /* renamed from: a */
        public boolean mo70352a(AbstractC2614G2 abstractC2614G2, MenuItem menuItem) {
            return this.f50578a.onActionItemClicked(m71276e(abstractC2614G2), new MenuItemC47448qQ2(this.f50579b, (InterfaceMenuItemC39788dV5) menuItem));
        }

        @Override // p000.AbstractC2614G2.InterfaceC2615a
        /* renamed from: b */
        public void mo70351b(AbstractC2614G2 abstractC2614G2) {
            this.f50578a.onDestroyActionMode(m71276e(abstractC2614G2));
        }

        @Override // p000.AbstractC2614G2.InterfaceC2615a
        /* renamed from: c */
        public boolean mo70350c(AbstractC2614G2 abstractC2614G2, Menu menu) {
            return this.f50578a.onCreateActionMode(m71276e(abstractC2614G2), m71275f(menu));
        }

        @Override // p000.AbstractC2614G2.InterfaceC2615a
        /* renamed from: d */
        public boolean mo70349d(AbstractC2614G2 abstractC2614G2, Menu menu) {
            return this.f50578a.onPrepareActionMode(m71276e(abstractC2614G2), m71275f(menu));
        }

        /* renamed from: e */
        public ActionMode m71276e(AbstractC2614G2 abstractC2614G2) {
            int size = this.f50580c.size();
            for (int i = 0; i < size; i++) {
                C37991aV5 c37991aV5 = this.f50580c.get(i);
                if (c37991aV5 != null && c37991aV5.f50577b == abstractC2614G2) {
                    return c37991aV5;
                }
            }
            C37991aV5 c37991aV52 = new C37991aV5(this.f50579b, abstractC2614G2);
            this.f50580c.add(c37991aV52);
            return c37991aV52;
        }

        /* renamed from: f */
        public final Menu m71275f(Menu menu) {
            Menu menu2 = this.f50581d.get(menu);
            if (menu2 == null) {
                MenuC52783zQ2 menuC52783zQ2 = new MenuC52783zQ2(this.f50579b, (InterfaceMenuC38584bV5) menu);
                this.f50581d.put(menu, menuC52783zQ2);
                return menuC52783zQ2;
            }
            return menu2;
        }
    }

    public C37991aV5(Context context, AbstractC2614G2 abstractC2614G2) {
        this.f50576a = context;
        this.f50577b = abstractC2614G2;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f50577b.mo17560c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f50577b.mo17559d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new MenuC52783zQ2(this.f50576a, (InterfaceMenuC38584bV5) this.f50577b.mo17558e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f50577b.mo17557f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f50577b.mo17556g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f50577b.m105948h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f50577b.mo17555i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f50577b.m105947j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f50577b.mo17554k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f50577b.mo17553l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f50577b.mo17552m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f50577b.mo17550o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f50577b.m105946p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f50577b.mo17548r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f50577b.mo17547s(z);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f50577b.mo17551n(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f50577b.mo17549q(i);
    }
}

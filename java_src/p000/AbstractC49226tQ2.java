package p000;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C11027d;
import androidx.appcompat.view.menu.C11028e;
import androidx.appcompat.view.menu.C11032g;
import androidx.appcompat.view.menu.InterfaceC11037i;
/* renamed from: tQ2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC49226tQ2 implements InterfaceC52642zA5, InterfaceC11037i, AdapterView.OnItemClickListener {

    /* renamed from: b */
    public Rect f110450b;

    /* renamed from: A */
    public static C11027d m12400A(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (C11027d) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (C11027d) listAdapter;
    }

    /* renamed from: q */
    public static int m12393q(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: z */
    public static boolean m12384z(C11028e c11028e) {
        int size = c11028e.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c11028e.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: d */
    public boolean mo12399d(C11028e c11028e, C11032g c11032g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    public int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: h */
    public boolean mo12398h(C11028e c11028e, C11032g c11032g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: i */
    public void mo12397i(Context context, C11028e c11028e) {
    }

    /* renamed from: n */
    public abstract void mo12396n(C11028e c11028e);

    /* renamed from: o */
    public boolean mo12395o() {
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        int i2;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        C11028e c11028e = m12400A(listAdapter).f51864b;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        if (mo12395o()) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        c11028e.m70163O(menuItem, this, i2);
    }

    /* renamed from: p */
    public Rect m12394p() {
        return this.f110450b;
    }

    /* renamed from: r */
    public abstract void mo12392r(View view);

    /* renamed from: s */
    public void m12391s(Rect rect) {
        this.f110450b = rect;
    }

    /* renamed from: t */
    public abstract void mo12390t(boolean z);

    /* renamed from: u */
    public abstract void mo12389u(int i);

    /* renamed from: v */
    public abstract void mo12388v(int i);

    /* renamed from: w */
    public abstract void mo12387w(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: x */
    public abstract void mo12386x(boolean z);

    /* renamed from: y */
    public abstract void mo12385y(int i);
}

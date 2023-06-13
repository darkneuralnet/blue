package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.InterfaceC11039j;
import java.util.ArrayList;
/* renamed from: androidx.appcompat.view.menu.d */
/* loaded from: classes.dex */
public class C11027d extends BaseAdapter {

    /* renamed from: b */
    public C11028e f51864b;

    /* renamed from: c */
    public int f51865c = -1;

    /* renamed from: d */
    public boolean f51866d;

    /* renamed from: e */
    public final boolean f51867e;

    /* renamed from: f */
    public final LayoutInflater f51868f;

    /* renamed from: g */
    public final int f51869g;

    public C11027d(C11028e c11028e, LayoutInflater layoutInflater, boolean z, int i) {
        this.f51867e = z;
        this.f51868f = layoutInflater;
        this.f51864b = c11028e;
        this.f51869g = i;
        m70177a();
    }

    /* renamed from: a */
    public void m70177a() {
        C11032g m70125x = this.f51864b.m70125x();
        if (m70125x != null) {
            ArrayList<C11032g> m70172B = this.f51864b.m70172B();
            int size = m70172B.size();
            for (int i = 0; i < size; i++) {
                if (m70172B.get(i) == m70125x) {
                    this.f51865c = i;
                    return;
                }
            }
        }
        this.f51865c = -1;
    }

    /* renamed from: b */
    public C11028e m70176b() {
        return this.f51864b;
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public C11032g getItem(int i) {
        ArrayList<C11032g> m70168G;
        if (this.f51867e) {
            m70168G = this.f51864b.m70172B();
        } else {
            m70168G = this.f51864b.m70168G();
        }
        int i2 = this.f51865c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return m70168G.get(i);
    }

    /* renamed from: d */
    public void m70174d(boolean z) {
        this.f51866d = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<C11032g> m70168G;
        if (this.f51867e) {
            m70168G = this.f51864b.m70172B();
        } else {
            m70168G = this.f51864b.m70168G();
        }
        if (this.f51865c < 0) {
            return m70168G.size();
        }
        return m70168G.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        boolean z;
        if (view == null) {
            view = this.f51868f.inflate(this.f51869g, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i3 = i - 1;
        if (i3 >= 0) {
            i2 = getItem(i3).getGroupId();
        } else {
            i2 = groupId;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f51864b.mo70077H() && groupId != i2) {
            z = true;
        } else {
            z = false;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        InterfaceC11039j.InterfaceC11040a interfaceC11040a = (InterfaceC11039j.InterfaceC11040a) view;
        if (this.f51866d) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC11040a.mo49373d(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m70177a();
        super.notifyDataSetChanged();
    }
}

package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.InterfaceC11037i;
import androidx.appcompat.view.menu.InterfaceC11039j;
import java.util.ArrayList;
/* renamed from: androidx.appcompat.view.menu.c */
/* loaded from: classes.dex */
public class C11025c implements InterfaceC11037i, AdapterView.OnItemClickListener {

    /* renamed from: b */
    public Context f51852b;

    /* renamed from: c */
    public LayoutInflater f51853c;

    /* renamed from: d */
    public C11028e f51854d;

    /* renamed from: e */
    public ExpandedMenuView f51855e;

    /* renamed from: f */
    public int f51856f;

    /* renamed from: g */
    public int f51857g;

    /* renamed from: h */
    public int f51858h;

    /* renamed from: i */
    public InterfaceC11037i.InterfaceC11038a f51859i;

    /* renamed from: j */
    public C11026a f51860j;

    /* renamed from: k */
    public int f51861k;

    /* renamed from: androidx.appcompat.view.menu.c$a */
    /* loaded from: classes.dex */
    public class C11026a extends BaseAdapter {

        /* renamed from: b */
        public int f51862b = -1;

        public C11026a() {
            m70179a();
        }

        /* renamed from: a */
        public void m70179a() {
            C11032g m70125x = C11025c.this.f51854d.m70125x();
            if (m70125x != null) {
                ArrayList<C11032g> m70172B = C11025c.this.f51854d.m70172B();
                int size = m70172B.size();
                for (int i = 0; i < size; i++) {
                    if (m70172B.get(i) == m70125x) {
                        this.f51862b = i;
                        return;
                    }
                }
            }
            this.f51862b = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b */
        public C11032g getItem(int i) {
            ArrayList<C11032g> m70172B = C11025c.this.f51854d.m70172B();
            int i2 = i + C11025c.this.f51856f;
            int i3 = this.f51862b;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return m70172B.get(i2);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = C11025c.this.f51854d.m70172B().size() - C11025c.this.f51856f;
            if (this.f51862b < 0) {
                return size;
            }
            return size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C11025c c11025c = C11025c.this;
                view = c11025c.f51853c.inflate(c11025c.f51858h, viewGroup, false);
            }
            ((InterfaceC11039j.InterfaceC11040a) view).mo49373d(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m70179a();
            super.notifyDataSetChanged();
        }
    }

    public C11025c(Context context, int i) {
        this(i, 0);
        this.f51852b = context;
        this.f51853c = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public ListAdapter m70183a() {
        if (this.f51860j == null) {
            this.f51860j = new C11026a();
        }
        return this.f51860j;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: b */
    public void mo49325b(C11028e c11028e, boolean z) {
        InterfaceC11037i.InterfaceC11038a interfaceC11038a = this.f51859i;
        if (interfaceC11038a != null) {
            interfaceC11038a.mo69982b(c11028e, z);
        }
    }

    /* renamed from: c */
    public InterfaceC11039j m70182c(ViewGroup viewGroup) {
        if (this.f51855e == null) {
            this.f51855e = (ExpandedMenuView) this.f51853c.inflate(C32643Ek4.abc_expanded_menu_layout, viewGroup, false);
            if (this.f51860j == null) {
                this.f51860j = new C11026a();
            }
            this.f51855e.setAdapter((ListAdapter) this.f51860j);
            this.f51855e.setOnItemClickListener(this);
        }
        return this.f51855e;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: d */
    public boolean mo12399d(C11028e c11028e, C11032g c11032g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: e */
    public Parcelable mo49323e() {
        if (this.f51855e == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        m70180n(bundle);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: f */
    public void mo49322f(boolean z) {
        C11026a c11026a = this.f51860j;
        if (c11026a != null) {
            c11026a.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: g */
    public boolean mo49321g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    public int getId() {
        return this.f51861k;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: h */
    public boolean mo12398h(C11028e c11028e, C11032g c11032g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: i */
    public void mo12397i(Context context, C11028e c11028e) {
        if (this.f51857g != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f51857g);
            this.f51852b = contextThemeWrapper;
            this.f51853c = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f51852b != null) {
            this.f51852b = context;
            if (this.f51853c == null) {
                this.f51853c = LayoutInflater.from(context);
            }
        }
        this.f51854d = c11028e;
        C11026a c11026a = this.f51860j;
        if (c11026a != null) {
            c11026a.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: j */
    public void mo70079j(InterfaceC11037i.InterfaceC11038a interfaceC11038a) {
        this.f51859i = interfaceC11038a;
    }

    /* renamed from: k */
    public void m70181k(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f51855e.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: l */
    public void mo49319l(Parcelable parcelable) {
        m70181k((Bundle) parcelable);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: m */
    public boolean mo49318m(SubMenuC11044l subMenuC11044l) {
        if (!subMenuC11044l.hasVisibleItems()) {
            return false;
        }
        new DialogInterface$OnKeyListenerC11031f(subMenuC11044l).m70121d(null);
        InterfaceC11037i.InterfaceC11038a interfaceC11038a = this.f51859i;
        if (interfaceC11038a != null) {
            interfaceC11038a.mo69981c(subMenuC11044l);
            return true;
        }
        return true;
    }

    /* renamed from: n */
    public void m70180n(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f51855e;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f51854d.m70163O(this.f51860j.getItem(i), this, 0);
    }

    public C11025c(int i, int i2) {
        this.f51858h = i;
        this.f51857g = i2;
    }
}

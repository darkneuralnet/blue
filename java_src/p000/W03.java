package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C11028e;
import androidx.appcompat.view.menu.C11032g;
import androidx.appcompat.view.menu.InterfaceC11037i;
import androidx.appcompat.view.menu.InterfaceC11039j;
import androidx.appcompat.view.menu.SubMenuC11044l;
import androidx.recyclerview.widget.C11949s;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.ParcelableSparseArray;
import java.util.ArrayList;
import p000.C27125p2;
/* renamed from: W03 */
/* loaded from: classes6.dex */
public class W03 implements InterfaceC11037i {

    /* renamed from: A */
    public int f40188A;

    /* renamed from: B */
    public int f40189B;

    /* renamed from: b */
    public NavigationMenuView f40192b;

    /* renamed from: c */
    public LinearLayout f40193c;

    /* renamed from: d */
    public InterfaceC11037i.InterfaceC11038a f40194d;

    /* renamed from: e */
    public C11028e f40195e;

    /* renamed from: f */
    public int f40196f;

    /* renamed from: g */
    public C8893c f40197g;

    /* renamed from: h */
    public LayoutInflater f40198h;

    /* renamed from: j */
    public ColorStateList f40200j;

    /* renamed from: l */
    public ColorStateList f40202l;

    /* renamed from: m */
    public ColorStateList f40203m;

    /* renamed from: n */
    public Drawable f40204n;

    /* renamed from: o */
    public RippleDrawable f40205o;

    /* renamed from: p */
    public int f40206p;

    /* renamed from: q */
    public int f40207q;

    /* renamed from: r */
    public int f40208r;

    /* renamed from: s */
    public int f40209s;

    /* renamed from: t */
    public int f40210t;

    /* renamed from: u */
    public int f40211u;

    /* renamed from: v */
    public int f40212v;

    /* renamed from: w */
    public int f40213w;

    /* renamed from: x */
    public boolean f40214x;

    /* renamed from: z */
    public int f40216z;

    /* renamed from: i */
    public int f40199i = 0;

    /* renamed from: k */
    public int f40201k = 0;

    /* renamed from: y */
    public boolean f40215y = true;

    /* renamed from: C */
    public int f40190C = -1;

    /* renamed from: D */
    public final View.OnClickListener f40191D = new View$OnClickListenerC8891a();

    /* renamed from: W03$a */
    /* loaded from: classes6.dex */
    public class View$OnClickListenerC8891a implements View.OnClickListener {
        public View$OnClickListenerC8891a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z = true;
            W03.this.m78998K(true);
            C11032g mo49372e = ((NavigationMenuItemView) view).mo49372e();
            W03 w03 = W03.this;
            boolean m70163O = w03.f40195e.m70163O(mo49372e, w03, 0);
            if (mo49372e != null && mo49372e.isCheckable() && m70163O) {
                W03.this.f40197g.m78979B(mo49372e);
            } else {
                z = false;
            }
            W03.this.m78998K(false);
            if (z) {
                W03.this.mo49322f(false);
            }
        }
    }

    /* renamed from: W03$b */
    /* loaded from: classes6.dex */
    public static class C8892b extends AbstractC8903l {
        public C8892b(View view) {
            super(view);
        }
    }

    /* renamed from: W03$c */
    /* loaded from: classes6.dex */
    public class C8893c extends RecyclerView.AbstractC11843h<AbstractC8903l> {

        /* renamed from: b */
        public final ArrayList<InterfaceC8896e> f40218b = new ArrayList<>();

        /* renamed from: c */
        public C11032g f40219c;

        /* renamed from: d */
        public boolean f40220d;

        /* renamed from: W03$c$a */
        /* loaded from: classes6.dex */
        public class C8894a extends C5148M1 {

            /* renamed from: a */
            public final /* synthetic */ int f40222a;

            /* renamed from: b */
            public final /* synthetic */ boolean f40223b;

            public C8894a(int i, boolean z) {
                this.f40222a = i;
                this.f40223b = z;
            }

            @Override // p000.C5148M1
            public void onInitializeAccessibilityNodeInfo(View view, C27125p2 c27125p2) {
                super.onInitializeAccessibilityNodeInfo(view, c27125p2);
                c27125p2.m20074i0(C27125p2.C27128c.m20033a(C8893c.this.m78975p(this.f40222a), 1, 1, 1, this.f40223b, view.isSelected()));
            }
        }

        public C8893c() {
            m78968x();
        }

        /* renamed from: A */
        public final void m78980A(View view, int i, boolean z) {
            C38790bq6.m62452v0(view, new C8894a(i, z));
        }

        /* renamed from: B */
        public void m78979B(C11032g c11032g) {
            if (this.f40219c != c11032g && c11032g.isCheckable()) {
                C11032g c11032g2 = this.f40219c;
                if (c11032g2 != null) {
                    c11032g2.setChecked(false);
                }
                this.f40219c = c11032g;
                c11032g.setChecked(true);
            }
        }

        /* renamed from: C */
        public void m78978C(boolean z) {
            this.f40220d = z;
        }

        /* renamed from: D */
        public void m78977D() {
            m78968x();
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
        public int getItemCount() {
            return this.f40218b.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
        public long getItemId(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
        public int getItemViewType(int i) {
            InterfaceC8896e interfaceC8896e = this.f40218b.get(i);
            if (interfaceC8896e instanceof C8897f) {
                return 2;
            }
            if (interfaceC8896e instanceof C8895d) {
                return 3;
            }
            if (interfaceC8896e instanceof C8898g) {
                if (((C8898g) interfaceC8896e).m78964a().hasSubMenu()) {
                    return 1;
                }
                return 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        /* renamed from: p */
        public final int m78975p(int i) {
            int i2 = i;
            for (int i3 = 0; i3 < i; i3++) {
                if (W03.this.f40197g.getItemViewType(i3) == 2) {
                    i2--;
                }
            }
            if (W03.this.f40193c.getChildCount() == 0) {
                return i2 - 1;
            }
            return i2;
        }

        /* renamed from: q */
        public final void m78974q(int i, int i2) {
            while (i < i2) {
                ((C8898g) this.f40218b.get(i)).f40228b = true;
                i++;
            }
        }

        /* renamed from: r */
        public Bundle m78973r() {
            View view;
            Bundle bundle = new Bundle();
            C11032g c11032g = this.f40219c;
            if (c11032g != null) {
                bundle.putInt("android:menu:checked", c11032g.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.f40218b.size();
            for (int i = 0; i < size; i++) {
                InterfaceC8896e interfaceC8896e = this.f40218b.get(i);
                if (interfaceC8896e instanceof C8898g) {
                    C11032g m78964a = ((C8898g) interfaceC8896e).m78964a();
                    if (m78964a != null) {
                        view = m78964a.getActionView();
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        view.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(m78964a.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        /* renamed from: t */
        public int m78972t() {
            int i;
            if (W03.this.f40193c.getChildCount() == 0) {
                i = 0;
            } else {
                i = 1;
            }
            for (int i2 = 0; i2 < W03.this.f40197g.getItemCount(); i2++) {
                int itemViewType = W03.this.f40197g.getItemViewType(i2);
                if (itemViewType == 0 || itemViewType == 1) {
                    i++;
                }
            }
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
        /* renamed from: u */
        public void onBindViewHolder(AbstractC8903l abstractC8903l, int i) {
            Drawable drawable;
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType != 2) {
                        if (itemViewType == 3) {
                            m78980A(abstractC8903l.itemView, i, true);
                            return;
                        }
                        return;
                    }
                    C8897f c8897f = (C8897f) this.f40218b.get(i);
                    abstractC8903l.itemView.setPadding(W03.this.f40210t, c8897f.m78965b(), W03.this.f40211u, c8897f.m78966a());
                    return;
                }
                TextView textView = (TextView) abstractC8903l.itemView;
                textView.setText(((C8898g) this.f40218b.get(i)).m78964a().getTitle());
                int i2 = W03.this.f40199i;
                if (i2 != 0) {
                    Q26.m89061o(textView, i2);
                }
                textView.setPadding(W03.this.f40212v, textView.getPaddingTop(), W03.this.f40213w, textView.getPaddingBottom());
                ColorStateList colorStateList = W03.this.f40200j;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                m78980A(textView, i, true);
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) abstractC8903l.itemView;
            navigationMenuItemView.m49401j(W03.this.f40203m);
            int i3 = W03.this.f40201k;
            if (i3 != 0) {
                navigationMenuItemView.setTextAppearance(i3);
            }
            ColorStateList colorStateList2 = W03.this.f40202l;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable2 = W03.this.f40204n;
            if (drawable2 != null) {
                drawable = drawable2.getConstantState().newDrawable();
            } else {
                drawable = null;
            }
            C38790bq6.m62553A0(navigationMenuItemView, drawable);
            RippleDrawable rippleDrawable = W03.this.f40205o;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            C8898g c8898g = (C8898g) this.f40218b.get(i);
            navigationMenuItemView.setNeedsEmptyIcon(c8898g.f40228b);
            W03 w03 = W03.this;
            int i4 = w03.f40206p;
            int i5 = w03.f40207q;
            navigationMenuItemView.setPadding(i4, i5, i4, i5);
            navigationMenuItemView.setIconPadding(W03.this.f40208r);
            W03 w032 = W03.this;
            if (w032.f40214x) {
                navigationMenuItemView.setIconSize(w032.f40209s);
            }
            navigationMenuItemView.setMaxLines(W03.this.f40216z);
            navigationMenuItemView.mo49373d(c8898g.m78964a(), 0);
            m78980A(navigationMenuItemView, i, false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
        /* renamed from: v */
        public AbstractC8903l onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return new C8892b(W03.this.f40193c);
                    }
                    return new C8901j(W03.this.f40198h, viewGroup);
                }
                return new C8902k(W03.this.f40198h, viewGroup);
            }
            W03 w03 = W03.this;
            return new C8900i(w03.f40198h, viewGroup, w03.f40191D);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
        /* renamed from: w */
        public void onViewRecycled(AbstractC8903l abstractC8903l) {
            if (abstractC8903l instanceof C8900i) {
                ((NavigationMenuItemView) abstractC8903l.itemView).m49403h();
            }
        }

        /* renamed from: x */
        public final void m78968x() {
            if (this.f40220d) {
                return;
            }
            boolean z = true;
            this.f40220d = true;
            this.f40218b.clear();
            this.f40218b.add(new C8895d());
            int size = W03.this.f40195e.m70168G().size();
            int i = -1;
            int i2 = 0;
            boolean z2 = false;
            int i3 = 0;
            while (i2 < size) {
                C11032g c11032g = W03.this.f40195e.m70168G().get(i2);
                if (c11032g.isChecked()) {
                    m78979B(c11032g);
                }
                if (c11032g.isCheckable()) {
                    c11032g.m70101t(false);
                }
                if (c11032g.hasSubMenu()) {
                    SubMenu subMenu = c11032g.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i2 != 0) {
                            this.f40218b.add(new C8897f(W03.this.f40189B, 0));
                        }
                        this.f40218b.add(new C8898g(c11032g));
                        int size2 = this.f40218b.size();
                        int size3 = subMenu.size();
                        int i4 = 0;
                        boolean z3 = false;
                        while (i4 < size3) {
                            C11032g c11032g2 = (C11032g) subMenu.getItem(i4);
                            if (c11032g2.isVisible()) {
                                if (!z3 && c11032g2.getIcon() != null) {
                                    z3 = z;
                                }
                                if (c11032g2.isCheckable()) {
                                    c11032g2.m70101t(false);
                                }
                                if (c11032g.isChecked()) {
                                    m78979B(c11032g);
                                }
                                this.f40218b.add(new C8898g(c11032g2));
                            }
                            i4++;
                            z = true;
                        }
                        if (z3) {
                            m78974q(size2, this.f40218b.size());
                        }
                    }
                } else {
                    int groupId = c11032g.getGroupId();
                    if (groupId != i) {
                        i3 = this.f40218b.size();
                        if (c11032g.getIcon() != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (i2 != 0) {
                            i3++;
                            ArrayList<InterfaceC8896e> arrayList = this.f40218b;
                            int i5 = W03.this.f40189B;
                            arrayList.add(new C8897f(i5, i5));
                        }
                    } else if (!z2 && c11032g.getIcon() != null) {
                        m78974q(i3, this.f40218b.size());
                        z2 = true;
                    }
                    C8898g c8898g = new C8898g(c11032g);
                    c8898g.f40228b = z2;
                    this.f40218b.add(c8898g);
                    i = groupId;
                }
                i2++;
                z = true;
            }
            this.f40220d = false;
        }

        /* renamed from: y */
        public void m78967y(Bundle bundle) {
            C11032g m78964a;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            C11032g m78964a2;
            int i = bundle.getInt("android:menu:checked", 0);
            if (i != 0) {
                this.f40220d = true;
                int size = this.f40218b.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    InterfaceC8896e interfaceC8896e = this.f40218b.get(i2);
                    if ((interfaceC8896e instanceof C8898g) && (m78964a2 = ((C8898g) interfaceC8896e).m78964a()) != null && m78964a2.getItemId() == i) {
                        m78979B(m78964a2);
                        break;
                    }
                    i2++;
                }
                this.f40220d = false;
                m78968x();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.f40218b.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    InterfaceC8896e interfaceC8896e2 = this.f40218b.get(i3);
                    if ((interfaceC8896e2 instanceof C8898g) && (m78964a = ((C8898g) interfaceC8896e2).m78964a()) != null && (actionView = m78964a.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(m78964a.getItemId())) != null) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }
    }

    /* renamed from: W03$d */
    /* loaded from: classes6.dex */
    public static class C8895d implements InterfaceC8896e {
    }

    /* renamed from: W03$e */
    /* loaded from: classes6.dex */
    public interface InterfaceC8896e {
    }

    /* renamed from: W03$f */
    /* loaded from: classes6.dex */
    public static class C8897f implements InterfaceC8896e {

        /* renamed from: a */
        public final int f40225a;

        /* renamed from: b */
        public final int f40226b;

        public C8897f(int i, int i2) {
            this.f40225a = i;
            this.f40226b = i2;
        }

        /* renamed from: a */
        public int m78966a() {
            return this.f40226b;
        }

        /* renamed from: b */
        public int m78965b() {
            return this.f40225a;
        }
    }

    /* renamed from: W03$g */
    /* loaded from: classes6.dex */
    public static class C8898g implements InterfaceC8896e {

        /* renamed from: a */
        public final C11032g f40227a;

        /* renamed from: b */
        public boolean f40228b;

        public C8898g(C11032g c11032g) {
            this.f40227a = c11032g;
        }

        /* renamed from: a */
        public C11032g m78964a() {
            return this.f40227a;
        }
    }

    /* renamed from: W03$h */
    /* loaded from: classes6.dex */
    public class C8899h extends C11949s {
        public C8899h(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.C11949s, p000.C5148M1
        public void onInitializeAccessibilityNodeInfo(View view, C27125p2 c27125p2) {
            super.onInitializeAccessibilityNodeInfo(view, c27125p2);
            c27125p2.m20076h0(C27125p2.C27127b.m20035a(W03.this.f40197g.m78972t(), 1, false));
        }
    }

    /* renamed from: W03$i */
    /* loaded from: classes6.dex */
    public static class C8900i extends AbstractC8903l {
        public C8900i(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(C50603vk4.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: W03$j */
    /* loaded from: classes6.dex */
    public static class C8901j extends AbstractC8903l {
        public C8901j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C50603vk4.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* renamed from: W03$k */
    /* loaded from: classes6.dex */
    public static class C8902k extends AbstractC8903l {
        public C8902k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C50603vk4.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* renamed from: W03$l */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC8903l extends RecyclerView.AbstractC11834D {
        public AbstractC8903l(View view) {
            super(view);
        }
    }

    /* renamed from: A */
    public void m79008A(ColorStateList colorStateList) {
        this.f40203m = colorStateList;
        mo49322f(false);
    }

    /* renamed from: B */
    public void m79007B(int i) {
        this.f40216z = i;
        mo49322f(false);
    }

    /* renamed from: C */
    public void m79006C(int i) {
        this.f40201k = i;
        mo49322f(false);
    }

    /* renamed from: D */
    public void m79005D(ColorStateList colorStateList) {
        this.f40202l = colorStateList;
        mo49322f(false);
    }

    /* renamed from: E */
    public void m79004E(int i) {
        this.f40207q = i;
        mo49322f(false);
    }

    /* renamed from: F */
    public void m79003F(int i) {
        this.f40190C = i;
        NavigationMenuView navigationMenuView = this.f40192b;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i);
        }
    }

    /* renamed from: G */
    public void m79002G(ColorStateList colorStateList) {
        this.f40200j = colorStateList;
        mo49322f(false);
    }

    /* renamed from: H */
    public void m79001H(int i) {
        this.f40213w = i;
        mo49322f(false);
    }

    /* renamed from: I */
    public void m79000I(int i) {
        this.f40212v = i;
        mo49322f(false);
    }

    /* renamed from: J */
    public void m78999J(int i) {
        this.f40199i = i;
        mo49322f(false);
    }

    /* renamed from: K */
    public void m78998K(boolean z) {
        C8893c c8893c = this.f40197g;
        if (c8893c != null) {
            c8893c.m78978C(z);
        }
    }

    /* renamed from: L */
    public final void m78997L() {
        int i;
        if (this.f40193c.getChildCount() == 0 && this.f40215y) {
            i = this.f40188A;
        } else {
            i = 0;
        }
        NavigationMenuView navigationMenuView = this.f40192b;
        navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: b */
    public void mo49325b(C11028e c11028e, boolean z) {
        InterfaceC11037i.InterfaceC11038a interfaceC11038a = this.f40194d;
        if (interfaceC11038a != null) {
            interfaceC11038a.mo69982b(c11028e, z);
        }
    }

    /* renamed from: c */
    public void m78995c(View view) {
        this.f40193c.addView(view);
        NavigationMenuView navigationMenuView = this.f40192b;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: d */
    public boolean mo12399d(C11028e c11028e, C11032g c11032g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: e */
    public Parcelable mo49323e() {
        Bundle bundle = new Bundle();
        if (this.f40192b != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f40192b.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        C8893c c8893c = this.f40197g;
        if (c8893c != null) {
            bundle.putBundle("android:menu:adapter", c8893c.m78973r());
        }
        if (this.f40193c != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.f40193c.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: f */
    public void mo49322f(boolean z) {
        C8893c c8893c = this.f40197g;
        if (c8893c != null) {
            c8893c.m78977D();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: g */
    public boolean mo49321g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    public int getId() {
        return this.f40196f;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: h */
    public boolean mo12398h(C11028e c11028e, C11032g c11032g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: i */
    public void mo12397i(Context context, C11028e c11028e) {
        this.f40198h = LayoutInflater.from(context);
        this.f40195e = c11028e;
        this.f40189B = context.getResources().getDimensionPixelOffset(C35172Pf4.design_navigation_separator_vertical_padding);
    }

    /* renamed from: k */
    public void m78994k(DB6 db6) {
        int m110777m = db6.m110777m();
        if (this.f40188A != m110777m) {
            this.f40188A = m110777m;
            m78997L();
        }
        NavigationMenuView navigationMenuView = this.f40192b;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, db6.m110780j());
        C38790bq6.m62484g(this.f40193c, db6);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: l */
    public void mo49319l(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f40192b.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f40197g.m78967y(bundle2);
            }
            SparseArray<Parcelable> sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.f40193c.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: m */
    public boolean mo49318m(SubMenuC11044l subMenuC11044l) {
        return false;
    }

    /* renamed from: n */
    public View m78993n(int i) {
        return this.f40193c.getChildAt(i);
    }

    /* renamed from: o */
    public InterfaceC11039j m78992o(ViewGroup viewGroup) {
        if (this.f40192b == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.f40198h.inflate(C50603vk4.design_navigation_menu, viewGroup, false);
            this.f40192b = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new C8899h(this.f40192b));
            if (this.f40197g == null) {
                this.f40197g = new C8893c();
            }
            int i = this.f40190C;
            if (i != -1) {
                this.f40192b.setOverScrollMode(i);
            }
            this.f40193c = (LinearLayout) this.f40198h.inflate(C50603vk4.design_navigation_item_header, (ViewGroup) this.f40192b, false);
            this.f40192b.setAdapter(this.f40197g);
        }
        return this.f40192b;
    }

    /* renamed from: p */
    public View m78991p(int i) {
        View inflate = this.f40198h.inflate(i, (ViewGroup) this.f40193c, false);
        m78995c(inflate);
        return inflate;
    }

    /* renamed from: q */
    public void m78990q(boolean z) {
        if (this.f40215y != z) {
            this.f40215y = z;
            m78997L();
        }
    }

    /* renamed from: r */
    public void m78989r(C11032g c11032g) {
        this.f40197g.m78979B(c11032g);
    }

    /* renamed from: s */
    public void m78988s(int i) {
        this.f40211u = i;
        mo49322f(false);
    }

    /* renamed from: t */
    public void m78987t(int i) {
        this.f40210t = i;
        mo49322f(false);
    }

    /* renamed from: u */
    public void m78986u(int i) {
        this.f40196f = i;
    }

    /* renamed from: v */
    public void m78985v(Drawable drawable) {
        this.f40204n = drawable;
        mo49322f(false);
    }

    /* renamed from: w */
    public void m78984w(RippleDrawable rippleDrawable) {
        this.f40205o = rippleDrawable;
        mo49322f(false);
    }

    /* renamed from: x */
    public void m78983x(int i) {
        this.f40206p = i;
        mo49322f(false);
    }

    /* renamed from: y */
    public void m78982y(int i) {
        this.f40208r = i;
        mo49322f(false);
    }

    /* renamed from: z */
    public void m78981z(int i) {
        if (this.f40209s != i) {
            this.f40209s = i;
            this.f40214x = true;
            mo49322f(false);
        }
    }
}

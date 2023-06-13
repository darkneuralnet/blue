package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;
/* renamed from: com.google.android.material.tabs.b */
/* loaded from: classes6.dex */
public final class C17914b {

    /* renamed from: a */
    public final TabLayout f73526a;

    /* renamed from: b */
    public final ViewPager2 f73527b;

    /* renamed from: c */
    public final boolean f73528c;

    /* renamed from: d */
    public final boolean f73529d;

    /* renamed from: e */
    public final InterfaceC17916b f73530e;

    /* renamed from: f */
    public RecyclerView.AbstractC11843h<?> f73531f;

    /* renamed from: g */
    public boolean f73532g;

    /* renamed from: h */
    public C17917c f73533h;

    /* renamed from: i */
    public TabLayout.InterfaceC17906d f73534i;

    /* renamed from: j */
    public RecyclerView.AbstractC11846j f73535j;

    /* renamed from: com.google.android.material.tabs.b$a */
    /* loaded from: classes6.dex */
    public class C17915a extends RecyclerView.AbstractC11846j {
        public C17915a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public void onChanged() {
            C17914b.this.m48697c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public void onItemRangeChanged(int i, int i2) {
            C17914b.this.m48697c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public void onItemRangeInserted(int i, int i2) {
            C17914b.this.m48697c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public void onItemRangeMoved(int i, int i2, int i3) {
            C17914b.this.m48697c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public void onItemRangeRemoved(int i, int i2) {
            C17914b.this.m48697c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public void onItemRangeChanged(int i, int i2, Object obj) {
            C17914b.this.m48697c();
        }
    }

    /* renamed from: com.google.android.material.tabs.b$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC17916b {
        /* renamed from: a */
        void mo4558a(TabLayout.C17910g c17910g, int i);
    }

    /* renamed from: com.google.android.material.tabs.b$c */
    /* loaded from: classes6.dex */
    public static class C17917c extends ViewPager2.AbstractC12103i {

        /* renamed from: a */
        public final WeakReference<TabLayout> f73537a;

        /* renamed from: b */
        public int f73538b;

        /* renamed from: c */
        public int f73539c;

        public C17917c(TabLayout tabLayout) {
            this.f73537a = new WeakReference<>(tabLayout);
            m48694d();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12103i
        /* renamed from: a */
        public void mo48696a(int i) {
            this.f73538b = this.f73539c;
            this.f73539c = i;
            TabLayout tabLayout = this.f73537a.get();
            if (tabLayout != null) {
                tabLayout.m48788b0(this.f73539c);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12103i
        /* renamed from: b */
        public void mo48695b(int i, float f, int i2) {
            boolean z;
            TabLayout tabLayout = this.f73537a.get();
            if (tabLayout != null) {
                int i3 = this.f73539c;
                boolean z2 = false;
                if (i3 == 2 && this.f73538b != 1) {
                    z = false;
                } else {
                    z = true;
                }
                if (i3 != 2 || this.f73538b != 0) {
                    z2 = true;
                }
                tabLayout.setScrollPosition(i, f, z, z2);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12103i
        /* renamed from: c */
        public void mo224c(int i) {
            boolean z;
            TabLayout tabLayout = this.f73537a.get();
            if (tabLayout != null && tabLayout.m48815C() != i && i < tabLayout.m48813E()) {
                int i2 = this.f73539c;
                if (i2 != 0 && (i2 != 2 || this.f73538b != 0)) {
                    z = false;
                } else {
                    z = true;
                }
                tabLayout.m48797U(tabLayout.m48814D(i), z);
            }
        }

        /* renamed from: d */
        public void m48694d() {
            this.f73539c = 0;
            this.f73538b = 0;
        }
    }

    /* renamed from: com.google.android.material.tabs.b$d */
    /* loaded from: classes6.dex */
    public static class C17918d implements TabLayout.InterfaceC17906d {

        /* renamed from: b */
        public final ViewPager2 f73540b;

        /* renamed from: c */
        public final boolean f73541c;

        public C17918d(ViewPager2 viewPager2, boolean z) {
            this.f73540b = viewPager2;
            this.f73541c = z;
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC17905c
        /* renamed from: a */
        public void mo20905a(TabLayout.C17910g c17910g) {
            this.f73540b.setCurrentItem(c17910g.m48716g(), this.f73541c);
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC17905c
        /* renamed from: b */
        public void mo20904b(TabLayout.C17910g c17910g) {
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC17905c
        /* renamed from: c */
        public void mo20903c(TabLayout.C17910g c17910g) {
        }
    }

    public C17914b(TabLayout tabLayout, ViewPager2 viewPager2, InterfaceC17916b interfaceC17916b) {
        this(tabLayout, viewPager2, true, interfaceC17916b);
    }

    /* renamed from: a */
    public void m48699a() {
        if (!this.f73532g) {
            RecyclerView.AbstractC11843h<?> m65701c = this.f73527b.m65701c();
            this.f73531f = m65701c;
            if (m65701c != null) {
                this.f73532g = true;
                C17917c c17917c = new C17917c(this.f73526a);
                this.f73533h = c17917c;
                this.f73527b.m65690n(c17917c);
                C17918d c17918d = new C17918d(this.f73527b, this.f73529d);
                this.f73534i = c17918d;
                this.f73526a.m48782h(c17918d);
                if (this.f73528c) {
                    C17915a c17915a = new C17915a();
                    this.f73535j = c17915a;
                    this.f73531f.registerAdapterDataObserver(c17915a);
                }
                m48697c();
                this.f73526a.setScrollPosition(this.f73527b.m65700d(), 0.0f, true);
                return;
            }
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw new IllegalStateException("TabLayoutMediator is already attached");
    }

    /* renamed from: b */
    public void m48698b() {
        RecyclerView.AbstractC11843h<?> abstractC11843h;
        if (this.f73528c && (abstractC11843h = this.f73531f) != null) {
            abstractC11843h.unregisterAdapterDataObserver(this.f73535j);
            this.f73535j = null;
        }
        this.f73526a.m48801Q(this.f73534i);
        this.f73527b.m65684t(this.f73533h);
        this.f73534i = null;
        this.f73533h = null;
        this.f73531f = null;
        this.f73532g = false;
    }

    /* renamed from: c */
    public void m48697c() {
        this.f73526a.m48803O();
        RecyclerView.AbstractC11843h<?> abstractC11843h = this.f73531f;
        if (abstractC11843h != null) {
            int itemCount = abstractC11843h.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                TabLayout.C17910g mo48806L = this.f73526a.mo48806L();
                this.f73530e.mo4558a(mo48806L, i);
                this.f73526a.m48779k(mo48806L, false);
            }
            if (itemCount > 0) {
                int min = Math.min(this.f73527b.m65700d(), this.f73526a.m48813E() - 1);
                if (min != this.f73526a.m48815C()) {
                    TabLayout tabLayout = this.f73526a;
                    tabLayout.m48798T(tabLayout.m48814D(min));
                }
            }
        }
    }

    public C17914b(TabLayout tabLayout, ViewPager2 viewPager2, boolean z, InterfaceC17916b interfaceC17916b) {
        this(tabLayout, viewPager2, z, true, interfaceC17916b);
    }

    public C17914b(TabLayout tabLayout, ViewPager2 viewPager2, boolean z, boolean z2, InterfaceC17916b interfaceC17916b) {
        this.f73526a = tabLayout;
        this.f73527b = viewPager2;
        this.f73528c = z;
        this.f73529d = z2;
        this.f73530e = interfaceC17916b;
    }
}

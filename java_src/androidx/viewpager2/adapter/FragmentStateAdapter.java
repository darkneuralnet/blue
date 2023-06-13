package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC11685m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.InterfaceC11728i;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public abstract class FragmentStateAdapter extends RecyclerView.AbstractC11843h<C32766Ey1> implements MP5 {

    /* renamed from: b */
    public final AbstractC11719f f56069b;

    /* renamed from: c */
    public final FragmentManager f56070c;

    /* renamed from: g */
    public FragmentMaxLifecycleEnforcer f56074g;

    /* renamed from: d */
    public final C46602oz2<Fragment> f56071d = new C46602oz2<>();

    /* renamed from: e */
    public final C46602oz2<Fragment.SavedState> f56072e = new C46602oz2<>();

    /* renamed from: f */
    public final C46602oz2<Integer> f56073f = new C46602oz2<>();

    /* renamed from: h */
    public C12090e f56075h = new C12090e();

    /* renamed from: i */
    public boolean f56076i = false;

    /* renamed from: j */
    public boolean f56077j = false;

    /* loaded from: classes.dex */
    public class FragmentMaxLifecycleEnforcer {

        /* renamed from: a */
        public ViewPager2.AbstractC12103i f56083a;

        /* renamed from: b */
        public RecyclerView.AbstractC11846j f56084b;

        /* renamed from: c */
        public InterfaceC11728i f56085c;

        /* renamed from: d */
        public ViewPager2 f56086d;

        /* renamed from: e */
        public long f56087e = -1;

        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$a */
        /* loaded from: classes.dex */
        public class C12084a extends ViewPager2.AbstractC12103i {
            public C12084a() {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12103i
            /* renamed from: a */
            public void mo48696a(int i) {
                FragmentMaxLifecycleEnforcer.this.m65713d(false);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12103i
            /* renamed from: c */
            public void mo224c(int i) {
                FragmentMaxLifecycleEnforcer.this.m65713d(false);
            }
        }

        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$b */
        /* loaded from: classes.dex */
        public class C12085b extends AbstractC12089d {
            public C12085b() {
                super(null);
            }

            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.AbstractC12089d, androidx.recyclerview.widget.RecyclerView.AbstractC11846j
            public void onChanged() {
                FragmentMaxLifecycleEnforcer.this.m65713d(true);
            }
        }

        public FragmentMaxLifecycleEnforcer() {
        }

        /* renamed from: a */
        public final ViewPager2 m65716a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        /* renamed from: b */
        public void m65715b(RecyclerView recyclerView) {
            this.f56086d = m65716a(recyclerView);
            C12084a c12084a = new C12084a();
            this.f56083a = c12084a;
            this.f56086d.m65690n(c12084a);
            C12085b c12085b = new C12085b();
            this.f56084b = c12085b;
            FragmentStateAdapter.this.registerAdapterDataObserver(c12085b);
            InterfaceC11728i interfaceC11728i = new InterfaceC11728i() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.3
                @Override // androidx.lifecycle.InterfaceC11728i
                public void onStateChanged(LifecycleOwner lifecycleOwner, AbstractC11719f.EnumC11720a enumC11720a) {
                    FragmentMaxLifecycleEnforcer.this.m65713d(false);
                }
            };
            this.f56085c = interfaceC11728i;
            FragmentStateAdapter.this.f56069b.mo67008a(interfaceC11728i);
        }

        /* renamed from: c */
        public void m65714c(RecyclerView recyclerView) {
            m65716a(recyclerView).m65684t(this.f56083a);
            FragmentStateAdapter.this.unregisterAdapterDataObserver(this.f56084b);
            FragmentStateAdapter.this.f56069b.mo67006d(this.f56085c);
            this.f56086d = null;
        }

        /* renamed from: d */
        public void m65713d(boolean z) {
            int m65700d;
            Fragment m20196h;
            boolean z2;
            if (FragmentStateAdapter.this.m65727M() || this.f56086d.m65696h() != 0 || FragmentStateAdapter.this.f56071d.m20193l() || FragmentStateAdapter.this.getItemCount() == 0 || (m65700d = this.f56086d.m65700d()) >= FragmentStateAdapter.this.getItemCount()) {
                return;
            }
            long itemId = FragmentStateAdapter.this.getItemId(m65700d);
            if ((itemId != this.f56087e || z) && (m20196h = FragmentStateAdapter.this.f56071d.m20196h(itemId)) != null && m20196h.isAdded()) {
                this.f56087e = itemId;
                AbstractC11685m m67311q = FragmentStateAdapter.this.f56070c.m67311q();
                ArrayList<List<AbstractC12091f.InterfaceC12093b>> arrayList = new ArrayList();
                Fragment fragment = null;
                for (int i = 0; i < FragmentStateAdapter.this.f56071d.size(); i++) {
                    long m20192m = FragmentStateAdapter.this.f56071d.m20192m(i);
                    Fragment m20188q = FragmentStateAdapter.this.f56071d.m20188q(i);
                    if (m20188q.isAdded()) {
                        if (m20192m != this.f56087e) {
                            AbstractC11719f.EnumC11724b enumC11724b = AbstractC11719f.EnumC11724b.STARTED;
                            m67311q.mo67099y(m20188q, enumC11724b);
                            arrayList.add(FragmentStateAdapter.this.f56075h.m65711a(m20188q, enumC11724b));
                        } else {
                            fragment = m20188q;
                        }
                        if (m20192m == this.f56087e) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        m20188q.setMenuVisibility(z2);
                    }
                }
                if (fragment != null) {
                    AbstractC11719f.EnumC11724b enumC11724b2 = AbstractC11719f.EnumC11724b.RESUMED;
                    m67311q.mo67099y(fragment, enumC11724b2);
                    arrayList.add(FragmentStateAdapter.this.f56075h.m65711a(fragment, enumC11724b2));
                }
                if (!m67311q.mo67106r()) {
                    m67311q.mo67113k();
                    Collections.reverse(arrayList);
                    for (List<AbstractC12091f.InterfaceC12093b> list : arrayList) {
                        FragmentStateAdapter.this.f56075h.m65710b(list);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$a */
    /* loaded from: classes.dex */
    public class View$OnLayoutChangeListenerC12086a implements View.OnLayoutChangeListener {

        /* renamed from: b */
        public final /* synthetic */ FrameLayout f56092b;

        /* renamed from: c */
        public final /* synthetic */ C32766Ey1 f56093c;

        public View$OnLayoutChangeListenerC12086a(FrameLayout frameLayout, C32766Ey1 c32766Ey1) {
            this.f56092b = frameLayout;
            this.f56093c = c32766Ey1;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (this.f56092b.getParent() != null) {
                this.f56092b.removeOnLayoutChangeListener(this);
                FragmentStateAdapter.this.m65731F(this.f56093c);
            }
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$b */
    /* loaded from: classes.dex */
    public class C12087b extends FragmentManager.AbstractC11638l {

        /* renamed from: a */
        public final /* synthetic */ Fragment f56095a;

        /* renamed from: b */
        public final /* synthetic */ FrameLayout f56096b;

        public C12087b(Fragment fragment, FrameLayout frameLayout) {
            this.f56095a = fragment;
            this.f56096b = frameLayout;
        }

        @Override // androidx.fragment.app.FragmentManager.AbstractC11638l
        /* renamed from: m */
        public void mo65712m(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
            if (fragment == this.f56095a) {
                fragmentManager.m67395I1(this);
                FragmentStateAdapter.this.m65724o(view, this.f56096b);
            }
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$c */
    /* loaded from: classes.dex */
    public class RunnableC12088c implements Runnable {
        public RunnableC12088c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            fragmentStateAdapter.f56076i = false;
            fragmentStateAdapter.m65721u();
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$d */
    /* loaded from: classes.dex */
    public static abstract class AbstractC12089d extends RecyclerView.AbstractC11846j {
        private AbstractC12089d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public final void onItemRangeChanged(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public final void onItemRangeInserted(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public final void onItemRangeMoved(int i, int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public final void onItemRangeRemoved(int i, int i2) {
            onChanged();
        }

        public /* synthetic */ AbstractC12089d(View$OnLayoutChangeListenerC12086a view$OnLayoutChangeListenerC12086a) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public final void onItemRangeChanged(int i, int i2, Object obj) {
            onChanged();
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$e */
    /* loaded from: classes.dex */
    public static class C12090e {

        /* renamed from: a */
        public List<AbstractC12091f> f56099a = new CopyOnWriteArrayList();

        /* renamed from: a */
        public List<AbstractC12091f.InterfaceC12093b> m65711a(Fragment fragment, AbstractC11719f.EnumC11724b enumC11724b) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC12091f abstractC12091f : this.f56099a) {
                arrayList.add(abstractC12091f.m65707a(fragment, enumC11724b));
            }
            return arrayList;
        }

        /* renamed from: b */
        public void m65710b(List<AbstractC12091f.InterfaceC12093b> list) {
            for (AbstractC12091f.InterfaceC12093b interfaceC12093b : list) {
                interfaceC12093b.mo65704a();
            }
        }

        /* renamed from: c */
        public List<AbstractC12091f.InterfaceC12093b> m65709c(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC12091f abstractC12091f : this.f56099a) {
                arrayList.add(abstractC12091f.m65706b(fragment));
            }
            return arrayList;
        }

        /* renamed from: d */
        public List<AbstractC12091f.InterfaceC12093b> m65708d(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC12091f abstractC12091f : this.f56099a) {
                arrayList.add(abstractC12091f.m65705c(fragment));
            }
            return arrayList;
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$f */
    /* loaded from: classes.dex */
    public static abstract class AbstractC12091f {

        /* renamed from: a */
        public static final InterfaceC12093b f56100a = new C12092a();

        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$f$a */
        /* loaded from: classes.dex */
        public class C12092a implements InterfaceC12093b {
            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.AbstractC12091f.InterfaceC12093b
            /* renamed from: a */
            public void mo65704a() {
            }
        }

        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$f$b */
        /* loaded from: classes.dex */
        public interface InterfaceC12093b {
            /* renamed from: a */
            void mo65704a();
        }

        /* renamed from: a */
        public InterfaceC12093b m65707a(Fragment fragment, AbstractC11719f.EnumC11724b enumC11724b) {
            return f56100a;
        }

        /* renamed from: b */
        public InterfaceC12093b m65706b(Fragment fragment) {
            return f56100a;
        }

        /* renamed from: c */
        public InterfaceC12093b m65705c(Fragment fragment) {
            return f56100a;
        }
    }

    public FragmentStateAdapter(FragmentManager fragmentManager, AbstractC11719f abstractC11719f) {
        this.f56070c = fragmentManager;
        this.f56069b = abstractC11719f;
        super.setHasStableIds(true);
    }

    /* renamed from: E */
    public static long m65732E(String str, String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    /* renamed from: r */
    public static String m65723r(String str, long j) {
        return str + j;
    }

    /* renamed from: w */
    public static boolean m65719w(String str, String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    /* renamed from: A */
    public final C32766Ey1 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return C32766Ey1.m108170a(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    /* renamed from: B */
    public final boolean onFailedToRecycleView(C32766Ey1 c32766Ey1) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    /* renamed from: C */
    public final void onViewAttachedToWindow(C32766Ey1 c32766Ey1) {
        m65731F(c32766Ey1);
        m65721u();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    /* renamed from: D */
    public final void onViewRecycled(C32766Ey1 c32766Ey1) {
        Long m65718x = m65718x(c32766Ey1.m108169b().getId());
        if (m65718x != null) {
            m65730H(m65718x.longValue());
            this.f56073f.m20190o(m65718x.longValue());
        }
    }

    /* renamed from: F */
    public void m65731F(final C32766Ey1 c32766Ey1) {
        Fragment m20196h = this.f56071d.m20196h(c32766Ey1.getItemId());
        if (m20196h != null) {
            FrameLayout m108169b = c32766Ey1.m108169b();
            View view = m20196h.getView();
            if (!m20196h.isAdded() && view != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            if (m20196h.isAdded() && view == null) {
                m65728K(m20196h, m108169b);
                return;
            } else if (m20196h.isAdded() && view.getParent() != null) {
                if (view.getParent() != m108169b) {
                    m65724o(view, m108169b);
                    return;
                }
                return;
            } else if (m20196h.isAdded()) {
                m65724o(view, m108169b);
                return;
            } else if (!m65727M()) {
                m65728K(m20196h, m108169b);
                List<AbstractC12091f.InterfaceC12093b> m65709c = this.f56075h.m65709c(m20196h);
                try {
                    m20196h.setMenuVisibility(false);
                    AbstractC11685m m67311q = this.f56070c.m67311q();
                    m67311q.m67119e(m20196h, "f" + c32766Ey1.getItemId()).mo67099y(m20196h, AbstractC11719f.EnumC11724b.STARTED).mo67113k();
                    this.f56074g.m65713d(false);
                    return;
                } finally {
                    this.f56075h.m65710b(m65709c);
                }
            } else if (this.f56070c.m67386M0()) {
                return;
            } else {
                this.f56069b.mo67008a(new InterfaceC11728i() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
                    @Override // androidx.lifecycle.InterfaceC11728i
                    public void onStateChanged(LifecycleOwner lifecycleOwner, AbstractC11719f.EnumC11720a enumC11720a) {
                        if (FragmentStateAdapter.this.m65727M()) {
                            return;
                        }
                        lifecycleOwner.getLifecycle().mo67006d(this);
                        if (C38790bq6.m62506Y(c32766Ey1.m108169b())) {
                            FragmentStateAdapter.this.m65731F(c32766Ey1);
                        }
                    }
                });
                return;
            }
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    /* renamed from: H */
    public final void m65730H(long j) {
        ViewParent parent;
        Fragment m20196h = this.f56071d.m20196h(j);
        if (m20196h == null) {
            return;
        }
        if (m20196h.getView() != null && (parent = m20196h.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!mo8037p(j)) {
            this.f56072e.m20190o(j);
        }
        if (!m20196h.isAdded()) {
            this.f56071d.m20190o(j);
        } else if (m65727M()) {
            this.f56077j = true;
        } else {
            if (m20196h.isAdded() && mo8037p(j)) {
                this.f56072e.m20191n(j, this.f56070c.m67291w1(m20196h));
            }
            List<AbstractC12091f.InterfaceC12093b> m65708d = this.f56075h.m65708d(m20196h);
            try {
                this.f56070c.m67311q().mo67105s(m20196h).mo67113k();
                this.f56071d.m20190o(j);
            } finally {
                this.f56075h.m65710b(m65708d);
            }
        }
    }

    /* renamed from: J */
    public final void m65729J() {
        final Handler handler = new Handler(Looper.getMainLooper());
        final RunnableC12088c runnableC12088c = new RunnableC12088c();
        this.f56069b.mo67008a(new InterfaceC11728i() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.5
            @Override // androidx.lifecycle.InterfaceC11728i
            public void onStateChanged(LifecycleOwner lifecycleOwner, AbstractC11719f.EnumC11720a enumC11720a) {
                if (enumC11720a == AbstractC11719f.EnumC11720a.ON_DESTROY) {
                    handler.removeCallbacks(runnableC12088c);
                    lifecycleOwner.getLifecycle().mo67006d(this);
                }
            }
        });
        handler.postDelayed(runnableC12088c, AbstractComponentTracker.LINGERING_TIMEOUT);
    }

    /* renamed from: K */
    public final void m65728K(Fragment fragment, FrameLayout frameLayout) {
        this.f56070c.m67315o1(new C12087b(fragment, frameLayout), false);
    }

    /* renamed from: M */
    public boolean m65727M() {
        return this.f56070c.m67370U0();
    }

    @Override // p000.MP5
    /* renamed from: a */
    public final Parcelable mo65726a() {
        Bundle bundle = new Bundle(this.f56071d.size() + this.f56072e.size());
        for (int i = 0; i < this.f56071d.size(); i++) {
            long m20192m = this.f56071d.m20192m(i);
            Fragment m20196h = this.f56071d.m20196h(m20192m);
            if (m20196h != null && m20196h.isAdded()) {
                this.f56070c.m67318n1(bundle, m65723r("f#", m20192m), m20196h);
            }
        }
        for (int i2 = 0; i2 < this.f56072e.size(); i2++) {
            long m20192m2 = this.f56072e.m20192m(i2);
            if (mo8037p(m20192m2)) {
                bundle.putParcelable(m65723r("s#", m20192m2), this.f56072e.m20196h(m20192m2));
            }
        }
        return bundle;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public long getItemId(int i) {
        return i;
    }

    @Override // p000.MP5
    /* renamed from: m */
    public final void mo65725m(Parcelable parcelable) {
        if (this.f56072e.m20193l() && this.f56071d.m20193l()) {
            Bundle bundle = (Bundle) parcelable;
            if (bundle.getClassLoader() == null) {
                bundle.setClassLoader(getClass().getClassLoader());
            }
            for (String str : bundle.keySet()) {
                if (m65719w(str, "f#")) {
                    this.f56071d.m20191n(m65732E(str, "f#"), this.f56070c.m67292w0(bundle, str));
                } else if (m65719w(str, "s#")) {
                    long m65732E = m65732E(str, "s#");
                    Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                    if (mo8037p(m65732E)) {
                        this.f56072e.m20191n(m65732E, savedState);
                    }
                } else {
                    throw new IllegalArgumentException("Unexpected key in savedState: " + str);
                }
            }
            if (!this.f56071d.m20193l()) {
                this.f56077j = true;
                this.f56076i = true;
                m65721u();
                m65729J();
                return;
            }
            return;
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    /* renamed from: o */
    public void m65724o(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() <= 1) {
            if (view.getParent() == frameLayout) {
                return;
            }
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        boolean z;
        if (this.f56074g == null) {
            z = true;
        } else {
            z = false;
        }
        HZ3.m103737a(z);
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.f56074g = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.m65715b(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f56074g.m65714c(recyclerView);
        this.f56074g = null;
    }

    /* renamed from: p */
    public boolean mo8037p(long j) {
        return j >= 0 && j < ((long) getItemCount());
    }

    /* renamed from: q */
    public abstract Fragment mo8036q(int i);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    /* renamed from: t */
    public final void m65722t(int i) {
        long itemId = getItemId(i);
        if (!this.f56071d.m20198f(itemId)) {
            Fragment mo8036q = mo8036q(i);
            mo8036q.setInitialSavedState(this.f56072e.m20196h(itemId));
            this.f56071d.m20191n(itemId, mo8036q);
        }
    }

    /* renamed from: u */
    public void m65721u() {
        if (this.f56077j && !m65727M()) {
            C30704yo<Long> c30704yo = new C30704yo();
            for (int i = 0; i < this.f56071d.size(); i++) {
                long m20192m = this.f56071d.m20192m(i);
                if (!mo8037p(m20192m)) {
                    c30704yo.add(Long.valueOf(m20192m));
                    this.f56073f.m20190o(m20192m);
                }
            }
            if (!this.f56076i) {
                this.f56077j = false;
                for (int i2 = 0; i2 < this.f56071d.size(); i2++) {
                    long m20192m2 = this.f56071d.m20192m(i2);
                    if (!m65720v(m20192m2)) {
                        c30704yo.add(Long.valueOf(m20192m2));
                    }
                }
            }
            for (Long l : c30704yo) {
                m65730H(l.longValue());
            }
        }
    }

    /* renamed from: v */
    public final boolean m65720v(long j) {
        View view;
        if (this.f56073f.m20198f(j)) {
            return true;
        }
        Fragment m20196h = this.f56071d.m20196h(j);
        if (m20196h != null && (view = m20196h.getView()) != null && view.getParent() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public final Long m65718x(int i) {
        Long l = null;
        for (int i2 = 0; i2 < this.f56073f.size(); i2++) {
            if (this.f56073f.m20188q(i2).intValue() == i) {
                if (l == null) {
                    l = Long.valueOf(this.f56073f.m20192m(i2));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
        }
        return l;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    /* renamed from: y */
    public final void onBindViewHolder(C32766Ey1 c32766Ey1, int i) {
        long itemId = c32766Ey1.getItemId();
        int id = c32766Ey1.m108169b().getId();
        Long m65718x = m65718x(id);
        if (m65718x != null && m65718x.longValue() != itemId) {
            m65730H(m65718x.longValue());
            this.f56073f.m20190o(m65718x.longValue());
        }
        this.f56073f.m20191n(itemId, Integer.valueOf(id));
        m65722t(i);
        FrameLayout m108169b = c32766Ey1.m108169b();
        if (C38790bq6.m62506Y(m108169b)) {
            if (m108169b.getParent() == null) {
                m108169b.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC12086a(m108169b, c32766Ey1));
            } else {
                throw new IllegalStateException("Design assumption violated.");
            }
        }
        m65721u();
    }
}

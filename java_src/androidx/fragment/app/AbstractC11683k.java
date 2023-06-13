package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC11719f;
import java.util.ArrayList;
@Deprecated
/* renamed from: androidx.fragment.app.k */
/* loaded from: classes.dex */
public abstract class AbstractC11683k extends AbstractC39022cE3 {

    /* renamed from: a */
    public final FragmentManager f54737a;

    /* renamed from: b */
    public final int f54738b;

    /* renamed from: c */
    public AbstractC11685m f54739c = null;

    /* renamed from: d */
    public ArrayList<Fragment.SavedState> f54740d = new ArrayList<>();

    /* renamed from: e */
    public ArrayList<Fragment> f54741e = new ArrayList<>();

    /* renamed from: f */
    public Fragment f54742f = null;

    /* renamed from: g */
    public boolean f54743g;

    public AbstractC11683k(FragmentManager fragmentManager, int i) {
        this.f54737a = fragmentManager;
        this.f54738b = i;
    }

    /* renamed from: a */
    public abstract Fragment mo67152a(int i);

    @Override // p000.AbstractC39022cE3
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment.SavedState savedState;
        Fragment fragment = (Fragment) obj;
        if (this.f54739c == null) {
            this.f54739c = this.f54737a.m67311q();
        }
        while (this.f54740d.size() <= i) {
            this.f54740d.add(null);
        }
        ArrayList<Fragment.SavedState> arrayList = this.f54740d;
        if (fragment.isAdded()) {
            savedState = this.f54737a.m67291w1(fragment);
        } else {
            savedState = null;
        }
        arrayList.set(i, savedState);
        this.f54741e.set(i, null);
        this.f54739c.mo67105s(fragment);
        if (fragment.equals(this.f54742f)) {
            this.f54742f = null;
        }
    }

    @Override // p000.AbstractC39022cE3
    public void finishUpdate(ViewGroup viewGroup) {
        AbstractC11685m abstractC11685m = this.f54739c;
        if (abstractC11685m != null) {
            if (!this.f54743g) {
                try {
                    this.f54743g = true;
                    abstractC11685m.mo67112l();
                } finally {
                    this.f54743g = false;
                }
            }
            this.f54739c = null;
        }
    }

    @Override // p000.AbstractC39022cE3
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.f54741e.size() > i && (fragment = this.f54741e.get(i)) != null) {
            return fragment;
        }
        if (this.f54739c == null) {
            this.f54739c = this.f54737a.m67311q();
        }
        Fragment mo67152a = mo67152a(i);
        if (this.f54740d.size() > i && (savedState = this.f54740d.get(i)) != null) {
            mo67152a.setInitialSavedState(savedState);
        }
        while (this.f54741e.size() <= i) {
            this.f54741e.add(null);
        }
        mo67152a.setMenuVisibility(false);
        if (this.f54738b == 0) {
            mo67152a.setUserVisibleHint(false);
        }
        this.f54741e.set(i, mo67152a);
        this.f54739c.m67122b(viewGroup.getId(), mo67152a);
        if (this.f54738b == 1) {
            this.f54739c.mo67099y(mo67152a, AbstractC11719f.EnumC11724b.STARTED);
        }
        return mo67152a;
    }

    @Override // p000.AbstractC39022cE3
    public boolean isViewFromObject(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // p000.AbstractC39022cE3
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f54740d.clear();
            this.f54741e.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f54740d.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment m67292w0 = this.f54737a.m67292w0(bundle, str);
                    if (m67292w0 != null) {
                        while (this.f54741e.size() <= parseInt) {
                            this.f54741e.add(null);
                        }
                        m67292w0.setMenuVisibility(false);
                        this.f54741e.set(parseInt, m67292w0);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key " + str);
                    }
                }
            }
        }
    }

    @Override // p000.AbstractC39022cE3
    public Parcelable saveState() {
        Bundle bundle;
        if (this.f54740d.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.f54740d.size()];
            this.f54740d.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.f54741e.size(); i++) {
            Fragment fragment = this.f54741e.get(i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f54737a.m67318n1(bundle, "f" + i, fragment);
            }
        }
        return bundle;
    }

    @Override // p000.AbstractC39022cE3
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f54742f;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f54738b == 1) {
                    if (this.f54739c == null) {
                        this.f54739c = this.f54737a.m67311q();
                    }
                    this.f54739c.mo67099y(this.f54742f, AbstractC11719f.EnumC11724b.STARTED);
                } else {
                    this.f54742f.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f54738b == 1) {
                if (this.f54739c == null) {
                    this.f54739c = this.f54737a.m67311q();
                }
                this.f54739c.mo67099y(fragment, AbstractC11719f.EnumC11724b.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f54742f = fragment;
        }
    }

    @Override // p000.AbstractC39022cE3
    public void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }
}

package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* renamed from: androidx.fragment.app.l */
/* loaded from: classes.dex */
public class C11684l {

    /* renamed from: a */
    public final ArrayList<Fragment> f54744a = new ArrayList<>();

    /* renamed from: b */
    public final HashMap<String, C11680j> f54745b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<String, FragmentState> f54746c = new HashMap<>();

    /* renamed from: d */
    public C11678i f54747d;

    /* renamed from: A */
    public void m67151A(C11678i c11678i) {
        this.f54747d = c11678i;
    }

    /* renamed from: B */
    public FragmentState m67150B(String str, FragmentState fragmentState) {
        if (fragmentState != null) {
            return this.f54746c.put(str, fragmentState);
        }
        return this.f54746c.remove(str);
    }

    /* renamed from: a */
    public void m67149a(Fragment fragment) {
        if (!this.f54744a.contains(fragment)) {
            synchronized (this.f54744a) {
                this.f54744a.add(fragment);
            }
            fragment.mAdded = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* renamed from: b */
    public void m67148b() {
        this.f54745b.values().removeAll(Collections.singleton(null));
    }

    /* renamed from: c */
    public boolean m67147c(String str) {
        return this.f54745b.get(str) != null;
    }

    /* renamed from: d */
    public void m67146d(int i) {
        for (C11680j c11680j : this.f54745b.values()) {
            if (c11680j != null) {
                c11680j.m67155u(i);
            }
        }
    }

    /* renamed from: e */
    public void m67145e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f54745b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C11680j c11680j : this.f54745b.values()) {
                printWriter.print(str);
                if (c11680j != null) {
                    Fragment m67165k = c11680j.m67165k();
                    printWriter.println(m67165k);
                    m67165k.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f54744a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f54744a.get(i).toString());
            }
        }
    }

    /* renamed from: f */
    public Fragment m67144f(String str) {
        C11680j c11680j = this.f54745b.get(str);
        if (c11680j != null) {
            return c11680j.m67165k();
        }
        return null;
    }

    /* renamed from: g */
    public Fragment m67143g(int i) {
        for (int size = this.f54744a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f54744a.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (C11680j c11680j : this.f54745b.values()) {
            if (c11680j != null) {
                Fragment m67165k = c11680j.m67165k();
                if (m67165k.mFragmentId == i) {
                    return m67165k;
                }
            }
        }
        return null;
    }

    /* renamed from: h */
    public Fragment m67142h(String str) {
        if (str != null) {
            for (int size = this.f54744a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f54744a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (C11680j c11680j : this.f54745b.values()) {
                if (c11680j != null) {
                    Fragment m67165k = c11680j.m67165k();
                    if (str.equals(m67165k.mTag)) {
                        return m67165k;
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: i */
    public Fragment m67141i(String str) {
        Fragment findFragmentByWho;
        for (C11680j c11680j : this.f54745b.values()) {
            if (c11680j != null && (findFragmentByWho = c11680j.m67165k().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    /* renamed from: j */
    public int m67140j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f54744a.indexOf(fragment);
        for (int i = indexOf - 1; i >= 0; i--) {
            Fragment fragment2 = this.f54744a.get(i);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f54744a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f54744a.get(indexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* renamed from: k */
    public List<C11680j> m67139k() {
        ArrayList arrayList = new ArrayList();
        for (C11680j c11680j : this.f54745b.values()) {
            if (c11680j != null) {
                arrayList.add(c11680j);
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    public List<Fragment> m67138l() {
        ArrayList arrayList = new ArrayList();
        for (C11680j c11680j : this.f54745b.values()) {
            if (c11680j != null) {
                arrayList.add(c11680j.m67165k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* renamed from: m */
    public ArrayList<FragmentState> m67137m() {
        return new ArrayList<>(this.f54746c.values());
    }

    /* renamed from: n */
    public C11680j m67136n(String str) {
        return this.f54745b.get(str);
    }

    /* renamed from: o */
    public List<Fragment> m67135o() {
        ArrayList arrayList;
        if (this.f54744a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f54744a) {
            arrayList = new ArrayList(this.f54744a);
        }
        return arrayList;
    }

    /* renamed from: p */
    public C11678i m67134p() {
        return this.f54747d;
    }

    /* renamed from: q */
    public FragmentState m67133q(String str) {
        return this.f54746c.get(str);
    }

    /* renamed from: r */
    public void m67132r(C11680j c11680j) {
        Fragment m67165k = c11680j.m67165k();
        if (m67147c(m67165k.mWho)) {
            return;
        }
        this.f54745b.put(m67165k.mWho, c11680j);
        if (m67165k.mRetainInstanceChangedWhileDetached) {
            if (m67165k.mRetainInstance) {
                this.f54747d.m67188e(m67165k);
            } else {
                this.f54747d.m67178o(m67165k);
            }
            m67165k.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.m67384N0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + m67165k);
        }
    }

    /* renamed from: s */
    public void m67131s(C11680j c11680j) {
        Fragment m67165k = c11680j.m67165k();
        if (m67165k.mRetainInstance) {
            this.f54747d.m67178o(m67165k);
        }
        if (this.f54745b.put(m67165k.mWho, null) != null && FragmentManager.m67384N0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + m67165k);
        }
    }

    /* renamed from: t */
    public void m67130t() {
        boolean z;
        Iterator<Fragment> it = this.f54744a.iterator();
        while (it.hasNext()) {
            C11680j c11680j = this.f54745b.get(it.next().mWho);
            if (c11680j != null) {
                c11680j.m67163m();
            }
        }
        for (C11680j c11680j2 : this.f54745b.values()) {
            if (c11680j2 != null) {
                c11680j2.m67163m();
                Fragment m67165k = c11680j2.m67165k();
                if (m67165k.mRemoving && !m67165k.isInBackStack()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (m67165k.mBeingSaved && !this.f54746c.containsKey(m67165k.mWho)) {
                        c11680j2.m67157s();
                    }
                    m67131s(c11680j2);
                }
            }
        }
    }

    /* renamed from: u */
    public void m67129u(Fragment fragment) {
        synchronized (this.f54744a) {
            this.f54744a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    /* renamed from: v */
    public void m67128v() {
        this.f54745b.clear();
    }

    /* renamed from: w */
    public void m67127w(List<String> list) {
        this.f54744a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment m67144f = m67144f(str);
                if (m67144f != null) {
                    if (FragmentManager.m67384N0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + m67144f);
                    }
                    m67149a(m67144f);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
            }
        }
    }

    /* renamed from: x */
    public void m67126x(ArrayList<FragmentState> arrayList) {
        this.f54746c.clear();
        Iterator<FragmentState> it = arrayList.iterator();
        while (it.hasNext()) {
            FragmentState next = it.next();
            this.f54746c.put(next.f54621c, next);
        }
    }

    /* renamed from: y */
    public ArrayList<String> m67125y() {
        ArrayList<String> arrayList = new ArrayList<>(this.f54745b.size());
        for (C11680j c11680j : this.f54745b.values()) {
            if (c11680j != null) {
                Fragment m67165k = c11680j.m67165k();
                c11680j.m67157s();
                arrayList.add(m67165k.mWho);
                if (FragmentManager.m67384N0(2)) {
                    Log.v("FragmentManager", "Saved state of " + m67165k + ": " + m67165k.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: z */
    public ArrayList<String> m67124z() {
        synchronized (this.f54744a) {
            if (this.f54744a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f54744a.size());
            Iterator<Fragment> it = this.f54744a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.mWho);
                if (FragmentManager.m67384N0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.mWho + "): " + next);
                }
            }
            return arrayList;
        }
    }
}

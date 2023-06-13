package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.AbstractC11685m;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC11719f;
import ch.qos.logback.core.joran.action.ActionConst;
import java.io.PrintWriter;
import java.util.ArrayList;
/* renamed from: androidx.fragment.app.a */
/* loaded from: classes.dex */
public final class C11647a extends AbstractC11685m implements FragmentManager.InterfaceC11636j, FragmentManager.InterfaceC11641o {

    /* renamed from: t */
    public final FragmentManager f54646t;

    /* renamed from: u */
    public boolean f54647u;

    /* renamed from: v */
    public int f54648v;

    /* renamed from: w */
    public boolean f54649w;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C11647a(FragmentManager fragmentManager) {
        super(r0, r1);
        ClassLoader classLoader;
        C11672e m67286y0 = fragmentManager.m67286y0();
        if (fragmentManager.m67420A0() != null) {
            classLoader = fragmentManager.m67420A0().m67214f().getClassLoader();
        } else {
            classLoader = null;
        }
        this.f54648v = -1;
        this.f54649w = false;
        this.f54646t = fragmentManager;
    }

    @Override // androidx.fragment.app.AbstractC11685m
    /* renamed from: A */
    public AbstractC11685m mo67123A(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.f54646t) {
            throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.mo67123A(fragment);
    }

    /* renamed from: B */
    public void m67248B(int i) {
        AbstractC11685m.C11686a c11686a;
        if (!this.f54756i) {
            return;
        }
        if (FragmentManager.m67384N0(2)) {
            Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
        }
        int size = this.f54750c.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f54750c.get(i2).f54768b;
            if (fragment != null) {
                fragment.mBackStackNesting += i;
                if (FragmentManager.m67384N0(2)) {
                    Log.v("FragmentManager", "Bump nesting of " + c11686a.f54768b + " to " + c11686a.f54768b.mBackStackNesting);
                }
            }
        }
    }

    /* renamed from: C */
    public int m67247C(boolean z) {
        if (!this.f54647u) {
            if (FragmentManager.m67384N0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new C51324wx2("FragmentManager"));
                m67246D("  ", printWriter);
                printWriter.close();
            }
            this.f54647u = true;
            if (this.f54756i) {
                this.f54648v = this.f54646t.m67320n();
            } else {
                this.f54648v = -1;
            }
            this.f54646t.m67355b0(this, z);
            return this.f54648v;
        }
        throw new IllegalStateException("commit already called");
    }

    /* renamed from: D */
    public void m67246D(String str, PrintWriter printWriter) {
        m67245E(str, printWriter, true);
    }

    /* renamed from: E */
    public void m67245E(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f54758k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f54648v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f54647u);
            if (this.f54755h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f54755h));
            }
            if (this.f54751d != 0 || this.f54752e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f54751d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f54752e));
            }
            if (this.f54753f != 0 || this.f54754g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f54753f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f54754g));
            }
            if (this.f54759l != 0 || this.f54760m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f54759l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f54760m);
            }
            if (this.f54761n != 0 || this.f54762o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f54761n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f54762o);
            }
        }
        if (!this.f54750c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f54750c.size();
            for (int i = 0; i < size; i++) {
                AbstractC11685m.C11686a c11686a = this.f54750c.get(i);
                switch (c11686a.f54767a) {
                    case 0:
                        str2 = ActionConst.NULL;
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + c11686a.f54767a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(c11686a.f54768b);
                if (z) {
                    if (c11686a.f54770d != 0 || c11686a.f54771e != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(c11686a.f54770d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(c11686a.f54771e));
                    }
                    if (c11686a.f54772f != 0 || c11686a.f54773g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(c11686a.f54772f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(c11686a.f54773g));
                    }
                }
            }
        }
    }

    /* renamed from: F */
    public void m67244F() {
        int size = this.f54750c.size();
        for (int i = 0; i < size; i++) {
            AbstractC11685m.C11686a c11686a = this.f54750c.get(i);
            Fragment fragment = c11686a.f54768b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f54649w;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f54755h);
                fragment.setSharedElementNames(this.f54763p, this.f54764q);
            }
            switch (c11686a.f54767a) {
                case 1:
                    fragment.setAnimations(c11686a.f54770d, c11686a.f54771e, c11686a.f54772f, c11686a.f54773g);
                    this.f54646t.m67285y1(fragment, false);
                    this.f54646t.m67332j(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c11686a.f54767a);
                case 3:
                    fragment.setAnimations(c11686a.f54770d, c11686a.f54771e, c11686a.f54772f, c11686a.f54773g);
                    this.f54646t.m67312p1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(c11686a.f54770d, c11686a.f54771e, c11686a.f54772f, c11686a.f54773g);
                    this.f54646t.m67390K0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(c11686a.f54770d, c11686a.f54771e, c11686a.f54772f, c11686a.f54773g);
                    this.f54646t.m67285y1(fragment, false);
                    this.f54646t.m67404F1(fragment);
                    break;
                case 6:
                    fragment.setAnimations(c11686a.f54770d, c11686a.f54771e, c11686a.f54772f, c11686a.f54773g);
                    this.f54646t.m67284z(fragment);
                    break;
                case 7:
                    fragment.setAnimations(c11686a.f54770d, c11686a.f54771e, c11686a.f54772f, c11686a.f54773g);
                    this.f54646t.m67285y1(fragment, false);
                    this.f54646t.m67314p(fragment);
                    break;
                case 8:
                    this.f54646t.m67410D1(fragment);
                    break;
                case 9:
                    this.f54646t.m67410D1(null);
                    break;
                case 10:
                    this.f54646t.m67413C1(fragment, c11686a.f54775i);
                    break;
            }
        }
    }

    /* renamed from: G */
    public void m67243G() {
        for (int size = this.f54750c.size() - 1; size >= 0; size--) {
            AbstractC11685m.C11686a c11686a = this.f54750c.get(size);
            Fragment fragment = c11686a.f54768b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f54649w;
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.m67297u1(this.f54755h));
                fragment.setSharedElementNames(this.f54764q, this.f54763p);
            }
            switch (c11686a.f54767a) {
                case 1:
                    fragment.setAnimations(c11686a.f54770d, c11686a.f54771e, c11686a.f54772f, c11686a.f54773g);
                    this.f54646t.m67285y1(fragment, true);
                    this.f54646t.m67312p1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c11686a.f54767a);
                case 3:
                    fragment.setAnimations(c11686a.f54770d, c11686a.f54771e, c11686a.f54772f, c11686a.f54773g);
                    this.f54646t.m67332j(fragment);
                    break;
                case 4:
                    fragment.setAnimations(c11686a.f54770d, c11686a.f54771e, c11686a.f54772f, c11686a.f54773g);
                    this.f54646t.m67404F1(fragment);
                    break;
                case 5:
                    fragment.setAnimations(c11686a.f54770d, c11686a.f54771e, c11686a.f54772f, c11686a.f54773g);
                    this.f54646t.m67285y1(fragment, true);
                    this.f54646t.m67390K0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(c11686a.f54770d, c11686a.f54771e, c11686a.f54772f, c11686a.f54773g);
                    this.f54646t.m67314p(fragment);
                    break;
                case 7:
                    fragment.setAnimations(c11686a.f54770d, c11686a.f54771e, c11686a.f54772f, c11686a.f54773g);
                    this.f54646t.m67285y1(fragment, true);
                    this.f54646t.m67284z(fragment);
                    break;
                case 8:
                    this.f54646t.m67410D1(null);
                    break;
                case 9:
                    this.f54646t.m67410D1(fragment);
                    break;
                case 10:
                    this.f54646t.m67413C1(fragment, c11686a.f54774h);
                    break;
            }
        }
    }

    /* renamed from: H */
    public Fragment m67242H(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f54750c.size()) {
            AbstractC11685m.C11686a c11686a = this.f54750c.get(i);
            int i2 = c11686a.f54767a;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3 && i2 != 6) {
                        if (i2 != 7) {
                            if (i2 == 8) {
                                this.f54750c.add(i, new AbstractC11685m.C11686a(9, fragment2, true));
                                c11686a.f54769c = true;
                                i++;
                                fragment2 = c11686a.f54768b;
                            }
                        }
                    } else {
                        arrayList.remove(c11686a.f54768b);
                        Fragment fragment3 = c11686a.f54768b;
                        if (fragment3 == fragment2) {
                            this.f54750c.add(i, new AbstractC11685m.C11686a(9, fragment3));
                            i++;
                            fragment2 = null;
                        }
                    }
                } else {
                    Fragment fragment4 = c11686a.f54768b;
                    int i3 = fragment4.mContainerId;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment5 = arrayList.get(size);
                        if (fragment5.mContainerId == i3) {
                            if (fragment5 == fragment4) {
                                z = true;
                            } else {
                                if (fragment5 == fragment2) {
                                    this.f54750c.add(i, new AbstractC11685m.C11686a(9, fragment5, true));
                                    i++;
                                    fragment2 = null;
                                }
                                AbstractC11685m.C11686a c11686a2 = new AbstractC11685m.C11686a(3, fragment5, true);
                                c11686a2.f54770d = c11686a.f54770d;
                                c11686a2.f54772f = c11686a.f54772f;
                                c11686a2.f54771e = c11686a.f54771e;
                                c11686a2.f54773g = c11686a.f54773g;
                                this.f54750c.add(i, c11686a2);
                                arrayList.remove(fragment5);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.f54750c.remove(i);
                        i--;
                    } else {
                        c11686a.f54767a = 1;
                        c11686a.f54769c = true;
                        arrayList.add(fragment4);
                    }
                }
                i++;
            }
            arrayList.add(c11686a.f54768b);
            i++;
        }
        return fragment2;
    }

    /* renamed from: I */
    public void m67241I() {
        if (this.f54766s != null) {
            for (int i = 0; i < this.f54766s.size(); i++) {
                this.f54766s.get(i).run();
            }
            this.f54766s = null;
        }
    }

    /* renamed from: J */
    public Fragment m67240J(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f54750c.size() - 1; size >= 0; size--) {
            AbstractC11685m.C11686a c11686a = this.f54750c.get(size);
            int i = c11686a.f54767a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = c11686a.f54768b;
                            break;
                        case 10:
                            c11686a.f54775i = c11686a.f54774h;
                            break;
                    }
                }
                arrayList.add(c11686a.f54768b);
            }
            arrayList.remove(c11686a.f54768b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.FragmentManager.InterfaceC11641o
    /* renamed from: a */
    public boolean mo67239a(ArrayList<C11647a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.m67384N0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f54756i) {
            this.f54646t.m67335i(this);
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.FragmentManager.InterfaceC11636j
    public String getName() {
        return this.f54758k;
    }

    @Override // androidx.fragment.app.AbstractC11685m
    /* renamed from: i */
    public int mo67115i() {
        return m67247C(false);
    }

    @Override // androidx.fragment.app.AbstractC11685m
    /* renamed from: j */
    public int mo67114j() {
        return m67247C(true);
    }

    @Override // androidx.fragment.app.AbstractC11685m
    /* renamed from: k */
    public void mo67113k() {
        m67109o();
        this.f54646t.m67346e0(this, false);
    }

    @Override // androidx.fragment.app.AbstractC11685m
    /* renamed from: l */
    public void mo67112l() {
        m67109o();
        this.f54646t.m67346e0(this, true);
    }

    @Override // androidx.fragment.app.AbstractC11685m
    /* renamed from: n */
    public AbstractC11685m mo67110n(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.f54646t) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.mo67110n(fragment);
    }

    @Override // androidx.fragment.app.AbstractC11685m
    /* renamed from: p */
    public void mo67108p(int i, Fragment fragment, String str, int i2) {
        super.mo67108p(i, fragment, str, i2);
        fragment.mFragmentManager = this.f54646t;
    }

    @Override // androidx.fragment.app.AbstractC11685m
    /* renamed from: q */
    public AbstractC11685m mo67107q(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.f54646t) {
            throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.mo67107q(fragment);
    }

    @Override // androidx.fragment.app.AbstractC11685m
    /* renamed from: r */
    public boolean mo67106r() {
        return this.f54750c.isEmpty();
    }

    @Override // androidx.fragment.app.AbstractC11685m
    /* renamed from: s */
    public AbstractC11685m mo67105s(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.f54646t) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.mo67105s(fragment);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f54648v >= 0) {
            sb.append(" #");
            sb.append(this.f54648v);
        }
        if (this.f54758k != null) {
            sb.append(" ");
            sb.append(this.f54758k);
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // androidx.fragment.app.AbstractC11685m
    /* renamed from: y */
    public AbstractC11685m mo67099y(Fragment fragment, AbstractC11719f.EnumC11724b enumC11724b) {
        if (fragment.mFragmentManager == this.f54646t) {
            if (enumC11724b == AbstractC11719f.EnumC11724b.INITIALIZED && fragment.mState > -1) {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + enumC11724b + " after the Fragment has been created");
            } else if (enumC11724b != AbstractC11719f.EnumC11724b.DESTROYED) {
                return super.mo67099y(fragment, enumC11724b);
            } else {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + enumC11724b + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
            }
        }
        throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f54646t);
    }
}

package androidx.fragment.app;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC11719f;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
/* renamed from: androidx.fragment.app.m */
/* loaded from: classes.dex */
public abstract class AbstractC11685m {

    /* renamed from: a */
    public final C11672e f54748a;

    /* renamed from: b */
    public final ClassLoader f54749b;

    /* renamed from: c */
    public ArrayList<C11686a> f54750c;

    /* renamed from: d */
    public int f54751d;

    /* renamed from: e */
    public int f54752e;

    /* renamed from: f */
    public int f54753f;

    /* renamed from: g */
    public int f54754g;

    /* renamed from: h */
    public int f54755h;

    /* renamed from: i */
    public boolean f54756i;

    /* renamed from: j */
    public boolean f54757j;

    /* renamed from: k */
    public String f54758k;

    /* renamed from: l */
    public int f54759l;

    /* renamed from: m */
    public CharSequence f54760m;

    /* renamed from: n */
    public int f54761n;

    /* renamed from: o */
    public CharSequence f54762o;

    /* renamed from: p */
    public ArrayList<String> f54763p;

    /* renamed from: q */
    public ArrayList<String> f54764q;

    /* renamed from: r */
    public boolean f54765r;

    /* renamed from: s */
    public ArrayList<Runnable> f54766s;

    /* renamed from: androidx.fragment.app.m$a */
    /* loaded from: classes.dex */
    public static final class C11686a {

        /* renamed from: a */
        public int f54767a;

        /* renamed from: b */
        public Fragment f54768b;

        /* renamed from: c */
        public boolean f54769c;

        /* renamed from: d */
        public int f54770d;

        /* renamed from: e */
        public int f54771e;

        /* renamed from: f */
        public int f54772f;

        /* renamed from: g */
        public int f54773g;

        /* renamed from: h */
        public AbstractC11719f.EnumC11724b f54774h;

        /* renamed from: i */
        public AbstractC11719f.EnumC11724b f54775i;

        public C11686a() {
        }

        public C11686a(int i, Fragment fragment) {
            this.f54767a = i;
            this.f54768b = fragment;
            this.f54769c = false;
            AbstractC11719f.EnumC11724b enumC11724b = AbstractC11719f.EnumC11724b.RESUMED;
            this.f54774h = enumC11724b;
            this.f54775i = enumC11724b;
        }

        public C11686a(int i, Fragment fragment, boolean z) {
            this.f54767a = i;
            this.f54768b = fragment;
            this.f54769c = z;
            AbstractC11719f.EnumC11724b enumC11724b = AbstractC11719f.EnumC11724b.RESUMED;
            this.f54774h = enumC11724b;
            this.f54775i = enumC11724b;
        }

        public C11686a(int i, Fragment fragment, AbstractC11719f.EnumC11724b enumC11724b) {
            this.f54767a = i;
            this.f54768b = fragment;
            this.f54769c = false;
            this.f54774h = fragment.mMaxState;
            this.f54775i = enumC11724b;
        }
    }

    @Deprecated
    public AbstractC11685m() {
        this.f54750c = new ArrayList<>();
        this.f54757j = true;
        this.f54765r = false;
        this.f54748a = null;
        this.f54749b = null;
    }

    /* renamed from: A */
    public AbstractC11685m mo67123A(Fragment fragment) {
        m67118f(new C11686a(5, fragment));
        return this;
    }

    /* renamed from: b */
    public AbstractC11685m m67122b(int i, Fragment fragment) {
        mo67108p(i, fragment, null, 1);
        return this;
    }

    /* renamed from: c */
    public AbstractC11685m m67121c(int i, Fragment fragment, String str) {
        mo67108p(i, fragment, str, 1);
        return this;
    }

    /* renamed from: d */
    public AbstractC11685m m67120d(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        return m67121c(viewGroup.getId(), fragment, str);
    }

    /* renamed from: e */
    public AbstractC11685m m67119e(Fragment fragment, String str) {
        mo67108p(0, fragment, str, 1);
        return this;
    }

    /* renamed from: f */
    public void m67118f(C11686a c11686a) {
        this.f54750c.add(c11686a);
        c11686a.f54770d = this.f54751d;
        c11686a.f54771e = this.f54752e;
        c11686a.f54772f = this.f54753f;
        c11686a.f54773g = this.f54754g;
    }

    /* renamed from: g */
    public AbstractC11685m m67117g(String str) {
        if (this.f54757j) {
            this.f54756i = true;
            this.f54758k = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    /* renamed from: h */
    public AbstractC11685m m67116h(Fragment fragment) {
        m67118f(new C11686a(7, fragment));
        return this;
    }

    /* renamed from: i */
    public abstract int mo67115i();

    /* renamed from: j */
    public abstract int mo67114j();

    /* renamed from: k */
    public abstract void mo67113k();

    /* renamed from: l */
    public abstract void mo67112l();

    /* renamed from: m */
    public final Fragment m67111m(Class<? extends Fragment> cls, Bundle bundle) {
        C11672e c11672e = this.f54748a;
        if (c11672e != null) {
            ClassLoader classLoader = this.f54749b;
            if (classLoader != null) {
                Fragment instantiate = c11672e.instantiate(classLoader, cls.getName());
                if (bundle != null) {
                    instantiate.setArguments(bundle);
                }
                return instantiate;
            }
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
    }

    /* renamed from: n */
    public AbstractC11685m mo67110n(Fragment fragment) {
        m67118f(new C11686a(6, fragment));
        return this;
    }

    /* renamed from: o */
    public AbstractC11685m m67109o() {
        if (!this.f54756i) {
            this.f54757j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* renamed from: p */
    public void mo67108p(int i, Fragment fragment, String str, int i2) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            C53112zy1.m75f(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = fragment.mTag;
                if (str3 != null && !str.equals(str3)) {
                    throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
                }
                fragment.mTag = str;
            }
            if (i != 0) {
                if (i != -1) {
                    int i3 = fragment.mFragmentId;
                    if (i3 != 0 && i3 != i) {
                        throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
                    }
                    fragment.mFragmentId = i;
                    fragment.mContainerId = i;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
                }
            }
            m67118f(new C11686a(i2, fragment));
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    /* renamed from: q */
    public AbstractC11685m mo67107q(Fragment fragment) {
        m67118f(new C11686a(4, fragment));
        return this;
    }

    /* renamed from: r */
    public boolean mo67106r() {
        return this.f54750c.isEmpty();
    }

    /* renamed from: s */
    public AbstractC11685m mo67105s(Fragment fragment) {
        m67118f(new C11686a(3, fragment));
        return this;
    }

    /* renamed from: t */
    public AbstractC11685m m67104t(int i, Fragment fragment) {
        return m67103u(i, fragment, null);
    }

    /* renamed from: u */
    public AbstractC11685m m67103u(int i, Fragment fragment, String str) {
        if (i != 0) {
            mo67108p(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* renamed from: v */
    public final AbstractC11685m m67102v(int i, Class<? extends Fragment> cls, Bundle bundle) {
        return m67101w(i, cls, bundle, null);
    }

    /* renamed from: w */
    public final AbstractC11685m m67101w(int i, Class<? extends Fragment> cls, Bundle bundle, String str) {
        return m67103u(i, m67111m(cls, bundle), str);
    }

    /* renamed from: x */
    public AbstractC11685m m67100x(int i, int i2, int i3, int i4) {
        this.f54751d = i;
        this.f54752e = i2;
        this.f54753f = i3;
        this.f54754g = i4;
        return this;
    }

    /* renamed from: y */
    public AbstractC11685m mo67099y(Fragment fragment, AbstractC11719f.EnumC11724b enumC11724b) {
        m67118f(new C11686a(10, fragment, enumC11724b));
        return this;
    }

    /* renamed from: z */
    public AbstractC11685m m67098z(boolean z) {
        this.f54765r = z;
        return this;
    }

    public AbstractC11685m(C11672e c11672e, ClassLoader classLoader) {
        this.f54750c = new ArrayList<>();
        this.f54757j = true;
        this.f54765r = false;
        this.f54748a = c11672e;
        this.f54749b = classLoader;
    }
}

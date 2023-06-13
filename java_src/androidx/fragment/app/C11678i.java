package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.C11759u;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
/* renamed from: androidx.fragment.app.i */
/* loaded from: classes.dex */
public final class C11678i extends AbstractC35048Or6 {

    /* renamed from: h */
    public static final C11759u.InterfaceC11763b f54721h = new C11679a();

    /* renamed from: d */
    public final boolean f54725d;

    /* renamed from: a */
    public final HashMap<String, Fragment> f54722a = new HashMap<>();

    /* renamed from: b */
    public final HashMap<String, C11678i> f54723b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<String, C36920Wr6> f54724c = new HashMap<>();

    /* renamed from: e */
    public boolean f54726e = false;

    /* renamed from: f */
    public boolean f54727f = false;

    /* renamed from: g */
    public boolean f54728g = false;

    /* renamed from: androidx.fragment.app.i$a */
    /* loaded from: classes.dex */
    public class C11679a implements C11759u.InterfaceC11763b {
        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public <T extends AbstractC35048Or6> T create(Class<T> cls) {
            return new C11678i(true);
        }
    }

    public C11678i(boolean z) {
        this.f54725d = z;
    }

    /* renamed from: k */
    public static C11678i m67182k(C36920Wr6 c36920Wr6) {
        return (C11678i) new C11759u(c36920Wr6, f54721h).m66922a(C11678i.class);
    }

    /* renamed from: e */
    public void m67188e(Fragment fragment) {
        if (this.f54728g) {
            if (FragmentManager.m67384N0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.f54722a.containsKey(fragment.mWho)) {
        } else {
            this.f54722a.put(fragment.mWho, fragment);
            if (FragmentManager.m67384N0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11678i.class != obj.getClass()) {
            return false;
        }
        C11678i c11678i = (C11678i) obj;
        if (this.f54722a.equals(c11678i.f54722a) && this.f54723b.equals(c11678i.f54723b) && this.f54724c.equals(c11678i.f54724c)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void m67187f(Fragment fragment) {
        if (FragmentManager.m67384N0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        m67185h(fragment.mWho);
    }

    /* renamed from: g */
    public void m67186g(String str) {
        if (FragmentManager.m67384N0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        m67185h(str);
    }

    /* renamed from: h */
    public final void m67185h(String str) {
        C11678i c11678i = this.f54723b.get(str);
        if (c11678i != null) {
            c11678i.onCleared();
            this.f54723b.remove(str);
        }
        C36920Wr6 c36920Wr6 = this.f54724c.get(str);
        if (c36920Wr6 != null) {
            c36920Wr6.m77779a();
            this.f54724c.remove(str);
        }
    }

    public int hashCode() {
        return (((this.f54722a.hashCode() * 31) + this.f54723b.hashCode()) * 31) + this.f54724c.hashCode();
    }

    /* renamed from: i */
    public Fragment m67184i(String str) {
        return this.f54722a.get(str);
    }

    /* renamed from: j */
    public C11678i m67183j(Fragment fragment) {
        C11678i c11678i = this.f54723b.get(fragment.mWho);
        if (c11678i == null) {
            C11678i c11678i2 = new C11678i(this.f54725d);
            this.f54723b.put(fragment.mWho, c11678i2);
            return c11678i2;
        }
        return c11678i;
    }

    /* renamed from: l */
    public Collection<Fragment> m67181l() {
        return new ArrayList(this.f54722a.values());
    }

    /* renamed from: m */
    public C36920Wr6 m67180m(Fragment fragment) {
        C36920Wr6 c36920Wr6 = this.f54724c.get(fragment.mWho);
        if (c36920Wr6 == null) {
            C36920Wr6 c36920Wr62 = new C36920Wr6();
            this.f54724c.put(fragment.mWho, c36920Wr62);
            return c36920Wr62;
        }
        return c36920Wr6;
    }

    /* renamed from: n */
    public boolean m67179n() {
        return this.f54726e;
    }

    /* renamed from: o */
    public void m67178o(Fragment fragment) {
        boolean z;
        if (this.f54728g) {
            if (FragmentManager.m67384N0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if (this.f54722a.remove(fragment.mWho) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && FragmentManager.m67384N0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    @Override // p000.AbstractC35048Or6
    public void onCleared() {
        if (FragmentManager.m67384N0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f54726e = true;
    }

    /* renamed from: p */
    public void m67177p(boolean z) {
        this.f54728g = z;
    }

    /* renamed from: q */
    public boolean m67176q(Fragment fragment) {
        if (!this.f54722a.containsKey(fragment.mWho)) {
            return true;
        }
        if (this.f54725d) {
            return this.f54726e;
        }
        return !this.f54727f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f54722a.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f54723b.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f54724c.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb.toString();
    }
}

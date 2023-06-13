package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* renamed from: eV5  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C40380eV5 extends Fragment {

    /* renamed from: b */
    public final C2062F3 f78475b;

    /* renamed from: c */
    public final XI4 f78476c;

    /* renamed from: d */
    public final Set<C40380eV5> f78477d;

    /* renamed from: e */
    public C40380eV5 f78478e;

    /* renamed from: f */
    public UI4 f78479f;

    /* renamed from: g */
    public Fragment f78480g;

    /* renamed from: eV5$a */
    /* loaded from: classes5.dex */
    public class C20058a implements XI4 {
        public C20058a() {
        }

        @Override // p000.XI4
        /* renamed from: a */
        public Set<UI4> mo42825a() {
            Set<C40380eV5> m42831N6 = C40380eV5.this.m42831N6();
            HashSet hashSet = new HashSet(m42831N6.size());
            for (C40380eV5 c40380eV5 : m42831N6) {
                if (c40380eV5.m42837B9() != null) {
                    hashSet.add(c40380eV5.m42837B9());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + C40380eV5.this + "}";
        }
    }

    public C40380eV5() {
        this(new C2062F3());
    }

    /* renamed from: E9 */
    public static FragmentManager m42835E9(Fragment fragment) {
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        return fragment.getFragmentManager();
    }

    /* renamed from: A9 */
    public final Fragment m42838A9() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            return this.f78480g;
        }
        return parentFragment;
    }

    /* renamed from: B9 */
    public UI4 m42837B9() {
        return this.f78479f;
    }

    /* renamed from: D9 */
    public XI4 m42836D9() {
        return this.f78476c;
    }

    /* renamed from: G9 */
    public final boolean m42834G9(Fragment fragment) {
        Fragment m42838A9 = m42838A9();
        while (true) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment != null) {
                if (parentFragment.equals(m42838A9)) {
                    return true;
                }
                fragment = fragment.getParentFragment();
            } else {
                return false;
            }
        }
    }

    /* renamed from: I9 */
    public final void m42833I9(Context context, FragmentManager fragmentManager) {
        m42828T9();
        C40380eV5 m53032s = ComponentCallbacks2C17096a.m53155c(context).m53147k().m53032s(fragmentManager);
        this.f78478e = m53032s;
        if (!equals(m53032s)) {
            this.f78478e.m42827a5(this);
        }
    }

    /* renamed from: J9 */
    public final void m42832J9(C40380eV5 c40380eV5) {
        this.f78477d.remove(c40380eV5);
    }

    /* renamed from: N6 */
    public Set<C40380eV5> m42831N6() {
        C40380eV5 c40380eV5 = this.f78478e;
        if (c40380eV5 == null) {
            return Collections.emptySet();
        }
        if (equals(c40380eV5)) {
            return Collections.unmodifiableSet(this.f78477d);
        }
        HashSet hashSet = new HashSet();
        for (C40380eV5 c40380eV52 : this.f78478e.m42831N6()) {
            if (m42834G9(c40380eV52.m42838A9())) {
                hashSet.add(c40380eV52);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: P9 */
    public void m42830P9(Fragment fragment) {
        FragmentManager m42835E9;
        this.f78480g = fragment;
        if (fragment == null || fragment.getContext() == null || (m42835E9 = m42835E9(fragment)) == null) {
            return;
        }
        m42833I9(fragment.getContext(), m42835E9);
    }

    /* renamed from: S9 */
    public void m42829S9(UI4 ui4) {
        this.f78479f = ui4;
    }

    /* renamed from: T9 */
    public final void m42828T9() {
        C40380eV5 c40380eV5 = this.f78478e;
        if (c40380eV5 != null) {
            c40380eV5.m42832J9(this);
            this.f78478e = null;
        }
    }

    /* renamed from: a5 */
    public final void m42827a5(C40380eV5 c40380eV5) {
        this.f78477d.add(c40380eV5);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        FragmentManager m42835E9 = m42835E9(this);
        if (m42835E9 == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
                return;
            }
            return;
        }
        try {
            m42833I9(getContext(), m42835E9);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f78475b.m108063c();
        m42828T9();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f78480g = null;
        m42828T9();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f78475b.m108062d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f78475b.m108061e();
    }

    /* renamed from: t8 */
    public C2062F3 m42826t8() {
        return this.f78475b;
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + m42838A9() + "}";
    }

    @SuppressLint({"ValidFragment"})
    public C40380eV5(C2062F3 c2062f3) {
        this.f78476c = new C20058a();
        this.f78477d = new HashSet();
        this.f78475b = c2062f3;
    }
}

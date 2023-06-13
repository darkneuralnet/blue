package p000;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
@Deprecated
/* renamed from: VI4 */
/* loaded from: classes5.dex */
public class VI4 extends Fragment {

    /* renamed from: b */
    public final C2062F3 f38854b;

    /* renamed from: c */
    public final XI4 f38855c;

    /* renamed from: d */
    public final Set<VI4> f38856d;

    /* renamed from: e */
    public UI4 f38857e;

    /* renamed from: f */
    public VI4 f38858f;

    /* renamed from: g */
    public Fragment f38859g;

    /* renamed from: VI4$a */
    /* loaded from: classes5.dex */
    public class C8599a implements XI4 {
        public C8599a() {
        }

        @Override // p000.XI4
        /* renamed from: a */
        public Set<UI4> mo42825a() {
            Set<VI4> m79997b = VI4.this.m79997b();
            HashSet hashSet = new HashSet(m79997b.size());
            for (VI4 vi4 : m79997b) {
                if (vi4.m79994e() != null) {
                    hashSet.add(vi4.m79994e());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + VI4.this + "}";
        }
    }

    public VI4() {
        this(new C2062F3());
    }

    /* renamed from: a */
    public final void m79998a(VI4 vi4) {
        this.f38856d.add(vi4);
    }

    @TargetApi(17)
    /* renamed from: b */
    public Set<VI4> m79997b() {
        if (equals(this.f38858f)) {
            return Collections.unmodifiableSet(this.f38856d);
        }
        if (this.f38858f != null) {
            HashSet hashSet = new HashSet();
            for (VI4 vi4 : this.f38858f.m79997b()) {
                if (m79992g(vi4.getParentFragment())) {
                    hashSet.add(vi4);
                }
            }
            return Collections.unmodifiableSet(hashSet);
        }
        return Collections.emptySet();
    }

    /* renamed from: c */
    public C2062F3 m79996c() {
        return this.f38854b;
    }

    @TargetApi(17)
    /* renamed from: d */
    public final Fragment m79995d() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            return this.f38859g;
        }
        return parentFragment;
    }

    /* renamed from: e */
    public UI4 m79994e() {
        return this.f38857e;
    }

    /* renamed from: f */
    public XI4 m79993f() {
        return this.f38855c;
    }

    @TargetApi(17)
    /* renamed from: g */
    public final boolean m79992g(Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 != null) {
                if (parentFragment2.equals(parentFragment)) {
                    return true;
                }
                fragment = fragment.getParentFragment();
            } else {
                return false;
            }
        }
    }

    /* renamed from: h */
    public final void m79991h(Activity activity) {
        m79987l();
        VI4 m53034q = ComponentCallbacks2C17096a.m53155c(activity).m53147k().m53034q(activity);
        this.f38858f = m53034q;
        if (!equals(m53034q)) {
            this.f38858f.m79998a(this);
        }
    }

    /* renamed from: i */
    public final void m79990i(VI4 vi4) {
        this.f38856d.remove(vi4);
    }

    /* renamed from: j */
    public void m79989j(Fragment fragment) {
        this.f38859g = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            m79991h(fragment.getActivity());
        }
    }

    /* renamed from: k */
    public void m79988k(UI4 ui4) {
        this.f38857e = ui4;
    }

    /* renamed from: l */
    public final void m79987l() {
        VI4 vi4 = this.f38858f;
        if (vi4 != null) {
            vi4.m79990i(this);
            this.f38858f = null;
        }
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m79991h(activity);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f38854b.m108063c();
        m79987l();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        m79987l();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f38854b.m108062d();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f38854b.m108061e();
    }

    @Override // android.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + m79995d() + "}";
    }

    @SuppressLint({"ValidFragment"})
    public VI4(C2062F3 c2062f3) {
        this.f38855c = new C8599a();
        this.f38856d = new HashSet();
        this.f38854b = c2062f3;
    }
}

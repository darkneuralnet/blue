package p000;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.perf.metrics.Trace;
import java.util.WeakHashMap;
import p000.C34872Ny1;
/* renamed from: xy1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C51926xy1 extends FragmentManager.AbstractC11638l {

    /* renamed from: f */
    public static final C10776ad f118416f = C10776ad.m71007e();

    /* renamed from: a */
    public final WeakHashMap<Fragment, Trace> f118417a = new WeakHashMap<>();

    /* renamed from: b */
    public final C38141al0 f118418b;

    /* renamed from: c */
    public final C41612ga6 f118419c;

    /* renamed from: d */
    public final C26577nl f118420d;

    /* renamed from: e */
    public final C35106Oy1 f118421e;

    public C51926xy1(C38141al0 c38141al0, C41612ga6 c41612ga6, C26577nl c26577nl, C35106Oy1 c35106Oy1) {
        this.f118418b = c38141al0;
        this.f118419c = c41612ga6;
        this.f118420d = c26577nl;
        this.f118421e = c35106Oy1;
    }

    @Override // androidx.fragment.app.FragmentManager.AbstractC11638l
    /* renamed from: f */
    public void mo4372f(FragmentManager fragmentManager, Fragment fragment) {
        super.mo4372f(fragmentManager, fragment);
        C10776ad c10776ad = f118416f;
        c10776ad.m71010b("FragmentMonitor %s.onFragmentPaused ", fragment.getClass().getSimpleName());
        if (!this.f118417a.containsKey(fragment)) {
            c10776ad.m71001k("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = this.f118417a.get(fragment);
        this.f118417a.remove(fragment);
        C43628jy3<C34872Ny1.C5752a> m91133f = this.f118421e.m91133f(fragment);
        if (!m91133f.m29582d()) {
            c10776ad.m71001k("onFragmentPaused: recorder failed to trace %s", fragment.getClass().getSimpleName());
            return;
        }
        C34327Lp5.m96313a(trace, m91133f.m29583c());
        trace.stop();
    }

    @Override // androidx.fragment.app.FragmentManager.AbstractC11638l
    /* renamed from: i */
    public void mo4371i(FragmentManager fragmentManager, Fragment fragment) {
        String simpleName;
        super.mo4371i(fragmentManager, fragment);
        f118416f.m71010b("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        Trace trace = new Trace(m4370o(fragment), this.f118419c, this.f118418b, this.f118420d);
        trace.start();
        if (fragment.getParentFragment() == null) {
            simpleName = "No parent";
        } else {
            simpleName = fragment.getParentFragment().getClass().getSimpleName();
        }
        trace.putAttribute("Parent_fragment", simpleName);
        if (fragment.getActivity() != null) {
            trace.putAttribute("Hosting_activity", fragment.getActivity().getClass().getSimpleName());
        }
        this.f118417a.put(fragment, trace);
        this.f118421e.m91135d(fragment);
    }

    /* renamed from: o */
    public String m4370o(Fragment fragment) {
        return "_st_" + fragment.getClass().getSimpleName();
    }
}

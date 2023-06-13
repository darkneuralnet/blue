package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* renamed from: j3 */
/* loaded from: classes3.dex */
public final class C24694j3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CoordinatorLayout f92052a;

    /* renamed from: b */
    public final CoordinatorLayout f92053b;

    /* renamed from: c */
    public final FrameLayout f92054c;

    /* renamed from: d */
    public final FrameLayout f92055d;

    /* renamed from: e */
    public final Toolbar f92056e;

    public C24694j3(CoordinatorLayout coordinatorLayout, CoordinatorLayout coordinatorLayout2, FrameLayout frameLayout, FrameLayout frameLayout2, Toolbar toolbar) {
        this.f92052a = coordinatorLayout;
        this.f92053b = coordinatorLayout2;
        this.f92054c = frameLayout;
        this.f92055d = frameLayout2;
        this.f92056e = toolbar;
    }

    /* renamed from: a */
    public static C24694j3 m31220a(View view) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
        int i = C49398ti4.customNavContainer;
        FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
        if (frameLayout != null) {
            i = C49398ti4.rootContainer;
            FrameLayout frameLayout2 = (FrameLayout) C34328Lp6.m96312a(view, i);
            if (frameLayout2 != null) {
                i = C49398ti4.toolbar;
                Toolbar toolbar = (Toolbar) C34328Lp6.m96312a(view, i);
                if (toolbar != null) {
                    return new C24694j3(coordinatorLayout, coordinatorLayout, frameLayout, frameLayout2, toolbar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C24694j3 m31218c(LayoutInflater layoutInflater) {
        return m31217d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C24694j3 m31217d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C41710gk4.activity_checkout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m31220a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public CoordinatorLayout getRoot() {
        return this.f92052a;
    }
}

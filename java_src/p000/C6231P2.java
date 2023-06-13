package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: P2 */
/* loaded from: classes3.dex */
public final class C6231P2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CoordinatorLayout f27765a;

    /* renamed from: b */
    public final AppBarLayout f27766b;

    /* renamed from: c */
    public final LinearProgressIndicator f27767c;

    /* renamed from: d */
    public final RecyclerView f27768d;

    /* renamed from: e */
    public final EditText f27769e;

    public C6231P2(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView, EditText editText) {
        this.f27765a = coordinatorLayout;
        this.f27766b = appBarLayout;
        this.f27767c = linearProgressIndicator;
        this.f27768d = recyclerView;
        this.f27769e = editText;
    }

    /* renamed from: a */
    public static C6231P2 m91047a(View view) {
        int i = C38115ai4.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) C34328Lp6.m96312a(view, i);
        if (appBarLayout != null) {
            i = C38115ai4.progressBar;
            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
            if (linearProgressIndicator != null) {
                i = C38115ai4.recyclerView;
                RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                if (recyclerView != null) {
                    i = C38115ai4.search;
                    EditText editText = (EditText) C34328Lp6.m96312a(view, i);
                    if (editText != null) {
                        return new C6231P2((CoordinatorLayout) view, appBarLayout, linearProgressIndicator, recyclerView, editText);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C6231P2 m91045c(LayoutInflater layoutInflater) {
        return m91044d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C6231P2 m91044d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C34740Nj4.activity_add_to_batch, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m91047a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public CoordinatorLayout getRoot() {
        return this.f27765a;
    }
}

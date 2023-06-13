package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: Y2 */
/* loaded from: classes3.dex */
public final class C9603Y2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CoordinatorLayout f44458a;

    /* renamed from: b */
    public final AppBarLayout f44459b;

    /* renamed from: c */
    public final LinearProgressIndicator f44460c;

    /* renamed from: d */
    public final RecyclerView f44461d;

    /* renamed from: e */
    public final EditText f44462e;

    public C9603Y2(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView, EditText editText) {
        this.f44458a = coordinatorLayout;
        this.f44459b = appBarLayout;
        this.f44460c = linearProgressIndicator;
        this.f44461d = recyclerView;
        this.f44462e = editText;
    }

    /* renamed from: a */
    public static C9603Y2 m75823a(View view) {
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
                        return new C9603Y2((CoordinatorLayout) view, appBarLayout, linearProgressIndicator, recyclerView, editText);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9603Y2 m75821c(LayoutInflater layoutInflater) {
        return m75820d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C9603Y2 m75820d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C34740Nj4.activity_batch_search, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m75823a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public CoordinatorLayout getRoot() {
        return this.f44458a;
    }
}

package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: d5 */
/* loaded from: classes3.dex */
public final class C19673d5 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f76104a;

    /* renamed from: b */
    public final LinearProgressIndicator f76105b;

    /* renamed from: c */
    public final RecyclerView f76106c;

    /* renamed from: d */
    public final SwipeRefreshLayout f76107d;

    public C19673d5(ConstraintLayout constraintLayout, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        this.f76104a = constraintLayout;
        this.f76105b = linearProgressIndicator;
        this.f76106c = recyclerView;
        this.f76107d = swipeRefreshLayout;
    }

    /* renamed from: a */
    public static C19673d5 m44626a(View view) {
        int i = C33318Hh4.progressBar;
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
        if (linearProgressIndicator != null) {
            i = C33318Hh4.recyclerView;
            RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
            if (recyclerView != null) {
                i = C33318Hh4.swipeRefresh;
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) C34328Lp6.m96312a(view, i);
                if (swipeRefreshLayout != null) {
                    return new C19673d5((ConstraintLayout) view, linearProgressIndicator, recyclerView, swipeRefreshLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C19673d5 m44624c(LayoutInflater layoutInflater) {
        return m44623d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C19673d5 m44623d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C50001uj4.activity_release_assignment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m44626a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f76104a;
    }
}

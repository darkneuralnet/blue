package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: uy1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50148uy1 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f113250a;

    /* renamed from: b */
    public final LinearProgressIndicator f113251b;

    /* renamed from: c */
    public final RecyclerView f113252c;

    /* renamed from: d */
    public final SwipeRefreshLayout f113253d;

    public C50148uy1(ConstraintLayout constraintLayout, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        this.f113250a = constraintLayout;
        this.f113251b = linearProgressIndicator;
        this.f113252c = recyclerView;
        this.f113253d = swipeRefreshLayout;
    }

    /* renamed from: a */
    public static C50148uy1 m9425a(View view) {
        int i = C34254Lh4.progressBar;
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
        if (linearProgressIndicator != null) {
            i = C34254Lh4.recyclerView;
            RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
            if (recyclerView != null) {
                i = C34254Lh4.swipeRefresh;
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) C34328Lp6.m96312a(view, i);
                if (swipeRefreshLayout != null) {
                    return new C50148uy1((ConstraintLayout) view, linearProgressIndicator, recyclerView, swipeRefreshLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C50148uy1 m9423c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C51779xj4.fragment_operator_task_list_v2, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m9425a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f113250a;
    }
}

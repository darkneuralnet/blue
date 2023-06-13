package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: T4 */
/* loaded from: classes3.dex */
public final class C7645T4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final FrameLayout f34719a;

    /* renamed from: b */
    public final LinearProgressIndicator f34720b;

    /* renamed from: c */
    public final RecyclerView f34721c;

    /* renamed from: d */
    public final SwipeRefreshLayout f34722d;

    public C7645T4(FrameLayout frameLayout, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        this.f34719a = frameLayout;
        this.f34720b = linearProgressIndicator;
        this.f34721c = recyclerView;
        this.f34722d = swipeRefreshLayout;
    }

    /* renamed from: a */
    public static C7645T4 m84385a(View view) {
        int i = C35190Ph4.progressBar;
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
        if (linearProgressIndicator != null) {
            i = C35190Ph4.recyclerView;
            RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
            if (recyclerView != null) {
                i = C35190Ph4.swipeRefresh;
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) C34328Lp6.m96312a(view, i);
                if (swipeRefreshLayout != null) {
                    return new C7645T4((FrameLayout) view, linearProgressIndicator, recyclerView, swipeRefreshLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C7645T4 m84383c(LayoutInflater layoutInflater) {
        return m84382d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C7645T4 m84382d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32166Cj4.activity_promotions_center, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84385a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f34719a;
    }
}

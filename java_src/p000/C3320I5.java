package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
/* renamed from: I5 */
/* loaded from: classes2.dex */
public final class C3320I5 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final FrameLayout f14462a;

    /* renamed from: b */
    public final LinearLayout f14463b;

    /* renamed from: c */
    public final CircularProgressIndicator f14464c;

    /* renamed from: d */
    public final RecyclerView f14465d;

    public C3320I5(FrameLayout frameLayout, LinearLayout linearLayout, CircularProgressIndicator circularProgressIndicator, RecyclerView recyclerView) {
        this.f14462a = frameLayout;
        this.f14463b = linearLayout;
        this.f14464c = circularProgressIndicator;
        this.f14465d = recyclerView;
    }

    /* renamed from: a */
    public static C3320I5 m103000a(View view) {
        int i = C36585Vg4.emptyView;
        LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
        if (linearLayout != null) {
            i = C36585Vg4.progressBar;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C34328Lp6.m96312a(view, i);
            if (circularProgressIndicator != null) {
                i = C36585Vg4.recyclerView;
                RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
                if (recyclerView != null) {
                    return new C3320I5((FrameLayout) view, linearLayout, circularProgressIndicator, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C3320I5 m102998c(LayoutInflater layoutInflater) {
        return m102997d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C3320I5 m102997d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_ride_history, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m103000a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f14462a;
    }
}

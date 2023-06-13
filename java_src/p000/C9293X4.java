package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: X4 */
/* loaded from: classes4.dex */
public final class C9293X4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final FrameLayout f42596a;

    /* renamed from: b */
    public final LinearProgressIndicator f42597b;

    /* renamed from: c */
    public final RecyclerView f42598c;

    public C9293X4(FrameLayout frameLayout, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView) {
        this.f42596a = frameLayout;
        this.f42597b = linearProgressIndicator;
        this.f42598c = recyclerView;
    }

    /* renamed from: a */
    public static C9293X4 m77446a(View view) {
        int i = C51176wi4.progressBar;
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
        if (linearProgressIndicator != null) {
            i = C51176wi4.recyclerView;
            RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
            if (recyclerView != null) {
                return new C9293X4((FrameLayout) view, linearProgressIndicator, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9293X4 m77444c(LayoutInflater layoutInflater) {
        return m77443d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C9293X4 m77443d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C43489jk4.activity_quality_control_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m77446a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f42596a;
    }
}

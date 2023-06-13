package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.simplecityapps.recyclerview_fastscroll.views.FastScrollRecyclerView;
/* renamed from: X5 */
/* loaded from: classes2.dex */
public final class C9294X5 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RelativeLayout f42627a;

    /* renamed from: b */
    public final CircularProgressIndicator f42628b;

    /* renamed from: c */
    public final FastScrollRecyclerView f42629c;

    public C9294X5(RelativeLayout relativeLayout, CircularProgressIndicator circularProgressIndicator, FastScrollRecyclerView fastScrollRecyclerView) {
        this.f42627a = relativeLayout;
        this.f42628b = circularProgressIndicator;
        this.f42629c = fastScrollRecyclerView;
    }

    /* renamed from: a */
    public static C9294X5 m77429a(View view) {
        int i = C36585Vg4.progressBar;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C34328Lp6.m96312a(view, i);
        if (circularProgressIndicator != null) {
            i = C36585Vg4.recyclerView;
            FastScrollRecyclerView fastScrollRecyclerView = (FastScrollRecyclerView) C34328Lp6.m96312a(view, i);
            if (fastScrollRecyclerView != null) {
                return new C9294X5((RelativeLayout) view, circularProgressIndicator, fastScrollRecyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9294X5 m77427c(LayoutInflater layoutInflater) {
        return m77426d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C9294X5 m77426d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_select_country, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m77429a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.f42627a;
    }
}

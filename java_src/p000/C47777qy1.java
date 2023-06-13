package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: qy1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47777qy1 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f106131a;

    /* renamed from: b */
    public final RecyclerView f106132b;

    /* renamed from: c */
    public final View f106133c;

    /* renamed from: d */
    public final LinearProgressIndicator f106134d;

    /* renamed from: e */
    public final RecyclerView f106135e;

    public C47777qy1(ConstraintLayout constraintLayout, RecyclerView recyclerView, View view, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView2) {
        this.f106131a = constraintLayout;
        this.f106132b = recyclerView;
        this.f106133c = view;
        this.f106134d = linearProgressIndicator;
        this.f106135e = recyclerView2;
    }

    /* renamed from: a */
    public static C47777qy1 m16727a(View view) {
        View m96312a;
        int i = C32850Fh4.filters;
        RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
        if (recyclerView != null && (m96312a = C34328Lp6.m96312a(view, (i = C32850Fh4.overlay))) != null) {
            i = C32850Fh4.progressBar;
            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
            if (linearProgressIndicator != null) {
                i = C32850Fh4.recyclerView;
                RecyclerView recyclerView2 = (RecyclerView) C34328Lp6.m96312a(view, i);
                if (recyclerView2 != null) {
                    return new C47777qy1((ConstraintLayout) view, recyclerView, m96312a, linearProgressIndicator, recyclerView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C47777qy1 m16725c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C48815sj4.fragment_notification_center, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m16727a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f106131a;
    }
}

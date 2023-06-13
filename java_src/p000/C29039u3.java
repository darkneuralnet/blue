package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: u3 */
/* loaded from: classes2.dex */
public final class C29039u3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f111620a;

    /* renamed from: b */
    public final RecyclerView f111621b;

    public C29039u3(ConstraintLayout constraintLayout, RecyclerView recyclerView) {
        this.f111620a = constraintLayout;
        this.f111621b = recyclerView;
    }

    /* renamed from: a */
    public static C29039u3 m10939a(View view) {
        int i = C36585Vg4.recyclerView;
        RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
        if (recyclerView != null) {
            return new C29039u3((ConstraintLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C29039u3 m10937c(LayoutInflater layoutInflater) {
        return m10936d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C29039u3 m10936d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_debug_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m10939a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f111620a;
    }
}

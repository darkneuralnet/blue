package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: h6 */
/* loaded from: classes2.dex */
public final class C22550h6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f84701a;

    /* renamed from: b */
    public final RecyclerView f84702b;

    /* renamed from: c */
    public final ConstraintLayout f84703c;

    public C22550h6(ConstraintLayout constraintLayout, RecyclerView recyclerView, ConstraintLayout constraintLayout2) {
        this.f84701a = constraintLayout;
        this.f84702b = recyclerView;
        this.f84703c = constraintLayout2;
    }

    /* renamed from: a */
    public static C22550h6 m36856a(View view) {
        int i = C36585Vg4.recyclerView;
        RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
        if (recyclerView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            return new C22550h6(constraintLayout, recyclerView, constraintLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C22550h6 m36854c(LayoutInflater layoutInflater) {
        return m36853d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C22550h6 m36853d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_smartlock_operator_unlock, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36856a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f84701a;
    }
}

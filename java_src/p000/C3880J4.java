package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: J4 */
/* loaded from: classes3.dex */
public final class C3880J4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f16743a;

    /* renamed from: b */
    public final LinearProgressIndicator f16744b;

    /* renamed from: c */
    public final RecyclerView f16745c;

    public C3880J4(ConstraintLayout constraintLayout, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView) {
        this.f16743a = constraintLayout;
        this.f16744b = linearProgressIndicator;
        this.f16745c = recyclerView;
    }

    /* renamed from: a */
    public static C3880J4 m101220a(View view) {
        int i = C35658Rh4.progressBar;
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
        if (linearProgressIndicator != null) {
            i = C35658Rh4.recyclerView;
            RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
            if (recyclerView != null) {
                return new C3880J4((ConstraintLayout) view, linearProgressIndicator, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C3880J4 m101218c(LayoutInflater layoutInflater) {
        return m101217d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C3880J4 m101217d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32634Ej4.activity_past_repairs, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m101220a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f16743a;
    }
}

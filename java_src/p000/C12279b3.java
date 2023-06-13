package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: b3 */
/* loaded from: classes3.dex */
public final class C12279b3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f56823a;

    /* renamed from: b */
    public final LinearProgressIndicator f56824b;

    /* renamed from: c */
    public final RecyclerView f56825c;

    public C12279b3(ConstraintLayout constraintLayout, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView) {
        this.f56823a = constraintLayout;
        this.f56824b = linearProgressIndicator;
        this.f56825c = recyclerView;
    }

    /* renamed from: a */
    public static C12279b3 m65065a(View view) {
        int i = C38698bh4.progressBar;
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
        if (linearProgressIndicator != null) {
            i = C38698bh4.recyclerView;
            RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
            if (recyclerView != null) {
                return new C12279b3((ConstraintLayout) view, linearProgressIndicator, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C12279b3 m65063c(LayoutInflater layoutInflater) {
        return m65062d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C12279b3 m65062d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C47640qk4.activity_bird_plus_landing, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m65065a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f56823a;
    }
}

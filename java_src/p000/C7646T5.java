package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: T5 */
/* loaded from: classes3.dex */
public final class C7646T5 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f34734a;

    /* renamed from: b */
    public final RecyclerView f34735b;

    public C7646T5(ConstraintLayout constraintLayout, RecyclerView recyclerView) {
        this.f34734a = constraintLayout;
        this.f34735b = recyclerView;
    }

    /* renamed from: a */
    public static C7646T5 m84370a(View view) {
        int i = C37062Xh4.recyclerView;
        RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
        if (recyclerView != null) {
            return new C7646T5((ConstraintLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C7646T5 m84368c(LayoutInflater layoutInflater) {
        return m84367d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C7646T5 m84367d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C34038Kj4.activity_save_money, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84370a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f34734a;
    }
}

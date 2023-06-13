package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: KZ */
/* loaded from: classes2.dex */
public final class C4490KZ implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f19858a;

    /* renamed from: b */
    public final RecyclerView f19859b;

    public C4490KZ(ConstraintLayout constraintLayout, RecyclerView recyclerView) {
        this.f19858a = constraintLayout;
        this.f19859b = recyclerView;
    }

    /* renamed from: a */
    public static C4490KZ m98759a(View view) {
        int i = C36819Wg4.recyclerView;
        RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
        if (recyclerView != null) {
            return new C4490KZ((ConstraintLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C4490KZ m98757c(LayoutInflater layoutInflater) {
        return m98756d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C4490KZ m98756d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C45851nj4.bottom_sheet_command, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m98759a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f19858a;
    }
}

package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: Z5 */
/* loaded from: classes3.dex */
public final class C10113Z5 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f47830a;

    /* renamed from: b */
    public final RecyclerView f47831b;

    public C10113Z5(LinearLayout linearLayout, RecyclerView recyclerView) {
        this.f47830a = linearLayout;
        this.f47831b = recyclerView;
    }

    /* renamed from: a */
    public static C10113Z5 m73745a(View view) {
        int i = C38115ai4.recyclerView;
        RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
        if (recyclerView != null) {
            return new C10113Z5((LinearLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C10113Z5 m73743c(LayoutInflater layoutInflater) {
        return m73742d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C10113Z5 m73742d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C34740Nj4.activity_select_service_center, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m73745a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f47830a;
    }
}

package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: V3 */
/* loaded from: classes3.dex */
public final class C8538V3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f38461a;

    /* renamed from: b */
    public final RecyclerView f38462b;

    /* renamed from: c */
    public final NestedScrollView f38463c;

    /* renamed from: d */
    public final C52993zm2 f38464d;

    /* renamed from: e */
    public final TextView f38465e;

    /* renamed from: f */
    public final ConstraintLayout f38466f;

    /* renamed from: g */
    public final RecyclerView f38467g;

    public C8538V3(ConstraintLayout constraintLayout, RecyclerView recyclerView, NestedScrollView nestedScrollView, C52993zm2 c52993zm2, TextView textView, ConstraintLayout constraintLayout2, RecyclerView recyclerView2) {
        this.f38461a = constraintLayout;
        this.f38462b = recyclerView;
        this.f38463c = nestedScrollView;
        this.f38464d = c52993zm2;
        this.f38465e = textView;
        this.f38466f = constraintLayout2;
        this.f38467g = recyclerView2;
    }

    /* renamed from: a */
    public static C8538V3 m80466a(View view) {
        View m96312a;
        int i = C34488Mh4.categoryRecyclerView;
        RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
        if (recyclerView != null) {
            i = C34488Mh4.content;
            NestedScrollView nestedScrollView = (NestedScrollView) C34328Lp6.m96312a(view, i);
            if (nestedScrollView != null && (m96312a = C34328Lp6.m96312a(view, (i = C34488Mh4.layoutInventoryStatusSection))) != null) {
                C52993zm2 m447a = C52993zm2.m447a(m96312a);
                i = C34488Mh4.noSearchResults;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i = C34488Mh4.searchResultsRecyclerView;
                    RecyclerView recyclerView2 = (RecyclerView) C34328Lp6.m96312a(view, i);
                    if (recyclerView2 != null) {
                        return new C8538V3(constraintLayout, recyclerView, nestedScrollView, m447a, textView, constraintLayout, recyclerView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C8538V3 m80464c(LayoutInflater layoutInflater) {
        return m80463d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C8538V3 m80463d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C52965zj4.activity_inventory_category, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m80466a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f38461a;
    }
}

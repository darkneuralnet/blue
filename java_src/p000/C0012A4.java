package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: A4 */
/* loaded from: classes2.dex */
public final class C0012A4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RecyclerView f74a;

    /* renamed from: b */
    public final RecyclerView f75b;

    public C0012A4(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f74a = recyclerView;
        this.f75b = recyclerView2;
    }

    /* renamed from: a */
    public static C0012A4 m116158a(View view) {
        if (view != null) {
            RecyclerView recyclerView = (RecyclerView) view;
            return new C0012A4(recyclerView, recyclerView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C0012A4 m116156c(LayoutInflater layoutInflater) {
        return m116155d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C0012A4 m116155d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_operator_settings, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m116158a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RecyclerView getRoot() {
        return this.f74a;
    }
}

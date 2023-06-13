package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: Q2 */
/* loaded from: classes2.dex */
public final class C6646Q2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RecyclerView f29711a;

    /* renamed from: b */
    public final RecyclerView f29712b;

    public C6646Q2(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f29711a = recyclerView;
        this.f29712b = recyclerView2;
    }

    /* renamed from: a */
    public static C6646Q2 m89101a(View view) {
        if (view != null) {
            RecyclerView recyclerView = (RecyclerView) view;
            return new C6646Q2(recyclerView, recyclerView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C6646Q2 m89099c(LayoutInflater layoutInflater) {
        return m89098d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C6646Q2 m89098d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_analytics_event_debug, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m89101a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RecyclerView getRoot() {
        return this.f29711a;
    }
}

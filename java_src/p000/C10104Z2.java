package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: Z2 */
/* loaded from: classes3.dex */
public final class C10104Z2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RecyclerView f47765a;

    /* renamed from: b */
    public final RecyclerView f47766b;

    public C10104Z2(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f47765a = recyclerView;
        this.f47766b = recyclerView2;
    }

    /* renamed from: a */
    public static C10104Z2 m73820a(View view) {
        if (view != null) {
            RecyclerView recyclerView = (RecyclerView) view;
            return new C10104Z2(recyclerView, recyclerView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C10104Z2 m73818c(LayoutInflater layoutInflater) {
        return m73817d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C10104Z2 m73817d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C41117fk4.activity_bird_air_diagnostics, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m73820a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RecyclerView getRoot() {
        return this.f47765a;
    }
}

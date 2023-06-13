package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: W5 */
/* loaded from: classes3.dex */
public final class C8932W5 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RecyclerView f40390a;

    public C8932W5(RecyclerView recyclerView) {
        this.f40390a = recyclerView;
    }

    /* renamed from: a */
    public static C8932W5 m78857a(View view) {
        if (view != null) {
            return new C8932W5((RecyclerView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C8932W5 m78855c(LayoutInflater layoutInflater) {
        return m78854d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C8932W5 m78854d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C35442Qj4.activity_scrap_order_vehicles, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m78857a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RecyclerView getRoot() {
        return this.f40390a;
    }
}

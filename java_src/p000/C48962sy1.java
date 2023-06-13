package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: sy1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48962sy1 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RecyclerView f109619a;

    public C48962sy1(RecyclerView recyclerView) {
        this.f109619a = recyclerView;
    }

    /* renamed from: a */
    public static C48962sy1 m13303a(View view) {
        if (view != null) {
            return new C48962sy1((RecyclerView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C48962sy1 m13301c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C35442Qj4.fragment_operator_order_landing, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m13303a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RecyclerView getRoot() {
        return this.f109619a;
    }
}

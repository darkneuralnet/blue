package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: X3 */
/* loaded from: classes3.dex */
public final class C9290X3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RecyclerView f42578a;

    /* renamed from: b */
    public final RecyclerView f42579b;

    public C9290X3(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f42578a = recyclerView;
        this.f42579b = recyclerView2;
    }

    /* renamed from: a */
    public static C9290X3 m77514a(View view) {
        if (view != null) {
            RecyclerView recyclerView = (RecyclerView) view;
            return new C9290X3(recyclerView, recyclerView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C9290X3 m77512c(LayoutInflater layoutInflater) {
        return m77511d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C9290X3 m77511d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C52965zj4.activity_inventory_part_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m77514a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RecyclerView getRoot() {
        return this.f42578a;
    }
}

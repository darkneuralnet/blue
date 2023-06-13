package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: Q5 */
/* loaded from: classes3.dex */
public final class C6674Q5 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RecyclerView f29809a;

    public C6674Q5(RecyclerView recyclerView) {
        this.f29809a = recyclerView;
    }

    /* renamed from: a */
    public static C6674Q5 m88950a(View view) {
        if (view != null) {
            return new C6674Q5((RecyclerView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C6674Q5 m88948c(LayoutInflater layoutInflater) {
        return m88947d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C6674Q5 m88947d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32868Fj4.activity_ride_report, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88950a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RecyclerView getRoot() {
        return this.f29809a;
    }
}

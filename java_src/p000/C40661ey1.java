package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: ey1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40661ey1 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RecyclerView f79206a;

    /* renamed from: b */
    public final RecyclerView f79207b;

    public C40661ey1(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f79206a = recyclerView;
        this.f79207b = recyclerView2;
    }

    /* renamed from: a */
    public static C40661ey1 m42340a(View view) {
        if (view != null) {
            RecyclerView recyclerView = (RecyclerView) view;
            return new C40661ey1(recyclerView, recyclerView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C40661ey1 m42338c(LayoutInflater layoutInflater) {
        return m42337d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C40661ey1 m42337d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38125aj4.fragment_fleet_report, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m42340a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RecyclerView getRoot() {
        return this.f79206a;
    }
}

package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: Dy1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32532Dy1 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RecyclerView f6658a;

    /* renamed from: b */
    public final RecyclerView f6659b;

    public C32532Dy1(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f6658a = recyclerView;
        this.f6659b = recyclerView2;
    }

    /* renamed from: a */
    public static C32532Dy1 m109575a(View view) {
        if (view != null) {
            RecyclerView recyclerView = (RecyclerView) view;
            return new C32532Dy1(recyclerView, recyclerView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C32532Dy1 m109573c(LayoutInflater layoutInflater) {
        return m109572d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C32532Dy1 m109572d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36369Ui4.fragment_vehicle_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m109575a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RecyclerView getRoot() {
        return this.f6658a;
    }
}

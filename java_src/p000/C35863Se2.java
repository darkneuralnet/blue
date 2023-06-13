package p000;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: Se2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35863Se2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f34016a;

    /* renamed from: b */
    public final RecyclerView f34017b;

    public C35863Se2(LinearLayout linearLayout, RecyclerView recyclerView) {
        this.f34016a = linearLayout;
        this.f34017b = recyclerView;
    }

    /* renamed from: a */
    public static C35863Se2 m85167a(View view) {
        int i = C35658Rh4.recyclerView;
        RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
        if (recyclerView != null) {
            return new C35863Se2((LinearLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f34016a;
    }
}

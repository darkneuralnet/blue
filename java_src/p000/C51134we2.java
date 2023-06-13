package p000;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: we2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51134we2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f116296a;

    /* renamed from: b */
    public final RecyclerView f116297b;

    public C51134we2(LinearLayout linearLayout, RecyclerView recyclerView) {
        this.f116296a = linearLayout;
        this.f116297b = recyclerView;
    }

    /* renamed from: a */
    public static C51134we2 m6563a(View view) {
        int i = C34488Mh4.relatedLinksRecyclerView;
        RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
        if (recyclerView != null) {
            return new C51134we2((LinearLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f116296a;
    }
}

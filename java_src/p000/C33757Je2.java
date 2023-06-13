package p000;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: Je2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33757Je2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f17956a;

    /* renamed from: b */
    public final RecyclerView f17957b;

    public C33757Je2(LinearLayout linearLayout, RecyclerView recyclerView) {
        this.f17956a = linearLayout;
        this.f17957b = recyclerView;
    }

    /* renamed from: a */
    public static C33757Je2 m100059a(View view) {
        int i = C34722Nh4.privateBirdsRecyclerView;
        RecyclerView recyclerView = (RecyclerView) C34328Lp6.m96312a(view, i);
        if (recyclerView != null) {
            return new C33757Je2((LinearLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f17956a;
    }
}

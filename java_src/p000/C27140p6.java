package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: p6 */
/* loaded from: classes2.dex */
public final class C27140p6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RecyclerView f103128a;

    /* renamed from: b */
    public final RecyclerView f103129b;

    public C27140p6(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f103128a = recyclerView;
        this.f103129b = recyclerView2;
    }

    /* renamed from: a */
    public static C27140p6 m19964a(View view) {
        if (view != null) {
            RecyclerView recyclerView = (RecyclerView) view;
            return new C27140p6(recyclerView, recyclerView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C27140p6 m19962c(LayoutInflater layoutInflater) {
        return m19961d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C27140p6 m19961d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_tweaks, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m19964a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RecyclerView getRoot() {
        return this.f103128a;
    }
}

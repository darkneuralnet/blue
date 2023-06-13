package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: d3 */
/* loaded from: classes3.dex */
public final class C19671d3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RecyclerView f76055a;

    /* renamed from: b */
    public final RecyclerView f76056b;

    public C19671d3(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f76055a = recyclerView;
        this.f76056b = recyclerView2;
    }

    /* renamed from: a */
    public static C19671d3 m44667a(View view) {
        if (view != null) {
            RecyclerView recyclerView = (RecyclerView) view;
            return new C19671d3(recyclerView, recyclerView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C19671d3 m44665c(LayoutInflater layoutInflater) {
        return m44664d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C19671d3 m44664d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31941Bk4.activity_bird_rating_history, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m44667a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RecyclerView getRoot() {
        return this.f76055a;
    }
}

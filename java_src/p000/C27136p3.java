package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: p3 */
/* loaded from: classes3.dex */
public final class C27136p3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RecyclerView f103049a;

    public C27136p3(RecyclerView recyclerView) {
        this.f103049a = recyclerView;
    }

    /* renamed from: a */
    public static C27136p3 m20020a(View view) {
        if (view != null) {
            return new C27136p3((RecyclerView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C27136p3 m20018c(LayoutInflater layoutInflater) {
        return m20017d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C27136p3 m20017d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36837Wi4.activity_configurable_tutorial_viewer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m20020a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RecyclerView getRoot() {
        return this.f103049a;
    }
}

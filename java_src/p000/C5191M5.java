package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: M5 */
/* loaded from: classes3.dex */
public final class C5191M5 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RecyclerView f22606a;

    public C5191M5(RecyclerView recyclerView) {
        this.f22606a = recyclerView;
    }

    /* renamed from: a */
    public static C5191M5 m95839a(View view) {
        if (view != null) {
            return new C5191M5((RecyclerView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C5191M5 m95837c(LayoutInflater layoutInflater) {
        return m95836d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C5191M5 m95836d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C33102Gj4.activity_ride_pass_v4, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m95839a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RecyclerView getRoot() {
        return this.f22606a;
    }
}

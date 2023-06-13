package p000;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: U33 */
/* loaded from: classes3.dex */
public final class U33 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RecyclerView f36769a;

    /* renamed from: b */
    public final RecyclerView f36770b;

    public U33(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f36769a = recyclerView;
        this.f36770b = recyclerView2;
    }

    /* renamed from: a */
    public static U33 m82033a(View view) {
        if (view != null) {
            RecyclerView recyclerView = (RecyclerView) view;
            return new U33(recyclerView, recyclerView);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RecyclerView getRoot() {
        return this.f36769a;
    }
}

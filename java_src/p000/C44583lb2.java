package p000;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: lb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44583lb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RecyclerView f96418a;

    public C44583lb2(RecyclerView recyclerView) {
        this.f96418a = recyclerView;
    }

    /* renamed from: a */
    public static C44583lb2 m27102a(View view) {
        if (view != null) {
            return new C44583lb2((RecyclerView) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RecyclerView getRoot() {
        return this.f96418a;
    }
}

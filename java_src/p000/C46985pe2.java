package p000;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: pe2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46985pe2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RecyclerView f103872a;

    public C46985pe2(RecyclerView recyclerView) {
        this.f103872a = recyclerView;
    }

    /* renamed from: a */
    public static C46985pe2 m19020a(View view) {
        if (view != null) {
            return new C46985pe2((RecyclerView) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RecyclerView getRoot() {
        return this.f103872a;
    }
}

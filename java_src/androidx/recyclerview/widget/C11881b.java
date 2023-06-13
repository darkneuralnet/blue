package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: androidx.recyclerview.widget.b */
/* loaded from: classes.dex */
public final class C11881b implements InterfaceC32011Bs2 {

    /* renamed from: b */
    public final RecyclerView.AbstractC11843h f55362b;

    public C11881b(RecyclerView.AbstractC11843h abstractC11843h) {
        this.f55362b = abstractC11843h;
    }

    @Override // p000.InterfaceC32011Bs2
    @SuppressLint({"UnknownNullness"})
    public void onChanged(int i, int i2, Object obj) {
        this.f55362b.notifyItemRangeChanged(i, i2, obj);
    }

    @Override // p000.InterfaceC32011Bs2
    public void onInserted(int i, int i2) {
        this.f55362b.notifyItemRangeInserted(i, i2);
    }

    @Override // p000.InterfaceC32011Bs2
    public void onMoved(int i, int i2) {
        this.f55362b.notifyItemMoved(i, i2);
    }

    @Override // p000.InterfaceC32011Bs2
    public void onRemoved(int i, int i2) {
        this.f55362b.notifyItemRangeRemoved(i, i2);
    }
}

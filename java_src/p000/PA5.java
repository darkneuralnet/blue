package p000;

import androidx.recyclerview.widget.C11925l;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J \u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\tH\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"LPA5;", "Landroidx/recyclerview/widget/l$e;", "", "isLongPressDragEnabled", "isItemViewSwipeEnabled", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView$D;", "viewHolder", "", "getMovementFlags", "target", "onMove", "direction", "", "onSwiped", "LRf2;", C17296a.f69688o, "LRf2;", "adapter", "<init>", "(LRf2;)V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: PA5 */
/* loaded from: classes5.dex */
public class PA5 extends C11925l.AbstractC11930e {

    /* renamed from: a */
    public final InterfaceC35638Rf2 f28047a;

    public PA5(InterfaceC35638Rf2 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f28047a = adapter;
    }

    @Override // androidx.recyclerview.widget.C11925l.AbstractC11930e
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.AbstractC11834D viewHolder) {
        int i;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (this.f28047a.mo71821e(viewHolder.getBindingAdapterPosition())) {
            i = 16;
        } else {
            i = 0;
        }
        return C11925l.AbstractC11930e.makeMovementFlags(0, i);
    }

    @Override // androidx.recyclerview.widget.C11925l.AbstractC11930e
    public boolean isItemViewSwipeEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.C11925l.AbstractC11930e
    public boolean isLongPressDragEnabled() {
        return false;
    }

    @Override // androidx.recyclerview.widget.C11925l.AbstractC11930e
    public boolean onMove(RecyclerView recyclerView, RecyclerView.AbstractC11834D viewHolder, RecyclerView.AbstractC11834D target) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(target, "target");
        return false;
    }

    @Override // androidx.recyclerview.widget.C11925l.AbstractC11930e
    public void onSwiped(RecyclerView.AbstractC11834D viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        this.f28047a.mo71820l(viewHolder.getBindingAdapterPosition());
    }
}

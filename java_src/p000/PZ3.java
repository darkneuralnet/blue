package p000;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000e"}, m28432d2 = {"LPZ3;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", TransferTable.COLUMN_STATE, "", "getItemOffsets", "<init>", "()V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: PZ3 */
/* loaded from: classes3.dex */
public final class PZ3 extends RecyclerView.AbstractC11854o {
    /* renamed from: g */
    public static final void m90086g(RecyclerView parent) {
        Intrinsics.checkNotNullParameter(parent, "$parent");
        parent.invalidateItemDecorations();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void getItemOffsets(Rect outRect, View view, final RecyclerView parent, RecyclerView.C11872z state) {
        int i;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        Integer m40591a = C41207ft4.m40591a(parent, view);
        if (m40591a != null) {
            int intValue = m40591a.intValue();
            if (view.getWidth() == 0) {
                view.post(new Runnable() { // from class: OZ3
                    @Override // java.lang.Runnable
                    public final void run() {
                        PZ3.m90086g(RecyclerView.this);
                    }
                });
                return;
            }
            if (intValue == 0) {
                outRect.left = (parent.getWidth() - view.getWidth()) / 2;
            }
            RecyclerView.AbstractC11843h adapter = parent.getAdapter();
            if (adapter != null) {
                i = adapter.getItemCount();
            } else {
                i = 0;
            }
            if (intValue == i - 1) {
                outRect.right = (parent.getWidth() - view.getWidth()) / 2;
            }
        }
    }
}

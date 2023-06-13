package p000;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000e"}, m28432d2 = {"Lhc4;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", TransferTable.COLUMN_STATE, "", "getItemOffsets", "<init>", "()V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: hc4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42223hc4 extends RecyclerView.AbstractC11854o {
    /* renamed from: g */
    public static final void m36160g(RecyclerView parent) {
        Intrinsics.checkNotNullParameter(parent, "$parent");
        parent.invalidateItemDecorations();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void getItemOffsets(Rect outRect, View view, final RecyclerView parent, RecyclerView.C11872z state) {
        RecyclerView.AbstractC11843h adapter;
        int i;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (childAdapterPosition != -1 && (adapter = parent.getAdapter()) != null) {
            int itemViewType = adapter.getItemViewType(childAdapterPosition);
            if (view.getMeasuredHeight() == 0) {
                view.post(new Runnable() { // from class: gc4
                    @Override // java.lang.Runnable
                    public final void run() {
                        C42223hc4.m36160g(RecyclerView.this);
                    }
                });
                return;
            }
            RecyclerView.AbstractC11843h adapter2 = parent.getAdapter();
            boolean z = false;
            if (adapter2 != null) {
                i = adapter2.getItemCount();
            } else {
                i = 0;
            }
            if (childAdapterPosition == i - 1) {
                outRect.bottom = parent.getContext().getResources().getDimensionPixelSize(C37044Xf4.activity_vertical_margin);
            }
            if (itemViewType == C45268mk4.item_button_secondary) {
                outRect.bottom = parent.getContext().getResources().getDimensionPixelSize(C37044Xf4.activity_vertical_margin);
                return;
            }
            if (itemViewType == C45268mk4.item_button || itemViewType == C43489jk4.item_add_notes) {
                z = true;
            }
            if (z) {
                outRect.top = parent.getContext().getResources().getDimensionPixelSize(C37044Xf4.activity_vertical_margin);
            } else if (itemViewType == C43489jk4.item_passed_qc_buttons) {
                outRect.top = (parent.getHeight() - ((int) view.getY())) / 2;
            }
        }
    }
}

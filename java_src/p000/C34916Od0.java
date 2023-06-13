package p000;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000e"}, m28432d2 = {"LOd0;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", TransferTable.COLUMN_STATE, "", "getItemOffsets", "<init>", "()V", "co.bird.android.feature.cannotaccess"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Od0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34916Od0 extends RecyclerView.AbstractC11854o {
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C11872z state) {
        int i;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        Integer m40591a = C41207ft4.m40591a(parent, view);
        if (m40591a != null) {
            int intValue = m40591a.intValue();
            RecyclerView.AbstractC11843h adapter = parent.getAdapter();
            if (adapter != null) {
                int itemViewType = adapter.getItemViewType(intValue);
                int i2 = C36135Ti4.item_cannot_access_report_date;
                int i3 = 0;
                if (itemViewType == i2) {
                    outRect.top = (int) C49347td3.m12001b(28);
                } else if (itemViewType == C36135Ti4.item_cannot_access_report_detail) {
                    RecyclerView.AbstractC11843h adapter2 = parent.getAdapter();
                    if (adapter2 != null) {
                        i = adapter2.getItemViewType(intValue - 1);
                    } else {
                        i = 0;
                    }
                    if (i == i2) {
                        outRect.top = (int) C49347td3.m12001b(Double.valueOf(12.5d));
                    } else {
                        outRect.top = (int) C49347td3.m12001b(8);
                    }
                } else if (itemViewType == C36135Ti4.item_cannot_access_report_image_carousel) {
                    outRect.top = (int) C49347td3.m12001b(12);
                }
                RecyclerView.AbstractC11843h adapter3 = parent.getAdapter();
                if (adapter3 != null) {
                    i3 = adapter3.getItemCount();
                }
                if (intValue == i3 - 1) {
                    outRect.bottom = (int) C49347td3.m12001b(24);
                }
            }
        }
    }
}

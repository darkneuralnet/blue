package p000;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"LmE4;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", TransferTable.COLUMN_STATE, "", "getItemOffsets", "", "b", "I", "activityVerticalMargin", "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: mE4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44970mE4 extends RecyclerView.AbstractC11854o {

    /* renamed from: b */
    public int f97684b;

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
                if (this.f97684b == 0) {
                    Context context = parent.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "parent.context");
                    this.f97684b = C40788fB0.m41774h(context, C37044Xf4.activity_vertical_margin);
                }
                if (itemViewType == C32634Ej4.item_repair_v3_issue) {
                    Context context2 = parent.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "parent.context");
                    outRect.top = (int) C49347td3.m12002a(16, context2);
                } else if (itemViewType == C32634Ej4.item_repair_training_guide) {
                    Context context3 = parent.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "parent.context");
                    outRect.top = (int) C49347td3.m12002a(12, context3);
                }
                RecyclerView.AbstractC11843h adapter2 = parent.getAdapter();
                if (adapter2 != null) {
                    i = adapter2.getItemCount();
                } else {
                    i = 0;
                }
                if (intValue == i - 1) {
                    outRect.bottom = this.f97684b;
                }
            }
        }
    }
}

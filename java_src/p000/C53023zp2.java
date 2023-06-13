package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"Lzp2;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Canvas;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", TransferTable.COLUMN_STATE, "", "onDrawOver", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "getItemOffsets", "Landroid/graphics/drawable/Drawable;", "b", "Landroid/graphics/drawable/Drawable;", "divider", "<init>", "()V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLegacyWorkOrderInspectionItemDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyWorkOrderInspectionItemDecoration.kt\nco/bird/android/feature/workorders/legacyinspection/adapters/LegacyWorkOrderInspectionItemDecoration\n+ 2 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,83:1\n9#2,4:84\n9#2,4:88\n*S KotlinDebug\n*F\n+ 1 LegacyWorkOrderInspectionItemDecoration.kt\nco/bird/android/feature/workorders/legacyinspection/adapters/LegacyWorkOrderInspectionItemDecoration\n*L\n28#1:84,4\n53#1:88,4\n*E\n"})
/* renamed from: zp2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C53023zp2 extends RecyclerView.AbstractC11854o {

    /* renamed from: b */
    public Drawable f122277b;

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C11872z state) {
        int childAdapterPosition;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        RecyclerView.AbstractC11843h adapter = parent.getAdapter();
        if (!(adapter instanceof AbstractC5440My)) {
            adapter = null;
        }
        AbstractC5440My abstractC5440My = (AbstractC5440My) adapter;
        if (abstractC5440My == null || (childAdapterPosition = parent.getChildAdapterPosition(view)) == -1) {
            return;
        }
        int itemViewType = abstractC5440My.getItemViewType(childAdapterPosition);
        if (itemViewType == C45268mk4.item_button_secondary) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "parent.context");
            outRect.top = (int) C49347td3.m12002a(8, context);
        } else {
            int i = C37080Xj4.item_inspect_instructions;
            if (itemViewType == i) {
                Context context2 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "parent.context");
                outRect.top = (int) C49347td3.m12002a(24, context2);
            } else if (itemViewType == C37080Xj4.item_category_header) {
                if (abstractC5440My.getItemViewType(childAdapterPosition - 1) == i) {
                    Context context3 = parent.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "parent.context");
                    outRect.top = (int) C49347td3.m12002a(32, context3);
                } else {
                    Context context4 = parent.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "parent.context");
                    outRect.top = (int) C49347td3.m12002a(56, context4);
                }
            } else if (itemViewType == C37080Xj4.item_issue_empty) {
                Context context5 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "parent.context");
                outRect.top = (int) C49347td3.m12002a(8, context5);
                Context context6 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "parent.context");
                outRect.bottom = (int) C49347td3.m12002a(16, context6);
            } else if (itemViewType == C37080Xj4.item_work_order_notes) {
                Context context7 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "parent.context");
                outRect.top = (int) C49347td3.m12002a(56, context7);
            } else if (itemViewType == C45268mk4.item_button) {
                Context context8 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context8, "parent.context");
                outRect.top = (int) C49347td3.m12002a(48, context8);
            }
        }
        if (childAdapterPosition == abstractC5440My.getItemCount() - 1) {
            Context context9 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context9, "parent.context");
            outRect.bottom = (int) C49347td3.m12002a(16, context9);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.C11872z state) {
        int i;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.f122277b == null) {
            this.f122277b = NA0.m94299e(parent.getContext(), C33309Hg4.divider_light_gray);
        }
        c.save();
        RecyclerView.AbstractC11843h adapter = parent.getAdapter();
        if (!(adapter instanceof AbstractC5440My)) {
            adapter = null;
        }
        AbstractC5440My abstractC5440My = (AbstractC5440My) adapter;
        if (abstractC5440My == null) {
            return;
        }
        int childCount = parent.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = parent.getChildAt(i2);
            int childAdapterPosition = parent.getChildAdapterPosition(childAt);
            if (childAdapterPosition != -1 && abstractC5440My.getItemViewType(childAdapterPosition) == C37080Xj4.item_dropdown_button) {
                int dimensionPixelSize = parent.getContext().getResources().getDimensionPixelSize(C37044Xf4.activity_horizontal_margin);
                int bottom = childAt.getBottom();
                Context context = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "parent.context");
                int m12002a = bottom + ((int) C49347td3.m12002a(32, context));
                int right = parent.getRight() - dimensionPixelSize;
                Drawable drawable = this.f122277b;
                if (drawable != null) {
                    i = drawable.getIntrinsicHeight();
                } else {
                    i = 0;
                }
                int i3 = i + m12002a;
                Drawable drawable2 = this.f122277b;
                if (drawable2 != null) {
                    drawable2.setBounds(dimensionPixelSize, m12002a, right, i3);
                }
                Drawable drawable3 = this.f122277b;
                if (drawable3 != null) {
                    drawable3.draw(c);
                }
            }
        }
        c.restore();
    }
}

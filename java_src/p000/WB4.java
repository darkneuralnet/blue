package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"LWB4;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Canvas;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", TransferTable.COLUMN_STATE, "", "onDrawOver", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "getItemOffsets", "Landroid/graphics/drawable/Drawable;", "b", "Landroid/graphics/drawable/Drawable;", "divider", "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairOverviewItemDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairOverviewItemDecoration.kt\nco/bird/android/feature/repair/v1/base/adapters/RepairOverviewItemDecoration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,59:1\n1549#2:60\n1620#2,3:61\n1855#2,2:64\n*S KotlinDebug\n*F\n+ 1 RepairOverviewItemDecoration.kt\nco/bird/android/feature/repair/v1/base/adapters/RepairOverviewItemDecoration\n*L\n23#1:60\n23#1:61,3\n24#1:64,2\n*E\n"})
/* renamed from: WB4 */
/* loaded from: classes3.dex */
public final class WB4 extends RecyclerView.AbstractC11854o {

    /* renamed from: b */
    public Drawable f40533b;

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C11872z state) {
        int i;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        RecyclerView.AbstractC11843h adapter = parent.getAdapter();
        if (adapter != null) {
            i = adapter.getItemCount();
        } else {
            i = 0;
        }
        if (childAdapterPosition == i - 1) {
            outRect.bottom = parent.getContext().getResources().getDimensionPixelSize(C37044Xf4.activity_vertical_margin);
        }
        RecyclerView.AbstractC11843h adapter2 = parent.getAdapter();
        if (adapter2 != null) {
            int itemViewType = adapter2.getItemViewType(childAdapterPosition);
            if (itemViewType == C45268mk4.item_button_secondary) {
                Context context = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "parent.context");
                outRect.top = (int) C49347td3.m12002a(12, context);
            } else if (itemViewType == C32634Ej4.item_dropdown_repair_button) {
                outRect.top = parent.getContext().getResources().getDimensionPixelSize(C37044Xf4.activity_vertical_margin);
            } else if (itemViewType == C32634Ej4.item_repair_status) {
                Context context2 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "parent.context");
                outRect.top = (int) C49347td3.m12002a(36, context2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.C11872z state) {
        IntRange until;
        int collectionSizeOrDefault;
        Integer num;
        int i;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.f40533b == null) {
            this.f40533b = NA0.m94299e(parent.getContext(), C33309Hg4.divider_light_gray);
        }
        until = RangesKt___RangesKt.until(0, parent.getChildCount());
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
        ArrayList<View> arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(parent.getChildAt(((IntIterator) it).nextInt()));
        }
        for (View view : arrayList) {
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            if (childAdapterPosition != -1) {
                RecyclerView.AbstractC11843h adapter = parent.getAdapter();
                if (adapter != null) {
                    num = Integer.valueOf(adapter.getItemViewType(childAdapterPosition));
                } else {
                    num = null;
                }
                int i2 = C32634Ej4.item_repair_status;
                if (num != null && num.intValue() == i2) {
                    int dimensionPixelSize = parent.getContext().getResources().getDimensionPixelSize(C37044Xf4.activity_horizontal_margin);
                    int top = view.getTop();
                    Context context = parent.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "parent.context");
                    int m12002a = top - ((int) C49347td3.m12002a(12, context));
                    int width = parent.getWidth() - dimensionPixelSize;
                    Drawable drawable = this.f40533b;
                    if (drawable != null) {
                        i = drawable.getIntrinsicHeight();
                    } else {
                        i = 0;
                    }
                    int i3 = i + m12002a;
                    Drawable drawable2 = this.f40533b;
                    if (drawable2 != null) {
                        drawable2.setBounds(dimensionPixelSize, m12002a, width, i3);
                    }
                    Drawable drawable3 = this.f40533b;
                    if (drawable3 != null) {
                        drawable3.draw(c);
                    }
                }
            }
        }
    }
}

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
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"LRE4;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Canvas;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", TransferTable.COLUMN_STATE, "", "onDrawOver", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "getItemOffsets", "Landroid/graphics/drawable/Drawable;", "b", "Landroid/graphics/drawable/Drawable;", "divider", "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairV3IssueRepairItemDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3IssueRepairItemDecoration.kt\nco/bird/android/feature/repair/v3/issues/adapters/RepairV3IssueRepairItemDecoration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,59:1\n1549#2:60\n1620#2,3:61\n1855#2,2:64\n*S KotlinDebug\n*F\n+ 1 RepairV3IssueRepairItemDecoration.kt\nco/bird/android/feature/repair/v3/issues/adapters/RepairV3IssueRepairItemDecoration\n*L\n23#1:60\n23#1:61,3\n24#1:64,2\n*E\n"})
/* renamed from: RE4 */
/* loaded from: classes3.dex */
public final class RE4 extends RecyclerView.AbstractC11854o {

    /* renamed from: b */
    public Drawable f31767b;

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
                if (this.f31767b == null) {
                    this.f31767b = NA0.m94299e(parent.getContext(), C33309Hg4.divider_light_gray);
                }
                int i2 = 0;
                if (itemViewType == C32634Ej4.item_repair_v3) {
                    int i3 = intValue + 1;
                    RecyclerView.AbstractC11843h adapter2 = parent.getAdapter();
                    if (adapter2 != null) {
                        i = adapter2.getItemCount();
                    } else {
                        i = 0;
                    }
                    if (i3 < i) {
                        RecyclerView.AbstractC11843h adapter3 = parent.getAdapter();
                        if (adapter3 != null && adapter3.getItemViewType(i3) == C32634Ej4.item_repair_v3_issue_non_repair) {
                            Context context = parent.getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "parent.context");
                            outRect.bottom = (int) C49347td3.m12002a(20, context);
                            return;
                        }
                        return;
                    }
                }
                if (itemViewType == C32634Ej4.item_repair_v3_issue_non_repair) {
                    Drawable drawable = this.f31767b;
                    if (drawable != null) {
                        i2 = drawable.getIntrinsicHeight();
                    }
                    outRect.top = i2;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.C11872z state) {
        IntRange until;
        int collectionSizeOrDefault;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.f31767b == null) {
            this.f31767b = NA0.m94299e(parent.getContext(), C33309Hg4.divider_light_gray);
        }
        until = RangesKt___RangesKt.until(0, parent.getChildCount());
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
        ArrayList<View> arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(parent.getChildAt(((IntIterator) it).nextInt()));
        }
        for (View child : arrayList) {
            Intrinsics.checkNotNullExpressionValue(child, "child");
            Integer m40591a = C41207ft4.m40591a(parent, child);
            if (m40591a != null) {
                int intValue = m40591a.intValue();
                RecyclerView.AbstractC11843h adapter = parent.getAdapter();
                if (adapter != null && adapter.getItemViewType(intValue) == C32634Ej4.item_repair_v3_issue_non_repair) {
                    int top = child.getTop();
                    Drawable drawable = this.f31767b;
                    if (drawable != null) {
                        i = drawable.getIntrinsicHeight();
                    } else {
                        i = 0;
                    }
                    int i3 = top - i;
                    int width = parent.getWidth();
                    Drawable drawable2 = this.f31767b;
                    if (drawable2 != null) {
                        i2 = drawable2.getIntrinsicHeight();
                    } else {
                        i2 = 0;
                    }
                    int i4 = i2 + i3;
                    Drawable drawable3 = this.f31767b;
                    if (drawable3 != null) {
                        drawable3.setBounds(0, i3, width, i4);
                    }
                    Drawable drawable4 = this.f31767b;
                    if (drawable4 != null) {
                        drawable4.draw(c);
                    }
                }
            }
        }
    }
}

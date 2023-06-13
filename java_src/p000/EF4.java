package p000;

import android.content.Context;
import android.graphics.Canvas;
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
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m28432d2 = {"LEF4;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Canvas;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", TransferTable.COLUMN_STATE, "", "onDrawOver", "Landroid/graphics/drawable/Drawable;", "b", "Landroid/graphics/drawable/Drawable;", "divider", "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairV3OverviewQuickLinkItemDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3OverviewQuickLinkItemDecoration.kt\nco/bird/android/feature/repair/v3/overview/adapters/RepairV3OverviewQuickLinkItemDecoration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,38:1\n1549#2:39\n1620#2,3:40\n1855#2,2:43\n*S KotlinDebug\n*F\n+ 1 RepairV3OverviewQuickLinkItemDecoration.kt\nco/bird/android/feature/repair/v3/overview/adapters/RepairV3OverviewQuickLinkItemDecoration\n*L\n21#1:39\n21#1:40,3\n22#1:43,2\n*E\n"})
/* renamed from: EF4 */
/* loaded from: classes3.dex */
public final class EF4 extends RecyclerView.AbstractC11854o {

    /* renamed from: b */
    public Drawable f7150b;

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.C11872z state) {
        IntRange until;
        int collectionSizeOrDefault;
        int i;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.f7150b == null) {
            this.f7150b = NA0.m94299e(parent.getContext(), C33309Hg4.divider_light_gray);
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
                if (adapter != null && adapter.getItemViewType(intValue) == C32634Ej4.item_quick_link) {
                    Context context = parent.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "parent.context");
                    int m12002a = (int) C49347td3.m12002a(48, context);
                    int top = child.getTop();
                    int width = parent.getWidth();
                    int top2 = child.getTop();
                    Drawable drawable = this.f7150b;
                    if (drawable != null) {
                        i = drawable.getIntrinsicHeight();
                    } else {
                        i = 0;
                    }
                    int i2 = top2 + i;
                    Drawable drawable2 = this.f7150b;
                    if (drawable2 != null) {
                        drawable2.setBounds(m12002a, top, width, i2);
                    }
                    Drawable drawable3 = this.f7150b;
                    if (drawable3 != null) {
                        drawable3.draw(c);
                    }
                }
            }
        }
    }
}

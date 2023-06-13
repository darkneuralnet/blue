package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"LsH2;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Canvas;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", TransferTable.COLUMN_STATE, "", "onDrawOver", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "getItemOffsets", "Landroid/content/Context;", "b", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "co.bird.android.feature.rider.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nManageGroupRidesBottomSheetItemDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManageGroupRidesBottomSheetItemDecoration.kt\nco/bird/android/feature/rider/bottomsheets/adapters/ManageGroupRidesBottomSheetItemDecoration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,53:1\n1855#2,2:54\n*S KotlinDebug\n*F\n+ 1 ManageGroupRidesBottomSheetItemDecoration.kt\nco/bird/android/feature/rider/bottomsheets/adapters/ManageGroupRidesBottomSheetItemDecoration\n*L\n15#1:54,2\n*E\n"})
/* renamed from: sH2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48552sH2 extends RecyclerView.AbstractC11854o {

    /* renamed from: b */
    public final Context f108532b;

    public C48552sH2(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f108532b = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C11872z state) {
        RecyclerView.AbstractC11843h adapter;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (childAdapterPosition != -1 && (adapter = parent.getAdapter()) != null) {
            int itemViewType = adapter.getItemViewType(childAdapterPosition);
            if (itemViewType == C33570Ij4.item_manage_group_rides_header) {
                outRect.top = (int) C49347td3.m12002a(24, this.f108532b);
                outRect.left = (int) C49347td3.m12002a(16, this.f108532b);
                outRect.right = 0;
                outRect.bottom = (int) C49347td3.m12002a(12, this.f108532b);
            } else if (itemViewType == C33570Ij4.item_manage_group_rides_entry) {
                outRect.top = (int) C49347td3.m12002a(4, this.f108532b);
                outRect.left = 0;
                outRect.right = 0;
                outRect.bottom = (int) C49347td3.m12002a(4, this.f108532b);
            } else if (itemViewType == C45268mk4.item_button) {
                outRect.top = (int) C49347td3.m12002a(18, this.f108532b);
                outRect.left = 0;
                outRect.right = 0;
                outRect.bottom = (int) C49347td3.m12002a(40, this.f108532b);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.C11872z state) {
        IntRange until;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        until = RangesKt___RangesKt.until(0, parent.getChildCount());
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            View child = parent.getChildAt(((IntIterator) it).nextInt());
            Intrinsics.checkNotNullExpressionValue(child, "child");
            Integer m40591a = C41207ft4.m40591a(parent, child);
            if (m40591a != null) {
                int intValue = m40591a.intValue();
                RecyclerView.AbstractC11843h adapter = parent.getAdapter();
                if (adapter != null) {
                    adapter.getItemViewType(intValue);
                }
            }
        }
    }
}

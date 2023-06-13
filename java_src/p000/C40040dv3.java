package p000;

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
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m28432d2 = {"Ldv3;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Canvas;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", TransferTable.COLUMN_STATE, "", "onDrawOver", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "getItemOffsets", "Landroid/graphics/drawable/Drawable;", "b", "Landroid/graphics/drawable/Drawable;", "getDivider", "()Landroid/graphics/drawable/Drawable;", "setDivider", "(Landroid/graphics/drawable/Drawable;)V", "divider", "<init>", "()V", "task-list_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorTaskItemDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorTaskItemDecoration.kt\nco/bird/android/feature/operator/tasklist/adapter/OperatorTaskItemDecoration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,45:1\n1549#2:46\n1620#2,3:47\n819#2:50\n847#2,2:51\n1855#2,2:53\n*S KotlinDebug\n*F\n+ 1 OperatorTaskItemDecoration.kt\nco/bird/android/feature/operator/tasklist/adapter/OperatorTaskItemDecoration\n*L\n21#1:46\n21#1:47,3\n23#1:50\n23#1:51,2\n24#1:53,2\n*E\n"})
/* renamed from: dv3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40040dv3 extends RecyclerView.AbstractC11854o {

    /* renamed from: b */
    public Drawable f77430b;

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C11872z state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (parent.getChildViewHolder(view).getItemViewType() == C51186wj4.item_operator_task_list_search) {
            outRect.top = view.getContext().getResources().getDimensionPixelSize(C37044Xf4.operator_search_top_margin);
            outRect.bottom = view.getContext().getResources().getDimensionPixelSize(C37044Xf4.operator_search_bottom_margin);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.C11872z state) {
        IntRange until;
        int collectionSizeOrDefault;
        int i;
        boolean z;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.f77430b == null) {
            this.f77430b = NA0.m94299e(parent.getContext(), C40484eg4.divider_task_list);
        }
        if (parent.getChildCount() == 0) {
            return;
        }
        until = RangesKt___RangesKt.until(0, parent.getChildCount());
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(parent.getChildAt(((IntIterator) it).nextInt()));
        }
        ArrayList<View> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (parent.getChildAdapterPosition((View) obj) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                arrayList2.add(obj);
            }
        }
        for (View view : arrayList2) {
            Drawable drawable = this.f77430b;
            if (drawable != null) {
                int top = view.getTop();
                Drawable drawable2 = this.f77430b;
                if (drawable2 != null) {
                    i = drawable2.getIntrinsicHeight();
                } else {
                    i = 0;
                }
                drawable.setBounds(0, top - i, parent.getRight(), view.getTop());
            }
            Drawable drawable3 = this.f77430b;
            if (drawable3 != null) {
                drawable3.draw(c);
            }
        }
    }
}

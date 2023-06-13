package p000;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0002J<\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0002H\u0002R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016¨\u0006\u001b"}, m28432d2 = {"LoD6;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Canvas;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", TransferTable.COLUMN_STATE, "", "onDrawOver", "Landroid/view/View;", "view", "canvas", "f", "LMy;", "adapter", "", "childPosition", "adapterPosition", "g", "Landroid/graphics/drawable/Drawable;", "b", "Landroid/graphics/drawable/Drawable;", "divider", "timeline", "<init>", "()V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWorkOrderDetailsItemDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderDetailsItemDecoration.kt\nco/bird/android/feature/workorders/details/adapters/WorkOrderDetailsItemDecoration\n+ 2 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,87:1\n9#2,4:88\n1855#3,2:92\n*S KotlinDebug\n*F\n+ 1 WorkOrderDetailsItemDecoration.kt\nco/bird/android/feature/workorders/details/adapters/WorkOrderDetailsItemDecoration\n*L\n23#1:88,4\n25#1:92,2\n*E\n"})
/* renamed from: oD6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46149oD6 extends RecyclerView.AbstractC11854o {

    /* renamed from: b */
    public Drawable f101618b;

    /* renamed from: c */
    public Drawable f101619c;

    /* renamed from: f */
    public final void m21616f(RecyclerView recyclerView, View view, Canvas canvas) {
        int i;
        int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(C37044Xf4.activity_horizontal_margin);
        int bottom = view.getBottom();
        int width = recyclerView.getWidth() - dimensionPixelSize;
        Drawable drawable = this.f101618b;
        if (drawable != null) {
            i = drawable.getIntrinsicHeight();
        } else {
            i = 0;
        }
        int i2 = i + bottom;
        Drawable drawable2 = this.f101618b;
        if (drawable2 != null) {
            drawable2.setBounds(dimensionPixelSize, bottom, width, i2);
            drawable2.draw(canvas);
        }
    }

    /* renamed from: g */
    public final void m21615g(RecyclerView recyclerView, AbstractC5440My<?> abstractC5440My, View view, int i, int i2, Canvas canvas) {
        int i3;
        int top;
        if (abstractC5440My.getItemViewType(i2 + 1) != C37080Xj4.item_work_order_repair) {
            return;
        }
        View childAt = recyclerView.getChildAt(i + 1);
        int i4 = C44062ki4.dot;
        View findViewById = view.findViewById(i4);
        Drawable drawable = this.f101619c;
        if (drawable != null) {
            i3 = drawable.getIntrinsicWidth();
        } else {
            i3 = 0;
        }
        int left = ((findViewById.getLeft() + findViewById.getRight()) - i3) / 2;
        int bottom = findViewById.getBottom() + view.getTop();
        int i5 = i3 + left;
        if (childAt == null) {
            top = recyclerView.getBottom();
        } else {
            View findViewById2 = childAt.findViewById(i4);
            if (findViewById2 == null) {
                return;
            }
            top = findViewById2.getTop() + childAt.getTop();
        }
        Drawable drawable2 = this.f101619c;
        if (drawable2 != null) {
            drawable2.setBounds(left, bottom, i5, top);
            drawable2.draw(canvas);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.C11872z state) {
        IntRange until;
        int nextInt;
        View child;
        int childAdapterPosition;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.f101618b == null) {
            this.f101618b = NA0.m94299e(parent.getContext(), C33309Hg4.divider_light_gray);
            this.f101619c = NA0.m94299e(parent.getContext(), C44635lg4.timeline);
        }
        RecyclerView.AbstractC11843h adapter = parent.getAdapter();
        if (!(adapter instanceof AbstractC5440My)) {
            adapter = null;
        }
        AbstractC5440My<?> abstractC5440My = (AbstractC5440My) adapter;
        if (abstractC5440My == null) {
            return;
        }
        until = RangesKt___RangesKt.until(0, parent.getChildCount());
        Iterator<Integer> it = until.iterator();
        while (it.hasNext() && (childAdapterPosition = parent.getChildAdapterPosition((child = parent.getChildAt((nextInt = ((IntIterator) it).nextInt()))))) != -1) {
            int itemViewType = abstractC5440My.getItemViewType(childAdapterPosition);
            if (itemViewType == C37080Xj4.item_issue_header) {
                Intrinsics.checkNotNullExpressionValue(child, "child");
                m21616f(parent, child, c);
            } else if (itemViewType == C37080Xj4.item_work_order_repair) {
                Intrinsics.checkNotNullExpressionValue(child, "child");
                m21615g(parent, abstractC5440My, child, nextInt, childAdapterPosition, c);
            }
        }
    }
}

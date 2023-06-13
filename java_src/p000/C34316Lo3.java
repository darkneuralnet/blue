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
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"LLo3;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Canvas;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", TransferTable.COLUMN_STATE, "", "onDrawOver", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "getItemOffsets", "Landroid/graphics/drawable/Drawable;", "b", "Landroid/graphics/drawable/Drawable;", "divider", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorOrderDetailsItemDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderDetailsItemDecoration.kt\nco/bird/android/feature/transferorder/operator/details/adapters/OperatorOrderDetailsItemDecoration\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,61:1\n1#2:62\n1549#3:63\n1620#3,3:64\n1855#3,2:67\n*S KotlinDebug\n*F\n+ 1 OperatorOrderDetailsItemDecoration.kt\nco/bird/android/feature/transferorder/operator/details/adapters/OperatorOrderDetailsItemDecoration\n*L\n25#1:63\n25#1:64,3\n26#1:67,2\n*E\n"})
/* renamed from: Lo3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34316Lo3 extends RecyclerView.AbstractC11854o {

    /* renamed from: b */
    public Drawable f22084b;

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C11872z state) {
        boolean z;
        int i;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        Integer m40591a = C41207ft4.m40591a(parent, view);
        if (m40591a != null) {
            int intValue = m40591a.intValue();
            RecyclerView.AbstractC11843h adapter = parent.getAdapter();
            if (adapter != null && adapter.getItemViewType(intValue) == C35442Qj4.item_operator_order_detail) {
                RecyclerView.AbstractC11843h adapter2 = parent.getAdapter();
                boolean z2 = true;
                if (adapter2 != null && adapter2.getItemViewType(intValue - 1) == C35442Qj4.item_operator_order_header) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    outRect.top = (int) C49347td3.m12001b(8);
                }
                RecyclerView.AbstractC11843h adapter3 = parent.getAdapter();
                if (adapter3 != null) {
                    i = adapter3.getItemCount();
                } else {
                    i = 0;
                }
                int i2 = intValue + 1;
                if (i > i2) {
                    RecyclerView.AbstractC11843h adapter4 = parent.getAdapter();
                    if (adapter4 == null || adapter4.getItemViewType(i2) != C35442Qj4.item_operator_order_header) {
                        z2 = false;
                    }
                    if (z2) {
                        outRect.bottom = (int) C49347td3.m12001b(6);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.C11872z state) {
        IntRange until;
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        Drawable drawable = this.f22084b;
        if (drawable == null) {
            drawable = NA0.m94299e(parent.getContext(), C33309Hg4.divider_light_gray);
            this.f22084b = drawable;
            if (drawable == null) {
                return;
            }
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
                if (adapter != null && adapter.getItemViewType(intValue) == C35442Qj4.item_operator_order_header) {
                    int top = (child.getTop() - drawable.getIntrinsicHeight()) + ((int) child.getTranslationY());
                    drawable.setBounds(0, top, parent.getWidth(), drawable.getIntrinsicHeight() + top);
                    drawable.draw(c);
                }
            }
        }
    }
}

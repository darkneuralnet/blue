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
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"Ld42;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Canvas;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", TransferTable.COLUMN_STATE, "", "onDraw", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "getItemOffsets", "Landroid/graphics/drawable/Drawable;", "b", "Landroid/graphics/drawable/Drawable;", "divider", "<init>", "()V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInspectionV3CompleteItemDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectionV3CompleteItemDecoration.kt\nco/bird/android/feature/workorders/v3/dialog/InspectionV3CompleteItemDecoration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,56:1\n1549#2:57\n1620#2,3:58\n288#2,2:61\n*S KotlinDebug\n*F\n+ 1 InspectionV3CompleteItemDecoration.kt\nco/bird/android/feature/workorders/v3/dialog/InspectionV3CompleteItemDecoration\n*L\n27#1:57\n27#1:58,3\n28#1:61,2\n*E\n"})
/* renamed from: d42  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39536d42 extends RecyclerView.AbstractC11854o {

    /* renamed from: b */
    public Drawable f76096b;

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C11872z state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        Integer m40591a = C41207ft4.m40591a(parent, view);
        if (m40591a != null) {
            int intValue = m40591a.intValue();
            RecyclerView.AbstractC11843h adapter = parent.getAdapter();
            if (adapter != null && adapter.getItemViewType(intValue) == C37080Xj4.item_inspection_complete_header) {
                Context context = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "parent.context");
                outRect.top = (int) C49347td3.m12002a(32, context);
                Context context2 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "parent.context");
                outRect.bottom = (int) C49347td3.m12002a(18, context2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x009a A[SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas c, RecyclerView parent, RecyclerView.C11872z state) {
        IntRange until;
        int collectionSizeOrDefault;
        int i;
        int i2;
        boolean z;
        int intValue;
        boolean z2;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        Object obj = null;
        if (this.f76096b == null) {
            Drawable m94299e = NA0.m94299e(parent.getContext(), C33309Hg4.divider_light_gray);
            if (m94299e != null) {
                m94299e.setTint(NA0.m94301c(parent.getContext(), C32364Df4.gray));
            } else {
                m94299e = null;
            }
            this.f76096b = m94299e;
        }
        until = RangesKt___RangesKt.until(0, parent.getChildCount());
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(parent.getChildAt(((IntIterator) it).nextInt()));
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            View child = (View) next;
            Intrinsics.checkNotNullExpressionValue(child, "child");
            Integer m40591a = C41207ft4.m40591a(parent, child);
            if (m40591a != null && (intValue = m40591a.intValue()) > 0) {
                RecyclerView.AbstractC11843h adapter = parent.getAdapter();
                z = true;
                if (adapter != null && adapter.getItemViewType(intValue - 1) == C37080Xj4.item_inspection_complete_header) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    continue;
                    if (z) {
                        obj = next;
                        break;
                    }
                }
            }
            z = false;
            continue;
            if (z) {
            }
        }
        View view = (View) obj;
        if (view != null) {
            int top = view.getTop();
            Drawable drawable = this.f76096b;
            if (drawable != null) {
                i = drawable.getIntrinsicHeight();
            } else {
                i = 0;
            }
            int i3 = top - i;
            int width = parent.getWidth();
            Drawable drawable2 = this.f76096b;
            if (drawable2 != null) {
                i2 = drawable2.getIntrinsicHeight();
            } else {
                i2 = 0;
            }
            int i4 = i2 + i3;
            Drawable drawable3 = this.f76096b;
            if (drawable3 != null) {
                drawable3.setBounds(0, i3, width, i4);
            }
            Drawable drawable4 = this.f76096b;
            if (drawable4 != null) {
                drawable4.draw(c);
            }
        }
    }
}

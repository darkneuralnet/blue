package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, m28432d2 = {"LXy4;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Canvas;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", TransferTable.COLUMN_STATE, "", "onDraw", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "getItemOffsets", "Landroid/graphics/drawable/Drawable;", "b", "Landroid/graphics/drawable/Drawable;", "divider", "<init>", "()V", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairIssueSubtypesItemDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSubtypesItemDecoration.kt\nco/bird/android/feature/repair/v2/subtypes/adapters/RepairIssueSubtypesItemDecoration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n1549#2:53\n1620#2,3:54\n1855#2,2:57\n*S KotlinDebug\n*F\n+ 1 RepairIssueSubtypesItemDecoration.kt\nco/bird/android/feature/repair/v2/subtypes/adapters/RepairIssueSubtypesItemDecoration\n*L\n26#1:53\n26#1:54,3\n27#1:57,2\n*E\n"})
/* renamed from: Xy4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37215Xy4 extends RecyclerView.AbstractC11854o {

    /* renamed from: c */
    public static final C9567a f44340c = new C9567a(null);

    /* renamed from: b */
    public Drawable f44341b;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LXy4$a;", "", "", "SUBTYPE_VERTICAL_SEPARATION_DP", "I", "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Xy4$a */
    /* loaded from: classes3.dex */
    public static final class C9567a {
        public /* synthetic */ C9567a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C9567a() {
        }
    }

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
            if (adapter != null && adapter.getItemViewType(intValue) == C32634Ej4.item_repair_v2_subtype) {
                Context context = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "parent.context");
                outRect.top = (int) C49347td3.m12002a(32, context);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void onDraw(Canvas c, RecyclerView parent, RecyclerView.C11872z state) {
        IntRange until;
        int collectionSizeOrDefault;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.f44341b == null) {
            this.f44341b = NA0.m94299e(parent.getContext(), C33309Hg4.divider_light_gray);
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
                if (adapter != null && adapter.getItemViewType(intValue) == C32634Ej4.item_repair_v2_subtype) {
                    int left = parent.getLeft();
                    int top = child.getTop();
                    Context context = parent.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "parent.context");
                    int m12002a = top - (((int) C49347td3.m12002a(32, context)) / 2);
                    Drawable drawable = this.f44341b;
                    if (drawable != null) {
                        i = drawable.getIntrinsicHeight();
                    } else {
                        i = 0;
                    }
                    int i3 = m12002a + i;
                    int right = parent.getRight();
                    Drawable drawable2 = this.f44341b;
                    if (drawable2 != null) {
                        i2 = drawable2.getIntrinsicHeight();
                    } else {
                        i2 = 0;
                    }
                    int i4 = i2 + i3;
                    Drawable drawable3 = this.f44341b;
                    if (drawable3 != null) {
                        drawable3.setBounds(left, i3, right, i4);
                    }
                    Drawable drawable4 = this.f44341b;
                    if (drawable4 != null) {
                        drawable4.draw(c);
                    }
                }
            }
        }
    }
}

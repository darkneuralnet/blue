package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
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
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, m28432d2 = {"Lol3;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Canvas;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", TransferTable.COLUMN_STATE, "", "onDrawOver", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "getItemOffsets", "Landroid/graphics/Paint;", "b", "Landroid/graphics/Paint;", "paint", "<init>", "()V", C17296a.f69688o, "filters_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorFilterV2ItemDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorFilterV2ItemDecoration.kt\nco/bird/android/feature/filters/operator/v2/adapters/OperatorFilterV2ItemDecoration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n1549#2:67\n1620#2,3:68\n1855#2,2:71\n*S KotlinDebug\n*F\n+ 1 OperatorFilterV2ItemDecoration.kt\nco/bird/android/feature/filters/operator/v2/adapters/OperatorFilterV2ItemDecoration\n*L\n33#1:67\n33#1:68,3\n34#1:71,2\n*E\n"})
/* renamed from: ol3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46463ol3 extends RecyclerView.AbstractC11854o {

    /* renamed from: c */
    public static final C27055a f102436c = new C27055a(null);

    /* renamed from: b */
    public final Paint f102437b;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\f"}, m28432d2 = {"Lol3$a;", "", "", "DIVIDER_STROKE_WIDTH_DP", "F", "", "MULTI_SELECT_TOP_MARGIN_DP", "I", "RANGE_SELECT_TOP_MARGIN_DP", "TITLE_TOP_MARGIN_DP", "<init>", "()V", "filters_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: ol3$a */
    /* loaded from: classes3.dex */
    public static final class C27055a {
        public /* synthetic */ C27055a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C27055a() {
        }
    }

    public C46463ol3() {
        Paint paint = new Paint();
        paint.setStrokeWidth(C49347td3.m12001b(Float.valueOf(0.5f)));
        paint.setStrokeCap(Paint.Cap.SQUARE);
        this.f102437b = paint;
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
            if (adapter != null) {
                int itemViewType = adapter.getItemViewType(intValue);
                if (itemViewType == C37539Zi4.item_operator_filter_title) {
                    outRect.top = (int) C49347td3.m12001b(24);
                } else if (itemViewType == C37539Zi4.item_operator_multi_select_filter) {
                    outRect.top = (int) C49347td3.m12001b(8);
                } else if (itemViewType == C37539Zi4.item_operator_range_select_filter) {
                    outRect.top = (int) C49347td3.m12001b(4);
                }
                if (intValue == 0) {
                    outRect.top = 0;
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
        this.f102437b.setColor(NA0.m94301c(parent.getContext(), C32364Df4.birdGray));
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
                if (adapter != null && adapter.getItemViewType(intValue) == C37539Zi4.item_operator_filter_title && intValue != 0) {
                    float top = child.getTop() + child.getTranslationY();
                    c.drawLine(0.0f, top, parent.getWidth(), top, this.f102437b);
                }
            }
        }
    }
}

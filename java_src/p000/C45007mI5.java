package p000;

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
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, m28432d2 = {"LmI5;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Canvas;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", TransferTable.COLUMN_STATE, "", "onDrawOver", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "getItemOffsets", "Landroid/graphics/drawable/Drawable;", "b", "Landroid/graphics/drawable/Drawable;", "divider", "<init>", "()V", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSmartlockItemDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartlockItemDecoration.kt\nco/bird/android/app/feature/physicallock/smartlock/adapter/SmartlockItemDecoration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n1549#2:77\n1620#2,3:78\n1855#2,2:81\n*S KotlinDebug\n*F\n+ 1 SmartlockItemDecoration.kt\nco/bird/android/app/feature/physicallock/smartlock/adapter/SmartlockItemDecoration\n*L\n28#1:77\n28#1:78,3\n29#1:81,2\n*E\n"})
/* renamed from: mI5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C45007mI5 extends RecyclerView.AbstractC11854o {

    /* renamed from: c */
    public static final C26040a f97803c = new C26040a(null);

    /* renamed from: d */
    public static final int f97804d = 8;

    /* renamed from: b */
    public Drawable f97805b;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LmI5$a;", "", "", "MARGIN_SCALE_FACTOR", "F", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: mI5$a */
    /* loaded from: classes2.dex */
    public static final class C26040a {
        public /* synthetic */ C26040a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C26040a() {
        }
    }

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
                if (adapter.getItemViewType(intValue) == C39311cj4.item_operator_smartlock_unlock) {
                    outRect.left = (int) C49347td3.m12001b(8);
                    outRect.right = (int) C49347td3.m12001b(8);
                }
                if (intValue != 0) {
                    if (intValue != 1) {
                        outRect.top = (int) C49347td3.m12001b(12);
                    } else {
                        outRect.top = (int) C49347td3.m12001b(16);
                    }
                }
                RecyclerView.AbstractC11843h adapter2 = parent.getAdapter();
                if (adapter2 != null) {
                    i = adapter2.getItemCount();
                } else {
                    i = 0;
                }
                if (intValue == i - 1) {
                    outRect.bottom = (int) C49347td3.m12001b(16);
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
        int roundToInt;
        int roundToInt2;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.f97805b == null) {
            this.f97805b = NA0.m94299e(parent.getContext(), C33309Hg4.divider_light_gray);
        }
        until = RangesKt___RangesKt.until(0, parent.getChildCount());
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
        ArrayList<Pair> arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            int nextInt = ((IntIterator) it).nextInt();
            arrayList.add(TuplesKt.m28425to(Integer.valueOf(nextInt), parent.getChildAt(nextInt)));
        }
        for (Pair pair : arrayList) {
            int intValue = ((Number) pair.component1()).intValue();
            View view = (View) pair.component2();
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            int i3 = -1;
            if (childAdapterPosition == -1) {
                return;
            }
            RecyclerView.AbstractC11843h adapter = parent.getAdapter();
            if (adapter != null) {
                i3 = adapter.getItemViewType(childAdapterPosition);
            }
            if (i3 == C39311cj4.item_operator_smartlock_unlock_header) {
                int dimensionPixelSize = parent.getContext().getResources().getDimensionPixelSize(C37044Xf4.activity_horizontal_margin);
                int bottom = view.getBottom();
                int width = parent.getWidth() - dimensionPixelSize;
                Drawable drawable = this.f97805b;
                if (drawable != null) {
                    i = drawable.getIntrinsicHeight();
                } else {
                    i = 0;
                }
                int i4 = i + bottom;
                Drawable drawable2 = this.f97805b;
                if (drawable2 != null) {
                    drawable2.setBounds(dimensionPixelSize, bottom, width, i4);
                }
                Drawable drawable3 = this.f97805b;
                if (drawable3 != null) {
                    drawable3.draw(c);
                }
            } else if (i3 == C39311cj4.item_operator_smartlock_unlock && intValue < parent.getChildCount() - 1) {
                float dimensionPixelSize2 = parent.getContext().getResources().getDimensionPixelSize(C37044Xf4.activity_horizontal_margin) * 1.25f;
                int bottom2 = view.getBottom();
                float width2 = parent.getWidth() - dimensionPixelSize2;
                Drawable drawable4 = this.f97805b;
                if (drawable4 != null) {
                    i2 = drawable4.getIntrinsicHeight();
                } else {
                    i2 = 0;
                }
                int i5 = i2 + bottom2;
                Drawable drawable5 = this.f97805b;
                if (drawable5 != null) {
                    roundToInt = MathKt__MathJVMKt.roundToInt(dimensionPixelSize2);
                    roundToInt2 = MathKt__MathJVMKt.roundToInt(width2);
                    drawable5.setBounds(roundToInt, bottom2, roundToInt2, i5);
                }
                Drawable drawable6 = this.f97805b;
                if (drawable6 != null) {
                    drawable6.draw(c);
                }
            }
        }
    }
}

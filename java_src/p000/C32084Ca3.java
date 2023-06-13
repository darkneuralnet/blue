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
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"LCa3;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Canvas;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", TransferTable.COLUMN_STATE, "", "onDrawOver", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "getItemOffsets", "Landroid/graphics/drawable/Drawable;", "b", "Landroid/graphics/drawable/Drawable;", "divider", "<init>", "()V", "notification-center_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNotificationCenterItemDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationCenterItemDecoration.kt\nco/bird/android/feature/notificationcenter/fragment/adapters/NotificationCenterItemDecoration\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,75:1\n1#2:76\n86#3:77\n1549#4:78\n1620#4,3:79\n1855#4,2:82\n*S KotlinDebug\n*F\n+ 1 NotificationCenterItemDecoration.kt\nco/bird/android/feature/notificationcenter/fragment/adapters/NotificationCenterItemDecoration\n*L\n22#1:77\n22#1:78\n22#1:79,3\n23#1:82,2\n*E\n"})
/* renamed from: Ca3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32084Ca3 extends RecyclerView.AbstractC11854o {

    /* renamed from: b */
    public Drawable f4259b;

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C11872z state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        Integer m40591a = C41207ft4.m40591a(parent, view);
        if (m40591a != null) {
            int intValue = m40591a.intValue();
            RecyclerView.AbstractC11843h adapter = parent.getAdapter();
            if (adapter != null) {
                int itemViewType = adapter.getItemViewType(intValue);
                if (itemViewType == C48815sj4.item_date_header) {
                    outRect.top = (int) C49347td3.m12001b(16);
                } else if (itemViewType == C48815sj4.item_notification) {
                    outRect.top = (int) C49347td3.m12001b(16);
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
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        Drawable drawable = this.f4259b;
        if (drawable == null) {
            drawable = NA0.m94299e(parent.getContext(), C34713Ng4.notification_divider);
            this.f4259b = drawable;
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
                if (adapter != null) {
                    int itemViewType = adapter.getItemViewType(intValue);
                    if (intValue != 0) {
                        if (itemViewType == C48815sj4.item_date_header) {
                            int top = (child.getTop() - ((int) C49347td3.m12001b(16))) + ((int) child.getTranslationY());
                            if (drawable != null) {
                                i2 = drawable.getIntrinsicHeight();
                            } else {
                                i2 = 0;
                            }
                            int i3 = i2 + top;
                            int m12001b = (int) C49347td3.m12001b(24);
                            if (drawable != null) {
                                drawable.setBounds(0, top, m12001b, i3);
                            }
                        } else if (itemViewType == C48815sj4.item_notification) {
                            int m12001b2 = (int) C49347td3.m12001b(24);
                            int bottom = child.getBottom() + ((int) C49347td3.m12001b(16)) + ((int) child.getTranslationY());
                            if (drawable != null) {
                                i = drawable.getIntrinsicHeight();
                            } else {
                                i = 0;
                            }
                            int i4 = i + bottom;
                            int right = parent.getRight();
                            if (drawable != null) {
                                drawable.setBounds(m12001b2, bottom, right, i4);
                            }
                        }
                        if (drawable != null) {
                            drawable.draw(c);
                        }
                    }
                }
            }
        }
        super.onDrawOver(c, parent, state);
    }
}

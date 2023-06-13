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
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0018"}, m28432d2 = {"LL76;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Canvas;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", TransferTable.COLUMN_STATE, "", "onDrawOver", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "getItemOffsets", "Landroid/graphics/drawable/Drawable;", "b", "Landroid/graphics/drawable/Drawable;", "divider", "", "I", "horizontalMargin", "<init>", "()V", "co.bird.android.feature.self-serve-payment"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransactionReceiptDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionReceiptDecoration.kt\nco/bird/android/feature/selfservepayment/receipt/adapter/TransactionReceiptDecoration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,61:1\n1549#2:62\n1620#2,3:63\n1855#2,2:66\n*S KotlinDebug\n*F\n+ 1 TransactionReceiptDecoration.kt\nco/bird/android/feature/selfservepayment/receipt/adapter/TransactionReceiptDecoration\n*L\n24#1:62\n24#1:63,3\n25#1:66,2\n*E\n"})
/* renamed from: L76 */
/* loaded from: classes3.dex */
public final class L76 extends RecyclerView.AbstractC11854o {

    /* renamed from: b */
    public Drawable f20789b;

    /* renamed from: c */
    public int f20790c;

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C11872z state) {
        RecyclerView.AbstractC11843h adapter;
        int i;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        RecyclerView.AbstractC11843h adapter2 = parent.getAdapter();
        boolean z = false;
        if (adapter2 != null && Integer.valueOf(adapter2.getItemCount()).equals(Integer.valueOf(childAdapterPosition + 1))) {
            z = true;
        }
        if (childAdapterPosition != -1 && (adapter = parent.getAdapter()) != null && adapter.getItemViewType(childAdapterPosition) == C34506Mj4.item_transaction_receipt_item) {
            if (z) {
                i = 20;
            } else {
                i = 16;
            }
            Integer valueOf = Integer.valueOf(i);
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "parent.context");
            outRect.top = (int) C49347td3.m12002a(valueOf, context);
            Integer valueOf2 = Integer.valueOf(i);
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "parent.context");
            outRect.bottom = (int) C49347td3.m12002a(valueOf2, context2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0079, code lost:
        if (java.lang.Integer.valueOf(r3.getItemCount()).equals(java.lang.Integer.valueOf(r2 + 1)) == true) goto L16;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.C11872z state) {
        IntRange until;
        int collectionSizeOrDefault;
        boolean z;
        Integer num;
        int i;
        int roundToInt;
        int i2;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.f20789b == null) {
            this.f20789b = NA0.m94299e(parent.getContext(), C33309Hg4.divider_light_gray);
        }
        until = RangesKt___RangesKt.until(0, parent.getChildCount());
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
        ArrayList<View> arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(parent.getChildAt(((IntIterator) it).nextInt()));
        }
        for (View view : arrayList) {
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            RecyclerView.AbstractC11843h adapter = parent.getAdapter();
            if (adapter != null) {
                z = true;
            }
            z = false;
            if (childAdapterPosition != -1) {
                RecyclerView.AbstractC11843h adapter2 = parent.getAdapter();
                if (adapter2 != null) {
                    num = Integer.valueOf(adapter2.getItemViewType(childAdapterPosition));
                } else {
                    num = null;
                }
                int i3 = C34506Mj4.item_transaction_receipt_item;
                if (num != null && num.intValue() == i3) {
                    int i4 = this.f20790c;
                    int right = parent.getRight();
                    if (z) {
                        i = 20;
                    } else {
                        i = 16;
                    }
                    int top = view.getTop();
                    Integer valueOf = Integer.valueOf(i);
                    Context context = parent.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "parent.context");
                    roundToInt = MathKt__MathJVMKt.roundToInt(C49347td3.m12002a(valueOf, context));
                    int i5 = top - roundToInt;
                    Drawable drawable = this.f20789b;
                    if (drawable != null) {
                        i2 = drawable.getIntrinsicHeight();
                    } else {
                        i2 = 0;
                    }
                    int i6 = i5 - i2;
                    Drawable drawable2 = this.f20789b;
                    if (drawable2 != null) {
                        drawable2.setBounds(i4, i6, right, i5);
                    }
                    Drawable drawable3 = this.f20789b;
                    if (drawable3 != null) {
                        drawable3.draw(c);
                    }
                }
            }
        }
    }
}

package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
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
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u001a"}, m28432d2 = {"LOn5;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Canvas;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", TransferTable.COLUMN_STATE, "", "onDrawOver", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "getItemOffsets", "Landroid/graphics/drawable/Drawable;", "b", "Landroid/graphics/drawable/Drawable;", "divider", "", "I", "horizontalMargin", DateTokenConverter.CONVERTER_KEY, "verticalMargin", "<init>", "()V", "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScrapItemDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapItemDecoration.kt\nco/bird/android/feature/scrap/adapters/ScrapItemDecoration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,69:1\n1549#2:70\n1620#2,3:71\n1855#2,2:74\n*S KotlinDebug\n*F\n+ 1 ScrapItemDecoration.kt\nco/bird/android/feature/scrap/adapters/ScrapItemDecoration\n*L\n26#1:70\n26#1:71,3\n27#1:74,2\n*E\n"})
/* renamed from: On5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35011On5 extends RecyclerView.AbstractC11854o {

    /* renamed from: b */
    public Drawable f27329b;

    /* renamed from: c */
    public int f27330c;

    /* renamed from: d */
    public int f27331d;

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C11872z state) {
        RecyclerView.AbstractC11843h adapter;
        int i;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.f27331d == 0) {
            this.f27331d = parent.getContext().getResources().getDimensionPixelSize(C37044Xf4.activity_vertical_margin);
        }
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (childAdapterPosition != -1 && (adapter = parent.getAdapter()) != null) {
            if (adapter.getItemViewType(childAdapterPosition) == C45268mk4.item_scrap_rejection) {
                Context context = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "parent.context");
                outRect.top = (int) C49347td3.m12002a(48, context);
                Context context2 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "parent.context");
                outRect.bottom = (int) C49347td3.m12002a(40, context2);
            }
            RecyclerView.AbstractC11843h adapter2 = parent.getAdapter();
            if (adapter2 != null) {
                i = adapter2.getItemCount();
            } else {
                i = 0;
            }
            if (childAdapterPosition == i - 1) {
                outRect.bottom = this.f27331d;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.C11872z state) {
        IntRange until;
        int collectionSizeOrDefault;
        boolean z;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.f27329b == null) {
            this.f27329b = NA0.m94299e(parent.getContext(), C33309Hg4.divider_light_gray);
            this.f27330c = parent.getContext().getResources().getDimensionPixelSize(C37044Xf4.activity_horizontal_margin);
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
            if (adapter != null && adapter.getItemViewType(childAdapterPosition) == C45268mk4.item_scrap_rejection) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i3 = this.f27330c;
                int top = view.getTop();
                Resources resources = parent.getContext().getResources();
                int i4 = C37044Xf4.activity_vertical_margin;
                int dimensionPixelSize = top - resources.getDimensionPixelSize(i4);
                Drawable drawable = this.f27329b;
                if (drawable != null) {
                    i = drawable.getIntrinsicHeight();
                } else {
                    i = 0;
                }
                int i5 = dimensionPixelSize - i;
                int right = parent.getRight() - this.f27330c;
                Drawable drawable2 = this.f27329b;
                if (drawable2 != null) {
                    drawable2.setBounds(i3, i5, right, dimensionPixelSize);
                }
                Drawable drawable3 = this.f27329b;
                if (drawable3 != null) {
                    drawable3.draw(c);
                }
                int bottom = view.getBottom() + parent.getContext().getResources().getDimensionPixelSize(i4);
                Drawable drawable4 = this.f27329b;
                if (drawable4 != null) {
                    i2 = drawable4.getIntrinsicHeight();
                } else {
                    i2 = 0;
                }
                int i6 = bottom - i2;
                Drawable drawable5 = this.f27329b;
                if (drawable5 != null) {
                    drawable5.setBounds(i3, i6, right, bottom);
                }
                Drawable drawable6 = this.f27329b;
                if (drawable6 != null) {
                    drawable6.draw(c);
                }
            }
        }
    }
}

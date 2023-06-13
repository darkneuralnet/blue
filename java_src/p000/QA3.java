package p000;

import android.graphics.Canvas;
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
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m28432d2 = {"LQA3;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Canvas;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", TransferTable.COLUMN_STATE, "", "onDrawOver", "Landroid/graphics/drawable/Drawable;", "b", "Landroid/graphics/drawable/Drawable;", "divider", "<init>", "()V", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOwnedBirdDetailsItemDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OwnedBirdDetailsItemDecoration.kt\nco/bird/android/feature/ownedbirds/adapters/OwnedBirdDetailsItemDecoration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,40:1\n1549#2:41\n1620#2,3:42\n1855#2,2:45\n*S KotlinDebug\n*F\n+ 1 OwnedBirdDetailsItemDecoration.kt\nco/bird/android/feature/ownedbirds/adapters/OwnedBirdDetailsItemDecoration\n*L\n22#1:41\n22#1:42,3\n23#1:45,2\n*E\n"})
/* renamed from: QA3 */
/* loaded from: classes3.dex */
public final class QA3 extends RecyclerView.AbstractC11854o {

    /* renamed from: b */
    public Drawable f29939b;

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.C11872z state) {
        IntRange until;
        int collectionSizeOrDefault;
        int i;
        Drawable drawable;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.f29939b == null) {
            Drawable m94299e = NA0.m94299e(parent.getContext(), C33309Hg4.divider_light_gray);
            if (m94299e != null && (drawable = m94299e.mutate()) != null) {
                drawable.setTint(NA0.m94301c(parent.getContext(), C32364Df4.birdCharcoal));
            } else {
                drawable = null;
            }
            this.f29939b = drawable;
        }
        until = RangesKt___RangesKt.until(0, parent.getChildCount() - 1);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
        ArrayList<View> arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(parent.getChildAt(((IntIterator) it).nextInt()));
        }
        for (View view : arrayList) {
            int left = parent.getLeft();
            int bottom = view.getBottom();
            int right = parent.getRight();
            Drawable drawable2 = this.f29939b;
            if (drawable2 != null) {
                i = drawable2.getIntrinsicHeight();
            } else {
                i = 0;
            }
            int i2 = i + bottom;
            Drawable drawable3 = this.f29939b;
            if (drawable3 != null) {
                drawable3.setBounds(left, bottom, right, i2);
            }
            Drawable drawable4 = this.f29939b;
            if (drawable4 != null) {
                drawable4.draw(c);
            }
        }
    }
}

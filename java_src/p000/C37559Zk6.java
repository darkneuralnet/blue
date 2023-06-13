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
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, m28432d2 = {"LZk6;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Canvas;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", TransferTable.COLUMN_STATE, "", "onDrawOver", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "getItemOffsets", "Landroid/graphics/drawable/Drawable;", "b", "Landroid/graphics/drawable/Drawable;", "divider", "<init>", "()V", C17296a.f69688o, "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVehicleDetailsItemDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleDetailsItemDecoration.kt\nco/bird/android/feature/commandcenter/vehicledetails/adapters/VehicleDetailsItemDecoration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n1549#2:64\n1620#2,3:65\n1855#2,2:68\n*S KotlinDebug\n*F\n+ 1 VehicleDetailsItemDecoration.kt\nco/bird/android/feature/commandcenter/vehicledetails/adapters/VehicleDetailsItemDecoration\n*L\n30#1:64\n30#1:65,3\n31#1:68,2\n*E\n"})
/* renamed from: Zk6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37559Zk6 extends RecyclerView.AbstractC11854o {

    /* renamed from: c */
    public static final C10367a f49182c = new C10367a(null);

    /* renamed from: d */
    public static final Set<Integer> f49183d;

    /* renamed from: b */
    public Drawable f49184b;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m28432d2 = {"LZk6$a;", "", "", "", "BUTTON_LAYOUT_IDS", "Ljava/util/Set;", "<init>", "()V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Zk6$a */
    /* loaded from: classes3.dex */
    public static final class C10367a {
        public /* synthetic */ C10367a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C10367a() {
        }
    }

    static {
        Set<Integer> of;
        of = SetsKt__SetsKt.setOf((Object[]) new Integer[]{Integer.valueOf(C45268mk4.item_button), Integer.valueOf(C45268mk4.item_button_secondary), Integer.valueOf(C45268mk4.item_button_matte_black)});
        f49183d = of;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C11872z state) {
        RecyclerView.AbstractC11843h adapter;
        int i;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (childAdapterPosition != -1 && (adapter = parent.getAdapter()) != null) {
            int itemViewType = adapter.getItemViewType(childAdapterPosition);
            RecyclerView.AbstractC11843h adapter2 = parent.getAdapter();
            if (adapter2 != null) {
                i = adapter2.getItemCount();
            } else {
                i = 0;
            }
            if (childAdapterPosition == i - 1) {
                outRect.bottom = parent.getContext().getResources().getDimensionPixelSize(C37044Xf4.activity_vertical_margin_small);
            }
            if (f49183d.contains(Integer.valueOf(itemViewType))) {
                outRect.top = parent.getContext().getResources().getDimensionPixelSize(C37044Xf4.command_center_button_top_margin);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.C11872z state) {
        IntRange until;
        int collectionSizeOrDefault;
        int i;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.f49184b == null) {
            this.f49184b = NA0.m94299e(parent.getContext(), C33309Hg4.divider_light_gray);
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
            int i2 = -1;
            if (childAdapterPosition == -1) {
                return;
            }
            RecyclerView.AbstractC11843h adapter = parent.getAdapter();
            if (adapter != null) {
                i2 = adapter.getItemViewType(childAdapterPosition);
            }
            if (i2 == C52372yj4.item_work_order_issue_header) {
                int dimensionPixelSize = parent.getContext().getResources().getDimensionPixelSize(C37044Xf4.activity_horizontal_margin);
                int bottom = view.getBottom();
                int width = parent.getWidth() - dimensionPixelSize;
                Drawable drawable = this.f49184b;
                if (drawable != null) {
                    i = drawable.getIntrinsicHeight();
                } else {
                    i = 0;
                }
                int i3 = i + bottom;
                Drawable drawable2 = this.f49184b;
                if (drawable2 != null) {
                    drawable2.setBounds(dimensionPixelSize, bottom, width, i3);
                }
                Drawable drawable3 = this.f49184b;
                if (drawable3 != null) {
                    drawable3.draw(c);
                }
            }
        }
    }
}

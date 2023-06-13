package p000;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e¨\u0006\u0016"}, m28432d2 = {"LQW5;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", TransferTable.COLUMN_STATE, "", "getItemOffsets", "", "b", "I", "bottomEdge", "c", "edgeMargin", DateTokenConverter.CONVERTER_KEY, "verticalSpace", "<init>", "()V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSwipeQualityControlItemDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeQualityControlItemDecoration.kt\nco/bird/android/qualitycontrol/swipe/adapters/SwipeQualityControlItemDecoration\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
/* renamed from: QW5 */
/* loaded from: classes4.dex */
public final class QW5 extends RecyclerView.AbstractC11854o {

    /* renamed from: b */
    public int f30465b;

    /* renamed from: c */
    public int f30466c;

    /* renamed from: d */
    public int f30467d;

    /* renamed from: g */
    public static final void m88441g(RecyclerView parent) {
        Intrinsics.checkNotNullParameter(parent, "$parent");
        parent.invalidateItemDecorations();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void getItemOffsets(Rect outRect, View view, final RecyclerView parent, RecyclerView.C11872z state) {
        boolean z;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.f30466c == 0) {
            this.f30466c = parent.getContext().getResources().getDimensionPixelSize(C37044Xf4.quality_control_card_margin);
            this.f30465b = parent.getContext().getResources().getDimensionPixelSize(C37044Xf4.quality_control_button_size) + parent.getContext().getResources().getDimensionPixelSize(C37044Xf4.activity_vertical_margin_large);
        }
        Integer valueOf = Integer.valueOf(parent.getChildAdapterPosition(view));
        int i = 0;
        if (valueOf.intValue() != -1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            if (view.getMeasuredHeight() == 0) {
                view.post(new Runnable() { // from class: PW5
                    @Override // java.lang.Runnable
                    public final void run() {
                        QW5.m88441g(RecyclerView.this);
                    }
                });
                return;
            }
            int i2 = this.f30467d;
            if (i2 == 0 || i2 < 0) {
                this.f30467d = (parent.getHeight() - view.getMeasuredHeight()) - this.f30465b;
            }
            int i3 = this.f30467d;
            if (i3 > 0) {
                outRect.top = i3 / 2;
            }
            if (intValue == 0) {
                outRect.left = this.f30466c;
                return;
            }
            RecyclerView.AbstractC11843h adapter = parent.getAdapter();
            if (adapter != null) {
                i = adapter.getItemCount();
            }
            if (intValue == i - 1) {
                outRect.right = this.f30466c;
            }
        }
    }
}

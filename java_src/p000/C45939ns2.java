package p000;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014"}, m28432d2 = {"Lns2;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", TransferTable.COLUMN_STATE, "", "getItemOffsets", "", "b", "I", "activityVerticalMargin", "<init>", "()V", "c", C17296a.f69688o, "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ns2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C45939ns2 extends RecyclerView.AbstractC11854o {

    /* renamed from: c */
    public static final C26733a f100953c = new C26733a(null);

    /* renamed from: b */
    public int f100954b;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lns2$a;", "", "", "BUTTON_TOP_MARGIN_DP", "I", "INSPECTION_CARD_TOP_MARGIN_DP", "<init>", "()V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: ns2$a */
    /* loaded from: classes4.dex */
    public static final class C26733a {
        public /* synthetic */ C26733a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C26733a() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C11872z state) {
        Integer num;
        boolean z;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.f100954b == 0) {
            this.f100954b = parent.getContext().getResources().getDimensionPixelSize(C37044Xf4.activity_vertical_margin);
        }
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        RecyclerView.AbstractC11843h adapter = parent.getAdapter();
        if (adapter != null) {
            num = Integer.valueOf(adapter.getItemViewType(childAdapterPosition));
        } else {
            num = null;
        }
        int i = C43489jk4.item_inspection_list_card;
        int i2 = 0;
        if (num != null && num.intValue() == i) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "parent.context");
            outRect.top = (int) C49347td3.m12002a(12, context);
        } else {
            int i3 = C45268mk4.item_button_secondary;
            if (num == null || num.intValue() != i3) {
                int i4 = C45268mk4.item_button_matte_black;
                if (num == null || num.intValue() != i4) {
                    z = false;
                    if (z) {
                        Context context2 = parent.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "parent.context");
                        outRect.top = (int) C49347td3.m12002a(12, context2);
                    }
                }
            }
            z = true;
            if (z) {
            }
        }
        if (childAdapterPosition == 0) {
            outRect.top = this.f100954b;
            return;
        }
        RecyclerView.AbstractC11843h adapter2 = parent.getAdapter();
        if (adapter2 != null) {
            i2 = adapter2.getItemCount();
        }
        if (childAdapterPosition == i2 - 1) {
            outRect.bottom = this.f100954b;
        }
    }
}

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
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0010"}, m28432d2 = {"LWD6;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", TransferTable.COLUMN_STATE, "", "getItemOffsets", "<init>", "()V", "b", C17296a.f69688o, "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: WD6 */
/* loaded from: classes3.dex */
public final class WD6 extends RecyclerView.AbstractC11854o {

    /* renamed from: b */
    public static final C8958a f40588b = new C8958a(null);

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, m28432d2 = {"LWD6$a;", "", "", "FIRST_ITEM_TOP_MARGIN_DP", "I", "INSTRUCTION_BOTTOM_MARGIN_DP", "INSTRUCTION_TOP_MARGIN_DP", "LAST_ITEM_BOTTOM_MARGIN_DP", "<init>", "()V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: WD6$a */
    /* loaded from: classes3.dex */
    public static final class C8958a {
        public /* synthetic */ C8958a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C8958a() {
        }
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
            if (adapter.getItemViewType(childAdapterPosition) == C37080Xj4.item_inspection_complete_instructions) {
                Context context = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "parent.context");
                outRect.top = (int) C49347td3.m12002a(40, context);
                Context context2 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "parent.context");
                outRect.bottom = (int) C49347td3.m12002a(20, context2);
            }
            if (childAdapterPosition == 0) {
                Context context3 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "parent.context");
                outRect.top = (int) C49347td3.m12002a(48, context3);
                return;
            }
            RecyclerView.AbstractC11843h adapter2 = parent.getAdapter();
            if (adapter2 != null) {
                i = adapter2.getItemCount();
            } else {
                i = 0;
            }
            if (childAdapterPosition == i - 1) {
                Context context4 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "parent.context");
                C49347td3.m12002a(48, context4);
            }
        }
    }
}

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
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0010"}, m28432d2 = {"LRz4;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", TransferTable.COLUMN_STATE, "", "getItemOffsets", "<init>", "()V", "b", C17296a.f69688o, "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Rz4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35820Rz4 extends RecyclerView.AbstractC11854o {

    /* renamed from: b */
    public static final C7304a f32984b = new C7304a(null);

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LRz4$a;", "", "", "SUPERTYPE_VERTICAL_SEPARATION_DP", "I", "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Rz4$a */
    /* loaded from: classes3.dex */
    public static final class C7304a {
        public /* synthetic */ C7304a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C7304a() {
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
                int itemViewType = adapter.getItemViewType(intValue);
                Context context = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "parent.context");
                int m41774h = C40788fB0.m41774h(context, C37044Xf4.activity_horizontal_margin);
                outRect.left = m41774h;
                outRect.right = m41774h;
                if (itemViewType == C32634Ej4.item_repair_v2_supertype_card) {
                    Context context2 = parent.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "parent.context");
                    outRect.top = (int) C49347td3.m12002a(16, context2);
                }
                RecyclerView.AbstractC11843h adapter2 = parent.getAdapter();
                if (adapter2 != null) {
                    i = adapter2.getItemCount();
                } else {
                    i = 0;
                }
                if (intValue == i - 1) {
                    Context context3 = parent.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "parent.context");
                    outRect.bottom = C40788fB0.m41774h(context3, C37044Xf4.activity_vertical_margin);
                }
            }
        }
    }
}

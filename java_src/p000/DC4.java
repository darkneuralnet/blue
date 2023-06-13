package p000;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"LDC4;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", TransferTable.COLUMN_STATE, "", "getItemOffsets", "", "b", "Ljava/lang/Integer;", "verticalMargin", "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: DC4 */
/* loaded from: classes3.dex */
public final class DC4 extends RecyclerView.AbstractC11854o {

    /* renamed from: b */
    public Integer f5383b;

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C11872z state) {
        int i;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.f5383b == null) {
            this.f5383b = Integer.valueOf(parent.getContext().getResources().getDimensionPixelSize(C37044Xf4.activity_vertical_margin));
        }
        if (parent.getChildAdapterPosition(view) == 0) {
            Context context = parent.getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
            int bottom = ((EditText) ((Activity) context).findViewById(C35658Rh4.search)).getBottom();
            Integer num = this.f5383b;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            outRect.top = bottom + i;
        }
    }
}

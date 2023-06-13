package zendesk.support.request;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import zendesk.support.request.CellType;
/* loaded from: classes8.dex */
class CellMarginDecorator extends RecyclerView.AbstractC11854o {
    public static final int CELL = 1;
    public static final int CELL_LAST = 16;
    public static final int CELL_START_BLOCK = 2;
    public static final int CELL_WITH_LABEL = 8;
    private final ComponentRequestAdapter dataSource;
    private final int groupVerticalMargin;
    private final int verticalMargin;

    public CellMarginDecorator(ComponentRequestAdapter componentRequestAdapter, Context context) {
        this.dataSource = componentRequestAdapter;
        this.verticalMargin = context.getResources().getDimensionPixelOffset(C35640Rf4.zs_request_message_margin_vertical);
        this.groupVerticalMargin = context.getResources().getDimensionPixelOffset(C35640Rf4.zs_request_message_group_margin_vertical);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C11872z c11872z) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        CellType.Base messageForPos = this.dataSource.getMessageForPos(childAdapterPosition);
        int positionType = messageForPos.getPositionType();
        Rect insets = messageForPos.getInsets();
        if ((positionType & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        if ((positionType & 8) == 8) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((positionType & 16) == 16) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((positionType & 1) == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        int i2 = -insets.left;
        int i3 = -insets.top;
        int i4 = -insets.right;
        int i5 = -insets.bottom;
        if (z && z2) {
            i = this.groupVerticalMargin;
        } else {
            if (z) {
                i3 += this.groupVerticalMargin;
                i = this.verticalMargin;
            } else if (z2) {
                i3 += this.verticalMargin;
                i = this.groupVerticalMargin;
            } else if (z4) {
                i = this.verticalMargin;
            } else {
                C33694Ix2.m101457b("RequestActivity", "Unknown position type: %s", Integer.valueOf(positionType));
                if (z3) {
                    i5 = -insets.bottom;
                }
                rect.set(i2, i3, i4, i5);
            }
            i5 += i;
            if (z3) {
            }
            rect.set(i2, i3, i4, i5);
        }
        i3 += i;
        i5 += i;
        if (z3) {
        }
        rect.set(i2, i3, i4, i5);
    }

    public CellMarginDecorator(ComponentRequestAdapter componentRequestAdapter, int i, int i2) {
        this.dataSource = componentRequestAdapter;
        this.verticalMargin = i;
        this.groupVerticalMargin = i2;
    }
}

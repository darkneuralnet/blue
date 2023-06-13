package zendesk.messaging.p061ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import zendesk.messaging.R$attr;
import zendesk.messaging.R$color;
import zendesk.messaging.R$dimen;
import zendesk.messaging.R$drawable;
/* renamed from: zendesk.messaging.ui.ResponseOptionView */
/* loaded from: classes8.dex */
public class ResponseOptionView extends AppCompatTextView {
    public ResponseOptionView(Context context) {
        super(context);
        init();
    }

    private void init() {
        setBackgroundDrawable(NA0.m94299e(getContext(), R$drawable.zui_background_response_option));
        int m115422e = C31646Ad6.m115422e(R$attr.colorPrimary, getContext(), R$color.zui_color_primary);
        setTextColor(m115422e);
        Drawable mutate = getBackground().mutate();
        if (mutate instanceof GradientDrawable) {
            ((GradientDrawable) mutate).setStroke((int) getResources().getDimension(R$dimen.zui_cell_response_option_stroke_width), m115422e);
            return;
        }
        C33694Ix2.m101447l("ResponseOptionView", "Unable to set stroke on background as background is not of type GradientDrawable", new Object[0]);
    }

    public ResponseOptionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ResponseOptionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}

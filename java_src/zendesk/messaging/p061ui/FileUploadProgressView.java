package zendesk.messaging.p061ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import zendesk.messaging.R$attr;
import zendesk.messaging.R$color;
/* renamed from: zendesk.messaging.ui.FileUploadProgressView */
/* loaded from: classes8.dex */
public class FileUploadProgressView extends ProgressBar {
    public FileUploadProgressView(Context context) {
        super(context);
        init();
    }

    private void init() {
        setIndeterminate(true);
        getIndeterminateDrawable().setColorFilter(C31646Ad6.m115422e(R$attr.colorPrimary, getContext(), R$color.zui_color_primary), PorterDuff.Mode.SRC_IN);
    }

    public FileUploadProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public FileUploadProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}

package zendesk.messaging.p061ui;

import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
/* renamed from: zendesk.messaging.ui.UtilsAttachment */
/* loaded from: classes8.dex */
class UtilsAttachment {
    private UtilsAttachment() {
    }

    public static String formatFileSize(Context context, long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            j = (((j * 1000) * 1000) / 1024) / 1024;
        }
        return Formatter.formatFileSize(context, j);
    }
}

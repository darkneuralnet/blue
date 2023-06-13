package p000;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import p000.C44930mA0;
/* renamed from: ui */
/* loaded from: classes.dex */
public final class C29279ui {

    /* renamed from: ui$a */
    /* loaded from: classes.dex */
    public static final class C29280a {
        private C29280a() {
        }

        /* renamed from: a */
        public static boolean m9868a(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                C38790bq6.m62472l0(textView, new C44930mA0.C25923a(dragEvent.getClipData(), 3).m26214a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        /* renamed from: b */
        public static boolean m9867b(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            C38790bq6.m62472l0(view, new C44930mA0.C25923a(dragEvent.getClipData(), 3).m26214a());
            return true;
        }
    }

    private C29279ui() {
    }

    /* renamed from: a */
    public static boolean m9871a(View view, DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && C38790bq6.m62542G(view) != null) {
            Activity m9869c = m9869c(view);
            if (m9869c == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + view);
                return false;
            } else if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            } else {
                if (dragEvent.getAction() == 3) {
                    if (view instanceof TextView) {
                        return C29280a.m9868a(dragEvent, (TextView) view, m9869c);
                    }
                    return C29280a.m9867b(dragEvent, view, m9869c);
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m9870b(TextView textView, int i) {
        ClipData primaryClip;
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 31 || C38790bq6.m62542G(textView) == null || (i != 16908322 && i != 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        if (clipboardManager == null) {
            primaryClip = null;
        } else {
            primaryClip = clipboardManager.getPrimaryClip();
        }
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            C44930mA0.C25923a c25923a = new C44930mA0.C25923a(primaryClip, 1);
            if (i != 16908322) {
                i2 = 1;
            }
            C38790bq6.m62472l0(textView, c25923a.m26212c(i2).m26214a());
        }
        return true;
    }

    /* renamed from: c */
    public static Activity m9869c(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}

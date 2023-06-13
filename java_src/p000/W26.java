package p000;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
/* renamed from: W26 */
/* loaded from: classes.dex */
public final class W26 implements InterfaceC40493eh3 {

    /* renamed from: W26$a */
    /* loaded from: classes.dex */
    public static final class C8920a {
        private C8920a() {
        }

        /* renamed from: a */
        public static CharSequence m78893a(Context context, ClipData.Item item, int i) {
            if ((i & 1) != 0) {
                CharSequence coerceToText = item.coerceToText(context);
                if (coerceToText instanceof Spanned) {
                    return coerceToText.toString();
                }
                return coerceToText;
            }
            return item.coerceToStyledText(context);
        }
    }

    /* renamed from: b */
    public static CharSequence m78895b(Context context, ClipData.Item item, int i) {
        return C8920a.m78893a(context, item, i);
    }

    /* renamed from: c */
    public static void m78894c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    @Override // p000.InterfaceC40493eh3
    /* renamed from: a */
    public C44930mA0 mo42621a(View view, C44930mA0 c44930mA0) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c44930mA0);
        }
        if (c44930mA0.m26218d() == 2) {
            return c44930mA0;
        }
        ClipData m26220b = c44930mA0.m26220b();
        int m26219c = c44930mA0.m26219c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < m26220b.getItemCount(); i++) {
            CharSequence m78895b = m78895b(context, m26220b.getItemAt(i), m26219c);
            if (m78895b != null) {
                if (!z) {
                    m78894c(editable, m78895b);
                    z = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), m78895b);
                }
            }
        }
        return null;
    }
}

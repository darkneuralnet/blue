package p000;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.text.Html;
import java.util.ArrayList;
/* renamed from: Hy5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C33472Hy5 {
    private C33472Hy5() {
    }

    /* renamed from: a */
    public static String m103144a(CharSequence charSequence) {
        return Html.escapeHtml(charSequence);
    }

    /* renamed from: b */
    public static void m103143b(Intent intent, ArrayList<Uri> arrayList) {
        ClipData clipData = new ClipData(null, new String[]{intent.getType()}, new ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra("android.intent.extra.HTML_TEXT"), null, arrayList.get(0)));
        int size = arrayList.size();
        for (int i = 1; i < size; i++) {
            clipData.addItem(new ClipData.Item(arrayList.get(i)));
        }
        intent.setClipData(clipData);
        intent.addFlags(1);
    }

    /* renamed from: c */
    public static void m103142c(Intent intent) {
        intent.setClipData(null);
        intent.setFlags(intent.getFlags() & (-2));
    }
}

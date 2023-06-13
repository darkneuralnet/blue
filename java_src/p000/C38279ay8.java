package p000;

import android.net.Uri;
/* renamed from: ay8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38279ay8 {

    /* renamed from: a */
    public static final C28385so f56707a = new C28385so();

    /* renamed from: a */
    public static synchronized Uri m65187a(String str) {
        synchronized (C38279ay8.class) {
            C28385so c28385so = f56707a;
            Uri uri = (Uri) c28385so.get("com.google.android.gms.measurement");
            if (uri == null) {
                Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
                c28385so.put("com.google.android.gms.measurement", parse);
                return parse;
            }
            return uri;
        }
    }
}

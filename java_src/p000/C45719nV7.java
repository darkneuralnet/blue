package p000;

import android.net.Uri;
/* renamed from: nV7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45719nV7 {

    /* renamed from: a */
    public static final C28385so<String, Uri> f100076a = new C28385so<>();

    /* renamed from: a */
    public static synchronized Uri m23584a(String str) {
        Uri uri;
        String str2;
        synchronized (C45719nV7.class) {
            C28385so<String, Uri> c28385so = f100076a;
            uri = c28385so.get("com.google.android.gms.auth_account");
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode("com.google.android.gms.auth_account"));
                if (valueOf.length() != 0) {
                    str2 = "content://com.google.android.gms.phenotype/".concat(valueOf);
                } else {
                    str2 = new String("content://com.google.android.gms.phenotype/");
                }
                uri = Uri.parse(str2);
                c28385so.put("com.google.android.gms.auth_account", uri);
            }
        }
        return uri;
    }
}

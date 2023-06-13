package p000;

import android.net.Uri;
/* renamed from: ev8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C40638ev8 {
    /* renamed from: a */
    public static Uri m42380a(Uri uri, String str) {
        Uri.Builder buildUpon = uri.buildUpon();
        String valueOf = String.valueOf(uri.getPath());
        return buildUpon.path(str.length() != 0 ? valueOf.concat(str) : new String(valueOf)).build();
    }
}

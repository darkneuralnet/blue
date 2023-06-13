package p000;

import android.net.Uri;
/* renamed from: JP2 */
/* loaded from: classes5.dex */
public final class JP2 {
    private JP2() {
    }

    /* renamed from: a */
    public static boolean m100517a(Uri uri) {
        return m100516b(uri) && !m100513e(uri);
    }

    /* renamed from: b */
    public static boolean m100516b(Uri uri) {
        if (uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority())) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m100515c(Uri uri) {
        return m100516b(uri) && m100513e(uri);
    }

    /* renamed from: d */
    public static boolean m100514d(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    /* renamed from: e */
    public static boolean m100513e(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}

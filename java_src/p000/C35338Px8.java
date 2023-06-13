package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
/* renamed from: Px8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35338Px8 {

    /* renamed from: a */
    public static volatile QC8 f29480a = QC8.m88749c();

    /* renamed from: b */
    public static final Object f29481b = new Object();

    /* JADX WARN: Can't wrap try/catch for region: R(11:18|(8:20|(1:22)(1:31)|23|(1:25)|27|28|29|30)|32|33|34|35|(1:37)|27|28|29|30) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
        if ("com.google.android.gms".equals(r0.packageName) != false) goto L32;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m89230a(Context context, Uri uri) {
        int i;
        String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
            return false;
        } else if (f29480a.mo24137b()) {
            return ((Boolean) f29480a.mo24138a()).booleanValue();
        } else {
            synchronized (f29481b) {
                if (f29480a.mo24137b()) {
                    return ((Boolean) f29480a.mo24138a()).booleanValue();
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    PackageManager packageManager = context.getPackageManager();
                    if (Build.VERSION.SDK_INT < 29) {
                        i = 0;
                    } else {
                        i = 268435456;
                    }
                    ProviderInfo resolveContentProvider = packageManager.resolveContentProvider("com.google.android.gms.phenotype", i);
                    if (resolveContentProvider != null) {
                    }
                    f29480a = QC8.m88748d(Boolean.valueOf(z));
                    return ((Boolean) f29480a.mo24138a()).booleanValue();
                }
                if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                    z = true;
                }
                f29480a = QC8.m88748d(Boolean.valueOf(z));
                return ((Boolean) f29480a.mo24138a()).booleanValue();
            }
        }
    }
}

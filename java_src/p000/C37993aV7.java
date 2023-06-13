package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
/* renamed from: aV7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37993aV7 {

    /* renamed from: a */
    public static volatile AbstractC38891c08<Boolean> f50582a = AbstractC38891c08.m62033c();

    /* renamed from: b */
    public static final Object f50583b = new Object();

    /* JADX WARN: Can't wrap try/catch for region: R(11:18|(1:20)(8:33|(1:35)(1:41)|36|(2:38|(1:40))|27|28|29|30)|21|22|23|24|(1:26)|27|28|29|30) */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m71273a(Context context, Uri uri) {
        int i;
        String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            StringBuilder sb = new StringBuilder(String.valueOf(authority).length() + 91);
            sb.append(authority);
            sb.append(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            Log.e("PhenotypeClientHelper", sb.toString());
            return false;
        } else if (f50582a.mo16671b()) {
            return f50582a.mo16672a().booleanValue();
        } else {
            synchronized (f50583b) {
                if (f50582a.mo16671b()) {
                    return f50582a.mo16672a().booleanValue();
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
                        if (!"com.google.android.gms".equals(resolveContentProvider.packageName)) {
                        }
                    }
                    f50582a = AbstractC38891c08.m62032d(Boolean.valueOf(z));
                    return f50582a.mo16672a().booleanValue();
                }
                if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                    z = true;
                }
                f50582a = AbstractC38891c08.m62032d(Boolean.valueOf(z));
                return f50582a.mo16672a().booleanValue();
            }
        }
    }
}

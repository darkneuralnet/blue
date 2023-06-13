package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.support.annotation.NonNull;
import java.util.List;
/* renamed from: XM6 */
/* loaded from: classes8.dex */
public class XM6 {
    private XM6() {
    }

    /* renamed from: a */
    public static boolean m77080a(@NonNull Context context, @NonNull List<String> list) {
        if (context == null || list == null) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        boolean z = false;
        for (String str : list) {
            try {
                packageManager.getPackageInfo(str, 0);
                z = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z;
    }

    /* renamed from: b */
    public static boolean m77079b(PackageManager packageManager, Intent intent) {
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        return queryIntentActivities != null && queryIntentActivities.size() > 0;
    }
}

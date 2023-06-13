package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.List;
/* renamed from: cj */
/* loaded from: classes2.dex */
public class C13650cj {
    /* renamed from: a */
    public static boolean m61026a(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities == null || queryIntentActivities.size() != 1) {
            return false;
        }
        return true;
    }
}

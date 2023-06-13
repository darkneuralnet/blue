package p000;

import android.content.Context;
import android.content.Intent;
/* renamed from: z3 */
/* loaded from: classes2.dex */
public class C30885z3 {
    private C30885z3() {
    }

    /* renamed from: b */
    public static C30885z3 m1902b() {
        return new C30885z3();
    }

    /* renamed from: a */
    public boolean m1903a(Context context, Intent intent) {
        return !context.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }
}

package p000;

import android.content.Context;
/* renamed from: ET8 */
/* loaded from: classes6.dex */
public final class ET8 {

    /* renamed from: a */
    public static C38461bH8 f7528a;

    /* renamed from: a */
    public static synchronized C38461bH8 m108934a(Context context) {
        C38461bH8 c38461bH8;
        synchronized (ET8.class) {
            if (f7528a == null) {
                C49512tt8 c49512tt8 = new C49512tt8(null);
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                c49512tt8.m11253a(context);
                f7528a = c49512tt8.zzb();
            }
            c38461bH8 = f7528a;
        }
        return c38461bH8;
    }
}

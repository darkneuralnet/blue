package p000;

import android.util.Log;
/* renamed from: KJ6 */
/* loaded from: classes8.dex */
public final class KJ6 {

    /* renamed from: a */
    public static boolean f19442a = Boolean.valueOf(System.getProperty("magnes.debug.mode", Boolean.FALSE.toString())).booleanValue();

    private KJ6() {
    }

    /* renamed from: a */
    public static void m99012a(Class<?> cls, int i, String str) {
        boolean z = f19442a;
        if (z) {
            if (i == 0) {
                String simpleName = cls.getSimpleName();
                Log.d(simpleName, "****MAGNES DEBUGGING MESSAGE**** : " + str);
            } else if (i == 1) {
                String simpleName2 = cls.getSimpleName();
                Log.i(simpleName2, "****MAGNES DEBUGGING MESSAGE**** : " + str);
            } else if (i == 2) {
                String simpleName3 = cls.getSimpleName();
                Log.w(simpleName3, "****MAGNES DEBUGGING MESSAGE**** : " + str);
            } else if (i == 3 && z) {
                String simpleName4 = cls.getSimpleName();
                Log.e(simpleName4, "****MAGNES DEBUGGING MESSAGE**** : " + str);
            }
        }
    }

    /* renamed from: b */
    public static void m99011b(Class<?> cls, int i, Throwable th) {
        boolean z = f19442a;
        if (z) {
            if (i == 0) {
                String simpleName = cls.getSimpleName();
                Log.d(simpleName, "****MAGNES DEBUGGING MESSAGE**** : " + th.getMessage(), th);
            } else if (i == 1) {
                String simpleName2 = cls.getSimpleName();
                Log.i(simpleName2, "****MAGNES DEBUGGING MESSAGE**** : " + th.getMessage(), th);
            } else if (i == 2) {
                String simpleName3 = cls.getSimpleName();
                Log.w(simpleName3, "****MAGNES DEBUGGING MESSAGE**** : " + th.getMessage(), th);
            } else if (i == 3 && z) {
                String simpleName4 = cls.getSimpleName();
                Log.e(simpleName4, "****MAGNES DEBUGGING MESSAGE**** : " + th.getMessage(), th);
            }
        }
    }
}

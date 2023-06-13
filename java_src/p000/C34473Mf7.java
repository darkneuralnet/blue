package p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.UserManager;
/* renamed from: Mf7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C34473Mf7 {

    /* renamed from: a */
    public static volatile UserManager f23376a;

    /* renamed from: b */
    public static volatile boolean f23377b = !m95077b();

    private C34473Mf7() {
    }

    /* renamed from: a */
    public static boolean m95078a(Context context) {
        return m95077b() && !m95076c(context);
    }

    /* renamed from: b */
    public static boolean m95077b() {
        return true;
    }

    @TargetApi(24)
    /* renamed from: c */
    public static boolean m95076c(Context context) {
        boolean z = f23377b;
        if (!z) {
            UserManager userManager = f23376a;
            if (userManager == null) {
                synchronized (C34473Mf7.class) {
                    userManager = f23376a;
                    if (userManager == null) {
                        UserManager userManager2 = (UserManager) context.getSystemService(UserManager.class);
                        f23376a = userManager2;
                        if (userManager2 == null) {
                            f23377b = true;
                            return true;
                        }
                        userManager = userManager2;
                    }
                }
            }
            z = userManager.isUserUnlocked();
            f23377b = z;
            if (z) {
                f23376a = null;
            }
        }
        return z;
    }
}

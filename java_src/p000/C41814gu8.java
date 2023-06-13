package p000;

import android.content.Context;
import android.os.UserManager;
import android.util.Log;
/* renamed from: gu8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41814gu8 {

    /* renamed from: a */
    public static UserManager f84429a;

    /* renamed from: b */
    public static volatile boolean f84430b = !m37343b();

    private C41814gu8() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003d, code lost:
        if (r4.isUserRunning(android.os.Process.myUserHandle()) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
        r8 = true;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m37344a(Context context) {
        boolean z;
        if (m37343b() && !f84430b) {
            synchronized (C41814gu8.class) {
                if (!f84430b) {
                    int i = 1;
                    while (true) {
                        if (i > 2) {
                            break;
                        }
                        if (f84429a == null) {
                            f84429a = (UserManager) context.getSystemService(UserManager.class);
                        }
                        UserManager userManager = f84429a;
                        if (userManager == null) {
                            z = true;
                            break;
                        }
                        try {
                            if (userManager.isUserUnlocked()) {
                                break;
                            }
                        } catch (NullPointerException e) {
                            Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                            f84429a = null;
                            i++;
                        }
                    }
                    z = false;
                    if (z) {
                        f84429a = null;
                    }
                    if (z) {
                        f84430b = true;
                    }
                    if (!z) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m37343b() {
        return true;
    }
}

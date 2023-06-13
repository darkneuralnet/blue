package p000;

import android.content.Context;
import android.os.UserManager;
import android.util.Log;
/* renamed from: v38  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50203v38 {

    /* renamed from: a */
    public static UserManager f113452a;

    /* renamed from: b */
    public static volatile boolean f113453b = !m9261b();

    private C50203v38() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003d, code lost:
        if (r3.isUserRunning(android.os.Process.myUserHandle()) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
        r7 = true;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m9262a(Context context) {
        boolean z;
        if (m9261b() && !f113453b) {
            synchronized (C50203v38.class) {
                if (!f113453b) {
                    int i = 1;
                    while (true) {
                        if (i > 2) {
                            break;
                        }
                        if (f113452a == null) {
                            f113452a = (UserManager) context.getSystemService(UserManager.class);
                        }
                        UserManager userManager = f113452a;
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
                            f113452a = null;
                            i++;
                        }
                    }
                    z = false;
                    if (z) {
                        f113452a = null;
                    }
                    if (z) {
                        f113453b = true;
                    }
                    if (!z) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m9261b() {
        return true;
    }
}

package p000;

import android.content.Context;
import android.os.UserManager;
/* renamed from: mh6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C45240mh6 {

    /* renamed from: mh6$a */
    /* loaded from: classes.dex */
    public static class C26166a {
        private C26166a() {
        }

        /* renamed from: a */
        public static boolean m25159a(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    private C45240mh6() {
    }

    /* renamed from: a */
    public static boolean m25160a(Context context) {
        return C26166a.m25159a(context);
    }
}

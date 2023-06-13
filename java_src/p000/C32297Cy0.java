package p000;

import android.net.ConnectivityManager;
/* renamed from: Cy0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32297Cy0 {

    /* renamed from: Cy0$a */
    /* loaded from: classes.dex */
    public static class C1264a {
        private C1264a() {
        }

        /* renamed from: a */
        public static boolean m111196a(ConnectivityManager connectivityManager) {
            return connectivityManager.isActiveNetworkMetered();
        }
    }

    private C32297Cy0() {
    }

    /* renamed from: a */
    public static boolean m111197a(ConnectivityManager connectivityManager) {
        return C1264a.m111196a(connectivityManager);
    }
}

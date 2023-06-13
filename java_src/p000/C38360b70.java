package p000;

import android.os.Bundle;
import android.os.IBinder;
/* renamed from: b70  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38360b70 {

    /* renamed from: b70$a */
    /* loaded from: classes.dex */
    public static class C12296a {
        private C12296a() {
        }

        /* renamed from: a */
        public static IBinder m64955a(Bundle bundle, String str) {
            return bundle.getBinder(str);
        }

        /* renamed from: b */
        public static void m64954b(Bundle bundle, String str, IBinder iBinder) {
            bundle.putBinder(str, iBinder);
        }
    }

    private C38360b70() {
    }

    /* renamed from: a */
    public static IBinder m64957a(Bundle bundle, String str) {
        return C12296a.m64955a(bundle, str);
    }

    /* renamed from: b */
    public static void m64956b(Bundle bundle, String str, IBinder iBinder) {
        C12296a.m64954b(bundle, str, iBinder);
    }
}

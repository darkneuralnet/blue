package p000;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
/* renamed from: fs4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C41197fs4 {

    /* renamed from: a */
    public static GoogleApiAvailabilityLight f80978a = GoogleApiAvailabilityLight.getInstance();

    /* renamed from: b */
    public static int f80979b = 1;

    private C41197fs4() {
    }

    /* renamed from: a */
    public static InterfaceC41790gs4 m40623a(Context context) {
        if (m40622b(context)) {
            return C33195Gt7.m104608a(context);
        }
        return new C50308vE7(context);
    }

    /* renamed from: b */
    public static boolean m40622b(Context context) {
        String str = C40328eP7.f78378a;
        int i = f80979b;
        if (i != 0) {
            if (i == 1) {
                int isGooglePlayServicesAvailable = f80978a.isGooglePlayServicesAvailable(context, 18223000);
                if (isGooglePlayServicesAvailable != 1 && isGooglePlayServicesAvailable != 9 && isGooglePlayServicesAvailable != 3) {
                    f80979b = 2;
                } else {
                    f80979b = 3;
                }
            }
            int i2 = f80979b;
            if (i2 != 0) {
                if (i2 == 3) {
                    return true;
                }
                return false;
            }
            throw null;
        }
        throw null;
    }
}

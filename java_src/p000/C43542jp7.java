package p000;

import android.util.Log;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzakk;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Random;
import org.joda.time.DateTimeConstants;
/* renamed from: jp7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43542jp7 {

    /* renamed from: a */
    public static final int[] f93412a = {0, 0, 1, 2, 4, 8, 16};

    /* renamed from: c */
    public static final C42356hp7 f93414c = C42356hp7.f85965a;

    /* renamed from: b */
    public static final Random f93413b = new SecureRandom();

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m29865a(InterfaceC42949ip7 interfaceC42949ip7) throws InterruptedException {
        String valueOf;
        String str;
        int[] iArr = f93412a;
        for (int i = 0; i < 7; i++) {
            int i2 = iArr[i];
            if (i2 > 0) {
                int i3 = i2 * DateTimeConstants.MILLIS_PER_MINUTE;
                Thread.sleep((i3 / 2) + f93413b.nextInt(i3));
            }
            try {
            } catch (zzakk e) {
                e = e;
                valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() == 0) {
                    str = "retryWithRandomizedExponentialBackoff: ".concat(valueOf);
                } else {
                    str = new String("retryWithRandomizedExponentialBackoff: ");
                }
                Log.e("MLK ExponentialBackoff", str, e);
            } catch (IOException e2) {
                e = e2;
                valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() == 0) {
                }
                Log.e("MLK ExponentialBackoff", str, e);
            } catch (InterruptedException e3) {
                Log.i("MLK ExponentialBackoff", "retryWithRandomizedExponentialBackoff: interrupted");
                throw e3;
            }
            if (interfaceC42949ip7.zzb()) {
                return true;
            }
        }
        return false;
    }
}

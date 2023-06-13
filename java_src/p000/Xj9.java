package p000;

import android.util.Log;
import com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzqm;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Random;
import org.joda.time.DateTimeConstants;
/* renamed from: Xj9 */
/* loaded from: classes5.dex */
public final class Xj9 {

    /* renamed from: a */
    public static final int[] f43773a = {0, 0, 1, 2, 4, 8, 16};

    /* renamed from: c */
    public static final Dj9 f43775c = Dj9.f6244a;

    /* renamed from: b */
    public static final Random f43774b = new SecureRandom();

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m76495a(Qj9 qj9) throws InterruptedException {
        String valueOf;
        String str;
        int[] iArr = f43773a;
        for (int i = 0; i < 7; i++) {
            int i2 = iArr[i];
            if (i2 > 0) {
                int i3 = i2 * DateTimeConstants.MILLIS_PER_MINUTE;
                Thread.sleep((i3 / 2) + f43774b.nextInt(i3));
            }
            try {
            } catch (zzqm e) {
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
            if (qj9.zza()) {
                return true;
            }
        }
        return false;
    }
}

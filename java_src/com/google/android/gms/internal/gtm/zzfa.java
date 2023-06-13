package com.google.android.gms.internal.gtm;

import android.annotation.SuppressLint;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
@VisibleForTesting
@Deprecated
/* loaded from: classes5.dex */
public final class zzfa {
    private static volatile InterfaceC33226Gx2 zza = new zzcu();

    @SuppressLint({"LogTagMismatch"})
    public static void zzb(String str, Object obj) {
        String str2;
        zzfb zza2 = zzfb.zza();
        if (zza2 != null) {
            zza2.zzK(str, obj);
        } else if (zzf(3)) {
            if (obj != null) {
                String str3 = (String) obj;
                StringBuilder sb = new StringBuilder(str.length() + 1 + str3.length());
                sb.append(str);
                sb.append(":");
                sb.append(str3);
                str2 = sb.toString();
            } else {
                str2 = str;
            }
            Log.e(zzeu.zzc.zzb(), str2);
        }
        InterfaceC33226Gx2 interfaceC33226Gx2 = zza;
        if (interfaceC33226Gx2 != null) {
            interfaceC33226Gx2.error(str);
        }
    }

    public static boolean zzf(int i) {
        if (zza == null || zza.getLogLevel() > i) {
            return false;
        }
        return true;
    }
}

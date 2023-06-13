package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
/* loaded from: classes6.dex */
public final class zzdw {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int zza(String str) {
        char c;
        if (str == null) {
            return 13;
        }
        switch (str.hashCode()) {
            case -1698126997:
                if (str.equals("REQUEST_DENIED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1125000185:
                if (str.equals("INVALID_REQUEST")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -813482689:
                if (str.equals("ZERO_RESULTS")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2524:
                if (str.equals("OK")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1023286998:
                if (str.equals("NOT_FOUND")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1831775833:
                if (str.equals("OVER_QUERY_LIMIT")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1) {
            return 0;
        }
        if (c != 2) {
            if (c != 3) {
                if (c != 4) {
                    if (c != 5) {
                        return 13;
                    }
                    return PlacesStatusCodes.NOT_FOUND;
                }
                return PlacesStatusCodes.INVALID_REQUEST;
            }
            return PlacesStatusCodes.REQUEST_DENIED;
        }
        return PlacesStatusCodes.OVER_QUERY_LIMIT;
    }

    public static String zzb(String str, String str2) {
        return TextUtils.isEmpty(str2) ? str : str2;
    }
}

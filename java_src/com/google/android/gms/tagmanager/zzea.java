package com.google.android.gms.tagmanager;

import android.net.Uri;
import com.amazonaws.services.p026s3.internal.Constants;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
@ShowFirstParty
@VisibleForTesting
/* loaded from: classes6.dex */
final class zzea {
    private static zzea zza;
    private volatile int zze = 1;
    private volatile String zzc = null;
    private volatile String zzb = null;
    private volatile String zzd = null;

    @ShowFirstParty
    public static zzea zza() {
        zzea zzeaVar;
        synchronized (zzea.class) {
            if (zza == null) {
                zza = new zzea();
            }
            zzeaVar = zza;
        }
        return zzeaVar;
    }

    private static final String zzf(String str) {
        return str.split("&")[0].split("=")[1];
    }

    public final String zzb() {
        return this.zzc;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final synchronized boolean zzd(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        try {
            String decode = URLDecoder.decode(uri.toString(), Constants.DEFAULT_ENCODING);
            if (decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$")) {
                if (decode.length() != 0) {
                    str3 = "Container preview url: ".concat(decode);
                } else {
                    str3 = new String("Container preview url: ");
                }
                zzdh.zzb.zzd(str3);
                if (decode.matches(".*?&gtm_debug=x$")) {
                    this.zze = 3;
                } else {
                    this.zze = 2;
                }
                this.zzd = uri.getQuery().replace("&gtm_debug=x", "");
                if (this.zze == 2 || this.zze == 3) {
                    String valueOf = String.valueOf(this.zzd);
                    if (valueOf.length() != 0) {
                        str4 = "/r?".concat(valueOf);
                    } else {
                        str4 = new String("/r?");
                    }
                    this.zzc = str4;
                }
                this.zzb = zzf(this.zzd);
                return true;
            } else if (decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$")) {
                if (!zzf(uri.getQuery()).equals(this.zzb)) {
                    return false;
                }
                String valueOf2 = String.valueOf(this.zzb);
                if (valueOf2.length() != 0) {
                    str2 = "Exit preview mode for container: ".concat(valueOf2);
                } else {
                    str2 = new String("Exit preview mode for container: ");
                }
                zzdh.zzb.zzd(str2);
                this.zze = 1;
                this.zzc = null;
                return true;
            } else {
                if (decode.length() != 0) {
                    str = "Invalid preview uri: ".concat(decode);
                } else {
                    str = new String("Invalid preview uri: ");
                }
                zzdh.zzc(str);
                return false;
            }
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    public final int zze() {
        return this.zze;
    }
}

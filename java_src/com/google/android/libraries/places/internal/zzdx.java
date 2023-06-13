package com.google.android.libraries.places.internal;

import android.location.Location;
import android.text.TextUtils;
import co.bird.android.model.persistence.common.ConstantsKt;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.RectangularBounds;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* loaded from: classes6.dex */
public final class zzdx {
    private static final zzhv zza;

    static {
        zzhu zzhuVar = new zzhu();
        zzhuVar.zza(zzbf.NONE, ConstantsKt.NONE);
        zzhuVar.zza(zzbf.PSK, "WPA_PSK");
        zzhuVar.zza(zzbf.EAP, "WPA_EAP");
        zzhuVar.zza(zzbf.OTHER, "SECURED_NONE");
        zza = zzhuVar.zzb();
    }

    public static Integer zza(Location location) {
        if (location == null) {
            return null;
        }
        float accuracy = location.getAccuracy();
        if (!location.hasAccuracy() || accuracy <= 0.0f) {
            return null;
        }
        return Integer.valueOf(Math.round(accuracy * 100.0f));
    }

    public static String zzb(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            if (!TextUtils.isEmpty(str2)) {
                String valueOf = String.valueOf(str2.toLowerCase(Locale.US));
                if (valueOf.length() != 0) {
                    str = "country:".concat(valueOf);
                } else {
                    str = new String("country:");
                }
            }
            if (str != null) {
                if (sb.length() != 0) {
                    sb.append('|');
                }
                sb.append(str);
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    public static String zzc(Location location) {
        if (location == null) {
            return null;
        }
        return zzh(location.getLatitude(), location.getLongitude());
    }

    public static String zzd(LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        return zzh(latLng.f71430b, latLng.f71431c);
    }

    public static String zze(LocationBias locationBias) {
        if (locationBias == null) {
            return null;
        }
        if (locationBias instanceof RectangularBounds) {
            return zzi((RectangularBounds) locationBias);
        }
        throw new AssertionError("Unknown LocationBias type.");
    }

    public static String zzf(LocationRestriction locationRestriction) {
        if (locationRestriction == null) {
            return null;
        }
        if (locationRestriction instanceof RectangularBounds) {
            return zzi((RectangularBounds) locationRestriction);
        }
        throw new AssertionError("Unknown LocationRestriction type.");
    }

    public static String zzg(zzhs zzhsVar, int i) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        int size = zzhsVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzbg zzbgVar = (zzbg) zzhsVar.get(i2);
            if (sb.length() > 0) {
                str = "|";
            } else {
                str = "";
            }
            zzhu zzhuVar = new zzhu();
            zzhuVar.zza("mac", zzbgVar.zzd());
            zzhuVar.zza("strength_dbm", Integer.valueOf(zzbgVar.zzb()));
            zzhuVar.zza("wifi_auth_type", zza.get(zzbgVar.zzc()));
            zzhuVar.zza("is_connected", Boolean.valueOf(zzbgVar.zze()));
            zzhuVar.zza("frequency_mhz", Integer.valueOf(zzbgVar.zza()));
            zzhv zzb = zzhuVar.zzb();
            zzgv zzc = zzgv.zzc(",");
            Iterator<E> it = zzb.entrySet().iterator();
            StringBuilder sb2 = new StringBuilder();
            try {
                zzgu.zza(sb2, it, zzc, "=");
                String sb3 = sb2.toString();
                if (sb3.length() != 0) {
                    str2 = str.concat(sb3);
                } else {
                    str2 = new String(str);
                }
                if (sb.length() + str2.length() > 4000) {
                    break;
                }
                sb.append(str2);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
        return sb.toString();
    }

    private static String zzh(double d, double d2) {
        return String.format(Locale.US, "%.15f,%.15f", Double.valueOf(d), Double.valueOf(d2));
    }

    private static String zzi(RectangularBounds rectangularBounds) {
        LatLng southwest = rectangularBounds.getSouthwest();
        double d = southwest.f71430b;
        double d2 = southwest.f71431c;
        LatLng northeast = rectangularBounds.getNortheast();
        return String.format(Locale.US, "rectangle:%.15f,%.15f|%.15f,%.15f", Double.valueOf(d), Double.valueOf(d2), Double.valueOf(northeast.f71430b), Double.valueOf(northeast.f71431c));
    }
}
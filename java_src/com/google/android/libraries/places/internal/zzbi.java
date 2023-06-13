package com.google.android.libraries.places.internal;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* loaded from: classes6.dex */
public final class zzbi {
    public static final /* synthetic */ int zza = 0;
    private static final long zzb = TimeUnit.MINUTES.toMicros(1);
    private final zzas zzc;
    private final Context zzd;

    public zzbi(Context context, zzas zzasVar) {
        this.zzd = context;
        this.zzc = zzasVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
        if (r10.contains("_optout") == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzhs zza(String str) {
        boolean z;
        WifiManager wifiManager = (WifiManager) this.zzd.getSystemService("wifi");
        if (wifiManager != null && wifiManager.isWifiEnabled()) {
            List<ScanResult> scanResults = wifiManager.getScanResults();
            if (scanResults != null && !scanResults.isEmpty()) {
                zzhs zzp = zzhs.zzp(zzid.zza(zzbh.zza), scanResults);
                ArrayList arrayList = new ArrayList();
                WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                int size = zzp.size();
                for (int i = 0; i < size; i++) {
                    ScanResult scanResult = (ScanResult) zzp.get(i);
                    if (scanResult != null && !TextUtils.isEmpty(scanResult.SSID)) {
                        long zza2 = (this.zzc.zza() * 1000) - scanResult.timestamp;
                        long j = zzb;
                        String str2 = scanResult.SSID;
                        if (str2 != null) {
                            if (str2.indexOf(95) >= 0) {
                                String lowerCase = str2.toLowerCase(Locale.ENGLISH);
                                z = true;
                                if (!lowerCase.contains("_nomap")) {
                                }
                                if (zza2 <= j && !z) {
                                    arrayList.add(new zzbg(connectionInfo, scanResult));
                                }
                            }
                            z = false;
                            if (zza2 <= j) {
                                arrayList.add(new zzbg(connectionInfo, scanResult));
                            }
                        } else {
                            throw new IllegalArgumentException("Null SSID.");
                        }
                    }
                }
                return zzhs.zzk(arrayList);
            }
            return zzhs.zzm();
        }
        return zzhs.zzm();
    }
}

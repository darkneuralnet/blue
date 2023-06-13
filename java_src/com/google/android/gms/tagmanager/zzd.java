package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import p000.C25919m8;
@VisibleForTesting
/* loaded from: classes6.dex */
public final class zzd {
    private static final Object zza = new Object();
    private static zzd zzb;
    private volatile C25919m8.C25920a zzf;
    private volatile long zzg;
    private volatile long zzh;
    private final Context zzi;
    private final Clock zzj;
    private final Thread zzk;
    private volatile long zzc = 900000;
    private volatile long zzd = 30000;
    private volatile boolean zze = false;
    private final Object zzl = new Object();
    private final zzc zzm = new zza(this);

    @VisibleForTesting
    public zzd(Context context, zzc zzcVar, Clock clock) {
        this.zzj = clock;
        if (context != null) {
            this.zzi = context.getApplicationContext();
        } else {
            this.zzi = null;
        }
        this.zzg = clock.currentTimeMillis();
        this.zzk = new Thread(new zzb(this));
    }

    public static zzd zzb(Context context) {
        if (zzb == null) {
            synchronized (zza) {
                if (zzb == null) {
                    zzd zzdVar = new zzd(context, null, DefaultClock.getInstance());
                    zzb = zzdVar;
                    zzdVar.zzk.start();
                }
            }
        }
        return zzb;
    }

    public static /* bridge */ /* synthetic */ void zzd(zzd zzdVar) {
        Process.setThreadPriority(10);
        while (!zzdVar.zze) {
            C25919m8.C25920a zza2 = zzdVar.zzm.zza();
            if (zza2 != null) {
                zzdVar.zzf = zza2;
                zzdVar.zzh = zzdVar.zzj.currentTimeMillis();
                zzdh.zzb.zzb("Obtained fresh AdvertisingId info from GmsCore.");
            }
            synchronized (zzdVar) {
                zzdVar.notifyAll();
            }
            try {
                synchronized (zzdVar.zzl) {
                    zzdVar.zzl.wait(zzdVar.zzc);
                }
            } catch (InterruptedException unused) {
                zzdh.zzb.zzb("sleep interrupted in AdvertiserDataPoller thread; continuing");
            }
        }
    }

    @VisibleForTesting
    public final void zze() {
        this.zze = true;
        this.zzk.interrupt();
    }
}

package com.google.android.gms.tagmanager;

import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
/* JADX INFO: Access modifiers changed from: package-private */
@ShowFirstParty
@VisibleForTesting
/* loaded from: classes6.dex */
public final class zzff extends zzey {
    private static final Object zza = new Object();
    private static zzff zzb;
    private boolean zze = true;
    private boolean zzf = false;
    private boolean zzg = true;
    private final zzez zzl = new zzez(this);
    private boolean zzj = false;

    private zzff() {
    }

    public static zzff zzg() {
        if (zzb == null) {
            zzb = new zzff();
        }
        return zzb;
    }

    @Override // com.google.android.gms.tagmanager.zzey
    public final synchronized void zza() {
        if (!this.zzf) {
            zzdh.zzb.zzd("Dispatch call queued. Dispatch will run once initialization is complete.");
            this.zze = true;
        } else {
            new zzfa(this);
            throw null;
        }
    }
}

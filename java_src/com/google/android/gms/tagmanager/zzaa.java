package com.google.android.gms.tagmanager;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.VisibleForTesting;
/* JADX INFO: Access modifiers changed from: package-private */
@VisibleForTesting
/* loaded from: classes6.dex */
public final class zzaa implements Result, Releasable {
    private final Status zzd;
    private boolean zzg;
    private TagManager zzh;

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zzd;
    }

    public final synchronized void refresh() {
        if (this.zzg) {
            zzdh.zza("Refreshing a released ContainerHolder.");
        } else {
            throw null;
        }
    }

    @Override // com.google.android.gms.common.api.Releasable
    public final synchronized void release() {
        if (this.zzg) {
            zzdh.zza("Releasing a released ContainerHolder.");
        } else {
            this.zzg = true;
            this.zzh.zzc(this);
            throw null;
        }
    }

    public final String zza() {
        if (this.zzg) {
            zzdh.zza("getContainerId called on a released ContainerHolder.");
            return "";
        }
        throw null;
    }

    public final String zzb() {
        if (this.zzg) {
            zzdh.zza("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
            return "";
        }
        throw null;
    }

    public final synchronized void zzd(String str) {
        if (!this.zzg) {
            throw null;
        }
    }

    public final void zze(String str) {
        if (this.zzg) {
            zzdh.zza("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
            return;
        }
        throw null;
    }
}

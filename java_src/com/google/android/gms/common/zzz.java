package com.google.android.gms.common;

import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
/* loaded from: classes5.dex */
final class zzz {
    private String zza = null;
    private long zzb = -1;
    private AbstractC44688ll7 zzc = AbstractC44688ll7.m26859w();
    private AbstractC44688ll7 zzd = AbstractC44688ll7.m26859w();

    public final zzz zza(long j) {
        this.zzb = j;
        return this;
    }

    public final zzz zzb(List list) {
        Preconditions.checkNotNull(list);
        this.zzd = AbstractC44688ll7.m26860v(list);
        return this;
    }

    public final zzz zzc(List list) {
        Preconditions.checkNotNull(list);
        this.zzc = AbstractC44688ll7.m26860v(list);
        return this;
    }

    public final zzz zzd(String str) {
        this.zza = str;
        return this;
    }

    public final zzab zze() {
        if (this.zza != null) {
            if (this.zzb >= 0) {
                if (this.zzc.isEmpty() && this.zzd.isEmpty()) {
                    throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
                }
                return new zzab(this.zza, this.zzb, this.zzc, this.zzd, null);
            }
            throw new IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
        }
        throw new IllegalStateException("packageName must be defined");
    }
}

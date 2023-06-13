package com.google.android.libraries.places.internal;

import java.util.NoSuchElementException;
/* loaded from: classes6.dex */
final class zzacg extends zzaci {
    final /* synthetic */ zzacp zza;
    private int zzb = 0;
    private final int zzc;

    public zzacg(zzacp zzacpVar) {
        this.zza = zzacpVar;
        this.zzc = zzacpVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzack
    public final byte zza() {
        int i = this.zzb;
        if (i < this.zzc) {
            this.zzb = i + 1;
            return this.zza.zzb(i);
        }
        throw new NoSuchElementException();
    }
}

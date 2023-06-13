package com.google.android.libraries.places.internal;

import java.util.Iterator;
/* loaded from: classes6.dex */
final class zzij extends zzhw {
    private final transient zzhv zza;
    private final transient zzhs zzb;

    public zzij(zzhv zzhvVar, zzhs zzhsVar) {
        this.zza = zzhvVar;
        this.zzb = zzhsVar;
    }

    @Override // com.google.android.libraries.places.internal.zzhp, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.libraries.places.internal.zzhw, com.google.android.libraries.places.internal.zzhp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.libraries.places.internal.zzhp
    public final int zza(Object[] objArr, int i) {
        return this.zzb.zza(objArr, 0);
    }

    @Override // com.google.android.libraries.places.internal.zzhw, com.google.android.libraries.places.internal.zzhp
    public final zzhs zzd() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzhw, com.google.android.libraries.places.internal.zzhp
    public final zzip zze() {
        return this.zzb.listIterator(0);
    }

    @Override // com.google.android.libraries.places.internal.zzhp
    public final boolean zzf() {
        throw null;
    }
}

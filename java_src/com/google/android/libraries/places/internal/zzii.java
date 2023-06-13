package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes6.dex */
final class zzii extends zzhw {
    private final transient zzhv zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzii(zzhv zzhvVar, Object[] objArr, int i, int i2) {
        this.zza = zzhvVar;
        this.zzb = objArr;
        this.zzc = i2;
    }

    @Override // com.google.android.libraries.places.internal.zzhp, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzhw, com.google.android.libraries.places.internal.zzhp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzhp
    public final int zza(Object[] objArr, int i) {
        return zzd().zza(objArr, 0);
    }

    @Override // com.google.android.libraries.places.internal.zzhw, com.google.android.libraries.places.internal.zzhp
    public final zzip zze() {
        return zzd().listIterator(0);
    }

    @Override // com.google.android.libraries.places.internal.zzhp
    public final boolean zzf() {
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzhw
    public final zzhs zzh() {
        return new zzih(this);
    }
}

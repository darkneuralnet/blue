package com.google.android.libraries.places.internal;
/* loaded from: classes6.dex */
final class zzik extends zzhs {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zzik(Object[] objArr, int i, int i2) {
        this.zza = objArr;
        this.zzb = i;
        this.zzc = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzha.zza(i, this.zzc, "index");
        Object obj = this.zza[i + i + this.zzb];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzhp
    public final boolean zzf() {
        return true;
    }
}

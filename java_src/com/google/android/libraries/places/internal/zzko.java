package com.google.android.libraries.places.internal;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class zzko extends AbstractSet {
    final int zza = -1;
    final /* synthetic */ zzkp zzb;

    public zzko(zzkp zzkpVar, int i) {
        this.zzb = zzkpVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object[] objArr;
        Comparator comparator;
        objArr = this.zzb.zzb;
        int zzb = zzb();
        int zza = zza();
        if (this.zza == -1) {
            comparator = zzkp.zza;
        } else {
            comparator = zzkr.zza;
        }
        if (Arrays.binarySearch(objArr, zzb, zza, obj, comparator) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzkn(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return zza() - zzb();
    }

    public final int zza() {
        int[] iArr;
        iArr = this.zzb.zzc;
        return iArr[this.zza + 1];
    }

    public final int zzb() {
        int[] iArr;
        if (this.zza == -1) {
            return 0;
        }
        iArr = this.zzb.zzc;
        return iArr[0];
    }
}

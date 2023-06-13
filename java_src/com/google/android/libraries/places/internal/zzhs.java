package com.google.android.libraries.places.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes6.dex */
public abstract class zzhs extends zzhp implements List, RandomAccess {
    private static final zziq zza = new zzhq(zzig.zza, 0);

    public static zzhs zzi(Object[] objArr) {
        return zzj(objArr, objArr.length);
    }

    public static zzhs zzj(Object[] objArr, int i) {
        if (i == 0) {
            return zzig.zza;
        }
        return new zzig(objArr, i);
    }

    public static zzhs zzk(Collection collection) {
        if (collection instanceof zzhp) {
            zzhs zzd = ((zzhp) collection).zzd();
            if (zzd.zzf()) {
                Object[] array = zzd.toArray();
                return zzj(array, array.length);
            }
            return zzd;
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        zzic.zza(array2, length);
        return zzj(array2, length);
    }

    public static zzhs zzl(Object[] objArr) {
        if (objArr.length == 0) {
            return zzig.zza;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzic.zza(objArr2, length);
        return zzj(objArr2, length);
    }

    public static zzhs zzm() {
        return zzig.zza;
    }

    public static zzhs zzn(Object obj) {
        Object[] objArr = {obj};
        zzic.zza(objArr, 1);
        return zzj(objArr, 1);
    }

    public static zzhs zzo(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzic.zza(objArr, 2);
        return zzj(objArr, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzhs zzp(Comparator comparator, Iterable iterable) {
        Object[] array = iterable.toArray();
        int length = array.length;
        zzic.zza(array, length);
        Arrays.sort(array, comparator);
        return zzj(array, length);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.libraries.places.internal.zzhp, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (zzgw.zza(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!zzgw.zza(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.libraries.places.internal.zzhp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.libraries.places.internal.zzhp
    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Override // com.google.android.libraries.places.internal.zzhp
    @Deprecated
    public final zzhs zzd() {
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzhp
    public final zzip zze() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzh */
    public zzhs subList(int i, int i2) {
        zzha.zzg(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return zzig.zza;
        }
        return new zzhr(this, i, i3);
    }

    @Override // java.util.List
    /* renamed from: zzq */
    public final zziq listIterator(int i) {
        zzha.zzb(i, size(), "index");
        if (isEmpty()) {
            return zza;
        }
        return new zzhq(this, i);
    }
}

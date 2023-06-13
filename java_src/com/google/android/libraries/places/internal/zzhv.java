package com.google.android.libraries.places.internal;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
/* loaded from: classes6.dex */
public abstract class zzhv implements Map, Serializable {
    private transient zzhw zza;
    private transient zzhw zzb;
    private transient zzhp zzc;

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzim.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzhw zzhwVar = this.zzb;
        if (zzhwVar == null) {
            zzhw zzd = zzd();
            this.zzb = zzd;
            return zzd;
        }
        return zzhwVar;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size >= 0) {
            StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
            sb.append(CoreConstants.CURLY_LEFT);
            boolean z = true;
            for (Map.Entry entry : entrySet()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(entry.getKey());
                sb.append('=');
                sb.append(entry.getValue());
                z = false;
            }
            sb.append(CoreConstants.CURLY_RIGHT);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append("size cannot be negative but was: ");
        sb2.append(size);
        throw new IllegalArgumentException(sb2.toString());
    }

    public abstract zzhp zza();

    @Override // java.util.Map
    /* renamed from: zzb */
    public final zzhp values() {
        zzhp zzhpVar = this.zzc;
        if (zzhpVar == null) {
            zzhp zza = zza();
            this.zzc = zza;
            return zza;
        }
        return zzhpVar;
    }

    public abstract zzhw zzc();

    public abstract zzhw zzd();

    @Override // java.util.Map
    /* renamed from: zze */
    public final zzhw entrySet() {
        zzhw zzhwVar = this.zza;
        if (zzhwVar == null) {
            zzhw zzc = zzc();
            this.zza = zzc;
            return zzc;
        }
        return zzhwVar;
    }
}

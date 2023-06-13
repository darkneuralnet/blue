package com.google.android.gms.location.places.internal;

import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.internal.places.C17542j;
import com.google.android.gms.internal.places.zzbk;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes6.dex */
public class zzaw extends DataBufferRef {
    public zzaw(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    private final byte[] zzb(String str, byte[] bArr) {
        if (!hasColumn(str) || hasNull(str)) {
            return null;
        }
        return getByteArray(str);
    }

    public final int zzc(String str, int i) {
        return (!hasColumn(str) || hasNull(str)) ? i : getInteger(str);
    }

    public final float zzb(String str, float f) {
        return (!hasColumn(str) || hasNull(str)) ? f : getFloat(str);
    }

    public final List<String> zzc(String str, List<String> list) {
        byte[] zzb = zzb(str, (byte[]) null);
        if (zzb == null) {
            return list;
        }
        try {
            C17542j m51147s = C17542j.m51147s(zzb);
            return m51147s.m51145u() == 0 ? list : m51147s.m51146t();
        } catch (zzbk e) {
            if (Log.isLoggable("SafeDataBufferRef", 6)) {
                Log.e("SafeDataBufferRef", "Cannot parse byte[]", e);
            }
            return list;
        }
    }

    public final List<Integer> zzb(String str, List<Integer> list) {
        byte[] zzb = zzb(str, (byte[]) null);
        if (zzb == null) {
            return list;
        }
        try {
            C17542j m51147s = C17542j.m51147s(zzb);
            return m51147s.m51143x() == 0 ? list : m51147s.m51144w();
        } catch (zzbk e) {
            if (Log.isLoggable("SafeDataBufferRef", 6)) {
                Log.e("SafeDataBufferRef", "Cannot parse byte[]", e);
            }
            return list;
        }
    }

    public final <E extends SafeParcelable> List<E> zzb(String str, Parcelable.Creator<E> creator, List<E> list) {
        byte[] zzb = zzb(str, (byte[]) null);
        if (zzb == null) {
            return list;
        }
        try {
            C17542j m51147s = C17542j.m51147s(zzb);
            if (m51147s.m51141z() == 0) {
                return list;
            }
            ArrayList arrayList = new ArrayList(m51147s.m51141z());
            for (AbstractC43604jv9 abstractC43604jv9 : m51147s.m51142y()) {
                arrayList.add(SafeParcelableSerializer.deserializeFromBytes(abstractC43604jv9.m29754a(), creator));
            }
            return arrayList;
        } catch (zzbk e) {
            if (Log.isLoggable("SafeDataBufferRef", 6)) {
                Log.e("SafeDataBufferRef", "Cannot parse byte[]", e);
            }
            return list;
        }
    }

    public final <E extends SafeParcelable> E zzb(String str, Parcelable.Creator<E> creator) {
        byte[] zzb = zzb(str, (byte[]) null);
        if (zzb == null) {
            return null;
        }
        return (E) SafeParcelableSerializer.deserializeFromBytes(zzb, creator);
    }

    public final String zzb(String str, String str2) {
        return (!hasColumn(str) || hasNull(str)) ? str2 : getString(str);
    }
}

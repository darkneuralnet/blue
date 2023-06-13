package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
@SafeParcelable.Class(creator = "RemoveGeofencingRequestCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes6.dex */
public final class zzbq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbq> CREATOR = new zzbr();
    @SafeParcelable.Field(getter = "getGeofenceIds", m51606id = 1)
    private final List<String> zza;
    @SafeParcelable.Field(getter = "getPendingIntent", m51606id = 2)
    private final PendingIntent zzb;
    @SafeParcelable.Field(defaultValue = "", getter = "getTag", m51606id = 3)
    private final String zzc;

    @SafeParcelable.Constructor
    public zzbq(@SafeParcelable.Param(m51605id = 1) List<String> list, @SafeParcelable.Param(m51605id = 2) PendingIntent pendingIntent, @SafeParcelable.Param(m51605id = 3) String str) {
        AbstractC42089hN7 m36479u;
        if (list == null) {
            m36479u = AbstractC42089hN7.m36480s();
        } else {
            m36479u = AbstractC42089hN7.m36479u(list);
        }
        this.zza = m36479u;
        this.zzb = pendingIntent;
        this.zzc = str;
    }

    public static zzbq zza(List<String> list) {
        Preconditions.checkNotNull(list, "geofence can't be null.");
        Preconditions.checkArgument(!list.isEmpty(), "Geofences must contains at least one id.");
        return new zzbq(list, null, "");
    }

    public static zzbq zzb(PendingIntent pendingIntent) {
        Preconditions.checkNotNull(pendingIntent, "PendingIntent can not be null.");
        return new zzbq(null, pendingIntent, "");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringList(parcel, 1, this.zza, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

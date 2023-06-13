package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
@SafeParcelable.Class(creator = "LocationAvailabilityCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes6.dex */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new zzbe();
    @SafeParcelable.Field(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", m51606id = 1)
    @Deprecated
    int zza;
    @SafeParcelable.Field(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", m51606id = 2)
    @Deprecated
    int zzb;
    @SafeParcelable.Field(defaultValueUnchecked = "0", m51606id = 3)
    long zzc;
    @SafeParcelable.Field(defaultValueUnchecked = "LocationAvailability.STATUS_UNSUCCESSFUL", m51606id = 4)
    int zzd;
    @SafeParcelable.Field(m51606id = 5)
    zzbo[] zze;

    @SafeParcelable.Constructor
    public LocationAvailability(@SafeParcelable.Param(m51605id = 4) int i, @SafeParcelable.Param(m51605id = 1) int i2, @SafeParcelable.Param(m51605id = 2) int i3, @SafeParcelable.Param(m51605id = 3) long j, @SafeParcelable.Param(m51605id = 5) zzbo[] zzboVarArr) {
        this.zzd = i;
        this.zza = i2;
        this.zzb = i3;
        this.zzc = j;
        this.zze = zzboVarArr;
    }

    public static LocationAvailability extractLocationAvailability(Intent intent) {
        if (!hasLocationAvailability(intent)) {
            return null;
        }
        try {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return null;
            }
            return (LocationAvailability) extras.getParcelable("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public static boolean hasLocationAvailability(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.zza == locationAvailability.zza && this.zzb == locationAvailability.zzb && this.zzc == locationAvailability.zzc && this.zzd == locationAvailability.zzd && Arrays.equals(this.zze, locationAvailability.zze)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzd), Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Long.valueOf(this.zzc), this.zze);
    }

    public boolean isLocationAvailable() {
        return this.zzd < 1000;
    }

    public String toString() {
        boolean isLocationAvailable = isLocationAvailable();
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(isLocationAvailable);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeLong(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.zze, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
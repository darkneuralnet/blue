package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "ConnectionInfoCreator")
/* loaded from: classes5.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();
    @SafeParcelable.Field(m51606id = 1)
    Bundle zza;
    @SafeParcelable.Field(m51606id = 2)
    Feature[] zzb;
    @SafeParcelable.Field(defaultValue = "0", m51606id = 3)
    int zzc;
    @SafeParcelable.Field(m51606id = 4)
    ConnectionTelemetryConfiguration zzd;

    @SafeParcelable.Constructor
    public zzj(@SafeParcelable.Param(m51605id = 1) Bundle bundle, @SafeParcelable.Param(m51605id = 2) Feature[] featureArr, @SafeParcelable.Param(m51605id = 3) int i, @SafeParcelable.Param(m51605id = 4) ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.zza = bundle;
        this.zzb = featureArr;
        this.zzc = i;
        this.zzd = connectionTelemetryConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, this.zza, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.zzb, i, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzj() {
    }
}

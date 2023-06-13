package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.PlaceLikelihood;
@SafeParcelable.Class(creator = "PlaceLikelihoodEntityCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes6.dex */
public final class zzak extends AbstractSafeParcelable implements PlaceLikelihood {
    public static final Parcelable.Creator<zzak> CREATOR = new zzaj();
    @SafeParcelable.Field(m51606id = 1)
    private final PlaceEntity zzcj;
    @SafeParcelable.Field(m51606id = 2)
    private final float zzck;

    @SafeParcelable.Constructor
    public zzak(@SafeParcelable.Param(m51605id = 1) PlaceEntity placeEntity, @SafeParcelable.Param(m51605id = 2) float f) {
        this.zzcj = placeEntity;
        this.zzck = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzak)) {
            return false;
        }
        zzak zzakVar = (zzak) obj;
        if (this.zzcj.equals(zzakVar.zzcj) && this.zzck == zzakVar.zzck) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ PlaceLikelihood freeze() {
        return this;
    }

    @Override // com.google.android.gms.location.places.PlaceLikelihood
    public final float getLikelihood() {
        return this.zzck;
    }

    @Override // com.google.android.gms.location.places.PlaceLikelihood
    public final Place getPlace() {
        return this.zzcj;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzcj, Float.valueOf(this.zzck));
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("place", this.zzcj).add("likelihood", Float.valueOf(this.zzck)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zzcj, i, false);
        SafeParcelWriter.writeFloat(parcel, 2, this.zzck);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

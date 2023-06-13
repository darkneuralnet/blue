package com.google.android.gms.wallet.button;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "GetInstrumentAvailabilityResponseCreator")
/* loaded from: classes6.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new C43374jY7();
    @SafeParcelable.Field(getter = "getLastUsedInstrumentSuffix", m51606id = 1)

    /* renamed from: b */
    public String f72019b;
    @SafeParcelable.Field(getter = "getLastUsedInstrumentCardNetwork", m51606id = 2)

    /* renamed from: c */
    public int f72020c;

    private zzc() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f72019b, false);
        SafeParcelWriter.writeInt(parcel, 2, this.f72020c);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzc(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) int i) {
        this.f72019b = str;
        this.f72020c = i;
    }
}

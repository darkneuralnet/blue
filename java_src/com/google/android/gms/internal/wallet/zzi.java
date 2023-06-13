package com.google.android.gms.internal.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@ShowFirstParty
@SafeParcelable.Class(creator = "SetUpBiometricAuthenticationKeysResponseCreator")
/* loaded from: classes6.dex */
public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new SG8();
    @SafeParcelable.Field(m51606id = 1)

    /* renamed from: b */
    public final byte[] f71357b;

    @SafeParcelable.Constructor
    public zzi(@SafeParcelable.Param(m51605id = 1) byte[] bArr) {
        this.f71357b = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 1, this.f71357b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

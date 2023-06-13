package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "BeginSignInResultCreator")
/* loaded from: classes5.dex */
public final class BeginSignInResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInResult> CREATOR = new zbb();
    @SafeParcelable.Field(getter = "getPendingIntent", m51606id = 1)
    private final PendingIntent zba;

    @SafeParcelable.Constructor
    public BeginSignInResult(@SafeParcelable.Param(m51605id = 1) PendingIntent pendingIntent) {
        this.zba = (PendingIntent) Preconditions.checkNotNull(pendingIntent);
    }

    public PendingIntent getPendingIntent() {
        return this.zba;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getPendingIntent(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

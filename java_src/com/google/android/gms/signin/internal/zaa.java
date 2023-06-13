package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "AuthAccountResultCreator")
/* loaded from: classes6.dex */
public final class zaa extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zaa> CREATOR = new HP6();
    @SafeParcelable.VersionField(m51603id = 1)

    /* renamed from: b */
    public final int f71784b;
    @SafeParcelable.Field(getter = "getConnectionResultCode", m51606id = 2)

    /* renamed from: c */
    public int f71785c;
    @SafeParcelable.Field(getter = "getRawAuthResolutionIntent", m51606id = 3)

    /* renamed from: d */
    public Intent f71786d;

    public zaa() {
        this(2, 0, null);
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        if (this.f71785c == 0) {
            return Status.RESULT_SUCCESS;
        }
        return Status.RESULT_CANCELED;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f71784b);
        SafeParcelWriter.writeInt(parcel, 2, this.f71785c);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f71786d, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zaa(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) int i2, @SafeParcelable.Param(m51605id = 3) Intent intent) {
        this.f71784b = i;
        this.f71785c = i2;
        this.f71786d = intent;
    }
}

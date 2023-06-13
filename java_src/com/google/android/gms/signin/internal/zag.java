package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
@SafeParcelable.Class(creator = "RecordConsentByConsentResultResponseCreator")
/* loaded from: classes6.dex */
public final class zag extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zag> CREATOR = new C38540bQ6();
    @SafeParcelable.Field(getter = "getGrantedScopes", m51606id = 1)

    /* renamed from: b */
    public final List f71787b;
    @SafeParcelable.Field(getter = "getToken", m51606id = 2)

    /* renamed from: c */
    public final String f71788c;

    @SafeParcelable.Constructor
    public zag(@SafeParcelable.Param(m51605id = 1) List list, @SafeParcelable.Param(m51605id = 2) String str) {
        this.f71787b = list;
        this.f71788c = str;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        if (this.f71788c != null) {
            return Status.RESULT_SUCCESS;
        }
        return Status.RESULT_CANCELED;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringList(parcel, 1, this.f71787b, false);
        SafeParcelWriter.writeString(parcel, 2, this.f71788c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

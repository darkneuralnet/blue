package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "CloudMessageCreator")
/* loaded from: classes5.dex */
public final class CloudMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CloudMessage> CREATOR = new C34698Ne7();
    @SafeParcelable.Field(m51606id = 1)

    /* renamed from: b */
    public Intent f70335b;

    @SafeParcelable.Constructor
    public CloudMessage(@SafeParcelable.Param(m51605id = 1) Intent intent) {
        this.f70335b = intent;
    }

    /* renamed from: s */
    public Intent m51624s() {
        return this.f70335b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f70335b, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

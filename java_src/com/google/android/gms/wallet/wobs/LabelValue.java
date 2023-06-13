package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "LabelValueCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class LabelValue extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LabelValue> CREATOR = new C43967kY7();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public String f72040b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public String f72041c;

    public LabelValue() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f72040b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f72041c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public LabelValue(@SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) String str2) {
        this.f72040b = str;
        this.f72041c = str2;
    }
}

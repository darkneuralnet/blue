package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "AppIdentifierCreator")
@SafeParcelable.Reserved({1000})
@Deprecated
/* loaded from: classes6.dex */
public final class AppIdentifier extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AppIdentifier> CREATOR = new TP7();
    @SafeParcelable.Field(getter = "getIdentifier", m51606id = 1)

    /* renamed from: b */
    public final String f71588b;

    @SafeParcelable.Constructor
    public AppIdentifier(@SafeParcelable.Param(m51605id = 1) String str) {
        this.f71588b = Preconditions.checkNotEmpty(str, "Missing application identifier value");
    }

    /* renamed from: s */
    public String m50577s() {
        return this.f71588b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, m50577s(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

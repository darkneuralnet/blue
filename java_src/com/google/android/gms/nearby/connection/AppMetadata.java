package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
@SafeParcelable.Class(creator = "AppMetadataCreator")
@SafeParcelable.Reserved({1000})
@Deprecated
/* loaded from: classes6.dex */
public final class AppMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AppMetadata> CREATOR = new C38613bY7();
    @SafeParcelable.Field(getter = "getAppIdentifiers", m51606id = 1)

    /* renamed from: b */
    public final List<AppIdentifier> f71589b;

    @SafeParcelable.Constructor
    public AppMetadata(@SafeParcelable.Param(m51605id = 1) List<AppIdentifier> list) {
        this.f71589b = (List) Preconditions.checkNotNull(list, "Must specify application identifiers");
        Preconditions.checkNotZero(list.size(), (Object) "Application identifiers cannot be empty");
    }

    /* renamed from: s */
    public List<AppIdentifier> m50576s() {
        return this.f71589b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, m50576s(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

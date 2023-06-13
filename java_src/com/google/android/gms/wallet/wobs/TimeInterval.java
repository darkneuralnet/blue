package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "TimeIntervalCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class TimeInterval extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TimeInterval> CREATOR = new CT8();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public long f72056b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public long f72057c;

    public TimeInterval() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 2, this.f72056b);
        SafeParcelWriter.writeLong(parcel, 3, this.f72057c);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public TimeInterval(@SafeParcelable.Param(m51605id = 2) long j, @SafeParcelable.Param(m51605id = 3) long j2) {
        this.f72056b = j;
        this.f72057c = j2;
    }
}

package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "InitializationParamsCreator")
/* loaded from: classes5.dex */
public final class zzcl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcl> CREATOR = new C39781dU7();
    @SafeParcelable.Field(m51606id = 1)

    /* renamed from: b */
    public final long f70566b;
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: c */
    public final long f70567c;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: d */
    public final boolean f70568d;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: e */
    public final String f70569e;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: f */
    public final String f70570f;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: g */
    public final String f70571g;
    @SafeParcelable.Field(m51606id = 7)

    /* renamed from: h */
    public final Bundle f70572h;
    @SafeParcelable.Field(m51606id = 8)

    /* renamed from: i */
    public final String f70573i;

    @SafeParcelable.Constructor
    public zzcl(@SafeParcelable.Param(m51605id = 1) long j, @SafeParcelable.Param(m51605id = 2) long j2, @SafeParcelable.Param(m51605id = 3) boolean z, @SafeParcelable.Param(m51605id = 4) String str, @SafeParcelable.Param(m51605id = 5) String str2, @SafeParcelable.Param(m51605id = 6) String str3, @SafeParcelable.Param(m51605id = 7) Bundle bundle, @SafeParcelable.Param(m51605id = 8) String str4) {
        this.f70566b = j;
        this.f70567c = j2;
        this.f70568d = z;
        this.f70569e = str;
        this.f70570f = str2;
        this.f70571g = str3;
        this.f70572h = bundle;
        this.f70573i = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.f70566b);
        SafeParcelWriter.writeLong(parcel, 2, this.f70567c);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f70568d);
        SafeParcelWriter.writeString(parcel, 4, this.f70569e, false);
        SafeParcelWriter.writeString(parcel, 5, this.f70570f, false);
        SafeParcelWriter.writeString(parcel, 6, this.f70571g, false);
        SafeParcelWriter.writeBundle(parcel, 7, this.f70572h, false);
        SafeParcelWriter.writeString(parcel, 8, this.f70573i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

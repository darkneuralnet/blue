package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "ImageMetadataParcelCreator")
/* loaded from: classes6.dex */
public final class zzfz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfz> CREATOR = new C31954Bl8();
    @SafeParcelable.Field(getter = "getImageFormat", m51606id = 1)

    /* renamed from: b */
    public final int f71334b;
    @SafeParcelable.Field(getter = "getWidth", m51606id = 2)

    /* renamed from: c */
    public final int f71335c;
    @SafeParcelable.Field(getter = "getHeight", m51606id = 3)

    /* renamed from: d */
    public final int f71336d;
    @SafeParcelable.Field(getter = "getRotation", m51606id = 4)

    /* renamed from: e */
    public final int f71337e;
    @SafeParcelable.Field(getter = "getTimestampMs", m51606id = 5)

    /* renamed from: f */
    public final long f71338f;

    @SafeParcelable.Constructor
    public zzfz(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) int i2, @SafeParcelable.Param(m51605id = 3) int i3, @SafeParcelable.Param(m51605id = 4) int i4, @SafeParcelable.Param(m51605id = 5) long j) {
        this.f71334b = i;
        this.f71335c = i2;
        this.f71336d = i3;
        this.f71337e = i4;
        this.f71338f = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f71334b);
        SafeParcelWriter.writeInt(parcel, 2, this.f71335c);
        SafeParcelWriter.writeInt(parcel, 3, this.f71336d);
        SafeParcelWriter.writeInt(parcel, 4, this.f71337e);
        SafeParcelWriter.writeLong(parcel, 5, this.f71338f);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

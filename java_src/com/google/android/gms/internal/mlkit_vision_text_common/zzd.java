package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "FrameMetadataParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new C41340g68();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public int f70971b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public int f70972c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public int f70973d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public long f70974e;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: f */
    public int f70975f;

    public zzd() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f70971b);
        SafeParcelWriter.writeInt(parcel, 3, this.f70972c);
        SafeParcelWriter.writeInt(parcel, 4, this.f70973d);
        SafeParcelWriter.writeLong(parcel, 5, this.f70974e);
        SafeParcelWriter.writeInt(parcel, 6, this.f70975f);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzd(@SafeParcelable.Param(m51605id = 2) int i, @SafeParcelable.Param(m51605id = 3) int i2, @SafeParcelable.Param(m51605id = 4) int i3, @SafeParcelable.Param(m51605id = 5) long j, @SafeParcelable.Param(m51605id = 6) int i4) {
        this.f70971b = i;
        this.f70972c = i2;
        this.f70973d = i3;
        this.f70974e = j;
        this.f70975f = i4;
    }
}

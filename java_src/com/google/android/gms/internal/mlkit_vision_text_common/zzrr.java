package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "ImageMetadataParcelCreator")
/* loaded from: classes5.dex */
public final class zzrr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzrr> CREATOR = new Pn9();
    @SafeParcelable.Field(getter = "getImageFormat", m51606id = 1)

    /* renamed from: b */
    public final int f71000b;
    @SafeParcelable.Field(getter = "getWidth", m51606id = 2)

    /* renamed from: c */
    public final int f71001c;
    @SafeParcelable.Field(getter = "getHeight", m51606id = 3)

    /* renamed from: d */
    public final int f71002d;
    @SafeParcelable.Field(getter = "getRotation", m51606id = 4)

    /* renamed from: e */
    public final int f71003e;
    @SafeParcelable.Field(getter = "getTimestampMs", m51606id = 5)

    /* renamed from: f */
    public final long f71004f;

    @SafeParcelable.Constructor
    public zzrr(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) int i2, @SafeParcelable.Param(m51605id = 3) int i3, @SafeParcelable.Param(m51605id = 4) int i4, @SafeParcelable.Param(m51605id = 5) long j) {
        this.f71000b = i;
        this.f71001c = i2;
        this.f71002d = i3;
        this.f71003e = i4;
        this.f71004f = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f71000b);
        SafeParcelWriter.writeInt(parcel, 2, this.f71001c);
        SafeParcelWriter.writeInt(parcel, 3, this.f71002d);
        SafeParcelWriter.writeInt(parcel, 4, this.f71003e);
        SafeParcelWriter.writeLong(parcel, 5, this.f71004f);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

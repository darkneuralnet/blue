package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "FrameMetadataParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new C36192To7();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public int f70576b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public int f70577c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public int f70578d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public long f70579e;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: f */
    public int f70580f;

    public zzaj() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f70576b);
        SafeParcelWriter.writeInt(parcel, 3, this.f70577c);
        SafeParcelWriter.writeInt(parcel, 4, this.f70578d);
        SafeParcelWriter.writeLong(parcel, 5, this.f70579e);
        SafeParcelWriter.writeInt(parcel, 6, this.f70580f);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzaj(@SafeParcelable.Param(m51605id = 2) int i, @SafeParcelable.Param(m51605id = 3) int i2, @SafeParcelable.Param(m51605id = 4) int i3, @SafeParcelable.Param(m51605id = 5) long j, @SafeParcelable.Param(m51605id = 6) int i4) {
        this.f70576b = i;
        this.f70577c = i2;
        this.f70578d = i3;
        this.f70579e = j;
        this.f70580f = i4;
    }
}

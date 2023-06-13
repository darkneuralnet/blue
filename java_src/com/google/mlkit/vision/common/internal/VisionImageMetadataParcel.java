package com.google.mlkit.vision.common.internal;

import android.graphics.Matrix;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@KeepForSdk
@SafeParcelable.Class(creator = "VisionImageMetadataParcelCreator")
/* loaded from: classes6.dex */
public class VisionImageMetadataParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VisionImageMetadataParcel> CREATOR = new C31729Am8();
    @KeepForSdk
    @SafeParcelable.Field(m51606id = 1)

    /* renamed from: b */
    public final int f74670b;
    @KeepForSdk
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: c */
    public final int f74671c;
    @KeepForSdk
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public final long f74672d;
    @KeepForSdk
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public final int f74673e;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: f */
    public final int f74674f;

    @SafeParcelable.Constructor
    public VisionImageMetadataParcel(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) int i2, @SafeParcelable.Param(m51605id = 3) int i3, @SafeParcelable.Param(m51605id = 4) long j, @SafeParcelable.Param(m51605id = 5) int i4) {
        this.f74670b = i;
        this.f74671c = i2;
        this.f74674f = i3;
        this.f74672d = j;
        this.f74673e = i4;
    }

    @KeepForSdk
    /* renamed from: s */
    public Matrix m46759s() {
        return C48704sY1.m14056b().m14053e(this.f74670b, this.f74671c, this.f74673e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f74670b);
        SafeParcelWriter.writeInt(parcel, 2, this.f74671c);
        SafeParcelWriter.writeInt(parcel, 3, this.f74674f);
        SafeParcelWriter.writeLong(parcel, 4, this.f74672d);
        SafeParcelWriter.writeInt(parcel, 5, this.f74673e);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

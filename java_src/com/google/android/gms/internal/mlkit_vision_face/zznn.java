package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "ImageMetadataParcelCreator")
/* loaded from: classes5.dex */
public final class zznn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznn> CREATOR = new C46095o79();
    @SafeParcelable.Field(getter = "getImageFormat", m51606id = 1)

    /* renamed from: b */
    public final int f70850b;
    @SafeParcelable.Field(getter = "getWidth", m51606id = 2)

    /* renamed from: c */
    public final int f70851c;
    @SafeParcelable.Field(getter = "getHeight", m51606id = 3)

    /* renamed from: d */
    public final int f70852d;
    @SafeParcelable.Field(getter = "getRotation", m51606id = 4)

    /* renamed from: e */
    public final int f70853e;
    @SafeParcelable.Field(getter = "getTimestampMs", m51606id = 5)

    /* renamed from: f */
    public final long f70854f;

    @SafeParcelable.Constructor
    public zznn(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) int i2, @SafeParcelable.Param(m51605id = 3) int i3, @SafeParcelable.Param(m51605id = 4) int i4, @SafeParcelable.Param(m51605id = 5) long j) {
        this.f70850b = i;
        this.f70851c = i2;
        this.f70852d = i3;
        this.f70853e = i4;
        this.f70854f = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f70850b);
        SafeParcelWriter.writeInt(parcel, 2, this.f70851c);
        SafeParcelWriter.writeInt(parcel, 3, this.f70852d);
        SafeParcelWriter.writeInt(parcel, 4, this.f70853e);
        SafeParcelWriter.writeLong(parcel, 5, this.f70854f);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

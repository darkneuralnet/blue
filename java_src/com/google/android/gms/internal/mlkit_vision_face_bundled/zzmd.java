package com.google.android.gms.internal.mlkit_vision_face_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "ImageMetadataParcelCreator")
/* loaded from: classes5.dex */
public final class zzmd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmd> CREATOR = new C52546z09();
    @SafeParcelable.Field(getter = "getImageFormat", m51606id = 1)

    /* renamed from: b */
    public final int f70881b;
    @SafeParcelable.Field(getter = "getWidth", m51606id = 2)

    /* renamed from: c */
    public final int f70882c;
    @SafeParcelable.Field(getter = "getHeight", m51606id = 3)

    /* renamed from: d */
    public final int f70883d;
    @SafeParcelable.Field(getter = "getRotation", m51606id = 4)

    /* renamed from: e */
    public final int f70884e;
    @SafeParcelable.Field(getter = "getTimestampMs", m51606id = 5)

    /* renamed from: f */
    public final long f70885f;

    @SafeParcelable.Constructor
    public zzmd(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) int i2, @SafeParcelable.Param(m51605id = 3) int i3, @SafeParcelable.Param(m51605id = 4) int i4, @SafeParcelable.Param(m51605id = 5) long j) {
        this.f70881b = i;
        this.f70882c = i2;
        this.f70883d = i3;
        this.f70884e = i4;
        this.f70885f = j;
    }

    /* renamed from: s */
    public final int m51301s() {
        return this.f70881b;
    }

    /* renamed from: u */
    public final long m51300u() {
        return this.f70885f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f70881b);
        SafeParcelWriter.writeInt(parcel, 2, this.f70882c);
        SafeParcelWriter.writeInt(parcel, 3, this.f70883d);
        SafeParcelWriter.writeInt(parcel, 4, this.f70884e);
        SafeParcelWriter.writeLong(parcel, 5, this.f70885f);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.f70883d;
    }

    public final int zzc() {
        return this.f70884e;
    }

    public final int zzd() {
        return this.f70882c;
    }
}

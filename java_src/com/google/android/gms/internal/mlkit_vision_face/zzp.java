package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "FrameMetadataParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new C51764xh9();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public int f70876b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public int f70877c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public int f70878d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public long f70879e;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: f */
    public int f70880f;

    public zzp() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f70876b);
        SafeParcelWriter.writeInt(parcel, 3, this.f70877c);
        SafeParcelWriter.writeInt(parcel, 4, this.f70878d);
        SafeParcelWriter.writeLong(parcel, 5, this.f70879e);
        SafeParcelWriter.writeInt(parcel, 6, this.f70880f);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzp(@SafeParcelable.Param(m51605id = 2) int i, @SafeParcelable.Param(m51605id = 3) int i2, @SafeParcelable.Param(m51605id = 4) int i3, @SafeParcelable.Param(m51605id = 5) long j, @SafeParcelable.Param(m51605id = 6) int i4) {
        this.f70876b = i;
        this.f70877c = i2;
        this.f70878d = i3;
        this.f70879e = j;
        this.f70880f = i4;
    }
}

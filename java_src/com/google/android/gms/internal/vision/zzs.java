package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "FrameMetadataParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new Mt9();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public int f71350b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public int f71351c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public int f71352d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public long f71353e;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: f */
    public int f71354f;

    public zzs() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f71350b);
        SafeParcelWriter.writeInt(parcel, 3, this.f71351c);
        SafeParcelWriter.writeInt(parcel, 4, this.f71352d);
        SafeParcelWriter.writeLong(parcel, 5, this.f71353e);
        SafeParcelWriter.writeInt(parcel, 6, this.f71354f);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzs(@SafeParcelable.Param(m51605id = 2) int i, @SafeParcelable.Param(m51605id = 3) int i2, @SafeParcelable.Param(m51605id = 4) int i3, @SafeParcelable.Param(m51605id = 5) long j, @SafeParcelable.Param(m51605id = 6) int i4) {
        this.f71350b = i;
        this.f71351c = i2;
        this.f71352d = i3;
        this.f71353e = j;
        this.f71354f = i4;
    }
}

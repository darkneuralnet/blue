package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "BoundingBoxParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = new C32367Df7();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public final int f71309b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public final int f71310c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public final int f71311d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public final int f71312e;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: f */
    public final float f71313f;

    @SafeParcelable.Constructor
    public zzab(@SafeParcelable.Param(m51605id = 2) int i, @SafeParcelable.Param(m51605id = 3) int i2, @SafeParcelable.Param(m51605id = 4) int i3, @SafeParcelable.Param(m51605id = 5) int i4, @SafeParcelable.Param(m51605id = 6) float f) {
        this.f71309b = i;
        this.f71310c = i2;
        this.f71311d = i3;
        this.f71312e = i4;
        this.f71313f = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f71309b);
        SafeParcelWriter.writeInt(parcel, 3, this.f71310c);
        SafeParcelWriter.writeInt(parcel, 4, this.f71311d);
        SafeParcelWriter.writeInt(parcel, 5, this.f71312e);
        SafeParcelWriter.writeFloat(parcel, 6, this.f71313f);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

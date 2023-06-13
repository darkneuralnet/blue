package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "FaceSettingsParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new C49048t68();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public int f71892b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public int f71893c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public int f71894d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public boolean f71895e;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: f */
    public boolean f71896f;
    @SafeParcelable.Field(defaultValue = "-1", m51606id = 7)

    /* renamed from: g */
    public float f71897g;

    public zzf() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f71892b);
        SafeParcelWriter.writeInt(parcel, 3, this.f71893c);
        SafeParcelWriter.writeInt(parcel, 4, this.f71894d);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f71895e);
        SafeParcelWriter.writeBoolean(parcel, 6, this.f71896f);
        SafeParcelWriter.writeFloat(parcel, 7, this.f71897g);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzf(@SafeParcelable.Param(m51605id = 2) int i, @SafeParcelable.Param(m51605id = 3) int i2, @SafeParcelable.Param(m51605id = 4) int i3, @SafeParcelable.Param(m51605id = 5) boolean z, @SafeParcelable.Param(m51605id = 6) boolean z2, @SafeParcelable.Param(m51605id = 7) float f) {
        this.f71892b = i;
        this.f71893c = i2;
        this.f71894d = i3;
        this.f71895e = z;
        this.f71896f = z2;
        this.f71897g = f;
    }
}

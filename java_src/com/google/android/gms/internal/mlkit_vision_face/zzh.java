package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "FaceSettingsParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new C41973hA8();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public int f70840b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public int f70841c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public int f70842d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public boolean f70843e;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: f */
    public boolean f70844f;
    @SafeParcelable.Field(defaultValue = "-1", m51606id = 7)

    /* renamed from: g */
    public float f70845g;

    public zzh() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f70840b);
        SafeParcelWriter.writeInt(parcel, 3, this.f70841c);
        SafeParcelWriter.writeInt(parcel, 4, this.f70842d);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f70843e);
        SafeParcelWriter.writeBoolean(parcel, 6, this.f70844f);
        SafeParcelWriter.writeFloat(parcel, 7, this.f70845g);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzh(@SafeParcelable.Param(m51605id = 2) int i, @SafeParcelable.Param(m51605id = 3) int i2, @SafeParcelable.Param(m51605id = 4) int i3, @SafeParcelable.Param(m51605id = 5) boolean z, @SafeParcelable.Param(m51605id = 6) boolean z2, @SafeParcelable.Param(m51605id = 7) float f) {
        this.f70840b = i;
        this.f70841c = i2;
        this.f70842d = i3;
        this.f70843e = z;
        this.f70844f = z2;
        this.f70845g = f;
    }
}

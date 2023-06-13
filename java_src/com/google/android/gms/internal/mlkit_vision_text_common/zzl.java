package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "LineBoxParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new C42791iZ8();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public final zzr[] f70981b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public final zzf f70982c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public final zzf f70983d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public final zzf f70984e;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: f */
    public final String f70985f;
    @SafeParcelable.Field(m51606id = 7)

    /* renamed from: g */
    public final float f70986g;
    @SafeParcelable.Field(m51606id = 8)

    /* renamed from: h */
    public final String f70987h;
    @SafeParcelable.Field(m51606id = 9)

    /* renamed from: i */
    public final int f70988i;
    @SafeParcelable.Field(m51606id = 10)

    /* renamed from: j */
    public final boolean f70989j;
    @SafeParcelable.Field(m51606id = 11)

    /* renamed from: k */
    public final int f70990k;
    @SafeParcelable.Field(m51606id = 12)

    /* renamed from: l */
    public final int f70991l;

    @SafeParcelable.Constructor
    public zzl(@SafeParcelable.Param(m51605id = 2) zzr[] zzrVarArr, @SafeParcelable.Param(m51605id = 3) zzf zzfVar, @SafeParcelable.Param(m51605id = 4) zzf zzfVar2, @SafeParcelable.Param(m51605id = 5) zzf zzfVar3, @SafeParcelable.Param(m51605id = 6) String str, @SafeParcelable.Param(m51605id = 7) float f, @SafeParcelable.Param(m51605id = 8) String str2, @SafeParcelable.Param(m51605id = 9) int i, @SafeParcelable.Param(m51605id = 10) boolean z, @SafeParcelable.Param(m51605id = 11) int i2, @SafeParcelable.Param(m51605id = 12) int i3) {
        this.f70981b = zzrVarArr;
        this.f70982c = zzfVar;
        this.f70983d = zzfVar2;
        this.f70984e = zzfVar3;
        this.f70985f = str;
        this.f70986g = f;
        this.f70987h = str2;
        this.f70988i = i;
        this.f70989j = z;
        this.f70990k = i2;
        this.f70991l = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.f70981b, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f70982c, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f70983d, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f70984e, i, false);
        SafeParcelWriter.writeString(parcel, 6, this.f70985f, false);
        SafeParcelWriter.writeFloat(parcel, 7, this.f70986g);
        SafeParcelWriter.writeString(parcel, 8, this.f70987h, false);
        SafeParcelWriter.writeInt(parcel, 9, this.f70988i);
        SafeParcelWriter.writeBoolean(parcel, 10, this.f70989j);
        SafeParcelWriter.writeInt(parcel, 11, this.f70990k);
        SafeParcelWriter.writeInt(parcel, 12, this.f70991l);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

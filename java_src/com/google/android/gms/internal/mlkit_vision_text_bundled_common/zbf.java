package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "LineBoxParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class zbf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zbf> CREATOR = new C41309g37();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public final zbj[] f70915b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public final zbd f70916c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public final zbd f70917d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public final zbd f70918e;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: f */
    public final String f70919f;
    @SafeParcelable.Field(m51606id = 7)

    /* renamed from: g */
    public final float f70920g;
    @SafeParcelable.Field(m51606id = 8)

    /* renamed from: h */
    public final String f70921h;
    @SafeParcelable.Field(m51606id = 9)

    /* renamed from: i */
    public final int f70922i;
    @SafeParcelable.Field(m51606id = 10)

    /* renamed from: j */
    public final boolean f70923j;
    @SafeParcelable.Field(m51606id = 11)

    /* renamed from: k */
    public final int f70924k;
    @SafeParcelable.Field(m51606id = 12)

    /* renamed from: l */
    public final int f70925l;

    @SafeParcelable.Constructor
    public zbf(@SafeParcelable.Param(m51605id = 2) zbj[] zbjVarArr, @SafeParcelable.Param(m51605id = 3) zbd zbdVar, @SafeParcelable.Param(m51605id = 4) zbd zbdVar2, @SafeParcelable.Param(m51605id = 5) zbd zbdVar3, @SafeParcelable.Param(m51605id = 6) String str, @SafeParcelable.Param(m51605id = 7) float f, @SafeParcelable.Param(m51605id = 8) String str2, @SafeParcelable.Param(m51605id = 9) int i, @SafeParcelable.Param(m51605id = 10) boolean z, @SafeParcelable.Param(m51605id = 11) int i2, @SafeParcelable.Param(m51605id = 12) int i3) {
        this.f70915b = zbjVarArr;
        this.f70916c = zbdVar;
        this.f70917d = zbdVar2;
        this.f70918e = zbdVar3;
        this.f70919f = str;
        this.f70920g = f;
        this.f70921h = str2;
        this.f70922i = i;
        this.f70923j = z;
        this.f70924k = i2;
        this.f70925l = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.f70915b, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f70916c, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f70917d, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f70918e, i, false);
        SafeParcelWriter.writeString(parcel, 6, this.f70919f, false);
        SafeParcelWriter.writeFloat(parcel, 7, this.f70920g);
        SafeParcelWriter.writeString(parcel, 8, this.f70921h, false);
        SafeParcelWriter.writeInt(parcel, 9, this.f70922i);
        SafeParcelWriter.writeBoolean(parcel, 10, this.f70923j);
        SafeParcelWriter.writeInt(parcel, 11, this.f70924k);
        SafeParcelWriter.writeInt(parcel, 12, this.f70925l);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

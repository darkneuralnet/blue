package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "WordBoxParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class zzao extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzao> CREATOR = new C50114uu7();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public final zzal[] f71327b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public final zzab f71328c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public final zzab f71329d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public final String f71330e;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: f */
    public final float f71331f;
    @SafeParcelable.Field(m51606id = 7)

    /* renamed from: g */
    public final String f71332g;
    @SafeParcelable.Field(m51606id = 8)

    /* renamed from: h */
    public final boolean f71333h;

    @SafeParcelable.Constructor
    public zzao(@SafeParcelable.Param(m51605id = 2) zzal[] zzalVarArr, @SafeParcelable.Param(m51605id = 3) zzab zzabVar, @SafeParcelable.Param(m51605id = 4) zzab zzabVar2, @SafeParcelable.Param(m51605id = 5) String str, @SafeParcelable.Param(m51605id = 6) float f, @SafeParcelable.Param(m51605id = 7) String str2, @SafeParcelable.Param(m51605id = 8) boolean z) {
        this.f71327b = zzalVarArr;
        this.f71328c = zzabVar;
        this.f71329d = zzabVar2;
        this.f71330e = str;
        this.f71331f = f;
        this.f71332g = str2;
        this.f71333h = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.f71327b, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f71328c, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f71329d, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.f71330e, false);
        SafeParcelWriter.writeFloat(parcel, 6, this.f71331f);
        SafeParcelWriter.writeString(parcel, 7, this.f71332g, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.f71333h);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

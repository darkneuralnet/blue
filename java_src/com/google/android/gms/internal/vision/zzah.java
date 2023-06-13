package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "LineBoxParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new C40537el7();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public final zzao[] f71314b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public final zzab f71315c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public final zzab f71316d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public final zzab f71317e;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: f */
    public final String f71318f;
    @SafeParcelable.Field(m51606id = 7)

    /* renamed from: g */
    public final float f71319g;
    @SafeParcelable.Field(m51606id = 8)

    /* renamed from: h */
    public final String f71320h;
    @SafeParcelable.Field(m51606id = 9)

    /* renamed from: i */
    public final int f71321i;
    @SafeParcelable.Field(m51606id = 10)

    /* renamed from: j */
    public final boolean f71322j;
    @SafeParcelable.Field(m51606id = 11)

    /* renamed from: k */
    public final int f71323k;
    @SafeParcelable.Field(m51606id = 12)

    /* renamed from: l */
    public final int f71324l;

    @SafeParcelable.Constructor
    public zzah(@SafeParcelable.Param(m51605id = 2) zzao[] zzaoVarArr, @SafeParcelable.Param(m51605id = 3) zzab zzabVar, @SafeParcelable.Param(m51605id = 4) zzab zzabVar2, @SafeParcelable.Param(m51605id = 5) zzab zzabVar3, @SafeParcelable.Param(m51605id = 6) String str, @SafeParcelable.Param(m51605id = 7) float f, @SafeParcelable.Param(m51605id = 8) String str2, @SafeParcelable.Param(m51605id = 9) int i, @SafeParcelable.Param(m51605id = 10) boolean z, @SafeParcelable.Param(m51605id = 11) int i2, @SafeParcelable.Param(m51605id = 12) int i3) {
        this.f71314b = zzaoVarArr;
        this.f71315c = zzabVar;
        this.f71316d = zzabVar2;
        this.f71317e = zzabVar3;
        this.f71318f = str;
        this.f71319g = f;
        this.f71320h = str2;
        this.f71321i = i;
        this.f71322j = z;
        this.f71323k = i2;
        this.f71324l = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.f71314b, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f71315c, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f71316d, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f71317e, i, false);
        SafeParcelWriter.writeString(parcel, 6, this.f71318f, false);
        SafeParcelWriter.writeFloat(parcel, 7, this.f71319g);
        SafeParcelWriter.writeString(parcel, 8, this.f71320h, false);
        SafeParcelWriter.writeInt(parcel, 9, this.f71321i);
        SafeParcelWriter.writeBoolean(parcel, 10, this.f71322j);
        SafeParcelWriter.writeInt(parcel, 11, this.f71323k);
        SafeParcelWriter.writeInt(parcel, 12, this.f71324l);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "CalendarDateTimeCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new Xo9();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public int f70583b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public int f70584c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public int f70585d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public int f70586e;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: f */
    public int f70587f;
    @SafeParcelable.Field(m51606id = 7)

    /* renamed from: g */
    public int f70588g;
    @SafeParcelable.Field(m51606id = 8)

    /* renamed from: h */
    public boolean f70589h;
    @SafeParcelable.Field(m51606id = 9)

    /* renamed from: i */
    public String f70590i;

    public zzf() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f70583b);
        SafeParcelWriter.writeInt(parcel, 3, this.f70584c);
        SafeParcelWriter.writeInt(parcel, 4, this.f70585d);
        SafeParcelWriter.writeInt(parcel, 5, this.f70586e);
        SafeParcelWriter.writeInt(parcel, 6, this.f70587f);
        SafeParcelWriter.writeInt(parcel, 7, this.f70588g);
        SafeParcelWriter.writeBoolean(parcel, 8, this.f70589h);
        SafeParcelWriter.writeString(parcel, 9, this.f70590i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzf(@SafeParcelable.Param(m51605id = 2) int i, @SafeParcelable.Param(m51605id = 3) int i2, @SafeParcelable.Param(m51605id = 4) int i3, @SafeParcelable.Param(m51605id = 5) int i4, @SafeParcelable.Param(m51605id = 6) int i5, @SafeParcelable.Param(m51605id = 7) int i6, @SafeParcelable.Param(m51605id = 8) boolean z, @SafeParcelable.Param(m51605id = 9) String str) {
        this.f70583b = i;
        this.f70584c = i2;
        this.f70585d = i3;
        this.f70586e = i4;
        this.f70587f = i5;
        this.f70588g = i6;
        this.f70589h = z;
        this.f70590i = str;
    }
}

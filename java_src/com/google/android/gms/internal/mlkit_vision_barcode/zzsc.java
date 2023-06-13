package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "CalendarEventParcelCreator")
/* loaded from: classes5.dex */
public final class zzsc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsc> CREATOR = new Zp9();
    @SafeParcelable.Field(getter = "getSummary", m51606id = 1)

    /* renamed from: b */
    public final String f70668b;
    @SafeParcelable.Field(getter = "getDescription", m51606id = 2)

    /* renamed from: c */
    public final String f70669c;
    @SafeParcelable.Field(getter = "getLocation", m51606id = 3)

    /* renamed from: d */
    public final String f70670d;
    @SafeParcelable.Field(getter = "getOrganizer", m51606id = 4)

    /* renamed from: e */
    public final String f70671e;
    @SafeParcelable.Field(getter = "getStatus", m51606id = 5)

    /* renamed from: f */
    public final String f70672f;
    @SafeParcelable.Field(getter = "getStart", m51606id = 6)

    /* renamed from: g */
    public final zzsb f70673g;
    @SafeParcelable.Field(getter = "getEnd", m51606id = 7)

    /* renamed from: h */
    public final zzsb f70674h;

    @SafeParcelable.Constructor
    public zzsc(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) String str2, @SafeParcelable.Param(m51605id = 3) String str3, @SafeParcelable.Param(m51605id = 4) String str4, @SafeParcelable.Param(m51605id = 5) String str5, @SafeParcelable.Param(m51605id = 6) zzsb zzsbVar, @SafeParcelable.Param(m51605id = 7) zzsb zzsbVar2) {
        this.f70668b = str;
        this.f70669c = str2;
        this.f70670d = str3;
        this.f70671e = str4;
        this.f70672f = str5;
        this.f70673g = zzsbVar;
        this.f70674h = zzsbVar2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f70668b, false);
        SafeParcelWriter.writeString(parcel, 2, this.f70669c, false);
        SafeParcelWriter.writeString(parcel, 3, this.f70670d, false);
        SafeParcelWriter.writeString(parcel, 4, this.f70671e, false);
        SafeParcelWriter.writeString(parcel, 5, this.f70672f, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f70673g, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f70674h, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

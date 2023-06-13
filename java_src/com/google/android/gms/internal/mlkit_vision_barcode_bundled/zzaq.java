package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "CalendarEventParcelCreator")
/* loaded from: classes5.dex */
public final class zzaq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaq> CREATOR = new C39053cH7();
    @SafeParcelable.Field(getter = "getSummary", m51606id = 1)

    /* renamed from: b */
    public final String f70750b;
    @SafeParcelable.Field(getter = "getDescription", m51606id = 2)

    /* renamed from: c */
    public final String f70751c;
    @SafeParcelable.Field(getter = "getLocation", m51606id = 3)

    /* renamed from: d */
    public final String f70752d;
    @SafeParcelable.Field(getter = "getOrganizer", m51606id = 4)

    /* renamed from: e */
    public final String f70753e;
    @SafeParcelable.Field(getter = "getStatus", m51606id = 5)

    /* renamed from: f */
    public final String f70754f;
    @SafeParcelable.Field(getter = "getStart", m51606id = 6)

    /* renamed from: g */
    public final zzap f70755g;
    @SafeParcelable.Field(getter = "getEnd", m51606id = 7)

    /* renamed from: h */
    public final zzap f70756h;

    @SafeParcelable.Constructor
    public zzaq(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) String str2, @SafeParcelable.Param(m51605id = 3) String str3, @SafeParcelable.Param(m51605id = 4) String str4, @SafeParcelable.Param(m51605id = 5) String str5, @SafeParcelable.Param(m51605id = 6) zzap zzapVar, @SafeParcelable.Param(m51605id = 7) zzap zzapVar2) {
        this.f70750b = str;
        this.f70751c = str2;
        this.f70752d = str3;
        this.f70753e = str4;
        this.f70754f = str5;
        this.f70755g = zzapVar;
        this.f70756h = zzapVar2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f70750b, false);
        SafeParcelWriter.writeString(parcel, 2, this.f70751c, false);
        SafeParcelWriter.writeString(parcel, 3, this.f70752d, false);
        SafeParcelWriter.writeString(parcel, 4, this.f70753e, false);
        SafeParcelWriter.writeString(parcel, 5, this.f70754f, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f70755g, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f70756h, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

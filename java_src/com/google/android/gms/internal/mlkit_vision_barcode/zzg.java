package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "CalendarEventCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new Xq9();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public String f70591b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public String f70592c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public String f70593d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public String f70594e;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: f */
    public String f70595f;
    @SafeParcelable.Field(m51606id = 7)

    /* renamed from: g */
    public zzf f70596g;
    @SafeParcelable.Field(m51606id = 8)

    /* renamed from: h */
    public zzf f70597h;

    public zzg() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f70591b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f70592c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f70593d, false);
        SafeParcelWriter.writeString(parcel, 5, this.f70594e, false);
        SafeParcelWriter.writeString(parcel, 6, this.f70595f, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f70596g, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.f70597h, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzg(@SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) String str2, @SafeParcelable.Param(m51605id = 4) String str3, @SafeParcelable.Param(m51605id = 5) String str4, @SafeParcelable.Param(m51605id = 6) String str5, @SafeParcelable.Param(m51605id = 7) zzf zzfVar, @SafeParcelable.Param(m51605id = 8) zzf zzfVar2) {
        this.f70591b = str;
        this.f70592c = str2;
        this.f70593d = str3;
        this.f70594e = str4;
        this.f70595f = str5;
        this.f70596g = zzfVar;
        this.f70597h = zzfVar2;
    }
}

package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "DriverLicenseCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new C41222fu9();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public String f70605b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public String f70606c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public String f70607d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public String f70608e;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: f */
    public String f70609f;
    @SafeParcelable.Field(m51606id = 7)

    /* renamed from: g */
    public String f70610g;
    @SafeParcelable.Field(m51606id = 8)

    /* renamed from: h */
    public String f70611h;
    @SafeParcelable.Field(m51606id = 9)

    /* renamed from: i */
    public String f70612i;
    @SafeParcelable.Field(m51606id = 10)

    /* renamed from: j */
    public String f70613j;
    @SafeParcelable.Field(m51606id = 11)

    /* renamed from: k */
    public String f70614k;
    @SafeParcelable.Field(m51606id = 12)

    /* renamed from: l */
    public String f70615l;
    @SafeParcelable.Field(m51606id = 13)

    /* renamed from: m */
    public String f70616m;
    @SafeParcelable.Field(m51606id = 14)

    /* renamed from: n */
    public String f70617n;
    @SafeParcelable.Field(m51606id = 15)

    /* renamed from: o */
    public String f70618o;

    public zzi() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f70605b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f70606c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f70607d, false);
        SafeParcelWriter.writeString(parcel, 5, this.f70608e, false);
        SafeParcelWriter.writeString(parcel, 6, this.f70609f, false);
        SafeParcelWriter.writeString(parcel, 7, this.f70610g, false);
        SafeParcelWriter.writeString(parcel, 8, this.f70611h, false);
        SafeParcelWriter.writeString(parcel, 9, this.f70612i, false);
        SafeParcelWriter.writeString(parcel, 10, this.f70613j, false);
        SafeParcelWriter.writeString(parcel, 11, this.f70614k, false);
        SafeParcelWriter.writeString(parcel, 12, this.f70615l, false);
        SafeParcelWriter.writeString(parcel, 13, this.f70616m, false);
        SafeParcelWriter.writeString(parcel, 14, this.f70617n, false);
        SafeParcelWriter.writeString(parcel, 15, this.f70618o, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzi(@SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) String str2, @SafeParcelable.Param(m51605id = 4) String str3, @SafeParcelable.Param(m51605id = 5) String str4, @SafeParcelable.Param(m51605id = 6) String str5, @SafeParcelable.Param(m51605id = 7) String str6, @SafeParcelable.Param(m51605id = 8) String str7, @SafeParcelable.Param(m51605id = 9) String str8, @SafeParcelable.Param(m51605id = 10) String str9, @SafeParcelable.Param(m51605id = 11) String str10, @SafeParcelable.Param(m51605id = 12) String str11, @SafeParcelable.Param(m51605id = 13) String str12, @SafeParcelable.Param(m51605id = 14) String str13, @SafeParcelable.Param(m51605id = 15) String str14) {
        this.f70605b = str;
        this.f70606c = str2;
        this.f70607d = str3;
        this.f70608e = str4;
        this.f70609f = str5;
        this.f70610g = str6;
        this.f70611h = str7;
        this.f70612i = str8;
        this.f70613j = str9;
        this.f70614k = str10;
        this.f70615l = str11;
        this.f70616m = str12;
        this.f70617n = str13;
        this.f70618o = str14;
    }
}

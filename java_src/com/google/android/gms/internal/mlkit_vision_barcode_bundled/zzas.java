package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "DriverLicenseParcelCreator")
/* loaded from: classes5.dex */
public final class zzas extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzas> CREATOR = new LI7();
    @SafeParcelable.Field(getter = "getDocumentType", m51606id = 1)

    /* renamed from: b */
    public final String f70764b;
    @SafeParcelable.Field(getter = "getFirstName", m51606id = 2)

    /* renamed from: c */
    public final String f70765c;
    @SafeParcelable.Field(getter = "getMiddleName", m51606id = 3)

    /* renamed from: d */
    public final String f70766d;
    @SafeParcelable.Field(getter = "getLastName", m51606id = 4)

    /* renamed from: e */
    public final String f70767e;
    @SafeParcelable.Field(getter = "getGender", m51606id = 5)

    /* renamed from: f */
    public final String f70768f;
    @SafeParcelable.Field(getter = "getAddressStreet", m51606id = 6)

    /* renamed from: g */
    public final String f70769g;
    @SafeParcelable.Field(getter = "getAddressCity", m51606id = 7)

    /* renamed from: h */
    public final String f70770h;
    @SafeParcelable.Field(getter = "getAddressState", m51606id = 8)

    /* renamed from: i */
    public final String f70771i;
    @SafeParcelable.Field(getter = "getAddressZip", m51606id = 9)

    /* renamed from: j */
    public final String f70772j;
    @SafeParcelable.Field(getter = "getLicenseNumber", m51606id = 10)

    /* renamed from: k */
    public final String f70773k;
    @SafeParcelable.Field(getter = "getIssueDate", m51606id = 11)

    /* renamed from: l */
    public final String f70774l;
    @SafeParcelable.Field(getter = "getExpiryDate", m51606id = 12)

    /* renamed from: m */
    public final String f70775m;
    @SafeParcelable.Field(getter = "getBirthDate", m51606id = 13)

    /* renamed from: n */
    public final String f70776n;
    @SafeParcelable.Field(getter = "getIssuingCountry", m51606id = 14)

    /* renamed from: o */
    public final String f70777o;

    @SafeParcelable.Constructor
    public zzas(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) String str2, @SafeParcelable.Param(m51605id = 3) String str3, @SafeParcelable.Param(m51605id = 4) String str4, @SafeParcelable.Param(m51605id = 5) String str5, @SafeParcelable.Param(m51605id = 6) String str6, @SafeParcelable.Param(m51605id = 7) String str7, @SafeParcelable.Param(m51605id = 8) String str8, @SafeParcelable.Param(m51605id = 9) String str9, @SafeParcelable.Param(m51605id = 10) String str10, @SafeParcelable.Param(m51605id = 11) String str11, @SafeParcelable.Param(m51605id = 12) String str12, @SafeParcelable.Param(m51605id = 13) String str13, @SafeParcelable.Param(m51605id = 14) String str14) {
        this.f70764b = str;
        this.f70765c = str2;
        this.f70766d = str3;
        this.f70767e = str4;
        this.f70768f = str5;
        this.f70769g = str6;
        this.f70770h = str7;
        this.f70771i = str8;
        this.f70772j = str9;
        this.f70773k = str10;
        this.f70774l = str11;
        this.f70775m = str12;
        this.f70776n = str13;
        this.f70777o = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f70764b, false);
        SafeParcelWriter.writeString(parcel, 2, this.f70765c, false);
        SafeParcelWriter.writeString(parcel, 3, this.f70766d, false);
        SafeParcelWriter.writeString(parcel, 4, this.f70767e, false);
        SafeParcelWriter.writeString(parcel, 5, this.f70768f, false);
        SafeParcelWriter.writeString(parcel, 6, this.f70769g, false);
        SafeParcelWriter.writeString(parcel, 7, this.f70770h, false);
        SafeParcelWriter.writeString(parcel, 8, this.f70771i, false);
        SafeParcelWriter.writeString(parcel, 9, this.f70772j, false);
        SafeParcelWriter.writeString(parcel, 10, this.f70773k, false);
        SafeParcelWriter.writeString(parcel, 11, this.f70774l, false);
        SafeParcelWriter.writeString(parcel, 12, this.f70775m, false);
        SafeParcelWriter.writeString(parcel, 13, this.f70776n, false);
        SafeParcelWriter.writeString(parcel, 14, this.f70777o, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

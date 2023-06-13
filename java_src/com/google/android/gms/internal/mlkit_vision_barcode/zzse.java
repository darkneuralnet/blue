package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "DriverLicenseParcelCreator")
/* loaded from: classes5.dex */
public final class zzse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzse> CREATOR = new C41182fq9();
    @SafeParcelable.Field(getter = "getDocumentType", m51606id = 1)

    /* renamed from: b */
    public final String f70682b;
    @SafeParcelable.Field(getter = "getFirstName", m51606id = 2)

    /* renamed from: c */
    public final String f70683c;
    @SafeParcelable.Field(getter = "getMiddleName", m51606id = 3)

    /* renamed from: d */
    public final String f70684d;
    @SafeParcelable.Field(getter = "getLastName", m51606id = 4)

    /* renamed from: e */
    public final String f70685e;
    @SafeParcelable.Field(getter = "getGender", m51606id = 5)

    /* renamed from: f */
    public final String f70686f;
    @SafeParcelable.Field(getter = "getAddressStreet", m51606id = 6)

    /* renamed from: g */
    public final String f70687g;
    @SafeParcelable.Field(getter = "getAddressCity", m51606id = 7)

    /* renamed from: h */
    public final String f70688h;
    @SafeParcelable.Field(getter = "getAddressState", m51606id = 8)

    /* renamed from: i */
    public final String f70689i;
    @SafeParcelable.Field(getter = "getAddressZip", m51606id = 9)

    /* renamed from: j */
    public final String f70690j;
    @SafeParcelable.Field(getter = "getLicenseNumber", m51606id = 10)

    /* renamed from: k */
    public final String f70691k;
    @SafeParcelable.Field(getter = "getIssueDate", m51606id = 11)

    /* renamed from: l */
    public final String f70692l;
    @SafeParcelable.Field(getter = "getExpiryDate", m51606id = 12)

    /* renamed from: m */
    public final String f70693m;
    @SafeParcelable.Field(getter = "getBirthDate", m51606id = 13)

    /* renamed from: n */
    public final String f70694n;
    @SafeParcelable.Field(getter = "getIssuingCountry", m51606id = 14)

    /* renamed from: o */
    public final String f70695o;

    @SafeParcelable.Constructor
    public zzse(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) String str2, @SafeParcelable.Param(m51605id = 3) String str3, @SafeParcelable.Param(m51605id = 4) String str4, @SafeParcelable.Param(m51605id = 5) String str5, @SafeParcelable.Param(m51605id = 6) String str6, @SafeParcelable.Param(m51605id = 7) String str7, @SafeParcelable.Param(m51605id = 8) String str8, @SafeParcelable.Param(m51605id = 9) String str9, @SafeParcelable.Param(m51605id = 10) String str10, @SafeParcelable.Param(m51605id = 11) String str11, @SafeParcelable.Param(m51605id = 12) String str12, @SafeParcelable.Param(m51605id = 13) String str13, @SafeParcelable.Param(m51605id = 14) String str14) {
        this.f70682b = str;
        this.f70683c = str2;
        this.f70684d = str3;
        this.f70685e = str4;
        this.f70686f = str5;
        this.f70687g = str6;
        this.f70688h = str7;
        this.f70689i = str8;
        this.f70690j = str9;
        this.f70691k = str10;
        this.f70692l = str11;
        this.f70693m = str12;
        this.f70694n = str13;
        this.f70695o = str14;
    }

    /* renamed from: E */
    public final String m51338E() {
        return this.f70693m;
    }

    /* renamed from: F */
    public final String m51337F() {
        return this.f70683c;
    }

    /* renamed from: K */
    public final String m51336K() {
        return this.f70686f;
    }

    /* renamed from: L */
    public final String m51335L() {
        return this.f70692l;
    }

    /* renamed from: R */
    public final String m51334R() {
        return this.f70695o;
    }

    /* renamed from: T */
    public final String m51333T() {
        return this.f70685e;
    }

    /* renamed from: j0 */
    public final String m51332j0() {
        return this.f70691k;
    }

    /* renamed from: m0 */
    public final String m51331m0() {
        return this.f70684d;
    }

    /* renamed from: s */
    public final String m51330s() {
        return this.f70687g;
    }

    /* renamed from: u */
    public final String m51329u() {
        return this.f70694n;
    }

    /* renamed from: v */
    public final String m51328v() {
        return this.f70682b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f70682b, false);
        SafeParcelWriter.writeString(parcel, 2, this.f70683c, false);
        SafeParcelWriter.writeString(parcel, 3, this.f70684d, false);
        SafeParcelWriter.writeString(parcel, 4, this.f70685e, false);
        SafeParcelWriter.writeString(parcel, 5, this.f70686f, false);
        SafeParcelWriter.writeString(parcel, 6, this.f70687g, false);
        SafeParcelWriter.writeString(parcel, 7, this.f70688h, false);
        SafeParcelWriter.writeString(parcel, 8, this.f70689i, false);
        SafeParcelWriter.writeString(parcel, 9, this.f70690j, false);
        SafeParcelWriter.writeString(parcel, 10, this.f70691k, false);
        SafeParcelWriter.writeString(parcel, 11, this.f70692l, false);
        SafeParcelWriter.writeString(parcel, 12, this.f70693m, false);
        SafeParcelWriter.writeString(parcel, 13, this.f70694n, false);
        SafeParcelWriter.writeString(parcel, 14, this.f70695o, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zza() {
        return this.f70688h;
    }

    public final String zzb() {
        return this.f70689i;
    }

    public final String zzd() {
        return this.f70690j;
    }
}

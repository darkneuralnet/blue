package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "BarcodeParcelCreator")
/* loaded from: classes5.dex */
public final class zzsm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsm> CREATOR = new Op9();
    @SafeParcelable.Field(getter = "getFormat", m51606id = 1)

    /* renamed from: b */
    public final int f70718b;
    @SafeParcelable.Field(getter = "getDisplayValue", m51606id = 2)

    /* renamed from: c */
    public final String f70719c;
    @SafeParcelable.Field(getter = "getRawValue", m51606id = 3)

    /* renamed from: d */
    public final String f70720d;
    @SafeParcelable.Field(getter = "getRawBytes", m51606id = 4)

    /* renamed from: e */
    public final byte[] f70721e;
    @SafeParcelable.Field(getter = "getCornerPoints", m51606id = 5)

    /* renamed from: f */
    public final Point[] f70722f;
    @SafeParcelable.Field(getter = "getValueType", m51606id = 6)

    /* renamed from: g */
    public final int f70723g;
    @SafeParcelable.Field(getter = "getEmailParcel", m51606id = 7)

    /* renamed from: h */
    public final zzsf f70724h;
    @SafeParcelable.Field(getter = "getPhoneParcel", m51606id = 8)

    /* renamed from: i */
    public final zzsi f70725i;
    @SafeParcelable.Field(getter = "getSmsParcel", m51606id = 9)

    /* renamed from: j */
    public final zzsj f70726j;
    @SafeParcelable.Field(getter = "getWiFiParcel", m51606id = 10)

    /* renamed from: k */
    public final zzsl f70727k;
    @SafeParcelable.Field(getter = "getUrlBookmarkParcel", m51606id = 11)

    /* renamed from: l */
    public final zzsk f70728l;
    @SafeParcelable.Field(getter = "getGeoPointParcel", m51606id = 12)

    /* renamed from: m */
    public final zzsg f70729m;
    @SafeParcelable.Field(getter = "getCalendarEventParcel", m51606id = 13)

    /* renamed from: n */
    public final zzsc f70730n;
    @SafeParcelable.Field(getter = "getContactInfoParcel", m51606id = 14)

    /* renamed from: o */
    public final zzsd f70731o;
    @SafeParcelable.Field(getter = "getDriverLicenseParcel", m51606id = 15)

    /* renamed from: p */
    public final zzse f70732p;

    @SafeParcelable.Constructor
    public zzsm(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) String str2, @SafeParcelable.Param(m51605id = 4) byte[] bArr, @SafeParcelable.Param(m51605id = 5) Point[] pointArr, @SafeParcelable.Param(m51605id = 6) int i2, @SafeParcelable.Param(m51605id = 7) zzsf zzsfVar, @SafeParcelable.Param(m51605id = 8) zzsi zzsiVar, @SafeParcelable.Param(m51605id = 9) zzsj zzsjVar, @SafeParcelable.Param(m51605id = 10) zzsl zzslVar, @SafeParcelable.Param(m51605id = 11) zzsk zzskVar, @SafeParcelable.Param(m51605id = 12) zzsg zzsgVar, @SafeParcelable.Param(m51605id = 13) zzsc zzscVar, @SafeParcelable.Param(m51605id = 14) zzsd zzsdVar, @SafeParcelable.Param(m51605id = 15) zzse zzseVar) {
        this.f70718b = i;
        this.f70719c = str;
        this.f70720d = str2;
        this.f70721e = bArr;
        this.f70722f = pointArr;
        this.f70723g = i2;
        this.f70724h = zzsfVar;
        this.f70725i = zzsiVar;
        this.f70726j = zzsjVar;
        this.f70727k = zzslVar;
        this.f70728l = zzskVar;
        this.f70729m = zzsgVar;
        this.f70730n = zzscVar;
        this.f70731o = zzsdVar;
        this.f70732p = zzseVar;
    }

    /* renamed from: E */
    public final String m51327E() {
        return this.f70720d;
    }

    /* renamed from: F */
    public final Point[] m51326F() {
        return this.f70722f;
    }

    /* renamed from: s */
    public final int m51325s() {
        return this.f70723g;
    }

    /* renamed from: u */
    public final zzse m51324u() {
        return this.f70732p;
    }

    /* renamed from: v */
    public final String m51323v() {
        return this.f70719c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f70718b);
        SafeParcelWriter.writeString(parcel, 2, this.f70719c, false);
        SafeParcelWriter.writeString(parcel, 3, this.f70720d, false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.f70721e, false);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.f70722f, i, false);
        SafeParcelWriter.writeInt(parcel, 6, this.f70723g);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f70724h, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.f70725i, i, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.f70726j, i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.f70727k, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.f70728l, i, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.f70729m, i, false);
        SafeParcelWriter.writeParcelable(parcel, 13, this.f70730n, i, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.f70731o, i, false);
        SafeParcelWriter.writeParcelable(parcel, 15, this.f70732p, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.f70718b;
    }
}

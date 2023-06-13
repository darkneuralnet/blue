package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "BarcodeParcelCreator")
/* loaded from: classes5.dex */
public final class zzba extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzba> CREATOR = new OD7();
    @SafeParcelable.Field(getter = "getFormat", m51606id = 1)

    /* renamed from: b */
    public final int f70800b;
    @SafeParcelable.Field(getter = "getDisplayValue", m51606id = 2)

    /* renamed from: c */
    public final String f70801c;
    @SafeParcelable.Field(getter = "getRawValue", m51606id = 3)

    /* renamed from: d */
    public final String f70802d;
    @SafeParcelable.Field(getter = "getRawBytes", m51606id = 4)

    /* renamed from: e */
    public final byte[] f70803e;
    @SafeParcelable.Field(getter = "getCornerPoints", m51606id = 5)

    /* renamed from: f */
    public final Point[] f70804f;
    @SafeParcelable.Field(getter = "getValueType", m51606id = 6)

    /* renamed from: g */
    public final int f70805g;
    @SafeParcelable.Field(getter = "getEmailParcel", m51606id = 7)

    /* renamed from: h */
    public final zzat f70806h;
    @SafeParcelable.Field(getter = "getPhoneParcel", m51606id = 8)

    /* renamed from: i */
    public final zzaw f70807i;
    @SafeParcelable.Field(getter = "getSmsParcel", m51606id = 9)

    /* renamed from: j */
    public final zzax f70808j;
    @SafeParcelable.Field(getter = "getWiFiParcel", m51606id = 10)

    /* renamed from: k */
    public final zzaz f70809k;
    @SafeParcelable.Field(getter = "getUrlBookmarkParcel", m51606id = 11)

    /* renamed from: l */
    public final zzay f70810l;
    @SafeParcelable.Field(getter = "getGeoPointParcel", m51606id = 12)

    /* renamed from: m */
    public final zzau f70811m;
    @SafeParcelable.Field(getter = "getCalendarEventParcel", m51606id = 13)

    /* renamed from: n */
    public final zzaq f70812n;
    @SafeParcelable.Field(getter = "getContactInfoParcel", m51606id = 14)

    /* renamed from: o */
    public final zzar f70813o;
    @SafeParcelable.Field(getter = "getDriverLicenseParcel", m51606id = 15)

    /* renamed from: p */
    public final zzas f70814p;

    @SafeParcelable.Constructor
    public zzba(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) String str2, @SafeParcelable.Param(m51605id = 4) byte[] bArr, @SafeParcelable.Param(m51605id = 5) Point[] pointArr, @SafeParcelable.Param(m51605id = 6) int i2, @SafeParcelable.Param(m51605id = 7) zzat zzatVar, @SafeParcelable.Param(m51605id = 8) zzaw zzawVar, @SafeParcelable.Param(m51605id = 9) zzax zzaxVar, @SafeParcelable.Param(m51605id = 10) zzaz zzazVar, @SafeParcelable.Param(m51605id = 11) zzay zzayVar, @SafeParcelable.Param(m51605id = 12) zzau zzauVar, @SafeParcelable.Param(m51605id = 13) zzaq zzaqVar, @SafeParcelable.Param(m51605id = 14) zzar zzarVar, @SafeParcelable.Param(m51605id = 15) zzas zzasVar) {
        this.f70800b = i;
        this.f70801c = str;
        this.f70802d = str2;
        this.f70803e = bArr;
        this.f70804f = pointArr;
        this.f70805g = i2;
        this.f70806h = zzatVar;
        this.f70807i = zzawVar;
        this.f70808j = zzaxVar;
        this.f70809k = zzazVar;
        this.f70810l = zzayVar;
        this.f70811m = zzauVar;
        this.f70812n = zzaqVar;
        this.f70813o = zzarVar;
        this.f70814p = zzasVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f70800b);
        SafeParcelWriter.writeString(parcel, 2, this.f70801c, false);
        SafeParcelWriter.writeString(parcel, 3, this.f70802d, false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.f70803e, false);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.f70804f, i, false);
        SafeParcelWriter.writeInt(parcel, 6, this.f70805g);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f70806h, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.f70807i, i, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.f70808j, i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.f70809k, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.f70810l, i, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.f70811m, i, false);
        SafeParcelWriter.writeParcelable(parcel, 13, this.f70812n, i, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.f70813o, i, false);
        SafeParcelWriter.writeParcelable(parcel, 15, this.f70814p, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

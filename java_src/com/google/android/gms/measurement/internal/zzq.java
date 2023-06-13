package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
@SafeParcelable.Class(creator = "AppMetadataCreator")
@SafeParcelable.Reserved({1, 17, 20})
/* loaded from: classes6.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new C52397yl9();
    @SafeParcelable.Field(m51606id = 29)

    /* renamed from: A */
    public final long f71540A;
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public final String f71541b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public final String f71542c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public final String f71543d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public final String f71544e;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: f */
    public final long f71545f;
    @SafeParcelable.Field(m51606id = 7)

    /* renamed from: g */
    public final long f71546g;
    @SafeParcelable.Field(m51606id = 8)

    /* renamed from: h */
    public final String f71547h;
    @SafeParcelable.Field(defaultValue = "true", m51606id = 9)

    /* renamed from: i */
    public final boolean f71548i;
    @SafeParcelable.Field(m51606id = 10)

    /* renamed from: j */
    public final boolean f71549j;
    @SafeParcelable.Field(defaultValueUnchecked = "Integer.MIN_VALUE", m51606id = 11)

    /* renamed from: k */
    public final long f71550k;
    @SafeParcelable.Field(m51606id = 12)

    /* renamed from: l */
    public final String f71551l;
    @SafeParcelable.Field(m51606id = 13)
    @Deprecated

    /* renamed from: m */
    public final long f71552m;
    @SafeParcelable.Field(m51606id = 14)

    /* renamed from: n */
    public final long f71553n;
    @SafeParcelable.Field(m51606id = 15)

    /* renamed from: o */
    public final int f71554o;
    @SafeParcelable.Field(defaultValue = "true", m51606id = 16)

    /* renamed from: p */
    public final boolean f71555p;
    @SafeParcelable.Field(m51606id = 18)

    /* renamed from: q */
    public final boolean f71556q;
    @SafeParcelable.Field(m51606id = 19)

    /* renamed from: r */
    public final String f71557r;
    @SafeParcelable.Field(m51606id = 21)

    /* renamed from: s */
    public final Boolean f71558s;
    @SafeParcelable.Field(m51606id = 22)

    /* renamed from: t */
    public final long f71559t;
    @SafeParcelable.Field(m51606id = 23)

    /* renamed from: u */
    public final List f71560u;
    @SafeParcelable.Field(m51606id = 24)

    /* renamed from: v */
    public final String f71561v;
    @SafeParcelable.Field(defaultValue = "", m51606id = 25)

    /* renamed from: w */
    public final String f71562w;
    @SafeParcelable.Field(defaultValue = "", m51606id = 26)

    /* renamed from: x */
    public final String f71563x;
    @SafeParcelable.Field(m51606id = 27)

    /* renamed from: y */
    public final String f71564y;
    @SafeParcelable.Field(defaultValue = "false", m51606id = 28)

    /* renamed from: z */
    public final boolean f71565z;

    public zzq(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, String str7, Boolean bool, long j6, List list, String str8, String str9, String str10, String str11, boolean z5, long j7) {
        Preconditions.checkNotEmpty(str);
        this.f71541b = str;
        this.f71542c = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f71543d = str3;
        this.f71550k = j;
        this.f71544e = str4;
        this.f71545f = j2;
        this.f71546g = j3;
        this.f71547h = str5;
        this.f71548i = z;
        this.f71549j = z2;
        this.f71551l = str6;
        this.f71552m = 0L;
        this.f71553n = j5;
        this.f71554o = i;
        this.f71555p = z3;
        this.f71556q = z4;
        this.f71557r = str7;
        this.f71558s = bool;
        this.f71559t = j6;
        this.f71560u = list;
        this.f71561v = null;
        this.f71562w = str9;
        this.f71563x = str10;
        this.f71564y = str11;
        this.f71565z = z5;
        this.f71540A = j7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f71541b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f71542c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f71543d, false);
        SafeParcelWriter.writeString(parcel, 5, this.f71544e, false);
        SafeParcelWriter.writeLong(parcel, 6, this.f71545f);
        SafeParcelWriter.writeLong(parcel, 7, this.f71546g);
        SafeParcelWriter.writeString(parcel, 8, this.f71547h, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.f71548i);
        SafeParcelWriter.writeBoolean(parcel, 10, this.f71549j);
        SafeParcelWriter.writeLong(parcel, 11, this.f71550k);
        SafeParcelWriter.writeString(parcel, 12, this.f71551l, false);
        SafeParcelWriter.writeLong(parcel, 13, this.f71552m);
        SafeParcelWriter.writeLong(parcel, 14, this.f71553n);
        SafeParcelWriter.writeInt(parcel, 15, this.f71554o);
        SafeParcelWriter.writeBoolean(parcel, 16, this.f71555p);
        SafeParcelWriter.writeBoolean(parcel, 18, this.f71556q);
        SafeParcelWriter.writeString(parcel, 19, this.f71557r, false);
        SafeParcelWriter.writeBooleanObject(parcel, 21, this.f71558s, false);
        SafeParcelWriter.writeLong(parcel, 22, this.f71559t);
        SafeParcelWriter.writeStringList(parcel, 23, this.f71560u, false);
        SafeParcelWriter.writeString(parcel, 24, this.f71561v, false);
        SafeParcelWriter.writeString(parcel, 25, this.f71562w, false);
        SafeParcelWriter.writeString(parcel, 26, this.f71563x, false);
        SafeParcelWriter.writeString(parcel, 27, this.f71564y, false);
        SafeParcelWriter.writeBoolean(parcel, 28, this.f71565z);
        SafeParcelWriter.writeLong(parcel, 29, this.f71540A);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzq(@SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) String str2, @SafeParcelable.Param(m51605id = 4) String str3, @SafeParcelable.Param(m51605id = 5) String str4, @SafeParcelable.Param(m51605id = 6) long j, @SafeParcelable.Param(m51605id = 7) long j2, @SafeParcelable.Param(m51605id = 8) String str5, @SafeParcelable.Param(m51605id = 9) boolean z, @SafeParcelable.Param(m51605id = 10) boolean z2, @SafeParcelable.Param(m51605id = 11) long j3, @SafeParcelable.Param(m51605id = 12) String str6, @SafeParcelable.Param(m51605id = 13) long j4, @SafeParcelable.Param(m51605id = 14) long j5, @SafeParcelable.Param(m51605id = 15) int i, @SafeParcelable.Param(m51605id = 16) boolean z3, @SafeParcelable.Param(m51605id = 18) boolean z4, @SafeParcelable.Param(m51605id = 19) String str7, @SafeParcelable.Param(m51605id = 21) Boolean bool, @SafeParcelable.Param(m51605id = 22) long j6, @SafeParcelable.Param(m51605id = 23) List list, @SafeParcelable.Param(m51605id = 24) String str8, @SafeParcelable.Param(m51605id = 25) String str9, @SafeParcelable.Param(m51605id = 26) String str10, @SafeParcelable.Param(m51605id = 27) String str11, @SafeParcelable.Param(m51605id = 28) boolean z5, @SafeParcelable.Param(m51605id = 29) long j7) {
        this.f71541b = str;
        this.f71542c = str2;
        this.f71543d = str3;
        this.f71550k = j3;
        this.f71544e = str4;
        this.f71545f = j;
        this.f71546g = j2;
        this.f71547h = str5;
        this.f71548i = z;
        this.f71549j = z2;
        this.f71551l = str6;
        this.f71552m = j4;
        this.f71553n = j5;
        this.f71554o = i;
        this.f71555p = z3;
        this.f71556q = z4;
        this.f71557r = str7;
        this.f71558s = bool;
        this.f71559t = j6;
        this.f71560u = list;
        this.f71561v = str8;
        this.f71562w = str9;
        this.f71563x = str10;
        this.f71564y = str11;
        this.f71565z = z5;
        this.f71540A = j7;
    }
}

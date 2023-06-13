package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "AddressCreator")
@SafeParcelable.Reserved({1})
@Deprecated
/* loaded from: classes6.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new C45548nC7();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public String f72065b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public String f72066c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public String f72067d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public String f72068e;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: f */
    public String f72069f;
    @SafeParcelable.Field(m51606id = 7)

    /* renamed from: g */
    public String f72070g;
    @SafeParcelable.Field(m51606id = 8)

    /* renamed from: h */
    public String f72071h;
    @SafeParcelable.Field(m51606id = 9)

    /* renamed from: i */
    public String f72072i;
    @SafeParcelable.Field(m51606id = 10)

    /* renamed from: j */
    public String f72073j;
    @SafeParcelable.Field(m51606id = 11)

    /* renamed from: k */
    public boolean f72074k;
    @SafeParcelable.Field(m51606id = 12)

    /* renamed from: l */
    public String f72075l;

    public zza() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f72065b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f72066c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f72067d, false);
        SafeParcelWriter.writeString(parcel, 5, this.f72068e, false);
        SafeParcelWriter.writeString(parcel, 6, this.f72069f, false);
        SafeParcelWriter.writeString(parcel, 7, this.f72070g, false);
        SafeParcelWriter.writeString(parcel, 8, this.f72071h, false);
        SafeParcelWriter.writeString(parcel, 9, this.f72072i, false);
        SafeParcelWriter.writeString(parcel, 10, this.f72073j, false);
        SafeParcelWriter.writeBoolean(parcel, 11, this.f72074k);
        SafeParcelWriter.writeString(parcel, 12, this.f72075l, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zza(@SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) String str2, @SafeParcelable.Param(m51605id = 4) String str3, @SafeParcelable.Param(m51605id = 5) String str4, @SafeParcelable.Param(m51605id = 6) String str5, @SafeParcelable.Param(m51605id = 7) String str6, @SafeParcelable.Param(m51605id = 8) String str7, @SafeParcelable.Param(m51605id = 9) String str8, @SafeParcelable.Param(m51605id = 10) String str9, @SafeParcelable.Param(m51605id = 11) boolean z, @SafeParcelable.Param(m51605id = 12) String str10) {
        this.f72065b = str;
        this.f72066c = str2;
        this.f72067d = str3;
        this.f72068e = str4;
        this.f72069f = str5;
        this.f72070g = str6;
        this.f72071h = str7;
        this.f72072i = str8;
        this.f72073j = str9;
        this.f72074k = z;
        this.f72075l = str10;
    }
}

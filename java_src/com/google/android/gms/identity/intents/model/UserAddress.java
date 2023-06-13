package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "UserAddressCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class UserAddress extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddress> CREATOR = new OC7();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public String f70364b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public String f70365c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public String f70366d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public String f70367e;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: f */
    public String f70368f;
    @SafeParcelable.Field(m51606id = 7)

    /* renamed from: g */
    public String f70369g;
    @SafeParcelable.Field(m51606id = 8)

    /* renamed from: h */
    public String f70370h;
    @SafeParcelable.Field(m51606id = 9)

    /* renamed from: i */
    public String f70371i;
    @SafeParcelable.Field(m51606id = 10)

    /* renamed from: j */
    public String f70372j;
    @SafeParcelable.Field(m51606id = 11)

    /* renamed from: k */
    public String f70373k;
    @SafeParcelable.Field(m51606id = 12)

    /* renamed from: l */
    public String f70374l;
    @SafeParcelable.Field(m51606id = 13)

    /* renamed from: m */
    public String f70375m;
    @SafeParcelable.Field(m51606id = 14)

    /* renamed from: n */
    public boolean f70376n;
    @SafeParcelable.Field(m51606id = 15)

    /* renamed from: o */
    public String f70377o;
    @SafeParcelable.Field(m51606id = 16)

    /* renamed from: p */
    public String f70378p;

    public UserAddress() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f70364b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f70365c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f70366d, false);
        SafeParcelWriter.writeString(parcel, 5, this.f70367e, false);
        SafeParcelWriter.writeString(parcel, 6, this.f70368f, false);
        SafeParcelWriter.writeString(parcel, 7, this.f70369g, false);
        SafeParcelWriter.writeString(parcel, 8, this.f70370h, false);
        SafeParcelWriter.writeString(parcel, 9, this.f70371i, false);
        SafeParcelWriter.writeString(parcel, 10, this.f70372j, false);
        SafeParcelWriter.writeString(parcel, 11, this.f70373k, false);
        SafeParcelWriter.writeString(parcel, 12, this.f70374l, false);
        SafeParcelWriter.writeString(parcel, 13, this.f70375m, false);
        SafeParcelWriter.writeBoolean(parcel, 14, this.f70376n);
        SafeParcelWriter.writeString(parcel, 15, this.f70377o, false);
        SafeParcelWriter.writeString(parcel, 16, this.f70378p, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public UserAddress(@SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) String str2, @SafeParcelable.Param(m51605id = 4) String str3, @SafeParcelable.Param(m51605id = 5) String str4, @SafeParcelable.Param(m51605id = 6) String str5, @SafeParcelable.Param(m51605id = 7) String str6, @SafeParcelable.Param(m51605id = 8) String str7, @SafeParcelable.Param(m51605id = 9) String str8, @SafeParcelable.Param(m51605id = 10) String str9, @SafeParcelable.Param(m51605id = 11) String str10, @SafeParcelable.Param(m51605id = 12) String str11, @SafeParcelable.Param(m51605id = 13) String str12, @SafeParcelable.Param(m51605id = 14) boolean z, @SafeParcelable.Param(m51605id = 15) String str13, @SafeParcelable.Param(m51605id = 16) String str14) {
        this.f70364b = str;
        this.f70365c = str2;
        this.f70366d = str3;
        this.f70367e = str4;
        this.f70368f = str5;
        this.f70369g = str6;
        this.f70370h = str7;
        this.f70371i = str8;
        this.f70372j = str9;
        this.f70373k = str10;
        this.f70374l = str11;
        this.f70375m = str12;
        this.f70376n = z;
        this.f70377o = str13;
        this.f70378p = str14;
    }
}

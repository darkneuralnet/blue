package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TimeInterval;
import java.util.ArrayList;
@SafeParcelable.Class(creator = "LoyaltyWalletObjectCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class LoyaltyWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LoyaltyWalletObject> CREATOR = new Lo9();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public String f71942b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public String f71943c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public String f71944d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public String f71945e;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: f */
    public String f71946f;
    @SafeParcelable.Field(m51606id = 7)

    /* renamed from: g */
    public String f71947g;
    @SafeParcelable.Field(m51606id = 8)

    /* renamed from: h */
    public String f71948h;
    @SafeParcelable.Field(m51606id = 9)

    /* renamed from: i */
    public String f71949i;
    @SafeParcelable.Field(m51606id = 10)
    @Deprecated

    /* renamed from: j */
    public String f71950j;
    @SafeParcelable.Field(m51606id = 11)

    /* renamed from: k */
    public String f71951k;
    @SafeParcelable.Field(m51606id = 12)

    /* renamed from: l */
    public int f71952l;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", m51606id = 13)

    /* renamed from: m */
    public final ArrayList f71953m;
    @SafeParcelable.Field(m51606id = 14)

    /* renamed from: n */
    public TimeInterval f71954n;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", m51606id = 15)

    /* renamed from: o */
    public final ArrayList f71955o;
    @SafeParcelable.Field(m51606id = 16)
    @Deprecated

    /* renamed from: p */
    public String f71956p;
    @SafeParcelable.Field(m51606id = 17)
    @Deprecated

    /* renamed from: q */
    public String f71957q;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", m51606id = 18)

    /* renamed from: r */
    public final ArrayList f71958r;
    @SafeParcelable.Field(m51606id = 19)

    /* renamed from: s */
    public boolean f71959s;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", m51606id = 20)

    /* renamed from: t */
    public final ArrayList f71960t;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", m51606id = 21)

    /* renamed from: u */
    public final ArrayList f71961u;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", m51606id = 22)

    /* renamed from: v */
    public final ArrayList f71962v;
    @SafeParcelable.Field(m51606id = 23)

    /* renamed from: w */
    public LoyaltyPoints f71963w;

    public LoyaltyWalletObject() {
        this.f71953m = ArrayUtils.newArrayList();
        this.f71955o = ArrayUtils.newArrayList();
        this.f71958r = ArrayUtils.newArrayList();
        this.f71960t = ArrayUtils.newArrayList();
        this.f71961u = ArrayUtils.newArrayList();
        this.f71962v = ArrayUtils.newArrayList();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f71942b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f71943c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f71944d, false);
        SafeParcelWriter.writeString(parcel, 5, this.f71945e, false);
        SafeParcelWriter.writeString(parcel, 6, this.f71946f, false);
        SafeParcelWriter.writeString(parcel, 7, this.f71947g, false);
        SafeParcelWriter.writeString(parcel, 8, this.f71948h, false);
        SafeParcelWriter.writeString(parcel, 9, this.f71949i, false);
        SafeParcelWriter.writeString(parcel, 10, this.f71950j, false);
        SafeParcelWriter.writeString(parcel, 11, this.f71951k, false);
        SafeParcelWriter.writeInt(parcel, 12, this.f71952l);
        SafeParcelWriter.writeTypedList(parcel, 13, this.f71953m, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.f71954n, i, false);
        SafeParcelWriter.writeTypedList(parcel, 15, this.f71955o, false);
        SafeParcelWriter.writeString(parcel, 16, this.f71956p, false);
        SafeParcelWriter.writeString(parcel, 17, this.f71957q, false);
        SafeParcelWriter.writeTypedList(parcel, 18, this.f71958r, false);
        SafeParcelWriter.writeBoolean(parcel, 19, this.f71959s);
        SafeParcelWriter.writeTypedList(parcel, 20, this.f71960t, false);
        SafeParcelWriter.writeTypedList(parcel, 21, this.f71961u, false);
        SafeParcelWriter.writeTypedList(parcel, 22, this.f71962v, false);
        SafeParcelWriter.writeParcelable(parcel, 23, this.f71963w, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public LoyaltyWalletObject(@SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) String str2, @SafeParcelable.Param(m51605id = 4) String str3, @SafeParcelable.Param(m51605id = 5) String str4, @SafeParcelable.Param(m51605id = 6) String str5, @SafeParcelable.Param(m51605id = 7) String str6, @SafeParcelable.Param(m51605id = 8) String str7, @SafeParcelable.Param(m51605id = 9) String str8, @SafeParcelable.Param(m51605id = 10) String str9, @SafeParcelable.Param(m51605id = 11) String str10, @SafeParcelable.Param(m51605id = 12) int i, @SafeParcelable.Param(m51605id = 13) ArrayList arrayList, @SafeParcelable.Param(m51605id = 14) TimeInterval timeInterval, @SafeParcelable.Param(m51605id = 15) ArrayList arrayList2, @SafeParcelable.Param(m51605id = 16) String str11, @SafeParcelable.Param(m51605id = 17) String str12, @SafeParcelable.Param(m51605id = 18) ArrayList arrayList3, @SafeParcelable.Param(m51605id = 19) boolean z, @SafeParcelable.Param(m51605id = 20) ArrayList arrayList4, @SafeParcelable.Param(m51605id = 21) ArrayList arrayList5, @SafeParcelable.Param(m51605id = 22) ArrayList arrayList6, @SafeParcelable.Param(m51605id = 23) LoyaltyPoints loyaltyPoints) {
        this.f71942b = str;
        this.f71943c = str2;
        this.f71944d = str3;
        this.f71945e = str4;
        this.f71946f = str5;
        this.f71947g = str6;
        this.f71948h = str7;
        this.f71949i = str8;
        this.f71950j = str9;
        this.f71951k = str10;
        this.f71952l = i;
        this.f71953m = arrayList;
        this.f71954n = timeInterval;
        this.f71955o = arrayList2;
        this.f71956p = str11;
        this.f71957q = str12;
        this.f71958r = arrayList3;
        this.f71959s = z;
        this.f71960t = arrayList4;
        this.f71961u = arrayList5;
        this.f71962v = arrayList6;
        this.f71963w = loyaltyPoints;
    }
}

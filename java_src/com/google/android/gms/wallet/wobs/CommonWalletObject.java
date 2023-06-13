package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.ArrayUtils;
import java.util.ArrayList;
@KeepName
@SafeParcelable.Class(creator = "CommonWalletObjectCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public class CommonWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new C39134cQ7();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public String f72021b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public String f72022c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public String f72023d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public String f72024e;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: f */
    public String f72025f;
    @SafeParcelable.Field(m51606id = 7)

    /* renamed from: g */
    public String f72026g;
    @SafeParcelable.Field(m51606id = 8)

    /* renamed from: h */
    public String f72027h;
    @SafeParcelable.Field(m51606id = 9)
    @Deprecated

    /* renamed from: i */
    public String f72028i;
    @SafeParcelable.Field(m51606id = 10)

    /* renamed from: j */
    public int f72029j;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", m51606id = 11)

    /* renamed from: k */
    public final ArrayList f72030k;
    @SafeParcelable.Field(m51606id = 12)

    /* renamed from: l */
    public TimeInterval f72031l;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", m51606id = 13)

    /* renamed from: m */
    public final ArrayList f72032m;
    @SafeParcelable.Field(m51606id = 14)
    @Deprecated

    /* renamed from: n */
    public String f72033n;
    @SafeParcelable.Field(m51606id = 15)
    @Deprecated

    /* renamed from: o */
    public String f72034o;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", m51606id = 16)

    /* renamed from: p */
    public final ArrayList f72035p;
    @SafeParcelable.Field(m51606id = 17)

    /* renamed from: q */
    public boolean f72036q;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", m51606id = 18)

    /* renamed from: r */
    public final ArrayList f72037r;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", m51606id = 19)

    /* renamed from: s */
    public final ArrayList f72038s;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", m51606id = 20)

    /* renamed from: t */
    public final ArrayList f72039t;

    public CommonWalletObject() {
        this.f72030k = ArrayUtils.newArrayList();
        this.f72032m = ArrayUtils.newArrayList();
        this.f72035p = ArrayUtils.newArrayList();
        this.f72037r = ArrayUtils.newArrayList();
        this.f72038s = ArrayUtils.newArrayList();
        this.f72039t = ArrayUtils.newArrayList();
    }

    /* renamed from: s */
    public static C46734pC7 m50514s() {
        return new C46734pC7(new CommonWalletObject(), null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f72021b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f72022c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f72023d, false);
        SafeParcelWriter.writeString(parcel, 5, this.f72024e, false);
        SafeParcelWriter.writeString(parcel, 6, this.f72025f, false);
        SafeParcelWriter.writeString(parcel, 7, this.f72026g, false);
        SafeParcelWriter.writeString(parcel, 8, this.f72027h, false);
        SafeParcelWriter.writeString(parcel, 9, this.f72028i, false);
        SafeParcelWriter.writeInt(parcel, 10, this.f72029j);
        SafeParcelWriter.writeTypedList(parcel, 11, this.f72030k, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.f72031l, i, false);
        SafeParcelWriter.writeTypedList(parcel, 13, this.f72032m, false);
        SafeParcelWriter.writeString(parcel, 14, this.f72033n, false);
        SafeParcelWriter.writeString(parcel, 15, this.f72034o, false);
        SafeParcelWriter.writeTypedList(parcel, 16, this.f72035p, false);
        SafeParcelWriter.writeBoolean(parcel, 17, this.f72036q);
        SafeParcelWriter.writeTypedList(parcel, 18, this.f72037r, false);
        SafeParcelWriter.writeTypedList(parcel, 19, this.f72038s, false);
        SafeParcelWriter.writeTypedList(parcel, 20, this.f72039t, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public CommonWalletObject(@SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) String str2, @SafeParcelable.Param(m51605id = 4) String str3, @SafeParcelable.Param(m51605id = 5) String str4, @SafeParcelable.Param(m51605id = 6) String str5, @SafeParcelable.Param(m51605id = 7) String str6, @SafeParcelable.Param(m51605id = 8) String str7, @SafeParcelable.Param(m51605id = 9) String str8, @SafeParcelable.Param(m51605id = 10) int i, @SafeParcelable.Param(m51605id = 11) ArrayList arrayList, @SafeParcelable.Param(m51605id = 12) TimeInterval timeInterval, @SafeParcelable.Param(m51605id = 13) ArrayList arrayList2, @SafeParcelable.Param(m51605id = 14) String str9, @SafeParcelable.Param(m51605id = 15) String str10, @SafeParcelable.Param(m51605id = 16) ArrayList arrayList3, @SafeParcelable.Param(m51605id = 17) boolean z, @SafeParcelable.Param(m51605id = 18) ArrayList arrayList4, @SafeParcelable.Param(m51605id = 19) ArrayList arrayList5, @SafeParcelable.Param(m51605id = 20) ArrayList arrayList6) {
        this.f72021b = str;
        this.f72022c = str2;
        this.f72023d = str3;
        this.f72024e = str4;
        this.f72025f = str5;
        this.f72026g = str6;
        this.f72027h = str7;
        this.f72028i = str8;
        this.f72029j = i;
        this.f72030k = arrayList;
        this.f72031l = timeInterval;
        this.f72032m = arrayList2;
        this.f72033n = str9;
        this.f72034o = str10;
        this.f72035p = arrayList3;
        this.f72036q = z;
        this.f72037r = arrayList4;
        this.f72038s = arrayList5;
        this.f72039t = arrayList6;
    }
}

package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "ContactInfoParcelCreator")
/* loaded from: classes5.dex */
public final class zzsd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsd> CREATOR = new C39404cq9();
    @SafeParcelable.Field(getter = "getName", m51606id = 1)

    /* renamed from: b */
    public final zzsh f70675b;
    @SafeParcelable.Field(getter = "getOrganization", m51606id = 2)

    /* renamed from: c */
    public final String f70676c;
    @SafeParcelable.Field(getter = "getTitle", m51606id = 3)

    /* renamed from: d */
    public final String f70677d;
    @SafeParcelable.Field(getter = "getPhones", m51606id = 4)

    /* renamed from: e */
    public final zzsi[] f70678e;
    @SafeParcelable.Field(getter = "getEmails", m51606id = 5)

    /* renamed from: f */
    public final zzsf[] f70679f;
    @SafeParcelable.Field(getter = "getUrls", m51606id = 6)

    /* renamed from: g */
    public final String[] f70680g;
    @SafeParcelable.Field(getter = "getAddresses", m51606id = 7)

    /* renamed from: h */
    public final zzsa[] f70681h;

    @SafeParcelable.Constructor
    public zzsd(@SafeParcelable.Param(m51605id = 1) zzsh zzshVar, @SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) String str2, @SafeParcelable.Param(m51605id = 4) zzsi[] zzsiVarArr, @SafeParcelable.Param(m51605id = 5) zzsf[] zzsfVarArr, @SafeParcelable.Param(m51605id = 6) String[] strArr, @SafeParcelable.Param(m51605id = 7) zzsa[] zzsaVarArr) {
        this.f70675b = zzshVar;
        this.f70676c = str;
        this.f70677d = str2;
        this.f70678e = zzsiVarArr;
        this.f70679f = zzsfVarArr;
        this.f70680g = strArr;
        this.f70681h = zzsaVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f70675b, i, false);
        SafeParcelWriter.writeString(parcel, 2, this.f70676c, false);
        SafeParcelWriter.writeString(parcel, 3, this.f70677d, false);
        SafeParcelWriter.writeTypedArray(parcel, 4, this.f70678e, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.f70679f, i, false);
        SafeParcelWriter.writeStringArray(parcel, 6, this.f70680g, false);
        SafeParcelWriter.writeTypedArray(parcel, 7, this.f70681h, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

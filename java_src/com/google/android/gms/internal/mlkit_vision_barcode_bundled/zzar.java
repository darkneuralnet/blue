package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "ContactInfoParcelCreator")
/* loaded from: classes5.dex */
public final class zzar extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzar> CREATOR = new SH7();
    @SafeParcelable.Field(getter = "getName", m51606id = 1)

    /* renamed from: b */
    public final zzav f70757b;
    @SafeParcelable.Field(getter = "getOrganization", m51606id = 2)

    /* renamed from: c */
    public final String f70758c;
    @SafeParcelable.Field(getter = "getTitle", m51606id = 3)

    /* renamed from: d */
    public final String f70759d;
    @SafeParcelable.Field(getter = "getPhones", m51606id = 4)

    /* renamed from: e */
    public final zzaw[] f70760e;
    @SafeParcelable.Field(getter = "getEmails", m51606id = 5)

    /* renamed from: f */
    public final zzat[] f70761f;
    @SafeParcelable.Field(getter = "getUrls", m51606id = 6)

    /* renamed from: g */
    public final String[] f70762g;
    @SafeParcelable.Field(getter = "getAddresses", m51606id = 7)

    /* renamed from: h */
    public final zzao[] f70763h;

    @SafeParcelable.Constructor
    public zzar(@SafeParcelable.Param(m51605id = 1) zzav zzavVar, @SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) String str2, @SafeParcelable.Param(m51605id = 4) zzaw[] zzawVarArr, @SafeParcelable.Param(m51605id = 5) zzat[] zzatVarArr, @SafeParcelable.Param(m51605id = 6) String[] strArr, @SafeParcelable.Param(m51605id = 7) zzao[] zzaoVarArr) {
        this.f70757b = zzavVar;
        this.f70758c = str;
        this.f70759d = str2;
        this.f70760e = zzawVarArr;
        this.f70761f = zzatVarArr;
        this.f70762g = strArr;
        this.f70763h = zzaoVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f70757b, i, false);
        SafeParcelWriter.writeString(parcel, 2, this.f70758c, false);
        SafeParcelWriter.writeString(parcel, 3, this.f70759d, false);
        SafeParcelWriter.writeTypedArray(parcel, 4, this.f70760e, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.f70761f, i, false);
        SafeParcelWriter.writeStringArray(parcel, 6, this.f70762g, false);
        SafeParcelWriter.writeTypedArray(parcel, 7, this.f70763h, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

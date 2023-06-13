package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "ContactInfoCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new C52467ys9();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public zzl f70598b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public String f70599c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public String f70600d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public zzm[] f70601e;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: f */
    public zzj[] f70602f;
    @SafeParcelable.Field(m51606id = 7)

    /* renamed from: g */
    public String[] f70603g;
    @SafeParcelable.Field(m51606id = 8)

    /* renamed from: h */
    public zze[] f70604h;

    public zzh() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f70598b, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.f70599c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f70600d, false);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.f70601e, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 6, this.f70602f, i, false);
        SafeParcelWriter.writeStringArray(parcel, 7, this.f70603g, false);
        SafeParcelWriter.writeTypedArray(parcel, 8, this.f70604h, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzh(@SafeParcelable.Param(m51605id = 2) zzl zzlVar, @SafeParcelable.Param(m51605id = 3) String str, @SafeParcelable.Param(m51605id = 4) String str2, @SafeParcelable.Param(m51605id = 5) zzm[] zzmVarArr, @SafeParcelable.Param(m51605id = 6) zzj[] zzjVarArr, @SafeParcelable.Param(m51605id = 7) String[] strArr, @SafeParcelable.Param(m51605id = 8) zze[] zzeVarArr) {
        this.f70598b = zzlVar;
        this.f70599c = str;
        this.f70600d = str2;
        this.f70601e = zzmVarArr;
        this.f70602f = zzjVarArr;
        this.f70603g = strArr;
        this.f70604h = zzeVarArr;
    }
}

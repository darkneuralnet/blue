package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "WordBoxParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new Eo9();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public final zzn[] f70993b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public final zzf f70994c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public final zzf f70995d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public final String f70996e;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: f */
    public final float f70997f;
    @SafeParcelable.Field(m51606id = 7)

    /* renamed from: g */
    public final String f70998g;
    @SafeParcelable.Field(m51606id = 8)

    /* renamed from: h */
    public final boolean f70999h;

    @SafeParcelable.Constructor
    public zzr(@SafeParcelable.Param(m51605id = 2) zzn[] zznVarArr, @SafeParcelable.Param(m51605id = 3) zzf zzfVar, @SafeParcelable.Param(m51605id = 4) zzf zzfVar2, @SafeParcelable.Param(m51605id = 5) String str, @SafeParcelable.Param(m51605id = 6) float f, @SafeParcelable.Param(m51605id = 7) String str2, @SafeParcelable.Param(m51605id = 8) boolean z) {
        this.f70993b = zznVarArr;
        this.f70994c = zzfVar;
        this.f70995d = zzfVar2;
        this.f70996e = str;
        this.f70997f = f;
        this.f70998g = str2;
        this.f70999h = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.f70993b, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f70994c, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f70995d, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.f70996e, false);
        SafeParcelWriter.writeFloat(parcel, 6, this.f70997f);
        SafeParcelWriter.writeString(parcel, 7, this.f70998g, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.f70999h);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

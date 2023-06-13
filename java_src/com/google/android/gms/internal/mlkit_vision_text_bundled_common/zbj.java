package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "WordBoxParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class zbj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zbj> CREATOR = new C49630u57();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public final zbh[] f70926b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public final zbd f70927c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public final zbd f70928d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public final String f70929e;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: f */
    public final float f70930f;
    @SafeParcelable.Field(m51606id = 7)

    /* renamed from: g */
    public final String f70931g;
    @SafeParcelable.Field(m51606id = 8)

    /* renamed from: h */
    public final boolean f70932h;

    @SafeParcelable.Constructor
    public zbj(@SafeParcelable.Param(m51605id = 2) zbh[] zbhVarArr, @SafeParcelable.Param(m51605id = 3) zbd zbdVar, @SafeParcelable.Param(m51605id = 4) zbd zbdVar2, @SafeParcelable.Param(m51605id = 5) String str, @SafeParcelable.Param(m51605id = 6) float f, @SafeParcelable.Param(m51605id = 7) String str2, @SafeParcelable.Param(m51605id = 8) boolean z) {
        this.f70926b = zbhVarArr;
        this.f70927c = zbdVar;
        this.f70928d = zbdVar2;
        this.f70929e = str;
        this.f70930f = f;
        this.f70931g = str2;
        this.f70932h = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.f70926b, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f70927c, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f70928d, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.f70929e, false);
        SafeParcelWriter.writeFloat(parcel, 6, this.f70930f);
        SafeParcelWriter.writeString(parcel, 7, this.f70931g, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.f70932h);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

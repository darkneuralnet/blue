package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "PersonNameParcelCreator")
/* loaded from: classes5.dex */
public final class zzsh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsh> CREATOR = new C39414cr9();
    @SafeParcelable.Field(getter = "getFormattedName", m51606id = 1)

    /* renamed from: b */
    public final String f70702b;
    @SafeParcelable.Field(getter = "getPronunciation", m51606id = 2)

    /* renamed from: c */
    public final String f70703c;
    @SafeParcelable.Field(getter = "getPrefix", m51606id = 3)

    /* renamed from: d */
    public final String f70704d;
    @SafeParcelable.Field(getter = "getFirst", m51606id = 4)

    /* renamed from: e */
    public final String f70705e;
    @SafeParcelable.Field(getter = "getMiddle", m51606id = 5)

    /* renamed from: f */
    public final String f70706f;
    @SafeParcelable.Field(getter = "getLast", m51606id = 6)

    /* renamed from: g */
    public final String f70707g;
    @SafeParcelable.Field(getter = "getSuffix", m51606id = 7)

    /* renamed from: h */
    public final String f70708h;

    @SafeParcelable.Constructor
    public zzsh(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) String str2, @SafeParcelable.Param(m51605id = 3) String str3, @SafeParcelable.Param(m51605id = 4) String str4, @SafeParcelable.Param(m51605id = 5) String str5, @SafeParcelable.Param(m51605id = 6) String str6, @SafeParcelable.Param(m51605id = 7) String str7) {
        this.f70702b = str;
        this.f70703c = str2;
        this.f70704d = str3;
        this.f70705e = str4;
        this.f70706f = str5;
        this.f70707g = str6;
        this.f70708h = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f70702b, false);
        SafeParcelWriter.writeString(parcel, 2, this.f70703c, false);
        SafeParcelWriter.writeString(parcel, 3, this.f70704d, false);
        SafeParcelWriter.writeString(parcel, 4, this.f70705e, false);
        SafeParcelWriter.writeString(parcel, 5, this.f70706f, false);
        SafeParcelWriter.writeString(parcel, 6, this.f70707g, false);
        SafeParcelWriter.writeString(parcel, 7, this.f70708h, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

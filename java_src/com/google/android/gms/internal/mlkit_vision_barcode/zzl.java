package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "PersonNameCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new Lx9();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public String f70625b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public String f70626c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public String f70627d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public String f70628e;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: f */
    public String f70629f;
    @SafeParcelable.Field(m51606id = 7)

    /* renamed from: g */
    public String f70630g;
    @SafeParcelable.Field(m51606id = 8)

    /* renamed from: h */
    public String f70631h;

    public zzl() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f70625b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f70626c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f70627d, false);
        SafeParcelWriter.writeString(parcel, 5, this.f70628e, false);
        SafeParcelWriter.writeString(parcel, 6, this.f70629f, false);
        SafeParcelWriter.writeString(parcel, 7, this.f70630g, false);
        SafeParcelWriter.writeString(parcel, 8, this.f70631h, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzl(@SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) String str2, @SafeParcelable.Param(m51605id = 4) String str3, @SafeParcelable.Param(m51605id = 5) String str4, @SafeParcelable.Param(m51605id = 6) String str5, @SafeParcelable.Param(m51605id = 7) String str6, @SafeParcelable.Param(m51605id = 8) String str7) {
        this.f70625b = str;
        this.f70626c = str2;
        this.f70627d = str3;
        this.f70628e = str4;
        this.f70629f = str5;
        this.f70630g = str6;
        this.f70631h = str7;
    }
}

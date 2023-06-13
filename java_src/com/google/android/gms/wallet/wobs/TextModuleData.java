package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "TextModuleDataCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class TextModuleData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TextModuleData> CREATOR = new BN8();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public String f72054b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public String f72055c;

    public TextModuleData() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f72054b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f72055c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public TextModuleData(@SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) String str2) {
        this.f72054b = str;
        this.f72055c = str2;
    }
}

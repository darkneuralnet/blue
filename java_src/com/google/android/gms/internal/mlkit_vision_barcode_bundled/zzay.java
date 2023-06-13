package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "UrlBookmarkParcelCreator")
/* loaded from: classes5.dex */
public final class zzay extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzay> CREATOR = new C43868kN7();
    @SafeParcelable.Field(getter = "getTitle", m51606id = 1)

    /* renamed from: b */
    public final String f70795b;
    @SafeParcelable.Field(getter = "getUrl", m51606id = 2)

    /* renamed from: c */
    public final String f70796c;

    @SafeParcelable.Constructor
    public zzay(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) String str2) {
        this.f70795b = str;
        this.f70796c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f70795b, false);
        SafeParcelWriter.writeString(parcel, 2, this.f70796c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

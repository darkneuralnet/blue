package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "UrlBookmarkParcelCreator")
/* loaded from: classes5.dex */
public final class zzsk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsk> CREATOR = new C44750lr9();
    @SafeParcelable.Field(getter = "getTitle", m51606id = 1)

    /* renamed from: b */
    public final String f70713b;
    @SafeParcelable.Field(getter = "getUrl", m51606id = 2)

    /* renamed from: c */
    public final String f70714c;

    @SafeParcelable.Constructor
    public zzsk(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) String str2) {
        this.f70713b = str;
        this.f70714c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f70713b, false);
        SafeParcelWriter.writeString(parcel, 2, this.f70714c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

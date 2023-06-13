package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
@SafeParcelable.Class(creator = "TextParcelCreator")
/* loaded from: classes5.dex */
public final class zbom extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zbom> CREATOR = new W77();
    @SafeParcelable.Field(getter = "getText", m51606id = 1)

    /* renamed from: b */
    public final String f70957b;
    @SafeParcelable.Field(getter = "getTextBlockList", m51606id = 2)

    /* renamed from: c */
    public final List f70958c;

    @SafeParcelable.Constructor
    public zbom(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) List list) {
        this.f70957b = str;
        this.f70958c = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f70957b, false);
        SafeParcelWriter.writeTypedList(parcel, 2, this.f70958c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
@SafeParcelable.Class(creator = "TextParcelCreator")
/* loaded from: classes5.dex */
public final class zzsg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsg> CREATOR = new C51844xp9();
    @SafeParcelable.Field(getter = "getText", m51606id = 1)

    /* renamed from: b */
    public final String f71024b;
    @SafeParcelable.Field(getter = "getTextBlockList", m51606id = 2)

    /* renamed from: c */
    public final List f71025c;

    @SafeParcelable.Constructor
    public zzsg(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) List list) {
        this.f71024b = str;
        this.f71025c = list;
    }

    /* renamed from: s */
    public final List m51241s() {
        return this.f71025c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f71024b, false);
        SafeParcelWriter.writeTypedList(parcel, 2, this.f71025c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zza() {
        return this.f71024b;
    }
}

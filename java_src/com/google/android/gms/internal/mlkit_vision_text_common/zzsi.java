package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "TextRecognizerOptionsCreator")
/* loaded from: classes5.dex */
public final class zzsi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsi> CREATOR = new Cp9();
    @SafeParcelable.Field(getter = "getConfigLabel", m51606id = 1)

    /* renamed from: b */
    public final String f71026b;
    @SafeParcelable.Field(getter = "getLoggingLibraryName", m51606id = 2)

    /* renamed from: c */
    public final String f71027c;
    @SafeParcelable.Field(getter = "getModelPath", m51606id = 3)

    /* renamed from: d */
    public final String f71028d;
    @SafeParcelable.Field(getter = "getIsMLKit", m51606id = 4)

    /* renamed from: e */
    public final boolean f71029e;
    @SafeParcelable.Field(getter = "getDetectionTypeValue", m51606id = 5)

    /* renamed from: f */
    public final int f71030f;
    @SafeParcelable.Field(getter = "getLanguageHint", m51606id = 6)

    /* renamed from: g */
    public final String f71031g;

    @SafeParcelable.Constructor
    public zzsi(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) String str2, @SafeParcelable.Param(m51605id = 3) String str3, @SafeParcelable.Param(m51605id = 4) boolean z, @SafeParcelable.Param(m51605id = 5) int i, @SafeParcelable.Param(m51605id = 6) String str4) {
        this.f71026b = str;
        this.f71027c = str2;
        this.f71028d = str3;
        this.f71031g = str4;
        this.f71030f = i;
        this.f71029e = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f71026b, false);
        SafeParcelWriter.writeString(parcel, 2, this.f71027c, false);
        SafeParcelWriter.writeString(parcel, 3, this.f71028d, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f71029e);
        SafeParcelWriter.writeInt(parcel, 5, this.f71030f);
        SafeParcelWriter.writeString(parcel, 6, this.f71031g, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "TextRecognizerOptionsCreator")
/* loaded from: classes5.dex */
public final class zboo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zboo> CREATOR = new X77();
    @SafeParcelable.Field(getter = "getConfigLabel", m51606id = 1)

    /* renamed from: b */
    public final String f70959b;
    @SafeParcelable.Field(getter = "getLoggingLibraryName", m51606id = 2)

    /* renamed from: c */
    public final String f70960c;
    @SafeParcelable.Field(getter = "getModelPath", m51606id = 3)

    /* renamed from: d */
    public final String f70961d;
    @SafeParcelable.Field(getter = "getIsMLKit", m51606id = 4)

    /* renamed from: e */
    public final boolean f70962e;
    @SafeParcelable.Field(getter = "getDetectionTypeValue", m51606id = 5)

    /* renamed from: f */
    public final int f70963f;
    @SafeParcelable.Field(getter = "getLanguageHint", m51606id = 6)

    /* renamed from: g */
    public final String f70964g;

    @SafeParcelable.Constructor
    public zboo(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) String str2, @SafeParcelable.Param(m51605id = 3) String str3, @SafeParcelable.Param(m51605id = 4) boolean z, @SafeParcelable.Param(m51605id = 5) int i, @SafeParcelable.Param(m51605id = 6) String str4) {
        this.f70959b = str;
        this.f70960c = str2;
        this.f70961d = str3;
        this.f70964g = str4;
        this.f70963f = i;
        this.f70962e = z;
    }

    /* renamed from: s */
    public final String m51265s() {
        return this.f70959b;
    }

    /* renamed from: u */
    public final String m51264u() {
        return this.f70964g;
    }

    /* renamed from: v */
    public final String m51263v() {
        return this.f70961d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f70959b, false);
        SafeParcelWriter.writeString(parcel, 2, this.f70960c, false);
        SafeParcelWriter.writeString(parcel, 3, this.f70961d, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f70962e);
        SafeParcelWriter.writeInt(parcel, 5, this.f70963f);
        SafeParcelWriter.writeString(parcel, 6, this.f70964g, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

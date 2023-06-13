package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "BoundingBoxParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class zbd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zbd> CREATOR = new C51961y17();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public final int f70910b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public final int f70911c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public final int f70912d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public final int f70913e;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: f */
    public final float f70914f;

    @SafeParcelable.Constructor
    public zbd(@SafeParcelable.Param(m51605id = 2) int i, @SafeParcelable.Param(m51605id = 3) int i2, @SafeParcelable.Param(m51605id = 4) int i3, @SafeParcelable.Param(m51605id = 5) int i4, @SafeParcelable.Param(m51605id = 6) float f) {
        this.f70910b = i;
        this.f70911c = i2;
        this.f70912d = i3;
        this.f70913e = i4;
        this.f70914f = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f70910b);
        SafeParcelWriter.writeInt(parcel, 3, this.f70911c);
        SafeParcelWriter.writeInt(parcel, 4, this.f70912d);
        SafeParcelWriter.writeInt(parcel, 5, this.f70913e);
        SafeParcelWriter.writeFloat(parcel, 6, this.f70914f);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

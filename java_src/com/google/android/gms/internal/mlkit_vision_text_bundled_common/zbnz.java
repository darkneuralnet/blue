package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "ImageMetadataParcelCreator")
/* loaded from: classes5.dex */
public final class zbnz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zbnz> CREATOR = new N77();
    @SafeParcelable.Field(getter = "getImageFormat", m51606id = 1)

    /* renamed from: b */
    public final int f70933b;
    @SafeParcelable.Field(getter = "getWidth", m51606id = 2)

    /* renamed from: c */
    public final int f70934c;
    @SafeParcelable.Field(getter = "getHeight", m51606id = 3)

    /* renamed from: d */
    public final int f70935d;
    @SafeParcelable.Field(getter = "getRotation", m51606id = 4)

    /* renamed from: e */
    public final int f70936e;
    @SafeParcelable.Field(getter = "getTimestampMs", m51606id = 5)

    /* renamed from: f */
    public final long f70937f;

    @SafeParcelable.Constructor
    public zbnz(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) int i2, @SafeParcelable.Param(m51605id = 3) int i3, @SafeParcelable.Param(m51605id = 4) int i4, @SafeParcelable.Param(m51605id = 5) long j) {
        this.f70933b = i;
        this.f70934c = i2;
        this.f70935d = i3;
        this.f70936e = i4;
        this.f70937f = j;
    }

    /* renamed from: E */
    public final long m51275E() {
        return this.f70937f;
    }

    /* renamed from: s */
    public final int m51274s() {
        return this.f70933b;
    }

    /* renamed from: u */
    public final int m51273u() {
        return this.f70936e;
    }

    /* renamed from: v */
    public final int m51272v() {
        return this.f70934c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f70933b);
        SafeParcelWriter.writeInt(parcel, 2, this.f70934c);
        SafeParcelWriter.writeInt(parcel, 3, this.f70935d);
        SafeParcelWriter.writeInt(parcel, 4, this.f70936e);
        SafeParcelWriter.writeLong(parcel, 5, this.f70937f);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* renamed from: y */
    public final int m51271y() {
        return this.f70935d;
    }
}

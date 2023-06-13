package com.google.android.gms.internal.mlkit_vision_face_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "FaceDetectorOptionsParcelCreator")
/* loaded from: classes5.dex */
public final class zzmh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmh> CREATOR = new C44256l19();
    @SafeParcelable.Field(getter = "getPerformanceMode", m51606id = 1)

    /* renamed from: b */
    public final int f70888b;
    @SafeParcelable.Field(getter = "getLandmarkMode", m51606id = 2)

    /* renamed from: c */
    public final int f70889c;
    @SafeParcelable.Field(getter = "getClassificationMode", m51606id = 3)

    /* renamed from: d */
    public final int f70890d;
    @SafeParcelable.Field(getter = "getContourMode", m51606id = 4)

    /* renamed from: e */
    public final int f70891e;
    @SafeParcelable.Field(getter = "isTrackingEnabled", m51606id = 5)

    /* renamed from: f */
    public final boolean f70892f;
    @SafeParcelable.Field(getter = "getProportionalMinFaceSize", m51606id = 6)

    /* renamed from: g */
    public final float f70893g;

    @SafeParcelable.Constructor
    public zzmh(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) int i2, @SafeParcelable.Param(m51605id = 3) int i3, @SafeParcelable.Param(m51605id = 4) int i4, @SafeParcelable.Param(m51605id = 5) boolean z, @SafeParcelable.Param(m51605id = 6) float f) {
        this.f70888b = i;
        this.f70889c = i2;
        this.f70890d = i3;
        this.f70891e = i4;
        this.f70892f = z;
        this.f70893g = f;
    }

    /* renamed from: s */
    public final float m51299s() {
        return this.f70893g;
    }

    /* renamed from: u */
    public final int m51298u() {
        return this.f70890d;
    }

    /* renamed from: v */
    public final int m51297v() {
        return this.f70888b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f70888b);
        SafeParcelWriter.writeInt(parcel, 2, this.f70889c);
        SafeParcelWriter.writeInt(parcel, 3, this.f70890d);
        SafeParcelWriter.writeInt(parcel, 4, this.f70891e);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f70892f);
        SafeParcelWriter.writeFloat(parcel, 6, this.f70893g);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* renamed from: x */
    public final boolean m51296x() {
        return this.f70892f;
    }

    public final int zzc() {
        return this.f70891e;
    }

    public final int zzd() {
        return this.f70889c;
    }
}

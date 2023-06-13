package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "FaceDetectorOptionsParcelCreator")
/* loaded from: classes5.dex */
public final class zznr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznr> CREATOR = new R79();
    @SafeParcelable.Field(getter = "getPerformanceMode", m51606id = 1)

    /* renamed from: b */
    public final int f70857b;
    @SafeParcelable.Field(getter = "getLandmarkMode", m51606id = 2)

    /* renamed from: c */
    public final int f70858c;
    @SafeParcelable.Field(getter = "getClassificationMode", m51606id = 3)

    /* renamed from: d */
    public final int f70859d;
    @SafeParcelable.Field(getter = "getContourMode", m51606id = 4)

    /* renamed from: e */
    public final int f70860e;
    @SafeParcelable.Field(getter = "isTrackingEnabled", m51606id = 5)

    /* renamed from: f */
    public final boolean f70861f;
    @SafeParcelable.Field(getter = "getProportionalMinFaceSize", m51606id = 6)

    /* renamed from: g */
    public final float f70862g;

    @SafeParcelable.Constructor
    public zznr(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) int i2, @SafeParcelable.Param(m51605id = 3) int i3, @SafeParcelable.Param(m51605id = 4) int i4, @SafeParcelable.Param(m51605id = 5) boolean z, @SafeParcelable.Param(m51605id = 6) float f) {
        this.f70857b = i;
        this.f70858c = i2;
        this.f70859d = i3;
        this.f70860e = i4;
        this.f70861f = z;
        this.f70862g = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f70857b);
        SafeParcelWriter.writeInt(parcel, 2, this.f70858c);
        SafeParcelWriter.writeInt(parcel, 3, this.f70859d);
        SafeParcelWriter.writeInt(parcel, 4, this.f70860e);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f70861f);
        SafeParcelWriter.writeFloat(parcel, 6, this.f70862g);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

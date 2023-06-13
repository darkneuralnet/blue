package com.google.android.gms.internal.mlkit_vision_face_bundled;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "LandmarkParcelCreator")
/* loaded from: classes5.dex */
public final class zzmq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmq> CREATOR = new V29();
    @SafeParcelable.Field(getter = "getType", m51606id = 1)

    /* renamed from: b */
    public final int f70905b;
    @SafeParcelable.Field(getter = "getPosition", m51606id = 2)

    /* renamed from: c */
    public final PointF f70906c;

    @SafeParcelable.Constructor
    public zzmq(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) PointF pointF) {
        this.f70905b = i;
        this.f70906c = pointF;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f70905b);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f70906c, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

package com.google.android.gms.internal.mlkit_vision_face;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "LandmarkParcelCreator")
/* loaded from: classes5.dex */
public final class zznz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznz> CREATOR = new H99();
    @SafeParcelable.Field(getter = "getType", m51606id = 1)

    /* renamed from: b */
    public final int f70874b;
    @SafeParcelable.Field(getter = "getPosition", m51606id = 2)

    /* renamed from: c */
    public final PointF f70875c;

    @SafeParcelable.Constructor
    public zznz(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) PointF pointF) {
        this.f70874b = i;
        this.f70875c = pointF;
    }

    /* renamed from: s */
    public final PointF m51302s() {
        return this.f70875c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f70874b);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f70875c, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.f70874b;
    }
}

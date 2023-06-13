package com.google.android.gms.vision.face.internal.client;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "ContourParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new YP7();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public final PointF[] f71890b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public final int f71891c;

    @SafeParcelable.Constructor
    public zza(@SafeParcelable.Param(m51605id = 2) PointF[] pointFArr, @SafeParcelable.Param(m51605id = 3) int i) {
        this.f71890b = pointFArr;
        this.f71891c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.f71890b, i, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f71891c);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

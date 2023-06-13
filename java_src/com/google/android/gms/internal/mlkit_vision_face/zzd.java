package com.google.android.gms.internal.mlkit_vision_face;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "ContourParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new C38951c68();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public final PointF[] f70823b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public final int f70824c;

    @SafeParcelable.Constructor
    public zzd(@SafeParcelable.Param(m51605id = 2) PointF[] pointFArr, @SafeParcelable.Param(m51605id = 3) int i) {
        this.f70823b = pointFArr;
        this.f70824c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.f70823b, i, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f70824c);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

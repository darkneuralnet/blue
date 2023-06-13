package com.google.android.gms.internal.mlkit_vision_face_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
@SafeParcelable.Class(creator = "ContourParcelCreator")
/* loaded from: classes5.dex */
public final class zzmf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmf> CREATOR = new S09();
    @SafeParcelable.Field(getter = "getType", m51606id = 1)

    /* renamed from: b */
    public final int f70886b;
    @SafeParcelable.Field(getter = "getPointList", m51606id = 2)

    /* renamed from: c */
    public final List f70887c;

    @SafeParcelable.Constructor
    public zzmf(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) List list) {
        this.f70886b = i;
        this.f70887c = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f70886b);
        SafeParcelWriter.writeTypedList(parcel, 2, this.f70887c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

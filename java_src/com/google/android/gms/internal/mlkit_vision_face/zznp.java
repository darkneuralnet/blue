package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
@SafeParcelable.Class(creator = "ContourParcelCreator")
/* loaded from: classes5.dex */
public final class zznp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznp> CREATOR = new D79();
    @SafeParcelable.Field(getter = "getType", m51606id = 1)

    /* renamed from: b */
    public final int f70855b;
    @SafeParcelable.Field(getter = "getPointList", m51606id = 2)

    /* renamed from: c */
    public final List f70856c;

    @SafeParcelable.Constructor
    public zznp(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) List list) {
        this.f70855b = i;
        this.f70856c = list;
    }

    /* renamed from: s */
    public final List m51313s() {
        return this.f70856c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f70855b);
        SafeParcelWriter.writeTypedList(parcel, 2, this.f70856c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.f70855b;
    }
}

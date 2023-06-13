package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
@SafeParcelable.Class(creator = "TextSymbolParcelCreator")
/* loaded from: classes5.dex */
public final class zboq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zboq> CREATOR = new Y77();
    @SafeParcelable.Field(getter = "getText", m51606id = 1)

    /* renamed from: b */
    public final String f70965b;
    @SafeParcelable.Field(getter = "getBoundingBox", m51606id = 2)

    /* renamed from: c */
    public final Rect f70966c;
    @SafeParcelable.Field(getter = "getCornerPointList", m51606id = 3)

    /* renamed from: d */
    public final List f70967d;
    @SafeParcelable.Field(getter = "getConfidence", m51606id = 4)

    /* renamed from: e */
    public final float f70968e;
    @SafeParcelable.Field(getter = "getAngle", m51606id = 5)

    /* renamed from: f */
    public final float f70969f;

    @SafeParcelable.Constructor
    public zboq(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) Rect rect, @SafeParcelable.Param(m51605id = 3) List list, @SafeParcelable.Param(m51605id = 4) float f, @SafeParcelable.Param(m51605id = 5) float f2) {
        this.f70965b = str;
        this.f70966c = rect;
        this.f70967d = list;
        this.f70968e = f;
        this.f70969f = f2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f70965b, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f70966c, i, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.f70967d, false);
        SafeParcelWriter.writeFloat(parcel, 4, this.f70968e);
        SafeParcelWriter.writeFloat(parcel, 5, this.f70969f);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

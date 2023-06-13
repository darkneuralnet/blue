package com.google.android.gms.internal.mlkit_vision_face_bundled;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
@SafeParcelable.Class(creator = "FaceParcelCreator")
/* loaded from: classes5.dex */
public final class zzmj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmj> CREATOR = new E19();
    @SafeParcelable.Field(getter = "getId", m51606id = 1)

    /* renamed from: b */
    public final int f70894b;
    @SafeParcelable.Field(getter = "getBoundingBox", m51606id = 2)

    /* renamed from: c */
    public final Rect f70895c;
    @SafeParcelable.Field(getter = "getRollAngle", m51606id = 3)

    /* renamed from: d */
    public final float f70896d;
    @SafeParcelable.Field(getter = "getPanAngle", m51606id = 4)

    /* renamed from: e */
    public final float f70897e;
    @SafeParcelable.Field(getter = "getTiltAngle", m51606id = 5)

    /* renamed from: f */
    public final float f70898f;
    @SafeParcelable.Field(getter = "getLeftEyeOpenProbability", m51606id = 6)

    /* renamed from: g */
    public final float f70899g;
    @SafeParcelable.Field(getter = "getRightEyeOpenProbability", m51606id = 7)

    /* renamed from: h */
    public final float f70900h;
    @SafeParcelable.Field(getter = "getSmileProbability", m51606id = 8)

    /* renamed from: i */
    public final float f70901i;
    @SafeParcelable.Field(getter = "getConfidenceScore", m51606id = 9)

    /* renamed from: j */
    public final float f70902j;
    @SafeParcelable.Field(getter = "getLandmarkParcelList", m51606id = 10)

    /* renamed from: k */
    public final List f70903k;
    @SafeParcelable.Field(getter = "getContourParcelList", m51606id = 11)

    /* renamed from: l */
    public final List f70904l;

    @SafeParcelable.Constructor
    public zzmj(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) Rect rect, @SafeParcelable.Param(m51605id = 3) float f, @SafeParcelable.Param(m51605id = 4) float f2, @SafeParcelable.Param(m51605id = 5) float f3, @SafeParcelable.Param(m51605id = 6) float f4, @SafeParcelable.Param(m51605id = 7) float f5, @SafeParcelable.Param(m51605id = 8) float f6, @SafeParcelable.Param(m51605id = 9) float f7, @SafeParcelable.Param(m51605id = 10) List list, @SafeParcelable.Param(m51605id = 11) List list2) {
        this.f70894b = i;
        this.f70895c = rect;
        this.f70896d = f;
        this.f70897e = f2;
        this.f70898f = f3;
        this.f70899g = f4;
        this.f70900h = f5;
        this.f70901i = f6;
        this.f70902j = f7;
        this.f70903k = list;
        this.f70904l = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f70894b);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f70895c, i, false);
        SafeParcelWriter.writeFloat(parcel, 3, this.f70896d);
        SafeParcelWriter.writeFloat(parcel, 4, this.f70897e);
        SafeParcelWriter.writeFloat(parcel, 5, this.f70898f);
        SafeParcelWriter.writeFloat(parcel, 6, this.f70899g);
        SafeParcelWriter.writeFloat(parcel, 7, this.f70900h);
        SafeParcelWriter.writeFloat(parcel, 8, this.f70901i);
        SafeParcelWriter.writeFloat(parcel, 9, this.f70902j);
        SafeParcelWriter.writeTypedList(parcel, 10, this.f70903k, false);
        SafeParcelWriter.writeTypedList(parcel, 11, this.f70904l, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

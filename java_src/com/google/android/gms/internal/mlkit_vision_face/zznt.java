package com.google.android.gms.internal.mlkit_vision_face;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
@SafeParcelable.Class(creator = "FaceParcelCreator")
/* loaded from: classes5.dex */
public final class zznt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznt> CREATOR = new C41361g89();
    @SafeParcelable.Field(getter = "getId", m51606id = 1)

    /* renamed from: b */
    public final int f70863b;
    @SafeParcelable.Field(getter = "getBoundingBox", m51606id = 2)

    /* renamed from: c */
    public final Rect f70864c;
    @SafeParcelable.Field(getter = "getRollAngle", m51606id = 3)

    /* renamed from: d */
    public final float f70865d;
    @SafeParcelable.Field(getter = "getPanAngle", m51606id = 4)

    /* renamed from: e */
    public final float f70866e;
    @SafeParcelable.Field(getter = "getTiltAngle", m51606id = 5)

    /* renamed from: f */
    public final float f70867f;
    @SafeParcelable.Field(getter = "getLeftEyeOpenProbability", m51606id = 6)

    /* renamed from: g */
    public final float f70868g;
    @SafeParcelable.Field(getter = "getRightEyeOpenProbability", m51606id = 7)

    /* renamed from: h */
    public final float f70869h;
    @SafeParcelable.Field(getter = "getSmileProbability", m51606id = 8)

    /* renamed from: i */
    public final float f70870i;
    @SafeParcelable.Field(getter = "getConfidenceScore", m51606id = 9)

    /* renamed from: j */
    public final float f70871j;
    @SafeParcelable.Field(getter = "getLandmarkParcelList", m51606id = 10)

    /* renamed from: k */
    public final List f70872k;
    @SafeParcelable.Field(getter = "getContourParcelList", m51606id = 11)

    /* renamed from: l */
    public final List f70873l;

    @SafeParcelable.Constructor
    public zznt(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) Rect rect, @SafeParcelable.Param(m51605id = 3) float f, @SafeParcelable.Param(m51605id = 4) float f2, @SafeParcelable.Param(m51605id = 5) float f3, @SafeParcelable.Param(m51605id = 6) float f4, @SafeParcelable.Param(m51605id = 7) float f5, @SafeParcelable.Param(m51605id = 8) float f6, @SafeParcelable.Param(m51605id = 9) float f7, @SafeParcelable.Param(m51605id = 10) List list, @SafeParcelable.Param(m51605id = 11) List list2) {
        this.f70863b = i;
        this.f70864c = rect;
        this.f70865d = f;
        this.f70866e = f2;
        this.f70867f = f3;
        this.f70868g = f4;
        this.f70869h = f5;
        this.f70870i = f6;
        this.f70871j = f7;
        this.f70872k = list;
        this.f70873l = list2;
    }

    /* renamed from: E */
    public final float m51312E() {
        return this.f70865d;
    }

    /* renamed from: F */
    public final float m51311F() {
        return this.f70870i;
    }

    /* renamed from: K */
    public final float m51310K() {
        return this.f70867f;
    }

    /* renamed from: L */
    public final int m51309L() {
        return this.f70863b;
    }

    /* renamed from: R */
    public final Rect m51308R() {
        return this.f70864c;
    }

    /* renamed from: T */
    public final List m51307T() {
        return this.f70873l;
    }

    /* renamed from: j0 */
    public final List m51306j0() {
        return this.f70872k;
    }

    /* renamed from: s */
    public final float m51305s() {
        return this.f70868g;
    }

    /* renamed from: u */
    public final float m51304u() {
        return this.f70866e;
    }

    /* renamed from: v */
    public final float m51303v() {
        return this.f70869h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f70863b);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f70864c, i, false);
        SafeParcelWriter.writeFloat(parcel, 3, this.f70865d);
        SafeParcelWriter.writeFloat(parcel, 4, this.f70866e);
        SafeParcelWriter.writeFloat(parcel, 5, this.f70867f);
        SafeParcelWriter.writeFloat(parcel, 6, this.f70868g);
        SafeParcelWriter.writeFloat(parcel, 7, this.f70869h);
        SafeParcelWriter.writeFloat(parcel, 8, this.f70870i);
        SafeParcelWriter.writeFloat(parcel, 9, this.f70871j);
        SafeParcelWriter.writeTypedList(parcel, 10, this.f70872k, false);
        SafeParcelWriter.writeTypedList(parcel, 11, this.f70873l, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

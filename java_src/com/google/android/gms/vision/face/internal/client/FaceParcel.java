package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.apps.common.proguard.UsedByNative;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@UsedByNative("wrapper.cc")
@SafeParcelable.Class(creator = "FaceParcelCreator")
/* loaded from: classes6.dex */
public class FaceParcel extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<FaceParcel> CREATOR = new C41595gY7();
    @SafeParcelable.VersionField(m51603id = 1)

    /* renamed from: b */
    public final int f71871b;
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: c */
    public final int f71872c;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: d */
    public final float f71873d;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: e */
    public final float f71874e;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: f */
    public final float f71875f;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: g */
    public final float f71876g;
    @SafeParcelable.Field(defaultValue = "3.4028235E38f", m51606id = 7)

    /* renamed from: h */
    public final float f71877h;
    @SafeParcelable.Field(defaultValue = "3.4028235E38f", m51606id = 8)

    /* renamed from: i */
    public final float f71878i;
    @SafeParcelable.Field(defaultValue = "3.4028235E38f", m51606id = 14)

    /* renamed from: j */
    public final float f71879j;
    @RecentlyNonNull
    @SafeParcelable.Field(m51606id = 9)

    /* renamed from: k */
    public final LandmarkParcel[] f71880k;
    @SafeParcelable.Field(m51606id = 10)

    /* renamed from: l */
    public final float f71881l;
    @SafeParcelable.Field(m51606id = 11)

    /* renamed from: m */
    public final float f71882m;
    @SafeParcelable.Field(m51606id = 12)

    /* renamed from: n */
    public final float f71883n;
    @SafeParcelable.Field(m51606id = 13)

    /* renamed from: o */
    public final zza[] f71884o;
    @SafeParcelable.Field(defaultValue = "-1.0f", m51606id = 15)

    /* renamed from: p */
    public final float f71885p;

    @SafeParcelable.Constructor
    public FaceParcel(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) int i2, @SafeParcelable.Param(m51605id = 3) float f, @SafeParcelable.Param(m51605id = 4) float f2, @SafeParcelable.Param(m51605id = 5) float f3, @SafeParcelable.Param(m51605id = 6) float f4, @SafeParcelable.Param(m51605id = 7) float f5, @SafeParcelable.Param(m51605id = 8) float f6, @SafeParcelable.Param(m51605id = 14) float f7, @SafeParcelable.Param(m51605id = 9) LandmarkParcel[] landmarkParcelArr, @SafeParcelable.Param(m51605id = 10) float f8, @SafeParcelable.Param(m51605id = 11) float f9, @SafeParcelable.Param(m51605id = 12) float f10, @SafeParcelable.Param(m51605id = 13) zza[] zzaVarArr, @SafeParcelable.Param(m51605id = 15) float f11) {
        this.f71871b = i;
        this.f71872c = i2;
        this.f71873d = f;
        this.f71874e = f2;
        this.f71875f = f3;
        this.f71876g = f4;
        this.f71877h = f5;
        this.f71878i = f6;
        this.f71879j = f7;
        this.f71880k = landmarkParcelArr;
        this.f71881l = f8;
        this.f71882m = f9;
        this.f71883n = f10;
        this.f71884o = zzaVarArr;
        this.f71885p = f11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f71871b);
        SafeParcelWriter.writeInt(parcel, 2, this.f71872c);
        SafeParcelWriter.writeFloat(parcel, 3, this.f71873d);
        SafeParcelWriter.writeFloat(parcel, 4, this.f71874e);
        SafeParcelWriter.writeFloat(parcel, 5, this.f71875f);
        SafeParcelWriter.writeFloat(parcel, 6, this.f71876g);
        SafeParcelWriter.writeFloat(parcel, 7, this.f71877h);
        SafeParcelWriter.writeFloat(parcel, 8, this.f71878i);
        SafeParcelWriter.writeTypedArray(parcel, 9, this.f71880k, i, false);
        SafeParcelWriter.writeFloat(parcel, 10, this.f71881l);
        SafeParcelWriter.writeFloat(parcel, 11, this.f71882m);
        SafeParcelWriter.writeFloat(parcel, 12, this.f71883n);
        SafeParcelWriter.writeTypedArray(parcel, 13, this.f71884o, i, false);
        SafeParcelWriter.writeFloat(parcel, 14, this.f71879j);
        SafeParcelWriter.writeFloat(parcel, 15, this.f71885p);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @UsedByNative("wrapper.cc")
    public FaceParcel(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) int i2, @SafeParcelable.Param(m51605id = 3) float f, @SafeParcelable.Param(m51605id = 4) float f2, @SafeParcelable.Param(m51605id = 5) float f3, @SafeParcelable.Param(m51605id = 6) float f4, @SafeParcelable.Param(m51605id = 7) float f5, @SafeParcelable.Param(m51605id = 8) float f6, @RecentlyNonNull @SafeParcelable.Param(m51605id = 9) LandmarkParcel[] landmarkParcelArr, @SafeParcelable.Param(m51605id = 10) float f7, @SafeParcelable.Param(m51605id = 11) float f8, @SafeParcelable.Param(m51605id = 12) float f9) {
        this(i, i2, f, f2, f3, f4, f5, f6, 0.0f, landmarkParcelArr, f7, f8, f9, new zza[0], -1.0f);
    }
}

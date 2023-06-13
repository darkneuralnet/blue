package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "FaceParcelCreator")
/* loaded from: classes5.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new C39955dm8();
    @SafeParcelable.VersionField(m51603id = 1)

    /* renamed from: b */
    public final int f70825b;
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: c */
    public final int f70826c;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: d */
    public final float f70827d;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: e */
    public final float f70828e;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: f */
    public final float f70829f;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: g */
    public final float f70830g;
    @SafeParcelable.Field(defaultValue = "3.4028235E38f", m51606id = 7)

    /* renamed from: h */
    public final float f70831h;
    @SafeParcelable.Field(defaultValue = "3.4028235E38f", m51606id = 8)

    /* renamed from: i */
    public final float f70832i;
    @SafeParcelable.Field(defaultValue = "3.4028235E38f", m51606id = 14)

    /* renamed from: j */
    public final float f70833j;
    @SafeParcelable.Field(m51606id = 9)

    /* renamed from: k */
    public final zzn[] f70834k;
    @SafeParcelable.Field(m51606id = 10)

    /* renamed from: l */
    public final float f70835l;
    @SafeParcelable.Field(m51606id = 11)

    /* renamed from: m */
    public final float f70836m;
    @SafeParcelable.Field(m51606id = 12)

    /* renamed from: n */
    public final float f70837n;
    @SafeParcelable.Field(m51606id = 13)

    /* renamed from: o */
    public final zzd[] f70838o;
    @SafeParcelable.Field(defaultValue = "-1.0f", m51606id = 15)

    /* renamed from: p */
    public final float f70839p;

    @SafeParcelable.Constructor
    public zzf(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) int i2, @SafeParcelable.Param(m51605id = 3) float f, @SafeParcelable.Param(m51605id = 4) float f2, @SafeParcelable.Param(m51605id = 5) float f3, @SafeParcelable.Param(m51605id = 6) float f4, @SafeParcelable.Param(m51605id = 7) float f5, @SafeParcelable.Param(m51605id = 8) float f6, @SafeParcelable.Param(m51605id = 14) float f7, @SafeParcelable.Param(m51605id = 9) zzn[] zznVarArr, @SafeParcelable.Param(m51605id = 10) float f8, @SafeParcelable.Param(m51605id = 11) float f9, @SafeParcelable.Param(m51605id = 12) float f10, @SafeParcelable.Param(m51605id = 13) zzd[] zzdVarArr, @SafeParcelable.Param(m51605id = 15) float f11) {
        this.f70825b = i;
        this.f70826c = i2;
        this.f70827d = f;
        this.f70828e = f2;
        this.f70829f = f3;
        this.f70830g = f4;
        this.f70831h = f5;
        this.f70832i = f6;
        this.f70833j = f7;
        this.f70834k = zznVarArr;
        this.f70835l = f8;
        this.f70836m = f9;
        this.f70837n = f10;
        this.f70838o = zzdVarArr;
        this.f70839p = f11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f70825b);
        SafeParcelWriter.writeInt(parcel, 2, this.f70826c);
        SafeParcelWriter.writeFloat(parcel, 3, this.f70827d);
        SafeParcelWriter.writeFloat(parcel, 4, this.f70828e);
        SafeParcelWriter.writeFloat(parcel, 5, this.f70829f);
        SafeParcelWriter.writeFloat(parcel, 6, this.f70830g);
        SafeParcelWriter.writeFloat(parcel, 7, this.f70831h);
        SafeParcelWriter.writeFloat(parcel, 8, this.f70832i);
        SafeParcelWriter.writeTypedArray(parcel, 9, this.f70834k, i, false);
        SafeParcelWriter.writeFloat(parcel, 10, this.f70835l);
        SafeParcelWriter.writeFloat(parcel, 11, this.f70836m);
        SafeParcelWriter.writeFloat(parcel, 12, this.f70837n);
        SafeParcelWriter.writeTypedArray(parcel, 13, this.f70838o, i, false);
        SafeParcelWriter.writeFloat(parcel, 14, this.f70833j);
        SafeParcelWriter.writeFloat(parcel, 15, this.f70839p);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

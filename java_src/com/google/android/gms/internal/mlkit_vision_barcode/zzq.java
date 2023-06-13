package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "BarcodeCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new Ol9();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public int f70641b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public String f70642c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public String f70643d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public int f70644e;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: f */
    public Point[] f70645f;
    @SafeParcelable.Field(m51606id = 7)

    /* renamed from: g */
    public zzj f70646g;
    @SafeParcelable.Field(m51606id = 8)

    /* renamed from: h */
    public zzm f70647h;
    @SafeParcelable.Field(m51606id = 9)

    /* renamed from: i */
    public zzn f70648i;
    @SafeParcelable.Field(m51606id = 10)

    /* renamed from: j */
    public zzp f70649j;
    @SafeParcelable.Field(m51606id = 11)

    /* renamed from: k */
    public zzo f70650k;
    @SafeParcelable.Field(m51606id = 12)

    /* renamed from: l */
    public zzk f70651l;
    @SafeParcelable.Field(m51606id = 13)

    /* renamed from: m */
    public zzg f70652m;
    @SafeParcelable.Field(m51606id = 14)

    /* renamed from: n */
    public zzh f70653n;
    @SafeParcelable.Field(m51606id = 15)

    /* renamed from: o */
    public zzi f70654o;
    @SafeParcelable.Field(m51606id = 16)

    /* renamed from: p */
    public byte[] f70655p;
    @SafeParcelable.Field(m51606id = 17)

    /* renamed from: q */
    public boolean f70656q;
    @SafeParcelable.Field(m51606id = 18)

    /* renamed from: r */
    public double f70657r;

    public zzq() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f70641b);
        SafeParcelWriter.writeString(parcel, 3, this.f70642c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f70643d, false);
        SafeParcelWriter.writeInt(parcel, 5, this.f70644e);
        SafeParcelWriter.writeTypedArray(parcel, 6, this.f70645f, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f70646g, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.f70647h, i, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.f70648i, i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.f70649j, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.f70650k, i, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.f70651l, i, false);
        SafeParcelWriter.writeParcelable(parcel, 13, this.f70652m, i, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.f70653n, i, false);
        SafeParcelWriter.writeParcelable(parcel, 15, this.f70654o, i, false);
        SafeParcelWriter.writeByteArray(parcel, 16, this.f70655p, false);
        SafeParcelWriter.writeBoolean(parcel, 17, this.f70656q);
        SafeParcelWriter.writeDouble(parcel, 18, this.f70657r);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzq(@SafeParcelable.Param(m51605id = 2) int i, @SafeParcelable.Param(m51605id = 3) String str, @SafeParcelable.Param(m51605id = 4) String str2, @SafeParcelable.Param(m51605id = 5) int i2, @SafeParcelable.Param(m51605id = 6) Point[] pointArr, @SafeParcelable.Param(m51605id = 7) zzj zzjVar, @SafeParcelable.Param(m51605id = 8) zzm zzmVar, @SafeParcelable.Param(m51605id = 9) zzn zznVar, @SafeParcelable.Param(m51605id = 10) zzp zzpVar, @SafeParcelable.Param(m51605id = 11) zzo zzoVar, @SafeParcelable.Param(m51605id = 12) zzk zzkVar, @SafeParcelable.Param(m51605id = 13) zzg zzgVar, @SafeParcelable.Param(m51605id = 14) zzh zzhVar, @SafeParcelable.Param(m51605id = 15) zzi zziVar, @SafeParcelable.Param(m51605id = 16) byte[] bArr, @SafeParcelable.Param(m51605id = 17) boolean z, @SafeParcelable.Param(m51605id = 18) double d) {
        this.f70641b = i;
        this.f70642c = str;
        this.f70655p = bArr;
        this.f70643d = str2;
        this.f70644e = i2;
        this.f70645f = pointArr;
        this.f70656q = z;
        this.f70657r = d;
        this.f70646g = zzjVar;
        this.f70647h = zzmVar;
        this.f70648i = zznVar;
        this.f70649j = zzpVar;
        this.f70650k = zzoVar;
        this.f70651l = zzkVar;
        this.f70652m = zzgVar;
        this.f70653n = zzhVar;
        this.f70654o = zziVar;
    }
}

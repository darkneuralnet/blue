package com.google.android.gms.internal.nearby;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
@SafeParcelable.Class(creator = "ParcelablePayloadCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public final class zzgd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgd> CREATOR = new C34780Nn8();
    @SafeParcelable.Field(getter = "getId", m51606id = 1)

    /* renamed from: b */
    public long f71079b;
    @SafeParcelable.Field(getter = "getType", m51606id = 2)

    /* renamed from: c */
    public int f71080c;
    @SafeParcelable.Field(getter = "getBytes", m51606id = 3)

    /* renamed from: d */
    public byte[] f71081d;
    @SafeParcelable.Field(getter = "getDataPfd", m51606id = 4)

    /* renamed from: e */
    public ParcelFileDescriptor f71082e;
    @SafeParcelable.Field(getter = "getJavaFilePath", m51606id = 5)

    /* renamed from: f */
    public String f71083f;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getJavaFileSize", m51606id = 6)

    /* renamed from: g */
    public long f71084g;
    @SafeParcelable.Field(getter = "getStatusPfd", m51606id = 7)

    /* renamed from: h */
    public ParcelFileDescriptor f71085h;
    @SafeParcelable.Field(getter = "getUri", m51606id = 8)

    /* renamed from: i */
    public Uri f71086i;
    @SafeParcelable.Field(defaultValue = "0", getter = "getOffset", m51606id = 9)

    /* renamed from: j */
    public long f71087j;
    @SafeParcelable.Field(defaultValue = "false", getter = "getIsSensitive", m51606id = 10)

    /* renamed from: k */
    public boolean f71088k;
    @SafeParcelable.Field(getter = "getSharedBytes", m51606id = 11)

    /* renamed from: l */
    public zzfz f71089l;

    private zzgd() {
        this.f71084g = -1L;
        this.f71087j = 0L;
        this.f71088k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgd) {
            zzgd zzgdVar = (zzgd) obj;
            if (Objects.equal(Long.valueOf(this.f71079b), Long.valueOf(zzgdVar.f71079b)) && Objects.equal(Integer.valueOf(this.f71080c), Integer.valueOf(zzgdVar.f71080c)) && Arrays.equals(this.f71081d, zzgdVar.f71081d) && Objects.equal(this.f71082e, zzgdVar.f71082e) && Objects.equal(this.f71083f, zzgdVar.f71083f) && Objects.equal(Long.valueOf(this.f71084g), Long.valueOf(zzgdVar.f71084g)) && Objects.equal(this.f71085h, zzgdVar.f71085h) && Objects.equal(this.f71086i, zzgdVar.f71086i) && Objects.equal(Long.valueOf(this.f71087j), Long.valueOf(zzgdVar.f71087j)) && Objects.equal(Boolean.valueOf(this.f71088k), Boolean.valueOf(zzgdVar.f71088k)) && Objects.equal(this.f71089l, zzgdVar.f71089l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.f71079b), Integer.valueOf(this.f71080c), Integer.valueOf(Arrays.hashCode(this.f71081d)), this.f71082e, this.f71083f, Long.valueOf(this.f71084g), this.f71085h, this.f71086i, Long.valueOf(this.f71087j), Boolean.valueOf(this.f71088k), this.f71089l);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.f71079b);
        SafeParcelWriter.writeInt(parcel, 2, this.f71080c);
        SafeParcelWriter.writeByteArray(parcel, 3, this.f71081d, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f71082e, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.f71083f, false);
        SafeParcelWriter.writeLong(parcel, 6, this.f71084g);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f71085h, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.f71086i, i, false);
        SafeParcelWriter.writeLong(parcel, 9, this.f71087j);
        SafeParcelWriter.writeBoolean(parcel, 10, this.f71088k);
        SafeParcelWriter.writeParcelable(parcel, 11, this.f71089l, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzgd(@SafeParcelable.Param(m51605id = 1) long j, @SafeParcelable.Param(m51605id = 2) int i, @SafeParcelable.Param(m51605id = 3) byte[] bArr, @SafeParcelable.Param(m51605id = 4) ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.Param(m51605id = 5) String str, @SafeParcelable.Param(m51605id = 6) long j2, @SafeParcelable.Param(m51605id = 7) ParcelFileDescriptor parcelFileDescriptor2, @SafeParcelable.Param(m51605id = 8) Uri uri, @SafeParcelable.Param(m51605id = 9) long j3, @SafeParcelable.Param(m51605id = 10) boolean z, @SafeParcelable.Param(m51605id = 11) zzfz zzfzVar) {
        this.f71079b = j;
        this.f71080c = i;
        this.f71081d = bArr;
        this.f71082e = parcelFileDescriptor;
        this.f71083f = str;
        this.f71084g = j2;
        this.f71085h = parcelFileDescriptor2;
        this.f71086i = uri;
        this.f71087j = j3;
        this.f71088k = z;
        this.f71089l = zzfzVar;
    }
}

package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "NearbyDeviceFilterCreator")
/* loaded from: classes5.dex */
public final class zzhl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzhl> CREATOR = new C36031Sw8();
    @SafeParcelable.VersionField(m51603id = 1000)

    /* renamed from: b */
    public final int f71132b;
    @SafeParcelable.Field(m51606id = 1)

    /* renamed from: c */
    public final int f71133c;
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: d */
    public final byte[] f71134d;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: e */
    public final boolean f71135e;

    @SafeParcelable.Constructor
    public zzhl(@SafeParcelable.Param(m51605id = 1000) int i, @SafeParcelable.Param(m51605id = 1) int i2, @SafeParcelable.Param(m51605id = 2) byte[] bArr, @SafeParcelable.Param(m51605id = 3) boolean z) {
        this.f71132b = i;
        this.f71133c = i2;
        this.f71134d = bArr;
        this.f71135e = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f71133c);
        SafeParcelWriter.writeByteArray(parcel, 2, this.f71134d, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f71135e);
        SafeParcelWriter.writeInt(parcel, 1000, this.f71132b);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

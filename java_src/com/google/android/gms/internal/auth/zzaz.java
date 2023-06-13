package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "SendDataRequestCreator")
/* loaded from: classes5.dex */
public final class zzaz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaz> CREATOR = new C40220eD7();
    @SafeParcelable.VersionField(m51603id = 1)

    /* renamed from: b */
    public final int f70388b;
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: c */
    public final String f70389c;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: d */
    public final byte[] f70390d;

    @SafeParcelable.Constructor
    public zzaz(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) byte[] bArr) {
        this.f70388b = 1;
        this.f70389c = (String) Preconditions.checkNotNull(str);
        this.f70390d = (byte[]) Preconditions.checkNotNull(bArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f70388b);
        SafeParcelWriter.writeString(parcel, 2, this.f70389c, false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.f70390d, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzaz(String str, byte[] bArr) {
        this(1, str, bArr);
    }
}

package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
@SafeParcelable.Class(creator = "OnConnectionInitiatedParamsCreator")
/* loaded from: classes5.dex */
public final class zzew extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzew> CREATOR = new C48167rd8();
    @SafeParcelable.Field(getter = "getRemoteEndpointId", m51606id = 1)

    /* renamed from: b */
    public String f71041b;
    @SafeParcelable.Field(getter = "getRemoteEndpointName", m51606id = 2)

    /* renamed from: c */
    public String f71042c;
    @SafeParcelable.Field(getter = "getAuthenticationToken", m51606id = 3)

    /* renamed from: d */
    public String f71043d;
    @SafeParcelable.Field(getter = "getIsIncomingConnection", m51606id = 4)

    /* renamed from: e */
    public boolean f71044e;
    @SafeParcelable.Field(getter = "getHandshakeData", m51606id = 5)

    /* renamed from: f */
    public byte[] f71045f;
    @SafeParcelable.Field(getter = "getRawAuthenticationToken", m51606id = 6)

    /* renamed from: g */
    public byte[] f71046g;
    @SafeParcelable.Field(getter = "getRemoteEndpointInfo", m51606id = 7)

    /* renamed from: h */
    public byte[] f71047h;
    @SafeParcelable.Field(getter = "getIsConnectionVerified", m51606id = 8)

    /* renamed from: i */
    public boolean f71048i;

    private zzew() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzew) {
            zzew zzewVar = (zzew) obj;
            if (Objects.equal(this.f71041b, zzewVar.f71041b) && Objects.equal(this.f71042c, zzewVar.f71042c) && Objects.equal(this.f71043d, zzewVar.f71043d) && Objects.equal(Boolean.valueOf(this.f71044e), Boolean.valueOf(zzewVar.f71044e)) && Arrays.equals(this.f71045f, zzewVar.f71045f) && Arrays.equals(this.f71046g, zzewVar.f71046g) && Arrays.equals(this.f71047h, zzewVar.f71047h) && Objects.equal(Boolean.valueOf(this.f71048i), Boolean.valueOf(zzewVar.f71048i))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f71041b, this.f71042c, this.f71043d, Boolean.valueOf(this.f71044e), Integer.valueOf(Arrays.hashCode(this.f71045f)), Integer.valueOf(Arrays.hashCode(this.f71046g)), Integer.valueOf(Arrays.hashCode(this.f71047h)), Boolean.valueOf(this.f71048i));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f71041b, false);
        SafeParcelWriter.writeString(parcel, 2, this.f71042c, false);
        SafeParcelWriter.writeString(parcel, 3, this.f71043d, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f71044e);
        SafeParcelWriter.writeByteArray(parcel, 5, this.f71045f, false);
        SafeParcelWriter.writeByteArray(parcel, 6, this.f71046g, false);
        SafeParcelWriter.writeByteArray(parcel, 7, this.f71047h, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.f71048i);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzew(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) String str2, @SafeParcelable.Param(m51605id = 3) String str3, @SafeParcelable.Param(m51605id = 4) boolean z, @SafeParcelable.Param(m51605id = 5) byte[] bArr, @SafeParcelable.Param(m51605id = 6) byte[] bArr2, @SafeParcelable.Param(m51605id = 7) byte[] bArr3, @SafeParcelable.Param(m51605id = 8) boolean z2) {
        this.f71041b = str;
        this.f71042c = str2;
        this.f71043d = str3;
        this.f71044e = z;
        this.f71045f = bArr;
        this.f71046g = bArr2;
        this.f71047h = bArr3;
        this.f71048i = z2;
    }
}

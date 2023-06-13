package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.zzs;
import java.util.Collections;
import java.util.List;
@SafeParcelable.Class(creator = "DeviceOrientationRequestInternalCreator")
/* loaded from: classes5.dex */
public final class zzj extends AbstractSafeParcelable {
    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequestInternal.DEFAULT_DEVICE_ORIENTATION_REQUEST", m51606id = 1)

    /* renamed from: b */
    public final zzs f70559b;
    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequestInternal.DEFAULT_CLIENTS", m51606id = 2)

    /* renamed from: c */
    public final List<ClientIdentity> f70560c;
    @SafeParcelable.Field(defaultValueUnchecked = "null", m51606id = 3)

    /* renamed from: d */
    public final String f70561d;
    @VisibleForTesting

    /* renamed from: e */
    public static final List<ClientIdentity> f70557e = Collections.emptyList();

    /* renamed from: f */
    public static final zzs f70558f = new zzs();
    public static final Parcelable.Creator<zzj> CREATOR = new QN8();

    @SafeParcelable.Constructor
    public zzj(@SafeParcelable.Param(m51605id = 1) zzs zzsVar, @SafeParcelable.Param(m51605id = 2) List<ClientIdentity> list, @SafeParcelable.Param(m51605id = 3) String str) {
        this.f70559b = zzsVar;
        this.f70560c = list;
        this.f70561d = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzjVar = (zzj) obj;
        if (!Objects.equal(this.f70559b, zzjVar.f70559b) || !Objects.equal(this.f70560c, zzjVar.f70560c) || !Objects.equal(this.f70561d, zzjVar.f70561d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f70559b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f70559b);
        String valueOf2 = String.valueOf(this.f70560c);
        String str = this.f70561d;
        int length = valueOf.length();
        StringBuilder sb = new StringBuilder(length + 77 + valueOf2.length() + String.valueOf(str).length());
        sb.append("DeviceOrientationRequestInternal{deviceOrientationRequest=");
        sb.append(valueOf);
        sb.append(", clients=");
        sb.append(valueOf2);
        sb.append(", tag='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f70559b, i, false);
        SafeParcelWriter.writeTypedList(parcel, 2, this.f70560c, false);
        SafeParcelWriter.writeString(parcel, 3, this.f70561d, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

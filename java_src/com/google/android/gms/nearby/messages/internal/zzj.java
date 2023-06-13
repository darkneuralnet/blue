package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "HandleClientLifecycleEventRequestCreator")
/* loaded from: classes6.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new C52169yN8();
    @SafeParcelable.VersionField(m51603id = 1)

    /* renamed from: b */
    public final int f71744b;
    @SafeParcelable.Field(m51606id = 2)
    @Deprecated

    /* renamed from: c */
    public final ClientAppContext f71745c;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: d */
    public final int f71746d;

    @SafeParcelable.Constructor
    public zzj(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) ClientAppContext clientAppContext, @SafeParcelable.Param(m51605id = 3) int i2) {
        this.f71744b = i;
        this.f71745c = clientAppContext;
        this.f71746d = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f71744b);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f71745c, i, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f71746d);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

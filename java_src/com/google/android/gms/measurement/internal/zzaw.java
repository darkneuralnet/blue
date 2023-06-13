package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "EventParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaw> CREATOR = new C46014nz7();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public final String f71529b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public final zzau f71530c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public final String f71531d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public final long f71532e;

    public zzaw(zzaw zzawVar, long j) {
        Preconditions.checkNotNull(zzawVar);
        this.f71529b = zzawVar.f71529b;
        this.f71530c = zzawVar.f71530c;
        this.f71531d = zzawVar.f71531d;
        this.f71532e = j;
    }

    public final String toString() {
        String str = this.f71531d;
        String str2 = this.f71529b;
        String valueOf = String.valueOf(this.f71530c);
        return "origin=" + str + ",name=" + str2 + ",params=" + valueOf;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C46014nz7.m22032a(this, parcel, i);
    }

    @SafeParcelable.Constructor
    public zzaw(@SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) zzau zzauVar, @SafeParcelable.Param(m51605id = 4) String str2, @SafeParcelable.Param(m51605id = 5) long j) {
        this.f71529b = str;
        this.f71530c = zzauVar;
        this.f71531d = str2;
        this.f71532e = j;
    }
}

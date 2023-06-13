package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p000.WO1;
@SafeParcelable.Class(creator = "GoogleCertificatesLookupQueryCreator")
/* loaded from: classes5.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();
    @SafeParcelable.Field(getter = "getCallingPackage", m51606id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "getAllowTestKeys", m51606id = 2)
    private final boolean zzb;
    @SafeParcelable.Field(defaultValue = "false", getter = "getIgnoreTestKeysOverride", m51606id = 3)
    private final boolean zzc;
    @SafeParcelable.Field(getter = "getCallingContextBinder", m51606id = 4, type = "android.os.IBinder")
    private final Context zzd;
    @SafeParcelable.Field(getter = "getIsChimeraPackage", m51606id = 5)
    private final boolean zze;

    @SafeParcelable.Constructor
    public zzo(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) boolean z, @SafeParcelable.Param(m51605id = 3) boolean z2, @SafeParcelable.Param(m51605id = 4) IBinder iBinder, @SafeParcelable.Param(m51605id = 5) boolean z3) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = (Context) BinderC36557Vd3.m79637d5(WO1.AbstractBinderC9015a.m78501c5(iBinder));
        this.zze = z3;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [WO1, android.os.IBinder] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeIBinder(parcel, 4, BinderC36557Vd3.m79636e5(this.zzd), false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

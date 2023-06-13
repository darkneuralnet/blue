package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.zzaz;
import com.google.android.gms.location.zzbd;
@SafeParcelable.Class(creator = "LocationRequestUpdateDataCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public final class zzbc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbc> CREATOR = new C47354qF7();
    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequestUpdateData.OPERATION_ADD", m51606id = 1)

    /* renamed from: b */
    public final int f70542b;
    @SafeParcelable.Field(defaultValueUnchecked = "null", m51606id = 2)

    /* renamed from: c */
    public final zzba f70543c;
    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getLocationListenerBinder", m51606id = 3, type = "android.os.IBinder")

    /* renamed from: d */
    public final zzbd f70544d;
    @SafeParcelable.Field(defaultValueUnchecked = "null", m51606id = 4)

    /* renamed from: e */
    public final PendingIntent f70545e;
    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getLocationCallbackBinder", m51606id = 5, type = "android.os.IBinder")

    /* renamed from: f */
    public final com.google.android.gms.location.zzba f70546f;
    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getFusedLocationProviderCallbackBinder", m51606id = 6, type = "android.os.IBinder")

    /* renamed from: g */
    public final InterfaceC39354cn7 f70547g;

    @SafeParcelable.Constructor
    public zzbc(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) zzba zzbaVar, @SafeParcelable.Param(m51605id = 3) IBinder iBinder, @SafeParcelable.Param(m51605id = 4) PendingIntent pendingIntent, @SafeParcelable.Param(m51605id = 5) IBinder iBinder2, @SafeParcelable.Param(m51605id = 6) IBinder iBinder3) {
        zzbd zzb;
        com.google.android.gms.location.zzba zzb2;
        this.f70542b = i;
        this.f70543c = zzbaVar;
        InterfaceC39354cn7 interfaceC39354cn7 = null;
        if (iBinder == null) {
            zzb = null;
        } else {
            zzb = com.google.android.gms.location.zzbc.zzb(iBinder);
        }
        this.f70544d = zzb;
        this.f70545e = pendingIntent;
        if (iBinder2 == null) {
            zzb2 = null;
        } else {
            zzb2 = zzaz.zzb(iBinder2);
        }
        this.f70546f = zzb2;
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface instanceof InterfaceC39354cn7) {
                interfaceC39354cn7 = (InterfaceC39354cn7) queryLocalInterface;
            } else {
                interfaceC39354cn7 = new C45281ml7(iBinder3);
            }
        }
        this.f70547g = interfaceC39354cn7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.location.zzbd, android.os.IBinder] */
    /* renamed from: s */
    public static zzbc m51347s(zzbd zzbdVar, InterfaceC39354cn7 interfaceC39354cn7) {
        if (interfaceC39354cn7 == null) {
            interfaceC39354cn7 = null;
        }
        return new zzbc(2, null, zzbdVar, null, null, interfaceC39354cn7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: u */
    public static zzbc m51346u(zzba zzbaVar, PendingIntent pendingIntent, InterfaceC39354cn7 interfaceC39354cn7) {
        return new zzbc(1, zzbaVar, null, pendingIntent, null, interfaceC39354cn7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.location.zzba, android.os.IBinder] */
    /* renamed from: v */
    public static zzbc m51345v(com.google.android.gms.location.zzba zzbaVar, InterfaceC39354cn7 interfaceC39354cn7) {
        if (interfaceC39354cn7 == null) {
            interfaceC39354cn7 = null;
        }
        return new zzbc(2, null, null, null, zzbaVar, interfaceC39354cn7);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        IBinder asBinder2;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f70542b);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f70543c, i, false);
        zzbd zzbdVar = this.f70544d;
        IBinder iBinder = null;
        if (zzbdVar == null) {
            asBinder = null;
        } else {
            asBinder = zzbdVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 3, asBinder, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f70545e, i, false);
        com.google.android.gms.location.zzba zzbaVar = this.f70546f;
        if (zzbaVar == null) {
            asBinder2 = null;
        } else {
            asBinder2 = zzbaVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 5, asBinder2, false);
        InterfaceC39354cn7 interfaceC39354cn7 = this.f70547g;
        if (interfaceC39354cn7 != null) {
            iBinder = interfaceC39354cn7.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 6, iBinder, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

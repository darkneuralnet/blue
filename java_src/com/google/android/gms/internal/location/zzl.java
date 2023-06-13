package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.zzaw;
import com.google.android.gms.location.zzax;
@SafeParcelable.Class(creator = "DeviceOrientationRequestUpdateDataCreator")
/* loaded from: classes5.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new GZ8();
    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequestUpdateData.OPERATION_ADD", m51606id = 1)

    /* renamed from: b */
    public final int f70562b;
    @SafeParcelable.Field(defaultValueUnchecked = "null", m51606id = 2)

    /* renamed from: c */
    public final zzj f70563c;
    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getDeviceOrientationListenerBinder", m51606id = 3, type = "android.os.IBinder")

    /* renamed from: d */
    public final zzax f70564d;
    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getFusedLocationProviderCallbackBinder", m51606id = 4, type = "android.os.IBinder")

    /* renamed from: e */
    public final InterfaceC39354cn7 f70565e;

    @SafeParcelable.Constructor
    public zzl(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) zzj zzjVar, @SafeParcelable.Param(m51605id = 3) IBinder iBinder, @SafeParcelable.Param(m51605id = 4) IBinder iBinder2) {
        zzax zzb;
        this.f70562b = i;
        this.f70563c = zzjVar;
        InterfaceC39354cn7 interfaceC39354cn7 = null;
        if (iBinder == null) {
            zzb = null;
        } else {
            zzb = zzaw.zzb(iBinder);
        }
        this.f70564d = zzb;
        if (iBinder2 != null) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface instanceof InterfaceC39354cn7) {
                interfaceC39354cn7 = (InterfaceC39354cn7) queryLocalInterface;
            } else {
                interfaceC39354cn7 = new C45281ml7(iBinder2);
            }
        }
        this.f70565e = interfaceC39354cn7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f70562b);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f70563c, i, false);
        zzax zzaxVar = this.f70564d;
        IBinder iBinder = null;
        if (zzaxVar == null) {
            asBinder = null;
        } else {
            asBinder = zzaxVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 3, asBinder, false);
        InterfaceC39354cn7 interfaceC39354cn7 = this.f70565e;
        if (interfaceC39354cn7 != null) {
            iBinder = interfaceC39354cn7.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 4, iBinder, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
@SafeParcelable.Class(creator = "AcceptConnectionRequestParamsCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new Fo9();
    @SafeParcelable.Field(getter = "getResultListenerAsBinder", m51606id = 1, type = "android.os.IBinder")

    /* renamed from: b */
    public InterfaceC34429Ma8 f71136b;
    @SafeParcelable.Field(getter = "getConnectionEventListenerAsBinder", m51606id = 2, type = "android.os.IBinder")

    /* renamed from: c */
    public O48 f71137c;
    @SafeParcelable.Field(getter = "getRemoteEndpointId", m51606id = 3)

    /* renamed from: d */
    public String f71138d;
    @SafeParcelable.Field(getter = "getHandshakeData", m51606id = 4)

    /* renamed from: e */
    public byte[] f71139e;
    @SafeParcelable.Field(getter = "getPayloadListenerAsBinder", m51606id = 5, type = "android.os.IBinder")

    /* renamed from: f */
    public S98 f71140f;

    private zzr() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzr) {
            zzr zzrVar = (zzr) obj;
            if (Objects.equal(this.f71136b, zzrVar.f71136b) && Objects.equal(this.f71137c, zzrVar.f71137c) && Objects.equal(this.f71138d, zzrVar.f71138d) && Arrays.equals(this.f71139e, zzrVar.f71139e) && Objects.equal(this.f71140f, zzrVar.f71140f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f71136b, this.f71137c, this.f71138d, Integer.valueOf(Arrays.hashCode(this.f71139e)), this.f71140f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        IBinder asBinder2;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        InterfaceC34429Ma8 interfaceC34429Ma8 = this.f71136b;
        IBinder iBinder = null;
        if (interfaceC34429Ma8 == null) {
            asBinder = null;
        } else {
            asBinder = interfaceC34429Ma8.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 1, asBinder, false);
        O48 o48 = this.f71137c;
        if (o48 == null) {
            asBinder2 = null;
        } else {
            asBinder2 = o48.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 2, asBinder2, false);
        SafeParcelWriter.writeString(parcel, 3, this.f71138d, false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.f71139e, false);
        S98 s98 = this.f71140f;
        if (s98 != null) {
            iBinder = s98.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 5, iBinder, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzr(@SafeParcelable.Param(m51605id = 1) IBinder iBinder, @SafeParcelable.Param(m51605id = 2) IBinder iBinder2, @SafeParcelable.Param(m51605id = 3) String str, @SafeParcelable.Param(m51605id = 4) byte[] bArr, @SafeParcelable.Param(m51605id = 5) IBinder iBinder3) {
        InterfaceC34429Ma8 c42800ia8;
        O48 c44285l48;
        S98 s98 = null;
        if (iBinder == null) {
            c42800ia8 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            if (queryLocalInterface instanceof InterfaceC34429Ma8) {
                c42800ia8 = (InterfaceC34429Ma8) queryLocalInterface;
            } else {
                c42800ia8 = new C42800ia8(iBinder);
            }
        }
        if (iBinder2 == null) {
            c44285l48 = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionEventListener");
            if (queryLocalInterface2 instanceof O48) {
                c44285l48 = (O48) queryLocalInterface2;
            } else {
                c44285l48 = new C44285l48(iBinder2);
            }
        }
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IPayloadListener");
            if (queryLocalInterface3 instanceof S98) {
                s98 = (S98) queryLocalInterface3;
            } else {
                s98 = new C45521n98(iBinder3);
            }
        }
        this.f71136b = c42800ia8;
        this.f71137c = c44285l48;
        this.f71138d = str;
        this.f71139e = bArr;
        this.f71140f = s98;
    }
}

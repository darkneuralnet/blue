package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import java.util.Arrays;
@SafeParcelable.Class(creator = "StartAdvertisingParamsCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public final class zzgu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgu> CREATOR = new C35050Or8();
    @SafeParcelable.Field(getter = "getResultListenerAsBinder", m51606id = 1, type = "android.os.IBinder")

    /* renamed from: b */
    public InterfaceC32098Cb8 f71105b;
    @SafeParcelable.Field(getter = "getCallbackAsBinder", m51606id = 2, type = "android.os.IBinder")

    /* renamed from: c */
    public W38 f71106c;
    @SafeParcelable.Field(getter = "getName", m51606id = 3)

    /* renamed from: d */
    public String f71107d;
    @SafeParcelable.Field(getter = "getServiceId", m51606id = 4)

    /* renamed from: e */
    public String f71108e;
    @SafeParcelable.Field(getter = "getDurationMillis", m51606id = 5)

    /* renamed from: f */
    public long f71109f;
    @SafeParcelable.Field(getter = "getOptions", m51606id = 6)

    /* renamed from: g */
    public AdvertisingOptions f71110g;
    @SafeParcelable.Field(getter = "getConnectionLifecycleListenerAsBinder", m51606id = 7, type = "android.os.IBinder")

    /* renamed from: h */
    public I58 f71111h;
    @SafeParcelable.Field(getter = "getEndpointInfo", m51606id = 8)

    /* renamed from: i */
    public byte[] f71112i;

    private zzgu() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgu) {
            zzgu zzguVar = (zzgu) obj;
            if (Objects.equal(this.f71105b, zzguVar.f71105b) && Objects.equal(this.f71106c, zzguVar.f71106c) && Objects.equal(this.f71107d, zzguVar.f71107d) && Objects.equal(this.f71108e, zzguVar.f71108e) && Objects.equal(Long.valueOf(this.f71109f), Long.valueOf(zzguVar.f71109f)) && Objects.equal(this.f71110g, zzguVar.f71110g) && Objects.equal(this.f71111h, zzguVar.f71111h) && Arrays.equals(this.f71112i, zzguVar.f71112i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f71105b, this.f71106c, this.f71107d, this.f71108e, Long.valueOf(this.f71109f), this.f71110g, this.f71111h, Integer.valueOf(Arrays.hashCode(this.f71112i)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        IBinder asBinder2;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        InterfaceC32098Cb8 interfaceC32098Cb8 = this.f71105b;
        IBinder iBinder = null;
        if (interfaceC32098Cb8 == null) {
            asBinder = null;
        } else {
            asBinder = interfaceC32098Cb8.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 1, asBinder, false);
        W38 w38 = this.f71106c;
        if (w38 == null) {
            asBinder2 = null;
        } else {
            asBinder2 = w38.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 2, asBinder2, false);
        SafeParcelWriter.writeString(parcel, 3, this.f71107d, false);
        SafeParcelWriter.writeString(parcel, 4, this.f71108e, false);
        SafeParcelWriter.writeLong(parcel, 5, this.f71109f);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f71110g, i, false);
        I58 i58 = this.f71111h;
        if (i58 != null) {
            iBinder = i58.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 7, iBinder, false);
        SafeParcelWriter.writeByteArray(parcel, 8, this.f71112i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzgu(@SafeParcelable.Param(m51605id = 1) IBinder iBinder, @SafeParcelable.Param(m51605id = 2) IBinder iBinder2, @SafeParcelable.Param(m51605id = 3) String str, @SafeParcelable.Param(m51605id = 4) String str2, @SafeParcelable.Param(m51605id = 5) long j, @SafeParcelable.Param(m51605id = 6) AdvertisingOptions advertisingOptions, @SafeParcelable.Param(m51605id = 7) IBinder iBinder3, @SafeParcelable.Param(m51605id = 8) byte[] bArr) {
        InterfaceC32098Cb8 c38049ab8;
        W38 g38;
        I58 i58 = null;
        if (iBinder == null) {
            c38049ab8 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IStartAdvertisingResultListener");
            if (queryLocalInterface instanceof InterfaceC32098Cb8) {
                c38049ab8 = (InterfaceC32098Cb8) queryLocalInterface;
            } else {
                c38049ab8 = new C38049ab8(iBinder);
            }
        }
        if (iBinder2 == null) {
            g38 = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IAdvertisingCallback");
            if (queryLocalInterface2 instanceof W38) {
                g38 = (W38) queryLocalInterface2;
            } else {
                g38 = new G38(iBinder2);
            }
        }
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
            if (queryLocalInterface3 instanceof I58) {
                i58 = (I58) queryLocalInterface3;
            } else {
                i58 = new C39552d58(iBinder3);
            }
        }
        this.f71105b = c38049ab8;
        this.f71106c = g38;
        this.f71107d = str;
        this.f71108e = str2;
        this.f71109f = j;
        this.f71110g = advertisingOptions;
        this.f71111h = i58;
        this.f71112i = bArr;
    }
}

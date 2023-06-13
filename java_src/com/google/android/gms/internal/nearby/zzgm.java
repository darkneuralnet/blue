package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import java.util.Arrays;
@SafeParcelable.Class(creator = "SendConnectionRequestParamsCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public final class zzgm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgm> CREATOR = new C36436Up8();
    @SafeParcelable.Field(getter = "getResultListenerAsBinder", m51606id = 1, type = "android.os.IBinder")

    /* renamed from: b */
    public InterfaceC34429Ma8 f71092b;
    @SafeParcelable.Field(getter = "getConnectionEventListenerAsBinder", m51606id = 2, type = "android.os.IBinder")

    /* renamed from: c */
    public O48 f71093c;
    @SafeParcelable.Field(getter = "getConnectionResponseListenerAsBinder", m51606id = 3, type = "android.os.IBinder")

    /* renamed from: d */
    public InterfaceC51429x78 f71094d;
    @SafeParcelable.Field(getter = "getName", m51606id = 4)

    /* renamed from: e */
    public String f71095e;
    @SafeParcelable.Field(getter = "getRemoteEndpointId", m51606id = 5)

    /* renamed from: f */
    public String f71096f;
    @SafeParcelable.Field(getter = "getHandshakeData", m51606id = 6)

    /* renamed from: g */
    public byte[] f71097g;
    @SafeParcelable.Field(getter = "getConnectionLifecycleListenerAsBinder", m51606id = 7, type = "android.os.IBinder")

    /* renamed from: h */
    public I58 f71098h;
    @SafeParcelable.Field(getter = "getEndpointInfo", m51606id = 8)

    /* renamed from: i */
    public byte[] f71099i;
    @SafeParcelable.Field(getter = "getOptions", m51606id = 9)

    /* renamed from: j */
    public ConnectionOptions f71100j;

    private zzgm() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgm) {
            zzgm zzgmVar = (zzgm) obj;
            if (Objects.equal(this.f71092b, zzgmVar.f71092b) && Objects.equal(this.f71093c, zzgmVar.f71093c) && Objects.equal(this.f71094d, zzgmVar.f71094d) && Objects.equal(this.f71095e, zzgmVar.f71095e) && Objects.equal(this.f71096f, zzgmVar.f71096f) && Arrays.equals(this.f71097g, zzgmVar.f71097g) && Objects.equal(this.f71098h, zzgmVar.f71098h) && Arrays.equals(this.f71099i, zzgmVar.f71099i) && Objects.equal(this.f71100j, zzgmVar.f71100j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f71092b, this.f71093c, this.f71094d, this.f71095e, this.f71096f, Integer.valueOf(Arrays.hashCode(this.f71097g)), this.f71098h, Integer.valueOf(Arrays.hashCode(this.f71099i)), this.f71100j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        IBinder asBinder2;
        IBinder asBinder3;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        InterfaceC34429Ma8 interfaceC34429Ma8 = this.f71092b;
        IBinder iBinder = null;
        if (interfaceC34429Ma8 == null) {
            asBinder = null;
        } else {
            asBinder = interfaceC34429Ma8.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 1, asBinder, false);
        O48 o48 = this.f71093c;
        if (o48 == null) {
            asBinder2 = null;
        } else {
            asBinder2 = o48.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 2, asBinder2, false);
        InterfaceC51429x78 interfaceC51429x78 = this.f71094d;
        if (interfaceC51429x78 == null) {
            asBinder3 = null;
        } else {
            asBinder3 = interfaceC51429x78.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 3, asBinder3, false);
        SafeParcelWriter.writeString(parcel, 4, this.f71095e, false);
        SafeParcelWriter.writeString(parcel, 5, this.f71096f, false);
        SafeParcelWriter.writeByteArray(parcel, 6, this.f71097g, false);
        I58 i58 = this.f71098h;
        if (i58 != null) {
            iBinder = i58.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 7, iBinder, false);
        SafeParcelWriter.writeByteArray(parcel, 8, this.f71099i, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.f71100j, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzgm(@SafeParcelable.Param(m51605id = 1) IBinder iBinder, @SafeParcelable.Param(m51605id = 2) IBinder iBinder2, @SafeParcelable.Param(m51605id = 3) IBinder iBinder3, @SafeParcelable.Param(m51605id = 4) String str, @SafeParcelable.Param(m51605id = 5) String str2, @SafeParcelable.Param(m51605id = 6) byte[] bArr, @SafeParcelable.Param(m51605id = 7) IBinder iBinder4, @SafeParcelable.Param(m51605id = 8) byte[] bArr2, @SafeParcelable.Param(m51605id = 9) ConnectionOptions connectionOptions) {
        InterfaceC34429Ma8 c42800ia8;
        O48 c44285l48;
        InterfaceC51429x78 t68;
        I58 i58 = null;
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
        if (iBinder3 == null) {
            t68 = null;
        } else {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionResponseListener");
            if (queryLocalInterface3 instanceof InterfaceC51429x78) {
                t68 = (InterfaceC51429x78) queryLocalInterface3;
            } else {
                t68 = new T68(iBinder3);
            }
        }
        if (iBinder4 != null) {
            IInterface queryLocalInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
            if (queryLocalInterface4 instanceof I58) {
                i58 = (I58) queryLocalInterface4;
            } else {
                i58 = new C39552d58(iBinder4);
            }
        }
        this.f71092b = c42800ia8;
        this.f71093c = c44285l48;
        this.f71094d = t68;
        this.f71095e = str;
        this.f71096f = str2;
        this.f71097g = bArr;
        this.f71098h = i58;
        this.f71099i = bArr2;
        this.f71100j = connectionOptions;
    }
}

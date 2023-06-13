package no.nordicsemi.android.ble.response;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes8.dex */
public class ConnectionPriorityResponse implements InterfaceC50147uy0, Parcelable {
    public static final Parcelable.Creator<ConnectionPriorityResponse> CREATOR = new C26673a();

    /* renamed from: b */
    public BluetoothDevice f100671b;

    /* renamed from: c */
    public int f100672c;

    /* renamed from: d */
    public int f100673d;

    /* renamed from: e */
    public int f100674e;

    /* renamed from: no.nordicsemi.android.ble.response.ConnectionPriorityResponse$a */
    /* loaded from: classes8.dex */
    public class C26673a implements Parcelable.Creator<ConnectionPriorityResponse> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ConnectionPriorityResponse createFromParcel(Parcel parcel) {
            return new ConnectionPriorityResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ConnectionPriorityResponse[] newArray(int i) {
            return new ConnectionPriorityResponse[i];
        }
    }

    public ConnectionPriorityResponse() {
    }

    @Override // p000.InterfaceC50147uy0
    /* renamed from: a */
    public void mo9426a(BluetoothDevice bluetoothDevice, int i, int i2, int i3) {
        this.f100671b = bluetoothDevice;
        this.f100672c = i;
        this.f100673d = i2;
        this.f100674e = i3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f100671b, i);
        parcel.writeInt(this.f100672c);
        parcel.writeInt(this.f100673d);
        parcel.writeInt(this.f100674e);
    }

    public ConnectionPriorityResponse(Parcel parcel) {
        this.f100671b = (BluetoothDevice) parcel.readParcelable(BluetoothDevice.class.getClassLoader());
        this.f100672c = parcel.readInt();
        this.f100673d = parcel.readInt();
        this.f100674e = parcel.readInt();
    }
}

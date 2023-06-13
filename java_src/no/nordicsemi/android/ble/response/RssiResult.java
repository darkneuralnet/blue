package no.nordicsemi.android.ble.response;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes8.dex */
public class RssiResult implements InterfaceC39252cd5, Parcelable {
    public static final Parcelable.Creator<RssiResult> CREATOR = new C26677a();

    /* renamed from: b */
    public BluetoothDevice f100682b;

    /* renamed from: c */
    public int f100683c;

    /* renamed from: no.nordicsemi.android.ble.response.RssiResult$a */
    /* loaded from: classes8.dex */
    public class C26677a implements Parcelable.Creator<RssiResult> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public RssiResult createFromParcel(Parcel parcel) {
            return new RssiResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public RssiResult[] newArray(int i) {
            return new RssiResult[i];
        }
    }

    public RssiResult() {
    }

    @Override // p000.InterfaceC39252cd5
    /* renamed from: a */
    public void mo22546a(BluetoothDevice bluetoothDevice, int i) {
        this.f100682b = bluetoothDevice;
        this.f100683c = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f100682b, i);
        parcel.writeInt(this.f100683c);
    }

    public RssiResult(Parcel parcel) {
        this.f100682b = (BluetoothDevice) parcel.readParcelable(BluetoothDevice.class.getClassLoader());
        this.f100683c = parcel.readInt();
    }
}

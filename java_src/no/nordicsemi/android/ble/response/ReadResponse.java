package no.nordicsemi.android.ble.response;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import no.nordicsemi.android.ble.data.Data;
/* loaded from: classes8.dex */
public class ReadResponse implements QS0, Parcelable {
    public static final Parcelable.Creator<ReadResponse> CREATOR = new C26676a();

    /* renamed from: b */
    public BluetoothDevice f100680b;

    /* renamed from: c */
    public Data f100681c;

    /* renamed from: no.nordicsemi.android.ble.response.ReadResponse$a */
    /* loaded from: classes8.dex */
    public class C26676a implements Parcelable.Creator<ReadResponse> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ReadResponse createFromParcel(Parcel parcel) {
            return new ReadResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ReadResponse[] newArray(int i) {
            return new ReadResponse[i];
        }
    }

    public ReadResponse() {
    }

    @Override // p000.QS0
    /* renamed from: b */
    public void mo3746b(BluetoothDevice bluetoothDevice, Data data) {
        this.f100680b = bluetoothDevice;
        this.f100681c = data;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f100680b, i);
        parcel.writeParcelable(this.f100681c, i);
    }

    public ReadResponse(Parcel parcel) {
        this.f100680b = (BluetoothDevice) parcel.readParcelable(BluetoothDevice.class.getClassLoader());
        this.f100681c = (Data) parcel.readParcelable(Data.class.getClassLoader());
    }
}

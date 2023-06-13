package no.nordicsemi.android.ble.response;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import no.nordicsemi.android.ble.data.Data;
/* loaded from: classes8.dex */
public class WriteResponse implements SS0, Parcelable {
    public static final Parcelable.Creator<WriteResponse> CREATOR = new C26678a();

    /* renamed from: b */
    public BluetoothDevice f100684b;

    /* renamed from: c */
    public Data f100685c;

    /* renamed from: no.nordicsemi.android.ble.response.WriteResponse$a */
    /* loaded from: classes8.dex */
    public class C26678a implements Parcelable.Creator<WriteResponse> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public WriteResponse createFromParcel(Parcel parcel) {
            return new WriteResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public WriteResponse[] newArray(int i) {
            return new WriteResponse[i];
        }
    }

    public WriteResponse() {
    }

    @Override // p000.SS0
    /* renamed from: a */
    public void mo22543a(BluetoothDevice bluetoothDevice, Data data) {
        this.f100684b = bluetoothDevice;
        this.f100685c = data;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f100684b, i);
        parcel.writeParcelable(this.f100685c, i);
    }

    public WriteResponse(Parcel parcel) {
        this.f100684b = (BluetoothDevice) parcel.readParcelable(BluetoothDevice.class.getClassLoader());
        this.f100685c = (Data) parcel.readParcelable(Data.class.getClassLoader());
    }
}

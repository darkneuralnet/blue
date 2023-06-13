package no.nordicsemi.android.ble.response;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes8.dex */
public class PhyResult implements InterfaceC46281oS3, Parcelable {
    public static final Parcelable.Creator<PhyResult> CREATOR = new C26675a();

    /* renamed from: b */
    public BluetoothDevice f100677b;

    /* renamed from: c */
    public int f100678c;

    /* renamed from: d */
    public int f100679d;

    /* renamed from: no.nordicsemi.android.ble.response.PhyResult$a */
    /* loaded from: classes8.dex */
    public class C26675a implements Parcelable.Creator<PhyResult> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PhyResult createFromParcel(Parcel parcel) {
            return new PhyResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PhyResult[] newArray(int i) {
            return new PhyResult[i];
        }
    }

    public PhyResult() {
    }

    @Override // p000.InterfaceC46281oS3
    /* renamed from: a */
    public void mo21044a(BluetoothDevice bluetoothDevice, int i, int i2) {
        this.f100677b = bluetoothDevice;
        this.f100678c = i;
        this.f100679d = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f100677b, i);
        parcel.writeInt(this.f100678c);
        parcel.writeInt(this.f100679d);
    }

    public PhyResult(Parcel parcel) {
        this.f100677b = (BluetoothDevice) parcel.readParcelable(BluetoothDevice.class.getClassLoader());
        this.f100678c = parcel.readInt();
        this.f100679d = parcel.readInt();
    }
}

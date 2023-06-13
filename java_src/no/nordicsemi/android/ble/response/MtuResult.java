package no.nordicsemi.android.ble.response;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes8.dex */
public class MtuResult implements InterfaceC45723nW2, Parcelable {
    public static final Parcelable.Creator<MtuResult> CREATOR = new C26674a();

    /* renamed from: b */
    public BluetoothDevice f100675b;

    /* renamed from: c */
    public int f100676c;

    /* renamed from: no.nordicsemi.android.ble.response.MtuResult$a */
    /* loaded from: classes8.dex */
    public class C26674a implements Parcelable.Creator<MtuResult> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MtuResult createFromParcel(Parcel parcel) {
            return new MtuResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MtuResult[] newArray(int i) {
            return new MtuResult[i];
        }
    }

    public MtuResult() {
    }

    @Override // p000.InterfaceC45723nW2
    /* renamed from: a */
    public void mo22553a(BluetoothDevice bluetoothDevice, int i) {
        this.f100675b = bluetoothDevice;
        this.f100676c = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f100675b, i);
        parcel.writeInt(this.f100676c);
    }

    public MtuResult(Parcel parcel) {
        this.f100675b = (BluetoothDevice) parcel.readParcelable(BluetoothDevice.class.getClassLoader());
        this.f100676c = parcel.readInt();
    }
}

package no.nordicsemi.android.ble.callback.profile;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import no.nordicsemi.android.ble.data.Data;
import no.nordicsemi.android.ble.response.ReadResponse;
/* loaded from: classes8.dex */
public class ProfileReadResponse extends ReadResponse {
    public static final Parcelable.Creator<ProfileReadResponse> CREATOR = new C26641a();

    /* renamed from: d */
    public boolean f100627d;

    /* renamed from: no.nordicsemi.android.ble.callback.profile.ProfileReadResponse$a */
    /* loaded from: classes8.dex */
    public class C26641a implements Parcelable.Creator<ProfileReadResponse> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ProfileReadResponse createFromParcel(Parcel parcel) {
            return new ProfileReadResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ProfileReadResponse[] newArray(int i) {
            return new ProfileReadResponse[i];
        }
    }

    public ProfileReadResponse() {
        this.f100627d = true;
    }

    /* renamed from: c */
    public boolean m22627c() {
        return this.f100627d;
    }

    /* renamed from: d */
    public void m22626d(BluetoothDevice bluetoothDevice, Data data) {
        this.f100627d = false;
    }

    @Override // no.nordicsemi.android.ble.response.ReadResponse, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f100627d ? (byte) 1 : (byte) 0);
    }

    public ProfileReadResponse(Parcel parcel) {
        super(parcel);
        this.f100627d = true;
        this.f100627d = parcel.readByte() != 0;
    }
}

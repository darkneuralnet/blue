package no.nordicsemi.android.support.v18.scanner;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import kotlin.KotlinVersion;
/* loaded from: classes8.dex */
public final class ScanResult implements Parcelable {
    public static final Parcelable.Creator<ScanResult> CREATOR = new C26700a();

    /* renamed from: b */
    public final BluetoothDevice f100781b;

    /* renamed from: c */
    public C31942Bk5 f100782c;

    /* renamed from: d */
    public final int f100783d;

    /* renamed from: e */
    public final long f100784e;

    /* renamed from: f */
    public final int f100785f;

    /* renamed from: g */
    public final int f100786g;

    /* renamed from: h */
    public final int f100787h;

    /* renamed from: i */
    public final int f100788i;

    /* renamed from: j */
    public final int f100789j;

    /* renamed from: k */
    public final int f100790k;

    /* renamed from: no.nordicsemi.android.support.v18.scanner.ScanResult$a */
    /* loaded from: classes8.dex */
    public class C26700a implements Parcelable.Creator<ScanResult> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ScanResult createFromParcel(Parcel parcel) {
            return new ScanResult(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ScanResult[] newArray(int i) {
            return new ScanResult[i];
        }
    }

    public /* synthetic */ ScanResult(Parcel parcel, C26700a c26700a) {
        this(parcel);
    }

    /* renamed from: a */
    public BluetoothDevice m22434a() {
        return this.f100781b;
    }

    /* renamed from: b */
    public int m22433b() {
        return this.f100783d;
    }

    /* renamed from: c */
    public C31942Bk5 m22432c() {
        return this.f100782c;
    }

    /* renamed from: d */
    public long m22431d() {
        return this.f100784e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public boolean m22430e() {
        return (this.f100785f & 1) != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ScanResult.class != obj.getClass()) {
            return false;
        }
        ScanResult scanResult = (ScanResult) obj;
        if (C36791Wd3.m78112b(this.f100781b, scanResult.f100781b) && this.f100783d == scanResult.f100783d && C36791Wd3.m78112b(this.f100782c, scanResult.f100782c) && this.f100784e == scanResult.f100784e && this.f100785f == scanResult.f100785f && this.f100786g == scanResult.f100786g && this.f100787h == scanResult.f100787h && this.f100788i == scanResult.f100788i && this.f100789j == scanResult.f100789j && this.f100790k == scanResult.f100790k) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C36791Wd3.m78111c(this.f100781b, Integer.valueOf(this.f100783d), this.f100782c, Long.valueOf(this.f100784e), Integer.valueOf(this.f100785f), Integer.valueOf(this.f100786g), Integer.valueOf(this.f100787h), Integer.valueOf(this.f100788i), Integer.valueOf(this.f100789j), Integer.valueOf(this.f100790k));
    }

    public String toString() {
        return "ScanResult{device=" + this.f100781b + ", scanRecord=" + C36791Wd3.m78110d(this.f100782c) + ", rssi=" + this.f100783d + ", timestampNanos=" + this.f100784e + ", eventType=" + this.f100785f + ", primaryPhy=" + this.f100786g + ", secondaryPhy=" + this.f100787h + ", advertisingSid=" + this.f100788i + ", txPower=" + this.f100789j + ", periodicAdvertisingInterval=" + this.f100790k + CoreConstants.CURLY_RIGHT;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.f100781b.writeToParcel(parcel, i);
        if (this.f100782c != null) {
            parcel.writeInt(1);
            parcel.writeByteArray(this.f100782c.m113539b());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.f100783d);
        parcel.writeLong(this.f100784e);
        parcel.writeInt(this.f100785f);
        parcel.writeInt(this.f100786g);
        parcel.writeInt(this.f100787h);
        parcel.writeInt(this.f100788i);
        parcel.writeInt(this.f100789j);
        parcel.writeInt(this.f100790k);
    }

    public ScanResult(BluetoothDevice bluetoothDevice, C31942Bk5 c31942Bk5, int i, long j) {
        this.f100781b = bluetoothDevice;
        this.f100782c = c31942Bk5;
        this.f100783d = i;
        this.f100784e = j;
        this.f100785f = 17;
        this.f100786g = 1;
        this.f100787h = 0;
        this.f100788i = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f100789j = 127;
        this.f100790k = 0;
    }

    public ScanResult(BluetoothDevice bluetoothDevice, int i, int i2, int i3, int i4, int i5, int i6, int i7, C31942Bk5 c31942Bk5, long j) {
        this.f100781b = bluetoothDevice;
        this.f100785f = i;
        this.f100786g = i2;
        this.f100787h = i3;
        this.f100788i = i4;
        this.f100789j = i5;
        this.f100783d = i6;
        this.f100790k = i7;
        this.f100782c = c31942Bk5;
        this.f100784e = j;
    }

    public ScanResult(Parcel parcel) {
        this.f100781b = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
        if (parcel.readInt() == 1) {
            this.f100782c = C31942Bk5.m113533h(parcel.createByteArray());
        }
        this.f100783d = parcel.readInt();
        this.f100784e = parcel.readLong();
        this.f100785f = parcel.readInt();
        this.f100786g = parcel.readInt();
        this.f100787h = parcel.readInt();
        this.f100788i = parcel.readInt();
        this.f100789j = parcel.readInt();
        this.f100790k = parcel.readInt();
    }
}

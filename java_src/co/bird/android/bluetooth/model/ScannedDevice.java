package co.bird.android.bluetooth.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import no.nordicsemi.android.support.v18.scanner.ScanResult;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b)\u0010*J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002JE\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b$\u0010#R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b\u001a\u0010(¨\u0006+"}, m28432d2 = {"Lco/bird/android/bluetooth/model/ScannedDevice;", "Landroid/os/Parcelable;", "Lno/nordicsemi/android/support/v18/scanner/ScanResult;", "scanResult", "g", "", "macAddress", "", "rssi", "previousRssi", "highestRssi", "Lorg/joda/time/DateTime;", "lastScannedTime", C17296a.f69688o, "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "b", "Lno/nordicsemi/android/support/v18/scanner/ScanResult;", "e", "()Lno/nordicsemi/android/support/v18/scanner/ScanResult;", "c", "Ljava/lang/String;", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "I", "()I", "getPreviousRssi", "f", "getHighestRssi", "Lorg/joda/time/DateTime;", "()Lorg/joda/time/DateTime;", "<init>", "(Lno/nordicsemi/android/support/v18/scanner/ScanResult;Ljava/lang/String;IIILorg/joda/time/DateTime;)V", "interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ScannedDevice implements Parcelable {
    public static final Parcelable.Creator<ScannedDevice> CREATOR = new C14426a();

    /* renamed from: b */
    public final ScanResult f63008b;

    /* renamed from: c */
    public final String f63009c;

    /* renamed from: d */
    public final int f63010d;

    /* renamed from: e */
    public final int f63011e;

    /* renamed from: f */
    public final int f63012f;

    /* renamed from: g */
    public final DateTime f63013g;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.bluetooth.model.ScannedDevice$a */
    /* loaded from: classes2.dex */
    public static final class C14426a implements Parcelable.Creator<ScannedDevice> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final ScannedDevice createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ScannedDevice((ScanResult) parcel.readParcelable(ScannedDevice.class.getClassLoader()), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (DateTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final ScannedDevice[] newArray(int i) {
            return new ScannedDevice[i];
        }
    }

    public ScannedDevice(ScanResult scanResult, String macAddress, int i, int i2, int i3, DateTime lastScannedTime) {
        Intrinsics.checkNotNullParameter(scanResult, "scanResult");
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(lastScannedTime, "lastScannedTime");
        this.f63008b = scanResult;
        this.f63009c = macAddress;
        this.f63010d = i;
        this.f63011e = i2;
        this.f63012f = i3;
        this.f63013g = lastScannedTime;
    }

    public static /* synthetic */ ScannedDevice copy$default(ScannedDevice scannedDevice, ScanResult scanResult, String str, int i, int i2, int i3, DateTime dateTime, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            scanResult = scannedDevice.f63008b;
        }
        if ((i4 & 2) != 0) {
            str = scannedDevice.f63009c;
        }
        String str2 = str;
        if ((i4 & 4) != 0) {
            i = scannedDevice.f63010d;
        }
        int i5 = i;
        if ((i4 & 8) != 0) {
            i2 = scannedDevice.f63011e;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = scannedDevice.f63012f;
        }
        int i7 = i3;
        if ((i4 & 32) != 0) {
            dateTime = scannedDevice.f63013g;
        }
        return scannedDevice.m59107a(scanResult, str2, i5, i6, i7, dateTime);
    }

    /* renamed from: a */
    public final ScannedDevice m59107a(ScanResult scanResult, String macAddress, int i, int i2, int i3, DateTime lastScannedTime) {
        Intrinsics.checkNotNullParameter(scanResult, "scanResult");
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(lastScannedTime, "lastScannedTime");
        return new ScannedDevice(scanResult, macAddress, i, i2, i3, lastScannedTime);
    }

    /* renamed from: b */
    public final DateTime m59106b() {
        return this.f63013g;
    }

    /* renamed from: c */
    public final String m59105c() {
        return this.f63009c;
    }

    /* renamed from: d */
    public final int m59104d() {
        return this.f63010d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final ScanResult m59103e() {
        return this.f63008b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ScannedDevice) {
            ScannedDevice scannedDevice = (ScannedDevice) obj;
            return Intrinsics.areEqual(this.f63008b, scannedDevice.f63008b) && Intrinsics.areEqual(this.f63009c, scannedDevice.f63009c) && this.f63010d == scannedDevice.f63010d && this.f63011e == scannedDevice.f63011e && this.f63012f == scannedDevice.f63012f && Intrinsics.areEqual(this.f63013g, scannedDevice.f63013g);
        }
        return false;
    }

    /* renamed from: g */
    public final ScannedDevice m59102g(ScanResult scanResult) {
        int i;
        Intrinsics.checkNotNullParameter(scanResult, "scanResult");
        String address = scanResult.m22434a().getAddress();
        int i2 = this.f63010d;
        int m22433b = scanResult.m22433b();
        int i3 = this.f63012f;
        int i4 = this.f63010d;
        if (i3 > i4) {
            i = i3;
        } else {
            i = i4;
        }
        DateTime m77889a = C36856Wk5.m77889a(scanResult);
        Intrinsics.checkNotNullExpressionValue(address, "address");
        return m59107a(scanResult, address, m22433b, i2, i, m77889a);
    }

    public int hashCode() {
        return (((((((((this.f63008b.hashCode() * 31) + this.f63009c.hashCode()) * 31) + Integer.hashCode(this.f63010d)) * 31) + Integer.hashCode(this.f63011e)) * 31) + Integer.hashCode(this.f63012f)) * 31) + this.f63013g.hashCode();
    }

    public String toString() {
        ScanResult scanResult = this.f63008b;
        String str = this.f63009c;
        int i = this.f63010d;
        int i2 = this.f63011e;
        int i3 = this.f63012f;
        DateTime dateTime = this.f63013g;
        return "ScannedDevice(scanResult=" + scanResult + ", macAddress=" + str + ", rssi=" + i + ", previousRssi=" + i2 + ", highestRssi=" + i3 + ", lastScannedTime=" + dateTime + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeParcelable(this.f63008b, i);
        out.writeString(this.f63009c);
        out.writeInt(this.f63010d);
        out.writeInt(this.f63011e);
        out.writeInt(this.f63012f);
        out.writeSerializable(this.f63013g);
    }

    public /* synthetic */ ScannedDevice(ScanResult scanResult, String str, int i, int i2, int i3, DateTime dateTime, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(scanResult, str, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? 0 : i3, (i4 & 32) != 0 ? C36856Wk5.m77889a(scanResult) : dateTime);
    }
}

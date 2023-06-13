package no.nordicsemi.android.support.v18.scanner;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
/* loaded from: classes8.dex */
public final class ScanFilter implements Parcelable {

    /* renamed from: b */
    public final String f100761b;

    /* renamed from: c */
    public final String f100762c;

    /* renamed from: d */
    public final ParcelUuid f100763d;

    /* renamed from: e */
    public final ParcelUuid f100764e;

    /* renamed from: f */
    public final ParcelUuid f100765f;

    /* renamed from: g */
    public final byte[] f100766g;

    /* renamed from: h */
    public final byte[] f100767h;

    /* renamed from: i */
    public final int f100768i;

    /* renamed from: j */
    public final byte[] f100769j;

    /* renamed from: k */
    public final byte[] f100770k;

    /* renamed from: l */
    public static final ScanFilter f100760l = new C26699b().m22443a();
    public static final Parcelable.Creator<ScanFilter> CREATOR = new C26698a();

    /* renamed from: no.nordicsemi.android.support.v18.scanner.ScanFilter$a */
    /* loaded from: classes8.dex */
    public class C26698a implements Parcelable.Creator<ScanFilter> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ScanFilter createFromParcel(Parcel parcel) {
            C26699b c26699b = new C26699b();
            if (parcel.readInt() == 1) {
                c26699b.m22441c(parcel.readString());
            }
            if (parcel.readInt() == 1) {
                c26699b.m22442b(parcel.readString());
            }
            if (parcel.readInt() == 1) {
                ParcelUuid parcelUuid = (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader());
                c26699b.m22436h(parcelUuid);
                if (parcel.readInt() == 1) {
                    c26699b.m22435i(parcelUuid, (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader()));
                }
            }
            if (parcel.readInt() == 1) {
                ParcelUuid parcelUuid2 = (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader());
                if (parcel.readInt() == 1) {
                    byte[] bArr = new byte[parcel.readInt()];
                    parcel.readByteArray(bArr);
                    if (parcel.readInt() == 0) {
                        c26699b.m22438f(parcelUuid2, bArr);
                    } else {
                        byte[] bArr2 = new byte[parcel.readInt()];
                        parcel.readByteArray(bArr2);
                        c26699b.m22437g(parcelUuid2, bArr, bArr2);
                    }
                }
            }
            int readInt = parcel.readInt();
            if (parcel.readInt() == 1) {
                byte[] bArr3 = new byte[parcel.readInt()];
                parcel.readByteArray(bArr3);
                if (parcel.readInt() == 0) {
                    c26699b.m22440d(readInt, bArr3);
                } else {
                    byte[] bArr4 = new byte[parcel.readInt()];
                    parcel.readByteArray(bArr4);
                    c26699b.m22439e(readInt, bArr3, bArr4);
                }
            }
            return c26699b.m22443a();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ScanFilter[] newArray(int i) {
            return new ScanFilter[i];
        }
    }

    /* renamed from: no.nordicsemi.android.support.v18.scanner.ScanFilter$b */
    /* loaded from: classes8.dex */
    public static final class C26699b {

        /* renamed from: a */
        public String f100771a;

        /* renamed from: b */
        public String f100772b;

        /* renamed from: c */
        public ParcelUuid f100773c;

        /* renamed from: d */
        public ParcelUuid f100774d;

        /* renamed from: e */
        public ParcelUuid f100775e;

        /* renamed from: f */
        public byte[] f100776f;

        /* renamed from: g */
        public byte[] f100777g;

        /* renamed from: h */
        public int f100778h = -1;

        /* renamed from: i */
        public byte[] f100779i;

        /* renamed from: j */
        public byte[] f100780j;

        /* renamed from: a */
        public ScanFilter m22443a() {
            return new ScanFilter(this.f100771a, this.f100772b, this.f100773c, this.f100774d, this.f100775e, this.f100776f, this.f100777g, this.f100778h, this.f100779i, this.f100780j, null);
        }

        /* renamed from: b */
        public C26699b m22442b(String str) {
            if (str != null && !BluetoothAdapter.checkBluetoothAddress(str)) {
                throw new IllegalArgumentException("invalid device address " + str);
            }
            this.f100772b = str;
            return this;
        }

        /* renamed from: c */
        public C26699b m22441c(String str) {
            this.f100771a = str;
            return this;
        }

        /* renamed from: d */
        public C26699b m22440d(int i, byte[] bArr) {
            if (bArr != null && i < 0) {
                throw new IllegalArgumentException("invalid manufacture id");
            }
            this.f100778h = i;
            this.f100779i = bArr;
            this.f100780j = null;
            return this;
        }

        /* renamed from: e */
        public C26699b m22439e(int i, byte[] bArr, byte[] bArr2) {
            if (bArr != null && i < 0) {
                throw new IllegalArgumentException("invalid manufacture id");
            }
            if (bArr2 != null) {
                if (bArr != null) {
                    if (bArr.length != bArr2.length) {
                        throw new IllegalArgumentException("size mismatch for manufacturerData and manufacturerDataMask");
                    }
                } else {
                    throw new IllegalArgumentException("manufacturerData is null while manufacturerDataMask is not null");
                }
            }
            this.f100778h = i;
            this.f100779i = bArr;
            this.f100780j = bArr2;
            return this;
        }

        /* renamed from: f */
        public C26699b m22438f(ParcelUuid parcelUuid, byte[] bArr) {
            if (parcelUuid != null) {
                this.f100775e = parcelUuid;
                this.f100776f = bArr;
                this.f100777g = null;
                return this;
            }
            throw new IllegalArgumentException("serviceDataUuid is null!");
        }

        /* renamed from: g */
        public C26699b m22437g(ParcelUuid parcelUuid, byte[] bArr, byte[] bArr2) {
            if (parcelUuid != null) {
                if (bArr2 != null) {
                    if (bArr != null) {
                        if (bArr.length != bArr2.length) {
                            throw new IllegalArgumentException("size mismatch for service data and service data mask");
                        }
                    } else {
                        throw new IllegalArgumentException("serviceData is null while serviceDataMask is not null");
                    }
                }
                this.f100775e = parcelUuid;
                this.f100776f = bArr;
                this.f100777g = bArr2;
                return this;
            }
            throw new IllegalArgumentException("serviceDataUuid is null");
        }

        /* renamed from: h */
        public C26699b m22436h(ParcelUuid parcelUuid) {
            this.f100773c = parcelUuid;
            this.f100774d = null;
            return this;
        }

        /* renamed from: i */
        public C26699b m22435i(ParcelUuid parcelUuid, ParcelUuid parcelUuid2) {
            if (parcelUuid2 != null && parcelUuid == null) {
                throw new IllegalArgumentException("uuid is null while uuidMask is not null!");
            }
            this.f100773c = parcelUuid;
            this.f100774d = parcelUuid2;
            return this;
        }
    }

    public /* synthetic */ ScanFilter(String str, String str2, ParcelUuid parcelUuid, ParcelUuid parcelUuid2, ParcelUuid parcelUuid3, byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4, C26698a c26698a) {
        this(str, str2, parcelUuid, parcelUuid2, parcelUuid3, bArr, bArr2, i, bArr3, bArr4);
    }

    /* renamed from: n */
    public static boolean m22447n(UUID uuid, UUID uuid2, UUID uuid3) {
        if (uuid2 == null) {
            return uuid.equals(uuid3);
        }
        if ((uuid.getLeastSignificantBits() & uuid2.getLeastSignificantBits()) != (uuid3.getLeastSignificantBits() & uuid2.getLeastSignificantBits())) {
            return false;
        }
        if ((uuid.getMostSignificantBits() & uuid2.getMostSignificantBits()) != (uuid2.getMostSignificantBits() & uuid3.getMostSignificantBits())) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public static boolean m22446o(ParcelUuid parcelUuid, ParcelUuid parcelUuid2, List<ParcelUuid> list) {
        UUID uuid;
        if (parcelUuid == null) {
            return true;
        }
        if (list == null) {
            return false;
        }
        for (ParcelUuid parcelUuid3 : list) {
            if (parcelUuid2 == null) {
                uuid = null;
            } else {
                uuid = parcelUuid2.getUuid();
            }
            if (m22447n(parcelUuid.getUuid(), uuid, parcelUuid3.getUuid())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public String m22459a() {
        return this.f100762c;
    }

    /* renamed from: b */
    public String m22458b() {
        return this.f100761b;
    }

    /* renamed from: c */
    public byte[] m22457c() {
        return this.f100769j;
    }

    /* renamed from: d */
    public byte[] m22456d() {
        return this.f100770k;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public int m22455e() {
        return this.f100768i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ScanFilter.class != obj.getClass()) {
            return false;
        }
        ScanFilter scanFilter = (ScanFilter) obj;
        if (C36791Wd3.m78112b(this.f100761b, scanFilter.f100761b) && C36791Wd3.m78112b(this.f100762c, scanFilter.f100762c) && this.f100768i == scanFilter.f100768i && C36791Wd3.m78113a(this.f100769j, scanFilter.f100769j) && C36791Wd3.m78113a(this.f100770k, scanFilter.f100770k) && C36791Wd3.m78112b(this.f100765f, scanFilter.f100765f) && C36791Wd3.m78113a(this.f100766g, scanFilter.f100766g) && C36791Wd3.m78113a(this.f100767h, scanFilter.f100767h) && C36791Wd3.m78112b(this.f100763d, scanFilter.f100763d) && C36791Wd3.m78112b(this.f100764e, scanFilter.f100764e)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public byte[] m22454g() {
        return this.f100766g;
    }

    /* renamed from: h */
    public byte[] m22453h() {
        return this.f100767h;
    }

    public int hashCode() {
        return C36791Wd3.m78111c(this.f100761b, this.f100762c, Integer.valueOf(this.f100768i), Integer.valueOf(Arrays.hashCode(this.f100769j)), Integer.valueOf(Arrays.hashCode(this.f100770k)), this.f100765f, Integer.valueOf(Arrays.hashCode(this.f100766g)), Integer.valueOf(Arrays.hashCode(this.f100767h)), this.f100763d, this.f100764e);
    }

    /* renamed from: i */
    public ParcelUuid m22452i() {
        return this.f100765f;
    }

    /* renamed from: j */
    public ParcelUuid m22451j() {
        return this.f100763d;
    }

    /* renamed from: k */
    public ParcelUuid m22450k() {
        return this.f100764e;
    }

    /* renamed from: l */
    public boolean m22449l(ScanResult scanResult) {
        if (scanResult == null) {
            return false;
        }
        BluetoothDevice m22434a = scanResult.m22434a();
        String str = this.f100762c;
        if (str != null && !str.equals(m22434a.getAddress())) {
            return false;
        }
        C31942Bk5 m22432c = scanResult.m22432c();
        if (m22432c == null && (this.f100761b != null || this.f100763d != null || this.f100769j != null || this.f100766g != null)) {
            return false;
        }
        String str2 = this.f100761b;
        if (str2 != null && !str2.equals(m22432c.m113538c())) {
            return false;
        }
        ParcelUuid parcelUuid = this.f100763d;
        if (parcelUuid != null && !m22446o(parcelUuid, this.f100764e, m22432c.m113534g())) {
            return false;
        }
        ParcelUuid parcelUuid2 = this.f100765f;
        if (parcelUuid2 != null && m22432c != null && !m22448m(this.f100766g, this.f100767h, m22432c.m113535f(parcelUuid2))) {
            return false;
        }
        int i = this.f100768i;
        if (i >= 0 && m22432c != null && !m22448m(this.f100769j, this.f100770k, m22432c.m113536e(i))) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public final boolean m22448m(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            if (bArr3 != null) {
                return true;
            }
            return false;
        } else if (bArr3 == null || bArr3.length < bArr.length) {
            return false;
        } else {
            if (bArr2 == null) {
                for (int i = 0; i < bArr.length; i++) {
                    if (bArr3[i] != bArr[i]) {
                        return false;
                    }
                }
                return true;
            }
            for (int i2 = 0; i2 < bArr.length; i2++) {
                byte b = bArr2[i2];
                if ((bArr3[i2] & b) != (b & bArr[i2])) {
                    return false;
                }
            }
            return true;
        }
    }

    public String toString() {
        return "BluetoothLeScanFilter [deviceName=" + this.f100761b + ", deviceAddress=" + this.f100762c + ", mUuid=" + this.f100763d + ", uuidMask=" + this.f100764e + ", serviceDataUuid=" + C36791Wd3.m78110d(this.f100765f) + ", serviceData=" + Arrays.toString(this.f100766g) + ", serviceDataMask=" + Arrays.toString(this.f100767h) + ", manufacturerId=" + this.f100768i + ", manufacturerData=" + Arrays.toString(this.f100769j) + ", manufacturerDataMask=" + Arrays.toString(this.f100770k) + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 0;
        if (this.f100761b == null) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        parcel.writeInt(i2);
        String str = this.f100761b;
        if (str != null) {
            parcel.writeString(str);
        }
        if (this.f100762c == null) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        parcel.writeInt(i3);
        String str2 = this.f100762c;
        if (str2 != null) {
            parcel.writeString(str2);
        }
        if (this.f100763d == null) {
            i4 = 0;
        } else {
            i4 = 1;
        }
        parcel.writeInt(i4);
        ParcelUuid parcelUuid = this.f100763d;
        if (parcelUuid != null) {
            parcel.writeParcelable(parcelUuid, i);
            if (this.f100764e == null) {
                i9 = 0;
            } else {
                i9 = 1;
            }
            parcel.writeInt(i9);
            ParcelUuid parcelUuid2 = this.f100764e;
            if (parcelUuid2 != null) {
                parcel.writeParcelable(parcelUuid2, i);
            }
        }
        if (this.f100765f == null) {
            i5 = 0;
        } else {
            i5 = 1;
        }
        parcel.writeInt(i5);
        ParcelUuid parcelUuid3 = this.f100765f;
        if (parcelUuid3 != null) {
            parcel.writeParcelable(parcelUuid3, i);
            if (this.f100766g == null) {
                i7 = 0;
            } else {
                i7 = 1;
            }
            parcel.writeInt(i7);
            byte[] bArr = this.f100766g;
            if (bArr != null) {
                parcel.writeInt(bArr.length);
                parcel.writeByteArray(this.f100766g);
                if (this.f100767h == null) {
                    i8 = 0;
                } else {
                    i8 = 1;
                }
                parcel.writeInt(i8);
                byte[] bArr2 = this.f100767h;
                if (bArr2 != null) {
                    parcel.writeInt(bArr2.length);
                    parcel.writeByteArray(this.f100767h);
                }
            }
        }
        parcel.writeInt(this.f100768i);
        if (this.f100769j == null) {
            i6 = 0;
        } else {
            i6 = 1;
        }
        parcel.writeInt(i6);
        byte[] bArr3 = this.f100769j;
        if (bArr3 != null) {
            parcel.writeInt(bArr3.length);
            parcel.writeByteArray(this.f100769j);
            if (this.f100770k != null) {
                i10 = 1;
            }
            parcel.writeInt(i10);
            byte[] bArr4 = this.f100770k;
            if (bArr4 != null) {
                parcel.writeInt(bArr4.length);
                parcel.writeByteArray(this.f100770k);
            }
        }
    }

    public ScanFilter(String str, String str2, ParcelUuid parcelUuid, ParcelUuid parcelUuid2, ParcelUuid parcelUuid3, byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) {
        this.f100761b = str;
        this.f100763d = parcelUuid;
        this.f100764e = parcelUuid2;
        this.f100762c = str2;
        this.f100765f = parcelUuid3;
        this.f100766g = bArr;
        this.f100767h = bArr2;
        this.f100768i = i;
        this.f100769j = bArr3;
        this.f100770k = bArr4;
    }
}

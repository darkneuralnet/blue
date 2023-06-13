package com.polidea.rxandroidble2.scan;

import android.bluetooth.BluetoothAdapter;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
/* loaded from: classes6.dex */
public class ScanFilter implements Parcelable, InterfaceC40525ek5 {

    /* renamed from: b */
    public final String f75020b;

    /* renamed from: c */
    public final String f75021c;

    /* renamed from: d */
    public final ParcelUuid f75022d;

    /* renamed from: e */
    public final ParcelUuid f75023e;

    /* renamed from: f */
    public final ParcelUuid f75024f;

    /* renamed from: g */
    public final ParcelUuid f75025g;

    /* renamed from: h */
    public final ParcelUuid f75026h;

    /* renamed from: i */
    public final byte[] f75027i;

    /* renamed from: j */
    public final byte[] f75028j;

    /* renamed from: k */
    public final int f75029k;

    /* renamed from: l */
    public final byte[] f75030l;

    /* renamed from: m */
    public final byte[] f75031m;

    /* renamed from: n */
    public static final ScanFilter f75019n = new C18577b().m45844a();
    public static final Parcelable.Creator<ScanFilter> CREATOR = new C18576a();

    /* renamed from: com.polidea.rxandroidble2.scan.ScanFilter$a */
    /* loaded from: classes6.dex */
    public class C18576a implements Parcelable.Creator<ScanFilter> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ScanFilter createFromParcel(Parcel parcel) {
            C18577b c18577b = new C18577b();
            if (parcel.readInt() == 1) {
                c18577b.m45842c(parcel.readString());
            }
            if (parcel.readInt() == 1) {
                c18577b.m45843b(parcel.readString());
            }
            if (parcel.readInt() == 1) {
                ParcelUuid parcelUuid = (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader());
                c18577b.m45835j(parcelUuid);
                if (parcel.readInt() == 1) {
                    c18577b.m45834k(parcelUuid, (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader()));
                }
            }
            if (parcel.readInt() == 1) {
                ParcelUuid parcelUuid2 = (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader());
                c18577b.m45837h(parcelUuid2);
                if (parcel.readInt() == 1) {
                    c18577b.m45836i(parcelUuid2, (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader()));
                }
            }
            if (parcel.readInt() == 1) {
                ParcelUuid parcelUuid3 = (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader());
                if (parcel.readInt() == 1) {
                    byte[] bArr = new byte[parcel.readInt()];
                    parcel.readByteArray(bArr);
                    if (parcel.readInt() == 0) {
                        c18577b.m45839f(parcelUuid3, bArr);
                    } else {
                        byte[] bArr2 = new byte[parcel.readInt()];
                        parcel.readByteArray(bArr2);
                        c18577b.m45838g(parcelUuid3, bArr, bArr2);
                    }
                }
            }
            int readInt = parcel.readInt();
            if (parcel.readInt() == 1) {
                byte[] bArr3 = new byte[parcel.readInt()];
                parcel.readByteArray(bArr3);
                if (parcel.readInt() == 0) {
                    c18577b.m45841d(readInt, bArr3);
                } else {
                    byte[] bArr4 = new byte[parcel.readInt()];
                    parcel.readByteArray(bArr4);
                    c18577b.m45840e(readInt, bArr3, bArr4);
                }
            }
            return c18577b.m45844a();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ScanFilter[] newArray(int i) {
            return new ScanFilter[i];
        }
    }

    /* renamed from: com.polidea.rxandroidble2.scan.ScanFilter$b */
    /* loaded from: classes6.dex */
    public static final class C18577b {

        /* renamed from: a */
        public String f75032a;

        /* renamed from: b */
        public String f75033b;

        /* renamed from: c */
        public ParcelUuid f75034c;

        /* renamed from: d */
        public ParcelUuid f75035d;

        /* renamed from: e */
        public ParcelUuid f75036e;

        /* renamed from: f */
        public ParcelUuid f75037f;

        /* renamed from: g */
        public ParcelUuid f75038g;

        /* renamed from: h */
        public byte[] f75039h;

        /* renamed from: i */
        public byte[] f75040i;

        /* renamed from: j */
        public int f75041j = -1;

        /* renamed from: k */
        public byte[] f75042k;

        /* renamed from: l */
        public byte[] f75043l;

        /* renamed from: a */
        public ScanFilter m45844a() {
            return new ScanFilter(this.f75032a, this.f75033b, this.f75034c, this.f75035d, this.f75036e, this.f75037f, this.f75038g, this.f75039h, this.f75040i, this.f75041j, this.f75042k, this.f75043l);
        }

        /* renamed from: b */
        public C18577b m45843b(String str) {
            if (str != null && !BluetoothAdapter.checkBluetoothAddress(str)) {
                throw new IllegalArgumentException("invalid device address " + str);
            }
            this.f75033b = str;
            return this;
        }

        /* renamed from: c */
        public C18577b m45842c(String str) {
            this.f75032a = str;
            return this;
        }

        /* renamed from: d */
        public C18577b m45841d(int i, byte[] bArr) {
            if (bArr != null && i < 0) {
                throw new IllegalArgumentException("invalid manufacture id");
            }
            this.f75041j = i;
            this.f75042k = bArr;
            this.f75043l = null;
            return this;
        }

        /* renamed from: e */
        public C18577b m45840e(int i, byte[] bArr, byte[] bArr2) {
            if (bArr != null && i < 0) {
                throw new IllegalArgumentException("invalid manufacture id");
            }
            byte[] bArr3 = this.f75043l;
            if (bArr3 != null) {
                byte[] bArr4 = this.f75042k;
                if (bArr4 != null) {
                    if (bArr4.length != bArr3.length) {
                        throw new IllegalArgumentException("size mismatch for manufacturerData and manufacturerDataMask");
                    }
                } else {
                    throw new IllegalArgumentException("manufacturerData is null while manufacturerDataMask is not null");
                }
            }
            this.f75041j = i;
            this.f75042k = bArr;
            this.f75043l = bArr2;
            return this;
        }

        /* renamed from: f */
        public C18577b m45839f(ParcelUuid parcelUuid, byte[] bArr) {
            if (parcelUuid != null) {
                this.f75038g = parcelUuid;
                this.f75039h = bArr;
                this.f75040i = null;
                return this;
            }
            throw new IllegalArgumentException("serviceDataUuid is null");
        }

        /* renamed from: g */
        public C18577b m45838g(ParcelUuid parcelUuid, byte[] bArr, byte[] bArr2) {
            if (parcelUuid != null) {
                byte[] bArr3 = this.f75040i;
                if (bArr3 != null) {
                    byte[] bArr4 = this.f75039h;
                    if (bArr4 != null) {
                        if (bArr4.length != bArr3.length) {
                            throw new IllegalArgumentException("size mismatch for service data and service data mask");
                        }
                    } else {
                        throw new IllegalArgumentException("serviceData is null while serviceDataMask is not null");
                    }
                }
                this.f75038g = parcelUuid;
                this.f75039h = bArr;
                this.f75040i = bArr2;
                return this;
            }
            throw new IllegalArgumentException("serviceDataUuid is null");
        }

        /* renamed from: h */
        public C18577b m45837h(ParcelUuid parcelUuid) {
            this.f75036e = parcelUuid;
            this.f75037f = null;
            return this;
        }

        /* renamed from: i */
        public C18577b m45836i(ParcelUuid parcelUuid, ParcelUuid parcelUuid2) {
            if (parcelUuid2 != null && parcelUuid == null) {
                throw new IllegalArgumentException("SolicitationUuid is null while SolicitationUuidMask is not null!");
            }
            this.f75036e = parcelUuid;
            this.f75037f = parcelUuid2;
            return this;
        }

        /* renamed from: j */
        public C18577b m45835j(ParcelUuid parcelUuid) {
            this.f75034c = parcelUuid;
            this.f75035d = null;
            return this;
        }

        /* renamed from: k */
        public C18577b m45834k(ParcelUuid parcelUuid, ParcelUuid parcelUuid2) {
            if (this.f75035d != null && this.f75034c == null) {
                throw new IllegalArgumentException("uuid is null while uuidMask is not null!");
            }
            this.f75034c = parcelUuid;
            this.f75035d = parcelUuid2;
            return this;
        }
    }

    public ScanFilter(String str, String str2, ParcelUuid parcelUuid, ParcelUuid parcelUuid2, ParcelUuid parcelUuid3, ParcelUuid parcelUuid4, ParcelUuid parcelUuid5, byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) {
        this.f75020b = str;
        this.f75022d = parcelUuid;
        this.f75023e = parcelUuid2;
        this.f75024f = parcelUuid3;
        this.f75025g = parcelUuid4;
        this.f75021c = str2;
        this.f75026h = parcelUuid5;
        this.f75027i = bArr;
        this.f75028j = bArr2;
        this.f75029k = i;
        this.f75030l = bArr3;
        this.f75031m = bArr4;
    }

    /* renamed from: c */
    public static boolean m45862c(byte[] bArr, byte[] bArr2) {
        return bArr == bArr2 || !(bArr == null || bArr2 == null || !Arrays.equals(bArr, bArr2));
    }

    /* renamed from: d */
    public static boolean m45861d(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: p */
    public static boolean m45850p(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr3 == null || bArr3.length < bArr.length) {
            return false;
        }
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

    /* renamed from: q */
    public static boolean m45849q(ParcelUuid parcelUuid, ParcelUuid parcelUuid2, List<ParcelUuid> list) {
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
            if (m45848r(parcelUuid.getUuid(), uuid, parcelUuid3.getUuid())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r */
    public static boolean m45848r(UUID uuid, UUID uuid2, UUID uuid3) {
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

    /* renamed from: s */
    public static boolean m45847s(ParcelUuid parcelUuid, ParcelUuid parcelUuid2, List<ParcelUuid> list) {
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
            if (m45848r(parcelUuid.getUuid(), uuid, parcelUuid3.getUuid())) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC40525ek5
    /* renamed from: a */
    public boolean mo42593a() {
        return equals(f75019n);
    }

    @Override // p000.InterfaceC40525ek5
    /* renamed from: b */
    public boolean mo42592b(InterfaceC36622Vk5 interfaceC36622Vk5) {
        if (interfaceC36622Vk5 == null) {
            return false;
        }
        String address = interfaceC36622Vk5.getAddress();
        String str = this.f75021c;
        if (str != null && !str.equals(address)) {
            return false;
        }
        InterfaceC32176Ck5 scanRecord = interfaceC36622Vk5.getScanRecord();
        String str2 = this.f75020b;
        if (str2 != null && !str2.equals(interfaceC36622Vk5.getDeviceName()) && (scanRecord == null || !this.f75020b.equals(scanRecord.getDeviceName()))) {
            return false;
        }
        if (scanRecord == null) {
            if (this.f75022d != null || this.f75030l != null || this.f75027i != null) {
                return false;
            }
            return true;
        }
        ParcelUuid parcelUuid = this.f75022d;
        if (parcelUuid != null && !m45847s(parcelUuid, this.f75023e, scanRecord.mo106629c())) {
            return false;
        }
        ParcelUuid parcelUuid2 = this.f75024f;
        if (parcelUuid2 != null && !m45849q(parcelUuid2, this.f75025g, scanRecord.mo106628d())) {
            return false;
        }
        ParcelUuid parcelUuid3 = this.f75026h;
        if (parcelUuid3 != null && !m45850p(this.f75027i, this.f75028j, scanRecord.mo106627e(parcelUuid3))) {
            return false;
        }
        int i = this.f75029k;
        if (i >= 0 && !m45850p(this.f75030l, this.f75031m, scanRecord.mo106630b(i))) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String m45860e() {
        return this.f75021c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScanFilter scanFilter = (ScanFilter) obj;
        if (m45861d(this.f75020b, scanFilter.f75020b) && m45861d(this.f75021c, scanFilter.f75021c) && this.f75029k == scanFilter.f75029k && m45862c(this.f75030l, scanFilter.f75030l) && m45862c(this.f75031m, scanFilter.f75031m) && m45861d(this.f75026h, scanFilter.f75026h) && m45862c(this.f75027i, scanFilter.f75027i) && m45862c(this.f75028j, scanFilter.f75028j) && m45861d(this.f75022d, scanFilter.f75022d) && m45861d(this.f75023e, scanFilter.f75023e) && m45861d(this.f75024f, scanFilter.f75024f) && m45861d(this.f75025g, scanFilter.f75025g)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public String m45859g() {
        return this.f75020b;
    }

    /* renamed from: h */
    public byte[] m45858h() {
        return this.f75030l;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f75020b, this.f75021c, Integer.valueOf(this.f75029k), Integer.valueOf(Arrays.hashCode(this.f75030l)), Integer.valueOf(Arrays.hashCode(this.f75031m)), this.f75026h, Integer.valueOf(Arrays.hashCode(this.f75027i)), Integer.valueOf(Arrays.hashCode(this.f75028j)), this.f75022d, this.f75023e, this.f75024f, this.f75025g});
    }

    /* renamed from: i */
    public byte[] m45857i() {
        return this.f75031m;
    }

    /* renamed from: j */
    public int m45856j() {
        return this.f75029k;
    }

    /* renamed from: k */
    public byte[] m45855k() {
        return this.f75027i;
    }

    /* renamed from: l */
    public byte[] m45854l() {
        return this.f75028j;
    }

    /* renamed from: m */
    public ParcelUuid m45853m() {
        return this.f75026h;
    }

    /* renamed from: n */
    public ParcelUuid m45852n() {
        return this.f75022d;
    }

    /* renamed from: o */
    public ParcelUuid m45851o() {
        return this.f75023e;
    }

    public String toString() {
        String m91169g;
        String m91169g2;
        String m91169g3;
        String m91169g4;
        StringBuilder sb = new StringBuilder();
        sb.append("BluetoothLeScanFilter [mDeviceName=");
        sb.append(this.f75020b);
        sb.append(", ");
        sb.append(C35098Ox2.m91172d(this.f75021c));
        sb.append(", mUuid=");
        ParcelUuid parcelUuid = this.f75022d;
        String str = null;
        if (parcelUuid == null) {
            m91169g = null;
        } else {
            m91169g = C35098Ox2.m91169g(parcelUuid.getUuid());
        }
        sb.append(m91169g);
        sb.append(", mUuidMask=");
        ParcelUuid parcelUuid2 = this.f75023e;
        if (parcelUuid2 == null) {
            m91169g2 = null;
        } else {
            m91169g2 = C35098Ox2.m91169g(parcelUuid2.getUuid());
        }
        sb.append(m91169g2);
        sb.append(", mSolicitedUuid=");
        ParcelUuid parcelUuid3 = this.f75024f;
        if (parcelUuid3 == null) {
            m91169g3 = null;
        } else {
            m91169g3 = C35098Ox2.m91169g(parcelUuid3.getUuid());
        }
        sb.append(m91169g3);
        sb.append(", mSolicitedUuidMask=");
        ParcelUuid parcelUuid4 = this.f75025g;
        if (parcelUuid4 == null) {
            m91169g4 = null;
        } else {
            m91169g4 = C35098Ox2.m91169g(parcelUuid4.getUuid());
        }
        sb.append(m91169g4);
        sb.append(", mServiceDataUuid=");
        ParcelUuid parcelUuid5 = this.f75026h;
        if (parcelUuid5 != null) {
            str = C35098Ox2.m91169g(parcelUuid5.getUuid());
        }
        sb.append(str);
        sb.append(", mServiceData=");
        sb.append(Arrays.toString(this.f75027i));
        sb.append(", mServiceDataMask=");
        sb.append(Arrays.toString(this.f75028j));
        sb.append(", mManufacturerId=");
        sb.append(this.f75029k);
        sb.append(", mManufacturerData=");
        sb.append(Arrays.toString(this.f75030l));
        sb.append(", mManufacturerDataMask=");
        sb.append(Arrays.toString(this.f75031m));
        sb.append("]");
        return sb.toString();
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
        int i10;
        int i11;
        int i12 = 0;
        if (this.f75020b == null) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        parcel.writeInt(i2);
        String str = this.f75020b;
        if (str != null) {
            parcel.writeString(str);
        }
        if (this.f75021c == null) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        parcel.writeInt(i3);
        String str2 = this.f75021c;
        if (str2 != null) {
            parcel.writeString(str2);
        }
        if (this.f75022d == null) {
            i4 = 0;
        } else {
            i4 = 1;
        }
        parcel.writeInt(i4);
        ParcelUuid parcelUuid = this.f75022d;
        if (parcelUuid != null) {
            parcel.writeParcelable(parcelUuid, i);
            if (this.f75023e == null) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            parcel.writeInt(i11);
            ParcelUuid parcelUuid2 = this.f75023e;
            if (parcelUuid2 != null) {
                parcel.writeParcelable(parcelUuid2, i);
            }
        }
        if (this.f75024f == null) {
            i5 = 0;
        } else {
            i5 = 1;
        }
        parcel.writeInt(i5);
        ParcelUuid parcelUuid3 = this.f75024f;
        if (parcelUuid3 != null) {
            parcel.writeParcelable(parcelUuid3, i);
            if (this.f75025g == null) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            parcel.writeInt(i10);
            ParcelUuid parcelUuid4 = this.f75025g;
            if (parcelUuid4 != null) {
                parcel.writeParcelable(parcelUuid4, i);
            }
        }
        if (this.f75026h == null) {
            i6 = 0;
        } else {
            i6 = 1;
        }
        parcel.writeInt(i6);
        ParcelUuid parcelUuid5 = this.f75026h;
        if (parcelUuid5 != null) {
            parcel.writeParcelable(parcelUuid5, i);
            if (this.f75027i == null) {
                i8 = 0;
            } else {
                i8 = 1;
            }
            parcel.writeInt(i8);
            byte[] bArr = this.f75027i;
            if (bArr != null) {
                parcel.writeInt(bArr.length);
                parcel.writeByteArray(this.f75027i);
                if (this.f75028j == null) {
                    i9 = 0;
                } else {
                    i9 = 1;
                }
                parcel.writeInt(i9);
                byte[] bArr2 = this.f75028j;
                if (bArr2 != null) {
                    parcel.writeInt(bArr2.length);
                    parcel.writeByteArray(this.f75028j);
                }
            }
        }
        parcel.writeInt(this.f75029k);
        if (this.f75030l == null) {
            i7 = 0;
        } else {
            i7 = 1;
        }
        parcel.writeInt(i7);
        byte[] bArr3 = this.f75030l;
        if (bArr3 != null) {
            parcel.writeInt(bArr3.length);
            parcel.writeByteArray(this.f75030l);
            if (this.f75031m != null) {
                i12 = 1;
            }
            parcel.writeInt(i12);
            byte[] bArr4 = this.f75031m;
            if (bArr4 != null) {
                parcel.writeInt(bArr4.length);
                parcel.writeByteArray(this.f75031m);
            }
        }
    }
}

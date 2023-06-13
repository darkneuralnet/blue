package no.nordicsemi.android.ble.data;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import kotlin.UByte;
/* loaded from: classes8.dex */
public class Data implements Parcelable {

    /* renamed from: b */
    public byte[] f100629b;

    /* renamed from: c */
    public static final char[] f100628c = "0123456789ABCDEF".toCharArray();
    public static final Parcelable.Creator<Data> CREATOR = new C26644a();

    /* renamed from: no.nordicsemi.android.ble.data.Data$a */
    /* loaded from: classes8.dex */
    public class C26644a implements Parcelable.Creator<Data> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Data createFromParcel(Parcel parcel) {
            return new Data(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Data[] newArray(int i) {
            return new Data[i];
        }
    }

    public Data() {
        this.f100629b = null;
    }

    /* renamed from: b */
    public static int m22622b(int i) {
        return i & 15;
    }

    /* renamed from: e */
    public static int m22619e(byte b) {
        return b & UByte.MAX_VALUE;
    }

    /* renamed from: g */
    public static int m22618g(byte b, byte b2) {
        return m22619e(b) + (m22619e(b2) << 8);
    }

    /* renamed from: h */
    public static int m22617h(byte b, byte b2, byte b3, byte b4) {
        return m22619e(b) + (m22619e(b2) << 8) + (m22619e(b3) << 16) + (m22619e(b4) << 24);
    }

    /* renamed from: i */
    public static int m22616i(int i, int i2) {
        int i3 = 1 << (i2 - 1);
        return (i & i3) != 0 ? (i3 - (i & (i3 - 1))) * (-1) : i;
    }

    /* renamed from: a */
    public Integer m22623a(int i, int i2) {
        if (m22622b(i) + i2 > m22620d()) {
            return null;
        }
        switch (i) {
            case 17:
                return Integer.valueOf(m22619e(this.f100629b[i2]));
            case 18:
                byte[] bArr = this.f100629b;
                return Integer.valueOf(m22618g(bArr[i2], bArr[i2 + 1]));
            case 19:
                byte[] bArr2 = this.f100629b;
                return Integer.valueOf(m22617h(bArr2[i2], bArr2[i2 + 1], bArr2[i2 + 2], (byte) 0));
            case 20:
                byte[] bArr3 = this.f100629b;
                return Integer.valueOf(m22617h(bArr3[i2], bArr3[i2 + 1], bArr3[i2 + 2], bArr3[i2 + 3]));
            default:
                switch (i) {
                    case 33:
                        return Integer.valueOf(m22616i(m22619e(this.f100629b[i2]), 8));
                    case 34:
                        byte[] bArr4 = this.f100629b;
                        return Integer.valueOf(m22616i(m22618g(bArr4[i2], bArr4[i2 + 1]), 16));
                    case 35:
                        byte[] bArr5 = this.f100629b;
                        return Integer.valueOf(m22616i(m22617h(bArr5[i2], bArr5[i2 + 1], bArr5[i2 + 2], (byte) 0), 24));
                    case 36:
                        byte[] bArr6 = this.f100629b;
                        return Integer.valueOf(m22616i(m22617h(bArr6[i2], bArr6[i2 + 1], bArr6[i2 + 2], bArr6[i2 + 3]), 32));
                    default:
                        switch (i) {
                            case 274:
                                byte[] bArr7 = this.f100629b;
                                return Integer.valueOf(m22618g(bArr7[i2 + 1], bArr7[i2]));
                            case 275:
                                byte[] bArr8 = this.f100629b;
                                return Integer.valueOf(m22617h(bArr8[i2 + 2], bArr8[i2 + 1], bArr8[i2], (byte) 0));
                            case 276:
                                byte[] bArr9 = this.f100629b;
                                return Integer.valueOf(m22617h(bArr9[i2 + 3], bArr9[i2 + 2], bArr9[i2 + 1], bArr9[i2]));
                            default:
                                switch (i) {
                                    case 290:
                                        byte[] bArr10 = this.f100629b;
                                        return Integer.valueOf(m22616i(m22618g(bArr10[i2 + 1], bArr10[i2]), 16));
                                    case 291:
                                        byte[] bArr11 = this.f100629b;
                                        return Integer.valueOf(m22616i(m22617h((byte) 0, bArr11[i2 + 2], bArr11[i2 + 1], bArr11[i2]), 24));
                                    case 292:
                                        byte[] bArr12 = this.f100629b;
                                        return Integer.valueOf(m22616i(m22617h(bArr12[i2 + 3], bArr12[i2 + 2], bArr12[i2 + 1], bArr12[i2]), 32));
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    /* renamed from: c */
    public byte[] m22621c() {
        return this.f100629b;
    }

    /* renamed from: d */
    public int m22620d() {
        byte[] bArr = this.f100629b;
        if (bArr != null) {
            return bArr.length;
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        if (m22620d() == 0) {
            return "";
        }
        char[] cArr = new char[(this.f100629b.length * 3) - 1];
        int i = 0;
        while (true) {
            byte[] bArr = this.f100629b;
            if (i < bArr.length) {
                int i2 = bArr[i] & UByte.MAX_VALUE;
                int i3 = i * 3;
                char[] cArr2 = f100628c;
                cArr[i3] = cArr2[i2 >>> 4];
                cArr[i3 + 1] = cArr2[i2 & 15];
                if (i != bArr.length - 1) {
                    cArr[i3 + 2] = CoreConstants.DASH_CHAR;
                }
                i++;
            } else {
                return "(0x) " + new String(cArr);
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f100629b);
    }

    public Data(byte[] bArr) {
        this.f100629b = bArr;
    }

    public Data(Parcel parcel) {
        this.f100629b = parcel.createByteArray();
    }
}

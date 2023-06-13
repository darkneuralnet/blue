package p000;

import android.os.ParcelUuid;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.UByte;
/* renamed from: Bk5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C31942Bk5 {

    /* renamed from: a */
    public final int f2806a;

    /* renamed from: b */
    public final List<ParcelUuid> f2807b;

    /* renamed from: c */
    public final SparseArray<byte[]> f2808c;

    /* renamed from: d */
    public final Map<ParcelUuid, byte[]> f2809d;

    /* renamed from: e */
    public final int f2810e;

    /* renamed from: f */
    public final String f2811f;

    /* renamed from: g */
    public final byte[] f2812g;

    public C31942Bk5(List<ParcelUuid> list, SparseArray<byte[]> sparseArray, Map<ParcelUuid, byte[]> map, int i, int i2, String str, byte[] bArr) {
        this.f2807b = list;
        this.f2808c = sparseArray;
        this.f2809d = map;
        this.f2811f = str;
        this.f2806a = i;
        this.f2810e = i2;
        this.f2812g = bArr;
    }

    /* renamed from: a */
    public static byte[] m113540a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    /* renamed from: h */
    public static C31942Bk5 m113533h(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int i = 0;
        HashMap hashMap = null;
        String str = null;
        int i2 = -1;
        byte b = -2147483648;
        ArrayList arrayList = null;
        SparseArray sparseArray = null;
        while (i < bArr.length) {
            try {
                int i3 = i + 1;
                int i4 = bArr[i] & UByte.MAX_VALUE;
                if (i4 != 0) {
                    int i5 = i4 - 1;
                    int i6 = i3 + 1;
                    int i7 = bArr[i3] & UByte.MAX_VALUE;
                    int i8 = 16;
                    if (i7 != 22) {
                        if (i7 != 255) {
                            if (i7 != 32 && i7 != 33) {
                                switch (i7) {
                                    case 1:
                                        i2 = bArr[i6] & UByte.MAX_VALUE;
                                        continue;
                                    case 2:
                                    case 3:
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        m113532i(bArr, i6, i5, 2, arrayList);
                                        continue;
                                    case 4:
                                    case 5:
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        m113532i(bArr, i6, i5, 4, arrayList);
                                        continue;
                                    case 6:
                                    case 7:
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        m113532i(bArr, i6, i5, 16, arrayList);
                                        continue;
                                    case 8:
                                    case 9:
                                        str = new String(m113540a(bArr, i6, i5));
                                        continue;
                                    case 10:
                                        b = bArr[i6];
                                        continue;
                                    default:
                                        continue;
                                }
                            }
                        } else {
                            int i9 = ((bArr[i6 + 1] & UByte.MAX_VALUE) << 8) + (255 & bArr[i6]);
                            byte[] m113540a = m113540a(bArr, i6 + 2, i5 - 2);
                            if (sparseArray == null) {
                                sparseArray = new SparseArray();
                            }
                            sparseArray.put(i9, m113540a);
                        }
                        i = i5 + i6;
                    }
                    if (i7 == 32) {
                        i8 = 4;
                    } else if (i7 != 33) {
                        i8 = 2;
                    }
                    ParcelUuid m101943a = C3706IY.m101943a(m113540a(bArr, i6, i8));
                    byte[] m113540a2 = m113540a(bArr, i6 + i8, i5 - i8);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(m101943a, m113540a2);
                    i = i5 + i6;
                } else {
                    return new C31942Bk5(arrayList, sparseArray, hashMap, i2, b, str, bArr);
                }
            } catch (Exception unused) {
                Log.e("ScanRecord", "unable to parse scan record: " + Arrays.toString(bArr));
                return new C31942Bk5(null, null, null, -1, Integer.MIN_VALUE, null, bArr);
            }
        }
        return new C31942Bk5(arrayList, sparseArray, hashMap, i2, b, str, bArr);
    }

    /* renamed from: i */
    public static int m113532i(byte[] bArr, int i, int i2, int i3, List<ParcelUuid> list) {
        while (i2 > 0) {
            list.add(C3706IY.m101943a(m113540a(bArr, i, i3)));
            i2 -= i3;
            i += i3;
        }
        return i;
    }

    /* renamed from: b */
    public byte[] m113539b() {
        return this.f2812g;
    }

    /* renamed from: c */
    public String m113538c() {
        return this.f2811f;
    }

    /* renamed from: d */
    public SparseArray<byte[]> m113537d() {
        return this.f2808c;
    }

    /* renamed from: e */
    public byte[] m113536e(int i) {
        SparseArray<byte[]> sparseArray = this.f2808c;
        if (sparseArray == null) {
            return null;
        }
        return sparseArray.get(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C31942Bk5.class == obj.getClass()) {
            return Arrays.equals(this.f2812g, ((C31942Bk5) obj).f2812g);
        }
        return false;
    }

    /* renamed from: f */
    public byte[] m113535f(ParcelUuid parcelUuid) {
        Map<ParcelUuid, byte[]> map;
        if (parcelUuid != null && (map = this.f2809d) != null) {
            return map.get(parcelUuid);
        }
        return null;
    }

    /* renamed from: g */
    public List<ParcelUuid> m113534g() {
        return this.f2807b;
    }

    public String toString() {
        return "ScanRecord [advertiseFlags=" + this.f2806a + ", serviceUuids=" + this.f2807b + ", manufacturerSpecificData=" + C0632BX.m113905a(this.f2808c) + ", serviceData=" + C0632BX.m113904b(this.f2809d) + ", txPowerLevel=" + this.f2810e + ", deviceName=" + this.f2811f + "]";
    }
}

package p000;

import android.os.ParcelUuid;
import android.util.Log;
import android.util.SparseArray;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.common.util.VisibleForTesting;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.UByte;
/* renamed from: Rv8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35788Rv8 {

    /* renamed from: h */
    public static final ParcelUuid f32903h = ParcelUuid.fromString("00000000-0000-1000-8000-00805F9B34FB");

    /* renamed from: a */
    public final int f32904a;

    /* renamed from: b */
    public final List<ParcelUuid> f32905b;

    /* renamed from: c */
    public final SparseArray<byte[]> f32906c;

    /* renamed from: d */
    public final Map<ParcelUuid, byte[]> f32907d;

    /* renamed from: e */
    public final int f32908e;

    /* renamed from: f */
    public final String f32909f;

    /* renamed from: g */
    public final byte[] f32910g;

    public C35788Rv8(List<ParcelUuid> list, SparseArray<byte[]> sparseArray, Map<ParcelUuid, byte[]> map, int i, int i2, String str, byte[] bArr) {
        this.f32905b = list;
        this.f32906c = sparseArray;
        this.f32907d = map;
        this.f32909f = str;
        this.f32904a = i;
        this.f32908e = i2;
        this.f32910g = bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    @VisibleForTesting
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C35788Rv8 m86196a(byte[] bArr) {
        String str;
        ArrayList arrayList;
        if (bArr == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        HashMap hashMap = new HashMap();
        int i = 0;
        String str2 = null;
        byte b = -2147483648;
        int i2 = -1;
        while (i < bArr.length) {
            try {
                int i3 = i + 1;
                int i4 = bArr[i] & UByte.MAX_VALUE;
                if (i4 != 0) {
                    int i5 = i4 - 1;
                    int i6 = i3 + 1;
                    int i7 = bArr[i3] & UByte.MAX_VALUE;
                    if (i7 != 22) {
                        if (i7 != 255) {
                            switch (i7) {
                                case 1:
                                    i2 = bArr[i6] & UByte.MAX_VALUE;
                                    continue;
                                case 2:
                                case 3:
                                    m86195b(bArr, i6, i5, 2, arrayList2);
                                    continue;
                                case 4:
                                case 5:
                                    m86195b(bArr, i6, i5, 4, arrayList2);
                                    continue;
                                case 6:
                                case 7:
                                    m86195b(bArr, i6, i5, 16, arrayList2);
                                    continue;
                                case 8:
                                case 9:
                                    str2 = new String(m86194c(bArr, i6, i5));
                                    continue;
                                case 10:
                                    b = bArr[i6];
                                    continue;
                                default:
                                    continue;
                            }
                        } else {
                            sparseArray.put(((bArr[i6 + 1] & UByte.MAX_VALUE) << 8) + (255 & bArr[i6]), m86194c(bArr, i6 + 2, i5 - 2));
                        }
                    } else {
                        hashMap.put(m86193d(m86194c(bArr, i6, 2)), m86194c(bArr, i6 + 2, i5 - 2));
                    }
                    i = i5 + i6;
                } else {
                    if (true == arrayList2.isEmpty()) {
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    return new C35788Rv8(arrayList, sparseArray, hashMap, i2, b, str2, bArr);
                }
            } catch (Exception e) {
                String valueOf = String.valueOf(Arrays.toString(bArr));
                if (valueOf.length() != 0) {
                    str = "Unable to parse scan record: ".concat(valueOf);
                } else {
                    str = new String("Unable to parse scan record: ");
                }
                Log.w("BleRecord", str, e);
                return null;
            }
        }
        if (true == arrayList2.isEmpty()) {
        }
        return new C35788Rv8(arrayList, sparseArray, hashMap, i2, b, str2, bArr);
    }

    /* renamed from: b */
    public static int m86195b(byte[] bArr, int i, int i2, int i3, List<ParcelUuid> list) {
        while (i2 > 0) {
            list.add(m86193d(m86194c(bArr, i, i3)));
            i2 -= i3;
            i += i3;
        }
        return i;
    }

    /* renamed from: c */
    public static byte[] m86194c(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    /* renamed from: d */
    public static ParcelUuid m86193d(byte[] bArr) {
        long j;
        int length = bArr.length;
        if (length != 2 && length != 4 && length != 16) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("uuidBytes length invalid - ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        } else if (length == 16) {
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            return new ParcelUuid(new UUID(order.getLong(8), order.getLong(0)));
        } else {
            if (length == 2) {
                j = (bArr[0] & UByte.MAX_VALUE) + ((bArr[1] & UByte.MAX_VALUE) << 8);
            } else {
                j = ((bArr[3] & UByte.MAX_VALUE) << 24) + (bArr[0] & UByte.MAX_VALUE) + ((bArr[1] & UByte.MAX_VALUE) << 8) + ((bArr[2] & UByte.MAX_VALUE) << 16);
            }
            ParcelUuid parcelUuid = f32903h;
            return new ParcelUuid(new UUID(parcelUuid.getUuid().getMostSignificantBits() + (j << 32), parcelUuid.getUuid().getLeastSignificantBits()));
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C35788Rv8)) {
            return false;
        }
        return Arrays.equals(this.f32910g, ((C35788Rv8) obj).f32910g);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f32910g);
    }

    public final String toString() {
        String sb;
        String bytesToStringUppercase;
        String bytesToStringUppercase2;
        int i = this.f32904a;
        String valueOf = String.valueOf(this.f32905b);
        SparseArray<byte[]> sparseArray = this.f32906c;
        StringBuilder sb2 = new StringBuilder();
        String str = "{}";
        int i2 = 0;
        if (sparseArray.size() <= 0) {
            sb = "{}";
        } else {
            sb2.append(CoreConstants.CURLY_LEFT);
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                if (i3 > 0) {
                    sb2.append(", ");
                }
                int keyAt = sparseArray.keyAt(i3);
                byte[] valueAt = sparseArray.valueAt(i3);
                sb2.append(keyAt);
                sb2.append('=');
                if (valueAt == null) {
                    bytesToStringUppercase = null;
                } else {
                    bytesToStringUppercase = Hex.bytesToStringUppercase(valueAt);
                }
                sb2.append(bytesToStringUppercase);
            }
            sb2.append(CoreConstants.CURLY_RIGHT);
            sb = sb2.toString();
        }
        Map<ParcelUuid, byte[]> map = this.f32907d;
        StringBuilder sb3 = new StringBuilder();
        if (map.keySet().size() > 0) {
            sb3.append(CoreConstants.CURLY_LEFT);
            for (Map.Entry<ParcelUuid, byte[]> entry : map.entrySet()) {
                if (i2 > 0) {
                    sb3.append(", ");
                }
                sb3.append(entry.getKey());
                sb3.append('=');
                byte[] value = entry.getValue();
                if (value == null) {
                    bytesToStringUppercase2 = null;
                } else {
                    bytesToStringUppercase2 = Hex.bytesToStringUppercase(value);
                }
                sb3.append(bytesToStringUppercase2);
                i2++;
            }
            sb3.append(CoreConstants.CURLY_RIGHT);
            str = sb3.toString();
        }
        int i4 = this.f32908e;
        String str2 = this.f32909f;
        int length = valueOf.length();
        StringBuilder sb4 = new StringBuilder(length + 139 + String.valueOf(sb).length() + String.valueOf(str).length() + String.valueOf(str2).length());
        sb4.append("BleRecord [mAdvertiseFlags=");
        sb4.append(i);
        sb4.append(", mServiceUuids=");
        sb4.append(valueOf);
        sb4.append(", mManufacturerSpecificData=");
        sb4.append(sb);
        sb4.append(", mServiceData=");
        sb4.append(str);
        sb4.append(", mTxPowerLevel=");
        sb4.append(i4);
        sb4.append(", mDeviceName=");
        sb4.append(str2);
        sb4.append("]");
        return sb4.toString();
    }
}

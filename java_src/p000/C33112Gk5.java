package p000;

import android.os.ParcelUuid;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import kotlin.UByte;
/* renamed from: Gk5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C33112Gk5 {

    /* renamed from: a */
    public static final UUID f12354a = UUID.fromString("00000000-0000-1000-8000-00805F9B34FB");

    /* renamed from: f */
    public static ParcelUuid m104809f(byte[] bArr) {
        long j;
        if (bArr != null) {
            int length = bArr.length;
            if (length != 2 && length != 4 && length != 16) {
                throw new IllegalArgumentException("uuidBytes length invalid - " + length);
            } else if (length == 16) {
                ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                return new ParcelUuid(new UUID(order.getLong(8), order.getLong(0)));
            } else {
                if (length == 2) {
                    j = (bArr[0] & UByte.MAX_VALUE) + ((bArr[1] & UByte.MAX_VALUE) << 8);
                } else {
                    j = ((bArr[3] & UByte.MAX_VALUE) << 24) + (bArr[0] & UByte.MAX_VALUE) + ((bArr[1] & UByte.MAX_VALUE) << 8) + ((bArr[2] & UByte.MAX_VALUE) << 16);
                }
                UUID uuid = f12354a;
                return new ParcelUuid(new UUID(uuid.getMostSignificantBits() + (j << 32), uuid.getLeastSignificantBits()));
            }
        }
        throw new IllegalArgumentException("uuidBytes cannot be null");
    }

    /* renamed from: a */
    public final byte[] m104814a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    /* renamed from: b */
    public List<UUID> m104813b(byte[] bArr) {
        List<ParcelUuid> mo106629c = m104812c(bArr).mo106629c();
        if (mo106629c == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (ParcelUuid parcelUuid : mo106629c) {
            arrayList.add(parcelUuid.getUuid());
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fe  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InterfaceC32176Ck5 m104812c(byte[] bArr) {
        ArrayList arrayList;
        int i;
        int i2;
        if (bArr == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        HashMap hashMap = new HashMap();
        String str = null;
        int i3 = -1;
        byte b = -2147483648;
        int i4 = 0;
        while (i4 < bArr.length) {
            try {
                int i5 = i4 + 1;
                int i6 = bArr[i4] & UByte.MAX_VALUE;
                if (i6 != 0) {
                    int i7 = i6 - 1;
                    int i8 = i5 + 1;
                    int i9 = bArr[i5] & UByte.MAX_VALUE;
                    if (i9 != 255) {
                        switch (i9) {
                            case 1:
                                i = i8;
                                i3 = bArr[i] & UByte.MAX_VALUE;
                                continue;
                            case 2:
                            case 3:
                                i = i8;
                                m104810e(bArr, i, i7, 2, arrayList2);
                                continue;
                            case 4:
                            case 5:
                                i = i8;
                                m104810e(bArr, i, i7, 4, arrayList2);
                                continue;
                            case 6:
                            case 7:
                                i = i8;
                                m104810e(bArr, i, i7, 16, arrayList2);
                                continue;
                            case 8:
                            case 9:
                                i = i8;
                                str = new String(m104814a(bArr, i, i7));
                                continue;
                            case 10:
                                i = i8;
                                b = bArr[i];
                                continue;
                            default:
                                switch (i9) {
                                    case 20:
                                        i = i8;
                                        m104811d(bArr, i, i7, 2, arrayList3);
                                        break;
                                    case 21:
                                        i = i8;
                                        m104811d(bArr, i, i7, 16, arrayList3);
                                        break;
                                    default:
                                        switch (i9) {
                                            case 31:
                                                i = i8;
                                                m104811d(bArr, i8, i7, 4, arrayList3);
                                                break;
                                            case 32:
                                            case 33:
                                                break;
                                            default:
                                                i = i8;
                                                continue;
                                        }
                                    case 22:
                                        i = i8;
                                        if (i9 == 32) {
                                            i2 = 4;
                                        } else if (i9 == 33) {
                                            i2 = 16;
                                        } else {
                                            i2 = 2;
                                        }
                                        hashMap.put(m104809f(m104814a(bArr, i, i2)), m104814a(bArr, i + i2, i7 - i2));
                                        break;
                                }
                        }
                    } else {
                        i = i8;
                        sparseArray.put(((bArr[i + 1] & UByte.MAX_VALUE) << 8) + (bArr[i] & UByte.MAX_VALUE), m104814a(bArr, i + 2, i7 - 2));
                    }
                    i4 = i + i7;
                } else {
                    if (!arrayList2.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = arrayList2;
                    }
                    return new C32410Dk5(arrayList, arrayList3, sparseArray, hashMap, i3, b, str, bArr);
                }
            } catch (Exception e) {
                C52323ye5.m3124e(e, "Unable to parse scan record: %s", C35098Ox2.m91175a(bArr));
                return new C32410Dk5(null, null, null, null, -1, Integer.MIN_VALUE, null, bArr);
            }
        }
        if (!arrayList2.isEmpty()) {
        }
        return new C32410Dk5(arrayList, arrayList3, sparseArray, hashMap, i3, b, str, bArr);
    }

    /* renamed from: d */
    public final int m104811d(byte[] bArr, int i, int i2, int i3, List<ParcelUuid> list) {
        while (i2 > 0) {
            list.add(m104809f(m104814a(bArr, i, i3)));
            i2 -= i3;
            i += i3;
        }
        return i;
    }

    /* renamed from: e */
    public final int m104810e(byte[] bArr, int i, int i2, int i3, List<ParcelUuid> list) {
        while (i2 > 0) {
            list.add(m104809f(m104814a(bArr, i, i3)));
            i2 -= i3;
            i += i3;
        }
        return i;
    }
}

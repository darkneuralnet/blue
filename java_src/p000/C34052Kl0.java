package p000;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.Map;
/* renamed from: Kl0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34052Kl0 extends AbstractC52944zh3 {

    /* renamed from: a */
    public static final int[][] f20177a = {new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, new int[]{1, 2, 2, 2, 3, 1}, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};

    /* renamed from: g */
    public static int m98319g(C1027CT c1027ct, int[] iArr, int i) throws NotFoundException {
        AbstractC52944zh3.m540e(c1027ct, i, iArr);
        float f = 0.25f;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int[][] iArr2 = f20177a;
            if (i3 >= iArr2.length) {
                break;
            }
            float m541d = AbstractC52944zh3.m541d(iArr, iArr2[i3], 0.7f);
            if (m541d < f) {
                i2 = i3;
                f = m541d;
            }
            i3++;
        }
        if (i2 >= 0) {
            return i2;
        }
        throw NotFoundException.m45943a();
    }

    /* renamed from: h */
    public static int[] m98318h(C1027CT c1027ct) throws NotFoundException {
        int m112213o = c1027ct.m112213o();
        int m112215m = c1027ct.m112215m(0);
        int[] iArr = new int[6];
        boolean z = false;
        int i = 0;
        int i2 = m112215m;
        while (m112215m < m112213o) {
            if (c1027ct.m112217k(m112215m) != z) {
                iArr[i] = iArr[i] + 1;
            } else {
                if (i == 5) {
                    int i3 = -1;
                    float f = 0.25f;
                    for (int i4 = 103; i4 <= 105; i4++) {
                        float m541d = AbstractC52944zh3.m541d(iArr, f20177a[i4], 0.7f);
                        if (m541d < f) {
                            i3 = i4;
                            f = m541d;
                        }
                    }
                    if (i3 >= 0 && c1027ct.m112211q(Math.max(0, i2 - ((m112215m - i2) / 2)), i2, false)) {
                        return new int[]{i2, m112215m, i3};
                    }
                    i2 += iArr[0] + iArr[1];
                    int i5 = i - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i5);
                    iArr[i5] = 0;
                    iArr[i] = 0;
                    i--;
                } else {
                    i++;
                }
                iArr[i] = 1;
                z = !z;
            }
            m112215m++;
        }
        throw NotFoundException.m45943a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e2, code lost:
        if (r9 != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x012a, code lost:
        if (r9 != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x012c, code lost:
        r3 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0131 A[PHI: r17 
      PHI: (r17v10 boolean) = (r17v6 boolean), (r17v16 boolean) binds: [B:67:0x010a, B:43:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013d A[PHI: r16 r17 
      PHI: (r16v4 boolean) = (r16v1 boolean), (r16v1 boolean), (r16v1 boolean), (r16v1 boolean), (r16v3 boolean), (r16v1 boolean), (r16v1 boolean), (r16v1 boolean), (r16v1 boolean) binds: [B:67:0x010a, B:69:0x010e, B:73:0x011a, B:72:0x0116, B:85:0x013b, B:43:0x00c2, B:45:0x00c7, B:49:0x00d4, B:48:0x00cf] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r17v9 boolean) = (r17v6 boolean), (r17v6 boolean), (r17v6 boolean), (r17v6 boolean), (r17v8 boolean), (r17v16 boolean), (r17v16 boolean), (r17v16 boolean), (r17v16 boolean) binds: [B:67:0x010a, B:69:0x010e, B:73:0x011a, B:72:0x0116, B:85:0x013b, B:43:0x00c2, B:45:0x00c7, B:49:0x00d4, B:48:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.AbstractC52944zh3
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C38511bN4 mo543b(int i, C1027CT c1027ct, Map<EnumC47491qV0, ?> map) throws NotFoundException, FormatException, ChecksumException {
        boolean z;
        char c;
        char c2;
        boolean z2;
        boolean z3 = false;
        if (map != null && map.containsKey(EnumC47491qV0.ASSUME_GS1)) {
            z = true;
        } else {
            z = false;
        }
        int[] m98318h = m98318h(c1027ct);
        int i2 = m98318h[2];
        ArrayList arrayList = new ArrayList(20);
        arrayList.add(Byte.valueOf((byte) i2));
        switch (i2) {
            case 103:
                c = 'e';
                break;
            case 104:
                c = 'd';
                break;
            case 105:
                c = 'c';
                break;
            default:
                throw FormatException.m45945a();
        }
        StringBuilder sb = new StringBuilder(20);
        int i3 = 6;
        int[] iArr = new int[6];
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z7 = true;
        char c3 = c;
        int i7 = m98318h[0];
        int i8 = m98318h[1];
        char c4 = c3;
        while (!z5) {
            int m98319g = m98319g(c1027ct, iArr, i8);
            arrayList.add(Byte.valueOf((byte) m98319g));
            if (m98319g != 106) {
                z7 = true;
            }
            if (m98319g != 106) {
                i5++;
                i2 += i5 * m98319g;
            }
            int i9 = i8;
            for (int i10 = 0; i10 < i3; i10++) {
                i9 += iArr[i10];
            }
            switch (m98319g) {
                case 103:
                case 104:
                case 105:
                    throw FormatException.m45945a();
                default:
                    switch (c4) {
                        case 'c':
                            c2 = 'd';
                            if (m98319g < 100) {
                                if (m98319g < 10) {
                                    sb.append('0');
                                }
                                sb.append(m98319g);
                            } else {
                                if (m98319g != 106) {
                                    z7 = false;
                                }
                                if (m98319g != 106) {
                                    switch (m98319g) {
                                        case 100:
                                            c4 = 'd';
                                            break;
                                        case 101:
                                            z2 = false;
                                            c4 = 'e';
                                            break;
                                        case 102:
                                            if (z) {
                                                if (sb.length() == 0) {
                                                    sb.append("]C1");
                                                    break;
                                                } else {
                                                    sb.append((char) 29);
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                } else {
                                    z2 = false;
                                    z5 = true;
                                    break;
                                }
                            }
                            z2 = false;
                            break;
                        case 'd':
                            if (m98319g < 96) {
                                if (z4 == z3) {
                                    sb.append((char) (m98319g + 32));
                                } else {
                                    sb.append((char) (m98319g + 32 + 128));
                                }
                                z2 = false;
                                z4 = false;
                                c2 = 'd';
                                break;
                            } else {
                                if (m98319g != 106) {
                                    z7 = false;
                                }
                                if (m98319g != 106) {
                                    switch (m98319g) {
                                        case 96:
                                        case 97:
                                        default:
                                            z2 = false;
                                            c2 = 'd';
                                            break;
                                        case 98:
                                            z2 = true;
                                            c2 = 'd';
                                            c4 = 'e';
                                            break;
                                        case 99:
                                            z2 = false;
                                            c2 = 'd';
                                            c4 = 'c';
                                            break;
                                        case 100:
                                            if (z3 || !z4) {
                                                if (z3) {
                                                }
                                                z2 = false;
                                                z4 = true;
                                                c2 = 'd';
                                                break;
                                            }
                                            z3 = true;
                                            z2 = false;
                                            z4 = false;
                                            c2 = 'd';
                                            break;
                                        case 101:
                                            z2 = false;
                                            c2 = 'd';
                                            c4 = 'e';
                                            break;
                                        case 102:
                                            if (z) {
                                                if (sb.length() == 0) {
                                                    sb.append("]C1");
                                                } else {
                                                    sb.append((char) 29);
                                                }
                                            }
                                            z2 = false;
                                            c2 = 'd';
                                            break;
                                    }
                                }
                                z5 = true;
                                z2 = false;
                                c2 = 'd';
                            }
                            break;
                        case 'e':
                            if (m98319g < 64) {
                                if (z4 == z3) {
                                    sb.append((char) (m98319g + 32));
                                } else {
                                    sb.append((char) (m98319g + 32 + 128));
                                }
                            } else if (m98319g < 96) {
                                if (z4 == z3) {
                                    sb.append((char) (m98319g - 64));
                                } else {
                                    sb.append((char) (m98319g + 64));
                                }
                            } else {
                                if (m98319g != 106) {
                                    z7 = false;
                                }
                                if (m98319g != 106) {
                                    switch (m98319g) {
                                        case 98:
                                            z2 = true;
                                            c2 = 'd';
                                            c4 = 'd';
                                            break;
                                        case 100:
                                            z2 = false;
                                            c2 = 'd';
                                            c4 = 'd';
                                            break;
                                        case 101:
                                            if (z3 || !z4) {
                                                if (z3) {
                                                }
                                                z2 = false;
                                                z4 = true;
                                                c2 = 'd';
                                                break;
                                            }
                                            z3 = true;
                                            break;
                                        case 102:
                                            if (z) {
                                                if (sb.length() == 0) {
                                                    sb.append("]C1");
                                                } else {
                                                    sb.append((char) 29);
                                                }
                                            }
                                            z2 = false;
                                            c2 = 'd';
                                            break;
                                    }
                                }
                                z5 = true;
                                z2 = false;
                                c2 = 'd';
                            }
                            z2 = false;
                            z4 = false;
                            c2 = 'd';
                            break;
                        default:
                            c2 = 'd';
                            z2 = false;
                            break;
                    }
                    if (z6) {
                        if (c4 == 'e') {
                            c4 = c2;
                        } else {
                            c4 = 'e';
                        }
                    }
                    z6 = z2;
                    i3 = 6;
                    i7 = i8;
                    i8 = i9;
                    i6 = i4;
                    i4 = m98319g;
                    break;
            }
        }
        int i11 = i8 - i7;
        int m112214n = c1027ct.m112214n(i8);
        if (c1027ct.m112211q(m112214n, Math.min(c1027ct.m112213o(), ((m112214n - i7) / 2) + m112214n), false)) {
            int i12 = i6;
            if ((i2 - (i5 * i12)) % 103 == i12) {
                int length = sb.length();
                if (length != 0) {
                    if (length > 0 && z7) {
                        if (c4 == 'c') {
                            sb.delete(length - 2, length);
                        } else {
                            sb.delete(length - 1, length);
                        }
                    }
                    float f = (m98318h[1] + m98318h[0]) / 2.0f;
                    float f2 = i7 + (i11 / 2.0f);
                    int size = arrayList.size();
                    byte[] bArr = new byte[size];
                    for (int i13 = 0; i13 < size; i13++) {
                        bArr[i13] = ((Byte) arrayList.get(i13)).byteValue();
                    }
                    float f3 = i;
                    return new C38511bN4(sb.toString(), bArr, new C40900fN4[]{new C40900fN4(f, f3), new C40900fN4(f2, f3)}, EnumC7009Qx.CODE_128);
                }
                throw NotFoundException.m45943a();
            }
            throw ChecksumException.m45946a();
        }
        throw NotFoundException.m45943a();
    }
}

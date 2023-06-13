package p000;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;
/* renamed from: zh3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC52944zh3 implements InterfaceC36918Wr4 {
    /* renamed from: d */
    public static float m541d(int[] iArr, int[] iArr2, float f) {
        float f2;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f3 = i;
        float f4 = f3 / i2;
        float f5 = f * f4;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            float f7 = iArr2[i4] * f4;
            float f8 = iArr[i4];
            if (f8 > f7) {
                f2 = f8 - f7;
            } else {
                f2 = f7 - f8;
            }
            if (f2 > f5) {
                return Float.POSITIVE_INFINITY;
            }
            f6 += f2;
        }
        return f6 / f3;
    }

    /* renamed from: e */
    public static void m540e(C1027CT c1027ct, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i2 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int m112213o = c1027ct.m112213o();
        if (i < m112213o) {
            boolean z = !c1027ct.m112217k(i);
            while (i < m112213o) {
                if (c1027ct.m112217k(i) != z) {
                    iArr[i2] = iArr[i2] + 1;
                } else {
                    i2++;
                    if (i2 == length) {
                        break;
                    }
                    iArr[i2] = 1;
                    z = !z;
                }
                i++;
            }
            if (i2 != length) {
                if (i2 != length - 1 || i != m112213o) {
                    throw NotFoundException.m45943a();
                }
                return;
            }
            return;
        }
        throw NotFoundException.m45943a();
    }

    /* renamed from: f */
    public static void m539f(C1027CT c1027ct, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        boolean m112217k = c1027ct.m112217k(i);
        while (i > 0 && length >= 0) {
            i--;
            if (c1027ct.m112217k(i) != m112217k) {
                length--;
                m112217k = !m112217k;
            }
        }
        if (length < 0) {
            m540e(c1027ct, i + 1, iArr);
            return;
        }
        throw NotFoundException.m45943a();
    }

    @Override // p000.InterfaceC36918Wr4
    /* renamed from: a */
    public C38511bN4 mo544a(C7707TG c7707tg, Map<EnumC47491qV0, ?> map) throws NotFoundException, FormatException {
        boolean z;
        try {
            return m542c(c7707tg, map);
        } catch (NotFoundException e) {
            if (map != null && map.containsKey(EnumC47491qV0.TRY_HARDER)) {
                z = true;
            } else {
                z = false;
            }
            if (z && c7707tg.m84118e()) {
                C7707TG m84117f = c7707tg.m84117f();
                C38511bN4 m542c = m542c(m84117f, map);
                Map<EnumC39715dN4, Object> m64619d = m542c.m64619d();
                int i = 270;
                if (m64619d != null) {
                    EnumC39715dN4 enumC39715dN4 = EnumC39715dN4.ORIENTATION;
                    if (m64619d.containsKey(enumC39715dN4)) {
                        i = (((Integer) m64619d.get(enumC39715dN4)).intValue() + 270) % 360;
                    }
                }
                m542c.m64615h(EnumC39715dN4.ORIENTATION, Integer.valueOf(i));
                C40900fN4[] m64618e = m542c.m64618e();
                if (m64618e != null) {
                    int m84120c = m84117f.m84120c();
                    for (int i2 = 0; i2 < m64618e.length; i2++) {
                        m64618e[i2] = new C40900fN4((m84120c - m64618e[i2].m41470d()) - 1.0f, m64618e[i2].m41471c());
                    }
                }
                return m542c;
            }
            throw e;
        }
    }

    /* renamed from: b */
    public abstract C38511bN4 mo543b(int i, C1027CT c1027ct, Map<EnumC47491qV0, ?> map) throws NotFoundException, ChecksumException, FormatException;

    /* JADX WARN: Removed duplicated region for block: B:41:0x007c A[Catch: ReaderException -> 0x00cc, TRY_LEAVE, TryCatch #5 {ReaderException -> 0x00cc, blocks: (B:39:0x0076, B:41:0x007c), top: B:76:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00cb A[SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C38511bN4 m542c(C7707TG c7707tg, Map<EnumC47491qV0, ?> map) throws NotFoundException {
        boolean z;
        int i;
        int i2;
        int i3;
        AbstractC52944zh3 abstractC52944zh3;
        Map<EnumC47491qV0, ?> map2;
        int i4;
        int i5;
        EnumMap enumMap = map;
        int m84119d = c7707tg.m84119d();
        int m84120c = c7707tg.m84120c();
        C1027CT c1027ct = new C1027CT(m84119d);
        int i6 = 0;
        int i7 = 1;
        if (enumMap != null && enumMap.containsKey(EnumC47491qV0.TRY_HARDER)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 8;
        } else {
            i = 5;
        }
        int max = Math.max(1, m84120c >> i);
        if (z) {
            i2 = m84120c;
        } else {
            i2 = 15;
        }
        int i8 = m84120c / 2;
        int i9 = 0;
        while (i9 < i2) {
            int i10 = i9 + 1;
            int i11 = i10 / 2;
            if ((i9 & 1) == 0) {
                i3 = i7;
            } else {
                i3 = i6;
            }
            if (i3 == 0) {
                i11 = -i11;
            }
            int i12 = (i11 * max) + i8;
            if (i12 < 0 || i12 >= m84120c) {
                break;
            }
            try {
                c1027ct = c7707tg.m84121b(i12, c1027ct);
                int i13 = i6;
                while (i13 < 2) {
                    try {
                        if (i13 == i7) {
                            c1027ct.m112209t();
                            if (enumMap != null) {
                                EnumC47491qV0 enumC47491qV0 = EnumC47491qV0.NEED_RESULT_POINT_CALLBACK;
                                if (enumMap.containsKey(enumC47491qV0)) {
                                    EnumMap enumMap2 = new EnumMap(EnumC47491qV0.class);
                                    enumMap2.putAll(enumMap);
                                    enumMap2.remove(enumC47491qV0);
                                    abstractC52944zh3 = this;
                                    enumMap = enumMap2;
                                    C38511bN4 mo543b = abstractC52944zh3.mo543b(i12, c1027ct, enumMap);
                                    if (i13 != i7) {
                                        try {
                                            mo543b.m64615h(EnumC39715dN4.ORIENTATION, 180);
                                            C40900fN4[] m64618e = mo543b.m64618e();
                                            if (m64618e != null) {
                                                map2 = enumMap;
                                                float f = m84119d;
                                                try {
                                                    i4 = m84119d;
                                                } catch (ReaderException unused) {
                                                    i4 = m84119d;
                                                    i5 = 1;
                                                    i13++;
                                                    i7 = i5;
                                                    enumMap = map2;
                                                    m84119d = i4;
                                                    i6 = 0;
                                                }
                                                try {
                                                    m64618e[0] = new C40900fN4((f - m64618e[i6].m41471c()) - 1.0f, m64618e[i6].m41470d());
                                                    i5 = 1;
                                                    try {
                                                        m64618e[1] = new C40900fN4((f - m64618e[1].m41471c()) - 1.0f, m64618e[1].m41470d());
                                                    } catch (ReaderException unused2) {
                                                        continue;
                                                        i13++;
                                                        i7 = i5;
                                                        enumMap = map2;
                                                        m84119d = i4;
                                                        i6 = 0;
                                                    }
                                                } catch (ReaderException unused3) {
                                                    i5 = 1;
                                                    i13++;
                                                    i7 = i5;
                                                    enumMap = map2;
                                                    m84119d = i4;
                                                    i6 = 0;
                                                }
                                            }
                                        } catch (ReaderException unused4) {
                                            map2 = enumMap;
                                        }
                                    }
                                    return mo543b;
                                }
                            }
                        }
                        C38511bN4 mo543b2 = abstractC52944zh3.mo543b(i12, c1027ct, enumMap);
                        if (i13 != i7) {
                        }
                        return mo543b2;
                    } catch (ReaderException unused5) {
                        map2 = enumMap;
                        i4 = m84119d;
                        i5 = i7;
                    }
                    abstractC52944zh3 = this;
                }
                continue;
            } catch (NotFoundException unused6) {
            }
            i9 = i10;
            i7 = i7;
            m84119d = m84119d;
            i6 = 0;
        }
        throw NotFoundException.m45943a();
    }

    @Override // p000.InterfaceC36918Wr4
    public void reset() {
    }
}

package p000;

import java.util.Arrays;
import kotlin.UByte;
/* renamed from: ML7 */
/* loaded from: classes5.dex */
public final class ML7 extends AbstractC50746vy7 {

    /* renamed from: h */
    public static final AbstractC50746vy7 f22994h = new ML7(null, new Object[0], 0);

    /* renamed from: e */
    public final transient Object f22995e;

    /* renamed from: f */
    public final transient Object[] f22996f;

    /* renamed from: g */
    public final transient int f22997g;

    public ML7(Object obj, Object[] objArr, int i) {
        this.f22995e = obj;
        this.f22996f = objArr;
        this.f22997g = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    /* renamed from: h */
    public static ML7 m95424h(int i, Object[] objArr, C36273Tx7 c36273Tx7) {
        int i2;
        short[] sArr;
        char c;
        char c2;
        byte[] bArr;
        byte[] bArr2;
        int i3 = i;
        Object[] objArr2 = objArr;
        if (i3 == 0) {
            return (ML7) f22994h;
        }
        Object obj = null;
        int i4 = 1;
        if (i3 == 1) {
            Object obj2 = objArr2[0];
            obj2.getClass();
            Object obj3 = objArr2[1];
            obj3.getClass();
            C31665Af7.m115391b(obj2, obj3);
            return new ML7(null, objArr2, 1);
        }
        C41211ft8.m40588b(i3, objArr2.length >> 1, "index");
        int max = Math.max(i3, 2);
        if (max < 751619276) {
            i2 = Integer.highestOneBit(max - 1);
            do {
                i2 += i2;
            } while (i2 * 0.7d < max);
        } else {
            i2 = 1073741824;
            if (max >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i3 == 1) {
            Object obj4 = objArr2[0];
            obj4.getClass();
            Object obj5 = objArr2[1];
            obj5.getClass();
            C31665Af7.m115391b(obj4, obj5);
            c = 1;
            c2 = 2;
        } else {
            int i5 = i2 - 1;
            char c3 = 65535;
            if (i2 <= 128) {
                byte[] bArr3 = new byte[i2];
                Arrays.fill(bArr3, (byte) -1);
                int i6 = 0;
                int i7 = 0;
                while (i6 < i3) {
                    int i8 = i6 + i6;
                    int i9 = i7 + i7;
                    Object obj6 = objArr2[i8];
                    obj6.getClass();
                    Object obj7 = objArr2[i8 ^ i4];
                    obj7.getClass();
                    C31665Af7.m115391b(obj6, obj7);
                    int m6276a = C51249wp7.m6276a(obj6.hashCode());
                    while (true) {
                        int i10 = m6276a & i5;
                        int i11 = bArr3[i10] & UByte.MAX_VALUE;
                        if (i11 == 255) {
                            bArr3[i10] = (byte) i9;
                            if (i7 < i6) {
                                objArr2[i9] = obj6;
                                objArr2[i9 ^ 1] = obj7;
                            }
                            i7++;
                        } else if (obj6.equals(objArr2[i11])) {
                            int i12 = i11 ^ 1;
                            Object obj8 = objArr2[i12];
                            obj8.getClass();
                            C35328Pw7 c35328Pw7 = new C35328Pw7(obj6, obj7, obj8);
                            objArr2[i12] = obj7;
                            obj = c35328Pw7;
                            break;
                        } else {
                            m6276a = i10 + 1;
                        }
                    }
                    i6++;
                    i4 = 1;
                }
                if (i7 == i3) {
                    bArr = bArr3;
                } else {
                    bArr2 = new Object[]{bArr3, Integer.valueOf(i7), obj};
                    c2 = 2;
                    c = 1;
                    obj = bArr2;
                }
            } else if (i2 <= 32768) {
                sArr = new short[i2];
                Arrays.fill(sArr, (short) -1);
                int i13 = 0;
                for (int i14 = 0; i14 < i3; i14++) {
                    int i15 = i14 + i14;
                    int i16 = i13 + i13;
                    Object obj9 = objArr2[i15];
                    obj9.getClass();
                    Object obj10 = objArr2[i15 ^ 1];
                    obj10.getClass();
                    C31665Af7.m115391b(obj9, obj10);
                    int m6276a2 = C51249wp7.m6276a(obj9.hashCode());
                    while (true) {
                        int i17 = m6276a2 & i5;
                        char c4 = (char) sArr[i17];
                        if (c4 == 65535) {
                            sArr[i17] = (short) i16;
                            if (i13 < i14) {
                                objArr2[i16] = obj9;
                                objArr2[i16 ^ 1] = obj10;
                            }
                            i13++;
                        } else if (obj9.equals(objArr2[c4])) {
                            int i18 = c4 ^ 1;
                            Object obj11 = objArr2[i18];
                            obj11.getClass();
                            C35328Pw7 c35328Pw72 = new C35328Pw7(obj9, obj10, obj11);
                            objArr2[i18] = obj10;
                            obj = c35328Pw72;
                            break;
                        } else {
                            m6276a2 = i17 + 1;
                        }
                    }
                }
                if (i13 != i3) {
                    c2 = 2;
                    obj = new Object[]{sArr, Integer.valueOf(i13), obj};
                    c = 1;
                }
                bArr = sArr;
            } else {
                int i19 = 1;
                sArr = new int[i2];
                Arrays.fill((int[]) sArr, -1);
                int i20 = 0;
                int i21 = 0;
                while (i20 < i3) {
                    int i22 = i20 + i20;
                    int i23 = i21 + i21;
                    Object obj12 = objArr2[i22];
                    obj12.getClass();
                    Object obj13 = objArr2[i22 ^ i19];
                    obj13.getClass();
                    C31665Af7.m115391b(obj12, obj13);
                    int m6276a3 = C51249wp7.m6276a(obj12.hashCode());
                    while (true) {
                        int i24 = m6276a3 & i5;
                        ?? r15 = sArr[i24];
                        if (r15 == c3) {
                            sArr[i24] = i23;
                            if (i21 < i20) {
                                objArr2[i23] = obj12;
                                objArr2[i23 ^ 1] = obj13;
                            }
                            i21++;
                        } else if (obj12.equals(objArr2[r15])) {
                            int i25 = r15 ^ 1;
                            Object obj14 = objArr2[i25];
                            obj14.getClass();
                            C35328Pw7 c35328Pw73 = new C35328Pw7(obj12, obj13, obj14);
                            objArr2[i25] = obj13;
                            obj = c35328Pw73;
                            break;
                        } else {
                            m6276a3 = i24 + 1;
                            c3 = 65535;
                        }
                    }
                    i20++;
                    i19 = 1;
                    c3 = 65535;
                }
                if (i21 != i3) {
                    c = 1;
                    c2 = 2;
                    obj = new Object[]{sArr, Integer.valueOf(i21), obj};
                }
                bArr = sArr;
            }
            c2 = 2;
            bArr2 = bArr;
            c = 1;
            obj = bArr2;
        }
        if (obj instanceof Object[]) {
            Object[] objArr3 = (Object[]) obj;
            C35328Pw7 c35328Pw74 = (C35328Pw7) objArr3[c2];
            if (c36273Tx7 != null) {
                c36273Tx7.f36503c = c35328Pw74;
                Object obj15 = objArr3[0];
                int intValue = ((Integer) objArr3[c]).intValue();
                objArr2 = Arrays.copyOf(objArr2, intValue + intValue);
                obj = obj15;
                i3 = intValue;
            } else {
                throw c35328Pw74.m89292a();
            }
        }
        return new ML7(obj, objArr2, i3);
    }

    @Override // p000.AbstractC50746vy7
    /* renamed from: a */
    public final AbstractC45944ns7 mo7629a() {
        return new KL7(this.f22996f, 1, this.f22997g);
    }

    @Override // p000.AbstractC50746vy7
    /* renamed from: e */
    public final AbstractC51942xz7 mo7625e() {
        return new RK7(this, this.f22996f, 0, this.f22997g);
    }

    @Override // p000.AbstractC50746vy7
    /* renamed from: f */
    public final AbstractC51942xz7 mo7624f() {
        return new C42071hL7(this, new KL7(this.f22996f, 0, this.f22997g));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f A[RETURN] */
    @Override // p000.AbstractC50746vy7, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        Object obj3 = this.f22995e;
        Object[] objArr = this.f22996f;
        int i = this.f22997g;
        if (obj != null) {
            if (i == 1) {
                Object obj4 = objArr[0];
                obj4.getClass();
                if (obj4.equals(obj)) {
                    obj2 = objArr[1];
                    obj2.getClass();
                }
            } else if (obj3 != null) {
                if (obj3 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj3;
                    int length = bArr.length - 1;
                    int m6276a = C51249wp7.m6276a(obj.hashCode());
                    while (true) {
                        int i2 = m6276a & length;
                        int i3 = bArr[i2] & UByte.MAX_VALUE;
                        if (i3 == 255) {
                            break;
                        } else if (obj.equals(objArr[i3])) {
                            obj2 = objArr[i3 ^ 1];
                            break;
                        } else {
                            m6276a = i2 + 1;
                        }
                    }
                } else if (obj3 instanceof short[]) {
                    short[] sArr = (short[]) obj3;
                    int length2 = sArr.length - 1;
                    int m6276a2 = C51249wp7.m6276a(obj.hashCode());
                    while (true) {
                        int i4 = m6276a2 & length2;
                        char c = (char) sArr[i4];
                        if (c == 65535) {
                            break;
                        } else if (obj.equals(objArr[c])) {
                            obj2 = objArr[c ^ 1];
                            break;
                        } else {
                            m6276a2 = i4 + 1;
                        }
                    }
                } else {
                    int[] iArr = (int[]) obj3;
                    int length3 = iArr.length - 1;
                    int m6276a3 = C51249wp7.m6276a(obj.hashCode());
                    while (true) {
                        int i5 = m6276a3 & length3;
                        int i6 = iArr[i5];
                        if (i6 == -1) {
                            break;
                        } else if (obj.equals(objArr[i6])) {
                            obj2 = objArr[i6 ^ 1];
                            break;
                        } else {
                            m6276a3 = i5 + 1;
                        }
                    }
                }
            }
            if (obj2 != null) {
                return null;
            }
            return obj2;
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.f22997g;
    }
}

package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
/* renamed from: RQ8 */
/* loaded from: classes6.dex */
public abstract class RQ8<E> extends XO8<E> implements Set<E> {

    /* renamed from: c */
    public transient ZP8<E> f32023c;

    /* renamed from: o */
    public static int m86762o(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        } else if (max < 1073741824) {
            return 1073741824;
        } else {
            throw new IllegalArgumentException("collection too large");
        }
    }

    /* renamed from: v */
    public static <E> RQ8<E> m86760v(Collection<? extends E> collection) {
        Object[] array = collection.toArray();
        return m86758y(array.length, array);
    }

    /* renamed from: w */
    public static <E> RQ8<E> m86759w() {
        return SS8.f33759j;
    }

    /* renamed from: y */
    public static <E> RQ8<E> m86758y(int i, Object... objArr) {
        if (i != 0) {
            if (i != 1) {
                int m86762o = m86762o(i);
                Object[] objArr2 = new Object[m86762o];
                int i2 = m86762o - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object obj = objArr[i5];
                    C50426vR8.m8641a(obj, i5);
                    int hashCode = obj.hashCode();
                    int m17542a = C47436qO8.m17542a(hashCode);
                    while (true) {
                        int i6 = m17542a & i2;
                        Object obj2 = objArr2[i6];
                        if (obj2 == null) {
                            objArr[i4] = obj;
                            objArr2[i6] = obj;
                            i3 += hashCode;
                            i4++;
                            break;
                        } else if (obj2.equals(obj)) {
                            break;
                        } else {
                            m17542a++;
                        }
                    }
                }
                Arrays.fill(objArr, i4, i, (Object) null);
                if (i4 == 1) {
                    Object obj3 = objArr[0];
                    obj3.getClass();
                    return new C46295oT8(obj3, i3);
                } else if (m86762o(i4) < m86762o / 2) {
                    return m86758y(i4, objArr);
                } else {
                    int length = objArr.length;
                    if (i4 < (length >> 1) + (length >> 2)) {
                        objArr = Arrays.copyOf(objArr, i4);
                    }
                    return new SS8(objArr, i3, objArr2, i2, i4);
                }
            }
            Object obj4 = objArr[0];
            obj4.getClass();
            return new C46295oT8(obj4);
        }
        return SS8.f33759j;
    }

    @Override // p000.XO8
    /* renamed from: e */
    public ZP8<E> mo25571e() {
        ZP8<E> zp8 = this.f32023c;
        if (zp8 == null) {
            ZP8<E> mo21020s = mo21020s();
            this.f32023c = mo21020s;
            return mo21020s;
        }
        return zp8;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof RQ8) && mo21019x() && ((RQ8) obj).mo21019x() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // p000.XO8, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: f */
    public abstract AbstractC38578bU8<E> iterator();

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return C39773dT8.m44223a(this);
    }

    /* renamed from: s */
    public ZP8<E> mo21020s() {
        return ZP8.m73201v(toArray());
    }

    /* renamed from: x */
    public boolean mo21019x() {
        return false;
    }
}

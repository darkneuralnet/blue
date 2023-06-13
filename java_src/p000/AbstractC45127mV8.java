package p000;

import java.util.Arrays;
import java.util.Set;
/* renamed from: mV8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC45127mV8 extends AbstractC37976aT8 implements Set {

    /* renamed from: c */
    public transient AbstractC50453vU8 f98121c;

    /* renamed from: h */
    public static int m25483h(int i) {
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

    /* renamed from: u */
    public static AbstractC45127mV8 m25479u() {
        return C39809dX8.f76751j;
    }

    /* renamed from: w */
    public static AbstractC45127mV8 m25477w(int i, Object... objArr) {
        if (i != 0) {
            if (i != 1) {
                int m25483h = m25483h(i);
                Object[] objArr2 = new Object[m25483h];
                int i2 = m25483h - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object obj = objArr[i5];
                    IV8.m101967a(obj, i5);
                    int hashCode = obj.hashCode();
                    int m12307a = C49250tS8.m12307a(hashCode);
                    while (true) {
                        int i6 = m12307a & i2;
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
                            m12307a++;
                        }
                    }
                }
                Arrays.fill(objArr, i4, i, (Object) null);
                if (i4 == 1) {
                    Object obj3 = objArr[0];
                    obj3.getClass();
                    return new C51666xX8(obj3);
                } else if (m25483h(i4) < m25483h / 2) {
                    return m25477w(i4, objArr);
                } else {
                    int length = objArr.length;
                    if (i4 < (length >> 1) + (length >> 2)) {
                        objArr = Arrays.copyOf(objArr, i4);
                    }
                    return new C39809dX8(objArr, i3, objArr2, i2, i4);
                }
            }
            Object obj4 = objArr[0];
            obj4.getClass();
            return new C51666xX8(obj4);
        }
        return C39809dX8.f76751j;
    }

    @Override // p000.AbstractC37976aT8, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public abstract HX8 iterator();

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC45127mV8) && mo25478v() && ((AbstractC45127mV8) obj).mo25478v() && hashCode() != obj.hashCode()) {
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

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return C45738nX8.m23556a(this);
    }

    /* renamed from: j */
    public final AbstractC50453vU8 m25482j() {
        AbstractC50453vU8 abstractC50453vU8 = this.f98121c;
        if (abstractC50453vU8 == null) {
            AbstractC50453vU8 mo25481o = mo25481o();
            this.f98121c = mo25481o;
            return mo25481o;
        }
        return abstractC50453vU8;
    }

    /* renamed from: o */
    public AbstractC50453vU8 mo25481o() {
        return AbstractC50453vU8.m8607j(toArray());
    }

    /* renamed from: v */
    public boolean mo25478v() {
        return false;
    }
}

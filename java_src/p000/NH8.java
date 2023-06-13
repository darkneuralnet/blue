package p000;

import java.util.Arrays;
import java.util.Set;
/* renamed from: NH8 */
/* loaded from: classes5.dex */
public abstract class NH8 extends ZF8 implements Set {

    /* renamed from: c */
    public transient CH8 f24408c;

    /* renamed from: h */
    public static int m94085h(int i) {
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

    @SafeVarargs
    /* renamed from: s */
    public static NH8 m94082s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[15];
        objArr2[0] = "_in";
        objArr2[1] = "_xa";
        objArr2[2] = "_xu";
        objArr2[3] = "_aq";
        objArr2[4] = "_aa";
        objArr2[5] = "_ai";
        System.arraycopy(objArr, 0, objArr2, 6, 9);
        return m94080v(15, objArr2);
    }

    /* renamed from: v */
    public static NH8 m94080v(int i, Object... objArr) {
        if (i != 0) {
            if (i != 1) {
                int m94085h = m94085h(i);
                Object[] objArr2 = new Object[m94085h];
                int i2 = m94085h - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object obj = objArr[i5];
                    C44417lI8.m27433a(obj, i5);
                    int hashCode = obj.hashCode();
                    int m19694a = C46762pF8.m19694a(hashCode);
                    while (true) {
                        int i6 = m19694a & i2;
                        Object obj2 = objArr2[i6];
                        if (obj2 == null) {
                            objArr[i4] = obj;
                            objArr2[i6] = obj;
                            i3 += hashCode;
                            i4++;
                            break;
                        } else if (!obj2.equals(obj)) {
                            m19694a++;
                        }
                    }
                }
                Arrays.fill(objArr, i4, i, (Object) null);
                if (i4 == 1) {
                    Object obj3 = objArr[0];
                    obj3.getClass();
                    return new VI8(obj3);
                }
                if (m94085h(i4) < m94085h / 2) {
                    return m94080v(i4, objArr);
                }
                if (i4 < 10) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new JI8(objArr, i3, objArr2, i2, i4);
            }
            Object obj4 = objArr[0];
            obj4.getClass();
            return new VI8(obj4);
        }
        return JI8.f17333j;
    }

    @Override // p000.ZF8, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* renamed from: e */
    public abstract AbstractC42054hJ8 iterator();

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof NH8) && mo94081u() && ((NH8) obj).mo94081u() && hashCode() != obj.hashCode()) {
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
        int i;
        int i2 = 0;
        for (Object obj : this) {
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }

    /* renamed from: j */
    public final CH8 m94084j() {
        CH8 ch8 = this.f24408c;
        if (ch8 == null) {
            CH8 mo94083o = mo94083o();
            this.f24408c = mo94083o;
            return mo94083o;
        }
        return ch8;
    }

    /* renamed from: o */
    public CH8 mo94083o() {
        Object[] array = toArray();
        AbstractC49169tJ8 abstractC49169tJ8 = CH8.f3890c;
        return CH8.m112390j(array, array.length);
    }

    /* renamed from: u */
    public boolean mo94081u() {
        return false;
    }
}

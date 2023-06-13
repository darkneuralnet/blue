package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: LS7 */
/* loaded from: classes5.dex */
public final class LS7 extends AbstractC36507Ux7<Integer> implements RandomAccess {

    /* renamed from: e */
    public static final LS7 f21446e;

    /* renamed from: c */
    public int[] f21447c;

    /* renamed from: d */
    public int f21448d;

    static {
        LS7 ls7 = new LS7();
        f21446e = ls7;
        ls7.zzv();
    }

    public LS7() {
        this(new int[10], 0);
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        m96914f(i, ((Integer) obj).intValue());
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        m80580a();
        C37975aT7.m71332a(collection);
        if (collection instanceof LS7) {
            LS7 ls7 = (LS7) collection;
            int i = ls7.f21448d;
            if (i == 0) {
                return false;
            }
            int i2 = this.f21448d;
            if (Integer.MAX_VALUE - i2 >= i) {
                int i3 = i2 + i;
                int[] iArr = this.f21447c;
                if (i3 > iArr.length) {
                    this.f21447c = Arrays.copyOf(iArr, i3);
                }
                System.arraycopy(ls7.f21447c, 0, this.f21447c, this.f21448d, ls7.f21448d);
                this.f21448d = i3;
                ((AbstractList) this).modCount++;
                return true;
            }
            throw new OutOfMemoryError();
        }
        return super.addAll(collection);
    }

    /* renamed from: b */
    public final void m96917b(int i) {
        m96914f(this.f21448d, i);
    }

    /* renamed from: c */
    public final void m96916c(int i) {
        if (i < 0 || i >= this.f21448d) {
            throw new IndexOutOfBoundsException(m96915e(i));
        }
    }

    /* renamed from: e */
    public final String m96915e(int i) {
        int i2 = this.f21448d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LS7) {
            LS7 ls7 = (LS7) obj;
            if (this.f21448d != ls7.f21448d) {
                return false;
            }
            int[] iArr = ls7.f21447c;
            for (int i = 0; i < this.f21448d; i++) {
                if (this.f21447c[i] != iArr[i]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    /* renamed from: f */
    public final void m96914f(int i, int i2) {
        int i3;
        m80580a();
        if (i < 0 || i > (i3 = this.f21448d)) {
            throw new IndexOutOfBoundsException(m96915e(i));
        }
        int[] iArr = this.f21447c;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f21447c, i, iArr2, i + 1, this.f21448d - i);
            this.f21447c = iArr2;
        }
        this.f21447c[i] = i2;
        this.f21448d++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(getInt(i));
    }

    public final int getInt(int i) {
        m96916c(i);
        return this.f21447c[i];
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f21448d; i2++) {
            i = (i * 31) + this.f21447c[i2];
        }
        return i;
    }

    @Override // p000.InterfaceC47489qU7
    /* renamed from: n */
    public final /* synthetic */ InterfaceC47489qU7 mo1502n(int i) {
        if (i >= this.f21448d) {
            return new LS7(Arrays.copyOf(this.f21447c, i), this.f21448d);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        m80580a();
        m96916c(i);
        int[] iArr = this.f21447c;
        int i2 = iArr[i];
        int i3 = this.f21448d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, i3 - i);
        }
        this.f21448d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m80580a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f21447c;
        System.arraycopy(iArr, i2, iArr, i, this.f21448d - i2);
        this.f21448d -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        m80580a();
        m96916c(i);
        int[] iArr = this.f21447c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21448d;
    }

    public LS7(int[] iArr, int i) {
        this.f21447c = iArr;
        this.f21448d = i;
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m80580a();
        for (int i = 0; i < this.f21448d; i++) {
            if (obj.equals(Integer.valueOf(this.f21447c[i]))) {
                int[] iArr = this.f21447c;
                System.arraycopy(iArr, i + 1, iArr, i, this.f21448d - i);
                this.f21448d--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}

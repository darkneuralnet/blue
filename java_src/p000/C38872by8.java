package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: by8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C38872by8 extends AbstractC41834gw8<Boolean> implements IS8, RandomAccess {

    /* renamed from: e */
    public static final C38872by8 f59840e;

    /* renamed from: c */
    public boolean[] f59841c;

    /* renamed from: d */
    public int f59842d;

    static {
        C38872by8 c38872by8 = new C38872by8(new boolean[0], 0);
        f59840e = c38872by8;
        c38872by8.zzb();
    }

    public C38872by8() {
        this(new boolean[10], 0);
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m37302a();
        if (i >= 0 && i <= (i2 = this.f59842d)) {
            boolean[] zArr = this.f59841c;
            if (i2 < zArr.length) {
                System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
            } else {
                boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i);
                System.arraycopy(this.f59841c, i, zArr2, i + 1, this.f59842d - i);
                this.f59841c = zArr2;
            }
            this.f59841c[i] = booleanValue;
            this.f59842d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m62060e(i));
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        m37302a();
        C52124yI8.m3691d(collection);
        if (!(collection instanceof C38872by8)) {
            return super.addAll(collection);
        }
        C38872by8 c38872by8 = (C38872by8) collection;
        int i = c38872by8.f59842d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f59842d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f59841c;
            if (i3 > zArr.length) {
                this.f59841c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(c38872by8.f59841c, 0, this.f59841c, this.f59842d, c38872by8.f59842d);
            this.f59842d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m62062b(boolean z) {
        m37302a();
        int i = this.f59842d;
        boolean[] zArr = this.f59841c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f59841c = zArr2;
        }
        boolean[] zArr3 = this.f59841c;
        int i2 = this.f59842d;
        this.f59842d = i2 + 1;
        zArr3[i2] = z;
    }

    /* renamed from: c */
    public final void m62061c(int i) {
        if (i >= 0 && i < this.f59842d) {
            return;
        }
        throw new IndexOutOfBoundsException(m62060e(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final String m62060e(int i) {
        int i2 = this.f59842d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38872by8)) {
            return super.equals(obj);
        }
        C38872by8 c38872by8 = (C38872by8) obj;
        if (this.f59842d != c38872by8.f59842d) {
            return false;
        }
        boolean[] zArr = c38872by8.f59841c;
        for (int i = 0; i < this.f59842d; i++) {
            if (this.f59841c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m62061c(i);
        return Boolean.valueOf(this.f59841c[i]);
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f59842d; i2++) {
            i = (i * 31) + C52124yI8.m3692c(this.f59841c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f59841c[i] == booleanValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        m37302a();
        m62061c(i);
        boolean[] zArr = this.f59841c;
        boolean z = zArr[i];
        if (i < this.f59842d - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f59842d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m37302a();
        if (i2 >= i) {
            boolean[] zArr = this.f59841c;
            System.arraycopy(zArr, i2, zArr, i, this.f59842d - i2);
            this.f59842d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m37302a();
        m62061c(i);
        boolean[] zArr = this.f59841c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f59842d;
    }

    @Override // p000.RJ8
    public final /* synthetic */ RJ8 zza(int i) {
        if (i >= this.f59842d) {
            return new C38872by8(Arrays.copyOf(this.f59841c, i), this.f59842d);
        }
        throw new IllegalArgumentException();
    }

    public C38872by8(boolean[] zArr, int i) {
        this.f59841c = zArr;
        this.f59842d = i;
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m62062b(((Boolean) obj).booleanValue());
        return true;
    }
}

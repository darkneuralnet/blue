package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* renamed from: pi9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47032pi9 extends S39 implements RandomAccess {

    /* renamed from: e */
    public static final C47032pi9 f103972e;

    /* renamed from: c */
    public Object[] f103973c;

    /* renamed from: d */
    public int f103974d;

    static {
        C47032pi9 c47032pi9 = new C47032pi9(new Object[0], 0);
        f103972e = c47032pi9;
        c47032pi9.zzb();
    }

    public C47032pi9() {
        this(new Object[10], 0);
    }

    /* renamed from: b */
    public static C47032pi9 m18902b() {
        return f103972e;
    }

    @Override // p000.S39, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m86050a();
        if (i >= 0 && i <= (i2 = this.f103974d)) {
            Object[] objArr = this.f103973c;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f103973c, i, objArr2, i + 1, this.f103974d - i);
                this.f103973c = objArr2;
            }
            this.f103973c[i] = obj;
            this.f103974d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m18901c(i));
    }

    /* renamed from: c */
    public final String m18901c(int i) {
        int i2 = this.f103974d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // p000.InterfaceC39857dc9
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ InterfaceC39857dc9 mo1843d(int i) {
        if (i >= this.f103974d) {
            return new C47032pi9(Arrays.copyOf(this.f103973c, i), this.f103974d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final void m18900e(int i) {
        if (i < 0 || i >= this.f103974d) {
            throw new IndexOutOfBoundsException(m18901c(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m18900e(i);
        return this.f103973c[i];
    }

    @Override // p000.S39, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        m86050a();
        m18900e(i);
        Object[] objArr = this.f103973c;
        Object obj = objArr[i];
        if (i < this.f103974d - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f103974d--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // p000.S39, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m86050a();
        m18900e(i);
        Object[] objArr = this.f103973c;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f103974d;
    }

    public C47032pi9(Object[] objArr, int i) {
        this.f103973c = objArr;
        this.f103974d = i;
    }

    @Override // p000.S39, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m86050a();
        int i = this.f103974d;
        Object[] objArr = this.f103973c;
        if (i == objArr.length) {
            this.f103973c = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f103973c;
        int i2 = this.f103974d;
        this.f103974d = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}

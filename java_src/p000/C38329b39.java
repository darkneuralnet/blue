package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* renamed from: b39  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38329b39 extends AbstractC39081cK8 implements RandomAccess {

    /* renamed from: e */
    public static final C38329b39 f56844e = new C38329b39(new Object[0], 0, false);

    /* renamed from: c */
    public Object[] f56845c;

    /* renamed from: d */
    public int f56846d;

    public C38329b39() {
        this(new Object[10], 0, true);
    }

    /* renamed from: b */
    public static C38329b39 m65048b() {
        return f56844e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m61580a();
        if (i >= 0 && i <= (i2 = this.f56846d)) {
            Object[] objArr = this.f56845c;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f56845c, i, objArr2, i + 1, this.f56846d - i);
                this.f56845c = objArr2;
            }
            this.f56845c[i] = obj;
            this.f56846d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m65047c(i));
    }

    /* renamed from: c */
    public final String m65047c(int i) {
        int i2 = this.f56846d;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // p000.NV8
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ NV8 mo21037d(int i) {
        if (i >= this.f56846d) {
            return new C38329b39(Arrays.copyOf(this.f56845c, i), this.f56846d, true);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final void m65046e(int i) {
        if (i < 0 || i >= this.f56846d) {
            throw new IndexOutOfBoundsException(m65047c(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m65046e(i);
        return this.f56845c[i];
    }

    @Override // p000.AbstractC39081cK8, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        m61580a();
        m65046e(i);
        Object[] objArr = this.f56845c;
        Object obj = objArr[i];
        if (i < this.f56846d - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f56846d--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m61580a();
        m65046e(i);
        Object[] objArr = this.f56845c;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f56846d;
    }

    public C38329b39(Object[] objArr, int i, boolean z) {
        super(z);
        this.f56845c = objArr;
        this.f56846d = i;
    }

    @Override // p000.AbstractC39081cK8, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m61580a();
        int i = this.f56846d;
        Object[] objArr = this.f56845c;
        if (i == objArr.length) {
            this.f56845c = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f56845c;
        int i2 = this.f56846d;
        this.f56846d = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}

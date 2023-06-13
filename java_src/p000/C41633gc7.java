package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* renamed from: gc7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41633gc7 extends AbstractC41613ga7 implements RandomAccess {

    /* renamed from: e */
    public static final C41633gc7 f83947e = new C41633gc7(new Object[0], 0, false);

    /* renamed from: c */
    public Object[] f83948c;

    /* renamed from: d */
    public int f83949d;

    public C41633gc7() {
        this(new Object[10], 0, true);
    }

    /* renamed from: b */
    public static C41633gc7 m37975b() {
        return f83947e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m39112a();
        if (i >= 0 && i <= (i2 = this.f83949d)) {
            Object[] objArr = this.f83948c;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f83948c, i, objArr2, i + 1, this.f83949d - i);
                this.f83948c = objArr2;
            }
            this.f83948c[i] = obj;
            this.f83949d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m37974c(i));
    }

    /* renamed from: c */
    public final String m37974c(int i) {
        int i2 = this.f83949d;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: e */
    public final void m37973e(int i) {
        if (i < 0 || i >= this.f83949d) {
            throw new IndexOutOfBoundsException(m37974c(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m37973e(i);
        return this.f83948c[i];
    }

    @Override // p000.InterfaceC46367ob7
    /* renamed from: r0 */
    public final /* bridge */ /* synthetic */ InterfaceC46367ob7 mo1043r0(int i) {
        if (i >= this.f83949d) {
            return new C41633gc7(Arrays.copyOf(this.f83948c, i), this.f83949d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC41613ga7, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        m39112a();
        m37973e(i);
        Object[] objArr = this.f83948c;
        Object obj = objArr[i];
        if (i < this.f83949d - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f83949d--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m39112a();
        m37973e(i);
        Object[] objArr = this.f83948c;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f83949d;
    }

    public C41633gc7(Object[] objArr, int i, boolean z) {
        super(z);
        this.f83948c = objArr;
        this.f83949d = i;
    }

    @Override // p000.AbstractC41613ga7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m39112a();
        int i = this.f83949d;
        Object[] objArr = this.f83948c;
        if (i == objArr.length) {
            this.f83948c = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f83948c;
        int i2 = this.f83949d;
        this.f83949d = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}

package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* renamed from: Gl8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33124Gl8 extends AbstractC40966fU7 implements RandomAccess {

    /* renamed from: e */
    public static final C33124Gl8 f12392e = new C33124Gl8(new Object[0], 0, false);

    /* renamed from: c */
    public Object[] f12393c;

    /* renamed from: d */
    public int f12394d;

    public C33124Gl8() {
        this(new Object[10], 0, true);
    }

    /* renamed from: b */
    public static C33124Gl8 m104781b() {
        return f12392e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m41291a();
        if (i >= 0 && i <= (i2 = this.f12394d)) {
            Object[] objArr = this.f12393c;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f12393c, i, objArr2, i + 1, this.f12394d - i);
                this.f12393c = objArr2;
            }
            this.f12393c[i] = obj;
            this.f12394d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m104780c(i));
    }

    /* renamed from: c */
    public final String m104780c(int i) {
        int i2 = this.f12394d;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // p000.InterfaceC47544qa8
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ InterfaceC47544qa8 mo17376d(int i) {
        if (i >= this.f12394d) {
            return new C33124Gl8(Arrays.copyOf(this.f12393c, i), this.f12394d, true);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final void m104779e(int i) {
        if (i < 0 || i >= this.f12394d) {
            throw new IndexOutOfBoundsException(m104780c(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m104779e(i);
        return this.f12393c[i];
    }

    @Override // p000.AbstractC40966fU7, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        m41291a();
        m104779e(i);
        Object[] objArr = this.f12393c;
        Object obj = objArr[i];
        if (i < this.f12394d - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f12394d--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m41291a();
        m104779e(i);
        Object[] objArr = this.f12393c;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12394d;
    }

    public C33124Gl8(Object[] objArr, int i, boolean z) {
        super(z);
        this.f12393c = objArr;
        this.f12394d = i;
    }

    @Override // p000.AbstractC40966fU7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m41291a();
        int i = this.f12394d;
        Object[] objArr = this.f12393c;
        if (i == objArr.length) {
            this.f12393c = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f12393c;
        int i2 = this.f12394d;
        this.f12394d = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}

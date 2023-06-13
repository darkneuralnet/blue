package p000;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: F48 */
/* loaded from: classes5.dex */
public final class F48 extends AbstractC40966fU7 implements RandomAccess, InterfaceC50263v98, InterfaceC41131fl8 {

    /* renamed from: e */
    public static final F48 f8655e = new F48(new float[0], 0, false);

    /* renamed from: c */
    public float[] f8656c;

    /* renamed from: d */
    public int f8657d;

    public F48() {
        this(new float[10], 0, true);
    }

    /* renamed from: b */
    public static F48 m107812b() {
        return f8655e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        m41291a();
        if (i >= 0 && i <= (i2 = this.f8657d)) {
            float[] fArr = this.f8656c;
            if (i2 < fArr.length) {
                System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
            } else {
                float[] fArr2 = new float[((i2 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i);
                System.arraycopy(this.f8656c, i, fArr2, i + 1, this.f8657d - i);
                this.f8656c = fArr2;
            }
            this.f8656c[i] = floatValue;
            this.f8657d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m107811c(i));
    }

    @Override // p000.AbstractC40966fU7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m41291a();
        Charset charset = C32791Fa8.f9736a;
        collection.getClass();
        if (!(collection instanceof F48)) {
            return super.addAll(collection);
        }
        F48 f48 = (F48) collection;
        int i = f48.f8657d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f8657d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f8656c;
            if (i3 > fArr.length) {
                this.f8656c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(f48.f8656c, 0, this.f8656c, this.f8657d, f48.f8657d);
            this.f8657d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final String m107811c(int i) {
        int i2 = this.f8657d;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void m107810e(int i) {
        if (i < 0 || i >= this.f8657d) {
            throw new IndexOutOfBoundsException(m107811c(i));
        }
    }

    @Override // p000.AbstractC40966fU7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F48)) {
            return super.equals(obj);
        }
        F48 f48 = (F48) obj;
        if (this.f8657d != f48.f8657d) {
            return false;
        }
        float[] fArr = f48.f8656c;
        for (int i = 0; i < this.f8657d; i++) {
            if (Float.floatToIntBits(this.f8656c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m107810e(i);
        return Float.valueOf(this.f8656c[i]);
    }

    @Override // p000.AbstractC40966fU7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f8657d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f8656c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f8657d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f8656c[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC40966fU7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m41291a();
        m107810e(i);
        float[] fArr = this.f8656c;
        float f = fArr[i];
        if (i < this.f8657d - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f8657d--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m41291a();
        if (i2 >= i) {
            float[] fArr = this.f8656c;
            System.arraycopy(fArr, i2, fArr, i, this.f8657d - i2);
            this.f8657d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        m41291a();
        m107810e(i);
        float[] fArr = this.f8656c;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8657d;
    }

    @Override // p000.InterfaceC50263v98
    /* renamed from: u0 */
    public final void mo9066u0(float f) {
        m41291a();
        int i = this.f8657d;
        float[] fArr = this.f8656c;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f8656c = fArr2;
        }
        float[] fArr3 = this.f8656c;
        int i2 = this.f8657d;
        this.f8657d = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // p000.InterfaceC47544qa8
    /* renamed from: zzf */
    public final InterfaceC50263v98 mo17376d(int i) {
        if (i >= this.f8657d) {
            return new F48(Arrays.copyOf(this.f8656c, i), this.f8657d, true);
        }
        throw new IllegalArgumentException();
    }

    public F48(float[] fArr, int i, boolean z) {
        super(z);
        this.f8656c = fArr;
        this.f8657d = i;
    }

    @Override // p000.AbstractC40966fU7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo9066u0(((Float) obj).floatValue());
        return true;
    }
}

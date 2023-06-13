package p000;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: Xa7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37002Xa7 extends AbstractC41613ga7 implements RandomAccess, InterfaceC43995kb7, InterfaceC40447ec7 {

    /* renamed from: e */
    public static final C37002Xa7 f43433e = new C37002Xa7(new float[0], 0, false);

    /* renamed from: c */
    public float[] f43434c;

    /* renamed from: d */
    public int f43435d;

    public C37002Xa7() {
        this(new float[10], 0, true);
    }

    /* renamed from: b */
    public static C37002Xa7 m76842b() {
        return f43433e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        m39112a();
        if (i >= 0 && i <= (i2 = this.f43435d)) {
            float[] fArr = this.f43434c;
            if (i2 < fArr.length) {
                System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
            } else {
                float[] fArr2 = new float[((i2 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i);
                System.arraycopy(this.f43434c, i, fArr2, i + 1, this.f43435d - i);
                this.f43434c = fArr2;
            }
            this.f43434c[i] = floatValue;
            this.f43435d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m76840e(i));
    }

    @Override // p000.AbstractC41613ga7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m39112a();
        Charset charset = C46960pb7.f103839a;
        collection.getClass();
        if (!(collection instanceof C37002Xa7)) {
            return super.addAll(collection);
        }
        C37002Xa7 c37002Xa7 = (C37002Xa7) collection;
        int i = c37002Xa7.f43435d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f43435d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f43434c;
            if (i3 > fArr.length) {
                this.f43434c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(c37002Xa7.f43434c, 0, this.f43434c, this.f43435d, c37002Xa7.f43435d);
            this.f43435d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void m76841c(float f) {
        m39112a();
        int i = this.f43435d;
        float[] fArr = this.f43434c;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f43434c = fArr2;
        }
        float[] fArr3 = this.f43434c;
        int i2 = this.f43435d;
        this.f43435d = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final String m76840e(int i) {
        int i2 = this.f43435d;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // p000.AbstractC41613ga7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37002Xa7)) {
            return super.equals(obj);
        }
        C37002Xa7 c37002Xa7 = (C37002Xa7) obj;
        if (this.f43435d != c37002Xa7.f43435d) {
            return false;
        }
        float[] fArr = c37002Xa7.f43434c;
        for (int i = 0; i < this.f43435d; i++) {
            if (Float.floatToIntBits(this.f43434c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m76839f(int i) {
        if (i < 0 || i >= this.f43435d) {
            throw new IndexOutOfBoundsException(m76840e(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m76839f(i);
        return Float.valueOf(this.f43434c[i]);
    }

    @Override // p000.AbstractC41613ga7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f43435d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f43434c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f43435d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f43434c[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.InterfaceC46367ob7
    /* renamed from: r0 */
    public final /* bridge */ /* synthetic */ InterfaceC46367ob7 mo1043r0(int i) {
        if (i >= this.f43435d) {
            return new C37002Xa7(Arrays.copyOf(this.f43434c, i), this.f43435d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC41613ga7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m39112a();
        m76839f(i);
        float[] fArr = this.f43434c;
        float f = fArr[i];
        if (i < this.f43435d - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f43435d--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m39112a();
        if (i2 >= i) {
            float[] fArr = this.f43434c;
            System.arraycopy(fArr, i2, fArr, i, this.f43435d - i2);
            this.f43435d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        m39112a();
        m76839f(i);
        float[] fArr = this.f43434c;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f43435d;
    }

    public C37002Xa7(float[] fArr, int i, boolean z) {
        super(z);
        this.f43434c = fArr;
        this.f43435d = i;
    }

    @Override // p000.AbstractC41613ga7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m76841c(((Float) obj).floatValue());
        return true;
    }
}

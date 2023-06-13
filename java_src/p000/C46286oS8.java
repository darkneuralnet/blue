package p000;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: oS8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46286oS8 extends AbstractC39081cK8 implements RandomAccess, I29 {

    /* renamed from: e */
    public static final C46286oS8 f102032e = new C46286oS8(new float[0], 0, false);

    /* renamed from: c */
    public float[] f102033c;

    /* renamed from: d */
    public int f102034d;

    public C46286oS8() {
        this(new float[10], 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        m61580a();
        if (i >= 0 && i <= (i2 = this.f102034d)) {
            float[] fArr = this.f102033c;
            if (i2 < fArr.length) {
                System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
            } else {
                float[] fArr2 = new float[((i2 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i);
                System.arraycopy(this.f102033c, i, fArr2, i + 1, this.f102034d - i);
                this.f102033c = fArr2;
            }
            this.f102033c[i] = floatValue;
            this.f102034d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m21038c(i));
    }

    @Override // p000.AbstractC39081cK8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m61580a();
        Charset charset = XV8.f43341a;
        collection.getClass();
        if (!(collection instanceof C46286oS8)) {
            return super.addAll(collection);
        }
        C46286oS8 c46286oS8 = (C46286oS8) collection;
        int i = c46286oS8.f102034d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f102034d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f102033c;
            if (i3 > fArr.length) {
                this.f102033c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(c46286oS8.f102033c, 0, this.f102033c, this.f102034d, c46286oS8.f102034d);
            this.f102034d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m21039b(float f) {
        m61580a();
        int i = this.f102034d;
        float[] fArr = this.f102033c;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f102033c = fArr2;
        }
        float[] fArr3 = this.f102033c;
        int i2 = this.f102034d;
        this.f102034d = i2 + 1;
        fArr3[i2] = f;
    }

    /* renamed from: c */
    public final String m21038c(int i) {
        int i2 = this.f102034d;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.NV8
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ NV8 mo21037d(int i) {
        if (i >= this.f102034d) {
            return new C46286oS8(Arrays.copyOf(this.f102033c, i), this.f102034d, true);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final void m21036e(int i) {
        if (i < 0 || i >= this.f102034d) {
            throw new IndexOutOfBoundsException(m21038c(i));
        }
    }

    @Override // p000.AbstractC39081cK8, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46286oS8)) {
            return super.equals(obj);
        }
        C46286oS8 c46286oS8 = (C46286oS8) obj;
        if (this.f102034d != c46286oS8.f102034d) {
            return false;
        }
        float[] fArr = c46286oS8.f102033c;
        for (int i = 0; i < this.f102034d; i++) {
            if (Float.floatToIntBits(this.f102033c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m21036e(i);
        return Float.valueOf(this.f102033c[i]);
    }

    @Override // p000.AbstractC39081cK8, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f102034d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f102033c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f102034d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f102033c[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC39081cK8, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m61580a();
        m21036e(i);
        float[] fArr = this.f102033c;
        float f = fArr[i];
        if (i < this.f102034d - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f102034d--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m61580a();
        if (i2 >= i) {
            float[] fArr = this.f102033c;
            System.arraycopy(fArr, i2, fArr, i, this.f102034d - i2);
            this.f102034d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        m61580a();
        m21036e(i);
        float[] fArr = this.f102033c;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f102034d;
    }

    public C46286oS8(float[] fArr, int i, boolean z) {
        super(z);
        this.f102033c = fArr;
        this.f102034d = i;
    }

    @Override // p000.AbstractC39081cK8, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m21039b(((Float) obj).floatValue());
        return true;
    }
}

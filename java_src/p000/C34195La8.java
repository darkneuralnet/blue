package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: La8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34195La8 extends C28<Float> implements RandomAccess, InterfaceC51803xl8 {

    /* renamed from: e */
    public static final C34195La8 f21726e;

    /* renamed from: c */
    public float[] f21727c;

    /* renamed from: d */
    public int f21728d;

    static {
        C34195La8 c34195La8 = new C34195La8(new float[0], 0);
        f21726e = c34195La8;
        c34195La8.zzb();
    }

    public C34195La8() {
        this(new float[10], 0);
    }

    @Override // p000.C28, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        m112947a();
        if (i >= 0 && i <= (i2 = this.f21728d)) {
            float[] fArr = this.f21727c;
            if (i2 < fArr.length) {
                System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
            } else {
                float[] fArr2 = new float[((i2 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i);
                System.arraycopy(this.f21727c, i, fArr2, i + 1, this.f21728d - i);
                this.f21727c = fArr2;
            }
            this.f21727c[i] = floatValue;
            this.f21728d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m96613c(i));
    }

    @Override // p000.C28, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        m112947a();
        C41051fd8.m41090e(collection);
        if (!(collection instanceof C34195La8)) {
            return super.addAll(collection);
        }
        C34195La8 c34195La8 = (C34195La8) collection;
        int i = c34195La8.f21728d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f21728d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f21727c;
            if (i3 > fArr.length) {
                this.f21727c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(c34195La8.f21727c, 0, this.f21727c, this.f21728d, c34195La8.f21728d);
            this.f21728d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m96614b(float f) {
        m112947a();
        int i = this.f21728d;
        float[] fArr = this.f21727c;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f21727c = fArr2;
        }
        float[] fArr3 = this.f21727c;
        int i2 = this.f21728d;
        this.f21728d = i2 + 1;
        fArr3[i2] = f;
    }

    /* renamed from: c */
    public final String m96613c(int i) {
        int i2 = this.f21728d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.InterfaceC35383Qc8
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ InterfaceC35383Qc8 mo41068d(int i) {
        if (i >= this.f21728d) {
            return new C34195La8(Arrays.copyOf(this.f21727c, i), this.f21728d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final void m96612e(int i) {
        if (i >= 0 && i < this.f21728d) {
            return;
        }
        throw new IndexOutOfBoundsException(m96613c(i));
    }

    @Override // p000.C28, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34195La8)) {
            return super.equals(obj);
        }
        C34195La8 c34195La8 = (C34195La8) obj;
        if (this.f21728d != c34195La8.f21728d) {
            return false;
        }
        float[] fArr = c34195La8.f21727c;
        for (int i = 0; i < this.f21728d; i++) {
            if (Float.floatToIntBits(this.f21727c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        m96612e(i);
        return Float.valueOf(this.f21727c[i]);
    }

    @Override // p000.C28, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f21728d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f21727c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f21728d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f21727c[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.C28, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m112947a();
        m96612e(i);
        float[] fArr = this.f21727c;
        float f = fArr[i];
        if (i < this.f21728d - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f21728d--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m112947a();
        if (i2 >= i) {
            float[] fArr = this.f21727c;
            System.arraycopy(fArr, i2, fArr, i, this.f21728d - i2);
            this.f21728d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // p000.C28, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        m112947a();
        m96612e(i);
        float[] fArr = this.f21727c;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21728d;
    }

    public C34195La8(float[] fArr, int i) {
        this.f21727c = fArr;
        this.f21728d = i;
    }

    @Override // p000.C28, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m96614b(((Float) obj).floatValue());
        return true;
    }
}

package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: ra9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48138ra9 extends S39 implements RandomAccess, Zh9 {

    /* renamed from: e */
    public static final C48138ra9 f107300e;

    /* renamed from: c */
    public float[] f107301c;

    /* renamed from: d */
    public int f107302d;

    static {
        C48138ra9 c48138ra9 = new C48138ra9(new float[0], 0);
        f107300e = c48138ra9;
        c48138ra9.zzb();
    }

    public C48138ra9() {
        this(new float[10], 0);
    }

    @Override // p000.S39, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        m86050a();
        if (i >= 0 && i <= (i2 = this.f107302d)) {
            float[] fArr = this.f107301c;
            if (i2 < fArr.length) {
                System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
            } else {
                float[] fArr2 = new float[((i2 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i);
                System.arraycopy(this.f107301c, i, fArr2, i + 1, this.f107302d - i);
                this.f107301c = fArr2;
            }
            this.f107301c[i] = floatValue;
            this.f107302d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m15731c(i));
    }

    @Override // p000.S39, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m86050a();
        C44007kc9.m28735e(collection);
        if (!(collection instanceof C48138ra9)) {
            return super.addAll(collection);
        }
        C48138ra9 c48138ra9 = (C48138ra9) collection;
        int i = c48138ra9.f107302d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f107302d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f107301c;
            if (i3 > fArr.length) {
                this.f107301c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(c48138ra9.f107301c, 0, this.f107301c, this.f107302d, c48138ra9.f107302d);
            this.f107302d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m15732b(float f) {
        m86050a();
        int i = this.f107302d;
        float[] fArr = this.f107301c;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f107301c = fArr2;
        }
        float[] fArr3 = this.f107301c;
        int i2 = this.f107302d;
        this.f107302d = i2 + 1;
        fArr3[i2] = f;
    }

    /* renamed from: c */
    public final String m15731c(int i) {
        int i2 = this.f107302d;
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

    @Override // p000.InterfaceC39857dc9
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ InterfaceC39857dc9 mo1843d(int i) {
        if (i >= this.f107302d) {
            return new C48138ra9(Arrays.copyOf(this.f107301c, i), this.f107302d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final void m15730e(int i) {
        if (i < 0 || i >= this.f107302d) {
            throw new IndexOutOfBoundsException(m15731c(i));
        }
    }

    @Override // p000.S39, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48138ra9)) {
            return super.equals(obj);
        }
        C48138ra9 c48138ra9 = (C48138ra9) obj;
        if (this.f107302d != c48138ra9.f107302d) {
            return false;
        }
        float[] fArr = c48138ra9.f107301c;
        for (int i = 0; i < this.f107302d; i++) {
            if (Float.floatToIntBits(this.f107301c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m15730e(i);
        return Float.valueOf(this.f107301c[i]);
    }

    @Override // p000.S39, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f107302d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f107301c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f107302d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f107301c[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.S39, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m86050a();
        m15730e(i);
        float[] fArr = this.f107301c;
        float f = fArr[i];
        if (i < this.f107302d - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f107302d--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m86050a();
        if (i2 >= i) {
            float[] fArr = this.f107301c;
            System.arraycopy(fArr, i2, fArr, i, this.f107302d - i2);
            this.f107302d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // p000.S39, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        m86050a();
        m15730e(i);
        float[] fArr = this.f107301c;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f107302d;
    }

    public C48138ra9(float[] fArr, int i) {
        this.f107301c = fArr;
        this.f107302d = i;
    }

    @Override // p000.S39, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m15732b(((Float) obj).floatValue());
        return true;
    }
}

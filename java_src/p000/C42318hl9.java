package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: hl9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C42318hl9 extends AbstractC44037kf9<Float> implements RandomAccess, InterfaceC44147kq9 {

    /* renamed from: e */
    public static final C42318hl9 f85859e;

    /* renamed from: c */
    public float[] f85860c;

    /* renamed from: d */
    public int f85861d;

    static {
        C42318hl9 c42318hl9 = new C42318hl9(new float[0], 0);
        f85859e = c42318hl9;
        c42318hl9.zzb();
    }

    public C42318hl9() {
        this(new float[10], 0);
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        m28655a();
        if (i >= 0 && i <= (i2 = this.f85861d)) {
            float[] fArr = this.f85860c;
            if (i2 < fArr.length) {
                System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
            } else {
                float[] fArr2 = new float[((i2 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i);
                System.arraycopy(this.f85860c, i, fArr2, i + 1, this.f85861d - i);
                this.f85860c = fArr2;
            }
            this.f85860c[i] = floatValue;
            this.f85861d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m35884c(i));
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        m28655a();
        Fn9.m106450e(collection);
        if (!(collection instanceof C42318hl9)) {
            return super.addAll(collection);
        }
        C42318hl9 c42318hl9 = (C42318hl9) collection;
        int i = c42318hl9.f85861d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f85861d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f85860c;
            if (i3 > fArr.length) {
                this.f85860c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(c42318hl9.f85860c, 0, this.f85860c, this.f85861d, c42318hl9.f85861d);
            this.f85861d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m35885b(float f) {
        m28655a();
        int i = this.f85861d;
        float[] fArr = this.f85860c;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f85860c = fArr2;
        }
        float[] fArr3 = this.f85860c;
        int i2 = this.f85861d;
        this.f85861d = i2 + 1;
        fArr3[i2] = f;
    }

    /* renamed from: c */
    public final String m35884c(int i) {
        int i2 = this.f85861d;
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

    @Override // p000.An9
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ An9 mo16911d(int i) {
        if (i >= this.f85861d) {
            return new C42318hl9(Arrays.copyOf(this.f85860c, i), this.f85861d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final void m35883e(int i) {
        if (i >= 0 && i < this.f85861d) {
            return;
        }
        throw new IndexOutOfBoundsException(m35884c(i));
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42318hl9)) {
            return super.equals(obj);
        }
        C42318hl9 c42318hl9 = (C42318hl9) obj;
        if (this.f85861d != c42318hl9.f85861d) {
            return false;
        }
        float[] fArr = c42318hl9.f85860c;
        for (int i = 0; i < this.f85861d; i++) {
            if (Float.floatToIntBits(this.f85860c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        m35883e(i);
        return Float.valueOf(this.f85860c[i]);
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f85861d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f85860c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f85861d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f85860c[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m28655a();
        m35883e(i);
        float[] fArr = this.f85860c;
        float f = fArr[i];
        if (i < this.f85861d - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f85861d--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m28655a();
        if (i2 >= i) {
            float[] fArr = this.f85860c;
            System.arraycopy(fArr, i2, fArr, i, this.f85861d - i2);
            this.f85861d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        m28655a();
        m35883e(i);
        float[] fArr = this.f85860c;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f85861d;
    }

    public C42318hl9(float[] fArr, int i) {
        this.f85860c = fArr;
        this.f85861d = i;
    }

    @Override // p000.AbstractC44037kf9, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m35885b(((Float) obj).floatValue());
        return true;
    }
}

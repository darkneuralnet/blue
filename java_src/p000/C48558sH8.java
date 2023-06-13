package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: sH8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C48558sH8 extends AbstractC41834gw8<Float> implements IS8, RandomAccess {

    /* renamed from: e */
    public static final C48558sH8 f108536e;

    /* renamed from: c */
    public float[] f108537c;

    /* renamed from: d */
    public int f108538d;

    static {
        C48558sH8 c48558sH8 = new C48558sH8(new float[0], 0);
        f108536e = c48558sH8;
        c48558sH8.zzb();
    }

    public C48558sH8() {
        this(new float[10], 0);
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        m37302a();
        if (i >= 0 && i <= (i2 = this.f108538d)) {
            float[] fArr = this.f108537c;
            if (i2 < fArr.length) {
                System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
            } else {
                float[] fArr2 = new float[((i2 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i);
                System.arraycopy(this.f108537c, i, fArr2, i + 1, this.f108538d - i);
                this.f108537c = fArr2;
            }
            this.f108537c[i] = floatValue;
            this.f108538d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m14480e(i));
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        m37302a();
        C52124yI8.m3691d(collection);
        if (!(collection instanceof C48558sH8)) {
            return super.addAll(collection);
        }
        C48558sH8 c48558sH8 = (C48558sH8) collection;
        int i = c48558sH8.f108538d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f108538d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f108537c;
            if (i3 > fArr.length) {
                this.f108537c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(c48558sH8.f108537c, 0, this.f108537c, this.f108538d, c48558sH8.f108538d);
            this.f108538d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m14482b(float f) {
        m37302a();
        int i = this.f108538d;
        float[] fArr = this.f108537c;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f108537c = fArr2;
        }
        float[] fArr3 = this.f108537c;
        int i2 = this.f108538d;
        this.f108538d = i2 + 1;
        fArr3[i2] = f;
    }

    /* renamed from: c */
    public final void m14481c(int i) {
        if (i >= 0 && i < this.f108538d) {
            return;
        }
        throw new IndexOutOfBoundsException(m14480e(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final String m14480e(int i) {
        int i2 = this.f108538d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48558sH8)) {
            return super.equals(obj);
        }
        C48558sH8 c48558sH8 = (C48558sH8) obj;
        if (this.f108538d != c48558sH8.f108538d) {
            return false;
        }
        float[] fArr = c48558sH8.f108537c;
        for (int i = 0; i < this.f108538d; i++) {
            if (Float.floatToIntBits(this.f108537c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m14481c(i);
        return Float.valueOf(this.f108537c[i]);
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f108538d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f108537c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f108537c[i] == floatValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        m37302a();
        m14481c(i);
        float[] fArr = this.f108537c;
        float f = fArr[i];
        if (i < this.f108538d - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f108538d--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m37302a();
        if (i2 >= i) {
            float[] fArr = this.f108537c;
            System.arraycopy(fArr, i2, fArr, i, this.f108538d - i2);
            this.f108538d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        m37302a();
        m14481c(i);
        float[] fArr = this.f108537c;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f108538d;
    }

    @Override // p000.RJ8
    public final /* synthetic */ RJ8 zza(int i) {
        if (i >= this.f108538d) {
            return new C48558sH8(Arrays.copyOf(this.f108537c, i), this.f108538d);
        }
        throw new IllegalArgumentException();
    }

    public C48558sH8(float[] fArr, int i) {
        this.f108537c = fArr;
        this.f108538d = i;
    }

    @Override // p000.AbstractC41834gw8, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m14482b(((Float) obj).floatValue());
        return true;
    }
}

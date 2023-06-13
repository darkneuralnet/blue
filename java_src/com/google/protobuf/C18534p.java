package com.google.protobuf;

import com.google.protobuf.C18544t;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: com.google.protobuf.p */
/* loaded from: classes6.dex */
public final class C18534p extends AbstractC18502c<Float> implements C18544t.InterfaceC18550f, RandomAccess, F24 {

    /* renamed from: e */
    public static final C18534p f74847e;

    /* renamed from: c */
    public float[] f74848c;

    /* renamed from: d */
    public int f74849d;

    static {
        C18534p c18534p = new C18534p(new float[0], 0);
        f74847e = c18534p;
        c18534p.mo45989r();
    }

    public C18534p() {
        this(new float[10], 0);
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        m46321a();
        C18544t.m46000a(collection);
        if (!(collection instanceof C18534p)) {
            return super.addAll(collection);
        }
        C18534p c18534p = (C18534p) collection;
        int i = c18534p.f74849d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f74849d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f74848c;
            if (i3 > fArr.length) {
                this.f74848c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(c18534p.f74848c, 0, this.f74848c, this.f74849d, c18534p.f74849d);
            this.f74849d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.List
    /* renamed from: b */
    public void add(int i, Float f) {
        m46079f(i, f.floatValue());
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: c */
    public boolean add(Float f) {
        m46080e(f.floatValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public void m46080e(float f) {
        m46321a();
        int i = this.f74849d;
        float[] fArr = this.f74848c;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f74848c = fArr2;
        }
        float[] fArr3 = this.f74848c;
        int i2 = this.f74849d;
        this.f74849d = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18534p)) {
            return super.equals(obj);
        }
        C18534p c18534p = (C18534p) obj;
        if (this.f74849d != c18534p.f74849d) {
            return false;
        }
        float[] fArr = c18534p.f74848c;
        for (int i = 0; i < this.f74849d; i++) {
            if (Float.floatToIntBits(this.f74848c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m46079f(int i, float f) {
        int i2;
        m46321a();
        if (i >= 0 && i <= (i2 = this.f74849d)) {
            float[] fArr = this.f74848c;
            if (i2 < fArr.length) {
                System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
            } else {
                float[] fArr2 = new float[((i2 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i);
                System.arraycopy(this.f74848c, i, fArr2, i + 1, this.f74849d - i);
                this.f74848c = fArr2;
            }
            this.f74848c[i] = f;
            this.f74849d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m46075s(i));
    }

    /* renamed from: h */
    public final void m46078h(int i) {
        if (i >= 0 && i < this.f74849d) {
            return;
        }
        throw new IndexOutOfBoundsException(m46075s(i));
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f74849d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f74848c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f74848c[i] == floatValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: j */
    public Float get(int i) {
        return Float.valueOf(m46076o(i));
    }

    /* renamed from: o */
    public float m46076o(int i) {
        m46078h(i);
        return this.f74848c[i];
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        m46321a();
        if (i2 >= i) {
            float[] fArr = this.f74848c;
            System.arraycopy(fArr, i2, fArr, i, this.f74849d - i2);
            this.f74849d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public final String m46075s(int i) {
        return "Index:" + i + ", Size:" + this.f74849d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f74849d;
    }

    @Override // com.google.protobuf.C18544t.InterfaceC18553i
    /* renamed from: u */
    public C18544t.InterfaceC18550f mo45959k(int i) {
        if (i >= this.f74849d) {
            return new C18534p(Arrays.copyOf(this.f74848c, i), this.f74849d);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.List
    /* renamed from: v */
    public Float remove(int i) {
        int i2;
        m46321a();
        m46078h(i);
        float[] fArr = this.f74848c;
        float f = fArr[i];
        if (i < this.f74849d - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f74849d--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // com.google.protobuf.AbstractC18502c, java.util.AbstractList, java.util.List
    /* renamed from: w */
    public Float set(int i, Float f) {
        return Float.valueOf(m46071x(i, f.floatValue()));
    }

    /* renamed from: x */
    public float m46071x(int i, float f) {
        m46321a();
        m46078h(i);
        float[] fArr = this.f74848c;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    public C18534p(float[] fArr, int i) {
        this.f74848c = fArr;
        this.f74849d = i;
    }
}

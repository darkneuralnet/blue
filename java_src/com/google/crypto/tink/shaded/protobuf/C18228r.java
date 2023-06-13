package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C18238v;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: com.google.crypto.tink.shaded.protobuf.r */
/* loaded from: classes6.dex */
public final class C18228r extends AbstractC18191c<Float> implements C18238v.InterfaceC18244f, RandomAccess, G24 {

    /* renamed from: e */
    public static final C18228r f74191e;

    /* renamed from: c */
    public float[] f74192c;

    /* renamed from: d */
    public int f74193d;

    static {
        C18228r c18228r = new C18228r(new float[0], 0);
        f74191e = c18228r;
        c18228r.mo47412r();
    }

    public C18228r() {
        this(new float[10], 0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        m47785a();
        C18238v.m47423a(collection);
        if (!(collection instanceof C18228r)) {
            return super.addAll(collection);
        }
        C18228r c18228r = (C18228r) collection;
        int i = c18228r.f74193d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f74193d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f74192c;
            if (i3 > fArr.length) {
                this.f74192c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(c18228r.f74192c, 0, this.f74192c, this.f74193d, c18228r.f74193d);
            this.f74193d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.List
    /* renamed from: b */
    public void add(int i, Float f) {
        m47490f(i, f.floatValue());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: c */
    public boolean add(Float f) {
        m47491e(f.floatValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public void m47491e(float f) {
        m47785a();
        int i = this.f74193d;
        float[] fArr = this.f74192c;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f74192c = fArr2;
        }
        float[] fArr3 = this.f74192c;
        int i2 = this.f74193d;
        this.f74193d = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18228r)) {
            return super.equals(obj);
        }
        C18228r c18228r = (C18228r) obj;
        if (this.f74193d != c18228r.f74193d) {
            return false;
        }
        float[] fArr = c18228r.f74192c;
        for (int i = 0; i < this.f74193d; i++) {
            if (Float.floatToIntBits(this.f74192c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m47490f(int i, float f) {
        int i2;
        m47785a();
        if (i >= 0 && i <= (i2 = this.f74193d)) {
            float[] fArr = this.f74192c;
            if (i2 < fArr.length) {
                System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
            } else {
                float[] fArr2 = new float[((i2 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i);
                System.arraycopy(this.f74192c, i, fArr2, i + 1, this.f74193d - i);
                this.f74192c = fArr2;
            }
            this.f74192c[i] = f;
            this.f74193d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m47486s(i));
    }

    /* renamed from: h */
    public final void m47489h(int i) {
        if (i >= 0 && i < this.f74193d) {
            return;
        }
        throw new IndexOutOfBoundsException(m47486s(i));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f74193d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f74192c[i2]);
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
            if (this.f74192c[i] == floatValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: j */
    public Float get(int i) {
        return Float.valueOf(m47487o(i));
    }

    /* renamed from: o */
    public float m47487o(int i) {
        m47489h(i);
        return this.f74192c[i];
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        m47785a();
        if (i2 >= i) {
            float[] fArr = this.f74192c;
            System.arraycopy(fArr, i2, fArr, i, this.f74193d - i2);
            this.f74193d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public final String m47486s(int i) {
        return "Index:" + i + ", Size:" + this.f74193d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f74193d;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C18238v.InterfaceC18247i
    /* renamed from: u */
    public C18238v.InterfaceC18244f mo47397k(int i) {
        if (i >= this.f74193d) {
            return new C18228r(Arrays.copyOf(this.f74192c, i), this.f74193d);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.List
    /* renamed from: v */
    public Float remove(int i) {
        int i2;
        m47785a();
        m47489h(i);
        float[] fArr = this.f74192c;
        float f = fArr[i];
        if (i < this.f74193d - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f74193d--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18191c, java.util.AbstractList, java.util.List
    /* renamed from: w */
    public Float set(int i, Float f) {
        return Float.valueOf(m47482x(i, f.floatValue()));
    }

    /* renamed from: x */
    public float m47482x(int i, float f) {
        m47785a();
        m47489h(i);
        float[] fArr = this.f74192c;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    public C18228r(float[] fArr, int i) {
        this.f74192c = fArr;
        this.f74193d = i;
    }
}

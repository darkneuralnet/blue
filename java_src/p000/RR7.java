package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: RR7 */
/* loaded from: classes5.dex */
public final class RR7 extends AbstractC36507Ux7<Float> implements RandomAccess {

    /* renamed from: e */
    public static final RR7 f32031e;

    /* renamed from: c */
    public float[] f32032c;

    /* renamed from: d */
    public int f32033d;

    static {
        RR7 rr7 = new RR7();
        f32031e = rr7;
        rr7.zzv();
    }

    public RR7() {
        this(new float[10], 0);
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        m86742c(i, ((Float) obj).floatValue());
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        m80580a();
        C37975aT7.m71332a(collection);
        if (collection instanceof RR7) {
            RR7 rr7 = (RR7) collection;
            int i = rr7.f32033d;
            if (i == 0) {
                return false;
            }
            int i2 = this.f32033d;
            if (Integer.MAX_VALUE - i2 >= i) {
                int i3 = i2 + i;
                float[] fArr = this.f32032c;
                if (i3 > fArr.length) {
                    this.f32032c = Arrays.copyOf(fArr, i3);
                }
                System.arraycopy(rr7.f32032c, 0, this.f32032c, this.f32033d, rr7.f32033d);
                this.f32033d = i3;
                ((AbstractList) this).modCount++;
                return true;
            }
            throw new OutOfMemoryError();
        }
        return super.addAll(collection);
    }

    /* renamed from: b */
    public final void m86743b(float f) {
        m86742c(this.f32033d, f);
    }

    /* renamed from: c */
    public final void m86742c(int i, float f) {
        int i2;
        m80580a();
        if (i < 0 || i > (i2 = this.f32033d)) {
            throw new IndexOutOfBoundsException(m86740f(i));
        }
        float[] fArr = this.f32032c;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f32032c, i, fArr2, i + 1, this.f32033d - i);
            this.f32032c = fArr2;
        }
        this.f32032c[i] = f;
        this.f32033d++;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: e */
    public final void m86741e(int i) {
        if (i < 0 || i >= this.f32033d) {
            throw new IndexOutOfBoundsException(m86740f(i));
        }
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RR7) {
            RR7 rr7 = (RR7) obj;
            if (this.f32033d != rr7.f32033d) {
                return false;
            }
            float[] fArr = rr7.f32032c;
            for (int i = 0; i < this.f32033d; i++) {
                if (this.f32032c[i] != fArr[i]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    /* renamed from: f */
    public final String m86740f(int i) {
        int i2 = this.f32033d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m86741e(i);
        return Float.valueOf(this.f32032c[i]);
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f32033d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f32032c[i2]);
        }
        return i;
    }

    @Override // p000.InterfaceC47489qU7
    /* renamed from: n */
    public final /* synthetic */ InterfaceC47489qU7 mo1502n(int i) {
        if (i >= this.f32033d) {
            return new RR7(Arrays.copyOf(this.f32032c, i), this.f32033d);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        m80580a();
        m86741e(i);
        float[] fArr = this.f32032c;
        float f = fArr[i];
        int i2 = this.f32033d;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, i2 - i);
        }
        this.f32033d--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m80580a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f32032c;
        System.arraycopy(fArr, i2, fArr, i, this.f32033d - i2);
        this.f32033d -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        m80580a();
        m86741e(i);
        float[] fArr = this.f32032c;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f32033d;
    }

    public RR7(float[] fArr, int i) {
        this.f32032c = fArr;
        this.f32033d = i;
    }

    @Override // p000.AbstractC36507Ux7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m80580a();
        for (int i = 0; i < this.f32033d; i++) {
            if (obj.equals(Float.valueOf(this.f32032c[i]))) {
                float[] fArr = this.f32032c;
                System.arraycopy(fArr, i + 1, fArr, i, this.f32033d - i);
                this.f32033d--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}

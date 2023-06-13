package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: HD7 */
/* loaded from: classes5.dex */
public final class HD7 extends Bh9<Float> implements FW7, RandomAccess {

    /* renamed from: e */
    public static final HD7 f13102e;

    /* renamed from: c */
    public float[] f13103c;

    /* renamed from: d */
    public int f13104d;

    static {
        HD7 hd7 = new HD7(new float[0], 0);
        f13102e = hd7;
        hd7.mo113666q();
    }

    public HD7() {
        this(new float[10], 0);
    }

    @Override // p000.Bh9, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        m104166b(i, ((Float) obj).floatValue());
    }

    @Override // p000.Bh9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        m113667a();
        C44389lF7.m27619a(collection);
        if (!(collection instanceof HD7)) {
            return super.addAll(collection);
        }
        HD7 hd7 = (HD7) collection;
        int i = hd7.f13104d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f13104d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f13103c;
            if (i3 > fArr.length) {
                this.f13103c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(hd7.f13103c, 0, this.f13103c, this.f13104d, hd7.f13104d);
            this.f13104d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m104166b(int i, float f) {
        int i2;
        m113667a();
        if (i >= 0 && i <= (i2 = this.f13104d)) {
            float[] fArr = this.f13103c;
            if (i2 < fArr.length) {
                System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
            } else {
                float[] fArr2 = new float[((i2 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i);
                System.arraycopy(this.f13103c, i, fArr2, i + 1, this.f13104d - i);
                this.f13103c = fArr2;
            }
            this.f13103c[i] = f;
            this.f13104d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m104163f(i));
    }

    /* renamed from: c */
    public final void m104165c(float f) {
        m104166b(this.f13104d, f);
    }

    /* renamed from: e */
    public final void m104164e(int i) {
        if (i >= 0 && i < this.f13104d) {
            return;
        }
        throw new IndexOutOfBoundsException(m104163f(i));
    }

    @Override // p000.Bh9, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HD7)) {
            return super.equals(obj);
        }
        HD7 hd7 = (HD7) obj;
        if (this.f13104d != hd7.f13104d) {
            return false;
        }
        float[] fArr = hd7.f13103c;
        for (int i = 0; i < this.f13104d; i++) {
            if (Float.floatToIntBits(this.f13103c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final String m104163f(int i) {
        int i2 = this.f13104d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m104164e(i);
        return Float.valueOf(this.f13103c[i]);
    }

    @Override // p000.Bh9, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f13104d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f13103c[i2]);
        }
        return i;
    }

    @Override // p000.Bh9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m113667a();
        for (int i = 0; i < this.f13104d; i++) {
            if (obj.equals(Float.valueOf(this.f13103c[i]))) {
                float[] fArr = this.f13103c;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f13104d - i) - 1);
                this.f13104d--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m113667a();
        if (i2 >= i) {
            float[] fArr = this.f13103c;
            System.arraycopy(fArr, i2, fArr, i, this.f13104d - i2);
            this.f13104d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // p000.Bh9, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        m113667a();
        m104164e(i);
        float[] fArr = this.f13103c;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13104d;
    }

    @Override // p000.BI7
    public final /* synthetic */ BI7 zzh(int i) {
        if (i >= this.f13104d) {
            return new HD7(Arrays.copyOf(this.f13103c, i), this.f13104d);
        }
        throw new IllegalArgumentException();
    }

    public HD7(float[] fArr, int i) {
        this.f13103c = fArr;
        this.f13104d = i;
    }

    @Override // p000.Bh9, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        m113667a();
        m104164e(i);
        float[] fArr = this.f13103c;
        float f = fArr[i];
        if (i < this.f13104d - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f13104d--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }
}

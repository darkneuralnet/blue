package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: Wt7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36939Wt7 extends AbstractC31782As7 implements RandomAccess, InterfaceC43592ju7, InterfaceC32745Ev7 {

    /* renamed from: e */
    public static final C36939Wt7 f42276e;

    /* renamed from: c */
    public float[] f42277c;

    /* renamed from: d */
    public int f42278d;

    static {
        C36939Wt7 c36939Wt7 = new C36939Wt7(new float[0], 0);
        f42276e = c36939Wt7;
        c36939Wt7.zzb();
    }

    public C36939Wt7() {
        this(new float[10], 0);
    }

    /* renamed from: b */
    public static C36939Wt7 m77730b() {
        return f42276e;
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        m114986a();
        if (i >= 0 && i <= (i2 = this.f42278d)) {
            float[] fArr = this.f42277c;
            if (i2 < fArr.length) {
                System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
            } else {
                float[] fArr2 = new float[((i2 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i);
                System.arraycopy(this.f42277c, i, fArr2, i + 1, this.f42278d - i);
                this.f42277c = fArr2;
            }
            this.f42277c[i] = floatValue;
            this.f42278d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m77728e(i));
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m114986a();
        C46557ou7.m20293e(collection);
        if (!(collection instanceof C36939Wt7)) {
            return super.addAll(collection);
        }
        C36939Wt7 c36939Wt7 = (C36939Wt7) collection;
        int i = c36939Wt7.f42278d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f42278d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f42277c;
            if (i3 > fArr.length) {
                this.f42277c = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(c36939Wt7.f42277c, 0, this.f42277c, this.f42278d, c36939Wt7.f42278d);
            this.f42278d = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void m77729c(float f) {
        m114986a();
        int i = this.f42278d;
        float[] fArr = this.f42277c;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f42277c = fArr2;
        }
        float[] fArr3 = this.f42277c;
        int i2 = this.f42278d;
        this.f42278d = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.InterfaceC45964nu7
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ InterfaceC45964nu7 mo6153d(int i) {
        if (i >= this.f42278d) {
            return new C36939Wt7(Arrays.copyOf(this.f42277c, i), this.f42278d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final String m77728e(int i) {
        int i2 = this.f42278d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36939Wt7)) {
            return super.equals(obj);
        }
        C36939Wt7 c36939Wt7 = (C36939Wt7) obj;
        if (this.f42278d != c36939Wt7.f42278d) {
            return false;
        }
        float[] fArr = c36939Wt7.f42277c;
        for (int i = 0; i < this.f42278d; i++) {
            if (Float.floatToIntBits(this.f42277c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzh(i);
        return Float.valueOf(this.f42277c[i]);
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f42278d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f42277c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f42278d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f42277c[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m114986a();
        zzh(i);
        float[] fArr = this.f42277c;
        float f = fArr[i];
        if (i < this.f42278d - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f42278d--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m114986a();
        if (i2 >= i) {
            float[] fArr = this.f42277c;
            System.arraycopy(fArr, i2, fArr, i, this.f42278d - i2);
            this.f42278d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        m114986a();
        zzh(i);
        float[] fArr = this.f42277c;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f42278d;
    }

    public final void zzh(int i) {
        if (i < 0 || i >= this.f42278d) {
            throw new IndexOutOfBoundsException(m77728e(i));
        }
    }

    public C36939Wt7(float[] fArr, int i) {
        this.f42277c = fArr;
        this.f42278d = i;
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m77729c(((Float) obj).floatValue());
        return true;
    }
}

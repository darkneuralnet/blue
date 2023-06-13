package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* renamed from: Gv7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33213Gv7 extends AbstractC31782As7 implements RandomAccess {

    /* renamed from: e */
    public static final C33213Gv7 f12626e;

    /* renamed from: c */
    public Object[] f12627c;

    /* renamed from: d */
    public int f12628d;

    static {
        C33213Gv7 c33213Gv7 = new C33213Gv7(new Object[0], 0);
        f12626e = c33213Gv7;
        c33213Gv7.zzb();
    }

    public C33213Gv7() {
        this(new Object[10], 0);
    }

    /* renamed from: b */
    public static C33213Gv7 m104581b() {
        return f12626e;
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m114986a();
        if (i >= 0 && i <= (i2 = this.f12628d)) {
            Object[] objArr = this.f12627c;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f12627c, i, objArr2, i + 1, this.f12628d - i);
                this.f12627c = objArr2;
            }
            this.f12627c[i] = obj;
            this.f12628d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m104580c(i));
    }

    /* renamed from: c */
    public final String m104580c(int i) {
        int i2 = this.f12628d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // p000.InterfaceC45964nu7
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ InterfaceC45964nu7 mo6153d(int i) {
        if (i >= this.f12628d) {
            return new C33213Gv7(Arrays.copyOf(this.f12627c, i), this.f12628d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public final void m104579e(int i) {
        if (i < 0 || i >= this.f12628d) {
            throw new IndexOutOfBoundsException(m104580c(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m104579e(i);
        return this.f12627c[i];
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        m114986a();
        m104579e(i);
        Object[] objArr = this.f12627c;
        Object obj = objArr[i];
        if (i < this.f12628d - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f12628d--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m114986a();
        m104579e(i);
        Object[] objArr = this.f12627c;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12628d;
    }

    public C33213Gv7(Object[] objArr, int i) {
        this.f12627c = objArr;
        this.f12628d = i;
    }

    @Override // p000.AbstractC31782As7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m114986a();
        int i = this.f12628d;
        Object[] objArr = this.f12627c;
        if (i == objArr.length) {
            this.f12627c = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f12627c;
        int i2 = this.f12628d;
        this.f12628d = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}

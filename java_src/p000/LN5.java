package p000;

import ch.qos.logback.core.CoreConstants;
/* renamed from: LN5 */
/* loaded from: classes.dex */
public class LN5<E> implements Cloneable {

    /* renamed from: f */
    public static final Object f21355f = new Object();

    /* renamed from: b */
    public boolean f21356b;

    /* renamed from: c */
    public int[] f21357c;

    /* renamed from: d */
    public Object[] f21358d;

    /* renamed from: e */
    public int f21359e;

    public LN5() {
        this(10);
    }

    /* renamed from: d */
    public void m96989d(int i, E e) {
        int i2 = this.f21359e;
        if (i2 != 0 && i <= this.f21357c[i2 - 1]) {
            m96978p(i, e);
            return;
        }
        if (this.f21356b && i2 >= this.f21357c.length) {
            m96984j();
        }
        int i3 = this.f21359e;
        if (i3 >= this.f21357c.length) {
            int m6011e = C51342wz0.m6011e(i3 + 1);
            int[] iArr = new int[m6011e];
            Object[] objArr = new Object[m6011e];
            int[] iArr2 = this.f21357c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f21358d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f21357c = iArr;
            this.f21358d = objArr;
        }
        this.f21357c[i3] = i;
        this.f21358d[i3] = e;
        this.f21359e = i3 + 1;
    }

    /* renamed from: e */
    public void m96988e() {
        int i = this.f21359e;
        Object[] objArr = this.f21358d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f21359e = 0;
        this.f21356b = false;
    }

    /* renamed from: f */
    public LN5<E> clone() {
        try {
            LN5<E> ln5 = (LN5) super.clone();
            ln5.f21357c = (int[]) this.f21357c.clone();
            ln5.f21358d = (Object[]) this.f21358d.clone();
            return ln5;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: g */
    public boolean m96986g(int i) {
        return m96981m(i) >= 0;
    }

    /* renamed from: h */
    public boolean m96985h(E e) {
        return m96980n(e) >= 0;
    }

    /* renamed from: j */
    public final void m96984j() {
        int i = this.f21359e;
        int[] iArr = this.f21357c;
        Object[] objArr = this.f21358d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f21355f) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f21356b = false;
        this.f21359e = i2;
    }

    /* renamed from: k */
    public E m96983k(int i) {
        return m96982l(i, null);
    }

    /* renamed from: l */
    public E m96982l(int i, E e) {
        E e2;
        int m6015a = C51342wz0.m6015a(this.f21357c, this.f21359e, i);
        if (m6015a >= 0 && (e2 = (E) this.f21358d[m6015a]) != f21355f) {
            return e2;
        }
        return e;
    }

    /* renamed from: m */
    public int m96981m(int i) {
        if (this.f21356b) {
            m96984j();
        }
        return C51342wz0.m6015a(this.f21357c, this.f21359e, i);
    }

    /* renamed from: n */
    public int m96980n(E e) {
        if (this.f21356b) {
            m96984j();
        }
        for (int i = 0; i < this.f21359e; i++) {
            if (this.f21358d[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: o */
    public int m96979o(int i) {
        if (this.f21356b) {
            m96984j();
        }
        return this.f21357c[i];
    }

    /* renamed from: p */
    public void m96978p(int i, E e) {
        int m6015a = C51342wz0.m6015a(this.f21357c, this.f21359e, i);
        if (m6015a >= 0) {
            this.f21358d[m6015a] = e;
            return;
        }
        int i2 = ~m6015a;
        int i3 = this.f21359e;
        if (i2 < i3) {
            Object[] objArr = this.f21358d;
            if (objArr[i2] == f21355f) {
                this.f21357c[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f21356b && i3 >= this.f21357c.length) {
            m96984j();
            i2 = ~C51342wz0.m6015a(this.f21357c, this.f21359e, i);
        }
        int i4 = this.f21359e;
        if (i4 >= this.f21357c.length) {
            int m6011e = C51342wz0.m6011e(i4 + 1);
            int[] iArr = new int[m6011e];
            Object[] objArr2 = new Object[m6011e];
            int[] iArr2 = this.f21357c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f21358d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f21357c = iArr;
            this.f21358d = objArr2;
        }
        int i5 = this.f21359e;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.f21357c;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.f21358d;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f21359e - i2);
        }
        this.f21357c[i2] = i;
        this.f21358d[i2] = e;
        this.f21359e++;
    }

    /* renamed from: q */
    public void m96977q(int i) {
        Object[] objArr = this.f21358d;
        Object obj = objArr[i];
        Object obj2 = f21355f;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f21356b = true;
        }
    }

    /* renamed from: r */
    public E m96976r(int i, E e) {
        int m96981m = m96981m(i);
        if (m96981m >= 0) {
            Object[] objArr = this.f21358d;
            E e2 = (E) objArr[m96981m];
            objArr[m96981m] = e;
            return e2;
        }
        return null;
    }

    public int size() {
        if (this.f21356b) {
            m96984j();
        }
        return this.f21359e;
    }

    /* renamed from: t */
    public E m96975t(int i) {
        if (this.f21356b) {
            m96984j();
        }
        return (E) this.f21358d[i];
    }

    public String toString() {
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f21359e * 28);
        sb.append(CoreConstants.CURLY_LEFT);
        for (int i = 0; i < this.f21359e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m96979o(i));
            sb.append('=');
            E m96975t = m96975t(i);
            if (m96975t != this) {
                sb.append(m96975t);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }

    public LN5(int i) {
        this.f21356b = false;
        if (i == 0) {
            this.f21357c = C51342wz0.f116939a;
            this.f21358d = C51342wz0.f116941c;
            return;
        }
        int m6011e = C51342wz0.m6011e(i);
        this.f21357c = new int[m6011e];
        this.f21358d = new Object[m6011e];
    }
}

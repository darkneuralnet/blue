package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: YB1 */
/* loaded from: classes8.dex */
public class YB1 implements Iterator {

    /* renamed from: b */
    public WB1 f44755b;

    /* renamed from: d */
    public int f44757d;

    /* renamed from: f */
    public YB1 f44759f;

    /* renamed from: c */
    public boolean f44756c = true;

    /* renamed from: e */
    public int f44758e = 0;

    public YB1(WB1 wb1) {
        this.f44755b = wb1;
        this.f44757d = wb1.mo77232f0();
    }

    /* renamed from: a */
    public static boolean m75467a(WB1 wb1) {
        return !(wb1 instanceof XB1);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f44756c) {
            return true;
        }
        YB1 yb1 = this.f44759f;
        if (yb1 != null) {
            if (yb1.hasNext()) {
                return true;
            }
            this.f44759f = null;
        }
        if (this.f44758e < this.f44757d) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.f44756c) {
            this.f44756c = false;
            if (m75467a(this.f44755b)) {
                this.f44758e++;
            }
            return this.f44755b;
        }
        YB1 yb1 = this.f44759f;
        if (yb1 != null) {
            if (yb1.hasNext()) {
                return this.f44759f.next();
            }
            this.f44759f = null;
        }
        int i = this.f44758e;
        if (i < this.f44757d) {
            WB1 wb1 = this.f44755b;
            this.f44758e = i + 1;
            WB1 mo77236d0 = wb1.mo77236d0(i);
            if (mo77236d0 instanceof XB1) {
                YB1 yb12 = new YB1((XB1) mo77236d0);
                this.f44759f = yb12;
                return yb12.next();
            }
            return mo77236d0;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException(getClass().getName());
    }
}

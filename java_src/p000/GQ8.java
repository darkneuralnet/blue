package p000;
/* renamed from: GQ8 */
/* loaded from: classes6.dex */
public final class GQ8<E> extends CO8<E> {
    public GQ8() {
        super(4);
    }

    /* renamed from: d */
    public final GQ8<E> m105126d(E e) {
        e.getClass();
        super.m112265b(e);
        return this;
    }

    /* renamed from: e */
    public final RQ8<E> m105125e() {
        RQ8<E> m86758y;
        int i = this.f4029b;
        if (i != 0) {
            if (i != 1) {
                m86758y = RQ8.m86758y(i, this.f4028a);
                this.f4029b = m86758y.size();
                this.f4030c = true;
                return m86758y;
            }
            Object obj = this.f4028a[0];
            obj.getClass();
            return new C46295oT8(obj);
        }
        return SS8.f33759j;
    }
}

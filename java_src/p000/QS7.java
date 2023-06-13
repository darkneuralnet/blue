package p000;
/* renamed from: QS7 */
/* loaded from: classes5.dex */
public final class QS7 extends AbstractC46231oM7 {

    /* renamed from: g */
    public static final AbstractC46231oM7 f30395g = new QS7(null, new Object[0], 0);

    /* renamed from: e */
    public final transient Object[] f30396e;

    /* renamed from: f */
    public final transient int f30397f;

    public QS7(Object obj, Object[] objArr, int i) {
        this.f30396e = objArr;
        this.f30397f = i;
    }

    /* renamed from: g */
    public static QS7 m88496g(int i, Object[] objArr, YL7 yl7) {
        Object obj = objArr[0];
        obj.getClass();
        Object obj2 = objArr[1];
        obj2.getClass();
        C38861bx7.m62067b(obj, obj2);
        return new QS7(null, objArr, 1);
    }

    @Override // p000.AbstractC46231oM7
    /* renamed from: a */
    public final BJ7 mo21256a() {
        return new C52806zS7(this.f30396e, 1, this.f30397f);
    }

    @Override // p000.AbstractC46231oM7
    /* renamed from: d */
    public final FM7 mo21253d() {
        return new WR7(this, this.f30396e, 0, this.f30397f);
    }

    @Override // p000.AbstractC46231oM7
    /* renamed from: e */
    public final FM7 mo21252e() {
        return new C44506lS7(this, new C52806zS7(this.f30396e, 0, this.f30397f));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020 A[RETURN] */
    @Override // p000.AbstractC46231oM7, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        Object[] objArr = this.f30396e;
        int i = this.f30397f;
        if (obj != null && i == 1) {
            Object obj3 = objArr[0];
            obj3.getClass();
            if (obj3.equals(obj)) {
                obj2 = objArr[1];
                obj2.getClass();
                if (obj2 != null) {
                    return null;
                }
                return obj2;
            }
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.f30397f;
    }
}

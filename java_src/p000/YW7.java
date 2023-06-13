package p000;
/* renamed from: YW7 */
/* loaded from: classes5.dex */
public final class YW7 extends AbstractC42727iS7 {

    /* renamed from: g */
    public static final AbstractC42727iS7 f45969g = new YW7(null, new Object[0], 0);

    /* renamed from: e */
    public final transient Object[] f45970e;

    /* renamed from: f */
    public final transient int f45971f;

    public YW7(Object obj, Object[] objArr, int i) {
        this.f45970e = objArr;
        this.f45971f = i;
    }

    /* renamed from: g */
    public static YW7 m74940g(int i, Object[] objArr, TR7 tr7) {
        Object obj = objArr[0];
        obj.getClass();
        Object obj2 = objArr[1];
        obj2.getClass();
        C45620nK7.m23965b(obj, obj2);
        return new YW7(null, objArr, 1);
    }

    @Override // p000.AbstractC42727iS7
    /* renamed from: a */
    public final VO7 mo33903a() {
        return new JW7(this.f45970e, 1, this.f45971f);
    }

    @Override // p000.AbstractC42727iS7
    /* renamed from: d */
    public final AbstractC51027wS7 mo33900d() {
        return new C43356jW7(this, this.f45970e, 0, this.f45971f);
    }

    @Override // p000.AbstractC42727iS7
    /* renamed from: e */
    public final AbstractC51027wS7 mo33899e() {
        return new C51063wW7(this, new JW7(this.f45970e, 0, this.f45971f));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020 A[RETURN] */
    @Override // p000.AbstractC42727iS7, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        Object[] objArr = this.f45970e;
        int i = this.f45971f;
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
        return this.f45971f;
    }
}

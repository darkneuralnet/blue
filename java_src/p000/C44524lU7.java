package p000;
/* renamed from: lU7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44524lU7 extends AbstractC39709dM7 {

    /* renamed from: g */
    public static final AbstractC39709dM7 f96250g = new C44524lU7(null, new Object[0], 0);

    /* renamed from: e */
    public final transient Object[] f96251e;

    /* renamed from: f */
    public final transient int f96252f;

    public C44524lU7(Object obj, Object[] objArr, int i) {
        this.f96251e = objArr;
        this.f96252f = i;
    }

    /* renamed from: g */
    public static C44524lU7 m27234g(int i, Object[] objArr, NL7 nl7) {
        Object obj = objArr[0];
        obj.getClass();
        Object obj2 = objArr[1];
        obj2.getClass();
        C39462cw7.m44805b(obj, obj2);
        return new C44524lU7(null, objArr, 1);
    }

    @Override // p000.AbstractC39709dM7
    /* renamed from: a */
    public final AbstractC47983rJ7 mo27237a() {
        return new WT7(this.f96251e, 1, this.f96252f);
    }

    @Override // p000.AbstractC39709dM7
    /* renamed from: d */
    public final AbstractC49195tM7 mo27236d() {
        return new C43922kT7(this, this.f96251e, 0, this.f96252f);
    }

    @Override // p000.AbstractC39709dM7
    /* renamed from: e */
    public final AbstractC49195tM7 mo27235e() {
        return new LT7(this, new WT7(this.f96251e, 0, this.f96252f));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020 A[RETURN] */
    @Override // p000.AbstractC39709dM7, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        Object[] objArr = this.f96251e;
        int i = this.f96252f;
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
        return this.f96252f;
    }
}

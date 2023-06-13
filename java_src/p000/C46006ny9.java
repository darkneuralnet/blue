package p000;
/* renamed from: ny9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46006ny9 extends AbstractC47062pl9 {

    /* renamed from: g */
    public static final AbstractC47062pl9 f101171g = new C46006ny9(null, new Object[0], 0);

    /* renamed from: e */
    public final transient Object[] f101172e;

    /* renamed from: f */
    public final transient int f101173f;

    public C46006ny9(Object obj, Object[] objArr, int i) {
        this.f101172e = objArr;
        this.f101173f = i;
    }

    /* renamed from: g */
    public static C46006ny9 m22044g(int i, Object[] objArr, Vh9 vh9) {
        Object obj = objArr[0];
        obj.getClass();
        Object obj2 = objArr[1];
        obj2.getClass();
        C41380gA8.m39952a(obj, obj2);
        return new C46006ny9(null, objArr, 1);
    }

    @Override // p000.AbstractC47062pl9
    /* renamed from: a */
    public final TT8 mo18761a() {
        return new C44810lx9(this.f101172e, 1, this.f101173f);
    }

    @Override // p000.AbstractC47062pl9
    /* renamed from: d */
    public final Ao9 mo18758d() {
        return new C39454cv9(this, this.f101172e, 0, this.f101173f);
    }

    @Override // p000.AbstractC47062pl9
    /* renamed from: e */
    public final Ao9 mo18757e() {
        return new C45393mw9(this, new C44810lx9(this.f101172e, 0, this.f101173f));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020 A[RETURN] */
    @Override // p000.AbstractC47062pl9, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        Object[] objArr = this.f101172e;
        int i = this.f101173f;
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
        return this.f101173f;
    }
}

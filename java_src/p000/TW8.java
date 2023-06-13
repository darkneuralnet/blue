package p000;
/* renamed from: TW8 */
/* loaded from: classes5.dex */
public final class TW8 extends QU8 {

    /* renamed from: g */
    public static final QU8 f35605g = new TW8(null, new Object[0], 0);

    /* renamed from: e */
    public final transient Object[] f35606e;

    /* renamed from: f */
    public final transient int f35607f;

    public TW8(Object obj, Object[] objArr, int i) {
        this.f35606e = objArr;
        this.f35607f = i;
    }

    /* renamed from: g */
    public static TW8 m83480g(int i, Object[] objArr, EU8 eu8) {
        Object obj = objArr[0];
        obj.getClass();
        Object obj2 = objArr[1];
        obj2.getClass();
        C43321jS8.m30591a(obj, obj2);
        return new TW8(null, objArr, 1);
    }

    @Override // p000.QU8
    /* renamed from: a */
    public final AbstractC37976aT8 mo83483a() {
        return new IW8(this.f35606e, 1, this.f35607f);
    }

    @Override // p000.QU8
    /* renamed from: d */
    public final AbstractC45127mV8 mo83482d() {
        return new C44543lW8(this, this.f35606e, 0, this.f35607f);
    }

    @Override // p000.QU8
    /* renamed from: e */
    public final AbstractC45127mV8 mo83481e() {
        return new C51657xW8(this, new IW8(this.f35606e, 0, this.f35607f));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020 A[RETURN] */
    @Override // p000.QU8, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        Object[] objArr = this.f35606e;
        int i = this.f35607f;
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
        return this.f35607f;
    }
}

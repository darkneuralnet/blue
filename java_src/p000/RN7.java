package p000;
/* renamed from: RN7 */
/* loaded from: classes5.dex */
public final class RN7 extends IL7 {

    /* renamed from: g */
    public static final IL7 f31985g = new RN7(null, new Object[0], 0);

    /* renamed from: e */
    public final transient Object[] f31986e;

    /* renamed from: f */
    public final transient int f31987f;

    public RN7(Object obj, Object[] objArr, int i) {
        this.f31986e = objArr;
        this.f31987f = i;
    }

    /* renamed from: g */
    public static RN7 m86783g(int i, Object[] objArr, C49779uL7 c49779uL7) {
        Object obj = objArr[0];
        obj.getClass();
        Object obj2 = objArr[1];
        obj2.getClass();
        C44991mG7.m25858a(obj, obj2);
        return new RN7(null, objArr, 1);
    }

    @Override // p000.IL7
    /* renamed from: a */
    public final OI7 mo86786a() {
        return new DN7(this.f31986e, 1, this.f31987f);
    }

    @Override // p000.IL7
    /* renamed from: d */
    public final ZL7 mo86785d() {
        return new VM7(this, this.f31986e, 0, this.f31987f);
    }

    @Override // p000.IL7
    /* renamed from: e */
    public final ZL7 mo86784e() {
        return new C45647nN7(this, new DN7(this.f31986e, 0, this.f31987f));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020 A[RETURN] */
    @Override // p000.IL7, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        Object[] objArr = this.f31986e;
        int i = this.f31987f;
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
        return this.f31987f;
    }
}

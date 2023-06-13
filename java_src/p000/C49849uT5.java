package p000;
/* renamed from: uT5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C49849uT5 implements InterfaceC36268Tx2 {

    /* renamed from: a */
    public EnumC47105pq2 f112428a;

    /* renamed from: b */
    public InterfaceC41482gM2 f112429b;

    /* renamed from: c */
    public String f112430c;

    /* renamed from: d */
    public C48663sT5 f112431d;

    /* renamed from: e */
    public String f112432e;

    /* renamed from: f */
    public String f112433f;

    /* renamed from: g */
    public Object[] f112434g;

    /* renamed from: h */
    public long f112435h;

    /* renamed from: i */
    public Throwable f112436i;

    /* renamed from: a */
    public C48663sT5 m10243a() {
        return this.f112431d;
    }

    /* renamed from: b */
    public void m10242b(Object[] objArr) {
        this.f112434g = objArr;
    }

    /* renamed from: c */
    public void m10241c(EnumC47105pq2 enumC47105pq2) {
        this.f112428a = enumC47105pq2;
    }

    /* renamed from: d */
    public void m10240d(C48663sT5 c48663sT5) {
        this.f112431d = c48663sT5;
    }

    /* renamed from: e */
    public void m10239e(String str) {
        this.f112430c = str;
    }

    /* renamed from: f */
    public void m10238f(InterfaceC41482gM2 interfaceC41482gM2) {
        this.f112429b = interfaceC41482gM2;
    }

    /* renamed from: g */
    public void m10237g(String str) {
        this.f112433f = str;
    }

    @Override // p000.InterfaceC36268Tx2
    public Object[] getArgumentArray() {
        return this.f112434g;
    }

    @Override // p000.InterfaceC36268Tx2
    public EnumC47105pq2 getLevel() {
        return this.f112428a;
    }

    @Override // p000.InterfaceC36268Tx2
    public InterfaceC41482gM2 getMarker() {
        return this.f112429b;
    }

    @Override // p000.InterfaceC36268Tx2
    public String getMessage() {
        return this.f112433f;
    }

    @Override // p000.InterfaceC36268Tx2
    public Throwable getThrowable() {
        return this.f112436i;
    }

    /* renamed from: h */
    public void m10236h(String str) {
        this.f112432e = str;
    }

    /* renamed from: i */
    public void m10235i(Throwable th) {
        this.f112436i = th;
    }

    /* renamed from: j */
    public void m10234j(long j) {
        this.f112435h = j;
    }
}

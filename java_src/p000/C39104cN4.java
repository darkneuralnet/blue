package p000;
/* renamed from: cN4  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39104cN4<T> {

    /* renamed from: a */
    public final HM4<T> f60476a;

    /* renamed from: b */
    public final Throwable f60477b;

    public C39104cN4(HM4<T> hm4, Throwable th) {
        this.f60476a = hm4;
        this.f60477b = th;
    }

    /* renamed from: a */
    public static <T> C39104cN4<T> m61511a(Throwable th) {
        if (th != null) {
            return new C39104cN4<>(null, th);
        }
        throw new NullPointerException("error == null");
    }

    /* renamed from: b */
    public static <T> C39104cN4<T> m61510b(HM4<T> hm4) {
        if (hm4 != null) {
            return new C39104cN4<>(hm4, null);
        }
        throw new NullPointerException("response == null");
    }
}

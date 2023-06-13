package p000;
/* renamed from: jM2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C43261jM2 {

    /* renamed from: a */
    public static SO1 f92600a;

    static {
        try {
            f92600a = m30758a();
        } catch (Exception e) {
            C49993ui6.m9851d("Unexpected failure while binding MarkerFactory", e);
        } catch (NoClassDefFoundError unused) {
            f92600a = new C5518NE();
        }
    }

    private C43261jM2() {
    }

    /* renamed from: a */
    public static SO1 m30758a() throws NoClassDefFoundError {
        try {
            return C42707iQ5.m33940b().m33941a();
        } catch (NoSuchMethodError unused) {
            return C42707iQ5.f87304b.m33941a();
        }
    }

    /* renamed from: b */
    public static InterfaceC41482gM2 m30757b(String str) {
        return f92600a.mo85569a(str);
    }
}

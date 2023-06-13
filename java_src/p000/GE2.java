package p000;
/* renamed from: GE2 */
/* loaded from: classes8.dex */
public class GE2 {

    /* renamed from: a */
    public static HE2 f11185a;

    static {
        try {
            f11185a = m105606a();
        } catch (Exception e) {
            C49993ui6.m9851d("MDC binding unsuccessful.", e);
        } catch (NoClassDefFoundError e2) {
            f11185a = new C43962kY2();
            String message = e2.getMessage();
            if (message != null && message.contains("StaticMDCBinder")) {
                C49993ui6.m9852c("Failed to load class \"org.slf4j.impl.StaticMDCBinder\".");
                C49993ui6.m9852c("Defaulting to no-operation MDCAdapter implementation.");
                C49993ui6.m9852c("See http://www.slf4j.org/codes.html#no_static_mdc_binder for further details.");
                return;
            }
            throw e2;
        }
    }

    private GE2() {
    }

    /* renamed from: a */
    public static HE2 m105606a() throws NoClassDefFoundError {
        try {
            return C42114hQ5.m36433b().m36434a();
        } catch (NoSuchMethodError unused) {
            return C42114hQ5.f85179a.m36434a();
        }
    }

    /* renamed from: b */
    public static String m105605b(String str) throws IllegalArgumentException {
        if (str != null) {
            HE2 he2 = f11185a;
            if (he2 != null) {
                return he2.get(str);
            }
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        throw new IllegalArgumentException("key parameter cannot be null");
    }

    /* renamed from: c */
    public static HE2 m105604c() {
        return f11185a;
    }
}

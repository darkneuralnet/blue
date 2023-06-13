package p000;

import java.net.HttpURLConnection;
/* renamed from: ON1 */
/* loaded from: classes.dex */
public final class ON1 extends AbstractC5214MA {

    /* renamed from: a */
    public static final String f26445a = C50139ux2.m9434c();

    /* renamed from: b */
    public static ON1 f26446b;

    private ON1() {
    }

    /* renamed from: c */
    public static ON1 m92368c() {
        ON1 on1;
        synchronized (ON1.class) {
            if (f26446b == null) {
                f26446b = new ON1();
            }
            on1 = f26446b;
        }
        return on1;
    }

    @Override // p000.AbstractC5214MA
    /* renamed from: b */
    public HttpURLConnection mo92369b(HttpURLConnection httpURLConnection) {
        C32290Cx2.m111208g(f26445a, "Trying to connect to a URL that is not HTTPS.");
        return httpURLConnection;
    }
}

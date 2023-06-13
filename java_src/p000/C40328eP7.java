package p000;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* renamed from: eP7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C40328eP7 {

    /* renamed from: a */
    public static final String f78378a = "https://www.recaptcha.net";

    /* renamed from: b */
    public static final ExecutorService f78379b;

    static {
        Ch9.m111870a();
        f78379b = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
    }

    /* renamed from: a */
    public static final String m42894a() {
        String str = f78378a;
        StringBuilder sb = new StringBuilder(str.length() + 18);
        sb.append(str);
        sb.append("/recaptcha/api3/ae");
        return sb.toString();
    }

    /* renamed from: b */
    public static final String m42893b() {
        String str = f78378a;
        StringBuilder sb = new StringBuilder(str.length() + 18);
        sb.append(str);
        sb.append("/recaptcha/api3/ac");
        return sb.toString();
    }
}

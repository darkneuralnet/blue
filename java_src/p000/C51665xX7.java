package p000;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* renamed from: xX7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51665xX7 {

    /* renamed from: a */
    public static final String f117782a = "https://www.recaptcha.net";

    /* renamed from: b */
    public static final ExecutorService f117783b;

    static {
        Ch9.m111870a();
        f117783b = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
    }

    /* renamed from: a */
    public static final String m5041a() {
        String str = f117782a;
        StringBuilder sb = new StringBuilder(str.length() + 32);
        sb.append(str);
        sb.append("/recaptcha/api3/accountchallenge");
        return sb.toString();
    }

    /* renamed from: b */
    public static final String m5040b() {
        String str = f117782a;
        StringBuilder sb = new StringBuilder(str.length() + 29);
        sb.append(str);
        sb.append("/recaptcha/api3/accountverify");
        return sb.toString();
    }
}

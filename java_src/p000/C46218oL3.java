package p000;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLException;
/* renamed from: oL3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C46218oL3 extends C52162yN1<C46218oL3> {
    public C46218oL3() {
        m3541l(String.format("PayPalSDK/PayPalOneTouch-Android %s (%s; %s; %s)", "3.17.2", H21.m104486c(), H21.m104487b(), ""));
        m3543j((int) TimeUnit.SECONDS.toMillis(90L));
        try {
            m3542k(new C45151mY5(C43846kL3.m29050a()));
        } catch (SSLException unused) {
            m3542k(null);
        }
    }

    @Override // p000.C52162yN1
    /* renamed from: b */
    public HttpURLConnection mo3551b(String str) throws IOException {
        return super.mo3551b(str);
    }
}

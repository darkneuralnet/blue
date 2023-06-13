package p000;

import ch.qos.logback.core.CoreConstants;
import com.amazonaws.services.p026s3.internal.Constants;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.LongCompanionObject;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.platform.Platform;
/* renamed from: Wx2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C36970Wx2 implements Interceptor {

    /* renamed from: d */
    public static final Charset f42397d = Charset.forName(Constants.DEFAULT_ENCODING);

    /* renamed from: a */
    public final InterfaceC9245b f42398a;

    /* renamed from: b */
    public volatile EnumC9244a f42399b;

    /* renamed from: c */
    public Set<String> f42400c;

    /* renamed from: Wx2$a */
    /* loaded from: classes4.dex */
    public enum EnumC9244a {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    /* renamed from: Wx2$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC9245b {

        /* renamed from: a */
        public static final InterfaceC9245b f42406a = new C9246a();

        /* renamed from: Wx2$b$a */
        /* loaded from: classes4.dex */
        public class C9246a implements InterfaceC9245b {
            @Override // p000.C36970Wx2.InterfaceC9245b
            public void log(String str) {
                Platform.get().log(str, 4, null);
            }
        }

        void log(String str);
    }

    public C36970Wx2() {
        this(InterfaceC9245b.f42406a, new HashSet());
    }

    /* renamed from: c */
    public static boolean m77608c(C42488i30 c42488i30) {
        long j;
        try {
            C42488i30 c42488i302 = new C42488i30();
            if (c42488i30.size() < 64) {
                j = c42488i30.size();
            } else {
                j = 64;
            }
            c42488i30.m34553l(c42488i302, 0L, j);
            for (int i = 0; i < 16; i++) {
                if (!c42488i302.mo21945O2()) {
                    int m34572I = c42488i302.m34572I();
                    if (Character.isISOControl(m34572I) && !Character.isWhitespace(m34572I)) {
                        return false;
                    }
                } else {
                    return true;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final boolean m77609b(Headers headers) {
        String str = headers.get(com.amazonaws.services.p026s3.Headers.CONTENT_ENCODING);
        if (str != null && !str.equalsIgnoreCase("identity")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void m77607d(String str, boolean z) {
        if (z) {
            return;
        }
        this.f42398a.log(str);
    }

    /* renamed from: e */
    public C36970Wx2 m77606e(EnumC9244a enumC9244a) {
        if (enumC9244a != null) {
            this.f42399b = enumC9244a;
            return this;
        }
        throw new NullPointerException("level == null. Use Level.NONE instead.");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0126  */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Response intercept(Interceptor.Chain chain) throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Headers headers;
        String str7;
        int size;
        int i;
        EnumC9244a enumC9244a = this.f42399b;
        Request request = chain.request();
        if (enumC9244a == EnumC9244a.NONE) {
            return chain.proceed(request);
        }
        String httpUrl = request.url().toString();
        Iterator<String> it = this.f42400c.iterator();
        while (true) {
            z = true;
            if (it.hasNext()) {
                C41318g46.m40151m("url: " + httpUrl, new Object[0]);
                if (httpUrl.contains(it.next())) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (enumC9244a == EnumC9244a.BODY) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 && enumC9244a != EnumC9244a.HEADERS) {
            z4 = false;
        } else {
            z4 = true;
        }
        RequestBody body = request.body();
        if (body == null) {
            z = false;
        }
        Connection connection = chain.connection();
        StringBuilder sb = new StringBuilder();
        sb.append("--> ");
        sb.append(request.method());
        sb.append(' ');
        sb.append(request.url());
        if (connection == null) {
            str = "";
        } else {
            str = " " + connection.protocol();
        }
        sb.append(str);
        String sb2 = sb.toString();
        if (!z4 && z) {
            sb2 = sb2 + " (" + body.contentLength() + "-byte body)";
        }
        m77607d(sb2, z2);
        if (!z4) {
            str2 = "";
        } else {
            if (z) {
                if (body.contentType() != null) {
                    m77607d("Content-Type: " + body.contentType(), z2);
                }
                if (body.contentLength() != -1) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Content-Length: ");
                    str7 = "";
                    sb3.append(body.contentLength());
                    m77607d(sb3.toString(), z2);
                    Headers headers2 = request.headers();
                    size = headers2.size();
                    i = 0;
                    while (i < size) {
                        String name = headers2.name(i);
                        int i2 = size;
                        if (!"Content-Type".equalsIgnoreCase(name) && !"Content-Length".equalsIgnoreCase(name)) {
                            m77607d(name + ": " + headers2.value(i), z2);
                        }
                        i++;
                        size = i2;
                    }
                    if (!z3 && z) {
                        if (m77609b(request.headers())) {
                            m77607d("--> END " + request.method() + " (encoded body omitted)", z2);
                            str2 = str7;
                        } else {
                            C42488i30 c42488i30 = new C42488i30();
                            body.writeTo(c42488i30);
                            Charset charset = f42397d;
                            MediaType contentType = body.contentType();
                            if (contentType != null) {
                                charset = contentType.charset(charset);
                            }
                            str2 = str7;
                            m77607d(str2, z2);
                            if (m77608c(c42488i30)) {
                                m77607d(c42488i30.mo21938e1(charset), z2);
                                m77607d("--> END " + request.method() + " (" + body.contentLength() + "-byte body)", z2);
                            } else {
                                m77607d("--> END " + request.method() + " (binary " + body.contentLength() + "-byte body omitted)", z2);
                            }
                        }
                    } else {
                        str2 = str7;
                        m77607d("--> END " + request.method(), z2);
                    }
                }
            }
            str7 = "";
            Headers headers22 = request.headers();
            size = headers22.size();
            i = 0;
            while (i < size) {
            }
            if (!z3) {
            }
            str2 = str7;
            m77607d("--> END " + request.method(), z2);
        }
        long nanoTime = System.nanoTime();
        try {
            Response proceed = chain.proceed(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            ResponseBody body2 = proceed.body();
            long contentLength = body2.contentLength();
            if (contentLength == -1) {
                str3 = "-byte body)";
                str4 = "unknown-length";
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(contentLength);
                str3 = "-byte body)";
                sb4.append("-byte");
                str4 = sb4.toString();
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append("<-- ");
            sb5.append(proceed.code());
            if (proceed.message().isEmpty()) {
                str5 = str2;
            } else {
                str5 = ' ' + proceed.message();
            }
            sb5.append(str5);
            sb5.append(' ');
            sb5.append(proceed.request().url());
            sb5.append(" (");
            sb5.append(millis);
            sb5.append("ms");
            if (!z4) {
                str6 = ", " + str4 + " body";
            } else {
                str6 = str2;
            }
            sb5.append(str6);
            sb5.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            m77607d(sb5.toString(), z2);
            if (z4) {
                int size2 = proceed.headers().size();
                for (int i3 = 0; i3 < size2; i3++) {
                    m77607d(headers.name(i3) + ": " + headers.value(i3), z2);
                }
                if (z3 && HttpHeaders.hasBody(proceed)) {
                    if (m77609b(proceed.headers())) {
                        m77607d("<-- END HTTP (encoded body omitted)", z2);
                    } else {
                        InterfaceC46046o30 source = body2.source();
                        source.mo21935o(LongCompanionObject.MAX_VALUE);
                        C42488i30 mo21947F1 = source.mo21947F1();
                        Charset charset2 = f42397d;
                        MediaType contentType2 = body2.contentType();
                        if (contentType2 != null) {
                            charset2 = contentType2.charset(charset2);
                        }
                        if (!m77608c(mo21947F1)) {
                            m77607d(str2, z2);
                            m77607d("<-- END HTTP (binary " + mo21947F1.size() + "-byte body omitted)", z2);
                            return proceed;
                        }
                        if (contentLength != 0) {
                            m77607d(str2, z2);
                            m77607d(mo21947F1.clone().mo21938e1(charset2), z2);
                        }
                        m77607d("<-- END HTTP (" + mo21947F1.size() + str3, z2);
                    }
                } else {
                    m77607d("<-- END HTTP", z2);
                }
            }
            return proceed;
        } catch (Exception e) {
            m77607d("<-- HTTP FAILED: " + e, z2);
            throw e;
        }
    }

    public C36970Wx2(InterfaceC9245b interfaceC9245b, Set<String> set) {
        this.f42400c = new HashSet();
        this.f42399b = EnumC9244a.NONE;
        this.f42398a = interfaceC9245b;
        this.f42400c = set;
    }
}

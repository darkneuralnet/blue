package p000;

import android.net.Uri;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C47054pl1;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002R\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"LRX1;", "", "Lpl1;", C17296a.f69688o, "Landroid/net/Uri;", "uri", "Ljava/io/InputStream;", "b", "Ljava/net/HttpURLConnection;", "connection", "c", "", DateTokenConverter.CONVERTER_KEY, "", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "Lpl1;", "imageCache", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: RX1 */
/* loaded from: classes5.dex */
public final class RX1 {

    /* renamed from: a */
    public static final String f32140a;

    /* renamed from: b */
    public static C47054pl1 f32141b;

    /* renamed from: c */
    public static final RX1 f32142c = new RX1();

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0010"}, m28432d2 = {"LRX1$a;", "Ljava/io/BufferedInputStream;", "", "close", "Ljava/net/HttpURLConnection;", "b", "Ljava/net/HttpURLConnection;", "getConnection", "()Ljava/net/HttpURLConnection;", "setConnection", "(Ljava/net/HttpURLConnection;)V", "connection", "Ljava/io/InputStream;", "stream", "<init>", "(Ljava/io/InputStream;Ljava/net/HttpURLConnection;)V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: RX1$a */
    /* loaded from: classes5.dex */
    public static final class C7186a extends BufferedInputStream {

        /* renamed from: b */
        public HttpURLConnection f32143b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7186a(InputStream inputStream, HttpURLConnection connection) {
            super(inputStream, 8192);
            Intrinsics.checkNotNullParameter(connection, "connection");
            this.f32143b = connection;
        }

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            C52364yi6.m2825n(this.f32143b);
        }
    }

    static {
        String simpleName = RX1.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "ImageResponseCache::class.java.simpleName");
        f32140a = simpleName;
    }

    private RX1() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final synchronized C47054pl1 m86642a() throws IOException {
        C47054pl1 c47054pl1;
        synchronized (RX1.class) {
            if (f32141b == null) {
                f32141b = new C47054pl1(f32140a, new C47054pl1.C27376e());
            }
            c47054pl1 = f32141b;
            if (c47054pl1 == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        return c47054pl1;
    }

    @JvmStatic
    /* renamed from: b */
    public static final InputStream m86641b(Uri uri) {
        if (uri == null || !f32142c.m86639d(uri)) {
            return null;
        }
        try {
            C47054pl1 m86642a = m86642a();
            String uri2 = uri.toString();
            Intrinsics.checkNotNullExpressionValue(uri2, "uri.toString()");
            return C47054pl1.m18817i(m86642a, uri2, null, 2, null);
        } catch (IOException e) {
            C32992Fx2.f10539f.m106216a(EnumC36034Sx2.CACHE, 5, f32140a, e.toString());
            return null;
        }
    }

    @JvmStatic
    /* renamed from: c */
    public static final InputStream m86640c(HttpURLConnection connection) throws IOException {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (connection.getResponseCode() == 200) {
            Uri parse = Uri.parse(connection.getURL().toString());
            InputStream inputStream = connection.getInputStream();
            try {
                if (f32142c.m86639d(parse)) {
                    C47054pl1 m86642a = m86642a();
                    String uri = parse.toString();
                    Intrinsics.checkNotNullExpressionValue(uri, "uri.toString()");
                    return m86642a.m18816j(uri, new C7186a(inputStream, connection));
                }
                return inputStream;
            } catch (IOException unused) {
                return inputStream;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final boolean m86639d(Uri uri) {
        boolean startsWith$default;
        boolean endsWith$default;
        boolean endsWith$default2;
        if (uri != null) {
            String host = uri.getHost();
            if (host != null) {
                endsWith$default2 = StringsKt__StringsJVMKt.endsWith$default(host, "fbcdn.net", false, 2, null);
                if (endsWith$default2) {
                    return true;
                }
            }
            if (host != null) {
                startsWith$default = StringsKt__StringsJVMKt.startsWith$default(host, "fbcdn", false, 2, null);
                if (startsWith$default) {
                    endsWith$default = StringsKt__StringsJVMKt.endsWith$default(host, "akamaihd.net", false, 2, null);
                    if (endsWith$default) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

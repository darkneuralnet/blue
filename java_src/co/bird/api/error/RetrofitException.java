package co.bird.api.error;

import java.io.IOException;
import java.lang.annotation.Annotation;
import okhttp3.Request;
/* loaded from: classes4.dex */
public class RetrofitException extends RuntimeException {

    /* renamed from: b */
    public final String f68182b;

    /* renamed from: c */
    public final HM4 f68183c;

    /* renamed from: d */
    public final EnumC16708a f68184d;

    /* renamed from: e */
    public final MN4 f68185e;

    /* renamed from: f */
    public final C51174wi2 f68186f;

    /* renamed from: co.bird.api.error.RetrofitException$a */
    /* loaded from: classes4.dex */
    public enum EnumC16708a {
        NETWORK,
        HTTP,
        UNEXPECTED
    }

    public RetrofitException(String str, String str2, HM4 hm4, EnumC16708a enumC16708a, Throwable th, MN4 mn4, C51174wi2 c51174wi2) {
        super(str, th);
        this.f68182b = str2;
        this.f68183c = hm4;
        this.f68184d = enumC16708a;
        this.f68185e = mn4;
        this.f68186f = c51174wi2;
    }

    /* renamed from: d */
    public static RetrofitException m53926d(HM4 hm4, C51174wi2 c51174wi2) {
        return new RetrofitException(hm4.m103943b() + " " + hm4.m103938g(), hm4.m103937h().request().url().toString(), hm4, EnumC16708a.HTTP, null, null, c51174wi2);
    }

    /* renamed from: e */
    public static RetrofitException m53925e(String str, HM4 hm4, MN4 mn4) {
        return new RetrofitException(hm4.m103943b() + " " + hm4.m103938g(), str, hm4, EnumC16708a.HTTP, null, mn4, null);
    }

    /* renamed from: f */
    public static RetrofitException m53924f(IOException iOException) {
        return new RetrofitException(iOException.getMessage(), null, null, EnumC16708a.NETWORK, iOException, null, null);
    }

    /* renamed from: g */
    public static RetrofitException m53923g(Throwable th, Request request) {
        return new RetrofitException("Error handling request for '" + request.url().encodedPath() + "' with message: " + th.getMessage(), null, null, EnumC16708a.UNEXPECTED, th, null, null);
    }

    /* renamed from: a */
    public <T> T m53929a(Class<T> cls) throws IOException {
        HM4 hm4 = this.f68183c;
        if (hm4 != null && hm4.m103940e() != null) {
            MN4 mn4 = this.f68185e;
            if (mn4 != null) {
                return mn4.m95378i(cls, new Annotation[0]).convert(this.f68183c.m103940e());
            }
            C51174wi2 c51174wi2 = this.f68186f;
            if (c51174wi2 != null) {
                return (T) c51174wi2.m6456f(this.f68183c.m103940e().string(), cls);
            }
        }
        return null;
    }

    /* renamed from: b */
    public EnumC16708a m53928b() {
        return this.f68184d;
    }

    /* renamed from: c */
    public HM4 m53927c() {
        return this.f68183c;
    }
}

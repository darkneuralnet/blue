package p000;

import androidx.recyclerview.widget.C11925l;
import java.util.Objects;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p000.C34226Le3;
/* renamed from: HM4 */
/* loaded from: classes8.dex */
public final class HM4<T> {

    /* renamed from: a */
    public final Response f13311a;

    /* renamed from: b */
    public final T f13312b;

    /* renamed from: c */
    public final ResponseBody f13313c;

    public HM4(Response response, T t, ResponseBody responseBody) {
        this.f13311a = response;
        this.f13312b = t;
        this.f13313c = responseBody;
    }

    /* renamed from: c */
    public static <T> HM4<T> m103942c(int i, ResponseBody responseBody) {
        Objects.requireNonNull(responseBody, "body == null");
        if (i >= 400) {
            return m103941d(responseBody, new Response.Builder().body(new C34226Le3.C5054c(responseBody.contentType(), responseBody.contentLength())).code(i).message("Response.error()").protocol(Protocol.HTTP_1_1).request(new Request.Builder().url("http://localhost/").build()).build());
        }
        throw new IllegalArgumentException("code < 400: " + i);
    }

    /* renamed from: d */
    public static <T> HM4<T> m103941d(ResponseBody responseBody, Response response) {
        Objects.requireNonNull(responseBody, "body == null");
        Objects.requireNonNull(response, "rawResponse == null");
        if (!response.isSuccessful()) {
            return new HM4<>(response, null, responseBody);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    /* renamed from: i */
    public static <T> HM4<T> m103936i(int i, T t) {
        if (i >= 200 && i < 300) {
            return m103934k(t, new Response.Builder().code(i).message("Response.success()").protocol(Protocol.HTTP_1_1).request(new Request.Builder().url("http://localhost/").build()).build());
        }
        throw new IllegalArgumentException("code < 200 or >= 300: " + i);
    }

    /* renamed from: j */
    public static <T> HM4<T> m103935j(T t) {
        return m103934k(t, new Response.Builder().code(C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION).message("OK").protocol(Protocol.HTTP_1_1).request(new Request.Builder().url("http://localhost/").build()).build());
    }

    /* renamed from: k */
    public static <T> HM4<T> m103934k(T t, Response response) {
        Objects.requireNonNull(response, "rawResponse == null");
        if (response.isSuccessful()) {
            return new HM4<>(response, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    /* renamed from: a */
    public T m103944a() {
        return this.f13312b;
    }

    /* renamed from: b */
    public int m103943b() {
        return this.f13311a.code();
    }

    /* renamed from: e */
    public ResponseBody m103940e() {
        return this.f13313c;
    }

    /* renamed from: f */
    public boolean m103939f() {
        return this.f13311a.isSuccessful();
    }

    /* renamed from: g */
    public String m103938g() {
        return this.f13311a.message();
    }

    /* renamed from: h */
    public Response m103937h() {
        return this.f13311a;
    }

    public String toString() {
        return this.f13311a.toString();
    }
}

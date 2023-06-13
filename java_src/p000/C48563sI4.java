package p000;

import java.io.IOException;
import java.util.regex.Pattern;
import kotlin.UByte;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
/* renamed from: sI4  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48563sI4 {

    /* renamed from: l */
    public static final char[] f108547l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m */
    public static final Pattern f108548m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a */
    public final String f108549a;

    /* renamed from: b */
    public final HttpUrl f108550b;

    /* renamed from: c */
    public String f108551c;

    /* renamed from: d */
    public HttpUrl.Builder f108552d;

    /* renamed from: e */
    public final Request.Builder f108553e = new Request.Builder();

    /* renamed from: f */
    public final Headers.Builder f108554f;

    /* renamed from: g */
    public MediaType f108555g;

    /* renamed from: h */
    public final boolean f108556h;

    /* renamed from: i */
    public MultipartBody.Builder f108557i;

    /* renamed from: j */
    public FormBody.Builder f108558j;

    /* renamed from: k */
    public RequestBody f108559k;

    /* renamed from: sI4$a */
    /* loaded from: classes8.dex */
    public static class C28254a extends RequestBody {

        /* renamed from: a */
        public final RequestBody f108560a;

        /* renamed from: b */
        public final MediaType f108561b;

        public C28254a(RequestBody requestBody, MediaType mediaType) {
            this.f108560a = requestBody;
            this.f108561b = mediaType;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() throws IOException {
            return this.f108560a.contentLength();
        }

        @Override // okhttp3.RequestBody
        public MediaType contentType() {
            return this.f108561b;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(InterfaceC45453n30 interfaceC45453n30) throws IOException {
            this.f108560a.writeTo(interfaceC45453n30);
        }
    }

    public C48563sI4(String str, HttpUrl httpUrl, String str2, Headers headers, MediaType mediaType, boolean z, boolean z2, boolean z3) {
        this.f108549a = str;
        this.f108550b = httpUrl;
        this.f108551c = str2;
        this.f108555g = mediaType;
        this.f108556h = z;
        if (headers != null) {
            this.f108554f = headers.newBuilder();
        } else {
            this.f108554f = new Headers.Builder();
        }
        if (z2) {
            this.f108558j = new FormBody.Builder();
        } else if (z3) {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            this.f108557i = builder;
            builder.setType(MultipartBody.FORM);
        }
    }

    /* renamed from: i */
    public static String m14467i(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt >= 32 && codePointAt < 127 && " \"<>^`{}|\\?#".indexOf(codePointAt) == -1 && (z || (codePointAt != 47 && codePointAt != 37))) {
                i += Character.charCount(codePointAt);
            } else {
                C42488i30 c42488i30 = new C42488i30();
                c42488i30.mo24526g0(str, 0, i);
                m14466j(c42488i30, str, i, length, z);
                return c42488i30.mo21932r1();
            }
        }
        return str;
    }

    /* renamed from: j */
    public static void m14466j(C42488i30 c42488i30, String str, int i, int i2, boolean z) {
        C42488i30 c42488i302 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt >= 32 && codePointAt < 127 && " \"<>^`{}|\\?#".indexOf(codePointAt) == -1 && (z || (codePointAt != 47 && codePointAt != 37))) {
                    c42488i30.m34541u0(codePointAt);
                } else {
                    if (c42488i302 == null) {
                        c42488i302 = new C42488i30();
                    }
                    c42488i302.m34541u0(codePointAt);
                    while (!c42488i302.mo21945O2()) {
                        int readByte = c42488i302.readByte() & UByte.MAX_VALUE;
                        c42488i30.mo24534M0(37);
                        char[] cArr = f108547l;
                        c42488i30.mo24534M0(cArr[(readByte >> 4) & 15]);
                        c42488i30.mo24534M0(cArr[readByte & 15]);
                    }
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: a */
    public void m14475a(String str, String str2, boolean z) {
        if (z) {
            this.f108558j.addEncoded(str, str2);
        } else {
            this.f108558j.add(str, str2);
        }
    }

    /* renamed from: b */
    public void m14474b(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.f108555g = MediaType.get(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Malformed content type: " + str2, e);
            }
        }
        this.f108554f.add(str, str2);
    }

    /* renamed from: c */
    public void m14473c(Headers headers) {
        this.f108554f.addAll(headers);
    }

    /* renamed from: d */
    public void m14472d(Headers headers, RequestBody requestBody) {
        this.f108557i.addPart(headers, requestBody);
    }

    /* renamed from: e */
    public void m14471e(MultipartBody.Part part) {
        this.f108557i.addPart(part);
    }

    /* renamed from: f */
    public void m14470f(String str, String str2, boolean z) {
        if (this.f108551c != null) {
            String m14467i = m14467i(str2, z);
            String str3 = this.f108551c;
            String replace = str3.replace("{" + str + "}", m14467i);
            if (!f108548m.matcher(replace).matches()) {
                this.f108551c = replace;
                return;
            }
            throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
        }
        throw new AssertionError();
    }

    /* renamed from: g */
    public void m14469g(String str, String str2, boolean z) {
        String str3 = this.f108551c;
        if (str3 != null) {
            HttpUrl.Builder newBuilder = this.f108550b.newBuilder(str3);
            this.f108552d = newBuilder;
            if (newBuilder != null) {
                this.f108551c = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f108550b + ", Relative: " + this.f108551c);
            }
        }
        if (z) {
            this.f108552d.addEncodedQueryParameter(str, str2);
        } else {
            this.f108552d.addQueryParameter(str, str2);
        }
    }

    /* renamed from: h */
    public <T> void m14468h(Class<T> cls, T t) {
        this.f108553e.tag(cls, t);
    }

    /* renamed from: k */
    public Request.Builder m14465k() {
        HttpUrl resolve;
        HttpUrl.Builder builder = this.f108552d;
        if (builder != null) {
            resolve = builder.build();
        } else {
            resolve = this.f108550b.resolve(this.f108551c);
            if (resolve == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f108550b + ", Relative: " + this.f108551c);
            }
        }
        C28254a c28254a = this.f108559k;
        if (c28254a == null) {
            FormBody.Builder builder2 = this.f108558j;
            if (builder2 != null) {
                c28254a = builder2.build();
            } else {
                MultipartBody.Builder builder3 = this.f108557i;
                if (builder3 != null) {
                    c28254a = builder3.build();
                } else if (this.f108556h) {
                    c28254a = RequestBody.create((MediaType) null, new byte[0]);
                }
            }
        }
        MediaType mediaType = this.f108555g;
        if (mediaType != null) {
            if (c28254a != null) {
                c28254a = new C28254a(c28254a, mediaType);
            } else {
                this.f108554f.add("Content-Type", mediaType.toString());
            }
        }
        return this.f108553e.url(resolve).headers(this.f108554f.build()).method(this.f108549a, c28254a);
    }

    /* renamed from: l */
    public void m14464l(RequestBody requestBody) {
        this.f108559k = requestBody;
    }

    /* renamed from: m */
    public void m14463m(Object obj) {
        this.f108551c = obj.toString();
    }
}

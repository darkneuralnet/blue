package p000;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
/* renamed from: IE3 */
/* loaded from: classes8.dex */
public abstract class IE3<T> {

    /* renamed from: IE3$a */
    /* loaded from: classes8.dex */
    public class C3409a extends IE3<Iterable<T>> {
        public C3409a() {
        }

        @Override // p000.IE3
        /* renamed from: d */
        public void mo102760a(C48563sI4 c48563sI4, Iterable<T> iterable) throws IOException {
            if (iterable == null) {
                return;
            }
            for (T t : iterable) {
                IE3.this.mo102760a(c48563sI4, t);
            }
        }
    }

    /* renamed from: IE3$b */
    /* loaded from: classes8.dex */
    public class C3410b extends IE3<Object> {
        public C3410b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.IE3
        /* renamed from: a */
        public void mo102760a(C48563sI4 c48563sI4, Object obj) throws IOException {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                IE3.this.mo102760a(c48563sI4, Array.get(obj, i));
            }
        }
    }

    /* renamed from: IE3$c */
    /* loaded from: classes8.dex */
    public static final class C3411c<T> extends IE3<T> {

        /* renamed from: a */
        public final Method f14833a;

        /* renamed from: b */
        public final int f14834b;

        /* renamed from: c */
        public final InterfaceC48496sB0<T, RequestBody> f14835c;

        public C3411c(Method method, int i, InterfaceC48496sB0<T, RequestBody> interfaceC48496sB0) {
            this.f14833a = method;
            this.f14834b = i;
            this.f14835c = interfaceC48496sB0;
        }

        @Override // p000.IE3
        /* renamed from: a */
        public void mo102760a(C48563sI4 c48563sI4, T t) {
            if (t != null) {
                try {
                    c48563sI4.m14464l(this.f14835c.convert(t));
                    return;
                } catch (IOException e) {
                    Method method = this.f14833a;
                    int i = this.f14834b;
                    throw C34031Ki6.m98468p(method, e, i, "Unable to convert " + t + " to RequestBody", new Object[0]);
                }
            }
            throw C34031Ki6.m98469o(this.f14833a, this.f14834b, "Body parameter value must not be null.", new Object[0]);
        }
    }

    /* renamed from: IE3$d */
    /* loaded from: classes8.dex */
    public static final class C3412d<T> extends IE3<T> {

        /* renamed from: a */
        public final String f14836a;

        /* renamed from: b */
        public final InterfaceC48496sB0<T, String> f14837b;

        /* renamed from: c */
        public final boolean f14838c;

        public C3412d(String str, InterfaceC48496sB0<T, String> interfaceC48496sB0, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.f14836a = str;
            this.f14837b = interfaceC48496sB0;
            this.f14838c = z;
        }

        @Override // p000.IE3
        /* renamed from: a */
        public void mo102760a(C48563sI4 c48563sI4, T t) throws IOException {
            String convert;
            if (t == null || (convert = this.f14837b.convert(t)) == null) {
                return;
            }
            c48563sI4.m14475a(this.f14836a, convert, this.f14838c);
        }
    }

    /* renamed from: IE3$e */
    /* loaded from: classes8.dex */
    public static final class C3413e<T> extends IE3<Map<String, T>> {

        /* renamed from: a */
        public final Method f14839a;

        /* renamed from: b */
        public final int f14840b;

        /* renamed from: c */
        public final InterfaceC48496sB0<T, String> f14841c;

        /* renamed from: d */
        public final boolean f14842d;

        public C3413e(Method method, int i, InterfaceC48496sB0<T, String> interfaceC48496sB0, boolean z) {
            this.f14839a = method;
            this.f14840b = i;
            this.f14841c = interfaceC48496sB0;
            this.f14842d = z;
        }

        @Override // p000.IE3
        /* renamed from: d */
        public void mo102760a(C48563sI4 c48563sI4, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            String convert = this.f14841c.convert(value);
                            if (convert != null) {
                                c48563sI4.m14475a(key, convert, this.f14842d);
                            } else {
                                Method method = this.f14839a;
                                int i = this.f14840b;
                                throw C34031Ki6.m98469o(method, i, "Field map value '" + value + "' converted to null by " + this.f14841c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                            }
                        } else {
                            Method method2 = this.f14839a;
                            int i2 = this.f14840b;
                            throw C34031Ki6.m98469o(method2, i2, "Field map contained null value for key '" + key + "'.", new Object[0]);
                        }
                    } else {
                        throw C34031Ki6.m98469o(this.f14839a, this.f14840b, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C34031Ki6.m98469o(this.f14839a, this.f14840b, "Field map was null.", new Object[0]);
        }
    }

    /* renamed from: IE3$f */
    /* loaded from: classes8.dex */
    public static final class C3414f<T> extends IE3<T> {

        /* renamed from: a */
        public final String f14843a;

        /* renamed from: b */
        public final InterfaceC48496sB0<T, String> f14844b;

        public C3414f(String str, InterfaceC48496sB0<T, String> interfaceC48496sB0) {
            Objects.requireNonNull(str, "name == null");
            this.f14843a = str;
            this.f14844b = interfaceC48496sB0;
        }

        @Override // p000.IE3
        /* renamed from: a */
        public void mo102760a(C48563sI4 c48563sI4, T t) throws IOException {
            String convert;
            if (t == null || (convert = this.f14844b.convert(t)) == null) {
                return;
            }
            c48563sI4.m14474b(this.f14843a, convert);
        }
    }

    /* renamed from: IE3$g */
    /* loaded from: classes8.dex */
    public static final class C3415g<T> extends IE3<Map<String, T>> {

        /* renamed from: a */
        public final Method f14845a;

        /* renamed from: b */
        public final int f14846b;

        /* renamed from: c */
        public final InterfaceC48496sB0<T, String> f14847c;

        public C3415g(Method method, int i, InterfaceC48496sB0<T, String> interfaceC48496sB0) {
            this.f14845a = method;
            this.f14846b = i;
            this.f14847c = interfaceC48496sB0;
        }

        @Override // p000.IE3
        /* renamed from: d */
        public void mo102760a(C48563sI4 c48563sI4, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            c48563sI4.m14474b(key, this.f14847c.convert(value));
                        } else {
                            Method method = this.f14845a;
                            int i = this.f14846b;
                            throw C34031Ki6.m98469o(method, i, "Header map contained null value for key '" + key + "'.", new Object[0]);
                        }
                    } else {
                        throw C34031Ki6.m98469o(this.f14845a, this.f14846b, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C34031Ki6.m98469o(this.f14845a, this.f14846b, "Header map was null.", new Object[0]);
        }
    }

    /* renamed from: IE3$h */
    /* loaded from: classes8.dex */
    public static final class C3416h extends IE3<Headers> {

        /* renamed from: a */
        public final Method f14848a;

        /* renamed from: b */
        public final int f14849b;

        public C3416h(Method method, int i) {
            this.f14848a = method;
            this.f14849b = i;
        }

        @Override // p000.IE3
        /* renamed from: d */
        public void mo102760a(C48563sI4 c48563sI4, Headers headers) {
            if (headers != null) {
                c48563sI4.m14473c(headers);
                return;
            }
            throw C34031Ki6.m98469o(this.f14848a, this.f14849b, "Headers parameter must not be null.", new Object[0]);
        }
    }

    /* renamed from: IE3$i */
    /* loaded from: classes8.dex */
    public static final class C3417i<T> extends IE3<T> {

        /* renamed from: a */
        public final Method f14850a;

        /* renamed from: b */
        public final int f14851b;

        /* renamed from: c */
        public final Headers f14852c;

        /* renamed from: d */
        public final InterfaceC48496sB0<T, RequestBody> f14853d;

        public C3417i(Method method, int i, Headers headers, InterfaceC48496sB0<T, RequestBody> interfaceC48496sB0) {
            this.f14850a = method;
            this.f14851b = i;
            this.f14852c = headers;
            this.f14853d = interfaceC48496sB0;
        }

        @Override // p000.IE3
        /* renamed from: a */
        public void mo102760a(C48563sI4 c48563sI4, T t) {
            if (t == null) {
                return;
            }
            try {
                c48563sI4.m14472d(this.f14852c, this.f14853d.convert(t));
            } catch (IOException e) {
                Method method = this.f14850a;
                int i = this.f14851b;
                throw C34031Ki6.m98469o(method, i, "Unable to convert " + t + " to RequestBody", e);
            }
        }
    }

    /* renamed from: IE3$j */
    /* loaded from: classes8.dex */
    public static final class C3418j<T> extends IE3<Map<String, T>> {

        /* renamed from: a */
        public final Method f14854a;

        /* renamed from: b */
        public final int f14855b;

        /* renamed from: c */
        public final InterfaceC48496sB0<T, RequestBody> f14856c;

        /* renamed from: d */
        public final String f14857d;

        public C3418j(Method method, int i, InterfaceC48496sB0<T, RequestBody> interfaceC48496sB0, String str) {
            this.f14854a = method;
            this.f14855b = i;
            this.f14856c = interfaceC48496sB0;
            this.f14857d = str;
        }

        @Override // p000.IE3
        /* renamed from: d */
        public void mo102760a(C48563sI4 c48563sI4, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            c48563sI4.m14472d(Headers.m20547of(com.amazonaws.services.p026s3.Headers.CONTENT_DISPOSITION, "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.f14857d), this.f14856c.convert(value));
                        } else {
                            Method method = this.f14854a;
                            int i = this.f14855b;
                            throw C34031Ki6.m98469o(method, i, "Part map contained null value for key '" + key + "'.", new Object[0]);
                        }
                    } else {
                        throw C34031Ki6.m98469o(this.f14854a, this.f14855b, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C34031Ki6.m98469o(this.f14854a, this.f14855b, "Part map was null.", new Object[0]);
        }
    }

    /* renamed from: IE3$k */
    /* loaded from: classes8.dex */
    public static final class C3419k<T> extends IE3<T> {

        /* renamed from: a */
        public final Method f14858a;

        /* renamed from: b */
        public final int f14859b;

        /* renamed from: c */
        public final String f14860c;

        /* renamed from: d */
        public final InterfaceC48496sB0<T, String> f14861d;

        /* renamed from: e */
        public final boolean f14862e;

        public C3419k(Method method, int i, String str, InterfaceC48496sB0<T, String> interfaceC48496sB0, boolean z) {
            this.f14858a = method;
            this.f14859b = i;
            Objects.requireNonNull(str, "name == null");
            this.f14860c = str;
            this.f14861d = interfaceC48496sB0;
            this.f14862e = z;
        }

        @Override // p000.IE3
        /* renamed from: a */
        public void mo102760a(C48563sI4 c48563sI4, T t) throws IOException {
            if (t != null) {
                c48563sI4.m14470f(this.f14860c, this.f14861d.convert(t), this.f14862e);
                return;
            }
            Method method = this.f14858a;
            int i = this.f14859b;
            throw C34031Ki6.m98469o(method, i, "Path parameter \"" + this.f14860c + "\" value must not be null.", new Object[0]);
        }
    }

    /* renamed from: IE3$l */
    /* loaded from: classes8.dex */
    public static final class C3420l<T> extends IE3<T> {

        /* renamed from: a */
        public final String f14863a;

        /* renamed from: b */
        public final InterfaceC48496sB0<T, String> f14864b;

        /* renamed from: c */
        public final boolean f14865c;

        public C3420l(String str, InterfaceC48496sB0<T, String> interfaceC48496sB0, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.f14863a = str;
            this.f14864b = interfaceC48496sB0;
            this.f14865c = z;
        }

        @Override // p000.IE3
        /* renamed from: a */
        public void mo102760a(C48563sI4 c48563sI4, T t) throws IOException {
            String convert;
            if (t == null || (convert = this.f14864b.convert(t)) == null) {
                return;
            }
            c48563sI4.m14469g(this.f14863a, convert, this.f14865c);
        }
    }

    /* renamed from: IE3$m */
    /* loaded from: classes8.dex */
    public static final class C3421m<T> extends IE3<Map<String, T>> {

        /* renamed from: a */
        public final Method f14866a;

        /* renamed from: b */
        public final int f14867b;

        /* renamed from: c */
        public final InterfaceC48496sB0<T, String> f14868c;

        /* renamed from: d */
        public final boolean f14869d;

        public C3421m(Method method, int i, InterfaceC48496sB0<T, String> interfaceC48496sB0, boolean z) {
            this.f14866a = method;
            this.f14867b = i;
            this.f14868c = interfaceC48496sB0;
            this.f14869d = z;
        }

        @Override // p000.IE3
        /* renamed from: d */
        public void mo102760a(C48563sI4 c48563sI4, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            String convert = this.f14868c.convert(value);
                            if (convert != null) {
                                c48563sI4.m14469g(key, convert, this.f14869d);
                            } else {
                                Method method = this.f14866a;
                                int i = this.f14867b;
                                throw C34031Ki6.m98469o(method, i, "Query map value '" + value + "' converted to null by " + this.f14868c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                            }
                        } else {
                            Method method2 = this.f14866a;
                            int i2 = this.f14867b;
                            throw C34031Ki6.m98469o(method2, i2, "Query map contained null value for key '" + key + "'.", new Object[0]);
                        }
                    } else {
                        throw C34031Ki6.m98469o(this.f14866a, this.f14867b, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C34031Ki6.m98469o(this.f14866a, this.f14867b, "Query map was null", new Object[0]);
        }
    }

    /* renamed from: IE3$n */
    /* loaded from: classes8.dex */
    public static final class C3422n<T> extends IE3<T> {

        /* renamed from: a */
        public final InterfaceC48496sB0<T, String> f14870a;

        /* renamed from: b */
        public final boolean f14871b;

        public C3422n(InterfaceC48496sB0<T, String> interfaceC48496sB0, boolean z) {
            this.f14870a = interfaceC48496sB0;
            this.f14871b = z;
        }

        @Override // p000.IE3
        /* renamed from: a */
        public void mo102760a(C48563sI4 c48563sI4, T t) throws IOException {
            if (t == null) {
                return;
            }
            c48563sI4.m14469g(this.f14870a.convert(t), null, this.f14871b);
        }
    }

    /* renamed from: IE3$o */
    /* loaded from: classes8.dex */
    public static final class C3423o extends IE3<MultipartBody.Part> {

        /* renamed from: a */
        public static final C3423o f14872a = new C3423o();

        private C3423o() {
        }

        @Override // p000.IE3
        /* renamed from: d */
        public void mo102760a(C48563sI4 c48563sI4, MultipartBody.Part part) {
            if (part != null) {
                c48563sI4.m14471e(part);
            }
        }
    }

    /* renamed from: IE3$p */
    /* loaded from: classes8.dex */
    public static final class C3424p extends IE3<Object> {

        /* renamed from: a */
        public final Method f14873a;

        /* renamed from: b */
        public final int f14874b;

        public C3424p(Method method, int i) {
            this.f14873a = method;
            this.f14874b = i;
        }

        @Override // p000.IE3
        /* renamed from: a */
        public void mo102760a(C48563sI4 c48563sI4, Object obj) {
            if (obj != null) {
                c48563sI4.m14463m(obj);
                return;
            }
            throw C34031Ki6.m98469o(this.f14873a, this.f14874b, "@Url parameter is null.", new Object[0]);
        }
    }

    /* renamed from: IE3$q */
    /* loaded from: classes8.dex */
    public static final class C3425q<T> extends IE3<T> {

        /* renamed from: a */
        public final Class<T> f14875a;

        public C3425q(Class<T> cls) {
            this.f14875a = cls;
        }

        @Override // p000.IE3
        /* renamed from: a */
        public void mo102760a(C48563sI4 c48563sI4, T t) {
            c48563sI4.m14468h(this.f14875a, t);
        }
    }

    /* renamed from: a */
    public abstract void mo102760a(C48563sI4 c48563sI4, T t) throws IOException;

    /* renamed from: b */
    public final IE3<Object> m102769b() {
        return new C3410b();
    }

    /* renamed from: c */
    public final IE3<Iterable<T>> m102768c() {
        return new C3409a();
    }
}

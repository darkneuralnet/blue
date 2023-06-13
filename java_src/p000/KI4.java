package p000;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.coroutines.Continuation;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import p000.IE3;
/* renamed from: KI4 */
/* loaded from: classes8.dex */
public final class KI4 {

    /* renamed from: a */
    public final Method f19382a;

    /* renamed from: b */
    public final HttpUrl f19383b;

    /* renamed from: c */
    public final String f19384c;

    /* renamed from: d */
    public final String f19385d;

    /* renamed from: e */
    public final Headers f19386e;

    /* renamed from: f */
    public final MediaType f19387f;

    /* renamed from: g */
    public final boolean f19388g;

    /* renamed from: h */
    public final boolean f19389h;

    /* renamed from: i */
    public final boolean f19390i;

    /* renamed from: j */
    public final IE3<?>[] f19391j;

    /* renamed from: k */
    public final boolean f19392k;

    /* renamed from: KI4$a */
    /* loaded from: classes8.dex */
    public static final class C4392a {

        /* renamed from: x */
        public static final Pattern f19393x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: y */
        public static final Pattern f19394y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a */
        public final MN4 f19395a;

        /* renamed from: b */
        public final Method f19396b;

        /* renamed from: c */
        public final Annotation[] f19397c;

        /* renamed from: d */
        public final Annotation[][] f19398d;

        /* renamed from: e */
        public final Type[] f19399e;

        /* renamed from: f */
        public boolean f19400f;

        /* renamed from: g */
        public boolean f19401g;

        /* renamed from: h */
        public boolean f19402h;

        /* renamed from: i */
        public boolean f19403i;

        /* renamed from: j */
        public boolean f19404j;

        /* renamed from: k */
        public boolean f19405k;

        /* renamed from: l */
        public boolean f19406l;

        /* renamed from: m */
        public boolean f19407m;

        /* renamed from: n */
        public String f19408n;

        /* renamed from: o */
        public boolean f19409o;

        /* renamed from: p */
        public boolean f19410p;

        /* renamed from: q */
        public boolean f19411q;

        /* renamed from: r */
        public String f19412r;

        /* renamed from: s */
        public Headers f19413s;

        /* renamed from: t */
        public MediaType f19414t;

        /* renamed from: u */
        public Set<String> f19415u;

        /* renamed from: v */
        public IE3<?>[] f19416v;

        /* renamed from: w */
        public boolean f19417w;

        public C4392a(MN4 mn4, Method method) {
            this.f19395a = mn4;
            this.f19396b = method;
            this.f19397c = method.getAnnotations();
            this.f19399e = method.getGenericParameterTypes();
            this.f19398d = method.getParameterAnnotations();
        }

        /* renamed from: a */
        public static Class<?> m99033a(Class<?> cls) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            if (Short.TYPE == cls) {
                return Short.class;
            }
            return cls;
        }

        /* renamed from: h */
        public static Set<String> m99026h(String str) {
            Matcher matcher = f19393x.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        /* renamed from: b */
        public KI4 m99032b() {
            for (Annotation annotation : this.f19397c) {
                m99029e(annotation);
            }
            if (this.f19408n != null) {
                if (!this.f19409o) {
                    if (!this.f19411q) {
                        if (this.f19410p) {
                            throw C34031Ki6.m98471m(this.f19396b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                        }
                    } else {
                        throw C34031Ki6.m98471m(this.f19396b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length = this.f19398d.length;
                this.f19416v = new IE3[length];
                int i = length - 1;
                int i2 = 0;
                while (true) {
                    boolean z = true;
                    if (i2 >= length) {
                        break;
                    }
                    IE3<?>[] ie3Arr = this.f19416v;
                    Type type = this.f19399e[i2];
                    Annotation[] annotationArr = this.f19398d[i2];
                    if (i2 != i) {
                        z = false;
                    }
                    ie3Arr[i2] = m99028f(i2, type, annotationArr, z);
                    i2++;
                }
                if (this.f19412r == null && !this.f19407m) {
                    throw C34031Ki6.m98471m(this.f19396b, "Missing either @%s URL or @Url parameter.", this.f19408n);
                }
                boolean z2 = this.f19410p;
                if (!z2 && !this.f19411q && !this.f19409o && this.f19402h) {
                    throw C34031Ki6.m98471m(this.f19396b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z2 && !this.f19400f) {
                    throw C34031Ki6.m98471m(this.f19396b, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (this.f19411q && !this.f19401g) {
                    throw C34031Ki6.m98471m(this.f19396b, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                return new KI4(this);
            }
            throw C34031Ki6.m98471m(this.f19396b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
        }

        /* renamed from: c */
        public final Headers m99031c(String[] strArr) {
            Headers.Builder builder = new Headers.Builder();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf != -1 && indexOf != 0 && indexOf != str.length() - 1) {
                    String substring = str.substring(0, indexOf);
                    String trim = str.substring(indexOf + 1).trim();
                    if ("Content-Type".equalsIgnoreCase(substring)) {
                        try {
                            this.f19414t = MediaType.get(trim);
                        } catch (IllegalArgumentException e) {
                            throw C34031Ki6.m98470n(this.f19396b, e, "Malformed content type: %s", trim);
                        }
                    } else {
                        builder.add(substring, trim);
                    }
                } else {
                    throw C34031Ki6.m98471m(this.f19396b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
            }
            return builder.build();
        }

        /* renamed from: d */
        public final void m99030d(String str, String str2, boolean z) {
            String str3 = this.f19408n;
            if (str3 == null) {
                this.f19408n = str;
                this.f19409o = z;
                if (str2.isEmpty()) {
                    return;
                }
                int indexOf = str2.indexOf(63);
                if (indexOf != -1 && indexOf < str2.length() - 1) {
                    String substring = str2.substring(indexOf + 1);
                    if (f19393x.matcher(substring).find()) {
                        throw C34031Ki6.m98471m(this.f19396b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                    }
                }
                this.f19412r = str2;
                this.f19415u = m99026h(str2);
                return;
            }
            throw C34031Ki6.m98471m(this.f19396b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        /* renamed from: e */
        public final void m99029e(Annotation annotation) {
            if (annotation instanceof KF0) {
                m99030d("DELETE", ((KF0) annotation).value(), false);
            } else if (annotation instanceof NA1) {
                m99030d("GET", ((NA1) annotation).value(), false);
            } else if (annotation instanceof AE1) {
                m99030d("HEAD", ((AE1) annotation).value(), false);
            } else if (annotation instanceof InterfaceC45553nD3) {
                m99030d("PATCH", ((InterfaceC45553nD3) annotation).value(), true);
            } else if (annotation instanceof AD3) {
                m99030d("POST", ((AD3) annotation).value(), true);
            } else if (annotation instanceof CD3) {
                m99030d("PUT", ((CD3) annotation).value(), true);
            } else if (annotation instanceof InterfaceC32579Ed3) {
                m99030d("OPTIONS", ((InterfaceC32579Ed3) annotation).value(), false);
            } else if (annotation instanceof EE1) {
                EE1 ee1 = (EE1) annotation;
                m99030d(ee1.method(), ee1.path(), ee1.hasBody());
            } else if (annotation instanceof MH1) {
                String[] value = ((MH1) annotation).value();
                if (value.length != 0) {
                    this.f19413s = m99031c(value);
                    return;
                }
                throw C34031Ki6.m98471m(this.f19396b, "@Headers annotation is empty.", new Object[0]);
            } else if (annotation instanceof InterfaceC43953kX2) {
                if (!this.f19410p) {
                    this.f19411q = true;
                    return;
                }
                throw C34031Ki6.m98471m(this.f19396b, "Only one encoding annotation is allowed.", new Object[0]);
            } else if (annotation instanceof InterfaceC49545tx1) {
                if (!this.f19411q) {
                    this.f19410p = true;
                    return;
                }
                throw C34031Ki6.m98471m(this.f19396b, "Only one encoding annotation is allowed.", new Object[0]);
            }
        }

        /* renamed from: f */
        public final IE3<?> m99028f(int i, Type type, Annotation[] annotationArr, boolean z) {
            IE3<?> ie3;
            if (annotationArr != null) {
                ie3 = null;
                for (Annotation annotation : annotationArr) {
                    IE3<?> m99027g = m99027g(i, type, annotationArr, annotation);
                    if (m99027g != null) {
                        if (ie3 == null) {
                            ie3 = m99027g;
                        } else {
                            throw C34031Ki6.m98469o(this.f19396b, i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                    }
                }
            } else {
                ie3 = null;
            }
            if (ie3 == null) {
                if (z) {
                    try {
                        if (C34031Ki6.m98476h(type) == Continuation.class) {
                            this.f19417w = true;
                            return null;
                        }
                    } catch (NoClassDefFoundError unused) {
                    }
                }
                throw C34031Ki6.m98469o(this.f19396b, i, "No Retrofit annotation found.", new Object[0]);
            }
            return ie3;
        }

        /* renamed from: g */
        public final IE3<?> m99027g(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof InterfaceC33770Jf6) {
                m99024j(i, type);
                if (!this.f19407m) {
                    if (!this.f19403i) {
                        if (!this.f19404j) {
                            if (!this.f19405k) {
                                if (!this.f19406l) {
                                    if (this.f19412r == null) {
                                        this.f19407m = true;
                                        if (type != HttpUrl.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                            throw C34031Ki6.m98469o(this.f19396b, i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                        }
                                        return new IE3.C3424p(this.f19396b, i);
                                    }
                                    throw C34031Ki6.m98469o(this.f19396b, i, "@Url cannot be used with @%s URL", this.f19408n);
                                }
                                throw C34031Ki6.m98469o(this.f19396b, i, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                            }
                            throw C34031Ki6.m98469o(this.f19396b, i, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                        }
                        throw C34031Ki6.m98469o(this.f19396b, i, "A @Url parameter must not come after a @Query.", new Object[0]);
                    }
                    throw C34031Ki6.m98469o(this.f19396b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                throw C34031Ki6.m98469o(this.f19396b, i, "Multiple @Url method annotations found.", new Object[0]);
            } else if (annotation instanceof InterfaceC39678dJ3) {
                m99024j(i, type);
                if (!this.f19404j) {
                    if (!this.f19405k) {
                        if (!this.f19406l) {
                            if (!this.f19407m) {
                                if (this.f19412r != null) {
                                    this.f19403i = true;
                                    InterfaceC39678dJ3 interfaceC39678dJ3 = (InterfaceC39678dJ3) annotation;
                                    String value = interfaceC39678dJ3.value();
                                    m99025i(i, value);
                                    return new IE3.C3419k(this.f19396b, i, value, this.f19395a.m95377j(type, annotationArr), interfaceC39678dJ3.encoded());
                                }
                                throw C34031Ki6.m98469o(this.f19396b, i, "@Path can only be used with relative url on @%s", this.f19408n);
                            }
                            throw C34031Ki6.m98469o(this.f19396b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                        }
                        throw C34031Ki6.m98469o(this.f19396b, i, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                    }
                    throw C34031Ki6.m98469o(this.f19396b, i, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                throw C34031Ki6.m98469o(this.f19396b, i, "A @Path parameter must not come after a @Query.", new Object[0]);
            } else if (annotation instanceof InterfaceC37017Xc4) {
                m99024j(i, type);
                InterfaceC37017Xc4 interfaceC37017Xc4 = (InterfaceC37017Xc4) annotation;
                String value2 = interfaceC37017Xc4.value();
                boolean encoded = interfaceC37017Xc4.encoded();
                Class<?> m98476h = C34031Ki6.m98476h(type);
                this.f19404j = true;
                if (Iterable.class.isAssignableFrom(m98476h)) {
                    if (type instanceof ParameterizedType) {
                        return new IE3.C3420l(value2, this.f19395a.m95377j(C34031Ki6.m98477g(0, (ParameterizedType) type), annotationArr), encoded).m102768c();
                    }
                    throw C34031Ki6.m98469o(this.f19396b, i, m98476h.getSimpleName() + " must include generic type (e.g., " + m98476h.getSimpleName() + "<String>)", new Object[0]);
                } else if (m98476h.isArray()) {
                    return new IE3.C3420l(value2, this.f19395a.m95377j(m99033a(m98476h.getComponentType()), annotationArr), encoded).m102769b();
                } else {
                    return new IE3.C3420l(value2, this.f19395a.m95377j(type, annotationArr), encoded);
                }
            } else if (annotation instanceof InterfaceC37485Zc4) {
                m99024j(i, type);
                boolean encoded2 = ((InterfaceC37485Zc4) annotation).encoded();
                Class<?> m98476h2 = C34031Ki6.m98476h(type);
                this.f19405k = true;
                if (Iterable.class.isAssignableFrom(m98476h2)) {
                    if (type instanceof ParameterizedType) {
                        return new IE3.C3422n(this.f19395a.m95377j(C34031Ki6.m98477g(0, (ParameterizedType) type), annotationArr), encoded2).m102768c();
                    }
                    throw C34031Ki6.m98469o(this.f19396b, i, m98476h2.getSimpleName() + " must include generic type (e.g., " + m98476h2.getSimpleName() + "<String>)", new Object[0]);
                } else if (m98476h2.isArray()) {
                    return new IE3.C3422n(this.f19395a.m95377j(m99033a(m98476h2.getComponentType()), annotationArr), encoded2).m102769b();
                } else {
                    return new IE3.C3422n(this.f19395a.m95377j(type, annotationArr), encoded2);
                }
            } else if (annotation instanceof InterfaceC37251Yc4) {
                m99024j(i, type);
                Class<?> m98476h3 = C34031Ki6.m98476h(type);
                this.f19406l = true;
                if (Map.class.isAssignableFrom(m98476h3)) {
                    Type m98475i = C34031Ki6.m98475i(type, m98476h3, Map.class);
                    if (m98475i instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) m98475i;
                        Type m98477g = C34031Ki6.m98477g(0, parameterizedType);
                        if (String.class == m98477g) {
                            return new IE3.C3421m(this.f19396b, i, this.f19395a.m95377j(C34031Ki6.m98477g(1, parameterizedType), annotationArr), ((InterfaceC37251Yc4) annotation).encoded());
                        }
                        throw C34031Ki6.m98469o(this.f19396b, i, "@QueryMap keys must be of type String: " + m98477g, new Object[0]);
                    }
                    throw C34031Ki6.m98469o(this.f19396b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw C34031Ki6.m98469o(this.f19396b, i, "@QueryMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof InterfaceC52701zH1) {
                m99024j(i, type);
                String value3 = ((InterfaceC52701zH1) annotation).value();
                Class<?> m98476h4 = C34031Ki6.m98476h(type);
                if (Iterable.class.isAssignableFrom(m98476h4)) {
                    if (type instanceof ParameterizedType) {
                        return new IE3.C3414f(value3, this.f19395a.m95377j(C34031Ki6.m98477g(0, (ParameterizedType) type), annotationArr)).m102768c();
                    }
                    throw C34031Ki6.m98469o(this.f19396b, i, m98476h4.getSimpleName() + " must include generic type (e.g., " + m98476h4.getSimpleName() + "<String>)", new Object[0]);
                } else if (m98476h4.isArray()) {
                    return new IE3.C3414f(value3, this.f19395a.m95377j(m99033a(m98476h4.getComponentType()), annotationArr)).m102769b();
                } else {
                    return new IE3.C3414f(value3, this.f19395a.m95377j(type, annotationArr));
                }
            } else if (annotation instanceof DH1) {
                if (type == Headers.class) {
                    return new IE3.C3416h(this.f19396b, i);
                }
                m99024j(i, type);
                Class<?> m98476h5 = C34031Ki6.m98476h(type);
                if (Map.class.isAssignableFrom(m98476h5)) {
                    Type m98475i2 = C34031Ki6.m98475i(type, m98476h5, Map.class);
                    if (m98475i2 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType2 = (ParameterizedType) m98475i2;
                        Type m98477g2 = C34031Ki6.m98477g(0, parameterizedType2);
                        if (String.class == m98477g2) {
                            return new IE3.C3415g(this.f19396b, i, this.f19395a.m95377j(C34031Ki6.m98477g(1, parameterizedType2), annotationArr));
                        }
                        throw C34031Ki6.m98469o(this.f19396b, i, "@HeaderMap keys must be of type String: " + m98477g2, new Object[0]);
                    }
                    throw C34031Ki6.m98469o(this.f19396b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw C34031Ki6.m98469o(this.f19396b, i, "@HeaderMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof InterfaceC35448Qk1) {
                m99024j(i, type);
                if (this.f19410p) {
                    InterfaceC35448Qk1 interfaceC35448Qk1 = (InterfaceC35448Qk1) annotation;
                    String value4 = interfaceC35448Qk1.value();
                    boolean encoded3 = interfaceC35448Qk1.encoded();
                    this.f19400f = true;
                    Class<?> m98476h6 = C34031Ki6.m98476h(type);
                    if (Iterable.class.isAssignableFrom(m98476h6)) {
                        if (type instanceof ParameterizedType) {
                            return new IE3.C3412d(value4, this.f19395a.m95377j(C34031Ki6.m98477g(0, (ParameterizedType) type), annotationArr), encoded3).m102768c();
                        }
                        throw C34031Ki6.m98469o(this.f19396b, i, m98476h6.getSimpleName() + " must include generic type (e.g., " + m98476h6.getSimpleName() + "<String>)", new Object[0]);
                    } else if (m98476h6.isArray()) {
                        return new IE3.C3412d(value4, this.f19395a.m95377j(m99033a(m98476h6.getComponentType()), annotationArr), encoded3).m102769b();
                    } else {
                        return new IE3.C3412d(value4, this.f19395a.m95377j(type, annotationArr), encoded3);
                    }
                }
                throw C34031Ki6.m98469o(this.f19396b, i, "@Field parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof InterfaceC36384Uk1) {
                m99024j(i, type);
                if (this.f19410p) {
                    Class<?> m98476h7 = C34031Ki6.m98476h(type);
                    if (Map.class.isAssignableFrom(m98476h7)) {
                        Type m98475i3 = C34031Ki6.m98475i(type, m98476h7, Map.class);
                        if (m98475i3 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType3 = (ParameterizedType) m98475i3;
                            Type m98477g3 = C34031Ki6.m98477g(0, parameterizedType3);
                            if (String.class == m98477g3) {
                                InterfaceC48496sB0 m95377j = this.f19395a.m95377j(C34031Ki6.m98477g(1, parameterizedType3), annotationArr);
                                this.f19400f = true;
                                return new IE3.C3413e(this.f19396b, i, m95377j, ((InterfaceC36384Uk1) annotation).encoded());
                            }
                            throw C34031Ki6.m98469o(this.f19396b, i, "@FieldMap keys must be of type String: " + m98477g3, new Object[0]);
                        }
                        throw C34031Ki6.m98469o(this.f19396b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw C34031Ki6.m98469o(this.f19396b, i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw C34031Ki6.m98469o(this.f19396b, i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof YH3) {
                m99024j(i, type);
                if (this.f19411q) {
                    YH3 yh3 = (YH3) annotation;
                    this.f19401g = true;
                    String value5 = yh3.value();
                    Class<?> m98476h8 = C34031Ki6.m98476h(type);
                    if (value5.isEmpty()) {
                        if (Iterable.class.isAssignableFrom(m98476h8)) {
                            if (type instanceof ParameterizedType) {
                                if (MultipartBody.Part.class.isAssignableFrom(C34031Ki6.m98476h(C34031Ki6.m98477g(0, (ParameterizedType) type)))) {
                                    return IE3.C3423o.f14872a.m102768c();
                                }
                                throw C34031Ki6.m98469o(this.f19396b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                            }
                            throw C34031Ki6.m98469o(this.f19396b, i, m98476h8.getSimpleName() + " must include generic type (e.g., " + m98476h8.getSimpleName() + "<String>)", new Object[0]);
                        } else if (m98476h8.isArray()) {
                            if (MultipartBody.Part.class.isAssignableFrom(m98476h8.getComponentType())) {
                                return IE3.C3423o.f14872a.m102769b();
                            }
                            throw C34031Ki6.m98469o(this.f19396b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        } else if (MultipartBody.Part.class.isAssignableFrom(m98476h8)) {
                            return IE3.C3423o.f14872a;
                        } else {
                            throw C34031Ki6.m98469o(this.f19396b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                    }
                    Headers m20547of = Headers.m20547of(com.amazonaws.services.p026s3.Headers.CONTENT_DISPOSITION, "form-data; name=\"" + value5 + "\"", "Content-Transfer-Encoding", yh3.encoding());
                    if (Iterable.class.isAssignableFrom(m98476h8)) {
                        if (type instanceof ParameterizedType) {
                            Type m98477g4 = C34031Ki6.m98477g(0, (ParameterizedType) type);
                            if (!MultipartBody.Part.class.isAssignableFrom(C34031Ki6.m98476h(m98477g4))) {
                                return new IE3.C3417i(this.f19396b, i, m20547of, this.f19395a.m95379h(m98477g4, annotationArr, this.f19397c)).m102768c();
                            }
                            throw C34031Ki6.m98469o(this.f19396b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                        throw C34031Ki6.m98469o(this.f19396b, i, m98476h8.getSimpleName() + " must include generic type (e.g., " + m98476h8.getSimpleName() + "<String>)", new Object[0]);
                    } else if (m98476h8.isArray()) {
                        Class<?> m99033a = m99033a(m98476h8.getComponentType());
                        if (!MultipartBody.Part.class.isAssignableFrom(m99033a)) {
                            return new IE3.C3417i(this.f19396b, i, m20547of, this.f19395a.m95379h(m99033a, annotationArr, this.f19397c)).m102769b();
                        }
                        throw C34031Ki6.m98469o(this.f19396b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    } else if (!MultipartBody.Part.class.isAssignableFrom(m98476h8)) {
                        return new IE3.C3417i(this.f19396b, i, m20547of, this.f19395a.m95379h(type, annotationArr, this.f19397c));
                    } else {
                        throw C34031Ki6.m98469o(this.f19396b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                }
                throw C34031Ki6.m98469o(this.f19396b, i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            } else if (annotation instanceof InterfaceC41447gI3) {
                m99024j(i, type);
                if (this.f19411q) {
                    this.f19401g = true;
                    Class<?> m98476h9 = C34031Ki6.m98476h(type);
                    if (Map.class.isAssignableFrom(m98476h9)) {
                        Type m98475i4 = C34031Ki6.m98475i(type, m98476h9, Map.class);
                        if (m98475i4 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType4 = (ParameterizedType) m98475i4;
                            Type m98477g5 = C34031Ki6.m98477g(0, parameterizedType4);
                            if (String.class == m98477g5) {
                                Type m98477g6 = C34031Ki6.m98477g(1, parameterizedType4);
                                if (!MultipartBody.Part.class.isAssignableFrom(C34031Ki6.m98476h(m98477g6))) {
                                    return new IE3.C3418j(this.f19396b, i, this.f19395a.m95379h(m98477g6, annotationArr, this.f19397c), ((InterfaceC41447gI3) annotation).encoding());
                                }
                                throw C34031Ki6.m98469o(this.f19396b, i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                            }
                            throw C34031Ki6.m98469o(this.f19396b, i, "@PartMap keys must be of type String: " + m98477g5, new Object[0]);
                        }
                        throw C34031Ki6.m98469o(this.f19396b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw C34031Ki6.m98469o(this.f19396b, i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw C34031Ki6.m98469o(this.f19396b, i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            } else if (annotation instanceof InterfaceC6404PY) {
                m99024j(i, type);
                if (!this.f19410p && !this.f19411q) {
                    if (!this.f19402h) {
                        try {
                            InterfaceC48496sB0 m95379h = this.f19395a.m95379h(type, annotationArr, this.f19397c);
                            this.f19402h = true;
                            return new IE3.C3411c(this.f19396b, i, m95379h);
                        } catch (RuntimeException e) {
                            throw C34031Ki6.m98468p(this.f19396b, e, i, "Unable to create @Body converter for %s", type);
                        }
                    }
                    throw C34031Ki6.m98469o(this.f19396b, i, "Multiple @Body method annotations found.", new Object[0]);
                }
                throw C34031Ki6.m98469o(this.f19396b, i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
            } else if (annotation instanceof InterfaceC51079wY5) {
                m99024j(i, type);
                Class<?> m98476h10 = C34031Ki6.m98476h(type);
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    IE3<?> ie3 = this.f19416v[i2];
                    if ((ie3 instanceof IE3.C3425q) && ((IE3.C3425q) ie3).f14875a.equals(m98476h10)) {
                        throw C34031Ki6.m98469o(this.f19396b, i, "@Tag type " + m98476h10.getName() + " is duplicate of parameter #" + (i2 + 1) + " and would always overwrite its value.", new Object[0]);
                    }
                }
                return new IE3.C3425q(m98476h10);
            } else {
                return null;
            }
        }

        /* renamed from: i */
        public final void m99025i(int i, String str) {
            if (f19394y.matcher(str).matches()) {
                if (this.f19415u.contains(str)) {
                    return;
                }
                throw C34031Ki6.m98469o(this.f19396b, i, "URL \"%s\" does not contain \"{%s}\".", this.f19412r, str);
            }
            throw C34031Ki6.m98469o(this.f19396b, i, "@Path parameter name must match %s. Found: %s", f19393x.pattern(), str);
        }

        /* renamed from: j */
        public final void m99024j(int i, Type type) {
            if (!C34031Ki6.m98474j(type)) {
                return;
            }
            throw C34031Ki6.m98469o(this.f19396b, i, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }

    public KI4(C4392a c4392a) {
        this.f19382a = c4392a.f19396b;
        this.f19383b = c4392a.f19395a.f23031c;
        this.f19384c = c4392a.f19408n;
        this.f19385d = c4392a.f19412r;
        this.f19386e = c4392a.f19413s;
        this.f19387f = c4392a.f19414t;
        this.f19388g = c4392a.f19409o;
        this.f19389h = c4392a.f19410p;
        this.f19390i = c4392a.f19411q;
        this.f19391j = c4392a.f19416v;
        this.f19392k = c4392a.f19417w;
    }

    /* renamed from: b */
    public static KI4 m99034b(MN4 mn4, Method method) {
        return new C4392a(mn4, method).m99032b();
    }

    /* renamed from: a */
    public Request m99035a(Object[] objArr) throws IOException {
        IE3<?>[] ie3Arr = this.f19391j;
        int length = objArr.length;
        if (length == ie3Arr.length) {
            C48563sI4 c48563sI4 = new C48563sI4(this.f19384c, this.f19383b, this.f19385d, this.f19386e, this.f19387f, this.f19388g, this.f19389h, this.f19390i);
            if (this.f19392k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(objArr[i]);
                ie3Arr[i].mo102760a(c48563sI4, objArr[i]);
            }
            return c48563sI4.m14465k().tag(S92.class, new S92(this.f19382a, arrayList)).build();
        }
        throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + ie3Arr.length + ")");
    }
}

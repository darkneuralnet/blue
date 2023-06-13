package p000;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Unit;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p000.InterfaceC48496sB0;
/* renamed from: a40  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C37737a40 extends InterfaceC48496sB0.AbstractC28229a {

    /* renamed from: a */
    public boolean f49769a = true;

    /* renamed from: a40$a */
    /* loaded from: classes8.dex */
    public static final class C10557a implements InterfaceC48496sB0<ResponseBody, ResponseBody> {

        /* renamed from: a */
        public static final C10557a f49770a = new C10557a();

        @Override // p000.InterfaceC48496sB0
        /* renamed from: a */
        public ResponseBody convert(ResponseBody responseBody) throws IOException {
            try {
                return C34031Ki6.m98483a(responseBody);
            } finally {
                responseBody.close();
            }
        }
    }

    /* renamed from: a40$b */
    /* loaded from: classes8.dex */
    public static final class C10558b implements InterfaceC48496sB0<RequestBody, RequestBody> {

        /* renamed from: a */
        public static final C10558b f49771a = new C10558b();

        @Override // p000.InterfaceC48496sB0
        /* renamed from: a */
        public RequestBody convert(RequestBody requestBody) {
            return requestBody;
        }
    }

    /* renamed from: a40$c */
    /* loaded from: classes8.dex */
    public static final class C10559c implements InterfaceC48496sB0<ResponseBody, ResponseBody> {

        /* renamed from: a */
        public static final C10559c f49772a = new C10559c();

        @Override // p000.InterfaceC48496sB0
        /* renamed from: a */
        public ResponseBody convert(ResponseBody responseBody) {
            return responseBody;
        }
    }

    /* renamed from: a40$d */
    /* loaded from: classes8.dex */
    public static final class C10560d implements InterfaceC48496sB0<Object, String> {

        /* renamed from: a */
        public static final C10560d f49773a = new C10560d();

        @Override // p000.InterfaceC48496sB0
        /* renamed from: a */
        public String convert(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: a40$e */
    /* loaded from: classes8.dex */
    public static final class C10561e implements InterfaceC48496sB0<ResponseBody, Unit> {

        /* renamed from: a */
        public static final C10561e f49774a = new C10561e();

        @Override // p000.InterfaceC48496sB0
        /* renamed from: a */
        public Unit convert(ResponseBody responseBody) {
            responseBody.close();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a40$f */
    /* loaded from: classes8.dex */
    public static final class C10562f implements InterfaceC48496sB0<ResponseBody, Void> {

        /* renamed from: a */
        public static final C10562f f49775a = new C10562f();

        @Override // p000.InterfaceC48496sB0
        /* renamed from: a */
        public Void convert(ResponseBody responseBody) {
            responseBody.close();
            return null;
        }
    }

    @Override // p000.InterfaceC48496sB0.AbstractC28229a
    /* renamed from: c */
    public InterfaceC48496sB0<?, RequestBody> mo14588c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, MN4 mn4) {
        if (RequestBody.class.isAssignableFrom(C34031Ki6.m98476h(type))) {
            return C10558b.f49771a;
        }
        return null;
    }

    @Override // p000.InterfaceC48496sB0.AbstractC28229a
    /* renamed from: d */
    public InterfaceC48496sB0<ResponseBody, ?> mo14587d(Type type, Annotation[] annotationArr, MN4 mn4) {
        if (type == ResponseBody.class) {
            if (C34031Ki6.m98472l(annotationArr, GR5.class)) {
                return C10559c.f49772a;
            }
            return C10557a.f49770a;
        } else if (type == Void.class) {
            return C10562f.f49775a;
        } else {
            if (this.f49769a && type == Unit.class) {
                try {
                    return C10561e.f49774a;
                } catch (NoClassDefFoundError unused) {
                    this.f49769a = false;
                    return null;
                }
            }
            return null;
        }
    }
}

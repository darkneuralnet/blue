package p000;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p000.InterfaceC48496sB0;
/* renamed from: qh2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47608qh2 extends InterfaceC48496sB0.AbstractC28229a {

    /* renamed from: a */
    public final ObjectMapper f105614a;

    public C47608qh2(ObjectMapper objectMapper) {
        this.f105614a = objectMapper;
    }

    /* renamed from: f */
    public static C47608qh2 m17249f(ObjectMapper objectMapper) {
        if (objectMapper != null) {
            return new C47608qh2(objectMapper);
        }
        throw new NullPointerException("mapper == null");
    }

    @Override // p000.InterfaceC48496sB0.AbstractC28229a
    /* renamed from: c */
    public InterfaceC48496sB0<?, RequestBody> mo14588c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, MN4 mn4) {
        return new C48793sh2(this.f105614a.writerFor(this.f105614a.getTypeFactory().constructType(type)));
    }

    @Override // p000.InterfaceC48496sB0.AbstractC28229a
    /* renamed from: d */
    public InterfaceC48496sB0<ResponseBody, ?> mo14587d(Type type, Annotation[] annotationArr, MN4 mn4) {
        return new C49386th2(this.f105614a.readerFor(this.f105614a.getTypeFactory().constructType(type)));
    }
}

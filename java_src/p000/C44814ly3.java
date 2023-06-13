package p000;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import okhttp3.ResponseBody;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p000.InterfaceC48496sB0;
@IgnoreJRERequirement
/* renamed from: ly3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44814ly3 extends InterfaceC48496sB0.AbstractC28229a {

    /* renamed from: a */
    public static final InterfaceC48496sB0.AbstractC28229a f97021a = new C44814ly3();

    @IgnoreJRERequirement
    /* renamed from: ly3$a */
    /* loaded from: classes8.dex */
    public static final class C25836a<T> implements InterfaceC48496sB0<ResponseBody, Optional<T>> {

        /* renamed from: a */
        public final InterfaceC48496sB0<ResponseBody, T> f97022a;

        public C25836a(InterfaceC48496sB0<ResponseBody, T> interfaceC48496sB0) {
            this.f97022a = interfaceC48496sB0;
        }

        @Override // p000.InterfaceC48496sB0
        /* renamed from: a */
        public Optional<T> convert(ResponseBody responseBody) throws IOException {
            return Optional.ofNullable(this.f97022a.convert(responseBody));
        }
    }

    @Override // p000.InterfaceC48496sB0.AbstractC28229a
    /* renamed from: d */
    public InterfaceC48496sB0<ResponseBody, ?> mo14587d(Type type, Annotation[] annotationArr, MN4 mn4) {
        if (InterfaceC48496sB0.AbstractC28229a.m14589b(type) != Optional.class) {
            return null;
        }
        return new C25836a(mn4.m95378i(InterfaceC48496sB0.AbstractC28229a.m14590a(0, (ParameterizedType) type), annotationArr));
    }
}

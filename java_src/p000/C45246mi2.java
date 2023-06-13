package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p000.InterfaceC48496sB0;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J;\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0002\b\u0003\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJK\u0010\u0010\u001a\u000e\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m28432d2 = {"Lmi2;", "LsB0$a;", "Ljava/lang/reflect/Type;", "type", "", "", "annotations", "LMN4;", "retrofit", "LsB0;", "Lokhttp3/ResponseBody;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;LMN4;)LsB0;", "parameterAnnotations", "methodAnnotations", "Lokhttp3/RequestBody;", "c", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;LMN4;)LsB0;", "Lwi2;", C17296a.f69688o, "Lwi2;", "jsonDeserializer", "<init>", "(Lwi2;)V", "json_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: mi2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45246mi2 extends InterfaceC48496sB0.AbstractC28229a {

    /* renamed from: a */
    public final C51174wi2 f98585a;

    public C45246mi2(C51174wi2 jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.f98585a = jsonDeserializer;
    }

    @Override // p000.InterfaceC48496sB0.AbstractC28229a
    /* renamed from: c */
    public InterfaceC48496sB0<?, RequestBody> mo14588c(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, MN4 retrofit) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parameterAnnotations, "parameterAnnotations");
        Intrinsics.checkNotNullParameter(methodAnnotations, "methodAnnotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return this.f98585a.m6455g(type, parameterAnnotations, methodAnnotations, retrofit);
    }

    @Override // p000.InterfaceC48496sB0.AbstractC28229a
    /* renamed from: d */
    public InterfaceC48496sB0<ResponseBody, ?> mo14587d(Type type, Annotation[] annotations, MN4 retrofit) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return this.f98585a.m6454h(type, annotations, retrofit);
    }
}

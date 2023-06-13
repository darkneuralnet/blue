package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H&J/\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&¢\u0006\u0004\b\t\u0010\nJ%\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0012\u001a\u00020\u000b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00072\u001a\u0010\u0011\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00070\u0010\"\u0006\u0012\u0002\b\u00030\u0007H&¢\u0006\u0004\b\u0012\u0010\u0013J;\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0002\b\u0003\u0018\u00010\u00182\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u00102\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u001a\u0010\u001bJK\u0010\u001f\u001a\u000e\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00182\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u00102\u000e\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u00102\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, m28432d2 = {"LF01;", "", "item", "", "serialize", "T", "json", "Lkotlin/reflect/KClass;", "clazz", "b", "(Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/lang/Object;", "Ljava/lang/reflect/Type;", "type", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "rawType", "", "parameterizedTypes", C17296a.f69688o, "(Lkotlin/reflect/KClass;[Lkotlin/reflect/KClass;)Ljava/lang/reflect/Type;", "", "annotations", "LMN4;", "retrofit", "LsB0;", "Lokhttp3/ResponseBody;", "e", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;LMN4;)LsB0;", "parameterAnnotations", "methodAnnotations", "Lokhttp3/RequestBody;", "c", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;LMN4;)LsB0;", "json_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: F01 */
/* loaded from: classes3.dex */
public interface F01 {
    /* renamed from: a */
    Type mo15567a(KClass<?> kClass, KClass<?>... kClassArr);

    /* renamed from: b */
    <T> T mo15566b(String str, KClass<T> kClass);

    /* renamed from: c */
    InterfaceC48496sB0<?, RequestBody> mo15565c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, MN4 mn4);

    /* renamed from: d */
    <T> T mo15564d(String str, Type type);

    /* renamed from: e */
    InterfaceC48496sB0<ResponseBody, ?> mo15563e(Type type, Annotation[] annotationArr, MN4 mn4);

    String serialize(Object obj);
}

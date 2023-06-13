package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010$\u001a\u00020\"¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J/\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0013\u001a\u00020\f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\b2\u001a\u0010\u0012\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\b0\u0011\"\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J;\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0002\b\u0003\u0018\u00010\u00192\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJK\u0010 \u001a\u000e\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00192\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u00112\u000e\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010#R\u001c\u0010(\u001a\n &*\u0004\u0018\u00010%0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010'¨\u0006+"}, m28432d2 = {"Lrh2;", "LF01;", "", "item", "", "serialize", "T", "json", "Lkotlin/reflect/KClass;", "clazz", "b", "(Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/lang/Object;", "Ljava/lang/reflect/Type;", "type", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "rawType", "", "parameterizedTypes", C17296a.f69688o, "(Lkotlin/reflect/KClass;[Lkotlin/reflect/KClass;)Ljava/lang/reflect/Type;", "", "annotations", "LMN4;", "retrofit", "LsB0;", "Lokhttp3/ResponseBody;", "e", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;LMN4;)LsB0;", "parameterAnnotations", "methodAnnotations", "Lokhttp3/RequestBody;", "c", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;LMN4;)LsB0;", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "mapper", "Lqh2;", "kotlin.jvm.PlatformType", "Lqh2;", "factory", "<init>", "(Lcom/fasterxml/jackson/databind/ObjectMapper;)V", "json_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nJacksonPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JacksonPlugin.kt\nco/bird/android/lib/json/plugins/JacksonPlugin\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,41:1\n11335#2:42\n11670#2,3:43\n37#3,2:46\n*S KotlinDebug\n*F\n+ 1 JacksonPlugin.kt\nco/bird/android/lib/json/plugins/JacksonPlugin\n*L\n30#1:42\n30#1:43,3\n30#1:46,2\n*E\n"})
/* renamed from: rh2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48201rh2 implements F01 {

    /* renamed from: a */
    public final ObjectMapper f107498a;

    /* renamed from: b */
    public final C47608qh2 f107499b;

    public C48201rh2(ObjectMapper mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f107498a = mapper;
        this.f107499b = C47608qh2.m17249f(mapper);
    }

    @Override // p000.F01
    /* renamed from: a */
    public Type mo15567a(KClass<?> rawType, KClass<?>... parameterizedTypes) {
        Intrinsics.checkNotNullParameter(rawType, "rawType");
        Intrinsics.checkNotNullParameter(parameterizedTypes, "parameterizedTypes");
        TypeFactory typeFactory = this.f107498a.getTypeFactory();
        Class<?> javaClass = JvmClassMappingKt.getJavaClass((KClass) rawType);
        ArrayList arrayList = new ArrayList(parameterizedTypes.length);
        for (KClass<?> kClass : parameterizedTypes) {
            arrayList.add(JvmClassMappingKt.getJavaClass((KClass) kClass));
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        JavaType constructParametricType = typeFactory.constructParametricType(javaClass, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        Intrinsics.checkNotNullExpressionValue(constructParametricType, "mapper.typeFactory.const…pe.java }.toTypedArray())");
        return constructParametricType;
    }

    @Override // p000.F01
    /* renamed from: b */
    public <T> T mo15566b(String json, KClass<T> clazz) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        T t = (T) this.f107498a.readValue(json, JvmClassMappingKt.getJavaClass((KClass) clazz));
        Intrinsics.checkNotNullExpressionValue(t, "mapper.readValue(json, clazz.java)");
        return t;
    }

    @Override // p000.F01
    /* renamed from: c */
    public InterfaceC48496sB0<?, RequestBody> mo15565c(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, MN4 retrofit) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parameterAnnotations, "parameterAnnotations");
        Intrinsics.checkNotNullParameter(methodAnnotations, "methodAnnotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return this.f107499b.mo14588c(type, parameterAnnotations, methodAnnotations, retrofit);
    }

    @Override // p000.F01
    /* renamed from: d */
    public <T> T mo15564d(String json, Type type) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(type, "type");
        ObjectMapper objectMapper = this.f107498a;
        return (T) objectMapper.readValue(json, objectMapper.getTypeFactory().constructType(type));
    }

    @Override // p000.F01
    /* renamed from: e */
    public InterfaceC48496sB0<ResponseBody, ?> mo15563e(Type type, Annotation[] annotations, MN4 retrofit) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return this.f107499b.mo14587d(type, annotations, retrofit);
    }

    @Override // p000.F01
    public String serialize(Object item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String writeValueAsString = this.f107498a.writeValueAsString(item);
        Intrinsics.checkNotNullExpressionValue(writeValueAsString, "mapper.writeValueAsString(item)");
        return writeValueAsString;
    }
}

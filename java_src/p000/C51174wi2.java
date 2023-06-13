package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.DeserializerKind;
import com.facebook.share.internal.C17296a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020)0(¢\u0006\u0004\b5\u00106J5\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00020\u0004\"\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\t*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\t*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\t*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0001J9\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0002\b\u0003\u0018\u00010\u001f2\u0006\u0010\u0016\u001a\u00020\u00062\u000e\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u00042\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b!\u0010\"JI\u0010&\u001a\u000e\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020%\u0018\u00010\u001f2\u0006\u0010\u0016\u001a\u00020\u00062\u000e\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u00042\u000e\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u00042\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b&\u0010'R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\"\u00101\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u00104\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00067"}, m28432d2 = {"Lwi2;", "", "Lkotlin/reflect/KClass;", "rawType", "", "parameterizedTypes", "Ljava/lang/reflect/Type;", C17296a.f69688o, "(Lkotlin/reflect/KClass;[Lkotlin/reflect/KClass;)Ljava/lang/reflect/Type;", "T", "", "json", "clazz", "c", "(Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/lang/Object;", "Lco/bird/android/model/constant/DeserializerKind;", "deserializerKind", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Lkotlin/reflect/KClass;Lco/bird/android/model/constant/DeserializerKind;)Ljava/lang/Object;", "Ljava/lang/Class;", "f", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "type", "b", "(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "item", "i", "", "annotations", "LMN4;", "retrofit", "LsB0;", "Lokhttp3/ResponseBody;", "h", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;LMN4;)LsB0;", "parameterAnnotations", "methodAnnotations", "Lokhttp3/RequestBody;", "g", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;LMN4;)LsB0;", "", "LF01;", "Ljava/util/Map;", "deserializers", "Lco/bird/android/model/constant/DeserializerKind;", "getKind", "()Lco/bird/android/model/constant/DeserializerKind;", "j", "(Lco/bird/android/model/constant/DeserializerKind;)V", "kind", "e", "()LF01;", "deserializer", "<init>", "(Ljava/util/Map;)V", "json_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: wi2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51174wi2 {

    /* renamed from: a */
    public final Map<DeserializerKind, F01> f116381a;

    /* renamed from: b */
    public DeserializerKind f116382b;

    /* JADX WARN: Multi-variable type inference failed */
    public C51174wi2(Map<DeserializerKind, ? extends F01> deserializers) {
        Intrinsics.checkNotNullParameter(deserializers, "deserializers");
        this.f116381a = deserializers;
        this.f116382b = DeserializerKind.GSON;
    }

    /* renamed from: a */
    public final Type m6461a(KClass<?> rawType, KClass<?>... parameterizedTypes) {
        Intrinsics.checkNotNullParameter(rawType, "rawType");
        Intrinsics.checkNotNullParameter(parameterizedTypes, "parameterizedTypes");
        return m6457e().mo15567a(rawType, (KClass[]) Arrays.copyOf(parameterizedTypes, parameterizedTypes.length));
    }

    /* renamed from: b */
    public final <T> T m6460b(String json, Type type) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(type, "type");
        return (T) m6457e().mo15564d(json, type);
    }

    /* renamed from: c */
    public final <T> T m6459c(String json, KClass<T> clazz) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (T) m6457e().mo15566b(json, clazz);
    }

    /* renamed from: d */
    public final <T> T m6458d(String json, KClass<T> clazz, DeserializerKind deserializerKind) {
        String str;
        String substring;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(deserializerKind, "deserializerKind");
        try {
            F01 f01 = this.f116381a.get(deserializerKind);
            if (f01 == null) {
                return null;
            }
            return (T) f01.mo15566b(json, clazz);
        } catch (Exception e) {
            if (json.length() > 10) {
                substring = StringsKt__StringsKt.substring(json, new IntRange(0, 10));
                str = substring + "...";
            } else {
                str = json;
            }
            C41318g46.m40152l("Failed to deserialize string with kind=" + deserializerKind + ": \n" + json, new Object[0]);
            C41318g46.m40161c(e, "Exception while attempting to deserialize \"" + str + "\" with deserializerKind=" + deserializerKind + ", returning null", new Object[0]);
            return null;
        }
    }

    /* renamed from: e */
    public final F01 m6457e() {
        F01 f01 = this.f116381a.get(this.f116382b);
        if (f01 != null) {
            return f01;
        }
        DeserializerKind deserializerKind = this.f116382b;
        throw new RuntimeException("No DeserializerPlugin found for " + deserializerKind);
    }

    /* renamed from: f */
    public final <T> T m6456f(String json, Class<T> clazz) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (T) m6457e().mo15566b(json, JvmClassMappingKt.getKotlinClass(clazz));
    }

    /* renamed from: g */
    public final InterfaceC48496sB0<?, RequestBody> m6455g(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, MN4 retrofit) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parameterAnnotations, "parameterAnnotations");
        Intrinsics.checkNotNullParameter(methodAnnotations, "methodAnnotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return m6457e().mo15565c(type, parameterAnnotations, methodAnnotations, retrofit);
    }

    /* renamed from: h */
    public final InterfaceC48496sB0<ResponseBody, ?> m6454h(Type type, Annotation[] annotations, MN4 retrofit) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return m6457e().mo15563e(type, annotations, retrofit);
    }

    /* renamed from: i */
    public final String m6453i(Object item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return m6457e().serialize(item);
    }

    /* renamed from: j */
    public final void m6452j(DeserializerKind deserializerKind) {
        Intrinsics.checkNotNullParameter(deserializerKind, "<set-?>");
        this.f116382b = deserializerKind;
    }
}

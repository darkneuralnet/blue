package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u0010*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0010B\u001d\b\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J'\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m28432d2 = {"Lcom/fasterxml/jackson/module/kotlin/ValueClassStaticJsonValueSerializer;", "T", "Lcom/fasterxml/jackson/databind/ser/std/StdSerializer;", "innerClazz", "Ljava/lang/Class;", "staticJsonValueGetter", "Ljava/lang/reflect/Method;", "(Ljava/lang/Class;Ljava/lang/reflect/Method;)V", "serialize", "", "value", "gen", "Lcom/fasterxml/jackson/core/JsonGenerator;", "provider", "Lcom/fasterxml/jackson/databind/SerializerProvider;", "(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V", "Companion", "jackson-module-kotlin"}, m28431k = 1, m28430mv = {1, 5, 1}, m28428xi = 48)
/* loaded from: classes5.dex */
public final class ValueClassStaticJsonValueSerializer<T> extends StdSerializer<T> {
    public static final Companion Companion = new Companion(null);
    private final Method staticJsonValueGetter;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u0004\"\u0004\b\u0001\u0010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0007¨\u0006\t"}, m28432d2 = {"Lcom/fasterxml/jackson/module/kotlin/ValueClassStaticJsonValueSerializer$Companion;", "", "()V", "createdOrNull", "Lcom/fasterxml/jackson/module/kotlin/ValueClassStaticJsonValueSerializer;", "T", "outerClazz", "Ljava/lang/Class;", "innerClazz", "jackson-module-kotlin"}, m28431k = 1, m28430mv = {1, 5, 1}, m28428xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> ValueClassStaticJsonValueSerializer<T> createdOrNull(Class<? extends Object> outerClazz, Class<T> innerClazz) {
            Method staticJsonValueGetter;
            Intrinsics.checkNotNullParameter(outerClazz, "outerClazz");
            Intrinsics.checkNotNullParameter(innerClazz, "innerClazz");
            staticJsonValueGetter = KotlinSerializersKt.getStaticJsonValueGetter(outerClazz);
            if (staticJsonValueGetter == null) {
                return null;
            }
            return new ValueClassStaticJsonValueSerializer<>(innerClazz, staticJsonValueGetter, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ ValueClassStaticJsonValueSerializer(Class cls, Method method, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, method);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(T t, JsonGenerator gen, SerializerProvider provider) {
        Unit unit;
        Intrinsics.checkNotNullParameter(gen, "gen");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Object invoke = this.staticJsonValueGetter.invoke(null, t);
        if (invoke == null) {
            unit = null;
        } else {
            provider.findValueSerializer(invoke.getClass()).serialize(invoke, gen, provider);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            provider.findNullValueSerializer(null).serialize(null, gen, provider);
        }
    }

    private ValueClassStaticJsonValueSerializer(Class<T> cls, Method method) {
        super(cls);
        this.staticJsonValueGetter = method;
    }
}

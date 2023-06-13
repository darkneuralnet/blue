package p000;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.full.KClassifiers;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"Lkq5;", "", "T", "Lcom/fasterxml/jackson/databind/ser/std/StdSerializer;", "value", "Lcom/fasterxml/jackson/core/JsonGenerator;", "gen", "Lcom/fasterxml/jackson/databind/SerializerProvider;", "provider", "", "serialize", "(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lcom/fasterxml/jackson/databind/SerializerProvider;)V", "Lkotlin/reflect/KClass;", "b", "Lkotlin/reflect/KClass;", "kclass", "Lcom/fasterxml/jackson/databind/ser/DefaultSerializerProvider;", "c", "Lcom/fasterxml/jackson/databind/ser/DefaultSerializerProvider;", "defaultSerializerProvider", "<init>", "(Lkotlin/reflect/KClass;Lcom/fasterxml/jackson/databind/ser/DefaultSerializerProvider;)V", "co.bird.android.lib.persistence.common"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: kq5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44143kq5<T> extends StdSerializer<T> {

    /* renamed from: b */
    public final KClass<Object> f95054b;

    /* renamed from: c */
    public final DefaultSerializerProvider f95055c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C44143kq5(KClass<Object> kclass, DefaultSerializerProvider defaultSerializerProvider) {
        super(r0);
        Intrinsics.checkNotNullParameter(kclass, "kclass");
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
        Class<?> cls = kclass.getClass();
        Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of co.bird.android.persistence.common.impl.serialization.SealedClassSerializer>");
        this.f95054b = kclass;
        this.f95055c = defaultSerializerProvider;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(T value, JsonGenerator gen, SerializerProvider provider) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(gen, "gen");
        Intrinsics.checkNotNullParameter(provider, "provider");
        gen.writeStartObject();
        gen.writeFieldName(KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(value.getClass()), null, false, null, 7, null).toString());
        this.f95055c.defaultSerializeValue(value, gen);
        gen.writeEndObject();
    }
}

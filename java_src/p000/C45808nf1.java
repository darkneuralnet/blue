package p000;

import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\u0012\u001a\u00020\r8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"Lnf1;", "Lcom/fasterxml/jackson/databind/ser/BeanSerializerFactory;", "Lcom/fasterxml/jackson/databind/cfg/SerializerFactoryConfig;", "config", "Lcom/fasterxml/jackson/databind/ser/SerializerFactory;", "withConfig", "Lcom/fasterxml/jackson/databind/SerializerProvider;", "prov", "Lcom/fasterxml/jackson/databind/JavaType;", "origType", "Lcom/fasterxml/jackson/databind/JsonSerializer;", "", "createSerializer", "Lef1;", "b", "Lef1;", C17296a.f69688o, "()Lef1;", "cache", "<init>", "(Lcom/fasterxml/jackson/databind/cfg/SerializerFactoryConfig;Lef1;)V", "jackson_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: nf1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C45808nf1 extends BeanSerializerFactory {

    /* renamed from: b */
    public final C40471ef1 f100283b;

    public /* synthetic */ C45808nf1(SerializerFactoryConfig serializerFactoryConfig, C40471ef1 c40471ef1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : serializerFactoryConfig, c40471ef1);
    }

    /* renamed from: a */
    public final C40471ef1 m23346a() {
        return this.f100283b;
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanSerializerFactory, com.fasterxml.jackson.databind.ser.BasicSerializerFactory, com.fasterxml.jackson.databind.ser.SerializerFactory
    public JsonSerializer<Object> createSerializer(SerializerProvider prov, JavaType origType) {
        Intrinsics.checkNotNullParameter(prov, "prov");
        Intrinsics.checkNotNullParameter(origType, "origType");
        Class<?> rawClass = origType.getRawClass();
        if (rawClass.isEnum()) {
            Intrinsics.checkNotNull(rawClass, "null cannot be cast to non-null type java.lang.Class<kotlin.Enum<*>>");
            return new C45215mf1(rawClass, this.f100283b);
        }
        JsonSerializer<Object> createSerializer = super.createSerializer(prov, origType);
        Intrinsics.checkNotNullExpressionValue(createSerializer, "{\n      super.createSeri…zer(prov, origType)\n    }");
        return createSerializer;
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanSerializerFactory, com.fasterxml.jackson.databind.ser.BasicSerializerFactory
    public SerializerFactory withConfig(SerializerFactoryConfig serializerFactoryConfig) {
        return new C45808nf1(serializerFactoryConfig, this.f100283b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45808nf1(SerializerFactoryConfig serializerFactoryConfig, C40471ef1 cache) {
        super(serializerFactoryConfig);
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.f100283b = cache;
    }
}

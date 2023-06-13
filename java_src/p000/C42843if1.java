package p000;

import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J$\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\u0015\u001a\u00020\u00108\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m28432d2 = {"Lif1;", "Lcom/fasterxml/jackson/databind/deser/BeanDeserializerFactory;", "Lcom/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig;", "config", "Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;", "withConfig", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "ctxt", "Lcom/fasterxml/jackson/databind/JavaType;", "type", "Lcom/fasterxml/jackson/databind/BeanDescription;", "beanDesc", "Lcom/fasterxml/jackson/databind/JsonDeserializer;", "createEnumDeserializer", "Lcom/fasterxml/jackson/databind/KeyDeserializer;", "createKeyDeserializer", "Lef1;", "b", "Lef1;", C17296a.f69688o, "()Lef1;", "cache", "<init>", "(Lcom/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig;Lef1;)V", "jackson_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: if1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C42843if1 extends BeanDeserializerFactory {

    /* renamed from: b */
    public final C40471ef1 f87703b;

    public /* synthetic */ C42843if1(DeserializerFactoryConfig deserializerFactoryConfig, C40471ef1 c40471ef1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : deserializerFactoryConfig, c40471ef1);
    }

    /* renamed from: a */
    public final C40471ef1 m33618a() {
        return this.f87703b;
    }

    @Override // com.fasterxml.jackson.databind.deser.BasicDeserializerFactory, com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<?> createEnumDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc) {
        Intrinsics.checkNotNullParameter(ctxt, "ctxt");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(beanDesc, "beanDesc");
        DeserializationConfig config = ctxt.getConfig();
        Class<?> rawClass = type.getRawClass();
        JsonDeserializer<?> _findCustomEnumDeserializer = _findCustomEnumDeserializer(rawClass, config, beanDesc);
        if (_findCustomEnumDeserializer == null) {
            Intrinsics.checkNotNull(rawClass, "null cannot be cast to non-null type java.lang.Class<kotlin.Enum<*>>");
            return new C42250hf1(rawClass, this.f87703b);
        }
        return _findCustomEnumDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.BasicDeserializerFactory, com.fasterxml.jackson.databind.deser.DeserializerFactory
    public KeyDeserializer createKeyDeserializer(DeserializationContext ctxt, JavaType type) {
        Intrinsics.checkNotNullParameter(ctxt, "ctxt");
        Intrinsics.checkNotNullParameter(type, "type");
        Class<?> rawClass = type.getRawClass();
        if (rawClass.isEnum()) {
            Intrinsics.checkNotNull(rawClass, "null cannot be cast to non-null type java.lang.Class<kotlin.Enum<*>>");
            return new C43436jf1(rawClass, this.f87703b);
        }
        KeyDeserializer createKeyDeserializer = super.createKeyDeserializer(ctxt, type);
        Intrinsics.checkNotNullExpressionValue(createKeyDeserializer, "{\n      super.createKeyD…ializer(ctxt, type)\n    }");
        return createKeyDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerFactory, com.fasterxml.jackson.databind.deser.BasicDeserializerFactory
    public DeserializerFactory withConfig(DeserializerFactoryConfig deserializerFactoryConfig) {
        return new C42843if1(deserializerFactoryConfig, this.f87703b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42843if1(DeserializerFactoryConfig deserializerFactoryConfig, C40471ef1 cache) {
        super(deserializerFactoryConfig == null ? new DeserializerFactoryConfig() : deserializerFactoryConfig);
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.f87703b = cache;
    }
}

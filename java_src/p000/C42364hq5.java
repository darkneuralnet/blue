package p000;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.full.KClasses;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u0013"}, m28432d2 = {"Lhq5;", "Lif1;", "Lcom/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig;", "config", "Lcom/fasterxml/jackson/databind/deser/DeserializerFactory;", "withConfig", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "ctxt", "Lcom/fasterxml/jackson/databind/JavaType;", "type", "Lcom/fasterxml/jackson/databind/BeanDescription;", "beanDesc", "Lcom/fasterxml/jackson/databind/JsonDeserializer;", "", "createBeanDeserializer", "Lef1;", "cache", "<init>", "(Lcom/fasterxml/jackson/databind/cfg/DeserializerFactoryConfig;Lef1;)V", "co.bird.android.lib.persistence.common"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSealedClassDeserializerFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SealedClassDeserializerFactory.kt\nco/bird/android/persistence/common/impl/serialization/factories/SealedClassDeserializerFactory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,38:1\n1747#2,3:39\n*S KotlinDebug\n*F\n+ 1 SealedClassDeserializerFactory.kt\nco/bird/android/persistence/common/impl/serialization/factories/SealedClassDeserializerFactory\n*L\n31#1:39,3\n*E\n"})
/* renamed from: hq5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42364hq5 extends C42843if1 {
    public /* synthetic */ C42364hq5(DeserializerFactoryConfig deserializerFactoryConfig, C40471ef1 c40471ef1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : deserializerFactoryConfig, c40471ef1);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerFactory, com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<Object> createBeanDeserializer(DeserializationContext ctxt, JavaType type, BeanDescription beanDesc) {
        Intrinsics.checkNotNullParameter(ctxt, "ctxt");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(beanDesc, "beanDesc");
        JsonDeserializer<Object> _findCustomBeanDeserializer = _findCustomBeanDeserializer(type, ctxt.getConfig(), beanDesc);
        if (_findCustomBeanDeserializer != null) {
            return _findCustomBeanDeserializer;
        }
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(type.getRawClass());
        if (!orCreateKotlinClass.isSealed()) {
            List<KClass<?>> superclasses = KClasses.getSuperclasses(orCreateKotlinClass);
            boolean z = false;
            if (!(superclasses instanceof Collection) || !superclasses.isEmpty()) {
                Iterator<T> it = superclasses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((KClass) it.next()).isSealed()) {
                        z = true;
                        break;
                    }
                }
            }
            if (!z) {
                JsonDeserializer<Object> createBeanDeserializer = super.createBeanDeserializer(ctxt, type, beanDesc);
                Intrinsics.checkNotNullExpressionValue(createBeanDeserializer, "super.createBeanDeserializer(ctxt, type, beanDesc)");
                return createBeanDeserializer;
            }
        }
        return new C41771gq5(orCreateKotlinClass);
    }

    @Override // p000.C42843if1, com.fasterxml.jackson.databind.deser.BeanDeserializerFactory, com.fasterxml.jackson.databind.deser.BasicDeserializerFactory
    public DeserializerFactory withConfig(DeserializerFactoryConfig deserializerFactoryConfig) {
        return new C42364hq5(deserializerFactoryConfig, m33618a());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42364hq5(DeserializerFactoryConfig deserializerFactoryConfig, C40471ef1 cache) {
        super(deserializerFactoryConfig, cache);
        Intrinsics.checkNotNullParameter(cache, "cache");
    }
}

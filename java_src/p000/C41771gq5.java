package p000;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.full.KClassifiers;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\b\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR8\u0010\u0014\u001a&\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000ej\u0012\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"Lgq5;", "", "T", "Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;", "Lcom/fasterxml/jackson/core/JsonParser;", "p", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "ctxt", "deserialize", "(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;", "Lkotlin/reflect/KClass;", "b", "Lkotlin/reflect/KClass;", "kclass", "Ljava/util/HashMap;", "", "Lcom/fasterxml/jackson/databind/JsonDeserializer;", "Lkotlin/collections/HashMap;", "c", "Ljava/util/HashMap;", "deserializerCache", "<init>", "(Lkotlin/reflect/KClass;)V", "co.bird.android.lib.persistence.common"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSealedClassMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SealedClassMapper.kt\nco/bird/android/persistence/common/impl/serialization/SealedClassDeserializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,72:1\n288#2,2:73\n361#3,7:75\n*S KotlinDebug\n*F\n+ 1 SealedClassMapper.kt\nco/bird/android/persistence/common/impl/serialization/SealedClassDeserializer\n*L\n41#1:73,2\n50#1:75,7\n*E\n"})
/* renamed from: gq5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41771gq5<T> extends StdDeserializer<T> {

    /* renamed from: b */
    public final KClass<Object> f84346b;

    /* renamed from: c */
    public final HashMap<String, JsonDeserializer<?>> f84347c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41771gq5(KClass<Object> kclass) {
        super(JvmClassMappingKt.getJavaClass((KClass) kclass));
        Intrinsics.checkNotNullParameter(kclass, "kclass");
        this.f84346b = kclass;
        this.f84347c = new HashMap<>();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public T deserialize(JsonParser p, DeserializationContext ctxt) {
        Sequence asSequence;
        Object first;
        Object obj;
        T t;
        ResolvableDeserializer resolvableDeserializer;
        Intrinsics.checkNotNullParameter(p, "p");
        Intrinsics.checkNotNullParameter(ctxt, "ctxt");
        JsonNode jsonNode = (JsonNode) p.getCodec().readTree(p);
        Iterator<String> fieldNames = jsonNode.fieldNames();
        Intrinsics.checkNotNullExpressionValue(fieldNames, "node.fieldNames()");
        asSequence = SequencesKt__SequencesKt.asSequence(fieldNames);
        first = SequencesKt___SequencesKt.first(asSequence);
        String className = (String) first;
        Iterator<T> it = this.f84346b.getSealedSubclasses().iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                t = it.next();
                if (Intrinsics.areEqual(KClassifiers.createType$default((KClass) t, null, false, null, 7, null).toString(), className)) {
                    break;
                }
            } else {
                t = null;
                break;
            }
        }
        KClass kClass = (KClass) t;
        if (kClass != null) {
            JsonParser traverse = jsonNode.get(className).traverse(p.getCodec());
            HashMap<String, JsonDeserializer<?>> hashMap = this.f84347c;
            Intrinsics.checkNotNullExpressionValue(className, "className");
            JsonDeserializer<Object> jsonDeserializer = hashMap.get(className);
            if (jsonDeserializer == null) {
                DeserializationConfig config = ctxt.getConfig();
                JavaType constructType = ctxt.constructType(JvmClassMappingKt.getJavaClass(kClass));
                ctxt.getConfig().initialize(traverse);
                jsonDeserializer = BeanDeserializerFactory.instance.buildBeanDeserializer(ctxt, constructType, config.introspect(constructType));
                if (jsonDeserializer instanceof ResolvableDeserializer) {
                    resolvableDeserializer = (ResolvableDeserializer) jsonDeserializer;
                } else {
                    resolvableDeserializer = null;
                }
                if (resolvableDeserializer != null) {
                    resolvableDeserializer.resolve(ctxt);
                }
                Intrinsics.checkNotNullExpressionValue(jsonDeserializer, "instance.buildBeanDeseri…r)?.resolve(ctxt)\n      }");
                hashMap.put(className, jsonDeserializer);
            }
            traverse.nextToken();
            T t2 = (T) jsonDeserializer.deserialize(traverse, ctxt);
            Object objectInstance = kClass.getObjectInstance();
            if (objectInstance != null) {
                obj = objectInstance;
            }
            if (obj == null) {
                Intrinsics.checkNotNull(t2, "null cannot be cast to non-null type T of co.bird.android.persistence.common.impl.serialization.SealedClassDeserializer");
                return t2;
            }
            return (T) obj;
        }
        throw new Exception(className + " is not found to be a subclass of the sealed class " + this.f84346b.getQualifiedName());
    }
}

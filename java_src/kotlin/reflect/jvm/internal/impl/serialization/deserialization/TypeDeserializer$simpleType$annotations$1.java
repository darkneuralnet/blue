package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
/* loaded from: classes8.dex */
public final class TypeDeserializer$simpleType$annotations$1 extends Lambda implements Function0<List<? extends AnnotationDescriptor>> {
    final /* synthetic */ ProtoBuf.Type $proto;
    final /* synthetic */ TypeDeserializer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeDeserializer$simpleType$annotations$1(TypeDeserializer typeDeserializer, ProtoBuf.Type type) {
        super(0);
        this.this$0 = typeDeserializer;
        this.$proto = type;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends AnnotationDescriptor> invoke() {
        DeserializationContext deserializationContext;
        DeserializationContext deserializationContext2;
        deserializationContext = this.this$0.f95016c;
        AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoader = deserializationContext.getComponents().getAnnotationAndConstantLoader();
        ProtoBuf.Type type = this.$proto;
        deserializationContext2 = this.this$0.f95016c;
        return annotationAndConstantLoader.loadTypeAnnotations(type, deserializationContext2.getNameResolver());
    }
}

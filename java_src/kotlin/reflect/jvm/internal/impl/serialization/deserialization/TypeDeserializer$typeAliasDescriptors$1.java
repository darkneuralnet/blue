package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
/* loaded from: classes8.dex */
public final class TypeDeserializer$typeAliasDescriptors$1 extends Lambda implements Function1<Integer, ClassifierDescriptor> {
    final /* synthetic */ TypeDeserializer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeDeserializer$typeAliasDescriptors$1(TypeDeserializer typeDeserializer) {
        super(1);
        this.this$0 = typeDeserializer;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ ClassifierDescriptor invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final ClassifierDescriptor invoke(int i) {
        ClassifierDescriptor computeTypeAliasDescriptor;
        computeTypeAliasDescriptor = this.this$0.computeTypeAliasDescriptor(i);
        return computeTypeAliasDescriptor;
    }
}
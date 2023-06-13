package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
/* loaded from: classes8.dex */
public final class DeserializedClassDescriptor$sealedSubclasses$1 extends Lambda implements Function0<Collection<? extends ClassDescriptor>> {
    final /* synthetic */ DeserializedClassDescriptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor$sealedSubclasses$1(DeserializedClassDescriptor deserializedClassDescriptor) {
        super(0);
        this.this$0 = deserializedClassDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Collection<? extends ClassDescriptor> invoke() {
        Collection<? extends ClassDescriptor> computeSubclassesForSealedClass;
        computeSubclassesForSealedClass = this.this$0.computeSubclassesForSealedClass();
        return computeSubclassesForSealedClass;
    }
}

package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
/* loaded from: classes8.dex */
public final class DeserializedMemberScope$NoReorderImplementation$allFunctions$2 extends Lambda implements Function0<List<? extends SimpleFunctionDescriptor>> {
    final /* synthetic */ DeserializedMemberScope.NoReorderImplementation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$NoReorderImplementation$allFunctions$2(DeserializedMemberScope.NoReorderImplementation noReorderImplementation) {
        super(0);
        this.this$0 = noReorderImplementation;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends SimpleFunctionDescriptor> invoke() {
        List declaredFunctions;
        List computeAllNonDeclaredFunctions;
        List<? extends SimpleFunctionDescriptor> plus;
        declaredFunctions = this.this$0.getDeclaredFunctions();
        computeAllNonDeclaredFunctions = this.this$0.computeAllNonDeclaredFunctions();
        plus = CollectionsKt___CollectionsKt.plus((Collection) declaredFunctions, (Iterable) computeAllNonDeclaredFunctions);
        return plus;
    }
}
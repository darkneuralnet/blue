package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
@SourceDebugExtension({"SMAP\nDeserializedMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation$variableNames$2\n+ 2 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,512:1\n502#2:513\n1620#3,3:514\n*S KotlinDebug\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation$variableNames$2\n*L\n425#1:513\n425#1:514,3\n*E\n"})
/* loaded from: classes8.dex */
public final class DeserializedMemberScope$NoReorderImplementation$variableNames$2 extends Lambda implements Function0<Set<? extends Name>> {
    final /* synthetic */ DeserializedMemberScope.NoReorderImplementation this$0;
    final /* synthetic */ DeserializedMemberScope this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$NoReorderImplementation$variableNames$2(DeserializedMemberScope.NoReorderImplementation noReorderImplementation, DeserializedMemberScope deserializedMemberScope) {
        super(0);
        this.this$0 = noReorderImplementation;
        this.this$1 = deserializedMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Set<? extends Name> invoke() {
        List<MessageLite> list;
        Set<? extends Name> plus;
        DeserializedMemberScope.NoReorderImplementation noReorderImplementation = this.this$0;
        list = noReorderImplementation.propertyList;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        DeserializedMemberScope deserializedMemberScope = noReorderImplementation.this$0;
        for (MessageLite messageLite : list) {
            linkedHashSet.add(NameResolverUtilKt.getName(deserializedMemberScope.getC().getNameResolver(), ((ProtoBuf.Property) messageLite).getName()));
        }
        plus = SetsKt___SetsKt.plus((Set) linkedHashSet, (Iterable) this.this$1.getNonDeclaredVariableNames());
        return plus;
    }
}

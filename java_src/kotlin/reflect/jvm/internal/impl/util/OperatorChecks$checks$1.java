package kotlin.reflect.jvm.internal.impl.util;

import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
@SourceDebugExtension({"SMAP\nmodifierChecks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 modifierChecks.kt\norg/jetbrains/kotlin/util/OperatorChecks$checks$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 modifierChecks.kt\norg/jetbrains/kotlin/util/AbstractModifierChecks\n*L\n1#1,264:1\n1#2:265\n171#3:266\n*S KotlinDebug\n*F\n+ 1 modifierChecks.kt\norg/jetbrains/kotlin/util/OperatorChecks$checks$1\n*L\n189#1:266\n*E\n"})
/* loaded from: classes8.dex */
public final class OperatorChecks$checks$1 extends Lambda implements Function1<FunctionDescriptor, String> {
    public static final OperatorChecks$checks$1 INSTANCE = new OperatorChecks$checks$1();

    public OperatorChecks$checks$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(FunctionDescriptor $receiver) {
        Object lastOrNull;
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        List<ValueParameterDescriptor> valueParameters = $receiver.getValueParameters();
        Intrinsics.checkNotNullExpressionValue(valueParameters, "valueParameters");
        lastOrNull = CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) valueParameters);
        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) lastOrNull;
        boolean z = false;
        if (valueParameterDescriptor != null) {
            if (!DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor) && valueParameterDescriptor.getVarargElementType() == null) {
                z = true;
            }
        }
        OperatorChecks operatorChecks = OperatorChecks.INSTANCE;
        if (z) {
            return null;
        }
        return "last parameter should not have a default value or be a vararg";
    }
}

package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
@SourceDebugExtension({"SMAP\nmodifierChecks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 modifierChecks.kt\norg/jetbrains/kotlin/util/OperatorChecks$checks$3\n+ 2 modifierChecks.kt\norg/jetbrains/kotlin/util/AbstractModifierChecks\n*L\n1#1,264:1\n171#2:265\n*S KotlinDebug\n*F\n+ 1 modifierChecks.kt\norg/jetbrains/kotlin/util/OperatorChecks$checks$3\n*L\n220#1:265\n*E\n"})
/* loaded from: classes8.dex */
public final class OperatorChecks$checks$3 extends Lambda implements Function1<FunctionDescriptor, String> {
    public static final OperatorChecks$checks$3 INSTANCE = new OperatorChecks$checks$3();

    public OperatorChecks$checks$3() {
        super(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r7 != false) goto L12;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String invoke(FunctionDescriptor $receiver) {
        boolean z;
        boolean incDecCheckForExpectClass;
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        ReceiverParameterDescriptor dispatchReceiverParameter = $receiver.getDispatchReceiverParameter();
        if (dispatchReceiverParameter == null) {
            dispatchReceiverParameter = $receiver.getExtensionReceiverParameter();
        }
        OperatorChecks operatorChecks = OperatorChecks.INSTANCE;
        boolean z2 = false;
        if (dispatchReceiverParameter != null) {
            KotlinType returnType = $receiver.getReturnType();
            if (returnType != null) {
                KotlinType type = dispatchReceiverParameter.getType();
                Intrinsics.checkNotNullExpressionValue(type, "receiver.type");
                z = TypeUtilsKt.isSubtypeOf(returnType, type);
            } else {
                z = false;
            }
            if (!z) {
                incDecCheckForExpectClass = operatorChecks.incDecCheckForExpectClass($receiver, dispatchReceiverParameter);
            }
            z2 = true;
        }
        if (z2) {
            return null;
        }
        return "receiver must be a supertype of the return type";
    }
}

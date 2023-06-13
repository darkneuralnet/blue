package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature$getSpecialSignatureInfo$builtinSignature$1 */
/* loaded from: classes8.dex */
public final class C25317xdb572182 extends Lambda implements Function1<CallableMemberDescriptor, Boolean> {
    public static final C25317xdb572182 INSTANCE = new C25317xdb572182();

    public C25317xdb572182() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(CallableMemberDescriptor it) {
        boolean z;
        boolean hasErasedValueParametersInJava;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof FunctionDescriptor) {
            hasErasedValueParametersInJava = BuiltinMethodsWithSpecialGenericSignature.INSTANCE.getHasErasedValueParametersInJava(it);
            if (hasErasedValueParametersInJava) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}

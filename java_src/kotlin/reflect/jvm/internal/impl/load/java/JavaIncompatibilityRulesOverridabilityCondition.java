package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
/* loaded from: classes8.dex */
public final class JavaIncompatibilityRulesOverridabilityCondition implements ExternalOverridabilityCondition {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean isPrimitiveCompareTo(FunctionDescriptor functionDescriptor) {
            ClassDescriptor classDescriptor;
            Object single;
            if (functionDescriptor.getValueParameters().size() != 1) {
                return false;
            }
            DeclarationDescriptor containingDeclaration = functionDescriptor.getContainingDeclaration();
            ClassDescriptor classDescriptor2 = null;
            if (containingDeclaration instanceof ClassDescriptor) {
                classDescriptor = (ClassDescriptor) containingDeclaration;
            } else {
                classDescriptor = null;
            }
            if (classDescriptor == null) {
                return false;
            }
            List<ValueParameterDescriptor> valueParameters = functionDescriptor.getValueParameters();
            Intrinsics.checkNotNullExpressionValue(valueParameters, "f.valueParameters");
            single = CollectionsKt___CollectionsKt.single((List<? extends Object>) valueParameters);
            ClassifierDescriptor mo118090getDeclarationDescriptor = ((ValueParameterDescriptor) single).getType().getConstructor().mo118090getDeclarationDescriptor();
            if (mo118090getDeclarationDescriptor instanceof ClassDescriptor) {
                classDescriptor2 = (ClassDescriptor) mo118090getDeclarationDescriptor;
            }
            if (classDescriptor2 == null || !KotlinBuiltIns.isPrimitiveClass(classDescriptor) || !Intrinsics.areEqual(DescriptorUtilsKt.getFqNameSafe(classDescriptor), DescriptorUtilsKt.getFqNameSafe(classDescriptor2))) {
                return false;
            }
            return true;
        }

        private final JvmType mapValueParameterType(FunctionDescriptor functionDescriptor, ValueParameterDescriptor valueParameterDescriptor) {
            if (!MethodSignatureMappingKt.forceSingleValueParameterBoxing(functionDescriptor) && !isPrimitiveCompareTo(functionDescriptor)) {
                KotlinType type = valueParameterDescriptor.getType();
                Intrinsics.checkNotNullExpressionValue(type, "valueParameterDescriptor.type");
                return MethodSignatureMappingKt.mapToJvmType(type);
            }
            KotlinType type2 = valueParameterDescriptor.getType();
            Intrinsics.checkNotNullExpressionValue(type2, "valueParameterDescriptor.type");
            return MethodSignatureMappingKt.mapToJvmType(TypeUtilsKt.makeNullable(type2));
        }

        public final boolean doesJavaOverrideHaveIncompatibleValueParameterKinds(CallableDescriptor superDescriptor, CallableDescriptor subDescriptor) {
            List<Pair> zip;
            Intrinsics.checkNotNullParameter(superDescriptor, "superDescriptor");
            Intrinsics.checkNotNullParameter(subDescriptor, "subDescriptor");
            if ((subDescriptor instanceof JavaMethodDescriptor) && (superDescriptor instanceof FunctionDescriptor)) {
                JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) subDescriptor;
                javaMethodDescriptor.getValueParameters().size();
                FunctionDescriptor functionDescriptor = (FunctionDescriptor) superDescriptor;
                functionDescriptor.getValueParameters().size();
                List<ValueParameterDescriptor> valueParameters = javaMethodDescriptor.getOriginal().getValueParameters();
                Intrinsics.checkNotNullExpressionValue(valueParameters, "subDescriptor.original.valueParameters");
                List<ValueParameterDescriptor> valueParameters2 = functionDescriptor.getOriginal().getValueParameters();
                Intrinsics.checkNotNullExpressionValue(valueParameters2, "superDescriptor.original.valueParameters");
                zip = CollectionsKt___CollectionsKt.zip(valueParameters, valueParameters2);
                for (Pair pair : zip) {
                    ValueParameterDescriptor subParameter = (ValueParameterDescriptor) pair.component1();
                    ValueParameterDescriptor superParameter = (ValueParameterDescriptor) pair.component2();
                    Intrinsics.checkNotNullExpressionValue(subParameter, "subParameter");
                    boolean z = mapValueParameterType((FunctionDescriptor) subDescriptor, subParameter) instanceof JvmType.Primitive;
                    Intrinsics.checkNotNullExpressionValue(superParameter, "superParameter");
                    if (z != (mapValueParameterType(functionDescriptor, superParameter) instanceof JvmType.Primitive)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    private final boolean isIncompatibleInAccordanceWithBuiltInOverridabilityRules(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, ClassDescriptor classDescriptor) {
        FunctionDescriptor functionDescriptor;
        boolean z;
        if ((callableDescriptor instanceof CallableMemberDescriptor) && (callableDescriptor2 instanceof FunctionDescriptor) && !KotlinBuiltIns.isBuiltIn(callableDescriptor2)) {
            BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.INSTANCE;
            FunctionDescriptor functionDescriptor2 = (FunctionDescriptor) callableDescriptor2;
            Name name = functionDescriptor2.getName();
            Intrinsics.checkNotNullExpressionValue(name, "subDescriptor.name");
            if (!builtinMethodsWithSpecialGenericSignature.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
                SpecialGenericSignatures.Companion companion = SpecialGenericSignatures.Companion;
                Name name2 = functionDescriptor2.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "subDescriptor.name");
                if (!companion.getSameAsRenamedInJvmBuiltin(name2)) {
                    return false;
                }
            }
            CallableMemberDescriptor overriddenSpecialBuiltin = SpecialBuiltinMembers.getOverriddenSpecialBuiltin((CallableMemberDescriptor) callableDescriptor);
            boolean z2 = callableDescriptor instanceof FunctionDescriptor;
            if (z2) {
                functionDescriptor = (FunctionDescriptor) callableDescriptor;
            } else {
                functionDescriptor = null;
            }
            if (functionDescriptor != null && functionDescriptor2.isHiddenToOvercomeSignatureClash() == functionDescriptor.isHiddenToOvercomeSignatureClash()) {
                z = true;
            } else {
                z = false;
            }
            if ((!z) && (overriddenSpecialBuiltin == null || !functionDescriptor2.isHiddenToOvercomeSignatureClash())) {
                return true;
            }
            if ((classDescriptor instanceof JavaClassDescriptor) && functionDescriptor2.getInitialSignatureDescriptor() == null && overriddenSpecialBuiltin != null && !SpecialBuiltinMembers.hasRealKotlinSuperClassWithOverrideOf(classDescriptor, overriddenSpecialBuiltin)) {
                if ((overriddenSpecialBuiltin instanceof FunctionDescriptor) && z2 && BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava((FunctionDescriptor) overriddenSpecialBuiltin) != null) {
                    String computeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(functionDescriptor2, false, false, 2, null);
                    FunctionDescriptor original = ((FunctionDescriptor) callableDescriptor).getOriginal();
                    Intrinsics.checkNotNullExpressionValue(original, "superDescriptor.original");
                    if (Intrinsics.areEqual(computeJvmDescriptor$default, MethodSignatureMappingKt.computeJvmDescriptor$default(original, false, false, 2, null))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ExternalOverridabilityCondition.Contract getContract() {
        return ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ExternalOverridabilityCondition.Result isOverridable(CallableDescriptor superDescriptor, CallableDescriptor subDescriptor, ClassDescriptor classDescriptor) {
        Intrinsics.checkNotNullParameter(superDescriptor, "superDescriptor");
        Intrinsics.checkNotNullParameter(subDescriptor, "subDescriptor");
        if (isIncompatibleInAccordanceWithBuiltInOverridabilityRules(superDescriptor, subDescriptor, classDescriptor)) {
            return ExternalOverridabilityCondition.Result.INCOMPATIBLE;
        }
        if (Companion.doesJavaOverrideHaveIncompatibleValueParameterKinds(superDescriptor, subDescriptor)) {
            return ExternalOverridabilityCondition.Result.INCOMPATIBLE;
        }
        return ExternalOverridabilityCondition.Result.UNKNOWN;
    }
}

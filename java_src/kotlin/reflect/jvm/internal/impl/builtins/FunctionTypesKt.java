package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
@SourceDebugExtension({"SMAP\nfunctionTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 functionTypes.kt\norg/jetbrains/kotlin/builtins/FunctionTypesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,293:1\n1#2:294\n1549#3:295\n1620#3,3:296\n223#3,2:299\n1549#3:301\n1620#3,3:302\n1549#3:305\n1620#3,3:306\n1590#3,4:309\n*S KotlinDebug\n*F\n+ 1 functionTypes.kt\norg/jetbrains/kotlin/builtins/FunctionTypesKt\n*L\n152#1:295\n152#1:296,3\n187#1:299,2\n192#1:301\n192#1:302,3\n214#1:305\n214#1:306,3\n217#1:309,4\n*E\n"})
/* loaded from: classes8.dex */
public final class FunctionTypesKt {
    public static final int contextFunctionTypeParamsCount(KotlinType kotlinType) {
        Object value;
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        AnnotationDescriptor mo118085findAnnotation = kotlinType.getAnnotations().mo118085findAnnotation(StandardNames.FqNames.contextFunctionTypeParams);
        if (mo118085findAnnotation == null) {
            return 0;
        }
        value = MapsKt__MapsKt.getValue(mo118085findAnnotation.getAllValueArguments(), StandardNames.CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME);
        ConstantValue constantValue = (ConstantValue) value;
        Intrinsics.checkNotNull(constantValue, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((IntValue) constantValue).getValue().intValue();
    }

    @JvmOverloads
    public static final SimpleType createFunctionType(KotlinBuiltIns builtIns, Annotations annotations, KotlinType kotlinType, List<? extends KotlinType> contextReceiverTypes, List<? extends KotlinType> parameterTypes, List<Name> list, KotlinType returnType, boolean z) {
        int i;
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(contextReceiverTypes, "contextReceiverTypes");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        List<TypeProjection> functionTypeArgumentProjections = getFunctionTypeArgumentProjections(kotlinType, contextReceiverTypes, parameterTypes, list, returnType, builtIns);
        int size = parameterTypes.size() + contextReceiverTypes.size();
        if (kotlinType == null) {
            i = 0;
        } else {
            i = 1;
        }
        ClassDescriptor functionDescriptor = getFunctionDescriptor(builtIns, size + i, z);
        if (kotlinType != null) {
            annotations = withExtensionFunctionAnnotation(annotations, builtIns);
        }
        if (!contextReceiverTypes.isEmpty()) {
            annotations = withContextReceiversFunctionAnnotation(annotations, builtIns, contextReceiverTypes.size());
        }
        return KotlinTypeFactory.simpleNotNullType(TypeAttributesKt.toDefaultAttributes(annotations), functionDescriptor, functionTypeArgumentProjections);
    }

    public static final Name extractParameterNameFromFunctionTypeArgument(KotlinType kotlinType) {
        Object singleOrNull;
        StringValue stringValue;
        String value;
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        AnnotationDescriptor mo118085findAnnotation = kotlinType.getAnnotations().mo118085findAnnotation(StandardNames.FqNames.parameterName);
        if (mo118085findAnnotation != null) {
            singleOrNull = CollectionsKt___CollectionsKt.singleOrNull(mo118085findAnnotation.getAllValueArguments().values());
            if (singleOrNull instanceof StringValue) {
                stringValue = (StringValue) singleOrNull;
            } else {
                stringValue = null;
            }
            if (stringValue != null && (value = stringValue.getValue()) != null) {
                if (!Name.isValidIdentifier(value)) {
                    value = null;
                }
                if (value != null) {
                    return Name.identifier(value);
                }
            }
            return null;
        }
        return null;
    }

    public static final List<KotlinType> getContextReceiverTypesFromFunctionType(KotlinType kotlinType) {
        int collectionSizeOrDefault;
        List<KotlinType> emptyList;
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        isBuiltinFunctionalType(kotlinType);
        int contextFunctionTypeParamsCount = contextFunctionTypeParamsCount(kotlinType);
        if (contextFunctionTypeParamsCount == 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        List<TypeProjection> subList = kotlinType.getArguments().subList(0, contextFunctionTypeParamsCount);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(subList, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (TypeProjection typeProjection : subList) {
            KotlinType type = typeProjection.getType();
            Intrinsics.checkNotNullExpressionValue(type, "it.type");
            arrayList.add(type);
        }
        return arrayList;
    }

    public static final ClassDescriptor getFunctionDescriptor(KotlinBuiltIns builtIns, int i, boolean z) {
        ClassDescriptor function;
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        if (z) {
            function = builtIns.getSuspendFunction(i);
        } else {
            function = builtIns.getFunction(i);
        }
        Intrinsics.checkNotNullExpressionValue(function, "if (isSuspendFunction) b…tFunction(parameterCount)");
        return function;
    }

    public static final List<TypeProjection> getFunctionTypeArgumentProjections(KotlinType kotlinType, List<? extends KotlinType> contextReceiverTypes, List<? extends KotlinType> parameterTypes, List<Name> list, KotlinType returnType, KotlinBuiltIns builtIns) {
        int i;
        int collectionSizeOrDefault;
        TypeProjection typeProjection;
        Map mapOf;
        List<? extends AnnotationDescriptor> plus;
        Intrinsics.checkNotNullParameter(contextReceiverTypes, "contextReceiverTypes");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        int size = parameterTypes.size() + contextReceiverTypes.size();
        int i2 = 0;
        if (kotlinType != null) {
            i = 1;
        } else {
            i = 0;
        }
        ArrayList arrayList = new ArrayList(size + i + 1);
        List<? extends KotlinType> list2 = contextReceiverTypes;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (KotlinType kotlinType2 : list2) {
            arrayList2.add(TypeUtilsKt.asTypeProjection(kotlinType2));
        }
        arrayList.addAll(arrayList2);
        if (kotlinType != null) {
            typeProjection = TypeUtilsKt.asTypeProjection(kotlinType);
        } else {
            typeProjection = null;
        }
        CollectionsKt.addIfNotNull(arrayList, typeProjection);
        for (Object obj : parameterTypes) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            KotlinType kotlinType3 = (KotlinType) obj;
            Name name = (list == null || (name = list.get(i2)) == null || name.isSpecial()) ? null : null;
            if (name != null) {
                FqName fqName = StandardNames.FqNames.parameterName;
                Name identifier = Name.identifier("name");
                String asString = name.asString();
                Intrinsics.checkNotNullExpressionValue(asString, "name.asString()");
                mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(identifier, new StringValue(asString)));
                BuiltInAnnotationDescriptor builtInAnnotationDescriptor = new BuiltInAnnotationDescriptor(builtIns, fqName, mapOf);
                Annotations.Companion companion = Annotations.Companion;
                plus = CollectionsKt___CollectionsKt.plus(kotlinType3.getAnnotations(), builtInAnnotationDescriptor);
                kotlinType3 = TypeUtilsKt.replaceAnnotations(kotlinType3, companion.create(plus));
            }
            arrayList.add(TypeUtilsKt.asTypeProjection(kotlinType3));
            i2 = i3;
        }
        arrayList.add(TypeUtilsKt.asTypeProjection(returnType));
        return arrayList;
    }

    public static final FunctionClassKind getFunctionalClassKind(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkNotNullParameter(declarationDescriptor, "<this>");
        if ((declarationDescriptor instanceof ClassDescriptor) && KotlinBuiltIns.isUnderKotlinPackage(declarationDescriptor)) {
            return getFunctionalClassKind(DescriptorUtilsKt.getFqNameUnsafe(declarationDescriptor));
        }
        return null;
    }

    public static final KotlinType getReceiverTypeFromFunctionType(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        isBuiltinFunctionalType(kotlinType);
        if (!isTypeAnnotatedWithExtensionFunctionType(kotlinType)) {
            return null;
        }
        return kotlinType.getArguments().get(contextFunctionTypeParamsCount(kotlinType)).getType();
    }

    public static final KotlinType getReturnTypeFromFunctionType(KotlinType kotlinType) {
        Object last;
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        isBuiltinFunctionalType(kotlinType);
        last = CollectionsKt___CollectionsKt.last((List<? extends Object>) kotlinType.getArguments());
        KotlinType type = ((TypeProjection) last).getType();
        Intrinsics.checkNotNullExpressionValue(type, "arguments.last().type");
        return type;
    }

    public static final List<TypeProjection> getValueParameterTypesFromFunctionType(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        isBuiltinFunctionalType(kotlinType);
        List<TypeProjection> arguments = kotlinType.getArguments();
        return arguments.subList(contextFunctionTypeParamsCount(kotlinType) + (isBuiltinExtensionFunctionalType(kotlinType) ? 1 : 0), arguments.size() - 1);
    }

    public static final boolean isBuiltinExtensionFunctionalType(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        if (isBuiltinFunctionalType(kotlinType) && isTypeAnnotatedWithExtensionFunctionType(kotlinType)) {
            return true;
        }
        return false;
    }

    public static final boolean isBuiltinFunctionalClassDescriptor(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkNotNullParameter(declarationDescriptor, "<this>");
        FunctionClassKind functionalClassKind = getFunctionalClassKind(declarationDescriptor);
        if (functionalClassKind != FunctionClassKind.Function && functionalClassKind != FunctionClassKind.SuspendFunction) {
            return false;
        }
        return true;
    }

    public static final boolean isBuiltinFunctionalType(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        ClassifierDescriptor mo118090getDeclarationDescriptor = kotlinType.getConstructor().mo118090getDeclarationDescriptor();
        if (mo118090getDeclarationDescriptor == null || !isBuiltinFunctionalClassDescriptor(mo118090getDeclarationDescriptor)) {
            return false;
        }
        return true;
    }

    public static final boolean isFunctionType(KotlinType kotlinType) {
        FunctionClassKind functionClassKind;
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        ClassifierDescriptor mo118090getDeclarationDescriptor = kotlinType.getConstructor().mo118090getDeclarationDescriptor();
        if (mo118090getDeclarationDescriptor != null) {
            functionClassKind = getFunctionalClassKind(mo118090getDeclarationDescriptor);
        } else {
            functionClassKind = null;
        }
        if (functionClassKind == FunctionClassKind.Function) {
            return true;
        }
        return false;
    }

    public static final boolean isSuspendFunctionType(KotlinType kotlinType) {
        FunctionClassKind functionClassKind;
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        ClassifierDescriptor mo118090getDeclarationDescriptor = kotlinType.getConstructor().mo118090getDeclarationDescriptor();
        if (mo118090getDeclarationDescriptor != null) {
            functionClassKind = getFunctionalClassKind(mo118090getDeclarationDescriptor);
        } else {
            functionClassKind = null;
        }
        if (functionClassKind == FunctionClassKind.SuspendFunction) {
            return true;
        }
        return false;
    }

    private static final boolean isTypeAnnotatedWithExtensionFunctionType(KotlinType kotlinType) {
        return kotlinType.getAnnotations().mo118085findAnnotation(StandardNames.FqNames.extensionFunctionType) != null;
    }

    public static final Annotations withContextReceiversFunctionAnnotation(Annotations annotations, KotlinBuiltIns builtIns, int i) {
        Map mapOf;
        List<? extends AnnotationDescriptor> plus;
        Intrinsics.checkNotNullParameter(annotations, "<this>");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        FqName fqName = StandardNames.FqNames.contextFunctionTypeParams;
        if (!annotations.hasAnnotation(fqName)) {
            Annotations.Companion companion = Annotations.Companion;
            mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(StandardNames.CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME, new IntValue(i)));
            plus = CollectionsKt___CollectionsKt.plus(annotations, new BuiltInAnnotationDescriptor(builtIns, fqName, mapOf));
            return companion.create(plus);
        }
        return annotations;
    }

    public static final Annotations withExtensionFunctionAnnotation(Annotations annotations, KotlinBuiltIns builtIns) {
        Map emptyMap;
        List<? extends AnnotationDescriptor> plus;
        Intrinsics.checkNotNullParameter(annotations, "<this>");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        FqName fqName = StandardNames.FqNames.extensionFunctionType;
        if (!annotations.hasAnnotation(fqName)) {
            Annotations.Companion companion = Annotations.Companion;
            emptyMap = MapsKt__MapsKt.emptyMap();
            plus = CollectionsKt___CollectionsKt.plus(annotations, new BuiltInAnnotationDescriptor(builtIns, fqName, emptyMap));
            return companion.create(plus);
        }
        return annotations;
    }

    private static final FunctionClassKind getFunctionalClassKind(FqNameUnsafe fqNameUnsafe) {
        if (!fqNameUnsafe.isSafe() || fqNameUnsafe.isRoot()) {
            return null;
        }
        FunctionClassKind.Companion companion = FunctionClassKind.Companion;
        String asString = fqNameUnsafe.shortName().asString();
        Intrinsics.checkNotNullExpressionValue(asString, "shortName().asString()");
        FqName parent = fqNameUnsafe.toSafe().parent();
        Intrinsics.checkNotNullExpressionValue(parent, "toSafe().parent()");
        return companion.getFunctionalClassKind(asString, parent);
    }
}

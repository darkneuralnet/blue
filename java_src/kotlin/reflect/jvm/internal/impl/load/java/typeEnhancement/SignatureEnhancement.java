package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.DeprecationCausedByFunctionNInfo;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JavaDescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureBuildingUtilsKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.deprecation.DescriptorBasedDeprecationInfoKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
@SourceDebugExtension({"SMAP\nsignatureEnhancement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 signatureEnhancement.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/SignatureEnhancement\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,282:1\n1549#2:283\n1620#2,3:284\n1549#2:287\n1620#2,3:288\n1549#2:292\n1620#2,3:293\n1747#2,3:296\n1747#2,3:299\n1559#2:302\n1590#2,4:303\n1549#2:307\n1620#2,3:308\n1549#2:311\n1620#2,3:312\n1#3:291\n*S KotlinDebug\n*F\n+ 1 signatureEnhancement.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/SignatureEnhancement\n*L\n55#1:283\n55#1:284,3\n66#1:287\n66#1:288,3\n117#1:292\n117#1:293,3\n138#1:296,3\n144#1:299,3\n150#1:302\n150#1:303,4\n164#1:307\n164#1:308,3\n214#1:311\n214#1:312,3\n*E\n"})
/* loaded from: classes8.dex */
public final class SignatureEnhancement {
    private final JavaTypeEnhancement typeEnhancement;

    public SignatureEnhancement(JavaTypeEnhancement typeEnhancement) {
        Intrinsics.checkNotNullParameter(typeEnhancement, "typeEnhancement");
        this.typeEnhancement = typeEnhancement;
    }

    private final boolean containsFunctionN(KotlinType kotlinType) {
        return TypeUtils.contains(kotlinType, SignatureEnhancement$containsFunctionN$1.INSTANCE);
    }

    private final KotlinType enhance(CallableMemberDescriptor callableMemberDescriptor, Annotated annotated, boolean z, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, TypeEnhancementInfo typeEnhancementInfo, boolean z2, Function1<? super CallableMemberDescriptor, ? extends KotlinType> function1) {
        int collectionSizeOrDefault;
        SignatureParts signatureParts = new SignatureParts(annotated, z, lazyJavaResolverContext, annotationQualifierApplicabilityType, false, 16, null);
        KotlinType invoke = function1.invoke(callableMemberDescriptor);
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "overriddenDescriptors");
        Collection<? extends CallableMemberDescriptor> collection = overriddenDescriptors;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (CallableMemberDescriptor it : collection) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            arrayList.add(function1.invoke(it));
        }
        return enhance(signatureParts, invoke, arrayList, typeEnhancementInfo, z2);
    }

    public static /* synthetic */ KotlinType enhance$default(SignatureEnhancement signatureEnhancement, CallableMemberDescriptor callableMemberDescriptor, Annotated annotated, boolean z, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, TypeEnhancementInfo typeEnhancementInfo, boolean z2, Function1 function1, int i, Object obj) {
        return signatureEnhancement.enhance(callableMemberDescriptor, annotated, z, lazyJavaResolverContext, annotationQualifierApplicabilityType, typeEnhancementInfo, (i & 32) != 0 ? false : z2, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final <D extends CallableMemberDescriptor> D enhanceSignature(D d, LazyJavaResolverContext lazyJavaResolverContext) {
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        KotlinType kotlinType;
        JavaMethodDescriptor javaMethodDescriptor;
        PredefinedFunctionEnhancementInfo predefinedFunctionEnhancementInfo;
        boolean z;
        int collectionSizeOrDefault;
        PropertyDescriptor propertyDescriptor;
        boolean z2;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType;
        TypeEnhancementInfo typeEnhancementInfo;
        KotlinType enhance$default;
        KotlinType returnType;
        boolean z3;
        Pair<CallableDescriptor.UserDataKey<?>, ?> pair;
        KotlinType kotlinType2;
        int collectionSizeOrDefault2;
        boolean z4;
        boolean z5;
        boolean z6;
        KotlinType type;
        TypeEnhancementInfo typeEnhancementInfo2;
        List<TypeEnhancementInfo> parametersInfo;
        Object orNull;
        FunctionDescriptor functionDescriptor;
        ValueParameterDescriptor valueParameterDescriptor;
        boolean z7;
        if (!(d instanceof JavaCallableMemberDescriptor)) {
            return d;
        }
        JavaCallableMemberDescriptor javaCallableMemberDescriptor = (JavaCallableMemberDescriptor) d;
        boolean z8 = true;
        if (javaCallableMemberDescriptor.getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE && javaCallableMemberDescriptor.getOriginal().getOverriddenDescriptors().size() == 1) {
            return d;
        }
        LazyJavaResolverContext copyWithNewDefaultTypeQualifiers = ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, getDefaultAnnotations(d, lazyJavaResolverContext));
        if (d instanceof JavaPropertyDescriptor) {
            JavaPropertyDescriptor javaPropertyDescriptor = (JavaPropertyDescriptor) d;
            PropertyGetterDescriptorImpl getter = javaPropertyDescriptor.getGetter();
            if (getter != null && !getter.isDefault()) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7) {
                PropertyGetterDescriptorImpl getter2 = javaPropertyDescriptor.getGetter();
                Intrinsics.checkNotNull(getter2);
                propertyGetterDescriptorImpl = getter2;
                if (javaCallableMemberDescriptor.getExtensionReceiverParameter() == null) {
                    if (propertyGetterDescriptorImpl instanceof FunctionDescriptor) {
                        functionDescriptor = (FunctionDescriptor) propertyGetterDescriptorImpl;
                    } else {
                        functionDescriptor = null;
                    }
                    if (functionDescriptor != null) {
                        valueParameterDescriptor = (ValueParameterDescriptor) functionDescriptor.getUserData(JavaMethodDescriptor.ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER);
                    } else {
                        valueParameterDescriptor = null;
                    }
                    kotlinType = enhanceValueParameter(d, valueParameterDescriptor, copyWithNewDefaultTypeQualifiers, null, false, SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1.INSTANCE);
                } else {
                    kotlinType = null;
                }
                if (!(d instanceof JavaMethodDescriptor)) {
                    javaMethodDescriptor = (JavaMethodDescriptor) d;
                } else {
                    javaMethodDescriptor = null;
                }
                if (javaMethodDescriptor != null) {
                    SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
                    DeclarationDescriptor containingDeclaration = javaMethodDescriptor.getContainingDeclaration();
                    Intrinsics.checkNotNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    String signature = MethodSignatureBuildingUtilsKt.signature(signatureBuildingComponents, (ClassDescriptor) containingDeclaration, MethodSignatureMappingKt.computeJvmDescriptor$default(javaMethodDescriptor, false, false, 3, null));
                    if (signature != null) {
                        predefinedFunctionEnhancementInfo = PredefinedEnhancementInfoKt.getPREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE().get(signature);
                        if (predefinedFunctionEnhancementInfo != null) {
                            predefinedFunctionEnhancementInfo.getParametersInfo().size();
                            javaCallableMemberDescriptor.getValueParameters().size();
                        }
                        if ((!UtilsKt.isJspecifyEnabledInStrictMode(lazyJavaResolverContext.getComponents().getJavaTypeEnhancementState()) || copyWithNewDefaultTypeQualifiers.getComponents().getSettings().getIgnoreNullabilityForErasedValueParameters()) && UtilsKt.hasErasedValueParameters(d)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        List<ValueParameterDescriptor> valueParameters = propertyGetterDescriptorImpl.getValueParameters();
                        Intrinsics.checkNotNullExpressionValue(valueParameters, "annotationOwnerForMember.valueParameters");
                        List<ValueParameterDescriptor> list = valueParameters;
                        char c = '\n';
                        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                        for (ValueParameterDescriptor valueParameterDescriptor2 : list) {
                            if (predefinedFunctionEnhancementInfo != null && (parametersInfo = predefinedFunctionEnhancementInfo.getParametersInfo()) != null) {
                                orNull = CollectionsKt___CollectionsKt.getOrNull(parametersInfo, valueParameterDescriptor2.getIndex());
                                typeEnhancementInfo2 = (TypeEnhancementInfo) orNull;
                            } else {
                                typeEnhancementInfo2 = null;
                            }
                            ArrayList arrayList2 = arrayList;
                            arrayList2.add(enhanceValueParameter(d, valueParameterDescriptor2, copyWithNewDefaultTypeQualifiers, typeEnhancementInfo2, z, new C25360xf9f85b83(valueParameterDescriptor2)));
                            arrayList = arrayList2;
                            c = '\n';
                        }
                        ArrayList<KotlinType> arrayList3 = arrayList;
                        if (d instanceof PropertyDescriptor) {
                            propertyDescriptor = (PropertyDescriptor) d;
                        } else {
                            propertyDescriptor = null;
                        }
                        if (propertyDescriptor == null && JavaDescriptorUtilKt.isJavaField(propertyDescriptor)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.FIELD;
                        } else {
                            annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE;
                        }
                        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType2 = annotationQualifierApplicabilityType;
                        if (predefinedFunctionEnhancementInfo != null) {
                            typeEnhancementInfo = predefinedFunctionEnhancementInfo.getReturnTypeInfo();
                        } else {
                            typeEnhancementInfo = null;
                        }
                        enhance$default = enhance$default(this, d, propertyGetterDescriptorImpl, true, copyWithNewDefaultTypeQualifiers, annotationQualifierApplicabilityType2, typeEnhancementInfo, false, SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1.INSTANCE, 32, null);
                        returnType = javaCallableMemberDescriptor.getReturnType();
                        Intrinsics.checkNotNull(returnType);
                        if (!containsFunctionN(returnType)) {
                            ReceiverParameterDescriptor extensionReceiverParameter = javaCallableMemberDescriptor.getExtensionReceiverParameter();
                            if (extensionReceiverParameter != null && (type = extensionReceiverParameter.getType()) != null) {
                                z5 = containsFunctionN(type);
                            } else {
                                z5 = false;
                            }
                            if (!z5) {
                                List<ValueParameterDescriptor> valueParameters2 = javaCallableMemberDescriptor.getValueParameters();
                                Intrinsics.checkNotNullExpressionValue(valueParameters2, "valueParameters");
                                List<ValueParameterDescriptor> list2 = valueParameters2;
                                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                    for (ValueParameterDescriptor valueParameterDescriptor3 : list2) {
                                        KotlinType type2 = valueParameterDescriptor3.getType();
                                        Intrinsics.checkNotNullExpressionValue(type2, "it.type");
                                        if (containsFunctionN(type2)) {
                                            z6 = true;
                                            break;
                                        }
                                    }
                                }
                                z6 = false;
                                if (!z6) {
                                    z3 = false;
                                    if (!z3) {
                                        pair = TuplesKt.m28425to(DescriptorBasedDeprecationInfoKt.getDEPRECATED_FUNCTION_KEY(), new DeprecationCausedByFunctionNInfo(d));
                                    } else {
                                        pair = null;
                                    }
                                    if (kotlinType == null && enhance$default == null) {
                                        if (!arrayList3.isEmpty()) {
                                            for (KotlinType kotlinType3 : arrayList3) {
                                                if (kotlinType3 != null) {
                                                    z4 = true;
                                                    continue;
                                                } else {
                                                    z4 = false;
                                                    continue;
                                                }
                                                if (z4) {
                                                    break;
                                                }
                                            }
                                        }
                                        z8 = false;
                                        if (!z8 && pair == null) {
                                            return d;
                                        }
                                    }
                                    if (kotlinType != null) {
                                        ReceiverParameterDescriptor extensionReceiverParameter2 = javaCallableMemberDescriptor.getExtensionReceiverParameter();
                                        if (extensionReceiverParameter2 != null) {
                                            kotlinType2 = extensionReceiverParameter2.getType();
                                        } else {
                                            kotlinType2 = null;
                                        }
                                    } else {
                                        kotlinType2 = kotlinType;
                                    }
                                    collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10);
                                    ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault2);
                                    int i = 0;
                                    for (Object obj : arrayList3) {
                                        int i2 = i + 1;
                                        if (i < 0) {
                                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                                        }
                                        KotlinType kotlinType4 = (KotlinType) obj;
                                        if (kotlinType4 == null) {
                                            kotlinType4 = javaCallableMemberDescriptor.getValueParameters().get(i).getType();
                                            Intrinsics.checkNotNullExpressionValue(kotlinType4, "valueParameters[index].type");
                                        }
                                        arrayList4.add(kotlinType4);
                                        i = i2;
                                    }
                                    if (enhance$default == null) {
                                        enhance$default = javaCallableMemberDescriptor.getReturnType();
                                        Intrinsics.checkNotNull(enhance$default);
                                    }
                                    JavaCallableMemberDescriptor enhance = javaCallableMemberDescriptor.enhance(kotlinType2, arrayList4, enhance$default, pair);
                                    Intrinsics.checkNotNull(enhance, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                                    return enhance;
                                }
                            }
                        }
                        z3 = true;
                        if (!z3) {
                        }
                        if (kotlinType == null) {
                            if (!arrayList3.isEmpty()) {
                            }
                            z8 = false;
                            if (!z8) {
                                return d;
                            }
                        }
                        if (kotlinType != null) {
                        }
                        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10);
                        ArrayList arrayList42 = new ArrayList(collectionSizeOrDefault2);
                        int i3 = 0;
                        while (r3.hasNext()) {
                        }
                        if (enhance$default == null) {
                        }
                        JavaCallableMemberDescriptor enhance2 = javaCallableMemberDescriptor.enhance(kotlinType2, arrayList42, enhance$default, pair);
                        Intrinsics.checkNotNull(enhance2, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                        return enhance2;
                    }
                }
                predefinedFunctionEnhancementInfo = null;
                if (predefinedFunctionEnhancementInfo != null) {
                }
                if (!UtilsKt.isJspecifyEnabledInStrictMode(lazyJavaResolverContext.getComponents().getJavaTypeEnhancementState())) {
                }
                z = true;
                List<ValueParameterDescriptor> valueParameters3 = propertyGetterDescriptorImpl.getValueParameters();
                Intrinsics.checkNotNullExpressionValue(valueParameters3, "annotationOwnerForMember.valueParameters");
                List<ValueParameterDescriptor> list3 = valueParameters3;
                char c2 = '\n';
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10);
                ArrayList arrayList5 = new ArrayList(collectionSizeOrDefault);
                while (r18.hasNext()) {
                }
                ArrayList<KotlinType> arrayList32 = arrayList5;
                if (d instanceof PropertyDescriptor) {
                }
                if (propertyDescriptor == null) {
                }
                z2 = false;
                if (z2) {
                }
                AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType22 = annotationQualifierApplicabilityType;
                if (predefinedFunctionEnhancementInfo != null) {
                }
                enhance$default = enhance$default(this, d, propertyGetterDescriptorImpl, true, copyWithNewDefaultTypeQualifiers, annotationQualifierApplicabilityType22, typeEnhancementInfo, false, SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1.INSTANCE, 32, null);
                returnType = javaCallableMemberDescriptor.getReturnType();
                Intrinsics.checkNotNull(returnType);
                if (!containsFunctionN(returnType)) {
                }
                z3 = true;
                if (!z3) {
                }
                if (kotlinType == null) {
                }
                if (kotlinType != null) {
                }
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList32, 10);
                ArrayList arrayList422 = new ArrayList(collectionSizeOrDefault2);
                int i32 = 0;
                while (r3.hasNext()) {
                }
                if (enhance$default == null) {
                }
                JavaCallableMemberDescriptor enhance22 = javaCallableMemberDescriptor.enhance(kotlinType2, arrayList422, enhance$default, pair);
                Intrinsics.checkNotNull(enhance22, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                return enhance22;
            }
        }
        propertyGetterDescriptorImpl = d;
        if (javaCallableMemberDescriptor.getExtensionReceiverParameter() == null) {
        }
        if (!(d instanceof JavaMethodDescriptor)) {
        }
        if (javaMethodDescriptor != null) {
        }
        predefinedFunctionEnhancementInfo = null;
        if (predefinedFunctionEnhancementInfo != null) {
        }
        if (!UtilsKt.isJspecifyEnabledInStrictMode(lazyJavaResolverContext.getComponents().getJavaTypeEnhancementState())) {
        }
        z = true;
        List<ValueParameterDescriptor> valueParameters32 = propertyGetterDescriptorImpl.getValueParameters();
        Intrinsics.checkNotNullExpressionValue(valueParameters32, "annotationOwnerForMember.valueParameters");
        List<ValueParameterDescriptor> list32 = valueParameters32;
        char c22 = '\n';
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list32, 10);
        ArrayList arrayList52 = new ArrayList(collectionSizeOrDefault);
        while (r18.hasNext()) {
        }
        ArrayList<KotlinType> arrayList322 = arrayList52;
        if (d instanceof PropertyDescriptor) {
        }
        if (propertyDescriptor == null) {
        }
        z2 = false;
        if (z2) {
        }
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType222 = annotationQualifierApplicabilityType;
        if (predefinedFunctionEnhancementInfo != null) {
        }
        enhance$default = enhance$default(this, d, propertyGetterDescriptorImpl, true, copyWithNewDefaultTypeQualifiers, annotationQualifierApplicabilityType222, typeEnhancementInfo, false, SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1.INSTANCE, 32, null);
        returnType = javaCallableMemberDescriptor.getReturnType();
        Intrinsics.checkNotNull(returnType);
        if (!containsFunctionN(returnType)) {
        }
        z3 = true;
        if (!z3) {
        }
        if (kotlinType == null) {
        }
        if (kotlinType != null) {
        }
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList322, 10);
        ArrayList arrayList4222 = new ArrayList(collectionSizeOrDefault2);
        int i322 = 0;
        while (r3.hasNext()) {
        }
        if (enhance$default == null) {
        }
        JavaCallableMemberDescriptor enhance222 = javaCallableMemberDescriptor.enhance(kotlinType2, arrayList4222, enhance$default, pair);
        Intrinsics.checkNotNull(enhance222, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
        return enhance222;
    }

    private final KotlinType enhanceValueParameter(CallableMemberDescriptor callableMemberDescriptor, ValueParameterDescriptor valueParameterDescriptor, LazyJavaResolverContext lazyJavaResolverContext, TypeEnhancementInfo typeEnhancementInfo, boolean z, Function1<? super CallableMemberDescriptor, ? extends KotlinType> function1) {
        LazyJavaResolverContext lazyJavaResolverContext2;
        LazyJavaResolverContext copyWithNewDefaultTypeQualifiers;
        if (valueParameterDescriptor != null && (copyWithNewDefaultTypeQualifiers = ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, valueParameterDescriptor.getAnnotations())) != null) {
            lazyJavaResolverContext2 = copyWithNewDefaultTypeQualifiers;
        } else {
            lazyJavaResolverContext2 = lazyJavaResolverContext;
        }
        return enhance(callableMemberDescriptor, valueParameterDescriptor, false, lazyJavaResolverContext2, AnnotationQualifierApplicabilityType.VALUE_PARAMETER, typeEnhancementInfo, z, function1);
    }

    private final <D extends CallableMemberDescriptor> Annotations getDefaultAnnotations(D d, LazyJavaResolverContext lazyJavaResolverContext) {
        LazyJavaClassDescriptor lazyJavaClassDescriptor;
        boolean z;
        int collectionSizeOrDefault;
        List<? extends AnnotationDescriptor> plus;
        ClassifierDescriptor topLevelContainingClassifier = DescriptorUtilKt.getTopLevelContainingClassifier(d);
        if (topLevelContainingClassifier == null) {
            return d.getAnnotations();
        }
        List<JavaAnnotation> list = null;
        if (topLevelContainingClassifier instanceof LazyJavaClassDescriptor) {
            lazyJavaClassDescriptor = (LazyJavaClassDescriptor) topLevelContainingClassifier;
        } else {
            lazyJavaClassDescriptor = null;
        }
        if (lazyJavaClassDescriptor != null) {
            list = lazyJavaClassDescriptor.getModuleAnnotations();
        }
        List<JavaAnnotation> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return d.getAnnotations();
        }
        List<JavaAnnotation> list3 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (JavaAnnotation javaAnnotation : list3) {
            arrayList.add(new LazyJavaAnnotationDescriptor(lazyJavaResolverContext, javaAnnotation, true));
        }
        Annotations.Companion companion = Annotations.Companion;
        plus = CollectionsKt___CollectionsKt.plus((Iterable) d.getAnnotations(), (Iterable) arrayList);
        return companion.create(plus);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends CallableMemberDescriptor> Collection<D> enhanceSignatures(LazyJavaResolverContext c, Collection<? extends D> platformSignatures) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(platformSignatures, "platformSignatures");
        Collection<? extends D> collection = platformSignatures;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(enhanceSignature((CallableMemberDescriptor) it.next(), c));
        }
        return arrayList;
    }

    public final KotlinType enhanceSuperType(KotlinType type, LazyJavaResolverContext context) {
        List emptyList;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(context, "context");
        SignatureParts signatureParts = new SignatureParts(null, false, context, AnnotationQualifierApplicabilityType.TYPE_USE, true);
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        KotlinType enhance$default = enhance$default(this, signatureParts, type, emptyList, null, false, 12, null);
        if (enhance$default != null) {
            return enhance$default;
        }
        return type;
    }

    public final List<KotlinType> enhanceTypeParameterBounds(TypeParameterDescriptor typeParameter, List<? extends KotlinType> bounds, LazyJavaResolverContext context) {
        int collectionSizeOrDefault;
        List emptyList;
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(context, "context");
        List<? extends KotlinType> list = bounds;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (KotlinType kotlinType : list) {
            if (!TypeUtilsKt.contains(kotlinType, SignatureEnhancement$enhanceTypeParameterBounds$1$1.INSTANCE)) {
                SignatureParts signatureParts = new SignatureParts(typeParameter, false, context, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, false, 16, null);
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                KotlinType enhance$default = enhance$default(this, signatureParts, kotlinType, emptyList, null, false, 12, null);
                if (enhance$default != null) {
                    kotlinType = enhance$default;
                }
            }
            arrayList.add(kotlinType);
        }
        return arrayList;
    }

    public static /* synthetic */ KotlinType enhance$default(SignatureEnhancement signatureEnhancement, SignatureParts signatureParts, KotlinType kotlinType, List list, TypeEnhancementInfo typeEnhancementInfo, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            typeEnhancementInfo = null;
        }
        TypeEnhancementInfo typeEnhancementInfo2 = typeEnhancementInfo;
        if ((i & 8) != 0) {
            z = false;
        }
        return signatureEnhancement.enhance(signatureParts, kotlinType, list, typeEnhancementInfo2, z);
    }

    private final KotlinType enhance(SignatureParts signatureParts, KotlinType kotlinType, List<? extends KotlinType> list, TypeEnhancementInfo typeEnhancementInfo, boolean z) {
        return this.typeEnhancement.enhance(kotlinType, signatureParts.computeIndexedQualifiers(kotlinType, list, typeEnhancementInfo, z), signatureParts.getSkipRawTypeArguments());
    }
}

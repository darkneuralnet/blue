package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
@SourceDebugExtension({"SMAP\ntypeEnhancement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 typeEnhancement.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/JavaTypeEnhancement\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,262:1\n1#2:263\n3433#3,7:264\n1726#3,3:271\n3433#3,7:274\n*S KotlinDebug\n*F\n+ 1 typeEnhancement.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/JavaTypeEnhancement\n*L\n117#1:264,7\n143#1:271,3\n155#1:274,7\n*E\n"})
/* loaded from: classes8.dex */
public final class JavaTypeEnhancement {
    private final JavaResolverSettings javaResolverSettings;

    /* loaded from: classes8.dex */
    public static final class Result {
        private final int subtreeSize;
        private final KotlinType type;

        public Result(KotlinType kotlinType, int i) {
            this.type = kotlinType;
            this.subtreeSize = i;
        }

        public final int getSubtreeSize() {
            return this.subtreeSize;
        }

        public final KotlinType getType() {
            return this.type;
        }
    }

    /* loaded from: classes8.dex */
    public static final class SimpleResult {
        private final boolean forWarnings;
        private final int subtreeSize;
        private final SimpleType type;

        public SimpleResult(SimpleType simpleType, int i, boolean z) {
            this.type = simpleType;
            this.subtreeSize = i;
            this.forWarnings = z;
        }

        public final boolean getForWarnings() {
            return this.forWarnings;
        }

        public final int getSubtreeSize() {
            return this.subtreeSize;
        }

        public final SimpleType getType() {
            return this.type;
        }
    }

    public JavaTypeEnhancement(JavaResolverSettings javaResolverSettings) {
        Intrinsics.checkNotNullParameter(javaResolverSettings, "javaResolverSettings");
        this.javaResolverSettings = javaResolverSettings;
    }

    private final SimpleResult enhanceInflexible(SimpleType simpleType, Function1<? super Integer, JavaTypeQualifiers> function1, int i, TypeComponentPosition typeComponentPosition, boolean z, boolean z2) {
        boolean z3;
        ClassifierDescriptor enhanceMutability;
        Boolean enhancedNullability;
        TypeConstructor constructor;
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        EnhancedTypeAnnotations enhancedTypeAnnotations;
        boolean z4;
        boolean z5;
        Annotations annotations;
        List listOfNotNull;
        Annotations compositeAnnotationsOrSingle;
        int collectionSizeOrDefault3;
        int collectionSizeOrDefault4;
        boolean isMarkedNullable;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        Result result;
        TypeProjection typeProjection;
        Function1<? super Integer, JavaTypeQualifiers> function12 = function1;
        boolean shouldEnhance = TypeComponentPositionKt.shouldEnhance(typeComponentPosition);
        if (z2 && z) {
            z3 = false;
        } else {
            z3 = true;
        }
        KotlinType kotlinType = null;
        if (!shouldEnhance && simpleType.getArguments().isEmpty()) {
            return new SimpleResult(null, 1, false);
        }
        ClassifierDescriptor mo118090getDeclarationDescriptor = simpleType.getConstructor().mo118090getDeclarationDescriptor();
        if (mo118090getDeclarationDescriptor == null) {
            return new SimpleResult(null, 1, false);
        }
        JavaTypeQualifiers invoke = function12.invoke(Integer.valueOf(i));
        enhanceMutability = TypeEnhancementKt.enhanceMutability(mo118090getDeclarationDescriptor, invoke, typeComponentPosition);
        enhancedNullability = TypeEnhancementKt.getEnhancedNullability(invoke, typeComponentPosition);
        if (enhanceMutability == null || (constructor = enhanceMutability.getTypeConstructor()) == null) {
            constructor = simpleType.getConstructor();
        }
        TypeConstructor typeConstructor = constructor;
        Intrinsics.checkNotNullExpressionValue(typeConstructor, "enhancedClassifier?.typeConstructor ?: constructor");
        int i2 = i + 1;
        List<TypeProjection> arguments = simpleType.getArguments();
        List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "typeConstructor.parameters");
        List<TypeParameterDescriptor> list = parameters;
        Iterator<T> it = arguments.iterator();
        Iterator<T> it2 = list.iterator();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arguments, 10);
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList<TypeProjection> arrayList = new ArrayList(Math.min(collectionSizeOrDefault, collectionSizeOrDefault2));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) it2.next();
            TypeProjection typeProjection2 = (TypeProjection) next;
            if (!z3) {
                z9 = z3;
                result = new Result(kotlinType, 0);
            } else {
                z9 = z3;
                if (!typeProjection2.isStarProjection()) {
                    result = enhancePossiblyFlexible(typeProjection2.getType().unwrap(), function12, i2, z2);
                } else if (function12.invoke(Integer.valueOf(i2)).getNullability() == NullabilityQualifier.FORCE_FLEXIBILITY) {
                    UnwrappedType unwrap = typeProjection2.getType().unwrap();
                    result = new Result(KotlinTypeFactory.flexibleType(FlexibleTypesKt.lowerIfFlexible(unwrap).makeNullableAsSpecified(false), FlexibleTypesKt.upperIfFlexible(unwrap).makeNullableAsSpecified(true)), 1);
                } else {
                    result = new Result(null, 1);
                }
            }
            i2 += result.getSubtreeSize();
            if (result.getType() != null) {
                KotlinType type = result.getType();
                Variance projectionKind = typeProjection2.getProjectionKind();
                Intrinsics.checkNotNullExpressionValue(projectionKind, "arg.projectionKind");
                typeProjection = TypeUtilsKt.createProjection(type, projectionKind, typeParameterDescriptor);
            } else if (enhanceMutability != null && !typeProjection2.isStarProjection()) {
                KotlinType type2 = typeProjection2.getType();
                Intrinsics.checkNotNullExpressionValue(type2, "arg.type");
                Variance projectionKind2 = typeProjection2.getProjectionKind();
                Intrinsics.checkNotNullExpressionValue(projectionKind2, "arg.projectionKind");
                typeProjection = TypeUtilsKt.createProjection(type2, projectionKind2, typeParameterDescriptor);
            } else if (enhanceMutability != null) {
                typeProjection = TypeUtils.makeStarProjection(typeParameterDescriptor);
            } else {
                typeProjection = null;
            }
            arrayList.add(typeProjection);
            function12 = function1;
            z3 = z9;
            kotlinType = null;
        }
        int i3 = i2 - i;
        if (enhanceMutability == null && enhancedNullability == null) {
            if (!arrayList.isEmpty()) {
                for (TypeProjection typeProjection3 : arrayList) {
                    if (typeProjection3 == null) {
                        z7 = true;
                        continue;
                    } else {
                        z7 = false;
                        continue;
                    }
                    if (!z7) {
                        z8 = false;
                        break;
                    }
                }
            }
            z8 = true;
            if (z8) {
                return new SimpleResult(null, i3, false);
            }
        }
        Annotations[] annotationsArr = new Annotations[3];
        annotationsArr[0] = simpleType.getAnnotations();
        enhancedTypeAnnotations = TypeEnhancementKt.ENHANCED_MUTABILITY_ANNOTATIONS;
        if (enhanceMutability != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            enhancedTypeAnnotations = null;
        }
        annotationsArr[1] = enhancedTypeAnnotations;
        Annotations enhanced_nullability_annotations = TypeEnhancementKt.getENHANCED_NULLABILITY_ANNOTATIONS();
        if (enhancedNullability != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            annotations = enhanced_nullability_annotations;
        } else {
            annotations = null;
        }
        annotationsArr[2] = annotations;
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) annotationsArr);
        compositeAnnotationsOrSingle = TypeEnhancementKt.compositeAnnotationsOrSingle(listOfNotNull);
        TypeAttributes defaultAttributes = TypeAttributesKt.toDefaultAttributes(compositeAnnotationsOrSingle);
        List<TypeProjection> arguments2 = simpleType.getArguments();
        Iterator it3 = arrayList.iterator();
        Iterator<T> it4 = arguments2.iterator();
        collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        collectionSizeOrDefault4 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arguments2, 10);
        ArrayList arrayList2 = new ArrayList(Math.min(collectionSizeOrDefault3, collectionSizeOrDefault4));
        while (it3.hasNext() && it4.hasNext()) {
            Object next2 = it3.next();
            TypeProjection typeProjection4 = (TypeProjection) it4.next();
            TypeProjection typeProjection5 = (TypeProjection) next2;
            if (typeProjection5 != null) {
                typeProjection4 = typeProjection5;
            }
            arrayList2.add(typeProjection4);
        }
        if (enhancedNullability != null) {
            isMarkedNullable = enhancedNullability.booleanValue();
        } else {
            isMarkedNullable = simpleType.isMarkedNullable();
        }
        SimpleType simpleType$default = KotlinTypeFactory.simpleType$default(defaultAttributes, typeConstructor, arrayList2, isMarkedNullable, (KotlinTypeRefiner) null, 16, (Object) null);
        if (invoke.getDefinitelyNotNull()) {
            simpleType$default = notNullTypeParameter(simpleType$default);
        }
        if (enhancedNullability != null && invoke.isNullabilityQualifierForWarning()) {
            z6 = true;
        } else {
            z6 = false;
        }
        return new SimpleResult(simpleType$default, i3, z6);
    }

    public static /* synthetic */ SimpleResult enhanceInflexible$default(JavaTypeEnhancement javaTypeEnhancement, SimpleType simpleType, Function1 function1, int i, TypeComponentPosition typeComponentPosition, boolean z, boolean z2, int i2, Object obj) {
        return javaTypeEnhancement.enhanceInflexible(simpleType, function1, i, typeComponentPosition, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0096, code lost:
        if (r13 == null) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Result enhancePossiblyFlexible(UnwrappedType unwrappedType, Function1<? super Integer, JavaTypeQualifiers> function1, int i, boolean z) {
        KotlinType type;
        KotlinType type2;
        KotlinType kotlinType = null;
        if (KotlinTypeKt.isError(unwrappedType)) {
            return new Result(null, 1);
        }
        if (unwrappedType instanceof FlexibleType) {
            boolean z2 = unwrappedType instanceof RawType;
            FlexibleType flexibleType = (FlexibleType) unwrappedType;
            SimpleResult enhanceInflexible = enhanceInflexible(flexibleType.getLowerBound(), function1, i, TypeComponentPosition.FLEXIBLE_LOWER, z2, z);
            SimpleResult enhanceInflexible2 = enhanceInflexible(flexibleType.getUpperBound(), function1, i, TypeComponentPosition.FLEXIBLE_UPPER, z2, z);
            enhanceInflexible.getSubtreeSize();
            enhanceInflexible2.getSubtreeSize();
            if (enhanceInflexible.getType() != null || enhanceInflexible2.getType() != null) {
                if (!enhanceInflexible.getForWarnings() && !enhanceInflexible2.getForWarnings()) {
                    if (z2) {
                        SimpleType type3 = enhanceInflexible.getType();
                        if (type3 == null) {
                            type3 = flexibleType.getLowerBound();
                        }
                        SimpleType type4 = enhanceInflexible2.getType();
                        if (type4 == null) {
                            type4 = flexibleType.getUpperBound();
                        }
                        kotlinType = new RawTypeImpl(type3, type4);
                    } else {
                        SimpleType type5 = enhanceInflexible.getType();
                        if (type5 == null) {
                            type5 = flexibleType.getLowerBound();
                        }
                        SimpleType type6 = enhanceInflexible2.getType();
                        if (type6 == null) {
                            type6 = flexibleType.getUpperBound();
                        }
                        kotlinType = KotlinTypeFactory.flexibleType(type5, type6);
                    }
                } else {
                    SimpleType type7 = enhanceInflexible2.getType();
                    if (type7 != null) {
                        SimpleType type8 = enhanceInflexible.getType();
                        if (type8 == null) {
                            type8 = type7;
                        }
                        type2 = KotlinTypeFactory.flexibleType(type8, type7);
                    }
                    type2 = enhanceInflexible.getType();
                    Intrinsics.checkNotNull(type2);
                    kotlinType = TypeWithEnhancementKt.wrapEnhancement(unwrappedType, type2);
                }
            }
            return new Result(kotlinType, enhanceInflexible.getSubtreeSize());
        } else if (unwrappedType instanceof SimpleType) {
            SimpleResult enhanceInflexible$default = enhanceInflexible$default(this, (SimpleType) unwrappedType, function1, i, TypeComponentPosition.INFLEXIBLE, false, z, 8, null);
            if (enhanceInflexible$default.getForWarnings()) {
                type = TypeWithEnhancementKt.wrapEnhancement(unwrappedType, enhanceInflexible$default.getType());
            } else {
                type = enhanceInflexible$default.getType();
            }
            return new Result(type, enhanceInflexible$default.getSubtreeSize());
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final SimpleType notNullTypeParameter(SimpleType simpleType) {
        if (this.javaResolverSettings.getCorrectNullabilityForNotNullTypeParameter()) {
            return SpecialTypesKt.makeSimpleTypeDefinitelyNotNullOrNotNull(simpleType, true);
        }
        return new NotNullTypeParameterImpl(simpleType);
    }

    public final KotlinType enhance(KotlinType kotlinType, Function1<? super Integer, JavaTypeQualifiers> qualifiers, boolean z) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        Intrinsics.checkNotNullParameter(qualifiers, "qualifiers");
        return enhancePossiblyFlexible(kotlinType.unwrap(), qualifiers, 0, z).getType();
    }
}

package kotlin.reflect.jvm.internal.impl.types;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.checker.IntersectionTypeKt;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
@SourceDebugExtension({"SMAP\nTypeParameterUpperBoundEraser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeParameterUpperBoundEraser.kt\norg/jetbrains/kotlin/types/TypeParameterUpperBoundEraser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,158:1\n1179#2,2:159\n1253#2,4:161\n1549#2:166\n1620#2,3:167\n1#3:165\n*S KotlinDebug\n*F\n+ 1 TypeParameterUpperBoundEraser.kt\norg/jetbrains/kotlin/types/TypeParameterUpperBoundEraser\n*L\n77#1:159,2\n77#1:161,4\n100#1:166\n100#1:167,3\n*E\n"})
/* loaded from: classes8.dex */
public final class TypeParameterUpperBoundEraser {
    public static final Companion Companion = new Companion(null);
    private final Lazy erroneousErasedBound$delegate;
    private final MemoizedFunctionToNotNull<DataToEraseUpperBound, KotlinType> getErasedUpperBound;
    private final TypeParameterErasureOptions options;
    private final ErasureProjectionComputer projectionComputer;
    private final LockBasedStorageManager storage;

    @SourceDebugExtension({"SMAP\nTypeParameterUpperBoundEraser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeParameterUpperBoundEraser.kt\norg/jetbrains/kotlin/types/TypeParameterUpperBoundEraser$Companion\n+ 2 TypeUtils.kt\norg/jetbrains/kotlin/types/typeUtil/TypeUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,158:1\n261#2,14:159\n276#2:177\n1549#3:173\n1620#3,3:174\n*S KotlinDebug\n*F\n+ 1 TypeParameterUpperBoundEraser.kt\norg/jetbrains/kotlin/types/TypeParameterUpperBoundEraser$Companion\n*L\n140#1:159,14\n140#1:177\n140#1:173\n140#1:174,3\n*E\n"})
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:108:0x00b5 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:112:0x0152 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:116:0x01f6 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final KotlinType replaceArgumentsOfUpperBound(KotlinType kotlinType, TypeSubstitutor substitutor, Set<? extends TypeParameterDescriptor> set, boolean z) {
            UnwrappedType unwrappedType;
            int collectionSizeOrDefault;
            Object orNull;
            boolean z2;
            KotlinType type;
            int collectionSizeOrDefault2;
            Object orNull2;
            boolean z3;
            KotlinType type2;
            int collectionSizeOrDefault3;
            Object orNull3;
            boolean z4;
            KotlinType type3;
            Intrinsics.checkNotNullParameter(kotlinType, "<this>");
            Intrinsics.checkNotNullParameter(substitutor, "substitutor");
            UnwrappedType unwrap = kotlinType.unwrap();
            if (unwrap instanceof FlexibleType) {
                FlexibleType flexibleType = (FlexibleType) unwrap;
                SimpleType lowerBound = flexibleType.getLowerBound();
                if (!lowerBound.getConstructor().getParameters().isEmpty() && lowerBound.getConstructor().mo118090getDeclarationDescriptor() != null) {
                    List<TypeParameterDescriptor> parameters = lowerBound.getConstructor().getParameters();
                    Intrinsics.checkNotNullExpressionValue(parameters, "constructor.parameters");
                    List<TypeParameterDescriptor> list = parameters;
                    collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                    ArrayList arrayList = new ArrayList(collectionSizeOrDefault3);
                    for (TypeParameterDescriptor typeParameterDescriptor : list) {
                        orNull3 = CollectionsKt___CollectionsKt.getOrNull(kotlinType.getArguments(), typeParameterDescriptor.getIndex());
                        TypeProjection typeProjection = (TypeProjection) orNull3;
                        if (z) {
                            if (typeProjection != null && (type3 = typeProjection.getType()) != null) {
                                Intrinsics.checkNotNullExpressionValue(type3, "type");
                                if (!TypeUtilsKt.containsTypeParameter(type3)) {
                                    z4 = true;
                                    if (z4) {
                                        arrayList.add(typeProjection);
                                    }
                                }
                            }
                            z4 = false;
                            if (z4) {
                            }
                        }
                        boolean z5 = set != null && set.contains(typeParameterDescriptor);
                        if (typeProjection != null && !z5) {
                            TypeSubstitution substitution = substitutor.getSubstitution();
                            KotlinType type4 = typeProjection.getType();
                            Intrinsics.checkNotNullExpressionValue(type4, "argument.type");
                            if (substitution.mo118095get(type4) != null) {
                                arrayList.add(typeProjection);
                            }
                        }
                        typeProjection = new StarProjectionImpl(typeParameterDescriptor);
                        arrayList.add(typeProjection);
                    }
                    lowerBound = TypeSubstitutionKt.replace$default(lowerBound, arrayList, null, 2, null);
                }
                SimpleType upperBound = flexibleType.getUpperBound();
                if (!upperBound.getConstructor().getParameters().isEmpty() && upperBound.getConstructor().mo118090getDeclarationDescriptor() != null) {
                    List<TypeParameterDescriptor> parameters2 = upperBound.getConstructor().getParameters();
                    Intrinsics.checkNotNullExpressionValue(parameters2, "constructor.parameters");
                    List<TypeParameterDescriptor> list2 = parameters2;
                    collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                    ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
                    for (TypeParameterDescriptor typeParameterDescriptor2 : list2) {
                        orNull2 = CollectionsKt___CollectionsKt.getOrNull(kotlinType.getArguments(), typeParameterDescriptor2.getIndex());
                        TypeProjection typeProjection2 = (TypeProjection) orNull2;
                        if (z) {
                            if (typeProjection2 != null && (type2 = typeProjection2.getType()) != null) {
                                Intrinsics.checkNotNullExpressionValue(type2, "type");
                                if (!TypeUtilsKt.containsTypeParameter(type2)) {
                                    z3 = true;
                                    if (z3) {
                                        arrayList2.add(typeProjection2);
                                    }
                                }
                            }
                            z3 = false;
                            if (z3) {
                            }
                        }
                        boolean z6 = set != null && set.contains(typeParameterDescriptor2);
                        if (typeProjection2 != null && !z6) {
                            TypeSubstitution substitution2 = substitutor.getSubstitution();
                            KotlinType type5 = typeProjection2.getType();
                            Intrinsics.checkNotNullExpressionValue(type5, "argument.type");
                            if (substitution2.mo118095get(type5) != null) {
                                arrayList2.add(typeProjection2);
                            }
                        }
                        typeProjection2 = new StarProjectionImpl(typeParameterDescriptor2);
                        arrayList2.add(typeProjection2);
                    }
                    upperBound = TypeSubstitutionKt.replace$default(upperBound, arrayList2, null, 2, null);
                }
                unwrappedType = KotlinTypeFactory.flexibleType(lowerBound, upperBound);
            } else if (unwrap instanceof SimpleType) {
                SimpleType simpleType = (SimpleType) unwrap;
                if (simpleType.getConstructor().getParameters().isEmpty() || simpleType.getConstructor().mo118090getDeclarationDescriptor() == null) {
                    unwrappedType = simpleType;
                } else {
                    List<TypeParameterDescriptor> parameters3 = simpleType.getConstructor().getParameters();
                    Intrinsics.checkNotNullExpressionValue(parameters3, "constructor.parameters");
                    List<TypeParameterDescriptor> list3 = parameters3;
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10);
                    ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
                    for (TypeParameterDescriptor typeParameterDescriptor3 : list3) {
                        orNull = CollectionsKt___CollectionsKt.getOrNull(kotlinType.getArguments(), typeParameterDescriptor3.getIndex());
                        TypeProjection typeProjection3 = (TypeProjection) orNull;
                        if (z) {
                            if (typeProjection3 != null && (type = typeProjection3.getType()) != null) {
                                Intrinsics.checkNotNullExpressionValue(type, "type");
                                if (!TypeUtilsKt.containsTypeParameter(type)) {
                                    z2 = true;
                                    if (z2) {
                                        arrayList3.add(typeProjection3);
                                    }
                                }
                            }
                            z2 = false;
                            if (z2) {
                            }
                        }
                        boolean z7 = set != null && set.contains(typeParameterDescriptor3);
                        if (typeProjection3 != null && !z7) {
                            TypeSubstitution substitution3 = substitutor.getSubstitution();
                            KotlinType type6 = typeProjection3.getType();
                            Intrinsics.checkNotNullExpressionValue(type6, "argument.type");
                            if (substitution3.mo118095get(type6) != null) {
                                arrayList3.add(typeProjection3);
                            }
                        }
                        typeProjection3 = new StarProjectionImpl(typeParameterDescriptor3);
                        arrayList3.add(typeProjection3);
                    }
                    unwrappedType = TypeSubstitutionKt.replace$default(simpleType, arrayList3, null, 2, null);
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            KotlinType safeSubstitute = substitutor.safeSubstitute(TypeWithEnhancementKt.inheritEnhancement(unwrappedType, unwrap), Variance.OUT_VARIANCE);
            Intrinsics.checkNotNullExpressionValue(safeSubstitute, "substitutor.safeSubstitu…s, Variance.OUT_VARIANCE)");
            return safeSubstitute;
        }

        private Companion() {
        }
    }

    /* loaded from: classes8.dex */
    public static final class DataToEraseUpperBound {
        private final ErasureTypeAttributes typeAttr;
        private final TypeParameterDescriptor typeParameter;

        public DataToEraseUpperBound(TypeParameterDescriptor typeParameter, ErasureTypeAttributes typeAttr) {
            Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
            Intrinsics.checkNotNullParameter(typeAttr, "typeAttr");
            this.typeParameter = typeParameter;
            this.typeAttr = typeAttr;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof DataToEraseUpperBound)) {
                return false;
            }
            DataToEraseUpperBound dataToEraseUpperBound = (DataToEraseUpperBound) obj;
            if (!Intrinsics.areEqual(dataToEraseUpperBound.typeParameter, this.typeParameter) || !Intrinsics.areEqual(dataToEraseUpperBound.typeAttr, this.typeAttr)) {
                return false;
            }
            return true;
        }

        public final ErasureTypeAttributes getTypeAttr() {
            return this.typeAttr;
        }

        public final TypeParameterDescriptor getTypeParameter() {
            return this.typeParameter;
        }

        public int hashCode() {
            int hashCode = this.typeParameter.hashCode();
            return hashCode + (hashCode * 31) + this.typeAttr.hashCode();
        }

        public String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.typeParameter + ", typeAttr=" + this.typeAttr + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public TypeParameterUpperBoundEraser(ErasureProjectionComputer projectionComputer, TypeParameterErasureOptions options) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(projectionComputer, "projectionComputer");
        Intrinsics.checkNotNullParameter(options, "options");
        this.projectionComputer = projectionComputer;
        this.options = options;
        LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("Type parameter upper bound erasure results");
        this.storage = lockBasedStorageManager;
        lazy = LazyKt__LazyJVMKt.lazy(new TypeParameterUpperBoundEraser$erroneousErasedBound$2(this));
        this.erroneousErasedBound$delegate = lazy;
        MemoizedFunctionToNotNull<DataToEraseUpperBound, KotlinType> createMemoizedFunction = lockBasedStorageManager.createMemoizedFunction(new TypeParameterUpperBoundEraser$getErasedUpperBound$1(this));
        Intrinsics.checkNotNullExpressionValue(createMemoizedFunction, "storage.createMemoizedFu…ameter, typeAttr) }\n    }");
        this.getErasedUpperBound = createMemoizedFunction;
    }

    private final KotlinType getDefaultType(ErasureTypeAttributes erasureTypeAttributes) {
        KotlinType replaceArgumentsWithStarProjections;
        SimpleType defaultType = erasureTypeAttributes.getDefaultType();
        return (defaultType == null || (replaceArgumentsWithStarProjections = TypeUtilsKt.replaceArgumentsWithStarProjections(defaultType)) == null) ? getErroneousErasedBound() : replaceArgumentsWithStarProjections;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KotlinType getErasedUpperBoundInternal(TypeParameterDescriptor typeParameterDescriptor, ErasureTypeAttributes erasureTypeAttributes) {
        int collectionSizeOrDefault;
        int mapCapacity;
        int coerceAtLeast;
        List list;
        int collectionSizeOrDefault2;
        Object single;
        TypeProjection computeProjection;
        Set<TypeParameterDescriptor> visitedTypeParameters = erasureTypeAttributes.getVisitedTypeParameters();
        if (visitedTypeParameters != null && visitedTypeParameters.contains(typeParameterDescriptor.getOriginal())) {
            return getDefaultType(erasureTypeAttributes);
        }
        SimpleType defaultType = typeParameterDescriptor.getDefaultType();
        Intrinsics.checkNotNullExpressionValue(defaultType, "typeParameter.defaultType");
        Set<TypeParameterDescriptor> extractTypeParametersFromUpperBounds = TypeUtilsKt.extractTypeParametersFromUpperBounds(defaultType, visitedTypeParameters);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(extractTypeParametersFromUpperBounds, 10);
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(collectionSizeOrDefault);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (TypeParameterDescriptor typeParameterDescriptor2 : extractTypeParametersFromUpperBounds) {
            if (visitedTypeParameters != null && visitedTypeParameters.contains(typeParameterDescriptor2)) {
                computeProjection = TypeUtils.makeStarProjection(typeParameterDescriptor2, erasureTypeAttributes);
                Intrinsics.checkNotNullExpressionValue(computeProjection, "makeStarProjection(it, typeAttr)");
            } else {
                computeProjection = this.projectionComputer.computeProjection(typeParameterDescriptor2, erasureTypeAttributes, this, getErasedUpperBound(typeParameterDescriptor2, erasureTypeAttributes.withNewVisitedTypeParameter(typeParameterDescriptor)));
            }
            Pair m28425to = TuplesKt.m28425to(typeParameterDescriptor2.getTypeConstructor(), computeProjection);
            linkedHashMap.put(m28425to.getFirst(), m28425to.getSecond());
        }
        boolean z = false;
        TypeSubstitutor create = TypeSubstitutor.create(TypeConstructorSubstitution.Companion.createByConstructorsMap$default(TypeConstructorSubstitution.Companion, linkedHashMap, false, 2, null));
        Intrinsics.checkNotNullExpressionValue(create, "create(TypeConstructorSu…ap(erasedTypeParameters))");
        List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "typeParameter.upperBounds");
        Set<KotlinType> substituteErasedUpperBounds = substituteErasedUpperBounds(create, upperBounds, erasureTypeAttributes);
        if (!substituteErasedUpperBounds.isEmpty()) {
            if (!this.options.getIntersectUpperBounds()) {
                if (substituteErasedUpperBounds.size() == 1) {
                    z = true;
                }
                if (z) {
                    single = CollectionsKt___CollectionsKt.single(substituteErasedUpperBounds);
                    return (KotlinType) single;
                }
                throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds".toString());
            }
            list = CollectionsKt___CollectionsKt.toList(substituteErasedUpperBounds);
            List<KotlinType> list2 = list;
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault2);
            for (KotlinType kotlinType : list2) {
                arrayList.add(kotlinType.unwrap());
            }
            return IntersectionTypeKt.intersectTypes(arrayList);
        }
        return getDefaultType(erasureTypeAttributes);
    }

    private final ErrorType getErroneousErasedBound() {
        return (ErrorType) this.erroneousErasedBound$delegate.getValue();
    }

    private final Set<KotlinType> substituteErasedUpperBounds(TypeSubstitutor typeSubstitutor, List<? extends KotlinType> list, ErasureTypeAttributes erasureTypeAttributes) {
        Set createSetBuilder;
        Set<KotlinType> build;
        createSetBuilder = SetsKt__SetsJVMKt.createSetBuilder();
        for (KotlinType kotlinType : list) {
            ClassifierDescriptor mo118090getDeclarationDescriptor = kotlinType.getConstructor().mo118090getDeclarationDescriptor();
            if (mo118090getDeclarationDescriptor instanceof ClassDescriptor) {
                createSetBuilder.add(Companion.replaceArgumentsOfUpperBound(kotlinType, typeSubstitutor, erasureTypeAttributes.getVisitedTypeParameters(), this.options.getLeaveNonTypeParameterTypes()));
            } else if (mo118090getDeclarationDescriptor instanceof TypeParameterDescriptor) {
                Set<TypeParameterDescriptor> visitedTypeParameters = erasureTypeAttributes.getVisitedTypeParameters();
                boolean z = false;
                if (visitedTypeParameters != null && visitedTypeParameters.contains(mo118090getDeclarationDescriptor)) {
                    z = true;
                }
                if (z) {
                    createSetBuilder.add(getDefaultType(erasureTypeAttributes));
                } else {
                    List<KotlinType> upperBounds = ((TypeParameterDescriptor) mo118090getDeclarationDescriptor).getUpperBounds();
                    Intrinsics.checkNotNullExpressionValue(upperBounds, "declaration.upperBounds");
                    createSetBuilder.addAll(substituteErasedUpperBounds(typeSubstitutor, upperBounds, erasureTypeAttributes));
                }
            }
            if (!this.options.getIntersectUpperBounds()) {
                break;
            }
        }
        build = SetsKt__SetsJVMKt.build(createSetBuilder);
        return build;
    }

    public final KotlinType getErasedUpperBound(TypeParameterDescriptor typeParameter, ErasureTypeAttributes typeAttr) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Intrinsics.checkNotNullParameter(typeAttr, "typeAttr");
        KotlinType invoke = this.getErasedUpperBound.invoke(new DataToEraseUpperBound(typeParameter, typeAttr));
        Intrinsics.checkNotNullExpressionValue(invoke, "getErasedUpperBound(Data…typeParameter, typeAttr))");
        return invoke;
    }

    public /* synthetic */ TypeParameterUpperBoundEraser(ErasureProjectionComputer erasureProjectionComputer, TypeParameterErasureOptions typeParameterErasureOptions, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(erasureProjectionComputer, (i & 2) != 0 ? new TypeParameterErasureOptions(false, false) : typeParameterErasureOptions);
    }
}

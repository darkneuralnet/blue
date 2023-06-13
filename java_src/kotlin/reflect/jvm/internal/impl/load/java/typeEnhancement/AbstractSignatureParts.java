package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
@SourceDebugExtension({"SMAP\nAbstractSignatureParts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSignatureParts.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/AbstractSignatureParts\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,228:1\n1#2:229\n1#2:252\n1#2:275\n766#3:230\n857#3,2:231\n1726#3,3:233\n1747#3,3:236\n1747#3,3:239\n1603#3,9:242\n1855#3:251\n1856#3:253\n1612#3:254\n1726#3,3:255\n1549#3:258\n1620#3,3:259\n1747#3,3:262\n1603#3,9:265\n1855#3:274\n1856#3:276\n1612#3:277\n1855#3,2:278\n*S KotlinDebug\n*F\n+ 1 AbstractSignatureParts.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/AbstractSignatureParts\n*L\n156#1:252\n182#1:275\n89#1:230\n89#1:231,2\n153#1:233,3\n155#1:236,3\n156#1:239,3\n156#1:242,9\n156#1:251\n156#1:253\n156#1:254\n159#1:255,3\n169#1:258\n169#1:259,3\n177#1:262,3\n182#1:265,9\n182#1:274\n182#1:276\n182#1:277\n195#1:278,2\n*E\n"})
/* loaded from: classes8.dex */
public abstract class AbstractSignatureParts<TAnnotation> {

    /* loaded from: classes8.dex */
    public static final class TypeAndDefaultQualifiers {
        private final JavaTypeQualifiersByElementType defaultQualifiers;
        private final KotlinTypeMarker type;
        private final TypeParameterMarker typeParameterForArgument;

        public TypeAndDefaultQualifiers(KotlinTypeMarker kotlinTypeMarker, JavaTypeQualifiersByElementType javaTypeQualifiersByElementType, TypeParameterMarker typeParameterMarker) {
            this.type = kotlinTypeMarker;
            this.defaultQualifiers = javaTypeQualifiersByElementType;
            this.typeParameterForArgument = typeParameterMarker;
        }

        public final JavaTypeQualifiersByElementType getDefaultQualifiers() {
            return this.defaultQualifiers;
        }

        public final KotlinTypeMarker getType() {
            return this.type;
        }

        public final TypeParameterMarker getTypeParameterForArgument() {
            return this.typeParameterForArgument;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JavaTypeQualifiersByElementType extractAndMergeDefaultQualifiers(KotlinTypeMarker kotlinTypeMarker, JavaTypeQualifiersByElementType javaTypeQualifiersByElementType) {
        return getAnnotationTypeQualifierResolver().extractAndMergeDefaultQualifiers(javaTypeQualifiersByElementType, getAnnotations(kotlinTypeMarker));
    }

    private final JavaTypeQualifiers extractQualifiers(KotlinTypeMarker kotlinTypeMarker) {
        NullabilityQualifier nullabilityQualifier;
        boolean z;
        NullabilityQualifier nullabilityQualifier2 = getNullabilityQualifier(kotlinTypeMarker);
        MutabilityQualifier mutabilityQualifier = null;
        if (nullabilityQualifier2 == null) {
            KotlinTypeMarker enhancedForWarnings = getEnhancedForWarnings(kotlinTypeMarker);
            if (enhancedForWarnings != null) {
                nullabilityQualifier = getNullabilityQualifier(enhancedForWarnings);
            } else {
                nullabilityQualifier = null;
            }
        } else {
            nullabilityQualifier = nullabilityQualifier2;
        }
        TypeSystemContext typeSystem = getTypeSystem();
        JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
        if (javaToKotlinClassMap.isReadOnly(getFqNameUnsafe(typeSystem.lowerBoundIfFlexible(kotlinTypeMarker)))) {
            mutabilityQualifier = MutabilityQualifier.READ_ONLY;
        } else if (javaToKotlinClassMap.isMutable(getFqNameUnsafe(typeSystem.upperBoundIfFlexible(kotlinTypeMarker)))) {
            mutabilityQualifier = MutabilityQualifier.MUTABLE;
        }
        boolean z2 = false;
        if (!getTypeSystem().isDefinitelyNotNullType(kotlinTypeMarker) && !isNotNullTypeParameterCompat(kotlinTypeMarker)) {
            z = false;
        } else {
            z = true;
        }
        if (nullabilityQualifier != nullabilityQualifier2) {
            z2 = true;
        }
        return new JavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier, z, z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0130, code lost:
        if (r0 != false) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final JavaTypeQualifiers extractQualifiersFromAnnotations(TypeAndDefaultQualifiers typeAndDefaultQualifiers) {
        boolean z;
        List emptyList;
        List list;
        TypeParameterMarker typeParameterMarker;
        boolean z2;
        AnnotationQualifierApplicabilityType containerApplicabilityType;
        JavaDefaultQualifiers javaDefaultQualifiers;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus2;
        NullabilityQualifier nullabilityQualifier;
        boolean z3;
        TypeParameterMarker typeParameterForArgument;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus3;
        NullabilityQualifierWithMigrationStatus mostSpecific;
        boolean z4;
        List plus;
        boolean z5;
        List plus2;
        TypeConstructorMarker typeConstructor;
        TypeVariance typeVariance;
        NullabilityQualifier nullabilityQualifier2 = null;
        if (typeAndDefaultQualifiers.getType() == null) {
            TypeSystemContext typeSystem = getTypeSystem();
            TypeParameterMarker typeParameterForArgument2 = typeAndDefaultQualifiers.getTypeParameterForArgument();
            if (typeParameterForArgument2 != null) {
                typeVariance = typeSystem.getVariance(typeParameterForArgument2);
            } else {
                typeVariance = null;
            }
            if (typeVariance == TypeVariance.IN) {
                return JavaTypeQualifiers.Companion.getNONE();
            }
        }
        boolean z6 = true;
        if (typeAndDefaultQualifiers.getTypeParameterForArgument() == null) {
            z = true;
        } else {
            z = false;
        }
        KotlinTypeMarker type = typeAndDefaultQualifiers.getType();
        if (type == null || (list = getAnnotations(type)) == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            list = emptyList;
        }
        TypeSystemContext typeSystem2 = getTypeSystem();
        KotlinTypeMarker type2 = typeAndDefaultQualifiers.getType();
        if (type2 != null && (typeConstructor = typeSystem2.typeConstructor(type2)) != null) {
            typeParameterMarker = typeSystem2.getTypeParameterClassifier(typeConstructor);
        } else {
            typeParameterMarker = null;
        }
        if (getContainerApplicabilityType() == AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            if (!z2 && getEnableImprovementsInStrictMode()) {
                KotlinTypeMarker type3 = typeAndDefaultQualifiers.getType();
                if (type3 != null && isArrayOrPrimitiveArray(type3)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    Iterable<TAnnotation> containerAnnotations = getContainerAnnotations();
                    ArrayList arrayList = new ArrayList();
                    for (TAnnotation tannotation : containerAnnotations) {
                        if (!getAnnotationTypeQualifierResolver().isTypeUseAnnotation(tannotation)) {
                            arrayList.add(tannotation);
                        }
                    }
                    plus2 = CollectionsKt___CollectionsKt.plus((Collection) arrayList, (Iterable) list);
                    list = plus2;
                }
            }
            plus = CollectionsKt___CollectionsKt.plus((Iterable) getContainerAnnotations(), (Iterable) list);
            list = plus;
        }
        MutabilityQualifier extractMutability = getAnnotationTypeQualifierResolver().extractMutability(list);
        NullabilityQualifierWithMigrationStatus extractNullability = getAnnotationTypeQualifierResolver().extractNullability((Iterable) list, (Function1) new C25331xf9ff8566(this, typeAndDefaultQualifiers));
        if (extractNullability != null) {
            return new JavaTypeQualifiers(extractNullability.getQualifier(), extractMutability, (extractNullability.getQualifier() != NullabilityQualifier.NOT_NULL || typeParameterMarker == null) ? false : false, extractNullability.isForWarningOnly());
        }
        if (!z && !z2) {
            containerApplicabilityType = AnnotationQualifierApplicabilityType.TYPE_USE;
        } else {
            containerApplicabilityType = getContainerApplicabilityType();
        }
        JavaTypeQualifiersByElementType defaultQualifiers = typeAndDefaultQualifiers.getDefaultQualifiers();
        if (defaultQualifiers != null) {
            javaDefaultQualifiers = defaultQualifiers.get(containerApplicabilityType);
        } else {
            javaDefaultQualifiers = null;
        }
        if (typeParameterMarker != null) {
            nullabilityQualifierWithMigrationStatus = getBoundsNullability(typeParameterMarker);
        } else {
            nullabilityQualifierWithMigrationStatus = null;
        }
        if (nullabilityQualifierWithMigrationStatus == null || (nullabilityQualifierWithMigrationStatus2 = NullabilityQualifierWithMigrationStatus.copy$default(nullabilityQualifierWithMigrationStatus, NullabilityQualifier.NOT_NULL, false, 2, null)) == null) {
            if (javaDefaultQualifiers != null) {
                nullabilityQualifierWithMigrationStatus2 = javaDefaultQualifiers.getNullabilityQualifier();
            } else {
                nullabilityQualifierWithMigrationStatus2 = null;
            }
        }
        if (nullabilityQualifierWithMigrationStatus != null) {
            nullabilityQualifier = nullabilityQualifierWithMigrationStatus.getQualifier();
        } else {
            nullabilityQualifier = null;
        }
        if (nullabilityQualifier != NullabilityQualifier.NOT_NULL) {
            if (typeParameterMarker != null) {
                if (javaDefaultQualifiers != null && javaDefaultQualifiers.getDefinitelyNotNull()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            z3 = false;
            typeParameterForArgument = typeAndDefaultQualifiers.getTypeParameterForArgument();
            if (typeParameterForArgument == null && (nullabilityQualifierWithMigrationStatus3 = getBoundsNullability(typeParameterForArgument)) != null) {
                if (nullabilityQualifierWithMigrationStatus3.getQualifier() == NullabilityQualifier.NULLABLE) {
                    nullabilityQualifierWithMigrationStatus3 = NullabilityQualifierWithMigrationStatus.copy$default(nullabilityQualifierWithMigrationStatus3, NullabilityQualifier.FORCE_FLEXIBILITY, false, 2, null);
                }
            } else {
                nullabilityQualifierWithMigrationStatus3 = null;
            }
            mostSpecific = mostSpecific(nullabilityQualifierWithMigrationStatus3, nullabilityQualifierWithMigrationStatus2);
            if (mostSpecific != null) {
                nullabilityQualifier2 = mostSpecific.getQualifier();
            }
            return new JavaTypeQualifiers(nullabilityQualifier2, extractMutability, z3, (mostSpecific == null && mostSpecific.isForWarningOnly()) ? false : false);
        }
        z3 = true;
        typeParameterForArgument = typeAndDefaultQualifiers.getTypeParameterForArgument();
        if (typeParameterForArgument == null) {
        }
        nullabilityQualifierWithMigrationStatus3 = null;
        mostSpecific = mostSpecific(nullabilityQualifierWithMigrationStatus3, nullabilityQualifierWithMigrationStatus2);
        if (mostSpecific != null) {
        }
        if (mostSpecific == null) {
        }
        return new JavaTypeQualifiers(nullabilityQualifier2, extractMutability, z3, (mostSpecific == null && mostSpecific.isForWarningOnly()) ? false : false);
    }

    private final <T> void flattenTree(T t, List<T> list, Function1<? super T, ? extends Iterable<? extends T>> function1) {
        list.add(t);
        Iterable<? extends T> invoke = function1.invoke(t);
        if (invoke != null) {
            for (T t2 : invoke) {
                flattenTree(t2, list, function1);
            }
        }
    }

    private final NullabilityQualifierWithMigrationStatus getBoundsNullability(TypeParameterMarker typeParameterMarker) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        List<KotlinTypeMarker> arrayList;
        boolean z6;
        NullabilityQualifier nullabilityQualifier;
        TypeSystemContext typeSystem = getTypeSystem();
        if (!isFromJava(typeParameterMarker)) {
            return null;
        }
        List<KotlinTypeMarker> upperBounds = typeSystem.getUpperBounds(typeParameterMarker);
        List<KotlinTypeMarker> list = upperBounds;
        boolean z7 = list instanceof Collection;
        boolean z8 = false;
        if (!z7 || !list.isEmpty()) {
            for (KotlinTypeMarker kotlinTypeMarker : list) {
                if (!typeSystem.isError(kotlinTypeMarker)) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return null;
        }
        if (!z7 || !list.isEmpty()) {
            for (KotlinTypeMarker kotlinTypeMarker2 : list) {
                if (getNullabilityQualifier(kotlinTypeMarker2) != null) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    z3 = true;
                    break;
                }
            }
        }
        z3 = false;
        if (z3) {
            arrayList = upperBounds;
        } else {
            if (!z7 || !list.isEmpty()) {
                for (KotlinTypeMarker kotlinTypeMarker3 : list) {
                    if (getEnhancedForWarnings(kotlinTypeMarker3) != null) {
                        z4 = true;
                        continue;
                    } else {
                        z4 = false;
                        continue;
                    }
                    if (z4) {
                        z5 = true;
                        break;
                    }
                }
            }
            z5 = false;
            if (!z5) {
                return null;
            }
            arrayList = new ArrayList<>();
            for (KotlinTypeMarker kotlinTypeMarker4 : list) {
                KotlinTypeMarker enhancedForWarnings = getEnhancedForWarnings(kotlinTypeMarker4);
                if (enhancedForWarnings != null) {
                    arrayList.add(enhancedForWarnings);
                }
            }
        }
        List<KotlinTypeMarker> list2 = arrayList;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (KotlinTypeMarker kotlinTypeMarker5 : list2) {
                if (!typeSystem.isNullableType(kotlinTypeMarker5)) {
                    z6 = false;
                    break;
                }
            }
        }
        z6 = true;
        if (z6) {
            nullabilityQualifier = NullabilityQualifier.NULLABLE;
        } else {
            nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        }
        if (arrayList != upperBounds) {
            z8 = true;
        }
        return new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, z8);
    }

    private final NullabilityQualifier getNullabilityQualifier(KotlinTypeMarker kotlinTypeMarker) {
        TypeSystemContext typeSystem = getTypeSystem();
        if (typeSystem.isMarkedNullable(typeSystem.lowerBoundIfFlexible(kotlinTypeMarker))) {
            return NullabilityQualifier.NULLABLE;
        }
        if (!typeSystem.isMarkedNullable(typeSystem.upperBoundIfFlexible(kotlinTypeMarker))) {
            return NullabilityQualifier.NOT_NULL;
        }
        return null;
    }

    private final NullabilityQualifierWithMigrationStatus mostSpecific(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus2) {
        if (nullabilityQualifierWithMigrationStatus == null) {
            return nullabilityQualifierWithMigrationStatus2;
        }
        if (nullabilityQualifierWithMigrationStatus2 == null) {
            return nullabilityQualifierWithMigrationStatus;
        }
        if (nullabilityQualifierWithMigrationStatus.isForWarningOnly() && !nullabilityQualifierWithMigrationStatus2.isForWarningOnly()) {
            return nullabilityQualifierWithMigrationStatus2;
        }
        if (!nullabilityQualifierWithMigrationStatus.isForWarningOnly() && nullabilityQualifierWithMigrationStatus2.isForWarningOnly()) {
            return nullabilityQualifierWithMigrationStatus;
        }
        if (nullabilityQualifierWithMigrationStatus.getQualifier().compareTo(nullabilityQualifierWithMigrationStatus2.getQualifier()) < 0) {
            return nullabilityQualifierWithMigrationStatus2;
        }
        if (nullabilityQualifierWithMigrationStatus.getQualifier().compareTo(nullabilityQualifierWithMigrationStatus2.getQualifier()) > 0) {
            return nullabilityQualifierWithMigrationStatus;
        }
        return nullabilityQualifierWithMigrationStatus2;
    }

    private final List<TypeAndDefaultQualifiers> toIndexed(KotlinTypeMarker kotlinTypeMarker) {
        return flattenTree(new TypeAndDefaultQualifiers(kotlinTypeMarker, extractAndMergeDefaultQualifiers(kotlinTypeMarker, getContainerDefaultTypeQualifiers()), null), new AbstractSignatureParts$toIndexed$1$1(this, getTypeSystem()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
        if (r10 != false) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Function1<Integer, JavaTypeQualifiers> computeIndexedQualifiers(KotlinTypeMarker kotlinTypeMarker, Iterable<? extends KotlinTypeMarker> overrides, TypeEnhancementInfo typeEnhancementInfo, boolean z) {
        int collectionSizeOrDefault;
        boolean z2;
        int size;
        int i;
        boolean z3;
        boolean z4;
        Object orNull;
        JavaTypeQualifiers javaTypeQualifiers;
        KotlinTypeMarker type;
        boolean z5;
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        Intrinsics.checkNotNullParameter(overrides, "overrides");
        List<TypeAndDefaultQualifiers> indexed = toIndexed(kotlinTypeMarker);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(overrides, 10);
        ArrayList<List> arrayList = new ArrayList(collectionSizeOrDefault);
        for (KotlinTypeMarker kotlinTypeMarker2 : overrides) {
            arrayList.add(toIndexed(kotlinTypeMarker2));
        }
        if (!getForceOnlyHeadTypeConstructor()) {
            if (isCovariant()) {
                if (!(overrides instanceof Collection) || !((Collection) overrides).isEmpty()) {
                    for (KotlinTypeMarker kotlinTypeMarker3 : overrides) {
                        if (!isEqual(kotlinTypeMarker, kotlinTypeMarker3)) {
                            z5 = true;
                            break;
                        }
                    }
                }
                z5 = false;
            }
            z2 = false;
            if (!z2) {
                size = 1;
            } else {
                size = indexed.size();
            }
            JavaTypeQualifiers[] javaTypeQualifiersArr = new JavaTypeQualifiers[size];
            for (i = 0; i < size; i++) {
                JavaTypeQualifiers extractQualifiersFromAnnotations = extractQualifiersFromAnnotations(indexed.get(i));
                ArrayList arrayList2 = new ArrayList();
                for (List list : arrayList) {
                    orNull = CollectionsKt___CollectionsKt.getOrNull(list, i);
                    TypeAndDefaultQualifiers typeAndDefaultQualifiers = (TypeAndDefaultQualifiers) orNull;
                    if (typeAndDefaultQualifiers != null && (type = typeAndDefaultQualifiers.getType()) != null) {
                        javaTypeQualifiers = extractQualifiers(type);
                    } else {
                        javaTypeQualifiers = null;
                    }
                    if (javaTypeQualifiers != null) {
                        arrayList2.add(javaTypeQualifiers);
                    }
                }
                if (i == 0 && isCovariant()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i == 0 && getContainerIsVarargParameter()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                javaTypeQualifiersArr[i] = TypeEnhancementUtilsKt.computeQualifiersForOverride(extractQualifiersFromAnnotations, arrayList2, z3, z4, z);
            }
            return new AbstractSignatureParts$computeIndexedQualifiers$1(typeEnhancementInfo, javaTypeQualifiersArr);
        }
        z2 = true;
        if (!z2) {
        }
        JavaTypeQualifiers[] javaTypeQualifiersArr2 = new JavaTypeQualifiers[size];
        while (i < size) {
        }
        return new AbstractSignatureParts$computeIndexedQualifiers$1(typeEnhancementInfo, javaTypeQualifiersArr2);
    }

    public abstract boolean forceWarning(TAnnotation tannotation, KotlinTypeMarker kotlinTypeMarker);

    public abstract AbstractAnnotationTypeQualifierResolver<TAnnotation> getAnnotationTypeQualifierResolver();

    public abstract Iterable<TAnnotation> getAnnotations(KotlinTypeMarker kotlinTypeMarker);

    public abstract Iterable<TAnnotation> getContainerAnnotations();

    public abstract AnnotationQualifierApplicabilityType getContainerApplicabilityType();

    public abstract JavaTypeQualifiersByElementType getContainerDefaultTypeQualifiers();

    public abstract boolean getContainerIsVarargParameter();

    public abstract boolean getEnableImprovementsInStrictMode();

    public abstract KotlinTypeMarker getEnhancedForWarnings(KotlinTypeMarker kotlinTypeMarker);

    public boolean getForceOnlyHeadTypeConstructor() {
        return false;
    }

    public abstract FqNameUnsafe getFqNameUnsafe(KotlinTypeMarker kotlinTypeMarker);

    public abstract boolean getSkipRawTypeArguments();

    public abstract TypeSystemContext getTypeSystem();

    public abstract boolean isArrayOrPrimitiveArray(KotlinTypeMarker kotlinTypeMarker);

    public abstract boolean isCovariant();

    public abstract boolean isEqual(KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2);

    public abstract boolean isFromJava(TypeParameterMarker typeParameterMarker);

    public boolean isNotNullTypeParameterCompat(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return false;
    }

    private final <T> List<T> flattenTree(T t, Function1<? super T, ? extends Iterable<? extends T>> function1) {
        ArrayList arrayList = new ArrayList(1);
        flattenTree(t, arrayList, function1);
        return arrayList;
    }
}

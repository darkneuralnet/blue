package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
@SourceDebugExtension({"SMAP\ntypeEnhancementUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 typeEnhancementUtils.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/TypeEnhancementUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,61:1\n1#2:62\n1#2:73\n1#2:86\n1#2:99\n1603#3,9:63\n1855#3:72\n1856#3:74\n1612#3:75\n1603#3,9:76\n1855#3:85\n1856#3:87\n1612#3:88\n1603#3,9:89\n1855#3:98\n1856#3:100\n1612#3:101\n1747#3,3:102\n*S KotlinDebug\n*F\n+ 1 typeEnhancementUtils.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/TypeEnhancementUtilsKt\n*L\n41#1:73\n43#1:86\n45#1:99\n41#1:63,9\n41#1:72\n41#1:74\n41#1:75\n43#1:76,9\n43#1:85\n43#1:87\n43#1:88\n45#1:89,9\n45#1:98\n45#1:100\n45#1:101\n54#1:102,3\n*E\n"})
/* loaded from: classes8.dex */
public final class TypeEnhancementUtilsKt {
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d7, code lost:
        if (r6 != false) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final JavaTypeQualifiers computeQualifiersForOverride(JavaTypeQualifiers javaTypeQualifiers, Collection<JavaTypeQualifiers> superQualifiers, boolean z, boolean z2, boolean z3) {
        Set set;
        NullabilityQualifier nullabilityQualifier;
        Set set2;
        boolean z4;
        boolean z5;
        boolean z6;
        Set set3;
        Intrinsics.checkNotNullParameter(javaTypeQualifiers, "<this>");
        Intrinsics.checkNotNullParameter(superQualifiers, "superQualifiers");
        Collection<JavaTypeQualifiers> collection = superQualifiers;
        ArrayList arrayList = new ArrayList();
        for (JavaTypeQualifiers javaTypeQualifiers2 : collection) {
            NullabilityQualifier nullabilityForErrors = getNullabilityForErrors(javaTypeQualifiers2);
            if (nullabilityForErrors != null) {
                arrayList.add(nullabilityForErrors);
            }
        }
        set = CollectionsKt___CollectionsKt.toSet(arrayList);
        NullabilityQualifier select = select(set, getNullabilityForErrors(javaTypeQualifiers), z);
        if (select == null) {
            ArrayList arrayList2 = new ArrayList();
            for (JavaTypeQualifiers javaTypeQualifiers3 : collection) {
                NullabilityQualifier nullability = javaTypeQualifiers3.getNullability();
                if (nullability != null) {
                    arrayList2.add(nullability);
                }
            }
            set3 = CollectionsKt___CollectionsKt.toSet(arrayList2);
            nullabilityQualifier = select(set3, javaTypeQualifiers.getNullability(), z);
        } else {
            nullabilityQualifier = select;
        }
        ArrayList arrayList3 = new ArrayList();
        for (JavaTypeQualifiers javaTypeQualifiers4 : collection) {
            MutabilityQualifier mutability = javaTypeQualifiers4.getMutability();
            if (mutability != null) {
                arrayList3.add(mutability);
            }
        }
        set2 = CollectionsKt___CollectionsKt.toSet(arrayList3);
        MutabilityQualifier mutabilityQualifier = (MutabilityQualifier) select(set2, MutabilityQualifier.MUTABLE, MutabilityQualifier.READ_ONLY, javaTypeQualifiers.getMutability(), z);
        NullabilityQualifier nullabilityQualifier2 = null;
        boolean z7 = true;
        if (nullabilityQualifier != null) {
            if (!z3 && (!z2 || nullabilityQualifier != NullabilityQualifier.NULLABLE)) {
                z6 = false;
            } else {
                z6 = true;
            }
            if (!z6) {
                nullabilityQualifier2 = nullabilityQualifier;
            }
        }
        if (nullabilityQualifier2 == NullabilityQualifier.NOT_NULL) {
            if (!javaTypeQualifiers.getDefinitelyNotNull()) {
                if (!collection.isEmpty()) {
                    for (JavaTypeQualifiers javaTypeQualifiers5 : collection) {
                        if (javaTypeQualifiers5.getDefinitelyNotNull()) {
                            z5 = true;
                            break;
                        }
                    }
                }
                z5 = false;
            }
            z4 = true;
            return new JavaTypeQualifiers(nullabilityQualifier2, mutabilityQualifier, z4, (nullabilityQualifier2 != null || select == nullabilityQualifier) ? false : false);
        }
        z4 = false;
        if (nullabilityQualifier2 != null) {
        }
        return new JavaTypeQualifiers(nullabilityQualifier2, mutabilityQualifier, z4, (nullabilityQualifier2 != null || select == nullabilityQualifier) ? false : false);
    }

    private static final NullabilityQualifier getNullabilityForErrors(JavaTypeQualifiers javaTypeQualifiers) {
        if (javaTypeQualifiers.isNullabilityQualifierForWarning()) {
            return null;
        }
        return javaTypeQualifiers.getNullability();
    }

    public static final boolean hasEnhancedNullability(TypeSystemCommonBackendContext typeSystemCommonBackendContext, KotlinTypeMarker type) {
        Intrinsics.checkNotNullParameter(typeSystemCommonBackendContext, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        FqName ENHANCED_NULLABILITY_ANNOTATION = JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION;
        Intrinsics.checkNotNullExpressionValue(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        return typeSystemCommonBackendContext.hasAnnotation(type, ENHANCED_NULLABILITY_ANNOTATION);
    }

    private static final <T> T select(Set<? extends T> set, T t, T t2, T t3, boolean z) {
        Set plus;
        Set<? extends T> set2;
        Object singleOrNull;
        if (z) {
            T t4 = set.contains(t) ? t : set.contains(t2) ? t2 : null;
            if (Intrinsics.areEqual(t4, t) && Intrinsics.areEqual(t3, t2)) {
                return null;
            }
            return t3 == null ? t4 : t3;
        }
        if (t3 != null) {
            plus = SetsKt___SetsKt.plus(set, t3);
            set2 = CollectionsKt___CollectionsKt.toSet(plus);
            if (set2 != null) {
                set = set2;
            }
        }
        singleOrNull = CollectionsKt___CollectionsKt.singleOrNull(set);
        return (T) singleOrNull;
    }

    private static final NullabilityQualifier select(Set<? extends NullabilityQualifier> set, NullabilityQualifier nullabilityQualifier, boolean z) {
        NullabilityQualifier nullabilityQualifier2 = NullabilityQualifier.FORCE_FLEXIBILITY;
        return nullabilityQualifier == nullabilityQualifier2 ? nullabilityQualifier2 : (NullabilityQualifier) select(set, NullabilityQualifier.NOT_NULL, NullabilityQualifier.NULLABLE, nullabilityQualifier, z);
    }
}

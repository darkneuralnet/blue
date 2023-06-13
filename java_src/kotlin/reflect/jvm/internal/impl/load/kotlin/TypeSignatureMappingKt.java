package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementUtilsKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
@SourceDebugExtension({"SMAP\ntypeSignatureMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 typeSignatureMapping.kt\norg/jetbrains/kotlin/load/kotlin/TypeSignatureMappingKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,103:1\n1#2:104\n1747#3,3:105\n*S KotlinDebug\n*F\n+ 1 typeSignatureMapping.kt\norg/jetbrains/kotlin/load/kotlin/TypeSignatureMappingKt\n*L\n55#1:105,3\n*E\n"})
/* loaded from: classes8.dex */
public final class TypeSignatureMappingKt {
    public static final <T> T boxTypeIfNeeded(JvmTypeFactory<T> jvmTypeFactory, T possiblyPrimitiveType, boolean z) {
        Intrinsics.checkNotNullParameter(jvmTypeFactory, "<this>");
        Intrinsics.checkNotNullParameter(possiblyPrimitiveType, "possiblyPrimitiveType");
        if (z) {
            return jvmTypeFactory.boxType(possiblyPrimitiveType);
        }
        return possiblyPrimitiveType;
    }

    public static final <T> T mapBuiltInType(TypeSystemCommonBackendContext typeSystemCommonBackendContext, KotlinTypeMarker type, JvmTypeFactory<T> typeFactory, TypeMappingMode mode) {
        PrimitiveType primitiveArrayType;
        ClassId classId;
        Intrinsics.checkNotNullParameter(typeSystemCommonBackendContext, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(typeFactory, "typeFactory");
        Intrinsics.checkNotNullParameter(mode, "mode");
        TypeConstructorMarker typeConstructor = typeSystemCommonBackendContext.typeConstructor(type);
        if (!typeSystemCommonBackendContext.isClassTypeConstructor(typeConstructor)) {
            return null;
        }
        PrimitiveType primitiveType = typeSystemCommonBackendContext.getPrimitiveType(typeConstructor);
        boolean z = true;
        if (primitiveType != null) {
            T createPrimitiveType = typeFactory.createPrimitiveType(primitiveType);
            if (!typeSystemCommonBackendContext.isNullableType(type) && !TypeEnhancementUtilsKt.hasEnhancedNullability(typeSystemCommonBackendContext, type)) {
                z = false;
            }
            return (T) boxTypeIfNeeded(typeFactory, createPrimitiveType, z);
        }
        if (typeSystemCommonBackendContext.getPrimitiveArrayType(typeConstructor) != null) {
            return typeFactory.createFromString('[' + JvmPrimitiveType.get(primitiveArrayType).getDesc());
        }
        if (typeSystemCommonBackendContext.isUnderKotlinPackage(typeConstructor)) {
            FqNameUnsafe classFqNameUnsafe = typeSystemCommonBackendContext.getClassFqNameUnsafe(typeConstructor);
            if (classFqNameUnsafe != null) {
                classId = JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(classFqNameUnsafe);
            } else {
                classId = null;
            }
            if (classId != null) {
                if (!mode.getKotlinCollectionsToJavaCollections()) {
                    List<JavaToKotlinClassMap.PlatformMutabilityMapping> mutabilityMappings = JavaToKotlinClassMap.INSTANCE.getMutabilityMappings();
                    if (!(mutabilityMappings instanceof Collection) || !mutabilityMappings.isEmpty()) {
                        for (JavaToKotlinClassMap.PlatformMutabilityMapping platformMutabilityMapping : mutabilityMappings) {
                            if (Intrinsics.areEqual(platformMutabilityMapping.getJavaClass(), classId)) {
                                break;
                            }
                        }
                    }
                    z = false;
                    if (z) {
                        return null;
                    }
                }
                String internalName = JvmClassName.byClassId(classId).getInternalName();
                Intrinsics.checkNotNullExpressionValue(internalName, "byClassId(classId).internalName");
                return typeFactory.createObjectType(internalName);
            }
        }
        return null;
    }
}

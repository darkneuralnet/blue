package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractLazyTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
@SourceDebugExtension({"SMAP\nLazyJavaTypeParameterDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaTypeParameterDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaTypeParameterDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,75:1\n1549#2:76\n1620#2,3:77\n*S KotlinDebug\n*F\n+ 1 LazyJavaTypeParameterDescriptor.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaTypeParameterDescriptor\n*L\n62#1:76\n62#1:77,3\n*E\n"})
/* loaded from: classes8.dex */
public final class LazyJavaTypeParameterDescriptor extends AbstractLazyTypeParameterDescriptor {

    /* renamed from: c */
    private final LazyJavaResolverContext f95004c;
    private final JavaTypeParameter javaTypeParameter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaTypeParameterDescriptor(LazyJavaResolverContext c, JavaTypeParameter javaTypeParameter, int i, DeclarationDescriptor containingDeclaration) {
        super(c.getStorageManager(), containingDeclaration, new LazyJavaAnnotations(c, javaTypeParameter, false, 4, null), javaTypeParameter.getName(), Variance.INVARIANT, false, i, SourceElement.NO_SOURCE, c.getComponents().getSupertypeLoopChecker());
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(javaTypeParameter, "javaTypeParameter");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        this.f95004c = c;
        this.javaTypeParameter = javaTypeParameter;
    }

    private final List<KotlinType> computeNotEnhancedBounds() {
        int collectionSizeOrDefault;
        List<KotlinType> listOf;
        Collection<JavaClassifierType> upperBounds = this.javaTypeParameter.getUpperBounds();
        if (upperBounds.isEmpty()) {
            SimpleType anyType = this.f95004c.getModule().getBuiltIns().getAnyType();
            Intrinsics.checkNotNullExpressionValue(anyType, "c.module.builtIns.anyType");
            SimpleType nullableAnyType = this.f95004c.getModule().getBuiltIns().getNullableAnyType();
            Intrinsics.checkNotNullExpressionValue(nullableAnyType, "c.module.builtIns.nullableAnyType");
            listOf = CollectionsKt__CollectionsJVMKt.listOf(KotlinTypeFactory.flexibleType(anyType, nullableAnyType));
            return listOf;
        }
        Collection<JavaClassifierType> collection = upperBounds;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (JavaClassifierType javaClassifierType : collection) {
            arrayList.add(this.f95004c.getTypeResolver().transformJavaType(javaClassifierType, JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, this, 3, null)));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    public List<KotlinType> processBoundsWithoutCycles(List<? extends KotlinType> bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        return this.f95004c.getComponents().getSignatureEnhancement().enhanceTypeParameterBounds(this, bounds, this.f95004c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    /* renamed from: reportSupertypeLoopError */
    public void mo118093reportSupertypeLoopError(KotlinType type) {
        Intrinsics.checkNotNullParameter(type, "type");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    public List<KotlinType> resolveUpperBounds() {
        return computeNotEnhancedBounds();
    }
}

package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
@SourceDebugExtension({"SMAP\nLazyJavaClassMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaClassMemberScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassMemberScope$constructors$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 collections.kt\norg/jetbrains/kotlin/utils/CollectionsKt\n*L\n1#1,890:1\n2624#2,3:891\n1#3:894\n55#4:895\n*S KotlinDebug\n*F\n+ 1 LazyJavaClassMemberScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassMemberScope$constructors$1\n*L\n95#1:891,3\n105#1:895\n*E\n"})
/* loaded from: classes8.dex */
public final class LazyJavaClassMemberScope$constructors$1 extends Lambda implements Function0<List<? extends ClassConstructorDescriptor>> {

    /* renamed from: $c */
    final /* synthetic */ LazyJavaResolverContext f94997$c;
    final /* synthetic */ LazyJavaClassMemberScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope$constructors$1(LazyJavaClassMemberScope lazyJavaClassMemberScope, LazyJavaResolverContext lazyJavaResolverContext) {
        super(0);
        this.this$0 = lazyJavaClassMemberScope;
        this.f94997$c = lazyJavaResolverContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Collection] */
    @Override // kotlin.jvm.functions.Function0
    public final List<? extends ClassConstructorDescriptor> invoke() {
        JavaClass javaClass;
        JavaClass javaClass2;
        List<? extends ClassConstructorDescriptor> list;
        ClassConstructorDescriptor createDefaultConstructor;
        List listOfNotNull;
        ClassConstructorDescriptor createDefaultRecordConstructor;
        JavaClass javaClass3;
        JavaClassConstructorDescriptor resolveConstructor;
        javaClass = this.this$0.jClass;
        Collection<JavaConstructor> constructors = javaClass.getConstructors();
        ArrayList<ClassConstructorDescriptor> arrayList = new ArrayList(constructors.size());
        for (JavaConstructor javaConstructor : constructors) {
            resolveConstructor = this.this$0.resolveConstructor(javaConstructor);
            arrayList.add(resolveConstructor);
        }
        javaClass2 = this.this$0.jClass;
        if (javaClass2.isRecord()) {
            createDefaultRecordConstructor = this.this$0.createDefaultRecordConstructor();
            boolean z = false;
            String computeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(createDefaultRecordConstructor, false, false, 2, null);
            if (!arrayList.isEmpty()) {
                for (ClassConstructorDescriptor classConstructorDescriptor : arrayList) {
                    if (Intrinsics.areEqual(MethodSignatureMappingKt.computeJvmDescriptor$default(classConstructorDescriptor, false, false, 2, null), computeJvmDescriptor$default)) {
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                arrayList.add(createDefaultRecordConstructor);
                JavaResolverCache javaResolverCache = this.f94997$c.getComponents().getJavaResolverCache();
                javaClass3 = this.this$0.jClass;
                javaResolverCache.recordConstructor(javaClass3, createDefaultRecordConstructor);
            }
        }
        LazyJavaResolverContext lazyJavaResolverContext = this.f94997$c;
        lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().generateConstructors(lazyJavaResolverContext, this.this$0.getOwnerDescriptor(), arrayList);
        SignatureEnhancement signatureEnhancement = this.f94997$c.getComponents().getSignatureEnhancement();
        LazyJavaResolverContext lazyJavaResolverContext2 = this.f94997$c;
        LazyJavaClassMemberScope lazyJavaClassMemberScope = this.this$0;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = arrayList;
        if (isEmpty) {
            createDefaultConstructor = lazyJavaClassMemberScope.createDefaultConstructor();
            listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(createDefaultConstructor);
            arrayList2 = listOfNotNull;
        }
        list = CollectionsKt___CollectionsKt.toList(signatureEnhancement.enhanceSignatures(lazyJavaResolverContext2, arrayList2));
        return list;
    }
}

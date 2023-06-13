package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
@SourceDebugExtension({"SMAP\nLazyJavaClassMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaClassMemberScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassMemberScope$nestedClasses$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,890:1\n1#2:891\n*E\n"})
/* loaded from: classes8.dex */
public final class LazyJavaClassMemberScope$nestedClasses$1 extends Lambda implements Function1<Name, ClassDescriptor> {

    /* renamed from: $c */
    final /* synthetic */ LazyJavaResolverContext f94999$c;
    final /* synthetic */ LazyJavaClassMemberScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope$nestedClasses$1(LazyJavaClassMemberScope lazyJavaClassMemberScope, LazyJavaResolverContext lazyJavaResolverContext) {
        super(1);
        this.this$0 = lazyJavaClassMemberScope;
        this.f94999$c = lazyJavaResolverContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ClassDescriptor invoke(Name name) {
        NotNullLazyValue notNullLazyValue;
        NotNullLazyValue notNullLazyValue2;
        NotNullLazyValue notNullLazyValue3;
        List<ClassDescriptor> createListBuilder;
        List build;
        Object single;
        JavaClass javaClass;
        Intrinsics.checkNotNullParameter(name, "name");
        notNullLazyValue = this.this$0.nestedClassIndex;
        if (((Set) notNullLazyValue.invoke()).contains(name)) {
            JavaClassFinder finder = this.f94999$c.getComponents().getFinder();
            ClassId classId = DescriptorUtilsKt.getClassId(this.this$0.getOwnerDescriptor());
            Intrinsics.checkNotNull(classId);
            ClassId createNestedClassId = classId.createNestedClassId(name);
            Intrinsics.checkNotNullExpressionValue(createNestedClassId, "ownerDescriptor.classId!…createNestedClassId(name)");
            javaClass = this.this$0.jClass;
            JavaClass findClass = finder.findClass(new JavaClassFinder.Request(createNestedClassId, null, javaClass, 2, null));
            if (findClass != null) {
                LazyJavaResolverContext lazyJavaResolverContext = this.f94999$c;
                LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(lazyJavaResolverContext, this.this$0.getOwnerDescriptor(), findClass, null, 8, null);
                lazyJavaResolverContext.getComponents().getJavaClassesTracker().reportClass(lazyJavaClassDescriptor);
                return lazyJavaClassDescriptor;
            }
            return null;
        }
        notNullLazyValue2 = this.this$0.generatedNestedClassNames;
        if (((Set) notNullLazyValue2.invoke()).contains(name)) {
            LazyJavaResolverContext lazyJavaResolverContext2 = this.f94999$c;
            LazyJavaClassMemberScope lazyJavaClassMemberScope = this.this$0;
            createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
            lazyJavaResolverContext2.getComponents().getSyntheticPartsProvider().generateNestedClass(lazyJavaResolverContext2, lazyJavaClassMemberScope.getOwnerDescriptor(), name, createListBuilder);
            build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
            int size = build.size();
            if (size != 0) {
                if (size == 1) {
                    single = CollectionsKt___CollectionsKt.single((List<? extends Object>) build);
                    return (ClassDescriptor) single;
                }
                throw new IllegalStateException(("Multiple classes with same name are generated: " + build).toString());
            }
            return null;
        }
        notNullLazyValue3 = this.this$0.enumEntryIndex;
        JavaField javaField = (JavaField) ((Map) notNullLazyValue3.invoke()).get(name);
        if (javaField != null) {
            return EnumEntrySyntheticClassDescriptor.create(this.f94999$c.getStorageManager(), this.this$0.getOwnerDescriptor(), name, this.f94999$c.getStorageManager().createLazyValue(new LazyJavaClassMemberScope$nestedClasses$1$enumMemberNames$1(this.this$0)), LazyJavaAnnotationsKt.resolveAnnotations(this.f94999$c, javaField), this.f94999$c.getComponents().getSourceElementFactory().source(javaField));
        }
        return null;
    }
}

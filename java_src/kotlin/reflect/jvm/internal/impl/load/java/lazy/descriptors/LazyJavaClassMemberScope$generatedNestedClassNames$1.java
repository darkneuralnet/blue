package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.name.Name;
@SourceDebugExtension({"SMAP\nLazyJavaClassMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaClassMemberScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaClassMemberScope$generatedNestedClassNames$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,890:1\n1#2:891\n*E\n"})
/* loaded from: classes8.dex */
public final class LazyJavaClassMemberScope$generatedNestedClassNames$1 extends Lambda implements Function0<Set<? extends Name>> {

    /* renamed from: $c */
    final /* synthetic */ LazyJavaResolverContext f94998$c;
    final /* synthetic */ LazyJavaClassMemberScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope$generatedNestedClassNames$1(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(0);
        this.f94998$c = lazyJavaResolverContext;
        this.this$0 = lazyJavaClassMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Set<? extends Name> invoke() {
        Set<? extends Name> set;
        LazyJavaResolverContext lazyJavaResolverContext = this.f94998$c;
        set = CollectionsKt___CollectionsKt.toSet(lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().getNestedClassNames(lazyJavaResolverContext, this.this$0.getOwnerDescriptor()));
        return set;
    }
}

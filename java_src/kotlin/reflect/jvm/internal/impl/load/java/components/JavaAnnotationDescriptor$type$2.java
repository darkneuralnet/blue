package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
/* loaded from: classes8.dex */
public final class JavaAnnotationDescriptor$type$2 extends Lambda implements Function0<SimpleType> {

    /* renamed from: $c */
    final /* synthetic */ LazyJavaResolverContext f94990$c;
    final /* synthetic */ JavaAnnotationDescriptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaAnnotationDescriptor$type$2(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotationDescriptor javaAnnotationDescriptor) {
        super(0);
        this.f94990$c = lazyJavaResolverContext;
        this.this$0 = javaAnnotationDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SimpleType invoke() {
        SimpleType defaultType = this.f94990$c.getModule().getBuiltIns().getBuiltInClassByFqName(this.this$0.getFqName()).getDefaultType();
        Intrinsics.checkNotNullExpressionValue(defaultType, "c.module.builtIns.getBui…qName(fqName).defaultType");
        return defaultType;
    }
}

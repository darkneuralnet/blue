package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
/* loaded from: classes8.dex */
public final class JvmBuiltInsCustomizer$notConsideredDeprecation$2 extends Lambda implements Function0<Annotations> {
    final /* synthetic */ JvmBuiltInsCustomizer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsCustomizer$notConsideredDeprecation$2(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        super(0);
        this.this$0 = jvmBuiltInsCustomizer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Annotations invoke() {
        ModuleDescriptor moduleDescriptor;
        List<? extends AnnotationDescriptor> listOf;
        moduleDescriptor = this.this$0.moduleDescriptor;
        AnnotationDescriptor createDeprecatedAnnotation$default = AnnotationUtilKt.createDeprecatedAnnotation$default(moduleDescriptor.getBuiltIns(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, 6, null);
        Annotations.Companion companion = Annotations.Companion;
        listOf = CollectionsKt__CollectionsJVMKt.listOf(createDeprecatedAnnotation$default);
        return companion.create(listOf);
    }
}

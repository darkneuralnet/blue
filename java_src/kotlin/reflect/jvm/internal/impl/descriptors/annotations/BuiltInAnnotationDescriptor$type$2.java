package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
/* loaded from: classes8.dex */
public final class BuiltInAnnotationDescriptor$type$2 extends Lambda implements Function0<SimpleType> {
    final /* synthetic */ BuiltInAnnotationDescriptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuiltInAnnotationDescriptor$type$2(BuiltInAnnotationDescriptor builtInAnnotationDescriptor) {
        super(0);
        this.this$0 = builtInAnnotationDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SimpleType invoke() {
        KotlinBuiltIns kotlinBuiltIns;
        kotlinBuiltIns = this.this$0.builtIns;
        return kotlinBuiltIns.getBuiltInClassByFqName(this.this$0.getFqName()).getDefaultType();
    }
}

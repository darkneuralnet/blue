package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
/* loaded from: classes8.dex */
public final class AbstractTypeAliasDescriptor$isInner$1 extends Lambda implements Function1<UnwrappedType, Boolean> {
    final /* synthetic */ AbstractTypeAliasDescriptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractTypeAliasDescriptor$isInner$1(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor) {
        super(1);
        this.this$0 = abstractTypeAliasDescriptor;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(UnwrappedType type) {
        Intrinsics.checkNotNullExpressionValue(type, "type");
        boolean z = false;
        if (!KotlinTypeKt.isError(type)) {
            AbstractTypeAliasDescriptor abstractTypeAliasDescriptor = this.this$0;
            ClassifierDescriptor mo118090getDeclarationDescriptor = type.getConstructor().mo118090getDeclarationDescriptor();
            if ((mo118090getDeclarationDescriptor instanceof TypeParameterDescriptor) && !Intrinsics.areEqual(((TypeParameterDescriptor) mo118090getDeclarationDescriptor).getContainingDeclaration(), abstractTypeAliasDescriptor)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}

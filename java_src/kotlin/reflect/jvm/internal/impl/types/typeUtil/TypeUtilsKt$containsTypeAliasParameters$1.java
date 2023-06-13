package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
/* loaded from: classes8.dex */
public final class TypeUtilsKt$containsTypeAliasParameters$1 extends Lambda implements Function1<UnwrappedType, Boolean> {
    public static final TypeUtilsKt$containsTypeAliasParameters$1 INSTANCE = new TypeUtilsKt$containsTypeAliasParameters$1();

    public TypeUtilsKt$containsTypeAliasParameters$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(UnwrappedType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ClassifierDescriptor mo118090getDeclarationDescriptor = it.getConstructor().mo118090getDeclarationDescriptor();
        return Boolean.valueOf(mo118090getDeclarationDescriptor != null ? TypeUtilsKt.isTypeAliasParameter(mo118090getDeclarationDescriptor) : false);
    }
}

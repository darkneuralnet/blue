package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
/* loaded from: classes8.dex */
public final class LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1$1 extends Lambda implements Function1<KotlinType, ClassDescriptor> {
    public static final LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1$1 INSTANCE = new LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1$1();

    public LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ClassDescriptor invoke(KotlinType kotlinType) {
        ClassifierDescriptor mo118090getDeclarationDescriptor = kotlinType.getConstructor().mo118090getDeclarationDescriptor();
        if (mo118090getDeclarationDescriptor instanceof ClassDescriptor) {
            return (ClassDescriptor) mo118090getDeclarationDescriptor;
        }
        return null;
    }
}

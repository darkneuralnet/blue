package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
/* loaded from: classes8.dex */
public final class SignatureEnhancement$containsFunctionN$1 extends Lambda implements Function1<UnwrappedType, Boolean> {
    public static final SignatureEnhancement$containsFunctionN$1 INSTANCE = new SignatureEnhancement$containsFunctionN$1();

    public SignatureEnhancement$containsFunctionN$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(UnwrappedType unwrappedType) {
        ClassifierDescriptor mo118090getDeclarationDescriptor = unwrappedType.getConstructor().mo118090getDeclarationDescriptor();
        if (mo118090getDeclarationDescriptor == null) {
            return Boolean.FALSE;
        }
        Name name = mo118090getDeclarationDescriptor.getName();
        JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
        return Boolean.valueOf(Intrinsics.areEqual(name, javaToKotlinClassMap.getFUNCTION_N_FQ_NAME().shortName()) && Intrinsics.areEqual(DescriptorUtilsKt.fqNameOrNull(mo118090getDeclarationDescriptor), javaToKotlinClassMap.getFUNCTION_N_FQ_NAME()));
    }
}

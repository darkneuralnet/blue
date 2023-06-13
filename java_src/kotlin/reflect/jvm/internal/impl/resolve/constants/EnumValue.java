package kotlin.reflect.jvm.internal.impl.resolve.constants;

import ch.qos.logback.core.CoreConstants;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
@SourceDebugExtension({"SMAP\nconstantValues.kt\nKotlin\n*S Kotlin\n*F\n+ 1 constantValues.kt\norg/jetbrains/kotlin/resolve/constants/EnumValue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,320:1\n1#2:321\n*E\n"})
/* loaded from: classes8.dex */
public final class EnumValue extends ConstantValue<Pair<? extends ClassId, ? extends Name>> {
    private final ClassId enumClassId;
    private final Name enumEntryName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumValue(ClassId enumClassId, Name enumEntryName) {
        super(TuplesKt.m28425to(enumClassId, enumEntryName));
        Intrinsics.checkNotNullParameter(enumClassId, "enumClassId");
        Intrinsics.checkNotNullParameter(enumEntryName, "enumEntryName");
        this.enumClassId = enumClassId;
        this.enumEntryName = enumEntryName;
    }

    public final Name getEnumEntryName() {
        return this.enumEntryName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public KotlinType getType(ModuleDescriptor module) {
        Intrinsics.checkNotNullParameter(module, "module");
        ClassDescriptor findClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(module, this.enumClassId);
        SimpleType simpleType = null;
        if (findClassAcrossModuleDependencies != null) {
            if (!DescriptorUtils.isEnumClass(findClassAcrossModuleDependencies)) {
                findClassAcrossModuleDependencies = null;
            }
            if (findClassAcrossModuleDependencies != null) {
                simpleType = findClassAcrossModuleDependencies.getDefaultType();
            }
        }
        if (simpleType == null) {
            ErrorTypeKind errorTypeKind = ErrorTypeKind.ERROR_ENUM_TYPE;
            String classId = this.enumClassId.toString();
            Intrinsics.checkNotNullExpressionValue(classId, "enumClassId.toString()");
            String name = this.enumEntryName.toString();
            Intrinsics.checkNotNullExpressionValue(name, "enumEntryName.toString()");
            return ErrorUtils.createErrorType(errorTypeKind, classId, name);
        }
        return simpleType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.enumClassId.getShortClassName());
        sb.append(CoreConstants.DOT);
        sb.append(this.enumEntryName);
        return sb.toString();
    }
}

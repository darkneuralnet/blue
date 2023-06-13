package kotlin.reflect.jvm.internal.impl.resolve.constants;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
/* loaded from: classes8.dex */
public final class KClassValue extends ConstantValue<Value> {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ConstantValue<?> create(KotlinType argumentType) {
            Object single;
            Intrinsics.checkNotNullParameter(argumentType, "argumentType");
            if (KotlinTypeKt.isError(argumentType)) {
                return null;
            }
            KotlinType kotlinType = argumentType;
            int i = 0;
            while (KotlinBuiltIns.isArray(kotlinType)) {
                single = CollectionsKt___CollectionsKt.single((List<? extends Object>) kotlinType.getArguments());
                kotlinType = ((TypeProjection) single).getType();
                Intrinsics.checkNotNullExpressionValue(kotlinType, "type.arguments.single().type");
                i++;
            }
            ClassifierDescriptor mo118090getDeclarationDescriptor = kotlinType.getConstructor().mo118090getDeclarationDescriptor();
            if (mo118090getDeclarationDescriptor instanceof ClassDescriptor) {
                ClassId classId = DescriptorUtilsKt.getClassId(mo118090getDeclarationDescriptor);
                if (classId == null) {
                    return new KClassValue(new Value.LocalClass(argumentType));
                }
                return new KClassValue(classId, i);
            } else if (!(mo118090getDeclarationDescriptor instanceof TypeParameterDescriptor)) {
                return null;
            } else {
                ClassId classId2 = ClassId.topLevel(StandardNames.FqNames.any.toSafe());
                Intrinsics.checkNotNullExpressionValue(classId2, "topLevel(StandardNames.FqNames.any.toSafe())");
                return new KClassValue(classId2, 0);
            }
        }

        private Companion() {
        }
    }

    /* loaded from: classes8.dex */
    public static abstract class Value {

        /* loaded from: classes8.dex */
        public static final class LocalClass extends Value {
            private final KotlinType type;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LocalClass(KotlinType type) {
                super(null);
                Intrinsics.checkNotNullParameter(type, "type");
                this.type = type;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LocalClass) && Intrinsics.areEqual(this.type, ((LocalClass) obj).type);
            }

            public final KotlinType getType() {
                return this.type;
            }

            public int hashCode() {
                return this.type.hashCode();
            }

            public String toString() {
                return "LocalClass(type=" + this.type + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        /* loaded from: classes8.dex */
        public static final class NormalClass extends Value {
            private final ClassLiteralValue value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NormalClass(ClassLiteralValue value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NormalClass) && Intrinsics.areEqual(this.value, ((NormalClass) obj).value);
            }

            public final int getArrayDimensions() {
                return this.value.getArrayNestedness();
            }

            public final ClassId getClassId() {
                return this.value.getClassId();
            }

            public final ClassLiteralValue getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "NormalClass(value=" + this.value + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        public /* synthetic */ Value(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Value() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KClassValue(Value value) {
        super(value);
        Intrinsics.checkNotNullParameter(value, "value");
    }

    public final KotlinType getArgumentType(ModuleDescriptor module) {
        Intrinsics.checkNotNullParameter(module, "module");
        Value value = getValue();
        if (value instanceof Value.LocalClass) {
            return ((Value.LocalClass) getValue()).getType();
        }
        if (value instanceof Value.NormalClass) {
            ClassLiteralValue value2 = ((Value.NormalClass) getValue()).getValue();
            ClassId component1 = value2.component1();
            int component2 = value2.component2();
            ClassDescriptor findClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(module, component1);
            if (findClassAcrossModuleDependencies == null) {
                ErrorTypeKind errorTypeKind = ErrorTypeKind.UNRESOLVED_KCLASS_CONSTANT_VALUE;
                String classId = component1.toString();
                Intrinsics.checkNotNullExpressionValue(classId, "classId.toString()");
                return ErrorUtils.createErrorType(errorTypeKind, classId, String.valueOf(component2));
            }
            SimpleType defaultType = findClassAcrossModuleDependencies.getDefaultType();
            Intrinsics.checkNotNullExpressionValue(defaultType, "descriptor.defaultType");
            KotlinType replaceArgumentsWithStarProjections = TypeUtilsKt.replaceArgumentsWithStarProjections(defaultType);
            for (int i = 0; i < component2; i++) {
                replaceArgumentsWithStarProjections = module.getBuiltIns().getArrayType(Variance.INVARIANT, replaceArgumentsWithStarProjections);
                Intrinsics.checkNotNullExpressionValue(replaceArgumentsWithStarProjections, "module.builtIns.getArray…Variance.INVARIANT, type)");
            }
            return replaceArgumentsWithStarProjections;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public KotlinType getType(ModuleDescriptor module) {
        List listOf;
        Intrinsics.checkNotNullParameter(module, "module");
        TypeAttributes empty = TypeAttributes.Companion.getEmpty();
        ClassDescriptor kClass = module.getBuiltIns().getKClass();
        Intrinsics.checkNotNullExpressionValue(kClass, "module.builtIns.kClass");
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new TypeProjectionImpl(getArgumentType(module)));
        return KotlinTypeFactory.simpleNotNullType(empty, kClass, listOf);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KClassValue(ClassLiteralValue value) {
        this(new Value.NormalClass(value));
        Intrinsics.checkNotNullParameter(value, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KClassValue(ClassId classId, int i) {
        this(new ClassLiteralValue(classId, i));
        Intrinsics.checkNotNullParameter(classId, "classId");
    }
}

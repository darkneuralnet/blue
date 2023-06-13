package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.util.Check;
/* loaded from: classes8.dex */
public abstract class ReturnsCheck implements Check {
    private final String description;
    private final String name;
    private final Function1<KotlinBuiltIns, KotlinType> type;

    /* loaded from: classes8.dex */
    public static final class ReturnsBoolean extends ReturnsCheck {
        public static final ReturnsBoolean INSTANCE = new ReturnsBoolean();

        /* renamed from: kotlin.reflect.jvm.internal.impl.util.ReturnsCheck$ReturnsBoolean$1 */
        /* loaded from: classes8.dex */
        public static final class C254951 extends Lambda implements Function1<KotlinBuiltIns, KotlinType> {
            public static final C254951 INSTANCE = new C254951();

            public C254951() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final KotlinType invoke(KotlinBuiltIns kotlinBuiltIns) {
                Intrinsics.checkNotNullParameter(kotlinBuiltIns, "$this$null");
                SimpleType booleanType = kotlinBuiltIns.getBooleanType();
                Intrinsics.checkNotNullExpressionValue(booleanType, "booleanType");
                return booleanType;
            }
        }

        private ReturnsBoolean() {
            super("Boolean", C254951.INSTANCE, null);
        }
    }

    /* loaded from: classes8.dex */
    public static final class ReturnsInt extends ReturnsCheck {
        public static final ReturnsInt INSTANCE = new ReturnsInt();

        /* renamed from: kotlin.reflect.jvm.internal.impl.util.ReturnsCheck$ReturnsInt$1 */
        /* loaded from: classes8.dex */
        public static final class C254961 extends Lambda implements Function1<KotlinBuiltIns, KotlinType> {
            public static final C254961 INSTANCE = new C254961();

            public C254961() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final KotlinType invoke(KotlinBuiltIns kotlinBuiltIns) {
                Intrinsics.checkNotNullParameter(kotlinBuiltIns, "$this$null");
                SimpleType intType = kotlinBuiltIns.getIntType();
                Intrinsics.checkNotNullExpressionValue(intType, "intType");
                return intType;
            }
        }

        private ReturnsInt() {
            super("Int", C254961.INSTANCE, null);
        }
    }

    /* loaded from: classes8.dex */
    public static final class ReturnsUnit extends ReturnsCheck {
        public static final ReturnsUnit INSTANCE = new ReturnsUnit();

        /* renamed from: kotlin.reflect.jvm.internal.impl.util.ReturnsCheck$ReturnsUnit$1 */
        /* loaded from: classes8.dex */
        public static final class C254971 extends Lambda implements Function1<KotlinBuiltIns, KotlinType> {
            public static final C254971 INSTANCE = new C254971();

            public C254971() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final KotlinType invoke(KotlinBuiltIns kotlinBuiltIns) {
                Intrinsics.checkNotNullParameter(kotlinBuiltIns, "$this$null");
                SimpleType unitType = kotlinBuiltIns.getUnitType();
                Intrinsics.checkNotNullExpressionValue(unitType, "unitType");
                return unitType;
            }
        }

        private ReturnsUnit() {
            super("Unit", C254971.INSTANCE, null);
        }
    }

    public /* synthetic */ ReturnsCheck(String str, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, function1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public boolean check(FunctionDescriptor functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        return Intrinsics.areEqual(functionDescriptor.getReturnType(), this.type.invoke(DescriptorUtilsKt.getBuiltIns(functionDescriptor)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public String getDescription() {
        return this.description;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public String invoke(FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.invoke(this, functionDescriptor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ReturnsCheck(String str, Function1<? super KotlinBuiltIns, ? extends KotlinType> function1) {
        this.name = str;
        this.type = function1;
        this.description = "must return " + str;
    }
}

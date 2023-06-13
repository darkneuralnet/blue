package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
/* loaded from: classes8.dex */
public final class TypedArrayValue extends ArrayValue {
    private final KotlinType type;

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.TypedArrayValue$1 */
    /* loaded from: classes8.dex */
    public static final class C254521 extends Lambda implements Function1<ModuleDescriptor, KotlinType> {
        final /* synthetic */ KotlinType $type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C254521(KotlinType kotlinType) {
            super(1);
            this.$type = kotlinType;
        }

        @Override // kotlin.jvm.functions.Function1
        public final KotlinType invoke(ModuleDescriptor it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.$type;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypedArrayValue(List<? extends ConstantValue<?>> value, KotlinType type) {
        super(value, new C254521(type));
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
    }

    public final KotlinType getType() {
        return this.type;
    }
}

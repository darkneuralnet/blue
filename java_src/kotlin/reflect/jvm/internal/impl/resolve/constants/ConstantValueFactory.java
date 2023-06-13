package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
@SourceDebugExtension({"SMAP\nConstantValueFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstantValueFactory.kt\norg/jetbrains/kotlin/resolve/constants/ConstantValueFactory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1603#2,9:104\n1855#2:113\n1856#2:115\n1612#2:116\n1#3:114\n*S KotlinDebug\n*F\n+ 1 ConstantValueFactory.kt\norg/jetbrains/kotlin/resolve/constants/ConstantValueFactory\n*L\n64#1:104,9\n64#1:113\n64#1:115\n64#1:116\n64#1:114\n*E\n"})
/* loaded from: classes8.dex */
public final class ConstantValueFactory {
    public static final ConstantValueFactory INSTANCE = new ConstantValueFactory();

    private ConstantValueFactory() {
    }

    public static /* synthetic */ ConstantValue createConstantValue$default(ConstantValueFactory constantValueFactory, Object obj, ModuleDescriptor moduleDescriptor, int i, Object obj2) {
        if ((i & 2) != 0) {
            moduleDescriptor = null;
        }
        return constantValueFactory.createConstantValue(obj, moduleDescriptor);
    }

    public final ArrayValue createArrayValue(List<? extends ConstantValue<?>> value, KotlinType type) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(type, "type");
        return new TypedArrayValue(value, type);
    }

    public final ConstantValue<?> createConstantValue(Object obj, ModuleDescriptor moduleDescriptor) {
        List<?> list;
        List<?> list2;
        List<?> list3;
        List<?> list4;
        List<?> list5;
        List<?> list6;
        List<?> list7;
        List<?> list8;
        if (obj instanceof Byte) {
            return new ByteValue(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new ShortValue(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new IntValue(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new LongValue(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new CharValue(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new FloatValue(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new DoubleValue(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new BooleanValue(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new StringValue((String) obj);
        }
        if (obj instanceof byte[]) {
            list8 = ArraysKt___ArraysKt.toList((byte[]) obj);
            return createArrayValue(list8, moduleDescriptor, PrimitiveType.BYTE);
        } else if (obj instanceof short[]) {
            list7 = ArraysKt___ArraysKt.toList((short[]) obj);
            return createArrayValue(list7, moduleDescriptor, PrimitiveType.SHORT);
        } else if (obj instanceof int[]) {
            list6 = ArraysKt___ArraysKt.toList((int[]) obj);
            return createArrayValue(list6, moduleDescriptor, PrimitiveType.INT);
        } else if (obj instanceof long[]) {
            list5 = ArraysKt___ArraysKt.toList((long[]) obj);
            return createArrayValue(list5, moduleDescriptor, PrimitiveType.LONG);
        } else if (obj instanceof char[]) {
            list4 = ArraysKt___ArraysKt.toList((char[]) obj);
            return createArrayValue(list4, moduleDescriptor, PrimitiveType.CHAR);
        } else if (obj instanceof float[]) {
            list3 = ArraysKt___ArraysKt.toList((float[]) obj);
            return createArrayValue(list3, moduleDescriptor, PrimitiveType.FLOAT);
        } else if (obj instanceof double[]) {
            list2 = ArraysKt___ArraysKt.toList((double[]) obj);
            return createArrayValue(list2, moduleDescriptor, PrimitiveType.DOUBLE);
        } else if (obj instanceof boolean[]) {
            list = ArraysKt___ArraysKt.toList((boolean[]) obj);
            return createArrayValue(list, moduleDescriptor, PrimitiveType.BOOLEAN);
        } else if (obj == null) {
            return new NullValue();
        } else {
            return null;
        }
    }

    private final ArrayValue createArrayValue(List<?> list, ModuleDescriptor moduleDescriptor, PrimitiveType primitiveType) {
        List<Object> list2;
        list2 = CollectionsKt___CollectionsKt.toList(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            ConstantValue createConstantValue$default = createConstantValue$default(this, obj, null, 2, null);
            if (createConstantValue$default != null) {
                arrayList.add(createConstantValue$default);
            }
        }
        if (moduleDescriptor != null) {
            SimpleType primitiveArrayKotlinType = moduleDescriptor.getBuiltIns().getPrimitiveArrayKotlinType(primitiveType);
            Intrinsics.checkNotNullExpressionValue(primitiveArrayKotlinType, "module.builtIns.getPrimi…KotlinType(componentType)");
            return new TypedArrayValue(arrayList, primitiveArrayKotlinType);
        }
        return new ArrayValue(arrayList, new ConstantValueFactory$createArrayValue$1(primitiveType));
    }
}

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.util.Set;
import kotlin.collections.SetsKt__SetsKt;
/* loaded from: classes8.dex */
public final class ReflectKotlinClassKt {
    private static final Set<Class<?>> TYPES_ELIGIBLE_FOR_SIMPLE_VISIT;

    static {
        Set<Class<?>> of;
        of = SetsKt__SetsKt.setOf((Object[]) new Class[]{Integer.class, Character.class, Byte.class, Long.class, Short.class, Boolean.class, Double.class, Float.class, int[].class, char[].class, byte[].class, long[].class, short[].class, boolean[].class, double[].class, float[].class, Class.class, String.class});
        TYPES_ELIGIBLE_FOR_SIMPLE_VISIT = of;
    }
}

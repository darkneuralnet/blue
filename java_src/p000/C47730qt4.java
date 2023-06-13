package p000;

import com.facebook.share.internal.C17296a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a \u0010\u0004\u001a\u00020\u00032\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000\u001a \u0010\u0007\u001a\u00020\u00032\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00002\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000\":\u0010\r\u001a\"\u0012\u0010\b\u0001\u0012\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\u0000\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\u00000\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m28432d2 = {"Ljava/lang/Class;", "targetClass", "primitive", "", "b", "from", "to", C17296a.f69688o, "", "", "Ljava/util/Map;", "getPrimitiveWrapperMap", "()Ljava/util/Map;", "primitiveWrapperMap", "mvrx_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: qt4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C47730qt4 {

    /* renamed from: a */
    public static final Map<? extends Class<? extends Object>, Class<? extends Object>> f106037a;

    static {
        Map<? extends Class<? extends Object>, Class<? extends Object>> mapOf;
        Class cls = Boolean.TYPE;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(cls, cls), TuplesKt.m28425to(Byte.TYPE, Byte.class), TuplesKt.m28425to(Character.TYPE, Character.class), TuplesKt.m28425to(Double.TYPE, Double.class), TuplesKt.m28425to(Float.TYPE, Float.class), TuplesKt.m28425to(Integer.TYPE, Integer.class), TuplesKt.m28425to(Long.TYPE, Long.class), TuplesKt.m28425to(Short.TYPE, Short.class));
        f106037a = mapOf;
    }

    /* renamed from: a */
    public static final boolean m16808a(Class<?> from, Class<?> to) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        if (to.isAssignableFrom(from)) {
            return true;
        }
        if (from.isPrimitive()) {
            return m16807b(to, from);
        }
        if (to.isPrimitive()) {
            return m16807b(from, to);
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m16807b(Class<?> targetClass, Class<?> primitive) {
        Intrinsics.checkNotNullParameter(targetClass, "targetClass");
        Intrinsics.checkNotNullParameter(primitive, "primitive");
        if (primitive.isPrimitive()) {
            return Intrinsics.areEqual(f106037a.get(primitive), targetClass);
        }
        throw new IllegalArgumentException("First argument has to be primitive type".toString());
    }
}

package p000;

import com.facebook.share.internal.C17296a;
import java.lang.reflect.Constructor;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a4\u0010\u0004\u001a\u0016\u0012\u0010\b\u0001\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0003\u0018\u00010\u0002\"\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u0002H\u0000¨\u0006\u0007"}, m28432d2 = {"LRN2;", "VM", "Ljava/lang/Class;", "LWN2;", C17296a.f69688o, "", "b", "mvrx_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: ZN2 */
/* loaded from: classes2.dex */
public final class ZN2 {
    /* renamed from: a */
    public static final <VM extends RN2<?>> Class<? extends WN2<VM, ?>> m73223a(Class<VM> cls) {
        Class<? extends WN2<VM, ?>> cls2;
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        Intrinsics.checkNotNullExpressionValue(declaredClasses, "declaredClasses");
        int length = declaredClasses.length;
        int i = 0;
        while (true) {
            if (i < length) {
                cls2 = declaredClasses[i];
                if (WN2.class.isAssignableFrom(cls2)) {
                    break;
                }
                i++;
            } else {
                cls2 = null;
                break;
            }
        }
        if (cls2 == null) {
            return null;
        }
        return cls2;
    }

    /* renamed from: b */
    public static final Object m73222b(Class<?> cls) {
        boolean z;
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        Intrinsics.checkNotNullExpressionValue(declaredConstructors, "declaredConstructors");
        for (Constructor<?> constructor : declaredConstructors) {
            if (constructor.getParameterTypes().length == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Object newInstance = constructor.newInstance(null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "declaredConstructors.fir… == 1 }.newInstance(null)");
                return newInstance;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}

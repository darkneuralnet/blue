package kotlin.reflect.full;

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J \u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000b2\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000f"}, m28432d2 = {"Lkotlin/reflect/full/Java8RepeatableContainerLoader;", "", "()V", "cache", "Lkotlin/reflect/full/Java8RepeatableContainerLoader$Cache;", "getCache", "()Lkotlin/reflect/full/Java8RepeatableContainerLoader$Cache;", "setCache", "(Lkotlin/reflect/full/Java8RepeatableContainerLoader$Cache;)V", "buildCache", "loadRepeatableContainer", "Ljava/lang/Class;", "", "klass", "Cache", "kotlin-reflection"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nKAnnotatedElements.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KAnnotatedElements.kt\nkotlin/reflect/full/Java8RepeatableContainerLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"})
/* loaded from: classes8.dex */
final class Java8RepeatableContainerLoader {
    public static final Java8RepeatableContainerLoader INSTANCE = new Java8RepeatableContainerLoader();
    private static Cache cache;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u001b\u0010\u0002\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m28432d2 = {"Lkotlin/reflect/full/Java8RepeatableContainerLoader$Cache;", "", "repeatableClass", "Ljava/lang/Class;", "", "valueMethod", "Ljava/lang/reflect/Method;", "(Ljava/lang/Class;Ljava/lang/reflect/Method;)V", "getRepeatableClass", "()Ljava/lang/Class;", "getValueMethod", "()Ljava/lang/reflect/Method;", "kotlin-reflection"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes8.dex */
    public static final class Cache {
        private final Class<? extends Annotation> repeatableClass;
        private final Method valueMethod;

        public Cache(Class<? extends Annotation> cls, Method method) {
            this.repeatableClass = cls;
            this.valueMethod = method;
        }

        public final Class<? extends Annotation> getRepeatableClass() {
            return this.repeatableClass;
        }

        public final Method getValueMethod() {
            return this.valueMethod;
        }
    }

    private Java8RepeatableContainerLoader() {
    }

    private final Cache buildCache() {
        try {
            Intrinsics.checkNotNull(Repeatable.class, "null cannot be cast to non-null type java.lang.Class<out kotlin.Annotation>");
            return new Cache(Repeatable.class, Repeatable.class.getMethod("value", new Class[0]));
        } catch (ClassNotFoundException unused) {
            return new Cache(null, null);
        }
    }

    public final Class<? extends Annotation> loadRepeatableContainer(Class<? extends Annotation> klass) {
        Annotation annotation;
        Method valueMethod;
        Intrinsics.checkNotNullParameter(klass, "klass");
        Cache cache2 = cache;
        if (cache2 == null) {
            synchronized (this) {
                cache2 = cache;
                if (cache2 == null) {
                    cache2 = INSTANCE.buildCache();
                    cache = cache2;
                }
            }
        }
        Class repeatableClass = cache2.getRepeatableClass();
        if (repeatableClass == null || (annotation = klass.getAnnotation(repeatableClass)) == null || (valueMethod = cache2.getValueMethod()) == null) {
            return null;
        }
        Object invoke = valueMethod.invoke(annotation, new Object[0]);
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type java.lang.Class<out kotlin.Annotation>");
        return (Class) invoke;
    }
}

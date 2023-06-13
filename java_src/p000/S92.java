package p000;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
/* renamed from: S92 */
/* loaded from: classes8.dex */
public final class S92 {

    /* renamed from: a */
    public final Method f33267a;

    /* renamed from: b */
    public final List<?> f33268b;

    public S92(Method method, List<?> list) {
        this.f33267a = method;
        this.f33268b = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public Method m85878a() {
        return this.f33267a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f33267a.getDeclaringClass().getName(), this.f33267a.getName(), this.f33268b);
    }
}

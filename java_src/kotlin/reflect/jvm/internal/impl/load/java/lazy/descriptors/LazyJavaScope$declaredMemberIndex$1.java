package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* loaded from: classes8.dex */
public final class LazyJavaScope$declaredMemberIndex$1 extends Lambda implements Function0<DeclaredMemberIndex> {
    final /* synthetic */ LazyJavaScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaScope$declaredMemberIndex$1(LazyJavaScope lazyJavaScope) {
        super(0);
        this.this$0 = lazyJavaScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final DeclaredMemberIndex invoke() {
        return this.this$0.computeMemberIndex();
    }
}

package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
/* loaded from: classes8.dex */
public final class ScopesHolderForClass$scopeForOwnerModule$2 extends Lambda implements Function0<T> {
    final /* synthetic */ ScopesHolderForClass<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScopesHolderForClass$scopeForOwnerModule$2(ScopesHolderForClass<T> scopesHolderForClass) {
        super(0);
        this.this$0 = scopesHolderForClass;
    }

    /* JADX WARN: Incorrect return type in method signature: ()TT; */
    @Override // kotlin.jvm.functions.Function0
    public final MemberScope invoke() {
        Function1 function1;
        KotlinTypeRefiner kotlinTypeRefiner;
        function1 = ((ScopesHolderForClass) this.this$0).scopeFactory;
        kotlinTypeRefiner = ((ScopesHolderForClass) this.this$0).kotlinTypeRefinerForOwnerModule;
        return (MemberScope) function1.invoke(kotlinTypeRefiner);
    }
}

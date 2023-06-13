package com.fasterxml.jackson.module.kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.reflect.jvm.KCallablesJvm;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m28432d2 = {"Lcom/fasterxml/jackson/module/kotlin/ConstructorValueCreator;", "T", "Lcom/fasterxml/jackson/module/kotlin/ValueCreator;", "callable", "Lkotlin/reflect/KFunction;", "(Lkotlin/reflect/KFunction;)V", "accessible", "", "getAccessible", "()Z", "getCallable", "()Lkotlin/reflect/KFunction;", "jackson-module-kotlin"}, m28431k = 1, m28430mv = {1, 5, 1}, m28428xi = 48)
/* loaded from: classes5.dex */
public final class ConstructorValueCreator<T> extends ValueCreator<T> {
    private final boolean accessible;
    private final KFunction<T> callable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConstructorValueCreator(KFunction<? extends T> callable) {
        super(null);
        Intrinsics.checkNotNullParameter(callable, "callable");
        this.callable = callable;
        this.accessible = KCallablesJvm.isAccessible(getCallable());
        if (!getAccessible()) {
            KCallablesJvm.setAccessible(getCallable(), true);
        }
    }

    @Override // com.fasterxml.jackson.module.kotlin.ValueCreator
    public boolean getAccessible() {
        return this.accessible;
    }

    @Override // com.fasterxml.jackson.module.kotlin.ValueCreator
    public KFunction<T> getCallable() {
        return this.callable;
    }
}

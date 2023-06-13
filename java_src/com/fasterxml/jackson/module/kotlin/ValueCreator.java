package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.MapperFeature;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007\b\u0004¢\u0006\u0002\u0010\u0003J!\u0010\u0013\u001a\u00028\u00002\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0015¢\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aR\u0012\u0010\u0004\u001a\u00020\u0005X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX¤\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0002\u001b\u001c¨\u0006\u001d"}, m28432d2 = {"Lcom/fasterxml/jackson/module/kotlin/ValueCreator;", "T", "", "()V", "accessible", "", "getAccessible", "()Z", "callable", "Lkotlin/reflect/KFunction;", "getCallable", "()Lkotlin/reflect/KFunction;", "valueParameters", "", "Lkotlin/reflect/KParameter;", "getValueParameters", "()Ljava/util/List;", "valueParameters$delegate", "Lkotlin/Lazy;", "callBy", "args", "", "(Ljava/util/Map;)Ljava/lang/Object;", "checkAccessibility", "", "ctxt", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "Lcom/fasterxml/jackson/module/kotlin/ConstructorValueCreator;", "Lcom/fasterxml/jackson/module/kotlin/MethodValueCreator;", "jackson-module-kotlin"}, m28431k = 1, m28430mv = {1, 5, 1}, m28428xi = 48)
/* loaded from: classes5.dex */
public abstract class ValueCreator<T> {
    private final Lazy valueParameters$delegate;

    public /* synthetic */ ValueCreator(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final T callBy(Map<KParameter, ? extends Object> args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return getCallable().callBy(args);
    }

    public final void checkAccessibility(DeserializationContext ctxt) {
        Intrinsics.checkNotNullParameter(ctxt, "ctxt");
        if (getAccessible() || !ctxt.getConfig().isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            if (getAccessible() && ctxt.getConfig().isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS)) {
                return;
            }
            throw new IllegalAccessException(Intrinsics.stringPlus("Cannot access to function or companion object instance, target: ", getCallable()));
        }
    }

    public abstract boolean getAccessible();

    public abstract KFunction<T> getCallable();

    public final List<KParameter> getValueParameters() {
        return (List) this.valueParameters$delegate.getValue();
    }

    private ValueCreator() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new ValueCreator$valueParameters$2(this));
        this.valueParameters$delegate = lazy;
    }
}

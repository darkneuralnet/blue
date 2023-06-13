package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.jvm.functions.Function1;
/* loaded from: classes8.dex */
public interface MemoizedFunctionToNullable<P, R> extends Function1<P, R> {
    boolean isComputed(P p);
}
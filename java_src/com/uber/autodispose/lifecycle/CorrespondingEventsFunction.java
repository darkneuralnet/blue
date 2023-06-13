package com.uber.autodispose.lifecycle;

import com.uber.autodispose.OutsideScopeException;
import io.reactivex.functions.InterfaceC23492o;
/* loaded from: classes7.dex */
public interface CorrespondingEventsFunction<E> extends InterfaceC23492o<E, E> {
    @Override // io.reactivex.functions.InterfaceC23492o
    E apply(E e) throws OutsideScopeException;
}

package com.uber.autodispose.lifecycle;

import com.uber.autodispose.ScopeProvider;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
/* loaded from: classes7.dex */
public interface LifecycleScopeProvider<E> extends ScopeProvider {
    /* renamed from: O8 */
    CorrespondingEventsFunction<E> mo37326O8();

    @Override // com.uber.autodispose.ScopeProvider
    /* renamed from: T0 */
    default InterfaceC23496h mo231T0() {
        return LifecycleScopes.m45180e(this);
    }

    /* renamed from: c2 */
    Observable<E> mo37323c2();

    E peekLifecycle();
}

package io.reactivex.subjects;

import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
/* renamed from: io.reactivex.subjects.h */
/* loaded from: classes8.dex */
public abstract class AbstractC24569h<T> extends Observable<T> implements InterfaceC23436D<T> {
    /* renamed from: a */
    public final AbstractC24569h<T> m31878a() {
        if (this instanceof C24566f) {
            return this;
        }
        return new C24566f(this);
    }
}

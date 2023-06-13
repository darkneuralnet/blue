package com.appboy.events;
/* loaded from: classes.dex */
public interface IEventSubscriber<T> {
    void trigger(T t);
}
